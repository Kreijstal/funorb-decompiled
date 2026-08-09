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
            field_c = (dq) null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = lf.field_q;
        synchronized (var1) {
          L0: {
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
            break L0;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            try {
                lj.a(ag.d((byte) -117), "resizing", new Object[]{new Integer(param0)}, 90);
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
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ru var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ru var13 = null;
        int var14 = 0;
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
                            var8 = ac.field_k[0];
                            if (var8 != null) {
                              if (param4) {
                                var8.d(db.a(true, param0), u.a(param1, (byte) 94));
                                break L2;
                              } else {
                                var8.a(db.a(true, param0), u.a(param1, (byte) 94));
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
                          if (-8 == (param7 ^ -1)) {
                            stackIn_20_0 = 0;
                            break L3;
                          } else {
                            stackIn_20_0 = 1;
                            break L3;
                          }
                        }
                        L4: {
                          if (stackIn_20_0 != 0 ^ param6) {
                            L5: {
                              if ((param7 ^ -1) != -10) {
                                break L5;
                              } else {
                                param7 = 2;
                                break L5;
                              }
                            }
                            var8_int = 0;
                            L6: while (true) {
                              if ((var8_int ^ -1) <= -5) {
                                break L4;
                              } else {
                                L7: {
                                  if ((param7 ^ -1) != (va.field_G[6] ^ -1)) {
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
                                  var12 = var8_int + (param7 * 20 + ls.a(var11, param7, var10, var9, param3 + -27089));
                                  if ((var12 ^ -1) > -1) {
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
                                decompiledRegionSelector0 = 2;
                                break L0;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        if (param3 == 27066) {
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var8_ref), "ds.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        field_b = "Loading sound effects";
    }
}
