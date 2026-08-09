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
        if (param0 >= -21) {
            return 83;
        }
        return (param1 - 100) / 200;
    }

    final static void a(pf param0, boolean param1) throws jn {
        RuntimeException runtimeException = null;
        nc var3 = null;
        nc var4 = null;
        nc var5 = null;
        int var6 = 0;
        pf var7 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                hl.a((byte) -92);
                break L1;
              }
            }
            var7 = new pf();
            var3 = (nc) ((Object) param0.h(72));
            var4 = var3;
            var7.a((byte) -113, var4);
            L2: while (true) {
              L3: {
                if (param0.g(-87)) {
                  break L3;
                } else {
                  L4: {
                    if (null == var4.field_k) {
                      var5 = (nc) ((Object) param0.d(0));
                      L5: while (true) {
                        L6: {
                          if (var5 == null) {
                            break L6;
                          } else {
                            if (var5.field_r == null) {
                              break L6;
                            } else {
                              var5 = (nc) ((Object) param0.a((byte) -71));
                              continue L5;
                            }
                          }
                        }
                        if (var5 != null) {
                          var4 = var5;
                          break L4;
                        } else {
                          if (null != var3.field_r) {
                            if (var4.field_r == null) {
                              break L4;
                            } else {
                              throw new jn("Border linkage incorrect: Can't find an unclipped edge.");
                            }
                          } else {
                            var4 = var3;
                            break L4;
                          }
                        }
                      }
                    } else {
                      if (var4.field_k.field_r != var4) {
                        throw new jn("Border linkage incorrect: v2.v1 != v");
                      } else {
                        var4 = var4.field_k;
                        break L4;
                      }
                    }
                  }
                  if (var3 != var4) {
                    var7.a((byte) -113, var4);
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              param0.field_h = var7.field_h;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (runtimeException);

            stackIn_27_1 = new StringBuilder().append("hl.C(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_I = null;
        field_D = null;
        field_E = null;
        field_K = null;
        if (param0 <= 17) {
            field_H = (String) null;
        }
        field_H = null;
        field_J = null;
    }

    final String c(boolean param0) {
        if (this.field_k) {
            return this.field_G.a((byte) -63);
        }
        if (param0) {
            return null;
        }
        return (String) null;
    }

    final boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 86 % ((61 - param0) / 59);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("hl.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        try {
            this.field_F = this.field_F + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hl.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static bi[] a(byte param0, int param1) {
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = ShatteredPlansClient.field_F ? 1 : 0;
        ra.a(-107);
        bi[] var16 = new bi[param1];
        bi[] var2 = var16;
        bi var3 = new bi(240, 120);
        int var4 = 0;
        if (param0 != 111) {
            hl.a((byte) 53);
        }
        while (var4 < param1) {
            var3.e();
            gf.b();
            for (var5 = 0; -5 < (var5 ^ -1); var5++) {
                var6 = (double)(param1 * (3 + var5) + var4) * 6.283185307179586;
                var8 = Math.sin(var6 / (double)(param1 * 4));
                var10 = Math.cos(var6 / (double)(param1 * 4));
                var12 = (int)(12288.0 / (var10 + 3.0));
                var13 = 1920 + (int)(var8 * 2400.0 / (3.0 + var10));
                var14 = (int)(1920.0 / (3.0 + var10));
                e.field_e.b(e.field_e.field_o << -201372573, e.field_e.field_p << 1482706371, var13, var14, 0, var12);
            }
            var2[var4] = new bi(60, 30);
            var16[var4].e();
            var3.g(0, 0);
            var4++;
        }
        cg.i(0);
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        u var8;
        int var9;
        int var10;
        int var11;
        bi var12;
        bi var13;
        bi var14;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        super.a(param0, param1 + 0, param2, param3);
        if (-1 == (param0 ^ -1)) {
          var5 = (this.field_x >> 352021153) + (param3 - -this.field_m);
          var6 = (this.field_n >> 1330105825) + param2 - -this.field_q;
          if (param1 == -11857) {
            L0: {
              L1: {
                var8 = this.field_G.c(param1 + 11730);
                if (pd.field_h == var8) {
                  break L1;
                } else {
                  if (lm.field_d == var8) {
                    break L1;
                  } else {
                    if (tj.field_b == var8) {
                      var13 = lp.field_w[2];
                      var13.c(-(var13.field_z >> -1508432063) + var5, var6 + -(var13.field_w >> -187589631), 256);
                      break L0;
                    } else {
                      if (p.field_g == var8) {
                        var12 = lp.field_w[1];
                        var12.c(-(var12.field_z >> 1459417409) + var5, -(var12.field_w >> -1746091743) + var6, 256);
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
                  var9 = var14.field_o << -1487344095;
                  var10 = var14.field_p << 120650913;
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
              var14.b(112, 144, var14.field_o << -1574392124, var14.field_p << -1809550460, -this.field_F << 616613738, 4096);
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
            this.field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = "Players: ";
        field_J = "Reject";
        field_D = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
