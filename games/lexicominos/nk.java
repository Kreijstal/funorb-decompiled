/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nk extends qb {
    private int field_A;
    private int field_r;
    static int field_z;
    private int field_s;
    private int field_q;
    private int field_u;
    private int field_D;
    static String field_C;
    private boolean field_x;
    private boolean field_y;
    private boolean field_w;
    String field_B;
    private long field_v;
    static String field_t;

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ri.field_e = this.field_u;
        jh.a(14221, ri.field_e);
        sb.a(this.field_v, jh.field_a, this.field_q, 0, param2, param7, ri.field_e, this.field_s, param4, this.field_D, this.field_B, 5000, this.field_r, this.field_x);
        uk.a(this.field_D, this.field_s, ri.field_e, jh.field_a, this.field_r, (byte) -92, param7, this.field_q, this.field_B);
        li.g(false);
        rk.field_c = bl.a(115);
        ha.a(ug.field_y, (byte) 76);
        th.field_m = param6;
        ea.field_d = param0;
        ll.field_f = param1;
        ij.field_l = param3;
        gf.field_e = param5;
        this.g(7);
        vk.b(0);
    }

    private final void h(int param0) {
        String var2 = kg.g(0);
        if (param0 != 16) {
          this.field_w = true;
        }
        gg.a(true, kk.c(-14047), var2);
    }

    private final void j(int param0) {
        ij.field_o[4] = true;
        if (param0 >= -25) {
          this.l(-103);
        }
    }

    private final void i(int param0) {
        ij.field_o[2] = true;
        if (param0 != -1) {
          this.field_r = -84;
        }
    }

    private final void a(int param0, boolean param1) {
        ij.field_o[17] = true;
        ij.field_o[0] = true;
        ij.field_o[18] = true;
        ij.field_o[7] = true;
        ij.field_o[8] = param1;
        ij.field_o[16] = true;
        ij.field_o[param0] = true;
    }

    public static void c(byte param0) {
        if (param0 != 89) {
          nk.c((byte) -5);
        }
        field_t = null;
        field_C = null;
    }

    final int b(boolean param0, int param1) {
        if (param1 >= -51) {
          this.field_u = 35;
        }
        return this.a(true, 0, param0);
    }

    final void e(byte param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int discarded$4 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        if (ha.a(118)) {
          discarded$1 = this.a(false, 0, null != ff.field_b ? true : false);
        } else {
          if (10 > wf.field_i) {
          } else {
            if (!og.a(23440)) {
              ta.d(-108);
            } else {
              if (ta.field_g == 0) {
                discarded$3 = this.a(false, 0, false);
              } else {
                hb.a(gd.field_l, true);
              }
            }
          }
        }
        if (param0 < 4) {
          discarded$4 = this.a(true, 79, false);
        }
    }

    private final void g(int param0) {
        fg.field_f[5] = -1;
        fg.field_f[12] = -1;
        fg.field_f[8] = -2;
        fg.field_f[3] = -1;
        fg.field_f[1] = 16;
        fg.field_f[16] = -1;
        fg.field_f[13] = -1;
        fg.field_f[2] = -2;
        fg.field_f[6] = -2;
        fg.field_f[18] = 1;
        fg.field_f[4] = -1;
        fg.field_f[17] = -1;
        fg.field_f[11] = -1;
        fg.field_f[9] = -1;
        fg.field_f[param0] = -1;
        fg.field_f[10] = -1;
    }

    final void c(boolean param0, int param1) {
        int stackIn_25_0 = 0;
        String stackIn_102_0 = null;
        boolean stackIn_103_1 = false;
        boolean stackIn_106_2 = false;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (null != da.field_a) {
          if (ff.field_b == null) {
            var6 = jd.a(-88);
            var4 = var6.getSize();
            da.field_a.a(var4.height, (byte) -65, var4.width);
          }
          da.field_a.d(-1);
        }
        u.j(param1 ^ 6);
        bf.b((byte) -21);
        if (!lh.b(param1 ^ 24920) &&
          ta.field_g != 11) {
          kj.a((byte) 22);
        }
        if (null != rk.field_c) {
          gd.field_l = rk.field_c.c(82);
        }
        if (bd.c(false)) {
          var3 = cl.p(param1 - 127) * 1200;
          if (this.field_w ||
            !(ec.a(-28617) <= var3) &&
            !(var3 >= rf.a(30448))) {
            this.field_w = false;
            ck.$cfr$intArgs$b$e683eeaaf5b5(-125);
            ia.a((byte) 93);
            sc.a(2, (byte) -128, kk.field_i);
            l.i(57);
            kj.field_o = true;
            mc.field_i = rf.c(0) + 15000L;
          }
        }
        if (nc.field_r == -1 ||
          nc.field_r == 0) {
          stackIn_25_0 = (nc.field_r != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_25_0;
          nc.field_r = ea.a((byte) 105);
          if (var3Lifetime1 != 0 &&
            0 == nc.field_r &&
            ta.field_g == 11 &&
            !d.a((byte) 117)) {
            wb.b((byte) 50);
          }
          if (-1 != nc.field_r &&
            0 != nc.field_r) {
            mc.field_i = rf.c(0) + 15000L;
          }
        }
        if (nc.field_r != -1 &&
          nc.field_r != 0) {
          if (wf.field_i < 10) {
            if (3 == nc.field_r) {
              this.a("js5crc", 78);
            } else {
              if (nc.field_r != 4) {
                if (2 == nc.field_r) {
                  this.a("js5connect_full", 118);
                } else {
                  if (nc.field_r == 5) {
                    this.a("outofdate", 90);
                  } else {
                    this.a("js5connect", 80);
                  }
                }
              } else {
                this.a("js5io", param1 ^ -113);
              }
            }
          } else {
            if (ta.field_g >= 10) {
              ia.a((byte) 103);
              if (nc.field_r == 3) {
                sc.a(256, (byte) -98, mh.field_H);
              } else {
                if (nc.field_r != 4) {
                  if (nc.field_r == 2) {
                    sc.a(256, (byte) -93, ib.field_b);
                  } else {
                    if (nc.field_r != 5) {
                      sc.a(256, (byte) 111, e.field_g);
                    } else {
                      sc.a(5, (byte) 96, ri.field_f);
                    }
                  }
                } else {
                  sc.a(256, (byte) -114, jd.field_b);
                }
              }
              kj.field_o = true;
            }
          }
        }
        if ((nc.field_r != -1 &&
          nc.field_r != 0 ||
          d.a((byte) -24)) &&
          mc.field_i <= rf.c(0)) {
          kj.field_o = false;
          if (nc.field_r != -1 &&
            nc.field_r != 0) {
            nc.field_r = -1;
            si.e((byte) 13);
          }
        }
        if (nc.field_r == 0 &&
          !d.a((byte) 112)) {
          fh.field_i = false;
        }
        if (~wf.field_i == param1 &&
          gd.d((byte) -53)) {
          wf.field_i = 1;
        }
        if (1 == wf.field_i) {
          if (ri.field_e != 0) {
            eh.field_d = oj.a(false, th.field_m);
          }
          we.field_h = cl.a(true, (byte) -98, false, gf.field_e, 1);
          gk.field_a = cl.a(true, (byte) -15, false, ij.field_l, 1);
          ej.field_d = cl.a(true, (byte) -37, false, ll.field_f, 1);
          wf.field_i = 2;
          gg.field_d = gk.field_a;
          th.field_p = we.field_h;
        }
        if (wf.field_i == 2) {
          if (eh.field_d != null &&
            eh.field_d.c(92)) {
            if (!eh.field_d.a("", (byte) -114)) {
              eh.field_d = null;
            } else {
              if (eh.field_d.a("", 10762)) {
                kb.a(-119, eh.field_d);
                eh.field_d = null;
                dl.b(5);
              }
            }
          }
          if (null == eh.field_d) {
            wf.field_i = 3;
          }
        }
        if (wf.field_i == 3 &&
          cl.a(ej.field_d, we.field_h, gk.field_a, (byte) 127) &&
          oh.a(ej.field_d, -109)) {
          qa.b(0);
          mg.e(0);
          u.field_tb = false;
          pb.field_j = qk.field_a;
          fk.a(hl.field_F, we.field_h, (byte) 40, ej.field_d, gk.field_a);
          if (ki.field_e ||
            null != sc.field_c) {
            stackIn_102_0 = sc.field_c;
            stackIn_103_1 = !(ki.field_e);
            stackIn_106_2 = !(ki.field_e);
            rb.a(stackIn_102_0, stackIn_103_1, stackIn_106_2, param1 + 14636);
          }
          if (Lexicominos.field_M) {
            ui.d(4);
          }
          if (null == de.field_b) {
            de.field_b = fb.b(12898);
            jh.field_c = kf.g(0);
          }
          vk.a(ej.field_d, param1 ^ 0, de.field_b, jh.field_c);
          gk.field_a = null;
          we.field_h = null;
          ej.field_d = null;
          mc.a(-116, (java.applet.Applet) (this));
          dl.b(5);
          wf.field_i = 10;
        }
        if (wf.field_i == 10) {
          if (ri.field_e != 0) {
            eg.field_C = oj.a(false, ea.field_d);
          }
          wf.field_i = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == wf.field_i) {
          if (null != eg.field_C && (!eg.field_C.c(param1 - 104) ||
            !eg.field_C.a((byte) 60))) {
            al.a(16, ee.a((byte) 126, oh.field_a, we.field_c, eg.field_C), 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            wf.field_i = 12;
            ne.field_e = true;
          }
        }
        if (wf.field_i == 12 &&
          !ne.field_e) {
          wf.field_i = 13;
        }
        if (wf.field_i == 13) {
          var3Lifetime2 = 1;
          if (gd.field_i != null) {
            stackIn_138_0 = (!gd.field_i.a(-71)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            al.a(param1 + 17, gd.field_i.field_f, gd.field_i.field_c);
          }
          if (var3Lifetime2 != 0) {
            wf.field_i = 20;
          }
        }
        if (!param0 &&
          rl.field_O) {
          jd.a(ug.field_y, 160);
          this.f(param1 ^ -468);
          ha.a(ug.field_y, (byte) 105);
        }
        if (ij.field_o[8]) {
          uk.g(true);
        }
    }

    final int n(int param0) {
        int var2;
        var2 = this.f((byte) -127);
        if (param0 != 6) {
          this.e((byte) -85);
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (ij.field_o[1]) {
            bh.a((byte) 77, 2);
          }
          if (ij.field_o[2]) {
            g.a(3, (byte) -39);
          }
          if (ij.field_o[3]) {
            vh.a(false, 4);
          }
          if (ij.field_o[4]) {
            hl.f(5, -2212);
          }
          if (ij.field_o[5]) {
            bd.a(6, -4584);
          }
          if (ij.field_o[6]) {
            n.b(7, param0 - 7);
          }
          if (ij.field_o[8]) {
            pg.a((byte) 92);
          }
        }
        return var2;
    }

    private final void a(String param0, int param1, int param2, byte param3, int param4) {
        boolean stackIn_10_1 = false;
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
            if (!this.c(-7257)) {
              return;
            }
            if (param3 != 62) {
              this.field_B = (String) null;
            }
            this.field_B = this.getCodeBase().getHost();
            var6 = this.field_B.toLowerCase();
            stackIn_10_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_y = stackIn_10_1;
            this.field_D = Integer.parseInt(this.getParameter("gameport1"));
            this.field_q = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_s = Integer.parseInt(var7);
            }
            this.field_r = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_v = Long.parseLong(this.getParameter("instanceid"));
            this.field_x = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_u = Integer.parseInt(var8);
            }
            if (this.field_u >= 5) {
              this.field_u = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_A = Integer.parseInt(var9);
            }
            Lexicominos.field_M = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(this.field_r, param2, param4, param1, param3 ^ 92, 32, param0);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            uj.a((String) null, (Throwable) ((Object) var6_ref), 1);
            this.a("crash", 92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("nk.GA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int f(byte param0) {
        int var2;
        if (this.field_g) {
          return -1;
        }
        if (!d.a((byte) 83)) {
          return -1;
        }
        if (kj.field_o) {
          return -1;
        }
        var2 = ve.a(el.b(1), (byte) -25, this.field_y, true, dg.a(false), this.field_A);
        if (param0 >= -85) {
          this.field_s = -83;
        }
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!nl.field_c) {
            this.a("reconnect", 89);
          }
          ia.a((byte) 83);
          sc.a(var2, (byte) 99, wj.field_p);
          kj.field_o = true;
          mc.field_i = rf.c(0) + 15000L;
          return var2;
        }
        if (ta.field_g != 11) {
          return var2;
        }
        if (nc.field_r != 0) {
          return var2;
        }
        wb.b((byte) 50);
        return var2;
    }

    final void a(int param0, String param1, byte param2) {
        try {
          this.a(param1, 480, param0, (byte) 62, 640);
          if (param2 >= -82) {
            this.field_y = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "nk.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4) {
        this.a(3, false);
        if (param0) {
          this.l(-74);
        }
        if (param2) {
          this.i(-1);
        }
        if (param4) {
          this.j(-67);
        }
        if (param1) {
          this.d((byte) -47);
        }
        int var6 = -104 % ((param3 - 77) / 34);
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
          wf var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Lexicominos.field_L ? 1 : 0;
          var4 = qk.a(ri.field_e, param2, param1 + param1, gd.field_l);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5_int = mg.a(0, fk.a(85), qd.a(false));
            if (var5_int != -1) {
              mb.a(105, var5_int, wj.field_p, fc.field_S);
              wj.field_p = null;
              fc.field_S = null;
            }
            var11 = al.e((byte) -117);
            if (var11 != null) {
              mc.a(var11.booleanValue(), 0);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = il.a(this.field_A, dg.a(false), el.b(param1 ^ 1), ve.b(25594), tf.a((byte) -101), 103, a.c(true));
            if (var5_intLifetime1 != -1) {
              nl.a(var5_intLifetime1, -6258, wj.field_p, fc.field_S);
              fc.field_S = null;
              wj.field_p = null;
            }
          }
          if (var4 == 3) {
            if (nc.field_r != -1 &&
              0 != nc.field_r) {
              nc.field_r = -1;
              si.e((byte) 86);
            }
            if (!param0) {
              var5_intLifetime2 = ve.a(el.b(1), (byte) -25, this.field_y, false, dg.a(false), this.field_A);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  sc.a(var5_intLifetime2, (byte) 58, wj.field_p);
                  wj.field_p = null;
                } else {
                  d.field_a = rc.field_f;
                  wb.b((byte) 50);
                  ta.field_g = 10;
                  qg.field_d = false;
                }
              }
            } else {
              kj.field_o = false;
            }
          }
          if (4 == var4) {
            if (hl.field_F) {
              lj.a(kk.c(-14047), (byte) 125);
            } else {
              ta.field_g = 10;
              qg.field_d = true;
            }
          }
          if (var4 == 5) {
            ge.a(0, kk.c(param1 ^ -14047));
          }
          if (var4 == 6 &&
            u.field_tb) {
            ta.field_g = 10;
          }
          if (7 == var4) {
            sk.a(kk.c(-14047), 12);
          }
          if (var4 == 8) {
            lj.a(kk.c(-14047), (byte) 123);
          }
          if (var4 == 9) {
            la.a(kk.c(-14047), true);
          }
          if (var4 == 10) {
            ed.field_q.h(17, 0);
          }
          if (var4 == 11) {
            rf.a(20104, kk.c(-14047));
          }
          if (12 == var4) {
            pd.a(cf.c(32), -120, kk.c(param1 - 14047));
          }
          if (13 == var4) {
            try {
              if (g.field_m == null) {
                g.field_m = new wg(jh.field_a, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (g.field_m.a(74)) {
                var12 = g.field_m.a((byte) -65);
                if (var12 != null) {
                  var7 = dc.a(var12.field_h, var12.field_j, (byte) 16, 0);
                  hf.a(var7, (byte) 110);
                } else {
                  var9 = (String) null;
                  hf.a((String) null, (byte) 122);
                }
                g.field_m = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              uj.a("S1", (Throwable) ((Object) var5), 1);
              var10 = (String) null;
              hf.a((String) null, (byte) 118);
              g.field_m = null;
            }
          }
          if (15 == var4) {
            ta.field_g = 10;
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

    private final void l(int param0) {
        ij.field_o[1] = true;
        int var2 = 65 % ((62 - param0) / 33);
    }

    protected nk() {
    }

    final void m(int param0) {
        int stackIn_30_0 = 0;
        boolean stackIn_31_1 = false;
        int var2;
        df var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -6721) {
          return;
        }
        var2 = pg.field_d;
        if (var2 < 64 &&
          ij.field_o[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            rb.a(false);
          } else {
            if (2 == var2) {
              hl.d(0);
            } else {
              if (var2 == 3) {
                me.e(false);
              } else {
                if (var2 != 4) {
                  if (var2 == 5) {
                    pg.a(1);
                  } else {
                    if (var2 == 6) {
                      ge.c(param0 ^ -6708);
                    } else {
                      if (var2 != 7) {
                        if (8 != var2) {
                          if (var2 == 16) {
                            kf.h(-1);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                pa.a(15);
                                return;
                              }
                              if (var2 == 17) {
                                this.k(126);
                                return;
                              }
                              if (var2 == 18) {
                                vk.a((byte) -117);
                                return;
                              }
                              uj.a("MGS1: " + qj.h(param0 ^ 6689), (Throwable) null, 1);
                              ck.$cfr$intArgs$b$e683eeaaf5b5(-118);
                              return;
                            }
                            stackIn_30_0 = 0;
                            stackIn_31_1 = (var2 == 12);
                            var3 = qd.a(stackIn_30_0, stackIn_31_1);
                            ij.a(var3, param0 + 6833);
                          }
                        } else {
                          ge.a((byte) -127, a.field_c, ig.field_a, jh.field_a);
                        }
                      } else {
                        this.h(16);
                      }
                    }
                  }
                } else {
                  u.l((byte) -124);
                }
              }
            }
          }
          return;
        }
        uj.a("MGS2: " + qj.h(param0 + 6632), (Throwable) null, param0 + 6722);
        ck.$cfr$intArgs$b$e683eeaaf5b5(-79);
        return;
    }

    private final void k(int param0) {
        int var4 = 0;
        byte[] var5 = null;
        int var2 = ig.field_a.d(true);
        int var3 = 0 != (var2 & 1) ? 1 : 0;
        if (param0 > 125) {
          var4 = -1 + a.field_c;
          var5 = new byte[var4];
          ig.field_a.b(var4, 0, 55, var5);
          m.a(var3 != 0, true, ni.a((byte) -55, var5), kk.c(-14047));
          return;
        }
    }

    private final void d(byte param0) {
        if (param0 != -47) {
          return;
        }
        ij.field_o[5] = true;
    }

    static {
        field_z = 0;
        field_C = "Player names can be up to 12 letters, numbers and underscores";
        field_t = "Connection timed out. Please try using a different server.";
    }
}
