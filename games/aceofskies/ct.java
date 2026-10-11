/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ct extends vb {
    private int field_F;
    static gu field_t;
    private int field_E;
    private int field_y;
    private int field_s;
    private boolean field_q;
    private boolean field_r;
    private int field_D;
    private int field_u;
    String field_w;
    private long field_z;
    static ej field_H;
    static String field_C;
    static int[] field_v;
    static float field_I;
    static int field_x;
    private boolean field_A;
    static int field_B;

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
          rb var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = AceOfSkies.field_G ? 1 : 0;
          var4 = b.a(nh.field_e, (byte) 72, param1, fb.field_e);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = bb.a(gt.a((byte) -46), (byte) 127, ju.e(123));
            if (-1 != var5_int) {
              gt.a(param0 + 115, rp.field_m, var5_int, sd.field_j);
              rp.field_m = null;
              sd.field_j = null;
            }
            var11 = ct.h(122);
            if (var11 != null) {
              qf.a((byte) 77, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = mj.a(la.a(4), param0 ^ 11, this.field_E, ve.a(true), ce.g(-3), sa.b(-25752), of.a(false));
            if (-1 != var5_intLifetime1) {
              pp.a(sd.field_j, var5_intLifetime1, rp.field_m, param0 + 26318);
              sd.field_j = null;
              rp.field_m = null;
            }
          }
          if (var4 == 3) {
            if (-1 != sk.field_a &&
              0 != sk.field_a) {
              sk.field_a = -1;
              wj.e(104);
            }
            if (param2) {
              vs.field_f = false;
            } else {
              var5_intLifetime2 = pi.a(this.field_E, la.a(4), 0, this.field_r, sa.b(-25752), false);
              if (var5_intLifetime2 != -1) {
                if (0 != var5_intLifetime2) {
                  li.a(param0 ^ 118, var5_intLifetime2, rp.field_m);
                  rp.field_m = null;
                } else {
                  dl.field_o = as.field_b;
                  um.d(param0 ^ 9);
                  ob.field_d = 10;
                  ks.field_b = false;
                }
              }
            }
          }
          if (4 == var4) {
            if (!te.field_h) {
              ob.field_d = 10;
              ks.field_b = true;
            } else {
              la.a(true, bm.m(117));
            }
          }
          if (var4 == 5) {
            rr.a((byte) -96, bm.m(119));
          }
          if (6 == var4 &&
            nq.field_a) {
            ob.field_d = 10;
          }
          if (var4 == 7) {
            po.a(bm.m(param0 + 117), (byte) -104);
          }
          if (var4 == param0) {
            la.a(true, bm.m(param0 ^ 114));
          }
          if (var4 == 9) {
            lb.a(61, bm.m(param0 + 119));
          }
          if (var4 == 10) {
            q.field_p.g(100, 17);
          }
          if (var4 == 11) {
            jn.a((byte) 124, bm.m(107));
          }
          if (var4 == 12) {
            vi.a((byte) 103, kb.a(-1903710079), bm.m(107));
          }
          if (var4 == 13) {
            try {
              if (null == hb.field_a) {
                hb.field_a = new cc(pt.field_b, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (hb.field_a.a((byte) 118)) {
                var12 = hb.field_a.a(true);
                if (var12 != null) {
                  var7 = hf.a(65, var12.field_g, 0, var12.field_f);
                  hp.a((byte) -121, var7);
                } else {
                  var9 = (String) null;
                  hp.a((byte) -117, (String) null);
                }
                hb.field_a = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              v.a("S1", (byte) -52, (Throwable) ((Object) var5));
              var10 = (String) null;
              hp.a((byte) -112, (String) null);
              hb.field_a = null;
            }
          }
          if (15 == var4) {
            ob.field_d = 10;
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

    final void a(byte param0, String param1, int param2) {
        try {
          this.a(640, true, param1, param2, 480);
          if (param0 != -60) {
            this.field_z = -63L;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ct.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void e(byte param0) {
        String var2 = pl.b(111);
        rr.a(var2, (byte) -108, bm.m(108));
        int var3 = 64 % ((56 - param0) / 61);
    }

    final void i(int param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        int var3;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 4) {
          return;
        }
        if (!jr.a((byte) 32)) {
          if (bl.field_c >= 10) {
            if (uk.a((byte) -5)) {
              if (ob.field_d == 0) {
                discarded$0 = this.a(8, false, false);
              } else {
                ic.a(nh.field_e, false);
              }
            } else {
              rp.b(param0 - 3);
            }
          }
        } else {
          stackIn_4_1 = 8;
          stackIn_5_2 = (null != jf.field_a);
          discarded$1 = this.a(stackIn_4_1, stackIn_5_2, false);
        }
    }

    private final void a(int param0, boolean param1, String param2, int param3, int param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
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
            if (!this.b(param1)) {
              return;
            }
            this.field_w = this.getCodeBase().getHost();
            var6 = this.field_w.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_r = stackIn_7_1;
            this.field_y = Integer.parseInt(this.getParameter("gameport1"));
            this.field_F = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_s = Integer.parseInt(var7);
            }
            this.field_u = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_z = Long.parseLong(this.getParameter("instanceid"));
            this.field_A = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_D = Integer.parseInt(var8);
            }
            if (this.field_D >= 5) {
              this.field_D = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_E = Integer.parseInt(var9);
            }
            qr.field_b = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param0, 0, param3, param2, this.field_u, param4, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            v.a((String) null, (byte) -52, (Throwable) ((Object) var6_ref));
            this.a(-107, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var6_ref2;
          stackIn_23_1 = new StringBuilder().append("ct.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void n(int param0) {
        ho.field_d[12] = -1;
        ho.field_d[13] = -1;
        ho.field_d[5] = -1;
        ho.field_d[18] = 1;
        ho.field_d[8] = -2;
        ho.field_d[4] = -1;
        ho.field_d[11] = -1;
        ho.field_d[16] = -1;
        ho.field_d[17] = -1;
        ho.field_d[3] = -1;
        ho.field_d[10] = -1;
        ho.field_d[7] = -1;
        ho.field_d[6] = -2;
        ho.field_d[2] = -2;
        ho.field_d[1] = 16;
        ho.field_d[9] = param0;
    }

    final int a(boolean param0, int param1) {
        if (param1 > -21) {
          this.a(20, true);
        }
        return this.a(8, param0, true);
    }

    final int p(int param0) {
        int var2;
        var2 = this.j(-76);
        if (param0 != 16637) {
          return -117;
        }
        if (var2 == 0 ||
          1 == var2) {
          if (fh.field_e[1]) {
            io.a((byte) -117, 2);
          }
          if (fh.field_e[2]) {
            pl.c(3, 0);
          }
          if (fh.field_e[3]) {
            so.a(4, (byte) -39);
          }
          if (fh.field_e[4]) {
            eq.a((byte) 123, 5);
          }
          if (fh.field_e[5]) {
            tt.a(6, 2048);
          }
          if (fh.field_e[6]) {
            mj.a((byte) 84, 7);
          }
          if (fh.field_e[8]) {
            qs.a(-72);
          }
        }
        return var2;
    }

    private final void m(int param0) {
        int var2 = 98 % ((-68 - param0) / 54);
        fh.field_e[1] = true;
    }

    private final void g(int param0) {
        int var2 = 39 % ((-37 - param0) / 63);
        fh.field_e[4] = true;
    }

    private final void k(int param0) {
        int var2 = nm.field_c.g(-53);
        if (param0 > -75) {
          this.m(-11);
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + ag.field_s;
        byte[] var5 = new byte[var4];
        nm.field_c.a(var5, var4, 0, false);
        wc.a(ea.a(0, var5), bm.m(125), 14301, var3 != 0);
    }

    private final int j(int param0) {
        int var2;
        if (param0 >= -35) {
          this.e((byte) 71);
        }
        if (this.field_e) {
          return -1;
        }
        if (!dg.j(27711)) {
          return -1;
        }
        if (vs.field_f) {
          return -1;
        }
        var2 = pi.a(this.field_E, la.a(4), 0, this.field_r, sa.b(-25752), true);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!v.field_a) {
            this.a(-103, "reconnect");
          }
          rc.c((byte) 124);
          li.a(-2, var2, rp.field_m);
          vs.field_f = true;
          wg.field_b = kh.a(-76) + 15000L;
          return var2;
        }
        if (ob.field_d == 11 &&
          sk.field_a == 0) {
          um.d(1);
        }
        return var2;
    }

    private final void a(int param0, boolean param1) {
        fh.field_e[8] = param1;
        fh.field_e[17] = true;
        fh.field_e[0] = true;
        fh.field_e[3] = true;
        fh.field_e[18] = true;
        if (param0 == -16342) {
          fh.field_e[16] = true;
          fh.field_e[7] = true;
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param6 != 12) {
          this.a(false, -10);
        }
        fb.field_e = this.field_D;
        qm.a(fb.field_e, (byte) -44);
        ka.a(-31808, this.field_z, this.field_w, 5000, this.field_F, param1, this.field_A, 5000, fb.field_e, this.field_s, this.field_y, this.field_u, pt.field_b, param2);
        hh.a(this.field_F, this.field_w, this.field_y, param2, (byte) -36, pt.field_b, fb.field_e, this.field_u, this.field_s);
        du.k(-128);
        jd.field_c = qj.g(param6 + 8180);
        cd.a(ci.field_f, 42);
        hf.field_r = param0;
        ks.field_a = param7;
        ju.field_m = param5;
        mb.field_q = param3;
        uk.field_e = param4;
        this.n(-1);
        qj.h(34);
    }

    private final static Boolean h(int param0) {
        Boolean var1 = qj.field_r;
        if (param0 < 109) {
          ct.h(-116);
        }
        qj.field_r = null;
        return var1;
    }

    final void b(boolean param0, byte param1) {
        int stackIn_24_0 = 0;
        boolean stackIn_100_0 = false;
        String stackIn_102_1 = null;
        boolean stackIn_103_2 = false;
        int stackIn_134_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (aj.field_s != null) {
          if (jf.field_a == null) {
            var6 = nk.b((byte) 127);
            var4 = var6.getSize();
            aj.field_s.a(0, var4.width, var4.height);
          }
          aj.field_s.b(59);
        }
        kc.a(0);
        fb.a(92);
        if (!im.a(true) &&
          ob.field_d != 11) {
          mb.c((byte) 125);
        }
        if (null != jd.field_c) {
          nh.field_e = jd.field_c.b(12);
        }
        if (tg.a(-128)) {
          var3 = bl.a(101) * 1200;
          if (this.field_q ||
            !(var3 >= fb.b(0)) &&
            !(ro.c((byte) -37) <= var3)) {
            this.field_q = false;
            te.b(true);
            rc.c((byte) -110);
            li.a(11, 2, oi.field_b);
            np.b(34066);
            vs.field_f = true;
            wg.field_b = 15000L + kh.a(-105);
          }
        }
        if (sk.field_a == -1 ||
          sk.field_a == 0) {
          stackIn_24_0 = (sk.field_a != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          sk.field_a = lb.a(0);
          if (var3Lifetime1 != 0 &&
            0 == sk.field_a &&
            ob.field_d == 11 &&
            !dg.j(27711)) {
            um.d(1);
          }
          if (sk.field_a != -1 &&
            sk.field_a != 0) {
            wg.field_b = 15000L + kh.a(-100);
          }
        }
        if (sk.field_a != -1 &&
          sk.field_a != 0) {
          if (bl.field_c >= 10) {
            if (ob.field_d >= 10) {
              rc.c((byte) 122);
              if (sk.field_a != 3) {
                if (sk.field_a != 4) {
                  if (sk.field_a == 2) {
                    li.a(116, 256, eu.field_k);
                  } else {
                    if (sk.field_a == 5) {
                      li.a(-102, 5, ut.field_b);
                    } else {
                      li.a(-71, 256, rt.field_g);
                    }
                  }
                } else {
                  li.a(6, 256, vi.field_n);
                }
              } else {
                li.a(122, 256, fh.field_f);
              }
              vs.field_f = true;
            }
          } else {
            if (sk.field_a != 3) {
              if (sk.field_a == 4) {
                this.a(-109, "js5io");
              } else {
                if (sk.field_a != 2) {
                  if (sk.field_a != 5) {
                    this.a(-109, "js5connect");
                  } else {
                    this.a(-109, "outofdate");
                  }
                } else {
                  this.a(-109, "js5connect_full");
                }
              }
            } else {
              this.a(-116, "js5crc");
            }
          }
        }
        if ((sk.field_a != -1 &&
          0 != sk.field_a ||
          dg.j(27711)) &&
          wg.field_b <= kh.a(-119)) {
          vs.field_f = false;
          if (sk.field_a != -1 &&
            0 != sk.field_a) {
            sk.field_a = -1;
            wj.e(100);
          }
        }
        if (0 == sk.field_a &&
          !dg.j(27711)) {
          w.field_a = false;
        }
        if (param1 < 76) {
          return;
        }
        if (0 == bl.field_c &&
          sg.a(127)) {
          bl.field_c = 1;
        }
        if (bl.field_c == 1) {
          if (fb.field_e != 0) {
            ij.field_h = ot.a(-86, ju.field_m);
          }
          oi.field_a = sd.a(false, 1, true, false, uk.field_e);
          uj.field_b = sd.a(false, 1, true, false, ks.field_a);
          cf.field_f = sd.a(false, 1, true, false, mb.field_q);
          fg.field_t = uj.field_b;
          bl.field_c = 2;
          hg.field_x = oi.field_a;
        }
        if (bl.field_c == 2) {
          if (ij.field_h != null &&
            ij.field_h.b((byte) 104)) {
            if (!ij.field_h.a("", 116)) {
              ij.field_h = null;
            } else {
              if (ij.field_h.c("", -14012)) {
                ub.a((byte) -125, ij.field_h);
                ij.field_h = null;
                te.a(62);
              }
            }
          }
          if (null == ij.field_h) {
            bl.field_c = 3;
          }
        }
        if (3 == bl.field_c &&
          bu.a(uj.field_b, cf.field_f, oi.field_a, false) &&
          gh.a((byte) 15, cf.field_f)) {
          ps.a(true);
          om.c(5665);
          nq.field_a = false;
          dq.field_b = mp.field_e;
          cg.a(false, uj.field_b, oi.field_a, te.field_h, cf.field_f);
          if (qp.field_i ||
            fg.field_k != null) {
            stackIn_100_0 = !(qp.field_i);
            stackIn_102_1 = fg.field_k;
            stackIn_103_2 = !(qp.field_i);
            hr.a(stackIn_100_0, stackIn_102_1, stackIn_103_2, (byte) -61);
          }
          if (qr.field_b) {
            of.a(109);
          }
          if (rt.field_h == null) {
            rt.field_h = pj.c((byte) -101);
            co.field_c = ci.b(15);
          }
          du.a(co.field_c, 37, rt.field_h, cf.field_f);
          oi.field_a = null;
          uj.field_b = null;
          cf.field_f = null;
          wb.a((java.applet.Applet) (this), 17337);
          te.a(67);
          bl.field_c = 10;
        }
        if (bl.field_c == 10) {
          if (fb.field_e != 0) {
            fn.field_a = ot.a(-92, hf.field_r);
          }
          bl.field_c = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (bl.field_c == 11) {
          if (null != fn.field_a && (!fn.field_a.b((byte) -88) ||
            !fn.field_a.b(0))) {
            fh.a(-82, 0.0f, kc.a(dt.field_b, gm.field_w, fn.field_a, 50));
            decompiledFrameRemainder0 = false;
          }
          else {
            bl.field_c = 12;
            jn.field_t = true;
          }
        }
        if (bl.field_c == 12 &&
          !jn.field_t) {
          bl.field_c = 13;
        }
        if (bl.field_c == 13) {
          var3Lifetime2 = 1;
          if (null != hg.field_y) {
            stackIn_134_0 = (!hg.field_y.a(-18738)) ? 0 : 1;
            var3Lifetime2 = stackIn_134_0;
            fh.a(-59, hg.field_y.field_d, hg.field_y.field_j);
          }
          if (var3Lifetime2 != 0) {
            bl.field_c = 20;
          }
        }
        if (!param0 &&
          or.field_c) {
          pg.a(ci.field_f, -69);
          this.b(-14829);
          cd.a(ci.field_f, 37);
        }
        if (fh.field_e[8]) {
          ei.a(-114);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param4, false, param2, param3, param6, param5, param0 + 25, param1);
        if (param0 != -13) {
          this.e((byte) -88);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    private final void d(byte param0) {
        if (param0 != 56) {
          this.field_D = -65;
        }
        fh.field_e[2] = true;
    }

    final void a(byte param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(param0 - 16404, false);
        if (param3) {
          this.m(param0 - 41);
        }
        if (param2) {
          this.d((byte) 56);
        }
        if (param4) {
          this.g(67);
        }
        if (param1) {
          this.l(-11);
        }
        if (param0 != 62) {
          this.field_z = -91L;
        }
    }

    final void f(byte param0) {
        boolean stackIn_25_0 = false;
        int var2;
        int var3;
        s var4;
        int var5;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var2 = qs.field_b;
        var3 = -90 / ((param0 + 27) / 61);
        if (var2 < 64 &&
          fh.field_e[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            br.f(113);
          } else {
            if (2 == var2) {
              ce.a((byte) 116);
            } else {
              if (var2 != 3) {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (7 != var2) {
                        if (var2 == 8) {
                          ae.a(ag.field_s, nm.field_c, false, pt.field_b);
                        } else {
                          if (var2 == 16) {
                            vb.a(true);
                          } else {
                            if (var2 != 11 &&
                              12 != var2) {
                              if (13 == var2) {
                                se.a(-86);
                                return;
                              }
                              if (17 == var2) {
                                this.k(-105);
                                return;
                              }
                              if (var2 == 18) {
                                to.g(0);
                                return;
                              }
                              v.a("MGS1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                              te.b(true);
                              return;
                            }
                            stackIn_25_0 = (12 == var2);
                            var4 = um.a(stackIn_25_0, 1);
                            pj.a(0, var4);
                          }
                        }
                      } else {
                        this.e((byte) -94);
                      }
                    } else {
                      gu.a(4);
                    }
                  } else {
                    rq.a((byte) 126);
                  }
                } else {
                  qo.a((byte) -26);
                }
              } else {
                dh.a(120);
              }
            }
          }
          return;
        }
        v.a("MGS2: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
        te.b(true);
    }

    public static void o(int param0) {
        field_H = null;
        if (param0 != -12516) {
          field_t = (gu) null;
        }
        field_v = null;
        field_C = null;
        field_t = null;
    }

    private final void l(int param0) {
        int discarded$0 = 0;
        if (param0 != -11) {
          discarded$0 = this.j(-15);
        }
        fh.field_e[5] = true;
    }

    protected ct() {
    }

    static {
        field_t = new gu("");
        field_H = new ej(13, 0, 1, 0);
        field_B = 250;
        field_C = "Music: ";
    }
}
