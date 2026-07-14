/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends ae {
    private int field_i;
    private int field_o;
    static int field_p;
    private int field_k;
    static ja field_j;
    private int field_q;
    private int field_l;
    private int field_n;
    static int field_m;

    final static void a(String[] args, int param1, int param2, String param3) {
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        id.field_B = oi.field_j;
        if (param2 == 255) {
          L0: {
            stackOut_15_0 = 0;
            stackIn_17_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (-14 >= (rj.field_J ^ -1)) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = 0;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L0;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L0;
            }
          }
          iq.field_c = ij.a(stackIn_18_0 != 0, stackIn_18_1 != 0);
          if (param1 != 31407) {
            field_p = -77;
            return;
          } else {
            return;
          }
        } else {
          if ((param2 ^ -1) > -101) {
            iq.field_c = p.a(-38, param3, param2);
            if (param1 == 31407) {
              return;
            } else {
              field_p = -77;
              return;
            }
          } else {
            if (105 < param2) {
              iq.field_c = p.a(-38, param3, param2);
              if (param1 != 31407) {
                field_p = -77;
                return;
              } else {
                return;
              }
            } else {
              iq.field_c = kn.a(args, -111);
              if (param1 == 31407) {
                return;
              } else {
                field_p = -77;
                return;
              }
            }
          }
        }
    }

    sj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0);
        ((sj) this).field_o = param3;
        ((sj) this).field_q = param4;
        ((sj) this).field_i = param2;
        ((sj) this).field_k = param6;
        ((sj) this).field_n = param5;
        ((sj) this).field_l = param1;
    }

    final static void a(int param0, int param1, byte param2) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 != -66) {
          return;
        } else {
          var7 = new int[1 + me.field_f.length];
          var3 = var7;
          var4 = new int[me.field_f.length + 1];
          var5 = 0;
          L0: while (true) {
            if (me.field_f.length <= var5) {
              var3[var3.length + -1] = param1;
              var4[-1 + var4.length] = param0;
              nm.field_u = var4;
              me.field_f = var3;
              return;
            } else {
              var7[var5] = me.field_f[var5];
              var4[var5] = nm.field_u[var5];
              var5++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 == -891231071) {
          if (param2 <= param5) {
            return;
          } else {
            if (param5 + 1 < param4) {
              if (param4 > 5 + param5) {
                if (param0 == param6) {
                  var7 = param4 - 1;
                  L0: while (true) {
                    if (var7 <= param5) {
                      return;
                    } else {
                      var8 = param5;
                      L1: while (true) {
                        if (var7 <= var8) {
                          var7--;
                          continue L0;
                        } else {
                          var9 = la.field_c[var8];
                          var10 = la.field_c[1 + var8];
                          if (!un.a(101, param3, var9, var10)) {
                            var8++;
                            var8++;
                            var8++;
                            continue L1;
                          } else {
                            la.field_c[var8] = var10;
                            la.field_c[1 + var8] = var9;
                            var8++;
                            var8++;
                            continue L1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L2: {
                    var7 = (1 & (param0 & param6)) + ((param6 >> -891231071) - -(param0 >> -759131647));
                    var8 = param5;
                    var9 = param0;
                    var10 = param6;
                    var11 = param5;
                    if (param4 <= var11) {
                      break L2;
                    } else {
                      L3: {
                        var12 = la.field_c[var11];
                        if (param3) {
                          stackOut_21_0 = lb.field_c[var12];
                          stackIn_22_0 = stackOut_21_0;
                          break L3;
                        } else {
                          stackOut_20_0 = hn.field_f[var12];
                          stackIn_22_0 = stackOut_20_0;
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          var13 = stackIn_22_0;
                          if (var13 > var7) {
                            la.field_c[var11] = la.field_c[var8];
                            var8++;
                            la.field_c[var8] = var12;
                            if (var9 > var13) {
                              var9 = var13;
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            L6: {
                              if (var10 >= var13) {
                                var11++;
                                break L6;
                              } else {
                                var10 = var13;
                                break L6;
                              }
                            }
                            var11++;
                            break L5;
                          }
                        }
                        var11++;
                        break L4;
                      }
                      var11++;
                      var11++;
                      break L2;
                    }
                  }
                  sj.a(param0, param1 + 0, param2, param3, var8, param5, var9);
                  sj.a(var10, param1 + 0, param2, param3, param4, var8, param6);
                  return;
                }
              } else {
                L7: {
                  var7 = param4 - 1;
                  if (var7 <= param5) {
                    break L7;
                  } else {
                    L8: {
                      var8 = param5;
                      if (var7 <= var8) {
                        break L8;
                      } else {
                        L9: {
                          var9 = la.field_c[var8];
                          var10 = la.field_c[1 + var8];
                          if (!un.a(101, param3, var9, var10)) {
                            var8++;
                            break L9;
                          } else {
                            la.field_c[var8] = var10;
                            la.field_c[1 + var8] = var9;
                            var8++;
                            break L9;
                          }
                        }
                        var8++;
                        var8++;
                        break L8;
                      }
                    }
                    var7--;
                    break L7;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, qd param1) {
        gm var3 = null;
        wb var4 = null;
        Exception var5 = null;
        qk var5_ref = null;
        wb var7 = null;
        wb var9 = null;
        wb stackIn_4_0 = null;
        wb stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = op.field_m.a(((sj) this).field_i, 70);
                    var4 = null;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((sj) this).field_l == -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = op.field_m.a(((sj) this).field_l, false);
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = null;
                        stackIn_4_0 = (wb) (Object) stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = stackIn_4_0;
                        if (param0 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        sj.c(true);
                        var5_ref = new qk(((sj) this).field_q, ((sj) this).field_n);
                        var7 = param1.a(((sj) this).field_k, var4, var3, true, var5_ref);
                        var7.field_y = ((sj) this).field_o;
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var5 = (Exception) (Object) caughtException;
                    return;
                }
                case 8: {
                    var5_ref = new qk(((sj) this).field_q, ((sj) this).field_n);
                    var9 = param1.a(((sj) this).field_k, var4, var3, true, var5_ref);
                    var9.field_y = ((sj) this).field_o;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            ((sj) this).field_q = 6;
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        if (!param0) {
            sj.a(-121, -52, -61, false, 25, -17, -24);
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 12319) {
          sj.a(97, -25, -42, true, 8, 4, 118);
          return dp.a(0, false, param0);
        } else {
          return dp.a(0, false, param0);
        }
    }

    static {
    }
}
