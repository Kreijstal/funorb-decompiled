/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends gq {
    private gd field_n;
    static String field_j;
    th field_k;
    static String field_p;
    static int field_q;
    static String field_l;
    static int field_m;
    vp field_o;

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        mb var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        ((ba) this).field_o.b(param0, param1, param2);
        var6 = (mb) (Object) ((ba) this).field_k.c(76);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((ba) this).field_n.a(-1, var6)) {
                break L1;
              } else {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var5 <= var6.field_D) {
                    this.a(var4, 14531, var5, var6, param0, var4 + var5);
                    var6.field_D = var6.field_D - var5;
                    break L1;
                  } else {
                    this.a(var4, 14531, var6.field_D, var6, param0, var5 + var4);
                    var5 = var5 - var6.field_D;
                    var4 = var4 + var6.field_D;
                    if (((ba) this).field_n.a(var6, var5, var4, param0, -115)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var6 = (mb) (Object) ((ba) this).field_k.b(6);
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, mb param3, int[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uj var11 = null;
        int var12 = 0;
        gd stackIn_11_0 = null;
        gd stackIn_12_0 = null;
        gd stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        gd stackOut_10_0 = null;
        gd stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        gd stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 == 14531) {
          if (-1 == (4 & ((ba) this).field_n.field_H[param3.field_o] ^ -1)) {
            param3.field_C.b(param4, param0, param2);
            return;
          } else {
            if ((param3.field_l ^ -1) > -1) {
              var7 = ((ba) this).field_n.field_n[param3.field_o] / gp.field_p;
              L0: while (true) {
                var8 = (var7 + 1048575 + -param3.field_w) / var7;
                if (param2 < var8) {
                  param3.field_w = param3.field_w + var7 * param2;
                  param3.field_C.b(param4, param0, param2);
                  return;
                } else {
                  L1: {
                    param3.field_C.b(param4, param0, var8);
                    param3.field_w = param3.field_w + (-1048576 + var7 * var8);
                    param0 = param0 + var8;
                    param2 = param2 - var8;
                    var9 = gp.field_p / 100;
                    var10 = 262144 / var7;
                    if (var10 >= var9) {
                      break L1;
                    } else {
                      var9 = var10;
                      break L1;
                    }
                  }
                  L2: {
                    var11 = param3.field_C;
                    if (((ba) this).field_n.field_y[param3.field_o] == 0) {
                      param3.field_C = uj.a(param3.field_f, var11.l(), var11.h(), var11.g());
                      break L2;
                    } else {
                      L3: {
                        param3.field_C = uj.a(param3.field_f, var11.l(), 0, var11.g());
                        stackOut_10_0 = ((ba) this).field_n;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if ((param3.field_x.field_g[param3.field_p] ^ -1) <= -1) {
                          stackOut_12_0 = (gd) (Object) stackIn_12_0;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L3;
                        } else {
                          stackOut_11_0 = (gd) (Object) stackIn_11_0;
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L3;
                        }
                      }
                      ((gd) (Object) stackIn_13_0).a(stackIn_13_1 != 0, (byte) -76, param3);
                      param3.field_C.a(var9, var11.h());
                      break L2;
                    }
                  }
                  L4: {
                    if (param3.field_x.field_g[param3.field_p] < 0) {
                      param3.field_C.g(-1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var11.e(var9);
                  var11.b(param4, param0, param5 + -param0);
                  if (var11.j()) {
                    ((ba) this).field_o.b((gq) (Object) var11);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            } else {
              param3.field_C.b(param4, param0, param2);
              return;
            }
          }
        } else {
          return;
        }
    }

    final gq b() {
        mb var1 = (mb) (Object) ((ba) this).field_k.c(76);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_C)) {
            return (gq) (Object) var1.field_C;
        }
        return ((ba) this).d();
    }

    private final void a(mb param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        gd stackIn_14_0 = null;
        gd stackIn_15_0 = null;
        gd stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        gd stackOut_13_0 = null;
        gd stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        gd stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        if ((4 & ((ba) this).field_n.field_H[param0.field_o]) != -1) {
          if (-1 > param0.field_l) {
            L0: {
              var4 = ((ba) this).field_n.field_n[param0.field_o] / gp.field_p;
              var5 = (-param0.field_w + (1048575 - -var4)) / var4;
              param0.field_w = param0.field_w + var4 * param1 & 1048575;
              if (param1 < var5) {
                break L0;
              } else {
                L1: {
                  if (0 != ((ba) this).field_n.field_y[param0.field_o]) {
                    L2: {
                      param0.field_C = uj.a(param0.field_f, param0.field_C.l(), 0, param0.field_C.g());
                      stackOut_13_0 = ((ba) this).field_n;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (0 <= param0.field_x.field_g[param0.field_p]) {
                        stackOut_15_0 = (gd) (Object) stackIn_15_0;
                        stackOut_15_1 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L2;
                      } else {
                        stackOut_14_0 = (gd) (Object) stackIn_14_0;
                        stackOut_14_1 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L2;
                      }
                    }
                    ((gd) (Object) stackIn_16_0).a(stackIn_16_1 != 0, (byte) -80, param0);
                    break L1;
                  } else {
                    param0.field_C = uj.a(param0.field_f, param0.field_C.l(), param0.field_C.h(), param0.field_C.g());
                    break L1;
                  }
                }
                if ((param0.field_x.field_g[param0.field_p] ^ -1) <= -1) {
                  param1 = param0.field_w / var4;
                  break L0;
                } else {
                  param0.field_C.g(-1);
                  param1 = param0.field_w / var4;
                  param0.field_C.a(param1);
                  if (!param2) {
                    return;
                  } else {
                    field_m = -56;
                    return;
                  }
                }
              }
            }
            param0.field_C.a(param1);
            if (!param2) {
              return;
            } else {
              field_m = -56;
              return;
            }
          } else {
            param0.field_C.a(param1);
            if (!param2) {
              return;
            } else {
              field_m = -56;
              return;
            }
          }
        } else {
          param0.field_C.a(param1);
          if (!param2) {
            return;
          } else {
            field_m = -56;
            return;
          }
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_p = null;
        if (param0 != 16652) {
            boolean discarded$0 = ba.c(-110);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final void a(int param0) {
        int var2 = 0;
        mb var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ((ba) this).field_o.a(param0);
        var3 = (mb) (Object) ((ba) this).field_k.c(91);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((ba) this).field_n.a(-1, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_D >= var2) {
                    this.a(var3, var2, false);
                    var3.field_D = var3.field_D - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_D, false);
                    var2 = var2 - var3.field_D;
                    if (!((ba) this).field_n.a(var3, var2, 0, (int[]) null, 22)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (mb) (Object) ((ba) this).field_k.b(6);
            continue L0;
          } else {
            return;
          }
        }
    }

    final int a() {
        return 0;
    }

    final gq d() {
        mb var1 = null;
        L0: while (true) {
          var1 = (mb) (Object) ((ba) this).field_k.b(6);
          if (var1 != null) {
            if (var1.field_C != null) {
              return (gq) (Object) var1.field_C;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) um.field_c;
                    // monitorenter um.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (lp.field_j != kj.field_j) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        sj.field_p = td.field_a[lp.field_j];
                        pn.field_d = ta.field_pb[lp.field_j];
                        if (param0 == -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_m = -21;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        lp.field_j = lp.field_j + 1 & 127;
                        // monitorexit var1_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ba(gd param0) {
        ((ba) this).field_k = new th();
        ((ba) this).field_o = new vp();
        ((ba) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 2;
        field_l = "If you do nothing the game will revert to normal view in <%0> second.";
        field_j = "Name is available";
        field_p = "Unfortunately you are not eligible to create an account.";
    }
}
