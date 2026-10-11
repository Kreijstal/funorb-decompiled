/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob extends m {
    private int field_o;
    private boolean field_x;
    private int field_t;
    static ea[] field_w;
    private int field_r;
    String field_s;
    static bj field_q;
    static String[][] field_n;
    private int field_B;
    private int field_A;
    static String field_v;
    private boolean field_p;
    private boolean field_z;
    private long field_u;
    private int field_y;

    private final void m(int param0) {
        mk.field_b[2] = true;
        if (param0 != -9859) {
          this.field_s = (String) null;
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        this.b(false, false);
        if (param0) {
          this.i(1);
        }
        if (param2) {
          this.m(-9859);
        }
        int var6 = 107 / ((param1 - 27) / 46);
        if (param4) {
          this.j(22810);
        }
        if (param3) {
          this.p(110);
        }
    }

    public static void o(int param0) {
        field_w = null;
        field_q = null;
        field_v = null;
        field_n = (String[][]) null;
        if (param0 < 48) {
          field_q = (bj) null;
        }
    }

    final int c(byte param0) {
        int var2;
        pf var3;
        var2 = this.d((byte) 86);
        if (var2 == 0 ||
          var2 == 1) {
          if (mk.field_b[1]) {
            kh.a(-1, 2);
          }
          if (mk.field_b[2]) {
            nb.a((byte) -52, 3);
          }
          if (mk.field_b[3]) {
            qd.a(4, (byte) -125);
          }
          if (mk.field_b[4]) {
            gh.a(5, 21121);
          }
          if (mk.field_b[5]) {
            gi.a(85, 6);
          }
          if (mk.field_b[6]) {
            g.a((byte) -69, 7);
          }
          if (mk.field_b[8]) {
            hd.a(-124);
          }
        }
        if (param0 > -103) {
          var3 = (pf) null;
          ob.a((byte) -21, (pf) null, (pf) null);
        }
        return var2;
    }

    private final void c(boolean param0) {
        ge.field_g[2] = -2;
        ge.field_g[4] = -1;
        ge.field_g[5] = -1;
        ge.field_g[12] = -1;
        ge.field_g[18] = 1;
        ge.field_g[1] = 16;
        ge.field_g[7] = -1;
        ge.field_g[16] = -1;
        ge.field_g[11] = -1;
        ge.field_g[3] = -1;
        ge.field_g[6] = -2;
        ge.field_g[8] = -2;
        ge.field_g[13] = -1;
        ge.field_g[9] = -1;
        ge.field_g[17] = -1;
        if (param0) {
          this.field_z = false;
        }
        ge.field_g[10] = -1;
    }

    final void a(boolean param0, int param1) {
        int stackIn_23_0 = 0;
        int stackIn_96_0 = 0;
        boolean stackIn_97_1 = false;
        String stackIn_99_2 = null;
        boolean stackIn_100_3;
        int stackIn_130_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = MinerDisturbance.field_ab;
        if (ij.field_o != null) {
          if (kf.field_d == null) {
            var6 = da.b(24255);
            var4 = var6.getSize();
            ij.field_o.a(false, var4.height, var4.width);
          }
          ij.field_o.c(565);
        }
        mh.b(114);
        k.f(10525);
        if (!hl.b((byte) 120) &&
          fh.field_b != 11) {
          hm.d((byte) 22);
        }
        if (null != pf.field_e) {
          ki.field_n = pf.field_e.a((byte) -124);
        }
        if (gd.b((byte) -110)) {
          var3 = pl.b((byte) -116) * 1200;
          if (this.field_z ||
            !(mk.b(24) <= var3) &&
            !(var3 >= u.b(-4440))) {
            this.field_z = false;
            si.a(-75);
            eb.a((byte) -96);
            da.a(true, le.field_a, 2);
            oj.c((byte) -62);
            nd.field_e = true;
            j.field_f = 15000L + sf.a((byte) -58);
          }
        }
        if (param1 != 18808) {
          return;
        }
        if (tb.field_f == -1 ||
          tb.field_f == 0) {
          stackIn_23_0 = (tb.field_f != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          tb.field_f = si.a((byte) -115);
          if (var3Lifetime1 != 0 &&
            0 == tb.field_f &&
            fh.field_b == 11 &&
            !ci.a(82)) {
            mc.c(-78);
          }
          if (tb.field_f != -1 &&
            0 != tb.field_f) {
            j.field_f = sf.a((byte) -52) + 15000L;
          }
        }
        if (tb.field_f != -1 &&
          tb.field_f != 0) {
          if (10 <= af.field_u) {
            if (fh.field_b >= 10) {
              eb.a((byte) -110);
              if (tb.field_f == 3) {
                da.a(true, wf.field_N, 256);
              } else {
                if (tb.field_f == 4) {
                  da.a(true, kc.field_e, 256);
                } else {
                  if (tb.field_f == 2) {
                    da.a(true, ng.field_k, 256);
                  } else {
                    if (tb.field_f != 5) {
                      da.a(true, kj.field_b, 256);
                    } else {
                      da.a(true, rd.field_e, 5);
                    }
                  }
                }
              }
              nd.field_e = true;
            }
          } else {
            if (tb.field_f == 3) {
              this.a((byte) -18, "js5crc");
            } else {
              if (tb.field_f != 4) {
                if (tb.field_f == 2) {
                  this.a((byte) 120, "js5connect_full");
                } else {
                  if (tb.field_f == 5) {
                    this.a((byte) -125, "outofdate");
                  } else {
                    this.a((byte) -128, "js5connect");
                  }
                }
              } else {
                this.a((byte) -29, "js5io");
              }
            }
          }
        }
        if ((-1 != tb.field_f &&
          tb.field_f != 0 ||
          ci.a(106)) &&
          sf.a((byte) -15) >= j.field_f) {
          nd.field_e = false;
          if (tb.field_f != -1 &&
            tb.field_f != 0) {
            tb.field_f = -1;
            ql.a(-78);
          }
        }
        if (tb.field_f == 0 &&
          !ci.a(param1 - 18752)) {
          ul.field_a = false;
        }
        if (af.field_u == 0 &&
          sn.a((byte) 107)) {
          af.field_u = 1;
        }
        if (af.field_u == 1) {
          if (kb.field_c != 0) {
            sb.field_r = lb.a(1, s.field_Q);
          }
          hj.field_i = eb.a(true, fn.field_p, false, 1, true);
          pb.field_r = eb.a(true, se.field_N, false, 1, true);
          oh.field_C = eb.a(true, da.field_c, false, 1, true);
          s.field_P = pb.field_r;
          af.field_u = 2;
          field_q = hj.field_i;
        }
        if (af.field_u == 2) {
          if (null != sb.field_r &&
            sb.field_r.a((byte) 83)) {
            if (sb.field_r.b(false, "")) {
              if (sb.field_r.a(false, "")) {
                li.a(9259, sb.field_r);
                sb.field_r = null;
                wf.p(4462);
              }
            } else {
              sb.field_r = null;
            }
          }
          if (null == sb.field_r) {
            af.field_u = 3;
          }
        }
        if (3 == af.field_u &&
          eg.a(pb.field_r, 4, hj.field_i, oh.field_C) &&
          eb.a(oh.field_C, (byte) 124)) {
          bh.h((byte) 123);
          em.g(-1719110238);
          bj.field_c = ll.field_e;
          jb.field_q = false;
          mj.a(v.field_e, hj.field_i, 43, oh.field_C, pb.field_r);
          if (nc.field_e ||
            null != bm.field_q) {
            stackIn_96_0 = param1 + 1123;
            stackIn_97_1 = !(nc.field_e);
            stackIn_99_2 = bm.field_q;
            stackIn_100_3 = !(nc.field_e);
            bb.a(stackIn_96_0, stackIn_97_1, stackIn_99_2, stackIn_100_3);
          }
          if (bd.field_d) {
            km.a((byte) -69);
          }
          if (hj.field_o == null) {
            hj.field_o = da.a(param1 - 17950);
            tm.field_I = hm.f((byte) -67);
          }
          fi.a((byte) 104, oh.field_C, hj.field_o, tm.field_I);
          pb.field_r = null;
          hj.field_i = null;
          oh.field_C = null;
          vk.a(true, (java.applet.Applet) (this));
          wf.p(param1 ^ 22550);
          af.field_u = 10;
        }
        if (af.field_u == 10) {
          if (kb.field_c != 0) {
            fh.field_c = lb.a(1, mg.field_f);
          }
          af.field_u = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (af.field_u == 11) {
          if (fh.field_c != null && (!fh.field_c.a((byte) 84) ||
            !fh.field_c.b(-1))) {
            pa.a(true, qn.a(ge.field_d, ic.field_g, false, fh.field_c), 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            oe.field_a = true;
            af.field_u = 12;
          }
        }
        if (af.field_u == 12 &&
          !oe.field_a) {
          af.field_u = 13;
        }
        if (af.field_u == 13) {
          var3Lifetime2 = 1;
          if (null != qg.field_d) {
            stackIn_130_0 = (!qg.field_d.a(true)) ? 0 : 1;
            var3Lifetime2 = stackIn_130_0;
            pa.a(true, qg.field_d.field_g, qg.field_d.field_c);
          }
          if (var3Lifetime2 != 0) {
            af.field_u = 20;
          }
        }
        if (!param0 &&
          fa.field_a) {
          ci.a(ef.field_c, 0);
          this.c(-111);
          ab.a((byte) -13, ef.field_c);
        }
        if (mk.field_b[8]) {
          cm.e(param1 + 5875);
        }
    }

    private final void p(int param0) {
        mk.field_b[5] = true;
        if (param0 <= 104) {
          this.a(false, -107, (byte) 111, 87, 84, 120, -94, -19);
        }
    }

    private final int d(byte param0) {
        int var2;
        if (param0 <= 67) {
          return -114;
        }
        if (this.field_i) {
          return -1;
        }
        if (!ci.a(101)) {
          return -1;
        }
        if (nd.field_e) {
          return -1;
        }
        var2 = re.a(this.field_A, false, this.field_p, fc.b((byte) 119), true, ii.b((byte) -42));
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!tn.field_M) {
            this.a((byte) -120, "reconnect");
          }
          eb.a((byte) -33);
          da.a(true, nf.field_g, var2);
          nd.field_e = true;
          j.field_f = 15000L + sf.a((byte) -89);
          return var2;
        }
        if (11 == fh.field_b &&
          tb.field_f == 0) {
          mc.c(-73);
        }
        return var2;
    }

    final void a(String param0, int param1, int param2) {
        try {
          this.a(param0, param1, 640, 480, param2 ^ 6576);
          if (param2 != -6622) {
            this.field_x = false;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ob.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(int param0) {
        mk.field_b[param0] = true;
    }

    private final void j(int param0) {
        if (param0 != 22810) {
          this.field_B = -24;
        }
        mk.field_b[4] = true;
    }

    private final void a(String param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        String var7 = null;
        Exception var7_ref = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        try {
          var6_int = -94 % ((param4 - 70) / 39);
          try {
            if (!this.a((byte) -50)) {
              return;
            }
            this.field_s = this.getCodeBase().getHost();
            var7 = this.field_s.toLowerCase();
            stackIn_9_1 = (var7.equals("jagex.com")) || (var7.endsWith(".jagex.com"));
            this.field_p = stackIn_9_1;
            this.field_y = Integer.parseInt(this.getParameter("gameport1"));
            this.field_o = Integer.parseInt(this.getParameter("gameport2"));
            var8 = this.getParameter("servernum");
            if (var8 != null) {
              this.field_t = Integer.parseInt(var8);
            }
            this.field_B = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_u = Long.parseLong(this.getParameter("instanceid"));
            this.field_x = this.getParameter("member").equals("yes");
            var9 = this.getParameter("lang");
            if (var9 != null) {
              this.field_r = Integer.parseInt(var9);
            }
            if (this.field_r >= 5) {
              this.field_r = 0;
            }
            var10 = this.getParameter("affid");
            if (var10 != null) {
              this.field_A = Integer.parseInt(var10);
            }
            bd.field_d = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param2, param1, this.field_B, 3, param0, param3, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7_ref = (Exception) (Object) decompiledCaughtException;
            var11 = (String) null;
            di.a((Throwable) ((Object) var7_ref), 1, (String) null);
            this.a((byte) -125, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var6;
          stackIn_25_1 = new StringBuilder().append("ob.V(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void h(int param0) {
        int var2 = kj.field_a.d((byte) -54);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = rj.field_d - 1;
        byte[] var5 = new byte[var4];
        kj.field_a.a(var5, 113, var4, param0);
        cn.a(bm.c(-98), bh.a(var5, 88), 11050, var3 != 0);
    }

    final static boolean l(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1) {
          field_q = (bj) null;
        }
        stackIn_6_0 = (ci.field_i != null) && (qd.field_Q.a(param0 ^ -18545));
        return stackIn_6_0;
    }

    private final void b(boolean param0, boolean param1) {
        mk.field_b[3] = true;
        mk.field_b[16] = true;
        mk.field_b[8] = param0;
        mk.field_b[18] = true;
        if (param1) {
          this.field_o = 34;
        }
        mk.field_b[7] = true;
        mk.field_b[17] = true;
        mk.field_b[0] = true;
    }

    final void k(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = MinerDisturbance.field_ab;
        if (bi.a(-11)) {
          discarded$1 = this.a(true, false, kf.field_d != null ? true : false);
        } else {
          if (10 <= af.field_u) {
            if (!fe.j(param0 ^ -94)) {
              ed.a(127);
            } else {
              if (fh.field_b != 0) {
                il.a(ki.field_n, (byte) -109);
              } else {
                discarded$2 = this.a(true, false, false);
              }
            }
          }
        }
        if (param0 != 10) {
          this.b(true, true);
        }
    }

    private final void g(int param0) {
        String var2 = ca.b((byte) -124);
        tk.a(var2, bm.c(-116), (byte) -15);
        if (param0 != -18) {
          this.c((byte) 99);
        }
    }

    final void a(boolean param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        if (param2 != -121) {
          this.k(-25);
        }
        this.setBackground(java.awt.Color.black);
        kb.field_c = this.field_r;
        od.a(122, kb.field_c);
        qg.a(qa.field_a, this.field_t, this.field_B, param1, this.field_y, this.field_u, this.field_o, this.field_s, this.field_x, 5000, true, param0, 5000, kb.field_c);
        q.a(this.field_t, qa.field_a, kb.field_c, this.field_s, this.field_o, param1, 20, this.field_B, this.field_y);
        km.b((byte) 109);
        pf.field_e = oh.c((byte) 119);
        ab.a((byte) -13, ef.field_c);
        se.field_N = param5;
        da.field_c = param7;
        fn.field_p = param4;
        mg.field_f = param6;
        s.field_Q = param3;
        this.c(false);
        oe.a(true);
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
          String stackIn_63_0 = null;
          boolean stackIn_64_1 = false;
          Object stackIn_69_0 = null;
          boolean stackIn_70_1 = false;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          Boolean var10 = null;
          sb var11 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = MinerDisturbance.field_ab;
          var4 = bj.a(ki.field_n, kb.field_c, param2, 65);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = ob.a((byte) 112, mf.a(15), fe.f(0));
            if (-1 != var5_int) {
              vj.a(-21614, nf.field_g, var5_int, vh.field_i);
              nf.field_g = null;
              vh.field_i = null;
            }
            var10 = aj.a(103);
            if (var10 != null) {
              jc.a((byte) 17, var10.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = dn.a(lm.n(-124), fa.a(true), mb.b((byte) -95), fc.b((byte) 123), ii.b((byte) 63), this.field_A, -14543);
            if (-1 != var5_intLifetime1) {
              ee.a(nf.field_g, vh.field_i, (byte) -98, var5_intLifetime1);
              nf.field_g = null;
              vh.field_i = null;
            }
          }
          if (var4 == 3) {
            if (tb.field_f != -1 &&
              tb.field_f != 0) {
              tb.field_f = -1;
              ql.a(-93);
            }
            if (param1) {
              nd.field_e = false;
            } else {
              var5_intLifetime2 = re.a(this.field_A, false, this.field_p, fc.b((byte) 127), false, ii.b((byte) 126));
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  da.a(true, nf.field_g, var5_intLifetime2);
                  nf.field_g = null;
                } else {
                  jn.field_n = ne.field_Q;
                  mc.c(-100);
                  qc.field_b = false;
                  fh.field_b = 10;
                }
              }
            }
          }
          if (var4 == 4) {
            if (!v.field_e) {
              qc.field_b = true;
              fh.field_b = 10;
            } else {
              kn.a(13569, bm.c(-89));
            }
          }
          if (5 == var4) {
            uf.a(13, bm.c(-84));
          }
          if (var4 == 6 &&
            jb.field_q) {
            fh.field_b = 10;
          }
          if (var4 == 7) {
            tg.a((byte) -114, bm.c(-112));
          }
          if (var4 == 8) {
            kn.a(13569, bm.c(-112));
          }
          if (var4 == 9) {
            dk.a(bm.c(-77), (byte) -27);
          }
          if (var4 == 10) {
            sn.field_c.d((byte) -51, 17);
          }
          if (var4 == 11) {
            ne.a(bm.c(-108), 30433);
          }
          if (!param0) {
            return 19;
          }
          if (12 == var4) {
            jk.a(bm.c(-86), 68, kn.a(0));
          }
          if (13 == var4) {
            try {
              if (null == hf.field_u) {
                hf.field_u = new lf(qa.field_a, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (hf.field_u.a((byte) 105)) {
                var11 = hf.field_u.a(0);
                if (var11 != null) {
                  var7 = ph.a((byte) 31, var11.field_o, var11.field_u, 0);
                  stackIn_63_0 = var7;
                  stackIn_64_1 = !(param0);
                  fm.a(stackIn_63_0, stackIn_64_1);
                } else {
                  var9 = (String) null;
                  fm.a((String) null, false);
                }
                hf.field_u = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              di.a((Throwable) ((Object) var5), 1, "S1");
              stackIn_69_0 = null;
              stackIn_70_1 = !(param0);
              fm.a((String) (stackIn_69_0), stackIn_70_1);
              hf.field_u = null;
            }
          }
          if (var4 == 15) {
            fh.field_b = 10;
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

    final void n(int param0) {
        boolean stackIn_32_0 = false;
        int var2;
        id var3;
        int var4;
        var4 = MinerDisturbance.field_ab;
        var2 = oj.field_K;
        if (param0 < 21) {
          this.g(49);
        }
        if (var2 < 64 &&
          mk.field_b[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            dk.a(22288);
          } else {
            if (var2 == 2) {
              fn.a(0);
            } else {
              if (3 != var2) {
                if (var2 == 4) {
                  em.d((byte) -67);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      jn.a((byte) -105);
                    } else {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (16 == var2) {
                            hn.a((byte) -125);
                          } else {
                            if (var2 != 11 &&
                              12 != var2) {
                              if (var2 == 13) {
                                cb.c(false);
                                return;
                              }
                              if (17 == var2) {
                                this.h(0);
                                return;
                              }
                              if (18 == var2) {
                                ri.a(true);
                                return;
                              }
                              di.a((Throwable) null, 1, "MGS1: " + hj.a((byte) 86));
                              si.a(-106);
                              return;
                            }
                            stackIn_32_0 = (12 == var2);
                            var3 = tb.a(stackIn_32_0, -2);
                            kn.a(var3, (byte) -51);
                          }
                        } else {
                          ff.a(qa.field_a, kj.field_a, rj.field_d, true);
                        }
                      } else {
                        this.g(-18);
                      }
                    }
                  } else {
                    h.b(115);
                  }
                }
              } else {
                ki.a(-15003);
              }
            }
          }
          return;
        }
        di.a((Throwable) null, 1, "MGS2: " + hj.a((byte) 57));
        si.a(-74);
    }

    private final static int a(byte param0, pf param1, pf param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 112) {
            field_v = (String) null;
          }
          var4 = (String) null;
          stackIn_3_0 = j.a(0, -45, false, 0, param1, (String) null, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ob.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int c(boolean param0, boolean param1) {
        if (!param1) {
          this.field_r = -75;
        }
        return this.a(true, true, param0);
    }

    protected ob() {
    }

    static {
        field_v = "Breathe toxic gas as if it were air; the essential purchase for any effluvium miner. Without this, you'll start to choke in seconds.";
        field_n = new String[][]{null, new String[]{"What a wonderful example of the common killer pinniped. On dry land, it's quite slow, but once in the water it's an awe-inspiring predator. It remains vulnerable to explosions, being frozen and being crushed by ice."}};
    }
}
