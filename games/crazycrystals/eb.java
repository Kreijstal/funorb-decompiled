/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eb extends wa {
    String field_u;
    private boolean field_t;
    private boolean field_r;
    static dp field_p;
    private int field_x;
    private boolean field_q;
    private long field_n;
    static int field_l;
    static bf field_w;
    static String field_m;
    private int field_s;
    private int field_z;
    static String[] field_y;
    private int field_A;
    private int field_v;
    private int field_o;

    private final void b(boolean param0, int param1) {
        uf.field_i[3] = true;
        uf.field_i[18] = true;
        if (param1 != 28427) {
          return;
        }
        uf.field_i[17] = true;
        uf.field_i[16] = true;
        uf.field_i[0] = true;
        uf.field_i[8] = param0;
        uf.field_i[7] = true;
    }

    private final void h(int param0) {
        uf.field_i[1] = true;
        if (param0 != 26528) {
          this.j(-94);
        }
    }

    final void l(int param0) {
        int stackIn_26_0 = 0;
        boolean stackIn_27_1 = false;
        int var2;
        uf var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        if (param0 >= -116) {
          this.a(false, true, false, false, -110);
        }
        var2 = bf.field_b;
        if (var2 < 64 &&
          uf.field_i[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              if (3 != var2) {
                if (4 != var2) {
                  if (var2 == 5) {
                    pk.a(-128);
                  } else {
                    if (var2 != 6) {
                      if (var2 == 7) {
                        this.j(-8);
                      } else {
                        if (var2 == 8) {
                          ah.a(kd.field_n, rk.field_b, -126, te.field_a);
                        } else {
                          if (var2 == 16) {
                            ld.g(-1266);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                ap.a(false);
                                return;
                              }
                              if (var2 == 17) {
                                this.g(7808);
                                return;
                              }
                              if (var2 == 18) {
                                go.b(480);
                                return;
                              }
                              wp.a((Throwable) null, "MGS1: " + ug.a(-1815), 21862);
                              jj.a(4);
                              return;
                            }
                            stackIn_26_0 = 16;
                            stackIn_27_1 = (var2 == 12);
                            var3 = hl.a(stackIn_26_0, stackIn_27_1);
                            c.a(-1, var3);
                          }
                        }
                      }
                    } else {
                      pe.a(-1);
                    }
                  }
                } else {
                  pf.e((byte) 52);
                }
              } else {
                le.a(15295);
              }
            } else {
              ma.e((byte) 109);
            }
          } else {
            ib.e(-16);
          }
          return;
        }
        wp.a((Throwable) null, "MGS2: " + ug.a(-1815), 21862);
        jj.a(4);
    }

    private final int a(boolean param0, byte param1, boolean param2) {
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
          ng var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = CrazyCrystals.field_B;
          var4 = uc.a(param2, (byte) 63, of.field_H, ul.field_g);
          if (param1 != -94) {
            this.field_x = 76;
          }
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = qm.a(gh.h(26500), param1 + 194, rh.b(param1 + 459));
            if (-1 != var5_int) {
              f.a((byte) 125, gj.field_o, re.field_j, var5_int);
              gj.field_o = null;
              re.field_j = null;
            }
            var11 = gg.a(-23387);
            if (var11 != null) {
              mj.a((byte) -34, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = gg.a(bh.a((byte) 78), (byte) 126, this.field_x, ac.c(70), bp.a(6), vg.b((byte) -29), hp.d(5));
            if (var5_intLifetime1 != -1) {
              r.a(-13405, gj.field_o, var5_intLifetime1, re.field_j);
              re.field_j = null;
              gj.field_o = null;
            }
          }
          if (3 == var4) {
            if (-1 != ei.field_E &&
              ei.field_E != 0) {
              ei.field_E = -1;
              cd.e((byte) -70);
            }
            if (param0) {
              an.field_r = false;
            } else {
              var5_intLifetime2 = jj.a(hp.d(param1 ^ -89), false, vg.b((byte) -29), this.field_x, false, this.field_t);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  rg.a(re.field_j, var5_intLifetime2, -257);
                  re.field_j = null;
                } else {
                  wi.field_h = go.field_h;
                  a.a((byte) 63);
                  gl.field_c = false;
                  hp.field_s = 10;
                }
              }
            }
          }
          if (4 == var4) {
            if (!fj.field_d) {
              gl.field_c = true;
              hp.field_s = 10;
            } else {
              kl.a((byte) -1, le.b((byte) -20));
            }
          }
          if (var4 == 5) {
            ta.a(le.b((byte) -20), 19);
          }
          if (var4 == 6 &&
            jd.field_z) {
            hp.field_s = 10;
          }
          if (var4 == 7) {
            gm.a(le.b((byte) -20), 2);
          }
          if (var4 == 8) {
            kl.a((byte) -1, le.b((byte) -20));
          }
          if (var4 == 9) {
            vn.a(le.b((byte) -20), (byte) 87);
          }
          if (10 == var4) {
            tp.field_f.d(param1 + 102, 17);
          }
          if (var4 == 11) {
            qe.a(param1 ^ -94, le.b((byte) -20));
          }
          if (12 == var4) {
            vo.a(31251, qn.a((byte) -114), le.b((byte) -20));
          }
          if (var4 == 13) {
            try {
              if (jl.field_e == null) {
                jl.field_e = new ai(te.field_a, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (jl.field_e.b(0)) {
                var12 = jl.field_e.a((byte) -111);
                if (var12 == null) {
                  var9 = (String) null;
                  ag.a((String) null, 48);
                } else {
                  var7 = gd.a((byte) 11, var12.field_h, 0, var12.field_f);
                  ag.a(var7, 48);
                }
                jl.field_e = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              wp.a((Throwable) ((Object) var5), "S1", param1 + 21956);
              var10 = (String) null;
              ag.a((String) null, 48);
              jl.field_e = null;
            }
          }
          if (var4 == 15) {
            hp.field_s = 10;
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

    public static void f(byte param0) {
        if (param0 < 3) {
          eb.a((byte) -108, 100);
        }
        field_w = null;
        field_y = null;
        field_m = null;
        field_p = null;
    }

    final void a(int param0, int param1, byte param2, boolean param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        this.setBackground(java.awt.Color.black);
        ul.field_g = this.field_o;
        th.a(ul.field_g, -127);
        qe.a((byte) -106, param3, this.field_A, te.field_a, 5000, param7, 5000, this.field_n, this.field_v, ul.field_g, this.field_u, this.field_r, this.field_z, this.field_s);
        pb.a(this.field_A, te.field_a, param7, this.field_s, 1843275042, this.field_v, this.field_u, this.field_z, ul.field_g);
        o.b(-25281);
        ok.field_g = qm.d(1);
        mm.a(jd.field_D, true);
        sl.field_q = param1;
        tp.field_b = param5;
        kj.field_b = param6;
        oh.field_e = param0;
        ik.field_e = param4;
        this.b(false);
        qo.c((byte) 107);
        int var10 = -98 % ((-48 - param2) / 38);
    }

    private final void g(int param0) {
        if (param0 != 7808) {
          this.field_n = -14L;
        }
        int var2 = kd.field_n.h(255);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        int var4 = -1 + rk.field_b;
        byte[] var5 = new byte[var4];
        kd.field_n.b(var4, 0, 29712, var5);
        ec.a(var3 != 0, fa.a((byte) -70, var5), le.b((byte) -20), (byte) -17);
    }

    private final void a(int param0, int param1, String param2, int param3, byte param4) {
        boolean stackIn_8_1 = false;
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
        int var10 = 0;
        String var11 = null;
        try {
          try {
            if (!this.f(112)) {
              return;
            }
            this.field_u = this.getCodeBase().getHost();
            var6 = this.field_u.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_t = stackIn_8_1;
            this.field_A = Integer.parseInt(this.getParameter("gameport1"));
            this.field_s = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_v = Integer.parseInt(var7);
            }
            this.field_z = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_n = Long.parseLong(this.getParameter("instanceid"));
            this.field_r = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_o = Integer.parseInt(var8);
            }
            if (this.field_o >= 5) {
              this.field_o = 0;
            }
            var9 = this.getParameter("affid");
            var10 = 59 % ((param4 + 65) / 52);
            if (var9 != null) {
              this.field_x = Integer.parseInt(var9);
            }
            ng.field_j = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a((byte) 118, 32, param3, param2, this.field_z, param1, param0);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var11 = (String) null;
            wp.a((Throwable) ((Object) var6_ref), (String) null, 21862);
            this.a(0, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var6_ref2;
          stackIn_23_1 = new StringBuilder().append("eb.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        ai.field_c[16] = -1;
        ai.field_c[18] = 1;
        ai.field_c[5] = -1;
        ai.field_c[8] = -2;
        ai.field_c[11] = -1;
        ai.field_c[3] = -1;
        ai.field_c[13] = -1;
        ai.field_c[10] = -1;
        if (param0) {
          return;
        }
        ai.field_c[2] = -2;
        ai.field_c[17] = -1;
        ai.field_c[9] = -1;
        ai.field_c[12] = -1;
        ai.field_c[7] = -1;
        ai.field_c[1] = 16;
        ai.field_c[6] = -2;
        ai.field_c[4] = -1;
    }

    private final void c(boolean param0) {
        uf.field_i[2] = param0;
    }

    final int i(int param0) {
        if (this.field_b) {
          return -1;
        }
        if (!gl.c(-11)) {
          return -1;
        }
        if (an.field_r) {
          return -1;
        }
        int var2 = jj.a(hp.d(5), false, vg.b((byte) -29), this.field_x, true, this.field_t);
        if (param0 == var2) {
          return -1;
        }
        if (var2 == 0 ||
          1 == var2) {
          if (hp.field_s == 11 &&
            ei.field_E == 0) {
            a.a((byte) 63);
          }
          return var2;
        }
        if (!ka.field_j) {
          this.a(0, "reconnect");
        }
        tn.e((byte) -127);
        rg.a(re.field_j, var2, -257);
        an.field_r = true;
        ee.field_e = lo.a((byte) 88) + 15000L;
        return var2;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        if (param4 != -1) {
          this.field_x = -85;
        }
        this.b(false, 28427);
        if (param0) {
          this.h(26528);
        }
        if (param2) {
          this.c(true);
        }
        if (param3) {
          this.d((byte) -84);
        }
        if (param1) {
          this.e((byte) 19);
        }
    }

    private final void d(byte param0) {
        uf.field_i[4] = true;
        if (param0 > -64) {
          this.h(-114);
        }
    }

    final void a(boolean param0, int param1) {
        int stackIn_25_0 = 0;
        boolean stackIn_103_0 = false;
        boolean stackIn_106_1 = false;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        String var6;
        java.awt.Container var7;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = CrazyCrystals.field_B;
        if (ne.field_f != null) {
          if (ph.field_E == null) {
            var7 = pi.d(0);
            var4 = var7.getSize();
            ne.field_f.a(var4.height, (byte) 56, var4.width);
          }
          ne.field_f.a(true);
        }
        ao.a((byte) -124);
        lm.a((byte) 64);
        if (!aj.e((byte) -14) &&
          hp.field_s != 11) {
          kd.d(3);
        }
        if (ok.field_g != null) {
          of.field_H = ok.field_g.a(false);
        }
        if (of.a(param1 - 15000)) {
          var3 = sm.d((byte) 24) * 1200;
          if (this.field_q ||
            !(var3 >= mi.e((byte) 125)) &&
            !(var3 >= al.a(false))) {
            this.field_q = false;
            jj.a(4);
            tn.e((byte) -128);
            rg.a(hd.field_a, 2, -257);
            me.a(20);
            an.field_r = true;
            ee.field_e = 15000L + lo.a((byte) 107);
          }
        }
        if (-1 == ei.field_E ||
          ei.field_E == 0) {
          stackIn_25_0 = (ei.field_E != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_25_0;
          ei.field_E = sc.a((byte) -98);
          if (var3Lifetime1 != 0 &&
            ei.field_E == 0 &&
            hp.field_s == 11 &&
            !gl.c(-11)) {
            a.a((byte) 63);
          }
          if (ei.field_E != -1 &&
            ei.field_E != 0) {
            ee.field_e = lo.a((byte) -65) + 15000L;
          }
        }
        if (-1 != ei.field_E &&
          0 != ei.field_E) {
          if (eq.field_j < 10) {
            if (ei.field_E == 3) {
              this.a(0, "js5crc");
            } else {
              if (ei.field_E == 4) {
                this.a(param1 ^ 15000, "js5io");
              } else {
                if (ei.field_E == 2) {
                  this.a(param1 - 15000, "js5connect_full");
                } else {
                  if (ei.field_E != 5) {
                    this.a(0, "js5connect");
                  } else {
                    this.a(0, "outofdate");
                  }
                }
              }
            }
          } else {
            if (hp.field_s >= 10) {
              tn.e((byte) -127);
              if (ei.field_E == 3) {
                rg.a(gm.field_a, 256, -257);
              } else {
                if (ei.field_E != 4) {
                  if (ei.field_E != 2) {
                    if (ei.field_E == 5) {
                      rg.a(fm.field_o, 5, param1 - 15257);
                    } else {
                      rg.a(ci.field_j, 256, -257);
                    }
                  } else {
                    rg.a(ao.field_a, 256, -257);
                  }
                } else {
                  rg.a(cj.field_C, 256, param1 - 15257);
                }
              }
              an.field_r = true;
            }
          }
        }
        if ((ei.field_E != -1 &&
          ei.field_E != 0 ||
          gl.c(-11)) &&
          ee.field_e <= lo.a((byte) -86)) {
          an.field_r = false;
          if (ei.field_E != -1 &&
            ei.field_E != 0) {
            ei.field_E = -1;
            cd.e((byte) -60);
          }
        }
        if (ei.field_E == 0 &&
          !gl.c(param1 - 15011)) {
          nf.field_f = false;
        }
        if (eq.field_j == 0 &&
          pk.a((byte) -56)) {
          eq.field_j = 1;
        }
        if (eq.field_j == 1) {
          if (ul.field_g != 0) {
            be.field_e = mi.c(kj.field_b, -96);
          }
          rb.field_k = de.a(false, true, tp.field_b, 1, param1 - 14988);
          ok.field_c = de.a(false, true, sl.field_q, 1, 12);
          dd.field_a = de.a(false, true, oh.field_e, 1, param1 - 14988);
          dj.field_ab = rb.field_k;
          eq.field_j = 2;
          lo.field_a = ok.field_c;
        }
        if (eq.field_j == 2) {
          if (be.field_e != null &&
            be.field_e.a((byte) 102)) {
            if (!be.field_e.c("", -93)) {
              be.field_e = null;
            } else {
              if (be.field_e.a(-20402, "")) {
                qb.a(be.field_e, param1 ^ -15041);
                be.field_e = null;
                vp.a(106);
              }
            }
          }
          if (null == be.field_e) {
            eq.field_j = 3;
          }
        }
        if (eq.field_j == 3 &&
          ro.a(rb.field_k, ok.field_c, false, dd.field_a) &&
          jg.a(dd.field_a, -38)) {
          sg.a(param1 ^ 15099);
          m.c(29537);
          jd.field_z = false;
          ta.field_i = vl.field_b;
          pg.a((byte) -106, dd.field_a, fj.field_d, ok.field_c, rb.field_k);
          if (uk.field_j ||
            tp.field_h != null) {
            stackIn_103_0 = !(uk.field_j);
            stackIn_106_1 = !(uk.field_j);
            fa.a(stackIn_103_0, stackIn_106_1, tp.field_h, true);
          }
          if (ng.field_j) {
            hf.a(4);
          }
          if (am.field_e == null) {
            am.field_e = ba.a(-29513);
            tb.field_a = ep.c((byte) 112);
          }
          am.a(am.field_e, 0, dd.field_a, tb.field_a);
          rb.field_k = null;
          dd.field_a = null;
          ok.field_c = null;
          rb.a((java.applet.Applet) (this), (byte) 126);
          vp.a(param1 ^ 15078);
          eq.field_j = 10;
        }
        if (param1 != 15000) {
          var6 = (String) null;
          this.a(58, (String) null, 3);
        }
        if (eq.field_j == 10) {
          if (0 != ul.field_g) {
            ak.field_f = mi.c(ik.field_e, param1 - 15113);
          }
          eq.field_j = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (eq.field_j == 11) {
          if (null != ak.field_f && (!ak.field_f.a((byte) 102) ||
            !ak.field_f.a(false))) {
            td.a(0.0f, fl.a(127, jg.field_h, ak.field_f, ge.field_a), false);
            decompiledFrameRemainder0 = false;
          }
          else {
            eq.field_j = 12;
            hb.field_g = true;
          }
        }
        if (eq.field_j == 12 &&
          !hb.field_g) {
          eq.field_j = 13;
        }
        if (eq.field_j == 13) {
          var3Lifetime2 = 1;
          if (ul.field_k != null) {
            stackIn_138_0 = (!ul.field_k.a(param1 ^ 15000)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            td.a(ul.field_k.field_b, ul.field_k.field_l, false);
          }
          if (var3Lifetime2 != 0) {
            eq.field_j = 20;
          }
        }
        if (!param0 &&
          em.field_f) {
          fq.a(-101, jd.field_D);
          this.b(-109);
          mm.a(jd.field_D, true);
        }
        if (uf.field_i[8]) {
          rl.d(0);
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param0 != -113) {
          eb.a((byte) 10, -72);
        }
        if ((param1 & 7) != 0) {
          var2 = 8 - (param1 & 7);
        }
        int var3 = param1 + var2;
        return var3;
    }

    final void a(int param0, String param1, int param2) {
        try {
          this.a(640, 480, param1, param2, (byte) -121);
          if (param0 != -1) {
            field_w = (bf) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "eb.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        int discarded$21 = 0;
        int discarded$22 = 0;
        int var3;
        boolean stackIn_3_1 = false;
        int stackIn_3_2 = 0;
        Object stackIn_4_0;
        boolean stackIn_4_3;
        var3 = CrazyCrystals.field_B;
        if (!kf.b(param0 ^ 6572)) {
          if (eq.field_j >= 10) {
            if (!ji.f(250)) {
              vg.a((byte) -82);
            } else {
              if (hp.field_s != 0) {
                pi.a(of.field_H, -109);
              } else {
                discarded$21 = this.a(false, (byte) -94, false);
              }
            }
          }
        } else {
          stackIn_3_1 = false;
          stackIn_3_2 = -94;
          if (ph.field_E == null) {
            stackIn_4_0 = this;
            stackIn_4_3 = false;
          } else {
            stackIn_4_0 = this;
            stackIn_4_3 = true;
          }
          discarded$22 = this.a(stackIn_3_1, (byte) stackIn_3_2, stackIn_4_3);
        }
        if (param0 != 6579) {
          this.field_A = 59;
        }
    }

    private final void j(int param0) {
        String var2 = hn.b(false);
        if (param0 != -8) {
          field_m = (String) null;
        }
        d.a(le.b((byte) -20), (byte) 125, var2);
    }

    final int a(int param0, boolean param1) {
        if (param0 <= 32) {
          this.field_n = 3L;
        }
        return this.a(true, (byte) -94, param1);
    }

    protected eb() {
    }

    private final void e(byte param0) {
        if (param0 != 19) {
          this.a(95, -14, (byte) -45, true, -26, 9, 15, 104);
        }
        uf.field_i[5] = true;
    }

    static {
        field_w = new bf();
        field_y = new String[16];
        field_m = "Laser Hub";
    }
}
