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
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hi stackOut_7_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -26) {
                break L1;
              } else {
                field_K = (ie) null;
                break L1;
              }
            }
            if (param2 != null) {
              if (-137 > (param2.length ^ -1)) {
                var3 = new hi();
                ((mb) ((Object) var3)).a(param2, (byte) 2);
                stackOut_7_0 = (hi) (var3);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!param0) {
                  stackOut_12_0 = (byte[]) (param2);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_10_0 = jj.a(param2, (byte) 91);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("pj.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final static void a(boolean param0, re param1, boolean param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              Pool.field_L[0] = lc.field_P.nextInt();
              Pool.field_L[1] = lc.field_P.nextInt();
              Pool.field_L[2] = (int)(Pool.field_Q >> -98300704);
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
            L8: {
              ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, ej.field_j);
              ej.field_j.c(ej.field_j.field_v + -var5_int, (byte) -92);
              de.a(-1, 0);
              if (param3 == -98300704) {
                break L8;
              } else {
                pj.b(false);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("pj.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        this.a(mc.field_e, new int[]{mc.field_e.field_G}, 100, -16097, ng.field_B, 320, 4);
        this.b(100, false);
    }

    public static void b(boolean param0) {
        field_I = null;
        field_H = null;
        if (param0) {
            return;
        }
        field_K = null;
        field_J = null;
    }

    final static void f(int param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        dd var7 = null;
        dd var8 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          L0: {
            qh.b(243, 197, 369, 143, 16777215);
            qh.f(244, 198, 367, 141, 0);
            if (nf.field_V != null) {
              L1: {
                var6 = nf.field_V[rj.field_f];
                if (param0 == -1) {
                  break L1;
                } else {
                  field_K = (ie) null;
                  break L1;
                }
              }
              L2: {
                if (var6 != null) {
                  var6.c(245, 199);
                  break L2;
                } else {
                  if (so.field_h != null) {
                    discarded$3 = so.field_h.a(o.field_A, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (ug.field_u >= hj.field_l) {
                  break L3;
                } else {
                  var7 = nf.field_V[cf.field_b];
                  if (var7 != null) {
                    var2_int = (var7.field_w + 60) * ug.field_u / hj.field_l;
                    var3 = var2_int - 30;
                    if (!b.field_K) {
                      ml.a(var3 * -256 / 30, (byte) 63, 245, 199, var7, (var7.field_w + -var3) * 256 / 30);
                      break L3;
                    } else {
                      ml.a((-var3 + var7.field_w) * 256 / 30, (byte) 117, 245, 199, var7, var3 * -256 / 30);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (so.field_h == null) {
                  break L4;
                } else {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L5: while (true) {
                    if (var5 >= nf.field_V.length) {
                      if (var2 == null) {
                        break L4;
                      } else {
                        discarded$4 = so.field_h.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L4;
                      }
                    } else {
                      L6: {
                        var8 = nf.field_V[var5];
                        if (var8 != null) {
                          L7: {
                            if (365 != var8.field_w) {
                              break L7;
                            } else {
                              if ((var8.field_y ^ -1) != -140) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var2 != null) {
                            var2 = (String) (var2) + ", " + var5;
                            break L6;
                          } else {
                            var2 = Integer.toString(var5);
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L8: {
                if (null != so.field_h) {
                  discarded$5 = so.field_h.a(o.field_A, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L8;
                } else {
                  break L8;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "pj.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_H = new ko();
        field_K = new ie();
        field_I = null;
    }
}
