/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class ShatteredPlansClient extends tl {
    static int[] field_E;
    static in field_H;
    static String field_L;
    private pf field_G;
    static boolean field_K;
    static String field_J;
    private int field_I;
    public static boolean field_F;

    final static boolean a(int param0, long param1, String param2) {
        ve var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0 == 16) {
              L1: {
                var4 = hb.a((byte) -90, param2);
                if (var4 == null) {
                  break L1;
                } else {
                  if (var4.field_xb != null) {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (null == np.field_a) {
                    break L3;
                  } else {
                    if (ik.a(-101, param1) == null) {
                      break L3;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("ShatteredPlansClient.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void a(boolean param0) {
        if (param0) {
            ((ShatteredPlansClient) this).a(-37);
        }
        kf.e(120);
        if (!(null == bj.field_K)) {
            int discarded$0 = 0;
            ej.c();
        }
        w.f((byte) 89);
    }

    final void c(int param0) {
        ((ShatteredPlansClient) this).a(param0 + 257, 1, 14, 25, false, 0, 2, 4);
        h var3 = new h();
        var3.field_u.d(128, (byte) -110, 9);
        var3.field_r.d(128, (byte) -110, 9);
        var3.field_u.c(598, wm.field_b);
        var3.field_r.c(param0 ^ -599, wm.field_b);
        int discarded$0 = 1;
        da.a((java.awt.Component) (Object) tm.field_i, fa.field_W, var3, 1102, false, 22050, 22050);
        rm.field_b = 2458760;
        wo.field_a = 2805974;
        em.field_j = 2458760;
        ih.field_b = 2458760;
        ah.field_P = 2458760;
        es.field_n = 2805974;
        int discarded$1 = 0;
        int discarded$2 = 1;
        em.a(us.b());
        ((ShatteredPlansClient) this).a(false, true, -2839, true, true, false, false);
        td.field_K = hi.field_a;
        ae.field_a[71] = 4;
        ae.field_a[74] = -2;
        ae.field_a[58] = -2;
        ae.field_a[10] = -1;
        ae.field_a[63] = 1;
        ae.field_a[69] = 1;
        ae.field_a[64] = 1;
        ae.field_a[72] = 0;
        ae.field_a[70] = -2;
        ae.field_a[67] = -2;
        ae.field_a[9] = -1;
        ae.field_a[73] = 3;
        ae.field_a[66] = 15;
        ae.field_a[68] = param0;
        fl.field_h = ed.field_f;
        ae.field_a[62] = 1;
        ae.field_a[61] = 1;
        ae.field_a[65] = 1;
    }

    final void a(int param0) {
        try {
            int var2 = 0;
            int var3 = 0;
            lq var3_ref_lq = null;
            int var4 = 0;
            Object var4_ref = null;
            int var5 = 0;
            vr var5_ref_vr = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            km var11 = null;
            kq var12 = null;
            km var13 = null;
            int var14 = 0;
            jn var15 = null;
            kr var15_ref = null;
            Exception var15_ref2 = null;
            int var16 = 0;
            Object stackIn_5_0 = null;
            Object stackIn_6_0 = null;
            Object stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Object stackIn_44_0 = null;
            int stackIn_44_1 = 0;
            Object stackIn_45_0 = null;
            int stackIn_45_1 = 0;
            Object stackIn_46_0 = null;
            int stackIn_46_1 = 0;
            int stackIn_46_2 = 0;
            int stackIn_99_0 = 0;
            int stackIn_102_0 = 0;
            km stackIn_108_0 = null;
            kq stackIn_111_0 = null;
            int stackIn_115_0 = 0;
            km stackIn_122_0 = null;
            km stackIn_123_0 = null;
            km stackIn_124_0 = null;
            int stackIn_124_1 = 0;
            int stackIn_163_0 = 0;
            int stackIn_168_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_4_0 = null;
            Object stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            Object stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            Object stackOut_43_0 = null;
            int stackOut_43_1 = 0;
            Object stackOut_45_0 = null;
            int stackOut_45_1 = 0;
            int stackOut_45_2 = 0;
            Object stackOut_44_0 = null;
            int stackOut_44_1 = 0;
            int stackOut_44_2 = 0;
            int stackOut_162_0 = 0;
            int stackOut_161_0 = 0;
            int stackOut_166_0 = 0;
            int stackOut_167_0 = 0;
            int stackOut_98_0 = 0;
            int stackOut_97_0 = 0;
            int stackOut_101_0 = 0;
            int stackOut_100_0 = 0;
            km stackOut_107_0 = null;
            km stackOut_106_0 = null;
            Object stackOut_110_0 = null;
            kq stackOut_109_0 = null;
            int stackOut_114_0 = 0;
            int stackOut_113_0 = 0;
            km stackOut_121_0 = null;
            km stackOut_123_0 = null;
            int stackOut_123_1 = 0;
            km stackOut_122_0 = null;
            int stackOut_122_1 = 0;
            L0: {
              var16 = field_F ? 1 : 0;
              int discarded$33 = po.b(-87);
              l.field_f = po.b(-80);
              ql.a(-26848);
              if (null == bj.field_K) {
                break L0;
              } else {
                if (bj.field_K.field_c) {
                  int discarded$34 = 0;
                  ej.c();
                  kq.g(4);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            L1: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (null == bj.field_K) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L1;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L1;
              }
            }
            L2: {
              ((ShatteredPlansClient) this).a(stackIn_7_1 != 0, 77);
              if (!um.field_n) {
                break L2;
              } else {
                int discarded$35 = 0;
                this.c();
                um.field_n = false;
                break L2;
              }
            }
            L3: {
              cl.field_n = cl.field_n + 1;
              if (uf.a(false)) {
                ((ShatteredPlansClient) this).j((byte) -123);
                if (!uf.a(false)) {
                  break L3;
                } else {
                  if (ik.field_h) {
                    return;
                  } else {
                    L4: {
                      if (wb.b(91)) {
                        ik.field_h = this.c(82, false);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return;
                  }
                }
              } else {
                break L3;
              }
            }
            L5: {
              var2 = 0;
              if (!ik.field_h) {
                te.a(0, so.field_o);
                if (this.c(82, true)) {
                  ik.field_h = true;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                if (!m.f((byte) 122)) {
                  int discarded$36 = 125;
                  tc.f();
                  break L5;
                } else {
                  if (gl.field_e) {
                    if (!sq.a(false)) {
                      if (kh.f((byte) -67)) {
                        L6: {
                          var2 = 1;
                          stackOut_43_0 = this;
                          stackOut_43_1 = 1;
                          stackIn_45_0 = stackOut_43_0;
                          stackIn_45_1 = stackOut_43_1;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          if (bj.field_K == null) {
                            stackOut_45_0 = this;
                            stackOut_45_1 = stackIn_45_1;
                            stackOut_45_2 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            stackIn_46_2 = stackOut_45_2;
                            break L6;
                          } else {
                            stackOut_44_0 = this;
                            stackOut_44_1 = stackIn_44_1;
                            stackOut_44_2 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            stackIn_46_1 = stackOut_44_1;
                            stackIn_46_2 = stackOut_44_2;
                            break L6;
                          }
                        }
                        L7: {
                          L8: {
                            var3 = ((ShatteredPlansClient) this).a(stackIn_46_1 != 0, stackIn_46_2 != 0);
                            if (var3 == 1) {
                              break L8;
                            } else {
                              if (var3 != 2) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (bj.field_K != null) {
                              int discarded$37 = 0;
                              ej.c();
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          if (2 != var3) {
                            break L7;
                          } else {
                            da.a(1, (java.applet.Applet) this);
                            break L7;
                          }
                        }
                        this.b(false, true);
                        break L5;
                      } else {
                        int discarded$38 = 0;
                        if (i.c()) {
                          var2 = 1;
                          if (~jb.field_c != ~jb.field_g) {
                            this.b(false, false);
                            break L5;
                          } else {
                            L10: {
                              var3 = ch.a(106);
                              if (var3 != 1) {
                                break L10;
                              } else {
                                ns.field_ob = true;
                                qk.a(se.field_a, 0, (byte) 122);
                                break L10;
                              }
                            }
                            this.b(false, true);
                            break L5;
                          }
                        } else {
                          this.b(false, false);
                          break L5;
                        }
                      }
                    } else {
                      L11: {
                        if (~jb.field_g != ~jb.field_c) {
                          this.b(false, false);
                          break L11;
                        } else {
                          L12: {
                            int discarded$39 = 0;
                            var3 = cq.d();
                            if (var3 == 2) {
                              int discarded$40 = 0;
                              ej.c();
                              break L12;
                            } else {
                              if (3 == var3) {
                                ne.field_s = false;
                                m.a(8, 13421772, rm.field_b, 8, mp.field_b.field_K, mr.field_i, 240, mp.field_b.field_K + mp.field_b.field_q, mr.field_i, 320, (nq) (Object) mp.field_b, (nq) (Object) mp.field_b, 0, mp.field_b.field_K, ah.field_P, mp.field_b.field_q + mp.field_b.field_K, 0, 2, 480, (bi[]) null, es.field_n);
                                int discarded$41 = -1;
                                fm.a(true);
                                break L12;
                              } else {
                                if (var3 == 4) {
                                  ne.field_s = true;
                                  qk.a(wi.field_b, 0, (byte) 125);
                                  break L12;
                                } else {
                                  this.b(false, true);
                                  break L11;
                                }
                              }
                            }
                          }
                          this.b(false, true);
                          break L11;
                        }
                      }
                      var2 = 1;
                      break L5;
                    }
                  } else {
                    L13: {
                      int discarded$42 = 1;
                      if (w.d()) {
                        break L13;
                      } else {
                        s.a(1);
                        break L13;
                      }
                    }
                    gl.field_e = true;
                    break L5;
                  }
                }
              }
            }
            L14: {
              if (var2 != 0) {
                if (~gg.field_a >= ~eb.field_b) {
                  break L14;
                } else {
                  int fieldTemp$43 = eb.field_b + jl.field_U;
                  eb.field_b = eb.field_b + jl.field_U;
                  if (gg.field_a >= fieldTemp$43) {
                    break L14;
                  } else {
                    eb.field_b = gg.field_a;
                    break L14;
                  }
                }
              } else {
                if (0 >= eb.field_b) {
                  break L14;
                } else {
                  int fieldTemp$44 = eb.field_b - jl.field_U;
                  eb.field_b = eb.field_b - jl.field_U;
                  if (fieldTemp$44 >= 0) {
                    break L14;
                  } else {
                    eb.field_b = 0;
                    break L14;
                  }
                }
              }
            }
            L15: {
              int discarded$45 = 1;
              if (!w.d()) {
                L16: while (true) {
                  var3_ref_lq = (lq) (Object) jq.field_a.h(54);
                  if (var3_ref_lq == null) {
                    break L15;
                  } else {
                    int discarded$46 = 4;
                    int discarded$47 = 1500005281;
                    gd.a(var3_ref_lq);
                    continue L16;
                  }
                }
              } else {
                break L15;
              }
            }
            var3 = -87 % ((15 - param0) / 35);
            L17: while (true) {
              int discarded$48 = 1;
              if (!di.a(ae.field_a)) {
                L18: {
                  d.a(0, (byte) 82);
                  if (null == ur.field_zb) {
                    break L18;
                  } else {
                    if (ur.field_zb.field_j) {
                      vq.field_a = vq.field_a | ur.field_zb.field_h;
                      oe.field_e = ur.field_zb.field_l;
                      ur.field_zb = null;
                      hg.field_r = true;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if (vr.field_c != -2) {
                    break L19;
                  } else {
                    if (gr.field_o == -1) {
                      break L19;
                    } else {
                      ge.field_n = true;
                      break L19;
                    }
                  }
                }
                L20: {
                  if (ge.field_n) {
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  L22: {
                    if (se.field_g) {
                      break L22;
                    } else {
                      L23: {
                        if (ce.field_x == null) {
                          break L23;
                        } else {
                          if (ce.field_x.field_j) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (in.field_g == null) {
                          break L24;
                        } else {
                          if (!in.field_g.field_j) {
                            break L24;
                          } else {
                            break L22;
                          }
                        }
                      }
                      stackOut_162_0 = 0;
                      stackIn_163_0 = stackOut_162_0;
                      break L21;
                    }
                  }
                  stackOut_161_0 = 1;
                  stackIn_163_0 = stackOut_161_0;
                  break L21;
                }
                L25: {
                  L26: {
                    var4 = stackIn_163_0;
                    if (var4 == 0) {
                      break L26;
                    } else {
                      if (!di.field_p[82]) {
                        break L26;
                      } else {
                        if (!di.field_p[73]) {
                          break L26;
                        } else {
                          stackOut_166_0 = 1;
                          stackIn_168_0 = stackOut_166_0;
                          break L25;
                        }
                      }
                    }
                  }
                  stackOut_167_0 = 0;
                  stackIn_168_0 = stackOut_167_0;
                  break L25;
                }
                L27: {
                  var5 = stackIn_168_0;
                  if (var5 == 0) {
                    break L27;
                  } else {
                    q.g(-108);
                    break L27;
                  }
                }
                L28: {
                  if (jc.f(-11)) {
                    L29: {
                      L30: {
                        var6 = ((ShatteredPlansClient) this).i((byte) 16);
                        if (var6 == 0) {
                          break L30;
                        } else {
                          if (var6 == 1) {
                            break L30;
                          } else {
                            break L29;
                          }
                        }
                      }
                      vs.a(4, (byte) -103);
                      int discarded$49 = 1;
                      int discarded$50 = 7;
                      se.a();
                      int discarded$51 = 37;
                      int discarded$52 = 6;
                      oq.a();
                      int discarded$53 = 1;
                      ef.a();
                      if (1 == var6) {
                        is.field_a = true;
                        md.field_Q = true;
                        break L29;
                      } else {
                        L31: {
                          if (!mf.field_p) {
                            break L31;
                          } else {
                            L32: {
                              lg.field_b = true;
                              cs.field_i = false;
                              ak.field_A = true;
                              if (!v.field_b) {
                                ta.a(0, 0, (byte) 96, false);
                                break L32;
                              } else {
                                oi.field_c = ch.field_a;
                                ta.a(0, 10, (byte) 96, false);
                                break L32;
                              }
                            }
                            rn.a(1048576);
                            mj.field_Hb[vr.field_c].a(0, (byte) 84, false);
                            kc.field_d = false;
                            v.field_b = false;
                            mf.field_p = false;
                            int discarded$54 = 0;
                            wm.a();
                            break L31;
                          }
                        }
                        md.field_Q = false;
                        is.field_a = false;
                        break L29;
                      }
                    }
                    L33: {
                      var7 = 0;
                      if (var6 != 2) {
                        break L33;
                      } else {
                        var7 = 1;
                        break L33;
                      }
                    }
                    L34: {
                      if (var5 != 0) {
                        var7 = 1;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    L35: {
                      L36: {
                        if (mf.field_p) {
                          break L36;
                        } else {
                          if (md.field_Q) {
                            break L36;
                          } else {
                            if (is.field_a) {
                              break L36;
                            } else {
                              break L35;
                            }
                          }
                        }
                      }
                      var7 = 1;
                      break L35;
                    }
                    if (var7 == 0) {
                      break L28;
                    } else {
                      oh.b(-11);
                      break L28;
                    }
                  } else {
                    break L28;
                  }
                }
                return;
              } else {
                if (ej.field_e == 9) {
                  rn.a(1048576);
                  md.field_Q = false;
                  gr.field_o = 10;
                  oi.field_c = sa.field_a.e(-1);
                  continue L17;
                } else {
                  if (ej.field_e == 14) {
                    rn.a(1048576);
                    int discarded$55 = 122;
                    int discarded$56 = 42;
                    int discarded$57 = 122;
                    int discarded$58 = 100;
                    int discarded$59 = 150;
                    be.a(a.a(20605), js.a(2000), pe.m(), 1024, js.a(6), (byte) -122, hn.field_j.length, bb.a(), pg.field_C);
                    int discarded$60 = 83;
                    sj.a((byte) 77, js.b((byte) 121), fl.a());
                    mf.field_p = true;
                    md.field_Q = false;
                    gr.field_o = -2;
                    continue L17;
                  } else {
                    if (15 == ej.field_e) {
                      L37: {
                        if (!mf.field_p) {
                          break L37;
                        } else {
                          rn.a(1048576);
                          rh.a((byte) -122);
                          qn.b(112);
                          ta.a(0, 0, (byte) 96, false);
                          mf.field_p = false;
                          lg.field_b = true;
                          cs.field_i = false;
                          kc.field_d = false;
                          v.field_b = false;
                          ak.field_A = true;
                          int discarded$61 = 0;
                          wm.a();
                          break L37;
                        }
                      }
                      is.field_a = false;
                      md.field_Q = false;
                      continue L17;
                    } else {
                      L38: {
                        if (ej.field_e != 10) {
                          break L38;
                        } else {
                          if (mf.field_p) {
                            int discarded$62 = 112;
                            rp.h();
                            continue L17;
                          } else {
                            break L38;
                          }
                        }
                      }
                      if (ej.field_e != 71) {
                        if (58 != ej.field_e) {
                          if (60 == ej.field_e) {
                            L39: {
                              L40: {
                                if (v.field_b) {
                                  break L40;
                                } else {
                                  if (kc.field_d) {
                                    break L40;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              L41: {
                                rn.a(1048576);
                                if (!v.field_b) {
                                  break L41;
                                } else {
                                  ce.field_x.a(false, false);
                                  break L41;
                                }
                              }
                              lg.field_b = true;
                              v.field_b = false;
                              gr.field_o = -2;
                              cs.field_i = false;
                              kc.field_d = false;
                              ge.field_n = true;
                              int discarded$63 = 0;
                              wm.a();
                              break L39;
                            }
                            is.field_a = false;
                            continue L17;
                          } else {
                            L42: {
                              var4_ref = null;
                              if (!v.field_b) {
                                if (kc.field_d) {
                                  var4_ref = (Object) (Object) in.field_g;
                                  break L42;
                                } else {
                                  break L42;
                                }
                              } else {
                                var4_ref = (Object) (Object) ce.field_x;
                                break L42;
                              }
                            }
                            L43: {
                              if (var4_ref == null) {
                                break L43;
                              } else {
                                if (((km) var4_ref).c(14759)) {
                                  continue L17;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            ((ShatteredPlansClient) this).e((byte) -84);
                            continue L17;
                          }
                        } else {
                          L44: {
                            rn.a(1048576);
                            var4 = sa.field_a.j(-93);
                            var5_ref_vr = kj.a((byte) -85, (ob) (Object) sa.field_a);
                            var6 = sa.field_a.g(-2852);
                            if (sa.field_a.j(-95) == 0) {
                              stackOut_98_0 = 0;
                              stackIn_99_0 = stackOut_98_0;
                              break L44;
                            } else {
                              stackOut_97_0 = 1;
                              stackIn_99_0 = stackOut_97_0;
                              break L44;
                            }
                          }
                          L45: {
                            var7 = stackIn_99_0;
                            var8 = sa.field_a.g(-2852);
                            if (var8 < 0) {
                              stackOut_101_0 = 0;
                              stackIn_102_0 = stackOut_101_0;
                              break L45;
                            } else {
                              stackOut_100_0 = 1;
                              stackIn_102_0 = stackOut_100_0;
                              break L45;
                            }
                          }
                          var9 = stackIn_102_0;
                          var10 = new String[sa.field_a.j(-128)];
                          var11_int = 0;
                          L46: while (true) {
                            if (var11_int >= var10.length) {
                              L47: {
                                tq.field_b = null;
                                if (var9 == 0) {
                                  stackOut_107_0 = in.field_g;
                                  stackIn_108_0 = stackOut_107_0;
                                  break L47;
                                } else {
                                  stackOut_106_0 = ce.field_x;
                                  stackIn_108_0 = stackOut_106_0;
                                  break L47;
                                }
                              }
                              L48: {
                                var11 = stackIn_108_0;
                                if (var11 == null) {
                                  stackOut_110_0 = null;
                                  stackIn_111_0 = (kq) (Object) stackOut_110_0;
                                  break L48;
                                } else {
                                  stackOut_109_0 = var11.field_Y;
                                  stackIn_111_0 = stackOut_109_0;
                                  break L48;
                                }
                              }
                              L49: {
                                var12 = stackIn_111_0;
                                var13 = new km(true, false, var4, var5_ref_vr, var6, var10, var8, var7 != 0, var12);
                                var14 = 1;
                                if (var13.field_n == null) {
                                  break L49;
                                } else {
                                  L50: {
                                    if (1 != sa.field_a.j(-122)) {
                                      stackOut_114_0 = 0;
                                      stackIn_115_0 = stackOut_114_0;
                                      break L50;
                                    } else {
                                      stackOut_113_0 = 1;
                                      stackIn_115_0 = stackOut_113_0;
                                      break L50;
                                    }
                                  }
                                  var14 = stackIn_115_0;
                                  break L49;
                                }
                              }
                              try {
                                L51: {
                                  var13.field_P.a((ob) (Object) sa.field_a, var13.field_n, false);
                                  decompiledRegionSelector0 = 0;
                                  break L51;
                                }
                              } catch (jn decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L52: {
                                  var15 = (jn) (Object) decompiledCaughtException;
                                  jq.a(-29901, (Throwable) (Object) var15, "Map Generation failed when receiving initial game state from server.");
                                  q.g(-96);
                                  decompiledRegionSelector0 = 1;
                                  break L52;
                                }
                              } catch (kr decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L53: {
                                  var15_ref = (kr) (Object) decompiledCaughtException;
                                  jq.a(-29901, (Throwable) (Object) var15_ref, "Gamestate received from server is invalid.");
                                  q.g(-96);
                                  decompiledRegionSelector0 = 1;
                                  break L53;
                                }
                              } catch (java.lang.Exception decompiledCaughtParameter2) {
                                decompiledCaughtException = decompiledCaughtParameter2;
                                L54: {
                                  var15_ref2 = (Exception) (Object) decompiledCaughtException;
                                  jq.a(-29901, (Throwable) (Object) var15_ref2, "Error receiving gamestate from server.");
                                  q.g(-119);
                                  decompiledRegionSelector0 = 1;
                                  break L54;
                                }
                              }
                              if (decompiledRegionSelector0 == 0) {
                                L55: {
                                  var13.b((byte) -81);
                                  stackOut_121_0 = (km) var13;
                                  stackIn_123_0 = stackOut_121_0;
                                  stackIn_122_0 = stackOut_121_0;
                                  if (var14 == 0) {
                                    stackOut_123_0 = (km) (Object) stackIn_123_0;
                                    stackOut_123_1 = 0;
                                    stackIn_124_0 = stackOut_123_0;
                                    stackIn_124_1 = stackOut_123_1;
                                    break L55;
                                  } else {
                                    stackOut_122_0 = (km) (Object) stackIn_122_0;
                                    stackOut_122_1 = 1;
                                    stackIn_124_0 = stackOut_122_0;
                                    stackIn_124_1 = stackOut_122_1;
                                    break L55;
                                  }
                                }
                                L56: {
                                  stackIn_124_0.field_L = stackIn_124_1 != 0;
                                  if (var9 != 0) {
                                    v.field_b = true;
                                    ce.field_x = var13;
                                    int discarded$64 = 8;
                                    ri.k();
                                    wp.a(-2);
                                    int discarded$65 = -98;
                                    qf.b();
                                    break L56;
                                  } else {
                                    in.field_g = var13;
                                    kc.field_d = true;
                                    break L56;
                                  }
                                }
                                ta.a(0, -1, (byte) 96, false);
                                ge.field_n = false;
                                cs.field_i = true;
                                is.field_a = false;
                                continue L17;
                              } else {
                                continue L17;
                              }
                            } else {
                              var10[var11_int] = sa.field_a.e((byte) -111);
                              var11_int++;
                              continue L46;
                            }
                          }
                        }
                      } else {
                        if (!hg.field_r) {
                          continue L17;
                        } else {
                          var4 = sa.field_a.a(16711680);
                          var4 = var4 & ~vq.field_a;
                          var5 = 0;
                          L57: while (true) {
                            if (var5 >= 25) {
                              vq.field_a = vq.field_a | var4;
                              continue L17;
                            } else {
                              L58: {
                                var6 = 1 << var5;
                                if ((var6 & var4) == 0) {
                                  break L58;
                                } else {
                                  ((ShatteredPlansClient) this).field_G.a((byte) -113, (oh) (Object) new he(var5));
                                  break L58;
                                }
                              }
                              var5++;
                              continue L57;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void l() {
        int var2_int = 0;
        String var2 = null;
        int var3 = 0;
        var3 = field_F ? 1 : 0;
        wg.field_e = new rl();
        wg.field_e.a("<col=2F5FBF>", 27275, "key");
        wg.field_e.a("<col=FF8080>", 27275, "highlight");
        wg.field_e.a("<col=2F5FBF>", 27275, "glossary");
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= 4) {
            wg.field_e.a(field_L, 27275, "territories");
            wg.field_e.a(dm.field_c, 27275, "uioptions");
            wg.field_e.a(ba.field_a, 27275, "fleetinfo");
            wg.field_e.a(ib.field_c, 27275, "projects");
            wg.field_e.a(vj.field_B, 27275, "diplomacy");
            wg.field_e.a(uq.field_l, 27275, "messages");
            wg.field_e.a(Integer.toString(gm.field_k[0], 16), 27275, "colmetal");
            wg.field_e.a(Integer.toString(gm.field_k[1], 16), 27275, "colbiomass");
            wg.field_e.a(Integer.toString(gm.field_k[2], 16), 27275, "colenergy");
            wg.field_e.a(Integer.toString(gm.field_k[3], 16), 27275, "colexotics");
            var2 = "<col=<%0>><%1></col>";
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "project_metal");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "project_biomass");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "project_energy");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "Project_Metal");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "Project_Biomass");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "Project_Energy");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "Project_Exotics");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "PROJECT_METAL");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "PROJECT_BIOMASS");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "PROJECT_ENERGY");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "PROJECT_EXOTICS");
            return;
          } else {
            wg.field_e.a(re.a("<col=<%0>><%1></col>", 4371, new String[2]), 27275, "resource" + var2_int);
            wg.field_e.a(re.a("<col=<%0>><%1></col>", 4371, new String[2]), 27275, "Resource" + var2_int);
            var2_int++;
            continue L0;
          }
        }
    }

    private final boolean c(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        var4 = field_F ? 1 : 0;
        int discarded$9 = 51;
        na.a();
        if (null != cm.field_a) {
          L0: {
            if (!kl.field_s.b((byte) 127)) {
              break L0;
            } else {
              if (kl.field_s.a("basic", -70)) {
                L1: {
                  if (!kl.field_s.b((byte) -45)) {
                    break L1;
                  } else {
                    if (kl.field_s.a("lobby", 98)) {
                      L2: {
                        if (!rl.field_f.b((byte) 120)) {
                          break L2;
                        } else {
                          if (rl.field_f.a("lobby", -112)) {
                            L3: {
                              if (!cm.field_a.b((byte) 120)) {
                                break L3;
                              } else {
                                if (!cm.field_a.a(-1)) {
                                  break L3;
                                } else {
                                  L4: {
                                    if (!ld.field_m.b((byte) -70)) {
                                      break L4;
                                    } else {
                                      if (!ld.field_m.a(-1)) {
                                        break L4;
                                      } else {
                                        L5: {
                                          if (!df.field_n.b((byte) 111)) {
                                            break L5;
                                          } else {
                                            if (!df.field_n.a(-1)) {
                                              break L5;
                                            } else {
                                              L6: {
                                                if (!m.field_z.b((byte) -121)) {
                                                  break L6;
                                                } else {
                                                  if (!m.field_z.a(-1)) {
                                                    break L6;
                                                  } else {
                                                    L7: {
                                                      if (!ms.field_d.b((byte) -81)) {
                                                        break L7;
                                                      } else {
                                                        if (!ms.field_d.a("", -67)) {
                                                          break L7;
                                                        } else {
                                                          L8: {
                                                            if (!nh.field_l.b((byte) -19)) {
                                                              break L8;
                                                            } else {
                                                              if (nh.field_l.a(-1)) {
                                                                L9: {
                                                                  if (!ti.field_g.b((byte) -79)) {
                                                                    break L9;
                                                                  } else {
                                                                    if (!ti.field_g.a(-1)) {
                                                                      break L9;
                                                                    } else {
                                                                      L10: {
                                                                        if (!ai.field_c.b((byte) -40)) {
                                                                          break L10;
                                                                        } else {
                                                                          if (!ai.field_c.a(-1)) {
                                                                            break L10;
                                                                          } else {
                                                                            L11: {
                                                                              if (!oi.field_h.b((byte) -125)) {
                                                                                break L11;
                                                                              } else {
                                                                                if (!oi.field_h.a(-1)) {
                                                                                  break L11;
                                                                                } else {
                                                                                  L12: {
                                                                                    if (!la.field_k.b((byte) -87)) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      if (!la.field_k.a(-1)) {
                                                                                        break L12;
                                                                                      } else {
                                                                                        dp.e(-23771);
                                                                                        nj.a(65.0f, 2, jp.field_xb);
                                                                                        ((ShatteredPlansClient) this).d(1);
                                                                                        if (param1) {
                                                                                          int discarded$10 = 100;
                                                                                          vo.a(ld.field_m, cm.field_a);
                                                                                          cm.field_a = null;
                                                                                          ld.field_m = null;
                                                                                          u.c(122);
                                                                                          return false;
                                                                                        } else {
                                                                                          return false;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  nj.a(75.0f, 2, nc.a(ed.field_e, la.field_k, 36, jh.field_v));
                                                                                  return false;
                                                                                }
                                                                              }
                                                                            }
                                                                            nj.a(75.0f, 2, bh.a("", oi.field_h, (byte) 77, ed.field_e, jh.field_v));
                                                                            return false;
                                                                          }
                                                                        }
                                                                      }
                                                                      nj.a(75.0f, 2, bh.a("", ai.field_c, (byte) 39, ed.field_e, jh.field_v));
                                                                      return false;
                                                                    }
                                                                  }
                                                                }
                                                                nj.a(75.0f, 2, bh.a("", ti.field_g, (byte) 12, fa.field_J, ii.field_r));
                                                                return false;
                                                              } else {
                                                                break L8;
                                                              }
                                                            }
                                                          }
                                                          nj.a(75.0f, 2, bh.a("", nh.field_l, (byte) 61, fa.field_J, ii.field_r));
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    nj.a(75.0f, 2, bh.a("", ms.field_d, (byte) 11, fa.field_J, ii.field_r));
                                                    return false;
                                                  }
                                                }
                                              }
                                              nj.a(60.0f, 2, bh.a("", m.field_z, (byte) 62, le.field_a, hc.field_b));
                                              return false;
                                            }
                                          }
                                        }
                                        nj.a(45.0f, 2, ve.a(df.field_n, 0, le.field_a, hc.field_b, -14930));
                                        return false;
                                      }
                                    }
                                  }
                                  nj.a(40.0f, 2, bh.a("", ld.field_m, (byte) 47, kh.field_Db, k.field_e));
                                  return false;
                                }
                              }
                            }
                            nj.a(20.0f, 2, bh.a("", cm.field_a, (byte) 117, kh.field_Db, k.field_e));
                            return false;
                          } else {
                            break L2;
                          }
                        }
                      }
                      nj.a(17.0f, 2, bh.a("lobby", rl.field_f, (byte) 94, rq.field_h, on.field_h));
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                nj.a(13.0f, 2, bh.a("lobby", kl.field_s, (byte) 19, fa.field_J, ii.field_r));
                return false;
              } else {
                break L0;
              }
            }
          }
          nj.a(10.0f, 2, bh.a("basic", kl.field_s, (byte) 38, fa.field_J, ii.field_r));
          return false;
        } else {
          if (m.field_z != null) {
            nj.a(75.0f, 2, cq.field_I);
            ((ShatteredPlansClient) this).d(1);
            int discarded$11 = 35;
            ii.a(m.field_z, df.field_n);
            df.field_n = null;
            m.field_z = null;
            u.c(126);
            return false;
          } else {
            if (ti.field_g == null) {
              if (nh.field_l == null) {
                if (null != ai.field_c) {
                  int discarded$12 = -85;
                  ph.a(ai.field_c);
                  int discarded$13 = -17;
                  mh.field_h = oq.a(ai.field_c.a(true, "starnames.txt", ""));
                  ai.field_c = null;
                  u.c(121);
                  return false;
                } else {
                  if (null == oi.field_h) {
                    int discarded$14 = 1;
                    this.l();
                    er.a(true);
                    qf.a((byte) -125);
                    var3 = 0;
                    L13: while (true) {
                      if (14 <= var3) {
                        L14: {
                          gr.field_o = 0;
                          if (bs.field_b < 2) {
                            stackOut_74_0 = 0;
                            stackIn_75_0 = stackOut_74_0;
                            break L14;
                          } else {
                            stackOut_73_0 = 1;
                            stackIn_75_0 = stackOut_73_0;
                            break L14;
                          }
                        }
                        se.field_g = stackIn_75_0 != 0;
                        uc.field_A = -1;
                        vr.field_c = 0;
                        de.field_j = -1;
                        int discarded$15 = 52;
                        int discarded$16 = 50;
                        hk.a();
                        ec.b(-8, 50);
                        u.c(122);
                        jo.a(32767, hk.field_nb, true, 1048576);
                        return true;
                      } else {
                        mj.field_Hb[var3] = new sm(var3);
                        var3++;
                        continue L13;
                      }
                    }
                  } else {
                    jd.a(1, new fm(oi.field_h.a(true, "huffman", "")));
                    oi.field_h = null;
                    u.c(126);
                    return false;
                  }
                }
              } else {
                oi.a((byte) -126, nh.field_l);
                nh.field_l = null;
                u.c(125);
                return false;
              }
            } else {
              nj.a(90.0f, 2, cc.field_p);
              ((ShatteredPlansClient) this).d(1);
              int discarded$17 = -8;
              ck.a(ms.field_d, (java.applet.Applet) this, kl.field_s, rl.field_f, ti.field_g, la.field_k);
              rl.field_f = null;
              ti.field_g = null;
              la.field_k = null;
              u.c(122);
              return false;
            }
          }
        }
    }

    final void g(int param0) {
        ShatteredPlansClient.m((byte) -46);
        int discarded$0 = 23811;
        he.a();
        int discarded$1 = 0;
        pf.c();
        int discarded$2 = 82;
        tg.a();
        wi.a((byte) 111);
        int discarded$3 = -6;
        no.a();
        h.d(param0 ^ 24068);
        int discarded$4 = -77;
        id.a();
        int discarded$5 = 102;
        va.a();
        kq.d(param0 ^ -24389);
        int discarded$6 = 16;
        kr.a();
        vr.a(true);
        l.a((byte) -98);
        rl.a(param0 ^ -24069);
        int discarded$7 = -102;
        jq.a();
        uo.a(true);
        int discarded$8 = -23;
        jf.a();
        wo.a((byte) -103);
        vo.a(256);
        tl.k(-38);
        int discarded$9 = 108;
        rg.b();
        kf.b(param0 ^ -24187);
        r.a(0);
        ed.a(param0 ^ -24150);
        ib.a(param0 ^ -24163);
        gf.c();
        int discarded$10 = -466;
        bc.b();
        gg.a(param0 + 24069);
        int discarded$11 = 78;
        ob.a();
        int discarded$12 = 21455;
        pr.b();
        int discarded$13 = 53;
        bs.a();
        int discarded$14 = 2029303720;
        sa.b();
        int discarded$15 = 0;
        ba.a();
        kd.a(109);
        int discarded$16 = 1;
        ss.a();
        int discarded$17 = 1;
        je.a();
        int discarded$18 = 125;
        dk.a();
        int discarded$19 = -25;
        nf.b();
        int discarded$20 = 108;
        hq.a();
        int discarded$21 = 47;
        fp.a();
        uh.a(param0 ^ -24161);
        int discarded$22 = -1314558012;
        eb.b();
        int discarded$23 = 0;
        cp.b();
        ar.a(16967);
        int discarded$24 = 1;
        rn.a();
        int discarded$25 = 124;
        tj.a();
        ej.a(false);
        ke.b((byte) -127);
        int discarded$26 = -17;
        um.a();
        int discarded$27 = -26088;
        ui.c();
        oh.a(true);
        c.b();
        nq.a();
        int discarded$28 = -106;
        sj.a();
        dm.a(false);
        pl.a(param0 ^ -17251);
        nb.a((byte) 123);
        int discarded$29 = -98;
        dh.a();
        int discarded$30 = 64;
        of.b();
        int discarded$31 = 127;
        ud.a();
        int discarded$32 = 21805;
        aj.a();
        int discarded$33 = -29;
        ij.a();
        io.a((byte) 120);
        sm.f(-25370);
        km.h(11);
        te.a(param0 + 24069);
        int discarded$34 = 63;
        nn.a();
        ga.d(-17876);
        int discarded$35 = 0;
        ti.b();
        int discarded$36 = -109;
        qq.a();
        pi.b();
        ap.f();
        d.a(-28065);
        int discarded$37 = 1;
        np.b();
        int discarded$38 = 0;
        hm.d();
        v.a(3);
        int discarded$39 = -90;
        wp.a();
        ae.b(-17358);
        int discarded$40 = -14115;
        qr.e();
        int discarded$41 = 32;
        fb.h();
        in.a(true);
        mj.g(-4923);
        qn.a(-989994556);
        int discarded$42 = 18031;
        ue.a();
        int discarded$43 = 2616;
        rs.h();
        ur.f((byte) -118);
        ul.g(param0 ^ -24045);
        am.g(param0 + 47949);
        int discarded$44 = -87;
        fc.a();
        ub.g(param0 ^ param0);
        kh.g(param0 ^ 24070);
        int discarded$45 = -117;
        wg.a();
        int discarded$46 = 1;
        ci.a();
        int discarded$47 = 114;
        s.a();
        int discarded$48 = 0;
        lc.a();
        int discarded$49 = 92;
        ig.a();
        int discarded$50 = 118;
        ta.a();
        tc.e(true);
        int discarded$51 = -17682;
        oj.q();
        int discarded$52 = -94;
        eo.h();
        hk.p(param0 + 24089);
        int discarded$53 = -121;
        ns.j();
        aa.a((byte) 32);
        int discarded$54 = 121;
        cq.a();
        ri.a((byte) -73);
        e.b(param0 + 2129445);
        int discarded$55 = 3;
        sp.a();
        int discarded$56 = -23092;
        wc.a();
        int discarded$57 = -109;
        ea.a();
        fs.a(param0 ^ -24065);
        ho.a(520);
        int discarded$58 = -67;
        dc.e();
        ln.e(param0 ^ -24069);
        mg.g((byte) -106);
        int discarded$59 = 21758;
        qa.e();
        int discarded$60 = 1;
        an.b();
        int discarded$61 = 110;
        fm.a();
        ia.c(param0 ^ 28675);
        int discarded$62 = 0;
        tr.g();
        int discarded$63 = 45;
        jj.c();
        hp.b((byte) -64);
        int discarded$64 = 59;
        nh.b();
        int discarded$65 = 1;
        me.a();
        int discarded$66 = 30;
        jb.a();
        vs.a(param0 ^ -24162);
        int discarded$67 = 4;
        oo.a();
        mk.a((byte) -58);
        int discarded$68 = 0;
        ds.a();
        ms.a(param0 ^ 24068);
        int discarded$69 = 0;
        sl.l();
        ai.a((byte) 1);
        int discarded$70 = 87;
        po.a();
        mh.a(-117);
        qj.a((byte) -20);
        int discarded$71 = 126;
        or.b();
        int discarded$72 = 34;
        sg.f();
        int discarded$73 = 1;
        wh.b();
        int discarded$74 = 58;
        tb.a();
        int discarded$75 = -87;
        nl.a();
        int discarded$76 = 125;
        q.f();
        jp.g(param0 + 23965);
        dd.a(param0 ^ 27074);
        int discarded$77 = -124;
        dg.f();
        int discarded$78 = 79;
        ka.d();
        hi.f(param0 ^ 24118);
        as.a(param0 ^ -24081);
        vn.a((byte) 68);
        int discarded$79 = -28714;
        sd.f();
        eg.a(param0 + 24195);
        int discarded$80 = 12;
        hj.a();
        int discarded$81 = 0;
        ne.c();
        int discarded$82 = 0;
        qi.a();
        int discarded$83 = 48;
        nr.a();
        int discarded$84 = 0;
        k.a();
        int discarded$85 = -122;
        hb.c();
        int discarded$86 = 82;
        sf.a();
        db.d(param0 ^ -8957);
        wb.a(-79);
        wm.a(false);
        int discarded$87 = 99;
        mi.a();
        ls.a(param0 + -4458);
        qg.c(-124);
        int discarded$88 = 118;
        ph.a();
        int discarded$89 = 18973;
        ad.a();
        em.a(param0 + 24072);
        int discarded$90 = 5;
        rh.a();
        int discarded$91 = 128;
        fe.g();
        int discarded$92 = 1;
        kb.d();
        int discarded$93 = -124;
        vd.a();
        uc.e((byte) 106);
        int discarded$94 = -68;
        ff.e();
        int discarded$95 = 1546006977;
        lp.f();
        int discarded$96 = 104;
        qk.f();
        int discarded$97 = 124;
        jh.d();
        int discarded$98 = 1;
        os.d();
        int discarded$99 = 6;
        qh.d();
        int discarded$100 = 0;
        lo.l();
        int discarded$101 = 84;
        pc.d();
        int discarded$102 = 0;
        hs.b();
        vl.b((byte) -80);
        int discarded$103 = -10;
        vi.d();
        int discarded$104 = -5731;
        el.a();
        se.a((byte) -37);
        int discarded$105 = 100;
        ck.a();
        int discarded$106 = -105;
        eh.i();
        df.d(9768448);
        int discarded$107 = 1;
        bq.b();
        ii.e(997342595);
        int discarded$108 = -70;
        eq.a();
        int discarded$109 = 0;
        ra.a();
        int discarded$110 = -57;
        bf.a();
        int discarded$111 = 110;
        vh.a();
        int discarded$112 = -102;
        jg.b();
        int discarded$113 = -110;
        bd.h();
        int discarded$114 = 5;
        lh.f();
        gd.b(param0 + 24189);
        tm.d(param0 ^ 11083);
        tq.b(param0 ^ 10214);
        int discarded$115 = 102;
        de.a();
        int discarded$116 = 127;
        sq.a();
        int discarded$117 = 14077;
        jd.a();
        fi.a(param0 + 24110);
        sn.a(param0 ^ -24146);
        cs.a(-93);
        int discarded$118 = 15;
        a.a();
        int discarded$119 = 1;
        rf.c();
        int discarded$120 = -126;
        qc.f();
        int discarded$121 = 0;
        tk.d();
        int discarded$122 = 4;
        ua.a();
        ak.h(param0 + 24092);
        p.b((byte) 114);
        int discarded$123 = 123;
        gp.a();
        jc.g(param0 ^ 6520);
        int discarded$124 = -109;
        ng.a();
        bo.p(param0 ^ -24069);
        o.a((byte) -77);
        wn.b();
        fd.a();
        int discarded$125 = 66;
        hc.a();
        int discarded$126 = -74;
        sr.a();
        int discarded$127 = 4;
        nm.a();
        int discarded$128 = -27153;
        im.a();
        oe.a(param0 ^ -24069);
        int discarded$129 = 91;
        uk.a();
        af.a(param0 ^ 24068);
        int discarded$130 = 26;
        bb.b();
        cm.a((byte) -26);
        int discarded$131 = 124;
        le.a();
        lb.a();
        int discarded$132 = -105;
        na.b();
        int discarded$133 = 3;
        lr.b();
        int discarded$134 = 32;
        gi.a();
        tf.a(false);
        int discarded$135 = 1;
        gn.b();
        int discarded$136 = 16711935;
        i.b();
        int discarded$137 = 49;
        tp.a();
        qo.a(-109);
        vg.d(0);
        int discarded$138 = 1;
        kg.d();
        int discarded$139 = 109;
        qs.a();
        jl.o(-123);
        w.m(-1);
        f.j(param0 ^ -24192);
        int discarded$140 = 22256;
        on.b();
        int discarded$141 = 85;
        wl.a();
        kn.a();
        int discarded$142 = -121;
        ab.a();
        int discarded$143 = 127;
        mq.b();
        int discarded$144 = 72;
        ch.b();
        int discarded$145 = 5;
        hr.a();
        vm.g(param0 ^ 2556);
        jo.a(true);
        re.a((byte) 125);
        int discarded$146 = -117;
        si.e();
        dp.f((byte) -50);
        ol.a(false);
        li.a((byte) 23);
        int discarded$147 = 101;
        lg.b();
        int discarded$148 = 78;
        gs.b();
        ge.a(6);
        us.a(param0 ^ -24069);
        gl.a(param0 + 24155);
        er.a(0);
        t.a((byte) -11);
        int discarded$149 = -81;
        ei.a();
        we.a(-122);
        lm.a(true);
        vp.e((byte) -21);
        cn.e(true);
        int discarded$150 = 640;
        ep.b();
        int discarded$151 = 123;
        be.a();
        pk.a();
        int discarded$152 = -62;
        kl.d();
        int discarded$153 = -127;
        ac.e();
        int discarded$154 = -99;
        co.d();
        wf.a((byte) -122);
        int discarded$155 = 11209;
        n.a();
        int discarded$156 = 59114;
        br.d();
        int discarded$157 = 0;
        kc.a();
        int discarded$158 = -43;
        pg.f();
        int discarded$159 = 5;
        fa.l();
        int discarded$160 = 102;
        go.k();
        il.h((byte) 88);
        md.j(-125);
        bj.a(param0 ^ -32120);
        int discarded$161 = -104;
        ts.a();
        int discarded$162 = 107;
        hl.a();
        int discarded$163 = 4096;
        ah.i();
        int discarded$164 = -22429;
        lk.h();
        ml.d((byte) -65);
        bk.a(param0 + 26631);
        int discarded$165 = -75;
        pe.a();
        int discarded$166 = 4;
        rp.a();
        int discarded$167 = -104;
        td.a();
        int discarded$168 = -5;
        en.a();
        int discarded$169 = 41;
        cr.a();
        mr.a(false);
        rd.a(-90);
        int discarded$170 = 87;
        sh.b();
        es.a(param0 ^ 24068);
        int discarded$171 = 2;
        so.d();
        int discarded$172 = 93;
        qe.a();
        di.c(true);
        int discarded$173 = 115;
        js.c();
        ja.d((byte) 124);
        int discarded$174 = 0;
        wd.e();
        ek.a(-1);
        cj.c(false);
        int discarded$175 = 19333;
        j.i();
        sc.f((byte) 97);
        rj.i(388178881);
        int discarded$176 = 0;
        hg.c();
        int discarded$177 = 30;
        ma.i();
        int discarded$178 = 2105376;
        ca.a();
        int discarded$179 = -113;
        ji.g();
        la.a((byte) 36);
        cb.a((byte) 104);
        hn.a(19568);
        int discarded$180 = -950540796;
        fr.i();
        int discarded$181 = 111;
        vj.f();
        int discarded$182 = -1215;
        rm.a();
        up.a(param0 ^ -24167);
        int discarded$183 = 0;
        mc.d();
        gq.a(118);
        int discarded$184 = -120;
        m.e();
        int discarded$185 = 1;
        pa.d();
        nc.d(param0 + 24068);
        oi.a(-1);
        fh.a();
        ef.a(0);
        fl.b(param0 + 24068);
        int discarded$186 = 124;
        ip.a();
        jr.a(1885);
        int discarded$187 = 59;
        wj.a();
        int discarded$188 = -36;
        wq.a();
        int discarded$189 = -47;
        gr.a();
        int discarded$190 = -111;
        gm.a();
        int discarded$191 = 9952;
        qf.a();
        uq.a(param0 + 24123);
        int discarded$192 = 0;
        bh.a();
        oq.a(param0 + 24098);
        int discarded$193 = -128;
        qp.b();
        int discarded$194 = -110;
        rq.b();
        int discarded$195 = 1;
        ce.b();
        int discarded$196 = -1;
        og.a();
        int discarded$197 = 124;
        cg.j();
        ve.g(0);
        int discarded$198 = 68;
        uf.a();
        int discarded$199 = -99;
        hd.a();
        vc.a(-67);
        int discarded$200 = 1;
        nd.a();
        int discarded$201 = 127;
        ks.a();
        fg.b(param0 ^ -24186);
        sk.a(param0 + 24021);
        int discarded$202 = -115;
        gb.a();
        int discarded$203 = 67;
        lq.a();
        int discarded$204 = 16711680;
        ld.a();
        fk.a((byte) 93);
        mp.a(param0 + 16160);
        kj.a(1);
        int discarded$205 = 240;
        cf.a();
        int discarded$206 = 16928;
        bg.a();
        kp.b((byte) -47);
        int discarded$207 = 22595;
        jm.d();
        ee.a(false);
        cl.a(16777215);
        int discarded$208 = 11;
        un.a();
        int discarded$209 = -107;
        dn.d();
        pd.b(0);
        int discarded$210 = 17593;
        vf.a();
        wa.a(param0 ^ -14291);
        int discarded$211 = -1;
        ih.a();
        int discarded$212 = -13095;
        rk.a();
        int discarded$213 = 107;
        aq.a();
        int discarded$214 = 70;
        wk.a();
        ha.a(4324);
        ec.b(true);
        cc.d(param0 + 24324);
        mm.e(param0 + 23978);
        int discarded$215 = 0;
        mf.f();
        int discarded$216 = 127;
        mb.d();
        fj.d(param0 + 24147);
        int discarded$217 = 78;
        oa.b();
        int discarded$218 = -53;
        ql.a();
        int discarded$219 = -31;
        u.b();
        int discarded$220 = -37;
        da.b();
        int discarded$221 = -92;
        ro.a();
        ((ShatteredPlansClient) this).field_s = null;
        ((ShatteredPlansClient) this).field_G = null;
    }

    public static void m(byte param0) {
        if (param0 != -46) {
            field_L = null;
        }
        field_H = null;
        field_L = null;
        field_J = null;
        field_E = null;
    }

    public final void init() {
        ((ShatteredPlansClient) this).a("shatteredplans", 15, (byte) 112);
    }

    private final void b(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var10 = null;
        String[] var11 = null;
        int stackIn_77_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_92_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        L0: {
          var8 = field_F ? 1 : 0;
          if (jb.field_c != jb.field_g) {
            if (jb.field_g != po.field_f) {
              if (jb.field_g == gs.field_d) {
                L1: {
                  int discarded$14 = 1;
                  if (!w.d()) {
                    L2: {
                      if (null != tq.field_b) {
                        int discarded$15 = 3;
                        ks.a(20, tq.field_b);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (bs.field_b < 2) {
                        stackOut_76_0 = 0;
                        stackIn_77_0 = stackOut_76_0;
                        break L3;
                      } else {
                        stackOut_75_0 = 1;
                        stackIn_77_0 = stackOut_75_0;
                        break L3;
                      }
                    }
                    L4: {
                      se.field_g = stackIn_77_0 != 0;
                      gr.field_o = sh.field_b;
                      jc.a(75, id.a(2, kl.field_s, "basic", "unachieved"));
                      int discarded$16 = 1;
                      oi.a();
                      if (nh.a((byte) -111, gr.field_o)) {
                        rn.a(1048576);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    s.a(1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ns.field_ob = false;
                ne.field_s = false;
                jb.field_g = o.field_n;
                break L0;
              } else {
                na.field_F = na.field_F - 1;
                if (na.field_F != 0) {
                  break L0;
                } else {
                  jb.field_g = jb.field_c;
                  break L0;
                }
              }
            } else {
              na.field_F = na.field_F + 1;
              if (na.field_F == 16) {
                int discarded$17 = -91;
                si.f();
                jb.field_g = gs.field_d;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            L5: {
              var3 = 0;
              var4 = 0;
              if (param1) {
                break L5;
              } else {
                if (vr.field_c == gr.field_o) {
                  if (vr.field_c != -1) {
                    if (vr.field_c != -2) {
                      if (vr.field_c == -3) {
                        ub.f((byte) 93);
                        break L5;
                      } else {
                        if (!nh.a((byte) -121, vr.field_c)) {
                          break L5;
                        } else {
                          mj.field_Hb[vr.field_c].i(2664);
                          break L5;
                        }
                      }
                    } else {
                      var3 = 1;
                      break L5;
                    }
                  } else {
                    if (mf.field_p) {
                      var3 = 1;
                      var4 = 1;
                      break L5;
                    } else {
                      ce.field_x.b(true, true);
                      L6: while (true) {
                        int discarded$18 = 55;
                        if (!cc.e()) {
                          break L5;
                        } else {
                          ce.field_x.g(-86);
                          continue L6;
                        }
                      }
                    }
                  }
                } else {
                  L7: {
                    if (eh.field_Q == 0) {
                      if (nh.a((byte) -76, vr.field_c)) {
                        if (!mj.field_Hb[vr.field_c].a((byte) 95)) {
                          break L7;
                        } else {
                          eh.field_Q = eh.field_Q + 1;
                          break L7;
                        }
                      } else {
                        eh.field_Q = eh.field_Q + 1;
                        break L7;
                      }
                    } else {
                      eh.field_Q = eh.field_Q + 1;
                      break L7;
                    }
                  }
                  if (eh.field_Q == 32) {
                    rn.a(1048576);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L8: {
              if (!mf.field_p) {
                break L8;
              } else {
                if (md.field_Q) {
                  break L8;
                } else {
                  if (!is.field_a) {
                    L9: {
                      if (!v.field_b) {
                        break L9;
                      } else {
                        if (!sr.field_h) {
                          break L9;
                        } else {
                          var3 = 0;
                          break L9;
                        }
                      }
                    }
                    L10: {
                      cf.a(2, var3 != 0);
                      if (!kc.field_d) {
                        break L10;
                      } else {
                        in.field_g.b(var4 != 0, true);
                        break L10;
                      }
                    }
                    L11: {
                      if (v.field_b) {
                        cf.a(320, 8, 180, var4 != 0);
                        ce.field_x.b(var4 != 0, true);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: while (true) {
                      int discarded$19 = 55;
                      if (!cc.e()) {
                        break L8;
                      } else {
                        L13: {
                          if (v.field_b) {
                            int discarded$20 = 15;
                            int discarded$21 = 12;
                            int discarded$22 = -9861;
                            int discarded$23 = 13;
                            if (gn.a()) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          } else {
                            boolean discarded$24 = qf.a(0, 13, 15, 12);
                            break L13;
                          }
                        }
                        L14: {
                          if (kc.field_d) {
                            in.field_g.g(-98);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        if (!v.field_b) {
                          continue L12;
                        } else {
                          ce.field_x.g(-99);
                          continue L12;
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
              }
            }
            L15: {
              if (mf.field_p) {
                break L15;
              } else {
                int discarded$25 = 0;
                af.b();
                break L15;
              }
            }
            L16: {
              if (!ge.field_n) {
                if (fl.field_h <= 0) {
                  break L16;
                } else {
                  fl.field_h = fl.field_h - 1;
                  break L16;
                }
              } else {
                if (fl.field_h < ed.field_f) {
                  fl.field_h = fl.field_h + 1;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              var5 = ed.field_f * ed.field_f;
              var6 = -(fl.field_h * fl.field_h) + var5;
              var7 = 120 * var6 / var5 + fs.field_z;
              fa.a(var7, (byte) -47);
              if (uc.field_v > 0) {
                uc.field_v = uc.field_v - 1;
                break L17;
              } else {
                break L17;
              }
            }
            if (((ShatteredPlansClient) this).field_G.d(0) == null) {
              break L0;
            } else {
              int fieldTemp$26 = ((ShatteredPlansClient) this).field_I + 1;
              ((ShatteredPlansClient) this).field_I = ((ShatteredPlansClient) this).field_I + 1;
              if (fieldTemp$26 != 335) {
                break L0;
              } else {
                ((ShatteredPlansClient) this).field_I = 0;
                oh discarded$27 = ((ShatteredPlansClient) this).field_G.h(64);
                break L0;
              }
            }
          }
        }
        L18: {
          if (gr.field_o == -4) {
            L19: {
              tq.field_b = null;
              var10 = new String[]{hn.field_f[0], hn.field_f[1], hn.field_f[2], hn.field_f[3]};
              ce.field_x = new km(false, false, (int) ga.field_w[0], td.field_K, hj.field_k, var10, 0, false, (kq) null);
              if (!uh.field_i) {
                stackOut_86_0 = 0;
                stackIn_87_0 = stackOut_86_0;
                break L19;
              } else {
                stackOut_85_0 = 1;
                stackIn_87_0 = stackOut_85_0;
                break L19;
              }
            }
            var4 = stackIn_87_0;
            ta.a(0, -1, (byte) 96, var4 != 0);
            cs.field_i = true;
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if (gr.field_o != -5) {
            break L20;
          } else {
            L21: {
              tq.field_b = null;
              var11 = new String[]{hn.field_f[0]};
              ce.field_x = new km(false, true, 0, hi.field_a, 0, var11, 0, false, (kq) null);
              if (!uh.field_i) {
                stackOut_91_0 = 0;
                stackIn_92_0 = stackOut_91_0;
                break L21;
              } else {
                stackOut_90_0 = 1;
                stackIn_92_0 = stackOut_90_0;
                break L21;
              }
            }
            var4 = stackIn_92_0;
            ta.a(0, -1, (byte) 96, var4 != 0);
            cs.field_i = true;
            break L20;
          }
        }
        L22: {
          if (gr.field_o != -7) {
            break L22;
          } else {
            tk.a(11, np.field_a.g(-79), (byte) -2);
            gr.field_o = vr.field_c;
            is.field_a = true;
            break L22;
          }
        }
    }

    private final void c() {
        if (!(ka.field_e == null)) {
            ee.a(-47, ka.field_e);
            ka.field_e = null;
            u.c(121);
        }
        oi.field_h = io.a(3, 50);
        ms.field_d = rm.a(5, true, false, true, false);
        nh.field_l = io.a(6, 93);
        ti.field_g = io.a(7, 110);
        cm.field_a = io.a(8, 90);
        ld.field_m = io.a(9, 28);
        df.field_n = io.a(10, 55);
        m.field_z = io.a(11, 67);
        ai.field_c = io.a(12, 28);
        la.field_k = io.a(13, 52);
    }

    final void d(int param0) {
        Object var2 = null;
        int var3_int = 0;
        he var3_ref_he = null;
        long var3 = 0L;
        String var4 = null;
        int var5_int = 0;
        long var5 = 0L;
        int var6 = 0;
        int var7_int = 0;
        long var7 = 0L;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bi var13 = null;
        int var14 = 0;
        int[] var18 = null;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        eb stackOut_2_0 = null;
        java.awt.Canvas stackOut_1_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_5_0 = 0;
        L0: {
          var14 = field_F ? 1 : 0;
          if (bj.field_K != null) {
            stackOut_2_0 = bj.field_K;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = tm.field_i;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (!uf.a(false)) {
          if (ik.field_h) {
            if (m.f((byte) 116)) {
              L1: {
                if (gr.field_o != vr.field_c) {
                  L2: {
                    if (-1 != vr.field_c) {
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      break L2;
                    } else {
                      stackOut_26_0 = 1;
                      stackIn_28_0 = stackOut_26_0;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      int discarded$10 = 0;
                      u.a(stackIn_28_0 != 0);
                      if (vr.field_c != gr.field_o) {
                        break L4;
                      } else {
                        if (-2 == vr.field_c) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    int discarded$11 = 67;
                    ShatteredPlansClient.n();
                    break L3;
                  }
                  L5: {
                    if (!nh.a((byte) -105, vr.field_c)) {
                      break L5;
                    } else {
                      if (nh.a((byte) -123, gr.field_o)) {
                        break L5;
                      } else {
                        mj.field_Hb[vr.field_c].b(94, 128 * eh.field_Q / 32);
                        break L1;
                      }
                    }
                  }
                  L6: {
                    if (nh.a((byte) -75, vr.field_c)) {
                      break L6;
                    } else {
                      if (nh.a((byte) -127, gr.field_o)) {
                        mj.field_Hb[gr.field_o].b(89, -(eh.field_Q * 128 / 32) + 128);
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (!nh.a((byte) -125, vr.field_c)) {
                    break L1;
                  } else {
                    if (nh.a((byte) -74, gr.field_o)) {
                      mj.field_Hb[vr.field_c].c(gr.field_o, -6469, 128 * eh.field_Q / 32);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  if (vr.field_c != -2) {
                    L7: {
                      if (vr.field_c != -1) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L7;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        int discarded$12 = 0;
                        u.a(stackIn_18_0 != 0);
                        if (vr.field_c != gr.field_o) {
                          break L9;
                        } else {
                          if (vr.field_c == -2) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      int discarded$13 = 67;
                      ShatteredPlansClient.n();
                      break L8;
                    }
                    if (nh.a((byte) -99, vr.field_c)) {
                      mj.field_Hb[vr.field_c].g(-121);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    gf.b();
                    break L1;
                  }
                }
              }
              L10: {
                if (gr.field_o != vr.field_c) {
                  if (gr.field_o == -2) {
                    gf.c(0, 0, 640, 480, 0, 256 * eh.field_Q / 32);
                    break L10;
                  } else {
                    if (vr.field_c != -2) {
                      break L10;
                    } else {
                      gf.c(0, 0, 640, 480, 0, -(256 * eh.field_Q / 32) + 256);
                      break L10;
                    }
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                L12: {
                  if (!cj.field_x) {
                    break L12;
                  } else {
                    if (!cs.field_i) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                qr.a(me.a(30), (byte) 111);
                break L11;
              }
              L13: {
                if (eb.field_b <= 0) {
                  break L13;
                } else {
                  gf.c(0, 0, 640, 480, 0, eb.field_b);
                  break L13;
                }
              }
              L14: {
                if (sq.a(false)) {
                  int discarded$14 = -27572;
                  ts.a(sa.a(), param0 ^ -2, mg.e(param0 ^ -84));
                  int discarded$15 = -119;
                  kd.a();
                  break L14;
                } else {
                  if (kh.f((byte) -67)) {
                    L15: {
                      L16: {
                        stackOut_66_0 = 95;
                        stackIn_69_0 = stackOut_66_0;
                        stackIn_67_0 = stackOut_66_0;
                        if (null != bj.field_K) {
                          break L16;
                        } else {
                          stackOut_67_0 = stackIn_67_0;
                          stackIn_70_0 = stackOut_67_0;
                          stackIn_68_0 = stackOut_67_0;
                          if (!br.field_i) {
                            stackOut_70_0 = stackIn_70_0;
                            stackOut_70_1 = 0;
                            stackIn_71_0 = stackOut_70_0;
                            stackIn_71_1 = stackOut_70_1;
                            break L15;
                          } else {
                            stackOut_68_0 = stackIn_68_0;
                            stackIn_69_0 = stackOut_68_0;
                            break L16;
                          }
                        }
                      }
                      stackOut_69_0 = stackIn_69_0;
                      stackOut_69_1 = 1;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_71_1 = stackOut_69_1;
                      break L15;
                    }
                    fs.a((byte) stackIn_71_0, stackIn_71_1 != 0);
                    break L14;
                  } else {
                    int discarded$16 = 0;
                    if (!i.c()) {
                      if (((ShatteredPlansClient) this).field_G.g(27)) {
                        break L14;
                      } else {
                        L17: {
                          var3_ref_he = (he) (Object) ((ShatteredPlansClient) this).field_G.d(param0 ^ 1);
                          var4 = ud.field_a[var3_ref_he.field_k];
                          var5_int = mp.field_b.c(var4) + 50;
                          var6 = 36;
                          var7_int = 10 - -(var5_int / 2);
                          var8 = 10;
                          var9 = ((ShatteredPlansClient) this).field_I;
                          if (303 < var9) {
                            var9 = 335 + -var9;
                            break L17;
                          } else {
                            if (var9 > 32) {
                              var9 = 32;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        }
                        var10 = re.a(0, 32, var9, var5_int, param0 ^ 1);
                        var11 = 10 + (var5_int - var10 >> 1);
                        var18 = new int[4];
                        gf.a(var18);
                        ga.a(var6, var8, var11, (byte) -78, var10);
                        gf.d(var11, var8, var10 + var11, var8 - -var6);
                        var13 = oi.a(var3_ref_he.field_k, (byte) 66);
                        var13.f(-36 + (var7_int - -(var5_int / 2)), 4 + var8);
                        mp.field_b.d(var4, -(var5_int / 2) + (var7_int - -10), -2 + (mp.field_b.field_J + var6 >> 1) + var8, 2805974, -1);
                        gf.b(var18);
                        break L14;
                      }
                    } else {
                      int discarded$17 = -118;
                      ts.a(gq.c(), param0 + -2, ah.h(param0 + 107));
                      int discarded$18 = 94;
                      rg.a();
                      break L14;
                    }
                  }
                }
              }
              L18: {
                if (jb.field_g == jb.field_c) {
                  break L18;
                } else {
                  var3_int = na.field_F * 256 / 16;
                  if (var3_int <= 0) {
                    break L18;
                  } else {
                    gf.c(0, 0, gf.field_b, gf.field_k, 0, var3_int);
                    break L18;
                  }
                }
              }
              L19: {
                if (!mm.field_n) {
                  break L19;
                } else {
                  if (se.field_g) {
                    mp.field_b.d(Integer.toString(rq.field_i), 4, 4 + mp.field_b.field_J, 16777215, -1);
                    var3 = Runtime.getRuntime().totalMemory();
                    var5 = Runtime.getRuntime().freeMemory();
                    var7 = -var5 + var3;
                    mp.field_b.d((int)(var7 >> 10) + "kb", 4, 2 * mp.field_b.field_J + 8, 16777215, -1);
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
              L20: {
                if (param0 == 1) {
                  break L20;
                } else {
                  ((ShatteredPlansClient) this).a(true);
                  break L20;
                }
              }
              int discarded$19 = 0;
              mc.a(110, 0, (java.awt.Canvas) var2);
              return;
            } else {
              nj.a(100.0f, 2, jh.field_v);
              pa.a(9242, (java.awt.Canvas) var2);
              return;
            }
          } else {
            pa.a(9242, (java.awt.Canvas) var2);
            return;
          }
        } else {
          L21: {
            if (bj.field_K == null) {
              stackOut_6_0 = br.field_i;
              stackIn_7_0 = stackOut_6_0 ? 1 : 0;
              break L21;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L21;
            }
          }
          no.a(stackIn_7_0 != 0, 10, (java.awt.Canvas) var2);
          return;
        }
    }

    public ShatteredPlansClient() {
        ((ShatteredPlansClient) this).field_G = new pf();
        ((ShatteredPlansClient) this).field_I = 0;
    }

    private final static void n() {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        if (-3 == vr.field_c) {
          return;
        } else {
          L0: {
            if (ce.field_x != null) {
              break L0;
            } else {
              if (in.field_g == null) {
                L1: {
                  var1 = -320 + (cl.field_n % 640 << 1);
                  var2 = -320 + var1;
                  var3 = (Math.cos(3.141592653589793 * (double)var2 / 640.0) + 1.0) * 12.0;
                  if (var3 > 16.0) {
                    var3 = var3 + 5.0 * (var3 - 16.0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                so.a(0, (640 - in.field_f.field_o) / 2, 10, jf.field_a);
                var2 = (int)var3;
                in.field_f.c((640 - in.field_f.field_o) / 2, 10, 256);
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = true;
        field_L = "Production";
        field_J = "Target: <%0> points";
    }
}
