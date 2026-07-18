/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends ob {
    static ko field_H;
    static ie field_K;
    static kb field_J;
    static String field_I;

    final static Object a(boolean param0, int param1, byte[] param2) {
        hi var3 = null;
        RuntimeException var3_ref = null;
        hi stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hi stackOut_7_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -26) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            if (param2 != null) {
              if (param2.length > 136) {
                var3 = new hi();
                ((mb) (Object) var3).a(param2, (byte) 2);
                stackOut_7_0 = (hi) var3;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return (Object) (Object) jj.a(param2, (byte) 91);
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("pj.B(").append(false).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return (Object) (Object) stackIn_8_0;
    }

    final static void a(boolean param0, re param1, boolean param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              Pool.field_L[0] = lc.field_P.nextInt();
              Pool.field_L[1] = lc.field_P.nextInt();
              Pool.field_L[2] = (int)(Pool.field_Q >> 32);
              Pool.field_L[3] = (int)Pool.field_Q;
              bc.field_b.field_v = 0;
              bc.field_b.a(true, Pool.field_L[0]);
              bc.field_b.a(true, Pool.field_L[1]);
              bc.field_b.a(true, Pool.field_L[2]);
              bc.field_b.a(true, Pool.field_L[3]);
              be.a(bc.field_b, 0);
              bc.field_b.a((byte) -81, param4);
              param1.a((byte) 121, bc.field_b);
              ej.field_j.field_v = 0;
              if (param0) {
                ej.field_j.a(18, false);
                break L1;
              } else {
                ej.field_j.a(16, false);
                break L1;
              }
            }
            L2: {
              ej.field_j.field_v = ej.field_j.field_v + 2;
              var5_int = ej.field_j.field_v;
              ej.field_j.a(true, im.field_ec);
              ej.field_j.a(kn.field_j, (byte) -80);
              var6 = 0;
              if (bf.field_g) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (hk.field_s) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param2) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (ri.field_N == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              ej.field_j.a(var6, false);
              var7 = eq.a(hk.d(90), (byte) 120);
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              ej.field_j.a(-9946, var7);
              if (null != ri.field_N) {
                ej.field_j.a(false, ri.field_N);
                break L7;
              } else {
                break L7;
              }
            }
            ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, (ge) (Object) ej.field_j);
            ej.field_j.c(ej.field_j.field_v + -var5_int, (byte) -92);
            de.a(-1, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("pj.C(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + -98300704 + ',' + param4 + ')');
        }
    }

    pj(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((dd) null, param0, param1, param2, param3, param4, param5);
    }

    final void c(int param0) {
        super.c(46);
        if (param0 <= 36) {
            return;
        }
        ((pj) this).a((lr) (Object) mc.field_e, new int[1], 100, -16097, ng.field_B, 320, 4);
        ((pj) this).b(100, false);
    }

    public static void b(boolean param0) {
        field_I = null;
        field_H = null;
        field_K = null;
        field_J = null;
    }

    final static void f(int param0) {
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        dd var7 = null;
        dd var8 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          L0: {
            qh.b(243, 197, 369, 143, 16777215);
            qh.f(244, 198, 367, 141, 0);
            if (nf.field_V != null) {
              L1: {
                var6 = nf.field_V[rj.field_f];
                if (var6 != null) {
                  var6.c(245, 199);
                  break L1;
                } else {
                  if (so.field_h != null) {
                    int discarded$3 = so.field_h.a(o.field_A, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (ug.field_u >= hj.field_l) {
                  break L2;
                } else {
                  var7 = nf.field_V[cf.field_b];
                  if (var7 != null) {
                    var2_int = (var7.field_w + 60) * ug.field_u / hj.field_l;
                    var3 = var2_int - 30;
                    if (!b.field_K) {
                      ml.a(var3 * -256 / 30, (byte) 63, 245, 199, var7, (var7.field_w + -var3) * 256 / 30);
                      break L2;
                    } else {
                      ml.a((-var3 + var7.field_w) * 256 / 30, (byte) 117, 245, 199, var7, var3 * -256 / 30);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (so.field_h == null) {
                  break L3;
                } else {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L4: while (true) {
                    if (var5 >= nf.field_V.length) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        int discarded$4 = so.field_h.a("Screenshot(s) " + (String) var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L3;
                      }
                    } else {
                      L5: {
                        var8 = nf.field_V[var5];
                        if (var8 != null) {
                          L6: {
                            if (365 != var8.field_w) {
                              break L6;
                            } else {
                              if (var8.field_y != 139) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (var2 != null) {
                            var2 = (Object) (Object) ((String) var2 + ", " + var5);
                            break L5;
                          } else {
                            var2 = (Object) (Object) Integer.toString(var5);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            } else {
              L7: {
                if (null != so.field_h) {
                  int discarded$5 = so.field_h.a(o.field_A, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "pj.E(" + -1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new ko();
        field_K = new ie();
        field_I = null;
    }
}
