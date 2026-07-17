/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    static String field_e;
    static int field_a;
    static dd[] field_b;
    static vh field_d;
    static ko field_g;
    static int field_c;
    static String field_f;

    public static void a() {
        field_g = null;
        field_d = null;
        field_f = null;
        field_b = null;
        field_e = null;
    }

    final static void a(boolean param0) {
        ig.field_j.a(param0, (byte) 118);
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static dd[] a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Pool.field_O;
        dd[] var7 = new dd[9];
        dd[] var4 = var7;
        int discarded$0 = 7;
        var7[0] = ad.a(param2, 1);
        for (var5 = 1; var5 < 9; var5++) {
            var4[var5] = var4[0];
        }
        int discarded$1 = 7;
        var4[4] = ad.a(param3, 64);
        return var4;
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param8 == 0) {
          return -1;
        } else {
          L0: {
            var11 = lh.a(param8, (byte) -75, (long)(param0 + (524288 + -param3)));
            var12 = lh.a(param8, (byte) -81, (long)(-param3 + (-524288 + param0)));
            if (0 >= var11) {
              break L0;
            } else {
              if (-param6 + 65536 < var11) {
                break L0;
              } else {
                if (var12 > var11) {
                  L1: {
                    var10 = param5 - -aj.a(var11, false, param4);
                    if (param7 < param9) {
                      if (param7 > var10) {
                        break L0;
                      } else {
                        if (var10 > param9) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      if (var10 < param9) {
                        break L0;
                      } else {
                        if (var10 > param7) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  return param6 + var11;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            if (var12 <= 0) {
              break L2;
            } else {
              if (65536 + -param6 < var12) {
                break L2;
              } else {
                L3: {
                  var10 = param5 - -aj.a(var12, false, param4);
                  if (param7 >= param9) {
                    if (var10 < param9) {
                      break L2;
                    } else {
                      if (param7 < var10) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (var10 < param7) {
                      break L2;
                    } else {
                      if (param9 < var10) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                return var12 + param6;
              }
            }
          }
          return -1;
        }
    }

    final static void a(int param0) {
        int discarded$0 = -27397;
        al.i();
        so.field_g = new hq[3];
        so.field_g[0] = new hq(jj.field_Q, -1, 3);
        so.field_g[0].field_d.b((byte) 110, (ma) (Object) new bk(fn.field_Ob, 100, 0));
        so.field_g[0].field_d.b((byte) -114, (ma) (Object) new bk(tj.field_eb, 50, 1, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -80, (ma) (Object) new bk(ie.field_i, 3, 2, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -50, (ma) (Object) new bk(je.field_a, 1, 3, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) 91, (ma) (Object) new bk(en.field_d, 300, 4, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) 88, (ma) (Object) new bk(na.field_b, 150, 5, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -78, (ma) (Object) new bk(el.field_L, 1, 7, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -110, (ma) (Object) new bk(om.field_t, 1, 6, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -74, (ma) (Object) new bk(vj.field_f, 1, -1, so.field_g[0].field_d));
        so.field_g[0].a(false);
        hq dupTemp$1 = new hq(fc.field_e, 2, 0);
        so.field_g[1] = dupTemp$1;
        so.field_g[0].field_j = dupTemp$1;
        so.field_g[1].field_d.b((byte) -59, (ma) (Object) new bk(qq.field_yb, 40, 13, 128));
        so.field_g[1].field_d.b((byte) -43, (ma) (Object) new bk(dr.field_e, 1, 8, 0));
        so.field_g[1].field_d.b((byte) 99, (ma) (Object) new bk(ea.field_m, 1, 9, 0));
        so.field_g[1].field_d.b((byte) 87, (ma) (Object) new bk(gn.field_a, 7, 11, 0));
        so.field_g[1].field_d.b((byte) 99, (ma) (Object) new bk(lk.field_r, 1, 12, 0));
        so.field_g[1].field_d.b((byte) -6, (ma) (Object) new bk(g.field_w, 1, -1, 0));
        so.field_g[1].a(false);
        so.field_g[2] = new hq(ep.field_G, 2, 1);
        so.field_g[2].field_d.b((byte) -90, (ma) (Object) new bk(ca.field_m, 40, 13, 128));
        so.field_g[2].field_d.b((byte) -99, (ma) (Object) new bk(cf.field_i, 1, 8, 0));
        so.field_g[2].field_d.b((byte) -21, (ma) (Object) new bk(eq.field_N, 1, 14, 0));
        so.field_g[2].field_d.b((byte) -9, (ma) (Object) new bk(pl.field_c, 1, 15, 0));
        so.field_g[2].field_d.b((byte) -62, (ma) (Object) new bk(ui.field_N, 1, 16, 0));
        so.field_g[2].field_d.b((byte) 92, (ma) (Object) new bk(rc.field_a, 1, -1, 0));
        so.field_g[2].a(false);
    }

    final static eg a(int param0, int param1, int param2, eg param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        eg stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            var5_int = 0;
            if (param1 > 53) {
              L1: while (true) {
                if (var5_int >= param3.field_g.length) {
                  var5_int = 0;
                  L2: while (true) {
                    if (param3.field_Y.length <= var5_int) {
                      var5_int = 0;
                      L3: while (true) {
                        if (var5_int >= param3.field_q.length) {
                          param3.a();
                          stackOut_12_0 = (eg) param3;
                          stackIn_13_0 = stackOut_12_0;
                          break L0;
                        } else {
                          param3.field_q[var5_int] = param3.field_q[var5_int] - param2;
                          var5_int++;
                          continue L3;
                        }
                      }
                    } else {
                      param3.field_Y[var5_int] = param3.field_Y[var5_int] - param4;
                      var5_int++;
                      continue L2;
                    }
                  }
                } else {
                  param3.field_g[var5_int] = param3.field_g[var5_int] - param0;
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (eg) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("cq.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param4 + 41);
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Unpacking sound effects";
        field_g = new ko();
        field_f = "Enter name of friend to add to list";
    }
}
