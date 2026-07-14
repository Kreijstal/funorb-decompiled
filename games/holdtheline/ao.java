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

    final static boolean a(java.applet.Applet param0, boolean param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_8_0 = 0;
            int stackIn_17_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = HoldTheLine.field_D;
                        if (kd.field_d) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) eo.a(21896, "getcookies", param0);
                            var4 = fl.a(var3, (byte) -125, ';');
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 10;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
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
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (!param1) {
                                statePc = 14;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ao.a(-7);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (null == param0.getParameter("tuhstatbut")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
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

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_c = null;
        if (param0 != 0) {
            field_d = null;
        }
        field_d = null;
    }

    final static ei a(ei param0, byte param1, boolean param2, ei param3) {
        int var4 = 0;
        ei var5 = null;
        ei var6 = null;
        ei var7 = null;
        ei var8 = null;
        int var11 = 0;
        Object var12 = null;
        ei var13 = null;
        ei var14 = null;
        ha var15 = null;
        ei var16 = null;
        Object var17 = null;
        ha var17_ref = null;
        ei var18 = null;
        var17 = null;
        var11 = HoldTheLine.field_D;
        var5 = new ei();
        var6 = new ei();
        var7 = new ei();
        ul.a(param3, true, var7, 0, param3, var6);
        ul.a(param3, true, var7, 1, param0, var6);
        ul.a(param0, true, var7, 2, param0, var6);
        var6.a(false);
        var7.a(false);
        var4 = 0;
        L0: while (true) {
          if (var6.field_e <= var4) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.field_e) {
                L2: {
                  var13 = new ei();
                  kj.field_r = false;
                  var8 = bb.a(0, param0, 0.0f, param3, true, (byte) -59, var7, var6);
                  if (-2 < (var8.field_e ^ -1)) {
                    break L2;
                  } else {
                    if (!qh.a((byte) -63, var8)) {
                      break L2;
                    } else {
                      var13.a((Object) (Object) var8, (byte) 6);
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!kj.field_r) {
                    var14 = bb.a(var6.field_e + -1, param0, (float)param3.field_e, param3, false, (byte) -46, var7, var6);
                    if (1 > var14.field_e) {
                      break L3;
                    } else {
                      if (!qh.a((byte) -63, var8)) {
                        break L3;
                      } else {
                        var13.a((Object) (Object) var14, (byte) 6);
                        break L3;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var4 = -1 + var6.field_e;
                L4: while (true) {
                  if (var4 < 0) {
                    L5: {
                      var4 = 0;
                      if (param1 == 21) {
                        break L5;
                      } else {
                        var12 = null;
                        wd discarded$1 = ao.a(0.2928012013435364f, false, (wd) null, -0.7333778142929077f);
                        break L5;
                      }
                    }
                    L6: while (true) {
                      if (var4 >= var7.field_e + -1) {
                        var4 = 0;
                        L7: while (true) {
                          if (var13.field_e <= var4) {
                            return var13;
                          } else {
                            var13.field_b[var4] = (Object) (Object) mk.a((ei) var13.field_b[var4], (byte) -127);
                            if (((ei) var13.field_b[var4]).field_e != 0) {
                              var4++;
                              continue L7;
                            } else {
                              var13.a(true, var4);
                              continue L7;
                            }
                          }
                        }
                      } else {
                        var17_ref = (ha) var7.field_b[var4];
                        if (!var17_ref.field_l) {
                          var17_ref.field_l = true;
                          var17_ref.field_s.field_l = true;
                          var18 = bb.a((var4 + 1) % var7.field_e, param0, var17_ref.field_m, param3, true, (byte) -94, var7, var6);
                          if (1 <= var18.field_e) {
                            if (qh.a((byte) -63, var18)) {
                              var13.a((Object) (Object) var18, (byte) 6);
                              var4++;
                              continue L6;
                            } else {
                              var4++;
                              continue L6;
                            }
                          } else {
                            var4++;
                            continue L6;
                          }
                        } else {
                          var4++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var15 = (ha) var6.field_b[var4];
                    if (!var15.field_l) {
                      var15.field_l = true;
                      var15.field_s.field_l = true;
                      var16 = bb.a((-1 + (var4 - -var6.field_e)) % var6.field_e, param0, var15.field_m, param3, false, (byte) -81, var7, var6);
                      if (var16.field_e >= 1) {
                        if (qh.a((byte) -63, var16)) {
                          var13.a((Object) (Object) var16, (byte) 6);
                          var4--;
                          continue L4;
                        } else {
                          var4--;
                          continue L4;
                        }
                      } else {
                        var4--;
                        continue L4;
                      }
                    } else {
                      var4--;
                      continue L4;
                    }
                  }
                }
              } else {
                ((ha) var7.field_b[var4]).field_q = var4;
                var4++;
                continue L1;
              }
            }
          } else {
            ((ha) var6.field_b[var4]).field_q = var4;
            var4++;
            continue L0;
          }
        }
    }

    final static wd a(float param0, boolean param1, wd param2, float param3) {
        if (!param1) {
            Object var5 = null;
            wd discarded$0 = ao.a(1.1313912868499756f, true, (wd) null, -1.3016173839569092f);
        }
        return wc.a(param2, param0, param3, (byte) -115);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = fc.a(-6, 5, 4);
        field_e = "Names should contain a maximum of 12 characters";
    }
}
