/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class re {
    static int field_a;
    static int field_f;
    static boolean field_b;
    static String field_d;
    static boolean field_c;
    static String[] field_e;

    public static void a(int param0) {
        if (param0 != -17053) {
            return;
        }
        field_d = null;
        field_e = null;
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            String stackIn_8_0 = null;
            String stackOut_7_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = (String) mo.a((byte) 126, "getcookies", param2);
                            var4 = jc.a(param0 ^ -9075, var3, ';');
                            if (param0 == -21721) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            re.a(38);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var4.length > var5) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            return null;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = var4[var5].substring(var6 + 1).trim();
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var3_ref = caughtException;
                        return null;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1) {
        if (!(null == sm.field_C)) {
            sm.field_C.a((byte) -79, param1);
        }
        if (param0 >= -81) {
            Object var3 = null;
            re.a(false, (String) null, -73);
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        ij var5 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_38_5 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        int stackOut_37_5 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_36_5 = 0;
        L0: {
          if (param0 == 121) {
            break L0;
          } else {
            var4 = null;
            re.a(true, (String) null, 27);
            break L0;
          }
        }
        L1: {
          if (nd.field_i.c(0)) {
            break L1;
          } else {
            if ((kg.field_m ^ -1) > -1) {
              break L1;
            } else {
              L2: {
                var5 = (ij) (Object) nd.field_i.c((byte) 108);
                if (var5.field_E == 0) {
                  if ((var5.field_w ^ -1) != -257) {
                    var5.field_K.a(-(var5.field_K.field_z / 2) + var5.field_J, var5.field_C - var5.field_K.field_A / 2, var5.field_w);
                    break L2;
                  } else {
                    var5.field_K.c(var5.field_J - var5.field_K.field_z / 2, -(var5.field_K.field_A / 2) + var5.field_C);
                    break L2;
                  }
                } else {
                  var2 = var5.field_E * var5.field_K.field_z >> -724862708;
                  var3 = var5.field_E * var5.field_K.field_A >> -968552820;
                  var5.field_K.b(var5.field_J + -(var2 >> 1460186721), -(var3 >> -1199511967) + var5.field_C, var2, var3, var5.field_w);
                  break L2;
                }
              }
              if (-1L != (pd.field_i ^ -1L)) {
                var2 = 0;
                L3: while (true) {
                  L4: {
                    if (10 <= var2) {
                      break L4;
                    } else {
                      if (var2 >= ok.field_pb.length) {
                        break L4;
                      } else {
                        L5: {
                          stackOut_14_0 = 160 - -(32 * var2);
                          stackOut_14_1 = 60;
                          stackOut_14_2 = 30;
                          stackOut_14_3 = 9;
                          stackOut_14_4 = 4;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          stackIn_16_3 = stackOut_14_3;
                          stackIn_16_4 = stackOut_14_4;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          stackIn_15_2 = stackOut_14_2;
                          stackIn_15_3 = stackOut_14_3;
                          stackIn_15_4 = stackOut_14_4;
                          if (0L != ((long)(1 << var2) & pd.field_i)) {
                            stackOut_16_0 = stackIn_16_0;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = stackIn_16_2;
                            stackOut_16_3 = stackIn_16_3;
                            stackOut_16_4 = stackIn_16_4;
                            stackOut_16_5 = 3407667;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            stackIn_17_2 = stackOut_16_2;
                            stackIn_17_3 = stackOut_16_3;
                            stackIn_17_4 = stackOut_16_4;
                            stackIn_17_5 = stackOut_16_5;
                            break L5;
                          } else {
                            stackOut_15_0 = stackIn_15_0;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = stackIn_15_2;
                            stackOut_15_3 = stackIn_15_3;
                            stackOut_15_4 = stackIn_15_4;
                            stackOut_15_5 = 3355443;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_17_2 = stackOut_15_2;
                            stackIn_17_3 = stackOut_15_3;
                            stackIn_17_4 = stackOut_15_4;
                            stackIn_17_5 = stackOut_15_5;
                            break L5;
                          }
                        }
                        qh.a(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_17_5, var5.field_w / 2 + 128);
                        var2++;
                        continue L3;
                      }
                    }
                  }
                  var2 = 10;
                  L6: while (true) {
                    L7: {
                      if (-21 >= (var2 ^ -1)) {
                        break L7;
                      } else {
                        if (var2 >= ok.field_pb.length) {
                          break L7;
                        } else {
                          L8: {
                            stackOut_21_0 = -320 + 32 * var2 + 160;
                            stackOut_21_1 = 70;
                            stackOut_21_2 = 30;
                            stackOut_21_3 = 9;
                            stackOut_21_4 = 4;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            stackIn_23_2 = stackOut_21_2;
                            stackIn_23_3 = stackOut_21_3;
                            stackIn_23_4 = stackOut_21_4;
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            stackIn_22_2 = stackOut_21_2;
                            stackIn_22_3 = stackOut_21_3;
                            stackIn_22_4 = stackOut_21_4;
                            if ((pd.field_i & (long)(1 << var2)) == 0L) {
                              stackOut_23_0 = stackIn_23_0;
                              stackOut_23_1 = stackIn_23_1;
                              stackOut_23_2 = stackIn_23_2;
                              stackOut_23_3 = stackIn_23_3;
                              stackOut_23_4 = stackIn_23_4;
                              stackOut_23_5 = 3355443;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              stackIn_24_2 = stackOut_23_2;
                              stackIn_24_3 = stackOut_23_3;
                              stackIn_24_4 = stackOut_23_4;
                              stackIn_24_5 = stackOut_23_5;
                              break L8;
                            } else {
                              stackOut_22_0 = stackIn_22_0;
                              stackOut_22_1 = stackIn_22_1;
                              stackOut_22_2 = stackIn_22_2;
                              stackOut_22_3 = stackIn_22_3;
                              stackOut_22_4 = stackIn_22_4;
                              stackOut_22_5 = 3407667;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_24_1 = stackOut_22_1;
                              stackIn_24_2 = stackOut_22_2;
                              stackIn_24_3 = stackOut_22_3;
                              stackIn_24_4 = stackOut_22_4;
                              stackIn_24_5 = stackOut_22_5;
                              break L8;
                            }
                          }
                          qh.a(stackIn_24_0, stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, var5.field_w / 2 + 128);
                          var2++;
                          continue L6;
                        }
                      }
                    }
                    var2 = 20;
                    L9: while (true) {
                      L10: {
                        if (var2 >= 30) {
                          break L10;
                        } else {
                          if (var2 >= ok.field_pb.length) {
                            break L10;
                          } else {
                            L11: {
                              stackOut_28_0 = 32 * var2 + -640 + 160;
                              stackOut_28_1 = 80;
                              stackOut_28_2 = 30;
                              stackOut_28_3 = 9;
                              stackOut_28_4 = 4;
                              stackIn_30_0 = stackOut_28_0;
                              stackIn_30_1 = stackOut_28_1;
                              stackIn_30_2 = stackOut_28_2;
                              stackIn_30_3 = stackOut_28_3;
                              stackIn_30_4 = stackOut_28_4;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              stackIn_29_2 = stackOut_28_2;
                              stackIn_29_3 = stackOut_28_3;
                              stackIn_29_4 = stackOut_28_4;
                              if (((long)(1 << var2) & pd.field_i) != 0L) {
                                stackOut_30_0 = stackIn_30_0;
                                stackOut_30_1 = stackIn_30_1;
                                stackOut_30_2 = stackIn_30_2;
                                stackOut_30_3 = stackIn_30_3;
                                stackOut_30_4 = stackIn_30_4;
                                stackOut_30_5 = 3407667;
                                stackIn_31_0 = stackOut_30_0;
                                stackIn_31_1 = stackOut_30_1;
                                stackIn_31_2 = stackOut_30_2;
                                stackIn_31_3 = stackOut_30_3;
                                stackIn_31_4 = stackOut_30_4;
                                stackIn_31_5 = stackOut_30_5;
                                break L11;
                              } else {
                                stackOut_29_0 = stackIn_29_0;
                                stackOut_29_1 = stackIn_29_1;
                                stackOut_29_2 = stackIn_29_2;
                                stackOut_29_3 = stackIn_29_3;
                                stackOut_29_4 = stackIn_29_4;
                                stackOut_29_5 = 3355443;
                                stackIn_31_0 = stackOut_29_0;
                                stackIn_31_1 = stackOut_29_1;
                                stackIn_31_2 = stackOut_29_2;
                                stackIn_31_3 = stackOut_29_3;
                                stackIn_31_4 = stackOut_29_4;
                                stackIn_31_5 = stackOut_29_5;
                                break L11;
                              }
                            }
                            qh.a(stackIn_31_0, stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_31_4, stackIn_31_5, var5.field_w / 2 + 128);
                            var2++;
                            continue L9;
                          }
                        }
                      }
                      var2 = 30;
                      L12: while (true) {
                        if (var2 >= 40) {
                          break L1;
                        } else {
                          if (ok.field_pb.length <= var2) {
                            break L1;
                          } else {
                            L13: {
                              stackOut_35_0 = (-30 + var2) * 32 + 160;
                              stackOut_35_1 = 90;
                              stackOut_35_2 = 30;
                              stackOut_35_3 = 9;
                              stackOut_35_4 = 4;
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_37_1 = stackOut_35_1;
                              stackIn_37_2 = stackOut_35_2;
                              stackIn_37_3 = stackOut_35_3;
                              stackIn_37_4 = stackOut_35_4;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              stackIn_36_2 = stackOut_35_2;
                              stackIn_36_3 = stackOut_35_3;
                              stackIn_36_4 = stackOut_35_4;
                              if ((pd.field_i & (long)(1 << var2)) == 0L) {
                                stackOut_37_0 = stackIn_37_0;
                                stackOut_37_1 = stackIn_37_1;
                                stackOut_37_2 = stackIn_37_2;
                                stackOut_37_3 = stackIn_37_3;
                                stackOut_37_4 = stackIn_37_4;
                                stackOut_37_5 = 3355443;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                stackIn_38_2 = stackOut_37_2;
                                stackIn_38_3 = stackOut_37_3;
                                stackIn_38_4 = stackOut_37_4;
                                stackIn_38_5 = stackOut_37_5;
                                break L13;
                              } else {
                                stackOut_36_0 = stackIn_36_0;
                                stackOut_36_1 = stackIn_36_1;
                                stackOut_36_2 = stackIn_36_2;
                                stackOut_36_3 = stackIn_36_3;
                                stackOut_36_4 = stackIn_36_4;
                                stackOut_36_5 = 3407667;
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_38_1 = stackOut_36_1;
                                stackIn_38_2 = stackOut_36_2;
                                stackIn_38_3 = stackOut_36_3;
                                stackIn_38_4 = stackOut_36_4;
                                stackIn_38_5 = stackOut_36_5;
                                break L13;
                              }
                            }
                            qh.a(stackIn_38_0, stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4, stackIn_38_5, var5.field_w / 2 + 128);
                            var2++;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
          }
        }
    }

    abstract tf b(byte param0);

    abstract void a(byte param0, ge param1);

    final static void a(boolean param0, String param1, int param2) {
        int var3 = 0;
        if (!param0) {
            return;
        }
        wo.field_c = false;
        ep.field_z = false;
        if (null != d.field_d) {
            if (d.field_d.field_R) {
                if (8 == param2) {
                    if (!ro.field_e) {
                        param1 = eh.field_n;
                    } else {
                        param1 = ng.field_v;
                    }
                    param2 = 2;
                    vj.field_j.a(8, qo.field_x);
                }
                var3 = 1;
                if (!(param2 != 10)) {
                    ta.a(-984040272);
                    var3 = 0;
                }
                if (!(var3 == 0)) {
                    if (wo.field_c) {
                        param1 = nr.a(new String[1], -1, lq.field_U);
                    }
                    if (!(!to.field_q)) {
                        param1 = ir.field_i;
                    }
                    d.field_d.a(param1, param2, -257);
                }
                if ((param2 ^ -1) != -257) {
                    if ((param2 ^ -1) != -11) {
                        if (!(ro.field_e)) {
                            vj.field_j.g((byte) -108);
                        }
                    }
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 576;
        field_b = false;
        field_c = false;
    }
}
