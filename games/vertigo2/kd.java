/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kd extends og {
    static String field_B;
    String field_u;
    static fi field_l;
    private boolean field_n;
    private boolean field_t;
    static int field_x;
    private int field_w;
    private int field_o;
    private long field_y;
    private int field_s;
    private int field_p;
    static int field_z;
    private boolean field_r;
    private int field_A;
    private int field_v;
    static String field_q;
    static String field_m;

    private final void g(byte param0) {
        if (param0 <= 30) {
          this.o(64);
        }
        wi.field_h[1] = true;
    }

    final void c(boolean param0, int param1) {
        int stackIn_24_0 = 0;
        String stackIn_102_0 = null;
        boolean stackIn_103_1 = false;
        int stackIn_105_2 = 0;
        boolean stackIn_106_3;
        int stackIn_135_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (null != t.field_m) {
          if (null == dc.field_L) {
            var6 = fk.a((byte) 87);
            var4 = var6.getSize();
            t.field_m.a(~param1, var4.height, var4.width);
          }
          t.field_m.a(16671);
        }
        dp.b((byte) 124);
        mr.b(false);
        if (!cp.a(121) &&
          11 != hn.field_w) {
          f.c((byte) -6);
        }
        if (null != th.field_g) {
          uo.field_h = th.field_g.a(100);
        }
        if (oe.q(param1 + 85)) {
          var3 = 1200 * el.b(true);
          if (this.field_t ||
            !(jq.a((byte) 29) <= var3) &&
            !(hb.b((byte) -122) <= var3)) {
            this.field_t = false;
            rm.b((byte) 85);
            wp.a(param1 + 16);
            oq.a((byte) 102, ml.field_A, 2);
            kj.g(1);
            br.field_R = true;
            aj.field_j = gk.a(124) + 15000L;
          }
        }
        if (param1 != -6) {
          this.e((byte) -42);
        }
        if (tr.field_f == -1 ||
          0 == tr.field_f) {
          stackIn_24_0 = (tr.field_f != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          tr.field_f = qh.b(32);
          if (var3Lifetime1 != 0 &&
            tr.field_f == 0 &&
            11 == hn.field_w &&
            !va.b((byte) -81)) {
            vo.c((byte) 117);
          }
          if (-1 != tr.field_f &&
            tr.field_f != 0) {
            aj.field_j = 15000L + gk.a(90);
          }
        }
        if (tr.field_f != -1 &&
          0 != tr.field_f) {
          if (10 <= qc.field_A) {
            if (hn.field_w >= 10) {
              wp.a(10);
              if (3 != tr.field_f) {
                if (tr.field_f == 4) {
                  oq.a((byte) 102, ec.field_E, 256);
                } else {
                  if (tr.field_f == 2) {
                    oq.a((byte) 102, tq.field_d, 256);
                  } else {
                    if (tr.field_f != 5) {
                      oq.a((byte) 102, om.field_C, 256);
                    } else {
                      oq.a((byte) 102, cb.field_Pb, 5);
                    }
                  }
                }
              } else {
                oq.a((byte) 102, ab.field_c, 256);
              }
              br.field_R = true;
            }
          } else {
            if (tr.field_f == 3) {
              this.a(0, "js5crc");
            } else {
              if (tr.field_f != 4) {
                if (tr.field_f != 2) {
                  if (tr.field_f != 5) {
                    this.a(0, "js5connect");
                  } else {
                    this.a(0, "outofdate");
                  }
                } else {
                  this.a(0, "js5connect_full");
                }
              } else {
                this.a(param1 ^ -6, "js5io");
              }
            }
          }
        }
        if ((-1 != tr.field_f &&
          tr.field_f != 0 ||
          va.b((byte) -81)) &&
          gk.a(98) >= aj.field_j) {
          br.field_R = false;
          if (tr.field_f != -1 &&
            tr.field_f != 0) {
            tr.field_f = -1;
            fk.f(-1);
          }
        }
        if (tr.field_f == 0 &&
          !va.b((byte) -81)) {
          nq.field_E = false;
        }
        if (qc.field_A == 0 &&
          sf.a(1)) {
          qc.field_A = 1;
        }
        if (qc.field_A == 1) {
          if (0 != np.field_Lb) {
            qc.field_B = pm.a(eh.field_f, 125);
          }
          ke.field_b = ug.a(mp.field_d, false, true, false, 1);
          la.field_e = ug.a(rh.field_F, false, true, false, 1);
          kb.field_b = ug.a(mk.field_G, false, true, false, 1);
          qc.field_A = 2;
          ac.field_G = la.field_e;
          ml.field_y = ke.field_b;
        }
        if (qc.field_A == 2) {
          if (null != qc.field_B &&
            qc.field_B.b(0)) {
            if (!qc.field_B.b("", param1 + 5)) {
              qc.field_B = null;
            } else {
              if (qc.field_B.c("", 0)) {
                wc.a(0, qc.field_B);
                qc.field_B = null;
                di.b((byte) -67);
              }
            }
          }
          if (qc.field_B == null) {
            qc.field_A = 3;
          }
        }
        if (qc.field_A == 3 &&
          ir.a(-95, la.field_e, ke.field_b, kb.field_b) &&
          lm.a(kb.field_b, (byte) 119)) {
          hb.e(-1);
          vl.b(2147483647);
          mg.field_O = false;
          li.field_h = mq.field_t;
          we.a(kb.field_b, pl.field_i, (byte) -7, ke.field_b, la.field_e);
          if (pb.field_f ||
            null != il.field_f) {
            stackIn_102_0 = il.field_f;
            stackIn_103_1 = !(pb.field_f);
            stackIn_105_2 = 65536;
            stackIn_106_3 = !(pb.field_f);
            or.a(stackIn_102_0, stackIn_103_1, stackIn_105_2, stackIn_106_3);
          }
          if (fo.field_d) {
            wq.i(0);
          }
          if (oq.field_E == null) {
            oq.field_E = rc.b(param1 + 130);
            ee.field_c = iq.e(param1 + 12349);
          }
          t.a(oq.field_E, param1 + 1513245, ee.field_c, kb.field_b);
          la.field_e = null;
          ke.field_b = null;
          kb.field_b = null;
          tq.a(false, (java.applet.Applet) (this));
          di.b((byte) -68);
          qc.field_A = 10;
        }
        if (10 == qc.field_A) {
          if (np.field_Lb != 0) {
            vp.field_c = pm.a(rf.field_s, 123);
          }
          qc.field_A = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == qc.field_A) {
          if (vp.field_c != null && (!vp.field_c.b(0) ||
            !vp.field_c.a((byte) -112))) {
            aj.a(false, 0.0f, fg.a(vp.field_c, bq.field_A, eb.field_a, 274));
            decompiledFrameRemainder0 = false;
          }
          else {
            qc.field_A = 12;
            hh.field_c = true;
          }
        }
        if (qc.field_A == 12 &&
          !hh.field_c) {
          qc.field_A = 13;
        }
        if (qc.field_A == 13) {
          var3Lifetime2 = 1;
          if (le.field_d != null) {
            stackIn_135_0 = (!le.field_d.a(-21493)) ? 0 : 1;
            var3Lifetime2 = stackIn_135_0;
            aj.a(false, le.field_d.field_j, le.field_d.field_h);
          }
          if (var3Lifetime2 != 0) {
            qc.field_A = 20;
          }
        }
        if (!param0 &&
          oh.field_F) {
          Vertigo2.a(ne.field_F, (byte) -35);
          this.a((byte) -57);
          ap.a(ne.field_F, -8228);
        }
        if (wi.field_h[8]) {
          l.a(119);
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
          int var4_int = 119 / ((55 - param1) / 45);
          this.a(480, param0, false, param2, 640);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "kd.WA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void h(int param0) {
        if (param0 != 30624) {
          field_l = (fi) null;
        }
        wi.field_h[11] = true;
        wi.field_h[13] = true;
        wi.field_h[12] = true;
    }

    private final int a(boolean param0, byte param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          Exception var6 = null;
          ed var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var5Lifetime2;
          int var5Lifetime3;
          var9 = Vertigo2.field_L ? 1 : 0;
          var4 = qb.a(np.field_Lb, uo.field_h, param2, 10000);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5 = jl.a(jd.a(false), ie.q(20), (byte) -126);
            if (-1 != var5) {
              eq.a(na.field_m, nk.field_Kb, var5, 0);
              nk.field_Kb = null;
              na.field_m = null;
            }
            var12 = as.b(-599);
            if (var12 != null) {
              qk.a(var12.booleanValue(), true);
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = sk.a(in.a((byte) 86), -1, this.field_v, lf.g(0), hr.h(-121), eb.a(-1), rq.a((byte) 74));
            if (var5Lifetime1 != -1) {
              dl.a(-14, na.field_m, nk.field_Kb, var5Lifetime1);
              na.field_m = null;
              nk.field_Kb = null;
            }
          }
          if (var4 == 3) {
            if (tr.field_f != -1 &&
              tr.field_f != 0) {
              tr.field_f = -1;
              fk.f(-1);
            }
            if (param0) {
              br.field_R = false;
            } else {
              var5Lifetime2 = dh.a(24429, this.field_r, in.a((byte) 86), hr.h(-91), this.field_v, false);
              if (var5Lifetime2 != -1) {
                if (0 != var5Lifetime2) {
                  oq.a((byte) 102, nk.field_Kb, var5Lifetime2);
                  nk.field_Kb = null;
                } else {
                  f.field_F = tn.field_p;
                  vo.c((byte) 117);
                  sq.field_c = false;
                  hn.field_w = 10;
                }
              }
            }
          }
          if (var4 == 4) {
            if (pl.field_i) {
              lb.a(ob.e((byte) 105), (byte) 80);
            } else {
              hn.field_w = 10;
              sq.field_c = true;
            }
          }
          if (5 == var4) {
            sf.a(ob.e((byte) -75), -63);
          }
          if (6 == var4 &&
            mg.field_O) {
            hn.field_w = 10;
          }
          var5Lifetime3 = -70 % ((param1 + 33) / 63);
          if (var4 == 7) {
            fq.a(ob.e((byte) -97), (byte) -16);
          }
          if (var4 == 8) {
            lb.a(ob.e((byte) -93), (byte) 80);
          }
          if (var4 == 9) {
            gm.a(ob.e((byte) -103), (byte) -126);
          }
          if (var4 == 10) {
            uh.field_Wb.j(17, 127);
          }
          if (var4 == 11) {
            pd.a(ob.e((byte) -95), 1000000);
          }
          if (var4 == 12) {
            gg.a(qh.d(0), true, ob.e((byte) 68));
          }
          if (var4 == 13) {
            try {
              if (null == ja.field_d) {
                ja.field_d = new qb(gi.field_s, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ja.field_d.b(-1)) {
                var7 = ja.field_d.a(-4);
                if (var7 != null) {
                  var8 = mj.a(32, var7.field_p, 0, var7.field_u);
                  om.a(var8, (byte) -125);
                } else {
                  var10 = (String) null;
                  om.a((String) null, (byte) 120);
                }
                ja.field_d = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              ke.a((Throwable) ((Object) var6), "S1", 0);
              var11 = (String) null;
              om.a((String) null, (byte) -39);
              ja.field_d = null;
            }
          }
          if (var4 == 15) {
            hn.field_w = 10;
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

    final void m(int param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int var3;
        boolean stackIn_12_1 = false;
        int stackIn_12_2 = 0;
        Object stackIn_13_0;
        boolean stackIn_13_3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 > -72) {
          this.field_o = 1;
        }
        if (tk.c((byte) -116)) {
          stackIn_12_1 = false;
          stackIn_12_2 = -115;
          if (null == dc.field_L) {
            stackIn_13_0 = this;
            stackIn_13_3 = false;
          } else {
            stackIn_13_0 = this;
            stackIn_13_3 = true;
          }
          discarded$5 = this.a(stackIn_12_1, (byte) stackIn_12_2, stackIn_13_3);
        } else {
          if (10 <= qc.field_A) {
            if (nl.a((byte) 107)) {
              if (0 != hn.field_w) {
                iq.a((byte) -80, uo.field_h);
              } else {
                discarded$6 = this.a(false, (byte) 116, false);
              }
            } else {
              vc.c(-86);
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_m = null;
        field_l = null;
        field_q = null;
        if (!param0) {
          kd.a(false);
        }
        field_B = null;
    }

    private final void k(int param0) {
        ok.field_d[6] = -2;
        ok.field_d[12] = -1;
        ok.field_d[17] = -1;
        int var2 = 79 % ((57 - param0) / 55);
        ok.field_d[13] = -1;
        ok.field_d[1] = 16;
        ok.field_d[5] = -1;
        ok.field_d[2] = -2;
        ok.field_d[18] = 1;
        ok.field_d[4] = -1;
        ok.field_d[3] = -1;
        ok.field_d[11] = -1;
        ok.field_d[8] = -2;
        ok.field_d[9] = -1;
        ok.field_d[10] = -1;
        ok.field_d[16] = -1;
        ok.field_d[7] = -1;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        np.field_Lb = this.field_A;
        li.a(true, np.field_Lb);
        f.a(this.field_y, this.field_w, 5000, gi.field_s, np.field_Lb, this.field_s, this.field_p, param7, this.field_n, this.field_o, param4, this.field_u, 5000, 6);
        vi.a(np.field_Lb, this.field_s, this.field_p, this.field_u, this.field_o, param7, gi.field_s, this.field_w, (byte) 112);
        mq.c(1);
        th.field_g = nb.i(0);
        ap.a(ne.field_F, -8228);
        rh.field_F = param6;
        mk.field_G = param2;
        mp.field_d = param3;
        rf.field_s = param0;
        eh.field_f = param1;
        if (param5 != -16) {
          return;
        }
        this.k(param5 - 7);
        lo.a(8537);
    }

    private final void e(byte param0) {
        int var2 = -68 / ((param0 - 48) / 40);
        wi.field_h[4] = true;
    }

    final void g(int param0) {
        boolean stackIn_27_0 = false;
        int var2;
        tn var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 >= -60) {
          return;
        }
        var2 = lc.field_f;
        if (64 > var2 &&
          wi.field_h[var2]) {
          if (0 == var2) {
            return;
          }
          if (1 == var2) {
            g.b(false);
          } else {
            if (var2 != 2) {
              if (var2 == 3) {
                p.a((byte) -118);
              } else {
                if (4 == var2) {
                  le.b(-104);
                } else {
                  if (var2 == 5) {
                    to.a((byte) -99);
                  } else {
                    if (var2 != 6) {
                      if (7 != var2) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            hk.g(3);
                          } else {
                            if (11 != var2 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                d.a(46);
                                return;
                              }
                              if (var2 == 17) {
                                this.i(-1);
                                return;
                              }
                              if (var2 == 18) {
                                pq.a((byte) 111);
                                return;
                              }
                              ke.a((Throwable) null, "MGS1: " + or.a(115), 0);
                              rm.b((byte) 127);
                              return;
                            }
                            stackIn_27_0 = (12 == var2);
                            var3 = nb.a(stackIn_27_0, (byte) 52);
                            bb.a(false, var3);
                          }
                        } else {
                          gp.a(gi.field_s, -121, id.field_f, ca.field_b);
                        }
                      } else {
                        this.f((byte) -117);
                      }
                    } else {
                      c.c(4);
                    }
                  }
                }
              }
            } else {
              dm.k(0);
            }
          }
          return;
        }
        ke.a((Throwable) null, "MGS2: " + or.a(117), 0);
        rm.b((byte) -52);
        return;
    }

    private final void a(int param0, int param1, boolean param2, String param3, int param4) {
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
            if (!this.c(-83)) {
              return;
            }
            this.field_u = this.getCodeBase().getHost();
            var6 = this.field_u.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_r = stackIn_7_1;
            this.field_p = Integer.parseInt(this.getParameter("gameport1"));
            this.field_s = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_o = Integer.parseInt(var7);
            }
            this.field_w = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_y = Long.parseLong(this.getParameter("instanceid"));
            this.field_n = this.getParameter("member").equals("yes");
            if (param2) {
              field_B = (String) null;
            }
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_A = Integer.parseInt(var8);
            }
            if (this.field_A >= 5) {
              this.field_A = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_v = Integer.parseInt(var9);
            }
            fo.field_d = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, 77, param1, this.field_w, param0, param4, param3);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            ke.a((Throwable) ((Object) var6_ref), (String) null, 0);
            this.a(0, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("kd.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void i(int param0) {
        int var2 = id.field_f.h(-11);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = param0 + ca.field_b;
        byte[] var5 = new byte[var4];
        id.field_f.a((byte) 82, var4, var5, 0);
        hc.a(in.a(0, var5), param0 + 16012, var3 != 0, ob.e((byte) 81));
    }

    final int h(byte param0) {
        int var2;
        if (param0 > -124) {
          this.h(58);
        }
        var2 = this.j(-71);
        if (var2 == 0 ||
          var2 == 1) {
          if (wi.field_h[1]) {
            in.a(-124, 2);
          }
          if (wi.field_h[2]) {
            hr.a(3, true);
          }
          if (wi.field_h[3]) {
            jr.a(4, 2);
          }
          if (wi.field_h[4]) {
            in.a((byte) -102, 5);
          }
          if (wi.field_h[5]) {
            nb.d(6, -2);
          }
          if (wi.field_h[6]) {
            dl.a(-5996, 7);
          }
          if (wi.field_h[8]) {
            en.a(true);
          }
        }
        return var2;
    }

    private final void f(byte param0) {
        String var2 = tc.a(127);
        rp.a(ob.e((byte) 77), -2112, var2);
        if (param0 >= -104) {
          this.h((byte) 8);
        }
    }

    private final void n(int param0) {
        wi.field_h[param0] = true;
    }

    protected kd() {
    }

    private final void a(boolean param0, int param1) {
        wi.field_h[16] = true;
        wi.field_h[17] = true;
        wi.field_h[7] = true;
        wi.field_h[8] = param0;
        wi.field_h[3] = true;
        if (param1 != 2594) {
          this.field_t = true;
        }
        wi.field_h[0] = true;
        wi.field_h[18] = true;
    }

    final static boolean l(int param0) {
        int var2 = 0;
        oc var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        oc var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 7) {
            kd.a(false);
          }
          var4 = (oc) (mg.field_N.a((byte) 100));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_n; var2++) {
            if (var4.field_t[var2] != null &&
              var4.field_t[var2].field_b == 0) {
              return false;
            }
            if (null != var4.field_w[var2] &&
              0 == var4.field_w[var2].field_b) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref), "kd.BB(" + param0 + ')');
        }
    }

    private final void i(byte param0) {
        wi.field_h[5] = true;
        if (param0 > -118) {
          this.field_v = -21;
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.a(true, 2594);
        if (param4) {
          this.g((byte) 115);
        }
        if (param3) {
          this.o(15000);
        }
        if (param2) {
          this.e((byte) 94);
        }
        if (param5) {
          this.i((byte) -123);
        }
        if (param1) {
          this.field_A = -32;
        }
        if (param6) {
          this.n(6);
        }
        if (param0) {
          this.h(30624);
        }
    }

    private final void o(int param0) {
        wi.field_h[2] = true;
        if (param0 != 15000) {
          kd.a(false);
        }
    }

    final int b(boolean param0, int param1) {
        if (param1 < 57) {
          this.h((byte) -69);
        }
        return this.a(true, (byte) -99, param0);
    }

    private final int j(int param0) {
        if (this.field_f) {
          return -1;
        }
        if (!va.b((byte) -81)) {
          return -1;
        }
        if (br.field_R) {
          return -1;
        }
        int var2 = dh.a(24429, this.field_r, in.a((byte) 86), hr.h(-95), this.field_v, true);
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (11 == hn.field_w &&
            tr.field_f == 0) {
            vo.c((byte) 117);
          }
          return var2;
        }
        if (!gl.field_k) {
          this.a(0, "reconnect");
        }
        if (param0 > -48) {
          this.field_v = -93;
        }
        wp.a(10);
        oq.a((byte) 102, nk.field_Kb, var2);
        br.field_R = true;
        aj.field_j = gk.a(74) + 15000L;
        return var2;
    }

    static {
        field_B = "Set up new unrated game";
        field_q = "Player Name: ";
        field_m = "<%0> has resigned and left.";
    }
}
