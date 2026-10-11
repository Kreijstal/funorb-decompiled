/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kk extends fj {
    String field_r;
    private int field_q;
    private int field_x;
    private long field_D;
    static bc field_n;
    private boolean field_o;
    private boolean field_m;
    private int field_u;
    private int field_y;
    private int field_C;
    static long field_B;
    static String field_t;
    private boolean field_p;
    static int field_z;
    private int field_v;
    static String field_w;
    static int field_s;

    private final void j(byte param0) {
        if (param0 != 6) {
          this.field_m = false;
        }
        ib.field_m[5] = true;
    }

    final void j(int param0) {
        boolean stackIn_35_0 = false;
        int var2;
        bl var3;
        int var4;
        var4 = Bounce.field_N;
        var2 = wa.field_d;
        if (64 > var2 &&
          ib.field_m[var2]) {
          if (param0 != -4) {
            field_s = 15;
          }
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              vi.a(1);
            } else {
              if (var2 != 3) {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            hg.h((byte) -93);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                d.e((byte) -94);
                                return;
                              }
                              if (var2 == 17) {
                                this.i((byte) 50);
                                return;
                              }
                              if (var2 == 18) {
                                dg.b(param0 + 20);
                                return;
                              }
                              ti.a((Throwable) null, (byte) 100, "MGS1: " + la.a(-112));
                              kc.a((byte) 18);
                              return;
                            }
                            stackIn_35_0 = (var2 == 12);
                            var3 = vg.a(stackIn_35_0, 3904);
                            vc.a(param0 ^ 1, var3);
                          }
                        } else {
                          bj.a(jc.field_g, (byte) -125, pe.field_d, ck.field_e);
                        }
                      } else {
                        this.h((byte) 101);
                      }
                    } else {
                      he.a(1);
                    }
                  } else {
                    ld.b((byte) 120);
                  }
                } else {
                  cl.b(false);
                }
              } else {
                hb.j(1790);
              }
            }
          } else {
            ef.a((byte) 124);
          }
          return;
        }
        ti.a((Throwable) null, (byte) 100, "MGS2: " + la.a(param0 ^ 108));
        kc.a((byte) 18);
    }

    private final void a(boolean param0, boolean param1) {
        ib.field_m[0] = true;
        ib.field_m[17] = true;
        ib.field_m[8] = param1;
        ib.field_m[18] = true;
        ib.field_m[3] = true;
        ib.field_m[7] = true;
        ib.field_m[16] = true;
        if (param0) {
          field_B = 46L;
        }
    }

    private final void i(byte param0) {
        int var2 = jc.field_g.d((byte) -81);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = pe.field_d - 1;
        byte[] var5 = new byte[var4];
        jc.field_g.a(var4, 8, 0, var5);
        if (param0 <= 42) {
          this.a(false);
        }
        mg.a(true, vi.b(0), c.a(0, var5), var3 != 0);
    }

    private final void i(int param0) {
        ib.field_m[2] = true;
        if (param0 != 0) {
          field_n = (bc) null;
        }
    }

    final void a(boolean param0, int param1) {
        int discarded$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_98_0 = 0;
        String stackIn_98_1 = null;
        boolean stackIn_99_2 = false;
        boolean stackIn_102_3;
        int stackIn_132_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Bounce.field_N;
        if (vd.field_b != null) {
          if (null == sj.field_f) {
            var6 = oa.a((byte) 126);
            var4 = var6.getSize();
            vd.field_b.a((byte) 13, var4.height, var4.width);
          }
          vd.field_b.d((byte) -84);
        }
        ra.c(28282);
        ve.b((byte) -91);
        if (!ci.k(-31077) &&
          mh.field_U != 11) {
          pa.a((byte) -65);
        }
        if (hg.field_k != null) {
          va.field_a = hg.field_k.a(-83);
        }
        if (ej.b(-4)) {
          var3 = 1200 * mg.f(-118);
          if (this.field_o ||
            !(var3 >= jb.a(31083)) &&
            !(var3 >= m.a((byte) 77))) {
            this.field_o = false;
            kc.a((byte) 18);
            va.a(2);
            cl.a(u.field_a, true, 2);
            ud.b(-20);
            dl.field_b = true;
            nj.field_n = fa.a(126) + 15000L;
          }
        }
        if (-1 == cf.field_e ||
          cf.field_e == 0) {
          stackIn_21_0 = (cf.field_e != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_21_0;
          cf.field_e = hd.a((byte) 96);
          if (var3Lifetime1 != 0 &&
            cf.field_e == 0 &&
            mh.field_U == 11 &&
            !tb.e(-11)) {
            ta.b(102);
          }
          if (cf.field_e != -1 &&
            0 != cf.field_e) {
            nj.field_n = 15000L + fa.a(-120);
          }
        }
        if (cf.field_e != -1 &&
          cf.field_e != 0) {
          if (sa.field_k < 10) {
            if (cf.field_e == 3) {
              this.a((byte) -119, "js5crc");
            } else {
              if (cf.field_e != 4) {
                if (cf.field_e == 2) {
                  this.a((byte) -68, "js5connect_full");
                } else {
                  if (cf.field_e == 5) {
                    this.a((byte) 114, "outofdate");
                  } else {
                    this.a((byte) -60, "js5connect");
                  }
                }
              } else {
                this.a((byte) 89, "js5io");
              }
            }
          } else {
            if (10 <= mh.field_U) {
              va.a(2);
              if (cf.field_e == 3) {
                cl.a(ub.field_c, true, 256);
              } else {
                if (cf.field_e != 4) {
                  if (2 != cf.field_e) {
                    if (cf.field_e != 5) {
                      cl.a(db.field_O, true, 256);
                    } else {
                      cl.a(ui.field_k, true, 5);
                    }
                  } else {
                    cl.a(jl.field_e, true, 256);
                  }
                } else {
                  cl.a(ub.field_d, true, 256);
                }
              }
              dl.field_b = true;
            }
          }
        }
        if ((cf.field_e != -1 &&
          0 != cf.field_e ||
          tb.e(-11)) &&
          nj.field_n <= fa.a(116)) {
          dl.field_b = false;
          if (cf.field_e != -1 &&
            0 != cf.field_e) {
            cf.field_e = -1;
            ea.d(0);
          }
        }
        if (cf.field_e == 0 &&
          !tb.e(-11)) {
          tk.field_a = false;
        }
        if (sa.field_k == 0 &&
          gk.b(116)) {
          sa.field_k = 1;
        }
        if (1 == sa.field_k) {
          if (ud.field_a != 0) {
            jb.field_a = fa.a((byte) -76, jd.field_g);
          }
          pa.field_i = jc.a(ne.field_n, false, 1, 0, true);
          kg.field_b = jc.a(mh.field_Y, false, 1, 0, true);
          ea.field_e = jc.a(b.field_a, false, 1, 0, true);
          j.field_j = pa.field_i;
          sa.field_k = 2;
        }
        if (sa.field_k == 2) {
          if (jb.field_a != null &&
            jb.field_a.c(-114)) {
            if (jb.field_a.a("", (byte) -16)) {
              if (jb.field_a.b("", false)) {
                cg.a((byte) -99, jb.field_a);
                jb.field_a = null;
                vc.e((byte) -44);
              }
            } else {
              jb.field_a = null;
            }
          }
          if (null == jb.field_a) {
            sa.field_k = 3;
          }
        }
        if (sa.field_k == 3 &&
          qi.a(ea.field_e, kg.field_b, (byte) -125, pa.field_i) &&
          ee.a(ea.field_e, (byte) 106)) {
          qe.c(443111233);
          pb.b(16);
          pa.field_e = false;
          ea.field_c = dh.field_d;
          td.a(1, ea.field_e, pa.field_i, kg.field_b, ba.field_B);
          if (qd.field_a ||
            mj.field_k != null) {
            stackIn_98_0 = 4;
            stackIn_98_1 = mj.field_k;
            stackIn_99_2 = !(qd.field_a);
            stackIn_102_3 = !(qd.field_a);
            rk.a(stackIn_98_0, stackIn_98_1, stackIn_99_2, stackIn_102_3);
          }
          if (id.field_g) {
            u.a((byte) -10);
          }
          if (kg.field_k == null) {
            kg.field_k = lc.h(-126);
            qc.field_c = pb.c(0);
          }
          pj.a(ea.field_e, qc.field_c, false, kg.field_k);
          pa.field_i = null;
          ea.field_e = null;
          kg.field_b = null;
          ok.a((java.applet.Applet) (this), -122);
          vc.e((byte) -44);
          sa.field_k = 10;
        }
        if (sa.field_k == 10) {
          if (0 != ud.field_a) {
            sd.field_pb = fa.a((byte) -76, lg.field_a);
          }
          sa.field_k = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (sa.field_k == 11) {
          if (null != sd.field_pb && (!sd.field_pb.c(-121) ||
            !sd.field_pb.a((byte) -62))) {
            hg.a(hg.a(pc.field_p, sd.field_pb, 130, ii.field_l), -66, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            sa.field_k = 12;
            ri.field_z = true;
          }
        }
        if (12 == sa.field_k &&
          !ri.field_z) {
          sa.field_k = 13;
        }
        if (sa.field_k == 13) {
          var3Lifetime2 = 1;
          if (null != fb.field_lb) {
            stackIn_132_0 = (!fb.field_lb.a(0)) ? 0 : 1;
            var3Lifetime2 = stackIn_132_0;
            hg.a(fb.field_lb.field_d, -94, fb.field_lb.field_g);
          }
          if (var3Lifetime2 != 0) {
            sa.field_k = 20;
          }
        }
        if (param1 > -9) {
          discarded$0 = this.a(true, false, false);
        }
        if (!param0 &&
          ef.field_f) {
          mh.a(ch.field_h, (byte) 110);
          this.d(12955);
          l.a(0, ch.field_h);
        }
        if (ib.field_m[8]) {
          vg.a((byte) -17);
        }
    }

    private final void a(boolean param0) {
        ib.field_m[1] = param0;
    }

    final int h(int param0) {
        if (this.field_e) {
          return -1;
        }
        if (!tb.e(-11)) {
          return -1;
        }
        if (dl.field_b) {
          return -1;
        }
        int var2 = b.a((byte) -37, this.field_C, uf.a((byte) -112), bl.b(param0 - 50), this.field_p, true);
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (mh.field_U == 11 &&
            cf.field_e == 0) {
            ta.b(param0 ^ 95);
          }
          return var2;
        }
        if (!wb.field_b) {
          this.a((byte) 93, "reconnect");
        }
        va.a(2);
        cl.a(ib.field_o, true, var2);
        dl.field_b = true;
        nj.field_n = 15000L + fa.a(-61);
        if (param0 != 1) {
          this.field_o = true;
        }
        return var2;
    }

    private final void f(int param0) {
        ib.field_m[param0] = true;
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4) {
        this.a(false, false);
        if (param3) {
          this.a(true);
        }
        if (param0) {
          this.i(0);
        }
        if (param4) {
          this.f(param2 ^ 22418);
        }
        if (param1) {
          this.j((byte) 6);
        }
        if (param2 != 22422) {
          this.field_u = -90;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ud.field_a = this.field_y;
        pd.a(true, ud.field_a);
        pa.a(this.field_r, this.field_v, param6, this.field_D, this.field_u, this.field_m, 25342, 5000, this.field_x, this.field_q, param3, ck.field_e, 5000, ud.field_a);
        rk.a(param3, this.field_q, this.field_r, 0, this.field_v, ud.field_a, ck.field_e, this.field_u, this.field_x);
        wi.g(param5 - 8717);
        hg.field_k = ek.c(0);
        l.a(0, ch.field_h);
        lg.field_a = param0;
        ne.field_n = param1;
        mh.field_Y = param4;
        jd.field_g = param7;
        if (param5 != 8764) {
          this.h(-50);
        }
        b.field_a = param2;
        this.f((byte) 27);
        oh.a(true);
    }

    private final void f(byte param0) {
        ce.field_n[6] = -2;
        ce.field_n[4] = -1;
        ce.field_n[10] = -1;
        ce.field_n[2] = -2;
        ce.field_n[9] = -1;
        if (param0 != 27) {
          this.f((byte) 15);
        }
        ce.field_n[8] = -2;
        ce.field_n[13] = -1;
        ce.field_n[16] = -1;
        ce.field_n[12] = -1;
        ce.field_n[11] = -1;
        ce.field_n[1] = 16;
        ce.field_n[18] = 1;
        ce.field_n[7] = -1;
        ce.field_n[17] = -1;
        ce.field_n[3] = -1;
        ce.field_n[5] = -1;
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
          String stackIn_29_0 = null;
          boolean stackIn_30_1 = false;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          wi var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Bounce.field_N;
          var4 = ff.a(param2, ud.field_a, 8786, va.field_a);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (param1) {
            field_s = -61;
          }
          if (var4 == 1) {
            var5_int = hh.a(ne.f(32768), ef.a(30923), (byte) 99);
            if (var5_int != -1) {
              ej.a(var5_int, bi.field_l, ib.field_o, 255);
              bi.field_l = null;
              ib.field_o = null;
            }
            var11 = fa.b(1);
            if (var11 != null) {
              lg.a(param1, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = sa.a(bb.a(-102), pj.a((byte) 48), ok.d(1), uf.a((byte) -128), 85, this.field_C, bl.b(-71));
            if (-1 != var5_intLifetime1) {
              jf.a((byte) -52, bi.field_l, var5_intLifetime1, ib.field_o);
              bi.field_l = null;
              ib.field_o = null;
            }
          }
          if (var4 == 3) {
            if (-1 != cf.field_e &&
              cf.field_e != 0) {
              cf.field_e = -1;
              ea.d(0);
            }
            if (param0) {
              dl.field_b = false;
            } else {
              var5_intLifetime2 = b.a((byte) -37, this.field_C, uf.a((byte) -108), bl.b(-95), this.field_p, false);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  stackIn_29_0 = ib.field_o;
                  stackIn_30_1 = (param1) ? false : true;
                  cl.a(stackIn_29_0, stackIn_30_1, var5_intLifetime2);
                  ib.field_o = null;
                } else {
                  al.field_h = l.field_b;
                  ta.b(101);
                  mh.field_U = 10;
                  pg.field_c = false;
                }
              }
            }
          }
          if (4 == var4) {
            if (ba.field_B) {
              fl.a(8192, vi.b(0));
            } else {
              mh.field_U = 10;
              pg.field_c = true;
            }
          }
          if (var4 == 5) {
            tc.a(vi.b(0), 6091);
          }
          if (var4 == 6 &&
            pa.field_e) {
            mh.field_U = 10;
          }
          if (7 == var4) {
            nd.a(vi.b(0), 8192);
          }
          if (8 == var4) {
            fl.a(8192, vi.b(0));
          }
          if (var4 == 9) {
            hb.a((byte) -117, vi.b(0));
          }
          if (var4 == 10) {
            hh.field_p.a(true, 17);
          }
          if (11 == var4) {
            lg.a(0, vi.b(0));
          }
          if (var4 == 12) {
            qc.a(vi.b(0), 24, hd.a(-124));
          }
          if (var4 == 13) {
            try {
              if (uj.field_v == null) {
                uj.field_v = new ha(ck.field_e, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (uj.field_v.a((byte) -53)) {
                var12 = uj.field_v.a(11951);
                if (var12 != null) {
                  var7 = lh.a(0, -3789, var12.field_h, var12.field_i);
                  pk.a((byte) 5, var7);
                } else {
                  var9 = (String) null;
                  pk.a((byte) -125, (String) null);
                }
                uj.field_v = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              ti.a((Throwable) ((Object) var5), (byte) 100, "S1");
              var10 = (String) null;
              pk.a((byte) -128, (String) null);
              uj.field_v = null;
            }
          }
          if (var4 == 15) {
            mh.field_U = 10;
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

    final int a(int param0, boolean param1) {
        if (param0 != -1) {
          return 113;
        }
        return this.a(true, false, param1);
    }

    private final void a(int param0, int param1, byte param2, String param3, int param4) {
        int discarded$0 = 0;
        boolean stackIn_8_1 = false;
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
            if (!this.a(param2 ^ 20698)) {
              return;
            }
            this.field_r = this.getCodeBase().getHost();
            var6 = this.field_r.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_p = stackIn_8_1;
            this.field_v = Integer.parseInt(this.getParameter("gameport1"));
            this.field_x = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_q = Integer.parseInt(var7);
            }
            this.field_u = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_D = Long.parseLong(this.getParameter("instanceid"));
            this.field_m = this.getParameter("member").equals("yes");
            if (param2 != 52) {
              discarded$0 = this.a(true, false, true);
            }
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_y = Integer.parseInt(var8);
            }
            if (this.field_y >= 5) {
              this.field_y = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_C = Integer.parseInt(var9);
            }
            id.field_g = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, param3, param0, 102, this.field_u, param1, param4);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            ti.a((Throwable) ((Object) var6_ref), (byte) 100, (String) null);
            this.a((byte) -124, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("kk.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, byte param1, String param2) {
        if (param1 != 122) {
          return;
        }
        try {
          this.a(param0, 480, (byte) 52, param2, 640);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "kk.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_n = null;
        field_w = null;
        field_t = null;
        int var1 = -62 / ((param0 + 12) / 37);
    }

    private final void h(byte param0) {
        String var2 = jj.a((byte) -54);
        ph.a(var2, vi.b(0), (byte) 51);
        if (param0 <= 99) {
          this.a(-59, true);
        }
    }

    final void g(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = Bounce.field_N;
        if (hi.a((byte) -113)) {
          discarded$1 = this.a(false, false, sj.field_f != null ? true : false);
        } else {
          if (sa.field_k < 10) {
          } else {
            if (!tk.c(param0 ^ 250)) {
              ij.a((byte) -105);
            } else {
              if (0 != mh.field_U) {
                qe.a((byte) -76, va.field_a);
              } else {
                discarded$2 = this.a(false, false, false);
              }
            }
          }
        }
        if (param0 != 0) {
          this.h(68);
        }
    }

    protected kk() {
    }

    static {
        field_n = new bc();
        field_w = "No highscores";
        field_t = "This password is part of your Player Name, and would be easy to guess";
        field_s = 9;
    }
}
