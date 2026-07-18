/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static int[] field_d;
    static int field_a;
    static ud field_c;
    static fg field_f;
    static String field_e;
    static int field_b;

    final static boolean a(java.applet.Applet param0) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = HoldTheLine.field_D;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (kd.field_d) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 1;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) eo.a(21896, "getcookies", param0);
                            var4 = fl.a(var3, (byte) -125, ';');
                            var5 = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 12;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 11;
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
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var2_ref2 = caughtException;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (null == param0.getParameter("tuhstatbut")) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_20_0 = (RuntimeException) var2_ref;
                        stackOut_20_1 = new StringBuilder().append("ao.D(");
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param0 == null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "null";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + false + ')');
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

    public static void a() {
        field_e = null;
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static ei a(ei param0, byte param1, boolean param2, ei param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ei var5 = null;
        ei var6 = null;
        ei var7 = null;
        ei var8 = null;
        int var11 = 0;
        ei var13 = null;
        ei var14 = null;
        ha var15 = null;
        Object var17 = null;
        ha var17_ref = null;
        ei var18 = null;
        ei stackIn_35_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        ei stackOut_34_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var17 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            var5 = new ei();
            var6 = new ei();
            var7 = new ei();
            ul.a(param3, true, var7, 0, param3, var6);
            ul.a(param3, true, var7, 1, param0, var6);
            ul.a(param0, true, var7, 2, param0, var6);
            var6.a(false);
            var7.a(false);
            var4_int = 0;
            L1: while (true) {
              if (var6.field_e <= var4_int) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= var7.field_e) {
                    L3: {
                      var13 = new ei();
                      kj.field_r = false;
                      var8 = bb.a(0, param0, 0.0f, param3, true, (byte) -59, var7, var6);
                      if (var8.field_e < 1) {
                        break L3;
                      } else {
                        if (!qh.a((byte) -63, var8)) {
                          break L3;
                        } else {
                          var13.a((Object) (Object) var8, (byte) 6);
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (!kj.field_r) {
                        var14 = bb.a(var6.field_e + -1, param0, (float)param3.field_e, param3, false, (byte) -46, var7, var6);
                        if (1 > var14.field_e) {
                          break L4;
                        } else {
                          if (!qh.a((byte) -63, var8)) {
                            break L4;
                          } else {
                            var13.a((Object) (Object) var14, (byte) 6);
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var4_int = -1 + var6.field_e;
                    L5: while (true) {
                      if (var4_int < 0) {
                        var4_int = 0;
                        L6: while (true) {
                          if (var4_int >= var7.field_e + -1) {
                            var4_int = 0;
                            L7: while (true) {
                              if (var13.field_e <= var4_int) {
                                stackOut_34_0 = (ei) var13;
                                stackIn_35_0 = stackOut_34_0;
                                break L0;
                              } else {
                                var13.field_b[var4_int] = (Object) (Object) mk.a((ei) var13.field_b[var4_int], (byte) -127);
                                if (((ei) var13.field_b[var4_int]).field_e != 0) {
                                  var4_int++;
                                  continue L7;
                                } else {
                                  var13.a(true, var4_int);
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            L8: {
                              var17_ref = (ha) var7.field_b[var4_int];
                              if (!var17_ref.field_l) {
                                var17_ref.field_l = true;
                                var17_ref.field_s.field_l = true;
                                var18 = bb.a((var4_int + 1) % var7.field_e, param0, var17_ref.field_m, param3, true, (byte) -94, var7, var6);
                                if (1 > var18.field_e) {
                                  break L8;
                                } else {
                                  if (!qh.a((byte) -63, var18)) {
                                    break L8;
                                  } else {
                                    var13.a((Object) (Object) var18, (byte) 6);
                                    break L8;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                            var4_int++;
                            continue L6;
                          }
                        }
                      } else {
                        L9: {
                          var15 = (ha) var6.field_b[var4_int];
                          if (var15.field_l) {
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var4_int--;
                        continue L5;
                      }
                    }
                  } else {
                    ((ha) var7.field_b[var4_int]).field_q = var4_int;
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                ((ha) var6.field_b[var4_int]).field_q = var4_int;
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var4;
            stackOut_36_1 = new StringBuilder().append("ao.C(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L10;
            }
          }
          L11: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(21).append(',').append(false).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param3 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L11;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
        return stackIn_35_0;
    }

    final static wd a(float param0, boolean param1, wd param2, float param3) {
        RuntimeException var4 = null;
        wd stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = -115;
            stackOut_0_0 = wc.a(param2, param0, param3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("ao.A(").append(param0).append(',').append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = fc.a(-6, 5, 4);
        field_e = "Names should contain a maximum of 12 characters";
    }
}
