/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static dq field_c;
    static wk[] field_a;
    static String field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a() {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) lf.field_q;
        synchronized (var1) {
          L0: {
            ro.field_ub = ob.field_J;
            av.field_a = av.field_a + 1;
            sm.field_d = nh.field_B;
            ko.field_b = kl.field_i;
            lk.field_f = ku.field_I;
            var2 = -48;
            ku.field_I = false;
            tr.field_A = jm.field_k;
            iu.field_t = mq.field_Xb;
            ur.field_z = ei.field_d;
            jm.field_k = 0;
            eq.field_l = tb.field_g;
            break L0;
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
        RuntimeException var8 = null;
        ru var8_ref = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ru var13 = null;
        int var14 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ac.field_k) {
                break L1;
              } else {
                if (0 > param5) {
                  break L1;
                } else {
                  if (ac.field_k.length <= param5) {
                    break L1;
                  } else {
                    if (ac.field_k[param5] == null) {
                      break L1;
                    } else {
                      L2: {
                        if (!param6) {
                          break L2;
                        } else {
                          if (ac.field_k.length >= 1) {
                            var8_ref = ac.field_k[0];
                            if (var8_ref != null) {
                              if (param4) {
                                var8_ref.d(db.a(true, param0), u.a(param1, (byte) 94));
                                break L2;
                              } else {
                                var8_ref.a(db.a(true, param0), u.a(param1, (byte) 94));
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (0 != param7) {
                        L3: {
                          if (param7 == 7) {
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            break L3;
                          } else {
                            stackOut_18_0 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            break L3;
                          }
                        }
                        L4: {
                          if (stackIn_20_0 != 0 ^ param6) {
                            L5: {
                              if (param7 != 9) {
                                break L5;
                              } else {
                                param7 = 2;
                                break L5;
                              }
                            }
                            var8_int = 0;
                            L6: while (true) {
                              if (var8_int >= 4) {
                                break L4;
                              } else {
                                L7: {
                                  if (param7 != va.field_G[6]) {
                                    break L7;
                                  } else {
                                    param2 = param7;
                                    break L7;
                                  }
                                }
                                L8: {
                                  var9 = param2;
                                  var10 = param2;
                                  var11 = param2;
                                  if (param2 == param7) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (param7 == va.field_G[1]) {
                                        break L9;
                                      } else {
                                        if (va.field_G[4] != param7) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var9 = param7;
                                    break L8;
                                  }
                                }
                                L10: {
                                  var12 = var8_int + (param7 * 20 + ls.a(var11, param7, var10, var9, -23));
                                  if (var12 < 0) {
                                    break L10;
                                  } else {
                                    if (var12 < ac.field_k.length) {
                                      L11: {
                                        var13 = ac.field_k[var12];
                                        if (var13 != null) {
                                          if (!param4) {
                                            var13.a(db.a(true, param0), u.a(param1, (byte) 94));
                                            break L11;
                                          } else {
                                            var13.d(db.a(true, param0), u.a(param1, (byte) 94));
                                            break L11;
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                      var8_int++;
                                      continue L6;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var8, "ds.B(" + param0 + ',' + param1 + ',' + param2 + ',' + 27066 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading sound effects";
    }
}
