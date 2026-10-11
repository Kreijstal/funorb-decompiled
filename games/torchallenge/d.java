/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class d extends ug {
    private int field_D;
    private boolean field_A;
    static int[] field_y;
    static String field_z;
    private int field_v;
    static String field_r;
    private boolean field_t;
    private int field_C;
    String field_w;
    private int field_s;
    private long field_q;
    private int field_x;
    private boolean field_B;
    private int field_u;

    private final void a(boolean param0) {
        ki.field_a[1] = param0;
    }

    final static boolean p(int param0) {
        if (param0 >= -64) {
          field_z = (String) null;
        }
        return lj.field_q;
    }

    private final void m(int param0) {
        qc.field_h[8] = -2;
        qc.field_h[16] = -1;
        qc.field_h[17] = -1;
        qc.field_h[5] = -1;
        qc.field_h[9] = -1;
        qc.field_h[13] = -1;
        qc.field_h[11] = -1;
        qc.field_h[18] = 1;
        qc.field_h[7] = -1;
        qc.field_h[2] = -2;
        qc.field_h[4] = -1;
        qc.field_h[1] = 16;
        qc.field_h[3] = -1;
        qc.field_h[10] = -1;
        if (param0 != 256) {
          this.i(-16);
        }
        qc.field_h[6] = -2;
        qc.field_h[12] = -1;
    }

    public static void h(int param0) {
        if (param0 <= 90) {
          d.p(-54);
        }
        field_y = null;
        field_r = null;
        field_z = null;
    }

    final void b(int param0, boolean param1) {
        int stackIn_23_0 = 0;
        boolean stackIn_102_0 = false;
        int stackIn_104_1 = 0;
        boolean stackIn_105_2 = false;
        int stackIn_136_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (null != tf.field_h) {
          if (null == gi.field_d) {
            var6 = ak.b(4);
            var4 = var6.getSize();
            tf.field_h.a(var4.width, 122, var4.height);
          }
          tf.field_h.a(2);
        }
        te.a(-11);
        cb.a(30210);
        if (!hc.c((byte) 99) &&
          11 != gj.field_c) {
          ak.a(false);
        }
        if (ef.field_l != null) {
          bl.field_X = ef.field_l.a((byte) 29);
        }
        if (hf.a(4)) {
          var3 = ol.b(-118) * 1200;
          if (this.field_t ||
            !(pg.e(-35) <= var3) &&
            !(ll.b(-10365) <= var3)) {
            this.field_t = false;
            ob.b(-126);
            kc.f(10);
            te.a(-1, 2, wh.field_a);
            ug.a(-13);
            dj.field_Z = true;
            ji.field_y = 15000L + ol.a(256);
          }
        }
        if (ah.field_b == -1 ||
          ah.field_b == 0) {
          stackIn_23_0 = (-1 != ah.field_b) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          ah.field_b = bd.e(0);
          if (var3Lifetime1 != 0 &&
            ah.field_b == 0 &&
            gj.field_c == 11 &&
            !nb.a(-26375)) {
            mc.a(112);
          }
          if (-1 != ah.field_b &&
            ah.field_b != 0) {
            ji.field_y = 15000L + ol.a(256);
          }
        }
        if (-1 != ah.field_b &&
          ah.field_b != 0) {
          if (li.field_K < 10) {
            if (3 == ah.field_b) {
              this.a((byte) -105, "js5crc");
            } else {
              if (ah.field_b != 4) {
                if (ah.field_b != 2) {
                  if (ah.field_b != 5) {
                    this.a((byte) -99, "js5connect");
                  } else {
                    this.a((byte) -126, "outofdate");
                  }
                } else {
                  this.a((byte) -108, "js5connect_full");
                }
              } else {
                this.a((byte) -111, "js5io");
              }
            }
          } else {
            if (gj.field_c >= 10) {
              kc.f(10);
              if (ah.field_b != 3) {
                if (ah.field_b == 4) {
                  te.a(-1, 256, uc.field_R);
                } else {
                  if (2 == ah.field_b) {
                    te.a(-1, 256, vi.field_b);
                  } else {
                    if (ah.field_b != 5) {
                      te.a(-1, 256, bk.field_r);
                    } else {
                      te.a(-1, 5, qa.field_d);
                    }
                  }
                }
              } else {
                te.a(-1, 256, ei.field_y);
              }
              dj.field_Z = true;
            }
          }
        }
        if ((ah.field_b != -1 &&
          ah.field_b != 0 ||
          nb.a(-26375)) &&
          ji.field_y <= ol.a(256)) {
          dj.field_Z = false;
          if (ah.field_b != -1 &&
            ah.field_b != 0) {
            ah.field_b = -1;
            ac.a(-113);
          }
        }
        if (ah.field_b == 0 &&
          !nb.a(-26375)) {
          hk.field_d = false;
        }
        if (li.field_K == 0 &&
          ul.a(-1)) {
          li.field_K = 1;
        }
        if (1 == li.field_K) {
          if (kf.field_b != 0) {
            rj.field_f = pe.b(rj.field_c, -1);
          }
          sl.field_a = fc.a(false, 1, 88, a.field_a, true);
          gf.field_p = fc.a(false, 1, -116, qh.field_P, true);
          jl.field_b = fc.a(false, 1, -20, gh.field_w, true);
          aj.field_f = sl.field_a;
          ad.field_g = gf.field_p;
          li.field_K = 2;
        }
        if (li.field_K == 2) {
          if (rj.field_f != null &&
            rj.field_f.b(-7957)) {
            if (rj.field_f.a((byte) -39, "")) {
              if (rj.field_f.b(5, "")) {
                oj.a(-3798, rj.field_f);
                rj.field_f = null;
                id.a(104);
              }
            } else {
              rj.field_f = null;
            }
          }
          if (rj.field_f == null) {
            li.field_K = 3;
          }
        }
        if (li.field_K == 3 &&
          pl.a(gf.field_p, jl.field_b, (byte) -100, sl.field_a) &&
          de.a(30, jl.field_b)) {
          ch.a(76);
          sa.a(0);
          sa.field_b = wb.field_m;
          fh.field_g = false;
          rf.a(sl.field_a, (byte) -23, fg.field_S, jl.field_b, gf.field_p);
          if (qc.field_j ||
            qe.field_bb != null) {
            stackIn_102_0 = !(qc.field_j);
            stackIn_104_1 = -24;
            stackIn_105_2 = !(qc.field_j);
            v.$cfr$intArgs$a$b1efba5c64a3(stackIn_102_0, stackIn_104_1, stackIn_105_2, qe.field_bb);
          }
          if (cd.field_h) {
            hf.a((byte) -116);
          }
          if (null == o.field_k) {
            o.field_k = sl.b(-944);
            ja.field_a = gb.b(38);
          }
          v.a((byte) 127, o.field_k, ja.field_a, jl.field_b);
          jl.field_b = null;
          gf.field_p = null;
          sl.field_a = null;
          ca.a((java.applet.Applet) (this), -109);
          id.a(127);
          li.field_K = 10;
        }
        if (li.field_K == 10) {
          if (kf.field_b != 0) {
            jd.field_e = pe.b(kk.field_j, -1);
          }
          li.field_K = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (li.field_K == 11) {
          if (jd.field_e != null && (!jd.field_e.b(-7957) ||
            !jd.field_e.b((byte) 79))) {
            mh.a(tk.a(ol.field_f, jd.field_e, sd.field_g, 256), (byte) -125, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            li.field_K = 12;
            tc.field_k = true;
          }
        }
        if (12 == li.field_K &&
          !tc.field_k) {
          li.field_K = 13;
        }
        if (li.field_K == 13) {
          var3Lifetime2 = 1;
          if (wc.field_h != null) {
            stackIn_136_0 = (!wc.field_h.a(0)) ? 0 : 1;
            var3Lifetime2 = stackIn_136_0;
            mh.a(wc.field_h.field_c, (byte) -125, wc.field_h.field_d);
          }
          if (var3Lifetime2 != 0) {
            li.field_K = 20;
          }
        }
        if (!param1 &&
          sa.field_c) {
          rk.a((byte) -104, bg.field_P);
          this.e(-72);
          lk.a(bg.field_P, false);
        }
        if (ki.field_a[8]) {
          ma.e(102);
        }
        if (param0 >= -74) {
          this.field_v = -55;
        }
    }

    private final void g(byte param0) {
        ki.field_a[4] = true;
        if (param0 != 87) {
          this.j(-128);
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.c(32457, param4);
        if (param1) {
          this.a(!param4 ? true : false);
        }
        if (param3) {
          this.n(-95);
        }
        if (param2) {
          this.g((byte) 87);
        }
        if (param0) {
          this.f((byte) -115);
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final void j(int param0) {
        boolean stackIn_33_0 = false;
        int var2;
        bf var3;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        var2 = cb.field_g;
        if (param0 != 5000) {
          return;
        }
        if (64 > var2 &&
          ki.field_a[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            lh.f(108);
          } else {
            if (2 == var2) {
              hc.d((byte) -117);
            } else {
              if (var2 == 3) {
                la.a((byte) -64);
              } else {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 == 7) {
                        this.o(17);
                      } else {
                        if (var2 != 8) {
                          if (var2 != 16) {
                            if (11 != var2 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                rc.d(param0 ^ 5116);
                                return;
                              }
                              if (var2 == 17) {
                                this.k(param0 ^ -15709);
                                return;
                              }
                              if (var2 == 18) {
                                ba.b((byte) -44);
                                return;
                              }
                              td.a("MGS1: " + ck.a(-13299), (Throwable) null, (byte) -52);
                              ob.b(param0 - 5101);
                              return;
                            }
                            stackIn_33_0 = (var2 == 12);
                            var3 = oa.a(stackIn_33_0, true);
                            kf.a(param0 ^ 5001, var3);
                          } else {
                            pi.a((byte) 7);
                          }
                        } else {
                          bg.a(bb.field_i, (byte) 121, sh.field_u, id.field_b);
                        }
                      }
                    } else {
                      aj.c(5427);
                    }
                  } else {
                    db.i(-123);
                  }
                } else {
                  wj.b(260);
                }
              }
            }
          }
          return;
        }
        td.a("MGS2: " + ck.a(-13299), (Throwable) null, (byte) -98);
        ob.b(-111);
    }

    final int a(boolean param0, int param1) {
        if (param1 <= 114) {
          this.f((byte) -102);
        }
        return this.a(true, (byte) -42, param0);
    }

    private final void c(int param0, boolean param1) {
        ki.field_a[7] = true;
        ki.field_a[3] = true;
        ki.field_a[8] = param1;
        ki.field_a[17] = true;
        ki.field_a[0] = true;
        ki.field_a[16] = true;
        if (param0 != 32457) {
          this.n(-9);
        }
        ki.field_a[18] = true;
    }

    final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        kf.field_b = this.field_v;
        rd.a(kf.field_b, (byte) 121);
        rj.a(this.field_u, 5000, this.field_B, this.field_C, param4, 5000, this.field_D, this.field_x, this.field_w, kf.field_b, this.field_q, param0, param7, sh.field_u);
        hd.a(7, this.field_w, this.field_D, this.field_u, this.field_C, kf.field_b, this.field_x, param7, sh.field_u);
        kk.e(-79);
        ef.field_l = dj.c((byte) 96);
        lk.a(bg.field_P, param0);
        kk.field_j = param3;
        gh.field_w = param1;
        rj.field_c = param5;
        a.field_a = param6;
        qh.field_P = param2;
        this.m(256);
        ja.a((byte) 123);
    }

    final void a(byte param0, int param1, String param2) {
        try {
          this.a(param2, (byte) -125, 480, 640, param1);
          if (param0 != 58) {
            this.field_s = 28;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "d.HA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final int l(int param0) {
        if (this.field_g) {
          return -1;
        }
        if (!nb.a(-26375)) {
          return -1;
        }
        if (dj.field_Z) {
          return -1;
        }
        int var2 = uf.a(this.field_A, true, this.field_s, a.a((byte) 127), si.h(param0 ^ -7321), false);
        if (-1 == var2) {
          return -1;
        }
        if (0 == var2 ||
          var2 == 1) {
          if (gj.field_c == 11 &&
            0 == ah.field_b) {
            mc.a(122);
          }
          return var2;
        }
        if (!ll.field_i) {
          this.a((byte) -108, "reconnect");
        }
        kc.f(10);
        te.a(-1, var2, ag.field_c);
        if (param0 == -7407) {
          dj.field_Z = true;
          ji.field_y = 15000L + ol.a(256);
          return var2;
        }
        return 79;
    }

    private final void k(int param0) {
        int var2 = id.field_b.j(param0 ^ 11943);
        if (param0 != -11989) {
          field_y = (int[]) null;
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + bb.field_i;
        byte[] var5 = new byte[var4];
        id.field_b.a(-25038, var4, 0, var5);
        u.a(gi.b(12476), var3 != 0, -127, re.a(18990, var5));
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
          Boolean var10 = null;
          uf var11 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = TorChallenge.field_F ? 1 : 0;
          var4 = rc.a(kf.field_b, -2, param2, bl.field_X);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = ic.a(kc.g(2), be.a(true), (byte) -47);
            if (-1 != var5_int) {
              m.a(var5_int, ag.field_c, false, ra.field_d);
              ra.field_d = null;
              ag.field_c = null;
            }
            var10 = al.d((byte) -48);
            if (var10 != null) {
              be.a(var10.booleanValue(), (byte) 86);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = TorChallenge.a(il.f(-24044), hd.b((byte) 83), -20031, this.field_s, si.h(127), a.a((byte) 126), vd.c(0));
            if (var5_intLifetime1 != -1) {
              hl.a(0, var5_intLifetime1, ra.field_d, ag.field_c);
              ag.field_c = null;
              ra.field_d = null;
            }
          }
          if (3 == var4) {
            if (ah.field_b != -1 &&
              ah.field_b != 0) {
              ah.field_b = -1;
              ac.a(-122);
            }
            if (!param0) {
              var5_intLifetime2 = uf.a(this.field_A, false, this.field_s, a.a((byte) 126), si.h(122), false);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  te.a(-1, var5_intLifetime2, ag.field_c);
                  ag.field_c = null;
                } else {
                  je.field_a = ed.field_j;
                  mc.a(111);
                  gj.field_c = 10;
                  lj.field_q = false;
                }
              }
            } else {
              dj.field_Z = false;
            }
          }
          if (var4 == 4) {
            if (fg.field_S) {
              pl.a((byte) 119, gi.b(12476));
            } else {
              lj.field_q = true;
              gj.field_c = 10;
            }
          }
          if (var4 == 5) {
            ef.a((byte) -93, gi.b(param1 ^ -12438));
          }
          if (var4 == 6 &&
            fh.field_g) {
            gj.field_c = 10;
          }
          if (param1 != -42) {
            this.i(123);
          }
          if (var4 == 7) {
            hd.a(gi.b(12476), 101);
          }
          if (var4 == 8) {
            pl.a((byte) 126, gi.b(12476));
          }
          if (var4 == 9) {
            gl.a(gi.b(12476), 17);
          }
          if (var4 == 10) {
            dk.field_s.d(25, 17);
          }
          if (11 == var4) {
            ek.a((byte) 56, gi.b(12476));
          }
          if (var4 == 12) {
            ob.a(t.d(84), gi.b(12476), (byte) 43);
          }
          if (var4 == 13) {
            try {
              if (tc.field_o == null) {
                tc.field_o = new we(sh.field_u, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (tc.field_o.a(true)) {
                var11 = tc.field_o.b(120);
                if (var11 == null) {
                  ti.a((String) null, param1 - 84);
                } else {
                  var7 = r.a(var11.field_q, 0, var11.field_m, (byte) 8);
                  ti.a(var7, -122);
                }
                tc.field_o = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              td.a("S1", (Throwable) ((Object) var5), (byte) -63);
              var9 = (String) null;
              ti.a((String) null, -94);
              tc.field_o = null;
            }
          }
          if (var4 == 15) {
            gj.field_c = 10;
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

    private final void f(byte param0) {
        ki.field_a[5] = true;
        if (param0 > -109) {
          this.b(-122, true);
        }
    }

    private final void a(String param0, byte param1, int param2, int param3, int param4) {
        boolean stackIn_8_1 = false;
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
            if (!this.c((byte) 124)) {
              return;
            }
            this.field_w = this.getCodeBase().getHost();
            var6 = this.field_w.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_A = stackIn_8_1;
            this.field_C = Integer.parseInt(this.getParameter("gameport1"));
            this.field_D = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_x = Integer.parseInt(var7);
            }
            this.field_u = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_q = Long.parseLong(this.getParameter("instanceid"));
            this.field_B = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_v = Integer.parseInt(var8);
            }
            if (this.field_v >= 5) {
              this.field_v = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_s = Integer.parseInt(var9);
            }
            cd.field_h = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            if (param1 > -87) {
              this.a(true, 43);
            }
            this.a(param2, param0, 25, param3, 32, this.field_u, param4);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            td.a((String) null, (Throwable) ((Object) var6_ref), (byte) -52);
            this.a((byte) -122, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("d.PA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void i(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3;
        boolean stackIn_9_1 = false;
        int stackIn_9_2 = 0;
        Object stackIn_10_0;
        boolean stackIn_10_3;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (ih.f((byte) -123)) {
          stackIn_9_1 = false;
          stackIn_9_2 = -42;
          if (gi.field_d == null) {
            stackIn_10_0 = this;
            stackIn_10_3 = false;
          } else {
            stackIn_10_0 = this;
            stackIn_10_3 = true;
          }
          discarded$1 = this.a(stackIn_9_1, (byte) stackIn_9_2, stackIn_10_3);
        } else {
          if (li.field_K >= 10) {
            if (!eh.a(50)) {
              t.c(3870);
            } else {
              if (0 == gj.field_c) {
                discarded$2 = this.a(false, (byte) -42, false);
              } else {
                mc.a(bl.field_X, -65);
              }
            }
          }
        }
        if (param0 <= 54) {
          this.field_v = 10;
        }
    }

    private final void o(int param0) {
        if (param0 != 17) {
          return;
        }
        String var2 = bb.a(6);
        pa.a(var2, 8, gi.b(param0 ^ 12461));
    }

    private final void n(int param0) {
        ki.field_a[2] = true;
        if (param0 >= -80) {
          this.field_B = false;
        }
    }

    final int e(byte param0) {
        if (param0 != 110) {
          this.e((byte) 66);
        }
        int var2 = this.l(-7407);
        if (var2 == 0 ||
          var2 == 1) {
          if (ki.field_a[1]) {
            vh.a(2, param0 - 140);
          }
          if (ki.field_a[2]) {
            ni.a(3, 103);
          }
          if (ki.field_a[3]) {
            fg.a(4, false);
          }
          if (ki.field_a[4]) {
            ah.a((byte) -86, 5);
          }
          if (ki.field_a[5]) {
            ek.a(-26445, 6);
          }
          if (ki.field_a[6]) {
            e.a(param0 - 111, 7);
          }
          if (ki.field_a[8]) {
            eh.b((byte) -110);
          }
        }
        return var2;
    }

    protected d() {
    }

    static {
        field_z = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_y = new int[]{0, 0};
        field_r = "Please check if address is correct";
    }
}
