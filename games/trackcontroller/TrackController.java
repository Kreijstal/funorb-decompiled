/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Canvas;

public final class TrackController extends ch {
    static ud field_G;
    static qj[] field_D;
    static String[] field_E;
    static String field_C;
    public static boolean field_F;

    public final void init() {
        try {
            ((TrackController) this).a((byte) -123, "trackcontroller", 12);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "TrackController.init()");
        }
    }

    private final void s(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_45_0 = 0;
        int stackIn_105_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_102_0 = 0;
        var3 = field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (dd.field_o == param0) {
                  break L2;
                } else {
                  L3: {
                    if (1 != dd.field_o) {
                      break L3;
                    } else {
                      vl.n(-27145);
                      id.field_g = id.field_g + 1;
                      if (id.field_g != 32) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (ag.b(74)) {
                              break L5;
                            } else {
                              v.e(6);
                              if (var3 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          te.a((byte) -89);
                          break L4;
                        }
                        dd.field_o = 2;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L6: {
                    if (dd.field_o == 2) {
                      break L6;
                    } else {
                      id.field_g = id.field_g - 1;
                      if (id.field_g == 0) {
                        dd.field_o = 0;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  L7: {
                    L8: {
                      if (!jj.s(106)) {
                        break L8;
                      } else {
                        ib.field_a = jh.field_a;
                        if (var3 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (null == ua.field_L) {
                        break L9;
                      } else {
                        ua.field_L.g(param0 + 122);
                        break L9;
                      }
                    }
                    ib.field_a = nf.field_e;
                    break L7;
                  }
                  L10: {
                    if (ib.field_a == -4) {
                      L11: {
                        if (jj.s(96)) {
                          stackOut_44_0 = 0;
                          stackIn_45_0 = stackOut_44_0;
                          break L11;
                        } else {
                          stackOut_42_0 = 1;
                          stackIn_45_0 = stackOut_42_0;
                          break L11;
                        }
                      }
                      ib.field_a = stackIn_45_0;
                      oi.a(26, gb.field_l, 26, bk.field_E, bk.field_E, 10, 320, 20, 240, gb.field_l, -3748, true, 18, 0, 0);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L12: {
                    if (ib.field_a == -3) {
                      L13: {
                        if (jj.s(123)) {
                          break L13;
                        } else {
                          L14: {
                            if (oe.field_e != 0) {
                              break L14;
                            } else {
                              if (ua.field_L.field_O != 0) {
                                ib.field_a = 11;
                                if (var3 == 0) {
                                  break L12;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L12;
                              }
                            }
                          }
                          ib.field_a = 16;
                          if (var3 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      ib.field_a = 15;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  sc.field_g = ib.field_a;
                  tk.field_p[sc.field_g].a(10412, false);
                  dd.field_o = 3;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L15: {
                int fieldTemp$1 = na.field_b + 1;
                na.field_b = na.field_b + 1;
                if (fieldTemp$1 >= 0) {
                  break L15;
                } else {
                  L16: {
                    if (0 != rj.field_a) {
                      break L16;
                    } else {
                      if (ni.field_m[84]) {
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  na.field_b = 0;
                  break L15;
                }
              }
              L17: {
                if (na.field_b >= 80) {
                  break L17;
                } else {
                  he.field_f[ib.field_a].a(false, param0 + 83);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (~ib.field_a != ~sc.field_g) {
                  break L18;
                } else {
                  if (0 != id.field_g) {
                    break L18;
                  } else {
                    L19: {
                      L20: {
                        if (ni.field_m[85]) {
                          break L20;
                        } else {
                          g.field_p = 0;
                          if (var3 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      g.field_p = g.field_p + 1;
                      break L19;
                    }
                    if (ib.field_a != -1) {
                      tk.field_p[ib.field_a].c(-99);
                      if (null == ua.field_L) {
                        break L1;
                      } else {
                        if (!ua.field_L.c(-127)) {
                          break L1;
                        } else {
                          ua.field_L.a(false, 103);
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L18;
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (ni.field_m[13]) {
                          L22: {
                            si.a((byte) -68, 5);
                            if (hk.field_d <= 0) {
                              stackOut_104_0 = 13;
                              stackIn_105_0 = stackOut_104_0;
                              break L22;
                            } else {
                              stackOut_102_0 = 12;
                              stackIn_105_0 = stackOut_102_0;
                              break L22;
                            }
                          }
                          sc.field_g = stackIn_105_0;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L23: {
                        if (ib.field_a != -1) {
                          break L23;
                        } else {
                          ua.field_L.a(true, 90);
                          break L23;
                        }
                      }
                      L24: while (true) {
                        if (!mh.e(127)) {
                          break L1;
                        } else {
                          continue L24;
                        }
                      }
                    }
                  }
                }
              }
              L25: {
                vl.n(-27145);
                vg.field_p = true;
                id.field_g = id.field_g + 1;
                if (id.field_g == 31) {
                  L26: {
                    if (sc.field_g != -2) {
                      break L26;
                    } else {
                      sc.field_g = -1;
                      ua.field_L.b(0);
                      if (var3 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  if (sc.field_g != -1) {
                    L27: {
                      var2_int = 0;
                      if (ib.field_a < 0) {
                        break L27;
                      } else {
                        if (~tk.field_p.length >= ~ib.field_a) {
                          break L27;
                        } else {
                          var2_int = tk.field_p[ib.field_a].field_e.field_a ? 1 : 0;
                          break L27;
                        }
                      }
                    }
                    tk.field_p[sc.field_g].a(param0 ^ 10412, var2_int != 0);
                    break L25;
                  } else {
                    break L25;
                  }
                } else {
                  break L25;
                }
              }
              L28: {
                if (id.field_g == 63) {
                  L29: {
                    if (ib.field_a == 11) {
                      g.field_w = null;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  id.field_g = 0;
                  ib.field_a = sc.field_g;
                  break L28;
                } else {
                  break L28;
                }
              }
              L30: while (true) {
                if (!mh.e(127)) {
                  break L1;
                } else {
                  continue L30;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "TrackController.D(" + param0 + ')');
        }
    }

    final void h(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fc.a(false);
              if (param0 == -24452) {
                break L1;
              } else {
                ((TrackController) this).h(-78);
                break L1;
              }
            }
            L2: {
              if (null != og.field_rb) {
                oj.a(-111);
                break L2;
              } else {
                break L2;
              }
            }
            ei.d(-18601);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "TrackController.H(" + param0 + ')');
        }
    }

    final void a(int param0) {
        Object var2_ref = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_5_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_97_0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas stackOut_4_0 = null;
        ih stackOut_2_0 = null;
        int stackOut_96_0 = 0;
        boolean stackOut_94_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_11_1 = false;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var2_ref = null;
        var6 = field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == og.field_rb) {
                stackOut_4_0 = ki.field_f;
                stackIn_5_0 = (Object) (Object) stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = og.field_rb;
                stackIn_5_0 = (Object) (Object) stackOut_2_0;
                break L1;
              }
            }
            var2_ref = stackIn_5_0;
            if (!ga.a(-122)) {
              if (param0 == 160) {
                if (!pf.field_T) {
                  l.a((byte) 90, (java.awt.Canvas) var2_ref);
                  return;
                } else {
                  L2: {
                    if (il.field_e != null) {
                      break L2;
                    } else {
                      if (null != vd.field_G) {
                        break L2;
                      } else {
                        L3: {
                          if (na.field_b < 80) {
                            cd.field_c.h(0, 0);
                            var3 = 640 * na.field_b / 160;
                            var4 = 480 * na.field_b / 160;
                            ll.e(320 + -var3, -var4 + 240, var3 + 320, 240 - -var4);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            L6: {
                              db.a(480, 0, na.field_c, 640, 0, (byte) -128);
                              gd.field_x = false;
                              if (~sc.field_g != ~ib.field_a) {
                                break L6;
                              } else {
                                if (0 >= id.field_g) {
                                  break L5;
                                } else {
                                  if (dd.field_o != 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L7: {
                              L8: {
                                if (id.field_g >= 32) {
                                  break L8;
                                } else {
                                  L9: {
                                    L10: {
                                      if (ib.field_a != -1) {
                                        break L10;
                                      } else {
                                        ua.field_L.h(param0 ^ 24821);
                                        if (var6 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    tk.field_p[ib.field_a].b(-1);
                                    break L9;
                                  }
                                  var3 = id.field_g;
                                  if (var6 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L11: {
                                L12: {
                                  L13: {
                                    if (-1 == sc.field_g) {
                                      break L13;
                                    } else {
                                      if (sc.field_g != -2) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  ua.field_L.h(24661);
                                  if (var6 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                                tk.field_p[sc.field_g].b(param0 + -161);
                                break L11;
                              }
                              var3 = -id.field_g + 63;
                              break L7;
                            }
                            ci.a(var3 + 1, -(var3 << 805118979) + 256, 16769381, false, false);
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          L14: {
                            if (ib.field_a == -1) {
                              break L14;
                            } else {
                              tk.field_p[ib.field_a].b(-1);
                              if (var6 == 0) {
                                break L4;
                              } else {
                                break L14;
                              }
                            }
                          }
                          ua.field_L.h(24661);
                          break L4;
                        }
                        L15: {
                          L16: {
                            if (!gd.field_x) {
                              break L16;
                            } else {
                              vd.b(-1, 2, 23636);
                              if (var6 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          kb.a(false, 4, 2);
                          break L15;
                        }
                        L17: {
                          ll.d();
                          if (!ag.b(param0 + -142)) {
                            break L17;
                          } else {
                            L18: {
                              ll.c(0, 0, ll.field_d, ll.field_k);
                              var3 = re.g(48);
                              var4 = var3 % 26;
                              if (var4 == 0) {
                                break L18;
                              } else {
                                var3 = var3 + (26 - var4);
                                break L18;
                              }
                            }
                            var5 = ii.b(false);
                            cl.a(nd.field_L, -(var3 >> -1431342687) + 320 + -nd.field_L[0].field_t, nd.field_L[0].field_q + var5 + nd.field_L[6].field_q, -(var5 >> 1112669313) + 240 - nd.field_L[0].field_q, var3 - (-nd.field_L[0].field_t + -nd.field_L[2].field_t), 4);
                            nl.a(-77);
                            break L17;
                          }
                        }
                        L19: {
                          if (0 == dd.field_o) {
                            break L19;
                          } else {
                            var3 = id.field_g << 1350553731;
                            if (var3 <= 0) {
                              break L19;
                            } else {
                              ll.c(0, 0, ll.field_d, ll.field_k, 0, var3);
                              break L19;
                            }
                          }
                        }
                        L20: {
                          if (!ob.g(-26998)) {
                            break L20;
                          } else {
                            if (ag.b(18)) {
                              break L20;
                            } else {
                              L21: {
                                if (og.field_rb != null) {
                                  stackOut_96_0 = 1;
                                  stackIn_97_0 = stackOut_96_0;
                                  break L21;
                                } else {
                                  stackOut_94_0 = lb.field_M;
                                  stackIn_97_0 = stackOut_94_0 ? 1 : 0;
                                  break L21;
                                }
                              }
                              nc.a(stackIn_97_0 != 0, -131);
                              break L20;
                            }
                          }
                        }
                        L22: {
                          if (nf.field_f) {
                            bk.field_E.c(Integer.toString(dh.field_p), 10, 40, 0, -1);
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        qd.a((java.awt.Canvas) var2_ref, 0, 0, param0 + 2741);
                        break L0;
                      }
                    }
                  }
                  ud.a(128, 100.0f, ra.field_w);
                  l.a((byte) 105, (java.awt.Canvas) var2_ref);
                  return;
                }
              } else {
                return;
              }
            } else {
              L23: {
                stackOut_6_0 = -128;
                stackIn_11_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (og.field_rb == null) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = lb.field_M;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1 ? 1 : 0;
                  break L23;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackIn_9_0 = stackOut_7_0;
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  break L23;
                }
              }
              ji.a((byte) stackIn_12_0, stackIn_12_1 != 0, (java.awt.Canvas) var2_ref);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "TrackController.E(" + param0 + ')');
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            TrackController.q(-29224);
            cb.a((byte) 120);
            ja.c(false);
            kk.a(-1);
            bg.a(61);
            vb.a(true);
            ib.a((byte) -78);
            ii.f(-5146);
            ia.a(true);
            lj.a(param0 ^ 5);
            uk.b(10);
            od.a(8192);
            we.a((byte) 57);
            ch.n(-8511);
            nl.a((byte) -96);
            re.b((byte) -91);
            ej.b(17);
            h.b(-31279);
            ll.c();
            oh.a();
            e.a(-1102);
            qf.a((byte) 98);
            be.i(3);
            qg.b(false);
            ai.a((byte) 116);
            o.b((byte) 88);
            uj.b(param0 ^ 105);
            dk.a(true);
            tf.a(-1);
            kc.a(param0 ^ 107);
            q.a(param0 ^ 5);
            qd.a(106);
            he.a((byte) -64);
            oj.a((byte) -116);
            wj.c(param0 ^ -6527);
            sk.a((byte) 111);
            gf.a((byte) 46);
            jc.a(-79);
            ri.a(-107);
            mg.a(-8381);
            gj.b((byte) -103);
            ea.d((byte) 96);
            md.a(false);
            sd.a((byte) -108);
            wg.c(param0 + 6778);
            il.b(-1);
            bc.c(32);
            fc.b((byte) 118);
            nb.d((byte) 84);
            id.a(param0 + -104);
            ha.d(4);
            fa.c();
            ol.f(param0 ^ -109);
            oa.e();
            qe.e(1048576);
            kb.a(14);
            cd.c(11352);
            na.a(-4775);
            fk.a(param0 + 14829);
            pa.a((byte) -125);
            ac.a(105);
            p.b((byte) 117);
            ra.a(param0 + -208);
            pc.a(true);
            vi.a(-25590);
            wi.a(false);
            pb.a(false);
            bb.a(true);
            ld.a(-16723);
            vl.e((byte) 9);
            og.v(-106);
            rk.t(4210752);
            jj.e((byte) 105);
            vd.b(false);
            sf.b(false);
            rl.b(false);
            bk.k(-122);
            kh.c(61);
            rd.b(3);
            mj.b(-2069072125);
            ab.a((byte) 98);
            gk.a(69);
            gb.d(-126);
            fd.a((byte) 111);
            g.a((byte) 12);
            sl.a((byte) 107);
            me.a((byte) 41);
            u.a((byte) 105);
            pg.a();
            c.a((byte) 107);
            hj.a(param0 ^ -3863);
            la.d(false);
            jk.a(-99);
            wf.a((byte) -123);
            qa.a(true);
            vj.a(18775);
            ta.a(param0 ^ 13730);
            nh.a(-104);
            kd.a((byte) 86);
            oe.a(-1);
            fh.a((byte) 125);
            b.a();
            nf.b(261211);
            da.e(80);
            mb.b((byte) -36);
            hi.c((byte) -81);
            hf.a(6);
            lh.c((byte) -44);
            gd.c(-3);
            tc.b((byte) -121);
            rg.a(17883);
            tk.f(48);
            pl.c(-30877);
            w.b(true);
            bd.a(44);
            ic.b((byte) -56);
            ig.b();
            ml.c();
            mf.b((byte) -103);
            cg.a((byte) 118);
            pf.a(110);
            ef.a(27887);
            fg.a(-14138);
            fb.a(param0 ^ 30493);
            ak.a(119);
            kg.a(-1);
            ug.g(param0 ^ -13);
            bj.a(false);
            te.a(param0 ^ -18);
            sb.a((byte) 123);
            kj.b(false);
            ke.a(false);
            s.a((byte) 49);
            ij.c(-18515);
            gi.c((byte) -127);
            gh.b(8462);
            jd.a(-12814);
            rb.b(-2857);
            al.d(param0 ^ -59);
            rh.i(param0 + -222);
            ok.d((byte) -7);
            wd.p(35);
            hl.l(param0 ^ -66);
            ue.b(param0 ^ -18);
            ie.b(82);
            df.b();
            kf.b(-1688814815);
            ob.c((byte) -68);
            lg.b(16228);
            ki.a(49);
            hb.a(false);
            si.a((byte) 47);
            ff.a(-1);
            rf.a(0);
            hk.a(-88);
            dj.a(-60);
            ub.a((byte) 12);
            ca.a(118);
            ji.a((byte) -64);
            wl.d(-99);
            oc.a((byte) -63);
            bf.a((byte) -125);
            mh.d(-24011);
            uh.a((byte) 104);
            sa.b(true);
            lf.f((byte) -71);
            lb.n(-85);
            dg.a((byte) 16);
            nd.b(false);
            el.c(false);
            ua.j(param0 + -219);
            ed.j(param0 + -3726);
            di.c((byte) 73);
            ka.a(true);
            fe.j(-127);
            qk.a((byte) 40);
            vf.a();
            f.a((byte) 113);
            pi.b(param0 + -105);
            cj.e(4);
            qh.a(-51);
            fj.e((byte) 118);
            mc.b(false);
            aa.a((byte) -14);
            ga.a((byte) 72);
            rj.a((byte) 59);
            vh.g(32);
            ad.i(param0 ^ 104);
            qc.a(true);
            kl.a(119);
            ee.a(31399);
            hh.b((byte) 52);
            ti.c((byte) -121);
            ag.a(10);
            li.a((byte) 111);
            vk.d(2);
            dc.c((byte) 97);
            ne.a(-29615);
            dd.b(-3674);
            ql.c(42);
            ma.a((byte) -50);
            gl.j(-101);
            jf.d(640);
            sg.a(-8217);
            nk.d(23985);
            dh.d(-8);
            th.e(0);
            cf.d(29211);
            le.b(-128);
            nj.b(71);
            j.a(-75);
            ba.a((byte) 113);
            wa.d(param0 + -202);
            lc.j(112);
            bl.a(-113);
            ec.b((byte) -49);
            of.b(false);
            sc.a(param0 ^ 150);
            mk.a((byte) -3);
            r.d(-1);
            ei.e(73);
            qi.a(param0 ^ param0);
            va.c(20300);
            af.d((byte) -127);
            ui.h(256);
            l.g(param0 ^ 105);
            hd.d((byte) 69);
            ni.g(112);
            jb.a(-111);
            fi.d(param0 + -5759);
            ud.a(true);
            v.d(0);
            oi.a(-13);
            ((TrackController) this).field_t = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "TrackController.F(" + param0 + ')');
        }
    }

    public static void q(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_C = null;
              if (param0 == -29224) {
                break L1;
              } else {
                TrackController.q(36);
                break L1;
              }
            }
            field_G = null;
            field_E = null;
            field_D = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "TrackController.G(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        cf var2_ref = null;
        int var2_int = 0;
        dh var2_ref2 = null;
        int var3 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_93_0 = null;
        Object stackIn_95_0 = null;
        Object stackIn_97_0 = null;
        Object stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_92_0 = null;
        Object stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        Object stackOut_93_0 = null;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        var3 = field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ii.a((byte) -62);
              if (og.field_rb == null) {
                break L1;
              } else {
                if (!og.field_rb.field_b) {
                  break L1;
                } else {
                  oj.a(-78);
                  ed.a((byte) -94);
                  break L1;
                }
              }
            }
            L2: {
              stackOut_7_0 = this;
              stackOut_7_1 = 103;
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (null == og.field_rb) {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L2;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 1;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                stackIn_11_2 = stackOut_8_2;
                break L2;
              }
            }
            L3: {
              ((TrackController) this).a((byte) stackIn_11_1, stackIn_11_2 != 0);
              if (!ag.field_e) {
                break L3;
              } else {
                this.r(-23);
                ag.field_e = false;
                break L3;
              }
            }
            L4: {
              if (!ga.a(43)) {
                break L4;
              } else {
                ((TrackController) this).l(-122);
                if (ga.a(114)) {
                  L5: {
                    if (!ic.a(1)) {
                      break L5;
                    } else {
                      boolean discarded$1 = this.b(467, false);
                      break L5;
                    }
                  }
                  return;
                } else {
                  if (jj.s(109)) {
                    break L4;
                  } else {
                    il.field_e = sl.a(4, -124);
                    vd.field_G = dh.a(5, -1, 0, 1);
                    break L4;
                  }
                }
              }
            }
            L6: {
              L7: {
                if (pf.field_T) {
                  break L7;
                } else {
                  od.a((byte) -116, ee.field_c);
                  if (this.b(467, true)) {
                    pf.field_T = true;
                    if (var3 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                if (il.field_e == null) {
                  break L8;
                } else {
                  if (!il.field_e.field_j) {
                    break L6;
                  } else {
                    th.field_l = th.field_l | il.field_e.field_m;
                    oe.field_e = oe.field_e & ~il.field_e.field_m;
                    il.field_e = null;
                    if (oe.field_e == 0) {
                      if (16 == ib.field_a) {
                        ib.field_a = 11;
                        sc.field_g = 11;
                        if (var3 == 0) {
                          break L6;
                        } else {
                          break L8;
                        }
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
              }
              L9: {
                if (vd.field_G == null) {
                  break L9;
                } else {
                  if (!vd.field_G.field_k) {
                    break L6;
                  } else {
                    L10: {
                      if (~vd.field_G.field_m[0] >= ~pc.field_i) {
                        break L10;
                      } else {
                        pc.field_i = vd.field_G.field_m[0];
                        break L10;
                      }
                    }
                    vd.field_G = null;
                    mf.c((byte) 123);
                    if (var3 == 0) {
                      break L6;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              L11: {
                if (!ag.b(116)) {
                  break L11;
                } else {
                  L12: {
                    if (dd.field_o != 0) {
                      break L12;
                    } else {
                      L13: {
                        L14: {
                          var2_int = rk.s(-1);
                          if (var2_int == 3) {
                            break L14;
                          } else {
                            L15: {
                              if (2 != var2_int) {
                                break L15;
                              } else {
                                oj.a(-77);
                                if (var3 == 0) {
                                  break L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            if (var2_int == 4) {
                              ad.a(-4, -4, (byte) -110);
                              if (var3 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        oi.a(26, gb.field_l, 26, bk.field_E, bk.field_E, 10, 320, 20, 240, gb.field_l, -3748, true, 18, 0, 0);
                        break L13;
                      }
                      L16: {
                        if (ag.b(45)) {
                          break L16;
                        } else {
                          tk.field_p[ib.field_a].a(10412, true);
                          break L16;
                        }
                      }
                      if (var3 == 0) {
                        break L6;
                      } else {
                        break L12;
                      }
                    }
                  }
                  this.s(0);
                  if (var3 == 0) {
                    break L6;
                  } else {
                    break L11;
                  }
                }
              }
              L17: {
                if (!ob.g(-26998)) {
                  break L17;
                } else {
                  L18: {
                    stackOut_92_0 = this;
                    stackIn_97_0 = stackOut_92_0;
                    stackIn_93_0 = stackOut_92_0;
                    if (null == og.field_rb) {
                      stackOut_97_0 = this;
                      stackOut_97_1 = 0;
                      stackIn_98_0 = stackOut_97_0;
                      stackIn_98_1 = stackOut_97_1;
                      break L18;
                    } else {
                      stackOut_93_0 = this;
                      stackIn_95_0 = stackOut_93_0;
                      stackOut_95_0 = this;
                      stackOut_95_1 = 1;
                      stackIn_98_0 = stackOut_95_0;
                      stackIn_98_1 = stackOut_95_1;
                      break L18;
                    }
                  }
                  L19: {
                    L20: {
                      var2_int = ((TrackController) this).b(stackIn_98_1 != 0, 119);
                      if (var2_int == 1) {
                        break L20;
                      } else {
                        if (var2_int != 2) {
                          break L19;
                        } else {
                          L21: {
                            if (null == og.field_rb) {
                              break L21;
                            } else {
                              oj.a(-84);
                              break L21;
                            }
                          }
                          af.a(gd.b((byte) 77), (byte) -9);
                          if (var3 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    if (og.field_rb != null) {
                      oj.a(-108);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  if (var3 == 0) {
                    break L6;
                  } else {
                    break L17;
                  }
                }
              }
              this.s(0);
              break L6;
            }
            if (!param0) {
              L22: {
                L23: {
                  if (!jj.s(47)) {
                    L24: while (true) {
                      L25: {
                        L26: {
                          L27: {
                            var2_ref = (cf) (Object) ka.field_d.b((byte) -105);
                            if (var2_ref != null) {
                              break L27;
                            } else {
                              if (var3 != 0) {
                                break L26;
                              } else {
                                if (var3 == 0) {
                                  break L25;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                          ti.a(4, (byte) 88, var2_ref);
                          break L26;
                        }
                        if (var3 == 0) {
                          continue L24;
                        } else {
                          break L25;
                        }
                      }
                      L28: while (true) {
                        var2_ref2 = (dh) (Object) cd.field_h.b((byte) -111);
                        if (var2_ref2 == null) {
                          break L23;
                        } else {
                          ij.a(var2_ref2, 5, -126);
                          if (var3 != 0) {
                            break L22;
                          } else {
                            if (var3 == 0) {
                              continue L28;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L23;
                  }
                }
                if (!pf.field_T) {
                  break L22;
                } else {
                  if (null != ch.field_n) {
                    break L22;
                  } else {
                    fe.a(true, pf.field_P[0], 256);
                    break L22;
                  }
                }
              }
              L29: while (true) {
                L30: {
                  L31: {
                    if (!ge.a(kg.field_b, param0)) {
                      break L31;
                    } else {
                      ((TrackController) this).e((byte) 85);
                      if (var3 != 0) {
                        break L30;
                      } else {
                        if (var3 == 0) {
                          continue L29;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                  me.a(-1, 0);
                  break L30;
                }
                L32: {
                  if (fc.c(72)) {
                    var2_int = ((TrackController) this).d((byte) 103);
                    if (2 != var2_int) {
                      break L32;
                    } else {
                      hh.a(-28717);
                      break L32;
                    }
                  } else {
                    break L32;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "TrackController.C(" + param0 + ')');
        }
    }

    public TrackController() {
    }

    private final void r(int param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ed.field_I) {
                vk.a(3, ed.field_I);
                ed.field_I = null;
                qi.d(58);
                break L1;
              } else {
                break L1;
              }
            }
            sg.field_a = mf.a(1, (byte) 119);
            sk.field_j = mf.a(2, (byte) 94);
            j.field_h = mf.a(3, (byte) 80);
            wl.field_l = mf.a(4, (byte) -36);
            lh.field_C = mf.a(5, (byte) 86);
            si.field_c = mf.a(6, (byte) -77);
            rl.field_D = mf.a(8, (byte) -29);
            if (param0 < -8) {
              o.a((byte) -46);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) (Object) runtimeException, "TrackController.I(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        nb var2 = null;
        try {
            ((TrackController) this).a(false, 0, 10, 12, 7, (byte) 3, 11, 9);
            var2 = new nb();
            var2.a(false, 128, 9);
            mf.a(15, true, 22050, rg.field_c, (java.awt.Component) (Object) ki.field_f, var2);
            ((TrackController) this).a(-1, true, true, false, true);
            int var3 = 10 / ((param0 - 61) / 61);
            j.field_a = 1;
            db.field_db = 5;
            sl.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "TrackController.A(" + param0 + ')');
        }
    }

    private final boolean b(int param0, boolean param1) {
        try {
            int var3_int = 0;
            byte[] var3 = null;
            qj[] var4 = null;
            byte[] var4_array = null;
            int var4_int = 0;
            BufferedReader var4_ref = null;
            String var4_ref2 = null;
            ng[] var4_array2 = null;
            int var5 = 0;
            qj[] var5_ref_qj__ = null;
            de var5_ref_de = null;
            qj var6_ref_qj = null;
            int var6 = 0;
            qj[] var6_ref_qj__ = null;
            int[] var6_ref_int__ = null;
            int var7_int = 0;
            qj[] var7 = null;
            int var8 = 0;
            qj var8_ref_qj = null;
            qj var9 = null;
            qj var10 = null;
            qj var11 = null;
            qj var12 = null;
            qj var13 = null;
            qj var14 = null;
            qj var15 = null;
            qj var16 = null;
            qj var17 = null;
            int var18 = 0;
            int stackIn_78_0 = 0;
            int stackIn_86_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_95_1 = 0;
            int stackIn_112_0 = 0;
            int stackIn_112_1 = 0;
            String stackIn_115_0 = null;
            int stackIn_133_0 = 0;
            int stackIn_138_0 = 0;
            boolean stackIn_146_0 = false;
            int stackIn_151_0 = 0;
            int stackIn_157_0 = 0;
            int stackIn_165_0 = 0;
            int stackOut_132_0 = 0;
            int stackOut_137_0 = 0;
            boolean stackOut_145_0 = false;
            int stackOut_150_0 = 0;
            int stackOut_156_0 = 0;
            int stackOut_164_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_85_0 = 0;
            int stackOut_94_0 = 0;
            int stackOut_94_1 = 0;
            int stackOut_111_0 = 0;
            int stackOut_111_1 = 0;
            String stackOut_114_0 = null;
            String stackOut_113_0 = null;
            var18 = field_F ? 1 : 0;
            if (null == el.field_L) {
              if (sg.field_a == null) {
                if (null != j.field_h) {
                  ud.a(param0 ^ 339, 75.0f, ld.field_a);
                  ((TrackController) this).a(160);
                  od.field_d = new jc(j.field_h, lh.field_C);
                  va.field_d[0] = cc.a(j.field_h, "", "track_wrong_password").b();
                  va.field_d[1] = cc.a(j.field_h, "", "track_correct_password").b();
                  va.field_d[2] = cc.a(j.field_h, "", "track_train_loop").b();
                  va.field_d[3] = cc.a(j.field_h, "", "track_train_whistle").b();
                  va.field_d[4] = cc.a(j.field_h, "", "track_train_fade").b();
                  va.field_d[6] = cc.a(j.field_h, "", "track_blockpush_1").b();
                  va.field_d[7] = cc.a(j.field_h, "", "track_blockconnect").b();
                  va.field_d[5] = va.field_d[7];
                  va.field_d[8] = cc.a(j.field_h, "", "track_footstep_1_and_2").b();
                  va.field_d[9] = cc.a(j.field_h, "", "track_slide_4").b();
                  va.field_d[10] = cc.a(j.field_h, "", "score_count").b();
                  nd.field_G[10] = 48;
                  va.field_d[11] = cc.a(j.field_h, "", "block_disconnect_placeholder").b();
                  va.field_d[12] = cc.a(j.field_h, "", "cannot_push_placeholder").b();
                  var3 = va.field_d[10].field_j;
                  var4_array = new byte[oa.field_h * 5 / 50];
                  var5 = 0;
                  L0: while (true) {
                    L1: {
                      L2: {
                        if (var5 >= var3.length) {
                          break L2;
                        } else {
                          var4_array[var5] = var3[var5];
                          var5++;
                          if (var18 != 0) {
                            break L1;
                          } else {
                            if (var18 == 0) {
                              continue L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      va.field_d[10] = new ik(oa.field_h, var4_array, 0, var4_array.length);
                      break L1;
                    }
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var5 >= 13) {
                            break L5;
                          } else {
                            stackOut_132_0 = -1;
                            stackIn_138_0 = stackOut_132_0;
                            stackIn_133_0 = stackOut_132_0;
                            if (var18 != 0) {
                              break L4;
                            } else {
                              L6: {
                                if (stackIn_133_0 != ~nd.field_G[var5]) {
                                  break L6;
                                } else {
                                  nd.field_G[var5] = 96;
                                  break L6;
                                }
                              }
                              var5++;
                              if (var18 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        j.field_h = null;
                        qi.d(-123);
                        stackOut_137_0 = 0;
                        stackIn_138_0 = stackOut_137_0;
                        break L4;
                      }
                      return stackIn_138_0 != 0;
                    }
                  }
                } else {
                  if (sk.field_j == null) {
                    if (null != wl.field_l) {
                      var3_int = 0;
                      L7: while (true) {
                        L8: {
                          L9: {
                            if (var3_int >= 4) {
                              break L9;
                            } else {
                              stackOut_145_0 = fj.field_P.a(wl.field_l, (byte) -27, 176400, od.field_d, pf.field_P[var3_int]);
                              stackIn_151_0 = stackOut_145_0 ? 1 : 0;
                              stackIn_146_0 = stackOut_145_0;
                              if (var18 != 0) {
                                break L8;
                              } else {
                                if (stackIn_146_0) {
                                  var3_int++;
                                  if (var18 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  return false;
                                }
                              }
                            }
                          }
                          fj.field_P.b(true);
                          od.field_d = null;
                          wl.field_l = null;
                          qi.d(param0 ^ 399);
                          stackOut_150_0 = 0;
                          stackIn_151_0 = stackOut_150_0;
                          break L8;
                        }
                        return stackIn_151_0 != 0;
                      }
                    } else {
                      if (da.field_p[1][0] == null) {
                        ud.a(128, 95.0f, rj.field_f);
                        ((TrackController) this).a(160);
                        var3_int = 208;
                        var4_int = 1;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (32 <= var4_int) {
                                break L12;
                              } else {
                                var5 = var4_int * 65536 / 32;
                                stackOut_156_0 = 0;
                                stackIn_165_0 = stackOut_156_0;
                                stackIn_157_0 = stackOut_156_0;
                                if (var18 != 0) {
                                  break L11;
                                } else {
                                  var6 = stackIn_157_0;
                                  L13: while (true) {
                                    L14: {
                                      L15: {
                                        if (var6 >= 4) {
                                          break L15;
                                        } else {
                                          da.field_p[var4_int][var6] = new qj(26, 26);
                                          da.field_p[var4_int][var6].a();
                                          da.field_p[0][var6].a(var3_int, var3_int, var3_int, var3_int, var5, 4096);
                                          da.field_p[32 + var4_int][var6] = new qj(26, 26);
                                          da.field_p[var4_int - -32][var6].a();
                                          da.field_p[32][var6].a(var3_int, var3_int, var3_int, var3_int, var5, 4096);
                                          var6++;
                                          if (var18 != 0) {
                                            break L14;
                                          } else {
                                            if (var18 == 0) {
                                              continue L13;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                      var4_int++;
                                      break L14;
                                    }
                                    if (var18 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            ia.field_b.a(-91);
                            qi.d(param0 + -438);
                            stackOut_164_0 = 0;
                            stackIn_165_0 = stackOut_164_0;
                            break L11;
                          }
                          return stackIn_165_0 != 0;
                        }
                      } else {
                        L16: {
                          if (param0 == 467) {
                            break L16;
                          } else {
                            TrackController.q(109);
                            break L16;
                          }
                        }
                        L17: {
                          if (null == rl.field_D) {
                            break L17;
                          } else {
                            mj.a(208);
                            gj.field_f = new ea[31];
                            var3 = rl.field_D.a("", param0 ^ -468, "levels.txt");
                            var4_ref = new BufferedReader((Reader) (Object) new InputStreamReader((InputStream) (Object) new ByteArrayInputStream(var3)));
                            var5 = 0;
                            L18: while (true) {
                              L19: {
                                L20: {
                                  if (31 <= var5) {
                                    break L20;
                                  } else {
                                    gj.field_f[var5] = new ea(1 + var5, var4_ref.readLine());
                                    var5++;
                                    if (var18 != 0) {
                                      break L19;
                                    } else {
                                      if (var18 == 0) {
                                        continue L18;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                var4_ref.close();
                                break L19;
                              }
                              tk.field_p = new mg[17];
                              qh.field_b = gj.field_f[0];
                              rl.field_D = null;
                              var5 = 0;
                              L21: while (true) {
                                L22: {
                                  L23: {
                                    L24: {
                                      if (var5 >= 17) {
                                        break L24;
                                      } else {
                                        tk.field_p[var5] = new mg((TrackController) this, var5);
                                        var5++;
                                        if (var18 != 0) {
                                          break L23;
                                        } else {
                                          if (var18 == 0) {
                                            continue L21;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                    L25: {
                                      if (jj.s(125)) {
                                        break L25;
                                      } else {
                                        ib.field_a = 1;
                                        sc.field_g = 1;
                                        if (var18 == 0) {
                                          break L22;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                    ib.field_a = 0;
                                    break L23;
                                  }
                                  sc.field_g = 0;
                                  break L22;
                                }
                                ti.a(-123, 50);
                                fe.a(true, pf.field_P[0], 256);
                                rk.r(13);
                                break L17;
                              }
                            }
                          }
                        }
                        qi.d(54);
                        return true;
                      }
                    }
                  } else {
                    ud.a(128, 80.0f, ji.field_e);
                    ((TrackController) this).a(160);
                    pf.field_P[0] = wb.a(sk.field_j, "", "track controller titlescreen");
                    pf.field_P[1] = wb.a(sk.field_j, "", "track controller new");
                    pf.field_P[2] = wb.a(sk.field_j, "", "track controller level complete");
                    pf.field_P[3] = wb.a(sk.field_j, "", "track controller game over");
                    sk.field_j = null;
                    qi.d(param0 + -359);
                    return false;
                  }
                }
              } else {
                var3_int = bk.field_E.field_u + bk.field_E.field_G;
                mc.field_E = new qj(var3_int, var3_int);
                mc.field_E.a();
                dc.field_p.a(0, 0, var3_int, var3_int);
                dc.field_p = null;
                ia.field_b.a(-91);
                bb.field_b = ib.a(10, "", sg.field_a, "achievements");
                var4 = bb.field_b;
                var5 = 0;
                L26: while (true) {
                  L27: {
                    L28: {
                      if (~var5 <= ~var4.length) {
                        break L28;
                      } else {
                        var6_ref_qj = var4[var5];
                        ei.a(var6_ref_qj, -1);
                        var5++;
                        if (var18 != 0) {
                          break L27;
                        } else {
                          if (var18 == 0) {
                            continue L26;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    na.field_c = ab.a("", -15383, "bgtile", sg.field_a);
                    cd.field_c = new qj(640, 480);
                    cd.field_c.a();
                    break L27;
                  }
                  var4_int = 0;
                  L29: while (true) {
                    L30: {
                      L31: {
                        if (var4_int >= 480) {
                          break L31;
                        } else {
                          stackOut_77_0 = 0;
                          stackIn_86_0 = stackOut_77_0;
                          stackIn_78_0 = stackOut_77_0;
                          if (var18 != 0) {
                            break L30;
                          } else {
                            var5 = stackIn_78_0;
                            L32: while (true) {
                              L33: {
                                L34: {
                                  if (var5 >= 640) {
                                    break L34;
                                  } else {
                                    na.field_c.h(var5, var4_int);
                                    var5 = var5 + na.field_c.field_s;
                                    if (var18 != 0) {
                                      break L33;
                                    } else {
                                      if (var18 == 0) {
                                        continue L32;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                var4_int = var4_int + na.field_c.field_v;
                                break L33;
                              }
                              if (var18 == 0) {
                                continue L29;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                      }
                      ll.b(20, 30, 600, 383, 3894145, 11980506);
                      ll.f(0, 0, 640, 480, 0);
                      ab.a("", -15383, "titlescreen2", sg.field_a).e(0, 0);
                      ia.field_b.a(-91);
                      nd.field_L = ib.a(10, "", sg.field_a, "frame");
                      gb.field_l = ib.a(param0 + -457, "", sg.field_a, "buttonframe");
                      aa.field_a = ib.a(10, "", sg.field_a, "buttonframe38");
                      stackOut_85_0 = 0;
                      stackIn_86_0 = stackOut_85_0;
                      break L30;
                    }
                    var4_int = stackIn_86_0;
                    L35: while (true) {
                      L36: {
                        L37: {
                          if (var4_int >= 9) {
                            break L37;
                          } else {
                            nd.field_L[var4_int].field_s = nd.field_L[var4_int].field_t;
                            nd.field_L[var4_int].field_v = nd.field_L[var4_int].field_q;
                            gb.field_l[var4_int].field_s = gb.field_l[var4_int].field_t;
                            gb.field_l[var4_int].field_v = gb.field_l[var4_int].field_q;
                            var4_int++;
                            if (var18 != 0) {
                              break L36;
                            } else {
                              if (var18 == 0) {
                                continue L35;
                              } else {
                                break L37;
                              }
                            }
                          }
                        }
                        ii.field_r = ib.a(10, "", sg.field_a, "tiles");
                        ha.field_m = new qj[9];
                        ha.field_m[4] = ii.field_r[0];
                        break L36;
                      }
                      var4_int = 0;
                      L38: while (true) {
                        L39: {
                          L40: {
                            if (var4_int >= 9) {
                              break L40;
                            } else {
                              stackOut_94_0 = var4_int;
                              stackOut_94_1 = 4;
                              stackIn_112_0 = stackOut_94_0;
                              stackIn_112_1 = stackOut_94_1;
                              stackIn_95_0 = stackOut_94_0;
                              stackIn_95_1 = stackOut_94_1;
                              if (var18 != 0) {
                                break L39;
                              } else {
                                L41: {
                                  if (stackIn_95_0 != stackIn_95_1) {
                                    L42: {
                                      ha.field_m[var4_int] = nd.field_L[var4_int].b();
                                      ha.field_m[var4_int].a();
                                      var5 = 0;
                                      var6 = 0;
                                      var7_int = 2;
                                      if (0 != var4_int % 3) {
                                        break L42;
                                      } else {
                                        var5 = -2 + ll.field_d;
                                        break L42;
                                      }
                                    }
                                    L43: {
                                      if (3 > var4_int) {
                                        var6 = ll.field_k + -2;
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                    L44: {
                                      var8 = 2;
                                      if (var4_int % 3 != 1) {
                                        break L44;
                                      } else {
                                        var7_int = ll.field_d;
                                        break L44;
                                      }
                                    }
                                    L45: {
                                      L46: {
                                        if (3 == var4_int) {
                                          break L46;
                                        } else {
                                          if (5 != var4_int) {
                                            break L45;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                      var8 = ll.field_k;
                                      break L45;
                                    }
                                    ll.c(var5, var6, var7_int, var8, 9073738);
                                    break L41;
                                  } else {
                                    break L41;
                                  }
                                }
                                var4_int++;
                                if (var18 == 0) {
                                  continue L38;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                          stackOut_111_0 = 0;
                          stackOut_111_1 = 1;
                          stackIn_112_0 = stackOut_111_0;
                          stackIn_112_1 = stackOut_111_1;
                          break L39;
                        }
                        L47: {
                          if (ui.a(stackIn_112_0, stackIn_112_1 != 0)) {
                            stackOut_114_0 = "halloween";
                            stackIn_115_0 = stackOut_114_0;
                            break L47;
                          } else {
                            stackOut_113_0 = "";
                            stackIn_115_0 = stackOut_113_0;
                            break L47;
                          }
                        }
                        var4_ref2 = stackIn_115_0;
                        var5_ref_qj__ = ib.a(10, var4_ref2, sg.field_a, "man");
                        da.field_p = new qj[64][4];
                        pd.a((Object[]) (Object) var5_ref_qj__, 0, (Object[]) (Object) da.field_p[0], 0, 4);
                        pd.a((Object[]) (Object) var5_ref_qj__, 4, (Object[]) (Object) da.field_p[32], 0, 4);
                        j.field_b = ib.a(param0 ^ 473, var4_ref2, sg.field_a, "man_face");
                        hk.field_a = ib.a(10, "", sg.field_a, "smoke");
                        kg.field_e = ib.a(10, "", sg.field_a, "tickbox");
                        var6_ref_qj__ = ib.a(10, "", sg.field_a, "titlebg");
                        var7 = ib.a(10, "", sg.field_a, "titles");
                        al.field_z = new qj[1 + var7.length];
                        var8 = 0;
                        L48: while (true) {
                          L49: {
                            L50: {
                              if (~var7.length >= ~var8) {
                                break L50;
                              } else {
                                var9 = var7[var8];
                                qj dupTemp$6 = new qj(var9.field_s, var9.field_v);
                                al.field_z[var8] = dupTemp$6;
                                var10 = dupTemp$6;
                                var10.a();
                                cl.a(var6_ref_qj__, 0, var9.field_v, 0, var9.field_s, 4);
                                var9.e(0, 0);
                                var8++;
                                if (var18 != 0) {
                                  break L49;
                                } else {
                                  if (var18 == 0) {
                                    continue L48;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                            }
                            var8_ref_qj = ab.a("", -15383, "titlegameach", sg.field_a);
                            qj dupTemp$7 = new qj(var8_ref_qj.field_s, var8_ref_qj.field_v);
                            al.field_z[var7.length] = dupTemp$7;
                            var9 = dupTemp$7;
                            var9.a();
                            cl.a(var6_ref_qj__, 0, var8_ref_qj.field_v, 0, var8_ref_qj.field_s, param0 ^ 471);
                            var8_ref_qj.e(0, 0);
                            fd.field_d = ab.a("", -15383, "exhibit", sg.field_a);
                            var8 = ba.field_b.field_G + 26;
                            qj dupTemp$8 = new qj(156, var8);
                            ai.field_a = dupTemp$8;
                            var9 = dupTemp$8;
                            qj dupTemp$9 = new qj(156, var8);
                            al.field_t = dupTemp$9;
                            var10 = dupTemp$9;
                            break L49;
                          }
                          qj dupTemp$10 = new qj(156, var8);
                          bf.field_o = dupTemp$10;
                          var11 = dupTemp$10;
                          qj dupTemp$11 = new qj(156, var8);
                          vl.field_K = dupTemp$11;
                          var12 = dupTemp$11;
                          var13 = var9;
                          var14 = var10;
                          var12.field_r = 467;
                          var15 = var11;
                          var15.field_r = 467;
                          var14.field_r = 467;
                          var13.field_r = 467;
                          var10.field_o = 138;
                          var16 = var9;
                          var16.field_o = 138;
                          var17 = var11;
                          var12.field_o = 178;
                          var17.field_o = 178;
                          var9.a();
                          cl.a(aa.field_a, 0, var8, 0, 156, 4);
                          bk.field_E.b(na.field_d, 78, bk.field_E.field_G, 0, -1);
                          ba.field_b.b(bl.field_d, 78, ba.field_b.field_G + bk.field_E.field_G, 15252224, -1);
                          var10.a();
                          cl.a(aa.field_a, 0, var8, 0, 156, 4);
                          bk.field_E.b(na.field_d, 78, bk.field_E.field_G, 1, -1);
                          ba.field_b.b(bl.field_d, 78, bk.field_E.field_G + ba.field_b.field_G, 15252224, -1);
                          var11.a();
                          cl.a(aa.field_a, 0, var8, 0, 156, 4);
                          bk.field_E.b(ca.field_d, 78, bk.field_E.field_G, 0, -1);
                          ba.field_b.b(th.field_i, 78, ba.field_b.field_G + bk.field_E.field_G, 15252224, -1);
                          var12.a();
                          cl.a(aa.field_a, 0, var8, 0, 156, 4);
                          bk.field_E.b(ca.field_d, 78, bk.field_E.field_G, 1, -1);
                          ba.field_b.b(th.field_i, 78, bk.field_E.field_G - -ba.field_b.field_G, 15252224, -1);
                          ia.field_b.a(-91);
                          sg.field_a = null;
                          qi.d(param0 + -407);
                          return false;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L51: {
                if (!el.field_L.c(111)) {
                  break L51;
                } else {
                  if (!el.field_L.b("basic", (byte) -3)) {
                    break L51;
                  } else {
                    if (el.field_L.b("comic12", (byte) -3)) {
                      if (el.field_L.b("kartika13", (byte) -3)) {
                        if (fb.field_b.b("comic12", (byte) -3)) {
                          if (fb.field_b.b("kartika13", (byte) -3)) {
                            L52: {
                              if (!rl.field_D.c(param0 + -374)) {
                                break L52;
                              } else {
                                if (rl.field_D.a((byte) 48)) {
                                  L53: {
                                    if (ui.a(0, true)) {
                                      L54: {
                                        if (!sg.field_a.c(-115)) {
                                          break L54;
                                        } else {
                                          if (!sg.field_a.b("halloween", (byte) -3)) {
                                            break L54;
                                          } else {
                                            break L53;
                                          }
                                        }
                                      }
                                      ud.a(param0 ^ 339, 11.0f, wf.a("halloween", sa.field_K, gj.field_e, sg.field_a, param0 ^ 479));
                                      return false;
                                    } else {
                                      break L53;
                                    }
                                  }
                                  L55: {
                                    if (!sg.field_a.c(91)) {
                                      break L55;
                                    } else {
                                      if (!sg.field_a.b("", (byte) -3)) {
                                        break L55;
                                      } else {
                                        L56: {
                                          if (!sg.field_a.c(106)) {
                                            break L56;
                                          } else {
                                            if (sg.field_a.b("", (byte) -3)) {
                                              L57: {
                                                if (!si.field_c.c(-109)) {
                                                  break L57;
                                                } else {
                                                  if (si.field_c.a((byte) 48)) {
                                                    L58: {
                                                      if (!j.field_h.c(96)) {
                                                        break L58;
                                                      } else {
                                                        if (!j.field_h.a((byte) 48)) {
                                                          break L58;
                                                        } else {
                                                          L59: {
                                                            if (!wl.field_l.c(121)) {
                                                              break L59;
                                                            } else {
                                                              if (!wl.field_l.a((byte) 48)) {
                                                                break L59;
                                                              } else {
                                                                if (!lh.field_C.c(param0 + -357)) {
                                                                  break L59;
                                                                } else {
                                                                  if (lh.field_C.a((byte) 48)) {
                                                                    L60: {
                                                                      if (!sk.field_j.c(-73)) {
                                                                        break L60;
                                                                      } else {
                                                                        if (sk.field_j.a((byte) 48)) {
                                                                          ud.a(param0 ^ 339, 70.0f, cg.field_d);
                                                                          if (!param1) {
                                                                            return false;
                                                                          } else {
                                                                            L61: {
                                                                              mf.c((byte) 114);
                                                                              ((TrackController) this).a(160);
                                                                              vj.field_a = ab.a("basic", -15383, "unachieved", el.field_L);
                                                                              ei.a(vj.field_a, -1);
                                                                              ii.field_p = ab.a("basic", -15383, "locked", el.field_L);
                                                                              ei.a(ii.field_p, -1);
                                                                              dc.field_p = ab.a("basic", -15383, "orbcoin", el.field_L);
                                                                              var3 = si.field_c.a("", param0 ^ -468, "tcfont");
                                                                              var4_array2 = ie.a("", sg.field_a, "tcfont", param0 + -341);
                                                                              var5_ref_de = ma.a(6488064, (byte) -123, 2, var4_array2, var3, 15252224);
                                                                              bk.field_E = (oh) (Object) var5_ref_de;
                                                                              var6_ref_int__ = var5_ref_de.field_M[0];
                                                                              if (9 <= var5_ref_de.field_M.length) {
                                                                                break L61;
                                                                              } else {
                                                                                var5_ref_de.field_M = new int[9][];
                                                                                break L61;
                                                                              }
                                                                            }
                                                                            var5_ref_de.field_M[0] = var6_ref_int__;
                                                                            var7_int = 1;
                                                                            L62: while (true) {
                                                                              L63: {
                                                                                L64: {
                                                                                  if (var7_int >= 9) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var5_ref_de.field_M[var7_int] = new int[var6_ref_int__.length];
                                                                                    pd.a(var6_ref_int__, 0, var5_ref_de.field_M[var7_int], 0, var6_ref_int__.length);
                                                                                    var7_int++;
                                                                                    if (var18 != 0) {
                                                                                      break L63;
                                                                                    } else {
                                                                                      if (var18 == 0) {
                                                                                        continue L62;
                                                                                      } else {
                                                                                        break L64;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var5_ref_de.field_M[1][1] = 8110658;
                                                                                var5_ref_de.field_M[2][1] = 4473924;
                                                                                var5_ref_de.field_M[2][2] = 12303291;
                                                                                var5_ref_de.field_M[3][1] = 12303291;
                                                                                var5_ref_de.field_M[4][1] = 16711680;
                                                                                var5_ref_de.field_M[5][1] = 16767035;
                                                                                var5_ref_de.field_M[6][1] = 16777215;
                                                                                var5_ref_de.field_M[7][1] = 16711680;
                                                                                var5_ref_de.field_M[8][1] = 15252224;
                                                                                var5_ref_de.field_M[8][2] = 0;
                                                                                ba.field_b = (oh) (Object) uk.a("comic12", el.field_L, fb.field_b, "", 8);
                                                                                re.field_c = (oh) (Object) uk.a("kartika13", el.field_L, fb.field_b, "", -43);
                                                                                el.field_L = null;
                                                                                fb.field_b = null;
                                                                                qi.d(71);
                                                                                break L63;
                                                                              }
                                                                              return false;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          break L60;
                                                                        }
                                                                      }
                                                                    }
                                                                    ud.a(param0 + -339, 65.0f, wf.a("", ob.field_w, wa.field_j, sk.field_j, 4));
                                                                    return false;
                                                                  } else {
                                                                    break L59;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          ud.a(128, 50.0f, mk.a(0, wl.field_l, wa.field_j, ob.field_w, (byte) 117));
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    ud.a(128, 40.0f, wf.a("", fc.field_f, ql.field_q, j.field_h, 23));
                                                    return false;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                              }
                                              ud.a(param0 + -339, 31.0f, wf.a("", fd.field_f, v.field_c, si.field_c, param0 + -394));
                                              return false;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                        ud.a(128, 30.0f, wf.a("", sa.field_K, gj.field_e, sg.field_a, 119));
                                        return false;
                                      }
                                    }
                                  }
                                  ud.a(param0 + -339, 30.0f, wf.a("", sa.field_K, gj.field_e, sg.field_a, 91));
                                  return false;
                                } else {
                                  break L52;
                                }
                              }
                            }
                            ud.a(128, 6.0f, wf.a("", lf.field_W, ei.field_k, rl.field_D, param0 + -413));
                            return false;
                          } else {
                            ud.a(128, 3.0f, wf.a("kartika13", fd.field_f, v.field_c, fb.field_b, 62));
                            return false;
                          }
                        } else {
                          ud.a(param0 ^ 339, 3.0f, wf.a("comic12", fd.field_f, v.field_c, fb.field_b, param0 ^ 399));
                          return false;
                        }
                      } else {
                        ud.a(param0 + -339, 3.0f, wf.a("kartika13", fd.field_f, v.field_c, el.field_L, param0 + -431));
                        return false;
                      }
                    } else {
                      ud.a(128, 3.0f, wf.a("comic12", fd.field_f, v.field_c, el.field_L, 43));
                      return false;
                    }
                  }
                }
              }
              ud.a(128, 2.0f, wf.a("basic", sa.field_K, gj.field_e, el.field_L, param0 ^ 413));
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new ud();
        field_E = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_C = "Continue";
    }
}
