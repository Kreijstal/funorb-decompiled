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
            java.applet.Applet var2 = (java.applet.Applet) null;
            df.a(true, (java.applet.Applet) null);
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nb var12 = null;
        rj stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param3 instanceof nb) {
                stackOut_3_0 = (rj) (param3);
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (rj) ((Object) stackOut_2_0);
                break L1;
              }
            }
            L2: {
              var12 = (nb) ((Object) stackIn_4_0);
              ti.f(param1 - -param3.field_w, param2 - -param3.field_k, param3.field_p, param3.field_t, this.field_e);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = param3.field_p + -(2 * var12.field_G);
              var8 = var12.field_G + param3.field_w + param1;
              var9 = param3.field_k + param2 - -var12.field_I;
              ti.a(var8, var9, var8 - -var7, var9, this.field_a);
              if (param4 == 4549) {
                break L3;
              } else {
                df.a(-24);
                break L3;
              }
            }
            var10 = -1 + var12.d(true);
            L4: while (true) {
              if (0 > var10) {
                L5: {
                  if (null != this.field_f) {
                    this.field_f.c(var12.field_m, var7 / 2 + var8, var9 + this.field_f.field_v - -var12.field_I, this.field_i, this.field_b);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                break L0;
              } else {
                ti.e(var7 * var12.b((byte) 95, var10) / var12.g(92) + var8, var9, this.field_h, this.field_g);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("df.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 11324) {
            field_d = (pc[]) null;
        }
        field_d = null;
        field_j = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            java.net.URL var2 = null;
            if (param0) {
                var3 = (String) null;
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              pk.field_b = param1;
              if (param0 <= -93) {
                break L1;
              } else {
                field_d = (pc[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("df.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
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
        String var13 = null;
        ha var14 = null;
        int var15 = 0;
        int var16 = 0;
        ha var17 = null;
        int[][] var21 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 <= -66) {
                break L1;
              } else {
                var13 = (String) null;
                df.a(31, (String) null);
                break L1;
              }
            }
            var14 = ae.field_N;
            var17 = var14;
            var2 = var17.f(4);
            var3 = (ta) ((Object) eg.field_b.b(-97));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var2 == var3.field_o) {
                    break L3;
                  } else {
                    var3 = (ta) ((Object) eg.field_b.b((byte) -48));
                    continue L2;
                  }
                }
              }
              if (var3 == null) {
                oj.c(-2290);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L4: {
                  var4 = var17.f(4);
                  if (-1 != (var4 ^ -1)) {
                    wj.field_t[0] = wf.field_b;
                    var5 = var3.field_t;
                    var6_int = 1;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        rj.a((byte) -26, var4, var5);
                        var6_int = 0;
                        L6: while (true) {
                          if (var4 <= var6_int) {
                            kb.a(var5, (byte) 47);
                            var6 = new String[2][var5];
                            var21 = new int[2][4 * var5];
                            var8 = fh.field_b;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var9 >= var8) {
                                var15 = 0;
                                var9 = var15;
                                var16 = 0;
                                var10 = var16;
                                L8: while (true) {
                                  if (var8 > var15) {
                                    L9: {
                                      var11 = fj.field_b[var15 + var5];
                                      var6[1][var16] = wj.field_t[var11];
                                      var21[1][4 * var16] = se.field_B[var11];
                                      var21[1][4 * var16 + 1] = qf.field_g[var11];
                                      var21[1][4 * var16 - -2] = wb.field_e[var11];
                                      var21[1][3 + var16 * 4] = vc.field_f[var11];
                                      if (hk.a(112, wj.field_t[var11])) {
                                        if (0 != qf.field_g[var11] - (-wb.field_e[var11] + -vc.field_f[var11])) {
                                          break L9;
                                        } else {
                                          var6[1][var16] = null;
                                          var16--;
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var16++;
                                    var15++;
                                    continue L8;
                                  } else {
                                    var3.c(20);
                                    break L4;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = fj.field_b[var9];
                                  var6[0][var10] = wj.field_t[var11];
                                  var21[0][var10 * 4] = se.field_B[var11];
                                  var21[0][4 * var10 - -1] = qf.field_g[var11];
                                  var21[0][2 + var10 * 4] = wb.field_e[var11];
                                  var21[0][4 * var10 - -3] = vc.field_f[var11];
                                  if (hk.a(120, wj.field_t[var11])) {
                                    if (-1 != (vc.field_f[var11] + qf.field_g[var11] - -wb.field_e[var11] ^ -1)) {
                                      break L10;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              fe.a(var17, 12726);
                              if (var6_int != 0) {
                                bg.a((byte) 79, rb.field_w, b.field_t, rc.field_h, ci.field_b, var6_int);
                                break L11;
                              } else {
                                bg.a((byte) 78, rb.field_w, b.field_t, rc.field_h, ci.field_b, var6_int);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        wj.field_t[var6_int] = var14.e((byte) 93);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var3.c(20);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "df.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    df(bd param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_i = param1;
            this.field_a = param3;
            this.field_g = param6;
            this.field_f = param0;
            this.field_b = param2;
            this.field_h = param5;
            this.field_e = param4;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "df.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_c = 0;
        field_k = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
