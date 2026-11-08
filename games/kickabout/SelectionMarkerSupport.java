/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SelectionMarkerSupport {
    static ResourceArchive field_c;
    static boolean field_b;
    static String field_f;
    static int[] field_a;
    static boolean field_g;
    static ResourceArchive field_d;
    static boolean field_e;

    final static void drawSelectionMarkers(byte param0) {
        if (param0 != -106) {
          SelectionMarkerSupport.drawSelectionMarkers((byte) -44);
        }
        if (!ClassNameSupport.field_a) {
          return;
        }
        if (ArrayWidgetContainer.field_x != -1) {
          SceneSpriteFactory.field_e[2].c(TutorialCaptionSupport.field_k + (-CheckboxPainter.field_k + ArrayWidgetContainer.field_x - 6 + 1), -1 + (TutorialCaptionSupport.field_j - AvailabilityCheckRequest.field_h));
          SceneSpriteFactory.field_e[3].c(ArrayWidgetContainer.field_x + 6 - TutorialCaptionSupport.field_k, -AvailabilityCheckRequest.field_h + (TutorialCaptionSupport.field_j - 1));
          SceneSpriteFactory.field_e[0].c(-AvailabilityCheckRequest.field_h + (ArrayWidgetContainer.field_x - 1), 1 + (TutorialCaptionSupport.field_k - 6) + (-CheckboxPainter.field_k + TutorialCaptionSupport.field_j));
          SceneSpriteFactory.field_e[1].c(-AvailabilityCheckRequest.field_h + (ArrayWidgetContainer.field_x - 1), -TutorialCaptionSupport.field_k + 6 + TutorialCaptionSupport.field_j);
          return;
        }
        if (TutorialCaptionSupport.field_j == -1) {
          return;
        }
        SceneSpriteFactory.field_e[2].c(TutorialCaptionSupport.field_k + (-CheckboxPainter.field_k + ArrayWidgetContainer.field_x - 6 + 1), -1 + (TutorialCaptionSupport.field_j - AvailabilityCheckRequest.field_h));
        SceneSpriteFactory.field_e[3].c(ArrayWidgetContainer.field_x + 6 - TutorialCaptionSupport.field_k, -AvailabilityCheckRequest.field_h + (TutorialCaptionSupport.field_j - 1));
        SceneSpriteFactory.field_e[0].c(-AvailabilityCheckRequest.field_h + (ArrayWidgetContainer.field_x - 1), 1 + (TutorialCaptionSupport.field_k - 6) + (-CheckboxPainter.field_k + TutorialCaptionSupport.field_j));
        SceneSpriteFactory.field_e[1].c(-AvailabilityCheckRequest.field_h + (ArrayWidgetContainer.field_x - 1), -TutorialCaptionSupport.field_k + 6 + TutorialCaptionSupport.field_j);
    }

    final static void clearPlayerPreviewResource(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (PlayerModelPreview.field_q != null) {
          var1 = PlayerModelPreview.field_q;
          synchronized (var1) {
            PlayerModelPreview.field_q = null;
          }
        }
        if (param0 != 98) {
          SelectionMarkerSupport.a(65);
        }
    }

    final static void drawWorldEntries(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          for (var1_int = param0; SplashScreen.field_n.length > var1_int; var1_int++) {
            SplashScreen.field_n[var1_int].draw(-118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "gs.D(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        PacketBuffer.field_l = false;
        WriteIntegersCommand.field_C = ByteArrayPool.field_e.readUnsignedByte((byte) -111) == 0 ? true : false;
        if (param0 == 25957) {
          return;
        }
        field_c = (ResourceArchive) null;
    }

    final static void a(int param0) {
        ContextMenu.b(0, (byte) 60, ReceivedAuctionItem.field_E[1]);
        ScrollBar.clearFadingSounds(param0);
        QuickChatCategory.a(NanoTickClock.field_n, param0 ^ 8710, KitPatternMaskSupport.field_c, RankingsScreen.field_C);
        NetworkArchiveRequest.a(1, TrinketPickerDialog.a(KitPatternMaskSupport.field_c, param0 ^ 77, NanoTickClock.field_n, RankingsScreen.field_C), ReceivedAuctionItem.field_E[2], 2147483647);
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        if (param0 > -80) {
          return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        field_f = "Join <%0>'s game";
        field_a = new int[]{0, 5, 31, 49, 57, 58, 64, 67, 75, 76, 92, 98, 98, 100};
        field_b = false;
        field_g = false;
    }
}
