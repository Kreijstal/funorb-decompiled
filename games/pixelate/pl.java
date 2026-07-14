/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends ch implements om, vo, pn {
    private gk field_U;
    private gk field_Q;
    private db field_M;
    private gk field_X;
    private qm field_K;
    private gk field_V;
    private gk field_P;
    static bb field_Y;
    private h field_T;
    static int field_S;
    private qm field_R;
    static String[] field_J;
    a field_W;
    static int field_O;
    private gk field_L;

    public final void a(byte param0) {
        ((ec) (Object) ((pl) this).field_U.a(1)).f(-112);
        if (param0 <= 12) {
            ((pl) this).field_X = null;
        }
    }

    private final String l(int param0) {
        if (param0 != 0) {
            field_S = -31;
        }
        return "</col></u>";
    }

    final void a(int param0, int param1, int param2, ng param3) {
        super.a(param0 ^ 0, param1, param2, param3);
        if (param0 != 40) {
            ((pl) this).field_V = null;
        }
        ((pl) this).field_R.field_H = this.d(true);
    }

    public pl() {
        super(0, 0, 496, 0, (eb) null);
        ((pl) this).field_U = new gk("", (fn) null, 12);
        ((pl) this).field_P = new gk("", (fn) null, 100);
        ((pl) this).field_L = new gk("", (fn) null, 100);
        ((pl) this).field_V = new gk("", (fn) null, 20);
        ((pl) this).field_X = new gk("", (fn) null, 20);
        ((pl) this).field_Q = new gk("", (fn) null, 3);
        int var1 = 1;
        ((pl) this).field_T = new h("", (fn) null, var1 != 0);
        ((pl) this).field_R = new qm(hm.field_d, (fn) null);
        ((pl) this).field_K = new qm(ii.field_v, (fn) null);
        ((pl) this).field_U.field_l = bg.field_i;
        ((pl) this).field_P.field_l = qp.field_N;
        ((pl) this).field_L.field_l = jf.field_b;
        ((pl) this).field_V.field_l = te.field_Eb;
        ((pl) this).field_X.field_l = dd.field_f;
        ((pl) this).field_Q.field_l = bb.field_d;
        ((pl) this).field_T.field_l = mc.field_o;
        ((pl) this).field_U.a((byte) 101, (ml) (Object) new ec((c) (Object) ((pl) this).field_U));
        ((pl) this).field_P.a((byte) 118, (ml) (Object) new bc((c) (Object) ((pl) this).field_P));
        ((pl) this).field_L.a((byte) 56, (ml) (Object) new kc((c) (Object) ((pl) this).field_L, (c) (Object) ((pl) this).field_P));
        ((pl) this).field_V.a((byte) 68, (ml) (Object) new g((c) (Object) ((pl) this).field_V, (c) (Object) ((pl) this).field_U, (c) (Object) ((pl) this).field_P));
        ((pl) this).field_X.a((byte) 29, (ml) (Object) new qo((c) (Object) ((pl) this).field_X, (c) (Object) ((pl) this).field_V));
        ((pl) this).field_Q.a((byte) 97, (ml) (Object) new ag((c) (Object) ((pl) this).field_Q));
        ((pl) this).field_R.field_H = false;
        ((pl) this).field_R.field_y = (eb) (Object) new ad();
        ((pl) this).field_K.field_y = (eb) (Object) new ia();
        ((pl) this).field_U.field_y = (eb) (Object) new gh(10000536);
        ((pl) this).field_L.field_y = (eb) (Object) new gh(10000536);
        ((pl) this).field_P.field_y = (eb) (Object) new gh(10000536);
        ((pl) this).field_Q.field_y = (eb) (Object) new gh(10000536);
        ((pl) this).field_T.field_y = (eb) (Object) new jc();
        ((pl) this).field_X.field_y = (eb) (Object) new ip(10000536);
        ((pl) this).field_V.field_y = (eb) (Object) new ip(10000536);
        String var2 = sd.a(hk.field_f, 27, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(si.field_S, -21, (ng) (Object) ((pl) this).field_P, 170, var3);
        var3 = var3 + (5 + this.a(mp.field_d, (ng) (Object) ((pl) this).field_L, 20, 170, var3, 126, ""));
        var3 = var3 + this.a(vk.field_qb, -86, (ng) (Object) ((pl) this).field_V, 170, var3);
        var3 = var3 + (5 + this.a(pb.field_i, var3, (ng) (Object) ((pl) this).field_X, 35, 170, r.field_b));
        var3 = var3 + (this.a(na.field_a, var3, (ng) (Object) ((pl) this).field_U, 35, 170, mo.field_i) + 5);
        var3 = var3 + this.a((byte) 85, 170, (ng) (Object) ((pl) this).field_Q, var3, rl.field_O);
        qp var4 = new qp(46, var3, ((pl) this).field_E - 90, 25, (ng) (Object) ((pl) this).field_T, true, ((pl) this).field_E - 120, 5, ep.field_b, 11579568, ha.field_j);
        ((pl) this).b((ng) (Object) var4, 80);
        var3 = var3 + var4.field_C;
        uc var5 = new uc(he.field_d, 0, 0, 0, 0, 16777215, -1, 0, 0, he.field_d.field_w, -1, 2147483647, true);
        ((pl) this).field_M = new db(var2, (eb) (Object) var5);
        ((pl) this).field_M.field_l = "";
        ((pl) this).field_M.a(fa.field_g, 0, 0);
        ((pl) this).field_M.a(fa.field_g, 0, 1);
        ((pl) this).field_M.field_n = (fn) this;
        ((pl) this).field_M.a(46, -90 + ((pl) this).field_E, var3, -93);
        var3 = var3 + (15 + ((pl) this).field_M.field_C);
        ((pl) this).b((ng) (Object) ((pl) this).field_M, 80);
        int var6 = 4;
        int var7 = 200;
        ((pl) this).field_R.a(var7, (byte) 68, var3, -var7 + 496 >> -1246986815, 40);
        ((pl) this).field_K.a(60, (byte) 23, var3 + 15, var6 + 3, 40);
        ((pl) this).field_K.field_n = (fn) this;
        ((pl) this).field_R.field_n = (fn) this;
        ((pl) this).b((ng) (Object) ((pl) this).field_R, 80);
        ((pl) this).b((ng) (Object) ((pl) this).field_K, 80);
        ((pl) this).field_W = new a((pn) this);
        ((pl) this).field_W.a(-((pl) this).field_U.field_E + -((pl) this).field_U.field_z + (((pl) this).field_E + -60), (byte) 100, 20 + ((pl) this).field_U.field_p, 60 + ((pl) this).field_U.field_z - -((pl) this).field_U.field_E, 150);
        ((pl) this).b((ng) (Object) ((pl) this).field_W, 80);
        ((pl) this).a(496, (byte) 28, 0, 0, var3 - -55 - -var6);
    }

    private final int a(String param0, int param1, ng param2, int param3, int param4) {
        qp var6 = new qp(20, param4, param3 + 120, 25, param2, false, 120, 3, he.field_d, 16777215, param0);
        ((pl) this).b((ng) (Object) var6, 80);
        if (param1 > -6) {
            return -103;
        }
        return var6.field_C;
    }

    private final int a(byte param0, int param1, ng param2, int param3, String param4) {
        qp var9 = new qp(20, param3, 120 - -param1, 25, param2, false, 120, 3, he.field_d, 16777215, param4);
        ((pl) this).b((ng) (Object) var9, 80);
        vc var7 = new vc(((bp) (Object) param2).a(1));
        ((pl) this).b((ng) (Object) var7, 80);
        var7.a(15, (byte) 73, (var9.field_C - 15 >> 243741281) + var9.field_p, var9.field_E + (var9.field_z + 3), 15);
        int var8 = -32 / ((param0 - -2) / 54);
        return var9.field_C;
    }

    final static void c(boolean param0) {
        pc var1 = null;
        int var2 = 0;
        uj var3_ref_uj = null;
        long var3 = 0L;
        int var3_int = 0;
        eq var3_ref_eq = null;
        eq var4 = null;
        eq var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        eq var6 = null;
        uj var7 = null;
        uj var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        Object var16 = null;
        eq var16_ref = null;
        uj var17 = null;
        String var18 = null;
        String var19 = null;
        uj var20 = null;
        uj var21 = null;
        Object var22 = null;
        eq var22_ref = null;
        Object var23 = null;
        eq var23_ref = null;
        uj var24 = null;
        int stackIn_45_0 = 0;
        uj stackIn_49_0 = null;
        String stackIn_49_1 = null;
        String stackIn_49_2 = null;
        uj stackIn_50_0 = null;
        String stackIn_50_1 = null;
        String stackIn_50_2 = null;
        uj stackIn_51_0 = null;
        String stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        uj stackIn_53_0 = null;
        uj stackIn_54_0 = null;
        uj stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        pc stackIn_99_0 = null;
        pc stackIn_100_0 = null;
        pc stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        vg stackIn_104_0 = null;
        vg stackIn_105_0 = null;
        vg stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        uj stackIn_108_0 = null;
        uj stackIn_109_0 = null;
        uj stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        pc stackIn_112_0 = null;
        pc stackIn_113_0 = null;
        pc stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        pc stackOut_98_0 = null;
        pc stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        pc stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        vg stackOut_103_0 = null;
        vg stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        vg stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        uj stackOut_107_0 = null;
        uj stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        uj stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        pc stackOut_111_0 = null;
        pc stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        pc stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        uj stackOut_48_0 = null;
        String stackOut_48_1 = null;
        String stackOut_48_2 = null;
        uj stackOut_50_0 = null;
        String stackOut_50_1 = null;
        String stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        uj stackOut_49_0 = null;
        String stackOut_49_1 = null;
        String stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        uj stackOut_52_0 = null;
        uj stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        uj stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        L0: {
          var16 = null;
          var22 = null;
          var23 = null;
          var11 = Pixelate.field_H ? 1 : 0;
          var1 = vi.field_o;
          if (param0) {
            break L0;
          } else {
            boolean discarded$1 = pl.m(96);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = ((we) (Object) var1).f(255);
            if (-1 == (var2 ^ -1)) {
              break L2;
            } else {
              if (var2 == 1) {
                break L2;
              } else {
                if (2 == var2) {
                  break L2;
                } else {
                  if (3 == var2) {
                    break L2;
                  } else {
                    if (var2 != 4) {
                      if (var2 != 5) {
                        if (6 == var2) {
                          var3 = ((we) (Object) var1).a(false);
                          var5 = ((we) (Object) var1).f(255);
                          var24 = gp.a(2, var3);
                          if (var24 == null) {
                            break L1;
                          } else {
                            L3: {
                              if (var24.field_Jb) {
                                ka.field_X = ka.field_X - 1;
                                var24.field_Jb = false;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            L4: {
                              if (var5 != 0) {
                                var24.field_Tb = mh.field_b;
                                var24.field_Eb = var5;
                                break L4;
                              } else {
                                var24.c(2779);
                                break L4;
                              }
                            }
                            var24.e(17);
                            break L1;
                          }
                        } else {
                          if (-8 != (var2 ^ -1)) {
                            if (8 == var2) {
                              L5: {
                                var3_int = ((we) (Object) var1).a((byte) -124);
                                var4 = (eq) (Object) dg.field_f.a(-11434, (long)var3_int);
                                if (var4 == null) {
                                  var4_ref = new eq(fj.field_b);
                                  dg.field_f.a(false, (lm) (Object) var4_ref, (long)var3_int);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              kd.a(true, var4_ref, (byte) 120, (we) (Object) var1);
                              w.a((byte) -48, var4_ref);
                              break L1;
                            } else {
                              if (var2 == -10) {
                                var3_int = ((we) (Object) var1).a((byte) 124);
                                var4_int = ((we) (Object) var1).f(255);
                                var23_ref = (eq) (Object) dg.field_f.a(-11434, (long)var3_int);
                                if (var23_ref != null) {
                                  L6: {
                                    if (0 != var4_int) {
                                      var23_ref.field_Rb = mh.field_b;
                                      var23_ref.field_Qb = var4_int;
                                      break L6;
                                    } else {
                                      var23_ref.c(2779);
                                      break L6;
                                    }
                                  }
                                  var23_ref.e(17);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              } else {
                                if (10 == var2) {
                                  var3_ref_eq = (eq) (Object) nk.field_a.c(1504642273);
                                  L7: while (true) {
                                    if (var3_ref_eq == null) {
                                      break L1;
                                    } else {
                                      var3_ref_eq.c(2779);
                                      var3_ref_eq.e(17);
                                      var3_ref_eq = (eq) (Object) nk.field_a.f(1504642273);
                                      continue L7;
                                    }
                                  }
                                } else {
                                  L8: {
                                    if (11 == var2) {
                                      break L8;
                                    } else {
                                      if (12 == var2) {
                                        break L8;
                                      } else {
                                        if (-14 != var2) {
                                          L9: {
                                            if (var2 == 14) {
                                              break L9;
                                            } else {
                                              if ((var2 ^ -1) == -17) {
                                                break L9;
                                              } else {
                                                L10: {
                                                  if ((var2 ^ -1) == -16) {
                                                    break L10;
                                                  } else {
                                                    if (var2 == 17) {
                                                      break L10;
                                                    } else {
                                                      if (var2 == -19) {
                                                        L11: {
                                                          stackOut_98_0 = (pc) var1;
                                                          stackIn_100_0 = stackOut_98_0;
                                                          stackIn_99_0 = stackOut_98_0;
                                                          if (param0) {
                                                            stackOut_100_0 = (pc) (Object) stackIn_100_0;
                                                            stackOut_100_1 = 0;
                                                            stackIn_101_0 = stackOut_100_0;
                                                            stackIn_101_1 = stackOut_100_1;
                                                            break L11;
                                                          } else {
                                                            stackOut_99_0 = (pc) (Object) stackIn_99_0;
                                                            stackOut_99_1 = 1;
                                                            stackIn_101_0 = stackOut_99_0;
                                                            stackIn_101_1 = stackOut_99_1;
                                                            break L11;
                                                          }
                                                        }
                                                        L12: {
                                                          var3 = ((we) (Object) stackIn_101_0).a(stackIn_101_1 != 0);
                                                          var18 = ((we) (Object) var1).h(5);
                                                          var19 = ((we) (Object) var1).h(5);
                                                          var7 = ll.a(var3, 14428);
                                                          if (var7 == null) {
                                                            L13: {
                                                              var7 = new uj(var18, var19, var3);
                                                              stackOut_103_0 = eh.field_f;
                                                              stackIn_105_0 = stackOut_103_0;
                                                              stackIn_104_0 = stackOut_103_0;
                                                              if (param0) {
                                                                stackOut_105_0 = (vg) (Object) stackIn_105_0;
                                                                stackOut_105_1 = 0;
                                                                stackIn_106_0 = stackOut_105_0;
                                                                stackIn_106_1 = stackOut_105_1;
                                                                break L13;
                                                              } else {
                                                                stackOut_104_0 = (vg) (Object) stackIn_104_0;
                                                                stackOut_104_1 = 1;
                                                                stackIn_106_0 = stackOut_104_0;
                                                                stackIn_106_1 = stackOut_104_1;
                                                                break L13;
                                                              }
                                                            }
                                                            ((vg) (Object) stackIn_106_0).a(stackIn_106_1 != 0, (lm) (Object) var7, var3);
                                                            io.field_c.field_mc = io.field_c.field_mc + 1;
                                                            break L12;
                                                          } else {
                                                            break L12;
                                                          }
                                                        }
                                                        L14: {
                                                          var7.field_Rb = ((we) (Object) var1).a((byte) 25);
                                                          var8 = ((we) (Object) var1).j(127);
                                                          stackOut_107_0 = (uj) var7;
                                                          stackIn_109_0 = stackOut_107_0;
                                                          stackIn_108_0 = stackOut_107_0;
                                                          if (0 == (1 & var8)) {
                                                            stackOut_109_0 = (uj) (Object) stackIn_109_0;
                                                            stackOut_109_1 = 0;
                                                            stackIn_110_0 = stackOut_109_0;
                                                            stackIn_110_1 = stackOut_109_1;
                                                            break L14;
                                                          } else {
                                                            stackOut_108_0 = (uj) (Object) stackIn_108_0;
                                                            stackOut_108_1 = 1;
                                                            stackIn_110_0 = stackOut_108_0;
                                                            stackIn_110_1 = stackOut_108_1;
                                                            break L14;
                                                          }
                                                        }
                                                        stackIn_110_0.field_Xb = stackIn_110_1 != 0;
                                                        var7.field_Yb = var8 >> -1923419807;
                                                        var7.field_Qb = ((we) (Object) var1).f(255);
                                                        var7.field_Ib = ((we) (Object) var1).f(255);
                                                        wi.field_a.a(22125, (fa) (Object) var7);
                                                        break L1;
                                                      } else {
                                                        if (19 == var2) {
                                                          var3 = ((we) (Object) var1).a(false);
                                                          var5 = ((we) (Object) var1).f(255);
                                                          var17 = ll.a(var3, 14428);
                                                          if (var17 != null) {
                                                            if (var5 != 0) {
                                                              var17.field_Eb = var5;
                                                              var17.field_Tb = mh.field_b;
                                                              var17.e(17);
                                                              io.field_c.field_mc = io.field_c.field_mc - 1;
                                                              break L1;
                                                            } else {
                                                              var17.c(2779);
                                                              var17.e(17);
                                                              io.field_c.field_mc = io.field_c.field_mc - 1;
                                                              break L1;
                                                            }
                                                          } else {
                                                            break L1;
                                                          }
                                                        } else {
                                                          if (20 == var2) {
                                                            kd.a(false, io.field_c, (byte) 120, (we) (Object) var1);
                                                            break L1;
                                                          } else {
                                                            if (-22 == var2) {
                                                              var3_int = ((we) (Object) var1).a((byte) -120);
                                                              if (var3_int == 0) {
                                                                bo.field_e = 0L;
                                                                break L1;
                                                              } else {
                                                                bo.field_e = (long)var3_int + hm.a(64);
                                                                break L1;
                                                              }
                                                            } else {
                                                              if (-23 != (var2 ^ -1)) {
                                                                if (var2 != 23) {
                                                                  jo.a(1, "L1: " + jm.b(-74), (Throwable) null);
                                                                  na.a(true);
                                                                  break L1;
                                                                } else {
                                                                  hn.field_f = ((we) (Object) var1).a(false);
                                                                  break L1;
                                                                }
                                                              } else {
                                                                gi.field_a = ((we) (Object) var1).a((byte) 63);
                                                                ui.field_e = ((we) (Object) var1).j(127);
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L15: {
                                                  stackOut_111_0 = (pc) var1;
                                                  stackIn_113_0 = stackOut_111_0;
                                                  stackIn_112_0 = stackOut_111_0;
                                                  if (param0) {
                                                    stackOut_113_0 = (pc) (Object) stackIn_113_0;
                                                    stackOut_113_1 = 0;
                                                    stackIn_114_0 = stackOut_113_0;
                                                    stackIn_114_1 = stackOut_113_1;
                                                    break L15;
                                                  } else {
                                                    stackOut_112_0 = (pc) (Object) stackIn_112_0;
                                                    stackOut_112_1 = 1;
                                                    stackIn_114_0 = stackOut_112_0;
                                                    stackIn_114_1 = stackOut_112_1;
                                                    break L15;
                                                  }
                                                }
                                                var3 = ((we) (Object) stackIn_114_0).a(stackIn_114_1 != 0);
                                                var5 = ((we) (Object) var1).f(255);
                                                var20 = gp.a(2, var3);
                                                if (var20 == null) {
                                                  break L1;
                                                } else {
                                                  L16: {
                                                    if (15 != var2) {
                                                      if (!var20.field_Jb) {
                                                        break L16;
                                                      } else {
                                                        ka.field_X = ka.field_X - 1;
                                                        var20.field_Jb = false;
                                                        break L16;
                                                      }
                                                    } else {
                                                      var20.field_Vb = false;
                                                      break L16;
                                                    }
                                                  }
                                                  L17: {
                                                    if (var5 == 0) {
                                                      break L17;
                                                    } else {
                                                      var20.field_Tb = mh.field_b;
                                                      var20.field_Eb = var5;
                                                      break L17;
                                                    }
                                                  }
                                                  il.a(-124, var20);
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                          var3 = ((we) (Object) var1).a(false);
                                          var21 = gp.a(2, var3);
                                          if (var21 == null) {
                                            break L1;
                                          } else {
                                            if (var2 == 14) {
                                              var21.field_Vb = true;
                                              il.a(-97, var21);
                                              break L1;
                                            } else {
                                              if (var21.field_Jb) {
                                                il.a(-97, var21);
                                                break L1;
                                              } else {
                                                ka.field_X = ka.field_X + 1;
                                                var21.field_Jb = true;
                                                il.a(-97, var21);
                                                break L1;
                                              }
                                            }
                                          }
                                        } else {
                                          var3_int = ((we) (Object) var1).a((byte) 107);
                                          var4_int = ((we) (Object) var1).f(255);
                                          var16_ref = (eq) (Object) dg.field_f.a(-11434, (long)var3_int);
                                          if (var16_ref != null) {
                                            L18: {
                                              var16_ref.field_Ob = false;
                                              var6 = var16_ref;
                                              if (var4_int != 0) {
                                                var16_ref.field_Rb = mh.field_b;
                                                var16_ref.field_Qb = var4_int;
                                                break L18;
                                              } else {
                                                break L18;
                                              }
                                            }
                                            var6.field_cc = false;
                                            w.a((byte) -48, var16_ref);
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var3_int = ((we) (Object) var1).a((byte) -124);
                                  var22_ref = (eq) (Object) dg.field_f.a(-11434, (long)var3_int);
                                  if (var22_ref != null) {
                                    if (var2 != 11) {
                                      var22_ref.field_Ob = true;
                                      w.a((byte) -48, var22_ref);
                                      break L1;
                                    } else {
                                      var22_ref.field_cc = true;
                                      w.a((byte) -48, var22_ref);
                                      break L1;
                                    }
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            }
                          } else {
                            var3_ref_uj = (uj) (Object) i.field_n.c(1504642273);
                            L19: while (true) {
                              if (var3_ref_uj == null) {
                                ka.field_X = 0;
                                break L1;
                              } else {
                                var3_ref_uj.c(2779);
                                var3_ref_uj.e(17);
                                var3_ref_uj = (uj) (Object) i.field_n.f(1504642273);
                                continue L19;
                              }
                            }
                          }
                        }
                      } else {
                        L20: {
                          var3 = ((we) (Object) var1).a(false);
                          var14 = ((we) (Object) var1).h(5);
                          var13 = ((we) (Object) var1).h(5);
                          var15 = ((we) (Object) var1).h(5);
                          var8_ref = gp.a(2, var3);
                          if (var13.equals((Object) (Object) "")) {
                            stackOut_44_0 = 0;
                            stackIn_45_0 = stackOut_44_0;
                            break L20;
                          } else {
                            stackOut_43_0 = 1;
                            stackIn_45_0 = stackOut_43_0;
                            break L20;
                          }
                        }
                        L21: {
                          var9 = stackIn_45_0;
                          if (var8_ref != null) {
                            if (var9 == 0) {
                              break L21;
                            } else {
                              L22: {
                                stackOut_48_0 = (uj) var8_ref;
                                stackOut_48_1 = (String) var15;
                                stackOut_48_2 = (String) var14;
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_50_1 = stackOut_48_1;
                                stackIn_50_2 = stackOut_48_2;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                stackIn_49_2 = stackOut_48_2;
                                if (param0) {
                                  stackOut_50_0 = (uj) (Object) stackIn_50_0;
                                  stackOut_50_1 = (String) (Object) stackIn_50_1;
                                  stackOut_50_2 = (String) (Object) stackIn_50_2;
                                  stackOut_50_3 = 0;
                                  stackIn_51_0 = stackOut_50_0;
                                  stackIn_51_1 = stackOut_50_1;
                                  stackIn_51_2 = stackOut_50_2;
                                  stackIn_51_3 = stackOut_50_3;
                                  break L22;
                                } else {
                                  stackOut_49_0 = (uj) (Object) stackIn_49_0;
                                  stackOut_49_1 = (String) (Object) stackIn_49_1;
                                  stackOut_49_2 = (String) (Object) stackIn_49_2;
                                  stackOut_49_3 = 1;
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  stackIn_51_2 = stackOut_49_2;
                                  stackIn_51_3 = stackOut_49_3;
                                  break L22;
                                }
                              }
                              ((uj) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2, stackIn_51_3 != 0);
                              break L21;
                            }
                          } else {
                            var8_ref = new uj(var14, var15, var3);
                            il.field_d.a(false, (lm) (Object) var8_ref, var3);
                            break L21;
                          }
                        }
                        L23: {
                          var8_ref.field_Pb = hm.a(64) - (long)((we) (Object) var1).k(0);
                          var8_ref.field_Rb = ((we) (Object) var1).a((byte) 105);
                          var10 = ((we) (Object) var1).j(127);
                          var8_ref.field_Yb = var10 >> 532671137;
                          stackOut_52_0 = (uj) var8_ref;
                          stackIn_54_0 = stackOut_52_0;
                          stackIn_53_0 = stackOut_52_0;
                          if (-1 == (var10 & 1 ^ -1)) {
                            stackOut_54_0 = (uj) (Object) stackIn_54_0;
                            stackOut_54_1 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            stackIn_55_1 = stackOut_54_1;
                            break L23;
                          } else {
                            stackOut_53_0 = (uj) (Object) stackIn_53_0;
                            stackOut_53_1 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_55_1 = stackOut_53_1;
                            break L23;
                          }
                        }
                        stackIn_55_0.field_Xb = stackIn_55_1 != 0;
                        var8_ref.field_Qb = ((we) (Object) var1).f(255);
                        var8_ref.field_Ib = ((we) (Object) var1).f(255);
                        il.a(-28, var8_ref);
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          var3_ref_uj = (uj) (Object) wi.field_a.c(1504642273);
          L24: while (true) {
            if (var3_ref_uj == null) {
              var3_ref_uj = (uj) (Object) il.field_d.a(-110);
              L25: while (true) {
                if (var3_ref_uj == null) {
                  L26: {
                    if (-2 != var2) {
                      break L26;
                    } else {
                      if (null != io.field_c) {
                        wo.field_b = io.field_c.field_pc;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (-5 == var2) {
                      var3_int = ((we) (Object) var1).a((byte) 49);
                      io.field_c = new eq(fj.field_b);
                      io.field_c.a((long)var3_int, 29574);
                      kd.a(false, io.field_c, (byte) 120, (we) (Object) var1);
                      bo.field_e = 0L;
                      break L27;
                    } else {
                      io.field_c = null;
                      break L27;
                    }
                  }
                  L28: {
                    L29: {
                      if (var2 == 2) {
                        break L29;
                      } else {
                        if (var2 != 3) {
                          bn.field_S = null;
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (bn.field_S != null) {
                      break L28;
                    } else {
                      bn.field_S = new eq(fj.field_b);
                      break L28;
                    }
                  }
                  if (var2 != 3) {
                    rl.field_r = false;
                    break L1;
                  } else {
                    rl.field_r = true;
                    var3_int = 0;
                    L30: while (true) {
                      if (var3_int >= qm.field_J.length) {
                        ib.field_a = ((we) (Object) var1).f(255);
                        mg.field_i = ((we) (Object) var1).f(255);
                        var3_int = 0;
                        L31: while (true) {
                          if (k.field_k.length <= var3_int) {
                            break L1;
                          } else {
                            k.field_k[var3_int] = ((we) (Object) var1).a(0);
                            var3_int++;
                            continue L31;
                          }
                        }
                      } else {
                        qm.field_J[var3_int] = ((we) (Object) var1).a(0);
                        var3_int++;
                        continue L30;
                      }
                    }
                  }
                } else {
                  L32: {
                    L33: {
                      if (var3_ref_uj.field_Vb) {
                        break L33;
                      } else {
                        if (!var3_ref_uj.field_Jb) {
                          break L32;
                        } else {
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (!var3_ref_uj.field_Jb) {
                        break L34;
                      } else {
                        ka.field_X = ka.field_X - 1;
                        var3_ref_uj.field_Jb = false;
                        break L34;
                      }
                    }
                    var3_ref_uj.field_Vb = false;
                    il.a(-117, var3_ref_uj);
                    break L32;
                  }
                  var3_ref_uj = (uj) (Object) il.field_d.a((byte) 50);
                  continue L25;
                }
              }
            } else {
              var3_ref_uj.c(2779);
              var3_ref_uj.e(17);
              var3_ref_uj = (uj) (Object) wi.field_a.f(1504642273);
              continue L24;
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, db param3) {
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param0 == -1) {
            jc.a("terms.ws", -14);
        } else {
            if (-2 == param0) {
                jc.a("privacy.ws", -27);
            } else {
                if (-3 == (param0 ^ -1)) {
                    jc.a("conduct.ws", -120);
                }
            }
        }
        if (param2 != -8894) {
            Object var7 = null;
            int discarded$0 = this.a((String) null, 66, (ng) null, -19, -43);
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        if (param2 != 11) {
            ((pl) this).field_K = null;
        }
        if (((pl) this).field_K == param0) {
            mj.c(24496);
        } else {
            if (!(param0 != ((pl) this).field_R)) {
                boolean discarded$0 = this.a(10152);
            }
        }
    }

    private final boolean a(bp param0, boolean param1) {
        ml var3 = param0.a(1);
        if (!(var3 != null)) {
            return true;
        }
        dj var4 = var3.a((byte) 112);
        if (sk.field_a == var4) {
            return false;
        }
        if (var4 == uo.field_b) {
            return false;
        }
        if (!(var4 != wh.field_o)) {
            return false;
        }
        if (param1) {
            boolean discarded$0 = pl.m(-52);
            return true;
        }
        return true;
    }

    public final void a(String param0, byte param1) {
        int var4 = 117 % ((34 - param1) / 59);
        gk var3 = ((pl) this).field_U;
        String var5 = param0;
        ((c) (Object) var3).a(false, (byte) 87, var5);
    }

    private final int a(String param0, ng param1, int param2, int param3, int param4, int param5, String param6) {
        qp var10 = new qp(20, param4, 120 - -param3, 25, param1, false, 120, 3, he.field_d, 16777215, param0);
        ((pl) this).b((ng) (Object) var10, 80);
        md var9 = new md(((bp) (Object) param1).a(param5 + -125), param6, param5, var10.field_C + param4, 50 + param3, param2);
        var9.field_n = (fn) this;
        ((pl) this).b((ng) (Object) var9, 80);
        return var10.field_C + var9.field_C;
    }

    private final String n(int param0) {
        if (param0 != 3) {
            String discarded$0 = this.n(-59);
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (param0 == 98) {
            return ((pl) this).a(param1 + -3, param2);
        }
        if (99 == param0) {
            return ((pl) this).b(10, param2);
        }
        return false;
    }

    private final boolean a(int param0) {
        if (!this.d(true)) {
            return false;
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((pl) this).field_Q.field_q);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 != 10152) {
            Object var4 = null;
            ((pl) this).a(-14, 96, -17, (ng) null);
        }
        return oi.a((pl) this, var2, ((pl) this).field_T.field_M, ((pl) this).field_P.field_q, (byte) -98, ((pl) this).field_V.field_q, ((pl) this).field_U.field_q);
    }

    private final boolean d(boolean param0) {
        Object var3 = null;
        Object stackIn_3_0 = null;
        gk stackIn_3_1 = null;
        Object stackIn_4_0 = null;
        gk stackIn_4_1 = null;
        Object stackIn_5_0 = null;
        gk stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        Object stackIn_8_0 = null;
        gk stackIn_8_1 = null;
        Object stackIn_9_0 = null;
        gk stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        gk stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        Object stackIn_12_0 = null;
        gk stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        gk stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        gk stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        Object stackIn_16_0 = null;
        gk stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        gk stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        gk stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackIn_20_0 = null;
        gk stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        gk stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        gk stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        Object stackOut_2_0 = null;
        gk stackOut_2_1 = null;
        Object stackOut_4_0 = null;
        gk stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        gk stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        Object stackOut_7_0 = null;
        gk stackOut_7_1 = null;
        Object stackOut_9_0 = null;
        gk stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        Object stackOut_8_0 = null;
        gk stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        Object stackOut_11_0 = null;
        gk stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        gk stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        Object stackOut_12_0 = null;
        gk stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        Object stackOut_15_0 = null;
        gk stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        gk stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        gk stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        Object stackOut_19_0 = null;
        gk stackOut_19_1 = null;
        Object stackOut_21_0 = null;
        gk stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        gk stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$2 = this.a((bp) null, false);
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = this;
          stackOut_2_1 = ((pl) this).field_U;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          if (param0) {
            stackOut_4_0 = this;
            stackOut_4_1 = (gk) (Object) stackIn_4_1;
            stackOut_4_2 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            break L1;
          } else {
            stackOut_3_0 = this;
            stackOut_3_1 = (gk) (Object) stackIn_3_1;
            stackOut_3_2 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_5_2 = stackOut_3_2;
            break L1;
          }
        }
        L2: {
          if (this.a((bp) (Object) stackIn_5_1, stackIn_5_2 == 0)) {
            break L2;
          } else {
            if (!this.a((bp) (Object) ((pl) this).field_P, false)) {
              break L2;
            } else {
              L3: {
                stackOut_7_0 = this;
                stackOut_7_1 = ((pl) this).field_L;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0) {
                  stackOut_9_0 = this;
                  stackOut_9_1 = (gk) (Object) stackIn_9_1;
                  stackOut_9_2 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L3;
                } else {
                  stackOut_8_0 = this;
                  stackOut_8_1 = (gk) (Object) stackIn_8_1;
                  stackOut_8_2 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L3;
                }
              }
              if (this.a((bp) (Object) stackIn_10_1, stackIn_10_2 == 0)) {
                break L2;
              } else {
                L4: {
                  stackOut_11_0 = this;
                  stackOut_11_1 = ((pl) this).field_V;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (param0) {
                    stackOut_13_0 = this;
                    stackOut_13_1 = (gk) (Object) stackIn_13_1;
                    stackOut_13_2 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L4;
                  } else {
                    stackOut_12_0 = this;
                    stackOut_12_1 = (gk) (Object) stackIn_12_1;
                    stackOut_12_2 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L4;
                  }
                }
                if (this.a((bp) (Object) stackIn_14_1, stackIn_14_2 == 0)) {
                  break L2;
                } else {
                  L5: {
                    stackOut_15_0 = this;
                    stackOut_15_1 = ((pl) this).field_X;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (param0) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = (gk) (Object) stackIn_17_1;
                      stackOut_17_2 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      break L5;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = (gk) (Object) stackIn_16_1;
                      stackOut_16_2 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      break L5;
                    }
                  }
                  if (this.a((bp) (Object) stackIn_18_1, stackIn_18_2 == 0)) {
                    break L2;
                  } else {
                    L6: {
                      stackOut_19_0 = this;
                      stackOut_19_1 = ((pl) this).field_Q;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      if (param0) {
                        stackOut_21_0 = this;
                        stackOut_21_1 = (gk) (Object) stackIn_21_1;
                        stackOut_21_2 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        break L6;
                      } else {
                        stackOut_20_0 = this;
                        stackOut_20_1 = (gk) (Object) stackIn_20_1;
                        stackOut_20_2 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        break L6;
                      }
                    }
                    if (this.a((bp) (Object) stackIn_22_1, stackIn_22_2 != 0)) {
                      return true;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    public static void e(byte param0) {
        field_J = null;
        if (param0 <= 63) {
            boolean discarded$0 = pl.m(-75);
        }
        field_Y = null;
    }

    final static boolean m(int param0) {
        if (param0 != 99) {
            field_O = 123;
        }
        return hn.field_f == io.field_c.field_kc ? true : false;
    }

    private final int a(String param0, int param1, ng param2, int param3, int param4, String param5) {
        if (param3 != 35) {
            ((pl) this).field_T = null;
        }
        return this.a(param5, param2, 35, param4, param1, 126, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new bb();
    }
}
