/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Pool extends NetworkGameClient {
    static kf[] field_N;
    static long field_Q;
    static nm field_I;
    static String potBallsInAnyOrderFinishOnBlack;
    static int[] field_L;
    static vh field_P;
    static String muChatLobbyHide;
    static rk field_J;
    public static int field_O;

    private final void a(boolean param0, int param1) {
        int fieldTemp$0 = 0;
        PoolMatchController stackIn_26_0 = null;
        boolean stackIn_27_1 = false;
        PoolMatchController stackIn_32_0 = null;
        boolean stackIn_33_1 = false;
        PoolMatchController stackIn_91_0;
        PoolMatchController stackIn_91_1;
        int stackIn_91_2;
        int stackIn_91_3;
        int stackIn_91_4;
        int stackIn_91_5;
        int stackIn_91_6;
        PoolMatchController stackIn_92_0 = null;
        PoolMatchController stackIn_92_1 = null;
        boolean stackIn_92_7 = false;
        int stackIn_95_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_98_2 = 0;
        PoolMatchController stackIn_105_0;
        PoolMatchController stackIn_105_1;
        int stackIn_105_2;
        int stackIn_105_3;
        int stackIn_105_4;
        int stackIn_105_5;
        int stackIn_105_6;
        PoolMatchController stackIn_106_0 = null;
        PoolMatchController stackIn_106_1 = null;
        boolean stackIn_106_7 = false;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_109_2 = 0;
        int stackIn_117_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_120_2 = 0;
        PoolMatchController stackIn_127_0;
        PoolMatchController stackIn_127_1;
        int stackIn_127_2;
        int stackIn_127_3;
        int stackIn_127_4;
        int stackIn_127_5;
        int stackIn_127_6;
        PoolMatchController stackIn_128_0 = null;
        PoolMatchController stackIn_128_1 = null;
        boolean stackIn_128_7 = false;
        int stackIn_131_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_134_2 = 0;
        int var3_int;
        String var3;
        int var4;
        PoolMatchController var4_ref_uf;
        int var5;
        int var6;
        String[] var7;
        String[] var8;
        String[] var9;
        String[] var10;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime1Lifetime1;
        var6 = field_O;
        if (me.field_o != me.field_s) {
          if (th.field_b == me.field_s) {
            uk.field_m = uk.field_m + 1;
            if (uk.field_m == 16) {
              if (nm.field_c) {
                ab.a(param1 + 0);
              } else {
                o.c((byte) 60);
              }
              me.field_s = PlasmaTableScene.field_V;
            }
          } else {
            if (PlasmaTableScene.field_V != me.field_s) {
              uk.field_m = uk.field_m - 1;
              if (uk.field_m == 0) {
                me.field_s = me.field_o;
              }
            } else {
              if (!hk.b(param1 + 16)) {
                if (null != ti.field_d) {
                  ml.a(25756, ti.field_d, 3);
                }
                ra.a((byte) -108);
                GameRules.field_b = eo.field_Ub;
                if (nm.field_c) {
                  nm.field_c = false;
                  qr.a(-28038, false);
                }
                if (bl.field_x) {
                  fq.a(-3405, -4, GameRules.field_b, false);
                  bl.field_x = false;
                }
                if (dn.a(true, GameRules.field_b)) {
                  PoolGameModel.l(41);
                }
              }
              me.field_s = aa.field_d;
            }
          }
        } else {
          var3_int = 0;
          var4 = 0;
          if (!param0) {
            if (GameRules.field_b != ne.field_w) {
              sg.field_P = sg.field_P + 1;
              ih.a((byte) 46);
              if (sg.field_P == 32) {
                PoolGameModel.l(param1 - 128);
              }
            } else {
              if (ne.field_w != -1) {
                if (ne.field_w == -2) {
                  var3_int = 1;
                } else {
                  if (dn.a(true, ne.field_w)) {
                    s.field_c[ne.field_w].d(-1);
                  }
                }
              } else {
                if (!td.field_d) {
                  ba.field_ub.a(false, true, (byte) -9);
                  while (n.h(127)) {
                    ba.field_ub.p((byte) 101);
                  }
                } else {
                  var4 = 1;
                  var3_int = 1;
                }
              }
            }
          }
          if (td.field_d &&
            !ub.field_p &&
            !br.field_H) {
            if (ib.field_v &&
              DualLinkNode.field_p) {
              var3_int = 0;
            }
            i.a(10, var3_int != 0);
            if (mj.field_e) {
              stackIn_26_0 = am.field_e;
              stackIn_27_1 = (0 != fl.field_q.field_R);
              ((PoolMatchController) (Object) stackIn_26_0).a(stackIn_27_1, var4 != 0, (byte) -118);
            }
            if (ib.field_v) {
              ie.a(180, var4 != 0, param1 - 17156, 320);
              stackIn_32_0 = ba.field_ub;
              stackIn_33_1 = (fl.field_q.field_R != 0);
              ((PoolMatchController) (Object) stackIn_32_0).a(stackIn_33_1, var4 != 0, (byte) -108);
            }
            while (n.h(127)) {
              if (un.field_b) {
                if (ib.field_v) {
                  if (KillerRules.a(15, 12, -1, 13)) {
                    continue;
                  }
                } else {
                  pa.a(false, 15, 13, 12);
                }
              }
              if (mj.field_e) {
                am.field_e.p((byte) 94);
              }
              if (!ib.field_v) {
                continue;
              }
              ba.field_ub.p((byte) 81);
            }
          }
          if (!td.field_d) {
            mj.a(true);
          }
          if (!un.field_b) {
            if (eq.field_U > 0) {
              eq.field_U = eq.field_U - 1;
            }
          } else {
            if (ir.field_h > eq.field_U) {
              eq.field_U = eq.field_U + 1;
            }
          }
          fn.b(5938, eq.field_U);
          if (null != ui.field_U.c((byte) 99)) {
            fieldTemp$0 = aa.field_h + 1;
            aa.field_h = aa.field_h + 1;
            if (fieldTemp$0 == 335) {
              aa.field_h = 0;
              ui.field_U.e((byte) -41);
            }
          }
        }
        if (-3 == GameRules.field_b) {
          ti.field_d = null;
          var7 = new String[fr.field_n];
          var9 = var7;
          for (var4Lifetime1 = 0; var4Lifetime1 < fr.field_n; var4Lifetime1++) {
            var7[var4Lifetime1] = jo.playerNs[var4Lifetime1];
          }
          stackIn_91_0 = null;
          stackIn_91_1 = null;
          stackIn_91_2 = oj.field_m;
          stackIn_91_3 = la.field_a;
          stackIn_91_4 = er.field_W;
          stackIn_91_5 = re.field_f;
          stackIn_91_6 = re.field_f;
          if (un.field_e != 0) {
            stackIn_92_0 = null;
            stackIn_92_1 = null;
            stackIn_92_7 = false;
          } else {
            stackIn_92_0 = null;
            stackIn_92_1 = null;
            stackIn_92_7 = true;
          }
          ba.field_ub = new PoolMatchController(stackIn_91_2, stackIn_91_3, stackIn_91_4, stackIn_91_5, stackIn_91_6, stackIn_92_7, var9, 0, false);
          stackIn_95_0 = (!jd.field_a) ? 0 : 1;
          var4Lifetime1Lifetime1 = stackIn_95_0;
          stackIn_97_0 = param1 - 3405;
          stackIn_97_1 = -1;
          if (mg.a(true)) {
            stackIn_98_2 = 21;
          } else {
            stackIn_98_2 = 0;
          }
          fq.a(stackIn_97_0, stackIn_97_1, stackIn_98_2, var4Lifetime1Lifetime1 != 0);
          jc.field_c = true;
        }
        if (GameRules.field_b == -7) {
          ti.field_d = null;
          var8 = new String[fr.field_n];
          var10 = var8;
          for (var4Lifetime2 = 0; var4Lifetime2 < fr.field_n; var4Lifetime2++) {
            var8[var4Lifetime2] = jo.playerNs[var4Lifetime2];
          }
          stackIn_105_0 = null;
          stackIn_105_1 = null;
          stackIn_105_2 = oj.field_m;
          stackIn_105_3 = la.field_a;
          stackIn_105_4 = er.field_W;
          stackIn_105_5 = re.field_f;
          stackIn_105_6 = re.field_f;
          if (un.field_e != 0) {
            stackIn_106_0 = null;
            stackIn_106_1 = null;
            stackIn_106_7 = false;
          } else {
            stackIn_106_0 = null;
            stackIn_106_1 = null;
            stackIn_106_7 = true;
          }
          var4_ref_uf = new PoolMatchController(stackIn_105_2, stackIn_105_3, stackIn_105_4, stackIn_105_5, stackIn_105_6, stackIn_106_7, var10, 0, false);
          var4_ref_uf.field_I.a(ga.a(512, true, ea.field_r), -1, 0, (ba.field_ub.field_I.field_A + 1) % fr.field_n, param1 ^ 19063);
          ba.field_ub = var4_ref_uf;
          var5 = jd.field_a ? 1 : 0;
          stackIn_108_0 = -3405;
          stackIn_108_1 = -1;
          if (mg.a(true)) {
            stackIn_109_2 = 21;
          } else {
            stackIn_109_2 = 0;
          }
          fq.a(stackIn_108_0, stackIn_108_1, stackIn_109_2, var5 != 0);
          jc.field_c = true;
        }
        if (GameRules.field_b == -6) {
          ti.field_d = null;
          var3 = di.field_j;
          if (var3 == null) {
            var3 = vq.youPlayer;
          }
          ba.field_ub = new PoolMatchController(vh.field_Ab, new String[]{var3});
          stackIn_117_0 = (!jd.field_a) ? 0 : 1;
          var4Lifetime3 = stackIn_117_0;
          stackIn_119_0 = param1 - 3405;
          stackIn_119_1 = -1;
          stackIn_120_2 = (mg.a(true)) ? 21 : 0;
          fq.a(stackIn_119_0, stackIn_119_1, stackIn_120_2, var4Lifetime3 != 0);
          jc.field_c = true;
        }
        if (GameRules.field_b == -8) {
          ti.field_d = null;
          var3 = di.field_j;
          if (var3 == null) {
            var3 = vq.youPlayer;
          }
          stackIn_127_0 = null;
          stackIn_127_1 = null;
          stackIn_127_2 = f.field_f;
          stackIn_127_3 = -1;
          stackIn_127_4 = 4;
          stackIn_127_5 = 0;
          stackIn_127_6 = 0;
          if (un.field_e != 0) {
            stackIn_128_0 = null;
            stackIn_128_1 = null;
            stackIn_128_7 = false;
          } else {
            stackIn_128_0 = null;
            stackIn_128_1 = null;
            stackIn_128_7 = true;
          }
          ba.field_ub = new PoolMatchController(stackIn_127_2, stackIn_127_3, stackIn_127_4, stackIn_127_5, stackIn_127_6, stackIn_128_7, new String[]{var3}, 0, false);
          stackIn_131_0 = (!jd.field_a) ? 0 : 1;
          var4Lifetime4 = stackIn_131_0;
          stackIn_133_0 = -3405;
          stackIn_133_1 = -1;
          stackIn_134_2 = (!mg.a(true)) ? 0 : 21;
          fq.a(stackIn_133_0, stackIn_133_1, stackIn_134_2, var4Lifetime4 != 0);
          jc.field_c = true;
        }
        if (GameRules.field_b == -4) {
          ej.field_j.b(false, 9);
          ub.field_p = true;
          GameRules.field_b = ne.field_w;
          eq.field_U = ir.field_h;
        }
        if (GameRules.field_b == -5) {
          nf.a(em.field_L.g(20872), true, 11);
          GameRules.field_b = ne.field_w;
          br.field_H = true;
        }
        if (param1 != 0) {
          field_Q = -123L;
        }
    }

    public static void c(boolean param0) {
        field_L = null;
        field_P = null;
        muChatLobbyHide = null;
        field_J = null;
        field_N = null;
        field_I = null;
        if (param0) {
          muChatLobbyHide = (String) null;
        }
        potBallsInAnyOrderFinishOnBlack = null;
    }

    final void a(byte param0) {
        int stackIn_49_0 = 0;
        boolean stackIn_50_1 = false;
        int var3_int;
        bq var3;
        int var4_int;
        long var4;
        int var5;
        long var6;
        int var8;
        int var9;
        int var10;
        java.awt.Canvas var11;
        int var3_intLifetime1;
        int var4_intLifetime1;
        int var4_intLifetime2;
        var10 = field_O;
        var11 = vj.a((byte) -126);
        if (ue.a((byte) -123)) {
          fo.a((byte) -55, fq.m(0), var11);
          return;
        }
        if (!rm.field_d) {
          ModelTableScene.a(true, var11);
          return;
        }
        if (param0 != 120) {
          return;
        }
        if (!PoolMatchController.d(false)) {
          fo.a(cf.loadingExtradata, 100.0f, false);
          ModelTableScene.a(true, var11);
          return;
        }
        if (!de.field_g &&
          ne.field_w != GameRules.field_b) {
          if (ne.field_w == -2) {
            PlasmaBallSkin.a(GameRules.field_b, -21972, false, jc.field_c);
            var3_int = 32 - sg.field_P;
            pn.field_l.a(0, 0, (var3_int << 8) / 32);
          } else if (-2 == GameRules.field_b) {
            PlasmaBallSkin.a(ne.field_w, -21972, false, TranslatedUiText.field_d);
            pn.field_l.a(0, 0, (sg.field_P << 8) / 32);
          } else {
            var3_int = dp.a(sg.field_P, 32, 108);
            SoftwareRasterizer.setClip(0, 0, var3_int, SoftwareRasterizer.height);
            TriangleRasterizer.useRasterClip();
            TriangleRasterizer.setProjectionCenter(320, 240);
            PlasmaBallSkin.a(GameRules.field_b, -21972, false, jc.field_c);
            SoftwareRasterizer.setClip(var3_int, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            TriangleRasterizer.useRasterClip();
            TriangleRasterizer.setProjectionCenter(320, 240);
            PlasmaBallSkin.a(ne.field_w, -21972, false, TranslatedUiText.field_d);
            SoftwareRasterizer.resetClip();
            TriangleRasterizer.useRasterClip();
            nn.a(true, 32, sg.field_P);
          }
        } else {
          PlasmaBallSkin.a(ne.field_w, -21972, true, TranslatedUiText.field_d);
        }
        if (!TranslatedUiText.field_d ||
          !jc.field_c) {
          if (GameRules.field_b == ne.field_w &&
            ne.field_w == -2) {
            pn.field_l.a(0, 0);
          }
          hr.a(cp.a((byte) 79), (byte) 50);
        }
        if (de.field_g) {
          if (ne.field_w < 0) {
            SoftwareRasterizer.clear();
          } else {
            s.field_c[ne.field_w].c(87);
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
          }
          var3_intLifetime1 = SoftwareRasterizer.width - 400 >> 1;
          var4_int = SoftwareRasterizer.height - 140 >> 1;
          nj.a(rm.field_g, (byte) 14, 400, var3_intLifetime1, var4_int, 140);
          FreePlayRules.field_e.drawParagraph(kh.field_gc.field_l, 20 + var3_intLifetime1, 20 + var4_int, 360, 64, 1, -1, 1, 1, 0);
          SoftwareRasterizer.fillRectangle(20 + var3_intLifetime1, -20 + (140 + (var4_int - 20)), 360, 20, 0);
          SoftwareRasterizer.fillRectangle(20 + (var3_intLifetime1 + 2), -20 + (140 + var4_int) - 18, kh.field_gc.field_H * 356 / (kh.field_gc.field_G - 1), 16, 16615680);
        }
        var3 = (bq) (ui.field_U.c((byte) -102));
        if (var3 != null) {
          var5 = aa.field_h;
          if (var5 < 80) {
            var4_intLifetime1 = -32 + var5 / 2;
          } else {
            if (var5 >= 230) {
              var4_intLifetime1 = 123 - var5 / 2;
            } else {
              var4_intLifetime1 = 8;
            }
          }
          IsaacCipher.field_f[var3.field_l].drawScaled(8, var4_intLifetime1, 32, 32);
          FreePlayRules.field_e.d(md.achievementNames[var3.field_l], 48, var4_intLifetime1 + FreePlayRules.field_e.maxAscent, 4, 1);
        }
        if (bj.c(1)) {
          SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
          hq.h(-29322);
        }
        if (ue.a(param0 - 109)) {
          stackIn_49_0 = -82;
          if (null == ne.field_u) {
            stackIn_50_1 = um.field_e;
          } else {
            stackIn_50_1 = true;
          }
          ok.a(stackIn_49_0, stackIn_50_1);
        } else {
          if (md.a((byte) -84) &&
            !bj.c(1)) {
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            hk.c(1527590113);
          }
        }
        if (me.field_o != me.field_s) {
          var4_intLifetime2 = uk.field_m * 256 / 16;
          if (var4_intLifetime2 > 0) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var4_intLifetime2);
          }
        }
        if ((32L & pd.field_i) != 0L) {
          sa.field_h.d(Integer.toString(un.field_g), 640 - sa.field_h.maxAscent * 2, 475 - sa.field_h.maxDescent, 16777215, 1);
        }
        if ((pd.field_i & 64L) != 0L) {
          var4 = Runtime.getRuntime().totalMemory();
          var6 = Runtime.getRuntime().freeMemory();
          var8 = (int)(var4 - var6) / 1024;
          var9 = (int)(var4 / 1024L);
          sa.field_h.d(var8 + "/" + var9, -((sa.field_h.maxAscent + sa.field_h.maxDescent) * 4) + (640 - 2 * sa.field_h.maxAscent), -((sa.field_h.maxDescent + sa.field_h.maxAscent) * 3 / 2) - 5 + 480 - sa.field_h.maxDescent, 16777215, 1);
        }
        fe.a(0, 0, (byte) 85, var11);
        return;
    }

    final void h(byte param0) {
        Pool.c(false);
        TriangleRasterizer.releaseStatics();
        dp.c(param0 ^ -3723);
        bq.c((byte) -101);
        IntrusiveDeque.d(-102);
        ab.b(-75);
        il.a(param0 ^ 41);
        l.a(19545);
        o.e(116);
        md.a(true);
        hp.a((byte) -71);
        BallSkin.d(-22799);
        jk.b((byte) -93);
        ag.a(0);
        TableScene.l(-15631);
        TikiTableScene.m(112);
        PolarTableScene.e((byte) 76);
        ob.d((byte) 107);
        pj.b(false);
        fo.a(-1);
        ra.a(false);
        ta.b(24470);
        pk.a((byte) 101);
        NetworkGameClient.a(true);
        ClientException.a(param0 ^ -28);
        GameApplet.g((byte) -77);
        ej.a(true);
        MouseHandler.a((byte) -109);
        id.a((byte) 35);
        SoftwareRasterizer.releaseStatics();
        di.e(0);
        PacketBuffer.e(4109);
        rl.a(-125);
        lf.a((byte) 112);
        wb.a((byte) 118);
        kc.a((byte) 123);
        dq.a((byte) 80);
        a.a(0);
        bi.a(0);
        hn.b(param0 + 39);
        m.a((byte) -69);
        pn.a(param0 ^ -28);
        ol.a(param0 ^ -1430775244);
        sb.a((byte) 124);
        kb.a((byte) 111);
        iq.a(-26830);
        rb.a((byte) 126);
        od.a(255);
        hr.c(-44);
        no.b(117);
        rn.b(10);
        qd.a((byte) 84);
        ir.a((byte) -42);
        BufferedSocket.a(true);
        s.a(-1);
        d.a((byte) -110);
        ek.a((byte) -107);
        fc.a((byte) -43);
        vh.e((byte) 8);
        hh.a(28882);
        hg.b(false);
        c.a(-13679);
        eg.f();
        BitmapFont.a();
        cf.a(param0 + 28774);
        PoolMatchController.c(true);
        TranslatedUiText.d(param0 + 28);
        IntrusiveNode.b((byte) 115);
        vk.c(-819201);
        IterableNodeHashTable.a((byte) 91);
        MidiFileReader.g();
        ib.d(-1);
        AudioOutput.c();
        rq.c((byte) 75);
        cb.a(param0 + 28583);
        ic.a(-512);
        kh.g((byte) -124);
        tk.b((byte) -109);
        im.f((byte) -48);
        ae.a((byte) -26);
        tc.a(false);
        aa.a((byte) -5);
        de.b(-1);
        th.a(15059);
        cl.a((byte) -76);
        uc.b((byte) 112);
        aq.a(false);
        pl.a(param0 - 23306);
        ShotRecord.d((byte) 114);
        HalloweenBallSkin.a((byte) -27);
        gf.a(true);
        lk.a(-24061);
        gp.a(63);
        hq.i(5);
        PoolGameModel.b(10);
        kj.b(param0 ^ 9401);
        oq.c(true);
        mm.c(-13569);
        or.a(false);
        IsaacCipher.a(param0 ^ 81);
        Ball.b((byte) -66);
        CushionSegment.c((byte) 77);
        Pocket.b(false);
        GameRules.d(13);
        jq.a(false);
        ia.g(80);
        ad.a(20592);
        oh.a((byte) -92);
        lh.a((byte) -41);
        je.a((byte) -125);
        lq.g((byte) -47);
        fq.l(param0 + 33);
        wa.n(7585);
        ba.k(-124);
        qq.n((byte) -86);
        nf.h((byte) 4);
        nr.a(20868);
        ui.a(-31360);
        jp.a(false);
        ke.a(false);
        mj.a((byte) -83);
        ii.a(127);
        nc.e();
        p.b(75);
        ec.a((byte) 116);
        mk.a(0);
        Quaternion.a(param0 + 144);
        ModelTableScene.d((byte) 117);
        so.c(param0 ^ -9943);
        SpriteState.c((byte) 11);
        DualLinkNode.c(-3604);
        jc.a(param0 ^ -28);
        bh.a(false);
        wg.f(-1);
        db.h((byte) 118);
        vq.f(126);
        ao.d(true);
        kn.c((byte) -116);
        of.f(param0 + 28);
        wm.f((byte) -93);
        vi.b(-115);
        da.b((byte) 108);
        uo.f((byte) -102);
        vn.a(true);
        fh.a((byte) 62);
        td.a((byte) 86);
        rk.a(false);
        jh.a(21546);
        tp.a(0);
        bb.a((byte) -118);
        nm.a(false);
        gd.a(-2182);
        w.a(62);
        ue.b(false);
        wn.a(true);
        jj.i(100);
        uj.a((byte) 33);
        fn.g(56);
        ll.a(-69);
        gn.a(1);
        jl.a((byte) 43);
        tf.a(param0 ^ -91);
        re.a(param0 ^ 17031);
        wd.f(-1);
        aj.c(false);
        ij.a(param0 - 273542787);
        en.a(param0 ^ -8380);
        v.a((byte) 126);
        ho.a(true);
        ff.a((byte) 87);
        dr.a(11468);
        t.c(param0 ^ 88);
        mq.a(false);
        NineBallRules.b(false);
        um.a(116);
        ef.b(1);
        ah.a(false);
        un.a((byte) -101);
        ModernTableScene.e((byte) 71);
        PlasmaTableScene.m(param0 - 100);
        SpaceTableScene.e((byte) -116);
        ClassicBallSkin.i(1);
        nn.a(param0 + 16034);
        PlasmaBallSkin.i(120);
        TikiBallSkin.i(10860);
        PolarBallSkin.i(param0 ^ -20);
        KillerBallSkin.i(85);
        pi.b();
        be.f((byte) -89);
        pa.g(param0 - 73);
        jo.f(8);
        lb.g(-79);
        em.g(-126);
        tl.g(0);
        b.f((byte) -90);
        el.b(false);
        br.b(false);
        hd.b(true);
        cm.g((byte) 74);
        sg.f(param0 ^ -506724219);
        og.f((byte) -103);
        ug.h(param0 ^ 80);
        DualLinkDeque.a(true);
        np.a(true);
        dg.c((byte) -80);
        up.a(true);
        pp.a((byte) -25);
        gr.f(-121);
        f.a((byte) 105);
        gk.i((byte) -82);
        am.a((byte) 119);
        VorbisSample.releaseStatics();
        oc.c(-47);
        bc.a((byte) -8);
        bo.b((byte) 45);
        wf.a(25131);
        mg.a((byte) -44);
        cq.a((byte) -90);
        cn.b((byte) 38);
        qg.a(0);
        wi.b(-30521);
        mb.c(4);
        Bzip2Decoder.a();
        uq.a(-8090);
        ja.a(726237729);
        PoolUiText.a(param0 ^ 32);
        hl.a(false);
        lg.a(true);
        vd.a(-1);
        nd.a((byte) -108);
        if (param0 != -28) {
          field_P = (vh) null;
        }
        op.b(0);
        ei.c((byte) 80);
        fe.f((byte) 72);
        ud.a(param0 ^ -80);
        tj.h((byte) -16);
        oe.h(-1);
        ch.f(2);
        rp.a((byte) 13);
        VorbisFloor1.releaseStatics();
        cp.b(true);
        hf.a(0);
        wp.a(0);
        la.a(param0 ^ -115);
        qp.h(param0 ^ 99);
        ee.a((byte) -70);
        wh.a((byte) -62);
        sf.e(param0 - 89);
        ap.c((byte) -111);
        fg.a((byte) 0);
        SocketConnector.a(param0 + 16885);
        lo.c(param0 + 149);
        hk.c((byte) 122);
        jf.c(2);
        pc.a(-24420);
        dj.a(true);
        ld.c(8);
        SoundTone.a();
        te.c((byte) 127);
        e.a(true);
        q.a(101);
        ci.a((byte) 8);
        ti.a(param0 ^ 20983);
        EightBallRules.h((byte) -75);
        KillerRules.d((byte) -104);
        g.a(5893);
        kp.a(104);
        FreePlayRules.d((byte) -105);
        TimeTrialRules.p(-9);
        sn.a((byte) -119);
        co.a(true);
        fm.g(16);
        rf.a(false);
        n.g((byte) -85);
        sl.i((byte) 23);
        ok.i((byte) -45);
        gj.a(true);
        mp.a(160);
        lc.g((byte) -69);
        ck.a(-110);
        ri.a(param0 + 117);
        ig.a((byte) 122);
        rm.a((byte) -20);
        sd.a(122);
        er.g((byte) 121);
        va.a(2);
        rc.a(true);
        eq.i(-12253);
        ih.a(param0 + 133);
        ve.c(-13268);
        hi.f(125);
        wj.h(-34);
        k.h(120);
        uk.a(param0 - 69);
        qi.b(14676);
        kk.f(1);
        hj.a((byte) -103);
        fd.i(param0 ^ -28);
        ProxySocketConnector.c(15296);
        AudioFilter.a();
        sk.a(param0 ^ -27);
        hb.a(0);
        mn.a(19000);
        eh.a(param0 + 136);
        oj.a(-19382);
        tg.a(-10562);
        ea.d((byte) 124);
        kf.a(-1);
        vm.a(false);
        bj.a(param0 - 4275);
        ng.d(-1);
        pd.a(true);
        om.c((byte) -37);
        sm.c(2);
        j.a(16);
        sh.g((byte) 118);
        eo.f((byte) -105);
        we.a((byte) -110);
        gi.a(true);
        tq.a(param0 ^ -28);
        i.c((byte) 73);
        qr.a((byte) 83);
        nl.a(-54);
        fr.c((byte) 69);
        PotEvent.c((byte) 90);
        dn.a(param0 - 2020);
        ro.a(240);
        bk.a(-5917);
        df.b((byte) 115);
        ph.a(false);
        wc.a(72);
        wk.h(-124);
        ar.a(10);
        pm.c(0);
        tn.c((byte) 5);
        ml.a(-26458);
        se.b(param0 - 1431655738);
        ub.a(true);
        ca.b(17518);
        dk.a((byte) 113);
        ji.a(false);
        jd.a((byte) 79);
        bl.a(127);
        qf.a(true);
        he.a(param0 ^ 23);
        fl.a(59);
        oi.c((byte) -124);
        ln.a(param0 ^ -27827);
        kg.d((byte) -103);
        pf.a((byte) 8);
        vj.b(param0 ^ 27721);
        sa.a(param0 - 13237);
        na.a((byte) 43);
        gg.e(-1);
        ua.h(-110);
        uh.b(true);
        r.b((byte) 113);
        me.b(true);
        ka.b(true);
        ne.b((byte) 15);
        cd.a(param0 ^ -94);
        qa.c((byte) 33);
        ie.a((byte) -13);
        this.field_t = null;
    }

    final void d(byte param0) {
        this.a(5, 19, 0, 2, 1, false, 61, 1);
        vk var3 = new vk();
        sg.a((java.awt.Component) ((Object) pa.field_K), var3, 22050, lg.field_s, 10282, true);
        this.a(param0 ^ 45, false, true, true, true, false, true);
        r.field_m[78] = 8;
        re.field_f = of.field_Lb[2];
        la.field_a = of.field_Lb[0];
        r.field_m[73] = 1;
        r.field_m[75] = 5;
        r.field_m[77] = 1;
        r.field_m[79] = 0;
        r.field_m[74] = -1;
        r.field_m[64] = -2;
        r.field_m[67] = 7;
        r.field_m[65] = -2;
        r.field_m[69] = 1;
        fr.field_n = 2;
        if (param0 != -46) {
          this.init();
        }
        r.field_m[76] = 8;
        r.field_m[68] = 9;
        un.field_e = of.field_Lb[3];
        r.field_m[71] = 1;
        r.field_m[10] = -1;
        r.field_m[70] = 1;
        r.field_m[72] = 1;
        er.field_W = of.field_Lb[1];
        r.field_m[9] = -1;
        ClientException.field_g = ek.a(-95);
        hp.field_c = ek.a(5);
    }

    private final void m(byte param0) {
        if (GameApplet.field_m != null) {
          PoolUiText.a(GameApplet.field_m, -8);
          GameApplet.field_m = null;
          fm.a(0);
        }
        if (param0 > -103) {
          this.d((byte) -93);
        }
        fh.field_b = fh.a(3, (byte) 103);
        cp.field_a = fh.a(4, (byte) 103);
        hr.field_q = fh.a(6, (byte) 103);
        Ball.field_z = fh.a(7, (byte) 103);
        fg.field_d = fh.a(8, (byte) 103);
        he.field_b = fh.a(9, (byte) 103);
        gf.field_g = fh.a(10, (byte) 103);
        jc.field_a = fh.a(11, (byte) 103);
        s.field_a = fh.a(12, (byte) 103);
        NetworkGameClient.field_F = fh.a(13, (byte) 103);
        rl.field_h = fh.a(18, (byte) 103);
        sh.a(sd.field_R, (byte) -32, qp.field_Zb);
    }

    private final void k(int param0) {
        int var6_int = 0;
        int var7_int = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        PoolMatchController stackIn_57_0;
        PoolMatchController stackIn_57_1;
        int stackIn_57_2;
        int stackIn_57_3;
        int stackIn_57_4;
        int stackIn_57_5;
        int stackIn_57_6;
        PoolMatchController stackIn_58_0 = null;
        PoolMatchController stackIn_58_1 = null;
        boolean stackIn_58_7 = false;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_102_2 = 0;
        Object var2;
        int var2_int;
        int var3;
        int var4;
        oq var4_ref_oq;
        int[] var4_ref_int__;
        Object var4_ref;
        int var5;
        String[] var6;
        PoolMatchController var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        Object var13;
        int[] var14;
        Object var15;
        int[] var16;
        int[] var17;
        Object var18;
        Object var19;
        Object var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int var3Lifetime1;
        int var3Lifetime2;
        int var5Lifetime1;
        Object var2Lifetime1;
        Object var4_refLifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        var8 = field_O;
        if (param0 != 3) {
          field_Q = -116L;
        }
        while (true) {
          if (!rk.a(0, r.field_m)) {
            rq.a((byte) -20, 0);
            return;
          }
          if (uq.field_c == 9) {
            PoolGameModel.l(-124);
            ub.field_p = false;
            GameRules.field_b = 20;
            ng.field_B = kn.field_e.j(-49);
            continue;
          }
          if (uq.field_c == 14) {
            PoolGameModel.l(-124);
            mk.a(hh.a((byte) 1), 1024, nf.g((byte) 103), 150, te.field_p, te.a(-17931, 8), te.a(-17931, 2000), SpaceTableScene.f(true), 4, 13162);
            rp.a(im.f(0), db.f((byte) 13), -36);
            ub.field_p = false;
            un.field_b = true;
            td.field_d = true;
            GameRules.field_b = -2;
            ib.field_r = 0;
            continue;
          }
          if (15 == uq.field_c) {
            if (td.field_d) {
              PoolGameModel.l(param0 - 127);
              lq.a(true);
              IntrusiveDeque.g((byte) 74);
              GameRules.field_b = 0;
              mj.field_e = false;
              vq.field_Sb = true;
              td.field_d = false;
              jc.field_c = false;
              ib.field_v = false;
              l.field_a = true;
              am.b(120);
            }
            ub.field_p = false;
            br.field_H = false;
            continue;
          }
          if (uq.field_c == 10 &&
            td.field_d) {
            rl.b(param0 ^ 70);
            continue;
          }
          if (uq.field_c == 74) {
            var22 = ek.a(-8);
            var17 = var22;
            var2 = var17;
            var9 = (int[]) var2;
            var4_ref_oq = kn.field_e;
            var5 = ((PacketBuffer) ((Object) var4_ref_oq)).readUnsignedByte(-100);
            for (var6_int = 0; var6_int < var5; var6_int++) {
              var9[var6_int] = ((PacketBuffer) ((Object) var4_ref_oq)).readInt(true);
            }
            var10 = (int[]) var2;
            var21 = ClientException.field_g;
            var16 = var21;
            var11 = var16;
            var4_ref_int__ = var11;
            for (var5Lifetime2 = 0; var5Lifetime2 < 8; var5Lifetime2++) {
              var10[var5Lifetime2] = rb.b(var10[var5Lifetime2], ~var21[var5Lifetime2]);
            }
            if (em.field_K) {
              for (var3 = 0; var3 < md.achievementNames.length; var3++) {
                if (fe.a(var22, param0 ^ -13670, var3)) {
                  ui.field_U.b((byte) -3, new bq(var3));
                }
              }
            }
            var12 = ClientException.field_g;
            var23 = (int[]) var2;
            var18 = var23;
            var13 = var18;
            var4_ref = var13;
            for (var5Lifetime3 = 0; 8 > var5Lifetime3; var5Lifetime3++) {
              var12[var5Lifetime3] = md.a(var12[var5Lifetime3], var23[var5Lifetime3]);
            }
            var14 = hp.field_c;
            var24 = (int[]) var2;
            var19 = var24;
            var15 = var19;
            var4_refLifetime1 = var15;
            for (var5Lifetime4 = 0; var5Lifetime4 < 8; var5Lifetime4++) {
              var14[var5Lifetime4] = md.a(var14[var5Lifetime4], var24[var5Lifetime4]);
            }
            continue;
          }
          if (uq.field_c != 65 &&
            uq.field_c != 64) {
            if (uq.field_c == 66) {
              if (ib.field_v ||
                mj.field_e) {
                PoolGameModel.l(param0 + 108);
                if (ib.field_v) {
                  ba.field_ub.c(param0 ^ 259, false);
                }
                mj.field_e = false;
                GameRules.field_b = -2;
                ib.field_r = 0;
                jc.field_c = false;
                ib.field_v = false;
                vq.field_Sb = true;
                un.field_b = true;
                am.b(116);
              }
              br.field_H = false;
              continue;
            }
            var2Lifetime1 = null;
            if (!ib.field_v) {
              if (mj.field_e) {
                var2Lifetime1 = am.field_e;
              }
            } else {
              var2Lifetime1 = ba.field_ub;
            }
            if (var2Lifetime1 != null) {
              if (uq.field_c == 79) {
                ((PoolMatchController) (var2Lifetime1)).g(true);
                continue;
              }
              if (uq.field_c == 67) {
                ((PoolMatchController) (var2Lifetime1)).b(kn.field_e, false);
                continue;
              }
              if (uq.field_c == 68) {
                ((PoolMatchController) (var2Lifetime1)).a(kn.field_e, 0);
                continue;
              }
              if (uq.field_c == 76) {
                ((PoolMatchController) (var2Lifetime1)).a(kn.field_e, false);
                continue;
              }
              if (uq.field_c == 78) {
                ((PoolMatchController) (var2Lifetime1)).b(69, kn.field_e);
                continue;
              }
              if (uq.field_c == 75) {
                ((PoolMatchController) (var2Lifetime1)).a(96, kn.field_e);
                continue;
              }
              if (uq.field_c == 77) {
                ((PoolMatchController) (var2Lifetime1)).d(4096, kn.field_e);
                continue;
              }
              if (uq.field_c == 69) {
                var3Lifetime1 = kn.field_e.readByte((byte) 105);
                ((PoolMatchController) (var2Lifetime1)).field_I.c(param0 - 14289, var3Lifetime1);
                if (((PoolMatchController) (var2Lifetime1)).field_db == var3Lifetime1) {
                  kh.field_gc.a(17, 256, (byte) -121, 128);
                } else {
                  kh.field_gc.a(18, 256, (byte) -114, 128);
                }
                var20 = var2Lifetime1;
                stackIn_101_0 = -3405;
                stackIn_101_1 = -1;
                if (mg.a(true)) {
                  stackIn_102_2 = 21;
                } else {
                  stackIn_102_2 = 0;
                }
                fq.a(stackIn_101_0, stackIn_101_1, stackIn_102_2, false);
                ((PoolMatchController) (var20)).a(-23095);
                if ((f.field_f & ((PoolMatchController) (var20)).field_L) == 0) {
                  continue;
                }
                ne.field_w = 23;
                GameRules.field_b = 23;
                continue;
              }
              if (uq.field_c == 70) {
                ((PoolMatchController) (var2Lifetime1)).field_I.field_x = kn.field_e.readUnsignedByte(param0 ^ -92);
                if (ba.field_ub == null) {
                  continue;
                }
                IterableNodeHashTable.a(false);
                continue;
              }
              if (uq.field_c == 71) {
                ((PoolMatchController) (var2Lifetime1)).field_I.field_p = kn.field_e.readUnsignedByte(param0 - 63);
                ((PoolMatchController) (var2Lifetime1)).field_I.field_x = ((PoolMatchController) (var2Lifetime1)).field_I.field_x & ~((PoolMatchController) (var2Lifetime1)).field_I.field_p;
                continue;
              }
              if (uq.field_c == 72) {
                ((PoolMatchController) (var2Lifetime1)).field_I.field_b = kn.field_e.readUnsignedByte(param0 - 119);
                if (ba.field_ub == null) {
                  continue;
                }
                ModernTableScene.f((byte) -119);
                continue;
              }
              if (73 == uq.field_c) {
                ((PoolMatchController) (var2Lifetime1)).field_cb = kn.field_e.readUnsignedByte(-105);
                ((PoolMatchController) (var2Lifetime1)).field_I.field_b = ((PoolMatchController) (var2Lifetime1)).field_I.field_b & ~((PoolMatchController) (var2Lifetime1)).field_cb;
                if (null == ba.field_ub) {
                  continue;
                }
                ModernTableScene.f((byte) -119);
                continue;
              }
            }
            this.f(15000);
            continue;
          }
          PoolGameModel.l(param0 ^ -126);
          kn.field_e.p(8);
          var2_int = kn.field_e.e(4, 52);
          if (var2_int == 15) {
            var2_int = -2;
          }
          la.field_a = kn.field_e.e(3, param0 ^ 38);
          er.field_W = kn.field_e.e(2, 104);
          re.field_f = kn.field_e.e(3, 66);
          var3Lifetime2 = kn.field_e.e(3, 78);
          un.field_e = kn.field_e.e(1, 70);
          stackIn_49_0 = (kn.field_e.e(1, 21) != 1) ? 0 : 1;
          var4 = stackIn_49_0;
          stackIn_52_0 = (kn.field_e.e(1, 111) != 1) ? 0 : 1;
          var5Lifetime1 = stackIn_52_0;
          kn.field_e.o(8);
          var6 = new String[kn.field_e.readUnsignedByte(param0 ^ -70)];
          for (var7_int = 0; var7_int < var6.length; var7_int++) {
            var6[var7_int] = kn.field_e.a(cq.a(param0, 10761));
          }
          ti.field_d = null;
          stackIn_57_0 = null;
          stackIn_57_1 = null;
          stackIn_57_2 = hq.field_c;
          stackIn_57_3 = la.field_a;
          stackIn_57_4 = er.field_W;
          stackIn_57_5 = re.field_f;
          stackIn_57_6 = var3Lifetime2;
          if (un.field_e != 0) {
            stackIn_58_0 = null;
            stackIn_58_1 = null;
            stackIn_58_7 = false;
          } else {
            stackIn_58_0 = null;
            stackIn_58_1 = null;
            stackIn_58_7 = true;
          }
          var7 = new PoolMatchController(stackIn_57_2, stackIn_57_3, stackIn_57_4, stackIn_57_5, stackIn_57_6, stackIn_58_7, var6, var2_int, var4 != 0);
          var7.c(16915, kn.field_e);
          if (65 != uq.field_c) {
            mj.field_e = true;
            am.field_e = var7;
          } else {
            ib.field_v = true;
            ba.field_ub = var7;
            IterableNodeHashTable.a(false);
            ModernTableScene.f((byte) -119);
            kj.a((byte) -109);
          }
          br.field_H = false;
          if (var5Lifetime1 != 0) {
            var7.field_S = -1;
          }
          jc.field_c = true;
          GameRules.field_b = -1;
        }
    }

    public Pool() {
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (ea.field_z) {
          return sg.field_J.a(-81, qi.field_a, ml.field_b);
        }
        if (fm.field_H) {
          return tf.a(15585, param2, param1);
        }
        if (oj.a(param1, param2, -10)) {
          return true;
        }
        if (param3 != -80) {
          Pool.a(122, -100, -91, -77);
        }
        if (hr.field_y) {
          return false;
        }
        return th.a(param1, param3 + 174, param0);
    }

    final void e(byte param0) {
        boolean discarded$0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_29_1 = false;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_76_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        i var6;
        int var3Lifetime1;
        var5 = field_O;
        nj.a(-21055);
        wk.field_P = sk.a((byte) 64);
        uq.a((byte) -92);
        if (ne.field_u != null &&
          ne.field_u.field_e) {
          tq.d((byte) -127);
          k.g((byte) 96);
        }
        stackIn_5_1 = -4;
        stackIn_6_2 = (null != ne.field_u);
        this.c(stackIn_5_1, stackIn_6_2);
        if (od.field_c) {
          this.m((byte) -125);
          od.field_c = false;
        }
        eo.field_Tb = eo.field_Tb + 1;
        var2 = 56 / ((param0 - 29) / 60);
        if (ue.a((byte) -84)) {
          this.l((byte) -75);
          if (ue.a((byte) -111)) {
            if (!gg.a(true)) {
              return;
            }
            discarded$0 = this.d(95, false);
            return;
          }
        }
        if (!rm.field_d) {
          ln.a(0, wp.field_d);
          if (this.d(82, true)) {
            rm.field_d = true;
          }
        } else {
          if (!PoolMatchController.d(false)) {
            ro.b(-26);
          } else {
            if (!bj.c(1)) {
              if (!ue.a(11)) {
                if (!md.a((byte) -122)) {
                  if (!de.field_g) {
                    this.a(false, 0);
                  } else {
                    kh.field_gc.j(2);
                    fm.a(0);
                    if (kh.field_gc.field_G == kh.field_gc.field_H) {
                      kh.field_gc.d(16);
                      de.field_g = false;
                    }
                  }
                } else {
                  if (me.field_s != me.field_o) {
                    this.a(false, 0);
                  } else {
                    var3 = tl.h(8);
                    if (var3 == 1) {
                      bl.field_x = true;
                      TranslatedUiText.a(pl.pleaselogin, 0, (byte) 88);
                    }
                    this.a(true, 0);
                  }
                }
              } else {
                stackIn_29_1 = (null != ne.field_u);
                var3 = this.a(stackIn_29_1, false);
                if (1 != var3 &&
                  var3 != 2) {
                  this.a(true, 0);
                } else {
                  if (ne.field_u != null) {
                    tq.d((byte) -101);
                  }
                  if (var3 != 2) {
                    this.a(true, 0);
                  } else {
                    tk.a(-1, hk.d(72));
                    this.a(true, 0);
                  }
                }
              }
            } else {
              if (me.field_s == me.field_o) {
                var3 = SpaceTableScene.n(-1);
                if (2 != var3) {
                  if (var3 != 3) {
                    if (var3 == 4) {
                      nm.field_c = true;
                      TranslatedUiText.a(jc.pleaseloginMember, 0, (byte) 78);
                    }
                    this.a(true, 0);
                  } else {
                    nm.field_c = false;
                    qr.a(-28038, true);
                    this.a(true, 0);
                  }
                } else {
                  tq.d((byte) -104);
                  this.a(true, 0);
                }
              } else {
                this.a(false, 0);
              }
            }
          }
        }
        if (!hk.b(-119)) {
          while (true) {
            var6 = (i) (ad.field_l.e((byte) -41));
            if (var6 == null) {
              break;
            }
            aa.a(false, var6, 4);
          }
        }
        this.k(3);
        if (un.field_b) {
          ib.field_r = 0;
        }
        if (pk.b((byte) 109)) {
          var3Lifetime1 = this.k((byte) -125);
          if (var3Lifetime1 == 0 ||
            var3Lifetime1 == 1) {
            rq.c(946);
            if (var3Lifetime1 != 1) {
              if (td.field_d) {
                vq.field_Sb = true;
                l.field_a = true;
                jc.field_c = false;
                if (!ib.field_v) {
                  stackIn_75_0 = -3405;
                  stackIn_75_1 = 0;
                  if (!mg.a(true)) {
                    stackIn_76_2 = 0;
                  } else {
                    stackIn_76_2 = 21;
                  }
                  fq.a(stackIn_75_0, stackIn_75_1, stackIn_76_2, false);
                } else {
                  ng.field_B = ui.textRemovedFromGame;
                  stackIn_71_0 = -3405;
                  stackIn_71_1 = 20;
                  if (!mg.a(true)) {
                    stackIn_72_2 = 0;
                  } else {
                    stackIn_72_2 = 21;
                  }
                  fq.a(stackIn_71_0, stackIn_71_1, stackIn_72_2, false);
                }
                PoolGameModel.l(-127);
                s.field_c[ne.field_w].a(0, 0, false);
                td.field_d = false;
                ib.field_v = false;
                mj.field_e = false;
                am.b(116);
              }
              br.field_H = false;
              ub.field_p = false;
            } else {
              br.field_H = true;
              ub.field_p = true;
            }
          }
          var4 = 0;
          if (var3Lifetime1 == 2) {
            var4 = 1;
          }
          if (td.field_d ||
            ub.field_p ||
            br.field_H) {
            var4 = 1;
          }
          if (!pk.b((byte) 109)) {
            var4 = 0;
          }
          if (var4 != 0) {
            de.c(11);
          }
        }
    }

    public final void init() {
        this.a(640, "pool", 480, 0, 20);
    }

    final void c(byte param0) {
        eq.j((byte) -78);
        if (param0 != -39) {
          this.a((byte) -29);
        }
        if (null != ne.field_u) {
          tq.d((byte) -116);
        }
        cd.a((byte) 60);
    }

    private final boolean d(int param0, boolean param1) {
        int var3;
        PolarTableScene var4;
        int var6;
        di var7;
        String var8;
        String var9;
        di var10;
        String var11;
        String var12;
        di var13;
        String var14;
        String var15;
        di var16;
        String var17;
        String var18;
        di var19;
        String var20;
        String var21;
        di var22;
        String var23;
        String var24;
        di var25;
        String var26;
        String var27;
        di var28;
        String var29;
        String var30;
        di var31;
        String var32;
        String var33;
        di var34;
        String var35;
        String var36;
        di var37;
        String var38;
        String var39;
        di var40;
        String var41;
        String var42;
        di var43;
        String var44;
        String var45;
        di var46;
        String var47;
        String var48;
        di var49;
        String var50;
        String var51;
        di var52;
        String var53;
        String var54;
        di var55;
        String var56;
        String var57;
        di var58;
        String var59;
        String var60;
        di var61;
        String var62;
        String var63;
        String var64;
        Object var65;
        TikiTableScene var65_ref;
        String var66;
        String var67;
        String var68;
        String var69;
        String var70;
        int var3Lifetime1;
        int var3Lifetime2;
        var65 = null;
        var6 = field_O;
        da.a(-99);
        if (fg.field_d == null) {
          if (he.field_b != null) {
            var66 = cq.unpackingSoundeffects;
            fo.a(var66, (float)w.field_i[20], false);
            this.a((byte) 120);
            he.field_b = null;
            fm.a(0);
            return false;
          }
          if (jc.field_a != null) {
            var67 = KillerBallSkin.unpackingMusic;
            fo.a(var67, (float)w.field_i[21], false);
            this.a((byte) 120);
            HalloweenBallSkin.field_m = cg.a(jc.field_a, "", "title");
            jh.field_d = cg.a(jc.field_a, "", "title_next_door");
            for (var3 = 0; var3 < nn.field_b.length; var3++) {
              nn.field_b[var3].a(1, jc.field_a);
            }
            jc.field_a = null;
            fm.a(0);
            return false;
          }
          if (null != gf.field_g) {
            var68 = KillerBallSkin.unpackingMusic;
            fo.a(var68, (float)w.field_i[22], false);
            this.a((byte) 120);
            tl.field_N.a(qg.field_g, gf.field_g, HalloweenBallSkin.field_m, 75, 0);
            tl.field_N.a(qg.field_g, gf.field_g, jh.field_d, 95, 0);
            for (var3Lifetime2 = 0; var3Lifetime2 < nn.field_b.length; var3Lifetime2++) {
              nn.field_b[var3Lifetime2].a(3, qg.field_g, gf.field_g);
            }
            tl.field_N.a(true);
            gf.field_g = null;
            qg.field_g = null;
            fm.a(0);
            return false;
          }
          if (qp.field_Zb != null) {
            var69 = NineBallRules.unpackingGraphics;
            fo.a(var69, (float)w.field_i[23], false);
            this.a((byte) 120);
            FreePlayRules.field_e = sk.a(Ball.field_z, 32362, "", "font", hr.field_q);
            sa.field_h = he.a(sd.field_R, "", 0, qp.field_Zb, "arialish12");
            ModernTableScene.field_Z = he.a(sd.field_R, "", 0, qp.field_Zb, "arialbold14");
            id.field_c = new jk();
            id.field_c.a(2);
            cf.a(0, hr.field_q);
            of.a((byte) 27, rl.field_h);
            mm.field_j = pf.a("basic", (byte) 83, "locked", sd.field_R);
            ua.field_r = pf.a("basic", (byte) 122, "unachieved", sd.field_R);
            om.field_u = pf.a("basic", (byte) 60, "orbcoin", sd.field_R);
            ig.a(ua.field_r, (byte) -12);
            ig.a(om.field_u, (byte) -12);
            dq.field_k = new Sprite(32, 32);
            dq.field_k.e();
            om.field_u.a(0, 0, 32, 32);
            sh.field_P.b(15100);
            om.field_u = null;
            SpriteState.a((byte) -72, true, of.field_Lb, sd.field_R, cp.field_a, 2, PoolUiText.field_c, 4, qp.field_Zb, s.gameoptlabels, nn.field_a, ve.field_q, r.field_n, te.field_p, ff.field_f);
            KillerBallSkin.field_n = pf.a("", (byte) 121, "lobby_game_logo", hr.field_q);
            we.field_m = ml.field_h;
            DualLinkNode.field_s = true;
            Pocket.field_j = PolarBallSkin.field_m;
            wj.a(200, -77);
            ec.a(0, 0, 37, vd.textBenefits, (java.applet.Applet) (this), 16777215);
            qp.field_Zb = null;
            Ball.field_z = null;
            fm.a(0);
            return false;
          }
          if (param0 < 56) {
            this.h((byte) 13);
          }
          if (fh.field_b != null) {
            kp.a(new rk(fh.field_b.a(false, "huffman", "")), (byte) -92);
            fh.field_b = null;
            fm.a(0);
            return false;
          }
          if (null != s.field_a) {
            var70 = lc.unpackingModels;
            fo.a(var70, (float)w.field_i[24], false);
            this.a((byte) 120);
            hr.a(s.field_a, 0);
            s.field_a = null;
            fm.a(0);
            return false;
          }
          md.a(32);
          eq.i((byte) 124);
          ne.field_w = 0;
          GameRules.field_b = 0;
          cq.a(4313);
          ee.a(50, -74);
          tl.field_N.a((byte) -125, -1, 256);
          ij.field_u = HalloweenBallSkin.field_m;
          tl.field_N.a(HalloweenBallSkin.field_m, 8821, true);
          uk.a(FreePlayRules.field_e.field_L, 8, sa.field_h.maxDescent + sa.field_h.field_L, 240, FreePlayRules.field_e.field_L + FreePlayRules.field_e.maxDescent, 2, vk.field_y[0].field_z + 5, 5 + vk.field_y[0].field_A, 8, 480, 3, rm.field_g, -23994, sa.field_h, 4, 13421772, sa.field_h.field_L, 320, vk.field_y, rm.field_g, FreePlayRules.field_e);
          PlasmaBallSkin.a(240, vk.field_y[0].field_A + 5, rm.field_g, 8, rm.field_g, 4, 8, FreePlayRules.field_e, 5 + vk.field_y[0].field_z, 2, vk.field_y, -1373633266, 2, 3, 320);
          fm.a(0);
          return true;
        }
        if (sd.field_R.d(-62) &&
          sd.field_R.a("arialbold14", 0)) {
          if (sd.field_R.d(-64) &&
            sd.field_R.a("arialish12", 0)) {
            if (qp.field_Zb.d(48) &&
              qp.field_Zb.a("arialbold14", 0)) {
              if (qp.field_Zb.d(123) &&
                qp.field_Zb.a("arialish12", 0)) {
                if (sd.field_R.d(107) &&
                  sd.field_R.a("basic", 0)) {
                  if (sd.field_R.d(-43) &&
                    sd.field_R.a("lobby", 0)) {
                    if (qp.field_Zb.d(-47) &&
                      qp.field_Zb.a("lobby", 0)) {
                      if (fg.field_d.d(79) &&
                        fg.field_d.c(-63)) {
                        if (he.field_b.d(105) &&
                          he.field_b.c(-63)) {
                          if (gf.field_g.d(-50) &&
                            gf.field_g.c(-63)) {
                            if (jc.field_a.d(-114) &&
                              jc.field_a.c(-63)) {
                              if (hr.field_q.d(-43) &&
                                hr.field_q.a("", 0)) {
                                if (rl.field_h.d(-90) &&
                                  rl.field_h.a("", 0)) {
                                  if (Ball.field_z.d(120) &&
                                    Ball.field_z.a("", 0)) {
                                    if (fh.field_b.d(-76) &&
                                      fh.field_b.c(-63)) {
                                      if (cp.field_a.d(-90) &&
                                        cp.field_a.c(-63)) {
                                        if (s.field_a.d(-116) &&
                                          s.field_a.c(-63)) {
                                          if (NetworkGameClient.field_F.d(-118) &&
                                            NetworkGameClient.field_F.c(-63)) {
                                            if (!param1) {
                                              var61 = NetworkGameClient.field_F;
                                              var62 = de.waitingforExtradata;
                                              var63 = cf.loadingExtradata;
                                              fo.a(hp.a(var61, var62, -641, var63), (float)(w.field_i[18] + (w.field_i[19] - w.field_i[18]) * var61.b(0) / 100), false);
                                              return false;
                                            }
                                            ue.a(true);
                                            var64 = cq.unpackingSoundeffects;
                                            fo.a(var64, (float)w.field_i[19], false);
                                            this.a((byte) 120);
                                            wi.a(true);
                                            qg.field_g = new cf(fg.field_d, he.field_b);
                                            il.field_c[0] = qg.field_g.a("interface_mouseover_menuitems", true, "");
                                            il.field_c[1] = qg.field_g.a("interface_music_level_change", true, "");
                                            il.field_c[2] = qg.field_g.a("interface_SFX_level_change_chalk", true, "");
                                            il.field_c[3] = qg.field_g.a("interface_select_ballroll_transition", true, "");
                                            for (var3Lifetime1 = 0; var3Lifetime1 < nn.field_b.length; var3Lifetime1++) {
                                              nn.field_b[var3Lifetime1].a(qg.field_g, 124);
                                            }
                                            if (2 < nn.field_b.length) {
                                              var65_ref = (TikiTableScene) (nn.field_b[2]);
                                              var4 = (PolarTableScene) (nn.field_b[3]);
                                              var4.field_X = var65_ref.field_mb;
                                              var4.field_bb = var65_ref.field_bb;
                                              var4.field_hb = var65_ref.field_S;
                                              var4.field_Y = var65_ref.field_rb;
                                            }
                                            fg.field_d = null;
                                            fm.a(0);
                                            return false;
                                          }
                                          var58 = NetworkGameClient.field_F;
                                          var59 = de.waitingforExtradata;
                                          var60 = cf.loadingExtradata;
                                          fo.a(hp.a(var58, var59, -641, var60), (float)(w.field_i[18] + (-w.field_i[18] + w.field_i[19]) * var58.b(0) / 100), false);
                                          return false;
                                        }
                                        var55 = s.field_a;
                                        var56 = de.waitingforExtradata;
                                        var57 = cf.loadingExtradata;
                                        fo.a(hp.a(var55, var56, -641, var57), (float)(w.field_i[17] + (w.field_i[18] - w.field_i[17]) * var55.b(0) / 100), false);
                                        return false;
                                      }
                                      var52 = cp.field_a;
                                      var53 = de.waitingforExtradata;
                                      var54 = cf.loadingExtradata;
                                      fo.a(hp.a(var52, var53, -641, var54), (float)(w.field_i[16] + (-w.field_i[16] + w.field_i[17]) * var52.b(0) / 100), false);
                                      return false;
                                    }
                                    var49 = fh.field_b;
                                    var50 = de.waitingforExtradata;
                                    var51 = cf.loadingExtradata;
                                    fo.a(hp.a(var49, var50, -641, var51), (float)(w.field_i[15] + (w.field_i[16] - w.field_i[15]) * var49.b(0) / 100), false);
                                    return false;
                                  }
                                  var46 = Ball.field_z;
                                  var48 = SpaceTableScene.waitingforFonts;
                                  var47 = kb.loadingFonts;
                                  fo.a(dk.a((byte) -21, "", var46, var47, var48), (float)(w.field_i[14] + (w.field_i[15] - w.field_i[14]) * var46.a(100, "") / 100), false);
                                  return false;
                                }
                                var43 = rl.field_h;
                                var45 = rp.waitingforGraphics;
                                var44 = oj.loadingGraphics;
                                fo.a(dk.a((byte) -1, "", var43, var44, var45), (float)(w.field_i[13] + (w.field_i[14] - w.field_i[13]) * var43.a(100, "") / 100), false);
                                return false;
                              }
                              var40 = hr.field_q;
                              var42 = rp.waitingforGraphics;
                              var41 = oj.loadingGraphics;
                              fo.a(dk.a((byte) 119, "", var40, var41, var42), (float)(w.field_i[12] + (w.field_i[13] - w.field_i[12]) * var40.a(100, "") / 100), false);
                              return false;
                            }
                            var37 = jc.field_a;
                            var38 = aj.waitingforMusic;
                            var39 = mm.loadingMusic;
                            fo.a(hp.a(var37, var38, -641, var39), (float)(w.field_i[11] + (w.field_i[12] - w.field_i[11]) * var37.b(0) / 100), false);
                            return false;
                          }
                          var34 = gf.field_g;
                          var35 = aj.waitingforMusic;
                          var36 = mm.loadingMusic;
                          fo.a(hp.a(var34, var35, -641, var36), (float)(w.field_i[10] + (-w.field_i[10] + w.field_i[11]) * var34.b(0) / 100), false);
                          return false;
                        }
                        var31 = he.field_b;
                        var32 = rk.waitingforSoundeffects;
                        var33 = mq.loadingSoundeffects;
                        fo.a(hp.a(var31, var32, -641, var33), (float)(w.field_i[9] + (-w.field_i[9] + w.field_i[10]) * var31.b(0) / 100), false);
                        return false;
                      }
                      var28 = fg.field_d;
                      var29 = rk.waitingforSoundeffects;
                      var30 = mq.loadingSoundeffects;
                      fo.a(hp.a(var28, var29, -641, var30), (float)(w.field_i[8] + (w.field_i[9] - w.field_i[8]) * var28.b(0) / 100), false);
                      return false;
                    }
                    var25 = qp.field_Zb;
                    var27 = SpaceTableScene.waitingforFonts;
                    var26 = kb.loadingFonts;
                    fo.a(dk.a((byte) 118, "lobby", var25, var26, var27), (float)(w.field_i[7] + (-w.field_i[7] + w.field_i[8]) * var25.a(100, "lobby") / 100), false);
                    return false;
                  }
                  var22 = sd.field_R;
                  var24 = rp.waitingforGraphics;
                  var23 = oj.loadingGraphics;
                  fo.a(dk.a((byte) 122, "lobby", var22, var23, var24), (float)(w.field_i[6] + (-w.field_i[6] + w.field_i[7]) * var22.a(100, "lobby") / 100), false);
                  return false;
                }
                var19 = sd.field_R;
                var21 = rp.waitingforGraphics;
                var20 = oj.loadingGraphics;
                fo.a(dk.a((byte) 101, "basic", var19, var20, var21), (float)(w.field_i[5] + (w.field_i[6] - w.field_i[5]) * var19.a(100, "basic") / 100), false);
                return false;
              }
              var16 = qp.field_Zb;
              var18 = SpaceTableScene.waitingforFonts;
              var17 = kb.loadingFonts;
              fo.a(dk.a((byte) -116, "arialish12", var16, var17, var18), (float)(w.field_i[4] + (-w.field_i[4] + w.field_i[5]) * var16.a(100, "arialish12") / 100), false);
              return false;
            }
            var13 = qp.field_Zb;
            var15 = SpaceTableScene.waitingforFonts;
            var14 = kb.loadingFonts;
            fo.a(dk.a((byte) -61, "arialbold14", var13, var14, var15), (float)(w.field_i[3] + (-w.field_i[3] + w.field_i[4]) * var13.a(100, "arialbold14") / 100), false);
            return false;
          }
          var10 = sd.field_R;
          var12 = rp.waitingforGraphics;
          var11 = oj.loadingGraphics;
          fo.a(dk.a((byte) -17, "arialish12", var10, var11, var12), (float)(w.field_i[2] + (-w.field_i[2] + w.field_i[3]) * var10.a(100, "arialish12") / 100), false);
          return false;
        }
        var7 = sd.field_R;
        var9 = rp.waitingforGraphics;
        var8 = oj.loadingGraphics;
        fo.a(dk.a((byte) -22, "arialbold14", var7, var8, var9), (float)(w.field_i[1] + (w.field_i[2] - w.field_i[1]) * var7.a(100, "arialbold14") / 100), false);
        return false;
    }

    static {
        field_N = new kf[2];
        potBallsInAnyOrderFinishOnBlack = "Pot the balls in any order and finish on the black.";
        muChatLobbyHide = "Hide lobby chat";
        field_L = new int[4];
    }
}
