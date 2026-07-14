/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df implements uk {
    private int field_i;
    static int field_c;
    private int field_b;
    private int field_g;
    private int field_h;
    private int field_e;
    static String field_k;
    private int field_a;
    static pc[] field_d;
    private bd field_f;
    static String field_j;

    final static void a(int param0) {
        pl.field_U = 0;
        if (param0 != -3) {
            Object var2 = null;
            df.a(true, (java.applet.Applet) null);
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nb var12 = null;
        rj stackIn_3_0 = null;
        rj stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = stellarshard.field_B;
          if (param3 instanceof nb) {
            stackOut_2_0 = (rj) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (rj) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (nb) (Object) stackIn_3_0;
          ti.f(param1 - -param3.field_w, param2 - -param3.field_k, param3.field_p, param3.field_t, ((df) this).field_e);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = param3.field_p + -(2 * var12.field_G);
          var8 = var12.field_G + param3.field_w + param1;
          var9 = param3.field_k + param2 - -var12.field_I;
          ti.a(var8, var9, var8 - -var7, var9, ((df) this).field_a);
          if (param4 == 4549) {
            break L2;
          } else {
            df.a(-24);
            break L2;
          }
        }
        var10 = -1 + var12.d(true);
        L3: while (true) {
          if (0 > var10) {
            L4: {
              if (null != ((df) this).field_f) {
                ((df) this).field_f.c(var12.field_m, var7 / 2 + var8, var9 + ((df) this).field_f.field_v - -var12.field_I, ((df) this).field_i, ((df) this).field_b);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            ti.e(var7 * var12.b((byte) 95, var10) / var12.g(92) + var8, var9, ((df) this).field_h, ((df) this).field_g);
            var10--;
            continue L3;
          }
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 11324) {
            field_d = null;
        }
        field_d = null;
        field_j = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0) {
                Object var3 = null;
                df.a(-95, (String) null);
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(lk.a(param1, var2, 66), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1) {
        pk.field_b = param1;
        if (param0 > -93) {
            field_d = null;
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        ta var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        ha var14 = null;
        int var15 = 0;
        int var16 = 0;
        ha var17 = null;
        int[][] var21 = null;
        L0: {
          var12 = stellarshard.field_B;
          if (param0 <= -66) {
            break L0;
          } else {
            var13 = null;
            df.a(31, (String) null);
            break L0;
          }
        }
        var14 = ae.field_N;
        var17 = var14;
        var2 = var17.f(4);
        var3 = (ta) (Object) eg.field_b.b(-97);
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var2 == var3.field_o) {
                break L2;
              } else {
                var3 = (ta) (Object) eg.field_b.b((byte) -48);
                continue L1;
              }
            }
          }
          if (var3 == null) {
            oj.c(-2290);
            return;
          } else {
            L3: {
              var4 = var17.f(4);
              if (-1 != (var4 ^ -1)) {
                wj.field_t[0] = wf.field_b;
                var5 = var3.field_t;
                var6_int = 1;
                L4: while (true) {
                  if (var4 <= var6_int) {
                    rj.a((byte) -26, var4, var5);
                    var6_int = 0;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        kb.a(var5, (byte) 47);
                        var6 = new String[2][var5];
                        var21 = new int[2][4 * var5];
                        var8 = fh.field_b;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var9 >= var8) {
                            var15 = 0;
                            var9 = var15;
                            var16 = 0;
                            var10 = var16;
                            L7: while (true) {
                              if (var8 <= var15) {
                                break L3;
                              } else {
                                var11 = fj.field_b[var15 + var5];
                                var6[1][var16] = wj.field_t[var11];
                                var21[1][4 * var16] = se.field_B[var11];
                                var21[1][4 * var16 + 1] = qf.field_g[var11];
                                var21[1][4 * var16 - -2] = wb.field_e[var11];
                                var21[1][3 + var16 * 4] = vc.field_f[var11];
                                if (hk.a(112, wj.field_t[var11])) {
                                  if (0 == qf.field_g[var11] - (-wb.field_e[var11] + -vc.field_f[var11])) {
                                    var6[1][var16] = null;
                                    var16--;
                                    var16++;
                                    var15++;
                                    continue L7;
                                  } else {
                                    var16++;
                                    var15++;
                                    continue L7;
                                  }
                                } else {
                                  var16++;
                                  var15++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = fj.field_b[var9];
                            var6[0][var10] = wj.field_t[var11];
                            var21[0][var10 * 4] = se.field_B[var11];
                            var21[0][4 * var10 - -1] = qf.field_g[var11];
                            var21[0][2 + var10 * 4] = wb.field_e[var11];
                            var21[0][4 * var10 - -3] = vc.field_f[var11];
                            if (hk.a(120, wj.field_t[var11])) {
                              if (-1 == (vc.field_f[var11] + qf.field_g[var11] - -wb.field_e[var11] ^ -1)) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L6;
                              } else {
                                var10++;
                                var9++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        fe.a((ka) (Object) var17, 12726);
                        if (var6_int != 0) {
                          bg.a((byte) 79, rb.field_w, b.field_t, rc.field_h, ci.field_b, var6_int);
                          var6_int++;
                          continue L5;
                        } else {
                          bg.a((byte) 78, rb.field_w, b.field_t, rc.field_h, ci.field_b, var6_int);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    wj.field_t[var6_int] = var14.e((byte) 93);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.c(20);
            return;
          }
        }
    }

    df(bd param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((df) this).field_i = param1;
        ((df) this).field_a = param3;
        ((df) this).field_g = param6;
        ((df) this).field_f = param0;
        ((df) this).field_b = param2;
        ((df) this).field_h = param5;
        ((df) this).field_e = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_k = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
