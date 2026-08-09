/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends w {
    static boolean field_Nb;
    static ig field_bc;
    private w field_ac;
    private StringBuilder field_Ub;
    private ha field_Qb;
    private w field_Xb;
    static int[][] field_Ob;
    private w[] field_Yb;
    long field_Tb;
    private w field_cc;
    private w field_Sb;
    static boolean field_Zb;
    private w field_Pb;
    private w field_Wb;
    static int field_Vb;
    private int field_Rb;

    public static void f(int param0) {
        field_Ob = (int[][]) null;
        if (param0 != 256) {
            return;
        }
        field_bc = null;
    }

    final static ck a(int param0, int param1, String param2, lm param3, int param4, int param5, byte param6) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        ck stackIn_44_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        ck var14 = null;
        int[] var15 = null;
        ck var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var31 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = param3.a(param2) - 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param4 * (2 + var7_int) < 620) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param4--;
                        if (var27 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8 = param3.field_K + param3.field_R;
                        var9 = param4;
                        var10 = var9 / 4;
                        var31 = hk.field_l;
                        var12 = hk.field_j;
                        var13 = hk.field_i;
                        var14 = new ck(var7_int, var8);
                        var14.a();
                        param3.a(param2, 0, param3.field_R, 16777215, -1);
                        if (0 == param5) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param5 = 65793;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        hk.a(var31, var12, var13);
                        var15 = var14.field_D;
                        var16 = new ck((2 + var7_int) * var9, var9 * (2 + var8));
                        var16.a();
                        var17 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = var8;
                        stackIn_9_1 = var17;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 <= stackIn_9_1) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_19_0 = 0;
                        stackIn_11_0 = stackIn_19_0;
                        if (var27 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var18 = stackIn_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7_int <= var18) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_9_0 = var15[var17 * var7_int + var18] ^ -1;
                        stackIn_14_0 = stackIn_9_0;
                        stackIn_9_1 = -1;
                        stackIn_14_1 = stackIn_9_1;
                        if (var27 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == stackIn_14_1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var19 = var9 * (var18 - -1);
                        var20 = (var17 - -1) * var9;
                        hk.e(var19, var20, var9 - var10, param5 | -16777216);
                        hk.e(-1 + var9 + var19, var20, var9 + -var10, param5 | -16777216);
                        hk.e(var19, var20 - -var9 - 1, -var10 + var9, param5 | -16777216);
                        hk.e(var19 + (var9 + -1), var9 + var20 - 1, -var10 + var9, param5 | -16777216);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var18++;
                        if (var27 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var17++;
                        if (var27 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        hk.a(var31, var12, var13);
                        stackIn_19_0 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var17 = stackIn_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var17;
                        stackIn_21_1 = var8;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 >= stackIn_21_1) {
                            statePc = 40;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_41_0 = 0;
                        stackIn_23_0 = stackIn_41_0;
                        if (var27 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var18 = stackIn_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = var7_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 <= var18) {
                            statePc = 39;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_21_0 = 0;
                        stackIn_27_0 = stackIn_21_0;
                        stackIn_21_1 = var15[var18 - -(var17 * var7_int)];
                        stackIn_27_1 = stackIn_21_1;
                        if (var27 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == stackIn_27_1) {
                            statePc = 38;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var19 = var9 + var18 * var9;
                        var20 = var19 - -var9;
                        var21 = var9 * var17 - -var9;
                        var22 = var9 + var21;
                        var23 = var21;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var23 >= var22) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var24 = 256 * (var23 - var9) / (var9 * var8);
                        var25 = fl.a(param1, var24, 256, param0, 124);
                        stackIn_25_0 = var19;
                        stackIn_31_0 = stackIn_25_0;
                        if (var27 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var26 = stackIn_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var20 <= var26) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var16.field_D[var26 - -(var16.field_I * var23)] = de.b(-16777216, var25);
                        var26++;
                        if (var27 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var27 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var23++;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var27 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var18++;
                        if (var27 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var17++;
                        if (var27 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = param6;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 >= 84) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        mg.f(17);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = (ck) (var16);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return stackIn_44_0;
                }
                case 45: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_47_0 = (RuntimeException) (var7);
                    stackIn_46_0 = stackIn_47_0;
                    stackIn_47_1 = new StringBuilder().append("mg.B(").append(param0).append(',').append(param1).append(',');
                    stackIn_46_1 = stackIn_47_1;
                    if (param2 == null) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_48_2 = "{...}";
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_48_2 = "null";
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_49_0 = stackIn_50_0;
                    stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
                    stackIn_49_1 = stackIn_50_1;
                    if (param3 == null) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_51_2 = "{...}";
                    statePc = 51;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                    stackIn_51_2 = "null";
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    throw dh.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          if (1 == (this.field_Rb ^ -1)) {
            if (-14 == (wh.field_c ^ -1)) {
              this.field_Rb = -1;
              return true;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, ck param1, ck param2) {
        RuntimeException runtimeException = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var8 = param2.field_D;
            var3 = var8;
            var4 = param1.field_D;
            var5 = var8.length;
            var6 = param0;
            L1: while (true) {
              L2: {
                if (var6 >= var5) {
                  break L2;
                } else {
                  if (var7 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (0 == var4[var6]) {
                        var8[var6] = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6++;
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("mg.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    private final int a(w param0, int param1, int param2, w param3, int param4, String param5) {
        w var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new w(0L, param0, 0, param1, param2, param4, param5);
            param3.a(var7, -16834);
            param1 += 32;
            stackIn_1_0 = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7_ref);

            stackIn_4_1 = new StringBuilder().append("mg.M(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(boolean param0, w param1, w param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param3 += 8;
              if (param0) {
                break L1;
              } else {
                field_Ob = (int[][]) null;
                break L1;
              }
            }
            var6_int = param1.field_J.b(param1.field_Y, param4 + -(param1.field_ub * 2), param1.field_Db);
            param1.a(param4, 0, param3, var6_int, 0);
            param2.a(param1, -16834);
            param3 = param3 + (var6_int - 0);
            stackIn_3_0 = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("mg.C(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final int c(int param0, boolean param1) {
        ha stackIn_7_0 = null;
        ha stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_13_0 = null;
        w stackIn_16_0 = null;
        w stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        this.a(false, param1);
        if (param0 == 497) {
          L0: {
            if (null == this.field_Wb) {
              break L0;
            } else {
              L1: {
                this.field_Wb.field_Y = this.field_Ub.toString();
                this.field_Wb.field_vb = (this.field_mb - this.field_Wb.field_J.a(this.field_Wb.field_Y)) / 2;
                this.field_Wb.field_mb = this.field_mb + -this.field_Wb.field_vb;
                if (null == this.field_Qb) {
                  break L1;
                } else {
                  if (0 == this.field_Qb.field_ob) {
                    break L1;
                  } else {
                    L2: {
                      stackIn_7_0 = this.field_Qb;

                      if (this.field_Qb.field_ab) {
                        stackIn_8_0 = (ha) ((Object) stackIn_7_0);
                        stackIn_8_1 = 0;
                        break L2;
                      } else {
                        stackIn_8_0 = (ha) ((Object) stackIn_7_0);
                        stackIn_8_1 = 1;
                        break L2;
                      }
                    }
                    stackIn_8_0.field_ab = stackIn_8_1 != 0;
                    break L1;
                  }
                }
              }
              var3 = 0;
              L3: while (true) {
                if (qb.field_u <= var3) {
                  break L0;
                } else {
                  stackIn_13_0 = this;

                  if (var4 == 0) {
                    L4: {
                      if (((mg) (this)).field_Yb[var3] == null) {
                        break L4;
                      } else {
                        L5: {
                          stackIn_16_0 = this.field_Yb[var3];

                          if (-1 <= (this.field_Ub.length() ^ -1)) {
                            stackIn_17_0 = (w) ((Object) stackIn_16_0);
                            stackIn_17_1 = 0;
                            break L5;
                          } else {
                            stackIn_17_0 = (w) ((Object) stackIn_16_0);
                            stackIn_17_1 = 1;
                            break L5;
                          }
                        }
                        stackIn_17_0.field_Hb = stackIn_17_1 != 0;
                        if (!this.field_Yb[var3].field_Hb) {
                          break L4;
                        } else {
                          if (0 == this.field_Yb[var3].field_ob) {
                            break L4;
                          } else {
                            return var3;
                          }
                        }
                      }
                    }
                    var3++;
                    if (var4 == 0) {
                      continue L3;
                    } else {
                      break L0;
                    }
                  } else {
                    return ((mg) (this)).field_Rb;
                  }
                }
              }
            }
          }
          if (-1 == (this.field_ac.field_ob ^ -1)) {
            if (param1) {
              if (0 != ig.field_Yb) {
                if (0 == this.field_ob) {
                  return -1;
                } else {
                  return this.field_Rb;
                }
              } else {
                return this.field_Rb;
              }
            } else {
              return this.field_Rb;
            }
          } else {
            return -1;
          }
        } else {
          return -95;
        }
    }

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 5658) {
            break L0;
          } else {
            mg.f(-70);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_Qb) {
              break L2;
            } else {
              if (!this.field_Qb.field_ab) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final String g(byte param0) {
        if (param0 != -96) {
            field_Nb = true;
        }
        return this.field_Ub.toString();
    }

    final static void b(int param0, boolean param1) {
        je.field_f = param1 ? new ak(ue.field_c, cl.field_n) : new ak(eg.field_b, in.field_o);
        ee.field_i = new w(0L, (w) null);
        ee.field_i.a(je.field_f.field_h, -16834);
        ee.field_i.a(ma.field_G, -16834);
        mn.field_e = new w((long)param0, ui.field_x);
        cl.field_C = new w(0L, (w) null);
        mn.field_e.a(ie.field_a, -16834);
        mn.field_e.a(cl.field_C, -16834);
        cl.field_C.a(gg.field_y, -16834);
        cl.field_C.a(qc.field_q, -16834);
        vb.a(param1, -2);
    }

    mg(int param0, int param1, int param2, int param3, int param4, w param5, w param6, w param7, w param8, ha param9, w param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException runtimeException = null;
        int var15_int = 0;
        w[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        w[] var28 = null;
        Object stackIn_8_0;
        ha stackIn_8_1;
        ha stackIn_8_2;
        long stackIn_8_3;
        ha stackIn_8_4;
        Object stackIn_9_0;
        ha stackIn_9_1;
        ha stackIn_9_2;
        long stackIn_9_3;
        ha stackIn_9_4;
        String stackIn_9_5;
        w stackIn_16_0 = null;
        w stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_61_1 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        var27 = client.field_A ? 1 : 0;
        this.field_Rb = -2;
        try {
          L0: {
            L1: {
              L2: {
                this.field_Tb = param12;
                this.field_cc = new w(0L, param6, ue.field_a.toUpperCase());
                this.field_cc.field_X = 1;
                this.a(this.field_cc, -16834);
                this.field_ac = new w(0L, param7);
                this.field_cc.a(this.field_ac, -16834);
                this.field_Pb = new w(0L, (w) null);
                this.a(this.field_Pb, -16834);
                if (param11 != null) {
                  break L2;
                } else {
                  this.field_Xb = new w(0L, param8, hc.field_f);
                  this.field_Xb.field_G = 11184810;
                  this.field_Xb.field_X = 1;
                  this.field_Pb.a(this.field_Xb, -16834);
                  var15_int = 226;
                  var16 = 10;
                  var17 = this.field_Xb.field_J.a(this.field_Xb.field_Y, var15_int);
                  this.field_Xb.a(var15_int, 0, var16, kf.field_O * var17, 13);
                  var16 = var16 + kf.field_O * var17;
                  this.field_Pb.a(var15_int + 13 - -13, 0, 24, 10 - -var16, 0);
                  this.field_Pb.field_lb = ea.a(2105376, -20982, 3, this.field_Pb.field_N, 8421504, 11579568);
                  var18 = 26 - -var15_int;
                  var19 = var16 + 34;
                  var20 = vh.a(param2, -18265, var18, param0);
                  var21 = o.a(param3, 0, var19, param1);
                  this.a(var18, 0, var21, var19, var20);
                  if (var27 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  this.field_Xb = new w(0L, param8, ph.field_Hb);
                  this.field_Xb.field_X = 1;
                  this.field_Xb.field_G = 11184810;
                  this.field_Pb.a(this.field_Xb, -16834);
                  this.field_Sb = new w(0L, param8, pc.field_c);
                  this.field_Sb.field_X = 1;
                  this.field_Sb.field_G = 11184810;
                  this.field_Pb.a(this.field_Sb, -16834);
                  this.field_Wb = new w(0L, param8);
                  this.field_Wb.field_G = 16764006;
                  this.field_Pb.a(this.field_Wb, -16834);
                  this.field_Wb.field_T = "|";
                  if ((d.field_b ^ -1) <= -6) {
                    break L4;
                  } else {
                    if ((te.field_p ^ -1) > -3) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    stackIn_8_0 = this;

                    stackIn_8_1 = null;

                    stackIn_8_2 = null;

                    stackIn_8_3 = 0L;

                    stackIn_8_4 = (ha) (param9);

                    if (-8 >= (d.field_b ^ -1)) {
                      break L6;
                    } else {
                      stackIn_8_0 = this;

                      stackIn_8_1 = null;

                      stackIn_8_2 = null;

                      stackIn_8_4 = (ha) ((Object) stackIn_8_4);

                      if (-3 >= (te.field_p ^ -1)) {
                        break L6;
                      } else {
                        stackIn_9_0 = this;
                        stackIn_9_1 = null;
                        stackIn_9_2 = null;
                        stackIn_9_3 = stackIn_8_3;
                        stackIn_9_4 = (ha) ((Object) stackIn_8_4);
                        stackIn_9_5 = rk.field_bb;
                        break L5;
                      }
                    }
                  }
                  stackIn_9_0 = this;
                  stackIn_9_1 = null;
                  stackIn_9_2 = null;
                  stackIn_9_3 = stackIn_8_3;
                  stackIn_9_4 = (ha) ((Object) stackIn_8_4);
                  stackIn_9_5 = si.field_j;
                  break L5;
                }
                ((mg) (this)).field_Qb = new ha(stackIn_9_3, stackIn_9_4, stackIn_9_5);
                this.field_Pb.a(this.field_Qb, -16834);
                break L3;
              }
              var28 = new w[3];
              var15 = var28;
              var28[0] = new w(0L, (w) null);
              this.field_Pb.a(var28[0], -16834);
              var28[1] = new w(0L, (w) null);
              this.field_Pb.a(var28[1], -16834);
              var28[2] = new w(0L, (w) null);
              this.field_Pb.a(var28[2], -16834);
              this.field_Yb = new w[qb.field_u];
              var16 = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var16 >= qb.field_u) {
                      break L9;
                    } else {
                      if (var27 != 0) {
                        break L8;
                      } else {
                        L10: {
                          if (pn.field_bb[var16] == null) {
                            break L10;
                          } else {
                            L11: {
                              this.field_Yb[var16] = new w(0L, param10, pn.field_bb[var16]);
                              this.field_Yb[var16].field_X = 0;
                              stackIn_16_0 = this.field_Yb[var16];

                              if (param11 == null) {
                                stackIn_17_0 = (w) ((Object) stackIn_16_0);
                                stackIn_17_1 = 0;
                                break L11;
                              } else {
                                stackIn_17_0 = (w) ((Object) stackIn_16_0);
                                stackIn_17_1 = 1;
                                break L11;
                              }
                            }
                            stackIn_17_0.field_Hb = stackIn_17_1 != 0;
                            this.field_Pb.a(this.field_Yb[var16], -16834);
                            break L10;
                          }
                        }
                        var16++;
                        if (var27 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  this.field_Ub = new StringBuilder(12);
                  break L8;
                }
                L12: {
                  if (param11 == null) {
                    break L12;
                  } else {
                    discarded$1 = this.field_Ub.append(param11);
                    break L12;
                  }
                }
                L13: {
                  var16 = 0;
                  var17 = param6.field_J.a(cf.field_g);
                  if (var17 <= var16) {
                    break L13;
                  } else {
                    var16 = var17;
                    break L13;
                  }
                }
                L14: {
                  var17 = param6.field_J.a(ul.field_a);
                  if (var16 >= var17) {
                    break L14;
                  } else {
                    var16 = var17;
                    break L14;
                  }
                }
                L15: {
                  var17 = param6.field_J.a(k.field_d);
                  if (var17 <= var16) {
                    break L15;
                  } else {
                    var16 = var17;
                    break L15;
                  }
                }
                var17 = 0;
                L16: while (true) {
                  L17: {
                    L18: {
                      if (var17 >= qb.field_u) {
                        break L18;
                      } else {
                        if (var27 != 0) {
                          break L17;
                        } else {
                          L19: {
                            if (this.field_Yb[var17] == null) {
                              break L19;
                            } else {
                              var18 = this.field_Yb[var17].a(true);
                              if (var18 <= var16) {
                                break L19;
                              } else {
                                var16 = var18;
                                break L19;
                              }
                            }
                          }
                          var17++;
                          if (var27 == 0) {
                            continue L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    L20: {
                      if (-141 <= (var16 ^ -1)) {
                        break L20;
                      } else {
                        var16 = 140;
                        break L20;
                      }
                    }
                    var17 = 0;
                    break L17;
                  }
                  L21: {
                    var18 = 0;
                    var18 = 0;
                    var18 = this.a(param6, var18, var16, var28[0], 24, cf.field_g);
                    var18 = this.a(true, this.field_Yb[6], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[9], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[5], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[7], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[15], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[4], var28[0], var18, var16);
                    if (var18 <= var17) {
                      break L21;
                    } else {
                      var17 = var18;
                      break L21;
                    }
                  }
                  L22: {
                    var18 = 0;
                    var18 = this.a(param6, var18, var16, var28[1], 24, ul.field_a);
                    var18 = this.a(true, this.field_Yb[16], var28[1], var18, var16);
                    var18 = this.a(true, this.field_Yb[17], var28[1], var18, var16);
                    var18 = this.a(true, this.field_Yb[18], var28[1], var18, var16);
                    var18 = this.a(true, this.field_Yb[19], var28[1], var18, var16);
                    var18 = this.a(true, this.field_Yb[20], var28[1], var18, var16);
                    if (var17 >= var18) {
                      break L22;
                    } else {
                      var17 = var18;
                      break L22;
                    }
                  }
                  L23: {
                    var18 = 0;
                    var18 = this.a(param6, var18, var16, var28[2], 24, k.field_d);
                    var18 = this.a(true, this.field_Yb[13], var28[2], var18, var16);
                    var18 = this.a(true, this.field_Yb[21], var28[2], var18, var16);
                    var18 = this.a(true, this.field_Yb[11], var28[2], var18, var16);
                    if (var17 >= var18) {
                      break L23;
                    } else {
                      var17 = var18;
                      break L23;
                    }
                  }
                  L24: {
                    var19 = 3 * var16 - -26;
                    var20 = this.field_cc.a(true);
                    if (var20 <= var19) {
                      break L24;
                    } else {
                      var19 = var20;
                      break L24;
                    }
                  }
                  L25: {
                    if (this.field_Qb == null) {
                      break L25;
                    } else {
                      var20 = this.field_Qb.c(4, -4168);
                      if (var19 >= var20) {
                        break L25;
                      } else {
                        var19 = var20;
                        break L25;
                      }
                    }
                  }
                  L26: {
                    this.field_cc.a(13 - (-var19 + -13), 0, 0, 24, 0);
                    this.field_ac.a(15, 0, 5, 15, -20 + this.field_cc.field_mb);
                    var21 = 10;
                    this.field_Xb.a(var19, 0, var21, kf.field_O * 2, 13);
                    var21 = var21 + 2 * kf.field_O;
                    this.field_Sb.a(var19, 0, var21, kf.field_O * 2, 13);
                    var21 = var21 + (2 * kf.field_O + 10);
                    this.field_Wb.a(0, 0, var21, kf.field_O, 0);
                    var21 = var21 + (kf.field_O + 10);
                    if (null == this.field_Qb) {
                      break L26;
                    } else {
                      var20 = this.field_Qb.c(4, -4168);
                      this.field_Qb.a(var20, 8, var21, (var19 + -var20) / 2 + 13, 4, kf.field_O);
                      var21 = var21 + (10 + kf.field_O);
                      break L26;
                    }
                  }
                  var28[0].a(var16, 0, var21, var17, 13);
                  var28[1].a(var16, 0, var21, var17, 13 + (var16 + 13));
                  var28[2].a(var16, 0, var21, var17, 2 * var16 + 13 - -26);
                  var22 = var21;
                  this.field_Pb.a(13 - -var19 + 13, 0, 24, 10 + var17 + var22, 0);
                  this.field_Pb.field_lb = ea.a(2105376, -20982, 3, this.field_Pb.field_N, 8421504, 11579568);
                  var23 = 13 - -var19 + 13;
                  var24 = 10 + (var22 + (24 + var17));
                  var25 = vh.a(param2, -18265, var23, param0);
                  var26 = o.a(param3, 0, var24, param1);
                  this.a(var23, 0, var26, var24, var25);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            runtimeException = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (runtimeException);

            stackIn_55_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L27;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_58_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',');

            if (param6 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L28;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_61_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');

            if (param7 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L29;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L29;
            }
          }
          L30: {


            stackIn_64_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');

            if (param8 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L30;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L30;
            }
          }
          L31: {


            stackIn_67_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');

            if (param9 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L31;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L31;
            }
          }
          L32: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');

            if (param10 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L32;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L32;
            }
          }
          L33: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param11 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L33;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L33;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_56_0), stackIn_74_2 + ',' + param12 + ')');
        }
    }

    static {
        field_Nb = false;
    }
}
