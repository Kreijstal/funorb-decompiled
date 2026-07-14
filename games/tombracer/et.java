/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et extends cg {
    vna field_l;
    private l field_k;
    en field_m;
    static long field_j;

    final cg c() {
        rta var1_ref = null;
        do {
            var1_ref = (rta) (Object) ((et) this).field_l.e(112);
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_x == null);
        return (cg) (Object) var1_ref.field_x;
    }

    final void a(int param0) {
        int var2 = 0;
        rta var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        ((et) this).field_m.a(param0);
        var3 = (rta) (Object) ((et) this).field_l.f(-80);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((et) this).field_k.c(15, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_B >= var2) {
                    this.a(943, var2, var3);
                    var3.field_B = var3.field_B - var2;
                    break L1;
                  } else {
                    this.a(943, var3.field_B, var3);
                    var2 = var2 - var3.field_B;
                    if (!((et) this).field_k.a(var3, (int[]) null, 0, (byte) 6, var2)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (rta) (Object) ((et) this).field_l.e(125);
            continue L0;
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 4 % ((param2 - 51) / 37);
        if (param1 < param0) {
            return param1;
        }
        return param0;
    }

    final static void a(boolean param0) {
        oga.a(!param0 ? true : false);
        jf.field_r = param0 ? true : false;
        gj.field_r = true;
        ej.field_a.e(true);
        vn.a(86, mj.field_M, false);
    }

    final static void a(byte param0, String param1, java.awt.Color param2, int param3, boolean param4) {
        try {
            Exception var5 = null;
            Exception var6 = null;
            int var7 = 0;
            int var8 = 0;
            java.awt.Graphics var9 = null;
            java.awt.Graphics var10 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var9 = nma.field_l.getGraphics();
                            if (laa.field_y != null) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            laa.field_y = new java.awt.Font("Helvetica", 1, 13);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!param4) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var9.setColor(java.awt.Color.black);
                            var9.fillRect(0, 0, mma.field_a, qf.field_i);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param2 != null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            param2 = new java.awt.Color(140, 17, 17);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (np.field_x == null) {
                                statePc = 8;
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
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            np.field_x = nma.field_l.createImage(304, 34);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var10 = np.field_x.getGraphics();
                            var10.setColor(param2);
                            var10.drawRect(0, 0, 303, 33);
                            var10.fillRect(2, 2, param3 * 3, 30);
                            var10.setColor(java.awt.Color.black);
                            var10.drawRect(1, 1, 301, 31);
                            var10.fillRect(param3 * 3 + 2, 2, -(param3 * 3) + 300, 30);
                            var10.setFont(laa.field_y);
                            var10.setColor(java.awt.Color.white);
                            var10.drawString(param1, (-(6 * param1.length()) + 304) / 2, 22);
                            boolean discarded$3 = var9.drawImage(np.field_x, -152 + mma.field_a / 2, qf.field_i / 2 - 18, (java.awt.image.ImageObserver) null);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var6 = (Exception) (Object) caughtException;
                            var7 = -152 + mma.field_a / 2;
                            var8 = -18 + qf.field_i / 2;
                            var9.setColor(param2);
                            var9.drawRect(var7, var8, 303, 33);
                            var9.fillRect(2 + var7, var8 - -2, param3 * 3, 30);
                            var9.setColor(java.awt.Color.black);
                            var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                            var9.fillRect(var7 + (2 + param3 * 3), var8 - -2, 300 - 3 * param3, 30);
                            var9.setFont(laa.field_y);
                            var9.setColor(java.awt.Color.white);
                            var9.drawString(param1, (304 + -(param1.length() * 6)) / 2 + var7, var8 - -22);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (hma.field_e == null) {
                                statePc = 18;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var9.setFont(laa.field_y);
                            var9.setColor(java.awt.Color.white);
                            var9.drawString(hma.field_e, mma.field_a / 2 - 6 * hma.field_e.length() / 2, qf.field_i / 2 + -26);
                            if (param0 >= 0) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            int discarded$4 = et.b(-92, 42, -49);
                            return;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            return;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var5 = (Exception) (Object) caughtException;
                        nma.field_l.repaint();
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (param0 < 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    case 20: {
                        int discarded$5 = et.b(-92, 42, -49);
                        return;
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

    private final void a(int param0, int param1, rta param2) {
        int var4 = 0;
        int var5 = 0;
        l stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        rta stackIn_18_2 = null;
        l stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        rta stackIn_19_2 = null;
        l stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        rta stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        l stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        rta stackOut_17_2 = null;
        l stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        rta stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        l stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        rta stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        if ((4 & ((et) this).field_k.field_M[param2.field_k]) != 0) {
          if (0 > param2.field_t) {
            var4 = ((et) this).field_k.field_u[param2.field_k] / kta.field_d;
            var5 = (1048575 + (var4 + -param2.field_r)) / var4;
            param2.field_r = 1048575 & var4 * param1 + param2.field_r;
            if (var5 <= param1) {
              L0: {
                if (((et) this).field_k.field_q[param2.field_k] != 0) {
                  L1: {
                    param2.field_x = qia.a(param2.field_n, param2.field_x.j(), 0, param2.field_x.f());
                    stackOut_17_0 = ((et) this).field_k;
                    stackOut_17_1 = -111;
                    stackOut_17_2 = (rta) param2;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    if (0 <= param2.field_y.field_g[param2.field_m]) {
                      stackOut_19_0 = (l) (Object) stackIn_19_0;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = (rta) (Object) stackIn_19_2;
                      stackOut_19_3 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      stackIn_20_3 = stackOut_19_3;
                      break L1;
                    } else {
                      stackOut_18_0 = (l) (Object) stackIn_18_0;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = (rta) (Object) stackIn_18_2;
                      stackOut_18_3 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      break L1;
                    }
                  }
                  ((l) (Object) stackIn_20_0).a((byte) stackIn_20_1, stackIn_20_2, stackIn_20_3 != 0);
                  break L0;
                } else {
                  param2.field_x = qia.a(param2.field_n, param2.field_x.j(), param2.field_x.l(), param2.field_x.f());
                  break L0;
                }
              }
              L2: {
                if (param2.field_y.field_g[param2.field_m] < 0) {
                  param2.field_x.b(-1);
                  break L2;
                } else {
                  break L2;
                }
              }
              param1 = param2.field_r / var4;
              if (param0 == 943) {
                param2.field_x.a(param1);
                return;
              } else {
                field_j = 126L;
                param2.field_x.a(param1);
                return;
              }
            } else {
              if (param0 == 943) {
                param2.field_x.a(param1);
                return;
              } else {
                field_j = 126L;
                param2.field_x.a(param1);
                return;
              }
            }
          } else {
            if (param0 == 943) {
              param2.field_x.a(param1);
              return;
            } else {
              field_j = 126L;
              param2.field_x.a(param1);
              return;
            }
          }
        } else {
          if (param0 == 943) {
            param2.field_x.a(param1);
            return;
          } else {
            field_j = 126L;
            param2.field_x.a(param1);
            return;
          }
        }
    }

    private final void a(int param0, int param1, int[] param2, rta param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qia var11 = null;
        int var12 = 0;
        l stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        rta stackIn_18_2 = null;
        l stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        rta stackIn_19_2 = null;
        l stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        rta stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        l stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        rta stackOut_17_2 = null;
        l stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        rta stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        l stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        rta stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        if (-1 != (4 & ((et) this).field_k.field_M[param3.field_k] ^ -1)) {
          if (-1 < (param3.field_t ^ -1)) {
            var7 = ((et) this).field_k.field_u[param3.field_k] / kta.field_d;
            L0: while (true) {
              var8 = (var7 + (1048575 - param3.field_r)) / var7;
              if (param4 < var8) {
                param3.field_r = param3.field_r + var7 * param4;
                if (!param5) {
                  param3.field_x.b(param2, param1, param4);
                  return;
                } else {
                  ((et) this).field_m = null;
                  param3.field_x.b(param2, param1, param4);
                  return;
                }
              } else {
                L1: {
                  param3.field_x.b(param2, param1, var8);
                  param4 = param4 - var8;
                  param3.field_r = param3.field_r + (var8 * var7 + -1048576);
                  param1 = param1 + var8;
                  var9 = kta.field_d / 100;
                  var10 = 262144 / var7;
                  if (var10 < var9) {
                    var9 = var10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var11 = param3.field_x;
                  if (((et) this).field_k.field_q[param3.field_k] != 0) {
                    L3: {
                      param3.field_x = qia.a(param3.field_n, var11.j(), 0, var11.f());
                      stackOut_17_0 = ((et) this).field_k;
                      stackOut_17_1 = -35;
                      stackOut_17_2 = (rta) param3;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      if (-1 >= (param3.field_y.field_g[param3.field_m] ^ -1)) {
                        stackOut_19_0 = (l) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = (rta) (Object) stackIn_19_2;
                        stackOut_19_3 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        stackIn_20_3 = stackOut_19_3;
                        break L3;
                      } else {
                        stackOut_18_0 = (l) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = (rta) (Object) stackIn_18_2;
                        stackOut_18_3 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        stackIn_20_3 = stackOut_18_3;
                        break L3;
                      }
                    }
                    ((l) (Object) stackIn_20_0).a((byte) stackIn_20_1, stackIn_20_2, stackIn_20_3 != 0);
                    param3.field_x.b(var9, var11.l());
                    break L2;
                  } else {
                    param3.field_x = qia.a(param3.field_n, var11.j(), var11.l(), var11.f());
                    break L2;
                  }
                }
                L4: {
                  if ((param3.field_y.field_g[param3.field_m] ^ -1) <= -1) {
                    break L4;
                  } else {
                    param3.field_x.b(-1);
                    break L4;
                  }
                }
                var11.d(var9);
                var11.b(param2, param1, param0 + -param1);
                if (!var11.m()) {
                  continue L0;
                } else {
                  ((et) this).field_m.a((cg) (Object) var11);
                  continue L0;
                }
              }
            }
          } else {
            if (!param5) {
              param3.field_x.b(param2, param1, param4);
              return;
            } else {
              ((et) this).field_m = null;
              param3.field_x.b(param2, param1, param4);
              return;
            }
          }
        } else {
          if (!param5) {
            param3.field_x.b(param2, param1, param4);
            return;
          } else {
            ((et) this).field_m = null;
            param3.field_x.b(param2, param1, param4);
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        rta var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        ((et) this).field_m.b(param0, param1, param2);
        var6 = (rta) (Object) ((et) this).field_l.f(-80);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            L1: {
              if (((et) this).field_k.c(15, var6)) {
                break L1;
              } else {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var5 <= var6.field_B) {
                    this.a(var4 - -var5, var4, param0, var6, var5, false);
                    var6.field_B = var6.field_B - var5;
                    break L1;
                  } else {
                    this.a(var4 - -var5, var4, param0, var6, var6.field_B, false);
                    var4 = var4 + var6.field_B;
                    var5 = var5 - var6.field_B;
                    if (!((et) this).field_k.a(var6, param0, var4, (byte) 6, var5)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var6 = (rta) (Object) ((et) this).field_l.e(121);
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        kh var3 = ql.field_k;
        var3.k(param0, -2988);
        var3.i(3, 0);
        var3.i(9, param1 ^ param1);
        var3.f(param1 ^ -1477662122, param2);
    }

    et(l param0) {
        ((et) this).field_l = new vna();
        ((et) this).field_m = new en();
        ((et) this).field_k = param0;
    }

    final int a() {
        return 0;
    }

    final cg b() {
        rta var1 = (rta) (Object) ((et) this).field_l.f(-80);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_x)) {
            return (cg) (Object) var1.field_x;
        }
        return ((et) this).c();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 17219L;
    }
}
