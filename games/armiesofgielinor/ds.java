/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static dq field_c;
    static wk[] field_a;
    static String field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 2) {
            field_c = null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) lf.field_q;
                    // monitorenter lf.field_q
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ro.field_ub = ob.field_J;
                        av.field_a = av.field_a + 1;
                        sm.field_d = nh.field_B;
                        ko.field_b = kl.field_i;
                        lk.field_f = ku.field_I;
                        var2 = 48 / ((36 - param0) / 56);
                        ku.field_I = false;
                        tr.field_A = jm.field_k;
                        iu.field_t = mq.field_Xb;
                        ur.field_z = ei.field_d;
                        jm.field_k = 0;
                        eq.field_l = tb.field_g;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1) {
        try {
            try {
                Object discarded$0 = lj.a(ag.d((byte) -117), "resizing", new Object[1], 90);
            } catch (Throwable throwable) {
            }
            int var2 = 87 % ((param1 - 39) / 40);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, int param7) {
        ru var8_ref_ru = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ru var13 = null;
        int var14 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (null == ac.field_k) {
            break L0;
          } else {
            if (0 > param5) {
              break L0;
            } else {
              if (ac.field_k.length <= param5) {
                break L0;
              } else {
                if (ac.field_k[param5] == null) {
                  break L0;
                } else {
                  L1: {
                    if (!param6) {
                      break L1;
                    } else {
                      if (ac.field_k.length >= 1) {
                        var8_ref_ru = ac.field_k[0];
                        if (var8_ref_ru != null) {
                          if (param4) {
                            var8_ref_ru.d(db.a(true, param0), u.a(param1, (byte) 94));
                            break L1;
                          } else {
                            var8_ref_ru.a(db.a(true, param0), u.a(param1, (byte) 94));
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (0 != param7) {
                    L2: {
                      if (-8 == (param7 ^ -1)) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L2;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L2;
                      }
                    }
                    L3: {
                      if (stackIn_19_0 != 0 ^ param6) {
                        L4: {
                          if ((param7 ^ -1) != -10) {
                            break L4;
                          } else {
                            param7 = 2;
                            break L4;
                          }
                        }
                        var8 = 0;
                        L5: while (true) {
                          if ((var8 ^ -1) <= -5) {
                            break L3;
                          } else {
                            L6: {
                              if (param7 != va.field_G[6]) {
                                break L6;
                              } else {
                                param2 = param7;
                                break L6;
                              }
                            }
                            L7: {
                              var9 = param2;
                              var10 = param2;
                              var11 = param2;
                              if (param2 == param7) {
                                break L7;
                              } else {
                                L8: {
                                  if (param7 == va.field_G[1]) {
                                    break L8;
                                  } else {
                                    if (va.field_G[4] != param7) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var9 = param7;
                                break L7;
                              }
                            }
                            L9: {
                              var12 = var8 + (param7 * 20 + ls.a(var11, param7, var10, var9, param3 + -27089));
                              if ((var12 ^ -1) > -1) {
                                break L9;
                              } else {
                                if (var12 < ac.field_k.length) {
                                  var13 = ac.field_k[var12];
                                  if (var13 != null) {
                                    if (!param4) {
                                      var13.a(db.a(true, param0), u.a(param1, (byte) 94));
                                      var8++;
                                      continue L5;
                                    } else {
                                      var13.d(db.a(true, param0), u.a(param1, (byte) 94));
                                      var8++;
                                      continue L5;
                                    }
                                  } else {
                                    var8++;
                                    continue L5;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    if (param3 == 27066) {
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
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
        field_b = "Loading sound effects";
    }
}
