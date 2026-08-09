/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    private uh field_e;
    static boolean field_b;
    private oa field_l;
    private pj field_f;
    static int field_h;
    private java.math.BigInteger field_g;
    private be[] field_d;
    private java.math.BigInteger field_j;
    static int[] field_k;
    private cd field_c;
    static int field_i;
    static String field_a;

    dk(uh param0, cd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static kk a(String param0, long param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        ac stackIn_5_0 = null;
        bd stackIn_9_0 = null;
        wj stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 >= 7) {
                break L1;
              } else {
                dk.a((byte) 119);
                break L1;
              }
            }
            L2: {
              if (-1L != (param1 ^ -1L)) {
                break L2;
              } else {
                if (param0 == null) {
                  break L2;
                } else {
                  stackIn_5_0 = new ac(param0, param3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param2) {
              stackIn_9_0 = new bd(param1, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_11_0 = new wj(param1, param3);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("dk.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kk) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (kk) ((Object) stackIn_9_0);
          } else {
            return (kk) ((Object) stackIn_11_0);
          }
        }
    }

    final static void a(int param0, ti[] param1, int param2, int param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = Transmogrify.field_A ? 1 : 0;
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
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((param5 ^ -1) >= -1) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        if (null == param1[3]) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_10_0 = param1[3].field_r;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6_int = stackIn_10_0;
                        if (null != param1[5]) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = param1[5].field_r;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = stackIn_13_0;
                        if (null == param1[1]) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_16_0 = param1[1].field_s;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = stackIn_16_0;
                        if (null == param1[7]) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = param1[7].field_s;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 = stackIn_19_0;
                        var10 = param5 + param3;
                        if (param2 == -28018) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    try {
                        var11 = param4 + param0;
                        var12 = var6_int + param3;
                        var13 = var10 - var7;
                        var14 = param4 - -var8;
                        var15 = -var9 + var11;
                        var16 = var12;
                        var17 = var13;
                        if (var16 > var17) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var17 = param5 * var6_int / (var6_int + var7) + param3;
                        var16 = param5 * var6_int / (var6_int + var7) + param3;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var18 = var14;
                        var19 = var15;
                        sb.a(cc.field_d);
                        if (var19 >= var18) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var19 = param4 - -(param0 * var8 / (var8 - -var9));
                        var18 = param4 - -(param0 * var8 / (var8 - -var9));
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param1[0] != null) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        sb.g(param3, param4, var16, var18);
                        param1[0].c(param3, param4);
                        sb.b(cc.field_d);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null != param1[2]) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        sb.g(var17, param4, var10, var18);
                        param1[2].c(var13, param4);
                        sb.b(cc.field_d);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (null != param1[6]) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        sb.g(param3, var19, var16, var11);
                        param1[6].c(param3, var15);
                        sb.b(cc.field_d);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null != param1[8]) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        sb.g(var17, var19, var10, var11);
                        param1[8].c(var13, var15);
                        sb.b(cc.field_d);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param1[1] == null) {
                            statePc = 46;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-1 == (param1[1].field_r ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        sb.g(var16, param4, var17, var18);
                        var20 = var12;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var20 >= var13) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        param1[1].c(var20, param4);
                        var20 = var20 + param1[1].field_r;
                        if (var22 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var22 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        sb.b(cc.field_d);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (param1[7] == null) {
                            statePc = 54;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-1 == (param1[7].field_r ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        sb.g(var16, var19, var17, var11);
                        var20 = var12;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var13 <= var20) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        param1[7].c(var20, var15);
                        var20 = var20 + param1[7].field_r;
                        if (var22 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var22 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        sb.b(cc.field_d);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (null == param1[3]) {
                            statePc = 62;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (-1 == (param1[3].field_s ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        sb.g(param3, var18, var16, var19);
                        var20 = var14;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var15 <= var20) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        param1[3].c(param3, var20);
                        var20 = var20 + param1[3].field_s;
                        if (var22 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var22 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        sb.b(cc.field_d);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (null == param1[5]) {
                            statePc = 70;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (0 == param1[5].field_s) {
                            statePc = 70;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        sb.g(var17, var18, var10, var19);
                        var20 = var14;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var20 >= var15) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        param1[5].c(var13, var20);
                        var20 = var20 + param1[5].field_s;
                        if (var22 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var22 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        sb.b(cc.field_d);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (null == param1[4]) {
                            statePc = 89;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (param1[4].field_r == 0) {
                            statePc = 89;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (-1 == (param1[4].field_s ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        sb.g(var16, var18, var17, var19);
                        var20 = var14;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var20 >= var15) {
                            statePc = 83;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var22 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var21 = var12;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var13 <= var21) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        param1[4].c(var21, var20);
                        var21 = var21 + param1[4].field_r;
                        if (var22 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var22 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var20 = var20 + param1[4].field_s;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var22 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        sb.b(cc.field_d);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_87_0 = (RuntimeException) (var6);
                    stackIn_86_0 = stackIn_87_0;
                    stackIn_87_1 = new StringBuilder().append("dk.D(").append(param0).append(',');
                    stackIn_86_1 = stackIn_87_1;
                    if (param1 == null) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackIn_88_0 = (RuntimeException) ((Object) stackIn_86_0);
                    stackIn_88_1 = (StringBuilder) ((Object) stackIn_86_1);
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
                    throw ch.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 89: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final be a(int param0, boolean param1, int param2, ak param3, ak param4) {
        be stackIn_9_0 = null;
        be stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        be var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_l == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (-1 < (param0 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_d.length <= param0) {
                    break L1;
                  } else {
                    if (null == this.field_d[param0]) {
                      L2: {
                        this.field_l.field_h = 6 + 72 * param0;
                        var6_int = this.field_l.c((byte) -112);
                        var7 = this.field_l.c((byte) -108);
                        var13 = new byte[64];
                        this.field_l.a(64, 2, var13, 0);
                        if (param2 == 24108) {
                          break L2;
                        } else {
                          field_b = true;
                          break L2;
                        }
                      }
                      var9 = new be(param0, param4, param3, this.field_e, this.field_c, var6_int, var13, var7, param1);
                      this.field_d[param0] = var9;
                      stackIn_13_0 = (be) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_9_0 = this.field_d[param0];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("dk.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    private dk(uh param0, cd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_j = param3;
              this.field_e = param0;
              this.field_g = param2;
              this.field_c = param1;
              if (this.field_e.b(6)) {
                break L1;
              } else {
                this.field_f = this.field_e.a(255, false, true, (byte) 0, 255);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("dk.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    final boolean b(boolean param0) {
        byte stackIn_24_0 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        oa var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (this.field_l != null) {
          return true;
        } else {
          L0: {
            if (null == this.field_f) {
              if (!this.field_e.b(6)) {
                this.field_f = this.field_e.a(255, false, true, (byte) 0, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_f.field_m) {
            var10 = new oa(this.field_f.e(256));
            var10.field_h = 5;
            var3 = var10.d((byte) 30);
            var10.field_h = var10.field_h + var3 * 72;
            var13 = new byte[var10.field_g.length + -var10.field_h];
            var11 = var13;
            var4 = var11;
            var10.a(var13.length, 2, var13, 0);
            if (!param0) {
              L1: {
                L2: {
                  if (this.field_g == null) {
                    break L2;
                  } else {
                    if (null == this.field_j) {
                      break L2;
                    } else {
                      var12 = new java.math.BigInteger(var13);
                      var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_j);
                      var5 = var7_ref_java_math_BigInteger.toByteArray();
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if ((var5.length ^ -1) != -66) {
                throw new RuntimeException();
              } else {
                var15 = n.a(var10.field_g, -5 + (-var13.length + var10.field_h), -5705, 5);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    stackIn_24_0 = var15[var7];

                    if (var8 == 0) {
                      if (stackIn_24_0 != var5[var7 - -1]) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        if (var8 == 0) {
                          continue L3;
                        } else {
                          this.field_l = var10;
                          this.field_d = new be[var3];
                          return true;
                        }
                      }
                    } else {
                      return stackIn_24_0 != 0;
                    }
                  } else {
                    this.field_l = var10;
                    this.field_d = new be[var3];
                    return true;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_a = null;
        int var1 = 45 % ((67 - param0) / 36);
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        ak var4;
        be stackIn_17_0 = null;
        be stackIn_21_0 = null;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            var4 = (ak) null;
            this.a(-91, false, 38, (ak) null, (ak) null);
            break L0;
          }
        }
        if (this.field_d == null) {
          return;
        } else {
          var2 = 0;
          L1: while (true) {
            L2: {
              L3: {
                L4: {
                  if (this.field_d.length <= var2) {
                    break L4;
                  } else {
                    stackIn_21_0 = this.field_d[var2];

                    if (var3 != 0) {
                      L5: while (true) {
                        ((be) (Object) stackIn_21_0).b((byte) 126);
                        L6: while (true) {
                          var2++;
                          if (var3 == 0) {
                            if (var2 >= this.field_d.length) {
                              break L2;
                            } else {
                              if (var3 != 0) {
                                break L2;
                              } else {
                                if (null == this.field_d[var2]) {
                                  continue L6;
                                } else {
                                  stackIn_21_0 = this.field_d[var2];
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    } else {
                      L7: {
                        if (stackIn_21_0 != null) {
                          this.field_d[var2].d(23881);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var2 = 0;
                L8: while (true) {
                  if (var2 >= this.field_d.length) {
                    break L2;
                  } else {
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L9: {
                        if (null == this.field_d[var2]) {
                          break L9;
                        } else {
                          stackIn_17_0 = this.field_d[var2];
                          ((be) (Object) stackIn_17_0).b((byte) 126);
                          break L9;
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L8;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            return;
          }
        }
    }

    static {
        field_b = false;
        field_i = 0;
        field_a = "Next";
    }
}
