/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends ob implements vb {
    static long[] field_tb;
    private boolean field_nb;
    private ag[] field_vb;
    private uj[] field_V;
    private ag field_kb;
    private ti field_zb;
    static String field_sb;
    private ag field_ub;
    static String field_rb;
    private boolean field_wb;
    private ag field_lb;
    private boolean field_yb;
    private ag field_mb;
    static String field_pb;
    private ag field_xb;
    private ag field_jb;
    static mo field_qb;
    private ua field_ob;

    final void a(qm param0, int param1, int param2, int param3) {
        ag[] var5 = null;
        int var6 = 0;
        ag var7 = null;
        int var8 = 0;
        ag[] var9 = null;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_15_1 = 0;
        boolean stackOut_12_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        L0: {
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          this.a(param0, param1, param2, param3);
          if (tl.field_d) {
            param0.d((byte) 29);
            var9 = ((kn) this).field_vb;
            var5 = var9;
            var6 = 0;
            L1: while (true) {
              if (var9.length <= var6) {
                break L0;
              } else {
                var7 = var9[var6];
                if (var7.field_w) {
                  boolean discarded$1 = var7.a(0, (qm) this);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (((kn) this).field_wb) {
            break L2;
          } else {
            if (lc.a((byte) 112)) {
              break L2;
            } else {
              this.g(param2 + -171);
              ((kn) this).field_H.b((qm) (Object) new kn(((kn) this).field_H), 15637);
              break L2;
            }
          }
        }
        L3: {
          if (null == ((kn) this).field_zb) {
            break L3;
          } else {
            L4: {
              stackOut_12_0 = ((kn) this).field_zb.j(2);
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (((kn) this).field_nb) {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L4;
              } else {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                break L4;
              }
            }
            if ((stackIn_15_0 ? 1 : 0) != stackIn_15_1) {
              break L3;
            } else {
              this.a(((kn) this).field_lb, 0);
              ((kn) this).field_nb = ((kn) this).field_zb.j(2);
              break L3;
            }
          }
        }
    }

    final static lg a(eg param0, int param1, boolean param2, int param3, eg param4) {
        if (!param2) {
            kn.h(-104);
        }
        if (!fc.a(-123, param0, param1, param3)) {
            return null;
        }
        return ge.a(param4.b(param3, 26219, param1), 3417);
    }

    kn(h param0) {
        super(param0, 430, 254);
        int var2 = 0;
        int var3 = 0;
        uj[] var3_ref_uj__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        ag var6 = null;
        int var7_int = 0;
        qm var7 = null;
        uj var8 = null;
        String var10 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_53_0 = null;
        ua stackIn_53_1 = null;
        ua stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        Object stackIn_54_0 = null;
        ua stackIn_54_1 = null;
        ua stackIn_54_2 = null;
        int stackIn_54_3 = 0;
        Object stackIn_55_0 = null;
        ua stackIn_55_1 = null;
        ua stackIn_55_2 = null;
        int stackIn_55_3 = 0;
        Object stackIn_56_0 = null;
        ua stackIn_56_1 = null;
        ua stackIn_56_2 = null;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String stackIn_78_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        Object stackOut_52_0 = null;
        ua stackOut_52_1 = null;
        ua stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        Object stackOut_53_0 = null;
        ua stackOut_53_1 = null;
        ua stackOut_53_2 = null;
        int stackOut_53_3 = 0;
        Object stackOut_54_0 = null;
        ua stackOut_54_1 = null;
        ua stackOut_54_2 = null;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        Object stackOut_55_0 = null;
        ua stackOut_55_1 = null;
        ua stackOut_55_2 = null;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_77_0 = null;
        String stackOut_76_0 = null;
        L0: {
          ((kn) this).field_V = aa.a(fi.field_d, (byte) 77);
          if (-1 <= (((kn) this).field_V.length ^ -1)) {
            break L0;
          } else {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ((kn) this).field_V.length) {
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (((kn) this).field_V.length <= var3) {
                    var3_ref_uj__ = ((kn) this).field_V;
                    ((kn) this).field_V = new uj[var2];
                    var4 = 0;
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var3_ref_uj__.length) {
                        pm.a(((kn) this).field_V, -1);
                        break L0;
                      } else {
                        if (var3_ref_uj__[var5] != null) {
                          var4++;
                          ((kn) this).field_V[var4] = var3_ref_uj__[var5];
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (((kn) this).field_V[var3] != null) {
                      var2++;
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (null != ((kn) this).field_V[var2]) {
                  var3 = 1 + var2;
                  L4: while (true) {
                    if (((kn) this).field_V.length <= var3) {
                      if (ob.field_Y != null) {
                        if (null != ((kn) this).field_V[var2]) {
                          if (!ob.field_Y.a(((kn) this).field_V[var2].field_g, ((kn) this).field_V[var2].field_e, -17969)) {
                            ((kn) this).field_V[var2] = null;
                            var2++;
                            continue L1;
                          } else {
                            var2++;
                            continue L1;
                          }
                        } else {
                          var2++;
                          continue L1;
                        }
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      if (((kn) this).field_V[var3] != null) {
                        if (((kn) this).field_V[var2].field_g == ((kn) this).field_V[var3].field_g) {
                          if (((kn) this).field_V[var2].field_e == ((kn) this).field_V[var3].field_e) {
                            ((kn) this).field_V[var3] = null;
                            var3++;
                            continue L4;
                          } else {
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
        L5: {
          stackOut_32_0 = this;
          stackIn_34_0 = stackOut_32_0;
          stackIn_33_0 = stackOut_32_0;
          if (0 >= ((kn) this).field_V.length) {
            stackOut_34_0 = this;
            stackOut_34_1 = 0;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            break L5;
          } else {
            stackOut_33_0 = this;
            stackOut_33_1 = 1;
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            break L5;
          }
        }
        L6: {
          ((kn) this).field_yb = stackIn_35_1 != 0;
          if (!ne.b(-22768)) {
            stackOut_37_0 = 0;
            stackIn_38_0 = stackOut_37_0;
            break L6;
          } else {
            stackOut_36_0 = 1;
            stackIn_38_0 = stackOut_36_0;
            break L6;
          }
        }
        L7: {
          var2 = stackIn_38_0;
          if (var2 == 0) {
            stackOut_40_0 = 2;
            stackIn_41_0 = stackOut_40_0;
            break L7;
          } else {
            stackOut_39_0 = 3;
            stackIn_41_0 = stackOut_39_0;
            break L7;
          }
        }
        L8: {
          var3 = stackIn_41_0;
          stackOut_41_0 = this;
          stackIn_43_0 = stackOut_41_0;
          stackIn_42_0 = stackOut_41_0;
          if (lc.a((byte) 112)) {
            stackOut_43_0 = this;
            stackOut_43_1 = 0;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            break L8;
          } else {
            stackOut_42_0 = this;
            stackOut_42_1 = 1;
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            break L8;
          }
        }
        L9: {
          ((kn) this).field_wb = stackIn_44_1 != 0;
          if (var2 == 0) {
            if (null != ob.field_Y) {
              if (ob.field_Y.b(false)) {
                stackOut_50_0 = 1;
                stackIn_52_0 = stackOut_50_0;
                break L9;
              } else {
                stackOut_49_0 = 0;
                stackIn_52_0 = stackOut_49_0;
                break L9;
              }
            } else {
              stackOut_47_0 = 0;
              stackIn_52_0 = stackOut_47_0;
              break L9;
            }
          } else {
            stackOut_45_0 = 0;
            stackIn_52_0 = stackOut_45_0;
            break L9;
          }
        }
        L10: {
          L11: {
            var4 = stackIn_52_0;
            stackOut_52_0 = this;
            stackOut_52_1 = null;
            stackOut_52_2 = null;
            stackOut_52_3 = 10;
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_55_2 = stackOut_52_2;
            stackIn_55_3 = stackOut_52_3;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            stackIn_53_2 = stackOut_52_2;
            stackIn_53_3 = stackOut_52_3;
            if (var2 != 0) {
              break L11;
            } else {
              stackOut_53_0 = this;
              stackOut_53_1 = null;
              stackOut_53_2 = null;
              stackOut_53_3 = stackIn_53_3;
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              stackIn_55_3 = stackOut_53_3;
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              stackIn_54_3 = stackOut_53_3;
              if (var4 != 0) {
                break L11;
              } else {
                stackOut_54_0 = this;
                stackOut_54_1 = null;
                stackOut_54_2 = null;
                stackOut_54_3 = stackIn_54_3;
                stackOut_54_4 = 75;
                stackIn_56_0 = stackOut_54_0;
                stackIn_56_1 = stackOut_54_1;
                stackIn_56_2 = stackOut_54_2;
                stackIn_56_3 = stackOut_54_3;
                stackIn_56_4 = stackOut_54_4;
                break L10;
              }
            }
          }
          stackOut_55_0 = this;
          stackOut_55_1 = null;
          stackOut_55_2 = null;
          stackOut_55_3 = stackIn_55_3;
          stackOut_55_4 = 58;
          stackIn_56_0 = stackOut_55_0;
          stackIn_56_1 = stackOut_55_1;
          stackIn_56_2 = stackOut_55_2;
          stackIn_56_3 = stackOut_55_3;
          stackIn_56_4 = stackOut_55_4;
          break L10;
        }
        L12: {
          new ua(stackIn_56_3, stackIn_56_4, 410, 105, (pf) null, var3, 1);
          ((kn) this).field_ob = (ua) (Object) stackIn_56_1;
          ((kn) this).field_ob.field_R = 83;
          ((kn) this).field_ob.d(0, 5, 5);
          ((kn) this).c(-123, (qm) (Object) ((kn) this).field_ob);
          ((kn) this).field_jb = this.a(-1, ci.field_b, oa.field_d, (wc) this);
          if (var2 == 0) {
            break L12;
          } else {
            ((kn) this).field_mb = this.a(-1, fo.field_f, fg.field_k, (wc) this);
            break L12;
          }
        }
        L13: {
          ((kn) this).field_lb = this.a(-1, oj.field_g, qj.field_j, (wc) this);
          stackOut_58_0 = this;
          stackIn_60_0 = stackOut_58_0;
          stackIn_59_0 = stackOut_58_0;
          if (var2 != 0) {
            stackOut_60_0 = this;
            stackOut_60_1 = 3;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            break L13;
          } else {
            stackOut_59_0 = this;
            stackOut_59_1 = 2;
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            break L13;
          }
        }
        L14: {
          ((kn) this).field_vb = new ag[stackIn_61_1];
          ((kn) this).field_vb[1] = ((kn) this).field_lb;
          if (var2 == 0) {
            break L14;
          } else {
            ((kn) this).field_vb[2] = ((kn) this).field_mb;
            break L14;
          }
        }
        L15: {
          ((kn) this).field_vb[0] = ((kn) this).field_jb;
          if (!((kn) this).field_yb) {
            break L15;
          } else {
            if (var2 == 0) {
              break L15;
            } else {
              var5_ref_String__ = new String[((kn) this).field_V.length];
              var6_int = -1 + var5_ref_String__.length;
              var7_int = 0;
              L16: while (true) {
                if (var7_int >= ((kn) this).field_V.length) {
                  ((kn) this).field_zb = new ti((Object[]) (Object) var5_ref_String__, var6_int, 150);
                  ((kn) this).field_zb.a(18, ((kn) this).field_lb.field_k + (((kn) this).field_lb.field_j + (((kn) this).field_ob.field_j - 19)), 126, ((kn) this).field_ob.field_n - -((kn) this).field_lb.field_n, -54);
                  ((kn) this).field_B.a((pg) (Object) ((kn) this).field_zb, (byte) -58);
                  break L15;
                } else {
                  L17: {
                    var8 = ((kn) this).field_V[var7_int];
                    if (null == ka.field_m) {
                      break L17;
                    } else {
                      if (ob.field_Y.field_m != var8.field_g) {
                        break L17;
                      } else {
                        if (ob.field_Y.field_c != var8.field_e) {
                          break L17;
                        } else {
                          var6_int = var7_int;
                          break L17;
                        }
                      }
                    }
                  }
                  var5_ref_String__[var7_int] = var8.field_g + "<times>" + var8.field_e;
                  var7_int++;
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          L19: {
            ((kn) this).field_kb = this.a((wc) this, lm.field_a, 410);
            var5 = ((kn) this).field_kb.field_v / 2 + ((kn) this).field_kb.field_n;
            ((kn) this).field_kb.field_v = 150;
            ((kn) this).field_kb.field_n = var5 - (20 + ((kn) this).field_kb.field_v);
            ((kn) this).field_ub = this.a((wc) this, hj.field_e, 410);
            ((kn) this).field_ub.field_B = false;
            ((kn) this).field_ub.field_v = ((kn) this).field_kb.field_v;
            ((kn) this).field_ub.field_n = var5 - -20;
            if (var2 != 0) {
              break L19;
            } else {
              if (var4 == 0) {
                break L18;
              } else {
                break L19;
              }
            }
          }
          L20: {
            if (var2 != 0) {
              stackOut_77_0 = on.field_b;
              stackIn_78_0 = stackOut_77_0;
              break L20;
            } else {
              stackOut_76_0 = tm.field_c;
              stackIn_78_0 = stackOut_76_0;
              break L20;
            }
          }
          var10 = (String) (Object) stackIn_78_0;
          var6 = (ag) (Object) var10;
          var7 = new qm(var10, (wc) null);
          var7.field_j = 163;
          var7.field_k = 80;
          var7.field_v = ((kn) this).field_v;
          var7.field_n = 0;
          var7.field_r = (pf) (Object) new jm(ia.field_c, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
          ((kn) this).c(-96, var7);
          break L18;
        }
        L21: {
          ((kn) this).field_nb = false;
          var6 = this.j(2);
          if (var6 == null) {
            break L21;
          } else {
            var6.field_z = true;
            break L21;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        ql.field_a = param2;
        pn.field_d = param0;
        wm.field_I = param1;
        if (param3 != -43) {
            field_tb = null;
        }
    }

    public static void h(int param0) {
        if (param0 != 3) {
            return;
        }
        field_tb = null;
        field_qb = null;
        field_sb = null;
        field_rb = null;
        field_pb = null;
    }

    final static void a(java.awt.Canvas param0, byte param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param0.getGraphics();
            ce.field_m.a(param3, var4, 0, param2);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
        if (param1 >= -87) {
            field_pb = null;
        }
    }

    private final ag a(wc param0, String param1, int param2) {
        if (param2 != 410) {
            ag discarded$0 = this.j(-10);
        }
        ag var4 = new ag(param1, param0);
        var4.field_r = (pf) (Object) new mm();
        int var5 = -46 + ((kn) this).field_k;
        var4.a(30, var5, -30 + ((kn) this).field_v, 15, -92);
        ((kn) this).c(param2 + -526, (qm) (Object) var4);
        return var4;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        kc var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        jg var9 = null;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (jo.field_e >= ea.field_F) {
            break L0;
          } else {
            jo.field_e = jo.field_e + 1;
            break L0;
          }
        }
        L1: {
          if (vd.field_k == ce.field_m.field_m) {
            break L1;
          } else {
            ma.field_N = ma.field_N + (ce.field_m.field_m + -vd.field_k);
            vd.field_k = ce.field_m.field_m;
            break L1;
          }
        }
        if ((jo.field_e ^ -1) < -1) {
          L2: {
            ed.j(120);
            n.field_g.b(param3, (byte) 60);
            if (!param2) {
              break L2;
            } else {
              field_tb = null;
              break L2;
            }
          }
          L3: {
            if (null == ln.field_U) {
              break L3;
            } else {
              if (!wh.field_g) {
                ln.field_U = null;
                break L3;
              } else {
                boolean discarded$1 = ln.field_U.a(n.field_g.field_V, n.field_g.field_nb, param3, (byte) -104);
                break L3;
              }
            }
          }
          var4 = 0;
          L4: while (true) {
            if (-6 >= var4) {
              L5: {
                if (g.field_g.field_U != 0) {
                  db.field_a = new w(g.field_g.field_V, g.field_g.field_nb, g.field_g.field_x, g.field_g.field_I, param0, mf.field_d, be.field_l, wj.field_b, pg.field_c, ec.field_g, nj.field_d, (String) null, 0L);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var9 = f.a(16711422, param1, ga.field_r, dh.field_Gb);
                if (var9 == null) {
                  break L6;
                } else {
                  eb.a(0, var9);
                  break L6;
                }
              }
              L7: {
                var8 = jl.b(0);
                if (var8 == null) {
                  break L7;
                } else {
                  kh.field_c = var8;
                  break L7;
                }
              }
              return;
            } else {
              var5 = mn.field_s[var4];
              if (var5 != null) {
                L8: {
                  if (-1 == var5.field_U) {
                    break L8;
                  } else {
                    ko.a(var4, var5, (byte) -86);
                    break L8;
                  }
                }
                var6 = oh.a((byte) 119, var4);
                ia.field_b[var4].field_W = tl.field_a[var6];
                oc.field_f[var4].field_rb = cf.field_b[var6];
                var4++;
                continue L4;
              } else {
                var4++;
                continue L4;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = ArcanistsMulti.field_G ? 1 : 0;
            if (((kn) this).field_jb == ((kn) this).field_xb) {
              u.b(6);
              tl.a(-30267);
              break L1;
            } else {
              if (((kn) this).field_xb != ((kn) this).field_mb) {
                if (((kn) this).field_xb == ((kn) this).field_lb) {
                  L2: {
                    if (((kn) this).field_zb == null) {
                      break L2;
                    } else {
                      var2 = ((kn) this).field_zb.g((byte) 37);
                      if (var2 < 0) {
                        break L2;
                      } else {
                        ob.field_Y.a(((kn) this).field_V[var2].field_e, ((kn) this).field_V[var2].field_g, (byte) -64);
                        break L2;
                      }
                    }
                  }
                  nb.a(true, 5);
                  ((kn) this).field_H.b((qm) (Object) new bj(((kn) this).field_H), 15637);
                  break L1;
                } else {
                  ((kn) this).field_ub.field_B = false;
                  var2 = -94 % ((-8 - param0) / 49);
                  break L0;
                }
              } else {
                u.b(6);
                gm.a((byte) -127);
                break L1;
              }
            }
          }
          ((kn) this).field_ub.field_B = false;
          var2 = -94 % ((-8 - param0) / 49);
          break L0;
        }
    }

    final static void g(boolean param0) {
        if (param0) {
            Object var2 = null;
            lg discarded$0 = kn.a((eg) null, -48, false, -99, (eg) null);
        }
        k.field_o = 0;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (param4 != ((kn) this).field_kb) {
            if (param4 == ((kn) this).field_ub) {
              this.k(46);
              break L0;
            } else {
              if (param4 == ((kn) this).field_jb) {
                this.a(param4, 0);
                break L0;
              } else {
                if (((kn) this).field_mb == param4) {
                  this.a(param4, 0);
                  break L0;
                } else {
                  L1: {
                    if (null != ((kn) this).field_zb) {
                      if (((kn) this).field_zb.field_w) {
                        stackOut_9_0 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        break L1;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_11_0 = stackOut_8_0;
                        break L1;
                      }
                    } else {
                      stackOut_6_0 = 0;
                      stackIn_11_0 = stackOut_6_0;
                      break L1;
                    }
                  }
                  var6 = stackIn_11_0;
                  if (var6 != 0) {
                    break L0;
                  } else {
                    if (param4 == ((kn) this).field_lb) {
                      if (!((kn) this).field_yb) {
                        ((kn) this).field_H.b((qm) (Object) new qn(((kn) this).field_H, oo.field_C), 15637);
                        break L0;
                      } else {
                        if (-1 > (ah.field_c ^ -1)) {
                          this.a(param4, 0);
                          break L0;
                        } else {
                          ((kn) this).field_H.b((qm) (Object) new gf(((kn) this).field_H), 15637);
                          break L0;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          } else {
            this.g(-1);
            break L0;
          }
        }
        L2: {
          if (param0) {
            break L2;
          } else {
            ((kn) this).field_xb = null;
            break L2;
          }
        }
    }

    private final void i(int param0) {
        int var3 = 0;
        ag var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        ag[] var6 = ((kn) this).field_vb;
        ag[] var2 = var6;
        if (param0 > -95) {
            return;
        }
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_z = ((kn) this).field_xb == var4 ? true : false;
        }
    }

    private final ag a(int param0, String param1, ll[] param2, wc param3) {
        ag var5 = new ag(param1, param3);
        var5.field_r = (pf) (Object) new cd(param2);
        if (param0 != -1) {
            return null;
        }
        ua var6 = ((kn) this).field_ob;
        ag var7 = var5;
        var6.a((qm) (Object) var7, param0 ^ -123, var6.field_R);
        ((kn) this).field_ob.e((byte) 64);
        return var5;
    }

    private final ag j(int param0) {
        if (param0 != 2) {
            return null;
        }
        if (null != ka.field_m) {
            return ((kn) this).field_lb;
        }
        if (null != ob.field_Y) {
            if (ob.field_Y.field_l) {
                if (((kn) this).field_mb != null) {
                    return ((kn) this).field_mb;
                }
            }
        }
        return ((kn) this).field_jb;
    }

    private final void g(int param0) {
        if (!((kn) this).field_G) {
            return;
        }
        ((kn) this).field_G = false;
        if (param0 != -1) {
            ((kn) this).field_zb = null;
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        ag var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          var5 = null;
          if (((kn) this).field_jb.d(-2116)) {
            var5 = ((kn) this).field_jb;
            break L0;
          } else {
            L1: {
              if (((kn) this).field_mb == null) {
                break L1;
              } else {
                if (((kn) this).field_mb.d(-2116)) {
                  var5 = ((kn) this).field_mb;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (((kn) this).field_lb.d(-2116)) {
              var5 = ((kn) this).field_lb;
              break L0;
            } else {
              if (!((kn) this).field_kb.d(-2116)) {
                if (((kn) this).field_ub.d(-2116)) {
                  var5 = ((kn) this).field_ub;
                  break L0;
                } else {
                  if (((kn) this).field_jb.field_z) {
                    var5 = ((kn) this).field_jb;
                    break L0;
                  } else {
                    L2: {
                      if (null == ((kn) this).field_mb) {
                        break L2;
                      } else {
                        if (!((kn) this).field_mb.field_z) {
                          break L2;
                        } else {
                          var5 = ((kn) this).field_mb;
                          break L0;
                        }
                      }
                    }
                    if (((kn) this).field_lb.field_z) {
                      var5 = ((kn) this).field_lb;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              } else {
                var5 = ((kn) this).field_kb;
                break L0;
              }
            }
          }
        }
        L3: {
          if (param1 < -120) {
            break L3;
          } else {
            ((kn) this).field_xb = null;
            break L3;
          }
        }
        L4: {
          var6 = param3;
          if (var6 != 96) {
            if (97 == var6) {
              if (((kn) this).field_jb != var5) {
                if (((kn) this).field_mb == var5) {
                  boolean discarded$13 = ((kn) this).field_lb.a(0, (qm) this);
                  return true;
                } else {
                  if (((kn) this).field_kb != var5) {
                    break L4;
                  } else {
                    if (!((kn) this).field_ub.field_B) {
                      break L4;
                    } else {
                      boolean discarded$14 = ((kn) this).field_ub.a(0, (qm) this);
                      return true;
                    }
                  }
                }
              } else {
                L5: {
                  if (null == ((kn) this).field_mb) {
                    boolean discarded$15 = ((kn) this).field_lb.a(0, (qm) this);
                    break L5;
                  } else {
                    boolean discarded$16 = ((kn) this).field_mb.a(0, (qm) this);
                    break L5;
                  }
                }
                return true;
              }
            } else {
              if (98 == var6) {
                if (((kn) this).field_kb == var5) {
                  boolean discarded$17 = ((kn) this).field_jb.a(0, (qm) this);
                  return true;
                } else {
                  if (((kn) this).field_ub != var5) {
                    break L4;
                  } else {
                    boolean discarded$18 = ((kn) this).field_lb.a(0, (qm) this);
                    return true;
                  }
                }
              } else {
                if (var6 != 99) {
                  break L4;
                } else {
                  L6: {
                    if (((kn) this).field_jb == var5) {
                      break L6;
                    } else {
                      if (var5 == ((kn) this).field_mb) {
                        break L6;
                      } else {
                        if (((kn) this).field_lb == var5) {
                          L7: {
                            if (!((kn) this).field_ub.field_B) {
                              boolean discarded$19 = ((kn) this).field_kb.a(0, (qm) this);
                              break L7;
                            } else {
                              boolean discarded$20 = ((kn) this).field_ub.a(0, (qm) this);
                              break L7;
                            }
                          }
                          return true;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  boolean discarded$21 = ((kn) this).field_kb.a(0, (qm) this);
                  return true;
                }
              }
            }
          } else {
            if (var5 != ((kn) this).field_lb) {
              if (var5 != ((kn) this).field_mb) {
                if (((kn) this).field_ub != var5) {
                  break L4;
                } else {
                  boolean discarded$22 = ((kn) this).field_kb.a(0, (qm) this);
                  return true;
                }
              } else {
                boolean discarded$23 = ((kn) this).field_jb.a(0, (qm) this);
                return true;
              }
            } else {
              if (((kn) this).field_mb == null) {
                boolean discarded$24 = ((kn) this).field_jb.a(0, (qm) this);
                return true;
              } else {
                boolean discarded$25 = ((kn) this).field_mb.a(0, (qm) this);
                return true;
              }
            }
          }
        }
        return this.a(param0, (byte) -122, param2, param3);
    }

    private final void a(ag param0, int param1) {
        int var4 = 0;
        uj var5 = null;
        ((kn) this).field_xb = param0;
        boolean discarded$0 = param0.a(param1, (qm) this);
        ag var3 = this.j(2);
        ((kn) this).field_ub.field_B = var3 != param0 ? true : false;
        if (param0 == ((kn) this).field_lb) {
            if (param0 == var3) {
                if (((kn) this).field_zb != null) {
                    var4 = ((kn) this).field_zb.g((byte) 37);
                    var5 = ((kn) this).field_V[var4];
                    if (var5.field_g == ob.field_Y.field_m) {
                        // if_icmpeq L123
                    }
                    ((kn) this).field_ub.field_B = true;
                }
            }
        }
        this.i(-121);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = "Seriously offensive language";
        field_rb = "Go Back";
        field_tb = new long[32];
        field_pb = "Steep slopes and rugged terrain. Stay here too long and the volcanoes will erupt!";
    }
}
