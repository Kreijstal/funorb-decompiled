/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wi extends kd {
    int field_z;
    static int field_y;
    int field_B;
    static gk[] field_C;
    static String field_G;
    int field_D;
    int field_F;
    int field_H;
    int field_A;

    public static void g(int param0) {
        field_C = null;
        if (param0 != 573) {
            return;
        }
        try {
            field_G = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "wi.D(" + param0 + ')');
        }
    }

    final static void a(int param0, pe param1, int param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_11_0;
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
                    var19 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ve.a(-122, (param0 + -param2) * 3);
                        var6 = param2 * 3;
                        kk.b((byte) 34);
                        var7 = var5_int + -10;
                        if ((param1.field_K ^ -1) >= -1) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param1.field_P) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fb.b(0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param4 == 2147483647) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        wl.field_D = 0;
                        var8 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var8 ^ -1) <= (param1.field_w ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = param1.field_G[var8];
                        var10 = param1.field_j[var8];
                        var11 = param1.field_x[var8];
                        stackOut_11_0 = param3;
                        stackIn_45_0 = stackOut_11_0 ? 1 : 0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var19 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!stackIn_12_0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = eh.field_d[var9];
                        var13 = n.field_p[var9];
                        var14 = eh.field_d[var10] - var12;
                        var15 = eh.field_d[var11] - var12;
                        var16 = -var13 + n.field_p[var10];
                        var17 = n.field_p[var11] + -var13;
                        if (var14 * var17 - var16 * var15 >= 0) {
                            statePc = 43;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = km.field_h[var9];
                        if (-2147483648 == var12) {
                            statePc = 43;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var13 = km.field_h[var10];
                        if (var13 == -2147483648) {
                            statePc = 43;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14 = km.field_h[var11];
                        if (2147483647 != (var14 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var19 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var15 = -var6 + (var13 + var12) - -var14;
                        stackIn_25_0 = -1;
                        stackIn_23_0 = stackIn_25_0;
                        stackIn_25_1 = ck.field_c.length;
                        stackIn_23_1 = stackIn_25_1;
                        if (-1 >= (var7 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = stackIn_23_0;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = var15 << -var7;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = stackIn_25_0;
                        stackIn_26_1 = stackIn_25_1;
                        stackIn_26_2 = var15 >> var7;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var16 = stackIn_26_0 + (stackIn_26_1 - stackIn_26_2);
                        var17 = ck.field_c[var16];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (0 == var17 >> 268562756) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16--;
                        stackIn_36_0 = -1;
                        stackIn_29_0 = stackIn_36_0;
                        stackIn_36_1 = var16 ^ -1;
                        stackIn_29_1 = stackIn_36_1;
                        if (var19 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 < stackIn_29_1) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var17 = ck.field_c[var16];
                        if (var19 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = var16 << 294058180;
                        stackIn_36_1 = var17;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var18 = stackIn_36_0 + stackIn_36_1;
                        um.field_bb[var18] = var8;
                        ck.field_c[var16] = var17 - -1;
                        if (param1.field_K <= 0) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == param1.field_P) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        dupTemp$0 = param1.field_P[var8];
                        qe.field_a[dupTemp$0] = qe.field_a[dupTemp$0] + 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        wl.field_D = wl.field_D + 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = param1.field_K ^ -1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 >= -1) {
                            statePc = 63;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (null != param1.field_P) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (qe.field_a.length <= var9) {
                            statePc = 63;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var10 = qe.field_a[var9];
                        qe.field_a[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var19 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_61_0 = (RuntimeException) (var5);
                    stackIn_59_0 = stackIn_61_0;
                    stackIn_61_1 = new StringBuilder().append("wi.B(").append(param0).append(',');
                    stackIn_59_1 = stackIn_61_1;
                    if (param1 == null) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_62_2 = "{...}";
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_62_2 = "null";
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    throw ci.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 63: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ah a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ah var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        ah stackIn_15_0 = null;
        ah stackIn_20_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (null == pi.field_a) {
                break L1;
              } else {
                if (param0 == null) {
                  break L1;
                } else {
                  if (-1 != (param0.length() ^ -1)) {
                    var2 = ui.a(1, (CharSequence) ((Object) param0));
                    if (var2 != null) {
                      if (param1 >= 112) {
                        var3 = (ah) ((Object) pi.field_a.a((long)var2.hashCode(), (byte) 93));
                        L2: while (true) {
                          L3: {
                            if (null == var3) {
                              break L3;
                            } else {
                              var4 = ui.a(1, (CharSequence) ((Object) var3.field_dc));
                              if (!var4.equals(var2)) {
                                var3 = (ah) ((Object) pi.field_a.c((byte) 121));
                                if (var5 == 0) {
                                  continue L2;
                                } else {
                                  break L3;
                                }
                              } else {
                                stackIn_20_0 = (ah) (var3);
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          stackIn_23_0 = null;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackIn_15_0 = (ah) null;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      stackIn_12_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_9_0 = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2_ref);

            stackIn_27_1 = new StringBuilder().append("wi.C(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ah) ((Object) stackIn_9_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ah) ((Object) stackIn_12_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return (ah) ((Object) stackIn_23_0);
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        try {
            sl.field_m = mm.a(95);
            sb.field_Z = 0;
            if (param0 > -104) {
                field_y = -62;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "wi.A(" + param0 + ')');
        }
    }

    wi() {
    }

    static {
        field_G = "There are no valid types of game that match your preferences.";
    }
}
