/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ud extends dc {
    private int field_m;
    static int[][] field_z;
    static int[] field_p;
    static String field_u;
    private int field_n;
    private long field_v;
    static int field_w;
    static String field_o;
    static String field_r;
    private int field_C;
    private int field_B;
    static long field_E;
    private boolean field_A;
    String field_q;
    static eg field_D;
    static String field_y;
    private int field_l;
    private boolean field_s;
    private int field_x;
    private boolean field_t;

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        gm.field_f = this.field_n;
        nh.a(false, gm.field_f);
        na.a(this.field_B, param2, this.field_l, 0, this.field_s, this.field_q, param4, this.field_x, gm.field_f, 5000, this.field_v, this.field_C, fi.field_d, param0);
        ve.a((byte) -81, gm.field_f, this.field_C, this.field_x, fi.field_d, param2, this.field_B, this.field_l, this.field_q);
        ag.a((byte) -60);
        nh.field_w = qj.a((byte) -86);
        n.a(on.field_c, (byte) 122);
        sa.field_Bb = param6;
        u.field_g = param1;
        dm.field_H = param7;
        ce.field_n = param5;
        cj.field_d = param3;
        this.k(param4 ^ 5016);
        kn.g(false);
    }

    private final void l(int param0) {
        cc.field_d[1] = true;
        if (param0 > -72) {
          this.field_n = -27;
        }
    }

    private final void c(int param0) {
        if (param0 <= 35) {
          return;
        }
        cc.field_d[6] = true;
    }

    public static void d(boolean param0) {
        field_u = null;
        field_D = null;
        field_o = null;
        field_r = null;
        field_y = null;
        if (!param0) {
          ud.d(true);
        }
        field_p = null;
        field_z = (int[][]) null;
    }

    private final void j(int param0) {
        int var2 = 9 / ((56 - param0) / 58);
        cc.field_d[4] = true;
    }

    final int b(boolean param0, boolean param1) {
        if (!param1) {
          String var4 = (String) null;
          this.a(119, (String) null, 12, (byte) -85, -59);
        }
        return this.a(false, true, param0);
    }

    final void a(int param0, String param1, int param2, byte param3, int param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        try {
          try {
            if (!this.a((byte) -71)) {
              return;
            }
            this.field_q = this.getCodeBase().getHost();
            var11 = this.field_q.toLowerCase();
            stackIn_7_1 = (var11.equals("jagex.com")) || (var11.endsWith(".jagex.com"));
            this.field_t = stackIn_7_1;
            this.field_C = Integer.parseInt(this.getParameter("gameport1"));
            this.field_x = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_l = Integer.parseInt(var7);
            }
            this.field_B = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_v = Long.parseLong(this.getParameter("instanceid"));
            this.field_s = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_n = Integer.parseInt(var8);
            }
            if (param3 > -65) {
              this.field_l = 7;
            }
            if (this.field_n >= 5) {
              this.field_n = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_m = Integer.parseInt(var9);
            }
            wa.field_Nb = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, param0, param1, 11431, this.field_B, param2, param4);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            jh.a((Throwable) ((Object) var6), (String) null, (byte) 20);
            this.a("crash", (byte) -125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref;
          stackIn_26_1 = new StringBuilder().append("ud.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
          String stackIn_66_0 = null;
          boolean stackIn_67_1 = false;
          Object stackIn_70_0 = null;
          boolean stackIn_71_1 = false;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          Boolean var10 = null;
          wk var11 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          var4 = tg.a(wn.field_y, param2, gm.field_f, 17);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = e.a(nl.f((byte) 13), -67, h.g((byte) 126));
            if (var5_int != -1) {
              fl.a(20657, me.field_E, ul.field_M, var5_int);
              ul.field_M = null;
              me.field_E = null;
            }
            var10 = dm.f(18727);
            if (var10 != null) {
              wh.a((byte) 117, var10.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = tk.a(ho.a((byte) 93), jd.b(-94), ed.k(-952), hc.b((byte) -107), this.field_m, k.a(0), (byte) -110);
            if (var5_intLifetime1 != -1) {
              pn.a(ul.field_M, var5_intLifetime1, -42, me.field_E);
              me.field_E = null;
              ul.field_M = null;
            }
          }
          if (3 == var4) {
            if (u.field_b != -1 &&
              u.field_b != 0) {
              u.field_b = -1;
              o.a((byte) -34);
            }
            if (param1) {
              kg.field_f = false;
            } else {
              var5_intLifetime2 = wn.a(this.field_m, 57, this.field_t, ed.k(-952), false, hc.b((byte) -108));
              if (-1 != var5_intLifetime2) {
                if (var5_intLifetime2 != 0) {
                  oa.a(!param0, var5_intLifetime2, me.field_E);
                  me.field_E = null;
                } else {
                  vg.field_K = fk.field_k;
                  ArcanistsMulti.j((byte) 48);
                  qe.field_p = false;
                  fj.field_j = 10;
                }
              }
            }
          }
          if (var4 == 4) {
            if (!lk.field_d) {
              qe.field_p = true;
              fj.field_j = 10;
            } else {
              gh.a(2, cd.e(120));
            }
          }
          if (5 == var4) {
            im.a((byte) 125, cd.e(121));
          }
          if (6 == var4 &&
            lh.field_n) {
            fj.field_j = 10;
          }
          if (var4 == 7) {
            hc.a(cd.e(116), 27901);
          }
          if (var4 == 8) {
            gh.a(2, cd.e(118));
          }
          if (var4 == 9) {
            g.a(cd.e(122), -10400);
          }
          if (10 == var4) {
            he.field_e.b((byte) -68, 17);
          }
          if (var4 == 11) {
            mc.a(30449, cd.e(122));
          }
          if (var4 == 12) {
            fk.a(cd.e(116), false, tl.b((byte) 121));
          }
          if (var4 == 13) {
            try {
              if (nf.field_P == null) {
                nf.field_P = new hn(fi.field_d, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (nf.field_P.c(-91)) {
                var11 = nf.field_P.b(21496);
                if (var11 == null) {
                  stackIn_70_0 = null;
                  stackIn_71_1 = !(param0);
                  bc.a((String) (stackIn_70_0), stackIn_71_1);
                } else {
                  var7 = ba.a(0, var11.field_g, (byte) -123, var11.field_j);
                  stackIn_66_0 = var7;
                  stackIn_67_1 = !(param0);
                  bc.a(stackIn_66_0, stackIn_67_1);
                }
                nf.field_P = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              jh.a((Throwable) ((Object) var5), "S1", (byte) 20);
              var9 = (String) null;
              bc.a((String) null, true);
              nf.field_P = null;
            }
          }
          if (param0) {
            return 118;
          }
          if (15 == var4) {
            fj.field_j = 10;
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

    final void d(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 >= -87) {
          this.field_l = 90;
        }
        if (ue.a(122)) {
          discarded$1 = this.a(false, false, ka.field_m != null ? true : false);
        } else {
          if (ih.field_f >= 10) {
            if (!rl.d(true)) {
              wm.g((byte) 27);
            } else {
              if (0 != fj.field_j) {
                ia.a(-14296, wn.field_y);
              } else {
                discarded$2 = this.a(false, false, false);
              }
            }
          }
        }
    }

    private final void g(byte param0) {
        if (param0 < 89) {
          this.l(-128);
        }
        cc.field_d[13] = true;
        cc.field_d[12] = true;
        cc.field_d[11] = true;
    }

    final int e(int param0) {
        int var2;
        if (this.field_d) {
          return -1;
        }
        if (!ka.c((byte) -44)) {
          return -1;
        }
        if (kg.field_f) {
          return -1;
        }
        var2 = wn.a(this.field_m, 85, this.field_t, ed.k(-952), true, hc.b((byte) -112));
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          1 != var2) {
          if (!oj.field_h) {
            this.a("reconnect", (byte) -117);
          }
          fk.d(-11);
          if (param0 < 70) {
            this.j(92);
          }
          oa.a(true, var2, me.field_E);
          kg.field_f = true;
          tn.field_Hb = qj.b(-26572) + 15000L;
          return var2;
        }
        if (fj.field_j != 11) {
          return var2;
        }
        if (u.field_b != 0) {
          return var2;
        }
        ArcanistsMulti.j((byte) 48);
        return var2;
    }

    private final void k(int param0) {
        di.field_n[8] = -2;
        di.field_n[12] = -1;
        di.field_n[13] = -1;
        di.field_n[18] = 1;
        di.field_n[10] = -1;
        di.field_n[17] = -1;
        di.field_n[3] = -1;
        di.field_n[2] = -2;
        di.field_n[5] = -1;
        di.field_n[param0] = -1;
        di.field_n[11] = -1;
        di.field_n[6] = -2;
        di.field_n[4] = -1;
        di.field_n[1] = 16;
        di.field_n[9] = -1;
        di.field_n[7] = -1;
    }

    private final void b(boolean param0, int param1) {
        cc.field_d[7] = true;
        cc.field_d[17] = true;
        if (param1 != 51) {
          this.field_q = (String) null;
        }
        cc.field_d[18] = true;
        cc.field_d[8] = param0;
        cc.field_d[16] = true;
        cc.field_d[3] = true;
        cc.field_d[0] = true;
    }

    private final void f(int param0) {
        String var2 = qj.a(10040319);
        if (param0 != -18075) {
          return;
        }
        um.a(var2, cd.e(105), param0 ^ -29675);
    }

    final void g(int param0) {
        boolean stackIn_31_0 = false;
        int var2;
        jg var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = on.field_g;
        if (var2 < 64 &&
          cc.field_d[var2]) {
          if (param0 > -3) {
            this.a(true, true);
          }
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              if (var2 == 3) {
                fk.a((byte) -20);
              } else {
                if (4 == var2) {
                  om.g((byte) 29);
                } else {
                  if (var2 == 5) {
                    rb.c(-54);
                  } else {
                    if (6 == var2) {
                      pg.b(-112);
                    } else {
                      if (var2 == 7) {
                        this.f(-18075);
                      } else {
                        if (var2 == 8) {
                          qe.a(fi.field_d, fj.field_h, df.field_z, 0);
                        } else {
                          if (var2 != 16) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                nh.i((byte) 46);
                                return;
                              }
                              if (var2 == 17) {
                                this.c(false);
                                return;
                              }
                              if (var2 == 18) {
                                hf.c(105);
                                return;
                              }
                              jh.a((Throwable) null, "MGS1: " + nn.g((byte) -25), (byte) 20);
                              ka.b(false);
                              return;
                            }
                            stackIn_31_0 = (var2 == 12);
                            var3 = wl.a(stackIn_31_0, 86);
                            ql.a(var3, (byte) 111);
                          } else {
                            ql.a(true);
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              df.d(false);
            }
          } else {
            eh.b((byte) -128);
          }
          return;
        }
        jh.a((Throwable) null, "MGS2: " + nn.g((byte) -25), (byte) 20);
        ka.b(false);
    }

    private final void h(int param0) {
        if (param0 > -17) {
          field_D = (eg) null;
        }
        cc.field_d[2] = true;
    }

    final void a(boolean param0, boolean param1) {
        int stackIn_24_0 = 0;
        boolean stackIn_101_0 = false;
        String stackIn_103_1 = null;
        boolean stackIn_104_2 = false;
        int stackIn_133_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (ob.field_Y != null) {
          if (ka.field_m == null) {
            var6 = qe.a(-4);
            var4 = var6.getSize();
            ob.field_Y.a(var4.height, var4.width, true);
          }
          ob.field_Y.a((byte) 93);
        }
        j.a(24);
        vm.a(0);
        if (!oc.a(-15576) &&
          fj.field_j != 11) {
          i.a(0);
        }
        if (null != nh.field_w) {
          wn.field_y = nh.field_w.a(-1);
        }
        if (td.a(-97)) {
          var3 = gm.b(-2) * 1200;
          if (this.field_A ||
            !(be.a(1497225488) <= var3) &&
            !(ao.a(true) <= var3)) {
            this.field_A = false;
            ka.b(false);
            fk.d(-11);
            oa.a(true, 2, rl.field_j);
            hm.b(0);
            kg.field_f = true;
            tn.field_Hb = 15000L + qj.b(-26572);
          }
        }
        if (u.field_b == -1 ||
          u.field_b == 0) {
          stackIn_24_0 = (u.field_b != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          u.field_b = si.a((byte) 116);
          if (var3Lifetime1 != 0 &&
            u.field_b == 0 &&
            11 == fj.field_j &&
            !ka.c((byte) -44)) {
            ArcanistsMulti.j((byte) 48);
          }
          if (u.field_b != -1 &&
            u.field_b != 0) {
            tn.field_Hb = qj.b(-26572) + 15000L;
          }
        }
        if (u.field_b != -1 &&
          u.field_b != 0) {
          if (ih.field_f < 10) {
            if (3 == u.field_b) {
              this.a("js5crc", (byte) -128);
            } else {
              if (u.field_b == 4) {
                this.a("js5io", (byte) -128);
              } else {
                if (u.field_b == 2) {
                  this.a("js5connect_full", (byte) -126);
                } else {
                  if (5 == u.field_b) {
                    this.a("outofdate", (byte) -117);
                  } else {
                    this.a("js5connect", (byte) -126);
                  }
                }
              }
            }
          } else {
            if (fj.field_j >= 10) {
              fk.d(-11);
              if (u.field_b != 3) {
                if (u.field_b == 4) {
                  oa.a(true, 256, le.field_N);
                } else {
                  if (u.field_b == 2) {
                    oa.a(true, 256, ib.field_p);
                  } else {
                    if (u.field_b != 5) {
                      oa.a(true, 256, dd.field_a);
                    } else {
                      oa.a(true, 5, s.field_d);
                    }
                  }
                }
              } else {
                oa.a(param0, 256, hn.field_e);
              }
              kg.field_f = true;
            }
          }
        }
        if ((u.field_b != -1 &&
          u.field_b != 0 ||
          ka.c((byte) -44)) &&
          qj.b(-26572) >= tn.field_Hb) {
          kg.field_f = false;
          if (u.field_b != -1 &&
            0 != u.field_b) {
            u.field_b = -1;
            o.a((byte) -34);
          }
        }
        if (u.field_b == 0 &&
          !ka.c((byte) -44)) {
          ii.field_f = false;
        }
        if (ih.field_f == 0 &&
          hg.b(0)) {
          ih.field_f = 1;
        }
        if (!param0) {
          field_p = (int[]) null;
        }
        if (1 == ih.field_f) {
          if (gm.field_f != 0) {
            lh.field_g = sd.a(ce.field_n, (byte) 65);
          }
          da.field_b = v.a((byte) -93, false, true, cj.field_d, 1);
          ea.field_C = v.a((byte) -93, false, true, dm.field_H, 1);
          ho.field_g = v.a((byte) -93, false, true, u.field_g, 1);
          field_D = ea.field_C;
          ih.field_f = 2;
          rc.field_a = da.field_b;
        }
        if (ih.field_f == 2) {
          if (lh.field_g != null &&
            lh.field_g.c(-10923)) {
            if (!lh.field_g.a(true, "")) {
              lh.field_g = null;
            } else {
              if (lh.field_g.a("", -24417)) {
                on.a((byte) -84, lh.field_g);
                lh.field_g = null;
                bk.a(2);
              }
            }
          }
          if (null == lh.field_g) {
            ih.field_f = 3;
          }
        }
        if (ih.field_f == 3 &&
          vn.a(ho.field_g, param0, ea.field_C, da.field_b) &&
          eh.a(18306, ho.field_g)) {
          rk.f(-73);
          cj.b(-128);
          kl.field_C = hn.field_l;
          lh.field_n = false;
          th.a(da.field_b, ho.field_g, ea.field_C, (byte) -40, lk.field_d);
          if (af.field_Ib ||
            null != ul.field_y) {
            stackIn_101_0 = !(af.field_Ib);
            stackIn_103_1 = ul.field_y;
            stackIn_104_2 = !(af.field_Ib);
            j.a(stackIn_101_0, stackIn_103_1, stackIn_104_2, false);
          }
          if (wa.field_Nb) {
            oo.g(4);
          }
          if (null == gk.field_k) {
            gk.field_k = ld.a(false);
            mb.field_P = sc.h((byte) -34);
          }
          ug.a(mb.field_P, gk.field_k, ho.field_g, 121);
          ho.field_g = null;
          ea.field_C = null;
          da.field_b = null;
          ArcanistsMulti.a((java.applet.Applet) (this), -1);
          bk.a(2);
          ih.field_f = 10;
        }
        if (ih.field_f == 10) {
          if (gm.field_f != 0) {
            va.field_c = sd.a(sa.field_Bb, (byte) 94);
          }
          ih.field_f = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (ih.field_f == 11) {
          if (null != va.field_c && (!va.field_c.c(-10923) ||
            !va.field_c.a(-49))) {
            rb.a(qe.a(ld.field_o, 87, va.field_c, vn.field_f), false, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            ja.field_y = true;
            ih.field_f = 12;
          }
        }
        if (ih.field_f == 12 &&
          !ja.field_y) {
          ih.field_f = 13;
        }
        if (ih.field_f == 13) {
          var3Lifetime2 = 1;
          if (pm.field_h != null) {
            stackIn_133_0 = (!pm.field_h.d(93)) ? 0 : 1;
            var3Lifetime2 = stackIn_133_0;
            rb.a(pm.field_h.field_j, false, pm.field_h.field_b);
          }
          if (var3Lifetime2 != 0) {
            ih.field_f = 20;
          }
        }
        if (!param1 &&
          jm.field_j) {
          qm.a(on.field_c, (byte) 117);
          this.a(-11232);
          n.a(on.field_c, (byte) 125);
        }
        if (cc.field_d[8]) {
          im.c(-99);
        }
    }

    private final void c(boolean param0) {
        int discarded$0 = 0;
        int var2 = df.field_z.e((byte) 97);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + fj.field_h;
        byte[] var5 = new byte[var4];
        if (param0) {
          discarded$0 = this.a(false, true, false);
        }
        df.field_z.a(var5, (byte) 108, 0, var4);
        jh.a(sc.a((byte) 113, var5), cd.e(127), var3 != 0, (byte) -116);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, byte param5, boolean param6) {
        int var8 = -88 % ((param5 - 66) / 60);
        this.b(true, 51);
        if (param2) {
          this.l(-86);
        }
        if (param6) {
          this.h(-89);
        }
        if (param0) {
          this.j(115);
        }
        if (param4) {
          this.i(6);
        }
        if (param1) {
          this.c(101);
        }
        if (param3) {
          this.g((byte) 97);
        }
    }

    private final void i(int param0) {
        if (param0 != 6) {
          this.d(-83);
        }
        cc.field_d[5] = true;
    }

    protected ud() {
    }

    static {
        field_w = 72;
        field_o = "Please log in to access this feature.";
        field_u = "Quick Start:";
        field_r = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_z = new int[][]{new int[]{255, 0, 255}, new int[]{255, 102, 153}, new int[]{255, 204, 153}, new int[]{255, 255, 153}, new int[]{255, 255, 102}, new int[]{255, 255, 0}, new int[]{255, 204, 0}, new int[]{255, 153, 0}, new int[]{255, 102, 0}, new int[]{255, 0, 0}, new int[]{204, 0, 0}, new int[]{153, 0, 0}, new int[]{153, 102, 51}, new int[]{102, 51, 0}, new int[]{153, 51, 102}, new int[]{153, 51, 204}, new int[]{153, 153, 204}, new int[]{153, 204, 51}, new int[]{51, 204, 51}, new int[]{51, 255, 0}, new int[]{0, 153, 51}, new int[]{0, 102, 0}, new int[]{0, 51, 102}, new int[]{0, 102, 153}, new int[]{0, 102, 204}, new int[]{0, 153, 255}, new int[]{0, 204, 255}, new int[]{102, 255, 204}, new int[]{69, 69, 69}, new int[]{102, 102, 102}, new int[]{153, 153, 153}, new int[]{204, 204, 204}};
        field_y = "Month";
        field_p = new int[8192];
    }
}
