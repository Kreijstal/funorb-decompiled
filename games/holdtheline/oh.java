/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oh extends md {
    private long field_l;
    private boolean field_v;
    private int field_t;
    private int field_u;
    private int field_q;
    static String field_r;
    private boolean field_w;
    static hj field_m;
    static int[] field_s;
    private int field_y;
    private int field_p;
    private int field_x;
    private boolean field_o;
    String field_n;

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a(98, false);
        if (param1) {
          this.n(param4 - 657);
        }
        if (param3) {
          this.a(true);
        }
        if (param4 != 640) {
          this.field_u = -90;
        }
        if (param0) {
          this.h(-6);
        }
        if (param2) {
          this.i(param4 ^ 645);
        }
    }

    private final void k(int param0) {
        ae.field_e[3] = -1;
        ae.field_e[11] = -1;
        ae.field_e[7] = -1;
        ae.field_e[18] = 1;
        ae.field_e[10] = -1;
        ae.field_e[17] = -1;
        ae.field_e[13] = -1;
        ae.field_e[8] = -2;
        ae.field_e[2] = -2;
        ae.field_e[1] = 16;
        ae.field_e[4] = -1;
        ae.field_e[12] = -1;
        ae.field_e[9] = -1;
        ae.field_e[16] = -1;
        ae.field_e[5] = -1;
        if (param0 != 29385) {
          String var3 = (String) null;
          this.a(-53, 124, (String) null);
        }
        ae.field_e[6] = -2;
    }

    private final void a(boolean param0) {
        eb.field_j[2] = param0;
    }

    private final void i(int param0) {
        eb.field_j[param0] = true;
    }

    final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param4 != 63) {
          field_m = (hj) null;
        }
        v.field_C = this.field_u;
        ab.a(v.field_C, (byte) 89);
        v.a(this.field_t, this.field_v, 5000, 5000, this.field_y, this.field_x, wi.field_b, param1, this.field_l, this.field_n, v.field_C, param0, true, this.field_p);
        j.a(this.field_t, 24, v.field_C, wi.field_b, this.field_x, this.field_n, param0, this.field_y, this.field_p);
        ha.a(false);
        lb.field_u = HoldTheLine.f((byte) -87);
        am.a(kd.field_b, 114);
        en.field_a = param6;
        wd.field_n = param2;
        wa.field_k = param7;
        qb.field_i = param5;
        ig.field_v = param3;
        this.k(29385);
        fj.f(0);
    }

    private final void h(int param0) {
        eb.field_j[4] = true;
        if (param0 != -6) {
          this.field_l = 25L;
        }
    }

    final void j(int param0) {
        boolean stackIn_22_0 = false;
        int var2;
        ij var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (param0 != -6) {
          return;
        }
        var2 = vn.field_c;
        if (var2 < 64 &&
          eb.field_j[var2]) {
          if (0 == var2) {
            return;
          }
          if (var2 == 1) {
            pa.a((byte) 79);
          } else {
            if (var2 == 2) {
              wj.b((byte) 68);
            } else {
              if (3 == var2) {
                ci.b((byte) -128);
              } else {
                if (4 == var2) {
                  q.c((byte) -24);
                } else {
                  if (var2 == 5) {
                    hm.b(param0 ^ -56);
                  } else {
                    if (var2 == 6) {
                      nn.b((byte) -126);
                    } else {
                      if (var2 == 7) {
                        this.e((byte) -15);
                      } else {
                        if (var2 == 8) {
                          tn.a((byte) -107, wi.field_b, rd.field_e, ad.field_c);
                        } else {
                          if (var2 == 16) {
                            hb.a((byte) 3);
                          } else {
                            if (var2 != 11 &&
                              12 != var2) {
                              if (var2 == 13) {
                                b.a(param0 + 16);
                                return;
                              }
                              if (var2 == 17) {
                                this.o(-1);
                                return;
                              }
                              if (var2 == 18) {
                                ng.a(param0 ^ 41);
                                return;
                              }
                              bl.a((Throwable) null, (byte) -119, "MGS1: " + em.b(false));
                              r.a(-28036);
                              return;
                            }
                            stackIn_22_0 = (var2 == 12);
                            var3 = wa.a(stackIn_22_0, false);
                            mf.a(var3, false);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        }
        bl.a((Throwable) null, (byte) 70, "MGS2: " + em.b(false));
        r.a(-28036);
        return;
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
          th var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = HoldTheLine.field_D;
          var4 = aa.a(param1, vg.field_T, 1, v.field_C);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = sd.a((byte) -124, gi.i(-80), dk.a(8790));
            if (var5_int != -1) {
              nj.a(256, var5_int, wn.field_h, um.field_b);
              wn.field_h = null;
              um.field_b = null;
            }
            var11 = pd.b((byte) -29);
            if (var11 != null) {
              mc.a(0, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = uf.a(oi.a((byte) 31), ob.d((byte) -116), (byte) 80, ck.a((byte) -27), this.field_q, tn.d(0), ef.c(4));
            if (var5_intLifetime1 != -1) {
              si.a(um.field_b, wn.field_h, -98, var5_intLifetime1);
              wn.field_h = null;
              um.field_b = null;
            }
          }
          if (var4 == 3) {
            if (ao.field_a != -1 &&
              ao.field_a != 0) {
              ao.field_a = -1;
              ti.k(-87);
            }
            if (!param0) {
              var5_intLifetime2 = v.a(this.field_w, 1, tn.d(0), ef.c(4), false, this.field_q);
              if (var5_intLifetime2 != -1) {
                if (0 != var5_intLifetime2) {
                  mk.a(var5_intLifetime2, um.field_b, -2698);
                  um.field_b = null;
                } else {
                  ul.field_e = vd.field_a;
                  de.g((byte) 121);
                  bk.field_w = 10;
                  mn.field_a = false;
                }
              }
            } else {
              pj.field_n = false;
            }
          }
          if (4 == var4) {
            if (hc.field_b) {
              co.a(en.a(126), 237);
            } else {
              mn.field_a = true;
              bk.field_w = 10;
            }
          }
          if (var4 == 5) {
            kd.a(en.a(116), true);
          }
          if (var4 == 6 &&
            bn.field_j) {
            bk.field_w = 10;
          }
          if (7 == var4) {
            oa.a(true, en.a(92));
          }
          if (var4 == 8) {
            co.a(en.a(120), 237);
          }
          if (var4 == 9) {
            v.a(en.a(93), 102);
          }
          if (var4 == 10) {
            da.field_p.c((byte) 33, 17);
          }
          if (var4 == 11) {
            ae.a(-16666, en.a(106));
          }
          if (!param2) {
            return -101;
          }
          if (var4 == 12) {
            sh.a((byte) -68, en.a(116), wd.j(-14));
          }
          if (var4 == 13) {
            try {
              if (va.field_a == null) {
                va.field_a = new dl(wi.field_b, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (va.field_a.a((byte) 90)) {
                var12 = va.field_a.b((byte) 85);
                if (var12 != null) {
                  var7 = sm.a(var12.field_l, 0, -129, var12.field_i);
                  t.a(var7, (byte) -55);
                } else {
                  var9 = (String) null;
                  t.a((String) null, (byte) -64);
                }
                va.field_a = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              bl.a((Throwable) ((Object) var5), (byte) 87, "S1");
              var10 = (String) null;
              t.a((String) null, (byte) -87);
              va.field_a = null;
            }
          }
          if (var4 == 15) {
            bk.field_w = 10;
          }
          if (16 == var4) {
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

    private final void a(String param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 0;
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
            if (!this.e(-11)) {
              return;
            }
            this.field_n = this.getCodeBase().getHost();
            var6 = this.field_n.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_w = stackIn_7_1;
            this.field_x = Integer.parseInt(this.getParameter("gameport1"));
            this.field_y = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_p = Integer.parseInt(var7);
            }
            this.field_t = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_l = Long.parseLong(this.getParameter("instanceid"));
            if (param2 < 125) {
              discarded$0 = this.a(false, true, false);
            }
            this.field_v = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_u = Integer.parseInt(var8);
            }
            if (this.field_u >= 5) {
              this.field_u = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_q = Integer.parseInt(var9);
            }
            vb.field_b = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param0, param1, param4, param3, (byte) -101, this.field_t, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            bl.a((Throwable) ((Object) var6_ref), (byte) 113, (String) null);
            this.a("crash", 221);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("oh.N(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void b(int param0, boolean param1) {
        int stackIn_23_0 = 0;
        boolean stackIn_100_0 = false;
        int stackIn_102_1 = 0;
        String stackIn_102_2 = null;
        boolean stackIn_103_3;
        int stackIn_134_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = HoldTheLine.field_D;
        if (hh.field_c != null) {
          if (null == cc.field_w) {
            var6 = tf.e(param0 ^ 1051);
            var4 = var6.getSize();
            hh.field_c.a(var4.width, var4.height, (byte) -117);
          }
          hh.field_c.b((byte) -9);
        }
        ea.a(false);
        cg.a(1983);
        if (!nn.a((byte) -128) &&
          bk.field_w != 11) {
          ln.a(param0 ^ 1142);
        }
        if (null != lb.field_u) {
          vg.field_T = lb.field_u.a((byte) 119);
        }
        if (gd.e((byte) 15)) {
          var3 = nc.a(855) * 1200;
          if (this.field_o ||
            !(co.a(0) <= var3) &&
            !(dg.b((byte) 65) <= var3)) {
            this.field_o = false;
            r.a(param0 - 29087);
            kh.b(false);
            mk.a(2, qn.field_n, -2698);
            jh.b(param0 ^ 1127);
            pj.field_n = true;
            bn.field_k = bb.b(-1) + 15000L;
          }
        }
        if (ao.field_a == -1 ||
          ao.field_a == 0) {
          stackIn_23_0 = (ao.field_a != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          ao.field_a = wc.e(-17204);
          if (var3Lifetime1 != 0 &&
            ao.field_a == 0 &&
            11 == bk.field_w &&
            !oa.b((byte) 103)) {
            de.g((byte) 92);
          }
          if (ao.field_a != -1 &&
            ao.field_a != 0) {
            bn.field_k = bb.b(-1) + 15000L;
          }
        }
        if (ao.field_a != -1 &&
          ao.field_a != 0) {
          if (10 > pf.field_d) {
            if (ao.field_a != 3) {
              if (ao.field_a == 4) {
                this.a("js5io", 221);
              } else {
                if (2 != ao.field_a) {
                  if (ao.field_a == 5) {
                    this.a("outofdate", 221);
                  } else {
                    this.a("js5connect", 221);
                  }
                } else {
                  this.a("js5connect_full", 221);
                }
              }
            } else {
              this.a("js5crc", param0 - 830);
            }
          } else {
            if (bk.field_w >= 10) {
              kh.b(false);
              if (3 != ao.field_a) {
                if (4 != ao.field_a) {
                  if (ao.field_a == 2) {
                    mk.a(256, wb.field_f, param0 - 3749);
                  } else {
                    if (ao.field_a == 5) {
                      mk.a(5, ef.field_e, -2698);
                    } else {
                      mk.a(256, vm.field_ub, -2698);
                    }
                  }
                } else {
                  mk.a(256, ll.field_b, -2698);
                }
              } else {
                mk.a(256, t.field_k, -2698);
              }
              pj.field_n = true;
            }
          }
        }
        if ((ao.field_a != -1 &&
          ao.field_a != 0 ||
          oa.b((byte) 103)) &&
          bb.b(-1) >= bn.field_k) {
          pj.field_n = false;
          if (ao.field_a != -1 &&
            ao.field_a != 0) {
            ao.field_a = -1;
            ti.k(-112);
          }
        }
        if (ao.field_a == 0 &&
          !oa.b((byte) 103)) {
          de.field_K = false;
        }
        if (pf.field_d == 0 &&
          ol.b((byte) 38)) {
          pf.field_d = 1;
        }
        if (pf.field_d == 1) {
          if (v.field_C != 0) {
            ml.field_a = bi.a(param0 ^ 1134, wa.field_k);
          }
          ah.field_d = nm.a(true, ig.field_v, -115, false, 1);
          am.field_d = nm.a(true, wd.field_n, -84, false, 1);
          ca.field_p = nm.a(true, en.field_a, -94, false, 1);
          g.field_p = am.field_d;
          pf.field_d = 2;
          si.field_lb = ah.field_d;
        }
        if (pf.field_d == 2) {
          if (null != ml.field_a &&
            ml.field_a.b((byte) -115)) {
            if (!ml.field_a.a("", true)) {
              ml.field_a = null;
            } else {
              if (ml.field_a.b("", param0 - 1135)) {
                wg.a(1, ml.field_a);
                ml.field_a = null;
                qd.d(42);
              }
            }
          }
          if (ml.field_a == null) {
            pf.field_d = 3;
          }
        }
        if (pf.field_d == 3 &&
          ej.a(ah.field_d, am.field_d, param0 ^ 1125, ca.field_p) &&
          td.a((byte) -83, ca.field_p)) {
          ic.b((byte) 10);
          ml.c(param0 + 25668);
          bn.field_j = false;
          aa.field_m = ug.field_f;
          cj.a(am.field_d, ca.field_p, ah.field_d, param0 - 946, hc.field_b);
          if (cb.field_i ||
            kh.field_i != null) {
            stackIn_100_0 = !(cb.field_i);
            stackIn_102_1 = 85;
            stackIn_102_2 = kh.field_i;
            stackIn_103_3 = !(cb.field_i);
            pg.$cfr$intArgs$a$87b210a2f664(stackIn_100_0, stackIn_102_1, stackIn_102_2, stackIn_103_3);
          }
          if (vb.field_b) {
            rl.h(0);
          }
          if (null == ao.field_f) {
            ao.field_f = qh.a(124);
            ek.field_l = dc.m(param0 + 28624);
          }
          fi.a(ek.field_l, ca.field_p, param0 ^ 1051, ao.field_f);
          am.field_d = null;
          ah.field_d = null;
          ca.field_p = null;
          jd.a((java.applet.Applet) (this), (byte) 92);
          qd.d(71);
          pf.field_d = 10;
        }
        if (10 == pf.field_d) {
          if (v.field_C != 0) {
            md.field_i = bi.a(-110, qb.field_i);
          }
          pf.field_d = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (pf.field_d == 11) {
          if (null != md.field_i && (!md.field_i.b((byte) -76) ||
            !md.field_i.a((byte) -60))) {
            jj.a(85, uj.a(-115, md.field_i, pb.field_d, rg.field_f), 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            nk.field_R = true;
            pf.field_d = 12;
          }
        }
        if (param0 != 1051) {
          this.field_y = 95;
        }
        if (12 == pf.field_d &&
          !nk.field_R) {
          pf.field_d = 13;
        }
        if (pf.field_d == 13) {
          var3Lifetime2 = 1;
          if (ri.field_e != null) {
            stackIn_134_0 = (!ri.field_e.a(-1)) ? 0 : 1;
            var3Lifetime2 = stackIn_134_0;
            jj.a(116, ri.field_e.field_b, ri.field_e.field_j);
          }
          if (var3Lifetime2 != 0) {
            pf.field_d = 20;
          }
        }
        if (!param1 &&
          ud.field_n) {
          om.a(param0 - 47393, kd.field_b);
          this.c((byte) 91);
          am.a(kd.field_b, 114);
        }
        if (eb.field_j[8]) {
          eb.b(-74);
        }
    }

    private final void a(int param0, boolean param1) {
        if (param0 <= 96) {
          this.field_o = true;
        }
        eb.field_j[0] = true;
        eb.field_j[17] = true;
        eb.field_j[16] = true;
        eb.field_j[18] = true;
        eb.field_j[3] = true;
        eb.field_j[8] = param1;
        eb.field_j[7] = true;
    }

    public static void m(int param0) {
        if (param0 != 8) {
          oh.m(46);
        }
        field_r = null;
        field_s = null;
        field_m = null;
    }

    final int d(byte param0) {
        if (this.field_b) {
          return -1;
        }
        if (!oa.b((byte) 103)) {
          return -1;
        }
        if (pj.field_n) {
          return -1;
        }
        int var2 = v.a(this.field_w, 1, tn.d(0), ef.c(4), true, this.field_q);
        if (var2 == -1) {
          return -1;
        }
        if (0 == var2 ||
          var2 == 1) {
          if (11 == bk.field_w &&
            ao.field_a == 0) {
            de.g((byte) 78);
          }
          return var2;
        }
        if (!go.field_n) {
          this.a("reconnect", param0 + 132);
        }
        kh.b(false);
        mk.a(var2, um.field_b, -2698);
        pj.field_n = true;
        bn.field_k = 15000L + bb.b(-1);
        if (param0 == 89) {
          return var2;
        }
        return 54;
    }

    final static int a(el param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 76) {
            field_s = (int[]) null;
          }
          stackIn_3_0 = param0.field_j * param1 / 1000;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oh.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        io.field_b = 0;
        hk.field_e = bg.field_g;
        va.field_e = 0;
        dl.field_i = 0;
        ln.field_k = new jn(2);
        if (!param1) {
          field_s = (int[]) null;
        }
        ln.field_k.a(wa.a(125, rf.field_X, nc.field_g), 0, param0, -1);
    }

    private final void n(int param0) {
        if (param0 != -17) {
          this.field_l = 71L;
        }
        eb.field_j[1] = true;
    }

    final void l(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = HoldTheLine.field_D;
        if (jn.a((byte) -30)) {
          discarded$1 = this.a(false, null != cc.field_w ? true : false, true);
        } else {
          if (pf.field_d >= 10) {
            if (!ge.a(true)) {
              co.c(0);
            } else {
              if (0 != bk.field_w) {
                qb.a(vg.field_T, (byte) -97);
              } else {
                discarded$2 = this.a(false, false, true);
              }
            }
          }
        }
        if (param0 != 0) {
          this.a(false);
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
          this.a(param2, 640, 127, 480, param0);
          if (param1 != 6165) {
            oh.a(true, false);
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "oh.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0, boolean param1) {
        if (param0 != -1) {
          this.field_o = false;
        }
        return this.a(true, param1, true);
    }

    private final void e(byte param0) {
        String var2 = vd.a(-1);
        if (param0 != -15) {
          oh.a(false, false);
        }
        mn.a(var2, en.a(104), -1);
    }

    final static nl[] a(ib param0, byte param1) {
        int var5 = 0;
        nl[] stackIn_3_0 = null;
        nl[] stackIn_9_0 = null;
        nl[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        nl[] var4 = null;
        nl var6 = null;
        int var7 = 0;
        af var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = HoldTheLine.field_D;
        try {
          if (!param0.a(true)) {
            stackIn_3_0 = new nl[]{};
            return stackIn_3_0;
          }
          var8 = param0.a(2);
          while (0 == var8.field_d) {
            qe.a(10L, (byte) 45);
          }
          if (var8.field_d == 2) {
            stackIn_9_0 = new nl[]{};
            return stackIn_9_0;
          }
          var10 = (int[]) (var8.field_b);
          var9 = var10;
          var3 = var9;
          var4 = new nl[var10.length >> 2];
          if (param1 <= 108) {
            field_s = (int[]) null;
          }
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new nl();
            var4[var5] = var6;
            var6.field_b = var3[var5 << 2];
            var6.field_a = var3[(var5 << 2) + 1];
            var6.field_g = var3[2 + (var5 << 2)];
            var6.field_d = var3[(var5 << 2) + 3];
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("oh.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void o(int param0) {
        int var2 = rd.field_e.f((byte) -97);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        int var4 = param0 + ad.field_c;
        byte[] var5 = new byte[var4];
        rd.field_e.a(var5, var4, 0, true);
        ba.a(-7235, rk.a((byte) 80, var5), var3 != 0, en.a(109));
    }

    protected oh() {
    }

    static {
        field_r = "Waiting for sound effects";
    }
}
