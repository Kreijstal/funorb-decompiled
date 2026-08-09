/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    int field_d;
    private byte[] field_g;
    int field_h;
    int field_c;
    private byte[][] field_j;
    int field_i;
    static vf field_f;
    static int[] field_e;
    static mi field_a;
    static int field_b;

    final int a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_f = (vf) null;
                break L1;
              }
            }
            stackIn_4_0 = this.a(0, (hr[]) null, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ta.F(");

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
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final int a(String param0, boolean param1, String[] param2, int[] param3, hr[] param4) {
        int discarded$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_137_0 = 0;
        int[] stackIn_137_1 = null;
        int stackIn_139_0 = 0;
        int[] stackIn_139_1 = null;
        int stackIn_140_0 = 0;
        int[] stackIn_140_1 = null;
        int stackIn_140_2 = 0;
        int stackIn_150_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_168_0 = 0;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_173_2 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        RuntimeException stackIn_177_0 = null;
        StringBuilder stackIn_177_1 = null;
        String stackIn_177_2 = null;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        String stackIn_181_2 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        RuntimeException stackIn_184_0 = null;
        StringBuilder stackIn_184_1 = null;
        RuntimeException stackIn_185_0 = null;
        StringBuilder stackIn_185_1 = null;
        String stackIn_185_2 = null;
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
        String var19 = null;
        int var20_int = 0;
        Exception var20 = null;
        int var21 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = Sumoblitz.field_L ? 1 : 0;
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
                        statePc = 169;
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
                        statePc = 169;
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
                        if (!param1) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        discarded$0 = this.a(-94, (hr[]) null, (String) null);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var12 = -1;
                        var13 = 0;
                        var14 = param0.length();
                        var15 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var15 ^ -1) <= (var14 ^ -1)) {
                            statePc = 163;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var16 = uo.a(true, param0.charAt(var15)) & 255;
                        var17 = 0;
                        stackIn_164_0 = var16 ^ -1;
                        stackIn_10_0 = stackIn_164_0;
                        stackIn_164_1 = -61;
                        stackIn_10_1 = stackIn_164_1;
                        if (var21 != 0) {
                            statePc = 164;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == stackIn_10_1) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11 = var15;
                        if (var21 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-1 == var11) {
                            statePc = 124;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var16 ^ -1) != -63) {
                            statePc = 162;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var18 = var11;
                        var19 = param0.substring(1 + var11, var15);
                        var11 = -1;
                        if (!var19.equals("br")) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param2[var13] = param0.substring(var7, var15 + 1);
                        var13++;
                        if ((param2.length ^ -1) < (var13 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    try {
                        var7 = 1 + var15;
                        var6_int = 0;
                        var8 = -1;
                        var12 = -1;
                        if (var21 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var19.equals("lt")) {
                            statePc = 117;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!var19.equals("gt")) {
                            statePc = 42;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var17 = var17 + this.a(62, (byte) -53);
                        if (null == this.field_j) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-1 != var12) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var17 = var17 + this.field_j[var12][62];
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var12 = 62;
                        if (var21 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var19.equals("nbsp")) {
                            statePc = 109;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (!var19.equals("shy")) {
                            statePc = 56;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var17 = var17 + this.a(173, (byte) -53);
                        if (this.field_j == null) {
                            statePc = 55;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var12 ^ -1) != 0) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var17 = var17 + this.field_j[var12][173];
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var12 = 173;
                        if (var21 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var19.equals("times")) {
                            statePc = 101;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var19.equals("euro")) {
                            statePc = 93;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var19.equals("copy")) {
                            statePc = 85;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var19.equals("reg")) {
                            statePc = 77;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (!var19.startsWith("img=")) {
                            statePc = 123;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (param4 == null) {
                            statePc = 123;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var20_int = no.a((byte) -128, (CharSequence) ((Object) var19.substring(4)));
                        var17 = var17 + param4[var20_int].b();
                        var12 = -1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = ((Object) stateCaught_74 instanceof Exception ? 76 : 169);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var20 = (Exception) ((Object) caughtException);
                        if (var21 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var17 = var17 + this.a(174, (byte) -53);
                        if (this.field_j == null) {
                            statePc = 84;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((var12 ^ -1) != 0) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var17 = var17 + this.field_j[var12][174];
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var12 = 174;
                        if (var21 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var17 = var17 + this.a(169, (byte) -53);
                        if (null == this.field_j) {
                            statePc = 92;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (-1 != var12) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var17 = var17 + this.field_j[var12][169];
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var12 = 169;
                        if (var21 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var17 = var17 + this.a(8364, (byte) -53);
                        if (null == this.field_j) {
                            statePc = 100;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if ((var12 ^ -1) != 0) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var17 = var17 + this.field_j[var12][8364];
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var12 = 8364;
                        if (var21 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var17 = var17 + this.a(215, (byte) -53);
                        if (this.field_j == null) {
                            statePc = 108;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (0 != (var12 ^ -1)) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var17 = var17 + this.field_j[var12][215];
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var12 = 215;
                        if (var21 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var17 = var17 + this.a(160, (byte) -53);
                        if (null == this.field_j) {
                            statePc = 116;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (var12 != -1) {
                            statePc = 115;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var17 = var17 + this.field_j[var12][160];
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var12 = 160;
                        if (var21 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var17 = var17 + this.a(60, (byte) -53);
                        if (this.field_j == null) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (0 == (var12 ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var17 = var17 + this.field_j[var12][60];
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var12 = 60;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var16 = -1;
                        if (var21 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var18 = var15;
                        var17 = var17 + this.a(var16, (byte) -53);
                        if (null == this.field_j) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 129;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var17 = var17 + this.field_j[var12][var16];
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var12 = var16;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if ((var17 ^ -1) >= -1) {
                            statePc = 162;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var6_int = var6_int + var17;
                        if (param3 != null) {
                            statePc = 134;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var16 != 32) {
                            statePc = 136;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var8 = var15;
                        var10 = 1;
                        var9 = var6_int;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        stackIn_139_0 = var6_int;
                        stackIn_137_0 = stackIn_139_0;
                        stackIn_139_1 = (int[]) (param3);
                        stackIn_137_1 = stackIn_139_1;
                        if ((var13 ^ -1) <= (param3.length ^ -1)) {
                            statePc = 139;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackIn_140_0 = stackIn_137_0;
                        stackIn_140_1 = (int[]) ((Object) stackIn_137_1);
                        stackIn_140_2 = var13;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackIn_140_0 = stackIn_139_0;
                        stackIn_140_1 = (int[]) ((Object) stackIn_139_1);
                        stackIn_140_2 = -1 + param3.length;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (stackIn_140_0 <= stackIn_140_1[stackIn_140_2]) {
                            statePc = 158;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (0 > var8) {
                            statePc = 152;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        param2[var13] = param0.substring(var7, 1 + var8 + -var10);
                        var13++;
                        if ((param2.length ^ -1) >= (var13 ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackIn_150_0 = 0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 150: {
                    return stackIn_150_0;
                }
                case 151: {
                    try {
                        var7 = var8 - -1;
                        var6_int = var6_int - var9;
                        var8 = -1;
                        var12 = -1;
                        if (var21 == 0) {
                            statePc = 158;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        param2[var13] = param0.substring(var7, var18);
                        var13++;
                        if (param2.length > var13) {
                            statePc = 157;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        stackIn_156_0 = 0;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 156: {
                    return stackIn_156_0;
                }
                case 157: {
                    try {
                        var7 = var18;
                        var6_int = var17;
                        var8 = -1;
                        var12 = -1;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (-46 == (var16 ^ -1)) {
                            statePc = 161;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var10 = 0;
                        var8 = var15;
                        var9 = var6_int;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var15++;
                        if (var21 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackIn_164_0 = var7;
                        stackIn_164_1 = param0.length();
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (stackIn_164_0 >= stackIn_164_1) {
                            statePc = 167;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        param2[var13] = param0.substring(var7, param0.length());
                        var13++;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        stackIn_168_0 = var13;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 168: {
                    return stackIn_168_0;
                }
                case 169: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_172_0 = (RuntimeException) (var6);
                    stackIn_170_0 = stackIn_172_0;
                    stackIn_172_1 = new StringBuilder().append("ta.G(");
                    stackIn_170_1 = stackIn_172_1;
                    if (param0 == null) {
                        statePc = 172;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    stackIn_173_0 = (RuntimeException) ((Object) stackIn_170_0);
                    stackIn_173_1 = (StringBuilder) ((Object) stackIn_170_1);
                    stackIn_173_2 = "{...}";
                    statePc = 173;
                    continue stateLoop;
                }
                case 172: {
                    stackIn_173_0 = (RuntimeException) ((Object) stackIn_172_0);
                    stackIn_173_1 = (StringBuilder) ((Object) stackIn_172_1);
                    stackIn_173_2 = "null";
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    stackIn_176_0 = (RuntimeException) ((Object) stackIn_173_0);
                    stackIn_174_0 = stackIn_176_0;
                    stackIn_176_1 = ((StringBuilder) (Object) stackIn_173_1).append(stackIn_173_2).append(',').append(param1).append(',');
                    stackIn_174_1 = stackIn_176_1;
                    if (param2 == null) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackIn_177_0 = (RuntimeException) ((Object) stackIn_174_0);
                    stackIn_177_1 = (StringBuilder) ((Object) stackIn_174_1);
                    stackIn_177_2 = "{...}";
                    statePc = 177;
                    continue stateLoop;
                }
                case 176: {
                    stackIn_177_0 = (RuntimeException) ((Object) stackIn_176_0);
                    stackIn_177_1 = (StringBuilder) ((Object) stackIn_176_1);
                    stackIn_177_2 = "null";
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    stackIn_180_0 = (RuntimeException) ((Object) stackIn_177_0);
                    stackIn_178_0 = stackIn_180_0;
                    stackIn_180_1 = ((StringBuilder) (Object) stackIn_177_1).append(stackIn_177_2).append(',');
                    stackIn_178_1 = stackIn_180_1;
                    if (param3 == null) {
                        statePc = 180;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    stackIn_181_0 = (RuntimeException) ((Object) stackIn_178_0);
                    stackIn_181_1 = (StringBuilder) ((Object) stackIn_178_1);
                    stackIn_181_2 = "{...}";
                    statePc = 181;
                    continue stateLoop;
                }
                case 180: {
                    stackIn_181_0 = (RuntimeException) ((Object) stackIn_180_0);
                    stackIn_181_1 = (StringBuilder) ((Object) stackIn_180_1);
                    stackIn_181_2 = "null";
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    stackIn_184_0 = (RuntimeException) ((Object) stackIn_181_0);
                    stackIn_182_0 = stackIn_184_0;
                    stackIn_184_1 = ((StringBuilder) (Object) stackIn_181_1).append(stackIn_181_2).append(',');
                    stackIn_182_1 = stackIn_184_1;
                    if (param4 == null) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    stackIn_185_0 = (RuntimeException) ((Object) stackIn_182_0);
                    stackIn_185_1 = (StringBuilder) ((Object) stackIn_182_1);
                    stackIn_185_2 = "{...}";
                    statePc = 185;
                    continue stateLoop;
                }
                case 184: {
                    stackIn_185_0 = (RuntimeException) ((Object) stackIn_184_0);
                    stackIn_185_1 = (StringBuilder) ((Object) stackIn_184_1);
                    stackIn_185_2 = "null";
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    throw qo.a((Throwable) ((Object) stackIn_185_0), stackIn_185_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, hr[] param1, String param2) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
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
                    var12 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 66;
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
                        statePc = 66;
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
                        var7 = param2.length();
                        var8 = param0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 <= var8) {
                            statePc = 64;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = param2.charAt(var8);
                        stackIn_65_0 = -61;
                        stackIn_7_0 = stackIn_65_0;
                        if (var12 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 != (var9 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4_int = var8;
                        if (var12 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var9 ^ -1) != -63) {
                            statePc = 56;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 == (var4_int ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10 = param2.substring(1 + var4_int, var8);
                        var4_int = -1;
                        if (!var10.equals("lt")) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 = 60;
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!var10.equals("gt")) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 = 62;
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!var10.equals("nbsp")) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9 = 160;
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!var10.equals("shy")) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 = 173;
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!var10.equals("times")) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = 215;
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!var10.equals("euro")) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = 8364;
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!var10.equals("copy")) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = 169;
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var10.equals("reg")) {
                            statePc = 55;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!var10.startsWith("img=")) {
                            statePc = 63;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (param1 == null) {
                            statePc = 63;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11_int = no.a((byte) -127, (CharSequence) ((Object) var10.substring(4)));
                        var5 = -1;
                        var6 = var6 + param1[var11_int].b();
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = ((Object) stateCaught_52 instanceof Exception ? 54 : 66);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var11 = (Exception) ((Object) caughtException);
                        if (var12 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var9 = 174;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var4_int != -1) {
                            statePc = 63;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var6 = var6 + (255 & this.field_g[uo.a(true, (char) var9) & 255]);
                        if (null == this.field_j) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var5 ^ -1) == 0) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var6 = var6 + this.field_j[var5][var9];
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var5 = var9;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = var6;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    return stackIn_65_0;
                }
                case 66: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_69_0 = (RuntimeException) (var4);
                    stackIn_67_0 = stackIn_69_0;
                    stackIn_69_1 = new StringBuilder().append("ta.H(").append(param0).append(',');
                    stackIn_67_1 = stackIn_69_1;
                    if (param1 == null) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_70_2 = "{...}";
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_70_2 = "null";
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_0 = stackIn_73_0;
                    stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
                    stackIn_71_1 = stackIn_73_1;
                    if (param2 == null) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_74_2 = "{...}";
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_74_2 = "null";
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    throw qo.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -53) {
                break L1;
              } else {
                this.field_h = -30;
                break L1;
              }
            }
            stackIn_4_0 = this.field_g[param0] & 255;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "ta.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final String a(int param0, String param1, hr[] param2, int param3) {
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_54_0 = null;
        String stackIn_73_0 = null;
        String stackIn_77_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
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
                    var14 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((this.a(param3 ^ -63, param2, param1) ^ -1) >= (param0 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (String) (param1);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        param0 = param0 - this.a(param3 ^ param3, (hr[]) null, "...");
                        var5_int = -1;
                        var6 = -1;
                        var7 = 0;
                        var8 = param1.length();
                        var9 = "";
                        var10 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 <= var10) {
                            statePc = 76;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_77_0 = (String) (param1);
                        stackIn_9_0 = stackIn_77_0;
                        if (var14 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var11 = ((String) (Object) stackIn_9_0).charAt(var10);
                        if (60 != var11) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int = var10;
                        if (var14 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 78;
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
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var5_int ^ -1) == 0) {
                            statePc = 61;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12_ref_String = param1.substring(var5_int + 1, var10);
                        var5_int = -1;
                        if (!var12_ref_String.equals("lt")) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var11 = 60;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var12_ref_String.equals("gt")) {
                            statePc = 60;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!var12_ref_String.equals("nbsp")) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11 = 160;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!var12_ref_String.equals("shy")) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var11 = 173;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!var12_ref_String.equals("times")) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11 = 215;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var12_ref_String.equals("euro")) {
                            statePc = 59;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!var12_ref_String.equals("copy")) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11 = 169;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var12_ref_String.equals("reg")) {
                            statePc = 58;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (!var12_ref_String.startsWith("img=")) {
                            statePc = 75;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (null == param2) {
                            statePc = 75;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var13_int = no.a((byte) -127, (CharSequence) ((Object) var12_ref_String.substring(4)));
                        var6 = -1;
                        var7 = var7 + param2[var13_int].b();
                        if ((var7 ^ -1) < (param0 ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = ((Object) stateCaught_50 instanceof Exception ? 57 : 78);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = ((Object) stateCaught_51 instanceof Exception ? 57 : 78);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = var9 + "...";
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = ((Object) stateCaught_53 instanceof Exception ? 57 : 78);
                        continue stateLoop;
                    }
                }
                case 54: {
                    return stackIn_54_0;
                }
                case 55: {
                    try {
                        var9 = param1.substring(0, 1 + var10);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = ((Object) stateCaught_55 instanceof Exception ? 57 : 78);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var13 = (Exception) ((Object) caughtException);
                        if (var14 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var11 = 174;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 78;
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
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var11 = 62;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (0 != (var5_int ^ -1)) {
                            statePc = 75;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var7 = var7 + (this.field_g[uo.a(true, (char) var11) & 255] & 255);
                        if (null == this.field_j) {
                            statePc = 69;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (0 != (var6 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var7 = var7 + this.field_j[var6][var11];
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var6 = var11;
                        var12 = var7;
                        if (this.field_j == null) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var12 = var12 + this.field_j[var11][46];
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((var12 ^ -1) >= (param0 ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = var9 + "...";
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 73: {
                    return stackIn_73_0;
                }
                case 74: {
                    try {
                        var9 = param1.substring(0, var10 + 1);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10++;
                        if (var14 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_77_0 = (String) (param1);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    return stackIn_77_0;
                }
                case 78: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_81_0 = (RuntimeException) (var5);
                    stackIn_79_0 = stackIn_81_0;
                    stackIn_81_1 = new StringBuilder().append("ta.C(").append(param0).append(',');
                    stackIn_79_1 = stackIn_81_1;
                    if (param1 == null) {
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
                    stackIn_85_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_83_0 = stackIn_85_0;
                    stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',');
                    stackIn_83_1 = stackIn_85_1;
                    if (param2 == null) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackIn_86_0 = (RuntimeException) ((Object) stackIn_83_0);
                    stackIn_86_1 = (StringBuilder) ((Object) stackIn_83_1);
                    stackIn_86_2 = "{...}";
                    statePc = 86;
                    continue stateLoop;
                }
                case 85: {
                    stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
                    stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
                    stackIn_86_2 = "null";
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    throw qo.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static wb[] a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        wb[] stackIn_2_0 = null;
        wb[] stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 87) {
              stackIn_4_0 = ni.a(param3, 1, 0, param0, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wb[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var4), "ta.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
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
              if (param0 < -49) {
                break L1;
              } else {
                this.a(-23, (byte) 121);
                break L1;
              }
            }
            if (null != this.field_j) {
              stackIn_7_0 = this.field_j[param2][param1];
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
          throw qo.a((Throwable) ((Object) var4), "ta.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(boolean param0) {
        try {
            field_f = null;
            field_e = null;
            field_a = null;
            if (param0) {
                field_b = -45;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ta.B(" + param0 + ')');
        }
    }

    ta(byte[] param0) {
        byte[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        fs var2 = null;
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
                    var12 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new fs(param0);
                        var3 = var2.e(-31302);
                        if (var3 == 0) {
                            statePc = 4;
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
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (1 != var2.e(-31302)) {
                            statePc = 7;
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
                        stackIn_8_0 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 79;
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
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = stackIn_8_0;
                        this.field_g = new byte[256];
                        var2.a(this.field_g, 256, 0, (byte) -101);
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_d = var2.e(-31302);
                        if (var12 == 0) {
                            statePc = 76;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = new int[256];
                        var7_int = 0;
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
                        if (-257 >= (var7_int ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5[var7_int] = var2.e(-31302);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 84;
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
                        if (var12 == 0) {
                            statePc = 13;
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = new int[256];
                        var7_int = 0;
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
                        if ((var7_int ^ -1) <= -257) {
                            statePc = 24;
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
                        var6[var7_int] = var2.e(-31302);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 84;
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
                        if (var12 == 0) {
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 79;
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
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-257 >= (var8_int ^ -1)) {
                            statePc = 35;
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
                        array$0 = new byte[var5[var8_int]];
                        var7[var8_int] = array$0;
                        var9 = 0;
                        stackIn_36_0 = 0;
                        stackIn_27_0 = stackIn_36_0;
                        if (var12 != 0) {
                            statePc = 36;
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
                        var10 = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var10 ^ -1) <= (var7[var8_int].length ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = (byte)(var9 + var2.d(true));
                        var7[var8_int][var10] = (byte) var9;
                        var10++;
                        if (var12 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var12 == 0) {
                            statePc = 28;
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
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var8_int++;
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
                        if (var12 == 0) {
                            statePc = 25;
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
                        stackIn_36_0 = 256;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var8 = new byte[stackIn_36_0][];
                        var9 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var9 >= 256) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        array$1 = new byte[var5[var9]];
                        var8[var9] = array$1;
                        var10 = 0;
                        stackIn_48_0 = 0;
                        stackIn_39_0 = stackIn_48_0;
                        if (var12 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = stackIn_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var8[var9].length ^ -1) >= (var11 ^ -1)) {
                            statePc = 45;
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
                        var10 = (byte)(var10 + var2.d(true));
                        var8[var9][var11] = (byte) var10;
                        var11++;
                        if (var12 != 0) {
                            statePc = 46;
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
                        if (var12 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9++;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var12 == 0) {
                            statePc = 37;
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
                        this.field_j = new byte[256][256];
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var9 = stackIn_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = var9;
                        stackIn_50_1 = 256;
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
                        if (stackIn_50_0 >= stackIn_50_1) {
                            statePc = 75;
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
                        stackIn_77_0 = var9 ^ -1;
                        stackIn_52_0 = stackIn_77_0;
                        if (var12 != 0) {
                            statePc = 77;
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
                        if (stackIn_52_0 == -33) {
                            statePc = 74;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (160 != var9) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var12 == 0) {
                            statePc = 74;
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
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 79;
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
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (-257 >= (var10 ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_50_0 = var10;
                        stackIn_64_0 = stackIn_50_0;
                        stackIn_50_1 = 32;
                        stackIn_64_1 = stackIn_50_1;
                        if (var12 != 0) {
                            statePc = 50;
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
                        if (stackIn_64_0 == stackIn_64_1) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((var10 ^ -1) != -161) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        this.field_j[var9][var10] = (byte)ej.a(var9, var10, this.field_g, var7, var6, (byte) -75, var8, var5);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 49;
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
                        this.field_d = var6[32] + var5[32];
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        this.field_h = var2.e(-31302);
                        stackIn_77_0 = var2.e(-31302);
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
                        this.field_i = var2.e(-31302);
                        this.field_c = var2.e(-31302);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 79: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_82_0 = (RuntimeException) (var2_ref);
                    stackIn_80_0 = stackIn_82_0;
                    stackIn_82_1 = new StringBuilder().append("ta.<init>(");
                    stackIn_80_1 = stackIn_82_1;
                    if (param0 == null) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_83_2 = "{...}";
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
                    stackIn_83_2 = "null";
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    throw qo.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ')');
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = new vf();
        field_e = new int[8192];
        field_a = new mi();
    }
}
