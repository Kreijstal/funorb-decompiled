/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends gj implements dc, da {
    private ja field_H;
    private bb field_G;
    private ua field_F;

    private final String j(int param0) {
        String discarded$0 = null;
        if (param0 != 0) {
            discarded$0 = this.j(113);
        }
        return "</col></u>";
    }

    private final String a(int param0) {
        if (param0 > -78) {
            this.field_H = (ja) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 248) {
              L1: {
                if (param4 != this.field_G) {
                  break L1;
                } else {
                  ih.l(255);
                  this.field_F.n(-22645);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("og.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, dd[] param1, int param2, int param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (0 >= param5) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((param4 ^ -1) < -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (null == param1[3]) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_9_0 = param1[3].field_x;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6_int = stackIn_9_0;
                        if (param1[5] != null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = param1[5].field_x;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = stackIn_12_0;
                        if (param1[1] != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = param1[1].field_r;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = stackIn_15_0;
                        if (null != param1[7]) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = param1[7].field_r;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 = stackIn_18_0;
                        var10 = param3 - -param5;
                        var11 = param0 + param4;
                        var13 = -77 % ((22 - param2) / 54);
                        var12 = param3 + var6_int;
                        var14 = var10 + -var7;
                        var15 = param0 - -var8;
                        var16 = var11 + -var9;
                        var17 = var12;
                        var18 = var14;
                        if (var17 <= var18) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var18 = param5 * var6_int / (var6_int - -var7) + param3;
                        var17 = param5 * var6_int / (var6_int - -var7) + param3;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var19 = var15;
                        var20 = var16;
                        if (var20 >= var19) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var20 = param4 * var8 / (var8 - -var9) + param0;
                        var19 = param4 * var8 / (var8 - -var9) + param0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        gb.a(il.field_f);
                        if (null == param1[0]) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        gb.g(param3, param0, var17, var19);
                        param1[0].d(param3, param0);
                        gb.b(il.field_f);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == param1[2]) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        gb.g(var18, param0, var10, var19);
                        param1[2].d(var14, param0);
                        gb.b(il.field_f);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param1[6] != null) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        gb.g(param3, var20, var17, var11);
                        param1[6].d(param3, var16);
                        gb.b(il.field_f);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == param1[8]) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        gb.g(var18, var20, var10, var11);
                        param1[8].d(var14, var16);
                        gb.b(il.field_f);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (null == param1[1]) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param1[1].field_x != 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        gb.g(var17, param0, var18, var19);
                        var21 = var12;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var21 >= var14) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param1[1].d(var21, param0);
                        var21 = var21 + param1[1].field_x;
                        if (var23 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var23 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        gb.b(il.field_f);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (param1[7] == null) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-1 == (param1[7].field_x ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        gb.g(var17, var20, var18, var11);
                        var21 = var12;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var14 <= var21) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        param1[7].d(var21, var16);
                        var21 = var21 + param1[7].field_x;
                        if (var23 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var23 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        gb.b(il.field_f);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (null == param1[3]) {
                            statePc = 57;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (param1[3].field_r != 0) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        gb.g(param3, var19, var17, var20);
                        var21 = var15;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var21 >= var16) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param1[3].d(param3, var21);
                        var21 = var21 + param1[3].field_r;
                        if (var23 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var23 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        gb.b(il.field_f);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (param1[5] == null) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (param1[5].field_r != 0) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        gb.g(var18, var19, var10, var20);
                        var21 = var15;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var21 >= var16) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        param1[5].d(var14, var21);
                        var21 = var21 + param1[5].field_r;
                        if (var23 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var23 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        gb.b(il.field_f);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (null == param1[4]) {
                            statePc = 86;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (-1 == (param1[4].field_x ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (param1[4].field_r != 0) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        gb.g(var17, var19, var18, var20);
                        var21 = var15;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var16 <= var21) {
                            statePc = 80;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var23 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var22 = var12;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var22 >= var14) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        param1[4].d(var22, var21);
                        var22 = var22 + param1[4].field_x;
                        if (var23 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var23 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var21 = var21 + param1[4].field_r;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var23 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        gb.b(il.field_f);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_84_0 = (RuntimeException) (var6);
                    stackIn_83_0 = stackIn_84_0;
                    stackIn_84_1 = new StringBuilder().append("og.BA(").append(param0).append(',');
                    stackIn_83_1 = stackIn_84_1;
                    if (param1 == null) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackIn_85_0 = (RuntimeException) ((Object) stackIn_83_0);
                    stackIn_85_1 = (StringBuilder) ((Object) stackIn_83_1);
                    stackIn_85_2 = "{...}";
                    statePc = 85;
                    continue stateLoop;
                }
                case 84: {
                    stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
                    stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
                    stackIn_85_2 = "null";
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    throw pf.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 86: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 == param1) {
                stackIn_7_0 = this.b(param2, -28533);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 != param1) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(32, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("og.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    og(ua param0) {
        super(0, 0, 288, 0, (ch) null);
        String var7 = null;
        int var3 = 0;
        e var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_F = param0;
            this.field_G = new bb(ee.field_k, (kd) null);
            this.field_G.field_p = (ch) ((Object) new ri());
            var7 = db.a(oh.field_jb, new String[]{this.a(-115), this.j(0)}, true);
            var3 = 20;
            var4 = new e(ug.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ug.field_e.field_H, -1, 2147483647, true);
            this.field_H = new ja(var7, var4);
            this.field_H.field_m = "";
            this.field_H.a(0, pi.field_f, 0);
            this.field_H.a(0, pi.field_f, 1);
            this.field_H.field_u = -40 + this.field_u;
            this.field_H.field_s = (kd) (this);
            this.field_H.b(this.field_u - 40, 26, var3, -9);
            var3 = var3 + (15 + this.field_H.field_j);
            this.a((qa) (this.field_H), (byte) -55);
            var5 = 4;
            var6 = 200;
            this.field_G.a(-var6 + 300 >> -766781471, var6, var3, 40, 80);
            this.field_G.field_s = (kd) (this);
            this.a((qa) (this.field_G), (byte) -70);
            this.a(0, 300, 0, var3 - (-55 - var5), 80);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, ja param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5_int = -79 % ((param3 - -36) / 61);
                if (0 != param0) {
                  break L2;
                } else {
                  lk.a(-15493, "terms.ws");
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 != 1) {
                  break L3;
                } else {
                  lk.a(-15493, "privacy.ws");
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param0 != 2) {
                break L1;
              } else {
                lk.a(-15493, "conduct.ws");
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("og.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
