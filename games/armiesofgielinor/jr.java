/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jr {
    int field_g;
    int field_b;
    boolean field_a;
    static String field_e;
    static int[][] field_h;
    private int field_d;
    int field_c;
    int field_i;
    static vg field_f;

    final static int a(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            stackOut_3_0 = cg.field_j;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "jr.C(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -1) {
              if (du.field_d == oh.field_L) {
                stackOut_6_0 = qk.field_b;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = ah.field_d;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "jr.E(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_e = null;
              if (param0 > 52) {
                break L1;
              } else {
                jr.b(125);
                break L1;
              }
            }
            field_f = null;
            field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "jr.B(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                int discarded$1 = jr.a(false);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((jr) this).field_a) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (param0 <= 0) {
                        break L5;
                      } else {
                        L6: {
                          if (!((jr) this).b(112, sm.field_d, param1, param3, ko.field_b)) {
                            break L6;
                          } else {
                            hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 + -25, param1 + (((jr) this).field_g - 25));
                            hr.field_d[0].f(param3 + (((jr) this).field_b + -25), -25 + ((jr) this).field_g + param1, 256);
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 - 25, param1 + (((jr) this).field_g + -25));
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    hr.field_d[((jr) this).field_c].g(param3 - (-((jr) this).field_b - -25), -25 + (((jr) this).field_g + param1), 128);
                    break L4;
                  }
                  fe.a(((jr) this).field_b + param3, param1 - -((jr) this).field_g, ((jr) this).field_c, param0, fe.field_b);
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if (0 >= param0) {
                  break L7;
                } else {
                  L8: {
                    L9: {
                      if (!((jr) this).b(31, sm.field_d, param1, param3, ko.field_b)) {
                        break L9;
                      } else {
                        lw.field_ob.b(param3 - (-((jr) this).field_b - -20), -20 + (((jr) this).field_g + param1), bo.field_g[((jr) this).field_c]);
                        if (var6 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    lw.field_ob.d(-20 + ((jr) this).field_b + param3, param1 + ((jr) this).field_g - 20, bo.field_g[((jr) this).field_c]);
                    break L8;
                  }
                  L10: {
                    L11: {
                      if (((jr) this).field_i != 81) {
                        break L11;
                      } else {
                        pl.field_x[4].g(-20 + ((jr) this).field_b + param3, -20 + (param1 + ((jr) this).field_g));
                        if (var6 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    pl.field_x[((jr) this).field_i].g(((jr) this).field_b + param3 + -20, ((jr) this).field_g + param1 + -20);
                    break L10;
                  }
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L7;
                  }
                }
              }
              L12: {
                L13: {
                  lw.field_ob.d(((jr) this).field_b + (param3 - 20), -20 + param1 + ((jr) this).field_g, fe.b(bo.field_g[((jr) this).field_c], 128));
                  if (((jr) this).field_i == 81) {
                    break L13;
                  } else {
                    pl.field_x[((jr) this).field_i].g(-20 + ((jr) this).field_b + param3, -20 + (param1 - -((jr) this).field_g), 0);
                    if (var6 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                pl.field_x[4].g(-20 + (param3 + ((jr) this).field_b), param1 - -((jr) this).field_g + -20, 0);
                break L12;
              }
              km.field_h[0].g(-23 + param3 - -((jr) this).field_b, -23 + (param1 + ((jr) this).field_g), 10);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "jr.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param0 = param0 | param0 << -172819416;
            var5_int = param0 ^ param0 >> 399360353;
            var8 = -74 % ((55 - param1) / 32);
            var9 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 >= 4) {
                    break L3;
                  } else {
                    var7 = (7 & param0) + param2 + (bm.field_y[var9][1] - 64);
                    var6 = -54 + (param4 + (bm.field_y[var9][0] - -(var5_int & 15)));
                    var10 = (param0 + param3 / (4 + (param0 & 3))) % 3;
                    param0 = param0 >> 1;
                    var5_int = var5_int >> 1;
                    jq.field_G[var10].h(60 + var6, 50 + var7);
                    var9++;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "jr.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    jr(boolean param0, int param1, int param2, int param3) {
        try {
            ((jr) this).field_d = param3;
            ((jr) this).field_a = param0;
            ((jr) this).field_c = param1;
            ((jr) this).field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "jr.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var6_int = -param1 + param3 - -((jr) this).field_b;
              if (param0 >= 10) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            var7 = ((jr) this).field_g + param2 + -param4;
            if (((jr) this).field_d * ((jr) this).field_d <= var7 * var7 + var6_int * var6_int) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "jr.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, je param1, int param2, byte[] param3, int param4, je param5, int param6, int param7, int param8, je param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              uf.field_a = param7;
              t.field_b = param3;
              oh.field_H = -1L;
              tq.field_b = param3.length;
              no.field_K = null;
              ua.field_s = false;
              if (param8 < -52) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            ln.field_d = new byte[(uf.field_a + 7) / 8];
            vu.field_M = null;
            var10_int = 0;
            var11 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~t.field_b.length >= ~var11) {
                    break L4;
                  } else {
                    var10_int = var10_int + (t.field_b[var11] & 255);
                    var11++;
                    if (var12 != 0) {
                      break L3;
                    } else {
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var10_int = (7 + var10_int) / 8;
                tg.field_d = new byte[var10_int];
                break L3;
              }
              L5: {
                if (param9.field_fb != null) {
                  break L5;
                } else {
                  param9.field_fb = new at();
                  break L5;
                }
              }
              L6: {
                be.field_u = param9.field_fb;
                be.field_u.b(80);
                oi.field_d = new tp(param4);
                vj.field_a = 0;
                be.field_s = -1;
                oo.field_a = 0;
                al.field_g = -1;
                if (null != param1.field_fb) {
                  break L6;
                } else {
                  param1.field_fb = new at();
                  break L6;
                }
              }
              L7: {
                qc.field_g = param1.field_fb;
                qc.field_g.b(120);
                qm.field_J = new tp(param6);
                if (null != param5.field_fb) {
                  break L7;
                } else {
                  param5.field_fb = new at();
                  break L7;
                }
              }
              wl.field_F = param5.field_fb;
              wl.field_F.b(122);
              eu.field_e = new tp(param0);
              qd.field_K = param2;
              ph.field_d = 0L;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var10;
            stackOut_22_1 = new StringBuilder().append("jr.D(").append(param0).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param4).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param5 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param9 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L11;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has used <%1>";
        field_h = new int[][]{new int[5], new int[5], new int[5], new int[5]};
        field_f = null;
    }
}
