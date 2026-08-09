/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ug {
    String field_jb;
    int field_R;
    String field_ib;

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_4_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
        Class stackIn_36_0 = null;
        Class stackIn_38_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.equals("B")) {
              stackIn_4_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param1.equals("I")) {
                if (!param1.equals("S")) {
                  if (!param1.equals("J")) {
                    L1: {
                      if (param0 == 11) {
                        break L1;
                      } else {
                        ve.a(-101, 122, 42, (pf) null, false);
                        break L1;
                      }
                    }
                    if (!param1.equals("Z")) {
                      if (param1.equals("F")) {
                        stackIn_27_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1.equals("D")) {
                          if (param1.equals("C")) {
                            stackIn_36_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            stackIn_38_0 = Class.forName(param1);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        } else {
                          stackIn_30_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_22_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_15_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("ve.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L2;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_27_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_30_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_36_0;
                      } else {
                        return stackIn_38_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, pf param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        boolean stackOut_10_0;
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
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = TrackController.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ea.b(false, 3 * (param2 + -param1));
                        var7 = -112 % ((0 - param0) / 41);
                        var6 = param1 * 3;
                        var8 = -10 + var5_int;
                        ud.a(-119);
                        if (param3.field_a <= 0) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != param3.field_x) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        nj.a((byte) 125);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ug.field_Q = 0;
                        var9 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((param3.field_E ^ -1) >= (var9 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = param3.field_O[var9];
                        var11 = param3.field_g[var9];
                        var12 = param3.field_d[var9];
                        stackOut_10_0 = param4;
                        stackIn_48_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var20 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!stackIn_11_0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var13 = qa.field_b[var10];
                        var14 = ui.field_r[var10];
                        var15 = -var13 + qa.field_b[var11];
                        var16 = -var13 + qa.field_b[var12];
                        var17 = -var14 + ui.field_r[var11];
                        var18 = ui.field_r[var12] - var14;
                        if (-(var16 * var17) + var15 * var18 >= 0) {
                            statePc = 46;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var13 = od.field_c[var10];
                        if (-2147483648 == var13) {
                            statePc = 46;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var14 = od.field_c[var11];
                        if (-2147483648 != var14) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var20 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var15 = od.field_c[var12];
                        if ((var15 ^ -1) != 2147483647) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var20 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var16 = var15 + var14 + (var13 + -var6);
                        stackIn_27_0 = -1;
                        stackIn_25_0 = stackIn_27_0;
                        stackIn_27_1 = rf.field_a.length;
                        stackIn_25_1 = stackIn_27_1;
                        if (-1 < (var8 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_28_0 = stackIn_25_0;
                        stackIn_28_1 = stackIn_25_1;
                        stackIn_28_2 = var16 >> var8;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = stackIn_27_0;
                        stackIn_28_1 = stackIn_27_1;
                        stackIn_28_2 = var16 << -var8;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var17 = stackIn_28_0 + (stackIn_28_1 + -stackIn_28_2);
                        var18 = rf.field_a[var17];
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var18 >> 204119684 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var17--;
                        stackIn_39_0 = var17 ^ -1;
                        stackIn_31_0 = stackIn_39_0;
                        stackIn_39_1 = -1;
                        stackIn_31_1 = stackIn_39_1;
                        if (var20 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 <= stackIn_31_1) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        System.err.println("Out of range!");
                        if (var20 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var18 = rf.field_a[var17];
                        if (var20 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = var17 << 1529511108;
                        stackIn_39_1 = var18;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var19 = stackIn_39_0 + stackIn_39_1;
                        gk.field_b[var19] = var9;
                        rf.field_a[var17] = 1 + var18;
                        if (-1 <= (param3.field_a ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null == param3.field_x) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        dupTemp$0 = param3.field_x[var9];
                        ok.field_F[dupTemp$0] = ok.field_F[dupTemp$0] + 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ug.field_Q = ug.field_Q + 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9++;
                        if (var20 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = -1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 <= (param3.field_a ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (param3.field_x == null) {
                            statePc = 64;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var9 = 0;
                        var10 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var10 >= ok.field_F.length) {
                            statePc = 64;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var11 = ok.field_F[var10];
                        ok.field_F[var10] = var9;
                        var9 = var9 + var11;
                        var10++;
                        if (var20 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var20 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_62_0 = (RuntimeException) (var5);
                    stackIn_60_0 = stackIn_62_0;
                    stackIn_62_1 = new StringBuilder().append("ve.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_60_1 = stackIn_62_1;
                    if (param3 == null) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_60_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackIn_63_2 = "{...}";
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackIn_63_2 = "null";
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    throw sl.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param4 + ')');
                }
                case 64: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_91_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        be var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = TrackController.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new be(param1);
                        var2.field_k = -2 + param1.length;
                        gi.field_o = var2.d((byte) -46);
                        fk.field_d = new byte[gi.field_o][];
                        ka.field_f = new int[gi.field_o];
                        j.field_f = new int[gi.field_o];
                        cf.field_p = new int[gi.field_o];
                        ga.field_b = new boolean[gi.field_o];
                        qk.field_M = new byte[gi.field_o][];
                        vb.field_a = new int[gi.field_o];
                        var2.field_k = -(gi.field_o * 8) + (param1.length + -7);
                        ab.field_a = var2.d((byte) -57);
                        qe.field_p = var2.d((byte) -119);
                        var3 = (var2.h(16383) & 255) - -1;
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4 ^ -1) <= (gi.field_o ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ka.field_f[var4] = var2.d((byte) -111);
                        var4++;
                        if (var15 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (gi.field_o <= var4) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        vb.field_a[var4] = var2.d((byte) -101);
                        var4++;
                        if (var15 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var15 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((gi.field_o ^ -1) >= (var4 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        cf.field_p[var4] = var2.d((byte) -66);
                        var4++;
                        if (var15 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var15 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((var4 ^ -1) <= (gi.field_o ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        j.field_f[var4] = var2.d((byte) -62);
                        var4++;
                        if (var15 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var15 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var2.field_k = param1.length - 7 + -(gi.field_o * 8) - -3 - var3 * 3;
                        qe.field_z = new int[var3];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4 = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var3 ^ -1) >= (var4 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        qe.field_z[var4] = var2.e(8);
                        stackIn_42_0 = qe.field_z[var4] ^ -1;
                        stackIn_35_0 = stackIn_42_0;
                        stackIn_42_1 = -1;
                        stackIn_35_1 = stackIn_42_1;
                        if (var15 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 != stackIn_35_1) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        qe.field_z[var4] = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4++;
                        if (var15 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = param0;
                        stackIn_42_1 = -28;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == stackIn_42_1) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ve.a((byte) -62, (byte[]) null);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var2.field_k = 0;
                        var4 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = var4;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 >= gi.field_o) {
                            statePc = 104;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var5 = cf.field_p[var4];
                        var6 = j.field_f[var4];
                        var7 = var6 * var5;
                        var8 = new byte[var7];
                        qk.field_M[var4] = var8;
                        var9 = new byte[var7];
                        fk.field_d[var4] = var9;
                        var10 = 0;
                        var11 = var2.h(16383);
                        if (var15 != 0) {
                            statePc = 104;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_51_0 = 0;
                        stackIn_51_1 = var11;
                        stackIn_51_2 = 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 != (stackIn_51_1 & stackIn_51_2)) {
                            statePc = 68;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var12 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var12 >= var7) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8[var12] = var2.f(-126);
                        var12++;
                        if (var15 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var15 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var11 & 2) == 0) {
                            statePc = 96;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var12 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var12 ^ -1) <= (var7 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        dupTemp$0 = var2.f(param0 + -99);
                        var9[var12] = dupTemp$0;
                        var13 = dupTemp$0;
                        stackIn_51_0 = var10;
                        stackIn_62_0 = stackIn_51_0;
                        stackIn_51_1 = 0;
                        stackIn_62_1 = stackIn_51_1;
                        stackIn_51_2 = var13 ^ -1;
                        stackIn_62_2 = stackIn_51_2;
                        if (var15 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_65_0 = stackIn_62_0;
                        stackIn_63_0 = stackIn_65_0;
                        if (stackIn_62_1 == stackIn_62_2) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_66_0 = stackIn_63_0;
                        stackIn_66_1 = 1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = stackIn_65_0;
                        stackIn_66_1 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var10 = stackIn_66_0 | stackIn_66_1;
                        var12++;
                        if (var15 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var15 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var12 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((var12 ^ -1) <= (var5 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_80_0 = 0;
                        stackIn_71_0 = stackIn_80_0;
                        if (var15 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var13 = stackIn_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var6 <= var13) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var8[var12 - -(var13 * var5)] = var2.f(-125);
                        var13++;
                        if (var15 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var15 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var12++;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var15 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_80_0 = -1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (stackIn_80_0 != (2 & var11 ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var12 = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackIn_85_0 = var5 ^ -1;
                        stackIn_85_1 = var12;
                        stackIn_85_2 = -1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (stackIn_85_0 >= (stackIn_85_1 ^ stackIn_85_2)) {
                            statePc = 96;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_47_0 = 0;
                        stackIn_87_0 = stackIn_47_0;
                        if (var15 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var13 = stackIn_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if ((var13 ^ -1) <= (var6 ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        dupTemp$1 = var2.f(-125);
                        var9[var13 * var5 + var12] = dupTemp$1;
                        var14 = dupTemp$1;
                        stackIn_85_0 = var10;
                        stackIn_90_0 = stackIn_85_0;
                        stackIn_85_1 = -1;
                        stackIn_90_1 = stackIn_85_1;
                        stackIn_85_2 = var14;
                        stackIn_90_2 = stackIn_85_2;
                        if (var15 != 0) {
                            statePc = 85;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackIn_93_0 = stackIn_90_0;
                        stackIn_91_0 = stackIn_93_0;
                        if (stackIn_90_1 == stackIn_90_2) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackIn_94_0 = stackIn_91_0;
                        stackIn_94_1 = 1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_94_0 = stackIn_93_0;
                        stackIn_94_1 = 0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var10 = stackIn_94_0 | stackIn_94_1;
                        var13++;
                        if (var15 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var12++;
                        if (var15 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        ga.field_b[var4] = var10 != 0;
                        var4++;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var15 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 99: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_102_0 = (RuntimeException) (var2_ref);
                    stackIn_100_0 = stackIn_102_0;
                    stackIn_102_1 = new StringBuilder().append("ve.A(").append(param0).append(',');
                    stackIn_100_1 = stackIn_102_1;
                    if (param1 == null) {
                        statePc = 102;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackIn_103_0 = (RuntimeException) ((Object) stackIn_100_0);
                    stackIn_103_1 = (StringBuilder) ((Object) stackIn_100_1);
                    stackIn_103_2 = "{...}";
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
                    stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
                    stackIn_103_2 = "null";
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    throw sl.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ')');
                }
                case 104: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ve() {
        super(0L, (ug) null);
    }

    static {
    }
}
