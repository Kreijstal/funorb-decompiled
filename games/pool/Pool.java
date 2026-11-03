/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Pool extends NetworkGameClient {
    static kf[] field_N;
    static long field_Q;
    static NineSliceFrame field_I;
    static String potBallsInAnyOrderFinishOnBlack;
    static int[] field_L;
    static UiComponent field_P;
    static String muChatLobbyHide;
    static HuffmanCodec field_J;
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
        if (EmailAvailabilityValidator.field_o != EmailAvailabilityValidator.field_s) {
          if (th.field_b == EmailAvailabilityValidator.field_s) {
            IntrusiveNodeHashTable.field_m = IntrusiveNodeHashTable.field_m + 1;
            if (IntrusiveNodeHashTable.field_m == 16) {
              if (NineSliceFrame.field_c) {
                ab.a(param1 + 0);
              } else {
                UiComponentNode.c((byte) 60);
              }
              EmailAvailabilityValidator.field_s = PlasmaTableScene.field_V;
            }
          } else {
            if (PlasmaTableScene.field_V != EmailAvailabilityValidator.field_s) {
              IntrusiveNodeHashTable.field_m = IntrusiveNodeHashTable.field_m - 1;
              if (IntrusiveNodeHashTable.field_m == 0) {
                EmailAvailabilityValidator.field_s = EmailAvailabilityValidator.field_o;
              }
            } else {
              if (!NanoTickClock.b(param1 + 16)) {
                if (null != ti.field_d) {
                  ml.a(25756, ti.field_d, 3);
                }
                ra.a((byte) -108);
                GameRules.field_b = SocialListEntry.field_Ub;
                if (NineSliceFrame.field_c) {
                  NineSliceFrame.field_c = false;
                  qr.a(-28038, false);
                }
                if (WireframeQuad.field_x) {
                  fq.a(-3405, -4, GameRules.field_b, false);
                  WireframeQuad.field_x = false;
                }
                if (dn.a(true, GameRules.field_b)) {
                  PoolGameModel.l(41);
                }
              }
              EmailAvailabilityValidator.field_s = IntrusiveDequeCursor.field_d;
            }
          }
        } else {
          var3_int = 0;
          var4 = 0;
          if (!param0) {
            if (GameRules.field_b != MatchingTextValidator.field_w) {
              ThemeSelectScreen.field_P = ThemeSelectScreen.field_P + 1;
              ih.a((byte) 46);
              if (ThemeSelectScreen.field_P == 32) {
                PoolGameModel.l(param1 - 128);
              }
            } else {
              if (MatchingTextValidator.field_w != -1) {
                if (MatchingTextValidator.field_w == -2) {
                  var3_int = 1;
                } else {
                  if (dn.a(true, MatchingTextValidator.field_w)) {
                    s.field_c[MatchingTextValidator.field_w].advanceScreen(-1);
                  }
                }
              } else {
                if (!td.field_d) {
                  AccountContentDialog.field_ub.tick(false, true, (byte) -9);
                  while (LabeledChildWidget.h(127)) {
                    AccountContentDialog.field_ub.handleKeyTyped((byte) 101);
                  }
                } else {
                  var4 = 1;
                  var3_int = 1;
                }
              }
            }
          }
          if (td.field_d &&
            !AlternateLongAndTextLoginPayload.field_p &&
            !LoginRequiredScreen.field_H) {
            if (MidiNoteMixer.field_v &&
              DualLinkNode.field_p) {
              var3_int = 0;
            }
            i.a(10, var3_int != 0);
            if (mj.field_e) {
              stackIn_26_0 = TextWidgetPainter.field_e;
              stackIn_27_1 = (0 != fl.field_q.pressedButton);
              ((PoolMatchController) (Object) stackIn_26_0).tick(stackIn_27_1, var4 != 0, (byte) -118);
            }
            if (MidiNoteMixer.field_v) {
              ie.a(180, var4 != 0, param1 - 17156, 320);
              stackIn_32_0 = AccountContentDialog.field_ub;
              stackIn_33_1 = (fl.field_q.pressedButton != 0);
              ((PoolMatchController) (Object) stackIn_32_0).tick(stackIn_33_1, var4 != 0, (byte) -108);
            }
            while (LabeledChildWidget.h(127)) {
              if (un.field_b) {
                if (MidiNoteMixer.field_v) {
                  if (KillerRules.a(15, 12, -1, 13)) {
                    continue;
                  }
                } else {
                  TimeTrialSelectScreen.a(false, 15, 13, 12);
                }
              }
              if (mj.field_e) {
                TextWidgetPainter.field_e.handleKeyTyped((byte) 94);
              }
              if (!MidiNoteMixer.field_v) {
                continue;
              }
              AccountContentDialog.field_ub.handleKeyTyped((byte) 81);
            }
          }
          if (!td.field_d) {
            mj.a(true);
          }
          if (!un.field_b) {
            if (DateInputWidget.field_U > 0) {
              DateInputWidget.field_U = DateInputWidget.field_U - 1;
            }
          } else {
            if (BufferedFile.field_h > DateInputWidget.field_U) {
              DateInputWidget.field_U = DateInputWidget.field_U + 1;
            }
          }
          QuickChatHelpDialog.b(5938, DateInputWidget.field_U);
          if (null != LoginForm.field_U.last((byte) 99)) {
            fieldTemp$0 = IntrusiveDequeCursor.field_h + 1;
            IntrusiveDequeCursor.field_h = IntrusiveDequeCursor.field_h + 1;
            if (fieldTemp$0 == 335) {
              IntrusiveDequeCursor.field_h = 0;
              LoginForm.field_U.removeLast((byte) -41);
            }
          }
        }
        if (-3 == GameRules.field_b) {
          ti.field_d = null;
          var7 = new String[fr.field_n];
          var9 = var7;
          for (var4Lifetime1 = 0; var4Lifetime1 < fr.field_n; var4Lifetime1++) {
            var7[var4Lifetime1] = PauseMenuScreen.playerNs[var4Lifetime1];
          }
          stackIn_91_0 = null;
          stackIn_91_1 = null;
          stackIn_91_2 = oj.field_m;
          stackIn_91_3 = la.field_a;
          stackIn_91_4 = DialWidget.field_W;
          stackIn_91_5 = LoginPayload.field_f;
          stackIn_91_6 = LoginPayload.field_f;
          if (un.field_e != 0) {
            stackIn_92_0 = null;
            stackIn_92_1 = null;
            stackIn_92_7 = false;
          } else {
            stackIn_92_0 = null;
            stackIn_92_1 = null;
            stackIn_92_7 = true;
          }
          AccountContentDialog.field_ub = new PoolMatchController(stackIn_91_2, stackIn_91_3, stackIn_91_4, stackIn_91_5, stackIn_91_6, stackIn_92_7, var9, 0, false);
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
            var8[var4Lifetime2] = PauseMenuScreen.playerNs[var4Lifetime2];
          }
          stackIn_105_0 = null;
          stackIn_105_1 = null;
          stackIn_105_2 = oj.field_m;
          stackIn_105_3 = la.field_a;
          stackIn_105_4 = DialWidget.field_W;
          stackIn_105_5 = LoginPayload.field_f;
          stackIn_105_6 = LoginPayload.field_f;
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
          var4_ref_uf.gameModel.addOrUpdateShot(ga.nextRandomInt(512, true, ea.field_r), -1, 0, (AccountContentDialog.field_ub.gameModel.field_A + 1) % fr.field_n, param1 ^ 19063);
          AccountContentDialog.field_ub = var4_ref_uf;
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
          var3 = ResourceArchive.field_j;
          if (var3 == null) {
            var3 = ContextMenu.youPlayer;
          }
          AccountContentDialog.field_ub = new PoolMatchController(UiComponent.field_Ab, new String[]{var3});
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
          var3 = ResourceArchive.field_j;
          if (var3 == null) {
            var3 = ContextMenu.youPlayer;
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
          AccountContentDialog.field_ub = new PoolMatchController(stackIn_127_2, stackIn_127_3, stackIn_127_4, stackIn_127_5, stackIn_127_6, stackIn_128_7, new String[]{var3}, 0, false);
          stackIn_131_0 = (!jd.field_a) ? 0 : 1;
          var4Lifetime4 = stackIn_131_0;
          stackIn_133_0 = -3405;
          stackIn_133_1 = -1;
          stackIn_134_2 = (!mg.a(true)) ? 0 : 21;
          fq.a(stackIn_133_0, stackIn_133_1, stackIn_134_2, var4Lifetime4 != 0);
          jc.field_c = true;
        }
        if (GameRules.field_b == -4) {
          JaggrabDownloader.field_j.writeCipheredOpcode(false, 9);
          AlternateLongAndTextLoginPayload.field_p = true;
          GameRules.field_b = MatchingTextValidator.field_w;
          DateInputWidget.field_U = BufferedFile.field_h;
        }
        if (GameRules.field_b == -5) {
          AccountCreationForm.a(HighscoresScreen.field_L.getGameId(20872), true, 11);
          GameRules.field_b = MatchingTextValidator.field_w;
          LoginRequiredScreen.field_H = true;
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

    final void paintFrame(byte param0) {
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
        var11 = TextLineLayout.a((byte) -126);
        if (ue.a((byte) -123)) {
          KeyHandler.a((byte) -55, fq.m(0), var11);
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
          KeyHandler.a(SoundCache.loadingExtradata, 100.0f, false);
          ModelTableScene.a(true, var11);
          return;
        }
        if (!de.field_g &&
          MatchingTextValidator.field_w != GameRules.field_b) {
          if (MatchingTextValidator.field_w == -2) {
            PlasmaBallSkin.a(GameRules.field_b, -21972, false, jc.field_c);
            var3_int = 32 - ThemeSelectScreen.field_P;
            pn.field_l.drawShadedGrayscale(0, 0, (var3_int << 8) / 32);
          } else if (-2 == GameRules.field_b) {
            PlasmaBallSkin.a(MatchingTextValidator.field_w, -21972, false, TranslatedUiText.field_d);
            pn.field_l.drawShadedGrayscale(0, 0, (ThemeSelectScreen.field_P << 8) / 32);
          } else {
            var3_int = TextureCache.a(ThemeSelectScreen.field_P, 32, 108);
            SoftwareRasterizer.setClip(0, 0, var3_int, SoftwareRasterizer.height);
            TriangleRasterizer.useRasterClip();
            TriangleRasterizer.setProjectionCenter(320, 240);
            PlasmaBallSkin.a(GameRules.field_b, -21972, false, jc.field_c);
            SoftwareRasterizer.setClip(var3_int, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            TriangleRasterizer.useRasterClip();
            TriangleRasterizer.setProjectionCenter(320, 240);
            PlasmaBallSkin.a(MatchingTextValidator.field_w, -21972, false, TranslatedUiText.field_d);
            SoftwareRasterizer.resetClip();
            TriangleRasterizer.useRasterClip();
            nn.a(true, 32, ThemeSelectScreen.field_P);
          }
        } else {
          PlasmaBallSkin.a(MatchingTextValidator.field_w, -21972, true, TranslatedUiText.field_d);
        }
        if (!TranslatedUiText.field_d ||
          !jc.field_c) {
          if (GameRules.field_b == MatchingTextValidator.field_w &&
            MatchingTextValidator.field_w == -2) {
            pn.field_l.a(0, 0);
          }
          ViewportController.a(cp.a((byte) 79), (byte) 50);
        }
        if (de.field_g) {
          if (MatchingTextValidator.field_w < 0) {
            SoftwareRasterizer.clear();
          } else {
            s.field_c[MatchingTextValidator.field_w].drawScreen(87);
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
          }
          var3_intLifetime1 = SoftwareRasterizer.width - 400 >> 1;
          var4_int = SoftwareRasterizer.height - 140 >> 1;
          nj.drawNineSlice(rm.field_g, (byte) 14, 400, var3_intLifetime1, var4_int, 140);
          FreePlayRules.field_e.drawParagraph(LobbyGame.field_gc.field_l, 20 + var3_intLifetime1, 20 + var4_int, 360, 64, 1, -1, 1, 1, 0);
          SoftwareRasterizer.fillRectangle(20 + var3_intLifetime1, -20 + (140 + (var4_int - 20)), 360, 20, 0);
          SoftwareRasterizer.fillRectangle(20 + (var3_intLifetime1 + 2), -20 + (140 + var4_int) - 18, LobbyGame.field_gc.field_H * 356 / (LobbyGame.field_gc.field_G - 1), 16, 16615680);
        }
        var3 = (bq) (LoginForm.field_U.last((byte) -102));
        if (var3 != null) {
          var5 = IntrusiveDequeCursor.field_h;
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
          TutorialController.h(-29322);
        }
        if (ue.a(param0 - 109)) {
          stackIn_49_0 = -82;
          if (null == MatchingTextValidator.field_u) {
            stackIn_50_1 = um.field_e;
          } else {
            stackIn_50_1 = true;
          }
          ContentTransitionDialog.a(stackIn_49_0, stackIn_50_1);
        } else {
          if (md.a((byte) -84) &&
            !bj.c(1)) {
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            NanoTickClock.c(1527590113);
          }
        }
        if (EmailAvailabilityValidator.field_o != EmailAvailabilityValidator.field_s) {
          var4_intLifetime2 = IntrusiveNodeHashTable.field_m * 256 / 16;
          if (var4_intLifetime2 > 0) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var4_intLifetime2);
          }
        }
        if ((32L & LinkButtonPainter.field_i) != 0L) {
          sa.field_h.d(Integer.toString(un.field_g), 640 - sa.field_h.maxAscent * 2, 475 - sa.field_h.maxDescent, 16777215, 1);
        }
        if ((LinkButtonPainter.field_i & 64L) != 0L) {
          var4 = Runtime.getRuntime().totalMemory();
          var6 = Runtime.getRuntime().freeMemory();
          var8 = (int)(var4 - var6) / 1024;
          var9 = (int)(var4 / 1024L);
          sa.field_h.d(var8 + "/" + var9, -((sa.field_h.maxAscent + sa.field_h.maxDescent) * 4) + (640 - 2 * sa.field_h.maxAscent), -((sa.field_h.maxDescent + sa.field_h.maxAscent) * 3 / 2) - 5 + 480 - sa.field_h.maxDescent, 16777215, 1);
        }
        ButtonWidget.a(0, 0, (byte) 85, var11);
        return;
    }

    final void releaseAllStatics(byte param0) {
        Pool.c(false);
        TriangleRasterizer.releaseStatics();
        TextureCache.releaseStatics(param0 ^ -3723);
        bq.releaseStatics((byte) -101);
        IntrusiveDeque.d(-102);
        ab.b(-75);
        il.releaseStatics(param0 ^ 41);
        l.releaseStatics(19545);
        UiComponentNode.e(116);
        md.a(true);
        hp.releaseStatics((byte) -71);
        BallSkin.releaseStatics(-22799);
        CueStick.b((byte) -93);
        ag.releaseStatics(0);
        TableScene.releaseStatics(-15631);
        TikiTableScene.m(112);
        PolarTableScene.e((byte) 76);
        MenuScreen.releaseStatics((byte) 107);
        MessageScreen.releaseStatics(false);
        KeyHandler.releaseStatics(-1);
        ra.releaseStatics(false);
        ta.releaseStatics(24470);
        pk.releaseStatics((byte) 101);
        NetworkGameClient.releaseStatics(true);
        ClientException.releaseStatics(param0 ^ -28);
        GameApplet.releaseStatics((byte) -77);
        JaggrabDownloader.releaseStatics(true);
        MouseHandler.releaseStatics((byte) -109);
        id.a((byte) 35);
        SoftwareRasterizer.releaseStatics();
        ResourceArchive.releaseStatics(0);
        PacketBuffer.e(4109);
        rl.a(-125);
        lf.a((byte) 112);
        wb.releaseStatics((byte) 118);
        kc.releaseStatics((byte) 123);
        dq.releaseStatics((byte) 80);
        a.releaseStatics(0);
        bi.releaseStatics(0);
        hn.releaseStatics(param0 + 39);
        m.releaseStatics((byte) -69);
        pn.releaseStatics(param0 ^ -28);
        ol.a(param0 ^ -1430775244);
        sb.releaseStatics((byte) 124);
        TickClock.releaseStatics((byte) 111);
        RasterBuffer.releaseStatics(-26830);
        ArchiveLoadSequence.releaseStatics((byte) 126);
        FullscreenFocusCanvas.a(255);
        ViewportController.releaseStatics(-44);
        Js5Transport.releaseStatics(117);
        DiskCacheWorker.b(10);
        Js5ArchiveManager.releaseStatics((byte) 84);
        BufferedFile.releaseStatics((byte) -42);
        BufferedSocket.releaseStatics(true);
        s.releaseStatics(-1);
        d.releaseStatics((byte) -110);
        ek.releaseStatics((byte) -107);
        fc.releaseStatics((byte) -43);
        UiComponent.releaseStatics((byte) 8);
        hh.releaseStatics(28882);
        hg.releaseStatics(false);
        c.a(-13679);
        MeshBuilder.releaseStatics();
        BitmapFont.a();
        SoundCache.releaseStatics(param0 + 28774);
        PoolMatchController.c(true);
        TranslatedUiText.d(param0 + 28);
        IntrusiveNode.releaseStatics((byte) 115);
        MidiPcmStream.releaseStatics(-819201);
        IterableNodeHashTable.a((byte) 91);
        MidiFileReader.g();
        MidiNoteMixer.releaseStatics(-1);
        AudioOutput.releaseStatics();
        MusicCrossfadeStream.releaseStatics((byte) 75);
        cb.releaseStatics(param0 + 28583);
        ic.releaseStatics(-512);
        LobbyGame.releaseStatics((byte) -124);
        DualLinkNodeHashTable.releaseStatics((byte) -109);
        LobbyPlayer.releaseStatics((byte) -48);
        ae.releaseStatics((byte) -26);
        GrowableIntList.releaseStatics(false);
        IntrusiveDequeCursor.releaseStatics((byte) -5);
        de.releaseStatics(-1);
        th.releaseStatics(15059);
        cl.a((byte) -76);
        uc.releaseStatics((byte) 112);
        aq.releaseStatics(false);
        pl.releaseStatics(param0 - 23306);
        ShotRecord.d((byte) 114);
        HalloweenBallSkin.releaseStatics((byte) -27);
        gf.releaseStatics(true);
        ChatMessageLine.a(-24061);
        gp.releaseStatics(63);
        TutorialController.i(5);
        PoolGameModel.releaseStatics(10);
        CueAim.releaseStatics(param0 ^ 9401);
        CipherPacketBuffer.releaseStatics(true);
        Camera.releaseStatics(-13569);
        BallEvent.releaseStatics(false);
        IsaacCipher.releaseStatics(param0 ^ 81);
        Ball.b((byte) -66);
        CushionSegment.releaseStatics((byte) 77);
        Pocket.releaseStatics(false);
        GameRules.releaseStatics(13);
        jq.a(false);
        MenuSelection.releaseStatics(80);
        ArchiveIndex.releaseStatics(20592);
        GzipDecoder.releaseStatics((byte) -92);
        ArchiveProvider.a((byte) -41);
        je.a((byte) -125);
        DialogLayer.g((byte) -47);
        fq.releaseStatics(param0 + 33);
        ProgressDialog.releaseStatics(7585);
        AccountContentDialog.releaseStatics(-124);
        MessageDialog.n((byte) -86);
        AccountCreationForm.releaseStatics((byte) 4);
        AccountWelcomePanel.releaseStatics(20868);
        LoginForm.a(-31360);
        DisplayNamePanel.releaseStatics(false);
        LoginTextValue.releaseStatics(false);
        mj.releaseStatics((byte) -83);
        ii.a(127);
        ModelMesh.releaseStatics();
        ModelInstance.releaseStatics(75);
        BallDebugOverlay.a((byte) 116);
        mk.a(0);
        Quaternion.releaseStatics(param0 + 144);
        ModelTableScene.releaseStatics((byte) 117);
        so.releaseStatics(param0 ^ -9943);
        SpriteState.releaseStatics((byte) 11);
        DualLinkNode.c(-3604);
        jc.releaseStatics(param0 ^ -28);
        bh.releaseStatics(false);
        StateIconLabel.releaseStatics(-1);
        VerticalScrollbar.releaseStatics((byte) 118);
        ContextMenu.releaseStatics(126);
        ScrollPaneWithFooter.releaseStatics(true);
        PlayerContextMenu.c((byte) -116);
        ScrollPane.releaseStatics(param0 + 28);
        ReportAbuseDialog.f((byte) -93);
        vi.b(-115);
        da.b((byte) 108);
        AlignedIconLabel.releaseStatics((byte) -102);
        vn.a(true);
        fh.releaseStatics((byte) 62);
        td.releaseStatics((byte) 86);
        HuffmanCodec.a(false);
        jh.a(21546);
        tp.releaseStatics(0);
        IndexedSpriteState.a((byte) -118);
        NineSliceFrame.releaseStatics(false);
        gd.releaseStatics(-2182);
        w.releaseStatics(62);
        ue.releaseStatics(false);
        wn.releaseStatics(true);
        jj.i(100);
        uj.releaseStatics((byte) 33);
        QuickChatHelpDialog.releaseStatics(56);
        ll.releaseStatics(-69);
        gn.a(1);
        jl.releaseStatics((byte) 43);
        LoginPayloadKind.releaseStatics(param0 ^ -91);
        LoginPayload.releaseStatics(param0 ^ 17031);
        TabbedPane.releaseStatics(-1);
        NameEntryPopup.releaseStatics(false);
        ij.a(param0 - 273542787);
        en.a(param0 ^ -8380);
        LimitedRandomAccessFile.releaseStatics((byte) 126);
        ho.releaseStatics(true);
        ff.releaseStatics((byte) 87);
        dr.a(11468);
        t.c(param0 ^ 88);
        AudioService.a(false);
        NineBallRules.releaseStatics(false);
        um.releaseStatics(116);
        ef.releaseStatics(1);
        ah.releaseStatics(false);
        un.releaseStatics((byte) -101);
        ModernTableScene.releaseStatics((byte) 71);
        PlasmaTableScene.m(param0 - 100);
        SpaceTableScene.e((byte) -116);
        ClassicBallSkin.releaseStatics(1);
        nn.releaseStatics(param0 + 16034);
        PlasmaBallSkin.i(120);
        TikiBallSkin.releaseStatics(10860);
        PolarBallSkin.releaseStatics(param0 ^ -20);
        KillerBallSkin.releaseStatics(85);
        ValueNoise.releaseStatics();
        OptionsScreen.releaseStatics((byte) -89);
        TimeTrialSelectScreen.releaseStatics(param0 - 73);
        PauseMenuScreen.f(8);
        lb.releaseStatics(-79);
        HighscoresScreen.g(-126);
        RankingsScreen.releaseStatics(0);
        InstructionsScreen.releaseStatics((byte) -90);
        AchievementsScreen.releaseStatics(false);
        LoginRequiredScreen.releaseStatics(false);
        MembershipBenefitsScreen.b(true);
        LocalGameSetupScreen.releaseStatics((byte) 74);
        ThemeSelectScreen.f(param0 ^ -506724219);
        TutorialSelectScreen.releaseStatics((byte) -103);
        SocketArchiveNetworkClient.releaseStatics(param0 ^ 80);
        DualLinkDeque.a(true);
        SectorCacheStore.releaseStatics(true);
        dg.releaseStatics((byte) -80);
        CachedArchiveSource.a(true);
        pp.releaseStatics((byte) -25);
        ArchiveRequest.releaseStatics(-121);
        f.releaseStatics((byte) 105);
        FullscreenErrorDialog.releaseStatics((byte) -82);
        TextWidgetPainter.releaseStatics((byte) 119);
        VorbisSample.releaseStatics();
        TriangleMesh.releaseStatics(-47);
        bc.releaseStatics((byte) -8);
        bo.releaseStatics((byte) 45);
        wf.a(25131);
        mg.releaseStatics((byte) -44);
        cq.releaseStatics((byte) -90);
        DelegatingCanvas.releaseStatics((byte) 38);
        qg.releaseStatics(0);
        IntKeyLookup.releaseStatics(-30521);
        ByteStorage.releaseStatics(4);
        Bzip2Decoder.a();
        Bzip2DecoderState.releaseStatics(-8090);
        ja.a(726237729);
        PoolUiText.releaseStatics(param0 ^ 32);
        CheckboxPainter.releaseStatics(false);
        StatefulTextPainter.releaseStatics(true);
        DialRenderer.a(-1);
        MarkerSliderPainter.releaseStatics((byte) -108);
        if (param0 != -28) {
          field_P = (UiComponent) null;
        }
        op.releaseStatics(0);
        UiWidget.releaseStatics((byte) 80);
        ButtonWidget.releaseStatics((byte) 72);
        SingleChildWidget.releaseStatics(param0 ^ -80);
        ResizableDialog.releaseStatics((byte) -16);
        FadingDialog.releaseStatics(-1);
        WidgetContainer.releaseStatics(2);
        rp.releaseStatics((byte) 13);
        VorbisFloor1.releaseStatics();
        cp.releaseStatics(true);
        hf.releaseStatics(0);
        wp.a(0);
        la.releaseStatics(param0 ^ -115);
        QuickChatMenu.h(param0 ^ 99);
        ee.a((byte) -70);
        QuickChatPhraseRegistry.releaseStatics((byte) -62);
        QuickChatCategoryDefinition.releaseStatics(param0 - 89);
        QuickChatPhraseDefinition.releaseStatics((byte) -111);
        WeightedLruCache.releaseStatics((byte) 0);
        SocketConnector.releaseStatics(param0 + 16885);
        lo.releaseStatics(param0 + 149);
        NanoTickClock.releaseStatics((byte) 122);
        ImageProducerRasterBuffer.releaseStatics(2);
        pc.releaseStatics(-24420);
        dj.releaseStatics(true);
        WhirlpoolHasher.releaseStatics(8);
        SoundTone.releaseScratch();
        te.releaseStatics((byte) 127);
        e.releaseStatics(true);
        q.releaseStatics(101);
        DebugTuningSlider.releaseStatics((byte) 8);
        ti.releaseStatics(param0 ^ 20983);
        EightBallRules.h((byte) -75);
        KillerRules.d((byte) -104);
        MusicPatch.releaseStatics(5893);
        kp.releaseStatics(104);
        FreePlayRules.releaseStatics((byte) -105);
        TimeTrialRules.p(-9);
        BirthDateValidator.releaseStatics((byte) -119);
        co.releaseStatics(true);
        ArrayWidgetGroup.releaseStatics(16);
        rf.releaseStatics(false);
        LabeledChildWidget.g((byte) -85);
        TextInputWidget.releaseStatics((byte) 23);
        ContentTransitionDialog.releaseStatics((byte) -45);
        ProgressBarWidget.releaseStatics(true);
        UsernameSuggestionsPanel.releaseStatics(160);
        ValidationIconWidget.releaseStatics((byte) -69);
        ck.releaseStatics(-110);
        CheckboxWidget.releaseStatics(param0 + 117);
        TextInputValidator.releaseStatics((byte) 122);
        rm.releaseStatics((byte) -20);
        Under13NoticePanel.a(122);
        DialWidget.releaseStatics((byte) 121);
        MultiHandleSliderWidget.releaseStatics(2);
        rc.releaseStatics(true);
        DateInputWidget.releaseStatics(-12253);
        ih.releaseStatics(param0 + 133);
        BitmapTextLayout.releaseStatics(-13268);
        hi.releaseStatics(125);
        DraggableWidget.h(-34);
        DropTargetWidget.releaseStatics(120);
        IntrusiveNodeHashTable.releaseStatics(param0 - 69);
        IterableDualLinkDeque.b(14676);
        CacheEntry.f(1);
        hj.releaseStatics((byte) -103);
        StrongCacheEntry.releaseStatics(param0 ^ -28);
        ProxySocketConnector.releaseStatics(15296);
        AudioFilter.releaseStatics();
        sk.releaseStatics(param0 ^ -27);
        NodeHashTableIterator.a(0);
        DualLinkDequeIterator.releaseStatics(19000);
        eh.releaseStatics(param0 + 136);
        oj.releaseStatics(-19382);
        tg.releaseStatics(-10562);
        ea.releaseStatics((byte) 124);
        kf.releaseStatics(-1);
        vm.a(false);
        bj.a(param0 - 4275);
        ThreeSliceButtonPainter.releaseStatics(-1);
        LinkButtonPainter.releaseStatics(true);
        om.releaseStatics((byte) -37);
        sm.releaseStatics(2);
        ButtonPainter.releaseStatics(16);
        OpacityWidget.g((byte) 118);
        SocialListEntry.releaseStatics((byte) -105);
        ArchiveLoadStep.releaseStatics((byte) -110);
        TextHotspotRegion.releaseStatics(true);
        tq.a(param0 ^ -28);
        i.releaseStatics((byte) 73);
        qr.releaseStatics((byte) 83);
        nl.releaseStatics(-54);
        fr.c((byte) 69);
        PotEvent.releaseStatics((byte) 90);
        dn.releaseStatics(param0 - 2020);
        ro.releaseStatics(240);
        bk.releaseStatics(-5917);
        AimTarget.b((byte) 115);
        ph.releaseStatics(false);
        wc.releaseStatics(72);
        MessageDialogContent.releaseStatics(-124);
        ar.releaseStatics(10);
        pm.releaseStatics(0);
        RasterSnapshot.releaseStatics((byte) 5);
        ml.a(-26458);
        LongAndTextLoginPayload.releaseStatics(param0 - 1431655738);
        AlternateLongAndTextLoginPayload.releaseStatics(true);
        TextPairLoginPayload.releaseStatics(17518);
        dk.a((byte) 113);
        ji.releaseStatics(false);
        jd.a((byte) 79);
        WireframeQuad.a(127);
        qf.releaseStatics(true);
        he.a(param0 ^ 23);
        fl.a(59);
        oi.releaseStatics((byte) -124);
        ln.releaseStatics(param0 ^ -27827);
        kg.releaseStatics((byte) -103);
        WidgetStyleLayer.releaseStatics((byte) 8);
        TextLineLayout.b(param0 ^ 27721);
        sa.a(param0 - 13237);
        na.a((byte) 43);
        DebouncedValidationProvider.releaseStatics(-1);
        UsernameAvailabilityValidator.releaseStatics(-110);
        PasswordValidator.releaseStatics(true);
        EmailValidator.releaseStatics((byte) 113);
        EmailAvailabilityValidator.b(true);
        AgeValidator.b(true);
        MatchingTextValidator.releaseStatics((byte) 15);
        cd.releaseStatics(param0 ^ -94);
        qa.releaseStatics((byte) 33);
        ie.releaseStatics((byte) -13);
        this.field_t = null;
    }

    final void initializeGame(byte param0) {
        this.initializeFramework(5, 19, 0, 2, 1, false, 61, 1);
        MidiPcmStream var3 = new MidiPcmStream();
        ThemeSelectScreen.a((java.awt.Component) ((Object) TimeTrialSelectScreen.field_K), var3, 22050, StatefulTextPainter.field_s, 10282, true);
        this.configureAccountResponses(param0 ^ 45, false, true, true, true, false, true);
        EmailValidator.field_m[78] = 8;
        LoginPayload.field_f = ScrollPane.field_Lb[2];
        la.field_a = ScrollPane.field_Lb[0];
        EmailValidator.field_m[73] = 1;
        EmailValidator.field_m[75] = 5;
        EmailValidator.field_m[77] = 1;
        EmailValidator.field_m[79] = 0;
        EmailValidator.field_m[74] = -1;
        EmailValidator.field_m[64] = -2;
        EmailValidator.field_m[67] = 7;
        EmailValidator.field_m[65] = -2;
        EmailValidator.field_m[69] = 1;
        fr.field_n = 2;
        if (param0 != -46) {
          this.init();
        }
        EmailValidator.field_m[76] = 8;
        EmailValidator.field_m[68] = 9;
        un.field_e = ScrollPane.field_Lb[3];
        EmailValidator.field_m[71] = 1;
        EmailValidator.field_m[10] = -1;
        EmailValidator.field_m[70] = 1;
        EmailValidator.field_m[72] = 1;
        DialWidget.field_W = ScrollPane.field_Lb[1];
        EmailValidator.field_m[9] = -1;
        ClientException.field_g = ek.a(-95);
        hp.field_c = ek.a(5);
    }

    private final void m(byte param0) {
        if (GameApplet.field_m != null) {
          PoolUiText.applyLocalizedTexts(GameApplet.field_m, -8);
          GameApplet.field_m = null;
          ArrayWidgetGroup.a(0);
        }
        if (param0 > -103) {
          this.initializeGame((byte) -93);
        }
        fh.field_b = fh.a(3, (byte) 103);
        cp.field_a = fh.a(4, (byte) 103);
        ViewportController.field_q = fh.a(6, (byte) 103);
        Ball.field_z = fh.a(7, (byte) 103);
        WeightedLruCache.field_d = fh.a(8, (byte) 103);
        he.field_b = fh.a(9, (byte) 103);
        gf.field_g = fh.a(10, (byte) 103);
        jc.field_a = fh.a(11, (byte) 103);
        s.field_a = fh.a(12, (byte) 103);
        NetworkGameClient.field_F = fh.a(13, (byte) 103);
        rl.field_h = fh.a(18, (byte) 103);
        OpacityWidget.a(Under13NoticePanel.field_R, (byte) -32, QuickChatMenu.field_Zb);
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
        CipherPacketBuffer var4_ref_oq;
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
          if (!HuffmanCodec.a(0, EmailValidator.field_m)) {
            MusicCrossfadeStream.a((byte) -20, 0);
            return;
          }
          if (Bzip2DecoderState.field_c == 9) {
            PoolGameModel.l(-124);
            AlternateLongAndTextLoginPayload.field_p = false;
            GameRules.field_b = 20;
            ThreeSliceButtonPainter.field_B = PlayerContextMenu.field_e.j(-49);
            continue;
          }
          if (Bzip2DecoderState.field_c == 14) {
            PoolGameModel.l(-124);
            mk.a(hh.a((byte) 1), 1024, AccountCreationForm.g((byte) 103), 150, te.field_p, te.nextPowerOfTwo(-17931, 8), te.nextPowerOfTwo(-17931, 2000), SpaceTableScene.f(true), 4, 13162);
            rp.a(LobbyPlayer.f(0), VerticalScrollbar.f((byte) 13), -36);
            AlternateLongAndTextLoginPayload.field_p = false;
            un.field_b = true;
            td.field_d = true;
            GameRules.field_b = -2;
            MidiNoteMixer.field_r = 0;
            continue;
          }
          if (15 == Bzip2DecoderState.field_c) {
            if (td.field_d) {
              PoolGameModel.l(param0 - 127);
              DialogLayer.a(true);
              IntrusiveDeque.g((byte) 74);
              GameRules.field_b = 0;
              mj.field_e = false;
              ContextMenu.field_Sb = true;
              td.field_d = false;
              jc.field_c = false;
              MidiNoteMixer.field_v = false;
              l.field_a = true;
              TextWidgetPainter.b(120);
            }
            AlternateLongAndTextLoginPayload.field_p = false;
            LoginRequiredScreen.field_H = false;
            continue;
          }
          if (Bzip2DecoderState.field_c == 10 &&
            td.field_d) {
            rl.handleSocialListUpdate(param0 ^ 70);
            continue;
          }
          if (Bzip2DecoderState.field_c == 74) {
            var22 = ek.a(-8);
            var17 = var22;
            var2 = var17;
            var9 = (int[]) var2;
            var4_ref_oq = PlayerContextMenu.field_e;
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
              var10[var5Lifetime2] = ArchiveLoadSequence.b(var10[var5Lifetime2], ~var21[var5Lifetime2]);
            }
            if (HighscoresScreen.field_K) {
              for (var3 = 0; var3 < md.achievementNames.length; var3++) {
                if (ButtonWidget.a(var22, param0 ^ -13670, var3)) {
                  LoginForm.field_U.addFirst((byte) -3, new bq(var3));
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
          if (Bzip2DecoderState.field_c != 65 &&
            Bzip2DecoderState.field_c != 64) {
            if (Bzip2DecoderState.field_c == 66) {
              if (MidiNoteMixer.field_v ||
                mj.field_e) {
                PoolGameModel.l(param0 + 108);
                if (MidiNoteMixer.field_v) {
                  AccountContentDialog.field_ub.openInGameMenu(param0 ^ 259, false);
                }
                mj.field_e = false;
                GameRules.field_b = -2;
                MidiNoteMixer.field_r = 0;
                jc.field_c = false;
                MidiNoteMixer.field_v = false;
                ContextMenu.field_Sb = true;
                un.field_b = true;
                TextWidgetPainter.b(116);
              }
              LoginRequiredScreen.field_H = false;
              continue;
            }
            var2Lifetime1 = null;
            if (!MidiNoteMixer.field_v) {
              if (mj.field_e) {
                var2Lifetime1 = TextWidgetPainter.field_e;
              }
            } else {
              var2Lifetime1 = AccountContentDialog.field_ub;
            }
            if (var2Lifetime1 != null) {
              if (Bzip2DecoderState.field_c == 79) {
                ((PoolMatchController) (var2Lifetime1)).handleStartTurnPacket(true);
                continue;
              }
              if (Bzip2DecoderState.field_c == 67) {
                ((PoolMatchController) (var2Lifetime1)).readGameStateSync(PlayerContextMenu.field_e, false);
                continue;
              }
              if (Bzip2DecoderState.field_c == 68) {
                ((PoolMatchController) (var2Lifetime1)).readMovePacket(PlayerContextMenu.field_e, 0);
                continue;
              }
              if (Bzip2DecoderState.field_c == 76) {
                ((PoolMatchController) (var2Lifetime1)).readRemoteCueAim(PlayerContextMenu.field_e, false);
                continue;
              }
              if (Bzip2DecoderState.field_c == 78) {
                ((PoolMatchController) (var2Lifetime1)).readBallManhandled(69, PlayerContextMenu.field_e);
                continue;
              }
              if (Bzip2DecoderState.field_c == 75) {
                ((PoolMatchController) (var2Lifetime1)).readEndShotPacket(96, PlayerContextMenu.field_e);
                continue;
              }
              if (Bzip2DecoderState.field_c == 77) {
                ((PoolMatchController) (var2Lifetime1)).readEndResolutionPacket(4096, PlayerContextMenu.field_e);
                continue;
              }
              if (Bzip2DecoderState.field_c == 69) {
                var3Lifetime1 = PlayerContextMenu.field_e.readByte((byte) 105);
                ((PoolMatchController) (var2Lifetime1)).gameModel.finishGame(param0 - 14289, var3Lifetime1);
                if (((PoolMatchController) (var2Lifetime1)).localPlayerIndex == var3Lifetime1) {
                  LobbyGame.field_gc.a(17, 256, (byte) -121, 128);
                } else {
                  LobbyGame.field_gc.a(18, 256, (byte) -114, 128);
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
                ((PoolMatchController) (var20)).resetView(-23095);
                if ((f.field_f & ((PoolMatchController) (var20)).modeFlags) == 0) {
                  continue;
                }
                MatchingTextValidator.field_w = 23;
                GameRules.field_b = 23;
                continue;
              }
              if (Bzip2DecoderState.field_c == 70) {
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_x = PlayerContextMenu.field_e.readUnsignedByte(param0 ^ -92);
                if (AccountContentDialog.field_ub == null) {
                  continue;
                }
                IterableNodeHashTable.a(false);
                continue;
              }
              if (Bzip2DecoderState.field_c == 71) {
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_p = PlayerContextMenu.field_e.readUnsignedByte(param0 - 63);
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_x = ((PoolMatchController) (var2Lifetime1)).gameModel.field_x & ~((PoolMatchController) (var2Lifetime1)).gameModel.field_p;
                continue;
              }
              if (Bzip2DecoderState.field_c == 72) {
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_b = PlayerContextMenu.field_e.readUnsignedByte(param0 - 119);
                if (AccountContentDialog.field_ub == null) {
                  continue;
                }
                ModernTableScene.f((byte) -119);
                continue;
              }
              if (73 == Bzip2DecoderState.field_c) {
                ((PoolMatchController) (var2Lifetime1)).field_cb = PlayerContextMenu.field_e.readUnsignedByte(-105);
                ((PoolMatchController) (var2Lifetime1)).gameModel.field_b = ((PoolMatchController) (var2Lifetime1)).gameModel.field_b & ~((PoolMatchController) (var2Lifetime1)).field_cb;
                if (null == AccountContentDialog.field_ub) {
                  continue;
                }
                ModernTableScene.f((byte) -119);
                continue;
              }
            }
            this.dispatchAccountPacket(15000);
            continue;
          }
          PoolGameModel.l(param0 ^ -126);
          PlayerContextMenu.field_e.beginBitReading(8);
          var2_int = PlayerContextMenu.field_e.readBits(4, 52);
          if (var2_int == 15) {
            var2_int = -2;
          }
          la.field_a = PlayerContextMenu.field_e.readBits(3, param0 ^ 38);
          DialWidget.field_W = PlayerContextMenu.field_e.readBits(2, 104);
          LoginPayload.field_f = PlayerContextMenu.field_e.readBits(3, 66);
          var3Lifetime2 = PlayerContextMenu.field_e.readBits(3, 78);
          un.field_e = PlayerContextMenu.field_e.readBits(1, 70);
          stackIn_49_0 = (PlayerContextMenu.field_e.readBits(1, 21) != 1) ? 0 : 1;
          var4 = stackIn_49_0;
          stackIn_52_0 = (PlayerContextMenu.field_e.readBits(1, 111) != 1) ? 0 : 1;
          var5Lifetime1 = stackIn_52_0;
          PlayerContextMenu.field_e.endBitReading(8);
          var6 = new String[PlayerContextMenu.field_e.readUnsignedByte(param0 ^ -70)];
          for (var7_int = 0; var7_int < var6.length; var7_int++) {
            var6[var7_int] = PlayerContextMenu.field_e.readString(cq.a(param0, 10761));
          }
          ti.field_d = null;
          stackIn_57_0 = null;
          stackIn_57_1 = null;
          stackIn_57_2 = TutorialController.field_c;
          stackIn_57_3 = la.field_a;
          stackIn_57_4 = DialWidget.field_W;
          stackIn_57_5 = LoginPayload.field_f;
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
          var7.loadStateSnapshot(16915, PlayerContextMenu.field_e);
          if (65 != Bzip2DecoderState.field_c) {
            mj.field_e = true;
            TextWidgetPainter.field_e = var7;
          } else {
            MidiNoteMixer.field_v = true;
            AccountContentDialog.field_ub = var7;
            IterableNodeHashTable.a(false);
            ModernTableScene.f((byte) -119);
            CueAim.a((byte) -109);
          }
          LoginRequiredScreen.field_H = false;
          if (var5Lifetime1 != 0) {
            var7.introDelayTicks = -1;
          }
          jc.field_c = true;
          GameRules.field_b = -1;
        }
    }

    public Pool() {
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (ea.field_z) {
          return ThemeSelectScreen.field_J.dispatchKeyInputOrRequestFocus(-81, IterableDualLinkDeque.field_a, ml.field_b);
        }
        if (ArrayWidgetGroup.field_H) {
          return LoginPayloadKind.a(15585, param2, param1);
        }
        if (oj.a(param1, param2, -10)) {
          return true;
        }
        if (param3 != -80) {
          Pool.a(122, -100, -91, -77);
        }
        if (ViewportController.field_y) {
          return false;
        }
        return th.handleChatKey(param1, param3 + 174, param0);
    }

    final void updateGame(byte param0) {
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
        MessageDialogContent.field_P = sk.a((byte) 64);
        Bzip2DecoderState.a((byte) -92);
        if (MatchingTextValidator.field_u != null &&
          MatchingTextValidator.field_u.focusLost) {
          tq.d((byte) -127);
          DropTargetWidget.g((byte) 96);
        }
        stackIn_5_1 = -4;
        stackIn_6_2 = (null != MatchingTextValidator.field_u);
        this.serviceFramework(stackIn_5_1, stackIn_6_2);
        if (FullscreenFocusCanvas.field_c) {
          this.m((byte) -125);
          FullscreenFocusCanvas.field_c = false;
        }
        SocialListEntry.field_Tb = SocialListEntry.field_Tb + 1;
        var2 = 56 / ((param0 - 29) / 60);
        if (ue.a((byte) -84)) {
          this.l((byte) -75);
          if (ue.a((byte) -111)) {
            if (!DebouncedValidationProvider.a(true)) {
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
                    LobbyGame.field_gc.j(2);
                    ArrayWidgetGroup.a(0);
                    if (LobbyGame.field_gc.field_G == LobbyGame.field_gc.field_H) {
                      LobbyGame.field_gc.d(16);
                      de.field_g = false;
                    }
                  }
                } else {
                  if (EmailAvailabilityValidator.field_s != EmailAvailabilityValidator.field_o) {
                    this.a(false, 0);
                  } else {
                    var3 = RankingsScreen.h(8);
                    if (var3 == 1) {
                      WireframeQuad.field_x = true;
                      TranslatedUiText.a(pl.pleaselogin, 0, (byte) 88);
                    }
                    this.a(true, 0);
                  }
                }
              } else {
                stackIn_29_1 = (null != MatchingTextValidator.field_u);
                var3 = this.pollAccountActions(stackIn_29_1, false);
                if (1 != var3 &&
                  var3 != 2) {
                  this.a(true, 0);
                } else {
                  if (MatchingTextValidator.field_u != null) {
                    tq.d((byte) -101);
                  }
                  if (var3 != 2) {
                    this.a(true, 0);
                  } else {
                    DualLinkNodeHashTable.openQuitPage(-1, NanoTickClock.getApplet(72));
                    this.a(true, 0);
                  }
                }
              }
            } else {
              if (EmailAvailabilityValidator.field_s == EmailAvailabilityValidator.field_o) {
                var3 = SpaceTableScene.n(-1);
                if (2 != var3) {
                  if (var3 != 3) {
                    if (var3 == 4) {
                      NineSliceFrame.field_c = true;
                      TranslatedUiText.a(jc.pleaseloginMember, 0, (byte) 78);
                    }
                    this.a(true, 0);
                  } else {
                    NineSliceFrame.field_c = false;
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
        if (!NanoTickClock.b(-119)) {
          while (true) {
            var6 = (i) (ArchiveIndex.field_l.removeLast((byte) -41));
            if (var6 == null) {
              break;
            }
            IntrusiveDequeCursor.a(false, var6, 4);
          }
        }
        this.k(3);
        if (un.field_b) {
          MidiNoteMixer.field_r = 0;
        }
        if (pk.b((byte) 109)) {
          var3Lifetime1 = this.serviceAccountFlow((byte) -125);
          if (var3Lifetime1 == 0 ||
            var3Lifetime1 == 1) {
            MusicCrossfadeStream.c(946);
            if (var3Lifetime1 != 1) {
              if (td.field_d) {
                ContextMenu.field_Sb = true;
                l.field_a = true;
                jc.field_c = false;
                if (!MidiNoteMixer.field_v) {
                  stackIn_75_0 = -3405;
                  stackIn_75_1 = 0;
                  if (!mg.a(true)) {
                    stackIn_76_2 = 0;
                  } else {
                    stackIn_76_2 = 21;
                  }
                  fq.a(stackIn_75_0, stackIn_75_1, stackIn_76_2, false);
                } else {
                  ThreeSliceButtonPainter.field_B = LoginForm.textRemovedFromGame;
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
                s.field_c[MatchingTextValidator.field_w].onEnter(0, 0, false);
                td.field_d = false;
                MidiNoteMixer.field_v = false;
                mj.field_e = false;
                TextWidgetPainter.b(116);
              }
              LoginRequiredScreen.field_H = false;
              AlternateLongAndTextLoginPayload.field_p = false;
            } else {
              LoginRequiredScreen.field_H = true;
              AlternateLongAndTextLoginPayload.field_p = true;
            }
          }
          var4 = 0;
          if (var3Lifetime1 == 2) {
            var4 = 1;
          }
          if (td.field_d ||
            AlternateLongAndTextLoginPayload.field_p ||
            LoginRequiredScreen.field_H) {
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
        this.startApplet(640, "pool", 480, 0, 20);
    }

    final void shutdownServices(byte param0) {
        DateInputWidget.j((byte) -78);
        if (param0 != -39) {
          this.paintFrame((byte) -29);
        }
        if (null != MatchingTextValidator.field_u) {
          tq.d((byte) -116);
        }
        cd.a((byte) 60);
    }

    private final boolean d(int param0, boolean param1) {
        int var3;
        PolarTableScene var4;
        int var6;
        ResourceArchive var7;
        String var8;
        String var9;
        ResourceArchive var10;
        String var11;
        String var12;
        ResourceArchive var13;
        String var14;
        String var15;
        ResourceArchive var16;
        String var17;
        String var18;
        ResourceArchive var19;
        String var20;
        String var21;
        ResourceArchive var22;
        String var23;
        String var24;
        ResourceArchive var25;
        String var26;
        String var27;
        ResourceArchive var28;
        String var29;
        String var30;
        ResourceArchive var31;
        String var32;
        String var33;
        ResourceArchive var34;
        String var35;
        String var36;
        ResourceArchive var37;
        String var38;
        String var39;
        ResourceArchive var40;
        String var41;
        String var42;
        ResourceArchive var43;
        String var44;
        String var45;
        ResourceArchive var46;
        String var47;
        String var48;
        ResourceArchive var49;
        String var50;
        String var51;
        ResourceArchive var52;
        String var53;
        String var54;
        ResourceArchive var55;
        String var56;
        String var57;
        ResourceArchive var58;
        String var59;
        String var60;
        ResourceArchive var61;
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
        if (WeightedLruCache.field_d == null) {
          if (he.field_b != null) {
            var66 = cq.unpackingSoundeffects;
            KeyHandler.a(var66, (float)w.field_i[20], false);
            this.paintFrame((byte) 120);
            he.field_b = null;
            ArrayWidgetGroup.a(0);
            return false;
          }
          if (jc.field_a != null) {
            var67 = KillerBallSkin.unpackingMusic;
            KeyHandler.a(var67, (float)w.field_i[21], false);
            this.paintFrame((byte) 120);
            HalloweenBallSkin.field_m = MusicTrack.loadFromArchive(jc.field_a, "", "title");
            jh.field_d = MusicTrack.loadFromArchive(jc.field_a, "", "title_next_door");
            for (var3 = 0; var3 < nn.field_b.length; var3++) {
              nn.field_b[var3].a(1, jc.field_a);
            }
            jc.field_a = null;
            ArrayWidgetGroup.a(0);
            return false;
          }
          if (null != gf.field_g) {
            var68 = KillerBallSkin.unpackingMusic;
            KeyHandler.a(var68, (float)w.field_i[22], false);
            this.paintFrame((byte) 120);
            RankingsScreen.field_N.prepareScoreInstruments(qg.field_g, gf.field_g, HalloweenBallSkin.field_m, 75, 0);
            RankingsScreen.field_N.prepareScoreInstruments(qg.field_g, gf.field_g, jh.field_d, 95, 0);
            for (var3Lifetime2 = 0; var3Lifetime2 < nn.field_b.length; var3Lifetime2++) {
              nn.field_b[var3Lifetime2].prepareMusic(3, qg.field_g, gf.field_g);
            }
            RankingsScreen.field_N.clearInstrumentSampleIds(true);
            gf.field_g = null;
            qg.field_g = null;
            ArrayWidgetGroup.a(0);
            return false;
          }
          if (QuickChatMenu.field_Zb != null) {
            var69 = NineBallRules.unpackingGraphics;
            KeyHandler.a(var69, (float)w.field_i[23], false);
            this.paintFrame((byte) 120);
            FreePlayRules.field_e = sk.loadPaletteFont(Ball.field_z, 32362, "", "font", ViewportController.field_q);
            sa.field_h = he.a(Under13NoticePanel.field_R, "", 0, QuickChatMenu.field_Zb, "arialish12");
            ModernTableScene.field_Z = he.a(Under13NoticePanel.field_R, "", 0, QuickChatMenu.field_Zb, "arialbold14");
            id.field_c = new CueStick();
            id.field_c.a(2);
            SoundCache.a(0, ViewportController.field_q);
            ScrollPane.a((byte) 27, rl.field_h);
            Camera.field_j = WidgetStyleLayer.loadSprite("basic", (byte) 83, "locked", Under13NoticePanel.field_R);
            UsernameAvailabilityValidator.field_r = WidgetStyleLayer.loadSprite("basic", (byte) 122, "unachieved", Under13NoticePanel.field_R);
            om.field_u = WidgetStyleLayer.loadSprite("basic", (byte) 60, "orbcoin", Under13NoticePanel.field_R);
            TextInputValidator.a(UsernameAvailabilityValidator.field_r, (byte) -12);
            TextInputValidator.a(om.field_u, (byte) -12);
            dq.field_k = new Sprite(32, 32);
            dq.field_k.e();
            om.field_u.drawScaledAveraged(0, 0, 32, 32);
            OpacityWidget.field_P.bindAsRenderTarget(15100);
            om.field_u = null;
            SpriteState.a((byte) -72, true, ScrollPane.field_Lb, Under13NoticePanel.field_R, cp.field_a, 2, PoolUiText.field_c, 4, QuickChatMenu.field_Zb, s.gameoptlabels, nn.field_a, BitmapTextLayout.field_q, EmailValidator.field_n, te.field_p, ff.field_f);
            KillerBallSkin.field_n = WidgetStyleLayer.loadSprite("", (byte) 121, "lobby_game_logo", ViewportController.field_q);
            ArchiveLoadStep.field_m = ml.field_h;
            DualLinkNode.field_s = true;
            Pocket.field_j = PolarBallSkin.field_m;
            DraggableWidget.a(200, -77);
            BallDebugOverlay.readAppletParameters(0, 0, 37, DialRenderer.textBenefits, (java.applet.Applet) (this), 16777215);
            QuickChatMenu.field_Zb = null;
            Ball.field_z = null;
            ArrayWidgetGroup.a(0);
            return false;
          }
          if (param0 < 56) {
            this.releaseAllStatics((byte) 13);
          }
          if (fh.field_b != null) {
            kp.a(new HuffmanCodec(fh.field_b.getFileByName(false, "huffman", "")), (byte) -92);
            fh.field_b = null;
            ArrayWidgetGroup.a(0);
            return false;
          }
          if (null != s.field_a) {
            var70 = ValidationIconWidget.unpackingModels;
            KeyHandler.a(var70, (float)w.field_i[24], false);
            this.paintFrame((byte) 120);
            ViewportController.a(s.field_a, 0);
            s.field_a = null;
            ArrayWidgetGroup.a(0);
            return false;
          }
          md.a(32);
          DateInputWidget.i((byte) 124);
          MatchingTextValidator.field_w = 0;
          GameRules.field_b = 0;
          cq.a(4313);
          ee.setFrameRate(50, -74);
          RankingsScreen.field_N.setChannelVolumeScale((byte) -125, -1, 256);
          ij.field_u = HalloweenBallSkin.field_m;
          RankingsScreen.field_N.startMusicScore(HalloweenBallSkin.field_m, 8821, true);
          IntrusiveNodeHashTable.a(FreePlayRules.field_e.field_L, 8, sa.field_h.maxDescent + sa.field_h.field_L, 240, FreePlayRules.field_e.field_L + FreePlayRules.field_e.maxDescent, 2, MidiPcmStream.field_y[0].field_z + 5, 5 + MidiPcmStream.field_y[0].field_A, 8, 480, 3, rm.field_g, -23994, sa.field_h, 4, 13421772, sa.field_h.field_L, 320, MidiPcmStream.field_y, rm.field_g, FreePlayRules.field_e);
          PlasmaBallSkin.a(240, MidiPcmStream.field_y[0].field_A + 5, rm.field_g, 8, rm.field_g, 4, 8, FreePlayRules.field_e, 5 + MidiPcmStream.field_y[0].field_z, 2, MidiPcmStream.field_y, -1373633266, 2, 3, 320);
          ArrayWidgetGroup.a(0);
          return true;
        }
        if (Under13NoticePanel.field_R.d(-62) &&
          Under13NoticePanel.field_R.ensureGroupAvailableByName("arialbold14", 0)) {
          if (Under13NoticePanel.field_R.d(-64) &&
            Under13NoticePanel.field_R.ensureGroupAvailableByName("arialish12", 0)) {
            if (QuickChatMenu.field_Zb.d(48) &&
              QuickChatMenu.field_Zb.ensureGroupAvailableByName("arialbold14", 0)) {
              if (QuickChatMenu.field_Zb.d(123) &&
                QuickChatMenu.field_Zb.ensureGroupAvailableByName("arialish12", 0)) {
                if (Under13NoticePanel.field_R.d(107) &&
                  Under13NoticePanel.field_R.ensureGroupAvailableByName("basic", 0)) {
                  if (Under13NoticePanel.field_R.d(-43) &&
                    Under13NoticePanel.field_R.ensureGroupAvailableByName("lobby", 0)) {
                    if (QuickChatMenu.field_Zb.d(-47) &&
                      QuickChatMenu.field_Zb.ensureGroupAvailableByName("lobby", 0)) {
                      if (WeightedLruCache.field_d.d(79) &&
                        WeightedLruCache.field_d.ensureAllGroupsAvailable(-63)) {
                        if (he.field_b.d(105) &&
                          he.field_b.ensureAllGroupsAvailable(-63)) {
                          if (gf.field_g.d(-50) &&
                            gf.field_g.ensureAllGroupsAvailable(-63)) {
                            if (jc.field_a.d(-114) &&
                              jc.field_a.ensureAllGroupsAvailable(-63)) {
                              if (ViewportController.field_q.d(-43) &&
                                ViewportController.field_q.ensureGroupAvailableByName("", 0)) {
                                if (rl.field_h.d(-90) &&
                                  rl.field_h.ensureGroupAvailableByName("", 0)) {
                                  if (Ball.field_z.d(120) &&
                                    Ball.field_z.ensureGroupAvailableByName("", 0)) {
                                    if (fh.field_b.d(-76) &&
                                      fh.field_b.ensureAllGroupsAvailable(-63)) {
                                      if (cp.field_a.d(-90) &&
                                        cp.field_a.ensureAllGroupsAvailable(-63)) {
                                        if (s.field_a.d(-116) &&
                                          s.field_a.ensureAllGroupsAvailable(-63)) {
                                          if (NetworkGameClient.field_F.d(-118) &&
                                            NetworkGameClient.field_F.ensureAllGroupsAvailable(-63)) {
                                            if (!param1) {
                                              var61 = NetworkGameClient.field_F;
                                              var62 = de.waitingforExtradata;
                                              var63 = SoundCache.loadingExtradata;
                                              KeyHandler.a(hp.a(var61, var62, -641, var63), (float)(w.field_i[18] + (w.field_i[19] - w.field_i[18]) * var61.b(0) / 100), false);
                                              return false;
                                            }
                                            ue.a(true);
                                            var64 = cq.unpackingSoundeffects;
                                            KeyHandler.a(var64, (float)w.field_i[19], false);
                                            this.paintFrame((byte) 120);
                                            IntKeyLookup.a(true);
                                            qg.field_g = new SoundCache(WeightedLruCache.field_d, he.field_b);
                                            il.field_c[0] = qg.field_g.a("interface_mouseover_menuitems", true, "");
                                            il.field_c[1] = qg.field_g.a("interface_music_level_change", true, "");
                                            il.field_c[2] = qg.field_g.a("interface_SFX_level_change_chalk", true, "");
                                            il.field_c[3] = qg.field_g.a("interface_select_ballroll_transition", true, "");
                                            for (var3Lifetime1 = 0; var3Lifetime1 < nn.field_b.length; var3Lifetime1++) {
                                              nn.field_b[var3Lifetime1].loadSounds(qg.field_g, 124);
                                            }
                                            if (2 < nn.field_b.length) {
                                              var65_ref = (TikiTableScene) (nn.field_b[2]);
                                              var4 = (PolarTableScene) (nn.field_b[3]);
                                              var4.field_X = var65_ref.field_mb;
                                              var4.field_bb = var65_ref.field_bb;
                                              var4.field_hb = var65_ref.field_S;
                                              var4.field_Y = var65_ref.field_rb;
                                            }
                                            WeightedLruCache.field_d = null;
                                            ArrayWidgetGroup.a(0);
                                            return false;
                                          }
                                          var58 = NetworkGameClient.field_F;
                                          var59 = de.waitingforExtradata;
                                          var60 = SoundCache.loadingExtradata;
                                          KeyHandler.a(hp.a(var58, var59, -641, var60), (float)(w.field_i[18] + (-w.field_i[18] + w.field_i[19]) * var58.b(0) / 100), false);
                                          return false;
                                        }
                                        var55 = s.field_a;
                                        var56 = de.waitingforExtradata;
                                        var57 = SoundCache.loadingExtradata;
                                        KeyHandler.a(hp.a(var55, var56, -641, var57), (float)(w.field_i[17] + (w.field_i[18] - w.field_i[17]) * var55.b(0) / 100), false);
                                        return false;
                                      }
                                      var52 = cp.field_a;
                                      var53 = de.waitingforExtradata;
                                      var54 = SoundCache.loadingExtradata;
                                      KeyHandler.a(hp.a(var52, var53, -641, var54), (float)(w.field_i[16] + (-w.field_i[16] + w.field_i[17]) * var52.b(0) / 100), false);
                                      return false;
                                    }
                                    var49 = fh.field_b;
                                    var50 = de.waitingforExtradata;
                                    var51 = SoundCache.loadingExtradata;
                                    KeyHandler.a(hp.a(var49, var50, -641, var51), (float)(w.field_i[15] + (w.field_i[16] - w.field_i[15]) * var49.b(0) / 100), false);
                                    return false;
                                  }
                                  var46 = Ball.field_z;
                                  var48 = SpaceTableScene.waitingforFonts;
                                  var47 = TickClock.loadingFonts;
                                  KeyHandler.a(dk.a((byte) -21, "", var46, var47, var48), (float)(w.field_i[14] + (w.field_i[15] - w.field_i[14]) * var46.a(100, "") / 100), false);
                                  return false;
                                }
                                var43 = rl.field_h;
                                var45 = rp.waitingforGraphics;
                                var44 = oj.loadingGraphics;
                                KeyHandler.a(dk.a((byte) -1, "", var43, var44, var45), (float)(w.field_i[13] + (w.field_i[14] - w.field_i[13]) * var43.a(100, "") / 100), false);
                                return false;
                              }
                              var40 = ViewportController.field_q;
                              var42 = rp.waitingforGraphics;
                              var41 = oj.loadingGraphics;
                              KeyHandler.a(dk.a((byte) 119, "", var40, var41, var42), (float)(w.field_i[12] + (w.field_i[13] - w.field_i[12]) * var40.a(100, "") / 100), false);
                              return false;
                            }
                            var37 = jc.field_a;
                            var38 = NameEntryPopup.waitingforMusic;
                            var39 = Camera.loadingMusic;
                            KeyHandler.a(hp.a(var37, var38, -641, var39), (float)(w.field_i[11] + (w.field_i[12] - w.field_i[11]) * var37.b(0) / 100), false);
                            return false;
                          }
                          var34 = gf.field_g;
                          var35 = NameEntryPopup.waitingforMusic;
                          var36 = Camera.loadingMusic;
                          KeyHandler.a(hp.a(var34, var35, -641, var36), (float)(w.field_i[10] + (-w.field_i[10] + w.field_i[11]) * var34.b(0) / 100), false);
                          return false;
                        }
                        var31 = he.field_b;
                        var32 = HuffmanCodec.waitingforSoundeffects;
                        var33 = AudioService.loadingSoundeffects;
                        KeyHandler.a(hp.a(var31, var32, -641, var33), (float)(w.field_i[9] + (-w.field_i[9] + w.field_i[10]) * var31.b(0) / 100), false);
                        return false;
                      }
                      var28 = WeightedLruCache.field_d;
                      var29 = HuffmanCodec.waitingforSoundeffects;
                      var30 = AudioService.loadingSoundeffects;
                      KeyHandler.a(hp.a(var28, var29, -641, var30), (float)(w.field_i[8] + (w.field_i[9] - w.field_i[8]) * var28.b(0) / 100), false);
                      return false;
                    }
                    var25 = QuickChatMenu.field_Zb;
                    var27 = SpaceTableScene.waitingforFonts;
                    var26 = TickClock.loadingFonts;
                    KeyHandler.a(dk.a((byte) 118, "lobby", var25, var26, var27), (float)(w.field_i[7] + (-w.field_i[7] + w.field_i[8]) * var25.a(100, "lobby") / 100), false);
                    return false;
                  }
                  var22 = Under13NoticePanel.field_R;
                  var24 = rp.waitingforGraphics;
                  var23 = oj.loadingGraphics;
                  KeyHandler.a(dk.a((byte) 122, "lobby", var22, var23, var24), (float)(w.field_i[6] + (-w.field_i[6] + w.field_i[7]) * var22.a(100, "lobby") / 100), false);
                  return false;
                }
                var19 = Under13NoticePanel.field_R;
                var21 = rp.waitingforGraphics;
                var20 = oj.loadingGraphics;
                KeyHandler.a(dk.a((byte) 101, "basic", var19, var20, var21), (float)(w.field_i[5] + (w.field_i[6] - w.field_i[5]) * var19.a(100, "basic") / 100), false);
                return false;
              }
              var16 = QuickChatMenu.field_Zb;
              var18 = SpaceTableScene.waitingforFonts;
              var17 = TickClock.loadingFonts;
              KeyHandler.a(dk.a((byte) -116, "arialish12", var16, var17, var18), (float)(w.field_i[4] + (-w.field_i[4] + w.field_i[5]) * var16.a(100, "arialish12") / 100), false);
              return false;
            }
            var13 = QuickChatMenu.field_Zb;
            var15 = SpaceTableScene.waitingforFonts;
            var14 = TickClock.loadingFonts;
            KeyHandler.a(dk.a((byte) -61, "arialbold14", var13, var14, var15), (float)(w.field_i[3] + (-w.field_i[3] + w.field_i[4]) * var13.a(100, "arialbold14") / 100), false);
            return false;
          }
          var10 = Under13NoticePanel.field_R;
          var12 = rp.waitingforGraphics;
          var11 = oj.loadingGraphics;
          KeyHandler.a(dk.a((byte) -17, "arialish12", var10, var11, var12), (float)(w.field_i[2] + (-w.field_i[2] + w.field_i[3]) * var10.a(100, "arialish12") / 100), false);
          return false;
        }
        var7 = Under13NoticePanel.field_R;
        var9 = rp.waitingforGraphics;
        var8 = oj.loadingGraphics;
        KeyHandler.a(dk.a((byte) -22, "arialbold14", var7, var8, var9), (float)(w.field_i[1] + (w.field_i[2] - w.field_i[1]) * var7.a(100, "arialbold14") / 100), false);
        return false;
    }

    static {
        field_N = new kf[2];
        potBallsInAnyOrderFinishOnBlack = "Pot the balls in any order and finish on the black.";
        muChatLobbyHide = "Hide lobby chat";
        field_L = new int[4];
    }
}
