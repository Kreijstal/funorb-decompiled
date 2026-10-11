/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends eh {
    private boolean field_r;
    private int field_A;
    private long field_t;
    private int field_o;
    private int field_x;
    private int field_B;
    private boolean field_s;
    static kf field_u;
    private boolean field_q;
    static ci field_p;
    private int field_v;
    String field_w;
    static int field_C;
    private int field_z;
    static nd field_y;

    private final static boolean a(byte param0, fa param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -25 % ((param0 - 30) / 34);
          stackIn_1_0 = param1.b((byte) -128);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("gf.VC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final void l(int param0) {
        tg.field_c[1] = true;
        if (param0 != 10001) {
          this.field_r = false;
        }
    }

    private final void c(byte param0) {
        tg.field_c[5] = true;
        if (param0 != -113) {
          this.j(45);
        }
    }

    public static void g(int param0) {
        if (param0 >= -110) {
          field_y = (nd) null;
        }
        field_u = null;
        field_p = null;
        field_y = null;
    }

    private final void g(byte param0) {
        int var2 = mk.field_j.a(-16384);
        if (param0 != -118) {
          String var6 = (String) null;
          this.a(-109, -4, -25, (String) null, -60);
        }
        int var3 = 0 != (var2 & 1) ? 1 : 0;
        int var4 = qh.field_d - 1;
        byte[] var5 = new byte[var4];
        mk.field_j.b(0, var5, var4, 0);
        m.a(dg.a(false), var3 != 0, ll.a(0, var5), param0 + 118);
    }

    final int h(byte param0) {
        int var2;
        var2 = this.d((byte) 78);
        if (param0 != -13) {
          this.field_o = 117;
        }
        if (var2 == 0 ||
          1 == var2) {
          if (tg.field_c[1]) {
            ah.a(48, 2);
          }
          if (tg.field_c[2]) {
            o.b(3, (byte) -74);
          }
          if (tg.field_c[3]) {
            uf.a(20840, 4);
          }
          if (tg.field_c[4]) {
            jh.b(5, -31890);
          }
          if (tg.field_c[5]) {
            jd.a(false, 6);
          }
          if (tg.field_c[6]) {
            sa.a(-336, 7);
          }
          if (tg.field_c[8]) {
            ak.b(param0 ^ -105);
          }
        }
        return var2;
    }

    private final int d(byte param0) {
        if (this.field_i) {
          return -1;
        }
        if (!qf.a((byte) 65)) {
          return -1;
        }
        if (q.field_Gb) {
          return -1;
        }
        int var2 = wj.a(true, 29398, le.a(false), pb.a((byte) -47), this.field_o, this.field_r);
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0 ||
          1 == var2) {
          if (q.field_Jb == 11 &&
            jj.field_f == 0) {
            kj.a((byte) 95);
          }
          return var2;
        }
        if (!rf.field_r) {
          this.a("reconnect", true);
        }
        gl.c((byte) 120);
        if (param0 != 78) {
          this.field_B = -50;
        }
        k.a(var2, bh.field_d, false);
        q.field_Gb = true;
        ah.field_z = 15000L + ll.a(1000);
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ph.field_o = this.field_z;
        a.a(ph.field_o, param1 - 4993);
        ji.a(this.field_A, this.field_s, this.field_v, param5, param1 - 4915, this.field_w, this.field_t, nj.field_l, 5000, param1, this.field_x, param6, ph.field_o, this.field_B);
        pe.a(this.field_B, this.field_w, param6, this.field_A, this.field_v, ph.field_o, 128, nj.field_l, this.field_x);
        wd.a(false);
        lk.field_d = ad.c(-3109);
        am.a((byte) 29, ae.field_G);
        f.field_g = param7;
        fg.field_b = param4;
        wc.field_s = param2;
        ld.field_d = param3;
        ik.field_b = param0;
        this.f((byte) -95);
        bk.b(93);
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          Exception var6 = null;
          dh var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var5Lifetime2;
          int var5Lifetime3;
          var9 = Terraphoenix.field_V;
          var4 = a.a(param0, vj.field_P, ph.field_o, 81);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5 = fg.a(fm.a(-32218), 41, qh.a(true));
            if (var5 != -1) {
              fl.a(bh.field_d, false, te.field_a, var5);
              te.field_a = null;
              bh.field_d = null;
            }
            var12 = rd.b((byte) 92);
            if (var12 != null) {
              af.a(true, var12.booleanValue());
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = gi.a(this.field_o, le.a(false), cm.a(-125), 3, ab.b(-27737), vl.b(3), pb.a((byte) -47));
            if (var5Lifetime1 != -1) {
              bi.a(var5Lifetime1, bh.field_d, te.field_a, -14);
              te.field_a = null;
              bh.field_d = null;
            }
          }
          if (3 == var4) {
            if (jj.field_f != -1 &&
              jj.field_f != 0) {
              jj.field_f = -1;
              bb.b(3287);
            }
            if (param1) {
              q.field_Gb = false;
            } else {
              var5Lifetime2 = wj.a(false, 29398, le.a(false), pb.a((byte) -47), this.field_o, this.field_r);
              if (var5Lifetime2 != -1) {
                if (0 == var5Lifetime2) {
                  pf.field_c = oj.field_y;
                  kj.a((byte) 95);
                  ei.field_R = false;
                  q.field_Jb = 10;
                } else {
                  k.a(var5Lifetime2, bh.field_d, false);
                  bh.field_d = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (jm.field_c) {
              rk.a(dg.a(false), true);
            } else {
              q.field_Jb = 10;
              ei.field_R = true;
            }
          }
          if (var4 == 5) {
            fc.a(dg.a(false), 100);
          }
          var5Lifetime3 = -92 / ((1 - param2) / 40);
          if (var4 == 6 &&
            wd.field_b) {
            q.field_Jb = 10;
          }
          if (7 == var4) {
            be.a(dg.a(false), -65);
          }
          if (8 == var4) {
            rk.a(dg.a(false), true);
          }
          if (var4 == 9) {
            dl.a(23943, dg.a(false));
          }
          if (var4 == 10) {
            di.field_l.k(-17410, 17);
          }
          if (var4 == 11) {
            dl.a(dg.a(false), -6242);
          }
          if (var4 == 12) {
            nl.a((byte) 122, ej.f((byte) -30), dg.a(false));
          }
          if (var4 == 13) {
            try {
              if (fm.field_b == null) {
                fm.field_b = new bh(nj.field_l, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (fm.field_b.a((byte) 116)) {
                var7 = fm.field_b.a(-76);
                if (var7 == null) {
                  var10 = (String) null;
                  si.a((String) null, 3);
                } else {
                  var8 = tc.a((byte) -114, var7.field_i, var7.field_k, 0);
                  si.a(var8, 3);
                }
                fm.field_b = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              bd.a((Throwable) ((Object) var6), "S1", 82);
              var11 = (String) null;
              si.a((String) null, 3);
              fm.field_b = null;
            }
          }
          if (15 == var4) {
            q.field_Jb = 10;
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

    final void a(int param0, boolean param1) {
        int stackIn_23_0 = 0;
        boolean stackIn_103_0 = false;
        int stackIn_105_1 = 0;
        boolean stackIn_106_2 = false;
        int stackIn_134_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var5 = Terraphoenix.field_V;
        if (null != ab.field_b) {
          if (a.field_b == null) {
            var6 = ck.b(113);
            var4 = var6.getSize();
            ab.field_b.a((byte) 63, var4.width, var4.height);
          }
          ab.field_b.a((byte) 92);
        }
        tc.b(1);
        fc.b(43);
        if (!c.b(-107) &&
          q.field_Jb != 11) {
          vk.a(-8177);
        }
        if (lk.field_d != null) {
          vj.field_P = lk.field_d.a(125);
        }
        if (ra.c((byte) 66)) {
          var3 = 1200 * uc.j((byte) -127);
          if (this.field_q ||
            !(var3 >= ch.a((byte) -5)) &&
            !(var3 >= wj.a(-127))) {
            this.field_q = false;
            gb.g(-17464);
            gl.c((byte) 127);
            k.a(2, ae.field_F, false);
            ke.a((byte) -107);
            q.field_Gb = true;
            ah.field_z = ll.a(1000) + 15000L;
          }
        }
        if (jj.field_f == -1 ||
          jj.field_f == 0) {
          stackIn_23_0 = (jj.field_f != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          jj.field_f = wc.c(0);
          if (var3Lifetime1 != 0 &&
            jj.field_f == 0 &&
            q.field_Jb == 11 &&
            !qf.a((byte) 64)) {
            kj.a((byte) 95);
          }
          if (-1 != jj.field_f &&
            jj.field_f != 0) {
            ah.field_z = 15000L + ll.a(1000);
          }
        }
        if (-1 != jj.field_f &&
          jj.field_f != 0) {
          if (uh.field_H >= 10) {
            if (10 <= q.field_Jb) {
              gl.c((byte) 118);
              if (jj.field_f != 3) {
                if (jj.field_f != 4) {
                  if (jj.field_f != 2) {
                    if (jj.field_f == 5) {
                      k.a(5, sh.field_x, false);
                    } else {
                      k.a(256, ak.field_f, false);
                    }
                  } else {
                    k.a(256, j.field_P, false);
                  }
                } else {
                  k.a(256, lb.field_a, false);
                }
              } else {
                k.a(256, tj.field_ub, false);
              }
              q.field_Gb = true;
            }
          } else {
            if (jj.field_f != 3) {
              if (jj.field_f == 4) {
                this.a("js5io", true);
              } else {
                if (jj.field_f != 2) {
                  if (jj.field_f == 5) {
                    this.a("outofdate", true);
                  } else {
                    this.a("js5connect", true);
                  }
                } else {
                  this.a("js5connect_full", true);
                }
              }
            } else {
              this.a("js5crc", true);
            }
          }
        }
        if ((jj.field_f != -1 &&
          jj.field_f != 0 ||
          qf.a((byte) 91)) &&
          ah.field_z <= ll.a(1000)) {
          q.field_Gb = false;
          if (-1 != jj.field_f &&
            jj.field_f != 0) {
            jj.field_f = -1;
            bb.b(3287);
          }
        }
        if (0 == jj.field_f &&
          !qf.a((byte) 106)) {
          da.field_f = false;
        }
        if (0 == uh.field_H &&
          vb.a(-353)) {
          uh.field_H = 1;
        }
        if (uh.field_H == 1) {
          if (0 != ph.field_o) {
            bl.field_a = va.a(wc.field_s, -120);
          }
          bi.field_d = vj.a(false, true, ld.field_d, (byte) 62, 1);
          ph.field_q = vj.a(false, true, ik.field_b, (byte) 62, 1);
          ch.field_g = vj.a(false, true, f.field_g, (byte) 62, 1);
          uh.field_H = 2;
          di.field_i = ph.field_q;
          ke.field_d = bi.field_d;
        }
        if (uh.field_H == 2) {
          if (null != bl.field_a &&
            bl.field_a.a(0)) {
            if (!bl.field_a.d(-1, "")) {
              bl.field_a = null;
            } else {
              if (bl.field_a.a(-3, "")) {
                ij.a(3, bl.field_a);
                bl.field_a = null;
                ea.a((byte) 47);
              }
            }
          }
          if (bl.field_a == null) {
            uh.field_H = 3;
          }
        }
        if (uh.field_H == 3 &&
          nh.a(ph.field_q, ch.field_g, false, bi.field_d) &&
          gf.a((byte) 103, ch.field_g)) {
          jj.e(-119);
          hj.g(-7958);
          ad.field_e = hh.field_k;
          wd.field_b = false;
          am.a(ch.field_g, jm.field_c, ph.field_q, bi.field_d, (byte) -22);
          if (ea.field_j ||
            i.field_d != null) {
            stackIn_103_0 = !(ea.field_j);
            stackIn_105_1 = 68;
            stackIn_106_2 = !(ea.field_j);
            sj.$cfr$intArgs$a$b1efba5c64a3(stackIn_103_0, stackIn_105_1, stackIn_106_2, i.field_d);
          }
          if (od.field_a) {
            bm.a(-128);
          }
          if (kj.field_b == null) {
            kj.field_b = di.f(-25177);
            sa.field_d = qa.a((byte) -110);
          }
          bb.a(ch.field_g, -94, sa.field_d, kj.field_b);
          ch.field_g = null;
          bi.field_d = null;
          ph.field_q = null;
          uh.a(-31312, (java.applet.Applet) (this));
          ea.a((byte) 47);
          uh.field_H = 10;
        }
        if (10 == uh.field_H) {
          if (ph.field_o != 0) {
            bi.field_b = va.a(fg.field_b, -117);
          }
          uh.field_H = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (uh.field_H == 11) {
          if (bi.field_b != null && (!bi.field_b.a(0) ||
            !bi.field_b.b((byte) -128))) {
            vh.a(qc.a(qb.field_e, bi.field_b, si.field_hb, (byte) 123), (byte) 66, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            rh.field_d = true;
            uh.field_H = 12;
          }
        }
        if (uh.field_H == 12 &&
          !rh.field_d) {
          uh.field_H = 13;
        }
        if (13 == uh.field_H) {
          var3Lifetime2 = 1;
          if (null != ph.field_v) {
            stackIn_134_0 = (!ph.field_v.a(0)) ? 0 : 1;
            var3Lifetime2 = stackIn_134_0;
            vh.a(ph.field_v.field_e, (byte) -128, ph.field_v.field_c);
          }
          if (var3Lifetime2 != 0) {
            uh.field_H = 20;
          }
        }
        if (!param1 &&
          ai.field_h) {
          hk.a(ae.field_G, (byte) 112);
          this.d(0);
          am.a((byte) -128, ae.field_G);
        }
        var3Lifetime3 = -108 / ((-17 - param0) / 32);
        if (tg.field_c[8]) {
          dg.a(81);
        }
    }

    private final void j(int param0) {
        tg.field_c[2] = true;
        if (param0 != 8560) {
          field_y = (nd) null;
        }
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4) {
        this.a((byte) -119, false);
        if (param0) {
          this.l(10001);
        }
        if (param3) {
          this.j(8560);
        }
        if (param1) {
          this.i(1);
        }
        if (param4) {
          this.c((byte) -113);
        }
        if (param2 != 13) {
          this.a(true, true, 1, true, true);
        }
    }

    final int a(boolean param0, byte param1) {
        if (param1 != -50) {
          this.l(-92);
        }
        return this.a(param0, true, 100);
    }

    final void h(int param0) {
        boolean stackIn_32_0 = false;
        int var2;
        int var3;
        dc var4;
        int var5;
        var5 = Terraphoenix.field_V;
        var2 = qk.field_b;
        var3 = -35 / ((param0 + 34) / 35);
        if (var2 < 64 &&
          tg.field_c[var2]) {
          if (var2 == 0) {
            return;
          }
          if (1 == var2) {
            jb.a((byte) -127);
          } else {
            if (2 != var2) {
              if (var2 == 3) {
                te.a((byte) 67);
              } else {
                if (4 != var2) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 == 7) {
                        this.e((byte) -109);
                      } else {
                        if (var2 != 8) {
                          if (16 != var2) {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                ee.a((byte) 127);
                                return;
                              }
                              if (var2 == 17) {
                                this.g((byte) -118);
                                return;
                              }
                              if (18 == var2) {
                                bh.b(-80);
                                return;
                              }
                              bd.a((Throwable) null, "MGS1: " + r.i(-15465), -87);
                              gb.g(-17464);
                              return;
                            }
                            stackIn_32_0 = (12 == var2);
                            var4 = bm.a(stackIn_32_0, 0);
                            od.a(var4, (byte) -97);
                          } else {
                            Terraphoenix.q(320);
                          }
                        } else {
                          sd.a((byte) 43, nj.field_l, mk.field_j, qh.field_d);
                        }
                      }
                    } else {
                      qb.b(0);
                    }
                  } else {
                    uk.a(true);
                  }
                } else {
                  rj.a(127);
                }
              }
            } else {
              gi.d(127);
            }
          }
          return;
        }
        bd.a((Throwable) null, "MGS2: " + r.i(-15465), -109);
        gb.g(-17464);
    }

    private final void a(byte param0, boolean param1) {
        if (param0 != -119) {
          this.field_x = -3;
        }
        tg.field_c[7] = true;
        tg.field_c[18] = true;
        tg.field_c[0] = true;
        tg.field_c[3] = true;
        tg.field_c[16] = true;
        tg.field_c[8] = param1;
        tg.field_c[17] = true;
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
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
            if (!this.b(true)) {
              return;
            }
            this.field_w = this.getCodeBase().getHost();
            var6 = this.field_w.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_r = stackIn_7_1;
            this.field_v = Integer.parseInt(this.getParameter("gameport1"));
            this.field_A = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_x = Integer.parseInt(var7);
            }
            this.field_B = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_t = Long.parseLong(this.getParameter("instanceid"));
            this.field_s = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_z = Integer.parseInt(var8);
            }
            if (this.field_z >= 5) {
              this.field_z = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_o = Integer.parseInt(var9);
            }
            if (param0 >= -39) {
              return;
            }
            od.field_a = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param2, 50, 32, this.field_B, param4, param3, param1);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            bd.a((Throwable) ((Object) var6_ref), (String) null, 99);
            this.a("crash", true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("gf.QC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, String param1, int param2) {
        try {
          this.a(-45, 480, param2, param1, 640);
          if (param0 > -61) {
            this.field_w = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "gf.WC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void f(byte param0) {
        dk.field_j[9] = -1;
        dk.field_j[2] = -2;
        dk.field_j[6] = -2;
        dk.field_j[11] = -1;
        dk.field_j[10] = -1;
        dk.field_j[7] = -1;
        dk.field_j[1] = 16;
        dk.field_j[3] = -1;
        dk.field_j[4] = -1;
        dk.field_j[5] = -1;
        dk.field_j[17] = -1;
        dk.field_j[16] = -1;
        dk.field_j[13] = -1;
        dk.field_j[8] = -2;
        if (param0 >= -78) {
          field_y = (nd) null;
        }
        dk.field_j[18] = 1;
        dk.field_j[12] = -1;
    }

    private final void i(int param0) {
        tg.field_c[4] = true;
        if (param0 != 1) {
          this.field_o = -73;
        }
    }

    private final void e(byte param0) {
        if (param0 != -109) {
          return;
        }
        String var2 = ab.c(param0 ^ 14599);
        lb.a(var2, dg.a(false), param0 ^ 108);
    }

    final void k(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = Terraphoenix.field_V;
        if (param0 != -20858) {
          return;
        }
        if (wf.a(31996)) {
          discarded$1 = this.a(null != a.field_b ? true : false, false, -65);
        } else {
          if (10 <= uh.field_H) {
            if (!sl.a((byte) -126)) {
              dh.g(97);
            } else {
              if (q.field_Jb == 0) {
                discarded$3 = this.a(false, false, -91);
              } else {
                uc.l(3795, vj.field_P);
              }
            }
          }
        }
    }

    protected gf() {
    }

    static {
        field_u = new kf("usename");
    }
}
