/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SharedPanelFactory {
    static PcmPlayerService field_d;
    static String field_c;
    static int field_b;
    static String[] field_a;

    final static void createSharedPanels(int param0, boolean param1) {
        HighScoreQuery.field_l = param1 ? new SocialTabsPanel(TextHotspotWidget.field_H, DialogOverlay.field_e) : new SocialTabsPanel(ClientPacketFlushSupport.field_d, AchievementsScreen.field_C);
        TrinketIcon.field_Cb = new UiLayoutNode(0L, (UiLayoutNode) null);
        if (param0 == -35) {
          TrinketIcon.field_Cb.addChild((byte) -110, (UiLayoutNode) (HighScoreQuery.field_l.tabs));
          TrinketIcon.field_Cb.addChild((byte) -126, TrinketUnlockNotice.field_b);
          SocialUiState.field_f = new UiLayoutNode(0L, ChatMessage.field_e);
          RasterGlowSupport.field_g = new UiLayoutNode(0L, (UiLayoutNode) null);
          SocialUiState.field_f.addChild((byte) -125, TextLineLayoutSupport.field_b);
          SocialUiState.field_f.addChild((byte) -105, RasterGlowSupport.field_g);
          RasterGlowSupport.field_g.addChild((byte) -124, TickClock.field_d);
          RasterGlowSupport.field_g.addChild((byte) -119, BlackFadeScreen.field_i);
          MatchUiLayoutSupport.layoutMatchUi(93, param1);
          return;
        }
        field_c = (String) null;
        TrinketIcon.field_Cb.addChild((byte) -110, (UiLayoutNode) (HighScoreQuery.field_l.tabs));
        TrinketIcon.field_Cb.addChild((byte) -126, TrinketUnlockNotice.field_b);
        SocialUiState.field_f = new UiLayoutNode(0L, ChatMessage.field_e);
        RasterGlowSupport.field_g = new UiLayoutNode(0L, (UiLayoutNode) null);
        SocialUiState.field_f.addChild((byte) -125, TextLineLayoutSupport.field_b);
        SocialUiState.field_f.addChild((byte) -105, RasterGlowSupport.field_g);
        RasterGlowSupport.field_g.addChild((byte) -124, TickClock.field_d);
        RasterGlowSupport.field_g.addChild((byte) -119, BlackFadeScreen.field_i);
        MatchUiLayoutSupport.layoutMatchUi(93, param1);
    }

    final static int pollPromptAction(int param0) {
        int stackIn_11_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          var1_int = 0;
          var2 = 0;
          while (TexturedPanelPainter.$cfr$intArgs$b$c4997cb15529(-59)) {
            DirectByteStorage.field_k.d(param0 + 101);
            if (DirectByteStorage.field_k.c(param0 + 2)) {
              var1_int = 1;
            }
            if (FixedQuaternion.field_e != 13) {
              continue;
            }
            var2 = 1;
          }
          DirectByteStorage.field_k.a(-21174, ResourceArchive.a(BytePlusOneCommand.field_A, ArchiveManager.field_m, (byte) -96), ResourceArchive.a(HighScoreSubmission.field_q, ReceivedAuctionItem.field_y, (byte) -101));
          if (DirectByteStorage.field_k.c(-1)) {
            var1_int = 1;
          }
          if (param0 != -3) {
            stackIn_11_0 = -10;
            return stackIn_11_0;
          }
          var3 = 0;
          if (var1_int != 0 &&
            DirectByteStorage.field_k.selectedIndex >= 0) {
            var3 = LineupPositionSupport.field_f[DirectByteStorage.field_k.selectedIndex];
            if (var3 == 2) {
              ArchivePreloadEntry.clearAccountChoiceResources((byte) -43);
            } else if (var3 == 5) {
              ArchivePreloadEntry.clearAccountChoiceResources((byte) -43);
            }
          } else {
            if (var2 != 0 &&
              TextPromptState.field_a != 2) {
              ArchivePreloadEntry.clearAccountChoiceResources((byte) -16);
            }
          }
          if (var3 == 0 &&
            TextPromptState.field_a == 2) {
            var4 = -PlayingView.field_o + MonotonicClock.monotonicMillis(param0 ^ -51);
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              TrinketCountSortCriterion.a(true, 6, 5);
              var3 = 2;
            }
          }
          stackIn_28_0 = var3;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "pg.E(" + param0 + ')');
        }
    }

    final static String[] getMessageButtonLabels(boolean param0, int param1) {
        if (param1 == 1) {
          return AccountChoicePanel.field_I;
        }
        if (param1 == 9) {
          return GameModeDefinition.field_e;
        }
        if (10 == param1) {
          return GameModeDefinition.field_e;
        }
        if (param1 == 8) {
          return ArchiveSource.field_d;
        }
        if (param1 == 11) {
          return PanelSpriteFactory.field_a;
        }
        if (param1 == 18) {
          return PanelSpriteFactory.field_a;
        }
        if (param1 == 19) {
          return PanelSpriteFactory.field_a;
        }
        if (param1 == 32) {
          return PanelSpriteFactory.field_a;
        }
        if (37 == param1) {
          return PanelSpriteFactory.field_a;
        }
        if (param1 == 24) {
          return PanelSpriteFactory.field_a;
        }
        if (param1 == 25) {
          return LoginForm.field_M;
        }
        if (param0) {
          SharedPanelFactory.getMessageButtonLabels(false, -50);
        }
        if (23 == param1) {
          return FullscreenFocusCanvas.field_i;
        }
        if (param1 == 29) {
          return PanelSpriteFactory.field_a;
        }
        if (param1 == 34) {
          return PanelSpriteFactory.field_a;
        }
        if (param1 == 30) {
          return PanelSpriteFactory.field_a;
        }
        if (param1 == 21) {
          return ReflectionCheck.field_q;
        }
        if (param1 == 20) {
          return PanelSpriteFactory.field_a;
        }
        return AuctionItem.field_u;
    }

    public static void releaseStatics(int param0) {
        if (param0 <= 125) {
          return;
        }
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static RenderedFootballer createThrottledPlayerPreview(int param0, int param1, PlayerStats param2, int param3, int param4) {
        long var5_long = 0L;
        RuntimeException var5 = null;
        RenderedFootballer stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        PlayerStats stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        PlayerStats stackIn_8_3;
        int stackIn_8_4;
        boolean stackIn_9_5 = false;
        boolean stackIn_13_3;
        RenderedFootballer stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -62) {
            stackIn_2_0 = (RenderedFootballer) null;
            return stackIn_2_0;
          }
          var5_long = MonotonicClock.monotonicMillis(51);
          if (80L > -ClientUiOverlay.field_d + var5_long) {
            stackIn_5_0 = null;
            return (RenderedFootballer) (stackIn_5_0);
          }
          ClientUiOverlay.field_d = var5_long;
          stackIn_8_0 = (PlayerStats) (param2);
          stackIn_8_1 = param1;
          stackIn_8_2 = param4;
          stackIn_8_3 = (PlayerStats) (param2);
          stackIn_8_4 = -107;
          stackIn_9_5 = !(param2.f(13467));
          stackIn_13_3 = (((PlayerStats) (Object) stackIn_8_3).c((byte) stackIn_8_4, stackIn_9_5)) && (AccountRegistrationResponse.a((byte) 34));
          stackIn_14_0 = PlayerInputFactory.createRenderedPlayer(stackIn_8_0, stackIn_8_1, stackIn_8_2, stackIn_13_3, param0, (byte) 106);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("pg.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_c = "Close";
    }
}
