/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        if (param0) {
            field_e = null;
            return cg.field_j;
        }
        return cg.field_j;
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return null;
        }
        if (!(du.field_d != oh.field_L)) {
            return qk.field_b;
        }
        return ah.field_d;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 <= 52) {
            jr.b(125);
            field_f = null;
            field_h = null;
            return;
        }
        field_f = null;
        field_h = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param2) {
          if (((jr) this).field_a) {
            if (0 >= param0) {
              lw.field_ob.d(((jr) this).field_b + (param3 - 20), -20 + param1 + ((jr) this).field_g, fe.b(bo.field_g[((jr) this).field_c], 128));
              if ((((jr) this).field_i ^ -1) == -82) {
                pl.field_x[4].g(-20 + (param3 + ((jr) this).field_b), param1 - -((jr) this).field_g + -20, 0);
                km.field_h[0].g(-23 + param3 - -((jr) this).field_b, -23 + (param1 + ((jr) this).field_g), 10);
                return;
              } else {
                pl.field_x[((jr) this).field_i].g(-20 + ((jr) this).field_b + param3, -20 + (param1 - -((jr) this).field_g), 0);
                km.field_h[0].g(-23 + param3 - -((jr) this).field_b, -23 + (param1 + ((jr) this).field_g), 10);
                return;
              }
            } else {
              if (!((jr) this).b(31, sm.field_d, param1, param3, ko.field_b)) {
                lw.field_ob.d(-20 + ((jr) this).field_b + param3, param1 + ((jr) this).field_g - 20, bo.field_g[((jr) this).field_c]);
                if ((((jr) this).field_i ^ -1) != -82) {
                  pl.field_x[((jr) this).field_i].g(((jr) this).field_b + param3 + -20, ((jr) this).field_g + param1 + -20);
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                } else {
                  pl.field_x[4].g(-20 + ((jr) this).field_b + param3, -20 + (param1 + ((jr) this).field_g));
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                }
              } else {
                lw.field_ob.b(param3 - (-((jr) this).field_b - -20), -20 + (((jr) this).field_g + param1), bo.field_g[((jr) this).field_c]);
                if ((((jr) this).field_i ^ -1) != -82) {
                  pl.field_x[((jr) this).field_i].g(((jr) this).field_b + param3 + -20, ((jr) this).field_g + param1 + -20);
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                } else {
                  pl.field_x[4].g(-20 + ((jr) this).field_b + param3, -20 + (param1 + ((jr) this).field_g));
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                }
              }
            }
          } else {
            if (-1 <= (param0 ^ -1)) {
              hr.field_d[((jr) this).field_c].g(param3 - (-((jr) this).field_b - -25), -25 + (((jr) this).field_g + param1), 128);
              fe.a(((jr) this).field_b + param3, param1 - -((jr) this).field_g, ((jr) this).field_c, param0, fe.field_b);
              return;
            } else {
              if (!((jr) this).b(112, sm.field_d, param1, param3, ko.field_b)) {
                hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 - 25, param1 + (((jr) this).field_g + -25));
                fe.a(((jr) this).field_b + param3, param1 - -((jr) this).field_g, ((jr) this).field_c, param0, fe.field_b);
                return;
              } else {
                hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 + -25, param1 + (((jr) this).field_g - 25));
                hr.field_d[0].f(param3 + (((jr) this).field_b + -25), -25 + ((jr) this).field_g + param1, 256);
                fe.a(((jr) this).field_b + param3, param1 - -((jr) this).field_g, ((jr) this).field_c, param0, fe.field_b);
                return;
              }
            }
          }
        } else {
          int discarded$1 = jr.a(false);
          if (((jr) this).field_a) {
            if (0 >= param0) {
              lw.field_ob.d(((jr) this).field_b + (param3 - 20), -20 + param1 + ((jr) this).field_g, fe.b(bo.field_g[((jr) this).field_c], 128));
              if ((((jr) this).field_i ^ -1) == -82) {
                pl.field_x[4].g(-20 + (param3 + ((jr) this).field_b), param1 - -((jr) this).field_g + -20, 0);
                km.field_h[0].g(-23 + param3 - -((jr) this).field_b, -23 + (param1 + ((jr) this).field_g), 10);
                return;
              } else {
                pl.field_x[((jr) this).field_i].g(-20 + ((jr) this).field_b + param3, -20 + (param1 - -((jr) this).field_g), 0);
                km.field_h[0].g(-23 + param3 - -((jr) this).field_b, -23 + (param1 + ((jr) this).field_g), 10);
                return;
              }
            } else {
              if (!((jr) this).b(31, sm.field_d, param1, param3, ko.field_b)) {
                L0: {
                  lw.field_ob.d(-20 + ((jr) this).field_b + param3, param1 + ((jr) this).field_g - 20, bo.field_g[((jr) this).field_c]);
                  if ((((jr) this).field_i ^ -1) != -82) {
                    pl.field_x[((jr) this).field_i].g(((jr) this).field_b + param3 + -20, ((jr) this).field_g + param1 + -20);
                    break L0;
                  } else {
                    pl.field_x[4].g(-20 + ((jr) this).field_b + param3, -20 + (param1 + ((jr) this).field_g));
                    break L0;
                  }
                }
                km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                return;
              } else {
                lw.field_ob.b(param3 - (-((jr) this).field_b - -20), -20 + (((jr) this).field_g + param1), bo.field_g[((jr) this).field_c]);
                if ((((jr) this).field_i ^ -1) != -82) {
                  pl.field_x[((jr) this).field_i].g(((jr) this).field_b + param3 + -20, ((jr) this).field_g + param1 + -20);
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                } else {
                  pl.field_x[4].g(-20 + ((jr) this).field_b + param3, -20 + (param1 + ((jr) this).field_g));
                  km.field_h[0].g(-23 + (((jr) this).field_b + param3), -23 + param1 + ((jr) this).field_g);
                  return;
                }
              }
            }
          } else {
            L1: {
              if (-1 <= (param0 ^ -1)) {
                hr.field_d[((jr) this).field_c].g(param3 - (-((jr) this).field_b - -25), -25 + (((jr) this).field_g + param1), 128);
                break L1;
              } else {
                if (!((jr) this).b(112, sm.field_d, param1, param3, ko.field_b)) {
                  hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 - 25, param1 + (((jr) this).field_g + -25));
                  break L1;
                } else {
                  hr.field_d[((jr) this).field_c].g(((jr) this).field_b + param3 + -25, param1 + (((jr) this).field_g - 25));
                  hr.field_d[0].f(param3 + (((jr) this).field_b + -25), -25 + ((jr) this).field_g + param1, 256);
                  break L1;
                }
              }
            }
            fe.a(((jr) this).field_b + param3, param1 - -((jr) this).field_g, ((jr) this).field_c, param0, fe.field_b);
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var9 = 0;
        int var7 = 0;
        int var6 = 0;
        int var10 = 0;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        param0 = param0 | param0 << -172819416;
        int var5 = param0 ^ param0 >> 399360353;
        int var8 = -74 % ((55 - param1) / 32);
        for (var9 = 0; -5 < (var9 ^ -1); var9++) {
            var7 = (7 & param0) + param2 + (bm.field_y[var9][1] - 64);
            var6 = -54 + (param4 + (bm.field_y[var9][0] - -(var5 & 15)));
            var10 = (param0 + param3 / (4 + (param0 & 3))) % 3;
            param0 = param0 >> 1;
            var5 = var5 >> 1;
            jq.field_G[var10].h(60 + var6, 50 + var7);
        }
    }

    jr(boolean param0, int param1, int param2, int param3) {
        ((jr) this).field_d = param3;
        ((jr) this).field_a = param0 ? true : false;
        ((jr) this).field_c = param1;
        ((jr) this).field_i = param2;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var6 = -param1 + param3 - -((jr) this).field_b;
        if (param0 < 10) {
            field_e = null;
            var7 = ((jr) this).field_g + param2 + -param4;
            if (((jr) this).field_d * ((jr) this).field_d > var7 * var7 + var6 * var6) {
                return true;
            }
            return false;
        }
        var7 = ((jr) this).field_g + param2 + -param4;
        if (((jr) this).field_d * ((jr) this).field_d > var7 * var7 + var6 * var6) {
            return true;
        }
        return false;
    }

    final static void a(int param0, je param1, int param2, byte[] param3, int param4, je param5, int param6, int param7, int param8, je param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        uf.field_a = param7;
        t.field_b = param3;
        oh.field_H = -1L;
        tq.field_b = param3.length;
        no.field_K = null;
        ua.field_s = false;
        if (param8 < -52) {
          ln.field_d = new byte[(uf.field_a + 7) / 8];
          vu.field_M = null;
          var10 = 0;
          var11 = 0;
          L0: while (true) {
            if ((t.field_b.length ^ -1) >= (var11 ^ -1)) {
              var10 = (7 + var10) / 8;
              tg.field_d = new byte[var10];
              if (param9.field_fb == null) {
                param9.field_fb = new at();
                be.field_u = param9.field_fb;
                be.field_u.b(80);
                oi.field_d = new tp(param4);
                vj.field_a = 0;
                be.field_s = -1;
                oo.field_a = 0;
                al.field_g = -1;
                if (null == param1.field_fb) {
                  L1: {
                    param1.field_fb = new at();
                    qc.field_g = param1.field_fb;
                    qc.field_g.b(120);
                    qm.field_J = new tp(param6);
                    if (null != param5.field_fb) {
                      break L1;
                    } else {
                      param5.field_fb = new at();
                      break L1;
                    }
                  }
                  wl.field_F = param5.field_fb;
                  wl.field_F.b(122);
                  eu.field_e = new tp(param0);
                  qd.field_K = param2;
                  ph.field_d = 0L;
                  return;
                } else {
                  L2: {
                    qc.field_g = param1.field_fb;
                    qc.field_g.b(120);
                    qm.field_J = new tp(param6);
                    if (null != param5.field_fb) {
                      break L2;
                    } else {
                      param5.field_fb = new at();
                      break L2;
                    }
                  }
                  wl.field_F = param5.field_fb;
                  wl.field_F.b(122);
                  eu.field_e = new tp(param0);
                  qd.field_K = param2;
                  ph.field_d = 0L;
                  return;
                }
              } else {
                L3: {
                  be.field_u = param9.field_fb;
                  be.field_u.b(80);
                  oi.field_d = new tp(param4);
                  vj.field_a = 0;
                  be.field_s = -1;
                  oo.field_a = 0;
                  al.field_g = -1;
                  if (null != param1.field_fb) {
                    break L3;
                  } else {
                    param1.field_fb = new at();
                    break L3;
                  }
                }
                L4: {
                  qc.field_g = param1.field_fb;
                  qc.field_g.b(120);
                  qm.field_J = new tp(param6);
                  if (null != param5.field_fb) {
                    break L4;
                  } else {
                    param5.field_fb = new at();
                    break L4;
                  }
                }
                wl.field_F = param5.field_fb;
                wl.field_F.b(122);
                eu.field_e = new tp(param0);
                qd.field_K = param2;
                ph.field_d = 0L;
                return;
              }
            } else {
              var10 = var10 + (t.field_b[var11] & 255);
              var11++;
              continue L0;
            }
          }
        } else {
          field_h = null;
          ln.field_d = new byte[(uf.field_a + 7) / 8];
          vu.field_M = null;
          var10 = 0;
          var11 = 0;
          L5: while (true) {
            if ((t.field_b.length ^ -1) >= (var11 ^ -1)) {
              var10 = (7 + var10) / 8;
              tg.field_d = new byte[var10];
              if (param9.field_fb != null) {
                be.field_u = param9.field_fb;
                be.field_u.b(80);
                oi.field_d = new tp(param4);
                vj.field_a = 0;
                be.field_s = -1;
                oo.field_a = 0;
                al.field_g = -1;
                if (null != param1.field_fb) {
                  qc.field_g = param1.field_fb;
                  qc.field_g.b(120);
                  qm.field_J = new tp(param6);
                  if (null != param5.field_fb) {
                    wl.field_F = param5.field_fb;
                    wl.field_F.b(122);
                    eu.field_e = new tp(param0);
                    qd.field_K = param2;
                    ph.field_d = 0L;
                    return;
                  } else {
                    param5.field_fb = new at();
                    wl.field_F = param5.field_fb;
                    wl.field_F.b(122);
                    eu.field_e = new tp(param0);
                    qd.field_K = param2;
                    ph.field_d = 0L;
                    return;
                  }
                } else {
                  L6: {
                    param1.field_fb = new at();
                    qc.field_g = param1.field_fb;
                    qc.field_g.b(120);
                    qm.field_J = new tp(param6);
                    if (null != param5.field_fb) {
                      break L6;
                    } else {
                      param5.field_fb = new at();
                      break L6;
                    }
                  }
                  wl.field_F = param5.field_fb;
                  wl.field_F.b(122);
                  eu.field_e = new tp(param0);
                  qd.field_K = param2;
                  ph.field_d = 0L;
                  return;
                }
              } else {
                L7: {
                  param9.field_fb = new at();
                  be.field_u = param9.field_fb;
                  be.field_u.b(80);
                  oi.field_d = new tp(param4);
                  vj.field_a = 0;
                  be.field_s = -1;
                  oo.field_a = 0;
                  al.field_g = -1;
                  if (null != param1.field_fb) {
                    break L7;
                  } else {
                    param1.field_fb = new at();
                    break L7;
                  }
                }
                L8: {
                  qc.field_g = param1.field_fb;
                  qc.field_g.b(120);
                  qm.field_J = new tp(param6);
                  if (null != param5.field_fb) {
                    break L8;
                  } else {
                    param5.field_fb = new at();
                    break L8;
                  }
                }
                wl.field_F = param5.field_fb;
                wl.field_F.b(122);
                eu.field_e = new tp(param0);
                qd.field_K = param2;
                ph.field_d = 0L;
                return;
              }
            } else {
              var10 = var10 + (t.field_b[var11] & 255);
              var11++;
              continue L5;
            }
          }
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
