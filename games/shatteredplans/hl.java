/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends kg {
    private gk field_G;
    static String field_H;
    static nk[] field_E;
    private int field_F;
    static String field_J;
    static qr field_K;
    static String field_D;
    static qr field_I;

    final static int a(int param0, int param1) {
        return (param1 - 100) / 200;
    }

    final static void a(pf param0) throws jn {
        RuntimeException runtimeException = null;
        nc var3 = null;
        nc var4 = null;
        nc var5 = null;
        int var6 = 0;
        pf var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7 = new pf();
            var3 = (nc) (Object) param0.h(72);
            var4 = var3;
            var7.a((byte) -113, (oh) (Object) var4);
            L1: while (true) {
              L2: {
                if (param0.g(-87)) {
                  break L2;
                } else {
                  L3: {
                    if (null == var4.field_k) {
                      var5 = (nc) (Object) param0.d(0);
                      L4: while (true) {
                        L5: {
                          if (var5 == null) {
                            break L5;
                          } else {
                            if (var5.field_r == null) {
                              break L5;
                            } else {
                              var5 = (nc) (Object) param0.a((byte) -71);
                              continue L4;
                            }
                          }
                        }
                        if (var5 != null) {
                          var4 = var5;
                          break L3;
                        } else {
                          if (null != var3.field_r) {
                            if (var4.field_r == null) {
                              break L3;
                            } else {
                              throw new jn("Border linkage incorrect: Can't find an unclipped edge.");
                            }
                          } else {
                            var4 = var3;
                            break L3;
                          }
                        }
                      }
                    } else {
                      if (var4.field_k.field_r != var4) {
                        throw new jn("Border linkage incorrect: v2.v1 != v");
                      } else {
                        var4 = var4.field_k;
                        break L3;
                      }
                    }
                  }
                  if (var3 != var4) {
                    var7.a((byte) -113, (oh) (Object) var4);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              param0.field_h = var7.field_h;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) runtimeException;
            stackOut_23_1 = new StringBuilder().append("hl.C(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + true + ')');
        }
    }

    public static void a() {
        field_I = null;
        field_D = null;
        field_E = null;
        field_K = null;
        field_H = null;
        field_J = null;
    }

    final String c(boolean param0) {
        if (((hl) this).field_k) {
            return ((hl) this).field_G.a((byte) -63);
        }
        if (param0) {
            return null;
        }
        return null;
    }

    final boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 86 % ((61 - param0) / 59);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("hl.CA(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        try {
            ((hl) this).field_F = ((hl) this).field_F + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "hl.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static bi[] a(byte param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = ShatteredPlansClient.field_F ? 1 : 0;
        ra.a(-107);
        bi[] var16 = new bi[80];
        bi[] var2 = var16;
        bi var3 = new bi(240, 120);
        for (var4 = 0; var4 < 80; var4++) {
            var3.e();
            gf.b();
            for (var5 = 0; var5 < 4; var5++) {
                var6 = (double)(80 * (3 + var5) + var4) * 6.283185307179586;
                var8 = Math.sin(var6 / (double)320);
                var10 = Math.cos(var6 / (double)320);
                var12 = (int)(12288.0 / (var10 + 3.0));
                var13 = 1920 + (int)(var8 * 2400.0 / (3.0 + var10));
                var14 = (int)(1920.0 / (3.0 + var10));
                e.field_e.b(e.field_e.field_o << 3, e.field_e.field_p << 3, var13, var14, 0, var12);
            }
            var2[var4] = new bi(60, 30);
            var16[var4].e();
            var3.g(0, 0);
        }
        cg.i(0);
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        u var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bi var12 = null;
        bi var13 = null;
        bi var14 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param0 == 0) {
          var5 = (((hl) this).field_x >> 1) + (param3 - -((hl) this).field_m);
          var6 = (((hl) this).field_n >> 1) + param2 - -((hl) this).field_q;
          if (param1 == -11857) {
            L0: {
              L1: {
                var8 = ((hl) this).field_G.c(param1 + 11730);
                if (pd.field_h == var8) {
                  break L1;
                } else {
                  if (lm.field_d == var8) {
                    break L1;
                  } else {
                    if (tj.field_b == var8) {
                      var13 = lp.field_w[2];
                      var13.c(-(var13.field_z >> 1) + var5, var6 + -(var13.field_w >> 1), 256);
                      break L0;
                    } else {
                      if (p.field_g == var8) {
                        var12 = lp.field_w[1];
                        var12.c(-(var12.field_z >> 1) + var5, -(var12.field_w >> 1) + var6, 256);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
              L2: {
                L3: {
                  var14 = lp.field_w[0];
                  var9 = var14.field_o << 1;
                  var10 = var14.field_p << 1;
                  if (null == gg.field_e) {
                    break L3;
                  } else {
                    if (var9 > gg.field_e.field_z) {
                      break L3;
                    } else {
                      if (gg.field_e.field_w < var10) {
                        break L3;
                      } else {
                        aq.a((byte) 90, gg.field_e);
                        gf.b();
                        break L2;
                      }
                    }
                  }
                }
                gg.field_e = new bi(var9, var10);
                aq.a((byte) -107, gg.field_e);
                break L2;
              }
              var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((hl) this).field_F << 10, 4096);
              ln.f((byte) -94);
              gg.field_e.c(var5 - var14.field_o, -var14.field_p + var6, 256);
              break L0;
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    hl(gk param0) {
        try {
            ((hl) this).field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Players: ";
        field_J = "Reject";
        field_D = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
