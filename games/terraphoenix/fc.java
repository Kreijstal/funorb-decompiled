/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private boolean field_c;
    private int field_f;
    static fa field_a;
    static int[] field_e;
    static bg[] field_i;
    private int field_d;
    static String[] field_k;
    static String field_g;
    static String field_b;
    static String field_h;
    static String field_j;
    private int[] field_l;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -114) {
            return;
        }
        field_h = null;
        field_g = null;
        field_b = null;
        field_e = null;
        field_j = null;
        field_i = null;
        field_k = null;
    }

    final int c(int param0) {
        if (param0 != -16952) {
            return 119;
        }
        return ((fc) this).field_d - -1;
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 > ((fc) this).field_d) {
            ((fc) this).field_d = param1;
        }
        if (param2 != 16) {
            ((fc) this).b(48, 84);
        }
        if (!(((fc) this).field_l.length > param1)) {
            this.a(param1, (byte) -126);
        }
        ((fc) this).field_l[param1] = param0;
    }

    private final void a(int param0, byte param1) {
        int[] var5 = new int[this.a(-1, param0)];
        int[] var3 = var5;
        ka.a(((fc) this).field_l, 0, var5, 0, ((fc) this).field_l.length);
        ((fc) this).field_l = var5;
        int var4 = 63 / ((param1 - -72) / 53);
    }

    final void b(int param0, int param1) {
        if (param1 <= 119) {
            field_i = null;
        }
        if ((param0 ^ -1) <= -1) {
            // if_icmplt L34
        } else {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (((fc) this).field_d != param0) {
            ka.a(((fc) this).field_l, param0 - -1, ((fc) this).field_l, param0, ((fc) this).field_d + -param0);
        }
        ((fc) this).field_d = ((fc) this).field_d - 1;
    }

    final void c(int param0, int param1) {
        this.a(param1, 1 + ((fc) this).field_d, 16);
        if (param0 != 0) {
            field_e = null;
        }
    }

    final int a(byte param0, int param1) {
        if (param1 > ((fc) this).field_d) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 != -68) {
            fc.a((byte) 71);
        }
        return ((fc) this).field_l[param1];
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param1 != 100) {
                    Object var3 = null;
                    fc.a(-76, (ci) null, -49, -91, 0);
                }
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(bb.a((byte) 112, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, ci param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        L0: {
          var18 = Terraphoenix.field_V;
          param0 = param0 + param3;
          param3 = param3 - (-15 + param1.field_u);
          param2 = param2 + param1.field_p;
          param3 = param3 + param1.field_v;
          var5 = param3 * l.field_k + param2;
          var6 = param4;
          var7 = param2;
          var8 = param3;
          var9 = param1.field_t;
          var10 = param1.field_r;
          var11 = -var10 + l.field_k;
          var12 = 0;
          if (param3 >= l.field_d) {
            break L0;
          } else {
            var13 = -param3 + l.field_d;
            var9 = var9 - var13;
            param3 = l.field_d;
            var5 = var5 + var13 * l.field_k;
            var6 = var6 + var13 * var10;
            var8 = var8 + var13;
            break L0;
          }
        }
        L1: {
          if (l.field_b > param2) {
            var13 = -param2 + l.field_b;
            var12 = var12 + var13;
            var7 = var7 + var13;
            var11 = var11 + var13;
            var10 = var10 - var13;
            var6 = var6 + var13;
            param2 = l.field_b;
            var5 = var5 + var13;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param3 + var9 > l.field_c) {
            var9 = var9 - (param3 - -var9 + -l.field_c);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (l.field_f >= param2 + var10) {
            break L3;
          } else {
            var13 = var10 + (param2 + -l.field_f);
            var10 = var10 - var13;
            var12 = var12 + var13;
            var11 = var11 + var13;
            break L3;
          }
        }
        L4: {
          if (var10 >= -1) {
            break L4;
          } else {
            if (-1 < var9) {
              var13 = var7;
              var15 = -(var10 >> -702278302);
              var10 = -(var10 & 3);
              var16 = -var9;
              L5: while (true) {
                if (var16 >= 0) {
                  return;
                } else {
                  var17 = var15;
                  L6: while (true) {
                    if (-1 >= var17) {
                      var17 = var10;
                      L7: while (true) {
                        if (0 <= var17) {
                          L8: {
                            var8++;
                            var7 = var13;
                            var5 = var5 + var11;
                            if (var8 >= param3 + (param1.field_t + -15)) {
                              param0++;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var6 = var6 + var12;
                          var16++;
                          continue L5;
                        } else {
                          var6++;
                          var14 = param1.field_z[var6];
                          if (var14 != 0) {
                            var5++;
                            l.field_i[var5] = 0;
                            var17++;
                            continue L7;
                          } else {
                            var5++;
                            var17++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      L9: {
                        L10: {
                          var6++;
                          var14 = param1.field_z[var6];
                          if (-1 == var14) {
                            break L10;
                          } else {
                            if (gd.field_a[var7][var8] > param0) {
                              break L10;
                            } else {
                              var7++;
                              gd.field_a[var7][var8] = param0;
                              var5++;
                              l.field_i[var5] = 0;
                              break L9;
                            }
                          }
                        }
                        var5++;
                        var7++;
                        break L9;
                      }
                      L11: {
                        L12: {
                          var6++;
                          var14 = param1.field_z[var6];
                          if (-1 == (var14 ^ -1)) {
                            break L12;
                          } else {
                            if (gd.field_a[var7][var8] <= param0) {
                              var7++;
                              gd.field_a[var7][var8] = param0;
                              var5++;
                              l.field_i[var5] = 0;
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        var5++;
                        var7++;
                        break L11;
                      }
                      L13: {
                        L14: {
                          var6++;
                          var14 = param1.field_z[var6];
                          if (var14 == 0) {
                            break L14;
                          } else {
                            if (param0 < gd.field_a[var7][var8]) {
                              break L14;
                            } else {
                              var7++;
                              gd.field_a[var7][var8] = param0;
                              var5++;
                              l.field_i[var5] = 0;
                              break L13;
                            }
                          }
                        }
                        var7++;
                        var5++;
                        break L13;
                      }
                      var6++;
                      var14 = param1.field_z[var6];
                      if (0 != var14) {
                        if (param0 >= gd.field_a[var7][var8]) {
                          var7++;
                          gd.field_a[var7][var8] = param0;
                          var5++;
                          l.field_i[var5] = 0;
                          var17++;
                          continue L6;
                        } else {
                          var5++;
                          var7++;
                          var17++;
                          continue L6;
                        }
                      } else {
                        var5++;
                        var7++;
                        var17++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) a.field_d;
                    // monitorenter a.field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        oh.field_f = wa.field_p;
                        ng.field_t = ng.field_t + 1;
                        ef.field_j = ie.field_d;
                        if (param0 == 43) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_h = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        jb.field_b = ch.field_d;
                        ja.field_l = sj.field_c;
                        sj.field_c = false;
                        ma.field_I = sh.field_z;
                        mm.field_c = qe.field_l;
                        lm.field_c = qd.field_i;
                        sh.field_z = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0) {
        if (-3 < (uh.field_H ^ -1)) {
          return 0;
        } else {
          L0: {
            if ((ph.field_o ^ -1) != param0) {
              L1: {
                if (bl.field_a != null) {
                  if (!bl.field_a.a(0)) {
                    return 14;
                  } else {
                    if (!bl.field_a.d(param0 + 0, "")) {
                      return 29;
                    } else {
                      if (!bl.field_a.a(-3, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (bi.field_d.a(param0 ^ -1)) {
                if (bi.field_d.a(-3, "commonui")) {
                  if (!ph.field_q.a(0)) {
                    return 71;
                  } else {
                    if (!ph.field_q.a(param0 + -2, "commonui")) {
                      return 80;
                    } else {
                      if (!ch.field_g.a(0)) {
                        return 82;
                      } else {
                        if (ch.field_g.b((byte) -128)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    }
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            } else {
              if (!bi.field_d.a(0)) {
                return 20;
              } else {
                if (bi.field_d.a(param0 ^ 2, "commonui")) {
                  if (!ph.field_q.a(0)) {
                    return 50;
                  } else {
                    if (!ph.field_q.a(param0 ^ 2, "commonui")) {
                      return 60;
                    } else {
                      if (ch.field_g.a(0)) {
                        if (ch.field_g.b((byte) -128)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    }
                  }
                } else {
                  return 40;
                }
              }
            }
          }
          return 100;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (param0 == -1) {
          var3 = ((fc) this).field_l.length;
          L0: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (!((fc) this).field_c) {
                var3 = var3 + ((fc) this).field_f;
                continue L0;
              } else {
                if (0 == var3) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * ((fc) this).field_f;
                  continue L0;
                }
              }
            }
          }
        } else {
          return -109;
        }
    }

    final static ee a(int param0, uc param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ee var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        var2 = param1.a(false, 8);
        if (-1 > (var2 ^ -1)) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            if (param0 == 11043) {
              break L0;
            } else {
              field_g = null;
              break L0;
            }
          }
          L1: {
            var3 = ma.a(param1, (byte) 98) ? 1 : 0;
            var4 = ma.a(param1, (byte) 98) ? 1 : 0;
            var5 = new ee();
            var5.field_m = (short)param1.a(false, 16);
            var5.field_D = dc.a(-25076, var5.field_D, 16, param1);
            var5.field_B = dc.a(param0 ^ -19153, var5.field_B, 16, param1);
            var5.field_L = dc.a(-25076, var5.field_L, 16, param1);
            var5.field_l = (short)param1.a(false, 16);
            var5.field_E = dc.a(-25076, var5.field_E, 16, param1);
            var5.field_n = dc.a(-25076, var5.field_n, 16, param1);
            var5.field_p = dc.a(-25076, var5.field_p, 16, param1);
            if (var3 != 0) {
              var5.field_o = (short)param1.a(false, 16);
              var5.field_j = dc.a(param0 ^ -19153, var5.field_j, 16, param1);
              var5.field_P = dc.a(-25076, var5.field_P, 16, param1);
              var5.field_u = dc.a(-25076, var5.field_u, 16, param1);
              var5.field_C = dc.a(param0 ^ -19153, var5.field_C, 16, param1);
              var5.field_k = dc.a(param0 ^ -19153, var5.field_k, 16, param1);
              var5.field_g = dc.a(-25076, var5.field_g, 16, param1);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              int discarded$1 = param1.a(false, 16);
              var5.field_F = dc.a(-25076, var5.field_F, 16, param1);
              var5.field_s = dc.a(-25076, var5.field_s, 16, param1);
              var5.field_A = dc.a(-25076, var5.field_A, 16, param1);
              var5.field_y = dc.a(param0 + -36119, var5.field_y, 16, param1);
              var5.field_J = dc.a(-25076, var5.field_J, 16, param1);
              break L2;
            }
          }
          L3: {
            if (!ma.a(param1, (byte) 98)) {
              break L3;
            } else {
              var5.field_x = dc.a(param0 ^ -19153, var5.field_x, 16, param1);
              break L3;
            }
          }
          L4: {
            if (!ma.a(param1, (byte) 98)) {
              break L4;
            } else {
              var5.field_f = ig.a(16, 125, param1, var5.field_f);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_f.length) {
                  if (0 == var6) {
                    var5.field_f = null;
                    break L4;
                  } else {
                    var5.field_I = (byte)(1 + var6);
                    break L4;
                  }
                } else {
                  if ((255 & var5.field_f[var7]) > var6) {
                    var6 = var5.field_f[var7] & 255;
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return var5;
        }
    }

    private fc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "To Customer Support";
        field_k = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_g = "Quit to main menu";
        field_e = new int[1024];
        field_j = "LAC-2";
        field_h = "UFO about to launch";
    }
}
