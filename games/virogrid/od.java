/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class od extends uk {
    private int field_r;
    static String[] field_n;
    String field_v;
    private int field_w;
    static String field_t;
    static int[] field_m;
    static String field_l;
    private int field_o;
    private boolean field_q;
    private int field_p;
    private long field_s;
    private int field_z;
    private boolean field_x;
    private boolean field_u;
    static km field_y;
    private int field_k;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        int var10 = -93 / ((2 - param7) / 60);
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        ih.field_c = this.field_o;
        dg.a((byte) -53, ih.field_c);
        wg.a(ih.field_c, 5000, this.field_p, this.field_s, ei.field_c, this.field_x, 64, param6, 5000, this.field_r, param0, this.field_v, this.field_w, this.field_z);
        ch.a(this.field_p, ei.field_c, this.field_z, param0, this.field_v, ih.field_c, 86, this.field_r, this.field_w);
        lb.a(42);
        sb.field_d = s.a((byte) -110);
        nn.a(fi.field_v, (byte) -128);
        ae.field_a = param1;
        ck.field_c = param2;
        ka.field_j = param5;
        ej.field_P = param3;
        te.field_h = param4;
        this.c((byte) 116);
        kn.g(20128);
    }

    private final void o(int param0) {
        di.field_r[13] = true;
        di.field_r[param0] = true;
        di.field_r[11] = true;
    }

    private final void i(int param0) {
        if (param0 > -10) {
          return;
        }
        String var2 = ti.a(-47);
        qk.a(var2, mb.g((byte) 24), -1);
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          Exception var6 = null;
          jc var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var5Lifetime2;
          int var5Lifetime3;
          var9 = Virogrid.field_F ? 1 : 0;
          var4 = cc.a(ih.field_c, og.field_b, false, param1);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5 = ii.a(hh.a(-30890), je.h(true), 27984);
            if (-1 != var5) {
              al.a(ld.field_g, var5, jf.field_b, 100);
              jf.field_b = null;
              ld.field_g = null;
            }
            var12 = fi.e(true);
            if (var12 != null) {
              mj.a(0, var12.booleanValue());
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = ld.a((byte) 2, ag.a(true), jl.a(-127), ne.a((byte) -52), eh.d(86), f.a(8), this.field_k);
            if (-1 != var5Lifetime1) {
              fn.a(var5Lifetime1, 105, jf.field_b, ld.field_g);
              jf.field_b = null;
              ld.field_g = null;
            }
          }
          if (var4 == 3) {
            if (nh.field_o != -1 &&
              0 != nh.field_o) {
              nh.field_o = -1;
              rl.e(true);
            }
            if (!param2) {
              var5Lifetime2 = pa.a(f.a(8), false, this.field_k, (byte) -57, this.field_u, ne.a((byte) -52));
              if (var5Lifetime2 != -1) {
                if (var5Lifetime2 != 0) {
                  a.a(ld.field_g, var5Lifetime2, false);
                  ld.field_g = null;
                } else {
                  ae.field_d = md.field_a;
                  sg.a(-2);
                  j.field_l = 10;
                  oi.field_d = false;
                }
              }
            } else {
              ri.field_f = false;
            }
          }
          if (4 == var4) {
            if (!wg.field_c) {
              j.field_l = 10;
              oi.field_d = true;
            } else {
              sd.a(5, mb.g((byte) -86));
            }
          }
          if (5 == var4) {
            ha.a((byte) 39, mb.g((byte) -117));
          }
          if (var4 == 6 &&
            pg.field_h) {
            j.field_l = 10;
          }
          if (var4 == 7) {
            sf.a(true, mb.g((byte) 79));
          }
          var5Lifetime3 = -46 / ((param0 + 49) / 63);
          if (var4 == 8) {
            sd.a(5, mb.g((byte) 48));
          }
          if (var4 == 9) {
            oa.a(mb.g((byte) -107), 0);
          }
          if (var4 == 10) {
            gk.field_g.g(17, 8);
          }
          if (var4 == 11) {
            dc.a(-11670, mb.g((byte) -103));
          }
          if (12 == var4) {
            pi.a(pg.a(-1), -17713, mb.g((byte) 8));
          }
          if (var4 == 13) {
            try {
              if (nb.field_p == null) {
                nb.field_p = new og(ei.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (nb.field_p.a(5038)) {
                var7 = nb.field_p.d(18240);
                if (var7 == null) {
                  var10 = (String) null;
                  kd.a((byte) 92, (String) null);
                } else {
                  var8 = nf.a(var7.field_l, (byte) -122, 0, var7.field_g);
                  kd.a((byte) 78, var8);
                }
                nb.field_p = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              en.a("S1", (Throwable) ((Object) var6), 1);
              var11 = (String) null;
              kd.a((byte) -114, (String) null);
              nb.field_p = null;
            }
          }
          if (var4 == 15) {
            j.field_l = 10;
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

    private final void a(int param0, int param1, String param2, int param3, int param4) {
        boolean stackIn_8_1 = false;
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
            if (!this.a((byte) 99)) {
              return;
            }
            this.field_v = this.getCodeBase().getHost();
            var6 = this.field_v.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_u = stackIn_8_1;
            this.field_w = Integer.parseInt(this.getParameter("gameport1"));
            this.field_z = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_r = Integer.parseInt(var7);
            }
            this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_s = Long.parseLong(this.getParameter("instanceid"));
            this.field_x = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_o = Integer.parseInt(var8);
            }
            if (this.field_o >= 5) {
              this.field_o = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_k = Integer.parseInt(var9);
            }
            if (param1 != 0) {
              return;
            }
            li.field_i = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(62, param0, param4, 32, this.field_p, param3, param2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            en.a((String) null, (Throwable) ((Object) var6_ref), 1);
            this.a(-25296, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("od.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int j(int param0) {
        int var2;
        if (this.field_i) {
          return -1;
        }
        if (!eg.b((byte) -107)) {
          return -1;
        }
        if (param0 < 19) {
          field_t = (String) null;
        }
        if (ri.field_f) {
          return -1;
        }
        var2 = pa.a(f.a(8), true, this.field_k, (byte) -57, this.field_u, ne.a((byte) -52));
        if (-1 == var2) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!oc.field_l) {
            this.a(-25296, "reconnect");
          }
          ve.c((byte) -105);
          a.a(ld.field_g, var2, false);
          ri.field_f = true;
          hc.field_a = hc.a(-9986) + 15000L;
          return var2;
        }
        if (11 == j.field_l &&
          nh.field_o == 0) {
          sg.a(-2);
        }
        return var2;
    }

    private final void c(byte param0) {
        jc.field_i[7] = -1;
        jc.field_i[4] = -1;
        jc.field_i[16] = -1;
        jc.field_i[8] = -2;
        jc.field_i[2] = -2;
        jc.field_i[12] = -1;
        jc.field_i[9] = -1;
        jc.field_i[5] = -1;
        jc.field_i[13] = -1;
        if (param0 <= 75) {
          this.a(false, -38);
        }
        jc.field_i[18] = 1;
        jc.field_i[6] = -2;
        jc.field_i[3] = -1;
        jc.field_i[17] = -1;
        jc.field_i[10] = -1;
        jc.field_i[11] = -1;
        jc.field_i[1] = 16;
    }

    private final void l(int param0) {
        di.field_r[2] = true;
        if (param0 != 25745) {
          field_t = (String) null;
        }
    }

    final void a(String param0, int param1, byte param2) {
        try {
          this.a(480, 0, param0, param1, 640);
          if (param2 < 99) {
            field_t = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "od.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int g(int param0) {
        int var2;
        var2 = this.j(80);
        if (var2 == param0 ||
          1 == var2) {
          if (di.field_r[1]) {
            mi.a(2, 12);
          }
          if (di.field_r[2]) {
            o.a(3, (byte) 109);
          }
          if (di.field_r[3]) {
            pj.a(4, param0 - 11513);
          }
          if (di.field_r[4]) {
            dj.a(2, 5);
          }
          if (di.field_r[5]) {
            ne.a((byte) 19, 6);
          }
          if (di.field_r[6]) {
            kl.a((byte) -52, 7);
          }
          if (di.field_r[8]) {
            ti.c(param0 ^ -128);
          }
        }
        return var2;
    }

    private final void k(int param0) {
        if (param0 <= 110) {
          return;
        }
        di.field_r[5] = true;
    }

    final void a(boolean param0, int param1) {
        int stackIn_24_0 = 0;
        String stackIn_107_0 = null;
        boolean stackIn_108_1 = false;
        boolean stackIn_111_2 = false;
        int stackIn_140_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Virogrid.field_F ? 1 : 0;
        if (kk.field_q != null) {
          if (null == ih.field_b) {
            var6 = bf.a(0);
            var4 = var6.getSize();
            kk.field_q.a(var4.width, var4.height, (byte) -107);
          }
          kk.field_q.b(-7927);
        }
        th.b((byte) 112);
        vc.h((byte) -47);
        if (!j.a(-1) &&
          j.field_l != 11) {
          vj.a((byte) -119);
        }
        if (null != sb.field_d) {
          og.field_b = sb.field_d.a(-23273);
        }
        if (wl.b((byte) -70)) {
          var3 = 1200 * wh.a((byte) 5);
          if (this.field_q ||
            !(lj.c(-28791807) <= var3) &&
            !(km.e(-87) <= var3)) {
            this.field_q = false;
            tn.a(false);
            ve.c((byte) -50);
            a.a(je.field_H, 2, false);
            sa.a(-76);
            ri.field_f = true;
            hc.field_a = 15000L + hc.a(-9986);
          }
        }
        if (-1 == nh.field_o ||
          nh.field_o == 0) {
          stackIn_24_0 = (nh.field_o != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          nh.field_o = m.b(true);
          if (var3Lifetime1 != 0 &&
            nh.field_o == 0 &&
            j.field_l == 11 &&
            !eg.b((byte) -81)) {
            sg.a(-2);
          }
          if (nh.field_o != -1 &&
            0 != nh.field_o) {
            hc.field_a = 15000L + hc.a(-9986);
          }
        }
        if (param1 < 32) {
          this.field_w = 59;
        }
        if (nh.field_o != -1 &&
          nh.field_o != 0) {
          if (10 > dj.field_n) {
            if (nh.field_o != 3) {
              if (nh.field_o != 4) {
                if (nh.field_o == 2) {
                  this.a(-25296, "js5connect_full");
                } else {
                  if (nh.field_o == 5) {
                    this.a(-25296, "outofdate");
                  } else {
                    this.a(-25296, "js5connect");
                  }
                }
              } else {
                this.a(-25296, "js5io");
              }
            } else {
              this.a(-25296, "js5crc");
            }
          } else {
            if (j.field_l >= 10) {
              ve.c((byte) 90);
              if (nh.field_o != 3) {
                if (4 == nh.field_o) {
                  a.a(i.field_v, 256, false);
                } else {
                  if (2 == nh.field_o) {
                    a.a(gb.field_L, 256, false);
                  } else {
                    if (nh.field_o != 5) {
                      a.a(li.field_b, 256, false);
                    } else {
                      a.a(bm.field_g, 5, false);
                    }
                  }
                }
              } else {
                a.a(sj.field_k, 256, false);
              }
              ri.field_f = true;
            }
          }
        }
        if ((-1 != nh.field_o &&
          nh.field_o != 0 ||
          eg.b((byte) -79)) &&
          hc.field_a <= hc.a(-9986)) {
          ri.field_f = false;
          if (nh.field_o != -1 &&
            0 != nh.field_o) {
            nh.field_o = -1;
            rl.e(true);
          }
        }
        if (0 == nh.field_o &&
          !eg.b((byte) -82)) {
          j.field_g = false;
        }
        if (dj.field_n == 0 &&
          ga.h(-20940)) {
          dj.field_n = 1;
        }
        if (dj.field_n == 1) {
          if (0 != ih.field_c) {
            sj.field_l = p.a(76, ej.field_P);
          }
          td.field_a = qd.a(false, 1, true, ka.field_j, (byte) 70);
          jf.field_j = qd.a(false, 1, true, te.field_h, (byte) 81);
          qn.field_I = qd.a(false, 1, true, ae.field_a, (byte) 82);
          s.field_a = jf.field_j;
          dj.field_n = 2;
          ge.field_c = td.field_a;
        }
        if (dj.field_n == 2) {
          if (sj.field_l != null &&
            sj.field_l.c(0)) {
            if (!sj.field_l.a("", true)) {
              sj.field_l = null;
            } else {
              if (sj.field_l.a((byte) -102, "")) {
                lb.a(-1, sj.field_l);
                sj.field_l = null;
                sb.a(-122);
              }
            }
          }
          if (null == sj.field_l) {
            dj.field_n = 3;
          }
        }
        if (dj.field_n == 3 &&
          ln.a((byte) 127, jf.field_j, td.field_a, qn.field_I) &&
          i.a((byte) 110, qn.field_I)) {
          ci.c((byte) 45);
          ba.b(14);
          ne.field_g = ul.field_e;
          pg.field_h = false;
          jf.a(wg.field_c, jf.field_j, td.field_a, qn.field_I, -1);
          if (af.field_b ||
            ad.field_j != null) {
            stackIn_107_0 = ad.field_j;
            stackIn_108_1 = !(af.field_b);
            stackIn_111_2 = !(af.field_b);
            mi.a(stackIn_107_0, stackIn_108_1, stackIn_111_2, true);
          }
          if (li.field_i) {
            jk.a(-26700);
          }
          if (em.field_a == null) {
            em.field_a = hm.a(-94);
            td.field_f = wd.a((byte) 88);
          }
          ig.a(false, em.field_a, qn.field_I, td.field_f);
          td.field_a = null;
          jf.field_j = null;
          qn.field_I = null;
          nl.a((java.applet.Applet) (this), 17574);
          sb.a(-78);
          dj.field_n = 10;
        }
        if (10 == dj.field_n) {
          if (ih.field_c != 0) {
            uh.field_e = p.a(34, ck.field_c);
          }
          dj.field_n = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (dj.field_n == 11) {
          if (null != uh.field_e && (!uh.field_e.c(0) ||
            !uh.field_e.b(25867))) {
            al.a(db.a(uh.field_e, jd.field_b, (byte) -90, aa.field_d), 13, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            i.field_w = true;
            dj.field_n = 12;
          }
        }
        if (dj.field_n == 12 &&
          !i.field_w) {
          dj.field_n = 13;
        }
        if (13 == dj.field_n) {
          var3Lifetime2 = 1;
          if (lb.field_c != null) {
            stackIn_140_0 = (!lb.field_c.a(true)) ? 0 : 1;
            var3Lifetime2 = stackIn_140_0;
            al.a(lb.field_c.field_j, 13, lb.field_c.field_a);
          }
          if (var3Lifetime2 != 0) {
            dj.field_n = 20;
          }
        }
        if (!param0 &&
          km.field_Db) {
          af.a((byte) -116, fi.field_v);
          this.e(21616);
          nn.a(fi.field_v, (byte) -124);
        }
        if (di.field_r[8]) {
          rc.c(-1);
        }
    }

    private final void d(byte param0) {
        if (param0 <= 59) {
          field_m = (int[]) null;
        }
        di.field_r[6] = true;
    }

    final static void a(pd param0, Object param1, byte param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (null == param0.field_w) {
            return;
          }
          var3_int = 0;
          if (param2 > -95) {
            field_t = (String) null;
          }
          while (var3_int < 50) {
            if (null != param0.field_w.peekEvent()) {
              mm.a(-118, 1L);
              var3_int++;
              continue;
            }
            break;
          }
          try {
            if (param1 != null) {
              param0.field_w.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("od.HA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void p(int param0) {
        if (param0 <= 97) {
          return;
        }
        di.field_r[1] = true;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        la.field_k = param0;
        if (param2) {
          Object var5 = (Object) null;
          od.a((pd) null, (Object) null, (byte) -5);
        }
        sf.field_I = param3;
        na.field_Hb = param1;
    }

    private final void b(byte param0) {
        if (param0 != 12) {
          this.p(-69);
        }
        di.field_r[4] = true;
    }

    final void m(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 != 1) {
          od.a(36, 8, true, 93);
        }
        if (me.b(param0 ^ 102)) {
          stackIn_11_1 = 30;
          stackIn_12_2 = (null != ih.field_b);
          discarded$4 = this.a(stackIn_11_1, stackIn_12_2, false);
        } else {
          if (dj.field_n >= 10) {
            if (nm.c(2)) {
              if (j.field_l != 0) {
                jb.a(og.field_b, 45);
              } else {
                discarded$5 = this.a(-118, false, false);
              }
            } else {
              ee.a(true);
            }
          }
        }
    }

    private final void h(int param0) {
        int var2 = sh.field_qb.g(11132);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        if (param0 != -6731) {
          this.field_w = 83;
        }
        int var4 = ba.field_a - 1;
        byte[] var5 = new byte[var4];
        sh.field_qb.a(-121, 0, var5, var4);
        eh.a(i.a(param0 + 4709, var5), mb.g((byte) -95), (byte) -25, var3 != 0);
    }

    final int c(boolean param0, int param1) {
        int var3 = -78 / ((param1 + 20) / 63);
        return this.a(-114, param0, true);
    }

    final void n(int param0) {
        boolean stackIn_28_0 = false;
        int var2;
        cj var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        var2 = ci.field_q;
        if (var2 < 64 &&
          di.field_r[var2]) {
          if (param0 >= -100) {
            return;
          }
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              if (var2 == 3) {
                ob.a((byte) 97);
              } else {
                if (var2 != 4) {
                  if (var2 == 5) {
                    fb.a(26360);
                  } else {
                    if (var2 == 6) {
                      pe.a(-1);
                    } else {
                      if (var2 != 7) {
                        if (8 != var2) {
                          if (16 == var2) {
                            mb.i((byte) 115);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                ri.a((byte) 126);
                                return;
                              }
                              if (var2 == 17) {
                                this.h(-6731);
                                return;
                              }
                              if (18 == var2) {
                                he.i(-532);
                                return;
                              }
                              en.a("MGS1: " + rg.a(true), (Throwable) null, 1);
                              tn.a(false);
                              return;
                            }
                            stackIn_28_0 = (var2 == 12);
                            var3 = el.a(stackIn_28_0, 0);
                            cf.a(var3, (byte) 78);
                          }
                        } else {
                          ln.a(84, ba.field_a, ei.field_c, sh.field_qb);
                        }
                      } else {
                        this.i(-50);
                      }
                    }
                  }
                } else {
                  sb.a((byte) -61);
                }
              }
            } else {
              km.d((byte) 76);
            }
          } else {
            el.e(-2);
          }
          return;
        }
        en.a("MGS2: " + rg.a(true), (Throwable) null, 1);
        tn.a(false);
    }

    public static void d(boolean param0) {
        field_t = null;
        if (param0) {
          return;
        }
        field_m = null;
        field_l = null;
        field_n = null;
        field_y = null;
    }

    final static String b(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = param0; var2_int > var4; var4++) {
            var3[-1 + var2_int - var4] = param1.charAt(var4);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("od.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void b(boolean param0, int param1) {
        int discarded$0 = 0;
        di.field_r[3] = true;
        di.field_r[0] = true;
        di.field_r[8] = param0;
        di.field_r[18] = true;
        di.field_r[7] = true;
        di.field_r[17] = true;
        if (param1 < 31) {
          discarded$0 = this.a(-36, true, true);
        }
        di.field_r[16] = true;
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.b(true, 53);
        if (param2 >= -115) {
          this.field_p = 9;
        }
        if (param0) {
          this.p(102);
        }
        if (param6) {
          this.l(25745);
        }
        if (param5) {
          this.b((byte) 12);
        }
        if (param4) {
          this.k(116);
        }
        if (param1) {
          this.d((byte) 113);
        }
        if (param3) {
          this.o(12);
        }
    }

    protected od() {
    }

    static {
        field_n = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_t = "This entry doesn't match";
        field_m = new int[4];
        field_l = null;
    }
}
