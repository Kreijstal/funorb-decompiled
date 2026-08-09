/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends ca {
    static int field_j;
    byte[] field_h;
    static int field_g;
    static String field_f;
    static int field_i;

    final static fa[] a(int param0, se param1) {
        Object stackIn_3_0 = null;
        fa[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fa[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        fa var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.h(8, 8);
                        if ((var2_int ^ -1) >= -1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (fa[]) ((Object) stackIn_3_0);
                }
                case 4: {
                    try {
                        var3 = param1.h(param0, 8);
                        var4 = new fa[var3];
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var5 ^ -1) <= (var3 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (eg.a(param1, 26678)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6_int = param1.h(ge.a(false, var5 - 1), 8);
                        var4[var5] = var4[var6_int];
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = new fa();
                        param1.h(24, param0 + -4);
                        param1.h(24, 8);
                        var6.field_d = param1.h(24, 8);
                        param1.h(9, param0 + -4);
                        param1.h(12, 8);
                        param1.h(12, param0 + -4);
                        param1.h(12, 8);
                        var4[var5] = var6;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (fa[]) (var4);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var2);
                    stackIn_13_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("mc.E(").append(param0).append(',');
                    stackIn_13_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw dd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ki param0, int param1, ki param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            me.field_g = param0;
            if (param1 == -29608) {
              sf.field_q = param2;
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

            stackIn_7_1 = new StringBuilder().append("mc.D(");

            if (param0 == null) {
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
          L2: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    mc(byte[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_h = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("mc.<init>(");

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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 12) {
                break L1;
              } else {
                mc.a((ki) null, (String) null, (String) null, 2, -19);
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "mc.C(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, wd param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
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
        boolean stackOut_12_0;
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
                    var19 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -2147483648) {
                            statePc = 4;
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
                        field_i = 85;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = uh.a((byte) -70, 3 * (param4 - param0));
                        var6 = param0 * 3;
                        var7 = var5_int + -10;
                        hi.a(false);
                        if (-1 <= (param2.field_m ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null == param2.field_t) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ec.l(102);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        fg.field_u = 0;
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var8 ^ -1) <= (param2.field_u ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param2.field_M[var8];
                        var10 = param2.field_e[var8];
                        var11 = param2.field_l[var8];
                        stackOut_12_0 = param3;
                        stackIn_48_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var19 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
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
                case 17: {
                    try {
                        var12 = a.field_t[var9];
                        var13 = ph.field_x[var9];
                        var14 = -var12 + a.field_t[var10];
                        var15 = -var12 + a.field_t[var11];
                        var16 = ph.field_x[var10] + -var13;
                        var17 = ph.field_x[var11] - var13;
                        if (0 <= -(var16 * var15) + var17 * var14) {
                            statePc = 46;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = dg.field_B[var9];
                        if (-2147483648 == var12) {
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
                        var13 = dg.field_B[var10];
                        if ((var13 ^ -1) != 2147483647) {
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
                        var14 = dg.field_B[var11];
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
                        var15 = var14 + (var12 + (var13 + -var6));
                        stackIn_27_0 = vf.field_a.length;
                        stackIn_25_0 = stackIn_27_0;
                        stackIn_27_1 = 1;
                        stackIn_25_1 = stackIn_27_1;
                        if (-1 >= (var7 ^ -1)) {
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
                        stackIn_28_0 = stackIn_25_0;
                        stackIn_28_1 = stackIn_25_1;
                        stackIn_28_2 = var15 << -var7;
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
                        stackIn_28_0 = stackIn_27_0;
                        stackIn_28_1 = stackIn_27_1;
                        stackIn_28_2 = var15 >> var7;
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
                        var16 = stackIn_28_0 - (stackIn_28_1 - -stackIn_28_2);
                        var17 = vf.field_a[var16];
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
                        if (-1 == (var17 >> 1023022500 ^ -1)) {
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
                        stackIn_38_0 = 0;
                        stackIn_31_0 = stackIn_38_0;
                        stackIn_38_1 = var16;
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
                        var17 = vf.field_a[var16];
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
                        stackIn_38_1 = var16 << -2107291772;
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
                        dm.field_g[var18] = var8;
                        vf.field_a[var16] = 1 + var17;
                        if (-1 <= (param2.field_m ^ -1)) {
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
                        if (param2.field_t != null) {
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
                        dupTemp$0 = param2.field_t[var8];
                        ji.field_a[dupTemp$0] = ji.field_a[dupTemp$0] + 1;
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
                        fg.field_u = fg.field_u + 1;
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
                            statePc = 11;
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
                        stackIn_48_0 = param2.field_m;
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
                        if (stackIn_48_0 <= 0) {
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
                        if (null != param2.field_t) {
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
                        if (ji.field_a.length <= var9) {
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
                        var10 = ji.field_a[var9];
                        ji.field_a[var9] = var8;
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
                    stackIn_64_1 = new StringBuilder().append("mc.B(").append(param0).append(',').append(param1).append(',');
                    stackIn_62_1 = stackIn_64_1;
                    if (param2 == null) {
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
                    throw dd.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 66: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(ki param0, String param1, String param2, int param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 < -56) {
                break L1;
              } else {
                mc.a((ki) null, (String) null, (String) null, -91, -6);
                break L1;
              }
            }
            if (param0.b(-1)) {
              stackIn_7_0 = param1 + " - " + param0.b((byte) -97, param3) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("mc.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_20_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
        field_g = -1;
    }
}
