/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends hl {
    static boolean field_Sb;
    static String field_Lb;
    static int field_Nb;
    static int[] field_Mb;
    private hl field_Qb;
    static String[] field_Ob;
    static String field_Kb;
    hl field_Rb;
    static String field_Pb;

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a((byte) -121, param1, param2, param6, param4);
        if (param0 != 0) {
            return;
        }
        try {
            this.a(param3, param5, -105);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "nh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    nh(long param0, hl param1, hl param2, hl param3, oh param4, String param5) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param4) {
                this.field_Qb = new hl(0L, param2);
                this.field_Qb.field_vb = param4;
                this.a((byte) -89, this.field_Qb);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != param5) {
                this.field_Rb = new hl(0L, param3, param5);
                this.a((byte) 87, this.field_Rb);
                break L2;
              } else {
                break L2;
              }
            }
            this.c((byte) 121);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("nh.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param5 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), stackIn_30_2 + ')');
        }
    }

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_Pb = null;
              field_Ob = null;
              if (!param0) {
                break L1;
              } else {
                nh.a(113, -89, (id) null, true, true);
                break L1;
              }
            }
            field_Lb = null;
            field_Mb = null;
            field_Kb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "nh.E(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, id param2, boolean param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
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
                    var19 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ja.c(-7422, 3 * (-param1 + param0));
                        var6 = param1 * 3;
                        d.d(-107);
                        var7 = -10 + var5_int;
                        if (param2.field_Q <= 0) {
                            statePc = 8;
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
                        if (param2.field_u != null) {
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        wc.i(3);
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
                        if (param3) {
                            statePc = 10;
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
                    return;
                }
                case 10: {
                    try {
                        og.field_f = 0;
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
                        if ((param2.field_s ^ -1) >= (var8 ^ -1)) {
                            statePc = 49;
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
                        var9 = param2.field_K[var8];
                        var10 = param2.field_I[var8];
                        var11 = param2.field_e[var8];
                        stackOut_12_0 = param4;
                        stackIn_50_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var19 != 0) {
                            statePc = 50;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = lj.field_b[var9];
                        var13 = pl.field_f[var9];
                        var14 = -var12 + lj.field_b[var10];
                        var15 = lj.field_b[var11] - var12;
                        var16 = pl.field_f[var10] - var13;
                        var17 = pl.field_f[var11] + -var13;
                        if (0 > var17 * var14 + -(var15 * var16)) {
                            statePc = 21;
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
                        if (var19 == 0) {
                            statePc = 48;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = nc.field_b[var9];
                        if ((var12 ^ -1) == 2147483647) {
                            statePc = 48;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 = nc.field_b[var10];
                        if ((var13 ^ -1) != 2147483647) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var19 == 0) {
                            statePc = 48;
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var14 = nc.field_b[var11];
                        if (-2147483648 == var14) {
                            statePc = 48;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var15 = -var6 + var14 + (var13 + var12);
                        stackIn_30_0 = -1 + ug.field_bb.length;
                        stackIn_28_0 = stackIn_30_0;
                        if ((var7 ^ -1) > -1) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_31_0 = stackIn_28_0;
                        stackIn_31_1 = var15 >> var7;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = stackIn_30_0;
                        stackIn_31_1 = var15 << -var7;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var16 = stackIn_31_0 - stackIn_31_1;
                        var17 = ug.field_bb[var16];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (0 == var17 >> -1353349692) {
                            statePc = 40;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var16--;
                        stackIn_41_0 = var16;
                        stackIn_34_0 = stackIn_41_0;
                        if (var19 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 < 0) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 48;
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
                        var17 = ug.field_bb[var16];
                        if (var19 == 0) {
                            statePc = 32;
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
                        stackIn_41_0 = var17 + (var16 << 1935390468);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var18 = stackIn_41_0;
                        lg.field_ab[var18] = var8;
                        ug.field_bb[var16] = 1 + var17;
                        if ((param2.field_Q ^ -1) >= -1) {
                            statePc = 47;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (param2.field_u == null) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        dupTemp$0 = param2.field_u[var8];
                        c.field_m[dupTemp$0] = c.field_m[dupTemp$0] + 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        og.field_f = og.field_f + 1;
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
                        var8++;
                        if (var19 == 0) {
                            statePc = 11;
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
                        stackIn_50_0 = -1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 <= (param2.field_Q ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (null == param2.field_u) {
                            statePc = 66;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
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
                        if (var9 >= c.field_m.length) {
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
                        var10 = c.field_m[var9];
                        c.field_m[var9] = var8;
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
                    stackIn_64_1 = new StringBuilder().append("nh.D(").append(param0).append(',').append(param1).append(',');
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
                    throw oi.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 66: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            L1: {
              var4_int = -param0;
              var5 = -param0;
              if (this.field_Qb == null) {
                break L1;
              } else {
                var4_int = this.field_Qb.f(-76);
                break L1;
              }
            }
            L2: {
              if (this.field_Rb == null) {
                break L2;
              } else {
                var5 = this.field_Rb.c(125, -param0 + (this.field_Hb + -param1) - (var4_int - -param1));
                break L2;
              }
            }
            L3: {
              var6 = var5 + var4_int + (param1 - -param0 + param1);
              if (param2 <= -67) {
                break L3;
              } else {
                this.field_Rb = (hl) null;
                break L3;
              }
            }
            L4: {
              if ((var6 ^ -1) >= (this.field_Hb ^ -1)) {
                break L4;
              } else {
                var5 = var5 + (this.field_Hb - var6);
                var6 = this.field_Hb;
                break L4;
              }
            }
            L5: {
              if (1 != this.field_xb) {
                break L5;
              } else {
                param1 = param1 + (-var6 + this.field_Hb) / 2;
                break L5;
              }
            }
            L6: {
              if ((this.field_xb ^ -1) == -3) {
                param1 = param1 + (this.field_Hb - var6);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (this.field_Qb != null) {
                this.field_Qb.a((byte) -105, var4_int, 0, this.field_R, param1);
                this.field_Qb.field_J = this.field_J;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null == this.field_Rb) {
                break L8;
              } else {
                L9: {
                  L10: {
                    this.field_Rb.a((byte) -106, var5, 0, this.field_R, param1 - -var4_int + param0);
                    if (null == this.field_Qb) {
                      break L10;
                    } else {
                      this.field_Rb.field_xb = 0;
                      if (TetraLink.field_J == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  this.field_Rb.field_xb = this.field_xb;
                  break L9;
                }
                this.field_Rb.field_J = this.field_J;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "nh.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -26606) {
                break L1;
              } else {
                nh.a(7, 48, (id) null, false, true);
                break L1;
              }
            }
            L2: {
              var4_int = -param1;
              var5 = -param1;
              if (null == this.field_Qb) {
                break L2;
              } else {
                var4_int = this.field_Qb.f(param0 + 26480);
                break L2;
              }
            }
            L3: {
              if (null == this.field_Rb) {
                break L3;
              } else {
                var5 = this.field_Rb.f(-64);
                break L3;
              }
            }
            stackIn_8_0 = param2 + var5 + (param1 + param2 + var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "nh.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    static {
        field_Sb = false;
        field_Lb = "Invite <%0> to this game";
        field_Ob = new String[]{"Play 5 Rated games", "Play 10 Rated games", "Win 5 Rated games", "Win 10 Rated games", "Win 25 Rated games", "Win a Rated game with two (or more) lines of four", "Build a row of five counters in a Rated game", "Win 7 Rated games during the Halloween season"};
        field_Kb = "Private";
        field_Pb = "No spectators";
    }
}
