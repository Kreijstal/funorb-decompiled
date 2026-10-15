/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr {
    static RgbSprite field_c;
    static volatile int pointerIdleTicks;
    static RgbSprite[] field_d;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 <= 109) {
          gr.b(47, 0);
        }
        field_c = null;
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
            field_c = (RgbSprite) null;
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
            gr.sortRankingViews(22, -5);
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

    final static void b(int param0, int param1) {
        MusicCrossfadeStream.field_C = param0;
        if (MusicCrossfadeStream.field_C != 1) {
          ArchiveNetworkClient.field_s = BytePayloadSubmission.smallRosetteSprites;
          WidgetLayer.field_J = UiComponent.field_ib;
          FullscreenFailureKind.field_c = kp.field_e;
          field_c = PlayerInputBatch.field_i;
          Ball.activeBoardMaskSprite = RankingsRequest.field_o;
          we.field_b = ch.field_k;
          FullscreenDialogHelpers.field_e = hc.field_a;
          TextHotspotRegion.field_o = WidgetTextLayout.field_j;
          FireworkBurst.activeBrickSprites = ResourceArchive.field_a;
          HorizontalFrameHelpers.field_d = LevelPackSelectScreen.field_z;
        } else {
          FullscreenDialogHelpers.field_e = JungleBackground.field_v;
          ArchiveNetworkClient.field_s = IntHistoryBuffer.field_l;
          FullscreenFailureKind.field_c = MultiValueSliderRenderer.field_b;
          Ball.activeBoardMaskSprite = MultiValueSliderRenderer.field_e;
          WidgetLayer.field_J = Ball.field_D;
          TextHotspotRegion.field_o = AccountRegistrationPanel.field_R;
          FireworkBurst.activeBrickSprites = TranslucentNineSliceFrame.field_m;
          HorizontalFrameHelpers.field_d = GameConnectionShell.field_D;
          we.field_b = TextHotspotRegion.powerUpMeterIcons;
          field_c = MenuSelection.field_k;
        }
        if (param1 != -28463) {
          pointerIdleTicks = -38;
        }
    }

    static {
        pointerIdleTicks = 0;
        field_b = "<%0> has dropped out.";
    }
}
