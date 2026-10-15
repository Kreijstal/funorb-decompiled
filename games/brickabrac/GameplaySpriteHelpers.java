/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameplaySpriteHelpers {
    static RgbSprite activeBallSprite;
    static volatile int pointerIdleTicks;
    static RgbSprite[] menuLeverSprites;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        menuLeverSprites = null;
        if (param0 <= 109) {
          GameplaySpriteHelpers.selectGameplaySpriteScale(47, 0);
        }
        activeBallSprite = null;
    }

    final static byte[] a(boolean param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            activeBallSprite = (RgbSprite) null;
          }
          stackIn_3_0 = SaveResultsPromptScreen.field_t.takeFileByName(-61, "", param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gr.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void sortRankingViews(int obfuscationGuard, int rowLimit) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          ti.sortRankingIndexRange(BoundedFile.field_l, IntArrayRequest.field_u, ProxySocketConnector.rankingRowCount, true, 97, rowLimit, 0);
          if (obfuscationGuard != 12429) {
            GameplaySpriteHelpers.sortRankingViews(22, -5);
          }
          for (var2_int = 0; var2_int < ProxySocketConnector.rankingRowCount; var2_int++) {
            VerticalScrollbar.rankingSortIndices[var2_int + rowLimit] = var2_int;
          }
          ti.sortRankingIndexRange(KeyDispatchHelpers.field_b, ba.field_w, rowLimit + ProxySocketConnector.rankingRowCount, false, 118, rowLimit + rowLimit, rowLimit);
          if (rowLimit < ProxySocketConnector.rankingRowCount) {
            ProxySocketConnector.rankingRowCount = rowLimit;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "gr.D(" + obfuscationGuard + ',' + rowLimit + ')');
        }
    }

    final static void selectGameplaySpriteScale(int scaleDivisor, int obfuscationGuard) {
        MusicCrossfadeStream.activeGameplayScaleDivisor = scaleDivisor;
        if (MusicCrossfadeStream.activeGameplayScaleDivisor != 1) {
          ArchiveNetworkClient.activeRosetteSprites = BytePayloadSubmission.smallRosetteSprites;
          WidgetLayer.activeSteelBallSprite = UiComponent.halfSteelBallSprite;
          FullscreenFailureKind.activePaddleCapSprites = kp.halfPaddleCapSprites;
          activeBallSprite = PlayerInputBatch.halfBallSprite;
          Ball.activeBoardMaskSprite = RankingsRequest.halfBoardMaskSprite;
          ReflectionCheckHelpers.activePowerUpSprites = ch.halfPowerUpSprites;
          FullscreenDialogHelpers.activePaddleFlameSprites = MeshLobbyUiHelpers.halfPaddleFlameSprites;
          TextHotspotRegion.activePaddleCenterSprite = WidgetTextLayout.halfPaddleCenterSprite;
          FireworkBurst.activeBrickSprites = ResourceArchive.halfBrickSprites;
          HorizontalFrameHelpers.activePaddleSegmentSprites = LevelPackSelectScreen.halfPaddleSegmentSprites;
        } else {
          FullscreenDialogHelpers.activePaddleFlameSprites = JungleBackground.fullPaddleFlameSprites;
          ArchiveNetworkClient.activeRosetteSprites = IntHistoryBuffer.largeRosetteSprites;
          FullscreenFailureKind.activePaddleCapSprites = MultiValueSliderRenderer.fullPaddleCapSprites;
          Ball.activeBoardMaskSprite = MultiValueSliderRenderer.fullBoardMaskSprite;
          WidgetLayer.activeSteelBallSprite = Ball.fullSteelBallSprite;
          TextHotspotRegion.activePaddleCenterSprite = AccountRegistrationPanel.fullPaddleCenterSprite;
          FireworkBurst.activeBrickSprites = TranslucentNineSliceFrame.fullBrickSprites;
          HorizontalFrameHelpers.activePaddleSegmentSprites = GameConnectionShell.fullPaddleSegmentSprites;
          ReflectionCheckHelpers.activePowerUpSprites = TextHotspotRegion.powerUpMeterIcons;
          activeBallSprite = MenuSelection.fullBallSprite;
        }
        if (obfuscationGuard != -28463) {
          pointerIdleTicks = -38;
        }
    }

    static {
        pointerIdleTicks = 0;
        field_b = "<%0> has dropped out.";
    }
}
