/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho extends nc {
    private int field_o;
    private int field_r;
    static String field_p;
    static int field_q;
    private int field_n;
    static int field_m;
    static int field_l;
    static int field_s;

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -118) {
                break L1;
              } else {
                field_l = -12;
                break L1;
              }
            }
            stackIn_4_0 = this.field_o;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "ho.V(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, fh param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              oq.field_u = param1.field_i.field_k;
              dl.a(-91);
              if (param0 < -121) {
                break L1;
              } else {
                ho.e(-95);
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

            stackIn_6_1 = new StringBuilder().append("ho.A(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(md param0, int param1, int param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_50_0 = 0;
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
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = mb.a((byte) -31, 3 * (-param2 + param1));
                        var6 = 3 * param2;
                        dd.a((byte) 8);
                        var7 = var5_int + -10;
                        if (param4 == 16634) {
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
                        field_q = 42;
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
                        if (-1 <= (param0.field_m ^ -1)) {
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
                        if (param0.field_z == null) {
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
                        kq.a(0);
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
                        tf.field_Eb = 0;
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
                        if (param0.field_B <= var8) {
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
                        var9 = param0.field_y[var8];
                        var10 = param0.field_L[var8];
                        var11 = param0.field_H[var8];
                        stackOut_12_0 = param3;
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
                        if (!stackIn_13_0) {
                            statePc = 20;
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
                        var12 = lo.field_j[var9];
                        var13 = jk.field_k[var9];
                        var14 = lo.field_j[var10] + -var12;
                        var15 = lo.field_j[var11] - var12;
                        var16 = jk.field_k[var10] - var13;
                        var17 = -var13 + jk.field_k[var11];
                        if (0 > var14 * var17 - var16 * var15) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var19 == 0) {
                            statePc = 48;
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
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var12 = hl.field_f[var9];
                        if (-2147483648 == var12) {
                            statePc = 48;
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
                        var13 = hl.field_f[var10];
                        if (-2147483648 != var13) {
                            statePc = 25;
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
                        if (var19 == 0) {
                            statePc = 48;
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
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var14 = hl.field_f[var11];
                        if ((var14 ^ -1) == 2147483647) {
                            statePc = 48;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var15 = var14 + var13 + var12 - var6;
                        if (var7 >= 0) {
                            statePc = 29;
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
                        stackIn_30_0 = var15 << -var7;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = var15 >> var7;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var16 = -stackIn_30_0 + hl.field_e.length + -1;
                        var17 = hl.field_e[var16];
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
                        if (0 == var17 >> 2146665476) {
                            statePc = 40;
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
                        var16--;
                        stackIn_41_0 = -1;
                        stackIn_33_0 = stackIn_41_0;
                        stackIn_41_1 = var16 ^ -1;
                        stackIn_33_1 = stackIn_41_1;
                        if (var19 != 0) {
                            statePc = 41;
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
                        if (stackIn_33_0 >= stackIn_33_1) {
                            statePc = 39;
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 48;
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
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var17 = hl.field_e[var16];
                        if (var19 == 0) {
                            statePc = 31;
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
                        stackIn_41_0 = var17;
                        stackIn_41_1 = var16 << -1452760860;
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
                        var18 = stackIn_41_0 + stackIn_41_1;
                        ah.field_f[var18] = var8;
                        hl.field_e[var16] = var17 - -1;
                        if (-1 <= (param0.field_m ^ -1)) {
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
                        if (param0.field_z == null) {
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
                        dupTemp$0 = param0.field_z[var8];
                        nn.field_c[dupTemp$0] = nn.field_c[dupTemp$0] + 1;
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
                        tf.field_Eb = tf.field_Eb + 1;
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
                        stackIn_50_0 = param0.field_m ^ -1;
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
                        if (stackIn_50_0 >= -1) {
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
                        if (param0.field_z == null) {
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
                        if ((nn.field_c.length ^ -1) >= (var9 ^ -1)) {
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
                        var10 = nn.field_c[var9];
                        nn.field_c[var9] = var8;
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
                    stackIn_64_1 = new StringBuilder().append("ho.E(");
                    stackIn_62_1 = stackIn_64_1;
                    if (param0 == null) {
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
                    throw fa.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 66: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 30833) {
                break L1;
              } else {
                field_l = -114;
                break L1;
              }
            }
            field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ho.J(" + param0 + ')');
        }
    }

    final static int a(CharSequence param0, int param1, int param2) {
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
              if (param2 == 3) {
                break L1;
              } else {
                field_p = (String) null;
                break L1;
              }
            }
            stackIn_4_0 = md.a(param0, param1, -105, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ho.D(");

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
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_25_0 = 0;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref2 = null;
            var7 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                if (!hk.field_a) {
                  try {
                    L1: {
                      L2: {
                        var2 = "tuhstatbut";
                        var3 = (String) (fo.b(param0, 13093, "getcookies"));
                        if (param1 == 61) {
                          break L2;
                        } else {
                          ho.a(122, 9, (byte[]) null, 88);
                          break L2;
                        }
                      }
                      var4 = mk.a(';', false, var3);
                      var5 = 0;
                      L3: while (true) {
                        L4: {
                          if (var4.length <= var5) {
                            break L4;
                          } else {
                            var6 = var4[var5].indexOf('=');
                            stackIn_25_0 = var6 ^ -1;

                            if (var7 != 0) {
                              decompiledRegionSelector0 = 0;
                              break L1;
                            } else {
                              L5: {
                                if (stackIn_25_0 > -1) {
                                  break L5;
                                } else {
                                  if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                    break L5;
                                  } else {
                                    stackIn_17_0 = 1;
                                    decompiledRegionSelector0 = 1;
                                    break L1;
                                  }
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L6: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 2;
                      break L6;
                    }
                  }
                  L7: {
                    if (decompiledRegionSelector0 == 0) {
                      break L7;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        decompiledRegionSelector1 = 2;
                        break L0;
                      } else {
                        if (null == param0.getParameter("tuhstatbut")) {
                          stackIn_25_0 = 0;
                          break L7;
                        } else {
                          stackIn_25_0 = 1;
                          break L7;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_29_0 = (RuntimeException) (var2_ref);

                stackIn_29_1 = new StringBuilder().append("ho.I(");

                if (param0 == null) {
                  stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackIn_30_2 = "null";
                  break L8;
                } else {
                  stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackIn_30_2 = "{...}";
                  break L8;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_25_0 != 0;
              } else {
                return stackIn_17_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        wl var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 <= (param1 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4 = new byte[param3];
                        var5_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((param3 ^ -1) >= (var5_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4[var5_int] = param2[param1 + var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = param2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = new wl();
                        var5.b(32);
                        if (param0 == 4246) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = (byte[]) null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var5.a(var4, param0 ^ 4262, (long)(8 * param3));
                        var6 = new byte[64];
                        var5.a(var6, param0 ^ 4247, 0);
                        stackIn_14_0 = (byte[]) (var6);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var4_ref);
                    stackIn_16_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("ho.F(").append(param0).append(',').append(param1).append(',');
                    stackIn_16_1 = stackIn_18_1;
                    if (param2 == null) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        int var2_int = 0;
        try {
            var2_int = (wn.a(-125, wf.field_m << 2057136483) * 24 >> -483729424) + (175 + (4 * on.a(wf.field_m << 1660598087, -18924) >> -46548720));
            oo.f(0, 0, 640, 480, 0, var2_int);
            oo.h(5, 5, 635, 475);
            gb.a(6, 3 + this.field_n, 469, 640 + (-this.field_n + -this.field_n), (byte) 122);
            oo.c();
            vh.field_Lb.a(this.field_n, 136);
            vh.field_Lb.a(this.field_n, 6);
            dm.field_Wb.a(640 - this.field_n, 6);
            dm.field_Wb.a(-this.field_n + 640, 134);
            no.field_Jb.a(0, 0);
            super.a(param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ho.H(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_r = 0;
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_g.field_c <= var2_int) {
                    break L3;
                  } else {
                    var3 = we.field_g[this.field_j[var2_int]];
                    var4 = ah.field_e.a(var3);
                    stackIn_29_0 = this.field_j[var2_int];

                    stackIn_29_1 = 50;

                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_29_0 == stackIn_29_1) {
                          L5: {
                            var5 = ah.field_e.a(da.field_f);
                            var6 = ah.field_e.a(jm.field_l);
                            var7 = ah.field_e.a(jp.field_a);
                            if (var5 > var6) {
                              stackIn_12_0 = var5;
                              break L5;
                            } else {
                              stackIn_12_0 = var6;
                              break L5;
                            }
                          }
                          L6: {
                            var8 = stackIn_12_0;
                            if ((var8 ^ -1) < (var7 ^ -1)) {
                              stackIn_16_0 = var8;
                              break L6;
                            } else {
                              stackIn_16_0 = var7;
                              break L6;
                            }
                          }
                          var8 = stackIn_16_0;
                          var4 = var4 + var8;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L7: {
                        L8: {
                          if (this.field_j[var2_int] == 12) {
                            break L8;
                          } else {
                            if (13 != this.field_j[var2_int]) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var4 += 140;
                        break L7;
                      }
                      L9: {
                        if (var4 > this.field_r) {
                          this.field_r = var4;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var2_int++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_o = -(this.field_r >> -1057907071) + 320;
                this.field_n = this.field_o - 20;
                stackIn_29_0 = param0;
                stackIn_29_1 = 74;
                break L2;
              }
              L10: {
                if (stackIn_29_0 == stackIn_29_1) {
                  break L10;
                } else {
                  ho.a((byte) -52, (fh) null);
                  break L10;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ho.G(" + param0 + ')');
        }
    }

    final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -65) {
                break L1;
              } else {
                field_p = (String) null;
                break L1;
              }
            }
            stackIn_4_0 = this.field_r + this.field_o;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "ho.AA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    ho(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    static {
        field_p = "Respect";
        field_l = 1;
        field_m = 0;
        field_s = 131072;
    }
}
