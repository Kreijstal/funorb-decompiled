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

    public static void a(byte param0) {
        if (param0 != -90) {
            cq.a(-5);
        }
        field_g = null;
        field_d = null;
        field_f = null;
        field_b = null;
        field_e = null;
    }

    final static void a(boolean param0, int param1) {
        ig.field_j.a(param0, (byte) 118);
        if (param1 < 27) {
            field_a = -63;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static dd[] a(int param0, int param1, int param2, int param3) {
        int var6 = Pool.field_O;
        dd[] var7 = new dd[9];
        dd[] var4 = var7;
        var7[0] = ad.a(param2, param0, 7);
        int var5 = 1;
        if (param1 != 4578) {
            cq.a(true, -89);
        }
        while (var5 < 9) {
            var4[var5] = var4[0];
            var5++;
        }
        var4[4] = ad.a(param3, 64, param1 + -4571);
        return var4;
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (-1 == (param8 ^ -1)) {
          return -1;
        } else {
          L0: {
            var11 = lh.a(param8, (byte) -75, (long)(param0 + ((param1 << -490510896) + -param3)));
            var12 = lh.a(param8, (byte) -81, (long)(-param3 + (-(param1 << 412671888) + param0)));
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
            if (-1 <= (var12 ^ -1)) {
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
          if (param2 <= -61) {
            return -1;
          } else {
            return -43;
          }
        }
    }

    final static void a(int param0) {
        al.i(-27397);
        so.field_g = new hq[3];
        so.field_g[0] = new hq(jj.field_Q, -1, 3);
        so.field_g[0].field_d.b((byte) 110, new bk(fn.field_Ob, 100, 0));
        so.field_g[0].field_d.b((byte) -114, new bk(tj.field_eb, 50, 1, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -80, new bk(ie.field_i, 3, 2, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -50, new bk(je.field_a, 1, 3, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) 91, new bk(en.field_d, 300, 4, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) 88, new bk(na.field_b, 150, 5, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -78, new bk(el.field_L, 1, 7, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -110, new bk(om.field_t, 1, 6, so.field_g[0].field_d));
        so.field_g[0].field_d.b((byte) -74, new bk(vj.field_f, 1, -1, so.field_g[0].field_d));
        so.field_g[0].a(false);
        hq dupTemp$1 = new hq(fc.field_e, 2, 0);
        so.field_g[1] = dupTemp$1;
        so.field_g[0].field_j = dupTemp$1;
        if (param0 == 4313) {
          so.field_g[1].field_d.b((byte) -59, new bk(qq.field_yb, 40, 13, 128));
          so.field_g[1].field_d.b((byte) -43, new bk(dr.field_e, 1, 8, 0));
          so.field_g[1].field_d.b((byte) 99, new bk(ea.field_m, 1, 9, 0));
          so.field_g[1].field_d.b((byte) 87, new bk(gn.field_a, 7, 11, 0));
          so.field_g[1].field_d.b((byte) 99, new bk(lk.field_r, 1, 12, 0));
          so.field_g[1].field_d.b((byte) -6, new bk(g.field_w, 1, -1, 0));
          so.field_g[1].a(false);
          so.field_g[2] = new hq(ep.field_G, 2, 1);
          so.field_g[2].field_d.b((byte) -90, new bk(ca.field_m, 40, 13, 128));
          so.field_g[2].field_d.b((byte) -99, new bk(cf.field_i, 1, 8, 0));
          so.field_g[2].field_d.b((byte) -21, new bk(eq.field_N, 1, 14, 0));
          so.field_g[2].field_d.b((byte) -9, new bk(pl.field_c, 1, 15, 0));
          so.field_g[2].field_d.b((byte) -62, new bk(ui.field_N, 1, 16, 0));
          so.field_g[2].field_d.b((byte) 92, new bk(rc.field_a, 1, -1, 0));
          so.field_g[2].a(false);
          return;
        } else {
          return;
        }
    }

    final static eg a(int param0, int param1, int param2, eg param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        eg stackIn_3_0 = null;
        eg stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_12_0 = null;
        eg stackOut_2_0 = null;
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
                          stackOut_12_0 = (eg) (param3);
                          stackIn_13_0 = stackOut_12_0;
                          decompiledRegionSelector0 = 1;
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
              stackOut_2_0 = (eg) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("cq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_13_0;
        }
    }

    static {
        field_e = "Unpacking sound effects";
        field_g = new ko();
        field_f = "Enter name of friend to add to list";
    }
}
