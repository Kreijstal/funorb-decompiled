/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BenefitsScreenHelpers {
    static int field_b;
    static int field_a;
    static ScrollContainer field_c;

    final static void removeSoundStream(boolean param0, PlayingSound param1) {
        if (param0) {
          return;
        }
        try {
          UiTheme.field_e.removeSubstream(param1.field_v);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void insertLobbyPlayerSorted(int param0, LobbyPlayer param1) {
        LobbyPlayer var2 = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          param1.unlink(4);
          var2 = (LobbyPlayer) (IterableNodeHashTable.field_m.first(13058));
          if (param0 <= 123) {
            field_a = -70;
          }
          while (var2 != null) {
            if (var2.sortsBefore(param1, -81)) {
              var2 = (LobbyPlayer) (IterableNodeHashTable.field_m.next((byte) -25));
              continue;
            }
            break;
          }
          if (var2 == null) {
            IterableNodeHashTable.field_m.addLast(3, param1);
          } else {
            IsaacRandom.insertNodeBefore(var2, 30, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("la.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void drawBenefitsScreen(int param0) {
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        boolean stackIn_58_2 = false;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        boolean stackIn_67_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RgbSprite var2_ref_wk = null;
        int var3 = 0;
        RgbSprite var4_ref_wk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        RgbSprite var10 = null;
        int var11 = 0;
        RgbSprite var12 = null;
        String var14 = null;
        RgbSprite var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var10_intLifetime3;
        var11 = SteelSentinels.obfuscationControl;
        try {
          if (null != Js5ArchiveManager.field_d &&
            Js5ArchiveManager.field_d.ensureIndex(true) &&
            Js5ArchiveManager.field_d.isGroupLoadedByName("benefits", (byte) 90) &&
            UsernameCredentials.field_h != null &&
            UsernameCredentials.field_h.ensureIndex(true) &&
            UsernameCredentials.field_h.isGroupLoadedByName("benefits", (byte) 90)) {
            PendingByteArrayRequest.field_o = PacketLoopHelpers.loadRgbSpriteByName(Js5ArchiveManager.field_d, "benefits", "headline", false);
            RewardValueHelpers.field_i = PacketLoopHelpers.loadRgbSpriteByName(Js5ArchiveManager.field_d, "benefits", "blurbpane", false);
            QuickChatInputHelpers.field_e = PacketLoopHelpers.loadRgbSpriteByName(Js5ArchiveManager.field_d, "benefits", "button", false);
            TextLayout.field_f = PacketLoopHelpers.loadRgbSpriteByName(Js5ArchiveManager.field_d, "benefits", "signup_text", false);
            ValidatedTextWidget.field_pb = PacketLoopHelpers.loadRgbSpriteByName(Js5ArchiveManager.field_d, "benefits", "menu_text", false);
            ValidatedTextWidget.field_ub = PacketLoopHelpers.loadRgbSpriteByName(Js5ArchiveManager.field_d, "benefits", "button_frame", false);
            NodeIterator.field_b = PacketLoopHelpers.loadRgbSpriteByName(Js5ArchiveManager.field_d, "benefits", "arrow", false);
            FullscreenFocusCanvas.field_g = (BitmapFont) ((Object) TransitionTimerHelpers.loadBinaryFontByName(UsernameCredentials.field_h, "benefits", Js5ArchiveManager.field_d, -1, "large_font"));
            ChatPanelSetupHelpers.field_a = (BitmapFont) ((Object) TransitionTimerHelpers.loadBinaryFontByName(UsernameCredentials.field_h, "benefits", Js5ArchiveManager.field_d, -1, "small_font"));
            var27 = SoftwareRaster.field_g;
            var2 = SoftwareRaster.field_c;
            var3 = SoftwareRaster.field_j;
            SoftwareRaster.getClip(ImageProducerRasterBuffer.field_n);
            var4_ref_wk = new RgbSprite(NodeIterator.field_b.field_A + 4, 4 + NodeIterator.field_b.field_F);
            var4_ref_wk.bindRasterTarget();
            NodeIterator.field_b.drawTintedGrayscale(2, 2, TableColumns.field_h);
            ReflectionCheckHelpers.drawSpriteOutline(2, 0, 0, (byte) -19, var4_ref_wk.field_F, 1, var4_ref_wk, var4_ref_wk.field_A);
            NodeIterator.field_b = var4_ref_wk;
            SocialPacketHelpers.field_e = NodeIterator.field_b.copyFlippedHorizontal();
            var12 = new RgbSprite(195, 221);
            var6 = var12.field_A / 2;
            var12.bindRasterTarget();
            FullscreenFocusCanvas.field_g.drawCentered(SocketConnector.formatTemplate(HighscoreColumnHeader.field_a, -127, new String[]{GzipDecoder.field_d}), var6, 40, 16777215, -1);
            ChatPanelSetupHelpers.field_a.drawCentered(SocketConnector.formatTemplate(SceneWidget.field_Bb, -119, new String[]{GzipDecoder.field_d}), var6, 60, 16777215, -1);
            FullscreenFocusCanvas.field_g.drawCentered(SocketConnector.formatTemplate(PendingAckRequest.field_z, -40, new String[]{PopupMenuHelpers.field_c}), var6, 110, 16777215, -1);
            ChatPanelSetupHelpers.field_a.drawCentered(SocketConnector.formatTemplate(IntKeyLookup.field_f, -25, new String[]{PopupMenuHelpers.field_c}), var6, 130, 16777215, -1);
            FullscreenFocusCanvas.field_g.drawCentered(QuickChatHelpDialog.field_Xb, var6, 180, 16777215, -1);
            ChatPanelSetupHelpers.field_a.drawCentered(ChatPanelSetupHelpers.field_c, var6, 200, 16777215, -1);
            ReflectionCheckHelpers.drawSpriteOutline(3, 0, 0, (byte) -45, var12.field_F, 1, var12, var12.field_A);
            RewardValueHelpers.field_i.bindRasterTarget();
            var12.drawTransparent(18 - RewardValueHelpers.field_i.field_D, -RewardValueHelpers.field_i.field_H + 241);
            for (var7 = 0; Js5ArchiveManager.field_f.length > var7; var7++) {
              AccountMessagePanel.field_R[var7].bindRasterTarget();
              ChatPanelSetupHelpers.field_a.drawParagraph(Js5ArchiveManager.field_f[var7], 3, 3, AccountMessagePanel.field_R[var7].field_A - 6, -6 + AccountMessagePanel.field_R[var7].field_F, TableColumns.field_h, -1, 1, 1, ChatPanelSetupHelpers.field_a.field_F + ChatPanelSetupHelpers.field_a.field_G);
              ReflectionCheckHelpers.drawSpriteOutline(3, 0, 0, (byte) -79, AccountMessagePanel.field_R[var7].field_F, 1, AccountMessagePanel.field_R[var7], AccountMessagePanel.field_R[var7].field_A);
            }
            Js5ArchiveManager.field_f = null;
            ChatHistoryHelpers.field_e = TextLayout.field_f.copySprite();
            ChatHistoryHelpers.field_e.bindRasterTarget();
            MusicPatchPcmStream.recolorGreenPixelsInRect(SoftwareRaster.field_j * 2 / 3, 0, SoftwareRaster.field_c, 64, 0, 40);
            SoftwareRaster.setTarget(var27, var2, var3);
            SoftwareRaster.setClip(ImageProducerRasterBuffer.field_n);
            LoadingCaptionHelpers.field_a = (QuickChatInputHelpers.field_e.field_F - ValidatedTextWidget.field_ub.field_F) / 2 + 390;
            Js5ArchiveManager.field_d = null;
            PendingAckRequest.field_u = 434 + (-ValidatedTextWidget.field_ub.field_A + QuickChatInputHelpers.field_e.field_A) / 2;
            RasterSnapshot.field_s = 231 + (-ValidatedTextWidget.field_ub.field_A + QuickChatInputHelpers.field_e.field_A) / 2;
            ClientException.field_m = (QuickChatInputHelpers.field_e.field_F - ValidatedTextWidget.field_ub.field_F) / 2 + 390;
          }
          if (null == EditableTextWidget.field_kb) {
            return;
          }
          var1_int = -79 / ((-22 - param0) / 42);
          if (PendingIntArrayRequest.field_r != null &&
            null != FullscreenFocusCanvas.field_g) {
            var28 = SoftwareRaster.field_g;
            var3Lifetime1 = SoftwareRaster.field_c;
            var4 = SoftwareRaster.field_j;
            SoftwareRaster.getClip(ImageProducerRasterBuffer.field_n);
            var14 = SocketConnector.formatTemplate(CombatWorld.field_x, -69, new String[]{ResourceArchive.field_m[MouseInputHandler.field_j]});
            var6Lifetime1 = FullscreenFocusCanvas.field_g.getWrappedWidth(var14, TutorialStepTable.field_b);
            var7Lifetime1 = FullscreenFocusCanvas.field_g.paragraphHeight(var14, TutorialStepTable.field_b, FullscreenFocusCanvas.field_g.field_G + FullscreenFocusCanvas.field_g.field_F);
            var8 = BufferedSocket.field_e + (-var6Lifetime1 + TutorialStepTable.field_b) / 2;
            var9 = NameSuggestionsPanel.field_W + (ClientErrorSupport.field_g - var7Lifetime1) / 2;
            var8 -= 3;
            var6Lifetime1 += 6;
            if (var8 < 0) {
              var10_int = -var8;
              var8 = var8 + var10_int;
              BufferedSocket.field_e = BufferedSocket.field_e + var10_int;
              TextHotspotRegion.field_t = TextHotspotRegion.field_t - var10_int;
              PendingIntArrayRequest.field_r.field_D = PendingIntArrayRequest.field_r.field_D + var10_int;
              var6Lifetime1 = var6Lifetime1 + 2 * var10_int;
              PendingIntArrayRequest.field_r.field_z = PendingIntArrayRequest.field_r.field_z + var10_int * 2;
            }
            var7Lifetime1 += 6;
            var9 -= 3;
            if (PendingIntArrayRequest.field_r.field_z < var8 + var6Lifetime1) {
              var10_intLifetime1 = var8 + var6Lifetime1 - PendingIntArrayRequest.field_r.field_z;
              PendingIntArrayRequest.field_r.field_D = PendingIntArrayRequest.field_r.field_D + var10_intLifetime1;
              var6Lifetime1 = var6Lifetime1 + 2 * var10_intLifetime1;
              PendingIntArrayRequest.field_r.field_z = PendingIntArrayRequest.field_r.field_z + var10_intLifetime1 * 2;
              var8 = var8 + var10_intLifetime1;
              BufferedSocket.field_e = BufferedSocket.field_e + var10_intLifetime1;
              TextHotspotRegion.field_t = TextHotspotRegion.field_t - var10_intLifetime1;
            }
            if (var9 < 0) {
              var10_intLifetime2 = -var9;
              NameSuggestionsPanel.field_W = NameSuggestionsPanel.field_W + var10_intLifetime2;
              var9 = var9 + var10_intLifetime2;
              PendingIntArrayRequest.field_r.field_B = PendingIntArrayRequest.field_r.field_B + 2 * var10_intLifetime2;
              MusicPatchPcmStream.field_y = MusicPatchPcmStream.field_y - var10_intLifetime2;
              PendingIntArrayRequest.field_r.field_H = PendingIntArrayRequest.field_r.field_H + var10_intLifetime2;
              var7Lifetime1 = var7Lifetime1 + var10_intLifetime2 * 2;
            }
            if (var7Lifetime1 + var9 > PendingIntArrayRequest.field_r.field_B) {
              var10_intLifetime3 = -PendingIntArrayRequest.field_r.field_B + var9 + var7Lifetime1;
              var9 = var9 + var10_intLifetime3;
              PendingIntArrayRequest.field_r.field_B = PendingIntArrayRequest.field_r.field_B + 2 * var10_intLifetime3;
              var7Lifetime1 = var7Lifetime1 + 2 * var10_intLifetime3;
              PendingIntArrayRequest.field_r.field_H = PendingIntArrayRequest.field_r.field_H + var10_intLifetime3;
              NameSuggestionsPanel.field_W = NameSuggestionsPanel.field_W + var10_intLifetime3;
              MusicPatchPcmStream.field_y = MusicPatchPcmStream.field_y - var10_intLifetime3;
            }
            PendingIntArrayRequest.field_r.normalizeCanvas();
            var10 = new RgbSprite(PendingIntArrayRequest.field_r.field_z, PendingIntArrayRequest.field_r.field_B);
            var10.bindRasterTarget();
            FullscreenFocusCanvas.field_g.drawParagraph(var14, BufferedSocket.field_e, NameSuggestionsPanel.field_W, TutorialStepTable.field_b, ClientErrorSupport.field_g, 16777215, -1, 1, 1, FullscreenFocusCanvas.field_g.field_F + FullscreenFocusCanvas.field_g.field_G);
            ReflectionCheckHelpers.drawSpriteOutline(3, 0, 0, (byte) -119, var10.field_B, 1, var10, var10.field_z);
            PendingIntArrayRequest.field_r.bindRasterTarget();
            var10.drawTransparent(0, 0);
            ArchiveProvider.field_e = new RgbSprite(640, 480);
            ArchiveProvider.field_e.bindRasterTarget();
            PendingIntArrayRequest.field_r.drawRotatedAboutCenter((PendingIntArrayRequest.field_r.field_z >> 1) + TextHotspotRegion.field_t, (PendingIntArrayRequest.field_r.field_B >> 1) + MusicPatchPcmStream.field_y, UrlAndReplyHelpers.field_e, 4096);
            PendingIntArrayRequest.field_r = null;
            ArchiveProvider.field_e.trimTransparentBorders();
            SoftwareRaster.setTarget(var28, var3Lifetime1, var4);
            SoftwareRaster.setClip(ImageProducerRasterBuffer.field_n);
          }
          if (NameSuggestionsPanel.field_P != null &&
            null != ChatPanelSetupHelpers.field_a) {
            var29 = SoftwareRaster.field_g;
            var3Lifetime2 = SoftwareRaster.field_c;
            var4Lifetime1 = SoftwareRaster.field_j;
            SoftwareRaster.getClip(ImageProducerRasterBuffer.field_n);
            var16 = new RgbSprite(412, 43);
            var6_ref_String = SocketConnector.formatTemplate(PlayerContextMenu.field_l, -109, new String[]{NameSuggestionsPanel.field_P});
            NameSuggestionsPanel.field_P = null;
            var16.bindRasterTarget();
            ChatPanelSetupHelpers.field_a.drawParagraph(var6_ref_String, 3, 3, var16.field_A - 6, var16.field_F - 6, 16777215, -1, 0, 1, ChatPanelSetupHelpers.field_a.field_G + ChatPanelSetupHelpers.field_a.field_F);
            ReflectionCheckHelpers.drawSpriteOutline(3, 0, 0, (byte) -42, var16.field_F, 1, var16, var16.field_A);
            EditableTextWidget.field_kb.bindRasterTarget();
            var16.drawTransparent(-EditableTextWidget.field_kb.field_D + 199, -EditableTextWidget.field_kb.field_H + 83);
            SoftwareRaster.setTarget(var29, var3Lifetime2, var4Lifetime1);
            SoftwareRaster.setClip(ImageProducerRasterBuffer.field_n);
          }
          if (LoginCredentialHelpers.field_i != null &&
            ChatPanelSetupHelpers.field_a != null) {
            var30 = SoftwareRaster.field_g;
            var3Lifetime3 = SoftwareRaster.field_c;
            var4Lifetime2 = SoftwareRaster.field_j;
            SoftwareRaster.getClip(ImageProducerRasterBuffer.field_n);
            var5 = ChatPanelSetupHelpers.field_a.getWrappedWidth(TextFieldValidator.field_j, 640) + 6;
            var6Lifetime2 = 20 + (var5 + LoginCredentialHelpers.field_i.field_z);
            var7Lifetime2 = 427 - var6Lifetime2 / 2;
            var8Lifetime1 = LoginCredentialHelpers.field_i.field_z + (var7Lifetime2 + 20);
            EditableTextWidget.field_kb.bindRasterTarget();
            ChatPanelSetupHelpers.field_a.drawLeft(TextFieldValidator.field_j, -EditableTextWidget.field_kb.field_D + var8Lifetime1, ChatPanelSetupHelpers.field_a.field_F + ChatPanelSetupHelpers.field_a.field_G + (155 - EditableTextWidget.field_kb.field_H), 16777215, -1);
            ReflectionCheckHelpers.drawSpriteOutline(3, var8Lifetime1 - EditableTextWidget.field_kb.field_D - 4, 155 - EditableTextWidget.field_kb.field_H, (byte) -60, 50, 1, EditableTextWidget.field_kb, var5);
            var9Lifetime1 = 155 - EditableTextWidget.field_kb.field_H - (-ChatPanelSetupHelpers.field_a.field_F + (-ChatPanelSetupHelpers.field_a.field_G + LoginCredentialHelpers.field_i.field_B - 3)) / 2;
            LoginCredentialHelpers.field_i.drawTransparent(-EditableTextWidget.field_kb.field_D + var7Lifetime2, var9Lifetime1);
            SoftwareRaster.setTarget(var30, var3Lifetime3, var4Lifetime2);
            SoftwareRaster.setClip(ImageProducerRasterBuffer.field_n);
            LoginCredentialHelpers.field_i = null;
          }
          SoftwareRaster.getClip(ImageProducerRasterBuffer.field_n);
          SoftwareRaster.fillRoundedRectangleBlended(16, 16, 608, 112, 15, Sentinel.field_bc, AudioService.field_b);
          SoftwareRaster.fillRoundedRectangleBlended(231, 144, 393, 232, 15, Sentinel.field_bc, AudioService.field_b);
          if (PendingByteArrayRequest.field_o != null) {
            PendingByteArrayRequest.field_o.drawTransparent(0, 0);
          }
          if (null != RewardValueHelpers.field_i) {
            RewardValueHelpers.field_i.drawTransparent(0, 0);
          }
          EditableTextWidget.field_kb.drawTransparent(0, 0);
          if (null != ArchiveProvider.field_e) {
            ArchiveProvider.field_e.drawTransparent(0, 0);
          }
          if (null != QuickChatInputHelpers.field_e &&
            null != ValidatedTextWidget.field_ub) {
            QuickChatInputHelpers.field_e.drawTransparent(231, 390);
            var2_ref_wk = TextLayout.field_f;
            if (TrigonometryHelpers.field_i.field_e == 0) {
              var2_ref_wk = ChatHistoryHelpers.field_e;
            }
            var2_ref_wk.drawTransparent(0, 0);
            stackIn_51_0 = 40;
            stackIn_51_1 = 20612;
            stackIn_51_2 = ConditionalTextValue.field_e;
            if (0 != TrigonometryHelpers.field_i.field_e) {
              stackIn_52_3 = 3;
            } else {
              stackIn_52_3 = 4;
            }
            var3Lifetime4 = stackIn_51_0 + (PlayerContextMenu.sine(stackIn_51_1, stackIn_51_2 << stackIn_52_3) * 40 >> 16);
            if (var3Lifetime4 > 0) {
              QuickChatInputHelpers.field_e.drawAdditive(230, 389, var3Lifetime4);
              QuickChatInputHelpers.field_e.drawAdditive(232, 389, var3Lifetime4);
              QuickChatInputHelpers.field_e.drawAdditive(232, 391, var3Lifetime4);
              QuickChatInputHelpers.field_e.drawAdditive(230, 391, var3Lifetime4);
              var2_ref_wk.drawAdditive(1, 1, var3Lifetime4);
              var2_ref_wk.drawAdditive(-1, 1, var3Lifetime4);
              var2_ref_wk.drawAdditive(1, -1, var3Lifetime4);
              var2_ref_wk.drawAdditive(-1, -1, var3Lifetime4);
            }
            stackIn_57_0 = LoadingCaptionHelpers.field_a;
            stackIn_57_1 = -28;
            stackIn_58_2 = (TrigonometryHelpers.field_i.field_e == 0);
            TutorialStep.drawGlintingButtonFrame(stackIn_57_0, stackIn_57_1, stackIn_58_2, RasterSnapshot.field_s);
          }
          if (null != QuickChatInputHelpers.field_e &&
            null != ValidatedTextWidget.field_ub) {
            QuickChatInputHelpers.field_e.drawTransparent(434, 390);
            ValidatedTextWidget.field_pb.drawTransparent(0, 0);
            if (TrigonometryHelpers.field_i.field_e == 1) {
              MusicPatchPcmStream.recolorGreenPixelsInRect(QuickChatInputHelpers.field_e.field_F * 7 / 12, 436, QuickChatInputHelpers.field_e.field_A - 4, 64, 392, 40);
            }
            stackIn_66_0 = ClientException.field_m;
            stackIn_66_1 = -3;
            stackIn_67_2 = (TrigonometryHelpers.field_i.field_e == 1);
            TutorialStep.drawGlintingButtonFrame(stackIn_66_0, stackIn_66_1, stackIn_67_2, PendingAckRequest.field_u);
          }
          if (NodeIterator.field_b != null) {
            var2Lifetime1 = 357 - NodeIterator.field_b.field_B / 2;
            NodeIterator.field_b.drawTransparent(-NodeIterator.field_b.field_z + 269, var2Lifetime1);
            SocialPacketHelpers.field_e.drawTransparent(586, var2Lifetime1);
            if (DelegatingCanvas.field_c > var2Lifetime1 &&
              DelegatingCanvas.field_c < NodeIterator.field_b.field_F + var2Lifetime1) {
              var3Lifetime5 = 40 + (PlayerContextMenu.sine(20612, ConditionalTextValue.field_e << 4) * 40 >> 16);
              if (0 < var3Lifetime5) {
                if (LobbySetupHelpers.field_f > -NodeIterator.field_b.field_A + 269 &&
                  LobbySetupHelpers.field_f < 269) {
                  NodeIterator.field_b.drawAdditive(-1 - NodeIterator.field_b.field_z + 269, -1 + var2Lifetime1, var3Lifetime5);
                  NodeIterator.field_b.drawAdditive(-NodeIterator.field_b.field_z + 269 + 1, -1 + var2Lifetime1, var3Lifetime5);
                  NodeIterator.field_b.drawAdditive(-1 + (269 - NodeIterator.field_b.field_z), var2Lifetime1 + 1, var3Lifetime5);
                  NodeIterator.field_b.drawAdditive(269 - NodeIterator.field_b.field_z + 1, 1 + var2Lifetime1, var3Lifetime5);
                } else {
                  if (LobbySetupHelpers.field_f > 586 &&
                    586 + NodeIterator.field_b.field_A > LobbySetupHelpers.field_f) {
                    SocialPacketHelpers.field_e.drawAdditive(585, var2Lifetime1 - 1, var3Lifetime5);
                    SocialPacketHelpers.field_e.drawAdditive(587, var2Lifetime1 - 1, var3Lifetime5);
                    SocialPacketHelpers.field_e.drawAdditive(585, 1 + var2Lifetime1, var3Lifetime5);
                    SocialPacketHelpers.field_e.drawAdditive(587, var2Lifetime1 + 1, var3Lifetime5);
                  }
                }
              }
            }
            PopupMenuHelpers.drawScreenshotSlideshow(30);
            AccountMessagePanel.field_R[UiComponent.field_r].drawTransparent(269, 340);
          } else {
            PopupMenuHelpers.drawScreenshotSlideshow(30);
            AccountMessagePanel.field_R[UiComponent.field_r].drawTransparent(269, 340);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1), "la.E(" + param0 + ')');
        }
    }

    final static void scatterFacesByPriority(byte[] param0, int param1, int[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        LobbyPlayer var8 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (param4 != -32513) {
            var8 = (LobbyPlayer) null;
            BenefitsScreenHelpers.insertLobbyPlayerSorted(126, (LobbyPlayer) null);
          }
          var5_int = 0;
          while (true) {
            if (IntrusiveNode.field_c.length <= var5_int) {
              return;
            }
            param1 = IntrusiveNode.field_c[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param1;
              param1--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param3 = MarkerSlider.field_bb[incrementValue$1];
              dupTemp$2 = param0[param3];
              dupTemp$3 = param2[dupTemp$2];
              param2[dupTemp$2] = dupTemp$3 + 1;
              MarkerSlider.field_bb[dupTemp$3] = param3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("la.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        int var1 = 124 / ((-23 - param0) / 49);
    }

    final static void updateLobbyAndFlushRequests(int param0, boolean param1) {
        int var2;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_11_2 = false;
        int stackIn_13_3;
        int stackIn_13_4;
        int stackIn_13_5;
        int stackIn_13_6;
        int stackIn_13_7;
        boolean stackIn_14_8 = false;
        ArchiveRequest.tickLobbyHighlights((byte) 123);
        if (LoginEncryptionHelpers.field_b != null) {
          stackIn_6_0 = (RasterBuffer.isPlayerCountValidForMode((int) LoginEncryptionHelpers.field_b.field_Sb[2], false, LoginEncryptionHelpers.field_b.field_wc)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        stackIn_9_0 = 15;
        stackIn_9_1 = MeshMaterial.field_d;
        stackIn_11_2 = (PendingPackedReply.field_y) || (CombatWorld.field_G);
        stackIn_13_3 = param0;
        stackIn_13_4 = 0;
        stackIn_13_5 = 72;
        stackIn_13_6 = var2;
        stackIn_13_7 = 11;
        stackIn_14_8 = (ScrollContainer.field_Vb <= 50) ? false : true;
        LinkButtonPainter.runFrontEndFrame(stackIn_9_0, stackIn_9_1, stackIn_11_2, stackIn_13_3, stackIn_13_4, stackIn_13_5, stackIn_13_6 != 0, stackIn_13_7, stackIn_14_8, 14, param1, true);
        if (ParticleEffect.field_J) {
          ClockAndCookieHelpers.field_g.writeCipheredOpcode(57, (byte) -117);
          ParticleEffect.field_J = false;
        }
        if (SessionExitHelpers.field_c) {
          ClockAndCookieHelpers.field_g.writeCipheredOpcode(10, (byte) -117);
          SessionExitHelpers.field_c = false;
        }
    }

    static {
        field_a = -1;
        field_b = 200;
    }
}
