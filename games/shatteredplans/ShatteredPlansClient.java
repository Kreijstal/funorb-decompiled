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
            stackOut_13_1 = new StringBuilder().append("ShatteredPlansClient.KA(").append(param0).append(44).append(param1).append(44);
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
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void a(boolean param0) {
        if (param0) {
            ((ShatteredPlansClient) this).a(-37);
        }
        kf.e(120);
        if (!(null == bj.field_K)) {
            ej.c(0);
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
        da.a((java.awt.Component) (Object) tm.field_i, fa.field_W, var3, 1102, false, 22050, 22050, true);
        rm.field_b = 2458760;
        wo.field_a = 2805974;
        em.field_j = 2458760;
        ih.field_b = 2458760;
        ah.field_P = 2458760;
        es.field_n = 2805974;
        em.a(us.b(0), 1);
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
              int discarded$3 = po.b(-87);
              l.field_f = po.b(-80);
              ql.a(-26848);
              if (null == bj.field_K) {
                break L0;
              } else {
                if (bj.field_K.field_c) {
                  ej.c(0);
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
                this.c(false);
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
                  tc.f((byte) 125);
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
                              ej.c(0);
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
                        if (i.c(0)) {
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
                            var3 = cq.d(false);
                            if (var3 == 2) {
                              ej.c(0);
                              break L12;
                            } else {
                              if (3 == var3) {
                                ne.field_s = false;
                                m.a(8, 13421772, rm.field_b, 8, mp.field_b.field_K, mr.field_i, 240, mp.field_b.field_K + mp.field_b.field_q, mr.field_i, 320, (nq) (Object) mp.field_b, (nq) (Object) mp.field_b, 0, mp.field_b.field_K, ah.field_P, mp.field_b.field_q + mp.field_b.field_K, 0, 2, 480, (bi[]) null, es.field_n);
                                fm.a(true, -1);
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
                      if (w.d(true)) {
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
                  int fieldTemp$4 = eb.field_b + jl.field_U;
                  eb.field_b = eb.field_b + jl.field_U;
                  if (gg.field_a >= fieldTemp$4) {
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
                  int fieldTemp$5 = eb.field_b - jl.field_U;
                  eb.field_b = eb.field_b - jl.field_U;
                  if (fieldTemp$5 >= 0) {
                    break L14;
                  } else {
                    eb.field_b = 0;
                    break L14;
                  }
                }
              }
            }
            L15: {
              if (!w.d(true)) {
                L16: while (true) {
                  var3_ref_lq = (lq) (Object) jq.field_a.h(54);
                  if (var3_ref_lq == null) {
                    break L15;
                  } else {
                    gd.a(var3_ref_lq, 1500005281, 4);
                    continue L16;
                  }
                }
              } else {
                break L15;
              }
            }
            var3 = -87 % ((15 - param0) / 35);
            L17: while (true) {
              if (!di.a(ae.field_a, 1)) {
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
                      se.a(7, true);
                      oq.a(6, 37);
                      ef.a(true);
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
                            wm.a(0);
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
                    be.a(a.a(20605), js.a(2000, (byte) 122), pe.m(42), 1024, js.a(6, (byte) 122), (byte) -122, hn.field_j.length, bb.a((byte) 100), pg.field_C, 150);
                    sj.a((byte) 77, js.b((byte) 121), fl.a(83));
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
                          wm.a(0);
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
                            rp.h(112);
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
                              wm.a(0);
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
                                    ri.k(8);
                                    wp.a(-2);
                                    qf.b((byte) -98);
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

    private final void l(int param0) {
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
            wg.field_e.a(ib.field_c, param0 ^ 27274, "projects");
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
            wg.field_e.a(re.a(var2, 4371, new String[2]), param0 + 27274, "Project_Biomass");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "Project_Energy");
            wg.field_e.a(re.a(var2, 4371, new String[2]), param0 ^ 27274, "Project_Exotics");
            wg.field_e.a(re.a(var2, 4371, new String[2]), 27275, "PROJECT_METAL");
            wg.field_e.a(re.a(var2, param0 ^ 4370, new String[2]), 27275, "PROJECT_BIOMASS");
            wg.field_e.a(re.a(var2, param0 ^ 4370, new String[2]), param0 ^ 27274, "PROJECT_ENERGY");
            wg.field_e.a(re.a(var2, param0 + 4370, new String[2]), 27275, "PROJECT_EXOTICS");
            return;
          } else {
            wg.field_e.a(re.a("<col=<%0>><%1></col>", 4371, new String[2]), 27275, "resource" + var2_int);
            wg.field_e.a(re.a("<col=<%0>><%1></col>", param0 ^ 4370, new String[2]), 27275, "Resource" + var2_int);
            var2_int++;
            continue L0;
          }
        }
    }

    private final boolean c(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        var4 = field_F ? 1 : 0;
        na.a((byte) 51);
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
                    if (kl.field_s.a("lobby", param0 + 16)) {
                      L2: {
                        if (!rl.field_f.b((byte) 120)) {
                          break L2;
                        } else {
                          if (rl.field_f.a("lobby", param0 ^ -62)) {
                            L3: {
                              if (!cm.field_a.b((byte) 120)) {
                                break L3;
                              } else {
                                if (!cm.field_a.a(param0 + -83)) {
                                  break L3;
                                } else {
                                  L4: {
                                    if (!ld.field_m.b((byte) -70)) {
                                      break L4;
                                    } else {
                                      if (!ld.field_m.a(param0 + -83)) {
                                        break L4;
                                      } else {
                                        L5: {
                                          if (!df.field_n.b((byte) 111)) {
                                            break L5;
                                          } else {
                                            if (!df.field_n.a(param0 + -83)) {
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
                                                              if (nh.field_l.a(param0 ^ -83)) {
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
                                                                          if (!ai.field_c.a(param0 ^ -83)) {
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
                                                                                        ((ShatteredPlansClient) this).d(param0 + -81);
                                                                                        if (param1) {
                                                                                          vo.a(ld.field_m, cm.field_a, param0 + 18);
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
                                                                                  nj.a(75.0f, 2, nc.a(ed.field_e, la.field_k, param0 ^ 118, jh.field_v));
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
                                              nj.a(60.0f, param0 + -80, bh.a("", m.field_z, (byte) 62, le.field_a, hc.field_b));
                                              return false;
                                            }
                                          }
                                        }
                                        nj.a(45.0f, 2, ve.a(df.field_n, 0, le.field_a, hc.field_b, param0 + -15012));
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
          nj.a(10.0f, param0 ^ 80, bh.a("basic", kl.field_s, (byte) 38, fa.field_J, ii.field_r));
          return false;
        } else {
          if (m.field_z != null) {
            nj.a(75.0f, 2, cq.field_I);
            ((ShatteredPlansClient) this).d(1);
            ii.a(m.field_z, df.field_n, param0 + -47);
            df.field_n = null;
            m.field_z = null;
            u.c(126);
            return false;
          } else {
            if (ti.field_g == null) {
              if (nh.field_l == null) {
                if (null != ai.field_c) {
                  ph.a(ai.field_c, param0 + -167);
                  mh.field_h = oq.a(ai.field_c.a(true, "starnames.txt", ""), (byte) -17);
                  ai.field_c = null;
                  u.c(121);
                  return false;
                } else {
                  if (null == oi.field_h) {
                    this.l(1);
                    er.a(true);
                    qf.a((byte) -125);
                    var3 = 0;
                    L13: while (true) {
                      if (14 <= var3) {
                        L14: {
                          if (param0 == 82) {
                            break L14;
                          } else {
                            this.l(64);
                            break L14;
                          }
                        }
                        L15: {
                          gr.field_o = 0;
                          if (bs.field_b < 2) {
                            stackOut_76_0 = 0;
                            stackIn_77_0 = stackOut_76_0;
                            break L15;
                          } else {
                            stackOut_75_0 = 1;
                            stackIn_77_0 = stackOut_75_0;
                            break L15;
                          }
                        }
                        se.field_g = stackIn_77_0 != 0;
                        uc.field_A = -1;
                        vr.field_c = 0;
                        de.field_j = -1;
                        hk.a(50, (byte) 52);
                        ec.b(param0 ^ -86, 50);
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
              ck.a(ms.field_d, (java.applet.Applet) this, kl.field_s, rl.field_f, ti.field_g, la.field_k, (byte) -8);
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
        he.a(23811);
        pf.c(0);
        tg.a(82);
        wi.a((byte) 111);
        no.a(-6);
        h.d(param0 ^ 24068);
        id.a((byte) -77);
        va.a(102);
        kq.d(param0 ^ -24389);
        kr.a((byte) 16);
        vr.a(true);
        l.a((byte) -98);
        rl.a(param0 ^ -24069);
        jq.a((byte) -102);
        uo.a(true);
        jf.a((byte) -23);
        wo.a((byte) -103);
        vo.a(256);
        tl.k(-38);
        rg.b(108);
        kf.b(param0 ^ -24187);
        r.a(0);
        ed.a(param0 ^ -24150);
        ib.a(param0 ^ -24163);
        gf.c();
        bc.b(-466);
        gg.a(param0 + 24069);
        ob.a((byte) 78);
        pr.b(21455);
        bs.a(53);
        sa.b(2029303720);
        ba.a(0);
        kd.a(109);
        ss.a(1);
        je.a(1);
        dk.a((byte) 125);
        nf.b((byte) -25);
        hq.a(108);
        fp.a((byte) 47);
        uh.a(param0 ^ -24161);
        eb.b(-1314558012);
        cp.b(false);
        ar.a(16967);
        rn.a(true);
        tj.a((byte) 124);
        ej.a(false);
        ke.b((byte) -127);
        um.a((byte) -17);
        ui.c(-26088);
        oh.a(true);
        c.b();
        nq.a();
        sj.a((byte) -106);
        dm.a(false);
        pl.a(param0 ^ -17251);
        nb.a((byte) 123);
        dh.a((byte) -98);
        of.b(64);
        ud.a(127);
        aj.a(21805);
        ij.a((byte) -29);
        io.a((byte) 120);
        sm.f(-25370);
        km.h(11);
        te.a(param0 + 24069);
        nn.a((byte) 63);
        ga.d(-17876);
        ti.b(0);
        qq.a(-109);
        pi.b();
        ap.f();
        d.a(-28065);
        np.b(true);
        hm.d(false);
        v.a(3);
        wp.a((byte) -90);
        ae.b(-17358);
        qr.e(-14115);
        fb.h(32);
        in.a(true);
        mj.g(-4923);
        qn.a(-989994556);
        ue.a(18031);
        rs.h(2616);
        ur.f((byte) -118);
        ul.g(param0 ^ -24045);
        am.g(param0 + 47949);
        fc.a((byte) -87);
        ub.g(param0 ^ param0);
        kh.g(param0 ^ 24070);
        wg.a((byte) -117);
        ci.a(true);
        s.a((byte) 114);
        lc.a(false);
        ig.a((byte) 92);
        ta.a((byte) 118);
        tc.e(true);
        oj.q(-17682);
        eo.h((byte) -94);
        hk.p(param0 + 24089);
        ns.j((byte) -121);
        aa.a((byte) 32);
        cq.a((byte) 121);
        ri.a((byte) -73);
        e.b(param0 + 2129445);
        sp.a(3);
        wc.a(-23092);
        ea.a((byte) -109);
        fs.a(param0 ^ -24065);
        ho.a(520);
        dc.e((byte) -67);
        ln.e(param0 ^ -24069);
        mg.g((byte) -106);
        qa.e(21758);
        an.b(true);
        fm.a(110);
        ia.c(param0 ^ 28675);
        tr.g(0);
        jj.c(45);
        hp.b((byte) -64);
        nh.b((byte) 59);
        me.a(true);
        jb.a(30);
        vs.a(param0 ^ -24162);
        oo.a(4);
        mk.a((byte) -58);
        ds.a(false);
        ms.a(param0 ^ 24068);
        sl.l(0);
        ai.a((byte) 1);
        po.a((byte) 87);
        mh.a(-117);
        qj.a((byte) -20);
        or.b(126);
        sg.f((byte) 34);
        wh.b(true);
        tb.a(58);
        nl.a(-87);
        q.f((byte) 125);
        jp.g(param0 + 23965);
        dd.a(param0 ^ 27074);
        dg.f((byte) -124);
        ka.d((byte) 79);
        hi.f(param0 ^ 24118);
        as.a(param0 ^ -24081);
        vn.a((byte) 68);
        sd.f(-28714);
        eg.a(param0 + 24195);
        hj.a((byte) 12);
        ne.c(false);
        qi.a(0);
        nr.a((byte) 48);
        k.a(0);
        hb.c((byte) -122);
        sf.a((byte) 82);
        db.d(param0 ^ -8957);
        wb.a(-79);
        wm.a(false);
        mi.a((byte) 99);
        ls.a(param0 + -4458);
        qg.c(-124);
        ph.a((byte) 118);
        ad.a(18973);
        em.a(param0 + 24072);
        rh.a(5);
        fe.g(128);
        kb.d(true);
        vd.a((byte) -124);
        uc.e((byte) 106);
        ff.e((byte) -68);
        lp.f(1546006977);
        qk.f(104);
        jh.d((byte) 124);
        os.d(true);
        qh.d((byte) 6);
        lo.l(0);
        pc.d(84);
        hs.b(0);
        vl.b((byte) -80);
        vi.d(-10);
        el.a(-5731);
        se.a((byte) -37);
        ck.a(100);
        eh.i(-105);
        df.d(9768448);
        bq.b(1);
        ii.e(997342595);
        eq.a((byte) -70);
        ra.a(false);
        bf.a((byte) -57);
        vh.a((byte) 110);
        jg.b(-102);
        bd.h(-110);
        lh.f(5);
        gd.b(param0 + 24189);
        tm.d(param0 ^ 11083);
        tq.b(param0 ^ 10214);
        de.a((byte) 102);
        sq.a((byte) 127);
        jd.a(14077);
        fi.a(param0 + 24110);
        sn.a(param0 ^ -24146);
        cs.a(-93);
        a.a((byte) 15);
        rf.c(true);
        qc.f(-126);
        tk.d(false);
        ua.a(4);
        ak.h(param0 + 24092);
        p.b((byte) 114);
        gp.a((byte) 123);
        jc.g(param0 ^ 6520);
        ng.a(-109);
        bo.p(param0 ^ -24069);
        o.a((byte) -77);
        wn.b();
        fd.a();
        hc.a((byte) 66);
        sr.a((byte) -74);
        nm.a((byte) 4);
        im.a(-27153);
        oe.a(param0 ^ -24069);
        uk.a((byte) 91);
        af.a(param0 ^ 24068);
        bb.b((byte) 26);
        cm.a((byte) -26);
        le.a(124);
        lb.a();
        na.b((byte) -105);
        lr.b(3);
        gi.a(32);
        tf.a(false);
        gn.b(true);
        i.b(16711935);
        tp.a((byte) 49);
        qo.a(-109);
        vg.d(0);
        kg.d(true);
        qs.a((byte) 109);
        jl.o(-123);
        w.m(-1);
        f.j(param0 ^ -24192);
        on.b(22256);
        wl.a((byte) 85);
        kn.a();
        ab.a((byte) -121);
        mq.b((byte) 127);
        ch.b((byte) 72);
        hr.a(5);
        vm.g(param0 ^ 2556);
        jo.a(true);
        re.a((byte) 125);
        si.e((byte) -117);
        dp.f((byte) -50);
        ol.a(false);
        li.a((byte) 23);
        lg.b(101);
        gs.b((byte) 78);
        ge.a(6);
        us.a(param0 ^ -24069);
        gl.a(param0 + 24155);
        er.a(0);
        t.a((byte) -11);
        ei.a((byte) -81);
        we.a(-122);
        lm.a(true);
        vp.e((byte) -21);
        cn.e(true);
        ep.b(640);
        be.a((byte) 123);
        pk.a();
        kl.d(-62);
        ac.e(-127);
        co.d((byte) -99);
        wf.a((byte) -122);
        n.a(11209);
        br.d(59114);
        kc.a(false);
        pg.f((byte) -43);
        fa.l(5);
        go.k(102);
        il.h((byte) 88);
        md.j(-125);
        bj.a(param0 ^ -32120);
        ts.a((byte) -104);
        hl.a((byte) 107);
        ah.i(4096);
        lk.h(-22429);
        ml.d((byte) -65);
        bk.a(param0 + 26631);
        pe.a((byte) -75);
        rp.a(4);
        td.a(-104);
        en.a(-5);
        cr.a((byte) 41);
        mr.a(false);
        rd.a(-90);
        sh.b((byte) 87);
        es.a(param0 ^ 24068);
        so.d(2);
        qe.a((byte) 93);
        di.c(true);
        js.c((byte) 115);
        ja.d((byte) 124);
        wd.e(false);
        ek.a(-1);
        cj.c(false);
        j.i(19333);
        sc.f((byte) 97);
        rj.i(388178881);
        hg.c(false);
        ma.i(30);
        ca.a(2105376);
        ji.g((byte) -113);
        la.a((byte) 36);
        cb.a((byte) 104);
        hn.a(19568);
        fr.i(-950540796);
        vj.f((byte) 111);
        rm.a(-1215);
        up.a(param0 ^ -24167);
        mc.d(false);
        gq.a(118);
        m.e(-120);
        pa.d(1);
        nc.d(param0 + 24068);
        oi.a(-1);
        fh.a();
        ef.a(0);
        fl.b(param0 + 24068);
        ip.a(124);
        jr.a(1885);
        wj.a((byte) 59);
        wq.a((byte) -36);
        gr.a(-47);
        gm.a((byte) -111);
        qf.a(9952);
        uq.a(param0 + 24123);
        bh.a(0);
        oq.a(param0 + 24098);
        qp.b((byte) -128);
        rq.b(-110);
        ce.b(true);
        og.a(-1);
        cg.j(124);
        ve.g(0);
        uf.a((byte) 68);
        hd.a((byte) -99);
        vc.a(-67);
        nd.a(true);
        ks.a((byte) 127);
        fg.b(param0 ^ -24186);
        sk.a(param0 + 24021);
        gb.a((byte) -115);
        lq.a((byte) 67);
        ld.a(16711680);
        fk.a((byte) 93);
        mp.a(param0 + 16160);
        kj.a(1);
        cf.a(240);
        bg.a(16928);
        kp.b((byte) -47);
        jm.d(22595);
        ee.a(false);
        cl.a(16777215);
        un.a(11);
        dn.d((byte) -107);
        pd.b(0);
        vf.a(17593);
        wa.a(param0 ^ -14291);
        ih.a(-1);
        rk.a(-13095);
        aq.a((byte) 107);
        wk.a((byte) 70);
        ha.a(4324);
        ec.b(true);
        cc.d(param0 + 24324);
        mm.e(param0 + 23978);
        mf.f(0);
        mb.d(127);
        fj.d(param0 + 24147);
        oa.b(78);
        ql.a((byte) -53);
        u.b(-31);
        da.b((byte) -37);
        ro.a((byte) -92);
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
        Object var9 = null;
        String[] var11 = null;
        String[] var12 = null;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_95_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        L0: {
          var8 = field_F ? 1 : 0;
          if (~jb.field_c != ~jb.field_g) {
            if (jb.field_g != po.field_f) {
              if (~jb.field_g == ~gs.field_d) {
                L1: {
                  if (!w.d(true)) {
                    L2: {
                      if (null != tq.field_b) {
                        ks.a(20, tq.field_b, 3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (bs.field_b < 2) {
                        stackOut_74_0 = 0;
                        stackIn_75_0 = stackOut_74_0;
                        break L3;
                      } else {
                        stackOut_73_0 = 1;
                        stackIn_75_0 = stackOut_73_0;
                        break L3;
                      }
                    }
                    L4: {
                      se.field_g = stackIn_75_0 != 0;
                      gr.field_o = sh.field_b;
                      jc.a(75, id.a(2, kl.field_s, "basic", "unachieved"));
                      if (param0) {
                        stackOut_77_0 = 0;
                        stackIn_78_0 = stackOut_77_0;
                        break L4;
                      } else {
                        stackOut_76_0 = 1;
                        stackIn_78_0 = stackOut_76_0;
                        break L4;
                      }
                    }
                    L5: {
                      oi.a(stackIn_78_0 != 0);
                      if (nh.a((byte) -111, gr.field_o)) {
                        rn.a(1048576);
                        break L5;
                      } else {
                        break L5;
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
                si.f((byte) -91);
                jb.field_g = gs.field_d;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            L6: {
              var3 = 0;
              var4 = 0;
              if (param1) {
                break L6;
              } else {
                if (vr.field_c == gr.field_o) {
                  if (vr.field_c != -1) {
                    if (vr.field_c != -2) {
                      if (vr.field_c == -3) {
                        ub.f((byte) 93);
                        break L6;
                      } else {
                        if (!nh.a((byte) -121, vr.field_c)) {
                          break L6;
                        } else {
                          mj.field_Hb[vr.field_c].i(2664);
                          break L6;
                        }
                      }
                    } else {
                      var3 = 1;
                      break L6;
                    }
                  } else {
                    if (mf.field_p) {
                      var3 = 1;
                      var4 = 1;
                      break L6;
                    } else {
                      ce.field_x.b(true, true);
                      L7: while (true) {
                        if (!cc.e((byte) 55)) {
                          break L6;
                        } else {
                          ce.field_x.g(-86);
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  L8: {
                    L9: {
                      if (eh.field_Q != 0) {
                        break L9;
                      } else {
                        if (!nh.a((byte) -76, vr.field_c)) {
                          break L9;
                        } else {
                          if (!mj.field_Hb[vr.field_c].a((byte) 95)) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    eh.field_Q = eh.field_Q + 1;
                    break L8;
                  }
                  if (eh.field_Q == 32) {
                    rn.a(1048576);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L10: {
              if (!mf.field_p) {
                break L10;
              } else {
                if (md.field_Q) {
                  break L10;
                } else {
                  if (!is.field_a) {
                    L11: {
                      if (!v.field_b) {
                        break L11;
                      } else {
                        if (!sr.field_h) {
                          break L11;
                        } else {
                          var3 = 0;
                          break L11;
                        }
                      }
                    }
                    L12: {
                      cf.a(2, var3 != 0);
                      if (!kc.field_d) {
                        break L12;
                      } else {
                        in.field_g.b(var4 != 0, true);
                        break L12;
                      }
                    }
                    L13: {
                      if (v.field_b) {
                        cf.a(320, 8, 180, var4 != 0);
                        ce.field_x.b(var4 != 0, true);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: while (true) {
                      if (!cc.e((byte) 55)) {
                        break L10;
                      } else {
                        L15: {
                          if (v.field_b) {
                            if (gn.a(13, -9861, 12, 15)) {
                              continue L14;
                            } else {
                              break L15;
                            }
                          } else {
                            boolean discarded$4 = qf.a(0, 13, 15, 12);
                            break L15;
                          }
                        }
                        L16: {
                          if (kc.field_d) {
                            in.field_g.g(-98);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        if (!v.field_b) {
                          continue L14;
                        } else {
                          ce.field_x.g(-99);
                          continue L14;
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
            }
            L17: {
              if (mf.field_p) {
                break L17;
              } else {
                af.b(0);
                break L17;
              }
            }
            L18: {
              if (!ge.field_n) {
                if (fl.field_h <= 0) {
                  break L18;
                } else {
                  fl.field_h = fl.field_h - 1;
                  break L18;
                }
              } else {
                if (fl.field_h < ed.field_f) {
                  fl.field_h = fl.field_h + 1;
                  break L18;
                } else {
                  break L18;
                }
              }
            }
            L19: {
              var5 = ed.field_f * ed.field_f;
              var6 = -(fl.field_h * fl.field_h) + var5;
              var7 = 120 * var6 / var5 + fs.field_z;
              fa.a(var7, (byte) -47);
              if (uc.field_v > 0) {
                uc.field_v = uc.field_v - 1;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (((ShatteredPlansClient) this).field_G.d(0) == null) {
                break L20;
              } else {
                int fieldTemp$5 = ((ShatteredPlansClient) this).field_I + 1;
                ((ShatteredPlansClient) this).field_I = ((ShatteredPlansClient) this).field_I + 1;
                if (fieldTemp$5 != 335) {
                  break L20;
                } else {
                  ((ShatteredPlansClient) this).field_I = 0;
                  oh discarded$6 = ((ShatteredPlansClient) this).field_G.h(64);
                  break L0;
                }
              }
            }
            break L0;
          }
        }
        L21: {
          if (!param0) {
            break L21;
          } else {
            var9 = null;
            boolean discarded$7 = ShatteredPlansClient.a(64, 68L, (String) null);
            break L21;
          }
        }
        L22: {
          if (gr.field_o == -4) {
            L23: {
              tq.field_b = null;
              var11 = new String[]{hn.field_f[0], hn.field_f[1], hn.field_f[2], hn.field_f[3]};
              ce.field_x = new km(false, false, (int) ga.field_w[0], td.field_K, hj.field_k, var11, 0, false, (kq) null);
              if (!uh.field_i) {
                stackOut_89_0 = 0;
                stackIn_90_0 = stackOut_89_0;
                break L23;
              } else {
                stackOut_88_0 = 1;
                stackIn_90_0 = stackOut_88_0;
                break L23;
              }
            }
            var4 = stackIn_90_0;
            ta.a(0, -1, (byte) 96, var4 != 0);
            cs.field_i = true;
            break L22;
          } else {
            break L22;
          }
        }
        L24: {
          if (gr.field_o != -5) {
            break L24;
          } else {
            L25: {
              tq.field_b = null;
              var12 = new String[]{hn.field_f[0]};
              ce.field_x = new km(false, true, 0, hi.field_a, 0, var12, 0, false, (kq) null);
              if (!uh.field_i) {
                stackOut_94_0 = 0;
                stackIn_95_0 = stackOut_94_0;
                break L25;
              } else {
                stackOut_93_0 = 1;
                stackIn_95_0 = stackOut_93_0;
                break L25;
              }
            }
            var4 = stackIn_95_0;
            ta.a(0, -1, (byte) 96, var4 != 0);
            cs.field_i = true;
            break L24;
          }
        }
        L26: {
          if (gr.field_o != -7) {
            break L26;
          } else {
            tk.a(11, np.field_a.g(-79), (byte) -2);
            gr.field_o = vr.field_c;
            is.field_a = true;
            break L26;
          }
        }
    }

    private final void c(boolean param0) {
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
                      u.a(stackIn_28_0 != 0, false);
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
                    ShatteredPlansClient.n((byte) 67);
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
                        u.a(stackIn_18_0 != 0, false);
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
                      ShatteredPlansClient.n((byte) 67);
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
                  ts.a(sa.a(-27572), param0 ^ -2, mg.e(param0 ^ -84));
                  kd.a((byte) -119);
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
                    if (!i.c(0)) {
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
                      ts.a(gq.c(-118), param0 + -2, ah.h(param0 + 107));
                      rg.a(94);
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
              mc.a(110, 0, (java.awt.Canvas) var2, 0);
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

    private final static void n(byte param0) {
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
