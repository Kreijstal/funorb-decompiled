/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static um field_a;

    final static void a(boolean param0, int param1, int param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        if (param1 == 0) {
          if (null != vh.field_h) {
            var3 = vh.field_h.a((byte) -63, param0);
            if (var3 != 0) {
              if ((var3 ^ -1) == -3) {
                if (null != vh.field_h.field_Y) {
                  if (!vh.field_h.field_Y.equals("")) {
                    L0: {
                      L1: {
                        if (vh.field_h.field_Y.charAt(0) != 91) {
                          break L1;
                        } else {
                          var4 = vh.field_h.field_Y;
                          if (!client.field_A) {
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      var7 = (CharSequence) ((Object) vh.field_h.field_Y);
                      var4 = kf.a(var7, (byte) 2);
                      var5 = var4;
                      var5 = var4;
                      break L0;
                    }
                    L2: {
                      var5 = null;
                      if (-1 == (of.field_d ^ -1)) {
                        var5 = rb.a(param2, param1 + 0, var4);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (of.field_d != 1) {
                        break L3;
                      } else {
                        var5 = md.a(param2, var4, false);
                        break L3;
                      }
                    }
                    L4: {
                      if (-3 == (of.field_d ^ -1)) {
                        var5 = dd.b(var4, 127, param2);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if ((of.field_d ^ -1) != -4) {
                        break L5;
                      } else {
                        var5 = sg.a(var4, var4, param2, (byte) 125);
                        break L5;
                      }
                    }
                    if (var5 != null) {
                      var6 = (String) null;
                      ca.a(var4, (String) null, (String) (var5), (byte) -37, 2, 0);
                      vh.field_h = null;
                      of.field_d = -1;
                      return;
                    } else {
                      vh.field_h = null;
                      of.field_d = -1;
                      return;
                    }
                  } else {
                    vh.field_h = null;
                    of.field_d = -1;
                    return;
                  }
                } else {
                  vh.field_h = null;
                  of.field_d = -1;
                  return;
                }
              } else {
                vh.field_h = null;
                of.field_d = -1;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (-1 < (param0 ^ -1)) {
          L0: {
            if (0 != (1 + param0) % 4) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          return stackIn_5_0 != 0;
        } else {
          if (param0 < 1582) {
            L1: {
              if (param0 % 4 != 0) {
                stackIn_11_0 = 0;
                break L1;
              } else {
                stackIn_11_0 = 1;
                break L1;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            if (param0 % 4 == 0) {
              if (param0 % 100 == 0) {
                if (0 == param0 % 400) {
                  if (param1 > -12) {
                    field_a = (um) null;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static ig a(w param0, w param1, ac param2, w param3, int param4) {
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        ig stackIn_12_0 = null;
        ig stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ig[] var11 = null;
        int var12 = 0;
        ac var13_ref_ac = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        me var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 33;
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
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (ig) ((Object) stackIn_3_0);
                }
                case 4: {
                    try {
                        if (param2.field_C == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = param2.field_C.length;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5_int = stackIn_7_0;
                        if (null != param2.field_E) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_10_0 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = param2.field_E.length;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = stackIn_10_0;
                        var7 = var5_int + var6;
                        var8 = new String[var7];
                        if (param4 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = (ig) null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var21 = new char[var7];
                        var19 = var21;
                        var9 = var19;
                        var20 = new int[var7];
                        var18 = var20;
                        var10 = var18;
                        var11 = new ig[var7];
                        if (null != param2.field_C) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param2.field_C.length <= var12) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var13_ref_ac = oi.field_a.a(-126, param2.field_C[var12]);
                        var8[var12] = var13_ref_ac.field_H;
                        var9[var12] = param2.field_G[var12];
                        var11[var12] = ll.a(param0, param1, var13_ref_ac, param3, 0);
                        var12++;
                        if (var17 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var17 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param2.field_E != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12 = var5_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var13 = 49;
                        var14 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param2.field_E.length <= var14) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var15 = param2.field_E[var14];
                        if (-1 == var15) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var16 = wj.field_Qb.a(126, var15);
                        var8[var14 + var12] = var16.f((byte) -81);
                        var9[var12 + var14] = param2.field_y[var14];
                        if (var9[var12 - -var14] > 0) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var13 = (char)(var13 + 1);
                        var9[var14 + var12] = (char)var13;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var10[var12 - -var14] = param2.field_E[var14];
                        if (var17 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8[var14 + var12] = gk.field_Gb;
                        var9[var12 + var14] = param2.field_y[var14];
                        var10[var12 + var14] = param2.field_E[var14];
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var14++;
                        if (var17 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = new ig(0L, param0, param3, param1, var11, var20, var8, var21);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return stackIn_32_0;
                }
                case 33: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_35_0 = (RuntimeException) (var5);
                    stackIn_34_0 = stackIn_35_0;
                    stackIn_35_1 = new StringBuilder().append("ll.A(");
                    stackIn_34_1 = stackIn_35_1;
                    if (param0 == null) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_36_2 = "{...}";
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_36_2 = "null";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
                    stackIn_37_1 = stackIn_38_1;
                    if (param1 == null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_39_2 = "{...}";
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_39_2 = "null";
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_40_0 = stackIn_41_0;
                    stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
                    stackIn_40_1 = stackIn_41_1;
                    if (param2 == null) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_42_2 = "{...}";
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackIn_42_2 = "null";
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_43_0 = stackIn_44_0;
                    stackIn_44_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
                    stackIn_43_1 = stackIn_44_1;
                    if (param3 == null) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_45_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_45_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_45_2 = "{...}";
                    statePc = 45;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                    stackIn_45_2 = "null";
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    throw dh.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param4 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 29) {
            field_a = (um) null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
            return;
        }
        f.a(2, param1);
        fc.a(param0 + 6, param1);
    }

    static {
        field_a = new um();
    }
}
