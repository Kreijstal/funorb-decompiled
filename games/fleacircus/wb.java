/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb extends cd {
    private boolean field_s;
    String field_n;
    private long field_x;
    private int field_p;
    private int field_l;
    static int field_y;
    private int field_m;
    private int field_r;
    static ed field_q;
    private int field_u;
    private int field_k;
    static byte[][] field_t;
    private boolean field_o;
    static String field_w;
    private boolean field_v;

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        lc.field_r = 0;
        jj.field_M = null;
        nj.field_a = null;
        var2 = il.field_g;
        il.field_g = pg.field_c;
        if (param1 != 5) {
          field_w = (String) null;
        }
        td.field_k.field_c = td.field_k.field_c + 1;
        if (51 == param0) {
          td.field_k.field_b = 2;
        } else {
          if (param0 == 50) {
            td.field_k.field_b = 5;
          } else {
            td.field_k.field_b = 1;
          }
        }
        pg.field_c = var2;
        if (td.field_k.field_c >= 2 &&
          param0 == 51) {
          return 2;
        }
        if (td.field_k.field_c >= 2 &&
          param0 == 50) {
          return 5;
        }
        if (td.field_k.field_c < 4) {
          return -1;
        }
        return 1;
    }

    final void a(int param0, int param1, String param2) {
        try {
          if (param1 != 8) {
            this.field_n = (String) null;
          }
          this.a(480, param0, false, param2, 640);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "wb.TA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(boolean param0, byte param1) {
        int stackIn_26_0 = 0;
        boolean stackIn_100_0 = false;
        boolean stackIn_103_1 = false;
        int stackIn_134_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = fleas.field_A ? 1 : 0;
        if (null != aa.field_r) {
          if (rh.field_p == null) {
            var6 = sk.a((byte) 60);
            var4 = var6.getSize();
            aa.field_r.a(var4.width, 0, var4.height);
          }
          aa.field_r.a((byte) -37);
        }
        if (param1 <= 12) {
          this.field_n = (String) null;
        }
        sc.a(-1);
        aj.g(28003);
        if (!mc.b((byte) -112) &&
          bh.field_t != 11) {
          ah.a(-1);
        }
        if (ui.field_pb != null) {
          al.field_f = ui.field_pb.b(0);
        }
        if (qh.j(32391)) {
          var3 = bm.f((byte) 85) * 1200;
          if (this.field_v ||
            !(var3 >= td.a(true)) &&
            !(vg.c(-127) <= var3)) {
            this.field_v = false;
            k.c(-28354);
            id.a(false);
            rl.a(wi.field_m, 2, 109);
            ji.a((byte) -69);
            rj.field_j = true;
            ua.field_sb = lj.a((byte) -95) + 15000L;
          }
        }
        if (oa.field_j == -1 ||
          oa.field_j == 0) {
          stackIn_26_0 = (oa.field_j != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          oa.field_j = ld.a(82);
          if (var3Lifetime1 != 0 &&
            oa.field_j == 0 &&
            bh.field_t == 11 &&
            !lk.i(10)) {
            ii.a((byte) -88);
          }
          if (oa.field_j != -1 &&
            oa.field_j != 0) {
            ua.field_sb = 15000L + lj.a((byte) -125);
          }
        }
        if (-1 != oa.field_j &&
          oa.field_j != 0) {
          if (ib.field_k >= 10) {
            if (bh.field_t >= 10) {
              id.a(false);
              if (3 != oa.field_j) {
                if (oa.field_j != 4) {
                  if (oa.field_j != 2) {
                    if (oa.field_j == 5) {
                      rl.a(r.field_j, 5, 91);
                    } else {
                      rl.a(ri.field_r, 256, 102);
                    }
                  } else {
                    rl.a(w.field_j, 256, 109);
                  }
                } else {
                  rl.a(oc.field_b, 256, 104);
                }
              } else {
                rl.a(li.field_c, 256, 102);
              }
              rj.field_j = true;
            }
          } else {
            if (oa.field_j != 3) {
              if (oa.field_j == 4) {
                this.a(-6469, "js5io");
              } else {
                if (oa.field_j != 2) {
                  if (oa.field_j == 5) {
                    this.a(-6469, "outofdate");
                  } else {
                    this.a(-6469, "js5connect");
                  }
                } else {
                  this.a(-6469, "js5connect_full");
                }
              }
            } else {
              this.a(-6469, "js5crc");
            }
          }
        }
        if ((oa.field_j != -1 &&
          oa.field_j != 0 ||
          lk.i(10)) &&
          ua.field_sb <= lj.a((byte) -47)) {
          rj.field_j = false;
          if (oa.field_j != -1 &&
            oa.field_j != 0) {
            oa.field_j = -1;
            vh.a(0);
          }
        }
        if (0 == oa.field_j &&
          !lk.i(10)) {
          rj.field_m = false;
        }
        if (ib.field_k == 0 &&
          gd.a((byte) 70)) {
          ib.field_k = 1;
        }
        if (ib.field_k == 1) {
          if (cg.field_y != 0) {
            il.field_a = q.a(8192, df.field_a);
          }
          rl.field_d = uh.a(1, 26, false, true, ki.field_d);
          oa.field_l = uh.a(1, 26, false, true, bm.field_M);
          kc.field_d = uh.a(1, 26, false, true, lh.field_f);
          pf.field_b = oa.field_l;
          ib.field_k = 2;
          a.field_a = rl.field_d;
        }
        if (ib.field_k == 2) {
          if (il.field_a != null &&
            il.field_a.b((byte) -109)) {
            if (!il.field_a.b("", 37)) {
              il.field_a = null;
            } else {
              if (il.field_a.a("", -123)) {
                je.a(il.field_a, -30);
                il.field_a = null;
                fleas.h((byte) 76);
              }
            }
          }
          if (null == il.field_a) {
            ib.field_k = 3;
          }
        }
        if (ib.field_k == 3 &&
          pl.a(rl.field_d, oa.field_l, kc.field_d, true) &&
          rl.a(kc.field_d, 0)) {
          l.a((byte) -56);
          sd.a((byte) -63);
          qj.field_I = jg.field_a;
          tb.field_c = false;
          oh.a(kc.field_d, oa.field_l, va.field_m, (byte) 28, rl.field_d);
          if (of.field_i ||
            null != hc.field_d) {
            stackIn_100_0 = !(of.field_i);
            stackIn_103_1 = !(of.field_i);
            fl.a(stackIn_100_0, stackIn_103_1, hc.field_d, -22175);
          }
          if (tg.field_j) {
            ak.a(38);
          }
          if (null == td.field_g) {
            td.field_g = wc.a((byte) -95);
            u.field_a = rk.e(24089);
          }
          kb.a(-1, td.field_g, kc.field_d, u.field_a);
          rl.field_d = null;
          oa.field_l = null;
          kc.field_d = null;
          bh.a(false, (java.applet.Applet) (this));
          fleas.h((byte) -127);
          ib.field_k = 10;
        }
        if (10 == ib.field_k) {
          if (cg.field_y != 0) {
            ne.field_a = q.a(8192, ll.field_s);
          }
          ib.field_k = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (ib.field_k == 11) {
          if (null != ne.field_a && (!ne.field_a.b((byte) -113) ||
            !ne.field_a.a(-18))) {
            jj.a(0.0f, cb.a(sg.field_a, mk.field_a, ne.field_a, (byte) 13), true);
            decompiledFrameRemainder0 = false;
          }
          else {
            d.field_Q = true;
            ib.field_k = 12;
          }
        }
        if (ib.field_k == 12 &&
          !d.field_Q) {
          ib.field_k = 13;
        }
        if (ib.field_k == 13) {
          var3Lifetime2 = 1;
          if (fc.field_c != null) {
            stackIn_134_0 = (!fc.field_c.c(0)) ? 0 : 1;
            var3Lifetime2 = stackIn_134_0;
            jj.a(fc.field_c.field_k, fc.field_c.field_f, true);
          }
          if (var3Lifetime2 != 0) {
            ib.field_k = 20;
          }
        }
        if (!param0 &&
          h.field_h) {
          lh.a((byte) -69, ol.field_e);
          this.c(122);
          aj.a(0, ol.field_e);
        }
        if (ui.field_mb[8]) {
          bj.e((byte) -41);
        }
    }

    private final int h(int param0) {
        int var2;
        String var3;
        if (this.field_i) {
          return -1;
        }
        if (!lk.i(10)) {
          return -1;
        }
        if (param0 != 5000) {
          var3 = (String) null;
          this.a(102, 69, (String) null);
        }
        if (rj.field_j) {
          return -1;
        }
        var2 = rb.a(this.field_s, lc.f(0), true, vi.b((byte) -55), this.field_k, -107);
        if (-1 == var2) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!lj.field_e) {
            this.a(-6469, "reconnect");
          }
          id.a(false);
          rl.a(fh.field_a, var2, param0 ^ 5115);
          rj.field_j = true;
          ua.field_sb = lj.a((byte) -53) + 15000L;
          return var2;
        }
        if (11 == bh.field_t &&
          0 == oa.field_j) {
          ii.a((byte) -88);
        }
        return var2;
    }

    private final void j(int param0) {
        ne.field_b[10] = -1;
        ne.field_b[7] = -1;
        ne.field_b[3] = -1;
        ne.field_b[13] = -1;
        ne.field_b[2] = -2;
        ne.field_b[9] = -1;
        ne.field_b[11] = -1;
        ne.field_b[4] = -1;
        ne.field_b[17] = -1;
        ne.field_b[6] = -2;
        ne.field_b[1] = 16;
        if (param0 <= 52) {
          field_q = (ed) null;
        }
        ne.field_b[18] = 1;
        ne.field_b[8] = -2;
        ne.field_b[12] = -1;
        ne.field_b[5] = -1;
        ne.field_b[16] = -1;
    }

    final void g(int param0) {
        boolean stackIn_30_0 = false;
        int var2;
        sg var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        var2 = be.field_a;
        if (param0 != -12) {
          this.a(false, -14);
        }
        if (var2 < 64 &&
          ui.field_mb[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            gf.a(-45);
          } else {
            if (var2 != 2) {
              if (3 == var2) {
                cl.a((byte) -36);
              } else {
                if (var2 == 4) {
                  se.a(param0 ^ 120);
                } else {
                  if (5 == var2) {
                    q.a(true);
                  } else {
                    if (var2 == 6) {
                      pj.e((byte) 117);
                    } else {
                      if (var2 == 7) {
                        this.k(924);
                      } else {
                        if (8 == var2) {
                          kf.a(ae.field_a, -3, pd.field_l, fg.field_q);
                        } else {
                          if (16 != var2) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                ib.b(-118);
                                return;
                              }
                              if (var2 == 17) {
                                this.e((byte) -70);
                                return;
                              }
                              if (var2 == 18) {
                                ha.a(-17288);
                                return;
                              }
                              ud.a("MGS1: " + ak.a(true), (Throwable) null, 0);
                              k.c(-28354);
                              return;
                            }
                            stackIn_30_0 = (12 == var2);
                            var3 = sg.a(stackIn_30_0, param0 ^ -113);
                            lg.a(var3, param0 + 12);
                          } else {
                            pi.c((byte) 15);
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              bd.o(param0 - 24009);
            }
          }
          return;
        }
        ud.a("MGS2: " + ak.a(true), (Throwable) null, 0);
        k.c(-28354);
    }

    final void f(byte param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var3;
        boolean stackIn_4_1 = false;
        int var2;
        var3 = fleas.field_A ? 1 : 0;
        if (!nl.a(-118)) {
          if (ib.field_k >= 10) {
            if (!wh.b(27415)) {
              lk.a((byte) 35);
            } else {
              if (0 == bh.field_t) {
                discarded$6 = this.a(false, 0, false);
              } else {
                te.b(0, al.field_f);
              }
            }
          }
        } else {
          stackIn_4_1 = (rh.field_p != null);
          discarded$7 = this.a(stackIn_4_1, 0, false);
        }
        var2 = 114 / ((-58 - param0) / 63);
    }

    private final void k(int param0) {
        if (param0 != 924) {
          field_w = (String) null;
        }
        String var2 = ta.f(-15040);
        cb.a(50, var2, rl.a((byte) -99));
    }

    private final void e(byte param0) {
        if (param0 != -70) {
          this.field_v = false;
        }
        int var2 = ae.field_a.e(false);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + pd.field_l;
        byte[] var5 = new byte[var4];
        ae.field_a.a(111, var4, 0, var5);
        me.a(rl.a((byte) -116), param0 ^ 110, ab.a(0, var5), var3 != 0);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a(false, -126);
        if (param1) {
          this.c((byte) -114);
        }
        if (param3) {
          this.d((byte) -68);
        }
        if (param4 > -24) {
          this.d((byte) -119);
        }
        if (param2) {
          this.e(91);
        }
        if (param0) {
          this.f(12405);
        }
    }

    private final void a(int param0, int param1, boolean param2, String param3, int param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
            if (!this.b(true)) {
              return;
            }
            this.field_n = this.getCodeBase().getHost();
            var6 = this.field_n.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_s = stackIn_8_1;
            this.field_u = Integer.parseInt(this.getParameter("gameport1"));
            this.field_p = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_r = Integer.parseInt(var7);
            }
            this.field_l = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_x = Long.parseLong(this.getParameter("instanceid"));
            this.field_o = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_m = Integer.parseInt(var8);
            }
            if (this.field_m >= 5) {
              this.field_m = 0;
            }
            if (param2) {
              return;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_k = Integer.parseInt(var9);
            }
            tg.field_j = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param4, param1, param0, this.field_l, param3, 32, 3);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            ud.a((String) null, (Throwable) ((Object) var6_ref), 0);
            this.a(-6469, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("wb.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void d(byte param0) {
        ui.field_mb[2] = true;
        if (param0 > -44) {
          field_y = -117;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        cg.field_y = this.field_m;
        ek.a(10, cg.field_y);
        wc.a(22986, param2, cg.field_y, param3, fg.field_q, this.field_p, this.field_n, this.field_o, this.field_u, 5000, this.field_r, this.field_x, 5000, this.field_l);
        rh.a(cg.field_y, this.field_r, 8737, param2, this.field_u, this.field_n, this.field_p, this.field_l, fg.field_q);
        vg.b((byte) 32);
        ui.field_pb = of.a(-21814);
        aj.a(0, ol.field_e);
        bm.field_M = param5;
        ll.field_s = param1;
        df.field_a = param0;
        if (param6 != 8) {
          field_w = (String) null;
        }
        ki.field_d = param4;
        lh.field_f = param7;
        this.j(90);
        ia.b(true);
    }

    private final void c(byte param0) {
        if (param0 >= -55) {
          this.field_r = 94;
        }
        ui.field_mb[1] = true;
    }

    final int e(boolean param0) {
        int var2;
        if (param0) {
          return -52;
        }
        var2 = this.h(5000);
        if (0 == var2 ||
          var2 == 1) {
          if (ui.field_mb[1]) {
            ik.a(2, (byte) 110);
          }
          if (ui.field_mb[2]) {
            pb.a(3, 0);
          }
          if (ui.field_mb[3]) {
            wd.a(-29250, 4);
          }
          if (ui.field_mb[4]) {
            td.a(5, -1115925337);
          }
          if (ui.field_mb[5]) {
            pg.a(-68, 6);
          }
          if (ui.field_mb[6]) {
            ml.a(7, 960240129);
          }
          if (ui.field_mb[8]) {
            ge.a(119);
          }
        }
        return var2;
    }

    private final void e(int param0) {
        int var2 = -17 / ((param0 + 78) / 43);
        ui.field_mb[4] = true;
    }

    private final void a(boolean param0, int param1) {
        ui.field_mb[3] = true;
        if (param1 > -52) {
          return;
        }
        ui.field_mb[18] = true;
        ui.field_mb[8] = param0;
        ui.field_mb[7] = true;
        ui.field_mb[17] = true;
        ui.field_mb[16] = true;
        ui.field_mb[0] = true;
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          ni var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = fleas.field_A ? 1 : 0;
          var4 = mg.a(param0, cg.field_y, 10, al.field_f);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = tg.a(ol.a(-125), param1 ^ 0, fc.d(64));
            if (var5_int != -1) {
              fk.a(fh.field_a, var5_int, false, tc.field_e);
              tc.field_e = null;
              fh.field_a = null;
            }
            var11 = mf.a(true);
            if (var11 != null) {
              ta.a(var11.booleanValue(), 105);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = j.a(this.field_k, b.a(param1 ^ 14638), lc.f(0), ti.a((byte) -8), (byte) -116, vi.b((byte) -55), uj.a(param1 - 2477));
            if (-1 != var5_intLifetime1) {
              oc.a(false, tc.field_e, var5_intLifetime1, fh.field_a);
              tc.field_e = null;
              fh.field_a = null;
            }
          }
          if (var4 == 3) {
            if (oa.field_j != -1 &&
              0 != oa.field_j) {
              oa.field_j = -1;
              vh.a(0);
            }
            if (param2) {
              rj.field_j = false;
            } else {
              var5_intLifetime2 = rb.a(this.field_s, lc.f(0), false, vi.b((byte) -55), this.field_k, -99);
              if (var5_intLifetime2 != -1) {
                if (0 != var5_intLifetime2) {
                  rl.a(fh.field_a, var5_intLifetime2, 110);
                  fh.field_a = null;
                } else {
                  of.field_c = aj.field_w;
                  ii.a((byte) -88);
                  ci.field_f = false;
                  bh.field_t = 10;
                }
              }
            }
          }
          if (var4 == 4) {
            if (!va.field_m) {
              bh.field_t = 10;
              ci.field_f = true;
            } else {
              hi.a((byte) -38, rl.a((byte) -113));
            }
          }
          if (var4 == 5) {
            hf.a(rl.a((byte) -99), -60);
          }
          if (param1 != 0) {
            wb.i(-102);
          }
          if (var4 == 6 &&
            tb.field_c) {
            bh.field_t = 10;
          }
          if (var4 == 7) {
            ha.a(rl.a((byte) -105), 7152);
          }
          if (8 == var4) {
            hi.a((byte) -38, rl.a((byte) -94));
          }
          if (var4 == 9) {
            al.a(-75, rl.a((byte) -106));
          }
          if (var4 == 10) {
            ud.field_b.e(8, 17);
          }
          if (11 == var4) {
            df.a(rl.a((byte) -88), 10245);
          }
          if (12 == var4) {
            qg.a(qh.i(-114), rl.a((byte) -56), 0);
          }
          if (var4 == 13) {
            try {
              if (lh.field_g == null) {
                lh.field_g = new sk(fg.field_q, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (lh.field_g.c((byte) 79)) {
                var12 = lh.field_g.a(param1 + 86);
                if (var12 != null) {
                  var7 = pg.a(var12.field_i, 0, var12.field_k, 0);
                  w.a(61, var7);
                } else {
                  var9 = (String) null;
                  w.a(61, (String) null);
                }
                lh.field_g = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              ud.a("S1", (Throwable) ((Object) var5), 0);
              var10 = (String) null;
              w.a(61, (String) null);
              lh.field_g = null;
            }
          }
          if (var4 == 15) {
            bh.field_t = 10;
          }
          if (16 == var4) {
            return 1;
          }
          if (var4 != 17) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(int param0) {
        if (param0 != 12405) {
          this.field_s = false;
        }
        ui.field_mb[5] = true;
    }

    final int a(byte param0, boolean param1) {
        if (param0 > -53) {
          return -128;
        }
        return this.a(param1, 0, true);
    }

    public static void i(int param0) {
        field_q = null;
        field_t = (byte[][]) null;
        field_w = null;
        if (param0 != -1) {
          wb.a(-80, -9, 33, (byte) 20, 49, 5, 89, -70);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = fleas.field_A ? 1 : 0;
        if (param3 != -39) {
          wb.a(-108, 18, 34, (byte) -127, -110, -18, 7, 121);
        }
        if (param5 >= param1) {
          if (param5 < param2) {
            rl.a(param7, param1, gb.field_a, param0, param5, param4, param6, param2, (byte) -115);
          } else {
            if (param2 > param1) {
              rl.a(param7, param1, gb.field_a, param6, param2, param4, param0, param5, (byte) -115);
            } else {
              rl.a(param0, param2, gb.field_a, param6, param1, param4, param7, param5, (byte) -115);
            }
          }
        } else {
          if (param2 <= param1) {
            if (param2 <= param5) {
              rl.a(param0, param2, gb.field_a, param7, param5, param4, param6, param1, (byte) -115);
            } else {
              rl.a(param6, param5, gb.field_a, param7, param2, param4, param0, param1, (byte) -115);
            }
          } else {
            rl.a(param6, param5, gb.field_a, param0, param1, param4, param7, param2, (byte) -115);
          }
        }
    }

    protected wb() {
    }

    static {
        field_y = 10;
        field_q = new ed();
        field_w = "OVER <%0>";
    }
}
