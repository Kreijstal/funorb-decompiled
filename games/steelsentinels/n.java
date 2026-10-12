/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class n extends lg {
    private int field_D;
    private boolean field_C;
    private boolean field_E;
    static td field_x;
    static int field_u;
    static String field_o;
    static int[] field_z;
    private long field_r;
    private int field_v;
    private int field_q;
    private int field_n;
    static u field_w;
    private int field_F;
    static int[] field_p;
    private int field_B;
    private boolean field_A;
    static boolean[][] field_s;
    String field_t;
    static String field_y;

    private final int a(boolean param0, boolean param1, int param2) {
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
          gi var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = SteelSentinels.field_G;
          var4 = hh.a(dh.field_D, param1, (byte) -66, jj.field_d);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = lg.a(ln.a((byte) -89), si.b(64), -121);
            if (var5_int != -1) {
              a.a(di.field_e, (byte) 118, var5_int, vh.field_d);
              vh.field_d = null;
              di.field_e = null;
            }
            var11 = aj.a(true);
            if (var11 != null) {
              fl.a((byte) 97, var11.booleanValue());
            }
          }
          if (2 == var4) {
            var5_intLifetime1 = id.a(ma.a(false), 0, jj.a(true), this.field_q, hl.d(91), vl.e(37), df.h(82));
            if (var5_intLifetime1 != -1) {
              nn.a(vh.field_d, var5_intLifetime1, di.field_e, (byte) -128);
              di.field_e = null;
              vh.field_d = null;
            }
          }
          if (3 == var4) {
            if (fl.field_d != -1 &&
              fl.field_d != 0) {
              fl.field_d = -1;
              bi.b(param2 ^ 7004);
            }
            if (!param0) {
              var5_intLifetime2 = jj.a(-108, this.field_q, jj.a(true), this.field_A, false, ma.a(false));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  cl.a(di.field_e, var5_intLifetime2, 1);
                  di.field_e = null;
                } else {
                  oa.field_P = li.field_w;
                  ee.c(11828);
                  mg.field_ac = false;
                  uj.field_d = 10;
                }
              }
            } else {
              tf.field_b = false;
            }
          }
          if (4 == var4) {
            if (!ki.field_ib) {
              mg.field_ac = true;
              uj.field_d = 10;
            } else {
              ei.a(param2 + 7014, wl.d((byte) -21));
            }
          }
          if (5 == var4) {
            t.a(true, wl.d((byte) -21));
          }
          if (var4 == 6 &&
            ck.field_a) {
            uj.field_d = 10;
          }
          if (param2 != -7014) {
            return 20;
          }
          if (7 == var4) {
            nc.a((byte) -81, wl.d((byte) -21));
          }
          if (var4 == 8) {
            ei.a(0, wl.d((byte) -21));
          }
          if (9 == var4) {
            mj.a((byte) 49, wl.d((byte) -21));
          }
          if (var4 == 10) {
            mm.field_g.a(17, (byte) -117);
          }
          if (var4 == 11) {
            pf.a(wl.d((byte) -21), 63);
          }
          if (12 == var4) {
            rj.a(db.b(param2 + 7014), wl.d((byte) -21), (byte) -47);
          }
          if (var4 == 13) {
            try {
              if (kc.field_s == null) {
                kc.field_s = new fk(hb.field_i, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (kc.field_s.c(-2)) {
                var12 = kc.field_s.b(param2 + 7017);
                if (var12 == null) {
                  var9 = (String) null;
                  na.a((String) null, (byte) -126);
                } else {
                  var7 = ub.a((byte) 37, 0, var12.field_t, var12.field_p);
                  na.a(var7, (byte) -105);
                }
                kc.field_s = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              sj.a("S1", -100, (Throwable) ((Object) var5));
              var10 = (String) null;
              na.a((String) null, (byte) -104);
              kc.field_s = null;
            }
          }
          if (var4 == 15) {
            uj.field_d = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        int var2 = -57 / ((param0 - 47) / 53);
        dg.field_h[5] = true;
    }

    private final void a(int param0, String param1, int param2, int param3, int param4) {
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
            if (!this.b((byte) 110)) {
              return;
            }
            this.field_t = this.getCodeBase().getHost();
            var6 = this.field_t.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_A = stackIn_8_1;
            this.field_D = Integer.parseInt(this.getParameter("gameport1"));
            this.field_B = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_v = Integer.parseInt(var7);
            }
            this.field_F = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_r = Long.parseLong(this.getParameter("instanceid"));
            this.field_C = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_n = Integer.parseInt(var8);
            }
            if (~this.field_n <= param2) {
              this.field_n = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_q = Integer.parseInt(var9);
            }
            ud.field_q = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param3, param0, 32, (byte) 103, param1, this.field_F, param4);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            sj.a((String) null, -41, (Throwable) ((Object) var6_ref));
            this.a("crash", param2 ^ 16948);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("n.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int i(byte param0) {
        int var2;
        int var3;
        if (this.field_m) {
          return -1;
        }
        if (!ri.a(16731221)) {
          return -1;
        }
        if (tf.field_b) {
          return -1;
        }
        var2 = jj.a(-119, this.field_q, jj.a(true), this.field_A, true, ma.a(false));
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!am.field_b) {
            this.a("reconnect", -16946);
          }
          of.a(10);
          var3 = 102 / ((param0 + 32) / 54);
          cl.a(di.field_e, var2, 1);
          tf.field_b = true;
          r.field_l = 15000L + mm.a(42);
          return var2;
        }
        if (uj.field_d == 11 &&
          fl.field_d == 0) {
          ee.c(11828);
        }
        return var2;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        dh.field_D = this.field_n;
        jg.a(dh.field_D, param2 ^ 4192);
        lk.a(hb.field_i, this.field_t, param1, this.field_v, param3, this.field_C, this.field_B, dh.field_D, 5000, this.field_r, (byte) 120, param2, this.field_F, this.field_D);
        g.a(this.field_F, this.field_D, param3, this.field_B, hb.field_i, (byte) -95, dh.field_D, this.field_v, this.field_t);
        fa.a((byte) 127);
        nc.field_j = pi.a((byte) 68);
        hg.a((byte) -93, sl.field_n);
        ea.field_h = param5;
        jl.field_r = param7;
        ed.field_h = param4;
        kd.field_p = param6;
        rf.field_c = param0;
        this.c(true);
        di.a((byte) -128);
    }

    final int a(boolean param0, int param1) {
        if (param1 != -3836) {
          field_o = (String) null;
        }
        return this.a(true, param0, param1 ^ 5534);
    }

    public static void h(byte param0) {
        field_p = null;
        field_w = null;
        field_o = null;
        field_x = null;
        field_s = (boolean[][]) null;
        if (param0 >= -101) {
          return;
        }
        field_z = null;
        field_y = null;
    }

    private final void e(byte param0) {
        if (param0 >= -86) {
          return;
        }
        dg.field_h[4] = true;
    }

    private final void b(boolean param0) {
        dg.field_h[12] = true;
        dg.field_h[11] = true;
        if (param0) {
          return;
        }
        dg.field_h[13] = true;
    }

    final void a(int param0, int param1, String param2) {
        try {
          if (param1 != -28233) {
            this.b(true);
          }
          this.a(480, param2, -6, 640, param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "n.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.a(true, true);
        if (param3) {
          this.f((byte) -17);
        }
        if (param1) {
          this.j(-17573);
        }
        if (param0 != 1) {
          return;
        }
        if (param6) {
          this.e((byte) -91);
        }
        if (param2) {
          this.d((byte) -107);
        }
        if (param4) {
          this.i(118);
        }
        if (param5) {
          this.b(false);
        }
    }

    private final void j(int param0) {
        if (param0 != -17573) {
          this.field_q = 102;
        }
        dg.field_h[2] = true;
    }

    final void k(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = SteelSentinels.field_G;
        if (ri.c(6995)) {
          discarded$1 = this.a(false, wb.field_c != null ? true : false, -7014);
        } else {
          if (nj.field_Q >= 10) {
            if (!km.a(-104)) {
              uj.b(29);
            } else {
              if (uj.field_d == 0) {
                discarded$3 = this.a(false, false, -7014);
              } else {
                r.a(jj.field_d, (byte) 104);
              }
            }
          }
        }
        int var2 = -84 % ((30 - param0) / 55);
    }

    private final void f(byte param0) {
        if (param0 != -17) {
          this.field_E = false;
        }
        dg.field_h[1] = true;
    }

    private final void l(int param0) {
        int var2 = rf.field_d.f((byte) -86);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + jg.field_f;
        byte[] var5 = new byte[var4];
        rf.field_d.a(0, var4, var5, 103);
        be.a(var3 != 0, (byte) 99, jk.a(13, var5), wl.d((byte) -21));
        if (param0 != 3894) {
          this.f((byte) -96);
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        String stackIn_113_0 = null;
        boolean stackIn_114_1 = false;
        boolean stackIn_117_2 = false;
        int stackIn_147_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = SteelSentinels.field_G;
        if (null != ve.field_a) {
          if (null == wb.field_c) {
            var6 = pl.g(param0 - 45);
            var4 = var6.getSize();
            ve.field_a.b(var4.height, (byte) -114, var4.width);
          }
          ve.field_a.b(false);
        }
        lg.g(-27983);
        rl.b(param0 ^ param0);
        if (!ol.j(0) &&
          uj.field_d != 11) {
          sn.c(-51);
        }
        if (nc.field_j != null) {
          jj.field_d = nc.field_j.b(-1);
        }
        if (ud.e(-116)) {
          var3 = sj.a((byte) -123) * 1200;
          if (this.field_E ||
            !(var3 >= ub.b(-102)) &&
            !(ha.a((byte) -64) <= var3)) {
            this.field_E = false;
            pm.m(127);
            of.a(10);
            cl.a(un.field_g, 2, param0 ^ 4);
            tk.e((byte) 82);
            tf.field_b = true;
            r.field_l = mm.a(-94) + 15000L;
          }
        }
        if (-1 == fl.field_d ||
          fl.field_d == 0) {
          stackIn_24_0 = (fl.field_d != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          fl.field_d = kj.j(param0 + 16);
          if (var3Lifetime1 != 0) {
            if (fl.field_d == 0) {
              if (11 == uj.field_d) {
                if (!ri.a(param0 ^ 16731216)) {
                  ee.c(11828);
                  if (fl.field_d != -1 &&
                    fl.field_d != 0) {
                    r.field_l = mm.a(127) + 15000L;
                  }
                } else {
                  if (fl.field_d != -1 &&
                    fl.field_d != 0) {
                    r.field_l = mm.a(127) + 15000L;
                  }
                }
              } else {
                if (fl.field_d != -1 &&
                  fl.field_d != 0) {
                  r.field_l = mm.a(127) + 15000L;
                }
              }
            } else {
              if (fl.field_d != -1 &&
                fl.field_d != 0) {
                r.field_l = mm.a(127) + 15000L;
              }
            }
          } else {
            if (fl.field_d != -1 &&
              fl.field_d != 0) {
              r.field_l = mm.a(127) + 15000L;
            }
          }
        }
        if (fl.field_d != -1 &&
          fl.field_d != 0) {
          if (10 <= nj.field_Q) {
            if (uj.field_d >= 10) {
              of.a(10);
              if (fl.field_d == 3) {
                cl.a(nh.field_F, 256, 1);
              } else {
                if (fl.field_d == 4) {
                  cl.a(un.field_c, 256, 1);
                } else {
                  if (2 != fl.field_d) {
                    if (fl.field_d != 5) {
                      cl.a(pg.field_s, 256, 1);
                    } else {
                      cl.a(wl.field_R, 5, 1);
                    }
                  } else {
                    cl.a(qf.field_j, 256, 1);
                  }
                }
              }
              tf.field_b = true;
            }
          } else {
            if (fl.field_d == 3) {
              this.a("js5crc", -16946);
            } else {
              if (fl.field_d == 4) {
                this.a("js5io", -16946);
              } else {
                if (fl.field_d != 2) {
                  if (fl.field_d == 5) {
                    this.a("outofdate", -16946);
                  } else {
                    this.a("js5connect", param0 ^ -16949);
                  }
                } else {
                  this.a("js5connect_full", -16946);
                }
              }
            }
          }
        }
        if ((fl.field_d != -1 &&
          fl.field_d != 0 ||
          ri.a(16731221)) &&
          r.field_l <= mm.a(-111)) {
          tf.field_b = false;
          if (fl.field_d != -1 &&
            fl.field_d != 0) {
            fl.field_d = -1;
            bi.b(-102);
          }
        }
        if (fl.field_d == 0 &&
          !ri.a(param0 ^ 16731216)) {
          rg.field_h = false;
        }
        if (nj.field_Q == 0 &&
          jj.a(-1)) {
          nj.field_Q = 1;
        }
        if (nj.field_Q == 1) {
          if (dh.field_D != 0) {
            ok.field_f = dh.a(73, ea.field_h);
          }
          ke.field_k = nb.a(true, ed.field_h, param0 + 251, 1, false);
          oe.field_d = nb.a(true, jl.field_r, param0 ^ 261, 1, false);
          id.field_bc = nb.a(true, rf.field_c, 256, 1, false);
          nj.field_Q = 2;
          tm.field_d = ke.field_k;
          ej.field_t = oe.field_d;
        }
        if (nj.field_Q == 2) {
          if (null != ok.field_f &&
            ok.field_f.a(true)) {
            if (!ok.field_f.a(12145, "")) {
              ok.field_f = null;
            } else {
              if (ok.field_f.a("", (byte) 90)) {
                dn.a(ok.field_f, -128);
                ok.field_f = null;
                cc.j(0);
              }
            }
          }
          if (ok.field_f == null) {
            nj.field_Q = 3;
          }
        }
        if (nj.field_Q == 3 &&
          da.a(ke.field_k, id.field_bc, param0 ^ -6, oe.field_d) &&
          fc.a(id.field_bc, param0 - 58)) {
          km.a(false);
          fg.n(-6);
          od.field_i = eb.field_q;
          ck.field_a = false;
          vi.a((byte) -127, ki.field_ib, id.field_bc, ke.field_k, oe.field_d);
          if (ub.field_j ||
            null != uj.field_k) {
            stackIn_113_0 = uj.field_k;
            stackIn_114_1 = !(ub.field_j);
            stackIn_117_2 = !(ub.field_j);
            nm.a(stackIn_113_0, stackIn_114_1, stackIn_117_2, param0 + 7);
          }
          if (ud.field_q) {
            qg.a((byte) 120);
          }
          if (null == lk.field_cb) {
            lk.field_cb = vn.c((byte) 83);
            ji.field_e = ue.a((byte) 62);
          }
          da.a(id.field_bc, 73, ji.field_e, lk.field_cb);
          oe.field_d = null;
          ke.field_k = null;
          id.field_bc = null;
          e.a((java.applet.Applet) (this), false);
          cc.j(param0 - 5);
          nj.field_Q = 10;
        }
        if (nj.field_Q == 10) {
          if (dh.field_D != 0) {
            pl.field_S = dh.a(param0 - 99, kd.field_p);
          }
          nj.field_Q = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (nj.field_Q == 11) {
          if (pl.field_S != null && (!pl.field_S.a(true) ||
            !pl.field_S.a(25))) {
            mc.a(ka.a((byte) -119, nm.field_t, jk.field_g, pl.field_S), 0.0f, -21801);
            decompiledFrameRemainder0 = false;
          }
          else {
            nj.field_Q = 12;
            rm.field_f = true;
          }
        }
        if (nj.field_Q == 12 &&
          !rm.field_f) {
          nj.field_Q = 13;
        }
        if (nj.field_Q == 13) {
          var3Lifetime2 = 1;
          if (rh.field_q != null) {
            stackIn_147_0 = (!rh.field_q.b(-2)) ? 0 : 1;
            var3Lifetime2 = stackIn_147_0;
            mc.a(rh.field_q.field_i, rh.field_q.field_g, -21801);
          }
          if (var3Lifetime2 != 0) {
            nj.field_Q = 20;
          }
        }
        if (!param1 &&
          ti.field_x) {
          pa.a(sl.field_n, 9174);
          this.a(false);
          hg.a((byte) -93, sl.field_n);
        }
        if (dg.field_h[8]) {
          sa.a((byte) -110);
        }
    }

    private final void g(byte param0) {
        if (param0 != -112) {
          this.i(67);
        }
        String var2 = qh.k(8347);
        ic.a(param0 - 14, var2, wl.d((byte) -21));
    }

    final void h(int param0) {
        int stackIn_31_0 = 0;
        boolean stackIn_32_1 = false;
        int var2;
        na var3;
        int var4;
        var4 = SteelSentinels.field_G;
        if (param0 <= 40) {
          this.l(8);
        }
        var2 = ch.field_N;
        if (var2 < 64 &&
          dg.field_h[var2]) {
          if (0 == var2) {
            return;
          }
          if (1 != var2) {
            if (2 == var2) {
              g.b(-116);
            } else {
              if (var2 != 3) {
                if (var2 == 4) {
                  na.a(true);
                } else {
                  if (var2 == 5) {
                    be.a(-16786);
                  } else {
                    if (var2 == 6) {
                      pm.k(113);
                    } else {
                      if (var2 != 7) {
                        if (var2 == 8) {
                          al.a(hb.field_i, false, rf.field_d, jg.field_f);
                        } else {
                          if (var2 == 16) {
                            wa.b(-76);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                te.a(2);
                                return;
                              }
                              if (var2 == 17) {
                                this.l(3894);
                                return;
                              }
                              if (var2 == 18) {
                                oc.a(false);
                                return;
                              }
                              sj.a("MGS1: " + ci.a((byte) 94), -27, (Throwable) null);
                              pm.m(-93);
                              return;
                            }
                            stackIn_31_0 = -98;
                            stackIn_32_1 = (12 == var2);
                            var3 = eb.$cfr$intArgs$a$9d0e4b5217c4(stackIn_31_0, stackIn_32_1);
                            bg.a(var3, -69);
                          }
                        }
                      } else {
                        this.g((byte) -112);
                      }
                    }
                  }
                }
              } else {
                cd.a(0);
              }
            }
          } else {
            bi.a(2158);
          }
          return;
        }
        sj.a("MGS2: " + ci.a((byte) 94), -85, (Throwable) null);
        pm.m(-94);
    }

    private final void i(int param0) {
        dg.field_h[6] = true;
        if (param0 <= 11) {
          String var3 = (String) null;
          this.a(12, (String) null, -17, -112, 117);
        }
    }

    private final void a(boolean param0, boolean param1) {
        dg.field_h[3] = true;
        dg.field_h[8] = param1;
        dg.field_h[7] = true;
        dg.field_h[16] = true;
        dg.field_h[18] = true;
        dg.field_h[0] = param0;
        dg.field_h[17] = true;
    }

    protected n() {
    }

    private final void c(boolean param0) {
        f.field_B[18] = 1;
        f.field_B[3] = -1;
        f.field_B[2] = -2;
        f.field_B[11] = -1;
        f.field_B[6] = -2;
        if (!param0) {
          return;
        }
        f.field_B[12] = -1;
        f.field_B[13] = -1;
        f.field_B[7] = -1;
        f.field_B[17] = -1;
        f.field_B[1] = 16;
        f.field_B[16] = -1;
        f.field_B[4] = -1;
        f.field_B[5] = -1;
        f.field_B[10] = -1;
        f.field_B[8] = -2;
        f.field_B[9] = -1;
    }

    static {
        field_o = "Spectating <%0>'s game";
        field_z = new int[]{0, 55, 57, 62, 65, 69, 72, 75, 79, 84, 88, 92};
        field_p = new int[8192];
        field_s = new boolean[][]{null, null, new boolean[]{false, false, false, false, false, true}};
        field_y = "<%0> has withdrawn the request to join.";
    }
}
