/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lb extends tn {
    private boolean field_A;
    private long field_s;
    private int field_u;
    static wm field_r;
    String field_w;
    private int field_y;
    private int field_z;
    private boolean field_v;
    private int field_B;
    private int field_t;
    static wm field_C;
    private boolean field_F;
    private int field_q;
    static int field_D;
    static kn field_x;

    final int a(boolean param0, byte param1) {
        if (param1 != 96) {
          this.g((byte) 41);
        }
        return this.a(param1 ^ 96, param0, true);
    }

    private final void m(int param0) {
        h.field_P[param0] = true;
    }

    private final void o(int param0) {
        if (param0 < 125) {
          this.i(-53);
        }
        h.field_P[6] = true;
    }

    private final int a(int param0, boolean param1, boolean param2) {
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
          we var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Pixelate.field_H ? 1 : 0;
          var4 = qi.a(param0 + 6388, lp.field_i, wo.field_d, param1);
          if (param0 == var4) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = uj.a((byte) -127, lj.a((byte) 108), km.e(100));
            if (var5_int != -1) {
              hn.a((byte) -97, ii.field_y, var5_int, gi.field_b);
              gi.field_b = null;
              ii.field_y = null;
            }
            var11 = pi.c((byte) 104);
            if (var11 != null) {
              nk.a(param0 + 0, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = dn.a(wc.d(param0 + 0), (byte) 5, this.field_t, am.a(-13565), vi.b((byte) 127), pd.k(0), eg.f(8192));
            if (-1 != var5_intLifetime1) {
              rh.a(true, gi.field_b, ii.field_y, var5_intLifetime1);
              gi.field_b = null;
              ii.field_y = null;
            }
          }
          if (var4 == 3) {
            if (mj.field_b != -1 &&
              mj.field_b != 0) {
              mj.field_b = -1;
              op.g((byte) 68);
            }
            if (param2) {
              ol.field_o = false;
            } else {
              var5_intLifetime2 = mi.a(this.field_A, (byte) 28, am.a(-13565), this.field_t, false, eg.f(8192));
              if (-1 != var5_intLifetime2) {
                if (0 == var5_intLifetime2) {
                  ff.field_d = vn.field_b;
                  ql.d(123);
                  el.field_b = 10;
                  lo.field_Nb = false;
                } else {
                  gp.a(true, gi.field_b, var5_intLifetime2);
                  gi.field_b = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (uj.field_Lb) {
              vi.a(ao.a(param0 ^ 13867), 22770);
            } else {
              el.field_b = 10;
              lo.field_Nb = true;
            }
          }
          if (5 == var4) {
            d.a(0, ao.a(13867));
          }
          if (var4 == 6 &&
            sd.field_I) {
            el.field_b = 10;
          }
          if (var4 == 7) {
            ip.a((byte) 93, ao.a(param0 + 13867));
          }
          if (var4 == 8) {
            vi.a(ao.a(13867), 22770);
          }
          if (var4 == 9) {
            fc.a(ao.a(param0 + 13867), (byte) 19);
          }
          if (var4 == 10) {
            aa.field_f.g(17, 15514);
          }
          if (var4 == 11) {
            vf.a(ao.a(13867), 3279);
          }
          if (12 == var4) {
            ae.a((byte) 71, ao.a(13867), sn.b((byte) 11));
          }
          if (13 == var4) {
            try {
              if (null == qe.field_w) {
                qe.field_w = new ll(mc.field_k, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (qe.field_w.b((byte) -87)) {
                var12 = qe.field_w.a(3);
                if (var12 == null) {
                  var9 = (String) null;
                  ri.a((String) null, true);
                } else {
                  var7 = ui.a(true, var12.field_k, 0, var12.field_m);
                  ri.a(var7, true);
                }
                qe.field_w = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              jo.a(1, "S1", (Throwable) ((Object) var5));
              var10 = (String) null;
              ri.a((String) null, true);
              qe.field_w = null;
            }
          }
          if (var4 == 15) {
            el.field_b = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (17 != var4) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_26_0 = 0;
        int stackIn_100_0 = 0;
        boolean stackIn_101_1 = false;
        boolean stackIn_104_2 = false;
        int stackIn_129_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Pixelate.field_H ? 1 : 0;
        if (null != vh.field_c) {
          if (null == ib.field_f) {
            var6 = tn.b((byte) 99);
            var4 = var6.getSize();
            vh.field_c.a(var4.width, 13756, var4.height);
          }
          vh.field_c.c(85);
        }
        re.a((byte) 85);
        cm.e(-118);
        if (!bd.a(true) &&
          el.field_b != 11) {
          nj.d(param0 ^ 49661);
        }
        if (null != gp.field_Lb) {
          lp.field_i = gp.field_Lb.b(true);
        }
        if (ol.b(true)) {
          var3 = pf.a(true) * 1200;
          if (this.field_F ||
            !(il.a(-115) <= var3) &&
            !(var3 >= ql.g(13428))) {
            this.field_F = false;
            na.a(true);
            to.g((byte) 81);
            gp.a(true, hm.field_c, 2);
            fe.a(false);
            ol.field_o = true;
            mc.field_q = 15000L + hm.a(64);
          }
        }
        if (mj.field_b == -1 ||
          mj.field_b == 0) {
          stackIn_26_0 = (mj.field_b != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          mj.field_b = qn.e(59);
          if (var3Lifetime1 != 0 &&
            0 == mj.field_b &&
            el.field_b == 11 &&
            !uh.a((byte) -59)) {
            ql.d(param0 ^ 47);
          }
          if (mj.field_b != -1 &&
            mj.field_b != 0) {
            mc.field_q = 15000L + hm.a(64);
          }
        }
        if (mj.field_b != -1 &&
          0 != mj.field_b) {
          if (10 > hf.field_q) {
            if (mj.field_b == 3) {
              this.a(-18310, "js5crc");
            } else {
              if (mj.field_b != 4) {
                if (mj.field_b != 2) {
                  if (mj.field_b == 5) {
                    this.a(-18310, "outofdate");
                  } else {
                    this.a(param0 - 18310, "js5connect");
                  }
                } else {
                  this.a(param0 - 18310, "js5connect_full");
                }
              } else {
                this.a(-18310, "js5io");
              }
            }
          } else {
            if (el.field_b >= 10) {
              to.g((byte) 106);
              if (mj.field_b == 3) {
                gp.a(true, wo.field_e, 256);
              } else {
                if (mj.field_b == 4) {
                  gp.a(true, od.field_Ib, 256);
                } else {
                  if (mj.field_b != 2) {
                    if (mj.field_b == 5) {
                      gp.a(true, aq.field_b, 5);
                    } else {
                      gp.a(true, ll.field_k, 256);
                    }
                  } else {
                    gp.a(true, rn.field_g, 256);
                  }
                }
              }
              ol.field_o = true;
            }
          }
        }
        if ((param0 != ~mj.field_b &&
          mj.field_b != 0 ||
          uh.a((byte) -59)) &&
          mc.field_q <= hm.a(64)) {
          ol.field_o = false;
          if (mj.field_b != -1 &&
            mj.field_b != 0) {
            mj.field_b = -1;
            op.g((byte) 68);
          }
        }
        if (0 == mj.field_b &&
          !uh.a((byte) -59)) {
          go.field_f = false;
        }
        if (hf.field_q == 0 &&
          pg.b(param0 ^ 916440577)) {
          hf.field_q = 1;
        }
        if (hf.field_q == 1) {
          if (0 != wo.field_d) {
            hn.field_e = wb.a(il.field_f, (byte) 124);
          }
          wk.field_j = vm.a(true, (byte) 22, false, wg.field_e, 1);
          io.field_g = vm.a(true, (byte) 22, false, lo.field_Hb, 1);
          qo.field_u = vm.a(true, (byte) 22, false, wn.field_r, 1);
          qn.field_l = wk.field_j;
          dg.field_d = io.field_g;
          hf.field_q = 2;
        }
        if (hf.field_q == 2) {
          if (hn.field_e != null &&
            hn.field_e.b(-3)) {
            if (!hn.field_e.b(param0 + 125, "")) {
              hn.field_e = null;
            } else {
              if (hn.field_e.a("", ~param0)) {
                uk.a(param0 + 31873, hn.field_e);
                hn.field_e = null;
                sf.a(param0 + 0);
              }
            }
          }
          if (null == hn.field_e) {
            hf.field_q = 3;
          }
        }
        if (hf.field_q == 3 &&
          gf.a(io.field_g, -123, wk.field_j, qo.field_u) &&
          pe.a(qo.field_u, (byte) -91)) {
          gg.c((byte) 24);
          rn.a((byte) 119);
          ad.field_r = mk.field_c;
          sd.field_I = false;
          hn.a(io.field_g, param0 + 27848, wk.field_j, qo.field_u, uj.field_Lb);
          if (ri.field_b ||
            null != eq.field_fc) {
            stackIn_100_0 = param0 - 20;
            stackIn_101_1 = !(ri.field_b);
            stackIn_104_2 = !(ri.field_b);
            vn.a(stackIn_100_0, stackIn_101_1, stackIn_104_2, eq.field_fc);
          }
          if (ci.field_n) {
            jo.a(-22218);
          }
          if (null == kp.field_t) {
            kp.field_t = vp.d((byte) -58);
            hn.field_a = te.n(0);
          }
          em.a(kp.field_t, 74, hn.field_a, qo.field_u);
          io.field_g = null;
          qo.field_u = null;
          wk.field_j = null;
          bg.a(param0 + 125, (java.applet.Applet) (this));
          sf.a(0);
          hf.field_q = 10;
        }
        if (hf.field_q == 10) {
          if (wo.field_d != 0) {
            lf.field_f = wb.a(ro.field_c, (byte) 124);
          }
          hf.field_q = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (hf.field_q == 11) {
          if (null != lf.field_f && (!lf.field_f.b(-3) ||
            !lf.field_f.a((byte) 92))) {
            li.a(0.0f, -1, dk.a(wa.field_a, 0, hm.field_a, lf.field_f));
            decompiledFrameRemainder0 = false;
          }
          else {
            nn.field_i = true;
            hf.field_q = 12;
          }
        }
        if (hf.field_q == 12 &&
          !nn.field_i) {
          hf.field_q = 13;
        }
        if (hf.field_q == 13) {
          var3Lifetime2 = 1;
          if (gd.field_a != null) {
            stackIn_129_0 = (!gd.field_a.c(4567)) ? 0 : 1;
            var3Lifetime2 = stackIn_129_0;
            li.a(gd.field_a.field_f, -1, gd.field_a.field_e);
          }
          if (var3Lifetime2 != 0) {
            hf.field_q = 20;
          }
        }
        if (!param1 &&
          wl.field_i) {
          pf.a(ec.field_u, param0 ^ 0);
          this.a(-27106);
          he.a(0, ec.field_u);
        }
        if (h.field_P[8]) {
          gh.d(8);
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        wo.field_d = this.field_z;
        if (!param4) {
          return;
        }
        pf.b(wo.field_d, -31383);
        l.a(false, wo.field_d, 5000, this.field_v, this.field_u, this.field_s, this.field_w, param0, 5000, param1, this.field_y, this.field_q, this.field_B, mc.field_k);
        rp.a(this.field_u, param0, wo.field_d, this.field_y, mc.field_k, this.field_q, this.field_w, -21462, this.field_B);
        qf.a(31171);
        gp.field_Lb = bl.a(71);
        he.a(0, ec.field_u);
        wg.field_e = param6;
        wn.field_r = param5;
        il.field_f = param7;
        lo.field_Hb = param3;
        ro.field_c = param2;
        this.n(-2);
        an.a(0);
    }

    final void h(int param0) {
        boolean stackIn_33_0 = false;
        int var2;
        aa var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        var2 = mn.field_e;
        if (64 > var2 &&
          h.field_P[var2]) {
          if (param0 != -12) {
            return;
          }
          if (0 == var2) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              ef.b(false);
            } else {
              if (var2 != 3) {
                if (var2 == 4) {
                  wh.e(-84);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      io.b(-123);
                    } else {
                      if (var2 == 7) {
                        this.i(param0 + 21049);
                      } else {
                        if (8 != var2) {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                ee.b(-123);
                                return;
                              }
                              if (var2 == 17) {
                                this.g((byte) 59);
                                return;
                              }
                              if (18 == var2) {
                                cl.b(param0 ^ -8237);
                                return;
                              }
                              jo.a(1, "MGS1: " + jm.b(-106), (Throwable) null);
                              na.a(true);
                              return;
                            }
                            stackIn_33_0 = (var2 == 12);
                            var3 = uj.a(stackIn_33_0, (byte) 122);
                            fq.a(var3, (byte) 64);
                          } else {
                            nk.a(16711935);
                          }
                        } else {
                          od.a(-5, vi.field_o, jj.field_b, mc.field_k);
                        }
                      }
                    }
                  } else {
                    ki.a(107);
                  }
                }
              } else {
                la.a(126);
              }
            }
          } else {
            ef.a(-14439);
          }
          return;
        }
        jo.a(1, "MGS2: " + jm.b(param0 - 55), (Throwable) null);
        na.a(true);
    }

    final void d(byte param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != 20) {
          this.o(-126);
        }
        if (re.a(122)) {
          discarded$1 = this.a(0, ib.field_f != null ? true : false, false);
        } else {
          if (hf.field_q < 10) {
          } else {
            if (!dm.q(22452)) {
              pb.b(124);
            } else {
              if (el.field_b != 0) {
                a.a((byte) -104, lp.field_i);
              } else {
                discarded$2 = this.a(0, false, false);
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, String param4) {
        boolean stackIn_7_1 = false;
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
            if (!this.c((byte) -112)) {
              return;
            }
            this.field_w = this.getCodeBase().getHost();
            var6 = this.field_w.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_A = stackIn_7_1;
            this.field_y = Integer.parseInt(this.getParameter("gameport1"));
            this.field_q = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_B = Integer.parseInt(var7);
            }
            this.field_u = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_s = Long.parseLong(this.getParameter("instanceid"));
            this.field_v = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_z = Integer.parseInt(var8);
            }
            if (this.field_z >= 5) {
              this.field_z = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_t = Integer.parseInt(var9);
            }
            ci.field_n = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param1, (byte) -104, param2, param3, this.field_u, param4, 32);
            if (param0 != -128) {
              this.m(-94);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            jo.a(1, (String) null, (Throwable) ((Object) var6_ref));
            this.a(-18310, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("lb.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_C = null;
        if (!param0) {
          field_C = (wm) null;
        }
        field_r = null;
        field_x = null;
    }

    final void a(String param0, int param1, int param2) {
        try {
          this.a((byte) -128, 480, param1, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lb.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void n(int param0) {
        wd.field_d[17] = -1;
        wd.field_d[18] = 1;
        wd.field_d[10] = -1;
        wd.field_d[3] = -1;
        wd.field_d[1] = 16;
        wd.field_d[12] = -1;
        wd.field_d[9] = -1;
        wd.field_d[7] = -1;
        wd.field_d[6] = param0;
        wd.field_d[13] = -1;
        wd.field_d[2] = -2;
        wd.field_d[4] = -1;
        wd.field_d[5] = -1;
        wd.field_d[8] = -2;
        wd.field_d[16] = -1;
        wd.field_d[11] = -1;
    }

    private final void i(int param0) {
        String var2 = qo.e(480);
        if (param0 != 21037) {
          this.a(false, false, true, true, true, false, -110);
        }
        gj.a(var2, ao.a(param0 ^ 25606), true);
    }

    final int j(int param0) {
        if (param0 != 1272) {
          this.o(-20);
        }
        int var2 = this.l(-85);
        if (0 == var2 ||
          var2 == 1) {
          if (h.field_P[1]) {
            io.a(2, -20304);
          }
          if (h.field_P[2]) {
            se.a((byte) 32, 3);
          }
          if (h.field_P[3]) {
            ue.b(4, (byte) 42);
          }
          if (h.field_P[4]) {
            vp.a(0, 5);
          }
          if (h.field_P[5]) {
            bo.a(6, 7);
          }
          if (h.field_P[6]) {
            ag.a((byte) -116, 7);
          }
          if (h.field_P[8]) {
            nn.a(true);
          }
        }
        return var2;
    }

    private final void e(byte param0) {
        int var2 = -121 / ((12 - param0) / 42);
        h.field_P[5] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, int param6) {
        this.a((byte) -53, true);
        if (param4) {
          this.m(1);
        }
        if (param3) {
          this.g(17);
        }
        if (param5) {
          this.k(61);
        }
        if (param1) {
          this.e((byte) 107);
        }
        if (param0) {
          this.o(126);
        }
        if (param2) {
          this.f((byte) -103);
        }
        if (param6 > -30) {
          this.field_s = -38L;
        }
    }

    private final int l(int param0) {
        int var2;
        if (this.field_c) {
          return -1;
        }
        if (!uh.a((byte) -59)) {
          return -1;
        }
        if (param0 >= -73) {
          this.field_w = (String) null;
        }
        if (ol.field_o) {
          return -1;
        }
        var2 = mi.a(this.field_A, (byte) 91, am.a(-13565), this.field_t, true, eg.f(8192));
        if (-1 == var2) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!am.field_e) {
            this.a(-18310, "reconnect");
          }
          to.g((byte) 47);
          gp.a(true, gi.field_b, var2);
          ol.field_o = true;
          mc.field_q = 15000L + hm.a(64);
          return var2;
        }
        if (el.field_b == 11 &&
          mj.field_b == 0) {
          ql.d(44);
        }
        return var2;
    }

    private final void f(byte param0) {
        h.field_P[11] = true;
        h.field_P[12] = true;
        h.field_P[13] = true;
        if (param0 >= -61) {
          lb.a((byte) -22, 47);
        }
    }

    private final void k(int param0) {
        h.field_P[4] = true;
        if (param0 < 24) {
          this.field_t = -8;
        }
    }

    private final void g(byte param0) {
        int var2 = vi.field_o.f(255);
        if (param0 != 59) {
          this.field_B = -116;
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = jj.field_b - 1;
        byte[] var5 = new byte[var4];
        vi.field_o.b(var5, 0, 88, var4);
        ia.a(var3 != 0, of.a(var5, 1), -33, ao.a(param0 ^ 13840));
    }

    final static hh[] a(fm param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        hh[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(127, param2);
          var6 = 95 % ((param1 + 53) / 49);
          var5 = param0.a((byte) -126, param3, var4_int);
          stackIn_1_0 = ff.a(param0, var5, var4_int, (byte) 18);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("lb.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        String var3;
        if (param0 > -88) {
          var3 = (String) null;
          lb.a((fm) null, 29, (String) null, (String) null);
        }
        if (65536L > (long)param1) {
          if (256L > (long)param1) {
            if (param1 >= 0) {
              return nj.field_e[param1] >> 12;
            }
            return -1;
          }
          if ((long)param1 >= 4096L) {
            if (16384L <= (long)param1) {
              return nj.field_e[param1 >> 8] >> 8;
            }
            return nj.field_e[param1 >> 6] >> 9;
          }
          if ((long)param1 < 1024L) {
            return nj.field_e[param1 >> 2] >> 11;
          }
          return nj.field_e[param1 >> 4] >> 10;
        }
        if ((long)param1 >= 16777216L) {
          if (268435456L <= (long)param1) {
            if ((long)param1 < 1073741824L) {
              return nj.field_e[param1 >> 22] >> 1;
            }
            return nj.field_e[param1 >> 24];
          }
          if ((long)param1 >= 67108864L) {
            return nj.field_e[param1 >> 20] >> 2;
          }
          return nj.field_e[param1 >> 18] >> 3;
        }
        if ((long)param1 < 1048576L) {
          if ((long)param1 < 262144L) {
            return nj.field_e[param1 >> 10] >> 7;
          }
          return nj.field_e[param1 >> 12] >> 6;
        }
        if ((long)param1 >= 4194304L) {
          return nj.field_e[param1 >> 16] >> 4;
        }
        return nj.field_e[param1 >> 14] >> 5;
    }

    private final void g(int param0) {
        h.field_P[2] = true;
        int var2 = 1 / ((-44 - param0) / 49);
    }

    protected lb() {
    }

    private final void a(byte param0, boolean param1) {
        h.field_P[7] = true;
        h.field_P[16] = true;
        h.field_P[17] = true;
        h.field_P[18] = true;
        if (param0 >= -49) {
          String var4 = (String) null;
          this.a((String) null, 31, 95);
        }
        h.field_P[3] = true;
        h.field_P[0] = true;
        h.field_P[8] = param1;
    }

    static {
        field_r = new wm(6, 0, 4, 2);
        field_C = new wm(8, 0, 4, 1);
    }
}
