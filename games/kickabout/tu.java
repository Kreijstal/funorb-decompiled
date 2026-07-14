/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class tu extends ma implements hc {
    static String field_D;
    static gr field_E;
    static String field_C;

    final void a(int param0, pk param1) {
        ma.field_t = param1;
        ((tu) this).a(true, -1);
        ((tu) this).h((byte) 105);
        ((tu) this).l(-1);
        if (param0 < 97) {
            ((tu) this).a(108, false);
        }
        ((tu) this).m(10);
        ((tu) this).g(13);
        ((tu) this).e(6);
        ((tu) this).i(13);
        uc.field_A[10] = -1;
        uc.field_A[9] = -1;
        sn.field_g = new Vector();
        oa.a(false, (hc) this);
    }

    final static void b(int param0, int param1, int param2) {
        if (param0 != 15848) {
            tu.n((byte) 32);
        }
        ml var3 = or.field_d;
        var3.b(param1, (byte) -117);
        var3.a(param0 + -15721, 3);
        var3.a(109, 10);
        var3.g(-1207444472, param2);
    }

    private final void r(int param0) {
        L0: {
          if (param0 == 10) {
            break L0;
          } else {
            field_E = null;
            break L0;
          }
        }
    }

    public final boolean a(byte param0) {
        if (param0 < 63) {
            tu.n((byte) -47);
        }
        return true;
    }

    abstract void o(int param0);

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ii var5 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        L0: {
          var4 = Kickabout.field_G;
          if (e.field_m == null) {
            break L0;
          } else {
            if (e.field_m.field_b) {
              fd.h(0);
              ph.a((byte) -122);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          stackOut_4_0 = this;
          stackOut_4_1 = 0;
          stackIn_6_0 = stackOut_4_0;
          stackIn_6_1 = stackOut_4_1;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          if (e.field_m == null) {
            stackOut_6_0 = this;
            stackOut_6_1 = stackIn_6_1;
            stackOut_6_2 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            break L1;
          } else {
            stackOut_5_0 = this;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            break L1;
          }
        }
        L2: {
          ((tu) this).c(stackIn_7_1, stackIn_7_2 != 0);
          if (!nd.field_c) {
            break L2;
          } else {
            ma.field_t.a(7312);
            nd.field_c = false;
            break L2;
          }
        }
        L3: {
          if (uf.c(608)) {
            ((tu) this).n(-93);
            if (uf.c(608)) {
              return;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        this.s(-113);
        L4: {
          iu.a(17, id.field_v);
          if (!ma.field_t.a(true)) {
            break L4;
          } else {
            ma.field_t.b(12763);
            iu.field_h = true;
            break L4;
          }
        }
        L5: {
          if (la.a(100)) {
            break L5;
          } else {
            L6: while (true) {
              var5 = (ii) (Object) ve.field_R.b((byte) 127);
              if (var5 == null) {
                break L5;
              } else {
                wp.a(4, var5, 77);
                continue L6;
              }
            }
          }
        }
        L7: {
          if (param0 <= -25) {
            break L7;
          } else {
            ((tu) this).a(120);
            break L7;
          }
        }
        L8: {
          gw.b(5);
          vg.c(0, 0);
          if (!hq.a((byte) 10)) {
            break L8;
          } else {
            L9: {
              L10: {
                var2 = ((tu) this).i((byte) -65);
                if (-1 == (var2 ^ -1)) {
                  break L10;
                } else {
                  if (-2 == (var2 ^ -1)) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              ((tu) this).a(var2, (byte) 120);
              break L9;
            }
            L11: {
              var3 = 0;
              if ((var2 ^ -1) == -3) {
                var3 = 1;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (!((tu) this).m((byte) -120)) {
                break L12;
              } else {
                var3 = 1;
                break L12;
              }
            }
            L13: {
              if (!hq.a((byte) 10)) {
                var3 = 0;
                break L13;
              } else {
                break L13;
              }
            }
            if (var3 == 0) {
              break L8;
            } else {
              ws.a((byte) -113);
              break L8;
            }
          }
        }
    }

    public abstract void a(int param0, boolean param1);

    abstract boolean m(byte param0);

    private final void p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hc var6 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        L0: {
          var5 = Kickabout.field_G;
          var2 = 0;
          if (!n.a(false)) {
            if (ng.a(-4)) {
              if (nv.i(0)) {
                np.h(-1);
                break L0;
              } else {
                L1: {
                  var3 = pg.a(-3);
                  if (var3 != 2) {
                    if (3 != var3) {
                      if (var3 == 4) {
                        ql.a((byte) 50, false, hh.field_b);
                        dq.field_e = true;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      dw.a(true, 0);
                      break L1;
                    }
                  } else {
                    fd.h(0);
                    break L1;
                  }
                }
                ((tu) this).a(param0 + -18886, false);
                break L0;
              }
            } else {
              if (up.a((byte) -3)) {
                L2: {
                  stackOut_33_0 = this;
                  stackOut_33_1 = param0 + -18856;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  if (null == e.field_m) {
                    stackOut_35_0 = this;
                    stackOut_35_1 = stackIn_35_1;
                    stackOut_35_2 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    break L2;
                  } else {
                    stackOut_34_0 = this;
                    stackOut_34_1 = stackIn_34_1;
                    stackOut_34_2 = 1;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = ((tu) this).b(stackIn_36_1, stackIn_36_2 != 0);
                    if (-2 == (var3 ^ -1)) {
                      break L4;
                    } else {
                      if ((var3 ^ -1) == -3) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (null == e.field_m) {
                      break L5;
                    } else {
                      fd.h(0);
                      break L5;
                    }
                  }
                  if (-3 != (var3 ^ -1)) {
                    break L3;
                  } else {
                    js.a(param0 + 1477, so.a(-79));
                    break L3;
                  }
                }
                ((tu) this).a(param0 ^ -18870, false);
                break L0;
              } else {
                if (vi.c(2915)) {
                  if (!nv.i(0)) {
                    L6: {
                      var3 = df.g(-61);
                      if ((var3 ^ -1) == -2) {
                        ql.a((byte) 50, true, dg.field_f);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((tu) this).a(-25, false);
                    break L0;
                  } else {
                    np.h(-1);
                    break L0;
                  }
                } else {
                  if (!nv.i(0)) {
                    var2 = 1;
                    var3 = -1;
                    L7: while (true) {
                      if (!nk.b((byte) -59)) {
                        break L0;
                      } else {
                        L8: {
                          if (-1 == cc.field_e) {
                            if (cc.field_e != -1) {
                              break L8;
                            } else {
                              if (-1 == var3) {
                                break L8;
                              } else {
                                cc.field_e = var3;
                                var3 = -1;
                                break L8;
                              }
                            }
                          } else {
                            if (!ud.c(cc.field_e, param0 + -1831)) {
                              break L8;
                            } else {
                              var3 = cc.field_e;
                              continue L7;
                            }
                          }
                        }
                        var4 = 0;
                        L9: while (true) {
                          if (sn.field_g.size() <= var4) {
                            continue L7;
                          } else {
                            if (!((hc) sn.field_g.elementAt(var4)).a(param0 + -7345, cc.field_e, il.field_c)) {
                              var4++;
                              continue L9;
                            } else {
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    np.h(param0 + -18862);
                    break L0;
                  }
                }
              }
            }
          } else {
            ((tu) this).a(-25, false);
            break L0;
          }
        }
        L10: {
          var3 = 0;
          if (param0 == 18861) {
            break L10;
          } else {
            field_C = null;
            break L10;
          }
        }
        L11: while (true) {
          if (var3 >= sn.field_g.size()) {
            return;
          } else {
            L12: {
              var6 = (hc) sn.field_g.elementAt(var3);
              var6.a(param0 + -18886, var2 != 0);
              stackOut_61_0 = var2;
              stackIn_63_0 = stackOut_61_0;
              stackIn_62_0 = stackOut_61_0;
              if (var6.a((byte) 81)) {
                stackOut_63_0 = stackIn_63_0;
                stackOut_63_1 = 0;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                break L12;
              } else {
                stackOut_62_0 = stackIn_62_0;
                stackOut_62_1 = 1;
                stackIn_64_0 = stackOut_62_0;
                stackIn_64_1 = stackOut_62_1;
                break L12;
              }
            }
            var2 = stackIn_64_0 & stackIn_64_1;
            var3++;
            continue L11;
          }
        }
    }

    protected tu() {
    }

    abstract void a(int param0, byte param1);

    final void b(byte param0) {
        java.awt.Canvas var2 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        var2 = ln.l(64);
        if (!uf.c(608)) {
          wr.a(var2, -14142);
          return;
        } else {
          va.a(var2, pn.g(2368), 0);
          return;
        }
    }

    abstract boolean a(int param0, ml param1, int param2);

    final static void n(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Kickabout.field_G;
        wk.field_d = new ut[ig.field_a.length];
        gb.field_G = new ut[ig.field_a.length];
        if (param0 == -10) {
          var1 = 0;
          L0: while (true) {
            if (ig.field_a.length <= var1) {
              return;
            } else {
              wk.field_d[var1] = nm.a(16729156, ek.b((int) param0, 85), ig.field_a[var1]);
              gb.field_G[var1] = nm.a(4521796, -92, ig.field_a[var1]);
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public abstract boolean a(int param0, int param1, char param2);

    final static int a(int param0, int param1, int param2) {
        if (param2 != -23146) {
            return 89;
        }
        param0 = param0 >> 8;
        param1 = param1 >> 8;
        return pc.a(param1 * param1 + param0 * param0, -524289);
    }

    public static void q(int param0) {
        field_D = null;
        field_C = null;
        if (param0 != 30907) {
            return;
        }
        field_E = null;
    }

    public abstract void a(int param0);

    private final void s(int param0) {
        int var3 = Kickabout.field_G;
        while (dr.a(-125, uc.field_A)) {
            // ifne L4
            ((tu) this).j(95);
        }
        int var2 = 80 / ((param0 - -28) / 48);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Max Price";
        field_C = "street";
    }
}
