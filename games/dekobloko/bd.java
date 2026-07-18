/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class bd extends hn {
    private boolean field_t;
    private int field_u;
    private int field_v;
    private int field_n;
    private int field_w;
    private int field_q;
    private boolean field_r;
    private int field_o;
    private long field_s;
    String field_m;
    private boolean field_p;

    private final void c() {
        te.field_v[5] = true;
    }

    private final void h(int param0) {
        te.field_v[6] = true;
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            Boolean var10 = null;
            wl var11 = null;
            Throwable decompiledCaughtException = null;
            var9 = client.field_A ? 1 : 0;
            var4 = -3 % ((6 - param1) / 36);
            var5 = ne.a(255, kd.field_p, param0, jk.field_c);
            if (var5 != 0) {
              L0: {
                if (var5 != 1) {
                  break L0;
                } else {
                  L1: {
                    int discarded$14 = -89;
                    int discarded$15 = -117;
                    int discarded$16 = 125;
                    var6_int = sm.a(ge.b(), ob.b());
                    if (-1 != var6_int) {
                      int discarded$17 = -677;
                      qf.a(rk.field_Y, ph.field_Eb, var6_int);
                      rk.field_Y = null;
                      ph.field_Eb = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  int discarded$18 = 24994;
                  var10 = pg.a();
                  if (var10 != null) {
                    pk.a(var10.booleanValue(), false);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var5 == 2) {
                  int discarded$19 = 116;
                  int discarded$20 = 1;
                  var6_int = rd.a(pc.a(2), sm.a((byte) -97), f.a(), aa.a(-48), 0, ((bd) this).field_v, sm.b());
                  if (var6_int != -1) {
                    jc.a(ph.field_Eb, var6_int, rk.field_Y, 0);
                    rk.field_Y = null;
                    ph.field_Eb = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 == var5) {
                  L4: {
                    if (s.field_Pb == -1) {
                      break L4;
                    } else {
                      if (s.field_Pb != 0) {
                        s.field_Pb = -1;
                        sn.c((byte) -115);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param2) {
                    var6_int = sn.a(aa.a(-48), ((bd) this).field_r, pc.a(2), (byte) 55, ((bd) this).field_v, false);
                    if (-1 == var6_int) {
                      break L3;
                    } else {
                      if (var6_int != 0) {
                        dd.a(rk.field_Y, 0, var6_int);
                        rk.field_Y = null;
                        break L3;
                      } else {
                        ua.field_B = sh.field_f;
                        int discarded$21 = 1;
                        n.a();
                        v.field_d = false;
                        hc.field_d = 10;
                        break L3;
                      }
                    }
                  } else {
                    of.field_h = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (var5 == 4) {
                  if (!ce.field_w) {
                    v.field_d = true;
                    hc.field_d = 10;
                    break L5;
                  } else {
                    int discarded$22 = -57;
                    be.a(se.h(25144));
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var5 == 5) {
                  pk.a((byte) -17, se.h(25144));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var5 != 6) {
                  break L7;
                } else {
                  if (!qi.field_M) {
                    break L7;
                  } else {
                    hc.field_d = 10;
                    break L7;
                  }
                }
              }
              L8: {
                if (var5 == 7) {
                  ki.a((byte) 96, se.h(25144));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (8 == var5) {
                  int discarded$23 = -57;
                  be.a(se.h(25144));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (9 != var5) {
                  break L10;
                } else {
                  bh.a(-114, se.h(25144));
                  break L10;
                }
              }
              L11: {
                if (10 != var5) {
                  break L11;
                } else {
                  we.field_b.f(17, -4);
                  break L11;
                }
              }
              L12: {
                if (var5 == 11) {
                  wb.a(se.h(25144), 30307);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var5 != 12) {
                  break L13;
                } else {
                  int discarded$24 = -30185;
                  aj.a(vm.c(), -88, se.h(25144));
                  break L13;
                }
              }
              L14: {
                if (13 == var5) {
                  try {
                    L15: {
                      L16: {
                        if (vg.field_E == null) {
                          vg.field_E = new oh(lf.field_e, new java.net.URL(((bd) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (!vg.field_E.a(-125)) {
                          break L17;
                        } else {
                          L18: {
                            var11 = vg.field_E.a(false);
                            if (var11 != null) {
                              var8 = un.a(var11.field_r, 0, 0, var11.field_n);
                              int discarded$25 = 45;
                              jb.a(var8);
                              break L18;
                            } else {
                              int discarded$26 = 45;
                              jb.a((String) null);
                              break L18;
                            }
                          }
                          vg.field_E = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      qb.a((Throwable) (Object) var6, 16408, "S1");
                      int discarded$27 = 45;
                      jb.a((String) null);
                      vg.field_E = null;
                      break L19;
                    }
                  }
                  break L14;
                } else {
                  break L14;
                }
              }
              L20: {
                if (var5 != 15) {
                  break L20;
                } else {
                  hc.field_d = 10;
                  break L20;
                }
              }
              if (var5 != 16) {
                if (17 != var5) {
                  return 0;
                } else {
                  return 2;
                }
              } else {
                return 1;
              }
            } else {
              throw new IllegalStateException();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void i() {
        String var2 = ui.a(-12040);
        oa.a(se.h(25144), -1, var2);
    }

    final void g(int param0) {
        int var3 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        var3 = client.field_A ? 1 : 0;
        if (param0 != 10) {
          return;
        } else {
          L0: {
            if (t.i((byte) 124)) {
              L1: {
                stackOut_8_0 = this;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (null == cl.field_v) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L1;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L1;
                }
              }
              int discarded$4 = this.a(stackIn_11_1 != 0, -41, false);
              break L0;
            } else {
              if (ca.field_vb < 10) {
                break L0;
              } else {
                int discarded$5 = 480;
                if (!dl.a()) {
                  int discarded$6 = -70;
                  ua.h();
                  break L0;
                } else {
                  if (hc.field_d == 0) {
                    int discarded$7 = this.a(false, -104, false);
                    break L0;
                  } else {
                    ql.a(jk.field_c, (byte) -101);
                    break L0;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void e() {
        te.field_v[13] = true;
        te.field_v[12] = true;
        te.field_v[11] = true;
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_22_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        String stackIn_100_2 = null;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        String stackIn_101_2 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        String stackIn_102_2 = null;
        int stackIn_102_3 = 0;
        int stackIn_129_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        String stackOut_99_2 = null;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        String stackOut_101_2 = null;
        int stackOut_101_3 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        String stackOut_100_2 = null;
        int stackOut_100_3 = 0;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (li.field_b == null) {
            break L0;
          } else {
            L1: {
              if (null == cl.field_v) {
                var6 = wm.f((byte) 126);
                var4 = var6.getSize();
                li.field_b.a(var4.width, false, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            li.field_b.a(false);
            break L0;
          }
        }
        L2: {
          int discarded$15 = 19012;
          wf.b();
          ql.c(-2);
          if (ta.a((byte) -35)) {
            break L2;
          } else {
            if (hc.field_d == 11) {
              break L2;
            } else {
              fh.a(-52);
              break L2;
            }
          }
        }
        L3: {
          if (null == uc.field_e) {
            break L3;
          } else {
            jk.field_c = uc.field_e.a(60);
            break L3;
          }
        }
        L4: {
          int discarded$16 = -12851;
          if (!si.c()) {
            break L4;
          } else {
            L5: {
              var3 = n.a((byte) -74) * 1200;
              if (((bd) this).field_p) {
                break L5;
              } else {
                int discarded$17 = -108;
                if (~var3 <= ~fl.a()) {
                  break L4;
                } else {
                  int discarded$18 = -40;
                  if (~var3 <= ~ne.b()) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((bd) this).field_p = false;
            si.a(79);
            gh.a(false);
            dd.a(am.field_d, param1 ^ -11, 2);
            int discarded$19 = 84;
            jc.b();
            of.field_h = true;
            lb.field_d = ik.a(param1 + 15) + 15000L;
            break L4;
          }
        }
        L6: {
          L7: {
            if (s.field_Pb == -1) {
              break L7;
            } else {
              if (s.field_Pb != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (s.field_Pb != -1) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L8;
            } else {
              stackOut_20_0 = 1;
              stackIn_22_0 = stackOut_20_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_22_0;
            int discarded$20 = 102;
            s.field_Pb = ib.l();
            if (var3 == 0) {
              break L9;
            } else {
              if (s.field_Pb != 0) {
                break L9;
              } else {
                if (hc.field_d != 11) {
                  break L9;
                } else {
                  if (!ea.c((byte) -57)) {
                    int discarded$21 = 1;
                    n.a();
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == s.field_Pb) {
            break L6;
          } else {
            if (s.field_Pb != 0) {
              lb.field_d = ik.a(4) - -15000L;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (s.field_Pb == -1) {
            break L10;
          } else {
            if (s.field_Pb != 0) {
              if (ca.field_vb < 10) {
                if (s.field_Pb == 3) {
                  ((bd) this).a(true, "js5crc");
                  break L10;
                } else {
                  if (4 == s.field_Pb) {
                    ((bd) this).a(true, "js5io");
                    break L10;
                  } else {
                    if (s.field_Pb != 2) {
                      if (s.field_Pb == 5) {
                        ((bd) this).a(true, "outofdate");
                        break L10;
                      } else {
                        ((bd) this).a(true, "js5connect");
                        break L10;
                      }
                    } else {
                      ((bd) this).a(true, "js5connect_full");
                      break L10;
                    }
                  }
                }
              } else {
                if (hc.field_d < 10) {
                  break L10;
                } else {
                  L11: {
                    gh.a(false);
                    if (s.field_Pb == 3) {
                      dd.a(ic.field_d, 0, 256);
                      break L11;
                    } else {
                      if (4 == s.field_Pb) {
                        dd.a(ub.field_f, param1 + 11, 256);
                        break L11;
                      } else {
                        if (2 == s.field_Pb) {
                          dd.a(kb.field_f, 0, 256);
                          break L11;
                        } else {
                          if (s.field_Pb != 5) {
                            dd.a(kf.field_N, 0, 256);
                            break L11;
                          } else {
                            dd.a(ah.field_a, param1 + 11, 5);
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  of.field_h = true;
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (s.field_Pb == -1) {
                break L14;
              } else {
                if (s.field_Pb != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!ea.c((byte) -112)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (~ik.a(4) > ~lb.field_d) {
            break L12;
          } else {
            of.field_h = false;
            if (s.field_Pb == -1) {
              break L12;
            } else {
              if (0 == s.field_Pb) {
                break L12;
              } else {
                s.field_Pb = -1;
                sn.c((byte) -116);
                break L12;
              }
            }
          }
        }
        L15: {
          if (s.field_Pb != 0) {
            break L15;
          } else {
            if (!ea.c((byte) -112)) {
              tf.field_bb = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (ca.field_vb == 0) {
            int discarded$22 = 48;
            if (!nf.c()) {
              break L16;
            } else {
              ca.field_vb = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (ca.field_vb != 1) {
            break L17;
          } else {
            L18: {
              if (0 != kd.field_p) {
                vj.field_a = vg.a(vh.field_d, 34);
                break L18;
              } else {
                break L18;
              }
            }
            sk.field_f = tf.a(1, param1 + 131, false, true, cg.field_a);
            rc.field_k = tf.a(1, 127, false, true, a.field_h);
            ph.field_Fb = tf.a(1, 113, false, true, rf.field_d);
            ah.field_i = sk.field_f;
            ca.field_vb = 2;
            qc.field_vb = rc.field_k;
            break L17;
          }
        }
        L19: {
          if (ca.field_vb != 2) {
            break L19;
          } else {
            L20: {
              if (vj.field_a != null) {
                if (vj.field_a.a((byte) 121)) {
                  if (vj.field_a.a("", param1 ^ -11)) {
                    if (!vj.field_a.a("", (byte) -94)) {
                      break L20;
                    } else {
                      int discarded$23 = 117;
                      ml.a(vj.field_a);
                      vj.field_a = null;
                      vj.a(true);
                      break L20;
                    }
                  } else {
                    vj.field_a = null;
                    break L20;
                  }
                } else {
                  break L20;
                }
              } else {
                break L20;
              }
            }
            if (vj.field_a == null) {
              ca.field_vb = 3;
              break L19;
            } else {
              break L19;
            }
          }
        }
        L21: {
          if (3 != ca.field_vb) {
            break L21;
          } else {
            if (!ta.a(sk.field_f, rc.field_k, -21, ph.field_Fb)) {
              break L21;
            } else {
              int discarded$24 = -2147483648;
              if (!ba.a(ph.field_Fb)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    int discarded$25 = -8621;
                    e.b();
                    nm.h((byte) 112);
                    qi.field_M = false;
                    he.field_hb = wf.field_m;
                    se.a(sk.field_f, ph.field_Fb, (byte) 76, ce.field_w, rc.field_k);
                    if (ge.field_j) {
                      break L23;
                    } else {
                      if (null == vd.field_q) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (ge.field_j) {
                      stackOut_98_0 = 0;
                      stackIn_99_0 = stackOut_98_0;
                      break L24;
                    } else {
                      stackOut_97_0 = 1;
                      stackIn_99_0 = stackOut_97_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_99_0 = stackIn_99_0;
                    stackOut_99_1 = -86;
                    stackOut_99_2 = vd.field_q;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_101_1 = stackOut_99_1;
                    stackIn_101_2 = stackOut_99_2;
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    stackIn_100_2 = stackOut_99_2;
                    if (ge.field_j) {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = stackIn_101_1;
                      stackOut_101_2 = (String) (Object) stackIn_101_2;
                      stackOut_101_3 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      stackIn_102_1 = stackOut_101_1;
                      stackIn_102_2 = stackOut_101_2;
                      stackIn_102_3 = stackOut_101_3;
                      break L25;
                    } else {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = stackIn_100_1;
                      stackOut_100_2 = (String) (Object) stackIn_100_2;
                      stackOut_100_3 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      stackIn_102_2 = stackOut_100_2;
                      stackIn_102_3 = stackOut_100_3;
                      break L25;
                    }
                  }
                  rb.a(stackIn_102_0 != 0, (byte) stackIn_102_1, stackIn_102_2, stackIn_102_3 != 0);
                  break L22;
                }
                L26: {
                  if (!om.field_f) {
                    break L26;
                  } else {
                    rk.c(false);
                    break L26;
                  }
                }
                L27: {
                  if (null != hm.field_c) {
                    break L27;
                  } else {
                    int discarded$26 = 15000;
                    hm.field_c = pk.a();
                    int discarded$27 = 1;
                    ea.field_r = i.a();
                    break L27;
                  }
                }
                int discarded$28 = 20350;
                ed.a(ph.field_Fb, ea.field_r, hm.field_c);
                sk.field_f = null;
                rc.field_k = null;
                ph.field_Fb = null;
                int discarded$29 = 0;
                rd.a((java.applet.Applet) this);
                vj.a(true);
                ca.field_vb = 10;
                break L21;
              }
            }
          }
        }
        L28: {
          if (~ca.field_vb != param1) {
            break L28;
          } else {
            L29: {
              if (0 == kd.field_p) {
                break L29;
              } else {
                wk.field_q = vg.a(gi.field_e, 112);
                break L29;
              }
            }
            ca.field_vb = 11;
            break L28;
          }
        }
        L30: {
          if (ca.field_vb == 11) {
            L31: {
              if (null == wk.field_q) {
                break L31;
              } else {
                L32: {
                  if (!wk.field_q.a((byte) 121)) {
                    break L32;
                  } else {
                    if (!wk.field_q.a(false)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                qi.a(0.0f, -78, ad.a(wk.field_q, fe.field_a, true, eb.field_n));
                break L30;
              }
            }
            ca.field_vb = 12;
            of.field_c = true;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (12 != ca.field_vb) {
            break L33;
          } else {
            if (of.field_c) {
              break L33;
            } else {
              ca.field_vb = 13;
              break L33;
            }
          }
        }
        L34: {
          if (ca.field_vb == 13) {
            L35: {
              var3 = 1;
              if (sh.field_g == null) {
                break L35;
              } else {
                L36: {
                  if (!sh.field_g.a(-57)) {
                    stackOut_128_0 = 0;
                    stackIn_129_0 = stackOut_128_0;
                    break L36;
                  } else {
                    stackOut_127_0 = 1;
                    stackIn_129_0 = stackOut_127_0;
                    break L36;
                  }
                }
                var3 = stackIn_129_0;
                qi.a(sh.field_g.field_l, param1 + 82, sh.field_g.field_a);
                break L35;
              }
            }
            if (var3 == 0) {
              break L34;
            } else {
              ca.field_vb = 20;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param0) {
            break L37;
          } else {
            if (!jg.field_e) {
              break L37;
            } else {
              tj.a(false, jh.field_b);
              ((bd) this).b((byte) -91);
              hl.a(jh.field_b, (byte) -97);
              break L37;
            }
          }
        }
        L38: {
          if (te.field_v[8]) {
            ec.a(param1 + -82);
            break L38;
          } else {
            break L38;
          }
        }
    }

    final int a(boolean param0, byte param1) {
        if (param1 != 102) {
            ((bd) this).field_t = false;
        }
        return this.a(param0, param1 ^ -124, true);
    }

    final void f(byte param0) {
        int var2 = 0;
        hl var3 = null;
        int var4 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        L0: {
          var4 = client.field_A ? 1 : 0;
          if (param0 >= 115) {
            break L0;
          } else {
            ((bd) this).g(-60);
            break L0;
          }
        }
        L1: {
          var2 = bh.field_k;
          if (var2 >= 64) {
            break L1;
          } else {
            if (te.field_v[var2]) {
              if (var2 != 0) {
                L2: {
                  if (var2 != 1) {
                    if (2 != var2) {
                      if (var2 == 3) {
                        int discarded$8 = 69;
                        dk.a();
                        break L2;
                      } else {
                        if (var2 != 4) {
                          if (5 == var2) {
                            int discarded$9 = 14750;
                            pe.b();
                            break L2;
                          } else {
                            if (var2 != 6) {
                              if (7 == var2) {
                                int discarded$10 = 0;
                                this.i();
                                break L2;
                              } else {
                                if (var2 == 8) {
                                  qn.a(sm.field_e, lf.field_e, 4210752, (wl) (Object) de.field_V);
                                  break L2;
                                } else {
                                  if (var2 == 16) {
                                    wm.d(140);
                                    break L2;
                                  } else {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (var2 == 12) {
                                          break L3;
                                        } else {
                                          if (13 != var2) {
                                            if (17 != var2) {
                                              if (var2 == 18) {
                                                int discarded$11 = 27721;
                                                ne.c();
                                                break L2;
                                              } else {
                                                qb.a((Throwable) null, 16408, "MGS1: " + qk.d((byte) 52));
                                                si.a(65);
                                                break L2;
                                              }
                                            } else {
                                              int discarded$12 = -33;
                                              this.l();
                                              break L2;
                                            }
                                          } else {
                                            oe.c(false);
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      stackOut_30_0 = 0;
                                      stackIn_32_0 = stackOut_30_0;
                                      stackIn_31_0 = stackOut_30_0;
                                      if (var2 != 12) {
                                        stackOut_32_0 = stackIn_32_0;
                                        stackOut_32_1 = 0;
                                        stackIn_33_0 = stackOut_32_0;
                                        stackIn_33_1 = stackOut_32_1;
                                        break L4;
                                      } else {
                                        stackOut_31_0 = stackIn_31_0;
                                        stackOut_31_1 = 1;
                                        stackIn_33_0 = stackOut_31_0;
                                        stackIn_33_1 = stackOut_31_1;
                                        break L4;
                                      }
                                    }
                                    var3 = ki.a(stackIn_33_0, stackIn_33_1 != 0);
                                    int discarded$13 = 1;
                                    cl.a(var3);
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              int discarded$14 = 112;
                              ul.a();
                              break L2;
                            }
                          }
                        } else {
                          cm.a((byte) 53);
                          break L2;
                        }
                      }
                    } else {
                      ke.e((byte) 48);
                      break L2;
                    }
                  } else {
                    int discarded$15 = -21;
                    ua.i();
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              break L1;
            }
          }
        }
        qb.a((Throwable) null, 16408, "MGS2: " + qk.d((byte) 127));
        si.a(119);
    }

    private final void h() {
        te.field_v[4] = true;
    }

    final void a(int param0, int param1, String param2) {
        try {
            if (param0 != -2990) {
                ((bd) this).field_m = null;
            }
            this.a(param1, false, 480, 640, param2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "bd.UA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        te.field_v[0] = true;
        te.field_v[17] = true;
        te.field_v[16] = true;
        te.field_v[7] = true;
        te.field_v[8] = true;
        te.field_v[18] = true;
        te.field_v[3] = true;
    }

    private final int j() {
        int var2 = 0;
        if (((bd) this).field_f) {
          return -1;
        } else {
          if (ea.c((byte) -38)) {
            if (of.field_h) {
              return -1;
            } else {
              var2 = sn.a(aa.a(-69), ((bd) this).field_r, pc.a(2), (byte) 55, ((bd) this).field_v, true);
              if (-1 == var2) {
                return -1;
              } else {
                L0: {
                  if (0 == var2) {
                    break L0;
                  } else {
                    if (var2 != 1) {
                      L1: {
                        if (!lf.field_g) {
                          ((bd) this).a(true, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      gh.a(false);
                      dd.a(rk.field_Y, 0, var2);
                      of.field_h = true;
                      lb.field_d = 15000L + ik.a(4);
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (hc.field_d != 11) {
                    break L2;
                  } else {
                    if (s.field_Pb != 0) {
                      break L2;
                    } else {
                      int discarded$2 = 1;
                      n.a();
                      break L2;
                    }
                  }
                }
                return var2;
              }
            }
          } else {
            return -1;
          }
        }
    }

    final static void a() {
        ul.field_g = 20000000L;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        java.awt.Frame var10 = null;
        var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((bd) this).setBackground(java.awt.Color.black);
        if (param1 <= 2) {
          return;
        } else {
          kd.field_p = ((bd) this).field_o;
          lc.a(kd.field_p, true);
          j.a(param2, ((bd) this).field_u, lf.field_e, 5000, 5000, ((bd) this).field_s, kd.field_p, param7, ((bd) this).field_q, ((bd) this).field_w, ((bd) this).field_t, true, ((bd) this).field_n, ((bd) this).field_m);
          ce.a(((bd) this).field_w, ((bd) this).field_u, kd.field_p, param2, ((bd) this).field_n, ((bd) this).field_m, lf.field_e, 0, ((bd) this).field_q);
          int discarded$2 = 120;
          eb.c();
          uc.field_e = t.k(-22);
          hl.a(jh.field_b, (byte) -71);
          gi.field_e = param0;
          a.field_h = param6;
          vh.field_d = param3;
          cg.field_a = param4;
          rf.field_d = param5;
          this.c(true);
          int discarded$3 = 13;
          oh.a();
          return;
        }
    }

    private final void m() {
        te.field_v[1] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        L0: {
          this.a(77, true);
          if (param0) {
            int discarded$10 = -1;
            this.m();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!param2) {
            break L1;
          } else {
            int discarded$11 = 7;
            this.k();
            break L1;
          }
        }
        if (param3) {
          return;
        } else {
          L2: {
            if (param5) {
              int discarded$12 = -25;
              this.h();
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param6) {
              int discarded$13 = 87;
              this.c();
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (!param4) {
              break L4;
            } else {
              this.h(-1);
              break L4;
            }
          }
          L5: {
            if (!param1) {
              break L5;
            } else {
              int discarded$14 = 13;
              this.e();
              break L5;
            }
          }
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, String param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          try {
            L0: {
              if (((bd) this).a((byte) -29)) {
                L1: {
                  L2: {
                    ((bd) this).field_m = ((bd) this).getCodeBase().getHost();
                    var6_ref2 = ((bd) this).field_m.toLowerCase();
                    stackOut_2_0 = this;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
                L3: {
                  ((bd) this).field_r = stackIn_7_1 != 0;
                  ((bd) this).field_n = Integer.parseInt(((bd) this).getParameter("gameport1"));
                  ((bd) this).field_w = Integer.parseInt(((bd) this).getParameter("gameport2"));
                  var7 = ((bd) this).getParameter("servernum");
                  if (var7 == null) {
                    break L3;
                  } else {
                    ((bd) this).field_q = Integer.parseInt(var7);
                    break L3;
                  }
                }
                L4: {
                  ((bd) this).field_u = Integer.parseInt(((bd) this).getParameter("gamecrc"));
                  ((bd) this).field_s = Long.parseLong(((bd) this).getParameter("instanceid"));
                  ((bd) this).field_t = ((bd) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((bd) this).getParameter("lang");
                  if (var8 == null) {
                    break L4;
                  } else {
                    ((bd) this).field_o = Integer.parseInt(var8);
                    break L4;
                  }
                }
                L5: {
                  if (5 <= ((bd) this).field_o) {
                    ((bd) this).field_o = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var9 = ((bd) this).getParameter("affid");
                  if (var9 != null) {
                    ((bd) this).field_v = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                om.field_f = Boolean.valueOf(((bd) this).getParameter("simplemode")).booleanValue();
                ((bd) this).a(param4, 32, param0, true, 480, 640, ((bd) this).field_u);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              qb.a((Throwable) (Object) var6, 16408, (String) null);
              ((bd) this).a(true, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6_ref;
            stackOut_23_1 = new StringBuilder().append("bd.VA(").append(param0).append(',').append(false).append(',').append(480).append(',').append(640).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final static boolean d(byte param0) {
        int var1 = -5 % ((param0 - -47) / 44);
        return true;
    }

    private final void l() {
        int var3 = -105;
        int var2 = de.field_V.d((byte) -124);
        int var4 = (var2 & 1) != 0 ? 1 : 0;
        int var5 = sm.field_e - 1;
        byte[] var6 = new byte[var5];
        de.field_V.a(-67, var6, var5, 0);
        int discarded$0 = 2;
        c.a((byte) 84, qj.a(var6), var4 != 0, se.h(25144));
    }

    private final void k() {
        te.field_v[2] = true;
    }

    final int g(byte param0) {
        int var2 = 0;
        L0: {
          int discarded$8 = -1;
          var2 = this.j();
          if (param0 > 122) {
            break L0;
          } else {
            ((bd) this).field_w = -122;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 == var2) {
              break L2;
            } else {
              if (var2 == 1) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (!te.field_v[1]) {
              break L3;
            } else {
              qn.c(-20494, 2);
              break L3;
            }
          }
          L4: {
            if (te.field_v[2]) {
              dg.a(-111, 3);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!te.field_v[3]) {
              break L5;
            } else {
              of.a(false, 4);
              break L5;
            }
          }
          L6: {
            if (te.field_v[4]) {
              wa.a(3, 5);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!te.field_v[5]) {
              break L7;
            } else {
              bh.a(6, -120);
              break L7;
            }
          }
          L8: {
            if (te.field_v[6]) {
              int discarded$9 = 7;
              int discarded$10 = 640;
              dl.b();
              break L8;
            } else {
              break L8;
            }
          }
          if (te.field_v[8]) {
            int discarded$11 = -112;
            ga.b();
            break L1;
          } else {
            break L1;
          }
        }
        return var2;
    }

    private final void c(boolean param0) {
        mk.field_c[18] = 1;
        mk.field_c[4] = -1;
        mk.field_c[13] = -1;
        mk.field_c[8] = -2;
        mk.field_c[2] = -2;
        mk.field_c[1] = 16;
        mk.field_c[11] = -1;
        mk.field_c[7] = -1;
        mk.field_c[3] = -1;
        mk.field_c[6] = -2;
        mk.field_c[9] = -1;
        mk.field_c[5] = -1;
        mk.field_c[17] = -1;
        mk.field_c[12] = -1;
        mk.field_c[10] = -1;
        mk.field_c[16] = -1;
    }

    protected bd() {
    }

    static {
    }
}
