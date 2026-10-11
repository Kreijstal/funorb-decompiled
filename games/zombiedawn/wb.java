/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb extends ke {
    static int field_t;
    private boolean field_s;
    private long field_p;
    String field_u;
    static int field_y;
    private int field_x;
    private int field_l;
    private int field_v;
    private int field_n;
    private boolean field_o;
    static rb field_m;
    private boolean field_r;
    private int field_q;
    private int field_w;

    final void d(boolean param0) {
        if (param0) {
          return;
        }
        i.field_X[4] = true;
    }

    final void h(byte param0) {
        i.field_X[5] = true;
        if (param0 < 43) {
          this.g((byte) 106);
        }
    }

    final void k(int param0) {
        i.field_X[12] = true;
        i.field_X[13] = true;
        if (param0 > -110) {
          this.field_q = -51;
        }
        i.field_X[11] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.b((byte) 96, false);
        if (param4 != -6046) {
          field_t = -76;
        }
        if (param0) {
          this.i(12);
        }
        if (param2) {
          this.f(-1);
        }
        if (param1) {
          this.d(false);
        }
        if (param3) {
          this.h((byte) 78);
        }
    }

    private final void a(String param0, int param1, int param2, int param3, int param4) {
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
        String var11 = null;
        try {
          try {
            if (!this.b(false)) {
              return;
            }
            this.field_u = this.getCodeBase().getHost();
            var11 = this.field_u.toLowerCase();
            stackIn_7_1 = (var11.equals("jagex.com")) || (var11.endsWith(".jagex.com"));
            this.field_s = stackIn_7_1;
            this.field_q = Integer.parseInt(this.getParameter("gameport1"));
            if (param2 != -17761) {
              this.j(-81);
            }
            this.field_w = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_n = Integer.parseInt(var7);
            }
            this.field_x = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_p = Long.parseLong(this.getParameter("instanceid"));
            this.field_o = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_l = Integer.parseInt(var8);
            }
            if (5 <= this.field_l) {
              this.field_l = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_v = Integer.parseInt(var9);
            }
            di.field_J = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param3, param4, param0, param1, -14384, this.field_x, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            ae.a((Throwable) ((Object) var6), param2 ^ -27964, (String) null);
            this.a("crash", 50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref;
          stackIn_26_1 = new StringBuilder().append("wb.O(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void g(int param0) {
        wh.field_d[10] = -1;
        wh.field_d[6] = -2;
        wh.field_d[12] = -1;
        wh.field_d[16] = -1;
        wh.field_d[2] = -2;
        wh.field_d[7] = -1;
        wh.field_d[13] = -1;
        wh.field_d[param0] = -1;
        wh.field_d[11] = -1;
        wh.field_d[8] = -2;
        wh.field_d[4] = -1;
        wh.field_d[9] = -1;
        wh.field_d[3] = -1;
        wh.field_d[18] = 1;
        wh.field_d[1] = 16;
        wh.field_d[5] = -1;
    }

    final void f(int param0) {
        if (param0 != -1) {
          this.a(81, true);
        }
        i.field_X[2] = true;
    }

    public static void f(boolean param0) {
        if (param0) {
          field_y = 57;
        }
        field_m = null;
    }

    private final void j(int param0) {
        int var2 = fj.field_g.d((byte) -121);
        int var3 = 0 != (var2 & 1) ? 1 : 0;
        if (param0 != -1) {
          this.field_x = -26;
        }
        int var4 = jd.field_b - 1;
        byte[] var5 = new byte[var4];
        fj.field_g.a(var4, var5, 0, param0 + 1);
        wi.a(gg.a(var5, (byte) 56), hc.a(0), var3 != 0, -20517);
    }

    private final void f(byte param0) {
        String var2 = jj.i(126);
        pl.a(var2, (byte) -80, hc.a(0));
        int var3 = 110 % ((5 - param0) / 53);
    }

    private final int e(boolean param0) {
        if (this.field_j) {
          return -1;
        }
        if (!dn.i(-19301)) {
          return -1;
        }
        if (ja.field_b) {
          return -1;
        }
        int var2 = de.a(true, we.p((byte) 106), ja.a(23917), this.field_v, true, this.field_s);
        if (var2 == -1) {
          return -1;
        }
        if (0 != var2 &&
          var2 != 1) {
          if (!lf.field_n) {
            this.a("reconnect", 50);
          }
          nc.d((byte) 101);
          qh.a(10, var2, sc.field_d);
          ja.field_b = true;
          if (param0) {
            String var3 = (String) null;
            this.a(-31, 70, (String) null);
          }
          qh.field_e = pd.a(-22826) + 15000L;
          return var2;
        }
        if (fl.field_a == 11 &&
          co.field_b == 0) {
          tc.a((byte) 98);
        }
        return var2;
    }

    final int a(int param0, boolean param1) {
        if (param0 != -27698) {
          return 106;
        }
        return this.a(true, param1, 101);
    }

    final int h(int param0) {
        int var3 = 80 / ((param0 + 51) / 51);
        int var2 = this.e(false);
        if (0 == var2 ||
          var2 == 1) {
          if (i.field_X[1]) {
            td.a(2, (byte) -95);
          }
          if (i.field_X[2]) {
            dp.a(3, -4);
          }
          if (i.field_X[3]) {
            mj.a(4, -1);
          }
          if (i.field_X[4]) {
            ca.a(5, (byte) -118);
          }
          if (i.field_X[5]) {
            wc.f(67600, 6);
          }
          if (i.field_X[6]) {
            wi.a(0, 7);
          }
          if (i.field_X[8]) {
            ni.a((byte) -78);
          }
        }
        return var2;
    }

    final void e(int param0) {
        boolean stackIn_29_0 = false;
        int var2;
        aa var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (param0 != -12) {
          return;
        }
        var2 = l.field_d;
        if (var2 < 64 &&
          i.field_X[var2]) {
          if (var2 == 0) {
            return;
          }
          if (1 != var2) {
            if (var2 == 2) {
              ej.a((byte) -83);
            } else {
              if (3 != var2) {
                if (4 != var2) {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      wc.w(param0 + 135);
                    } else {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 != 16) {
                            if (11 != var2 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                va.a(1545);
                                return;
                              }
                              if (17 == var2) {
                                this.j(-1);
                                return;
                              }
                              if (var2 == 18) {
                                tg.a(param0 ^ -114);
                                return;
                              }
                              ae.a((Throwable) null, param0 ^ -10321, "MGS1: " + cb.f(3));
                              p.a(1);
                              return;
                            }
                            stackIn_29_0 = (var2 == 12);
                            var3 = ln.a(stackIn_29_0, 62);
                            oe.a(0, var3);
                          } else {
                            uk.a(false);
                          }
                        } else {
                          di.a(fj.field_g, 30, jd.field_b, vh.field_a);
                        }
                      } else {
                        this.f((byte) 66);
                      }
                    }
                  } else {
                    ra.b((byte) -120);
                  }
                } else {
                  pb.c((byte) 68);
                }
              } else {
                fm.b(true);
              }
            }
          } else {
            nm.a(14740);
          }
          return;
        }
        ae.a((Throwable) null, param0 ^ -10321, "MGS2: " + cb.f(3));
        p.a(param0 ^ -11);
        return;
    }

    final void b(boolean param0, boolean param1) {
        int discarded$0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_99_0 = 0;
        String stackIn_99_1 = null;
        boolean stackIn_100_2 = false;
        boolean stackIn_103_3;
        int stackIn_133_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ZombieDawn.field_J;
        if (null != rn.field_b) {
          if (null == cn.field_b) {
            var6 = va.b((byte) -121);
            var4 = var6.getSize();
            rn.field_b.b(var4.height, var4.width, -1);
          }
          rn.field_b.d(26);
        }
        ha.b(27914);
        pb.d((byte) -74);
        if (!uk.a((byte) -44) &&
          fl.field_a != 11) {
          mk.a(-128);
        }
        if (jl.field_u != null) {
          id.field_I = jl.field_u.a(-96);
        }
        if (ng.a((byte) -64)) {
          var3 = 1200 * nk.a((byte) 121);
          if (this.field_r ||
            !(dg.a((byte) -120) <= var3) &&
            !(ia.a((byte) 119) <= var3)) {
            this.field_r = false;
            p.a(1);
            nc.d((byte) -3);
            qh.a(10, 2, qb.field_f);
            rh.a(-110);
            ja.field_b = true;
            qh.field_e = 15000L + pd.a(-22826);
          }
        }
        if (co.field_b == -1 ||
          co.field_b == 0) {
          stackIn_22_0 = (co.field_b != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_22_0;
          co.field_b = ci.a(256);
          if (var3Lifetime1 != 0 &&
            0 == co.field_b &&
            fl.field_a == 11 &&
            !dn.i(-19301)) {
            tc.a((byte) -52);
          }
          if (co.field_b != -1 &&
            co.field_b != 0) {
            qh.field_e = 15000L + pd.a(-22826);
          }
        }
        if (co.field_b != -1 &&
          co.field_b != 0) {
          if (10 <= ld.field_j) {
            if (fl.field_a >= 10) {
              nc.d((byte) 118);
              if (co.field_b == 3) {
                qh.a(10, 256, rf.field_a);
              } else {
                if (co.field_b == 4) {
                  qh.a(10, 256, ac.field_o);
                } else {
                  if (co.field_b == 2) {
                    qh.a(10, 256, oe.field_d);
                  } else {
                    if (5 == co.field_b) {
                      qh.a(10, 5, ia.field_f);
                    } else {
                      qh.a(10, 256, ih.field_T);
                    }
                  }
                }
              }
              ja.field_b = true;
            }
          } else {
            if (co.field_b == 3) {
              this.a("js5crc", 50);
            } else {
              if (co.field_b != 4) {
                if (co.field_b != 2) {
                  if (co.field_b != 5) {
                    this.a("js5connect", 50);
                  } else {
                    this.a("outofdate", 50);
                  }
                } else {
                  this.a("js5connect_full", 50);
                }
              } else {
                this.a("js5io", 50);
              }
            }
          }
        }
        if ((co.field_b != -1 &&
          co.field_b != 0 ||
          dn.i(-19301)) &&
          pd.a(-22826) >= qh.field_e) {
          ja.field_b = false;
          if (-1 != co.field_b &&
            0 != co.field_b) {
            co.field_b = -1;
            si.x(0);
          }
        }
        if (co.field_b == 0 &&
          !dn.i(-19301)) {
          ma.field_p = false;
        }
        if (ld.field_j == 0 &&
          sc.a((byte) -128)) {
          ld.field_j = 1;
        }
        if (ld.field_j == 1) {
          if (jp.field_a != 0) {
            f.field_i = mm.a(f.field_f, (byte) -63);
          }
          vo.field_d = wn.a(true, mp.field_d, (byte) -85, 1, false);
          da.field_l = wn.a(true, hf.field_F, (byte) -85, 1, false);
          al.field_a = wn.a(true, ho.field_b, (byte) -85, 1, false);
          gj.field_i = da.field_l;
          nl.field_p = vo.field_d;
          ld.field_j = 2;
        }
        if (ld.field_j == 2) {
          if (f.field_i != null &&
            f.field_i.a((byte) 73)) {
            if (!f.field_i.a("", 0)) {
              f.field_i = null;
            } else {
              if (f.field_i.a(-1, "")) {
                bn.a(32693, f.field_i);
                f.field_i = null;
                ep.c((byte) -50);
              }
            }
          }
          if (null == f.field_i) {
            ld.field_j = 3;
          }
        }
        if (ld.field_j == 3 &&
          al.a(al.field_a, -31526, vo.field_d, da.field_l) &&
          eh.a(false, al.field_a)) {
          ph.b(26311);
          ng.a(121);
          ka.field_a = ql.field_f;
          de.field_i = false;
          nk.a(al.field_a, -1, da.field_l, vo.field_d, ih.field_S);
          if (sn.field_b ||
            fo.field_b != null) {
            stackIn_99_0 = -753;
            stackIn_99_1 = fo.field_b;
            stackIn_100_2 = !(sn.field_b);
            stackIn_103_3 = !(sn.field_b);
            gl.a(stackIn_99_0, stackIn_99_1, stackIn_100_2, stackIn_103_3);
          }
          if (di.field_J) {
            jp.b((byte) -50);
          }
          if (null == t.field_m) {
            t.field_m = ui.a(0);
            nk.field_g = pb.c(-1);
          }
          nl.a(nk.field_g, t.field_m, (byte) -98, al.field_a);
          al.field_a = null;
          vo.field_d = null;
          da.field_l = null;
          ca.a((byte) 104, (java.applet.Applet) (this));
          ep.c((byte) -50);
          ld.field_j = 10;
        }
        if (ld.field_j == 10) {
          if (0 != jp.field_a) {
            aa.field_f = mm.a(jh.field_k, (byte) -56);
          }
          ld.field_j = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (ld.field_j == 11) {
          if (null != aa.field_f && (!aa.field_f.a((byte) 73) ||
            !aa.field_f.c(9001))) {
            eh.a(ic.a(l.field_g, (byte) 114, cj.field_e, aa.field_f), 0.0f, -1);
            decompiledFrameRemainder0 = false;
          }
          else {
            di.field_K = true;
            ld.field_j = 12;
          }
        }
        if (ld.field_j == 12 &&
          !di.field_K) {
          ld.field_j = 13;
        }
        if (ld.field_j == 13) {
          var3Lifetime2 = 1;
          if (null != bp.field_h) {
            stackIn_133_0 = (!bp.field_h.a(-1)) ? 0 : 1;
            var3Lifetime2 = stackIn_133_0;
            eh.a(bp.field_h.field_b, bp.field_h.field_a, -1);
          }
          if (var3Lifetime2 != 0) {
            ld.field_j = 20;
          }
        }
        if (!param0 &&
          rl.field_f) {
          fa.a((byte) -46, cj.field_d);
          this.a(true);
          se.a(20922, cj.field_d);
        }
        if (i.field_X[8]) {
          da.d((byte) -48);
        }
        if (param1) {
          discarded$0 = this.a(true, true, -49);
        }
    }

    final void a(int param0, int param1, String param2) {
        if (param1 < 107) {
          return;
        }
        try {
          this.a(param2, 640, -17761, 480, param0);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "wb.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> 16;
        int var4 = param2 & 65535;
        if (param0 <= 1) {
          wb.f(true);
        }
        int var5 = param1 >> 16;
        int var6 = param1 & 65535;
        return param1 * var3 + (var4 * var5 + (var4 * var6 >> 16));
    }

    final void i(int param0) {
        if (param0 != 12) {
          field_m = (rb) null;
        }
        i.field_X[1] = true;
    }

    private final int a(boolean param0, boolean param1, int param2) {
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
          de var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = ZombieDawn.field_J;
          var4 = bg.a(121, id.field_I, param1, jp.field_a);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = pa.a(tp.c((byte) 0), cm.a((byte) -8), (byte) -90);
            if (var5_int != -1) {
              mp.a(1000, ho.field_a, var5_int, sc.field_d);
              ho.field_a = null;
              sc.field_d = null;
            }
            var11 = wf.e((byte) 86);
            if (var11 != null) {
              fo.a(-128, var11.booleanValue());
            }
          }
          if (2 == var4) {
            var5_intLifetime1 = md.a(co.c(17821), ra.e((byte) -57), ja.a(23917), la.b(0), (byte) -15, this.field_v, we.p((byte) -117));
            if (var5_intLifetime1 != -1) {
              ln.a(var5_intLifetime1, -14, sc.field_d, ho.field_a);
              ho.field_a = null;
              sc.field_d = null;
            }
          }
          if (var4 == 3) {
            if (co.field_b != -1 &&
              co.field_b != 0) {
              co.field_b = -1;
              si.x(0);
            }
            if (!param0) {
              var5_intLifetime2 = de.a(true, we.p((byte) 126), ja.a(23917), this.field_v, false, this.field_s);
              if (var5_intLifetime2 != -1) {
                if (0 == var5_intLifetime2) {
                  nk.field_e = p.field_a;
                  tc.a((byte) 124);
                  i.field_Y = false;
                  fl.field_a = 10;
                } else {
                  qh.a(10, var5_intLifetime2, sc.field_d);
                  sc.field_d = null;
                }
              }
            } else {
              ja.field_b = false;
            }
          }
          if (var4 == 4) {
            if (ih.field_S) {
              qg.a(hc.a(0), (byte) 80);
            } else {
              fl.field_a = 10;
              i.field_Y = true;
            }
          }
          if (var4 == 5) {
            bo.a(-88, hc.a(0));
          }
          if (var4 == 6 &&
            de.field_i) {
            fl.field_a = 10;
          }
          if (var4 == 7) {
            lc.a(hc.a(0), -2895);
          }
          if (var4 == 8) {
            qg.a(hc.a(0), (byte) 77);
          }
          if (9 == var4) {
            vb.a((byte) 50, hc.a(0));
          }
          if (var4 == 10) {
            dp.field_e.j(11, 17);
          }
          if (var4 == 11) {
            fo.a(38205, hc.a(0));
          }
          if (var4 == 12) {
            qi.a(ff.a((byte) -12), hc.a(0), -66);
          }
          if (param2 <= 36) {
            this.field_q = 102;
          }
          if (var4 == 13) {
            try {
              if (hp.field_E == null) {
                hp.field_E = new li(vh.field_a, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (hp.field_E.a(105)) {
                var12 = hp.field_E.a((byte) -118);
                if (var12 != null) {
                  var7 = fa.a(var12.field_h, var12.field_j, 0, -124);
                  vf.a(74, var7);
                } else {
                  var9 = (String) null;
                  vf.a(48, (String) null);
                }
                hp.field_E = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              ae.a((Throwable) ((Object) var5), 10331, "S1");
              var10 = (String) null;
              vf.a(87, (String) null);
              hp.field_E = null;
            }
          }
          if (var4 == 15) {
            fl.field_a = 10;
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

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        jp.field_a = this.field_l;
        pc.a(jp.field_a, (byte) -66);
        s.a(this.field_p, 5000, this.field_o, jp.field_a, param3, this.field_x, this.field_n, 5000, this.field_q, param0, vh.field_a, this.field_u, param1 + 120, this.field_w);
        mh.a(this.field_n, this.field_w, this.field_x, this.field_u, this.field_q, param0, vh.field_a, 0, jp.field_a);
        bd.a((byte) -114);
        jl.field_u = n.c((byte) 94);
        se.a(param1 ^ 20925, cj.field_d);
        f.field_f = param4;
        if (param1 != 7) {
          field_t = 6;
        }
        hf.field_F = param6;
        ho.field_b = param2;
        jh.field_k = param7;
        mp.field_d = param5;
        this.g(17);
        gm.b(-23148);
    }

    final void i(byte param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3;
        boolean stackIn_11_1 = false;
        boolean stackIn_12_2 = false;
        var3 = ZombieDawn.field_J;
        if (param0 != 20) {
          this.field_v = 4;
        }
        if (bj.d(18840)) {
          stackIn_11_1 = false;
          stackIn_12_2 = (cn.field_b != null);
          discarded$4 = this.a(stackIn_11_1, stackIn_12_2, 115);
        } else {
          if (ld.field_j >= 10) {
            if (kk.a(param0 ^ -239)) {
              if (fl.field_a != 0) {
                wd.b(112, id.field_I);
              } else {
                discarded$5 = this.a(false, false, param0 ^ 72);
              }
            } else {
              am.k(-21215);
            }
          }
        }
    }

    final void b(byte param0, boolean param1) {
        i.field_X[17] = true;
        int var3 = 66 % ((param0 + 23) / 45);
        i.field_X[8] = param1;
        i.field_X[3] = true;
        i.field_X[16] = true;
        i.field_X[0] = true;
        i.field_X[18] = true;
        i.field_X[7] = true;
    }

    wb() {
    }

    final void g(byte param0) {
        i.field_X[6] = true;
        int var2 = 123 / ((-47 - param0) / 43);
    }

    static {
        field_t = -1;
        field_y = 0;
    }
}
