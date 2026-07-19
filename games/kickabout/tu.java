/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class tu extends ma implements hc {
    static String field_D;
    static gr field_E;
    static String field_C;

    final void a(int param0, pk param1) {
        try {
            try {
                ma.field_t = param1;
                this.a(true, -1);
                this.h((byte) 105);
                this.l(-1);
                if (param0 < 97) {
                    this.a(108, false);
                }
                this.m(10);
                this.g(13);
                this.e(6);
                this.i(13);
                uc.field_A[10] = -1;
                uc.field_A[9] = -1;
                sn.field_g = new Vector();
                oa.a(false, (hc) (this));
            } catch (RuntimeException runtimeException) {
                throw nb.a((Throwable) ((Object) runtimeException), "tu.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
        if (param0 != 10) {
            field_E = (gr) null;
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
          this.c(stackIn_7_1, stackIn_7_2 != 0);
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
            this.n(-93);
            if (uf.c(608)) {
              return;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          this.s(-113);
          if (!iu.field_h) {
            iu.a(17, id.field_v);
            if (!ma.field_t.a(true)) {
              break L4;
            } else {
              ma.field_t.b(12763);
              iu.field_h = true;
              break L4;
            }
          } else {
            if (!rg.field_b) {
              if (!la.a(100)) {
                if (ma.field_t.c(-27598)) {
                  rg.field_b = true;
                  this.o(55);
                  nt.c(false);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                this.p(18861);
                break L4;
              }
            } else {
              this.p(18861);
              break L4;
            }
          }
        }
        L5: {
          if (la.a(100)) {
            break L5;
          } else {
            L6: while (true) {
              var5 = (ii) ((Object) ve.field_R.b((byte) 127));
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
            this.a(120);
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
                var2 = this.i((byte) -65);
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
              this.a(var2, (byte) 120);
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
              if (!this.m((byte) -120)) {
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
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
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
                this.a(param0 + -18886, false);
                break L0;
              }
            } else {
              if (up.a((byte) -3)) {
                L2: {
                  stackOut_26_0 = this;
                  stackOut_26_1 = param0 + -18856;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  if (null == e.field_m) {
                    stackOut_28_0 = this;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    break L2;
                  } else {
                    stackOut_27_0 = this;
                    stackOut_27_1 = stackIn_27_1;
                    stackOut_27_2 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    stackIn_29_2 = stackOut_27_2;
                    break L2;
                  }
                }
                L3: {
                  var3 = this.b(stackIn_29_1, stackIn_29_2 != 0);
                  if (-2 == (var3 ^ -1)) {
                    break L3;
                  } else {
                    if ((var3 ^ -1) == -3) {
                      break L3;
                    } else {
                      this.a(param0 ^ -18870, false);
                      break L0;
                    }
                  }
                }
                L4: {
                  if (null == e.field_m) {
                    break L4;
                  } else {
                    fd.h(0);
                    break L4;
                  }
                }
                if (-3 != (var3 ^ -1)) {
                  this.a(param0 ^ -18870, false);
                  break L0;
                } else {
                  js.a(param0 + 1477, so.a(-79));
                  this.a(param0 ^ -18870, false);
                  break L0;
                }
              } else {
                if (vi.c(2915)) {
                  if (!nv.i(0)) {
                    L5: {
                      var3 = df.g(-61);
                      if ((var3 ^ -1) == -2) {
                        ql.a((byte) 50, true, dg.field_f);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.a(-25, false);
                    break L0;
                  } else {
                    np.h(-1);
                    break L0;
                  }
                } else {
                  if (!nv.i(0)) {
                    var2 = 1;
                    var3 = -1;
                    L6: while (true) {
                      if (!nk.b((byte) -59)) {
                        break L0;
                      } else {
                        L7: {
                          if (-1 == cc.field_e) {
                            if (cc.field_e != -1) {
                              break L7;
                            } else {
                              if (-1 == var3) {
                                break L7;
                              } else {
                                cc.field_e = var3;
                                var3 = -1;
                                break L7;
                              }
                            }
                          } else {
                            if (!ud.c(cc.field_e, param0 + -1831)) {
                              break L7;
                            } else {
                              var3 = cc.field_e;
                              continue L6;
                            }
                          }
                        }
                        var4 = 0;
                        L8: while (true) {
                          if (sn.field_g.size() <= var4) {
                            continue L6;
                          } else {
                            if (!((hc) (sn.field_g.elementAt(var4))).a(param0 + -7345, cc.field_e, il.field_c)) {
                              var4++;
                              continue L8;
                            } else {
                              continue L6;
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
            this.a(-25, false);
            break L0;
          }
        }
        L9: {
          var3 = 0;
          if (param0 == 18861) {
            break L9;
          } else {
            field_C = (String) null;
            break L9;
          }
        }
        L10: while (true) {
          if (var3 >= sn.field_g.size()) {
            return;
          } else {
            L11: {
              var6 = (hc) (sn.field_g.elementAt(var3));
              var6.a(param0 + -18886, var2 != 0);
              stackOut_52_0 = var2;
              stackIn_54_0 = stackOut_52_0;
              stackIn_53_0 = stackOut_52_0;
              if (var6.a((byte) 81)) {
                stackOut_54_0 = stackIn_54_0;
                stackOut_54_1 = 0;
                stackIn_55_0 = stackOut_54_0;
                stackIn_55_1 = stackOut_54_1;
                break L11;
              } else {
                stackOut_53_0 = stackIn_53_0;
                stackOut_53_1 = 1;
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                break L11;
              }
            }
            var2 = stackIn_55_0 & stackIn_55_1;
            var3++;
            continue L10;
          }
        }
    }

    protected tu() {
    }

    abstract void a(int param0, byte param1);

    final void b(byte param0) {
        int var3 = 0;
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        int var4 = Kickabout.field_G;
        java.awt.Canvas var2 = ln.l(64);
        if (uf.c(608)) {
            va.a(var2, pn.g(2368), 0);
            return;
        }
        if (!(iu.field_h)) {
            wr.a(var2, -14142);
            return;
        }
        if (!rg.field_b) {
            if (!la.a(100)) {
                ju.a(100.0f, hm.field_H, (byte) 30);
                wr.a(var2, -14142);
                return;
            }
        }
        vg.field_Rb = true;
        for (var3 = -1 + sn.field_g.size(); var3 >= 0; var3--) {
            ((hc) (sn.field_g.elementAt(var3))).a(109);
        }
        if (param0 < 50) {
            discarded$0 = this.a(34, 72, 'ￆ');
        }
        if (!vg.field_Rb) {
            this.r(10);
        } else {
            discarded$1 = md.d(-27302);
            su.a(27744, 0, 0, var2);
        }
    }

    abstract boolean a(int param0, ml param1, int param2);

    final static void n(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            wk.field_d = new ut[ig.field_a.length];
            gb.field_G = new ut[ig.field_a.length];
            if (param0 == -10) {
              var1_int = 0;
              L1: while (true) {
                if (ig.field_a.length <= var1_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  wk.field_d[var1_int] = nm.a(16729156, ek.b((int) param0, 85), ig.field_a[var1_int]);
                  gb.field_G[var1_int] = nm.a(4521796, -92, ig.field_a[var1_int]);
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "tu.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
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
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        L0: while (true) {
          if (!dr.a(-125, uc.field_A)) {
            var2 = 80 / ((param0 - -28) / 48);
            return;
          } else {
            if (this.a(so.field_b, un.field_e, 1)) {
              continue L0;
            } else {
              this.j(95);
              continue L0;
            }
          }
        }
    }

    static {
        field_D = "Max Price";
        field_C = "street";
    }
}
