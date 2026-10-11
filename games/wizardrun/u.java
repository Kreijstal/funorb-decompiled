/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class u extends da {
    private boolean field_B;
    String field_y;
    private int field_w;
    private int field_r;
    private int field_p;
    static String field_u;
    static o field_x;
    private int field_C;
    static String field_o;
    private boolean field_n;
    static wi field_A;
    private long field_s;
    private int field_q;
    private boolean field_t;
    static String field_v;
    private static boolean[] field_z;
    static int[] field_m;
    private int field_l;

    private final int p(int param0) {
        int var2;
        if (this.field_c) {
          return -1;
        }
        if (!h.b(true)) {
          return -1;
        }
        if (param0 != -1) {
          return 31;
        }
        if (t.field_c) {
          return -1;
        }
        var2 = qh.a(pl.a(param0 + 1), this.field_r, this.field_B, -9, nf.a((byte) 125), true);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!ri.field_b) {
            this.a("reconnect", (byte) 126);
          }
          ci.a((byte) -128);
          nj.a(10, bh.field_g, var2);
          t.field_c = true;
          sb.field_c = d.a((byte) 49) + 15000L;
          return var2;
        }
        if (ml.field_t == 11 &&
          nl.field_r == 0) {
          vc.a(260);
        }
        return var2;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, (byte) -124);
        if (!param2) {
          this.field_p = -29;
        }
        if (param4) {
          this.l(110);
        }
        if (param3) {
          this.b((byte) 0);
        }
        if (param1) {
          this.m(28135);
        }
        if (param0) {
          this.k(-120);
        }
    }

    final static ae b(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        ae stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          if (param1 > -117) {
            field_o = (String) null;
          }
          var2_int = param0.length();
          var3 = 0;
          while (true) {
            if (var2_int <= var3) {
              stackIn_12_0 = tl.field_d;
              return stackIn_12_0;
            }
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_9_0 = null;
          return (ae) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("u.SA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(byte param0) {
        field_z[2] = true;
        if (param0 != 0) {
          this.o(46);
        }
    }

    private final void j(int param0) {
        kc.field_G[17] = -1;
        kc.field_G[3] = -1;
        kc.field_G[16] = param0;
        kc.field_G[7] = -1;
        kc.field_G[18] = 1;
        kc.field_G[2] = -2;
        kc.field_G[10] = -1;
        kc.field_G[5] = -1;
        kc.field_G[8] = -2;
        kc.field_G[13] = -1;
        kc.field_G[11] = -1;
        kc.field_G[1] = 16;
        kc.field_G[4] = -1;
        kc.field_G[9] = -1;
        kc.field_G[6] = -2;
        kc.field_G[12] = -1;
    }

    final void c(int param0, boolean param1) {
        int stackIn_26_0 = 0;
        boolean stackIn_106_0 = false;
        int stackIn_108_1 = 0;
        String stackIn_108_2 = null;
        boolean stackIn_109_3;
        int stackIn_139_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = wizardrun.field_H;
        if (null != oa.field_c) {
          if (null == ki.field_E) {
            var6 = pe.e(152);
            var4 = var6.getSize();
            oa.field_c.a((byte) -64, var4.height, var4.width);
          }
          oa.field_c.a(true);
        }
        t.a(-1);
        th.b((byte) -21);
        if (!ta.a((byte) 60) &&
          ml.field_t != 11) {
          ti.a(param0 + 4122);
        }
        if (null != vc.field_K) {
          gi.field_c = vc.field_K.a(-1);
        }
        if (param0 != -4114) {
          this.d((byte) 27);
        }
        if (wj.a(0)) {
          var3 = ih.a((byte) -95) * 1200;
          if (this.field_n ||
            !(ne.a((byte) 28) <= var3) &&
            !(var3 >= mj.a((byte) 53))) {
            this.field_n = false;
            ql.a(-92);
            ci.a((byte) -124);
            nj.a(param0 ^ -4124, df.field_e, 2);
            qh.a(false);
            t.field_c = true;
            sb.field_c = 15000L + d.a((byte) 25);
          }
        }
        if (nl.field_r == -1 ||
          nl.field_r == 0) {
          stackIn_26_0 = (-1 != nl.field_r) ? 0 : 1;
          var3Lifetime1 = stackIn_26_0;
          nl.field_r = ab.c(14326);
          if (var3Lifetime1 != 0 &&
            0 == nl.field_r &&
            11 == ml.field_t &&
            !h.b(true)) {
            vc.a(260);
          }
          if (nl.field_r != -1 &&
            0 != nl.field_r) {
            sb.field_c = d.a((byte) 36) + 15000L;
          }
        }
        if (nl.field_r != -1 &&
          nl.field_r != 0) {
          if (ri.field_a < 10) {
            if (3 != nl.field_r) {
              if (nl.field_r != 4) {
                if (nl.field_r != 2) {
                  if (nl.field_r != 5) {
                    this.a("js5connect", (byte) 126);
                  } else {
                    this.a("outofdate", (byte) 126);
                  }
                } else {
                  this.a("js5connect_full", (byte) 126);
                }
              } else {
                this.a("js5io", (byte) 127);
              }
            } else {
              this.a("js5crc", (byte) 127);
            }
          } else {
            if (ml.field_t >= 10) {
              ci.a((byte) -125);
              if (nl.field_r == 3) {
                nj.a(10, ai.field_r, 256);
              } else {
                if (nl.field_r == 4) {
                  nj.a(10, ld.field_f, 256);
                } else {
                  if (nl.field_r == 2) {
                    nj.a(param0 ^ -4124, ne.field_d, 256);
                  } else {
                    if (nl.field_r == 5) {
                      nj.a(10, ki.field_L, 5);
                    } else {
                      nj.a(param0 + 4124, mi.field_C, 256);
                    }
                  }
                }
              }
              t.field_c = true;
            }
          }
        }
        if ((nl.field_r != -1 &&
          nl.field_r != 0 ||
          h.b(true)) &&
          sb.field_c <= d.a((byte) 22)) {
          t.field_c = false;
          if (-1 != nl.field_r &&
            nl.field_r != 0) {
            nl.field_r = -1;
            oh.a((byte) -117);
          }
        }
        if (nl.field_r == 0 &&
          !h.b(true)) {
          cb.field_c = false;
        }
        if (ri.field_a == 0 &&
          ab.d(param0 + 3988)) {
          ri.field_a = 1;
        }
        if (ri.field_a == 1) {
          if (0 != mh.field_tb) {
            qh.field_c = si.a(46, hj.field_a);
          }
          ub.field_x = l.a(sf.field_g, param0 ^ 1784758027, false, 1, true);
          vj.field_b = l.a(jg.field_o, -1784753947, false, 1, true);
          cc.field_a = l.a(rk.field_n, param0 - 1784749833, false, 1, true);
          bb.field_h = ub.field_x;
          ri.field_a = 2;
          md.field_c = vj.field_b;
        }
        if (ri.field_a == 2) {
          if (qh.field_c != null &&
            qh.field_c.b(17820)) {
            if (!qh.field_c.c(-1, "")) {
              qh.field_c = null;
            } else {
              if (qh.field_c.a((byte) 29, "")) {
                ea.a(0, qh.field_c);
                qh.field_c = null;
                jj.b(param0 + 4114);
              }
            }
          }
          if (null == qh.field_c) {
            ri.field_a = 3;
          }
        }
        if (3 == ri.field_a &&
          of.a(ub.field_x, cc.field_a, (byte) -1, vj.field_b) &&
          lc.a(param0 + 4114, cc.field_a)) {
          pg.a(-382);
          mi.d(3);
          vc.field_M = false;
          dg.field_a = wj.field_G;
          dj.a(param0 ^ -6284, cc.field_a, ub.field_x, vj.field_b, pf.field_g);
          if (rf.field_c ||
            null != l.field_K) {
            stackIn_106_0 = !(rf.field_c);
            stackIn_108_1 = 126;
            stackIn_108_2 = l.field_K;
            stackIn_109_3 = !(rf.field_c);
            ai.$cfr$intArgs$a$87b210a2f664(stackIn_106_0, stackIn_108_1, stackIn_108_2, stackIn_109_3);
          }
          if (mj.field_c) {
            jf.a(param0 ^ -4158);
          }
          if (null == pk.field_n) {
            pk.field_n = sl.d((byte) 126);
            mk.field_f = u.r(8300);
          }
          ec.a(cc.field_a, (byte) -82, mk.field_f, pk.field_n);
          vj.field_b = null;
          cc.field_a = null;
          ub.field_x = null;
          ae.a((java.applet.Applet) (this), param0 ^ -4213);
          jj.b(0);
          ri.field_a = 10;
        }
        if (10 == ri.field_a) {
          if (mh.field_tb != 0) {
            oh.field_b = si.a(90, ni.field_b);
          }
          ri.field_a = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (ri.field_a == 11) {
          if (null != oh.field_b && (!oh.field_b.b(17820) ||
            !oh.field_b.d(-111))) {
            ok.a(de.a(param0 ^ 4150, td.field_e, oh.field_b, bl.field_c), 0.0f, 0);
            decompiledFrameRemainder0 = false;
          }
          else {
            f.field_c = true;
            ri.field_a = 12;
          }
        }
        if (ri.field_a == 12 &&
          !f.field_c) {
          ri.field_a = 13;
        }
        if (13 == ri.field_a) {
          var3Lifetime2 = 1;
          if (null != ih.field_b) {
            stackIn_139_0 = (!ih.field_b.a(true)) ? 0 : 1;
            var3Lifetime2 = stackIn_139_0;
            ok.a(ih.field_b.field_i, ih.field_b.field_k, 0);
          }
          if (var3Lifetime2 != 0) {
            ri.field_a = 20;
          }
        }
        if (!param1 &&
          tj.field_F) {
          ka.a(wizardrun.field_G, 8053);
          this.e(88);
          jf.a(false, wizardrun.field_G);
        }
        if (field_z[8]) {
          di.a(8);
        }
    }

    final static void a(byte param0, wl param1, wl param2) {
        try {
          if (null != param2.field_c) {
            param2.a(false);
          }
          param2.field_c = param1.field_c;
          param2.field_b = param1;
          if (param0 != 74) {
            u.n(-127);
          }
          param2.field_c.field_b = param2;
          param2.field_b.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "u.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void k(int param0) {
        field_z[5] = true;
        if (param0 > -77) {
          u.n(111);
        }
    }

    private final void a(boolean param0, byte param1) {
        field_z[8] = param0;
        field_z[0] = true;
        field_z[17] = true;
        field_z[16] = true;
        field_z[18] = true;
        int var3 = 92 % ((param1 + 62) / 56);
        field_z[3] = true;
        field_z[7] = true;
    }

    private final void q(int param0) {
        int var2 = nk.field_N.f(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + gd.field_c;
        byte[] var5 = new byte[var4];
        if (param0 <= 3) {
          return;
        }
        nk.field_N.a(0, var4, 0, var5);
        sh.a(var3 != 0, 122, nf.a((byte) 113, var5), jg.f(1));
    }

    final static void a(va param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = wizardrun.field_H;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (ub.field_t != null) {
              try {
                ub.field_t.a(0L, (byte) 113);
                ub.field_t.a(var6, 9350);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (0 == var2[var3_int]) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            param0.a(var2, 0, 24, -99);
            if (param1 != -18) {
              u.r(5);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("u.HA(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, String param2) {
        try {
          int var4_int = -125 / ((param1 + 9) / 49);
          this.a(param0, 480, param2, (byte) 19, 640);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "u.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void m(int param0) {
        field_z[4] = true;
        if (param0 != 28135) {
          field_m = (int[]) null;
        }
    }

    private final static int r(int param0) {
        if (param0 != 8300) {
          wl var2 = (wl) null;
          u.$cfr$intArgs$a$894bb1585d61(86, (wl) null, (wl) null);
        }
        return sk.field_v;
    }

    private final void c(byte param0) {
        int var3 = -90 / ((-61 - param0) / 53);
        String var2 = vl.a(-106);
        wl.a(var2, jg.f(1), (byte) -107);
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var10 = null;
          Boolean var11 = null;
          va var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = wizardrun.field_H;
          var4 = ad.a(mh.field_tb, gi.field_c, param1, param0 - 6426);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5_int = mk.a(vf.a((byte) -68), -124, n.a((byte) 12));
            if (var5_int != -1) {
              ni.a(bh.field_g, -101, pd.field_I, var5_int);
              pd.field_I = null;
              bh.field_g = null;
            }
            var11 = df.b((byte) -52);
            if (var11 != null) {
              vg.a(var11.booleanValue(), 3289);
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = qk.a(pl.a(param0 - 6498), this.field_r, nf.a((byte) 123), dg.a(-21), sc.a(0), param0 - 6498, w.c(-126));
            if (var5_intLifetime1 != -1) {
              ve.a(bh.field_g, pd.field_I, (byte) -112, var5_intLifetime1);
              bh.field_g = null;
              pd.field_I = null;
            }
          }
          if (var4 == 3) {
            if (-1 != nl.field_r &&
              nl.field_r != 0) {
              nl.field_r = -1;
              oh.a((byte) -128);
            }
            if (!param2) {
              var5_intLifetime2 = qh.a(pl.a(0), this.field_r, this.field_B, -9, nf.a((byte) 124), false);
              if (var5_intLifetime2 != -1) {
                if (0 == var5_intLifetime2) {
                  h.field_m = pe.field_D;
                  vc.a(260);
                  ml.field_t = 10;
                  qb.field_p = false;
                } else {
                  nj.a(param0 - 6488, bh.field_g, var5_intLifetime2);
                  bh.field_g = null;
                }
              }
            } else {
              t.field_c = false;
            }
          }
          if (var4 == 4) {
            if (pf.field_g) {
              cd.a(jg.f(param0 - 6497), (byte) -113);
            } else {
              qb.field_p = true;
              ml.field_t = 10;
            }
          }
          if (5 == var4) {
            bc.a(125, jg.f(1));
          }
          if (var4 == 6 &&
            vc.field_M) {
            ml.field_t = 10;
          }
          if (var4 == 7) {
            lb.a(param0 - 6438, jg.f(1));
          }
          if (var4 == 8) {
            cd.a(jg.f(1), (byte) -113);
          }
          if (var4 == 9) {
            wg.a(param0 ^ 7600, jg.f(1));
          }
          if (var4 == 10) {
            n.field_b.c((byte) -118, 17);
          }
          if (var4 == 11) {
            ga.a(jg.f(1), (byte) -40);
          }
          if (param0 != 6498) {
            this.l(-45);
          }
          if (var4 == 12) {
            rb.a(jj.a(true), -1926289535, jg.f(1));
          }
          if (var4 == 13) {
            try {
              if (null == cb.field_b) {
                cb.field_b = new ud(ld.field_g, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (cb.field_b.c(81)) {
                var12 = cb.field_b.b(-4);
                if (var12 == null) {
                  gf.b(param0 ^ 6507, (String) null);
                } else {
                  var7 = bi.a(0, var12.field_m, var12.field_k, false);
                  gf.b(9, var7);
                }
                cb.field_b = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              rg.a((Throwable) ((Object) var5), "S1", param0 ^ -6996);
              var10 = (String) null;
              gf.b(9, (String) null);
              cb.field_b = null;
            }
          }
          if (var4 == 15) {
            ml.field_t = 10;
          }
          if (var4 == 16) {
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

    final void b(boolean param0) {
        int stackIn_33_0 = 0;
        boolean stackIn_34_1 = false;
        wc stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        int var2;
        wc var3;
        int var4;
        var4 = wizardrun.field_H;
        if (!param0) {
          field_m = (int[]) null;
        }
        var2 = ra.field_k;
        if (var2 < 64 &&
          field_z[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              if (var2 != 3) {
                if (var2 == 4) {
                  pj.f(-17144);
                } else {
                  if (var2 == 5) {
                    rk.c(-2);
                  } else {
                    if (var2 == 6) {
                      kk.o(-114);
                    } else {
                      if (7 != var2) {
                        if (8 == var2) {
                          mi.a(-21284, nk.field_N, ld.field_g, gd.field_c);
                        } else {
                          if (16 != var2) {
                            if (var2 != 11 &&
                              12 != var2) {
                              if (var2 == 13) {
                                jk.a(true);
                                return;
                              }
                              if (var2 == 17) {
                                this.q(108);
                                return;
                              }
                              if (var2 == 18) {
                                ck.a(2046877441);
                                return;
                              }
                              rg.a((Throwable) null, "MGS1: " + ni.c(6), -562);
                              ql.a(-42);
                              return;
                            }
                            stackIn_33_0 = -2;
                            stackIn_34_1 = (var2 == 12);
                            var3 = cf.a(stackIn_33_0, stackIn_34_1);
                            stackIn_36_0 = var3;
                            stackIn_37_1 = !(param0);
                            sc.a(stackIn_36_0, stackIn_37_1);
                          } else {
                            qi.e(12582);
                          }
                        }
                      } else {
                        this.c((byte) -117);
                      }
                    }
                  }
                }
              } else {
                pd.d(false);
              }
            } else {
              fg.a((byte) 112);
            }
          } else {
            bk.b(124);
          }
          return;
        }
        rg.a((Throwable) null, "MGS2: " + ni.c(6), -562);
        ql.a(-79);
    }

    final int a(byte param0, boolean param1) {
        if (param0 <= 0) {
          return -74;
        }
        return this.a(6498, param1, true);
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        mh.field_tb = this.field_p;
        me.a(mh.field_tb, !param4 ? true : false);
        i.a(mh.field_tb, this.field_l, param6, param1, this.field_q, this.field_s, this.field_w, this.field_y, 5000, 5000, this.field_t, this.field_C, 64, ld.field_g);
        qc.a(this.field_w, param6, this.field_C, ld.field_g, this.field_l, this.field_y, true, this.field_q, mh.field_tb);
        of.d(0);
        vc.field_K = qj.a(param4);
        jf.a(param4, wizardrun.field_G);
        sf.field_g = param7;
        jg.field_o = param2;
        ni.field_b = param3;
        rk.field_n = param0;
        hj.field_a = param5;
        this.j(-1);
        rl.a(-19);
    }

    protected u() {
    }

    public static void n(int param0) {
        field_u = null;
        field_A = null;
        field_x = null;
        field_z = null;
        field_v = null;
        if (param0 != -18084) {
          field_v = (String) null;
        }
        field_m = null;
        field_o = null;
    }

    final int o(int param0) {
        if (param0 != -10618) {
          this.c(88, true);
        }
        int var2 = this.p(-1);
        if (var2 == 0 ||
          var2 == 1) {
          if (field_z[1]) {
            rb.a(2, (byte) -85);
          }
          if (field_z[2]) {
            fh.b(-28323, 3);
          }
          if (field_z[3]) {
            ei.a((byte) 51, 4);
          }
          if (field_z[4]) {
            ud.a(5, param0 ^ 10496);
          }
          if (field_z[5]) {
            oe.a((byte) -86, 6);
          }
          if (field_z[6]) {
            fh.c(7, param0 + 10618);
          }
          if (field_z[8]) {
            gh.a((byte) 99);
          }
        }
        return var2;
    }

    private final void a(int param0, int param1, String param2, byte param3, int param4) {
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
            if (!this.g(param3 ^ -36)) {
              return;
            }
            this.field_y = this.getCodeBase().getHost();
            var6 = this.field_y.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_B = stackIn_8_1;
            this.field_C = Integer.parseInt(this.getParameter("gameport1"));
            this.field_w = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (param3 != 19) {
              field_m = (int[]) null;
            }
            if (var7 != null) {
              this.field_l = Integer.parseInt(var7);
            }
            this.field_q = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_s = Long.parseLong(this.getParameter("instanceid"));
            this.field_t = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_p = Integer.parseInt(var8);
            }
            if (this.field_p >= 5) {
              this.field_p = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_r = Integer.parseInt(var9);
            }
            mj.field_c = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(this.field_q, param0, (byte) -100, param2, param1, param4, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            rg.a((Throwable) ((Object) var6_ref), (String) null, -562);
            this.a("crash", (byte) 127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("u.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void l(int param0) {
        field_z[1] = true;
        if (param0 < 88) {
          u.n(63);
        }
    }

    final void d(byte param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int var2;
        int var3;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        int var2Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var3 = wizardrun.field_H;
        if (!ph.a((byte) 89)) {
          if (ri.field_a < 10) {
            var2 = 95 / ((param0 + 52) / 50);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (w.a((byte) -117)) {
              if (ml.field_t != 0) {
                ac.a(0, gi.field_c);
              } else {
                discarded$5 = this.a(6498, false, false);
              }
            } else {
              qa.c(250);
            }
          }
        } else {
          stackIn_3_1 = 6498;
          stackIn_4_2 = (null != ki.field_E);
          discarded$6 = this.a(stackIn_3_1, stackIn_4_2, false);
        }
        if (decompiledFrameRemainder0) {
          var2Lifetime1 = 95 / ((param0 + 52) / 50);
        }

    }

    static {
        field_o = "The Beach";
        field_m = new int[]{500, 100, 100, 300, 500, 100, 200, 200, 300, 500, 1000, 200};
        field_v = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_z = new boolean[64];
        field_u = "Please wait...";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$894bb1585d61(int param0, wl param1, wl param2) {
        try {
          if (null != param2.field_c) {
            param2.a(false);
          }
          param2.field_c = param1.field_c;
          param2.field_b = param1;
          if (param0 != 74) {
            u.n(-127);
          }
          param2.field_c.field_b = param2;
          param2.field_b.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "u.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
