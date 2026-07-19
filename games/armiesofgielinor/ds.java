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
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
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
            Object discarded$0 = null;
            try {
                discarded$0 = lj.a(ag.d((byte) -117), "resizing", new Object[]{new Integer(param0)}, 90);
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
        int var15 = 0;
        int var16 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
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
                                if (var14 == 0) {
                                  break L2;
                                } else {
                                  var8_ref.d(db.a(true, param0), u.a(param1, (byte) 94));
                                  break L2;
                                }
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
                            stackOut_21_0 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            break L3;
                          } else {
                            stackOut_20_0 = 1;
                            stackIn_22_0 = stackOut_20_0;
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            L6: {
                              if (stackIn_22_0 != 0 ^ param6) {
                                L7: {
                                  if ((param7 ^ -1) != -10) {
                                    break L7;
                                  } else {
                                    param7 = 2;
                                    break L7;
                                  }
                                }
                                var8_int = 0;
                                L8: while (true) {
                                  if ((var8_int ^ -1) <= -5) {
                                    break L6;
                                  } else {
                                    var16 = va.field_G[6] ^ -1;
                                    var15 = param7 ^ -1;
                                    if (var14 != 0) {
                                      if (var15 == var16) {
                                        break L4;
                                      } else {
                                        break L5;
                                      }
                                    } else {
                                      L9: {
                                        if (var15 != var16) {
                                          break L9;
                                        } else {
                                          param2 = param7;
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        var9 = param2;
                                        var10 = param2;
                                        var11 = param2;
                                        if (param2 == param7) {
                                          break L10;
                                        } else {
                                          L11: {
                                            if (param7 == va.field_G[1]) {
                                              break L11;
                                            } else {
                                              if (va.field_G[4] != param7) {
                                                break L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          var9 = param7;
                                          break L10;
                                        }
                                      }
                                      L12: {
                                        var12 = var8_int + (param7 * 20 + ls.a(var11, param7, var10, var9, param3 + -27089));
                                        if ((var12 ^ -1) > -1) {
                                          break L12;
                                        } else {
                                          if (var12 < ac.field_k.length) {
                                            L13: {
                                              var13 = ac.field_k[var12];
                                              if (var13 != null) {
                                                if (!param4) {
                                                  var13.a(db.a(true, param0), u.a(param1, (byte) 94));
                                                  break L13;
                                                } else {
                                                  var13.d(db.a(true, param0), u.a(param1, (byte) 94));
                                                  if (var14 == 0) {
                                                    break L13;
                                                  } else {
                                                    var13.a(db.a(true, param0), u.a(param1, (byte) 94));
                                                    break L13;
                                                  }
                                                }
                                              } else {
                                                break L13;
                                              }
                                            }
                                            var8_int++;
                                            if (var14 == 0) {
                                              continue L8;
                                            } else {
                                              break L6;
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                            if (param3 == 27066) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
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
          var8 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var8), "ds.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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
