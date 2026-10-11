/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ma extends ah {
    private int field_p;
    private long field_v;
    String field_z;
    private int field_r;
    static String field_w;
    private int field_u;
    private int field_s;
    static pk field_t;
    private boolean field_A;
    private int field_B;
    private int field_x;
    static String field_y;
    private boolean field_q;
    private boolean field_o;

    final void i(int param0) {
        hr.field_h[11] = true;
        hr.field_h[param0] = true;
        hr.field_h[12] = true;
    }

    final static hd f(int param0) {
        if (param0 != 0) {
          return (hd) null;
        }
        return bf.field_u.field_Ab;
    }

    private final void h(int param0) {
        uc.field_A[8] = -2;
        uc.field_A[6] = -2;
        uc.field_A[5] = -1;
        uc.field_A[9] = -1;
        uc.field_A[12] = -1;
        uc.field_A[11] = -1;
        uc.field_A[13] = -1;
        uc.field_A[3] = -1;
        uc.field_A[4] = -1;
        uc.field_A[10] = -1;
        uc.field_A[18] = 1;
        uc.field_A[16] = -1;
        uc.field_A[17] = -1;
        uc.field_A[7] = -1;
        uc.field_A[1] = 16;
        if (param0 != 0) {
          return;
        }
        uc.field_A[2] = -2;
    }

    final void m(int param0) {
        if (param0 != 10) {
          return;
        }
        hr.field_h[5] = true;
    }

    final int i(byte param0) {
        if (param0 > -53) {
          return 89;
        }
        int var2 = this.l((byte) 121);
        if (var2 == 0 ||
          1 == var2) {
          if (hr.field_h[1]) {
            da.a(0, 2);
          }
          if (hr.field_h[2]) {
            hm.a(115, 3);
          }
          if (hr.field_h[3]) {
            kp.a(4, -56);
          }
          if (hr.field_h[4]) {
            hg.a(5, (byte) -122);
          }
          if (hr.field_h[5]) {
            dq.a(-1, 6);
          }
          if (hr.field_h[6]) {
            mf.a(7, (byte) -128);
          }
          if (hr.field_h[8]) {
            sj.b(-1);
          }
        }
        return var2;
    }

    final void l(int param0) {
        if (param0 != -1) {
          String var3 = (String) null;
          this.a((String) null, 31, 32, -108, 43);
        }
        hr.field_h[2] = true;
    }

    final void a(String param0, int param1, byte param2) {
        try {
          if (param2 != -60) {
            this.field_A = true;
          }
          this.a(param0, param1, 480, 640, -93);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ma.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void e(int param0) {
        hr.field_h[param0] = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        vv.field_r = this.field_p;
        vg.b(vv.field_r, 31900);
        uv.a(127, this.field_x, this.field_A, this.field_s, this.field_B, param7, param1, 5000, oo.field_c, vv.field_r, this.field_v, this.field_u, 5000, this.field_z);
        js.a(this.field_z, param1, oo.field_c, vv.field_r, this.field_u, this.field_x, this.field_B, this.field_s, false);
        ml.o(255);
        ag.field_f = aw.g((byte) 3);
        lp.a(ic.field_d, (byte) -64);
        no.field_F = param4;
        gr.field_y = param3;
        if (param5 >= -3) {
          field_t = (pk) null;
        }
        ie.field_G = param0;
        ub.field_E = param2;
        wf.field_Q = param6;
        this.h(0);
        lm.d(-1);
    }

    final void a(boolean param0, int param1) {
        hr.field_h[0] = true;
        if (param1 != -1) {
          return;
        }
        hr.field_h[16] = true;
        hr.field_h[3] = true;
        hr.field_h[17] = true;
        hr.field_h[7] = true;
        hr.field_h[8] = param0;
        hr.field_h[18] = true;
    }

    private final void c(boolean param0) {
        String var2 = fj.a(param0);
        bv.a(so.a(19), var2, (byte) 15);
    }

    public static void d(boolean param0) {
        field_y = null;
        field_t = null;
        if (!param0) {
          field_y = (String) null;
        }
        field_w = null;
    }

    final static void b(boolean param0) {
        String var2 = null;
        if (h.field_f != null) {
          var2 = h.field_f;
          String var1 = var2;
          n.a(126, vo.$cfr$intArgs$a$53ce4ab4c593(-18, qo.field_j, new String[]{var2}));
          h.field_f = null;
        }
        if (!param0) {
          ma.k((byte) 24);
        }
    }

    final static void k(byte param0) {
        if (na.field_Ab != ea.field_f.field_e) {
          c.field_c = c.field_c + (ea.field_f.field_e - na.field_Ab);
          na.field_Ab = ea.field_f.field_e;
        }
        if (param0 != -118) {
          return;
        }
        if (!(pg.field_b <= 0)) {
          pg.field_b = pg.field_b - 1;
        }
        if (!(pg.field_b <= 0)) {
          eq.a(0);
        }
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        int var4 = 0;
        String var3 = null;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Kickabout.field_G;
        try {
          if (param0 >= -108) {
            field_w = (String) null;
          }
          var3 = iv.a(0, param2, param1);
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          for (var4 = 0; var4 < param1.length(); var4++) {
            if (!jw.a(param1.charAt(var4), 160)) {
              stackIn_13_0 = pl.field_c;
              return stackIn_13_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ma.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final void h(byte param0) {
        hr.field_h[1] = true;
        int var2 = 110 / ((39 - param0) / 57);
    }

    final void j(int param0) {
        int stackIn_26_0 = 0;
        boolean stackIn_27_1 = false;
        int var2;
        tv var3;
        int var4;
        var4 = Kickabout.field_G;
        if (param0 < 83) {
          ma.b(false);
        }
        var2 = so.field_b;
        if (var2 < 64 &&
          hr.field_h[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              if (3 == var2) {
                gf.a((byte) 53);
              } else {
                if (var2 == 4) {
                  sm.a((byte) 103);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      ki.a(true);
                    } else {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (16 == var2) {
                            gn.c(-49);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                tt.a((byte) 77);
                                return;
                              }
                              if (var2 == 17) {
                                this.j((byte) -1);
                                return;
                              }
                              if (var2 == 18) {
                                gs.c(25957);
                                return;
                              }
                              bd.a("MGS1: " + tr.b(0), (Throwable) null, 1);
                              lr.b((byte) -116);
                              return;
                            }
                            stackIn_26_0 = 113;
                            stackIn_27_1 = (12 == var2);
                            var3 = jd.$cfr$intArgs$a$e7eed804270c(stackIn_26_0, stackIn_27_1);
                            qh.a((byte) -112, var3);
                          }
                        } else {
                          qv.a(un.field_e, ms.field_b, -1, oo.field_c);
                        }
                      } else {
                        this.c(false);
                      }
                    }
                  } else {
                    om.a(0);
                  }
                }
              }
            } else {
              tl.b(2);
            }
          } else {
            sk.a(true);
          }
          return;
        }
        bd.a("MGS2: " + tr.b(0), (Throwable) null, 1);
        lr.b((byte) -116);
    }

    final void n(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = Kickabout.field_G;
        int var2 = 31 / ((param0 - 61) / 48);
        if (hh.b((byte) 97)) {
          discarded$1 = this.a(false, true, null != e.field_m ? true : false);
        } else {
          if (10 > hl.field_d) {
          } else {
            if (!nq.i(-92)) {
              fs.a((byte) -126);
            } else {
              if (vj.field_c != 0) {
                iu.a(59, id.field_v);
              } else {
                discarded$2 = this.a(false, true, false);
              }
            }
          }
        }
    }

    final void c(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        int stackIn_102_0 = 0;
        boolean stackIn_103_1 = false;
        boolean stackIn_106_2 = false;
        int stackIn_134_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Kickabout.field_G;
        if (null != kl.field_h) {
          if (null == e.field_m) {
            var6 = va.d((byte) -13);
            var4 = var6.getSize();
            kl.field_h.a(768, var4.width, var4.height);
          }
          kl.field_h.c(0);
        }
        fo.g(param0);
        ew.a((byte) 58);
        if (!uf.c(608) &&
          11 != vj.field_c) {
          pe.a(127);
        }
        if (null != ag.field_f) {
          id.field_v = ag.field_f.b((byte) -22);
        }
        if (oh.b(-14954)) {
          var3 = 1200 * nb.b((byte) 126);
          if (this.field_q ||
            !(or.a(true) <= var3) &&
            !(var3 >= tl.a(-126))) {
            this.field_q = false;
            lr.b((byte) -116);
            ws.a((byte) -31);
            fc.a(uc.field_D, 2, -56);
            oe.c(30929);
            fc.field_d = true;
            ua.field_g = 15000L + nj.a(-48);
          }
        }
        if (es.field_h == -1 ||
          es.field_h == 0) {
          stackIn_24_0 = (es.field_h != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          es.field_h = cp.a(522);
          if (var3Lifetime1 != 0 &&
            es.field_h == 0 &&
            11 == vj.field_c &&
            !hq.a((byte) 10)) {
            bd.e(-1);
          }
          if (es.field_h != -1 &&
            0 != es.field_h) {
            ua.field_g = nj.a(-65) + 15000L;
          }
        }
        if (es.field_h != -1 &&
          es.field_h != 0) {
          if (10 > hl.field_d) {
            if (es.field_h != 3) {
              if (es.field_h != 4) {
                if (es.field_h != 2) {
                  if (5 == es.field_h) {
                    this.a((byte) -66, "outofdate");
                  } else {
                    this.a((byte) -123, "js5connect");
                  }
                } else {
                  this.a((byte) -101, "js5connect_full");
                }
              } else {
                this.a((byte) -124, "js5io");
              }
            } else {
              this.a((byte) 27, "js5crc");
            }
          } else {
            if (10 <= vj.field_c) {
              ws.a((byte) -13);
              if (es.field_h != 3) {
                if (es.field_h != 4) {
                  if (2 != es.field_h) {
                    if (es.field_h == 5) {
                      fc.a(sr.field_m, 5, -94);
                    } else {
                      fc.a(ih.field_b, 256, 69);
                    }
                  } else {
                    fc.a(w.field_h, 256, param0 ^ 102);
                  }
                } else {
                  fc.a(st.field_o, 256, 79);
                }
              } else {
                fc.a(cj.field_F, 256, 96);
              }
              fc.field_d = true;
            }
          }
        }
        if ((es.field_h != -1 &&
          es.field_h != 0 ||
          hq.a((byte) 10)) &&
          nj.a(param0 ^ 34) >= ua.field_g) {
          fc.field_d = false;
          if (-1 != es.field_h &&
            es.field_h != 0) {
            es.field_h = -1;
            np.b(23877);
          }
        }
        if (0 == es.field_h &&
          !hq.a((byte) 10)) {
          m.field_h = false;
        }
        if (hl.field_d == 0 &&
          wb.h(param0 - 96)) {
          hl.field_d = 1;
        }
        if (hl.field_d == 1) {
          if (vv.field_r != 0) {
            qq.field_H = dh.a((byte) -128, ub.field_E);
          }
          bw.field_b = gu.a(false, ie.field_G, 1, true, 118);
          gs.field_c = gu.a(false, gr.field_y, 1, true, param0 ^ 125);
          up.field_k = gu.a(false, no.field_F, 1, true, param0 ^ 127);
          hl.field_d = 2;
          kh.field_g = bw.field_b;
          ht.field_b = gs.field_c;
        }
        if (hl.field_d == 2) {
          if (qq.field_H != null &&
            qq.field_H.d(param0 ^ -43)) {
            if (qq.field_H.a("", (byte) -81)) {
              if (qq.field_H.a(false, "")) {
                pt.a(true, qq.field_H);
                qq.field_H = null;
                dd.a((byte) 51);
              }
            } else {
              qq.field_H = null;
            }
          }
          if (qq.field_H == null) {
            hl.field_d = 3;
          }
        }
        if (hl.field_d == 3 &&
          so.a(bw.field_b, true, gs.field_c, up.field_k) &&
          ch.a(-2, up.field_k)) {
          oi.a(115);
          wm.c(param0 + 1);
          ts.field_b = jw.field_yb;
          aw.field_H = false;
          da.a(up.field_k, fu.field_c, bw.field_b, gs.field_c, -120);
          if (kk.field_m ||
            lf.field_c != null) {
            stackIn_102_0 = -101;
            stackIn_103_1 = !(kk.field_m);
            stackIn_106_2 = !(kk.field_m);
            kk.$cfr$intArgs$a$842e35442ba4(stackIn_102_0, stackIn_103_1, stackIn_106_2, lf.field_c);
          }
          if (o.field_d) {
            bh.a(true);
          }
          if (null == qt.field_y) {
            qt.field_y = ia.a(55);
            jo.field_D = us.a((byte) -88);
          }
          nt.a(jo.field_D, up.field_k, param0 + 98, qt.field_y);
          bw.field_b = null;
          gs.field_c = null;
          up.field_k = null;
          lo.a((byte) -127, (java.applet.Applet) (this));
          dd.a((byte) 120);
          hl.field_d = 10;
        }
        if (hl.field_d == 10) {
          if (0 != vv.field_r) {
            fn.field_b = dh.a((byte) -125, wf.field_Q);
          }
          hl.field_d = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == hl.field_d) {
          if (null != fn.field_b && (!fn.field_b.d(-50) ||
            !fn.field_b.a(false))) {
            ju.a(0.0f, hn.a(ep.field_e, ks.field_g, param0 - 25, fn.field_b), (byte) 30);
            decompiledFrameRemainder0 = false;
          }
          else {
            hl.field_d = 12;
            nd.field_c = true;
          }
        }
        if (hl.field_d == 12 &&
          !nd.field_c) {
          hl.field_d = 13;
        }
        if (hl.field_d == 13) {
          var3Lifetime2 = 1;
          if (mp.field_h != null) {
            stackIn_134_0 = (!mp.field_h.a(param0 + 1183118480)) ? 0 : 1;
            var3Lifetime2 = stackIn_134_0;
            ju.a(mp.field_h.field_h, mp.field_h.field_a, (byte) 30);
          }
          if (var3Lifetime2 != 0) {
            hl.field_d = 20;
          }
        }
        if (!param1 &&
          mf.field_Ib) {
          hm.a(-113, ic.field_d);
          this.f((byte) -88);
          lp.a(ic.field_d, (byte) -64);
        }
        if (hr.field_h[8]) {
          gw.b(5);
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 != 5) {
          this.m(-23);
        }
        return this.a(true, true, param1);
    }

    final void g(int param0) {
        if (param0 != 13) {
          return;
        }
        hr.field_h[4] = true;
    }

    final static void a(int param0, byte param1, qb param2, boolean param3) {
        vu dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_24_0 = 0;
        vu stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        vu stackIn_43_0 = null;
        boolean stackIn_44_1 = false;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        vu stackIn_91_0 = null;
        boolean stackIn_92_1 = false;
        vu stackIn_98_0 = null;
        boolean stackIn_98_1 = false;
        boolean stackIn_99_2 = false;
        vu stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        boolean stackIn_104_1 = false;
        vu stackIn_108_0 = null;
        boolean stackIn_109_1 = false;
        int stackIn_113_0 = 0;
        vu stackIn_127_0 = null;
        boolean stackIn_128_1 = false;
        vu stackIn_132_0 = null;
        boolean stackIn_133_1 = false;
        vu stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        vu stackIn_140_0 = null;
        boolean stackIn_141_1 = false;
        String stackIn_154_0 = null;
        vu stackIn_158_0 = null;
        boolean stackIn_159_1 = false;
        vu stackIn_161_0 = null;
        boolean stackIn_162_1 = false;
        int stackIn_168_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_226_0 = 0;
        vu stackIn_329_0 = null;
        boolean stackIn_330_1 = false;
        vu stackIn_336_0 = null;
        boolean stackIn_336_1 = false;
        boolean stackIn_337_2 = false;
        vu stackIn_339_0 = null;
        int stackIn_339_1 = 0;
        int stackIn_339_2 = 0;
        int stackIn_339_3 = 0;
        boolean stackIn_342_1 = false;
        vu stackIn_346_0 = null;
        boolean stackIn_347_1 = false;
        RuntimeException stackIn_356_0 = null;
        StringBuilder stackIn_356_1 = null;
        String stackIn_357_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        vu[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vu var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        vu var28 = null;
        vu var29 = null;
        vu[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = Kickabout.field_G;
        try {
          if (!param3) {
            if (np.a(99)) {
              stackIn_12_0 = (!param2.field_Cb) ? 1 : 0;
            } else {
              stackIn_12_0 = 0;
            }
            var4_int = stackIn_12_0;
          } else {
            stackIn_5_0 = (hw.field_k) ? 0 : 1;
            var4_int = stackIn_5_0;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var5 = 0;
          if (param3) {
            if (param1 >= -48) {
              field_t = (pk) null;
            }
            decompiledFrameRemainder1 = !(2 > rn.field_d.length);
            if (decompiledFrameRemainder1) {
              if (param3) {
                stackIn_24_0 = (pn.field_t != -1) ? 1 : 0;
              } else {
                stackIn_24_0 = 0;
              }
              var6 = stackIn_24_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = pn.field_t;
                for (var8_int = 0; var8_int < er.field_h.length; var8_int++) {
                  er.field_h[var8_int] = (byte) 0;
                }
              }
            }
          } else {
            for (var6 = 0; 5 > var6; var6++) {
              if (var4_int != 0 &&
                rf.field_c[0][var6 + 1].field_sb != 0 &&
                param2.field_Wb != var6) {
                var5 = 1;
                param2.field_Wb = var6;
              }
              stackIn_37_0 = rf.field_c[0][var6 + 1];
              stackIn_38_1 = (var4_int != 0);
              stackIn_37_0.field_lb = stackIn_38_1;
              if (!ui.field_t &&
                3 == var6) {
                rf.field_c[0][1 + var6].field_lb = false;
              }
              stackIn_43_0 = rf.field_c[0][1 + var6];
              stackIn_44_1 = (param2.field_Wb == var6);
              stackIn_43_0.field_I = stackIn_44_1;
            }
            if (rf.field_c[0][2].field_Q) {
              if (!np.a(77)) {
                sn.field_e = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gr.field_v, new String[]{uv.field_i.field_ec});
              } else {
                sn.field_e = ib.field_B;
              }
            }
            if (param1 >= -48) {
              field_t = (pk) null;
            }
            decompiledFrameRemainder1 = !(2 > rn.field_d.length);
            if (decompiledFrameRemainder1) {
              if (param3) {
                stackIn_60_0 = (pn.field_t != -1) ? 1 : 0;
              } else {
                stackIn_60_0 = 0;
              }
              var6 = stackIn_60_0;
              decompiledFrameRemainder0 = (var6 != 0);
              if (decompiledFrameRemainder0) {
                var7 = pn.field_t;
                for (var8_int = 0; var8_int < er.field_h.length; var8_int++) {
                  er.field_h[var8_int] = (byte) 0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            er.field_h[var7 / 8] = (byte)hf.a((int) er.field_h[var7 / 8], 1 << var7 % 8);
          }
          if (decompiledFrameRemainder1) {
            stackIn_68_0 = (param3) ? -1 : 0;
            for (var7 = stackIn_68_0; var7 < rn.field_d.length; var7++) {
              if (var6 != 0) {
                stackIn_76_0 = (pn.field_t != var7) ? 1 : 0;
              } else {
                stackIn_76_0 = 0;
              }
              var8_intLifetime1 = stackIn_76_0;
              if (var4_int != 0 &&
                rf.field_c[1][var7 + 1].field_sb != 0) {
                if (param3) {
                  if (var6 == 0) {
                    if (-1 == var7) {
                      for (var9 = 0; var9 < er.field_h.length; var9++) {
                        er.field_h[var9] = (byte) 0;
                      }
                    } else {
                      er.field_h[var7 / 8] = (byte)ek.b((int) er.field_h[var7 / 8], 1 << qj.b(7, var7));
                    }
                  }
                } else {
                  var9 = rn.field_d[var7];
                  if (var9 != param2.field_bc) {
                    param2.field_bc = var9;
                    var5 = 1;
                  }
                }
              }
              if (param3) {
                if (var7 == -1) {
                  rf.field_c[1][var7 + 1].field_I = true;
                  for (var9 = 0; rn.field_d.length > var9; var9++) {
                    dupTemp$0 = rf.field_c[1][1 + var7];
                    stackIn_98_0 = dupTemp$0;
                    stackIn_98_1 = dupTemp$0.field_I;
                    stackIn_99_2 = ((er.field_h[var9 / 8] & 1 << (7 & var9)) == 0);
                    stackIn_98_0.field_I = stackIn_98_1 & stackIn_99_2;
                  }
                } else {
                  stackIn_101_0 = rf.field_c[1][var7 + 1];
                  stackIn_101_1 = ~(er.field_h[var7 / 8] & 1 << (var7 & 7));
                  stackIn_101_2 = -1;
                  stackIn_104_1 = (stackIn_101_1 != stackIn_101_2);
                  stackIn_101_0.field_I = stackIn_104_1;
                }
              } else {
                var9 = rn.field_d[var7];
                stackIn_91_0 = rf.field_c[1][1 + var7];
                stackIn_92_1 = (param2.field_bc == var9);
                stackIn_91_0.field_I = stackIn_92_1;
              }
              stackIn_108_0 = rf.field_c[1][var7 + 1];
              stackIn_109_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_108_0.field_lb = stackIn_109_1;
            }
          }
          stackIn_113_0 = (param3) ? 0 : 1;
          for (var6Lifetime1 = stackIn_113_0; var6Lifetime1 < 3; var6Lifetime1++) {
            var28 = rf.field_c[2][var6Lifetime1];
            if (var4_int != 0 &&
              0 != var28.field_sb) {
              if (param3) {
                if (var6Lifetime1 == 0) {
                  ru.field_C = 0;
                } else {
                  ru.field_C = ru.field_C ^ var6Lifetime1;
                }
              } else {
                if (param2.field_Mb != var6Lifetime1) {
                  var5 = 1;
                  param2.field_Mb = var6Lifetime1;
                }
              }
            }
            if (param3) {
              if (var6Lifetime1 == 0) {
                stackIn_136_0 = var28;
                stackIn_137_1 = (0 == ru.field_C);
                stackIn_136_0.field_I = stackIn_137_1;
              } else {
                stackIn_132_0 = var28;
                stackIn_133_1 = ((ru.field_C & var6Lifetime1) != 0);
                stackIn_132_0.field_I = stackIn_133_1;
              }
            } else {
              stackIn_127_0 = var28;
              stackIn_128_1 = ((param2.field_Mb & var6Lifetime1) != 0);
              stackIn_127_0.field_I = stackIn_128_1;
            }
            stackIn_140_0 = var28;
            stackIn_141_1 = (var4_int != 0);
            stackIn_140_0.field_lb = stackIn_141_1;
          }
          if (param3 &&
            1 < ku.field_f) {
            for (var6Lifetime2 = 0; ku.field_f + 1 > var6Lifetime2; var6Lifetime2++) {
              var29 = rf.field_c[3][var6Lifetime2];
              if (var4_int != 0 &&
                var29.field_sb != 0) {
                lk.field_l = var6Lifetime2;
              }
              if (var29.field_Q &&
                var6Lifetime2 > 0) {
                if (null != oi.field_f) {
                  stackIn_154_0 = oi.field_f[-1 + var6Lifetime2];
                } else {
                  stackIn_154_0 = null;
                }
                var8 = stackIn_154_0;
                if (var8 != null) {
                  sn.field_e = var8;
                }
              }
              stackIn_158_0 = var29;
              stackIn_159_1 = (var6Lifetime2 == lk.field_l);
              stackIn_158_0.field_I = stackIn_159_1;
              stackIn_161_0 = var29;
              stackIn_162_1 = (var4_int != 0);
              stackIn_161_0.field_lb = stackIn_162_1;
            }
          }
          var6Lifetime3 = 0;
          for (var7 = 0; ss.field_j > var7; var7++) {
            var30 = rf.field_c[var7 + 4];
            var8_array = var30;
            stackIn_168_0 = (!param3) ? 0 : -1;
            for (var9 = stackIn_168_0; -1 + var30.length > var9; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (hm.field_D != null &&
                  null != hm.field_D[var7] &&
                  (~sb.field_a & hm.field_D[var7][var9]) > 0) {
                  var14 = 1;
                  var15 = ps.a((byte) -126, hm.field_D[var7][var9] & ~sb.field_a);
                }
                if (null != ds.field_h &&
                  null != ds.field_h[var7] &&
                  0 >= eq.field_d &&
                  ds.field_h[var7][var9]) {
                  var10 = 1;
                }
                if (lh.field_E != null &&
                  null != lh.field_E[var7]) {
                  var16 = lh.field_E[var7][var9];
                  if (var16 != 0 &&
                    !fv.field_d &&
                    eq.field_d <= 0) {
                    var10 = 1;
                  }
                  if (var16 > 0 &&
                    var16 > mi.field_d) {
                    var12 = 1;
                  }
                }
                if (param3) {
                  if (qd.field_e != null) {
                    if (null != qd.field_e[var7]) {
                      stackIn_202_0 = (qd.field_e[var7][var9]) ? 1 : 0;
                    } else {
                      stackIn_202_0 = 0;
                    }
                  } else {
                    stackIn_202_0 = 0;
                  }
                } else {
                  stackIn_202_0 = 0;
                }
                var13 = stackIn_202_0;
                if (null != so.field_f &&
                  null != so.field_f[var7]) {
                  var16Lifetime2 = so.field_f[var7][var9];
                  if (0 != var16Lifetime2 &&
                    !fv.field_d &&
                    0 >= eq.field_d) {
                    var10 = 1;
                  }
                  if (var16Lifetime2 > 0 &&
                    da.field_o < var16Lifetime2) {
                    var11 = 1;
                  }
                }
              }
              if (tk.field_Ib >= 2 &&
                ne.field_G[12]) {
                var13 = 0;
                var10 = 0;
                var11 = 0;
                var14 = 0;
                var12 = 0;
              }
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0 &&
                var14 == 0) {
                stackIn_226_0 = 0;
              } else {
                stackIn_226_0 = 1;
              }
              var16Lifetime1 = stackIn_226_0;
              tt.field_c = true;
              if (var16Lifetime1 == 0 &&
                var9 >= 0 &&
                la.field_k != null && (!param3 ||
                !hw.field_k)) {
                if (null == hm.field_G) {
                  m.field_f = new boolean[ss.field_j];
                  hm.field_G = new byte[ss.field_j];
                }
                tt.field_c = false;
                ee.field_e = false;
                for (var17_int = 0; var7 > var17_int; var17_int++) {
                  m.field_f[var17_int] = false;
                }
                pl.a(0, var7, param2, -1, (byte) -125, var9, -1, param3);
                if (tk.field_Ib >= 2 &&
                  ne.field_G[12]) {
                  tt.field_c = true;
                }
                if (!tt.field_c) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[1 + var9];
              if (var4_int != 0 &&
                var17.field_sb != 0) {
                if (param3) {
                  if (-1 == var9) {
                    for (var18 = var6Lifetime3; var6Lifetime3 - (-var30.length + 1) > var18; var18++) {
                      rf.field_d[var18 / 8] = (byte)qj.b((int) rf.field_d[var18 / 8], ~(1 << qj.b(var18, 7)));
                    }
                  } else {
                    rf.field_d[(var9 + var6Lifetime3) / 8] = (byte)ek.b((int) rf.field_d[(var9 + var6Lifetime3) / 8], 1 << qj.b(var6Lifetime3 + var9, 7));
                  }
                } else {
                  if (var16Lifetime1 == 0 &&
                    param2.field_Eb[var7] != (byte)var9) {
                    var5 = 1;
                    param2.field_Eb[var7] = (byte)var9;
                  }
                }
              }
              if (param3 &&
                var16Lifetime1 != 0) {
                rf.field_d[(var6Lifetime3 + var9) / 8] = (byte)qj.b((int) rf.field_d[(var6Lifetime3 + var9) / 8], ~(1 << qj.b(7, var9 + var6Lifetime3)));
              }
              if (var9 >= 0 &&
                var17.field_Q) {
                if (null == oj.field_Q) {
                  var18_ref = null;
                } else {
                  if (oj.field_Q[var7] != null) {
                    var18_ref = oj.field_Q[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                }
                if (ca.field_g != null) {
                  if (ca.field_g[var7] != null) {
                    var19 = ca.field_g[var7][var9];
                  } else {
                    var19 = null;
                  }
                } else {
                  var19 = null;
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 == 0) {
                  if (var10 == 0) {
                    if (var11 != 0) {
                      var22_int = -da.field_o + so.field_f[var7][var9];
                      if (var22_int != 1) {
                        var21 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, wq.field_c, new String[]{Integer.toString(var22_int)});
                      } else {
                        var21 = ss.field_d;
                      }
                    }
                    if (var12 != 0) {
                      var31 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, aq.field_h, new String[]{Integer.toString(mi.field_d), Integer.toString(lh.field_E[var7][var9])});
                      var21 = var31;
                      var21 = var31;
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + var31;
                      } else {
                        var21 = var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = wv.field_bb;
                      if (var15 > 0 &&
                        um.field_a != null &&
                        um.field_a.length >= var15 &&
                        um.field_a[-1 + var15] != null) {
                        var22 = um.field_a[var15 - 1][0];
                      }
                      if (var21 == null) {
                        var21 = var22;
                      } else {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      }
                    }
                  } else {
                    var21 = oe.field_n;
                  }
                } else {
                  var21 = w.field_c;
                }
                if (var4_int != 0 &&
                  !tt.field_c) {
                  var22 = null;
                  if (ee.field_e) {
                    var22 = "</col>" + qk.field_H + "<col=A00000>";
                    var25 = var22;
                    var22 = var25;
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var7 > var24; var24++) {
                    if (m.field_f[var24]) {
                      var25_ref = "</col>" + ok.field_b[var24] + "<col=A00000>";
                      var22 = var25_ref;
                      var21 = var22;
                      var22 = var25_ref;
                      if (var22 == null) {
                        var22 = var25_ref;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_ref;
                      }
                    }
                  }
                  if (var23 != 0) {
                    var21 = nr.field_m + (String) (var22);
                  } else {
                    var21 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gk.field_d, new String[]{(String) (var22)});
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = wj.a("<br>", "<br><col=A00000>", true, var32);
                  if (var20 != null) {
                    var20 = (String) (var20) + "<br>" + var33;
                  } else {
                    var20 = var33;
                  }
                }
                if (var20 != null) {
                  sn.field_e = (String) (var20);
                }
              }
              if (param3) {
                if (var9 == -1) {
                  var17.field_I = true;
                  var27 = var6Lifetime3;
                  var18Lifetime1 = var27;
                  while (var27 < var6Lifetime3 + var30.length - 1) {
                    stackIn_336_0 = var17;
                    stackIn_336_1 = var17.field_I;
                    stackIn_337_2 = (0 == (rf.field_d[var27 / 8] & 1 << (var27 & 7)));
                    stackIn_336_0.field_I = stackIn_336_1 & stackIn_337_2;
                    var27++;
                  }
                } else {
                  stackIn_339_0 = var17;
                  stackIn_339_1 = -1;
                  stackIn_339_2 = rf.field_d[(var6Lifetime3 + var9) / 8] & 1 << (var6Lifetime3 + var9 & 7);
                  stackIn_339_3 = -1;
                  stackIn_342_1 = (stackIn_339_1 != (stackIn_339_2 ^ stackIn_339_3));
                  stackIn_339_0.field_I = stackIn_342_1;
                }
              } else {
                stackIn_329_0 = var17;
                stackIn_330_1 = (tt.field_c) && ((byte)var9 == param2.field_Eb[var7]);
                stackIn_329_0.field_I = stackIn_330_1;
              }
              stackIn_346_0 = var17;
              stackIn_347_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_346_0.field_lb = stackIn_347_1;
            }
            var6Lifetime3 = var6Lifetime3 + (255 & rp.field_x[var7]);
          }
          if (var5 != 0) {
            if (param3) {
              return;
            }
            lu.a(6773, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_356_0 = var4;
          stackIn_356_1 = new StringBuilder().append("ma.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_357_2 = "null";
          } else {
            stackIn_357_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_356_0), ((StringBuilder) (Object) stackIn_356_1).append(stackIn_357_2).append(',').append(param3).append(')').toString());
        }
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
          iw var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Kickabout.field_G;
          var4 = ou.b(id.field_v, -1951459327, vv.field_r, param2);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5_int = bo.a(s.j(61), (byte) -98, va.f(-1));
            if (-1 != var5_int) {
              no.a(mr.field_X, var5_int, gd.field_b, -1);
              gd.field_b = null;
              mr.field_X = null;
            }
            var11 = v.d(83);
            if (var11 != null) {
              ia.a(var11.booleanValue(), -23249);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = mu.a(12, qq.g((byte) -17), ls.g(-26370), ev.h(10326), he.a(320), la.b(820907312), this.field_r);
            if (var5_intLifetime1 != -1) {
              vs.a(gd.field_b, mr.field_X, (byte) 122, var5_intLifetime1);
              mr.field_X = null;
              gd.field_b = null;
            }
          }
          if (var4 == 3) {
            if (es.field_h != -1 &&
              es.field_h != 0) {
              es.field_h = -1;
              np.b(23877);
            }
            if (param0) {
              fc.field_d = false;
            } else {
              var5_intLifetime2 = js.a(0, ls.g(-26370), this.field_o, false, ev.h(10326), this.field_r);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  fc.a(gd.field_b, var5_intLifetime2, 125);
                  gd.field_b = null;
                } else {
                  tn.field_a = wq.field_d;
                  bd.e(-1);
                  vj.field_c = 10;
                  nb.field_f = false;
                }
              }
            }
          }
          if (var4 == 4) {
            if (fu.field_c) {
              hi.a(so.a(108), param1);
            } else {
              vj.field_c = 10;
              nb.field_f = true;
            }
          }
          if (5 == var4) {
            js.a(20338, so.a(-111));
          }
          if (var4 == 6 &&
            aw.field_H) {
            vj.field_c = 10;
          }
          if (var4 == 7) {
            vr.a(so.a(35), 23607);
          }
          if (!param1) {
            this.field_u = -76;
          }
          if (var4 == 8) {
            hi.a(so.a(124), param1);
          }
          if (var4 == 9) {
            ap.a(so.a(-93), 0);
          }
          if (10 == var4) {
            or.field_d.b(17, (byte) -87);
          }
          if (var4 == 11) {
            bq.a((byte) 125, so.a(51));
          }
          if (var4 == 12) {
            im.a(so.a(-85), 114, aq.c(71));
          }
          if (13 == var4) {
            try {
              if (null == rk.field_d) {
                rk.field_d = new u(oo.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (rk.field_d.a((byte) 58)) {
                var12 = rk.field_d.b(0);
                if (var12 == null) {
                  var9 = (String) null;
                  ue.a((String) null, (byte) -118);
                } else {
                  var7 = hf.a((byte) -122, var12.field_n, 0, var12.field_f);
                  ue.a(var7, (byte) -49);
                }
                rk.field_d = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              bd.a("S1", (Throwable) ((Object) var5), 1);
              var10 = (String) null;
              ue.a((String) null, (byte) 119);
              rk.field_d = null;
            }
          }
          if (15 == var4) {
            vj.field_c = 10;
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

    private final void a(String param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
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
            if (!this.d((byte) 118)) {
              return;
            }
            this.field_z = this.getCodeBase().getHost();
            var6 = this.field_z.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_o = stackIn_7_1;
            this.field_s = Integer.parseInt(this.getParameter("gameport1"));
            this.field_u = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_x = Integer.parseInt(var7);
            }
            this.field_B = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_v = Long.parseLong(this.getParameter("instanceid"));
            this.field_A = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_p = Integer.parseInt(var8);
            }
            if (param4 >= -78) {
              this.i(38);
            }
            if (this.field_p >= 5) {
              this.field_p = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_r = Integer.parseInt(var9);
            }
            o.field_d = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param1, param3, this.field_B, (byte) -126, param2, param0, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            bd.a((String) null, (Throwable) ((Object) var6_ref), 1);
            this.a((byte) 87, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("ma.BB(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void k(int param0) {
        if (kd.field_s) {
          on.g(on.field_b, on.field_e, on.field_c - on.field_b, on.field_h - on.field_e);
          qa.field_E.a(46, false);
        }
        if (param0 != 1) {
          CharSequence var2 = (CharSequence) null;
          ma.a((byte) -6, (CharSequence) null, true);
        }
    }

    ma() {
    }

    private final void j(byte param0) {
        int var2 = un.field_e.h((byte) -122);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = ms.field_b - 1;
        byte[] var5 = new byte[var4];
        un.field_e.a((byte) -30, 0, var5, var4);
        bv.a(0, kt.a(var5, true), var3 != 0, so.a(55));
        int var6 = 115 % ((-74 - param0) / 48);
    }

    private final int l(byte param0) {
        if (this.field_e) {
          return -1;
        }
        if (!hq.a((byte) 10)) {
          return -1;
        }
        if (fc.field_d) {
          return -1;
        }
        int var2 = js.a(0, ls.g(-26370), this.field_o, true, ev.h(10326), this.field_r);
        if (var2 == -1) {
          return -1;
        }
        if (0 == var2 ||
          var2 == 1) {
          if (vj.field_c == 11 &&
            es.field_h == 0) {
            bd.e(-1);
          }
          return var2;
        }
        if (!kr.field_e) {
          this.a((byte) 61, "reconnect");
        }
        ws.a((byte) -74);
        fc.a(gd.field_b, var2, 71);
        fc.field_d = true;
        ua.field_g = nj.a(121) + 15000L;
        if (param0 < 114) {
          field_t = (pk) null;
        }
        return var2;
    }

    static {
        field_w = "Secret achievement";
    }
}
