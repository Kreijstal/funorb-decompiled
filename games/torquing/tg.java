/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tg extends hk {
    private int field_k;
    private int field_r;
    private boolean field_o;
    private boolean field_n;
    private long field_s;
    private int field_q;
    private int field_p;
    private int field_l;
    String field_i;
    private int field_m;
    private boolean field_j;

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        if (param3 >= -24) {
          return;
        }
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        sn.field_i = this.field_k;
        il.a((byte) 52, sn.field_i);
        in.a(this.field_l, this.field_o, this.field_i, param0, sn.field_i, 5000, this.field_r, nk.field_u, param2, this.field_p, 0, this.field_s, 5000, this.field_m);
        mg.a(-1, sn.field_i, this.field_r, this.field_m, nk.field_u, this.field_l, this.field_i, this.field_p, param0);
        qg.d(-125);
        wb.field_u = la.b(26);
        j.a(k.field_d, (byte) -125);
        b.field_w = param6;
        uf.field_p = param1;
        gf.field_k = param5;
        ug.field_b = param4;
        tp.field_g = param7;
        this.h(11);
        rn.a(-117);
    }

    private final static void m(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Torquing.field_u;
        try {
          var1 = ha.field_b;
          synchronized (var1) {
            q.field_g = mj.field_d;
            po.field_w = po.field_w + 1;
            if (0 > hb.field_y) {
              for (var2 = 0; var2 < 112; var2++) {
                i.field_P[var2] = false;
              }
              hb.field_y = n.field_w;
            } else {
              while (n.field_w != hb.field_y) {
                var2 = no.field_i[n.field_w];
                n.field_w = 127 & n.field_w + 1;
                if (var2 >= 0) {
                  i.field_P[var2] = true;
                  continue;
                }
                i.field_P[~var2] = false;
              }
            }
            mj.field_d = gn.field_d;
          }
          if (param0 > -26) {
            tg.m(67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1_ref), "tg.R(" + param0 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        int stackIn_22_0 = 0;
        boolean stackIn_100_0 = false;
        String stackIn_102_1 = null;
        boolean stackIn_103_2 = false;
        int stackIn_133_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Torquing.field_u;
        if (ki.field_D != null) {
          if (dg.field_i == null) {
            var6 = lp.b(20);
            var4 = var6.getSize();
            ki.field_D.a(var4.width, false, var4.height);
          }
          ki.field_D.a((byte) -110);
        }
        tg.m(param0 ^ -104);
        gj.c(24417);
        if (!sf.a(param0 ^ -24) &&
          11 != op.field_i) {
          ra.a((byte) 75);
        }
        if (wb.field_u != null) {
          da.field_g = wb.field_u.b(0);
        }
        if (oo.a(16158)) {
          var3 = n.c((byte) 57) * 1200;
          if (this.field_n ||
            !(var3 >= k.b(124)) &&
            !(var3 >= ac.d((byte) -97))) {
            this.field_n = false;
            ih.b(true);
            lg.h(-101);
            dc.a(2, gh.field_b, 2);
            pp.a(false);
            gk.field_a = true;
            ta.field_k = km.b(-1) + 15000L;
          }
        }
        if (aj.field_J == -1 ||
          aj.field_J == 0) {
          stackIn_22_0 = (aj.field_J != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_22_0;
          aj.field_J = un.a(0);
          if (var3Lifetime1 != 0 &&
            0 == aj.field_J &&
            op.field_i == 11 &&
            !mk.a((byte) 38)) {
            qa.a((byte) -72);
          }
          if (aj.field_J != -1 &&
            aj.field_J != 0) {
            ta.field_k = km.b(-1) + 15000L;
          }
        }
        if (aj.field_J != -1 &&
          0 != aj.field_J) {
          if (b.field_x < 10) {
            if (aj.field_J == 3) {
              this.a(10, "js5crc");
            } else {
              if (aj.field_J == 4) {
                this.a(param0 - 13, "js5io");
              } else {
                if (2 != aj.field_J) {
                  if (aj.field_J != 5) {
                    this.a(10, "js5connect");
                  } else {
                    this.a(10, "outofdate");
                  }
                } else {
                  this.a(10, "js5connect_full");
                }
              }
            }
          } else {
            if (op.field_i >= 10) {
              lg.h(param0 ^ -107);
              if (aj.field_J != 3) {
                if (aj.field_J == 4) {
                  dc.a(256, ib.field_a, 2);
                } else {
                  if (aj.field_J == 2) {
                    dc.a(256, ra.field_b, param0 - 21);
                  } else {
                    if (aj.field_J != 5) {
                      dc.a(256, jk.field_b, 2);
                    } else {
                      dc.a(5, e.field_d, 2);
                    }
                  }
                }
              } else {
                dc.a(256, bm.field_r, param0 ^ 21);
              }
              gk.field_a = true;
            }
          }
        }
        if ((-1 != aj.field_J &&
          aj.field_J != 0 ||
          mk.a((byte) 38)) &&
          ta.field_k <= km.b(-1)) {
          gk.field_a = false;
          if (aj.field_J != -1 &&
            aj.field_J != 0) {
            aj.field_J = -1;
            jl.b((byte) 106);
          }
        }
        if (aj.field_J == 0 &&
          !mk.a((byte) 38)) {
          mh.field_g = false;
        }
        if (b.field_x == 0 &&
          sb.b(-80)) {
          b.field_x = 1;
        }
        if (1 == b.field_x) {
          if (sn.field_i != 0) {
            je.field_f = vg.a(-27646, b.field_w);
          }
          lp.field_a = sd.a(true, 1, (byte) -125, tp.field_g, false);
          eg.field_v = sd.a(true, 1, (byte) -84, ug.field_b, false);
          kb.field_a = sd.a(true, 1, (byte) -65, gf.field_k, false);
          e.field_b = eg.field_v;
          rp.field_d = lp.field_a;
          b.field_x = 2;
        }
        if (b.field_x == 2) {
          if (null != je.field_f &&
            je.field_f.a(-12749)) {
            if (!je.field_f.b((byte) -58, "")) {
              je.field_f = null;
            } else {
              if (je.field_f.a(true, "")) {
                fh.a(7, je.field_f);
                je.field_f = null;
                cf.a(param0 ^ 6648);
              }
            }
          }
          if (null == je.field_f) {
            b.field_x = 3;
          }
        }
        if (b.field_x == 3 &&
          ro.a((byte) 54, lp.field_a, kb.field_a, eg.field_v) &&
          pg.a(true, kb.field_a)) {
          od.c(-8431868);
          mk.a(true);
          ob.field_b = vo.field_e;
          r.field_c = false;
          fd.a(ao.field_b, lp.field_a, 0, kb.field_a, eg.field_v);
          if (ra.field_a ||
            null != vo.field_c) {
            stackIn_100_0 = !(ra.field_a);
            stackIn_102_1 = vo.field_c;
            stackIn_103_2 = !(ra.field_a);
            vb.a(stackIn_100_0, stackIn_102_1, stackIn_103_2, param0 ^ 4818);
          }
          if (ii.field_n) {
            eh.c((byte) 90);
          }
          if (kb.field_d == null) {
            kb.field_d = rg.a(true);
            qc.field_Z = c.a(24852);
          }
          cl.a(qc.field_Z, false, kb.field_d, kb.field_a);
          eg.field_v = null;
          kb.field_a = null;
          lp.field_a = null;
          ne.a((java.applet.Applet) (this), 0);
          cf.a(6639);
          b.field_x = 10;
        }
        if (b.field_x == 10) {
          if (0 != sn.field_i) {
            rd.field_z = vg.a(-27646, uf.field_p);
          }
          b.field_x = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (b.field_x == 11) {
          if (null != rd.field_z && (!rd.field_z.a(-12749) ||
            !rd.field_z.c(-19375))) {
            df.a(0.0f, -84, il.a(Torquing.field_w, rd.field_z, md.field_b, (byte) 78));
            decompiledFrameRemainder0 = false;
          }
          else {
            b.field_x = 12;
            w.field_F = true;
          }
        }
        if (b.field_x == 12 &&
          !w.field_F) {
          b.field_x = 13;
        }
        if (b.field_x == 13) {
          var3Lifetime2 = 1;
          if (null != a.field_c) {
            stackIn_133_0 = (!a.field_c.b(param0 ^ 23)) ? 0 : 1;
            var3Lifetime2 = stackIn_133_0;
            df.a(a.field_c.field_l, 75, a.field_c.field_h);
          }
          if (var3Lifetime2 != 0) {
            b.field_x = 20;
          }
        }
        if (!param1 &&
          b.field_v) {
          tf.a(-101, k.field_d);
          this.a(false);
          j.a(k.field_d, (byte) -118);
        }
        if (hh.field_d[8]) {
          kj.a(8);
        }
        if (param0 != 23) {
          this.field_k = 113;
        }
    }

    private final void h(int param0) {
        nk.field_s[6] = -2;
        nk.field_s[7] = -1;
        nk.field_s[17] = -1;
        nk.field_s[4] = -1;
        nk.field_s[16] = -1;
        nk.field_s[2] = -2;
        nk.field_s[8] = -2;
        nk.field_s[13] = -1;
        nk.field_s[1] = 16;
        nk.field_s[3] = -1;
        nk.field_s[10] = -1;
        nk.field_s[param0] = -1;
        nk.field_s[5] = -1;
        nk.field_s[12] = -1;
        nk.field_s[9] = -1;
        nk.field_s[18] = 1;
    }

    private final void c(byte param0) {
        String var2 = ol.a(124);
        ol.a(var2, true, ip.a(param0 - 81));
        if (param0 != 90) {
          this.k(30);
        }
    }

    private final void l(int param0) {
        hh.field_d[1] = true;
        if (param0 != 0) {
          String var3 = (String) null;
          this.a(43, (String) null, -13);
        }
    }

    final void e(byte param0) {
        int stackIn_29_0 = 0;
        boolean stackIn_30_1 = false;
        int var2;
        int var3;
        hi var4;
        int var5;
        var5 = Torquing.field_u;
        var2 = fa.field_e;
        var3 = -51 / ((param0 - 4) / 53);
        if (64 > var2 &&
          hh.field_d[var2]) {
          if (var2 == 0) {
            return;
          }
          if (1 != var2) {
            if (2 == var2) {
              il.f(-30593);
            } else {
              if (3 == var2) {
                vd.a(27912);
              } else {
                if (var2 == 4) {
                  wh.b(99);
                } else {
                  if (var2 != 5) {
                    if (6 != var2) {
                      if (var2 != 7) {
                        if (var2 == 8) {
                          nh.a(nk.field_u, oo.field_a, kj.field_d, (byte) -126);
                        } else {
                          if (var2 == 16) {
                            ti.b(1);
                          } else {
                            if (11 != var2 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                ld.a((byte) 123);
                                return;
                              }
                              if (var2 == 17) {
                                this.k(1);
                                return;
                              }
                              if (18 == var2) {
                                mm.a((byte) 60);
                                return;
                              }
                              nn.a("MGS1: " + me.a(-1), (Throwable) null, -9958);
                              ih.b(true);
                              return;
                            }
                            stackIn_29_0 = -11936;
                            stackIn_30_1 = (var2 == 12);
                            var4 = pa.a(stackIn_29_0, stackIn_30_1);
                            ga.a(false, var4);
                          }
                        }
                      } else {
                        this.c((byte) 90);
                      }
                    } else {
                      en.e((byte) 50);
                    }
                  } else {
                    ij.e(10078);
                  }
                }
              }
            }
          } else {
            uf.b(-109);
          }
          return;
        }
        nn.a("MGS2: " + me.a(-1), (Throwable) null, -9958);
        ih.b(true);
    }

    private final void i(int param0) {
        hh.field_d[2] = true;
        if (param0 != 24500) {
          this.b(false, 7);
        }
    }

    private final void a(boolean param0, byte param1) {
        hh.field_d[7] = true;
        hh.field_d[16] = true;
        if (param1 > -90) {
          return;
        }
        hh.field_d[8] = param0;
        hh.field_d[17] = true;
        hh.field_d[0] = true;
        hh.field_d[18] = true;
        hh.field_d[3] = true;
    }

    final int g(int param0) {
        int var2;
        int var3;
        var2 = -125 / ((param0 - 70) / 47);
        var3 = this.j(-93);
        if (0 == var3 ||
          1 == var3) {
          if (hh.field_d[1]) {
            kf.b(2, -8190);
          }
          if (hh.field_d[2]) {
            ag.a((byte) -45, 3);
          }
          if (hh.field_d[3]) {
            jm.a(4, 0);
          }
          if (hh.field_d[4]) {
            km.a((byte) -128, 5);
          }
          if (hh.field_d[5]) {
            jd.a(true, 6);
          }
          if (hh.field_d[6]) {
            fa.a(7, -21386);
          }
          if (hh.field_d[8]) {
            kg.a(112);
          }
        }
        return var3;
    }

    private final void k(int param0) {
        int var2 = kj.field_d.i((byte) -101);
        int var3 = (param0 & var2) != 0 ? 1 : 0;
        int var4 = -1 + oo.field_a;
        byte[] var5 = new byte[var4];
        kj.field_d.b(0, param0 + 7, var5, var4);
        a.a(var3 != 0, lj.a(var5, false), ip.a(9), 3);
    }

    private final void d(byte param0) {
        if (param0 != 84) {
          this.field_l = -57;
        }
        hh.field_d[5] = true;
    }

    final void a(int param0, String param1, int param2) {
        try {
          this.a((byte) 88, param0, 480, 640, param1);
          int var4_int = 56 % ((28 - param2) / 53);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "tg.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(boolean param0, int param1) {
        if (param1 > -85) {
          this.f(93);
        }
        return this.a(param0, true, true);
    }

    private final int j(int param0) {
        if (this.field_e) {
          return -1;
        }
        if (!mk.a((byte) 38)) {
          return -1;
        }
        if (param0 > -68) {
          return 107;
        }
        if (gk.field_a) {
          return -1;
        }
        int var2 = vb.a(fo.i(17543), ki.i(20), (byte) 27, true, this.field_j, this.field_q);
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (op.field_i == 11 &&
            aj.field_J == 0) {
            qa.a((byte) -95);
          }
          return var2;
        }
        if (!hg.field_c) {
          this.a(10, "reconnect");
        }
        lg.h(-128);
        dc.a(var2, pl.field_u, 2);
        gk.field_a = true;
        ta.field_k = 15000L + km.b(-1);
        return var2;
    }

    private final void f(int param0) {
        hh.field_d[param0] = true;
    }

    final void n(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3;
        boolean stackIn_11_1 = false;
        var3 = Torquing.field_u;
        if (la.a(true)) {
          stackIn_11_1 = (dg.field_i != null);
          discarded$4 = this.a(stackIn_11_1, false, true);
        } else {
          if (b.field_x >= 10) {
            if (pl.b(-115)) {
              if (op.field_i != 0) {
                ue.a(-16513, da.field_g);
              } else {
                discarded$5 = this.a(false, false, true);
              }
            } else {
              pg.a((byte) -3);
            }
          }
        }
        if (param0 < 0) {
          this.field_j = false;
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(param4, (byte) -116);
        if (param3) {
          this.l(0);
        }
        if (param2) {
          this.i(24500);
        }
        if (param0) {
          this.f(4);
        }
        if (param1) {
          this.d((byte) 84);
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, String param4) {
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          if (param0 < 80) {
            this.field_q = -47;
          }
          try {
            if (!this.b(false)) {
              return;
            }
            this.field_i = this.getCodeBase().getHost();
            var6 = this.field_i.toLowerCase();
            stackIn_9_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_j = stackIn_9_1;
            this.field_p = Integer.parseInt(this.getParameter("gameport1"));
            this.field_m = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_l = Integer.parseInt(var7);
            }
            this.field_r = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_s = Long.parseLong(this.getParameter("instanceid"));
            this.field_o = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_k = Integer.parseInt(var8);
            }
            if (this.field_k >= 5) {
              this.field_k = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_q = Integer.parseInt(var9);
            }
            ii.field_n = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(this.field_r, 121, param4, param2, param3, 32, param1);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            nn.a((String) null, (Throwable) ((Object) var6_ref), -9958);
            this.a(10, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var6_ref2;
          stackIn_24_1 = new StringBuilder().append("tg.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
          boolean stackIn_6_0 = false;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          fj var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Torquing.field_u;
          var4 = vb.a(da.field_g, sn.field_i, param0, 32);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            stackIn_6_0 = !param2;
            var5_int = uj.a(hb.a(stackIn_6_0), (byte) 75, wp.b(-118));
            if (-1 != var5_int) {
              wb.a(var5_int, kh.field_n, (byte) -94, pl.field_u);
              kh.field_n = null;
              pl.field_u = null;
            }
            var11 = qd.a(-112);
            if (var11 != null) {
              nl.a(-2, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = od.a(wd.a(-19), -124, fo.i(17543), of.d((byte) -87), this.field_q, oc.a(false), ki.i(20));
            if (var5_intLifetime1 != -1) {
              gk.a(-5006, pl.field_u, kh.field_n, var5_intLifetime1);
              pl.field_u = null;
              kh.field_n = null;
            }
          }
          if (3 == var4) {
            if (aj.field_J != -1 &&
              0 != aj.field_J) {
              aj.field_J = -1;
              jl.b((byte) 106);
            }
            if (!param1) {
              var5_intLifetime2 = vb.a(fo.i(17543), ki.i(20), (byte) 27, false, this.field_j, this.field_q);
              if (-1 != var5_intLifetime2) {
                if (var5_intLifetime2 != 0) {
                  dc.a(var5_intLifetime2, pl.field_u, 2);
                  pl.field_u = null;
                } else {
                  gf.field_f = qd.field_e;
                  qa.a((byte) -106);
                  kb.field_h = false;
                  op.field_i = 10;
                }
              }
            } else {
              gk.field_a = false;
            }
          }
          if (var4 == 4) {
            if (!ao.field_b) {
              op.field_i = 10;
              kb.field_h = true;
            } else {
              bc.a(ip.a(9), (byte) 108);
            }
          }
          if (var4 == 5) {
            to.a(ip.a(9), -20);
          }
          if (var4 == 6 &&
            r.field_c) {
            op.field_i = 10;
          }
          if (var4 == 7) {
            tp.a(ip.a(9), -65);
          }
          if (!param2) {
            this.field_r = 12;
          }
          if (8 == var4) {
            bc.a(ip.a(9), (byte) 108);
          }
          if (var4 == 9) {
            bi.a(ip.a(9), (byte) -126);
          }
          if (var4 == 10) {
            wa.field_d.f(120, 17);
          }
          if (var4 == 11) {
            gq.a(25530, ip.a(9));
          }
          if (12 == var4) {
            ul.a(0, ah.c(2048), ip.a(9));
          }
          if (var4 == 13) {
            try {
              if (null == ub.field_G) {
                ub.field_G = new mm(nk.field_u, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ub.field_G.a(3)) {
                var12 = ub.field_G.a(true);
                if (var12 == null) {
                  var9 = (String) null;
                  hn.a((String) null, (byte) -126);
                } else {
                  var7 = hk.a(var12.field_n, true, 0, var12.field_j);
                  hn.a(var7, (byte) -84);
                }
                ub.field_G = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              nn.a("S1", (Throwable) ((Object) var5), -9958);
              var10 = (String) null;
              hn.a((String) null, (byte) -87);
              ub.field_G = null;
            }
          }
          if (var4 == 15) {
            op.field_i = 10;
          }
          if (var4 == 16) {
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

    protected tg() {
    }

    static {
    }
}
