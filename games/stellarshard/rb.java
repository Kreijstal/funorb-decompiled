/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rb extends ac {
    private boolean field_x;
    private boolean field_o;
    private long field_y;
    private int field_q;
    static int field_s;
    static String field_t;
    String field_C;
    private int field_r;
    static ci field_u;
    private int field_v;
    private int field_D;
    static int field_w;
    private int field_A;
    private int field_z;
    private boolean field_p;

    final void k(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = stellarshard.field_B;
        if (vj.a(25424)) {
          discarded$1 = this.a(pd.field_f != null ? true : false, false, true);
        } else {
          if (rk.field_f >= 10) {
            if (!gh.b((byte) 82)) {
              hf.c(param0 ^ -241);
            } else {
              if (eg.field_d == 0) {
                discarded$3 = this.a(false, false, true);
              } else {
                sg.a(51, ke.field_b);
              }
            }
          }
        }
        if (param0 != -11) {
          this.a((byte) -116, true);
        }
    }

    final static ek[] g(int param0) {
        int var2 = 0;
        int var3 = stellarshard.field_B;
        ek[] var1 = new ek[sb.field_b];
        for (var2 = 0; sb.field_b > var2; var2++) {
          var1[var2] = new ek(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], ih.field_b[var2], gj.field_w);
        }
        if (param0 == 1851) {
          tb.f((byte) -118);
          return var1;
        }
        return (ek[]) null;
    }

    private final void c(boolean param0) {
        if (param0) {
          return;
        }
        wc.field_x[2] = true;
    }

    private final void i(int param0) {
        i.field_e[3] = -1;
        i.field_e[10] = -1;
        i.field_e[7] = -1;
        i.field_e[11] = -1;
        i.field_e[4] = -1;
        i.field_e[12] = -1;
        i.field_e[17] = -1;
        i.field_e[2] = -2;
        i.field_e[16] = -1;
        i.field_e[8] = -2;
        i.field_e[9] = -1;
        i.field_e[5] = -1;
        i.field_e[6] = -2;
        if (param0 != 18) {
          String var3 = (String) null;
          this.a(-41, false, (String) null);
        }
        i.field_e[13] = -1;
        i.field_e[1] = 16;
        i.field_e[18] = 1;
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
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
          ka var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = stellarshard.field_B;
          if (!param2) {
            this.field_q = -96;
          }
          var4 = ck.a(bb.field_d, ke.field_b, param0, false);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = dc.a(tb.g((byte) 118), -112, n.a(20));
            if (var5_int != -1) {
              sl.a(ga.field_a, var5_int, (byte) -110, fc.field_b);
              fc.field_b = null;
              ga.field_a = null;
            }
            var11 = wj.g(-117);
            if (var11 != null) {
              vk.a((byte) -122, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = qe.a(tc.c(-5), kg.e(false), param2, rb.j(5), this.field_v, wh.a((byte) 88), jg.i((byte) 113));
            if (var5_intLifetime1 != -1) {
              pk.a(ga.field_a, fc.field_b, var5_intLifetime1, (byte) 125);
              ga.field_a = null;
              fc.field_b = null;
            }
          }
          if (3 == var4) {
            if (ei.field_F != -1 &&
              ei.field_F != 0) {
              ei.field_F = -1;
              ee.a(112);
            }
            if (!param1) {
              var5_intLifetime2 = wj.a(wh.a((byte) 97), this.field_v, this.field_x, tc.c(-5), (byte) 74, false);
              if (var5_intLifetime2 != -1) {
                if (0 == var5_intLifetime2) {
                  al.field_b = we.field_a;
                  db.a(127);
                  cg.field_a = false;
                  eg.field_d = 10;
                } else {
                  wl.a(var5_intLifetime2, -8440, ga.field_a);
                  ga.field_a = null;
                }
              }
            } else {
              pc.field_m = false;
            }
          }
          if (4 == var4) {
            if (uj.field_f) {
              pf.a(hf.a((byte) -126), (byte) 123);
            } else {
              eg.field_d = 10;
              cg.field_a = true;
            }
          }
          if (5 == var4) {
            df.a(false, hf.a((byte) -96));
          }
          if (var4 == 6 &&
            qh.field_d) {
            eg.field_d = 10;
          }
          if (var4 == 7) {
            qj.a((byte) 109, hf.a((byte) -17));
          }
          if (var4 == 8) {
            pf.a(hf.a((byte) -85), (byte) 123);
          }
          if (var4 == 9) {
            of.a((byte) 99, hf.a((byte) -101));
          }
          if (var4 == 10) {
            pg.field_fb.f(17, 950);
          }
          if (11 == var4) {
            wf.a(63, hf.a((byte) -7));
          }
          if (var4 == 12) {
            gf.a(hf.a((byte) -125), kf.b(-940626896), 16729);
          }
          if (var4 == 13) {
            try {
              if (q.field_d == null) {
                q.field_d = new v(ic.field_d, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (q.field_d.a(14709)) {
                var12 = q.field_d.b(-4);
                if (var12 != null) {
                  var7 = kk.a(var12.field_k, (byte) 97, 0, var12.field_r);
                  il.a(7110, var7);
                } else {
                  var9 = (String) null;
                  il.a(7110, (String) null);
                }
                q.field_d = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              qe.a(-123, "S1", (Throwable) ((Object) var5));
              var10 = (String) null;
              il.a(7110, (String) null);
              q.field_d = null;
            }
          }
          if (var4 == 15) {
            eg.field_d = 10;
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

    private final void a(byte param0, boolean param1) {
        wc.field_x[3] = true;
        wc.field_x[8] = param1;
        wc.field_x[16] = true;
        wc.field_x[18] = true;
        wc.field_x[0] = true;
        if (param0 < 126) {
          field_s = -20;
        }
        wc.field_x[17] = true;
        wc.field_x[7] = true;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, byte param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        bb.field_d = this.field_q;
        ke.a(41, bb.field_d);
        sg.a(5000, this.field_D, this.field_C, bb.field_d, ic.field_d, param5, 96, param4, this.field_y, 5000, this.field_A, this.field_z, this.field_r, this.field_o);
        bg.a(69, this.field_r, bb.field_d, this.field_A, ic.field_d, param5, this.field_C, this.field_z, this.field_D);
        bl.a((byte) -62);
        og.field_c = ck.n(2113632);
        nc.a(qd.field_j, (byte) 123);
        nk.field_b = param1;
        ck.field_hb = param3;
        ki.field_A = param0;
        vd.field_b = param2;
        int var10 = 11 / ((param6 - 30) / 36);
        wd.field_d = param7;
        this.i(18);
        df.a(-3);
    }

    final int c(int param0, boolean param1) {
        if (param0 != -25186) {
          this.field_q = 86;
        }
        return this.a(param1, true, true);
    }

    private final void e(int param0) {
        if (param0 != 5978) {
          return;
        }
        wc.field_x[4] = true;
    }

    private final void j(byte param0) {
        int var4 = 0;
        byte[] var5 = null;
        int var2 = ae.field_N.f(4);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        if (param0 == 108) {
          var4 = -1 + ue.field_b;
          var5 = new byte[var4];
          ae.field_N.a(var5, true, 0, var4);
          fk.a(hf.a((byte) -113), var3 != 0, se.a(param0 - 108, var5), (byte) 103);
          return;
        }
    }

    private final void i(byte param0) {
        int var2 = -75 / ((35 - param0) / 59);
        wc.field_x[1] = true;
    }

    public static void m(int param0) {
        int var1 = 77 / ((param0 - 79) / 32);
        field_u = null;
        field_t = null;
    }

    final void a(int param0, boolean param1, String param2) {
        try {
          this.a(param0, 480, param2, 640, -7);
          if (!param1) {
            this.c(false);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rb.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        boolean stackIn_100_0 = false;
        int stackIn_102_1 = 0;
        String stackIn_102_2 = null;
        boolean stackIn_103_3;
        int stackIn_133_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = stellarshard.field_B;
        if (null != ja.field_m) {
          if (null == pd.field_f) {
            var6 = v.a(true);
            var4 = var6.getSize();
            ja.field_m.a((byte) 81, var4.width, var4.height);
          }
          ja.field_m.b(0);
        }
        ci.a(36);
        ii.g(256);
        if (!ee.b(-117) &&
          eg.field_d != 11) {
          ie.d((byte) -56);
        }
        if (null != og.field_c) {
          ke.field_b = og.field_c.b(-115);
        }
        if (ih.b(12871)) {
          var3 = ea.f((byte) -21) * 1200;
          if (this.field_p ||
            !(kf.a(65280) <= var3) &&
            !(var3 >= gh.a(true))) {
            this.field_p = false;
            oj.c(-2290);
            pk.a(4);
            wl.a(2, -8440, wc.field_p);
            cm.a((byte) -117);
            pc.field_m = true;
            vc.field_a = ih.a((byte) -98) + 15000L;
          }
        }
        if (ei.field_F == -1 ||
          ei.field_F == 0) {
          stackIn_24_0 = (-1 != ei.field_F) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          ei.field_F = fa.d(0);
          if (var3Lifetime1 != 0 &&
            ei.field_F == 0 &&
            eg.field_d == 11 &&
            !il.e(32525)) {
            db.a(111);
          }
          if (ei.field_F != -1 &&
            ei.field_F != 0) {
            vc.field_a = ih.a((byte) -98) + 15000L;
          }
        }
        if (param0 <= 15) {
          field_t = (String) null;
        }
        if (-1 != ei.field_F &&
          ei.field_F != 0) {
          if (rk.field_f < 10) {
            if (ei.field_F == 3) {
              this.a(1, "js5crc");
            } else {
              if (4 == ei.field_F) {
                this.a(1, "js5io");
              } else {
                if (2 == ei.field_F) {
                  this.a(1, "js5connect_full");
                } else {
                  if (5 != ei.field_F) {
                    this.a(1, "js5connect");
                  } else {
                    this.a(1, "outofdate");
                  }
                }
              }
            }
          } else {
            if (eg.field_d >= 10) {
              pk.a(4);
              if (ei.field_F == 3) {
                wl.a(256, -8440, al.field_a);
              } else {
                if (ei.field_F == 4) {
                  wl.a(256, -8440, eb.field_d);
                } else {
                  if (2 != ei.field_F) {
                    if (ei.field_F != 5) {
                      wl.a(256, -8440, ui.field_B);
                    } else {
                      wl.a(5, -8440, ah.field_n);
                    }
                  } else {
                    wl.a(256, -8440, ea.field_n);
                  }
                }
              }
              pc.field_m = true;
            }
          }
        }
        if ((ei.field_F != -1 &&
          ei.field_F != 0 ||
          il.e(32525)) &&
          ih.a((byte) -98) >= vc.field_a) {
          pc.field_m = false;
          if (ei.field_F != -1 &&
            ei.field_F != 0) {
            ei.field_F = -1;
            ee.a(88);
          }
        }
        if (ei.field_F == 0 &&
          !il.e(32525)) {
          b.field_v = false;
        }
        if (0 == rk.field_f &&
          tg.a((byte) 49)) {
          rk.field_f = 1;
        }
        if (rk.field_f == 1) {
          if (bb.field_d != 0) {
            pg.field_db = wl.a(1, ki.field_A);
          }
          lk.field_i = o.a(1, 2, nk.field_b, false, true);
          wf.field_e = o.a(1, 2, ck.field_hb, false, true);
          am.field_g = o.a(1, 2, vd.field_b, false, true);
          rk.field_f = 2;
          fc.field_a = lk.field_i;
          ie.field_u = wf.field_e;
        }
        if (rk.field_f == 2) {
          if (pg.field_db != null &&
            pg.field_db.a((byte) -36)) {
            if (!pg.field_db.c("", (byte) -116)) {
              pg.field_db = null;
            } else {
              if (pg.field_db.a("", (byte) -109)) {
                g.a(pg.field_db, 1);
                pg.field_db = null;
                rg.g(-33);
              }
            }
          }
          if (null == pg.field_db) {
            rk.field_f = 3;
          }
        }
        if (rk.field_f == 3 &&
          ni.a(wf.field_e, am.field_g, lk.field_i, (byte) -104) &&
          dj.a(am.field_g, (byte) -126)) {
          ol.b(-114);
          gk.a(false);
          am.field_i = fl.field_c;
          qh.field_d = false;
          hc.a(am.field_g, lk.field_i, wf.field_e, uj.field_f, (byte) -88);
          if (v.field_b ||
            null != ai.field_g) {
            stackIn_100_0 = !(v.field_b);
            stackIn_102_1 = -1;
            stackIn_102_2 = ai.field_g;
            stackIn_103_3 = !(v.field_b);
            ai.a(stackIn_100_0, stackIn_102_1, stackIn_102_2, stackIn_103_3);
          }
          if (wi.field_a) {
            qh.a(true);
          }
          if (pg.field_cb == null) {
            pg.field_cb = fk.d(75);
            mj.field_L = qc.a(1);
          }
          ab.a(am.field_g, true, mj.field_L, pg.field_cb);
          lk.field_i = null;
          wf.field_e = null;
          am.field_g = null;
          aa.a((java.applet.Applet) (this), -106);
          rg.g(-33);
          rk.field_f = 10;
        }
        if (rk.field_f == 10) {
          if (bb.field_d != 0) {
            ld.field_G = wl.a(1, wd.field_d);
          }
          rk.field_f = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (rk.field_f == 11) {
          if (ld.field_G != null && (!ld.field_G.a((byte) -36) ||
            !ld.field_G.c((byte) -111))) {
            rd.a((byte) -76, 0.0f, pi.a(kf.field_d, ld.field_G, rg.field_I, 1));
            decompiledFrameRemainder0 = false;
          }
          else {
            rk.field_f = 12;
            qd.field_h = true;
          }
        }
        if (rk.field_f == 12 &&
          !qd.field_h) {
          rk.field_f = 13;
        }
        if (rk.field_f == 13) {
          var3Lifetime2 = 1;
          if (fa.field_n != null) {
            stackIn_133_0 = (!fa.field_n.a(true)) ? 0 : 1;
            var3Lifetime2 = stackIn_133_0;
            rd.a((byte) -83, fa.field_n.field_a, fa.field_n.field_g);
          }
          if (var3Lifetime2 != 0) {
            rk.field_f = 20;
          }
        }
        if (!param1 &&
          tl.field_d) {
          nd.a(-26621, qd.field_j);
          this.c(31178);
          nc.a(qd.field_j, (byte) 118);
        }
        if (wc.field_x[8]) {
          o.b(-10834);
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = la.a(param2, (byte) 110);
          if (-1 != param0.indexOf(param2)) {
            return true;
          }
          if (param0.indexOf(var3) != -1) {
            return true;
          }
          if (param1 >= -24) {
            rb.g(19);
          }
          stackIn_14_0 = (param0.startsWith(param2)) || (param0.startsWith(var3)) || (param0.endsWith(param2)) || (param0.endsWith(var3));
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("rb.W(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        int discarded$0 = 0;
        String var2 = wa.a(-1);
        be.a(hf.a((byte) -70), var2, (byte) 116);
        if (param0) {
          discarded$0 = this.a(false, false, true);
        }
    }

    final static String j(int param0) {
        if (dj.field_a == o.field_l) {
          return sb.field_a;
        }
        if (param0 != 5) {
          field_t = (String) null;
        }
        if (!al.field_f.a(true)) {
          return al.field_f.c(-112);
        }
        if (dj.field_a == el.field_E) {
          return al.field_f.c(param0 - 122);
        }
        return va.field_a;
    }

    private final void a(int param0, int param1, String param2, int param3, int param4) {
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
            if (!this.g((byte) 93)) {
              return;
            }
            this.field_C = this.getCodeBase().getHost();
            var6 = this.field_C.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_x = stackIn_8_1;
            this.field_A = Integer.parseInt(this.getParameter("gameport1"));
            this.field_D = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_z = Integer.parseInt(var7);
            }
            this.field_r = Integer.parseInt(this.getParameter("gamecrc"));
            if (param4 != -7) {
              return;
            }
            this.field_y = Long.parseLong(this.getParameter("instanceid"));
            this.field_o = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_q = Integer.parseInt(var8);
            }
            if (this.field_q >= 5) {
              this.field_q = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_v = Integer.parseInt(var9);
            }
            wi.field_a = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, param0, param1, this.field_r, param4 - 111, param3, param2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            qe.a(-105, (String) null, (Throwable) ((Object) var6_ref));
            this.a(1, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("rb.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void h(int param0) {
        boolean stackIn_32_0 = false;
        int var2;
        nj var3;
        int var4;
        var4 = stellarshard.field_B;
        var2 = ja.field_t;
        if (var2 < 64 &&
          wc.field_x[var2]) {
          if (param0 != 6476) {
            return;
          }
          if (var2 == 0) {
            return;
          }
          if (1 == var2) {
            pe.c(param0 + 18738);
          } else {
            if (var2 == 2) {
              eh.a(-1);
            } else {
              if (var2 != 3) {
                if (var2 == 4) {
                  v.a((byte) -125);
                } else {
                  if (5 == var2) {
                    nf.a((byte) 84);
                  } else {
                    if (var2 != 6) {
                      if (var2 != 7) {
                        if (8 != var2) {
                          if (var2 == 16) {
                            ue.a((byte) -121);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                n.d((byte) 4);
                                return;
                              }
                              if (var2 == 17) {
                                this.j((byte) 108);
                                return;
                              }
                              if (var2 == 18) {
                                sl.a((byte) 51);
                                return;
                              }
                              qe.a(-6, "MGS1: " + bh.b((byte) -98), (Throwable) null);
                              oj.c(-2290);
                              return;
                            }
                            stackIn_32_0 = (var2 == 12);
                            var3 = ff.a(stackIn_32_0, (byte) 92);
                            ok.a((byte) -54, var3);
                          }
                        } else {
                          fb.a(ae.field_N, ue.field_b, ic.field_d, 20);
                        }
                      } else {
                        this.b(false);
                      }
                    } else {
                      df.c(-88);
                    }
                  }
                }
              } else {
                jf.e(116);
              }
            }
          }
          return;
        }
        qe.a(86, "MGS2: " + bh.b((byte) -118), (Throwable) null);
        oj.c(-2290);
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        this.a((byte) 127, false);
        if (param3) {
          this.i((byte) -110);
        }
        if (param4) {
          this.c(false);
        }
        if (param0) {
          this.e(5978);
        }
        if (param2) {
          this.h((byte) 28);
        }
        if (param1 >= -70) {
          this.i(-7);
        }
    }

    private final void h(byte param0) {
        if (param0 != 28) {
          return;
        }
        wc.field_x[5] = true;
    }

    final int f(int param0) {
        int var2 = this.l(param0 + 15981);
        if (var2 == 0 ||
          var2 == 1) {
          if (wc.field_x[1]) {
            fa.a(2, param0 ^ 16064);
          }
          if (wc.field_x[2]) {
            vk.a((byte) -128, 3);
          }
          if (wc.field_x[3]) {
            se.a(4, -91);
          }
          if (wc.field_x[4]) {
            ic.a(5, 55);
          }
          if (wc.field_x[5]) {
            h.a(-96, 6);
          }
          if (wc.field_x[6]) {
            sl.a(7, (byte) -105);
          }
          if (wc.field_x[8]) {
            we.a((byte) 15);
          }
        }
        if (param0 != -16028) {
          this.field_o = false;
        }
        return var2;
    }

    private final int l(int param0) {
        int var2;
        if (this.field_g) {
          return -1;
        }
        if (!il.e(32525)) {
          return -1;
        }
        if (pc.field_m) {
          return -1;
        }
        var2 = wj.a(wh.a((byte) 116), this.field_v, this.field_x, tc.c(-5), (byte) 71, true);
        if (-1 == var2) {
          return -1;
        }
        if (param0 >= -36) {
          this.i((byte) 122);
        }
        if (0 != var2 &&
          var2 != 1) {
          if (!pf.field_c) {
            this.a(1, "reconnect");
          }
          pk.a(4);
          wl.a(var2, -8440, ga.field_a);
          pc.field_m = true;
          vc.field_a = 15000L + ih.a((byte) -98);
          return var2;
        }
        if (11 == eg.field_d &&
          ei.field_F == 0) {
          db.a(-113);
        }
        return var2;
    }

    protected rb() {
    }

    static {
        field_t = "achievements to collect";
    }
}
