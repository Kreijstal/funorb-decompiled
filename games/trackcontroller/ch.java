/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ch extends re {
    private int field_A;
    private long field_w;
    String field_t;
    private int field_q;
    static byte[][] field_z;
    private int field_u;
    static wb field_n;
    static volatile int field_x;
    private boolean field_r;
    private boolean field_v;
    private boolean field_s;
    private int field_p;
    private int field_B;
    static int[] field_y;
    private int field_o;

    final void e(byte param0) {
        boolean stackIn_29_0 = false;
        int var2;
        int var3;
        q var4;
        int var5;
        var5 = TrackController.field_F ? 1 : 0;
        var2 = uk.field_c;
        if (var2 < 64 &&
          kb.field_f[var2]) {
          var3 = 110 / ((param0 + 31) / 51);
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            rd.a(1);
          } else {
            if (var2 == 2) {
              pl.b(-3570);
            } else {
              if (var2 != 3) {
                if (var2 != 4) {
                  if (var2 == 5) {
                    cb.b((byte) -107);
                  } else {
                    if (6 == var2) {
                      gk.a((byte) -126);
                    } else {
                      if (var2 == 7) {
                        this.i(3);
                      } else {
                        if (8 != var2) {
                          if (var2 == 16) {
                            bk.j(0);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                hh.b(128);
                                return;
                              }
                              if (var2 == 17) {
                                this.k(-6);
                                return;
                              }
                              if (var2 == 18) {
                                og.f((byte) -83);
                                return;
                              }
                              hb.a((Throwable) null, 0, "MGS1: " + jc.b(100));
                              lj.a((byte) 119);
                              return;
                            }
                            stackIn_29_0 = (var2 == 12);
                            var4 = pj.a(stackIn_29_0, 21552);
                            qg.a(var4, true);
                          }
                        } else {
                          bl.a(0, hd.field_o, rg.field_c, ne.field_a);
                        }
                      }
                    }
                  }
                } else {
                  mf.a((byte) -53);
                }
              } else {
                kc.b(-107);
              }
            }
          }
          return;
        }
        hb.a((Throwable) null, 0, "MGS2: " + jc.b(90));
        lj.a((byte) 123);
    }

    private final void p(int param0) {
        if (param0 < 110) {
          this.field_p = 94;
        }
        kb.field_f[1] = true;
    }

    private final void a(boolean param0, int param1) {
        kb.field_f[3] = true;
        kb.field_f[param1] = true;
        kb.field_f[8] = param0;
        kb.field_f[7] = true;
        kb.field_f[0] = true;
        kb.field_f[17] = true;
        kb.field_f[16] = true;
    }

    private final void f(byte param0) {
        kb.field_f[2] = true;
        if (param0 >= -52) {
          this.a(111, true, true, true, true);
        }
    }

    final void a(byte param0, String param1, int param2) {
        try {
          this.a(480, param2, 640, 16813, param1);
          if (param0 >= -64) {
            ch.n(-86);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ch.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int d(byte param0) {
        int var2;
        if (param0 < 81) {
          this.field_q = 70;
        }
        var2 = this.j(-80);
        if (var2 == 0 ||
          1 == var2) {
          if (kb.field_f[1]) {
            ke.a(-101, 2);
          }
          if (kb.field_f[2]) {
            rf.a(3, 0);
          }
          if (kb.field_f[3]) {
            l.a(-30422, 4);
          }
          if (kb.field_f[4]) {
            pa.a(5, (byte) 40);
          }
          if (kb.field_f[5]) {
            gb.a(4, 6);
          }
          if (kb.field_f[6]) {
            cl.a(7, 7);
          }
          if (kb.field_f[8]) {
            vb.a(-114);
          }
        }
        return var2;
    }

    private final void k(int param0) {
        int var2 = ne.field_a.h(16383);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        if (param0 != -6) {
          this.b(true, 26);
        }
        int var4 = hd.field_o - 1;
        byte[] var5 = new byte[var4];
        ne.field_a.a(var4, false, 0, var5);
        ib.a(var3 != 0, ta.a(32200, var5), gd.b((byte) 77), (byte) -25);
    }

    final void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, param0 ^ -19);
        if (param0 != -1) {
          this.field_q = 52;
        }
        if (param2) {
          this.p(113);
        }
        if (param1) {
          this.f((byte) -86);
        }
        if (param4) {
          this.g((byte) -111);
        }
        if (param3) {
          this.h((byte) 100);
        }
    }

    private final void o(int param0) {
        if (param0 == -9165) {
          kg.field_b[6] = -2;
          kg.field_b[12] = -1;
          kg.field_b[10] = -1;
          kg.field_b[16] = -1;
          kg.field_b[2] = -2;
          kg.field_b[7] = -1;
          kg.field_b[9] = -1;
          kg.field_b[17] = -1;
          kg.field_b[4] = -1;
          kg.field_b[5] = -1;
          kg.field_b[18] = 1;
          kg.field_b[11] = -1;
          kg.field_b[3] = -1;
          kg.field_b[8] = -2;
          kg.field_b[13] = -1;
          kg.field_b[1] = 16;
          return;
        }
    }

    private final void i(int param0) {
        String var2 = aj.a((byte) 107);
        kc.a(gd.b((byte) 77), 1263, var2);
        if (param0 != 3) {
          this.a(false, -56, 125, -69, 16, (byte) -87, 69, 98);
        }
    }

    final void l(int param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        boolean stackIn_11_1 = false;
        boolean stackIn_11_2 = false;
        Object stackIn_12_0;
        boolean stackIn_12_3;
        int var3;
        var3 = TrackController.field_F ? 1 : 0;
        if (param0 >= -90) {
          return;
        }
        if (ic.a(1)) {
          stackIn_11_1 = true;
          stackIn_11_2 = false;
          if (og.field_rb == null) {
            stackIn_12_0 = this;
            stackIn_12_3 = false;
          } else {
            stackIn_12_0 = this;
            stackIn_12_3 = true;
          }
          discarded$0 = this.a(stackIn_11_1, stackIn_11_2, stackIn_12_3);
        } else {
          if (gl.field_I >= 10) {
            if (!ic.a(false)) {
              kj.d(250);
            } else {
              if (0 == rl.field_N) {
                discarded$1 = this.a(true, false, false);
              } else {
                od.a((byte) -105, ee.field_c);
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        boolean stackIn_9_1 = false;
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
            if (!this.a((byte) 60)) {
              return;
            }
            if (param3 != 16813) {
              this.field_q = -89;
            }
            this.field_t = this.getCodeBase().getHost();
            var6 = this.field_t.toLowerCase();
            stackIn_9_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_v = stackIn_9_1;
            this.field_u = Integer.parseInt(this.getParameter("gameport1"));
            this.field_p = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_o = Integer.parseInt(var7);
            }
            this.field_q = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_w = Long.parseLong(this.getParameter("instanceid"));
            this.field_r = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_A = Integer.parseInt(var8);
            }
            if (this.field_A >= 5) {
              this.field_A = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_B = Integer.parseInt(var9);
            }
            jb.field_a = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(32, param1, this.field_q, param4, param2, param0, param3 ^ 16807);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            hb.a((Throwable) ((Object) var6_ref), param3 ^ 16813, (String) null);
            this.a("crash", (byte) 100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6_ref2;
          stackIn_25_1 = new StringBuilder().append("ch.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int b(boolean param0, int param1) {
        if (param1 < 78) {
          this.field_r = false;
        }
        return this.a(true, true, param0);
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
          boolean stackIn_7_0 = false;
          int stackIn_16_0 = 0;
          boolean stackIn_16_1 = false;
          boolean stackIn_17_2 = false;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          be var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = TrackController.field_F ? 1 : 0;
          var4 = lf.a(hl.field_F, ee.field_c, (byte) 95, param2);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            stackIn_7_0 = !param0;
            var5_int = ta.a(ab.a(stackIn_7_0), (byte) -49, th.f(93));
            if (var5_int != -1) {
              ed.a(ca.field_a, var5_int, fi.field_t, (byte) 105);
              fi.field_t = null;
              ca.field_a = null;
            }
            var11 = el.j(2);
            if (var11 != null) {
              ld.a(var11.booleanValue(), true);
            }
          }
          if (var4 == 2) {
            stackIn_16_0 = this.field_B;
            stackIn_16_1 = sf.j(-4409);
            stackIn_17_2 = (param0) ? false : true;
            var5_intLifetime1 = ba.a(stackIn_16_0, stackIn_16_1, qk.b(stackIn_17_2), re.c(6), l.h(0), gj.a((byte) -119), 0);
            if (var5_intLifetime1 != -1) {
              gl.a(fi.field_t, ca.field_a, var5_intLifetime1, (byte) 113);
              fi.field_t = null;
              ca.field_a = null;
            }
          }
          if (var4 == 3) {
            if (-1 != gj.field_c &&
              gj.field_c != 0) {
              gj.field_c = -1;
              jb.a(true);
            }
            if (!param1) {
              var5_intLifetime2 = da.a(this.field_v, false, l.h(0), qk.b(false), 113, this.field_B);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  af.a(-114, var5_intLifetime2, fi.field_t);
                  fi.field_t = null;
                } else {
                  fi.field_p = nl.field_e;
                  ri.e(-45);
                  rl.field_N = 10;
                  ge.field_D = false;
                }
              }
            } else {
              li.field_i = false;
            }
          }
          if (var4 == 4) {
            if (oc.field_i) {
              we.a(0, gd.b((byte) 77));
            } else {
              ge.field_D = true;
              rl.field_N = 10;
            }
          }
          if (5 == var4) {
            af.a(gd.b((byte) 77), (byte) -9);
          }
          if (var4 == 6 &&
            bc.field_d) {
            rl.field_N = 10;
          }
          if (var4 == 7) {
            qh.a(!param0, gd.b((byte) 77));
          }
          if (var4 == 8) {
            we.a(0, gd.b((byte) 77));
          }
          if (var4 == 9) {
            ma.a(-9969, gd.b((byte) 77));
          }
          if (var4 == 10) {
            ra.field_C.c(17, 7);
          }
          if (var4 == 11) {
            q.a(gd.b((byte) 77), -1);
          }
          if (var4 == 12) {
            gk.a(vk.b(true), gd.b((byte) 77), -104);
          }
          if (13 == var4) {
            try {
              if (null == he.field_c) {
                he.field_c = new ej(rg.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (he.field_c.a((byte) 77)) {
                var12 = he.field_c.a(-5);
                if (var12 == null) {
                  var9 = (String) null;
                  kd.a((String) null, (byte) 110);
                } else {
                  var7 = ka.a(0, -129, var12.field_j, var12.field_k);
                  kd.a(var7, (byte) 92);
                }
                he.field_c = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              hb.a((Throwable) ((Object) var5), 0, "S1");
              var10 = (String) null;
              kd.a((String) null, (byte) 42);
              he.field_c = null;
            }
          }
          if (!param0) {
            this.e((byte) -20);
          }
          if (var4 == 15) {
            rl.field_N = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (17 == var4) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int j(int param0) {
        int var2;
        int var3;
        if (this.field_e) {
          return -1;
        }
        if (!fc.c(96)) {
          return -1;
        }
        if (li.field_i) {
          return -1;
        }
        var2 = da.a(this.field_v, true, l.h(0), qk.b(false), 78, this.field_B);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          1 != var2) {
          if (!ka.field_a) {
            this.a("reconnect", (byte) 100);
          }
          var3 = 8 % ((param0 + 14) / 33);
          hh.a(-28717);
          af.a(-100, var2, fi.field_t);
          li.field_i = true;
          rk.field_eb = qg.a(false) + 15000L;
          return var2;
        }
        if (rl.field_N != 11) {
          return var2;
        }
        if (gj.field_c != 0) {
          return var2;
        }
        ri.e(-128);
        return var2;
    }

    final static void m(int param0) {
        vg var1 = (vg) (cj.field_j.c((byte) -82));
        if (var1 != null) {
          int var2 = -73 % ((-24 - param0) / 38);
          ll.a(var1.field_l, var1.field_j, var1.field_n);
          ll.e(var1.field_q, var1.field_m, var1.field_k, var1.field_i);
          var1.field_l = null;
          gd.field_q.a((byte) -111, var1);
          return;
        }
        throw new IllegalStateException();
    }

    final void a(byte param0, boolean param1) {
        int stackIn_24_0 = 0;
        String stackIn_100_0 = null;
        boolean stackIn_101_1 = false;
        boolean stackIn_104_2 = false;
        int stackIn_135_0 = 0;
        int var3;
        java.awt.Container var4_ref_java_awt_Container;
        int var4;
        java.awt.Dimension var5;
        int var6;
        int var4Lifetime1;
        int var4Lifetime2;
        var6 = TrackController.field_F ? 1 : 0;
        var3 = 110 % ((param0 + 46) / 32);
        if (tk.field_u != null) {
          if (og.field_rb == null) {
            var4_ref_java_awt_Container = be.c((byte) -128);
            var5 = var4_ref_java_awt_Container.getSize();
            tk.field_u.a(0, var5.width, var5.height);
          }
          tk.field_u.b(true);
        }
        ob.h(16473);
        of.c((byte) 66);
        if (!ga.a(-107) &&
          rl.field_N != 11) {
          vd.k(123);
        }
        if (null != rd.field_l) {
          ee.field_c = rd.field_l.a(86);
        }
        if (gh.a(3100)) {
          var4 = il.c(-14496) * 1200;
          if (this.field_s ||
            !(mg.a((byte) -29) <= var4) &&
            !(uk.a(0) <= var4)) {
            this.field_s = false;
            lj.a((byte) 112);
            hh.a(-28717);
            af.a(-93, 2, oc.field_k);
            dk.a(9888);
            li.field_i = true;
            rk.field_eb = 15000L + qg.a(false);
          }
        }
        if (-1 == gj.field_c ||
          0 == gj.field_c) {
          stackIn_24_0 = (-1 != gj.field_c) ? 0 : 1;
          var4Lifetime1 = stackIn_24_0;
          gj.field_c = nl.b((byte) 104);
          if (var4Lifetime1 != 0 &&
            gj.field_c == 0 &&
            rl.field_N == 11 &&
            !fc.c(76)) {
            ri.e(-96);
          }
          if (gj.field_c != -1 &&
            gj.field_c != 0) {
            rk.field_eb = 15000L + qg.a(false);
          }
        }
        if (gj.field_c != -1 &&
          gj.field_c != 0) {
          if (gl.field_I >= 10) {
            if (rl.field_N >= 10) {
              hh.a(-28717);
              if (gj.field_c != 3) {
                if (gj.field_c != 4) {
                  if (2 != gj.field_c) {
                    if (gj.field_c != 5) {
                      af.a(-107, 256, el.field_J);
                    } else {
                      af.a(-91, 5, ak.field_a);
                    }
                  } else {
                    af.a(-71, 256, wd.field_I);
                  }
                } else {
                  af.a(-76, 256, qc.field_f);
                }
              } else {
                af.a(-80, 256, bk.field_G);
              }
              li.field_i = true;
            }
          } else {
            if (3 != gj.field_c) {
              if (gj.field_c == 4) {
                this.a("js5io", (byte) 100);
              } else {
                if (2 != gj.field_c) {
                  if (5 == gj.field_c) {
                    this.a("outofdate", (byte) 100);
                  } else {
                    this.a("js5connect", (byte) 100);
                  }
                } else {
                  this.a("js5connect_full", (byte) 100);
                }
              }
            } else {
              this.a("js5crc", (byte) 100);
            }
          }
        }
        if ((gj.field_c != -1 &&
          0 != gj.field_c ||
          fc.c(124)) &&
          rk.field_eb <= qg.a(false)) {
          li.field_i = false;
          if (-1 != gj.field_c &&
            gj.field_c != 0) {
            gj.field_c = -1;
            jb.a(true);
          }
        }
        if (gj.field_c == 0 &&
          !fc.c(38)) {
          qh.field_i = false;
        }
        if (gl.field_I == 0 &&
          dd.c((byte) 55)) {
          gl.field_I = 1;
        }
        if (gl.field_I == 1) {
          if (hl.field_F != 0) {
            ff.field_b = mf.a(tf.field_a, (byte) -70);
          }
          ei.field_i = vh.a(cg.field_c, 98, false, 1, true);
          ha.field_x = vh.a(rf.field_b, 98, false, 1, true);
          ok.field_G = vh.a(fk.field_b, 98, false, 1, true);
          fb.field_b = ha.field_x;
          el.field_L = ei.field_i;
          gl.field_I = 2;
        }
        if (gl.field_I == 2) {
          if (null != ff.field_b &&
            ff.field_b.c(-25)) {
            if (ff.field_b.a("", (byte) -125)) {
              if (ff.field_b.b("", (byte) -3)) {
                sf.a((byte) -114, ff.field_b);
                ff.field_b = null;
                qi.d(83);
              }
            } else {
              ff.field_b = null;
            }
          }
          if (ff.field_b == null) {
            gl.field_I = 3;
          }
        }
        if (gl.field_I == 3 &&
          l.a(ei.field_i, ha.field_x, (byte) -112, ok.field_G) &&
          rc.a(-25, ok.field_G)) {
          nj.b((byte) -98);
          sl.b((byte) -51);
          qi.field_k = gj.field_a;
          bc.field_d = false;
          oe.a(oc.field_i, ei.field_i, ha.field_x, ok.field_G, -28484);
          if (dg.field_B ||
            null != sk.field_h) {
            stackIn_100_0 = sk.field_h;
            stackIn_101_1 = !(dg.field_B);
            stackIn_104_2 = !(dg.field_B);
            jb.a(stackIn_100_0, stackIn_101_1, stackIn_104_2, 0);
          }
          if (jb.field_a) {
            kf.a(4);
          }
          if (null == ni.field_n) {
            ni.field_n = wd.q(11782);
            uh.field_e = r.e(-12364);
          }
          ok.a(ni.field_n, uh.field_e, (byte) 52, ok.field_G);
          ok.field_G = null;
          ha.field_x = null;
          ei.field_i = null;
          rh.a((java.applet.Applet) (this), (byte) 33);
          qi.d(-80);
          gl.field_I = 10;
        }
        if (10 == gl.field_I) {
          if (hl.field_F != 0) {
            ed.field_I = mf.a(rj.field_b, (byte) -74);
          }
          gl.field_I = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (gl.field_I == 11) {
          if (null != ed.field_I && (!ed.field_I.c(-47) ||
            !ed.field_I.a((byte) 48))) {
            ud.a(128, 0.0f, ug.a(pc.field_t, ed.field_I, 2147483647, jb.field_c));
            decompiledFrameRemainder0 = false;
          }
          else {
            ag.field_e = true;
            gl.field_I = 12;
          }
        }
        if (gl.field_I == 12 &&
          !ag.field_e) {
          gl.field_I = 13;
        }
        if (13 == gl.field_I) {
          var4Lifetime2 = 1;
          if (wj.field_b != null) {
            stackIn_135_0 = (!wj.field_b.a(true)) ? 0 : 1;
            var4Lifetime2 = stackIn_135_0;
            ud.a(128, wj.field_b.field_i, wj.field_b.field_a);
          }
          if (var4Lifetime2 != 0) {
            gl.field_I = 20;
          }
        }
        if (!param1 &&
          mj.field_c) {
          r.a(-32652, ki.field_f);
          this.f(-80);
          te.a(true, ki.field_f);
        }
        if (kb.field_f[8]) {
          q.a(true);
        }
    }

    private final void g(byte param0) {
        kb.field_f[4] = true;
        int var2 = 37 % ((-49 - param0) / 56);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        hl.field_F = this.field_A;
        ld.a(hl.field_F, (byte) -29);
        if (param5 != 3) {
          this.field_u = 81;
        }
        uj.a(this.field_t, this.field_w, this.field_p, param3, 5000, this.field_o, this.field_u, 5000, true, rg.field_c, param0, hl.field_F, this.field_q, this.field_r);
        wj.a(this.field_u, rg.field_c, hl.field_F, this.field_q, this.field_t, this.field_o, param3, 101, this.field_p);
        kf.a(false);
        rd.field_l = lg.a(124);
        te.a(true, ki.field_f);
        rf.field_b = param4;
        cg.field_c = param1;
        fk.field_b = param6;
        rj.field_b = param2;
        tf.field_a = param7;
        this.o(param5 - 9168);
        th.d(-31574);
    }

    public static void n(int param0) {
        field_n = null;
        if (param0 != -8511) {
          ch.m(-32);
        }
        field_z = (byte[][]) null;
        field_y = null;
    }

    private final void h(byte param0) {
        kb.field_f[5] = true;
        if (param0 < 94) {
          this.field_t = (String) null;
        }
    }

    protected ch() {
    }

    static {
        field_x = 0;
        field_z = new byte[250][];
        field_y = new int[8192];
    }
}
