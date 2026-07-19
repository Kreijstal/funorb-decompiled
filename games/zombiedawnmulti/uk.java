/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends gn {
    static ka[] field_M;
    private int field_Q;
    static String field_R;
    static int field_S;
    private j field_P;
    static boolean field_O;
    static boolean field_N;

    final static void a(byte param0, vl param1, int param2) {
        ga var3 = null;
        try {
            if (param0 != 127) {
                field_M = (ka[]) null;
            }
            var3 = ma.field_a;
            var3.b((byte) -35, param2);
            var3.a(param0 ^ -41, param1.field_g);
            var3.a(param1.field_i, (byte) -92);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "uk.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        re var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ja var12 = null;
        ja var14 = null;
        ja var23 = null;
        ja var24 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (-1 == (param2 ^ -1)) {
          var5 = (this.field_n >> 1183933857) + param3 + this.field_y;
          var6 = param1 - (-this.field_i + -(this.field_w >> 161119777));
          var8 = this.field_P.d(80);
          if (var8 != h.field_H) {
            if (ua.field_I != var8) {
              if (var8 == jq.field_b) {
                var12 = rj.field_I[2];
                var12.e(var5 + -(var12.field_x >> 830916129), -(var12.field_w >> 868244353) + var6, 256);
                if (var11 != 0) {
                  if (db.field_b == var8) {
                    var23 = rj.field_I[1];
                    var23.e(var5 + -(var23.field_x >> -1562977759), -(var23.field_w >> -1754107935) + var6, 256);
                    if (var11 != 0) {
                      var24 = rj.field_I[0];
                      var9 = var24.field_z << -1234884639;
                      var10 = var24.field_u << 1669989665;
                      if (null != bp.field_s) {
                        if (var9 <= bp.field_s.field_x) {
                          if (bp.field_s.field_w >= var10) {
                            r.a(0, bp.field_s);
                            oo.b();
                            if (var11 != 0) {
                              bp.field_s = new ja(var9, var10);
                              r.a(0, bp.field_s);
                              var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                              ql.a(true);
                              bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                              return;
                            } else {
                              var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                              ql.a(true);
                              bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                              return;
                            }
                          } else {
                            bp.field_s = new ja(var9, var10);
                            r.a(0, bp.field_s);
                            var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                            ql.a(true);
                            bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                            return;
                          }
                        } else {
                          bp.field_s = new ja(var9, var10);
                          r.a(0, bp.field_s);
                          var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                          ql.a(true);
                          bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                          return;
                        }
                      } else {
                        bp.field_s = new ja(var9, var10);
                        r.a(0, bp.field_s);
                        var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                        ql.a(true);
                        bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (db.field_b == var8) {
                  var23 = rj.field_I[1];
                  var23.e(var5 + -(var23.field_x >> -1562977759), -(var23.field_w >> -1754107935) + var6, 256);
                  if (var11 != 0) {
                    var24 = rj.field_I[0];
                    var9 = var24.field_z << -1234884639;
                    var10 = var24.field_u << 1669989665;
                    if (null != bp.field_s) {
                      if (var9 <= bp.field_s.field_x) {
                        if (bp.field_s.field_w >= var10) {
                          r.a(0, bp.field_s);
                          oo.b();
                          if (var11 != 0) {
                            bp.field_s = new ja(var9, var10);
                            r.a(0, bp.field_s);
                            var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                            ql.a(true);
                            bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                            return;
                          } else {
                            var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                            ql.a(true);
                            bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                            return;
                          }
                        } else {
                          bp.field_s = new ja(var9, var10);
                          r.a(0, bp.field_s);
                          var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                          ql.a(true);
                          bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                          return;
                        }
                      } else {
                        bp.field_s = new ja(var9, var10);
                        r.a(0, bp.field_s);
                        var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                        ql.a(true);
                        bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                        return;
                      }
                    } else {
                      bp.field_s = new ja(var9, var10);
                      r.a(0, bp.field_s);
                      var24.a(112, 144, var24.field_z << 1534460036, var24.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                      ql.a(true);
                      bp.field_s.e(var5 + -var24.field_z, var6 - var24.field_u, 256);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var14 = rj.field_I[0];
              var9 = var14.field_z << -1234884639;
              var10 = var14.field_u << 1669989665;
              if (null != bp.field_s) {
                if (var9 <= bp.field_s.field_x) {
                  if (bp.field_s.field_w >= var10) {
                    r.a(0, bp.field_s);
                    oo.b();
                    if (var11 != 0) {
                      bp.field_s = new ja(var9, var10);
                      r.a(0, bp.field_s);
                      var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                      ql.a(true);
                      bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
                      return;
                    } else {
                      var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                      ql.a(true);
                      bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
                      return;
                    }
                  } else {
                    bp.field_s = new ja(var9, var10);
                    r.a(0, bp.field_s);
                    var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                    ql.a(true);
                    bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
                    return;
                  }
                } else {
                  bp.field_s = new ja(var9, var10);
                  r.a(0, bp.field_s);
                  var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                  ql.a(true);
                  bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
                  return;
                }
              } else {
                bp.field_s = new ja(var9, var10);
                r.a(0, bp.field_s);
                var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                ql.a(true);
                bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
                return;
              }
            }
          } else {
            var14 = rj.field_I[0];
            var9 = var14.field_z << -1234884639;
            var10 = var14.field_u << 1669989665;
            if (null != bp.field_s) {
              if (var9 <= bp.field_s.field_x) {
                if (bp.field_s.field_w >= var10) {
                  r.a(0, bp.field_s);
                  oo.b();
                  if (var11 != 0) {
                    bp.field_s = new ja(var9, var10);
                    r.a(0, bp.field_s);
                    var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                    ql.a(true);
                    bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
                    return;
                  } else {
                    var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                    ql.a(true);
                    bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
                    return;
                  }
                } else {
                  bp.field_s = new ja(var9, var10);
                  r.a(0, bp.field_s);
                  var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                  ql.a(true);
                  bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
                  return;
                }
              } else {
                bp.field_s = new ja(var9, var10);
                r.a(0, bp.field_s);
                var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
                ql.a(true);
                bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
                return;
              }
            } else {
              bp.field_s = new ja(var9, var10);
              r.a(0, bp.field_s);
              var14.a(112, 144, var14.field_z << 1534460036, var14.field_u << 2014194468, -this.field_Q << -1973923798, 4096);
              ql.a(true);
              bp.field_s.e(var5 + -var14.field_z, var6 - var14.field_u, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final String d(byte param0) {
        if (!(!this.field_l)) {
            return this.field_P.c(-117);
        }
        int var2 = -107 % ((param0 - 53) / 57);
        return null;
    }

    final void a(int param0, cf param1, int param2, int param3) {
        try {
            this.field_Q = this.field_Q + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "uk.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    uk(j param0) {
        try {
            this.field_P = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.a(-69, -75, 99, -52);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("uk.S(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void f(int param0) {
        if (param0 != -1562977759) {
            return;
        }
        field_R = null;
        field_M = null;
    }

    final static boolean a(byte param0) {
        boolean discarded$6 = false;
        if (param0 >= -36) {
            discarded$6 = uk.a((byte) 99);
            return !sh.field_L ? true : false;
        }
        return !sh.field_L ? true : false;
    }

    static {
        field_S = 256;
        field_R = "(<%0> players want to join)";
    }
}
