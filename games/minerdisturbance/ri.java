/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static byte[] field_c;
    private bj field_d;
    static String field_f;
    private bj field_a;
    static String field_b;
    private tg field_e;
    private tg field_g;

    final static void a(byte param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -101) {
              nn.field_q = true;
              var2 = "tuhstatbut";
              var3 = "rvnadlm";
              var4 = -1L;
              eg.a(var2, 87, var3, var4, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ri.C(").append(param0).append(',');

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
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1_int = di.a(true);
              var2 = var1_int / 50;
              var3 = -(var2 * 1000) + var1_int * 1000 / 50;
              var5 = 73 % ((param0 - 56) / 53);
              var4 = "0";
              if (1 > var3 / 100) {
                break L1;
              } else {
                var4 = "" + var3 / 100;
                break L1;
              }
            }
            stackIn_3_0 = var2 + "." + var4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "ri.D(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final ji a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        ji stackIn_7_0 = null;
        ji stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -26575) {
                break L1;
              } else {
                field_c = (byte[]) null;
                break L1;
              }
            }
            if (1 == this.field_a.b((byte) -71)) {
              stackIn_7_0 = this.a(-31093, 0, param2, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_a.b(param2, -26727) == 1) {
                stackIn_12_0 = this.a(param0 ^ 7866, param2, 0, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ri.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static void a(boolean param0, int param1, int param2, pb param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        boolean stackOut_9_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = MinerDisturbance.field_ab;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = d.a((param2 - param1) * 3, -31479);
                        var6 = param1 * 3;
                        ab.a(-20707);
                        var7 = var5_int - 10;
                        if (param3.field_E <= 0) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param3.field_x) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ef.a(-24322);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ik.field_T = param4;
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var8 ^ -1) <= (param3.field_I ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param3.field_e[var8];
                        var10 = param3.field_O[var8];
                        var11 = param3.field_F[var8];
                        stackOut_9_0 = param0;
                        stackIn_48_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = wa.field_d[var9];
                        var13 = ti.field_O[var9];
                        var14 = wa.field_d[var10] + -var12;
                        var15 = wa.field_d[var11] + -var12;
                        var16 = ti.field_O[var10] + -var13;
                        var17 = ti.field_O[var11] - var13;
                        if (var17 * var14 - var16 * var15 < 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var19 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = oc.field_l[var9];
                        if (2147483647 == (var12 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = oc.field_l[var10];
                        if (2147483647 != (var13 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var19 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var14 = oc.field_l[var11];
                        if (-2147483648 == var14) {
                            statePc = 46;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var15 = -var6 + (var14 + var13 + var12);
                        if ((var7 ^ -1) > -1) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_28_0 = var15 >> var7;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = var15 << -var7;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16 = -stackIn_28_0 + (mg.field_e.length - 1);
                        var17 = mg.field_e[var16];
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var17 >> 1990494372 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var16--;
                        stackIn_38_0 = var16 ^ -1;
                        stackIn_31_0 = stackIn_38_0;
                        stackIn_38_1 = -1;
                        stackIn_31_1 = stackIn_38_1;
                        if (var19 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 > stackIn_31_1) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var17 = mg.field_e[var16];
                        if (var19 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = var17;
                        stackIn_38_1 = var16 << 1611167972;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var18 = stackIn_38_0 + stackIn_38_1;
                        ta.field_d[var18] = var8;
                        mg.field_e[var16] = 1 + var17;
                        if (0 >= param3.field_E) {
                            statePc = 45;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (param3.field_x != null) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        dupTemp$0 = param3.field_x[var8];
                        di.field_V[dupTemp$0] = di.field_V[dupTemp$0] + 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ik.field_T = ik.field_T + 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 >= param3.field_E) {
                            statePc = 66;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (null != param3.field_x) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((di.field_V.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var10 = di.field_V[var9];
                        di.field_V[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var19 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_64_0 = (RuntimeException) (var5);
                    stackIn_62_0 = stackIn_64_0;
                    stackIn_64_1 = new StringBuilder().append("ri.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_62_1 = stackIn_64_1;
                    if (param3 == null) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_65_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_65_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackIn_65_2 = "{...}";
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
                    stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
                    stackIn_65_2 = "null";
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    throw lj.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param4 + ')');
                }
                case 66: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0) {
        try {
            bd.field_b = false;
            kj.field_a.d((byte) -54);
            if (!param0) {
                ri.a(true, 81, 23, (pb) null, -39);
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "ri.G(" + param0 + ')');
        }
    }

    private final ji a(int[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ji var8 = null;
        jd var9 = null;
        ji stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        ji stackIn_18_0 = null;
        ji stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param2 ^ (param3 >>> -2053549844 | param3 << -682120124 & 65532);
            var5_int = var5_int | param3 << 1460899344;
            var6 = (long)var5_int;
            var8 = (ji) ((Object) this.field_g.a(var6, -27109));
            if (var8 == null) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (0 >= param0[0]) {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var9 = jd.a(this.field_d, param3, param2);
              if (var9 == null) {
                stackIn_15_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                var8 = var9.a();
                this.field_g.a(param1 ^ -72, var6, var8);
                if (param1 == -72) {
                  L2: {
                    if (null == param0) {
                      break L2;
                    } else {
                      param0[0] = param0[0] - var8.field_r.length;
                      break L2;
                    }
                  }
                  stackIn_23_0 = (ji) (var8);
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_18_0 = (ji) null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = (ji) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("ri.I(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L3;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ji) ((Object) stackIn_10_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ji) ((Object) stackIn_15_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_23_0;
              }
            }
          }
        }
    }

    final ji a(int param0, int[] param1, byte param2) {
        RuntimeException var4 = null;
        ji stackIn_2_0 = null;
        ji stackIn_5_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_d.b((byte) -71) != 1) {
              if (-2 != (this.field_d.b(param0, -26727) ^ -1)) {
                L1: {
                  if (param2 >= 57) {
                    break L1;
                  } else {
                    this.field_d = (bj) null;
                    break L1;
                  }
                }
                throw new RuntimeException();
              } else {
                stackIn_5_0 = this.a(param1, (byte) -72, 0, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.a(param1, (byte) -72, param0, 0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ri.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_5_0;
        }
    }

    public static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_c = null;
              if (param0 == -25) {
                break L1;
              } else {
                ri.a((byte) -4, (java.applet.Applet) null);
                break L1;
              }
            }
            field_f = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "ri.F(" + param0 + ')');
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (param1) {
                if (pi.field_h[param2] < pi.field_h[param3]) {
                  stackIn_23_0 = 1;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  if ((pi.field_h[param2] ^ -1) < (pi.field_h[param3] ^ -1)) {
                    stackIn_28_0 = 0;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    if (cc.field_L[param3] <= cc.field_L[param2]) {
                      if ((cc.field_L[param3] ^ -1) > (cc.field_L[param2] ^ -1)) {
                        stackIn_36_0 = 0;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        break L1;
                      }
                    } else {
                      stackIn_31_0 = 1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    }
                  }
                }
              } else {
                if ((cc.field_L[param2] ^ -1) <= (cc.field_L[param3] ^ -1)) {
                  if ((cc.field_L[param3] ^ -1) > (cc.field_L[param2] ^ -1)) {
                    stackIn_10_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if ((pi.field_h[param2] ^ -1) <= (pi.field_h[param3] ^ -1)) {
                      if (pi.field_h[param2] > pi.field_h[param3]) {
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    } else {
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var4_int = jk.field_db[param2] - -qa.field_c[param2] + li.field_a[param2];
            var5 = qa.field_c[param3] + jk.field_db[param3] - -li.field_a[param3];
            if (var4_int < var5) {
              stackIn_41_0 = 1;
              decompiledRegionSelector0 = 8;
              break L0;
            } else {
              L2: {
                if (param0 == 20021) {
                  break L2;
                } else {
                  ri.a((byte) -80, (java.applet.Applet) null);
                  break L2;
                }
              }
              if ((var5 ^ -1) > (var4_int ^ -1)) {
                stackIn_49_0 = 0;
                decompiledRegionSelector0 = 9;
                break L0;
              } else {
                L3: {
                  if (param3 <= param2) {
                    stackIn_54_0 = 0;
                    break L3;
                  } else {
                    stackIn_54_0 = 1;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 10;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var4), "ri.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_28_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_31_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_36_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_41_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_49_0 != 0;
                          } else {
                            return stackIn_54_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final ji a(int param0, int param1, int param2, int[] param3) {
        ji stackIn_2_0 = null;
        ji stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_23_0 = null;
        ji stackIn_25_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ji var8 = null;
        b var9 = null;
        try {
          L0: {
            var5_int = param2 ^ ((param1 & -1610608641) << 2103043524 | param1 >>> 1289314924);
            var5_int = var5_int | param1 << 1735359152;
            var6 = 4294967296L ^ (long)var5_int;
            if (param0 == -31093) {
              var8 = (ji) ((Object) this.field_g.a(var6, -27109));
              if (null == var8) {
                L1: {
                  if (param3 == null) {
                    break L1;
                  } else {
                    if ((param3[0] ^ -1) >= -1) {
                      stackIn_13_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  var9 = (b) ((Object) this.field_e.a(var6, param0 + 3984));
                  if (var9 != null) {
                    break L2;
                  } else {
                    var9 = b.a(this.field_a, param1, param2);
                    if (null == var9) {
                      stackIn_19_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      this.field_e.a(0, var6, var9);
                      break L2;
                    }
                  }
                }
                var8 = var9.a(param3);
                if (var8 != null) {
                  var9.b(34);
                  this.field_g.a(0, var6, var8);
                  stackIn_25_0 = (ji) (var8);
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  stackIn_23_0 = null;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackIn_5_0 = (ji) (var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (ji) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("ri.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L3;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ji) ((Object) stackIn_13_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (ji) ((Object) stackIn_19_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (ji) ((Object) stackIn_23_0);
                } else {
                  return stackIn_25_0;
                }
              }
            }
          }
        }
    }

    ri(bj param0, bj param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_e = new tg(256);
        this.field_g = new tg(256);
        try {
          L0: {
            this.field_a = param1;
            this.field_d = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ri.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_c = new byte[520];
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_b = "Mine the Volcano";
    }
}
