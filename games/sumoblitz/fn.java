/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fn extends kc {
    private int field_r;
    private int field_w;
    private int field_E;
    static int field_t;
    private int field_v;
    static int field_s;
    private boolean field_q;
    private boolean field_z;
    static String field_A;
    private long field_y;
    private int field_C;
    private int field_x;
    static String[] field_u;
    String field_D;
    private boolean field_B;

    private final void p(int param0) {
        ov.field_e[1] = 16;
        ov.field_e[13] = -1;
        ov.field_e[16] = -1;
        ov.field_e[4] = -1;
        ov.field_e[9] = param0;
        ov.field_e[6] = -2;
        ov.field_e[12] = -1;
        ov.field_e[10] = -1;
        ov.field_e[11] = -1;
        ov.field_e[5] = -1;
        ov.field_e[17] = -1;
        ov.field_e[18] = 1;
        ov.field_e[3] = -1;
        ov.field_e[7] = -1;
        ov.field_e[2] = -2;
        ov.field_e[8] = -2;
    }

    private final void d(byte param0) {
        if (param0 != 68) {
          return;
        }
        wp.field_z[5] = true;
    }

    final void b(boolean param0, int param1) {
        int stackIn_27_0 = 0;
        int stackIn_106_0 = 0;
        boolean stackIn_107_1 = false;
        String stackIn_109_2 = null;
        boolean stackIn_110_3;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (vv.field_b != null) {
          if (null == gk.field_o) {
            var6 = km.c(false);
            var4 = var6.getSize();
            vv.field_b.a(var4.height, var4.width, (byte) -123);
          }
          vv.field_b.d(2);
        }
        c.a((byte) 124);
        au.d(123);
        if (!in.g(-66) &&
          11 != jv.field_a) {
          ip.d(1886067877);
        }
        if (null != as.field_w) {
          pn.field_r = as.field_w.a(-88);
        }
        if (param1 >= -97) {
          this.field_D = (String) null;
        }
        if (nt.a((byte) 90)) {
          var3 = 1200 * vm.a(-79);
          if (this.field_B ||
            !(var3 >= df.a((byte) 114)) &&
            !(za.c(false) <= var3)) {
            this.field_B = false;
            kk.a((byte) -112);
            we.a((byte) 16);
            rj.a((byte) 87, 2, ab.field_d);
            ha.a(-36);
            ts.field_d = true;
            sj.field_a = 15000L + wq.a(-96);
          }
        }
        if (gr.field_l == -1 ||
          gr.field_l == 0) {
          stackIn_27_0 = (gr.field_l != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_27_0;
          gr.field_l = cs.g(-5);
          if (var3Lifetime1 != 0 &&
            gr.field_l == 0 &&
            11 == jv.field_a &&
            !en.a(-23517)) {
            ov.b(2);
          }
          if (gr.field_l != -1 &&
            0 != gr.field_l) {
            sj.field_a = wq.a(-47) + 15000L;
          }
        }
        if (gr.field_l != -1 &&
          gr.field_l != 0) {
          if (mp.field_a < 10) {
            if (3 != gr.field_l) {
              if (gr.field_l != 4) {
                if (gr.field_l != 2) {
                  if (gr.field_l != 5) {
                    this.a("js5connect", 21253);
                  } else {
                    this.a("outofdate", 21253);
                  }
                } else {
                  this.a("js5connect_full", 21253);
                }
              } else {
                this.a("js5io", 21253);
              }
            } else {
              this.a("js5crc", 21253);
            }
          } else {
            if (10 <= jv.field_a) {
              we.a((byte) 70);
              if (gr.field_l == 3) {
                rj.a((byte) -97, 256, o.field_a);
              } else {
                if (gr.field_l == 4) {
                  rj.a((byte) 61, 256, eg.field_n);
                } else {
                  if (gr.field_l == 2) {
                    rj.a((byte) 90, 256, bn.field_O);
                  } else {
                    if (gr.field_l == 5) {
                      rj.a((byte) -113, 5, s.field_k);
                    } else {
                      rj.a((byte) -97, 256, ao.field_z);
                    }
                  }
                }
              }
              ts.field_d = true;
            }
          }
        }
        if ((gr.field_l != -1 &&
          gr.field_l != 0 ||
          en.a(-23517)) &&
          wq.a(-87) >= sj.field_a) {
          ts.field_d = false;
          if (-1 != gr.field_l &&
            0 != gr.field_l) {
            gr.field_l = -1;
            ic.a(4);
          }
        }
        if (gr.field_l == 0 &&
          !en.a(-23517)) {
          ch.field_h = false;
        }
        if (mp.field_a == 0 &&
          f.d((byte) 63)) {
          mp.field_a = 1;
        }
        if (mp.field_a == 1) {
          if (dk.field_c != 0) {
            hd.field_H = wd.a(u.field_P, (byte) 125);
          }
          wd.field_j = ve.a(11880, true, pn.field_i, 1, false);
          eb.field_f = ve.a(11880, true, pp.field_h, 1, false);
          hw.field_a = ve.a(11880, true, ra.field_f, 1, false);
          pi.field_c = wd.field_j;
          mp.field_a = 2;
          vb.field_J = eb.field_f;
        }
        if (mp.field_a == 2) {
          if (null != hd.field_H &&
            hd.field_H.b((byte) 127)) {
            if (!hd.field_H.b((byte) -99, "")) {
              hd.field_H = null;
            } else {
              if (hd.field_H.a("", 100)) {
                ni.a(7, hd.field_H);
                hd.field_H = null;
                ls.b(0);
              }
            }
          }
          if (hd.field_H == null) {
            mp.field_a = 3;
          }
        }
        if (3 == mp.field_a &&
          rd.a(eb.field_f, (byte) 124, hw.field_a, wd.field_j) &&
          wc.a(hw.field_a, 40)) {
          ph.a((byte) -93);
          th.e(true);
          pu.field_m = false;
          hn.field_k = li.field_y;
          ea.a(hw.field_a, qn.field_a, (byte) 40, eb.field_f, wd.field_j);
          if (hv.field_c ||
            st.field_B != null) {
            stackIn_106_0 = 1;
            stackIn_107_1 = !(hv.field_c);
            stackIn_109_2 = st.field_B;
            stackIn_110_3 = !(hv.field_c);
            ea.a(stackIn_106_0, stackIn_107_1, stackIn_109_2, stackIn_110_3);
          }
          if (gn.field_b) {
            vi.e(4);
          }
          if (hh.field_d == null) {
            hh.field_d = ea.a(14263);
            ur.field_O = cv.e(false);
          }
          ss.a(hh.field_d, (byte) 127, hw.field_a, ur.field_O);
          hw.field_a = null;
          eb.field_f = null;
          wd.field_j = null;
          si.a((java.applet.Applet) (this), (byte) -96);
          ls.b(0);
          mp.field_a = 10;
        }
        if (mp.field_a == 10) {
          if (0 != dk.field_c) {
            vf.field_a = wd.a(ak.field_f, (byte) 125);
          }
          mp.field_a = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (mp.field_a == 11) {
          if (vf.field_a != null && (!vf.field_a.b((byte) 127) ||
            !vf.field_a.a(true))) {
            pe.a(20, 0.0f, lq.a(117, mm.field_c, ek.field_k, vf.field_a));
            decompiledFrameRemainder0 = false;
          }
          else {
            ml.field_u = true;
            mp.field_a = 12;
          }
        }
        if (mp.field_a == 12 &&
          !ml.field_u) {
          mp.field_a = 13;
        }
        if (mp.field_a == 13) {
          var3Lifetime2 = 1;
          if (ih.field_a != null) {
            stackIn_138_0 = (!ih.field_a.a(100)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            pe.a(20, ih.field_a.field_d, ih.field_a.field_f);
          }
          if (var3Lifetime2 != 0) {
            mp.field_a = 20;
          }
        }
        if (!param0 &&
          aj.field_A) {
          wr.a(true, qn.field_f);
          this.e(1000);
          db.a(false, qn.field_f);
        }
        if (wp.field_z[8]) {
          qi.a(8);
        }
    }

    private final int c(byte param0) {
        int var2;
        if (this.field_d) {
          return -1;
        }
        if (!en.a(-23517)) {
          return -1;
        }
        if (ts.field_d) {
          return -1;
        }
        var2 = jb.a(gi.c((byte) -2), this.field_z, (byte) 56, true, this.field_w, rw.c((byte) -97));
        if (-1 == var2) {
          return -1;
        }
        if (param0 >= -38) {
          return 99;
        }
        if (0 != var2 &&
          var2 != 1) {
          if (!nl.field_o) {
            this.a("reconnect", 21253);
          }
          we.a((byte) 63);
          rj.a((byte) 114, var2, ns.field_c);
          ts.field_d = true;
          sj.field_a = 15000L + wq.a(-50);
          return var2;
        }
        if (jv.field_a == 11 &&
          gr.field_l == 0) {
          ov.b(2);
        }
        return var2;
    }

    private final void n(int param0) {
        wp.field_z[param0] = true;
    }

    final void m(int param0) {
        int discarded$33 = 0;
        int discarded$34 = 0;
        int var3;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 <= 94) {
          field_A = (String) null;
        }
        if (we.g(-1)) {
          stackIn_11_1 = 16981;
          stackIn_12_2 = (gk.field_o != null);
          discarded$33 = this.a(stackIn_11_1, stackIn_12_2, false);
        } else {
          if (mp.field_a >= 10) {
            if (!lf.b(-251)) {
              rm.a((byte) 126);
            } else {
              if (jv.field_a != 0) {
                rg.a((byte) 55, pn.field_r);
              } else {
                discarded$34 = this.a(16981, false, false);
              }
            }
          }
        }
    }

    final void q(int param0) {
        boolean stackIn_28_0 = false;
        int var2;
        br var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 9289) {
          return;
        }
        var2 = iw.field_a;
        if (var2 < 64 &&
          wp.field_z[var2]) {
          if (0 == var2) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              ue.a((byte) -70);
            } else {
              if (var2 == 3) {
                b.a(-30084);
              } else {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            we.e((byte) -93);
                          } else {
                            if (11 != var2 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                js.f((byte) 117);
                                return;
                              }
                              if (var2 == 17) {
                                this.f((byte) -76);
                                return;
                              }
                              if (var2 == 18) {
                                bq.a(8192);
                                return;
                              }
                              ms.a("MGS1: " + di.b((byte) -22), (Throwable) null, 0);
                              kk.a((byte) -128);
                              return;
                            }
                            stackIn_28_0 = (var2 == 12);
                            var3 = r.a(stackIn_28_0, (byte) -62);
                            nn.a(var3, (byte) 60);
                          }
                        } else {
                          ro.a((byte) 127, ig.field_a, lt.field_m, gu.field_d);
                        }
                      } else {
                        this.o(-1);
                      }
                    } else {
                      vi.c((byte) -77);
                    }
                  } else {
                    ar.e((byte) -93);
                  }
                } else {
                  pt.a(-22683);
                }
              }
            }
          } else {
            uu.c(false);
          }
          return;
        }
        ms.a("MGS2: " + di.b((byte) 86), (Throwable) null, 0);
        kk.a((byte) -112);
        return;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.a(false, param0, (byte) 111, param3, param5, param2, param4, param1);
        if (!param6) {
          this.m(-95);
        }
    }

    final int a(int param0, boolean param1) {
        if (param0 != -1) {
          return 50;
        }
        return this.a(16981, param1, true);
    }

    private final void o(int param0) {
        String var2 = ls.a((byte) -62);
        if (param0 != -1) {
          return;
        }
        ie.a(61, var2, ra.c(2));
    }

    private final void l(int param0) {
        wp.field_z[2] = true;
        if (param0 != 8) {
          this.field_E = 114;
        }
    }

    final int b(boolean param0) {
        int var2;
        var2 = this.c((byte) -99);
        if (!param0) {
          return -127;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (wp.field_z[1]) {
            dq.a((byte) 115, 2);
          }
          if (wp.field_z[2]) {
            vi.a(3, (byte) -73);
          }
          if (wp.field_z[3]) {
            ko.a(0, 4);
          }
          if (wp.field_z[4]) {
            dd.a(28778, 5);
          }
          if (wp.field_z[5]) {
            wm.a(false, 6);
          }
          if (wp.field_z[6]) {
            jl.a(7, param0);
          }
          if (wp.field_z[8]) {
            vk.a(-58);
          }
        }
        return var2;
    }

    private final void f(byte param0) {
        int var2 = ig.field_a.e(-31302);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + gu.field_d;
        byte[] var5 = new byte[var4];
        ig.field_a.a(var5, 0, 0, var4);
        if (param0 > -55) {
          this.field_w = -30;
        }
        kj.a(-23166, ra.c(2), var3 != 0, uu.a(0, var5));
    }

    final void a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4) {
        if (param2 == 60) {
          this.c(false, -12605);
          if (param1) {
            this.n(1);
          }
          if (param3) {
            this.l(8);
          }
          if (param4) {
            this.e((byte) 30);
          }
          if (param0) {
            this.d((byte) 68);
          }
          return;
        }
    }

    public static void k(int param0) {
        if (param0 < 79) {
          field_t = -119;
        }
        field_u = null;
        field_A = null;
    }

    final void a(int param0, String param1, int param2) {
        try {
          this.a(param0, param2 ^ 480, 640, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "fn.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
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
        try {
          try {
            if (!this.i(-1)) {
              return;
            }
            this.field_D = this.getCodeBase().getHost();
            var6 = this.field_D.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_z = stackIn_8_1;
            if (param1 != 0) {
              this.o(-5);
            }
            this.field_r = Integer.parseInt(this.getParameter("gameport1"));
            this.field_E = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_x = Integer.parseInt(var7);
            }
            this.field_C = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_y = Long.parseLong(this.getParameter("instanceid"));
            this.field_q = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_v = Integer.parseInt(var8);
            }
            if (this.field_v >= 5) {
              this.field_v = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_w = Integer.parseInt(var9);
            }
            gn.field_b = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, param4, (byte) 44, param2, this.field_C, param3, param0);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            ms.a((String) null, (Throwable) ((Object) var6_ref), param1 ^ 0);
            this.a("crash", 21253);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("fn.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
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
          fs var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Sumoblitz.field_L ? 1 : 0;
          var4 = sb.a(param1, pn.field_r, dk.field_c, (byte) 81);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (param0 != 16981) {
            this.field_w = 90;
          }
          if (var4 == 1) {
            var5_int = tn.a(ht.c(true), 0, qt.a((byte) 21));
            if (var5_int != -1) {
              jv.a(var5_int, mn.field_g, ns.field_c, true);
              ns.field_c = null;
              mn.field_g = null;
            }
            var11 = li.c(82);
            if (var11 != null) {
              kd.a(var11.booleanValue(), -80);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = rs.a(oj.b(-98), gi.c((byte) -2), eu.a((byte) -97), of.c(-86), this.field_w, 119, rw.c((byte) -109));
            if (var5_intLifetime1 != -1) {
              Sumoblitz.a(mn.field_g, param0 ^ 16984, var5_intLifetime1, ns.field_c);
              ns.field_c = null;
              mn.field_g = null;
            }
          }
          if (3 == var4) {
            if (gr.field_l != -1 &&
              gr.field_l != 0) {
              gr.field_l = -1;
              ic.a(4);
            }
            if (param2) {
              ts.field_d = false;
            } else {
              var5_intLifetime2 = jb.a(gi.c((byte) -2), this.field_z, (byte) 21, false, this.field_w, rw.c((byte) -124));
              if (-1 != var5_intLifetime2) {
                if (var5_intLifetime2 == 0) {
                  km.field_k = lb.field_a;
                  ov.b(2);
                  jv.field_a = 10;
                  ms.field_a = false;
                } else {
                  rj.a((byte) -118, var5_intLifetime2, ns.field_c);
                  ns.field_c = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (qn.field_a) {
              gt.a(-1540, ra.c(param0 ^ 16983));
            } else {
              ms.field_a = true;
              jv.field_a = 10;
            }
          }
          if (var4 == 5) {
            jl.a(ra.c(param0 - 16979), false);
          }
          if (var4 == 6 &&
            pu.field_m) {
            jv.field_a = 10;
          }
          if (var4 == 7) {
            ic.a(false, ra.c(2));
          }
          if (8 == var4) {
            gt.a(-1540, ra.c(param0 - 16979));
          }
          if (9 == var4) {
            us.a(ra.c(2), (byte) -124);
          }
          if (var4 == 10) {
            as.field_v.g(17, param0 ^ 16989);
          }
          if (var4 == 11) {
            of.a(8192, ra.c(2));
          }
          if (var4 == 12) {
            cn.a(f.e(false), ra.c(2), (byte) -103);
          }
          if (var4 == 13) {
            try {
              if (null == ms.field_e) {
                ms.field_e = new cc(lt.field_m, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ms.field_e.a((byte) -110)) {
                var12 = ms.field_e.b((byte) 126);
                if (var12 != null) {
                  var7 = sd.a(var12.field_n, 0, var12.field_p, 26564);
                  ha.a((byte) 115, var7);
                } else {
                  var9 = (String) null;
                  ha.a((byte) 122, (String) null);
                }
                ms.field_e = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              ms.a("S1", (Throwable) ((Object) var5), 0);
              var10 = (String) null;
              ha.a((byte) 111, (String) null);
              ms.field_e = null;
            }
          }
          if (15 == var4) {
            jv.field_a = 10;
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

    private final void e(byte param0) {
        int var2 = 76 / ((param0 + 76) / 48);
        wp.field_z[4] = true;
    }

    private final void c(boolean param0, int param1) {
        wp.field_z[0] = true;
        wp.field_z[7] = true;
        wp.field_z[18] = true;
        if (param1 != -12605) {
          this.q(112);
        }
        wp.field_z[3] = true;
        wp.field_z[8] = param0;
        wp.field_z[17] = true;
        wp.field_z[16] = true;
    }

    protected fn() {
    }

    private final void a(boolean param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        dk.field_c = this.field_v;
        jq.a(dk.field_c, 13586);
        tm.a(param0, (byte) 84, lt.field_m, 5000, this.field_E, param1, this.field_C, this.field_r, 5000, this.field_D, this.field_q, this.field_x, dk.field_c, this.field_y);
        fs.a(lt.field_m, this.field_r, this.field_E, this.field_D, (byte) -56, this.field_C, this.field_x, param1, dk.field_c);
        rp.a(false);
        as.field_w = dk.a((byte) -126);
        int var10 = -116 / ((2 - param2) / 36);
        db.a(false, qn.field_f);
        ak.field_f = param7;
        u.field_P = param4;
        pn.field_i = param5;
        ra.field_f = param3;
        pp.field_h = param6;
        this.p(-1);
        wt.c(8193);
    }

    static {
        field_s = 50;
        field_A = "Waiting for sound effects";
    }
}
