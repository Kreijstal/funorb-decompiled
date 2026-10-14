/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameUiController implements GameUiLifecycle {
    static UiComponent field_b;
    static int field_d;
    static UiComponent field_c;
    static UiComponent field_e;
    static String field_f;
    static UiComponent field_a;

    private final boolean pollRequiredData(boolean obfuscationGuard) {
        if (rf.field_g == null) {
          rf.field_g = cp.requestTableData(-2, 0, 2, 10, 3);
        }
        if (!obfuscationGuard) {
          return false;
        }
        if (rf.field_g.complete) {
          be.field_a = true;
          r.field_A = true;
          if (null != rf.field_g.names &&
            null != rf.field_g.names[1][0]) {
            r.field_A = false;
            be.field_a = false;
            return true;
          }
          return true;
        }
        return false;
    }

    public final void initializeUi(boolean obfuscationGuard) {
        boolean discarded$0 = false;
        NodeDeque.a(127, 50);
        pa var2 = new pa(cd.field_h);
        RgbSprite[] var3 = (RgbSprite[]) null;
        MidiSynthesizer.a(1, (RgbSprite[]) null, Ball.field_G, 240, AchievementBrowserScreen.field_A, 8, 2, ContextActionController.field_g, 0, 2, 100, 8, 0, 320, 0);
        hd.a(93, var2, 20, 20);
        if (obfuscationGuard) {
          discarded$0 = this.pollSavedProgress((byte) -1);
        }
        RgbSprite[] var4 = (RgbSprite[]) null;
        nh.a((RgbSprite[]) null, 240, 8, 320, 0, ContextActionController.field_g, 2, 0, 1, AchievementBrowserScreen.field_A, 0, Ball.field_G, 2, (byte) -110, 8);
        MusicVoice.a(20, -97, 20, var2);
        TabbedPane.a(HighscorePackSelector.field_d, CircleBody.field_t, 2, PlayerBoard.field_jb, DualLinkNode.field_k, wn.field_c, (RgbSprite[][]) null, NameEntryPopup.field_Rb, true, 1, jb.field_I, PlayerBoard.field_jb, QuickChatPhraseDefinition.field_C, qh.field_h, 22287);
        ea.field_g = true;
        c.field_e = er.field_b;
        LevelResultSubmission.b(-9, 200);
        KeyboardInput.a(new sb(), 0);
        VolcanicBackground.g(0);
        qn.a(240, 0, 640, 0, -6532);
        bm.a(NodeDequeCursor.field_i, FarmBackground.field_r, 24876, LevelList.field_o, GameScreen.field_e, BackgroundScene.field_f, AchievementIcon.field_s);
        Widget.a(1, ob.field_D);
        hk.h((byte) 55);
        hk.initializeMenuScreens((byte) 115, BackgroundScene.field_f);
        lp.currentScreen = (GameScreen) ((Object) bq.a(21, 28472));
        co.a((byte) -79, cd.field_g);
    }

    final static GameScreen getScreen(int screenId, byte obfuscationGuard) {
        if (-1 == screenId) {
          return (GameScreen) ((Object) IntArrayRequest.gameplayScreen);
        }
        if (screenId == -2) {
          return (GameScreen) ((Object) BackgroundScene.field_p);
        }
        if (obfuscationGuard > -5) {
          field_e = (UiComponent) null;
        }
        return (GameScreen) ((Object) bq.a(screenId, 28472));
    }

    public static void c(boolean param0) {
        field_f = null;
        field_e = null;
        if (param0) {
          GameUiController.c(true);
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    public final boolean pollUiReady(int obfuscationGuard) {
        boolean stackIn_15_0 = false;
        if (!ResourceRequest.field_y) {
          ResourceRequest.field_y = NameEntryPopup.d((byte) -126);
        }
        if (!jc.field_H) {
          jc.field_H = this.pollSavedProgress((byte) 127);
        }
        if (obfuscationGuard != 23570) {
          this.initializeUi(true);
        }
        if (!QuickChatParameterType.field_b) {
          QuickChatParameterType.field_b = this.pollRequiredData(true);
        }
        stackIn_15_0 = (ResourceRequest.field_y) && (jc.field_H) && (QuickChatParameterType.field_b);
        return stackIn_15_0;
    }

    private final boolean pollSavedProgress(byte obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null == OptionsScreen.progressRequests) {
          OptionsScreen.progressRequests = new IntArrayRequest[2];
          for (var2 = 0; var2 < 2; var2++) {
            OptionsScreen.progressRequests[var2] = fa.requestIntArray(1, (byte) -72, var2, 5);
          }
        }
        var2Lifetime1 = 1;
        var3 = 0;
        if (obfuscationGuard != 127) {
          return true;
        }
        while (var3 < 2) {
          if (OptionsScreen.progressRequests[var3] != null) {
            if (!OptionsScreen.progressRequests[var3].complete) {
              var2Lifetime1 = 0;
            } else {
              if (OptionsScreen.progressRequests[var3].values[0] > hh.unlockedLevelCounts[var3]) {
                hh.unlockedLevelCounts[var3] = OptionsScreen.progressRequests[var3].values[0];
              }
              jj.field_d = jj.field_d | ln.a(na.field_L[var3], 0, true, hh.unlockedLevelCounts[var3]);
              if (!DelayedPacket.c(obfuscationGuard ^ 27)) {
                hh.unlockedLevelCounts[var3] = 0;
              } else {
                hh.unlockedLevelCounts[var3] = 0;
              }
            }
          }
          var3++;
        }
        if (var2Lifetime1 != 0) {
          OptionsScreen.progressRequests = null;
        }
        return var2Lifetime1 != 0;
    }

    public final void prepareUiAssets(boolean obfuscationGuard) {
        if (null != GameplayAudioEvent.field_k) {
          QuickChatMenu.a(!obfuscationGuard ? true : false, GameplayAudioEvent.field_k);
          GameplayAudioEvent.field_k = null;
          hc.b(2);
        }
        uf.field_a = aj.a(3, true);
        BackgroundScene.field_f = bq.a(-6, 0, false, 5, true);
        ScorePopup.field_l = aj.a(6, true);
        FarmBackground.field_r = aj.a(7, true);
        AchievementIcon.field_s = aj.a(8, obfuscationGuard);
        LevelList.field_o = aj.a(9, true);
        NodeDequeCursor.field_i = aj.a(10, true);
        nl.field_a = aj.a(11, true);
        IntHistoryBuffer.field_i = aj.a(12, true);
        QuickChatPhraseDefinition.field_C = aj.a(13, true);
        wn.a(NameEntryPopup.field_Rb, wn.field_c, 0);
        bh.field_tb = new s(82);
        bh.field_tb.a(tm.field_e, "basic", 125, WidgetGroup.field_F, NameEntryPopup.field_Rb);
        bh.field_tb.a(tm.field_e, "lobby", 126, WidgetGroup.field_F, NameEntryPopup.field_Rb);
        bh.field_tb.a(tm.field_e, "lobby", 124, WidgetGroup.field_F, wn.field_c);
        bh.field_tb.a(tm.field_e, "kartika13", 125, WidgetGroup.field_F, NameEntryPopup.field_Rb);
        bh.field_tb.a(tm.field_e, "basic", 126, WidgetGroup.field_F, BackgroundScene.field_f);
        bh.field_tb.a(vh.field_P, "basic", -126, m.field_k, ScorePopup.field_l);
        bh.field_tb.a(vh.field_P, "kartika13", 127, m.field_k, wn.field_c);
        bh.field_tb.a(FarmBackground.field_r, false, MovingBody.field_n, wl.field_Q);
        bh.field_tb.a(AchievementIcon.field_s, false, MovingBody.field_n, wl.field_Q);
        bh.field_tb.a(LevelList.field_o, false, BallPulseEffect.field_i, sg.field_m);
        bh.field_tb.a(NodeDequeCursor.field_i, false, cm.field_n, bb.field_a);
        bh.field_tb.a(nl.field_a, false, fa.field_j, uo.field_a);
        bh.field_tb.a(IntHistoryBuffer.field_i, false, fa.field_j, uo.field_a);
        bh.field_tb.a(QuickChatPhraseDefinition.field_C, !obfuscationGuard ? true : false, IntHistoryBuffer.field_k, qm.field_e);
        bh.field_tb.a(uf.field_a, false, IntHistoryBuffer.field_k, qm.field_e);
    }

    public final boolean pollUiBootstrap(byte obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = 1;
        var3 = be.uiBootstrapStage;
        if (0 != var3) {
          if (var3 != 1) {
            if (var3 != 2) {
              if (3 != var3) {
                if (4 == var3) {
                  ParisBackground.a((byte) 24, 92.0f, Ball.field_x);
                  sl.field_C.renderClient(121);
                  sb.a(nl.field_a, IntHistoryBuffer.field_i, 2);
                } else {
                  if (var3 != 5) {
                    return true;
                  }
                  rj.installTextHuffman(new HuffmanCodec(uf.field_a.takeFileByName(121, "", "huffman")), false);
                  uf.field_a = null;
                }
              } else {
                ParisBackground.a((byte) 24, 90.0f, MessageScreen.field_u);
                sl.field_C.renderClient(106);
                so.a(BackgroundScene.field_f, NameEntryPopup.field_Rb, ScorePopup.field_l, 29137, wn.field_c);
              }
            } else {
              ParisBackground.a((byte) 24, 88.0f, sf.field_bb);
              sl.field_C.renderClient(124);
              var2 = var2 != 0 & wo.a(2) ? 1 : 0;
            }
          } else {
            ParisBackground.a((byte) 24, 82.0f, BitPacketBuffer.field_s);
            sl.field_C.renderClient(123);
            o.c(123);
          }
        } else {
          mc.a((byte) 115);
          LevelList.a(-1);
          SecondaryNodeQueue.a(LevelList.field_o, NodeDequeCursor.field_i, (byte) -38, AchievementIcon.field_s, FarmBackground.field_r);
        }
        if (var2 != 0) {
          be.uiBootstrapStage = be.uiBootstrapStage + 1;
        }
        hc.b(2);
        if (obfuscationGuard < -41) {
          return false;
        }
        field_a = (UiComponent) null;
        return false;
    }

    static {
        field_d = -1;
        field_f = "This password is part of your Player Name, and would be easy to guess";
    }
}
