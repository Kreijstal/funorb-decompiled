/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends ch {
    private int field_x;
    private long field_k;
    private int field_r;
    static rf field_o;
    private boolean field_t;
    private boolean field_v;
    String field_n;
    private boolean field_m;
    private int field_u;
    static String field_q;
    private int field_w;
    private int field_l;
    private int field_s;
    static int field_p;

    private final int k(int param0) {
        int var2;
        if (this.field_a) {
          return -1;
        }
        if (!sb.a(75)) {
          return -1;
        }
        if (ii.field_e) {
          return -1;
        }
        {
          var2 = ri.a(true, sa.a(true), this.field_r, this.field_v, al.b(param0 + 1), 0);
          if (var2 == param0) {
            return -1;
          }
          if (var2 != 0) {
            if (var2 != 1) {
              if (!ff.field_k) {
                this.a((byte) 79, "reconnect");
              }
              kd.b((byte) 103);
              q.a((byte) 124, var2, kh.field_a);
              ii.field_e = true;
              hi.field_G = oa.a(-12520) + 15000L;
              return var2;
            }
          }
          if (hj.field_a != 11) {
            return var2;
          }
          if (ib.field_e != 0) {
            return var2;
          }
          gi.b(param0 - 12617);
          return var2;
        }
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        Object var3 = null;
        int var4 = 0;
        Object var5 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -16 / ((param1 + 4) / 62);
          var3 = null;
          var5 = null;
          if (null != sd.field_z) {
            if (!sd.field_z.equals(param2.getParameter("settings"))) {
              var3 = sd.field_z;
              var5 = var3;
              var5 = var3;
            }
          }
          if (me.field_j != null) {
            if (!me.field_j.equals(param2.getParameter("session"))) {
              var5 = me.field_j;
            }
          }
          stackIn_9_0 = ai.a((String) (var5), (String) (var3), param0, -1, true);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wf.KA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        va.field_a = this.field_u;
        da.a(true, va.field_a);
        if (param0 == -70) {
            ic.a(this.field_s, this.field_k, 5000, param7, this.field_m, param5, va.field_a, this.field_w, 5000, this.field_n, this.field_x, ka.field_i, 64, this.field_l);
            q.a(param7, va.field_a, this.field_l, this.field_x, -23949, ka.field_i, this.field_n, this.field_s, this.field_w);
            rd.b(28);
            vc.field_f = nd.a(param0 + 113);
            sl.a(f.field_kb, 57);
            lk.field_e = param2;
            ib.field_c = param4;
            pb.field_r = param6;
            sb.field_d = param3;
            ah.field_a = param1;
            this.e(123);
            pk.k((byte) -13);
            return;
        }
    }

    private final void f(int param0) {
        if (param0 != -11) {
            return;
        }
        String var2 = vf.i(1000);
        va.a(var2, k.c(111), param0 + 10);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a(false, (byte) -91);
        if (!(!param3)) {
            this.f((byte) 32);
        }
        if (param2) {
            this.i(16072);
        }
        if (param4 > -87) {
            this.field_w = -34;
        }
        if (!(!param0)) {
            this.e((byte) -19);
        }
        if (param1) {
            this.d(true);
        }
    }

    final void a(int param0, String param1, int param2) {
        try {
            this.a(480, param1, param0, (byte) 81, param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wf.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int d(byte param0) {
        int var2;
        java.applet.Applet var3;
        if (param0 != -67) {
          var3 = (java.applet.Applet) null;
          wf.a((java.net.URL) null, 48, (java.applet.Applet) null);
        }
        L1: {
          var2 = this.k(-1);
          if (var2 != 0) {
            if (1 != var2) {
              break L1;
            }
          }
          if (wj.field_G[1]) {
            qc.a(true, 2);
          }
          if (wj.field_G[2]) {
            ec.a(param0 ^ 76, 3);
          }
          if (wj.field_G[3]) {
            ud.a((byte) -125, 4);
          }
          if (wj.field_G[4]) {
            oi.a(5, 116);
          }
          if (wj.field_G[5]) {
            di.a(6, param0 + 21789);
          }
          if (wj.field_G[6]) {
            wd.a(true, 7);
          }
          if (wj.field_G[8]) {
            ng.g(-13912);
          }
        }
        return var2;
    }

    private final void a(boolean param0, byte param1) {
        wj.field_G[18] = true;
        wj.field_G[17] = true;
        wj.field_G[8] = param0;
        wj.field_G[0] = true;
        wj.field_G[3] = true;
        if (param1 != -91) {
            this.e((byte) 55);
        }
        wj.field_G[7] = true;
        wj.field_G[16] = true;
    }

    private final void e(int param0) {
        pb.field_m[11] = -1;
        pb.field_m[3] = -1;
        pb.field_m[10] = -1;
        pb.field_m[17] = -1;
        pb.field_m[5] = -1;
        pb.field_m[16] = -1;
        pb.field_m[6] = -2;
        pb.field_m[1] = 16;
        pb.field_m[9] = -1;
        pb.field_m[13] = -1;
        int var2 = -13 / ((param0 - 56) / 60);
        pb.field_m[7] = -1;
        pb.field_m[2] = -2;
        pb.field_m[4] = -1;
        pb.field_m[8] = -2;
        pb.field_m[18] = 1;
        pb.field_m[12] = -1;
    }

    final void b(boolean param0, int param1) {
        int stackIn_24_0 = 0;
        int stackIn_100_0 = 0;
        String stackIn_100_1 = null;
        boolean stackIn_101_2 = false;
        boolean stackIn_104_3;
        int stackIn_135_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        var5 = Geoblox.field_C;
        if (null != rb.field_d) {
          if (vl.field_n == null) {
            var6 = jf.a(true);
            var4 = var6.getSize();
            rb.field_d.a((byte) 126, var4.height, var4.width);
          }
          rb.field_d.a((byte) -126);
        }
        re.b(true);
        mc.a((byte) -128);
        if (!bl.b(255)) {
          if (hj.field_a != 11) {
            ck.c(1);
          }
        }
        if (null != vc.field_f) {
          vc.field_i = vc.field_f.a(true);
        }
        L4: {
          if (t.b(param1 ^ 19649)) {
            var3 = 1200 * sb.a(true);
            if (!this.field_t) {
              if (~var3 <= ~ha.a(-76)) {
                break L4;
              }
              if (var3 >= jk.a(false)) {
                break L4;
              }
            }
            this.field_t = false;
            jl.a((byte) -115);
            kd.b((byte) 81);
            q.a((byte) 124, 2, fa.field_d);
            bl.c(-113);
            ii.field_e = true;
            hi.field_G = oa.a(-12520) + 15000L;
          }
        }
        L6: {
          if (ib.field_e != -1) {
            if (ib.field_e != 0) {
              break L6;
            }
          }
          stackIn_24_0 = (-1 != ib.field_e) ? 0 : 1;
          var3 = stackIn_24_0;
          ib.field_e = ma.b(15869);
          if (var3 != 0) {
            if (ib.field_e == 0) {
              if (11 == hj.field_a) {
                if (!sb.a(73)) {
                  gi.b(-12618);
                }
              }
            }
          }
          if (-1 != ib.field_e) {
            if (ib.field_e != 0) {
              hi.field_G = 15000L + oa.a(-12520);
            }
          }
        }
        if (ib.field_e != -1) {
          if (ib.field_e != 0) {
            if (mi.field_C >= 10) {
              if (hj.field_a >= 10) {
                kd.b((byte) 114);
                if (ib.field_e != 3) {
                  if (4 != ib.field_e) {
                    if (2 == ib.field_e) {
                      q.a((byte) 124, 256, rc.field_g);
                    } else {
                      if (ib.field_e != 5) {
                        q.a((byte) 124, 256, ki.field_e);
                      } else {
                        q.a((byte) 124, 5, jg.field_c);
                      }
                    }
                  } else {
                    q.a((byte) 124, 256, qb.field_F);
                  }
                } else {
                  q.a((byte) 124, 256, pf.field_H);
                }
                ii.field_e = true;
              }
            } else {
              if (ib.field_e != 3) {
                if (ib.field_e != 4) {
                  if (2 == ib.field_e) {
                    this.a((byte) 79, "js5connect_full");
                  } else {
                    if (ib.field_e != 5) {
                      this.a((byte) 79, "js5connect");
                    } else {
                      this.a((byte) 79, "outofdate");
                    }
                  }
                } else {
                  this.a((byte) 79, "js5io");
                }
              } else {
                this.a((byte) 79, "js5crc");
              }
            }
          }
        }
        L12: {
          L13: {
            if (ib.field_e != -1) {
              if (ib.field_e != 0) {
                break L13;
              }
            }
            if (!sb.a(param1 - 19585)) {
              break L12;
            }
          }
          if (~hi.field_G >= ~oa.a(param1 - 32180)) {
            ii.field_e = false;
            if (-1 != ib.field_e) {
              if (ib.field_e != 0) {
                ib.field_e = -1;
                j.e(-21754);
              }
            }
          }
        }
        if (ib.field_e == 0) {
          if (!sb.a(93)) {
            lb.field_a = false;
          }
        }
        if (mi.field_C == 0) {
          if (qi.b(108)) {
            mi.field_C = 1;
          }
        }
        if (mi.field_C == 1) {
          if (va.field_a != 0) {
            dd.field_J = kk.a(lk.field_e, (byte) -62);
          }
          l.field_h = rj.a(ib.field_c, (byte) -18, true, false, 1);
          dc.field_c = rj.a(pb.field_r, (byte) -124, true, false, 1);
          hb.field_n = rj.a(sb.field_d, (byte) -41, true, false, 1);
          ki.field_b = l.field_h;
          mi.field_C = 2;
          re.field_i = dc.field_c;
        }
        if (mi.field_C == 2) {
          if (dd.field_J != null) {
            if (dd.field_J.a(0)) {
              if (!dd.field_J.b((byte) -116, "")) {
                dd.field_J = null;
              } else {
                if (dd.field_J.a("", (byte) -126)) {
                  wi.a((byte) 74, dd.field_J);
                  dd.field_J = null;
                  ih.b(-50);
                }
              }
            }
          }
          if (null == dd.field_J) {
            mi.field_C = 3;
          }
        }
        if (3 == mi.field_C) {
          if (ma.a(hb.field_n, dc.field_c, l.field_h, -11652)) {
            if (rj.a((byte) -127, hb.field_n)) {
              L22: {
                tj.c((byte) -105);
                ke.b((byte) 120);
                oi.field_e = nh.field_c;
                kf.field_e = false;
                fj.a((byte) 114, hb.field_n, rb.field_c, dc.field_c, l.field_h);
                if (!ri.field_a) {
                  if (jg.field_d == null) {
                    break L22;
                  }
                }
                stackIn_100_0 = 2274;
                stackIn_100_1 = jg.field_d;
                if (ri.field_a) {
                  stackIn_101_2 = false;
                } else {
                  stackIn_101_2 = true;
                }
                if (ri.field_a) {
                  stackIn_104_3 = false;
                } else {
                  stackIn_104_3 = true;
                }
                og.a(stackIn_100_0, stackIn_100_1, stackIn_101_2, stackIn_104_3);
              }
              if (p.field_m) {
                hk.e(83);
              }
              if (null == bh.field_a) {
                bh.field_a = df.b((byte) 72);
                hc.field_R = fe.b(110);
              }
              bk.a(hb.field_n, hc.field_R, 111, bh.field_a);
              hb.field_n = null;
              dc.field_c = null;
              l.field_h = null;
              fd.a((java.applet.Applet) (this), -82);
              ih.b(-69);
              mi.field_C = 10;
            }
          }
        }
        if (10 == mi.field_C) {
          if (va.field_a != 0) {
            ak.field_b = kk.a(ah.field_a, (byte) -62);
          }
          mi.field_C = 11;
        }
        L30: {
          if (mi.field_C == 11) {
            L31: {
              if (null != ak.field_b) {
                if (ak.field_b.a(0)) {
                  if (ak.field_b.b(true)) {
                    break L31;
                  }
                }
                lc.a(si.a(ri.field_c, 2147483647, vc.field_g, ak.field_b), -2, 0.0f);
                break L30;
              }
            }
            cf.field_k = true;
            mi.field_C = 12;
          }
        }
        if (param1 != 19660) {
          return;
        }
        if (mi.field_C == 12) {
          if (!cf.field_k) {
            mi.field_C = 13;
          }
        }
        if (mi.field_C == 13) {
          var3 = 1;
          if (null != b.field_b) {
            stackIn_135_0 = (!b.field_b.a(true)) ? 0 : 1;
            var3 = stackIn_135_0;
            lc.a(b.field_b.field_e, -2, b.field_b.field_j);
          }
          if (var3 != 0) {
            mi.field_C = 20;
          }
        }
        if (!param0) {
          if (ab.field_a) {
            nb.a(-2, f.field_kb);
            this.b(true);
            sl.a(f.field_kb, 57);
          }
        }
        if (wj.field_G[8]) {
          ji.f(-102);
        }
    }

    final void h(int param0) {
        int discarded$55 = 0;
        int discarded$56 = 0;
        int var3;
        boolean stackIn_3_1 = false;
        boolean stackIn_4_2 = false;
        var3 = Geoblox.field_C;
        if (!fj.f(-31456)) {
          if (mi.field_C >= 10) {
            if (!wj.f(7426)) {
              td.g((byte) 88);
            } else {
              if (hj.field_a != 0) {
                oj.a(vc.field_i, (byte) -96);
              } else {
                discarded$55 = this.a(false, false, -1);
              }
            }
          }
        } else {
          stackIn_3_1 = false;
          if (vl.field_n == null) {
            stackIn_4_2 = false;
          } else {
            stackIn_4_2 = true;
          }
          discarded$56 = this.a(stackIn_3_1, stackIn_4_2, -1);
        }
        if (param0 < 104) {
          this.f(80);
        }
    }

    public static void g(int param0) {
        field_o = null;
        field_q = null;
        if (param0 != 30344) {
            wf.j(-29);
        }
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
            qc var12 = null;
            var8 = Geoblox.field_C;
            var4 = gk.a(va.field_a, vc.field_i, param1, (byte) -117);
            if (param2 == ~var4) {
              throw new IllegalStateException();
            }
            if (var4 == 1) {
              var5_int = qc.a(qh.i(param2 ^ -26), pf.h((byte) -42), -121);
              if (var5_int != -1) {
                kb.a(var5_int, 6568, si.field_i, kh.field_a);
                kh.field_a = null;
                si.field_i = null;
              }
              var11 = vf.a((byte) 111);
              if (var11 != null) {
                mk.a(param2 ^ 110, var11.booleanValue());
              }
            }
            if (var4 == 2) {
              var5_int = uf.a((byte) -94, sa.a(true), qj.b((byte) 81), this.field_r, vh.f(100), al.b(0), cg.a((byte) 27));
              if (var5_int != -1) {
                gj.a(kh.field_a, var5_int, (byte) 30, si.field_i);
                kh.field_a = null;
                si.field_i = null;
              }
            }
            if (var4 == 3) {
              if (-1 != ib.field_e) {
                if (ib.field_e != 0) {
                  ib.field_e = -1;
                  j.e(-21754);
                }
              }
              if (!param0) {
                var5_int = ri.a(false, sa.a(true), this.field_r, this.field_v, al.b(~param2), ~param2);
                if (var5_int != -1) {
                  if (var5_int == 0) {
                    vi.field_H = oa.field_c;
                    gi.b(-12618);
                    hl.field_G = false;
                    hj.field_a = 10;
                  } else {
                    q.a((byte) 124, var5_int, kh.field_a);
                    kh.field_a = null;
                  }
                }
              } else {
                ii.field_e = false;
              }
            }
            if (var4 == 4) {
              if (!rb.field_c) {
                hl.field_G = true;
                hj.field_a = 10;
              } else {
                ba.a((byte) 116, k.c(param2 ^ -122));
              }
            }
            if (5 == var4) {
              gf.a(k.c(120), 62);
            }
            if (var4 == 6) {
              if (kf.field_e) {
                hj.field_a = 10;
              }
            }
            if (var4 == 7) {
              je.a((byte) 114, k.c(107));
            }
            if (var4 == 8) {
              ba.a((byte) 116, k.c(119));
            }
            if (9 == var4) {
              tl.a(k.c(115), (byte) -91);
            }
            if (var4 == 10) {
              fj.field_q.a(17, (byte) -21);
            }
            if (var4 == 11) {
              h.a(k.c(110), false);
            }
            if (var4 == 12) {
              eb.a(k.c(121), (byte) 117, gf.a(param2 ^ -241));
            }
            if (var4 == 13) {
              try {
                if (null == mk.field_n) {
                  mk.field_n = new wg(ka.field_i, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                }
                if (mk.field_n.a((byte) 45)) {
                  var12 = mk.field_n.b((byte) 91);
                  if (var12 == null) {
                    var9 = (String) null;
                    wd.a((byte) 69, (String) null);
                  } else {
                    var7 = bc.a(-46, var12.field_j, 0, var12.field_f);
                    wd.a((byte) 69, var7);
                  }
                  mk.field_n = null;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5 = (Exception) (Object) decompiledCaughtException;
                gi.a((Throwable) ((Object) var5), "S1", (byte) 125);
                var10 = (String) null;
                wd.a((byte) 69, (String) null);
                mk.field_n = null;
              }
            }
            if (var4 == 15) {
              hj.field_a = 10;
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

    private final void e(byte param0) {
        wj.field_G[4] = true;
        int var2 = 10 % ((-61 - param0) / 32);
    }

    private final void a(int param0, String param1, int param2, byte param3, int param4) {
        boolean stackIn_7_1 = false;
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
        String var10 = null;
        try {
          try {
            if (!this.a(false)) {
              return;
            }
            {
              L1: {
                this.field_n = this.getCodeBase().getHost();
                var6 = this.field_n.toLowerCase();
                if (!var6.equals("jagex.com")) {
                  if (!var6.endsWith(".jagex.com")) {
                    stackIn_7_1 = false;
                    break L1;
                  }
                }
                stackIn_7_1 = true;
              }
              ((wf) (this)).field_v = stackIn_7_1;
              this.field_l = Integer.parseInt(this.getParameter("gameport1"));
              this.field_w = Integer.parseInt(this.getParameter("gameport2"));
              var7 = this.getParameter("servernum");
              if (var7 != null) {
                this.field_x = Integer.parseInt(var7);
              }
              this.field_s = Integer.parseInt(this.getParameter("gamecrc"));
              this.field_k = Long.parseLong(this.getParameter("instanceid"));
              this.field_m = this.getParameter("member").equals("yes");
              var8 = this.getParameter("lang");
              if (var8 != null) {
                this.field_u = Integer.parseInt(var8);
              }
              if (this.field_u >= 5) {
                this.field_u = 0;
              }
              var9 = this.getParameter("affid");
              if (var9 != null) {
                this.field_r = Integer.parseInt(var9);
              }
              p.field_m = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
              this.a(32, -14948, this.field_s, param0, param4, param1, param2);
              if (param3 != 81) {
                this.a((byte) -103, -111, -55, -20, 80, false, -81, 86);
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            gi.a((Throwable) ((Object) var6_ref), (String) null, (byte) 125);
            this.a((byte) 79, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = (RuntimeException) (var6_ref2);
          stackIn_23_1 = new StringBuilder().append("wf.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int[] j(int param0) {
        if (param0 < 81) {
            field_p = -43;
        }
        return new int[8];
    }

    final void l(int param0) {
        boolean stackIn_30_0 = false;
        int var2;
        vd var3;
        int var4;
        var4 = Geoblox.field_C;
        if (param0 < 119) {
          this.field_m = true;
        }
        var2 = me.field_l;
        if (var2 < 64) {
          if (wj.field_G[var2]) {
            if (var2 == 0) {
              return;
            }
            L2: {
              if (var2 == 1) {
                ec.a(-1073741824);
              } else {
                if (var2 == 2) {
                  cm.c(-24839);
                } else {
                  if (3 == var2) {
                    ud.b(119);
                  } else {
                    if (var2 != 4) {
                      if (5 == var2) {
                        al.a(26146);
                      } else {
                        if (var2 == 6) {
                          bh.a(2);
                        } else {
                          if (var2 != 7) {
                            if (8 == var2) {
                              pg.a(-4, ka.field_i, p.field_k, eh.field_d);
                            } else {
                              if (var2 == 16) {
                                rc.b(1);
                              } else {
                                if (11 != var2) {
                                  if (12 != var2) {
                                    if (var2 == 13) {
                                      lc.a((byte) 104);
                                      break L2;
                                    }
                                    if (17 == var2) {
                                      this.g((byte) 12);
                                      break L2;
                                    }
                                    if (var2 == 18) {
                                      dl.a(11560);
                                      break L2;
                                    }
                                    gi.a((Throwable) null, "MGS1: " + og.e(55), (byte) 125);
                                    jl.a((byte) -122);
                                    break L2;
                                  }
                                }
                                stackIn_30_0 = !(var2 != 12);
                                var3 = bk.a(stackIn_30_0, 128);
                                s.a(var3, 0);
                              }
                            }
                          } else {
                            this.f(-11);
                          }
                        }
                      }
                    } else {
                      pf.f(-103);
                    }
                  }
                }
              }
            }
            return;
          }
        }
        gi.a((Throwable) null, "MGS2: " + og.e(55), (byte) 125);
        jl.a((byte) -118);
    }

    private final void g(byte param0) {
        int var2 = eh.field_d.c((byte) 34);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        if (param0 != 12) {
            this.h(106);
        }
        int var4 = -1 + p.field_k;
        byte[] var5 = new byte[var4];
        eh.field_d.c(96, 0, var5, var4);
        pa.a(ag.a(1, var5), (byte) -128, var3 != 0, k.c(112));
    }

    private final void i(int param0) {
        wj.field_G[2] = true;
        if (param0 != 16072) {
            wf.g(124);
        }
    }

    private final void d(boolean param0) {
        wj.field_G[5] = param0;
    }

    private final void f(byte param0) {
        if (param0 != 32) {
            this.field_u = 72;
        }
        wj.field_G[1] = true;
    }

    final void h(byte param0) {
        this.field_t = true;
        int var2 = -21 / ((-82 - param0) / 37);
    }

    final int a(boolean param0, int param1) {
        if (param1 != -17978) {
            this.e(-61);
        }
        return this.a(true, param0, -1);
    }

    protected wf() {
    }

    static {
        field_q = "Fullscreen";
    }
}
