/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tl extends kf {
    static int field_D;
    static boolean field_u;
    private boolean field_w;
    private int field_x;
    String field_s;
    private int field_v;
    static char[] field_p;
    private int field_r;
    static String field_z;
    private int field_q;
    static String field_o;
    private long field_t;
    private int field_B;
    private boolean field_C;
    private int field_A;
    private boolean field_y;

    private final void h(int param0) {
        ud.field_c[4] = true;
        if (param0 != 3) {
          field_D = -48;
        }
    }

    private final void d(byte param0) {
        ud.field_c[11] = true;
        ud.field_c[12] = true;
        if (param0 > -8) {
          this.j((byte) 51);
        }
        ud.field_c[13] = true;
    }

    final void a(String param0, int param1, byte param2) {
        try {
          this.a(480, param1, -85, param0, 640);
          int var4_int = -28 % ((57 - param2) / 47);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "tl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
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
          ob var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          var4 = sr.a(so.field_o, (byte) 0, param2, ai.field_e);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (var4 == param1) {
            var5_int = wi.a(sl.j((byte) 64), of.a(64), 0);
            if (var5_int != -1) {
              wo.a(var5_int, (byte) -88, ae.field_e, nl.field_c);
              ae.field_e = null;
              nl.field_c = null;
            }
            var11 = fr.j(0);
            if (var11 != null) {
              bs.a(var11.booleanValue(), (byte) 72);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = sr.a(bh.d(-97), this.field_B, (byte) -42, ob.g((byte) -24), vj.i(-100), of.a((byte) 42), aq.a(11));
            if (var5_intLifetime1 != -1) {
              va.a(ae.field_e, (byte) -113, var5_intLifetime1, nl.field_c);
              ae.field_e = null;
              nl.field_c = null;
            }
          }
          if (3 == var4) {
            if (qj.field_g != -1 &&
              qj.field_g != 0) {
              qj.field_g = -1;
              ea.a(116);
            }
            if (param0) {
              md.field_B = false;
            } else {
              var5_intLifetime2 = ui.a(this.field_B, (byte) -121, false, vj.i(-116), this.field_C, bh.d(-121));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  bf.a((byte) -127, var5_intLifetime2, nl.field_c);
                  nl.field_c = null;
                } else {
                  co.field_o = pd.field_l;
                  rq.c(98);
                  eh.field_P = false;
                  gm.field_i = 10;
                }
              }
            }
          }
          if (var4 == 4) {
            if (!db.field_b) {
              gm.field_i = 10;
              eh.field_P = true;
            } else {
              oj.a(0, kq.f((byte) 127));
            }
          }
          if (5 == var4) {
            da.a(param1 + 0, kq.f((byte) 126));
          }
          if (var4 == 6 &&
            or.field_a) {
            gm.field_i = 10;
          }
          if (var4 == 7) {
            id.a(kq.f((byte) 127), (byte) -119);
          }
          if (8 == var4) {
            oj.a(param1 ^ 1, kq.f((byte) 126));
          }
          if (9 == var4) {
            de.a(115, kq.f((byte) 125));
          }
          if (10 == var4) {
            js.field_f.h(17, 255);
          }
          if (var4 == 11) {
            hr.a(kq.f((byte) 126), (byte) -105);
          }
          if (var4 == 12) {
            sl.a(ui.c(false), kq.f((byte) 126), (byte) 88);
          }
          if (var4 == 13) {
            try {
              if (va.field_g == null) {
                va.field_g = new r(fa.field_W, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (va.field_g.b(10000)) {
                var12 = va.field_g.a(true);
                if (var12 == null) {
                  var9 = (String) null;
                  aa.a((String) null, true);
                } else {
                  var7 = qi.a(var12.field_h, var12.field_j, 0, param1 ^ -128);
                  aa.a(var7, true);
                }
                va.field_g = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              jq.a(-29901, (Throwable) ((Object) var5), "S1");
              var10 = (String) null;
              aa.a((String) null, true);
              va.field_g = null;
            }
          }
          if (15 == var4) {
            gm.field_i = 10;
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

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        if (param0 != 256) {
          this.e((byte) -62);
        }
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ai.field_e = this.field_v;
        dm.a(0, ai.field_e);
        jq.a(0, fa.field_W, 5000, this.field_q, 5000, this.field_x, param4, param3, this.field_w, ai.field_e, this.field_r, this.field_A, this.field_s, this.field_t);
        ti.a(param3, this.field_q, this.field_r, this.field_A, ai.field_e, 1491341222, fa.field_W, this.field_s, this.field_x);
        lm.a((byte) 100);
        aj.field_b = cg.e(true);
        re.a(tm.field_i, false);
        jj.field_k = param2;
        ai.field_a = param5;
        jc.field_p = param1;
        tp.field_j = param6;
        lo.field_B = param7;
        this.l((byte) 64);
        qj.b((byte) -120);
    }

    private final void g(byte param0) {
        ud.field_c[1] = true;
        if (param0 > -81) {
          this.d((byte) -17);
        }
    }

    final void e(byte param0) {
        boolean stackIn_32_0 = false;
        int var2;
        nf var3;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = ej.field_e;
        if (param0 > -55) {
          this.b(-69, true);
        }
        if (var2 < 64 &&
          ud.field_c[var2]) {
          if (var2 == 0) {
            return;
          }
          if (1 != var2) {
            if (var2 != 2) {
              if (var2 == 3) {
                lr.a(105);
              } else {
                if (4 == var2) {
                  ej.d(-523);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      r.a((byte) 67);
                    } else {
                      if (var2 == 7) {
                        this.b(false);
                      } else {
                        if (var2 == 8) {
                          vq.a(sa.field_a, fa.field_W, rr.field_t, -3);
                        } else {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                s.a(true);
                                return;
                              }
                              if (var2 == 17) {
                                this.i(-1);
                                return;
                              }
                              if (var2 == 18) {
                                sh.a(-1);
                                return;
                              }
                              jq.a(-29901, (Throwable) null, "MGS1: " + w.a(16738));
                              q.g(-107);
                              return;
                            }
                            stackIn_32_0 = (var2 == 12);
                            var3 = sk.a(stackIn_32_0, -1);
                            nc.a(var3, 2);
                          } else {
                            kb.f(-92);
                          }
                        }
                      }
                    }
                  } else {
                    vf.d((byte) -117);
                  }
                }
              }
            } else {
              ae.a((byte) 104);
            }
          } else {
            tl.f((byte) 24);
          }
          return;
        }
        jq.a(-29901, (Throwable) null, "MGS2: " + w.a(16738));
        q.g(-127);
    }

    public static void k(int param0) {
        field_p = null;
        field_z = null;
        field_o = null;
        if (param0 > -8) {
          tl.f((byte) 43);
        }
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        if (param2 != -2839) {
          this.field_A = 104;
        }
        this.b(-73, true);
        if (param6) {
          this.g((byte) -111);
        }
        if (param5) {
          this.h((byte) 43);
        }
        if (param0) {
          this.h(3);
        }
        if (param4) {
          this.k((byte) -63);
        }
        if (param1) {
          this.j(-31193);
        }
        if (param3) {
          this.d((byte) -45);
        }
    }

    private final void l(byte param0) {
        ae.field_a[9] = -1;
        ae.field_a[10] = -1;
        ae.field_a[4] = -1;
        ae.field_a[1] = 16;
        ae.field_a[6] = -2;
        ae.field_a[7] = -1;
        ae.field_a[2] = -2;
        if (param0 < 62) {
          field_D = 122;
        }
        ae.field_a[5] = -1;
        ae.field_a[3] = -1;
        ae.field_a[11] = -1;
        ae.field_a[18] = 1;
        ae.field_a[16] = -1;
        ae.field_a[8] = -2;
        ae.field_a[17] = -1;
        ae.field_a[13] = -1;
        ae.field_a[12] = -1;
    }

    private final static void f(byte param0) {
        uq var1 = (uq) (mh.field_d.d(0));
        if (var1 == null) {
          q.g(-110);
          return;
        }
        sl var2 = sa.field_a;
        var2.a(16711680);
        var2.a(16711680);
        if (param0 != 24) {
          tl.k(-44);
        }
        var2.a(16711680);
        var2.a(param0 + 16711656);
        var1.b((byte) -104);
    }

    final void a(boolean param0, int param1) {
        int stackIn_24_0 = 0;
        String stackIn_106_0 = null;
        boolean stackIn_107_1 = false;
        int stackIn_109_2 = 0;
        boolean stackIn_110_3;
        int stackIn_141_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (bh.field_p != null) {
          if (null == bj.field_K) {
            var6 = nr.a(76);
            var4 = var6.getSize();
            bh.field_p.a(var4.width, var4.height, -28);
          }
          bh.field_p.a(true);
        }
        we.a((byte) -59);
        ae.b((byte) 62);
        if (!uf.a(false) &&
          gm.field_i != 11) {
          bc.c(-78);
        }
        if (aj.field_b != null) {
          so.field_o = aj.field_b.b(86);
        }
        if (cb.b((byte) -117)) {
          var3 = tj.a(0) * 1200;
          if (this.field_y ||
            !(var3 >= ik.a(-26918)) &&
            !(po.b(123) <= var3)) {
            this.field_y = false;
            q.g(-113);
            oh.b(-11);
            bf.a((byte) -124, 2, he.field_n);
            rg.b(false);
            md.field_B = true;
            ip.field_b = 15000L + pr.a(14274);
          }
        }
        if (-1 == qj.field_g ||
          qj.field_g == 0) {
          stackIn_24_0 = (qj.field_g != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          qj.field_g = u.a(-95);
          if (var3Lifetime1 != 0 &&
            qj.field_g == 0 &&
            gm.field_i == 11 &&
            !jc.f(-11)) {
            rq.c(86);
          }
          if (qj.field_g != -1 &&
            qj.field_g != 0) {
            ip.field_b = pr.a(14274) + 15000L;
          }
        }
        if (-1 != qj.field_g &&
          qj.field_g != 0) {
          if (ma.field_p >= 10) {
            if (gm.field_i >= 10) {
              oh.b(-11);
              if (3 != qj.field_g) {
                if (4 == qj.field_g) {
                  bf.a((byte) -124, 256, sa.field_e);
                } else {
                  if (qj.field_g == 2) {
                    bf.a((byte) -125, 256, ar.field_r);
                  } else {
                    if (qj.field_g != 5) {
                      bf.a((byte) -127, 256, nr.field_n);
                    } else {
                      bf.a((byte) -126, 5, ce.field_w);
                    }
                  }
                }
              } else {
                bf.a((byte) -126, 256, po.field_g);
              }
              md.field_B = true;
            }
          } else {
            if (3 != qj.field_g) {
              if (4 == qj.field_g) {
                this.a((byte) -120, "js5io");
              } else {
                if (qj.field_g != 2) {
                  if (5 != qj.field_g) {
                    this.a((byte) -110, "js5connect");
                  } else {
                    this.a((byte) -85, "outofdate");
                  }
                } else {
                  this.a((byte) 33, "js5connect_full");
                }
              }
            } else {
              this.a((byte) 54, "js5crc");
            }
          }
        }
        if ((qj.field_g != -1 &&
          qj.field_g != 0 ||
          jc.f(-11)) &&
          ip.field_b <= pr.a(14274)) {
          md.field_B = false;
          if (-1 != qj.field_g &&
            qj.field_g != 0) {
            qj.field_g = -1;
            ea.a(112);
          }
        }
        if (qj.field_g == 0 &&
          !jc.f(-11)) {
          oi.field_f = false;
        }
        if (ma.field_p == 0 &&
          mp.a(true)) {
          ma.field_p = 1;
        }
        if (param1 <= 1) {
          this.i(-82);
        }
        if (1 == ma.field_p) {
          if (ai.field_e != 0) {
            es.field_j = io.a(ai.field_a, 124);
          }
          rq.field_g = rl.a(-1, true, 1, jc.field_p, false);
          tq.field_f = rl.a(-1, true, 1, tp.field_j, false);
          l.field_g = rl.a(-1, true, 1, jj.field_k, false);
          ma.field_p = 2;
          kl.field_s = rq.field_g;
          rl.field_f = tq.field_f;
        }
        if (ma.field_p == 2) {
          if (null != es.field_j &&
            es.field_j.b((byte) 122)) {
            if (es.field_j.b("", (byte) -116)) {
              if (es.field_j.a("", 51)) {
                vi.a(es.field_j, true);
                es.field_j = null;
                u.c(126);
              }
            } else {
              es.field_j = null;
            }
          }
          if (null == es.field_j) {
            ma.field_p = 3;
          }
        }
        if (ma.field_p == 3 &&
          ig.a(rq.field_g, -7526, tq.field_f, l.field_g) &&
          uq.a(l.field_g, 0)) {
          qr.f(-98);
          kq.c(28164);
          pc.field_r = tb.field_c;
          or.field_a = false;
          rn.a(624, rq.field_g, db.field_b, l.field_g, tq.field_f);
          if (go.field_D ||
            null != hr.field_b) {
            stackIn_106_0 = hr.field_b;
            stackIn_107_1 = !(go.field_D);
            stackIn_109_2 = -70;
            stackIn_110_3 = !(go.field_D);
            jm.$cfr$intArgs$a$88c6728ee5b1(stackIn_106_0, stackIn_107_1, stackIn_109_2, stackIn_110_3);
          }
          if (cm.field_f) {
            oo.a((byte) -58);
          }
          if (null == ns.field_rb) {
            ns.field_rb = ae.c(3);
            md.field_M = ji.a(-123);
          }
          rn.a(ns.field_rb, md.field_M, 1000, l.field_g);
          tq.field_f = null;
          rq.field_g = null;
          l.field_g = null;
          we.a((java.applet.Applet) (this), 4289);
          u.c(124);
          ma.field_p = 10;
        }
        if (ma.field_p == 10) {
          if (ai.field_e != 0) {
            ka.field_e = io.a(lo.field_B, 101);
          }
          ma.field_p = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (ma.field_p == 11) {
          if (ka.field_e != null && (!ka.field_e.b((byte) -88) ||
            !ka.field_e.a(-1))) {
            nj.a(0.0f, 2, nc.a(i.field_a, ka.field_e, -80, ns.field_xb));
            decompiledFrameRemainder0 = false;
          }
          else {
            um.field_n = true;
            ma.field_p = 12;
          }
        }
        if (ma.field_p == 12 &&
          !um.field_n) {
          ma.field_p = 13;
        }
        if (ma.field_p == 13) {
          var3Lifetime2 = 1;
          if (null != hd.field_n) {
            stackIn_141_0 = (!hd.field_n.b(-1)) ? 0 : 1;
            var3Lifetime2 = stackIn_141_0;
            nj.a(hd.field_n.field_h, 2, hd.field_n.field_c);
          }
          if (var3Lifetime2 != 0) {
            ma.field_p = 20;
          }
        }
        if (!param0 &&
          pf.field_c) {
          hs.a(tm.field_i, (byte) 125);
          this.f(0);
          re.a(tm.field_i, false);
        }
        if (ud.field_c[8]) {
          vd.d(2147483647);
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          this.e((byte) 84);
        }
        return this.a(true, 1, param1);
    }

    private final void b(boolean param0) {
        if (param0) {
          return;
        }
        String var2 = pc.a(param0);
        hp.a((byte) 112, kq.f((byte) 126), var2);
    }

    private final void k(byte param0) {
        ud.field_c[5] = true;
        if (param0 > -22) {
          this.h(99);
        }
    }

    final void j(byte param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3;
        boolean stackIn_12_1 = false;
        int stackIn_12_2 = 0;
        Object stackIn_13_0;
        boolean stackIn_13_3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 > -32) {
          return;
        }
        if (wb.b(94)) {
          stackIn_12_1 = false;
          stackIn_12_2 = 1;
          if (null == bj.field_K) {
            stackIn_13_0 = this;
            stackIn_13_3 = false;
          } else {
            stackIn_13_0 = this;
            stackIn_13_3 = true;
          }
          discarded$1 = this.a(stackIn_12_1, stackIn_12_2, stackIn_13_3);
        } else {
          if (ma.field_p >= 10) {
            if (or.a(250)) {
              if (gm.field_i == 0) {
                discarded$2 = this.a(false, 1, false);
              } else {
                te.a(0, so.field_o);
              }
            } else {
              lc.b(-82);
            }
          }
        }
    }

    private final void h(byte param0) {
        ud.field_c[2] = true;
        int var2 = -9 % ((param0 + 55) / 57);
    }

    protected tl() {
    }

    final int i(byte param0) {
        if (this.field_e) {
          return -1;
        }
        if (param0 != 16) {
          return -22;
        }
        if (!jc.f(-11)) {
          return -1;
        }
        if (md.field_B) {
          return -1;
        }
        int var2 = ui.a(this.field_B, (byte) -94, true, vj.i(-125), this.field_C, bh.d(-97));
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (11 == gm.field_i &&
            0 == qj.field_g) {
            rq.c(60);
          }
          return var2;
        }
        if (!vm.field_Nb) {
          this.a((byte) 58, "reconnect");
        }
        oh.b(-11);
        bf.a((byte) -126, var2, nl.field_c);
        md.field_B = true;
        ip.field_b = pr.a(14274) + 15000L;
        return var2;
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
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
            if (!this.b((byte) -106)) {
              return;
            }
            this.field_s = this.getCodeBase().getHost();
            var6 = this.field_s.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_C = stackIn_7_1;
            this.field_q = Integer.parseInt(this.getParameter("gameport1"));
            this.field_x = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_A = Integer.parseInt(var7);
            }
            this.field_r = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_t = Long.parseLong(this.getParameter("instanceid"));
            if (param2 >= -7) {
              this.field_w = false;
            }
            this.field_w = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_v = Integer.parseInt(var8);
            }
            if (5 <= this.field_v) {
              this.field_v = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_B = Integer.parseInt(var9);
            }
            cm.field_f = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a((byte) -50, param1, param0, 32, param3, this.field_r, param4);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            jq.a(-29901, (Throwable) ((Object) var6_ref), (String) null);
            this.a((byte) -95, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("tl.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void i(int param0) {
        int var2 = sa.field_a.j(-82);
        int var3 = param0 != ~(var2 & 1) ? 1 : 0;
        int var4 = rr.field_t - 1;
        byte[] var5 = new byte[var4];
        sa.field_a.b(var4, ~param0, 0, var5);
        ue.a(kq.f((byte) 126), var3 != 0, rm.a(var5, 17746), -128);
    }

    private final void j(int param0) {
        ud.field_c[6] = true;
        if (param0 != -31193) {
          this.h((byte) -62);
        }
    }

    final static java.awt.Frame a(boolean param0, qb param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        gl[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        gl[] var10 = null;
        pb var11 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!param1.a(false)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (0 == param2) {
            var10 = dc.a(param1, (byte) -57);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (var10[var8].field_g == param5 &&
                var10[var8].field_c == param4 && ((param3 == 0 ||
                var10[var8].field_f == param3) &&
                (var7_int == 0 ||
                !(param2 >= var10[var8].field_d)))) {
                var7_int = 1;
                param2 = var10[var8].field_d;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param1.a(param3, param4, param5, param2, -1194);
          if (!param0) {
            field_o = (String) null;
          }
          while (var11.field_d == 0) {
            jb.a((byte) -122, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_e);
          if (var7 == null) {
            stackIn_35_0 = null;
            return (java.awt.Frame) (stackIn_35_0);
          }
          if (2 != var11.field_d) {
            stackIn_40_0 = var7;
            return stackIn_40_0;
          }
          ql.a(var7, 0, param1);
          stackIn_38_0 = null;
          return (java.awt.Frame) (stackIn_38_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_43_0 = var6_ref;
          stackIn_43_1 = new StringBuilder().append("tl.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void b(int param0, boolean param1) {
        ud.field_c[0] = true;
        ud.field_c[17] = true;
        ud.field_c[8] = param1;
        if (param0 >= -33) {
          this.i(-80);
        }
        ud.field_c[7] = true;
        ud.field_c[16] = true;
        ud.field_c[3] = true;
        ud.field_c[18] = true;
    }

    static {
        field_p = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_o = "All players have left <%0>'s game.";
        field_z = null;
    }
}
