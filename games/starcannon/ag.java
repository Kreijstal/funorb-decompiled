/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ag extends th {
    String field_u;
    private int field_v;
    private int field_w;
    static String field_k;
    private long field_l;
    private int field_n;
    private int field_q;
    private int field_p;
    private boolean field_r;
    private boolean field_s;
    private boolean field_t;
    private int field_x;
    static o field_m;
    static int field_o;

    final int h(byte param0) {
        int var2;
        var2 = this.m(125);
        if (param0 != 58) {
          return -33;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (el.field_D[1]) {
            ti.a(57, 2);
          }
          if (el.field_D[2]) {
            ce.a(3, param0 - 106);
          }
          if (el.field_D[3]) {
            gh.a((byte) -89, 4);
          }
          if (el.field_D[4]) {
            fh.a(5, 8100);
          }
          if (el.field_D[5]) {
            nd.b(6, (byte) -66);
          }
          if (el.field_D[6]) {
            kh.a(param0 ^ -1101, 7);
          }
          if (el.field_D[8]) {
            sd.a((byte) 38);
          }
        }
        return var2;
    }

    final static boolean a(int param0, int param1) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (param1 <= se.field_p.field_g) {
            return true;
          }
          if (m.field_b == null) {
            return false;
          }
          try {
            var2_int = m.field_b.c(118);
            if (param0 <= 122) {
              field_o = 68;
            }
            if (var2_int > 0) {
              if (var2_int > -se.field_p.field_g + param1) {
                var2_int = -se.field_p.field_g + param1;
              }
              m.field_b.a(se.field_p.field_g, 32498, var2_int, se.field_p.field_f);
              ik.field_p = dd.b(115);
              se.field_p.field_g = se.field_p.field_g + var2_int;
              if (param1 > se.field_p.field_g) {
                return false;
              }
              se.field_p.field_g = 0;
              return true;
            }
            if (var2_int >= 0 &&
              kg.b((byte) -71) <= 30000L) {
              return false;
            }
            ec.a((byte) 27);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            ec.a((byte) 27);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void j(byte param0) {
        field_k = null;
        if (param0 != 39) {
          field_k = (String) null;
        }
        field_m = null;
    }

    private final void g(int param0) {
        s.field_k[5] = -1;
        s.field_k[10] = -1;
        s.field_k[1] = 16;
        s.field_k[8] = -2;
        s.field_k[9] = -1;
        s.field_k[6] = -2;
        s.field_k[11] = -1;
        s.field_k[12] = -1;
        s.field_k[18] = 1;
        s.field_k[16] = -1;
        s.field_k[3] = -1;
        s.field_k[13] = -1;
        s.field_k[7] = -1;
        if (param0 < -14) {
          s.field_k[2] = -2;
          s.field_k[17] = -1;
          s.field_k[4] = -1;
          return;
        }
    }

    final static void a(boolean param0, String param1, int param2, java.applet.Applet param3) {
        try {
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (ka.field_r.startsWith("win") &&
              sj.a(param1, (byte) -54)) {
              return;
            }
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
              if (param2 != 64) {
                ag.h(-67);
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              hc.a((Throwable) null, "MGR1: " + param1, (byte) 94);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4_ref;
            stackIn_10_1 = new StringBuilder().append("ag.FB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(byte param0) {
        int var2 = 24 / ((param0 - 58) / 42);
        String var3 = rf.c(1);
        hi.a(0, var3, ll.b(110));
    }

    private final static boolean h(int param0) {
        if (param0 != -28050) {
          return false;
        }
        return bl.field_b.a(-6);
    }

    final void a(boolean param0) {
        int stackIn_30_0 = 0;
        boolean stackIn_31_1 = false;
        int var2;
        fb var3;
        int var4;
        var4 = StarCannon.field_A;
        var2 = vh.field_t;
        if (64 > var2 &&
          el.field_D[var2]) {
          if (!param0) {
            return;
          }
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            ef.b((byte) -57);
          } else {
            if (var2 != 2) {
              if (var2 == 3) {
                vk.f(-96);
              } else {
                if (var2 == 4) {
                  wa.b((byte) -101);
                } else {
                  if (var2 == 5) {
                    ea.b((byte) -107);
                  } else {
                    if (var2 == 6) {
                      cb.a((byte) -104);
                    } else {
                      if (var2 != 7) {
                        if (8 != var2) {
                          if (var2 == 16) {
                            ri.b(12000);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                vk.f((byte) 78);
                                return;
                              }
                              if (17 == var2) {
                                this.i((byte) 74);
                                return;
                              }
                              if (var2 == 18) {
                                ca.f(0);
                                return;
                              }
                              hc.a((Throwable) null, "MGS1: " + oe.a(46), (byte) 108);
                              ec.a((byte) 27);
                              return;
                            }
                            stackIn_30_0 = 13607;
                            stackIn_31_1 = (var2 == 12);
                            var3 = pb.a(stackIn_30_0, stackIn_31_1);
                            qc.a(var3, (byte) -89);
                          }
                        } else {
                          wk.a(il.field_g, se.field_p, nb.field_e, false);
                        }
                      } else {
                        this.g((byte) -47);
                      }
                    }
                  }
                }
              }
            } else {
              ak.a(70);
            }
          }
          return;
        }
        hc.a((Throwable) null, "MGS2: " + oe.a(-62), (byte) 84);
        ec.a((byte) 27);
    }

    final void b(boolean param0, int param1) {
        int stackIn_23_0 = 0;
        String stackIn_104_0 = null;
        boolean stackIn_105_1 = false;
        int stackIn_107_2 = 0;
        boolean stackIn_108_3;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = StarCannon.field_A;
        if (null != kd.field_B) {
          if (null == n.field_a) {
            var6 = wi.a((byte) 120);
            var4 = var6.getSize();
            kd.field_B.a(118, var4.width, var4.height);
          }
          kd.field_B.b((byte) 44);
        }
        bi.a(119);
        gf.a(true);
        if (!le.c(param1 + 5) &&
          bl.field_a != 11) {
          ce.a((byte) -100);
        }
        if (qj.field_eb != null) {
          lh.field_I = qj.field_eb.a((byte) -107);
        }
        if (fc.a((byte) 57)) {
          var3 = 1200 * wc.a(-75);
          if (this.field_t ||
            !(var3 >= ck.b((byte) -33)) &&
            !(var3 >= oj.a(-79))) {
            this.field_t = false;
            ec.a((byte) 27);
            ob.a(-121);
            pd.a(sc.field_e, 2, (byte) -77);
            jc.b(0);
            fi.field_h = true;
            wa.field_a = 15000L + dd.b(56);
          }
        }
        if (qb.field_j == -1 ||
          qb.field_j == 0) {
          stackIn_23_0 = (qb.field_j != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          qb.field_j = bf.e(~param1);
          if (var3Lifetime1 != 0 &&
            qb.field_j == 0 &&
            11 == bl.field_a &&
            !se.b((byte) -91)) {
            w.b((byte) 14);
          }
          if (-1 != qb.field_j &&
            qb.field_j != 0) {
            wa.field_a = 15000L + dd.b(105);
          }
        }
        if (qb.field_j != param1 &&
          0 != qb.field_j) {
          if (rk.field_d < 10) {
            if (qb.field_j != 3) {
              if (qb.field_j != 4) {
                if (qb.field_j == 2) {
                  this.a("js5connect_full", false);
                } else {
                  if (qb.field_j != 5) {
                    this.a("js5connect", false);
                  } else {
                    this.a("outofdate", false);
                  }
                }
              } else {
                this.a("js5io", false);
              }
            } else {
              this.a("js5crc", false);
            }
          } else {
            if (bl.field_a >= 10) {
              ob.a(-107);
              if (qb.field_j == 3) {
                pd.a(ob.field_g, 256, (byte) -77);
              } else {
                if (4 == qb.field_j) {
                  pd.a(d.field_m, 256, (byte) -77);
                } else {
                  if (qb.field_j == 2) {
                    pd.a(lj.field_d, 256, (byte) -77);
                  } else {
                    if (qb.field_j == 5) {
                      pd.a(mi.field_n, 5, (byte) -77);
                    } else {
                      pd.a(rh.field_g, 256, (byte) -77);
                    }
                  }
                }
              }
              fi.field_h = true;
            }
          }
        }
        if ((qb.field_j != -1 &&
          qb.field_j != 0 ||
          se.b((byte) -91)) &&
          dd.b(param1 ^ -59) >= wa.field_a) {
          fi.field_h = false;
          if (qb.field_j != -1 &&
            qb.field_j != 0) {
            qb.field_j = -1;
            lj.a(-30294);
          }
        }
        if (0 == qb.field_j &&
          !se.b((byte) -91)) {
          kb.field_a = false;
        }
        if (rk.field_d == 0 &&
          ag.h(-28050)) {
          rk.field_d = 1;
        }
        if (rk.field_d == 1) {
          if (vg.field_b != 0) {
            kl.field_b = b.a(false, rf.field_c);
          }
          bf.field_y = sb.a(1, true, false, r.field_a, (byte) 104);
          fk.field_k = sb.a(1, true, false, ob.field_j, (byte) 104);
          li.field_b = sb.a(1, true, false, p.field_c, (byte) 103);
          fi.field_f = bf.field_y;
          rk.field_d = 2;
          lf.field_eb = fk.field_k;
        }
        if (rk.field_d == 2) {
          if (kl.field_b != null &&
            kl.field_b.b((byte) 95)) {
            if (kl.field_b.a(-20955, "")) {
              if (kl.field_b.a("", param1 ^ 9882)) {
                eh.a((byte) 63, kl.field_b);
                kl.field_b = null;
                tc.j(32);
              }
            } else {
              kl.field_b = null;
            }
          }
          if (null == kl.field_b) {
            rk.field_d = 3;
          }
        }
        if (rk.field_d == 3 &&
          kb.a(li.field_b, fk.field_k, (byte) 107, bf.field_y) &&
          pa.a(li.field_b, -206)) {
          eg.b((byte) -64);
          jg.e((byte) 109);
          o.field_b = pa.field_J;
          sh.field_t = false;
          StarCannon.a(li.field_b, ah.field_i, -20169, bf.field_y, fk.field_k);
          if (vj.field_X ||
            qb.field_g != null) {
            stackIn_104_0 = qb.field_g;
            stackIn_105_1 = !(vj.field_X);
            stackIn_107_2 = 0;
            stackIn_108_3 = !(vj.field_X);
            ae.a(stackIn_104_0, stackIn_105_1, stackIn_107_2, stackIn_108_3);
          }
          if (cc.field_l) {
            pk.a((byte) -64);
          }
          if (uh.field_l == null) {
            uh.field_l = rd.d(param1 - 60);
            j.field_e = ui.a(true);
          }
          kg.a(uh.field_l, param1 + 1, j.field_e, li.field_b);
          bf.field_y = null;
          li.field_b = null;
          fk.field_k = null;
          rb.a((java.applet.Applet) (this), 65);
          tc.j(param1 ^ -33);
          rk.field_d = 10;
        }
        if (10 == rk.field_d) {
          if (vg.field_b != 0) {
            fb.field_g = b.a(false, a.field_d);
          }
          rk.field_d = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (rk.field_d == 11) {
          if (null != fb.field_g && (!fb.field_g.b((byte) 101) ||
            !fb.field_g.a(param1 + 29742))) {
            ma.a(lb.a(fb.field_g, b.field_e, lb.field_L, (byte) -116), param1 ^ 13922, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            rk.field_d = 12;
            fa.field_E = true;
          }
        }
        if (rk.field_d == 12 &&
          !fa.field_E) {
          rk.field_d = 13;
        }
        if (rk.field_d == 13) {
          var3Lifetime2 = 1;
          if (null != lb.field_t) {
            stackIn_138_0 = (!lb.field_t.a((byte) 15)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            ma.a(lb.field_t.field_h, -13923, lb.field_t.field_i);
          }
          if (var3Lifetime2 != 0) {
            rk.field_d = 20;
          }
        }
        if (!param0 &&
          jj.field_E) {
          wf.a(kj.field_E, false);
          this.e(-128);
          mf.a(true, kj.field_E);
        }
        if (el.field_D[8]) {
          fb.a((byte) 10);
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 != 17) {
          this.field_p = 0;
        }
        return this.a(param0 ^ 26, true, param1);
    }

    private final void e(byte param0) {
        el.field_D[1] = true;
        if (param0 != -6) {
          this.f((byte) 11);
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        vg.field_b = this.field_n;
        jh.a(vg.field_b, param4);
        le.a(this.field_u, vg.field_b, 5000, nb.field_e, param6, 22692, this.field_l, this.field_s, this.field_w, this.field_v, this.field_p, 5000, param0, this.field_q);
        hj.a(vg.field_b, this.field_p, nb.field_e, this.field_q, 78, this.field_w, param0, this.field_u, this.field_v);
        ge.b(4039);
        qj.field_eb = wc.b(5220);
        mf.a(true, kj.field_E);
        rf.field_c = param7;
        p.field_c = param1;
        a.field_d = param3;
        r.field_a = param2;
        ob.field_j = param5;
        this.g(-102);
        ng.k(126);
    }

    private final void j(int param0) {
        int discarded$0 = 0;
        el.field_D[2] = true;
        if (param0 != -1) {
          discarded$0 = this.m(-8);
        }
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          String var8 = null;
          Boolean var9 = null;
          rb var10 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var4 = fa.a(lh.field_I, param2, vg.field_b, (byte) 121);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5_int = ok.a((byte) -49, tg.d((byte) 10), ig.b(-1006263007));
            if (var5_int != -1) {
              ie.a(-111, uj.field_r, ph.field_nb, var5_int);
              uj.field_r = null;
              ph.field_nb = null;
            }
            var9 = kk.c((byte) 95);
            if (var9 != null) {
              sb.a(var9.booleanValue(), (byte) 122);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = fi.a(kk.b((byte) 123), this.field_x, ff.g(111), hc.a((byte) 96), dg.b((byte) -18), we.a(29084), (byte) -3);
            if (var5_intLifetime1 != -1) {
              qa.a(var5_intLifetime1, ph.field_nb, uj.field_r, (byte) 70);
              ph.field_nb = null;
              uj.field_r = null;
            }
          }
          if (var4 == 3) {
            if (qb.field_j != -1 &&
              qb.field_j != 0) {
              qb.field_j = -1;
              lj.a(-30294);
            }
            if (param1) {
              fi.field_h = false;
            } else {
              var5_intLifetime2 = qc.a(hc.a((byte) 117), this.field_r, this.field_x, false, -1, ff.g(9));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  pd.a(uj.field_r, var5_intLifetime2, (byte) -77);
                  uj.field_r = null;
                } else {
                  ne.field_j = cb.field_a;
                  w.b((byte) 14);
                  bl.field_a = 10;
                  ai.field_c = false;
                }
              }
            }
          }
          if (var4 == 4) {
            if (ah.field_i) {
              ij.a(18065, ll.b(105));
            } else {
              ai.field_c = true;
              bl.field_a = 10;
            }
          }
          if (var4 == 5) {
            nh.a(ll.b(91), 337033697);
          }
          if (6 == var4 &&
            sh.field_t) {
            bl.field_a = 10;
          }
          if (7 == var4) {
            vk.b(ll.b(param0 ^ 80), 32);
          }
          if (var4 == 8) {
            ij.a(18065, ll.b(104));
          }
          if (9 == var4) {
            pa.b(ll.b(99), param0 ^ -31162);
          }
          if (var4 == 10) {
            d.field_b.d((byte) 73, 17);
          }
          if (param0 == var4) {
            wj.a(ll.b(86), 0);
          }
          if (12 == var4) {
            ef.a(uc.c((byte) 114), ll.b(115), param0 + 91);
          }
          if (var4 == 13) {
            try {
              if (null == qa.field_b) {
                qa.field_b = new gg(nb.field_e, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (qa.field_b.c((byte) -127)) {
                var10 = qa.field_b.a((byte) 60);
                if (var10 != null) {
                  var7 = va.a(0, 107, var10.field_f, var10.field_g);
                  ci.a(var7, param0 - 11);
                } else {
                  var8 = (String) null;
                  ci.a((String) null, 0);
                }
                qa.field_b = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              hc.a((Throwable) ((Object) var5), "S1", (byte) 111);
              ci.a((String) null, param0 - 11);
              qa.field_b = null;
            }
          }
          if (var4 == 15) {
            bl.field_a = 10;
          }
          if (16 == var4) {
            return 1;
          }
          if (17 == var4) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void k(int param0) {
        kg.a((String) null, "", (byte) 92);
        if (param0 != -1108) {
          ag.k(-89);
        }
    }

    private final void i(int param0) {
        int var2 = 28 % ((param0 + 8) / 35);
        el.field_D[4] = true;
    }

    final void f(byte param0) {
        int discarded$33 = 0;
        int discarded$34 = 0;
        int var3;
        int stackIn_9_1 = 0;
        boolean stackIn_9_2 = false;
        Object stackIn_10_0;
        boolean stackIn_10_3;
        var3 = StarCannon.field_A;
        if (ai.a((byte) -21)) {
          stackIn_9_1 = 11;
          stackIn_9_2 = false;
          if (n.field_a == null) {
            stackIn_10_0 = this;
            stackIn_10_3 = false;
          } else {
            stackIn_10_0 = this;
            stackIn_10_3 = true;
          }
          discarded$33 = this.a(stackIn_9_1, stackIn_9_2, stackIn_10_3);
        } else {
          if (rk.field_d >= 10) {
            if (!m.a(-35)) {
              uc.d(1);
            } else {
              if (bl.field_a != 0) {
                ne.b(lh.field_I, 150);
              } else {
                discarded$34 = this.a(11, false, false);
              }
            }
          }
        }
        if (param0 > -20) {
          this.g(66);
        }
    }

    private final void a(boolean param0, int param1) {
        el.field_D[16] = true;
        el.field_D[7] = true;
        el.field_D[18] = true;
        el.field_D[8] = param0;
        el.field_D[17] = true;
        el.field_D[3] = true;
        el.field_D[param1] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a(false, 0);
        if (param0) {
          this.e((byte) -6);
        }
        if (param3) {
          this.j(-1);
        }
        if (param1) {
          this.i(-57);
        }
        if (param4 == -752) {
          if (param2) {
            this.l(98);
          }
          return;
        }
    }

    final void a(int param0, int param1, String param2) {
        if (param0 != -15028) {
          return;
        }
        try {
          this.a(param1, param2, 480, 640, (byte) -25);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ag.IA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final int m(int param0) {
        int var2;
        int var3;
        if (this.field_b) {
          return -1;
        }
        if (!se.b((byte) -91)) {
          return -1;
        }
        if (fi.field_h) {
          return -1;
        }
        var2 = qc.a(hc.a((byte) 108), this.field_r, this.field_x, true, -1, ff.g(114));
        if (var2 == -1) {
          return -1;
        }
        if (0 != var2 &&
          1 != var2) {
          if (!hd.field_p) {
            this.a("reconnect", false);
          }
          ob.a(-88);
          var3 = 77 / ((param0 - 63) / 62);
          pd.a(uj.field_r, var2, (byte) -77);
          fi.field_h = true;
          wa.field_a = dd.b(103) + 15000L;
          return var2;
        }
        if (bl.field_a == 11 &&
          qb.field_j == 0) {
          w.b((byte) 14);
        }
        return var2;
    }

    private final void i(byte param0) {
        int var2 = se.field_p.j(7909);
        if (param0 < 20) {
          this.a(true, -88);
        }
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = il.field_g - 1;
        byte[] var5 = new byte[var4];
        se.field_p.b(var4, (byte) -54, var5, 0);
        ag.a(var3 != 0, uh.a(127, var5), 64, ll.b(126));
    }

    private final void a(int param0, String param1, int param2, int param3, byte param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          try {
            if (!this.d(57)) {
              return;
            }
            this.field_u = this.getCodeBase().getHost();
            var6 = this.field_u.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_r = stackIn_7_1;
            this.field_v = Integer.parseInt(this.getParameter("gameport1"));
            this.field_q = Integer.parseInt(this.getParameter("gameport2"));
            if (param4 != -25) {
              this.field_n = 113;
            }
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_p = Integer.parseInt(var7);
            }
            this.field_w = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_l = Long.parseLong(this.getParameter("instanceid"));
            this.field_s = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_n = Integer.parseInt(var8);
            }
            if (this.field_n >= 5) {
              this.field_n = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_x = Integer.parseInt(var9);
            }
            cc.field_l = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a((byte) 126, param1, this.field_w, 32, param2, param3, param0);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            hc.a((Throwable) ((Object) var6_ref), (String) null, (byte) 100);
            this.a("crash", false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("ag.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    protected ag() {
    }

    private final void l(int param0) {
        el.field_D[5] = true;
        if (param0 <= 97) {
          this.field_q = -96;
        }
    }

    static {
        field_k = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_m = new o(1, 2, 2, 0);
    }
}
