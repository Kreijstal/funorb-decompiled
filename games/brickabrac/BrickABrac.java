/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class BrickABrac extends sa {
    static mf field_I;
    static String field_G;
    static mk field_F;
    static int[] field_K;
    static String field_H;
    public static boolean field_J;

    public final void a(int param0) {
        int var2;
        kq var3;
        int var4;
        int var5;
        int var6;
        int stackIn_6_0 = 0;
        var6 = field_J ? 1 : 0;
        if (null != hd.field_d) {
          stackIn_6_0 = (lp.field_rb.a((byte) -51)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        if (var2 != 0) {
          if (16 > kh.field_a) {
            lp.field_rb.drawScreen((byte) -75);
            jn.a(kh.field_a + 1, 256, 16769381, false, false);
          } else {
            hd.field_d.drawScreen((byte) -85);
            jn.a(32 - (kh.field_a - 1), 256, 16769381, false, false);
          }
        } else {
          lp.field_rb.drawScreen((byte) -63);
        }
        var3 = (kq) (kp.field_c.first(-123));
        if (param0 != 16769381) {
          field_I = (mf) null;
        }
        if (var3 != null) {
          var5 = ok.field_c;
          if (var5 < 80) {
            var4 = -32 + var5 / 2;
          } else {
            if (230 > var5) {
              var4 = 8;
            } else {
              var4 = 123 - var5 / 2;
            }
          }
          si.field_c[var3.field_p].c(8, var4);
          nn.field_g.c(af.field_s[var3.field_p], 48, var4 + nn.field_g.field_F, 0, -1);
        }
        if (cf.a((byte) 62)) {
          rd.b(-79);
        }
    }

    public final void a(boolean param0, byte param1) {
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        GameScreen stackIn_17_0 = null;
        boolean stackIn_17_1 = false;
        boolean stackIn_18_2 = false;
        int var3;
        int var4;
        int var5;
        pn var6;
        var5 = field_J ? 1 : 0;
        vd.a(-127);
        de.field_x = de.field_x + 1;
        if (!og.h(-26090)) {
          while (true) {
            var6 = (pn) (kq.field_j.removeFirst(3));
            if (var6 == null) {
              break;
            }
            g.a(var6, 5, (byte) -116);
          }
        }
        if (hd.field_d != null) {
          stackIn_10_0 = (lp.field_rb.a((byte) -51)) ? 1 : 0;
        } else {
          stackIn_10_0 = 0;
        }
        var3 = stackIn_10_0;
        if (pe.field_o != lp.field_rb ||
          pe.field_o.field_p ||
          var3 == 0) {
          stackIn_17_0 = lp.field_rb;
          stackIn_17_1 = true;
          stackIn_18_2 = (param0) && (var3 == 0);
          ((GameScreen) (Object) stackIn_17_0).advanceScreen(stackIn_17_1, stackIn_18_2, -104);
        }
        if (var3 != 0) {
          if ((pe.field_o != hd.field_d ||
            pe.field_o.field_p) &&
            hd.field_d != null) {
            hd.field_d.advanceScreen(false, false, -82);
          }
          kh.field_a = kh.field_a + 1;
          if (32 == kh.field_a) {
            sk.i((byte) -126);
          }
        } else {
          if (pe.field_o != null &&
            lp.field_rb != pe.field_o &&
            pe.field_o.field_p) {
            pe.field_o.advanceScreen(false, false, -81);
          }
        }
        if (null != kp.field_c.first(-8)) {
          fieldTemp$0 = ok.field_c + 1;
          ok.field_c = ok.field_c + 1;
          if (fieldTemp$0 == 335) {
            ok.field_c = 0;
            kp.field_c.removeFirst(3);
          }
        }
        if (ok.field_c == 50) {
          wp.a(8, ta.field_e[9]);
        }
        if (cf.a((byte) 62)) {
          sq.a(false);
        }
        var4 = 46 / ((-61 - param1) / 47);
    }

    final void b(boolean param0) {
        this.a((byte) 39, 0, 2, param0, 1, 4, 14, 65);
        hi.field_w = new fo(new int[]{(int)ue.a(false)});
        nk.field_c = new jp(640, 480);
        oc.a(lp.field_ub, (byte) 60, kj.field_D);
        this.a(3160, new ij());
        am.a(ch.field_g, 1);
    }

    final boolean q(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 73) {
          return false;
        }
        stackIn_8_0 = (ue.field_c) || (vh.field_L) || (ed.field_d);
        return stackIn_8_0;
    }

    final boolean a(pi param0, byte param1, int param2) {
        int var8_int = 0;
        int fieldTemp$0 = 0;
        int var10 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        GameplayScreen stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        GameplayScreen stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        GameplayScreen stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        pi stackIn_99_2 = null;
        boolean stackIn_100_3;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_138_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        String[] var5 = null;
        int[] var5_array = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        fo var8 = null;
        int[] var9 = null;
        int var11 = 0;
        oi var12 = null;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var21 = null;
        int[] var23 = null;
        pi var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        String[] var30 = null;
        int[] var32 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var39 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var5_arrayLifetime1;
        int[] var5_arrayLifetime2;
        int[] var5_arrayLifetime3;
        int var6Lifetime1;
        var16 = field_J ? 1 : 0;
        try {
          if (9 == param2) {
            sk.i((byte) -113);
            vh.field_L = false;
            ng.a(false, param1 + 66, 11);
            kk.a(true, param0.d(-1));
            return true;
          }
          if (14 == param2) {
            sk.i((byte) -116);
            hm.a(nc.c(param1 ^ -71), (byte) 86, qh.field_h, mq.c(0), 150, fj.a(2000, (byte) -54), aj.a(1345), fj.a(8, (byte) -53), 1024, jb.field_I.length);
            hn.a(lh.f(115), kb.h(param1 - 45), param1 ^ 12);
            vh.field_L = false;
            ue.field_c = true;
            ng.a(false, 113, -2);
            return true;
          }
          if (param2 == 15) {
            if (ue.field_c) {
              eq.a(7);
              an.d((byte) -56);
              ng.a(false, param1 + 43, 0);
              ue.field_c = false;
              cc.field_G = true;
              dp.field_y = true;
            }
            ed.field_d = false;
            pf.field_p = false;
            vh.field_L = false;
            return true;
          }
          if (param2 == 10 &&
            ue.field_c) {
            sj.a((byte) 33);
            return true;
          }
          if (param2 == 72) {
            var35 = Ball.d(8);
            var27 = var35;
            var4 = var27;
            var18 = var4;
            var5_array = var18;
            var25 = param0;
            var7 = ((wq) ((Object) var25)).l(255);
            for (var8_int = 0; var7 > var8_int; var8_int++) {
              var18[var8_int] = ((wq) ((Object) var25)).e(255);
            }
            var34 = var4;
            var26 = var34;
            var19 = var26;
            var5_arrayLifetime1 = var19;
            var46 = mk.field_b;
            for (var7 = 0; var7 < 8; var7++) {
              var19[var7] = ik.a(var34[var7], ~var46[var7]);
            }
            if (hb.field_y) {
              var5_int = ea.a(true, var35);
              for (var6 = 0; var6 <= var5_int; var6++) {
                if (eo.a(var35, var6, (byte) -75)) {
                  kp.field_c.addLast(new kq(var6), (byte) 3);
                }
              }
            }
            var36 = mk.field_b;
            var28 = var36;
            var21 = var28;
            var5_arrayLifetime2 = var21;
            var47 = var4;
            for (var7 = 0; var7 < 8; var7++) {
              var21[var7] = ud.d(var36[var7], var47[var7]);
            }
            var37 = pl.field_b;
            var29 = var37;
            var23 = var29;
            var5_arrayLifetime3 = var23;
            var48 = var4;
            for (var7 = 0; var7 < 8; var7++) {
              var23[var7] = ud.d(var37[var7], var48[var7]);
            }
            return true;
          }
          if (si.field_a != 64 &&
            65 != si.field_a) {
            if (79 == si.field_a) {
              if (pe.field_o == null) {
                return true;
              }
              if (pe.field_o.field_q) {
                rk.a("T3", (Throwable) null, 44);
              } else {
                fieldTemp$0 = pe.field_o.field_x;
                pe.field_o.field_x = pe.field_o.field_x + 1;
                pe.field_o.match.playerBoards[fieldTemp$0].a(false, param0, pe.field_o.match.playerCount);
                stackIn_74_0 = pe.field_o;
                stackIn_75_1 = (pe.field_o.field_x == pe.field_o.match.playerCount);
                stackIn_74_0.field_q = stackIn_75_1;
                if (pe.field_o.field_q) {
                  if (pe.field_o.c(103)) {
                    return true;
                  }
                  pe.field_o.match.playerBoards[pe.field_o.field_k].field_E = pe.field_o.match.playerBoards[pe.field_o.field_k].simulationTick - 50;
                }
              }
              return true;
            }
            if (66 == si.field_a) {
              if (pe.field_o != null) {
                sk.i((byte) -123);
                if (!pe.field_o.c(123)) {
                  pe.field_o.a((byte) 40, false);
                }
                pe.field_o.a(false, (byte) 69);
                cc.field_G = true;
                pf.field_p = true;
                Brick.field_E = 0;
                ng.a(false, 125, -2);
              }
              ed.field_d = false;
              return true;
            }
            boolean decompiledFrameRemainder0 = true;
            if (null != pe.field_o) {
              if (76 == si.field_a) {
                pe.field_o.a(param0, (byte) 74);
                return true;
              }
              if (73 != si.field_a &&
                si.field_a != 74) {
                if (si.field_a == 75) {
                  pe.field_o.a((byte) 33, param0);
                  return true;
                }
                if (77 == si.field_a) {
                  pe.field_o.a(param0, false, 87);
                  return true;
                }
                if (si.field_a == 78) {
                  pe.field_o.a(param0, true, 118);
                  return true;
                }
                if (si.field_a == 67) {
                  pe.field_o.a(param0, param1 - 47);
                  return true;
                }
                if (si.field_a == 69) {
                  pe.field_o.a(18504, param0);
                  return true;
                }
                if (si.field_a == 70) {
                  pe.field_o.match.field_j = param0.l(255);
                  if (pe.field_o != null) {
                    fr.a(1);
                  }
                  return true;
                }
                decompiledFrameRemainder0 = (si.field_a == 71);
                if (decompiledFrameRemainder0) {
                  pe.field_o.field_v = param0.l(255);
                  if (pe.field_o != null) {
                    fr.a(1);
                  }
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_99_0 = pe.field_o;
                stackIn_99_1 = -15;
                stackIn_99_2 = (pi) (param0);
                stackIn_100_3 = (si.field_a == 74);
                ((GameplayScreen) (Object) stackIn_99_0).a((byte) stackIn_99_1, stackIn_99_2, stackIn_100_3);
                return true;
              }
            }
            if (param1 == 47) {
              return false;
            }
            return true;
          }
          sk.i((byte) -125);
          stackIn_44_0 = (param0.l(255) == 0) ? 0 : 1;
          var4_int = stackIn_44_0;
          var30 = new String[param0.l(255)];
          var5 = var30;
          var6Lifetime1 = param0.b(true);
          for (var7 = 0; var30.length > var7; var7++) {
            var5[var7] = param0.f(255);
          }
          if (var6Lifetime1 < 0) {
            var6Lifetime1 = -2;
          }
          var7 = param0.e(param1 ^ 208);
          var8 = new fo(new int[]{var7});
          var39 = new int[var30.length];
          var32 = var39;
          var9 = var32;
          for (var10 = 0; var10 < var30.length; var10++) {
            var9[var10] = var8.b(105);
          }
          var49 = kk.a(false, tq.field_d.field_i, var8);
          var11 = param0.b(true);
          var12 = new oi(tq.field_d, var49, var11);
          var13 = var8.a(-37880252, 11);
          oa.field_Sb = rd.a(var13, (byte) 19);
          var50 = id.a(var8, false);
          fj.field_Ub = null;
          if (0 <= var6Lifetime1) {
            stackIn_56_0 = 1 << var6Lifetime1;
          } else {
            stackIn_56_0 = 0;
          }
          var15 = stackIn_56_0;
          pe.field_o = new GameplayScreen(true, var4_int != 0, var30, var6Lifetime1, var15, var12, var39, var50);
          stackIn_58_0 = pe.field_o;
          stackIn_59_1 = (param0.l(255) == 0);
          stackIn_58_0.field_q = stackIn_59_1;
          if (!pe.field_o.field_q) {
            pe.field_o.field_x = 0;
          }
          if (si.field_a == 64) {
            i.c((byte) 32);
            fr.a(param1 ^ 46);
          }
          ed.field_d = false;
          r.field_A = false;
          pf.field_p = false;
          ng.a(false, param1 ^ 105, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_137_0 = var4_ref;
          stackIn_137_1 = new StringBuilder().append("BrickABrac.K(");
          if (param0 == null) {
            stackIn_138_2 = "null";
          } else {
            stackIn_138_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_137_0), ((StringBuilder) (Object) stackIn_137_1).append(stackIn_138_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void s(int param0) {
        field_G = null;
        field_H = null;
        if (param0 != -65) {
          BrickABrac.s(10);
        }
        field_K = null;
        field_I = null;
        field_F = null;
    }

    final void p(int param0) {
        int var3;
        var3 = field_J ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        if (lp.field_rb.field_a == 9 &&
          !ib.a(pl.field_b, -1)) {
          ng.a(false, 69, 5);
        } else {
          if (sl.field_z != 2147483647) {
            if (sl.field_z != -2) {
              ng.a(false, param0 + 55, sl.field_z);
            } else {
              cb.b(true);
            }
          }
        }
        dk.h((byte) -64);
    }

    public BrickABrac() {
        sl.field_C = this;
    }

    final void b(int param0, int param1) {
        int var4;
        var4 = field_J ? 1 : 0;
        if (param1 != param0) {
          if (ue.field_c) {
            dp.field_y = true;
            cc.field_G = true;
            if (pe.field_o != null &&
              !pe.field_o.c(param1 + 94)) {
              kk.a(true, sg.field_k);
              ng.a(false, param1 ^ 118, 11);
            } else {
              ng.a(false, 120, 0);
            }
            if (lp.field_rb instanceof km) {
              ((km) (lp.field_rb)).a(false, 0, param1 + 116);
            }
            ue.field_c = false;
          }
          vh.field_L = false;
          ed.field_d = false;
        } else {
          ed.field_d = true;
          vh.field_L = true;
        }
    }

    public final void init() {
        this.a("brickabrac", 15, 1686);
    }

    final void a(boolean param0) {
        rl.b(18);
        if (param0) {
          field_G = (String) null;
        }
        og.d((byte) 107);
    }

    public final boolean a(int param0, char param1, int param2) {
        if (cf.a((byte) 62)) {
          if (param0 == 5) {
            im.field_g = !im.field_g ? true : false;
            return true;
          }
          if (6 == param0) {
            pf.field_f = !pf.field_f ? true : false;
            return true;
          }
          if (param0 == 7) {
            return true;
          }
        }
        if (param2 > -58) {
          this.b(78, 8);
        }
        if (null != hd.field_d) {
          return false;
        }
        return null != lp.field_rb ? lp.field_rb.handleKey(param1, 106, param0) : false;
    }

    final static int c(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != 2048) {
          BrickABrac.s(116);
        }
        if (param1 >= 4096) {
          return param1 < 6144 ? -um.field_j[6144 - param1] : um.field_j[param1 - 6144];
        }
        return 2048 > param1 ? um.field_j[-param1 + 2048] : -um.field_j[-2048 + param1];
    }

    final void d(boolean param0) {
        BrickABrac.s(-65);
        ea.a((byte) -42);
        b.a(true);
        fd.a(0);
        oi.a((byte) 70);
        km.b(-107);
        uk.f((byte) 88);
        ud.f((byte) -115);
        ld.g(-25617);
        la.a((byte) -75);
        v.a(false);
        op.a((byte) -42);
        kq.a((byte) -115);
        NodeDeque.b((byte) 100);
        fo.a(2);
        sc.a(81);
        ue.a((byte) -114);
        pi.o(60);
        ap.a(!param0 ? true : false);
        nh.b(120);
        qg.k(-113);
        nk.a((byte) 121);
        aj.b(-789103103);
        sj.a(11);
        pp.a(0);
        jd.a(0);
        wc.a(100);
        ch.a(20623);
        df.a((byte) 108);
        gh.a(-21727);
        vj.a(true);
        hm.a(8);
        lb.c();
        mc.a(-128);
        tm.a(param0);
        wo.b(78);
        ke.d(19254);
        ad.b(-16637);
        dm.a((byte) 24);
        gk.a(102);
        mf.a(false);
        t.a(-11470);
        wm.a(108);
        wq.h(0);
        wn.c((byte) -41);
        vg.b(13);
        rd.a((byte) 46);
        cn.a(117);
        gb.a(0);
        kd.a(param0);
        fq.a((byte) 15);
        dj.a((byte) 66);
        nb.a(-125);
        s.c(4862);
        wg.a(0);
        qn.b(0);
        ng.a((byte) -49);
        GameScreen.c((byte) -91);
        of.a(-2);
        GameplayScreen.d(81);
        Brick.d(4641);
        IntrusiveNode.a(true);
        mn.f(2);
        tk.a(-2);
        un.a(!param0 ? true : false);
        ie.c(-1);
        wp.a((byte) -117);
        RectangleBody.d((byte) -106);
        MovingBody.a(34);
        CircleBody.d((byte) 97);
        PlayerBoard.d(-2947);
        MotionWaypoint.e(-116);
        BrickMotionPath.b(true);
        ij.c(false);
        cf.a(-12251);
        q.a((byte) -32);
        hh.a(true);
        kk.a(0);
        w.d((byte) 102);
        rj.a(24311);
        bq.a(true);
        fk.a((byte) -94);
        jj.a(true);
        sq.a((byte) -11);
        nl.a(-106);
        re.b((byte) -60);
        ed.a(-104);
        ki.a((byte) 7);
        rb.a((byte) -116);
        jg.a(-54);
        hc.a(-61);
        m.c(2);
        f.a(1);
        hd.a(12);
        cd.a((byte) 65);
        ff.a((byte) 114);
        wh.b(119);
        we.a(-8495);
        sm.a(30000);
        fh.a(-29988);
        ni.d(true);
        fj.e((byte) 33);
        ba.a((byte) -115);
        mh.c((byte) 88);
        br.h(21);
        hj.h(-48);
        nn.a(0);
        am.k(8421504);
        id.h(-56);
        om.d((byte) -32);
        mk.c((byte) 85);
        ce.b(46);
        hn.a(122);
        qc.d(0);
        Ball.c(122);
        il.c(124);
        kc.a(95);
        Paddle.e(-77);
        PowerUp.c(6);
        lj.b(false);
        ScorePopup.a((byte) -73);
        MultiplayerMatch.d(-19537);
        p.b(false);
        vd.a(true);
        dh.a();
        rf.a((byte) 98);
        ObjectHistoryBuffer.a(81);
        aa.b(118);
        ic.a(false);
        ga.a(0);
        rk.d((byte) 21);
        u.a(2);
        oa.h(47);
        gq.d(false);
        sb.a((byte) -102);
        qp.a(false);
        o.b(31583);
        ok.b(-116);
        mo.d(false);
        rh.a(121);
        fc.b(31797);
        fi.d((byte) -31);
        oo.d((byte) -61);
        sn.f(94);
        er.a((byte) -121);
        gi.f(-417029247);
        ip.b(false);
        ai.f(0);
        ci.d((byte) 21);
        td.f(0);
        jk.d((byte) -46);
        dp.f(1);
        qb.f(0);
        qa.d((byte) -119);
        tj.g();
        tn.c(-52);
        ko.a((byte) 117);
        im.a(-32);
        bc.a((byte) -59);
        rp.c(!param0 ? true : false);
        lh.f((byte) -101);
        ah.f(-5);
        lf.g(-118);
        md.g((byte) 121);
        af.f((byte) -106);
        di.a(8070);
        hq.f(550);
        de.g(2);
        ol.f(14529);
        vp.f(0);
        ta.a(0);
        np.a(true);
        rn.b(57);
        mj.b((byte) 124);
        cp.j((byte) -113);
        tb.m(-48);
        bh.n(28);
        lp.o(50);
        dk.a(-11310);
        he.a((byte) 36);
        hk.i((byte) 88);
        qo.h(-106);
        eh.a(-31063);
        ua.a(2);
        ll.a(!param0 ? true : false);
        ek.c(param0);
        kp.a(-68);
        ih.c(-12200);
        kg.b(26679);
        co.b(-70);
        um.a(31292);
        mg.b();
        bk.a();
        dc.a(-9669);
        fr.b((byte) -52);
        sh.a(125);
        fm.a((byte) 68);
        gj.a(-27956);
        mq.b(-30593);
        rm.a(-41);
        uo.a((byte) 66);
        og.d(true);
        so.b((byte) -19);
        rg.a(64);
        kn.a((byte) 90);
        an.c((byte) -93);
        na.k((byte) 84);
        ag.c(false);
        d.g(-66);
        oc.c(-14711);
        ep.a(param0);
        kb.d((byte) 98);
        jl.a(31186);
        bj.i(111);
        jc.a((byte) -17);
        ib.f((byte) -67);
        kh.c(117);
        h.f((byte) -102);
        qm.a((byte) -120);
        pl.a(0);
        od.a(!param0 ? true : false);
        nd.a((byte) 121);
        lm.a(true);
        tl.a(10);
        tc.a();
        ro.a((byte) -102);
        bg.a(6);
        gd.a(!param0 ? true : false);
        rl.a(-18657);
        ei.a(1);
        up.b(3);
        pf.a(0);
        dg.a(-51);
        gr.a((byte) 118);
        fg.a();
        ui.b(1516);
        wd.f(32463);
        to.a(-125);
        si.a(120);
        ka.c((byte) 67);
        hr.g();
        lk.c(2143);
        dl.b(-9125);
        ef.b(10);
        cg.f((byte) -124);
        jo.b(11);
        rq.a((byte) -118);
        hg.a((byte) 19);
        IntHistoryBuffer.a(67108864);
        va.a(-15504);
        jh.a((byte) -123);
        se.a(84);
        pq.a((byte) 118);
        jm.b((byte) 31);
        qq.a();
        bm.a((byte) -116);
        ar.a(-1);
        ma.c(false);
        sf.o(-16124);
        vb.i(80);
        fe.l(98);
        cr.a((byte) 123);
        ri.a((byte) -83);
        lg.j(-2);
        wl.a(2);
        nf.f((byte) -42);
        bf.a(8192);
        k.c((byte) -109);
        go.a(-7393);
        ig.a(12127);
        uf.a((byte) 85);
        dq.a((byte) 89);
        a.h((byte) -128);
        lq.b(true);
        da.e((byte) 102);
        ve.a((byte) 47);
        kj.h(-122);
        jq.c((byte) 56);
        hb.a((byte) 78);
        ug.h(0);
        eq.b(-1);
        vh.a(110);
        qi.j(18724);
        oj.a((byte) -51);
        ji.a(24968);
        gp.b(2);
        sl.f(31434);
        dn.a(1);
        jb.i((byte) -116);
        eo.c(7301);
        c.a(true);
        th.a(125);
        ej.h(928072);
        wi.b((byte) -54);
        ho.a();
        ja.a(2);
        ik.c(-93);
        ae.a((byte) 84);
        wk.a((byte) 127);
        nc.a(0);
        uj.a(true);
        ab.f((byte) -112);
        gn.i(61);
        ac.c(0);
        n.b(-2);
        pg.a(-128);
        pe.a(112);
        pn.a(-17432);
        mp.h(-115);
        eg.a(136);
        sp.a(-241);
        pk.a((byte) -105);
        cq.a((byte) -105);
        hi.c((byte) -93);
        bb.a(false);
        r.d((byte) 91);
        ob.b(-95);
        bd.a(true);
        sk.a(51550);
        l.a((byte) 49);
        po.b(-81);
        al.a(28391);
        e.a(105);
        pa.c(5);
        tq.a(1024);
        oh.a((byte) 83);
        fa.a((byte) -102);
        nj.a(0);
        pb.a((byte) 121);
        me.a(100);
        cm.b((byte) -121);
        eb.a(false);
        ii.a(20888);
        ck.a(30850);
        nq.a((byte) -77);
        fp.c(false);
        vq.h(-257);
        oq.h((byte) -34);
        jf.a(false);
        i.d(0);
        cc.g(6);
        bl.h((byte) -124);
        lc.a(32156);
        ec.a(0);
        tf.a(6);
        ln.a((byte) -46);
        qh.a(109);
        pj.d(31366);
        ml.a((byte) 111);
        be.b(2);
        fl.f(-90);
        g.b(true);
        sg.e((byte) 124);
        uc.g(0);
        cb.f(-71);
        mi.a(-81);
        gg.a((byte) -25);
        lo.a((byte) 38);
        this.field_x = null;
    }

    static {
        field_G = "Change display name";
        field_H = "<%0>: <%1>";
    }
}
