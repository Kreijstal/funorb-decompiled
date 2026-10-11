/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ig extends fa {
    private long field_v;
    private int field_u;
    private int field_n;
    static int field_l;
    static ci field_y;
    String field_q;
    private int field_w;
    private int field_s;
    private static qb field_m;
    private boolean field_r;
    private boolean field_t;
    private int field_o;
    private int field_p;
    private boolean field_x;

    final void g(int param0) {
        boolean stackIn_28_0 = false;
        int var2;
        sg var3;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (param0 > -70) {
          return;
        }
        var2 = ca.field_e;
        if (var2 < 64 &&
          c.field_e[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              vd.a(16);
            } else {
              if (var2 == 3) {
                lc.c(false);
              } else {
                if (var2 == 4) {
                  jl.d(1);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      wc.a((byte) 116);
                    } else {
                      if (var2 != 7) {
                        if (8 != var2) {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                nl.a((byte) -7);
                                return;
                              }
                              if (var2 == 17) {
                                this.h((byte) 98);
                                return;
                              }
                              if (var2 == 18) {
                                rg.n(82);
                                return;
                              }
                              d.a((Throwable) null, -110, "MGS1: " + ik.q(48));
                              pc.a(1);
                              return;
                            }
                            stackIn_28_0 = (var2 == 12);
                            var3 = id.a(stackIn_28_0, (byte) 9);
                            jh.a(var3, 16);
                          } else {
                            uc.a((byte) 98);
                          }
                        } else {
                          ua.a(tg.field_a, lk.field_b, -22635, nf.field_l);
                        }
                      } else {
                        this.e((byte) -125);
                      }
                    }
                  } else {
                    wg.b(4);
                  }
                }
              }
            }
          } else {
            gh.d(0);
          }
          return;
        }
        d.a((Throwable) null, 73, "MGS2: " + ik.q(48));
        pc.a(1);
        return;
    }

    private final int j(byte param0) {
        int var2;
        if (this.field_j) {
          return -1;
        }
        if (!vc.e(false)) {
          return -1;
        }
        if (wi.field_p) {
          return -1;
        }
        var2 = wc.a(this.field_n, 56, mc.a((byte) 102), this.field_x, true, cd.b(param0 ^ -73));
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          1 != var2) {
          if (!pd.field_b) {
            this.a((byte) -95, "reconnect");
          }
          je.a(-11);
          gb.a(var2, -89, Transmogrify.field_B);
          wi.field_p = true;
          qf.field_b = lk.a(0) + 15000L;
          if (param0 == 54) {
            return var2;
          }
          return -107;
        }
        if (gl.field_y == 11 &&
          tb.field_a == 0) {
          di.d(-4690);
        }
        return var2;
    }

    final void b(boolean param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var3;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0) {
          this.b(false);
        }
        if (!pa.b(-47)) {
          if (bi.field_L >= 10) {
            if (!ki.b(true)) {
              ga.a((byte) 94);
            } else {
              if (gl.field_y == 0) {
                discarded$6 = this.a(2625, false, false);
              } else {
                gj.a(true, f.field_a);
              }
            }
          }
        } else {
          stackIn_5_1 = 2625;
          stackIn_6_2 = (ub.field_c != null);
          discarded$7 = this.a(stackIn_5_1, stackIn_6_2, false);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        w.field_f = this.field_o;
        cf.a(1856642, w.field_f);
        ol.a(this.field_p, 5000, this.field_u, this.field_v, lk.field_b, this.field_w, 5000, this.field_r, param2, this.field_q, param6, 64, w.field_f, this.field_s);
        me.a(this.field_s, this.field_u, 50, this.field_q, param2, this.field_w, this.field_p, w.field_f, lk.field_b);
        wh.e((byte) -42);
        ga.field_a = nh.b(1);
        cj.a(gd.field_k, 13861);
        rd.field_a = param4;
        ic.field_a = param5;
        uh.field_q = param3;
        q.field_d = param0;
        di.field_d = param7;
        this.c(true);
        rf.q(param1 ^ param1);
    }

    final void a(String param0, boolean param1, int param2) {
        try {
          if (param1) {
            this.field_x = true;
          }
          this.a(480, param2, 640, param0, -19492);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ig.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        c.field_e[17] = true;
        if (param0 <= 27) {
          String var4 = (String) null;
          this.a((String) null, true, -8);
        }
        c.field_e[8] = param1;
        c.field_e[16] = true;
        c.field_e[7] = true;
        c.field_e[3] = true;
        c.field_e[0] = true;
        c.field_e[18] = true;
    }

    final static boolean a(int param0, boolean param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          if (2 <= param0 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = param1 ? 1 : 0;
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (43 != var9 ||
                !param2))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (param0 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param0;
                if (var6 != var10 / param0) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_37_0 = var5;
            return stackIn_37_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("ig.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        if (param0 != 59) {
          return;
        }
        c.field_e[2] = true;
    }

    final int f(byte param0) {
        int discarded$1 = 0;
        int var2;
        if (param0 != 102) {
          discarded$1 = this.j((byte) -124);
        }
        var2 = this.j((byte) 54);
        if (var2 == 0 ||
          var2 == 1) {
          if (c.field_e[1]) {
            bl.a(false, 2);
          }
          if (c.field_e[2]) {
            tf.a(3, false);
          }
          if (c.field_e[3]) {
            fg.a((byte) -98, 4);
          }
          if (c.field_e[4]) {
            eg.a(false, 5);
          }
          if (c.field_e[5]) {
            ua.a(-44, 6);
          }
          if (c.field_e[6]) {
            rb.a(7, (byte) -124);
          }
          if (c.field_e[8]) {
            ob.l(-74);
          }
        }
        return var2;
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        boolean stackIn_7_1 = false;
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
        try {
          try {
            if (!this.c((byte) 125)) {
              return;
            }
            this.field_q = this.getCodeBase().getHost();
            var6 = this.field_q.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_x = stackIn_7_1;
            this.field_s = Integer.parseInt(this.getParameter("gameport1"));
            this.field_p = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_u = Integer.parseInt(var7);
            }
            this.field_w = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_v = Long.parseLong(this.getParameter("instanceid"));
            this.field_r = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_o = Integer.parseInt(var8);
            }
            if (this.field_o >= 5) {
              this.field_o = 0;
            }
            if (param4 != -19492) {
              this.field_p = 33;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_n = Integer.parseInt(var9);
            }
            nl.field_h = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a((byte) 79, param0, param3, this.field_w, param1, 32, param2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            d.a((Throwable) ((Object) var6_ref), param4 + 19370, (String) null);
            this.a((byte) -123, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var6_ref2;
          stackIn_24_1 = new StringBuilder().append("ig.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void i(int param0) {
        if (param0 != -15038) {
          this.b(-59, false);
        }
        c.field_e[5] = true;
    }

    final void a(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        int stackIn_103_0 = 0;
        boolean stackIn_104_1 = false;
        String stackIn_106_2 = null;
        boolean stackIn_107_3;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (vg.field_b != null) {
          if (null == ub.field_c) {
            var6 = ah.b(param0 - 28270);
            var4 = var6.getSize();
            vg.field_b.a(var4.height, var4.width, 123);
          }
          vg.field_b.b(0);
        }
        fd.a(true);
        vi.a((byte) 126);
        if (param0 != 10017) {
          this.field_p = -31;
        }
        if (!rd.b(70) &&
          11 != gl.field_y) {
          kf.d(param0 ^ 10019);
        }
        if (null != ga.field_a) {
          f.field_a = ga.field_a.a(-126);
        }
        if (i.b(true)) {
          var3 = 1200 * wi.b(-70);
          if (this.field_t ||
            !(il.b((byte) -20) <= var3) &&
            !(var3 >= qg.d(param0 ^ -30510))) {
            this.field_t = false;
            pc.a(1);
            je.a(-11);
            gb.a(2, 88, k.field_a);
            k.b(true);
            wi.field_p = true;
            qf.field_b = 15000L + lk.a(param0 - 10017);
          }
        }
        if (tb.field_a == -1 ||
          tb.field_a == 0) {
          stackIn_24_0 = (-1 != tb.field_a) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          tb.field_a = rl.b((byte) -6);
          if (var3Lifetime1 != 0 &&
            tb.field_a == 0 &&
            gl.field_y == 11 &&
            !vc.e(false)) {
            di.d(-4690);
          }
          if (tb.field_a != -1 &&
            tb.field_a != 0) {
            qf.field_b = 15000L + lk.a(0);
          }
        }
        if (tb.field_a != -1 &&
          tb.field_a != 0) {
          if (bi.field_L >= 10) {
            if (10 <= gl.field_y) {
              je.a(-11);
              if (3 == tb.field_a) {
                gb.a(256, -102, uc.field_e);
              } else {
                if (tb.field_a == 4) {
                  gb.a(256, 39, il.field_b);
                } else {
                  if (2 != tb.field_a) {
                    if (5 != tb.field_a) {
                      gb.a(256, -89, hj.field_o);
                    } else {
                      gb.a(5, -115, ta.field_g);
                    }
                  } else {
                    gb.a(256, param0 - 10103, ub.field_b);
                  }
                }
              }
              wi.field_p = true;
            }
          } else {
            if (3 != tb.field_a) {
              if (tb.field_a == 4) {
                this.a((byte) -122, "js5io");
              } else {
                if (2 != tb.field_a) {
                  if (5 == tb.field_a) {
                    this.a((byte) -117, "outofdate");
                  } else {
                    this.a((byte) -102, "js5connect");
                  }
                } else {
                  this.a((byte) -100, "js5connect_full");
                }
              }
            } else {
              this.a((byte) -127, "js5crc");
            }
          }
        }
        if ((tb.field_a != -1 &&
          0 != tb.field_a ||
          vc.e(false)) &&
          lk.a(0) >= qf.field_b) {
          wi.field_p = false;
          if (-1 != tb.field_a &&
            0 != tb.field_a) {
            tb.field_a = -1;
            aj.k(0);
          }
        }
        if (tb.field_a == 0 &&
          !vc.e(false)) {
          g.field_A = false;
        }
        if (0 == bi.field_L &&
          sj.e(31)) {
          bi.field_L = 1;
        }
        if (bi.field_L == 1) {
          if (w.field_f != 0) {
            hg.field_a = cg.a((byte) -82, uh.field_q);
          }
          cj.field_c = ec.a(true, (byte) 77, 1, ic.field_a, false);
          wi.field_e = ec.a(true, (byte) 77, 1, q.field_d, false);
          nd.field_n = ec.a(true, (byte) 77, 1, rd.field_a, false);
          li.field_k = cj.field_c;
          bi.field_L = 2;
          field_y = wi.field_e;
        }
        if (2 == bi.field_L) {
          if (null != hg.field_a &&
            hg.field_a.a((byte) -117)) {
            if (hg.field_a.b((byte) -120, "")) {
              if (hg.field_a.a((byte) 117, "")) {
                kl.a(7, hg.field_a);
                hg.field_a = null;
                el.b(-6491);
              }
            } else {
              hg.field_a = null;
            }
          }
          if (null == hg.field_a) {
            bi.field_L = 3;
          }
        }
        if (bi.field_L == 3 &&
          ud.a(nd.field_n, true, cj.field_c, wi.field_e) &&
          qd.a(nd.field_n, (byte) -109)) {
          gj.e(0);
          wl.p(121);
          bg.field_n = false;
          ea.field_n = j.field_a;
          cf.a(nd.field_n, wi.field_e, cj.field_c, wd.field_g, (byte) 122);
          if (di.field_b ||
            null != lb.field_h) {
            stackIn_103_0 = 5;
            stackIn_104_1 = !(di.field_b);
            stackIn_106_2 = lb.field_h;
            stackIn_107_3 = !(di.field_b);
            td.a(stackIn_103_0, stackIn_104_1, stackIn_106_2, stackIn_107_3);
          }
          if (nl.field_h) {
            gg.b(4);
          }
          if (null == lf.field_d) {
            lf.field_d = kh.a((byte) 91);
            tj.field_u = hg.b(param0 ^ 10017);
          }
          ad.a(lf.field_d, tj.field_u, 22313, nd.field_n);
          wi.field_e = null;
          cj.field_c = null;
          nd.field_n = null;
          gh.a((java.applet.Applet) (this), (byte) -112);
          el.b(-6491);
          bi.field_L = 10;
        }
        if (10 == bi.field_L) {
          if (w.field_f != 0) {
            nk.field_d = cg.a((byte) -82, di.field_d);
          }
          bi.field_L = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (bi.field_L == 11) {
          if (null != nk.field_d && (!nk.field_d.a((byte) -122) ||
            !nk.field_d.c(32031))) {
            vf.a((byte) -122, 0.0f, u.a(dj.field_c, od.field_h, nk.field_d, true));
            decompiledFrameRemainder0 = false;
          }
          else {
            bi.field_L = 12;
            wf.field_a = true;
          }
        }
        if (12 == bi.field_L &&
          !wf.field_a) {
          bi.field_L = 13;
        }
        if (13 == bi.field_L) {
          var3Lifetime2 = 1;
          if (null != kh.field_c) {
            stackIn_138_0 = (!kh.field_c.a(param0 ^ 10020)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            vf.a((byte) -125, kh.field_c.field_c, kh.field_c.field_a);
          }
          if (var3Lifetime2 != 0) {
            bi.field_L = 20;
          }
        }
        if (!param1 &&
          mg.field_c) {
          gd.a(gd.field_k, (byte) 111);
          this.a(false);
          cj.a(gd.field_k, param0 + 3844);
        }
        if (c.field_e[8]) {
          Transmogrify.m(param0 ^ 10050);
        }
    }

    public static void i(byte param0) {
        field_y = null;
        field_m = null;
        int var1 = -128 % ((param0 - 21) / 35);
    }

    final int a(boolean param0, int param1) {
        if (param1 < 73) {
          this.a(false, -89);
        }
        return this.a(2625, param0, true);
    }

    private final void h(int param0) {
        c.field_e[1] = true;
        if (param0 != -21646) {
          this.a(true, -82);
        }
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
          oa var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Transmogrify.field_A ? 1 : 0;
          var4 = mg.a(w.field_f, param1, f.field_a, true);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = va.a(be.c(70), ba.e(-45), (byte) -113);
            if (var5_int != -1) {
              he.a(wh.field_F, (byte) 89, Transmogrify.field_B, var5_int);
              Transmogrify.field_B = null;
              wh.field_F = null;
            }
            var11 = le.d(true);
            if (var11 != null) {
              sc.a(var11.booleanValue(), -24522);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = nl.a(this.field_n, le.h(44), mc.a((byte) 102), 2, wk.a((byte) -124), el.a(param0 ^ 2616), cd.b(76));
            if (var5_intLifetime1 != -1) {
              el.a(var5_intLifetime1, (byte) 33, Transmogrify.field_B, wh.field_F);
              Transmogrify.field_B = null;
              wh.field_F = null;
            }
          }
          if (3 == var4) {
            if (tb.field_a != -1 &&
              tb.field_a != 0) {
              tb.field_a = -1;
              aj.k(0);
            }
            if (param2) {
              wi.field_p = false;
            } else {
              var5_intLifetime2 = wc.a(this.field_n, -122, mc.a((byte) 102), this.field_x, false, cd.b(param0 ^ -2582));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  gb.a(var5_intLifetime2, param0 ^ -2617, Transmogrify.field_B);
                  Transmogrify.field_B = null;
                } else {
                  oi.field_i = ac.field_j;
                  di.d(-4690);
                  gl.field_y = 10;
                  ge.field_x = false;
                }
              }
            }
          }
          if (4 == var4) {
            if (!wd.field_g) {
              ge.field_x = true;
              gl.field_y = 10;
            } else {
              ki.a((byte) 3, ha.b(75));
            }
          }
          if (param0 != 2625) {
            this.b(-119, false);
          }
          if (var4 == 5) {
            vl.a((byte) -98, ha.b(74));
          }
          if (var4 == 6 &&
            bg.field_n) {
            gl.field_y = 10;
          }
          if (7 == var4) {
            uc.a(0, ha.b(param0 - 2534));
          }
          if (8 == var4) {
            ki.a((byte) 3, ha.b(111));
          }
          if (var4 == 9) {
            v.a((byte) -67, ha.b(87));
          }
          if (var4 == 10) {
            ff.field_D.a(false, 17);
          }
          if (var4 == 11) {
            ol.a(ha.b(param0 ^ 2581), param0 + 27569);
          }
          if (12 == var4) {
            ia.a(ha.b(109), 6, hd.a(param0 ^ 2625));
          }
          if (var4 == 13) {
            try {
              if (null == field_m) {
                field_m = new qb(lk.field_b, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (field_m.a(0)) {
                var12 = field_m.b(113);
                if (var12 != null) {
                  var7 = cc.a(0, param0 + 13298, var12.field_h, var12.field_g);
                  bg.a((byte) -120, var7);
                } else {
                  var9 = (String) null;
                  bg.a((byte) -118, (String) null);
                }
                field_m = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              d.a((Throwable) ((Object) var5), -117, "S1");
              var10 = (String) null;
              bg.a((byte) -123, (String) null);
              field_m = null;
            }
          }
          if (var4 == 15) {
            gl.field_y = 10;
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

    private final void d(byte param0) {
        c.field_e[4] = true;
        if (param0 != -36) {
          this.field_t = false;
        }
    }

    private final void e(byte param0) {
        String var2 = Transmogrify.k(72);
        gb.a(ha.b(109), (byte) -119, var2);
        if (param0 > -105) {
          this.g((byte) -48);
        }
    }

    protected ig() {
    }

    private final void h(byte param0) {
        if (param0 < 62) {
          this.field_w = 125;
        }
        int var2 = nf.field_l.d((byte) 110);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = tg.field_a - 1;
        byte[] var5 = new byte[var4];
        nf.field_l.a(var5, var4, 0, 18570);
        ea.a((byte) 68, ha.b(127), var3 != 0, eg.a(106, var5));
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, byte param4) {
        this.b(84, false);
        if (param3) {
          this.h(-21646);
        }
        if (param0) {
          this.g((byte) 59);
        }
        if (param4 != 9) {
          return;
        }
        if (param1) {
          this.d((byte) -36);
        }
        if (param2) {
          this.i(-15038);
        }
    }

    private final void c(boolean param0) {
        ek.field_c[9] = -1;
        ek.field_c[17] = -1;
        ek.field_c[5] = -1;
        ek.field_c[2] = -2;
        ek.field_c[1] = 16;
        ek.field_c[7] = -1;
        ek.field_c[4] = -1;
        ek.field_c[18] = 1;
        ek.field_c[13] = -1;
        ek.field_c[12] = -1;
        if (!param0) {
          return;
        }
        ek.field_c[6] = -2;
        ek.field_c[8] = -2;
        ek.field_c[3] = -1;
        ek.field_c[11] = -1;
        ek.field_c[10] = -1;
        ek.field_c[16] = -1;
    }

    static {
    }
}
