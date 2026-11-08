/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameResourceLoader implements LoadingSequence {
    static String[] field_b;
    private boolean field_c;
    private boolean field_d;
    private boolean field_a;
    static int field_e;
    private static int[][] field_f;

    public final boolean pollReady(int param0) {
        IntValueNode var2_ref_oi;
        int var2;
        int var3;
        boolean stackIn_24_0 = false;
        var3 = Kickabout.field_G;
        if (!this.field_a &&
          RenderedBall.m(99)) {
          this.field_a = true;
          var2_ref_oi = (IntValueNode) (LoginText.field_f.first(24009));
          while (var2_ref_oi != null) {
            if (ClientPacketFlushSupport.isBitSet(var2_ref_oi.field_j, 0, BufferedSocket.field_f)) {
              var2_ref_oi.c((byte) -109);
            }
            var2_ref_oi = (IntValueNode) (LoginText.field_f.next(param0 ^ -27629));
          }
          Cp1252EncodingSupport.field_a.clear(22997);
          RasterBuffer.a(20164);
        }
        if (param0 != -27598) {
          this.field_a = true;
        }
        if (!this.field_c) {
          if ((1 & MatchTextInputOverlay.field_h) == 0) {
            var2 = AppScreen.field_e;
            if (var2 > 0) {
            }
          }
          this.field_c = true;
        }
        if (!this.field_d &&
          this.pollMessageOfTheDay(0)) {
          this.field_d = true;
        }
        stackIn_24_0 = (this.field_d) && (this.field_c) && (this.field_a) && (NetworkArchiveRequest.field_y);
        return stackIn_24_0;
    }

    public final boolean pollArchives(boolean param0) {
        Sprite var4 = null;
        IndexedSprite var5 = null;
        Sprite var6 = null;
        Sprite[] var7 = null;
        Sprite[] var8 = null;
        int var9 = 0;
        int var11_int = 0;
        IndexedSprite[] var10 = null;
        Sprite[][] var11 = null;
        Sprite[][] var12 = null;
        int var10_int = 0;
        int var13 = Kickabout.field_G;
        int var10_intLifetime1;
        int var10_intLifetime2;
        if (!param0) {
          ArgbSprite var14 = (ArgbSprite) null;
          this.a(28, (ArgbSprite) null);
        }
        SquadGridWidget.h((byte) -19);
        PlayerStats.finishUiTransitions(-1456);
        ResourceArchive var16 = CanvasResizePolicy.field_g;
        ResourceArchive var17 = IterableNodeHashTable.field_b;
        if (null != IterableNodeHashTable.field_c &&
          null != FixedVelocitySupport.field_b) {
          CipherPacketBuffer.advanceLoadingProgress(61, 0);
          if (null == SortCriterion.field_h) {
            ParticipantAgent.initializeGameSoundEffects(new SoundCache(IterableNodeHashTable.field_c, FixedVelocitySupport.field_b), FixedVelocitySupport.field_b, (byte) -100);
          }
          FixedVelocitySupport.field_b = null;
          IterableNodeHashTable.field_c = null;
          AnimationPlayer.a((byte) 49);
          return false;
        }
        if (HighScoreQuery.field_i != null) {
          CipherPacketBuffer.advanceLoadingProgress(61, 1);
          SpriteNumberPainter.loadPitchMusicTracks(HighScoreQuery.field_i, (byte) -122);
          HighScoreQuery.field_i = null;
          AnimationPlayer.a((byte) 53);
          return false;
        }
        if (!MyKitScreen.ensureSoundLoaded(111, Trinket.field_c)) {
          return false;
        }
        if (EntityAfterimage.field_b != null) {
          CipherPacketBuffer.advanceLoadingProgress(61, 2);
          SoftwareDrawingSupport.field_q = SpriteResourceSupport.loadNamedSprite((byte) 124, "lobby", QuickChatKeysHelpPanel.field_Cb, "logo");
          SoftwareDrawingSupport.field_p = ModalStack.loadSpriteSheetByName(QuickChatKeysHelpPanel.field_Cb, -28, "lobby", "time");
          SoftwareDrawingSupport.field_j = ModalStack.loadSpriteSheetByName(QuickChatKeysHelpPanel.field_Cb, -121, "lobby", "tournament_icons");
          SoftwareDrawingSupport.field_j[0] = new Sprite(0, 0);
          SoftwareDrawingSupport.field_m = ModalStack.loadSpriteSheetByName(QuickChatKeysHelpPanel.field_Cb, -121, "lobby", "exhibition_icons");
          SoftwareDrawingSupport.field_m[0] = new Sprite(0, 0);
          SoftwareDrawingSupport.field_f = DemoIntegersCommand.a(QuickChatKeysHelpPanel.field_Cb, 17369, "lobby", "orb_icons");
          ModalStack.loadSpriteSheetByName(QuickChatKeysHelpPanel.field_Cb, -127, "lobby", "players");
          IntrusiveDeque.field_e = SoftwareDrawingSupport.field_q;
          ByteArrayPool.field_d = RenderedFootballer.a(EntityAfterimage.field_b, 10, "font2", QuickChatKeysHelpPanel.field_Cb, "fonts");
          ConsoleTokenCursor.field_d = Checkbox.a("font", EntityAfterimage.field_b, 75, "fonts", QuickChatKeysHelpPanel.field_Cb);
          IsSixCommand.field_C = Checkbox.a("", var17, 105, "arialish12", var16);
          var4 = new Sprite(16, 9);
          PacketBuffer.a(-64, var4);
          SoftwareRasterizer.fillCircle(4, 4, 3, 7829367);
          SoftwareRasterizer.fillCircle(4, 4, 2, 13421772);
          TeamManagementScreen.e(122);
          var5 = SoftwareDrawingSupport.toIndexedSprite(var4);
          IsSixCommand.field_C.setInlineImages(new IndexedSprite[]{var5}, new int[]{10});
          LoadingProgressSupport.reportStageProgress(83, 100, 10);
          var6 = SpriteResourceSupport.loadNamedSprite((byte) 100, "basic", var16, "orbcoin");
          LoggedGoal.a(var6, (ArgbSprite) (QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 77, "locked")), (ArgbSprite) (QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 77, "unachieved")), -123);
          LineupPositionSupport.field_g = SpritePixelSupport.downscaleArgbByHalf(SpritePixelSupport.downsampleSpriteHalfToArgb(var6));
          AccountChoicePanel.field_B = (ArgbSprite) (QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 69, "divider"));
          SocialListProtocolSupport.field_e = SpriteResourceSupport.loadNamedSprite((byte) 122, "menu", QuickChatKeysHelpPanel.field_Cb, "button_left_shine");
          GameAppletShell.field_l = SpriteResourceSupport.loadNamedSprite((byte) 106, "menu", QuickChatKeysHelpPanel.field_Cb, "button_middle_shine");
          LoadingProgressSupport.reportStageProgress(-109, 100, 20);
          CaptionedContainer.field_K = SpriteResourceSupport.loadNamedSprite((byte) 107, "menu", QuickChatKeysHelpPanel.field_Cb, "button_right_shine");
          CanvasResizePolicy.field_r = SpriteResourceSupport.loadNamedSprite((byte) 116, "menu", QuickChatKeysHelpPanel.field_Cb, "button_small_shine");
          MatchScreen.field_l = SpriteResourceSupport.loadNamedSprite((byte) 101, "menu", QuickChatKeysHelpPanel.field_Cb, "button_large_shine");
          MatchHudSupport.field_a = ModalStack.loadSpriteSheetByName(QuickChatKeysHelpPanel.field_Cb, -119, "menu", "digifont");
          LoadingProgressSupport.reportStageProgress(90, 100, 25);
          ArrayWidgetContainer.field_z = ServerTextTemplate.a("swatch_overlay", "menu", 2, QuickChatKeysHelpPanel.field_Cb);
          var7 = ServerTextTemplate.a("arrows", "menu", 2, QuickChatKeysHelpPanel.field_Cb);
          SoftwareDrawingSupport.field_k = new ArgbSprite[]{(ArgbSprite) (var7[0]), (ArgbSprite) (var7[2]), (ArgbSprite) (var7[4])};
          SoftwareDrawingSupport.field_i = new ArgbSprite[]{(ArgbSprite) (var7[1]), (ArgbSprite) (var7[3]), (ArgbSprite) (var7[5])};
          LoadingProgressSupport.reportStageProgress(86, 100, 30);
          LoadingProgressSupport.reportStageProgress(103, 100, 35);
          LoadingProgressSupport.reportStageProgress(-94, 100, 40);
          SocketArchiveNetworkClient.field_q = ServerTextTemplate.a("digits", "hud", 2, QuickChatKeysHelpPanel.field_Cb);
          MouseInputHandler.field_g = ModalStack.loadSpriteSheetByName(QuickChatKeysHelpPanel.field_Cb, -121, "hud", "cones");
          SpriteState.field_p = ServerTextTemplate.a("tutorial", "hud", 2, QuickChatKeysHelpPanel.field_Cb);
          SocialUiState.field_e = SpriteResourceSupport.loadNamedSprite((byte) 114, "hud", QuickChatKeysHelpPanel.field_Cb, "arrow");
          IntrusiveDequeCursor.buildDirectionalMarkerSprites(-128, SpriteResourceSupport.loadNamedSprite((byte) 114, "hud", QuickChatKeysHelpPanel.field_Cb, "cursor"));
          LoadingProgressSupport.reportStageProgress(86, 100, 45);
          TickClock.field_k = ServerTextTemplate.a("dialog_icon", "menu", 2, QuickChatKeysHelpPanel.field_Cb);
          ArrayWidgetContainer.field_y = SpriteResourceSupport.loadNamedSprite((byte) 107, "menu", QuickChatKeysHelpPanel.field_Cb, "star");
          LoadingProgressSupport.reportStageProgress(-48, 100, 60);
          var8 = ServerTextTemplate.a("trinkets", "menu", 2, QuickChatKeysHelpPanel.field_Cb);
          ScrollContainer.field_Fb = new ArgbSprite[4][6];
          var9 = 0;
          for (var10_int = 0; var10_int < 3; var10_int++) {
            for (var11_int = 0; var11_int < 6; var11_int++) {
              ScrollContainer.field_Fb[var10_int][var11_int] = (ArgbSprite) (var8[var9]);
              var9++;
            }
          }
          for (var10_intLifetime1 = 0; var10_intLifetime1 < 6; var10_intLifetime1++) {
            ScrollContainer.field_Fb[3][var10_intLifetime1] = (ArgbSprite) (var8[var9]);
          }
          GradientRasterSupport.field_c = new ArgbSprite[4];
          for (var10_intLifetime2 = 0; var10_intLifetime2 < GradientRasterSupport.field_c.length; var10_intLifetime2++) {
            GradientRasterSupport.field_c[var10_intLifetime2] = BeveledTextPainter.a(ScrollContainer.field_Fb[var10_intLifetime2][0], param0);
          }
          ArchiveIndex.field_m = (ArgbSprite) (QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 96, "help_up"));
          QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 100, "help_dwn");
          SquadGridWidget.a(ModalStack.loadSpriteSheetByName(QuickChatKeysHelpPanel.field_Cb, -124, "menu", "tickbox"), true);
          LoadingProgressSupport.reportStageProgress(80, 100, 75);
          WeightedLruCache.field_h = (ArgbSprite) (QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 93, "hammer_icon"));
          CipherPacketBuffer.field_q = (ArgbSprite) (QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 89, "hammer_icon_buy"));
          LoadingProgressSupport.reportStageProgress(113, 100, 70);
          TextLayoutLine.field_f = QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 60, "tactics_pitch");
          LoginResponseUiSupport.field_h = (ArgbSprite) (QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 109, "lock_icon"));
          LoadingProgressSupport.reportStageProgress(90, 100, 80);
          RowRangeRequest.field_f = QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 78, "kit");
          WriteIntegersCommand.field_E = ServerTextTemplate.a("cups", "menu", 2, QuickChatKeysHelpPanel.field_Cb);
          DelayedServerPacket.field_i = ServerTextTemplate.a("cups_empty", "menu", 2, QuickChatKeysHelpPanel.field_Cb);
          LoadingProgressSupport.reportStageProgress(102, 100, 90);
          Trinket.field_d = (ArgbSprite) (QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 88, "shelf"));
          WorldSpriteSequence.field_g = QuickChatPhraseDefinition.loadSpriteByName("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 76, "scroll_button");
          LeaguesScreen.field_B = this.a("menu", QuickChatKeysHelpPanel.field_Cb, (byte) 26, "scroll_bar");
          WidgetStyleFactory.field_a = SpriteResourceSupport.loadNamedSprite((byte) 106, "menu", QuickChatKeysHelpPanel.field_Cb, "mini_ball");
          LoadingProgressSupport.reportStageProgress(-91, 100, 95);
          var10 = SoftwareDrawingSupport.field_f;
          var11 = new Sprite[][]{SoftwareDrawingSupport.field_p, null, SoftwareDrawingSupport.field_m, SoftwareDrawingSupport.field_j};
          var12 = new Sprite[][]{SoftwareDrawingSupport.field_p, null, SoftwareDrawingSupport.field_m, SoftwareDrawingSupport.field_j};
          int[] var15 = (int[]) null;
          RegistrationUiSupport.initializeSharedUiResources(var11, StatefulTextPainter.field_y, ArchiveSource.field_c, true, AccountInputValidationResult.field_g, var10, var16, 16971, FootballerAiOverlaySupport.field_b, WorldSpriteSequence.field_e, var17, UrlRequest.field_c, PasswordFieldPainter.field_y, AccountInputValidationResult.field_h, Bzip2State.field_i, var12, (int[]) null, 8, 3, TextFieldValidator.field_i);
          PlayArea.field_k = MusicPatchNode.field_k;
          IndexedSpriteState.field_e = FormationView.field_n;
          TextButton.field_z = MyKitScreen.field_Z;
          StrongCacheEntry.field_t = 0;
          ValidatedTextWidget.a(false, 200);
          LoadingProgressSupport.reportStageProgress(-61, 100, 95);
          WhirlpoolHasher.a(var17, var16, 5198);
          LineupView.a(-70, RankingsScreen.field_A, 0, AnimationClip.field_g, 0, 16777215);
          Object var3 = null;
          EntityAfterimage.field_b = null;
          AnimationPlayer.a((byte) 104);
          return false;
        }
        if (ResourceArchive.field_f != null) {
          CipherPacketBuffer.advanceLoadingProgress(61, 3);
          AuctionLogEntry.field_j = new Sprite(ResourceArchive.field_f.takeFileByName("background_guy.png", "", 36), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          TutorialScenerySupport.field_a = new Sprite(ResourceArchive.field_f.takeFileByName("background.png", "", 66), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          CachedListingRow.field_k = new Sprite(ResourceArchive.field_f.takeFileByName("splash.jpg", "", 8), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          AccountTermsPanel.field_E = new Sprite(ResourceArchive.field_f.takeFileByName("botbar.png", "", 66), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          LoadingProgressSupport.reportStageProgress(-114, 23, 2);
          LoginDialog.field_cb = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("bank_top.png", "", 3), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          AccountChoicePanel.field_C = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("bank_mid.png", "", 52), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          MarkerSliderPainter.field_i = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("bank_bot.png", "", 123), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          TextHotspotWidget.field_L = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("button_lrg.png", "", 91), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          DirectByteStorage.field_m = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("button_sml.png", "", 81), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          LoadingProgressSupport.reportStageProgress(122, 23, 4);
          AccountChoicePanel.field_K = new ArgbSprite(ResourceArchive.field_f.takeFileByName("cone_1.png", "", 91), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          CheckboxPainter.field_o = new ArgbSprite(ResourceArchive.field_f.takeFileByName("cone_2.png", "", 91), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          PlayerContextMenu.field_m = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("button_left.png", "", 8), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          SetLagCommand.field_B = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("button_middle.png", "", 97), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          LoadingProgressSupport.reportStageProgress(-114, 23, 6);
          SquadGridWidget.field_Cb = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("button_right.png", "", 90), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          AuctionSettingsDialog.field_H = (Sprite) ((Object) new ArgbSprite(ResourceArchive.field_f.takeFileByName("stopwatch.png", "", 101), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          LoadingProgressSupport.reportStageProgress(-58, 23, 8);
          SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("thin_button_endl.png", "", 89), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("thin_button_mid.png", "", 5), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          LoadingProgressSupport.reportStageProgress(-105, 23, 10);
          SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("thin_button_endr.png", "", 58), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          ContextMenu.field_zb = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("small_button_L.png", "", 52), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          LoadingProgressSupport.reportStageProgress(-61, 23, 12);
          AccountRegistrationPanel.field_H = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("small_button_mid.png", "", 53), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          TooltipOverlay.field_b = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("small_button_R.png", "", 117), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          LoadingProgressSupport.reportStageProgress(-85, 23, 14);
          PlayerInputFactory.field_g = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("top_bar_Seg.png", "", 127), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          LoadingProgressSupport.reportStageProgress(-49, 23, 16);
          ButtonMenuScreen.field_u = SpritePixelSupport.toMaskedSprite(new ArgbSprite(ResourceArchive.field_f.takeFileByName("top.png", "", 82), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          LoadingProgressSupport.reportStageProgress(-98, 23, 18);
          Trinket.field_f = new ArgbSprite(ResourceArchive.field_f.takeFileByName("asphalt_corner.png", "", 6), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          TrinketPickerDialog.field_J = new Sprite(ResourceArchive.field_f.takeFileByName("asphalt_v.png", "", 69), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          LoadingProgressSupport.reportStageProgress(126, 23, 20);
          LoginMethod.field_g = new Sprite(ResourceArchive.field_f.takeFileByName("asphalt_h.png", "", 124), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          SoftwareDrawingSupport.field_a = new ArgbSprite(ResourceArchive.field_f.takeFileByName("arrow_on.png", "", 63), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          SoftwareDrawingSupport.field_b = new ArgbSprite(ResourceArchive.field_f.takeFileByName("arrow_off.png", "", 4), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          LoadingProgressSupport.reportStageProgress(-89, 23, 23);
          this.a(11264, new ArgbSprite(ResourceArchive.field_f.takeFileByName("achievements_large.png", "", 63), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          MainMenuScreen.field_C = (Sprite) ((Object) new ArgbSprite(ResourceArchive.field_f.takeFileByName("ka_logo.png", "", 37), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          ResourceArchive.field_f = null;
          AnimationPlayer.a((byte) 99);
          return false;
        }
        if (MySquadScreen.field_H != null) {
          CipherPacketBuffer.advanceLoadingProgress(61, 4);
          GameMediaSupport.installHuffmanCodec(new HuffmanCodec(MySquadScreen.field_H.takeFileByName("huffman", "", 93)), false);
          MySquadScreen.field_H = null;
          AnimationPlayer.a((byte) 78);
          return false;
        }
        if (null != Kickabout.field_J) {
          CipherPacketBuffer.advanceLoadingProgress(61, 5);
          MatchScreen.loadMatchSprites((byte) -34, Kickabout.field_J);
          Kickabout.field_J = null;
          AnimationPlayer.a((byte) 81);
          return false;
        }
        if (KitStyleTile.field_Bb == null) {
          return true;
        }
        CipherPacketBuffer.advanceLoadingProgress(61, 6);
        SocialTabsPanel.loadCharacterAnimations(20113, ContextMenuItem.field_Eb, ListingRowCache.field_h, KitStyleTile.field_Bb);
        KitStyleTile.field_Bb = null;
        ContextMenuItem.field_Eb = null;
        ListingRowCache.field_h = null;
        AnimationPlayer.a((byte) 48);
        return false;
    }

    final void requestMessageOfTheDay(byte param0) {
        if (param0 != 115) {
          return;
        }
        WidgetTheme.field_k = new UrlRequest(AnimationClip.field_g);
    }

    final static void a(byte param0) {
        int incrementValue$69 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int incrementValue$54 = 0;
        int incrementValue$55 = 0;
        int incrementValue$56 = 0;
        int incrementValue$57 = 0;
        int incrementValue$58 = 0;
        int incrementValue$59 = 0;
        int incrementValue$60 = 0;
        int incrementValue$61 = 0;
        int incrementValue$62 = 0;
        int incrementValue$63 = 0;
        int incrementValue$68 = 0;
        int incrementValue$64 = 0;
        int incrementValue$65 = 0;
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int incrementValue$40 = 0;
        int incrementValue$48 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        Sprite var2 = null;
        Sprite var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        Sprite var10 = null;
        Sprite var11 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var5Lifetime2;
        int var6Lifetime2;
        int var7Lifetime2;
        int var5Lifetime1Lifetime1;
        int var6Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        var8 = Kickabout.field_G;
        try {
          if (param0 >= -42) {
            var9 = (StringBuilder) null;
            GameResourceLoader.a(-123, -22, (StringBuilder) null);
          }
          var10 = ChatMessage.field_b[2];
          var11 = var10;
          var2 = SpritePixelSupport.toMaskedSprite((ArgbSprite) (ClientPacketFlushSupport.field_e));
          var3 = SpritePixelSupport.toMaskedSprite((ArgbSprite) (CachedTextLayout.field_q));
          if (RankingsScreen.field_C == 0) {
            IntValueNode.field_e = new WorldSpriteDecoration[30];
            var4 = 0;
            for (var5 = 0; 4 > var5; var5++) {
              var6 = LoggedPossession.a((byte) -24, 896 - var11.field_o);
              var7 = LoggedPossession.a((byte) -24, 1344 - var11.field_v);
              incrementValue$69 = var4;
              var4++;
              IntValueNode.field_e[incrementValue$69] = new WorldSpriteDecoration(var10, var6, var7);
            }
            incrementValue$49 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$49] = new WorldSpriteDecoration(NotificationPanelPositionSupport.field_c, 50, -100);
            incrementValue$50 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$50] = new WorldSpriteDecoration(AnimationSkeleton.field_h, 80, -150);
            incrementValue$51 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$51] = new WorldSpriteDecoration(AnimationSkeleton.field_h, 120, -105);
            incrementValue$52 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$52] = new WorldSpriteDecoration(var3, -100, -170);
            incrementValue$53 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$53] = new WorldSpriteDecoration(var2, 530, -240);
            incrementValue$54 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$54] = new WorldSpriteDecoration(var3, 670, -170);
            incrementValue$55 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$55] = new WorldSpriteDecoration(var2, 790, -195);
            incrementValue$56 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$56] = new WorldSpriteDecoration(NotificationPanelPositionSupport.field_c, 700, 1354);
            incrementValue$57 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$57] = new WorldSpriteDecoration(AnimationSkeleton.field_h, 720, 1394);
            incrementValue$58 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$58] = new WorldSpriteDecoration(AnimationSkeleton.field_h, 780, 1374);
            incrementValue$59 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$59] = new WorldSpriteDecoration(var3, -171, 1037);
            incrementValue$60 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$60] = new WorldSpriteDecoration(FullscreenFocusCanvas.field_a, -51, 1082);
            incrementValue$61 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$61] = new WorldSpriteDecoration(FullscreenFocusCanvas.field_a, -30, 1105);
            incrementValue$62 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$62] = new WorldSpriteDecoration(FullscreenFocusCanvas.field_a, -20, 1055);
            incrementValue$63 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$63] = new WorldSpriteDecoration(NotificationPanelPositionSupport.field_c, -68, 1143);
            for (var5Lifetime2 = 0; 7 > var5Lifetime2; var5Lifetime2++) {
              var6Lifetime2 = BytePlusOneCommand.a(29430, 40, 956);
              var7Lifetime2 = BytePlusOneCommand.a(29430, 70, var5Lifetime2 * 150 + 200);
              incrementValue$68 = var4;
              var4++;
              IntValueNode.field_e[incrementValue$68] = new WorldSpriteDecoration(ClientPacketFlushSupport.field_e, var6Lifetime2, var7Lifetime2);
            }
            incrementValue$64 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$64] = new WorldSpriteDecoration(var2, -111, 138);
            incrementValue$65 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$65] = new WorldSpriteDecoration(var2, -191, 290);
            incrementValue$66 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$66] = new WorldSpriteDecoration(var2, 30, 1324);
            incrementValue$67 = var4;
            var4++;
            IntValueNode.field_e[incrementValue$67] = new WorldSpriteDecoration(var2, 170, 1364);
            return;
          }
          if (RankingsScreen.field_C == 1) {
            IntValueNode.field_e = new WorldSpriteDecoration[34];
            var4Lifetime1 = 0;
            incrementValue$40 = var4Lifetime1;
            var4Lifetime1++;
            IntValueNode.field_e[incrementValue$40] = new WorldSpriteDecoration(BytePlusOneCommand.field_D, 0, 1375);
            for (var5Lifetime1 = 0; 12 > var5Lifetime1; var5Lifetime1++) {
              var6Lifetime1 = BytePlusOneCommand.a(29430, 30, -300 + 100 * var5Lifetime1);
              var7Lifetime1 = BytePlusOneCommand.a(29430, 60, -290);
              if (LoggedPossession.a((byte) -24, 2) == 0) {
                var6Lifetime1 = -var6Lifetime1 + 896;
                var7Lifetime1 += 1724;
              }
              incrementValue$48 = var4Lifetime1;
              var4Lifetime1++;
              IntValueNode.field_e[incrementValue$48] = new WorldSpriteDecoration(ClientPacketFlushSupport.field_e, var6Lifetime1, var7Lifetime1);
            }
            incrementValue$41 = var4Lifetime1;
            var4Lifetime1++;
            IntValueNode.field_e[incrementValue$41] = new WorldSpriteDecoration(var3, -203, 169);
            incrementValue$42 = var4Lifetime1;
            var4Lifetime1++;
            IntValueNode.field_e[incrementValue$42] = new WorldSpriteDecoration(AnimationSkeleton.field_h, -219, 292);
            incrementValue$43 = var4Lifetime1;
            var4Lifetime1++;
            IntValueNode.field_e[incrementValue$43] = new WorldSpriteDecoration(NotificationPanelPositionSupport.field_c, 824, -60);
            incrementValue$44 = var4Lifetime1;
            var4Lifetime1++;
            IntValueNode.field_e[incrementValue$44] = new WorldSpriteDecoration(AnimationSkeleton.field_h, 753, -69);
            incrementValue$45 = var4Lifetime1;
            var4Lifetime1++;
            IntValueNode.field_e[incrementValue$45] = new WorldSpriteDecoration(BytePlusOneCommand.field_D, 1030, 568);
            for (var5Lifetime1Lifetime1 = 0; var5Lifetime1Lifetime1 < 8; var5Lifetime1Lifetime1++) {
              var6Lifetime1Lifetime1 = BytePlusOneCommand.a(29430, 20, -170);
              var7Lifetime1Lifetime1 = -50 + var5Lifetime1Lifetime1 / 2 * 400;
              if ((1 & var5Lifetime1Lifetime1) != 0) {
                var7Lifetime1Lifetime1 = var7Lifetime1Lifetime1 + BytePlusOneCommand.a(29430, 20, 60);
              }
              incrementValue$46 = var4Lifetime1;
              var4Lifetime1++;
              IntValueNode.field_e[incrementValue$46] = new WorldSpriteDecoration(AccountRegistrationResponse.field_a[LoggedPossession.a((byte) -24, AccountRegistrationResponse.field_a.length)], var6Lifetime1Lifetime1, var7Lifetime1Lifetime1);
              incrementValue$47 = var4Lifetime1;
              var4Lifetime1++;
              IntValueNode.field_e[incrementValue$47] = new WorldSpriteDecoration(AccountRegistrationResponse.field_a[LoggedPossession.a((byte) -24, AccountRegistrationResponse.field_a.length)], -var6Lifetime1Lifetime1 + 876, var7Lifetime1Lifetime1);
            }
            return;
          }
          if (RankingsScreen.field_C == 2) {
            IntValueNode.field_e = new WorldSpriteDecoration[9];
            IntValueNode.field_e[0] = new WorldSpriteDecoration(var3, -142, 231);
            IntValueNode.field_e[1] = new WorldSpriteDecoration(ClientPacketFlushSupport.field_e, -140, 549);
            IntValueNode.field_e[2] = new WorldSpriteDecoration(var3, -154, 1331);
            IntValueNode.field_e[3] = new WorldSpriteDecoration(ClientPacketFlushSupport.field_e, -245, 1384);
            IntValueNode.field_e[4] = new WorldSpriteDecoration(ClientPacketFlushSupport.field_e, 901, -252);
            IntValueNode.field_e[5] = new WorldSpriteDecoration(var3, 1095, 963);
            IntValueNode.field_e[6] = new WorldSpriteDecoration(ClientPacketFlushSupport.field_e, 925, 1294);
            IntValueNode.field_e[7] = new WorldSpriteDecoration(BytePlusOneCommand.field_D, -131, 957);
            IntValueNode.field_e[8] = new WorldSpriteDecoration(BytePlusOneCommand.field_D, 924, 240);
          } else {
            if (RankingsScreen.field_C == 3) {
              IntValueNode.field_e = new WorldSpriteDecoration[]{};
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "eh.H(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_f = (int[][]) null;
        field_b = null;
        if (param0 != 1) {
          StringBuilder var2 = (StringBuilder) null;
          GameResourceLoader.a(58, 40, (StringBuilder) null);
        }
    }

    public final void buildAssets(int param0) {
        int var2 = 0;
        int var4 = 0;
        ArgbSprite var3;
        int var5;
        var5 = Kickabout.field_G;
        AnimationClip.a(0, -76, false, ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(79, 3, new Random()));
        CipherPacketBuffer.advanceLoadingProgress(param0 ^ 12774, 7);
        TriangleRasterizer.setBrightnessAndRebuildPalette(0.6000000238418579f);
        GrayscalePaletteSupport.initializeGrayscalePalette(false);
        Trinket.initializeAfterimagePool(18);
        AchievementSubmission.buildTrinketPreviewSprites(65280);
        CipherPacketBuffer.advanceLoadingProgress(61, 8);
        TrinketCatalog.buildTrinketTable(param0 - 12854);
        LoadingProgressSupport.reportStageProgress(118, 2, 1);
        CipherPacketBuffer.advanceLoadingProgress(61, 9);
        LoadingProgressSupport.reportStageProgress(84, 6, 1);
        SoftwareDrawingSupport.buildSharedControlSprites();
        LoadingProgressSupport.reportStageProgress(-46, 6, 2);
        SharedWidgetFactory.createSharedWidgets(ByteArrayPool.field_d, (byte) 113);
        LoadingProgressSupport.reportStageProgress(-89, 6, 3);
        RegistrationUiSupport.buildLoadingSpinnerSprites((byte) -32);
        ResizableModalPanel.buildRotatedStarSprites(96);
        LoadingProgressSupport.reportStageProgress(-49, 6, 5);
        GameLoopApplet.n((byte) -10);
        CipherPacketBuffer.advanceLoadingProgress(61, 10);
        TeamSelectionView.b((byte) -47);
        SocialTabsPanel.a((byte) -124);
        LoadingProgressSupport.reportStageProgress(127, 4, 1);
        SpriteButtonPainter.a(param0 ^ -363033958);
        LoadingProgressSupport.reportStageProgress(-69, 4, 2);
        Bzip2State.a(param0 - 12857);
        LoadingProgressSupport.reportStageProgress(-124, 4, 3);
        MySquadScreen.field_U = (Sprite[]) ((Object) new ArgbSprite[WriteIntegersCommand.field_E.length]);
        for (var2 = 0; var2 < WriteIntegersCommand.field_E.length; var2++) {
          var3 = new ArgbSprite(40, 40);
          PacketBuffer.a(-100, var3);
          WriteIntegersCommand.field_E[var2].c(0, 0);
          TeamManagementScreen.e(param0 - 12637);
          for (var4 = 0; var3.field_y.length > var4; var4++) {
            if (var3.field_y[var4] != 0) {
              var3.field_y[var4] = PainterStyle.bitwiseOr(var3.field_y[var4], -16777216);
            }
          }
          var3.addOutline(-16777216);
          var3.addOutline(2130706432);
          MySquadScreen.field_U[var2] = (Sprite) ((Object) SpritePixelSupport.downscaleArgbByHalf(var3));
        }
        CipherPacketBuffer.advanceLoadingProgress(61, 11);
        if (param0 != 12763) {
          return;
        }
        BufferedCacheFile.field_a = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-65, MarkerSliderWidget.field_E.length, new Random());
        PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)MarkerSliderWidget.field_E[BufferedCacheFile.field_a], (double)ButtonMenuScreen.field_r[BufferedCacheFile.field_a]);
        SocialPlayerRow.resetCameraToTarget((byte) 51);
        DelayedServerPacket.a(-5, false, -2);
        CipherPacketBuffer.advanceLoadingProgress(61, 12);
        LoadingProgressSupport.reportStageProgress(-71, 4, 1);
        PlayerModelPreview.a(6, 10, (byte) 54, 20, 320, 320, 6, 18, 240, 13, IsSixCommand.field_C, ByteArrayPool.field_d, new TexturedPanelPainter(), 20, 16777215, 30, new GeneratedPanelPainter(true), 16777215, 9, new GeneratedPanelPainter(false), 16777215);
        LoadingProgressSupport.reportStageProgress(-57, 4, 2);
        GameSoundEffect.a((byte) -94);
        LoadingProgressSupport.reportStageProgress(75, 4, 3);
        ResizableModalPanel.setTargetFrameRate(param0 ^ 922092267, 50);
        Kickabout.prepareAccountChoiceSprites(param0 - 826888154);
        CipherPacketBuffer.advanceLoadingProgress(61, 13);
        OverlayLayerSupport.registerOverlay(false, new CheatCodeListener());
        OverlayLayerSupport.registerOverlay(false, new ClientUiOverlay());
        OverlayLayerSupport.registerOverlay(false, new DialogOverlay());
        OverlayLayerSupport.registerOverlay(false, new MatchTextInputOverlay());
        OverlayLayerSupport.registerOverlay(false, new TrinketUnlockNotice());
        OverlayLayerSupport.registerOverlay(false, new TooltipOverlay());
    }

    final boolean pollMessageOfTheDay(int param0) {
        int var3_int = 0;
        NamedValueContainer var4 = null;
        int var7 = 0;
        PacketBuffer var8 = null;
        NamedValueEntry var9 = null;
        NamedValueEntry var10 = null;
        byte[] var14 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        var7 = Kickabout.field_G;
        if (WidgetTheme.field_k == null) {
          return true;
        }
        if (!WidgetTheme.field_k.isDone((byte) -109)) {
          return false;
        }
        var8 = WidgetTheme.field_k.getResult(false);
        WidgetTheme.field_k = null;
        if (var8 == null) {
          IntKeyLookup.field_b = null;
          DelayedServerPacket.field_g = null;
          return true;
        }
        try {
          var3_int = var8.field_n;
          var8.field_n = param0;
          var4 = new NamedValueContainer(var8, var3_int);
          var9 = var4.findEntry(-116, "motd_message");
          if (var9 == null) {
            IntKeyLookup.field_b = null;
          } else {
            var8.field_n = var9.field_i;
            IntKeyLookup.field_b = var8.readString(param0 ^ -114);
          }
          var10 = var4.findEntry(-116, "motd_image");
          if (var10 == null) {
            DelayedServerPacket.field_g = null;
          } else {
            var8.field_n = var10.field_i;
            var14 = new byte[var10.field_h];
            var8.readBytes(var14, 0, (byte) -6, var10.field_h);
            DelayedServerPacket.field_g = new ArgbSprite(var14, (java.awt.Component) ((Object) AnimationClip.field_g));
            if (-1 == DelayedServerPacket.field_g.field_q &&
              DelayedServerPacket.field_g.field_w == -1) {
              DelayedServerPacket.field_g = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          IntKeyLookup.field_b = null;
          DelayedServerPacket.field_g = null;
          UnreadMessagesScreen.a("Error when unpacking the MOTD data in KickaboutLoader.service_motd()", (Throwable) ((Object) var3), 1);
          return true;
        }
    }

    public final void bindArchives(int param0) {
        this.requestMessageOfTheDay((byte) 115);
        if (Trinket.field_b != null) {
          LocalizedTextLoader.loadLocalizedStrings(Trinket.field_b, 1);
          Trinket.field_b = null;
          AnimationPlayer.a((byte) 85);
        }
        MySquadScreen.field_H = ImageProducerRasterBuffer.a((byte) -126, 3);
        StatefulTextPainter.field_y = ImageProducerRasterBuffer.a((byte) -128, 11);
        QuickChatKeysHelpPanel.field_Cb = ImageProducerRasterBuffer.a((byte) -128, 5);
        EntityAfterimage.field_b = ImageProducerRasterBuffer.a((byte) -125, 6);
        IterableNodeHashTable.field_c = ImageProducerRasterBuffer.a((byte) -127, 7);
        FixedVelocitySupport.field_b = ImageProducerRasterBuffer.a((byte) -128, 8);
        MatchTextInputOverlay.field_j = ImageProducerRasterBuffer.a((byte) -127, 9);
        HighScoreQuery.field_i = ImageProducerRasterBuffer.a((byte) -127, 10);
        if (param0 != 7312) {
          this.field_d = false;
        }
        Kickabout.field_J = ImageProducerRasterBuffer.a((byte) -126, 12);
        KitStyleTile.field_Bb = ImageProducerRasterBuffer.a((byte) -128, 14);
        ContextMenuItem.field_Eb = ImageProducerRasterBuffer.a((byte) -126, 15);
        ListingRowCache.field_h = ImageProducerRasterBuffer.a((byte) -126, 16);
        ResourceArchive.field_f = ImageProducerRasterBuffer.a((byte) -126, 17);
        ResourceArchive var4 = CanvasResizePolicy.field_g;
        ResourceArchive var3 = IterableNodeHashTable.field_b;
        BlobSubmission.field_h = new ArchivePreloader(55);
        BlobSubmission.field_h.a(var4, BufferedSocket.field_q, -6869, "basic", CommonGame.field_M);
        BlobSubmission.field_h.a(ResourceArchive.field_f, BufferedSocket.field_q, -6869, "", CommonGame.field_M);
        BlobSubmission.field_h.a(var4, BufferedSocket.field_q, -6869, "arialish12", CommonGame.field_M);
        BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, TextLine.field_l, -6869, "fonts", CommonGame.field_M);
        BlobSubmission.field_h.a(EntityAfterimage.field_b, TextLine.field_l, -6869, "fonts", QuickChatMenuFactory.field_b);
        BlobSubmission.field_h.a(var3, TextLine.field_l, -6869, "arialish12", QuickChatMenuFactory.field_b);
        BlobSubmission.field_h.a(var3, TextLine.field_l, -6869, "lobby", QuickChatMenuFactory.field_b);
        BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, LoggedPossession.field_a, -6869, "menu", CommonGame.field_M);
        BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, HighScoreSubmission.field_j, param0 - 14181, "hud", CommonGame.field_M);
        BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, StrongCacheEntry.field_B, -6869, "lobby", CommonGame.field_M);
        BlobSubmission.field_h.a(var4, StrongCacheEntry.field_B, -6869, "lobby", CommonGame.field_M);
        if (KitPatternMaskSupport.field_c == 0) {
          BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, PlayerMeshFactory.field_c, param0 - 14181, "park", CommonGame.field_M);
          BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, PlayerMeshFactory.field_c, param0 - 14181, "park_surface0", CommonGame.field_M);
        }
        if (KitPatternMaskSupport.field_c == 1) {
          BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, FadingSoundSupport.field_b, -6869, "beach", CommonGame.field_M);
          BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, FadingSoundSupport.field_b, -6869, "beach_surface0", CommonGame.field_M);
        }
        if (KitPatternMaskSupport.field_c == 2) {
          BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, QuickChatMenuBuilder.field_d, param0 - 14181, "street", CommonGame.field_M);
          BlobSubmission.field_h.a(QuickChatKeysHelpPanel.field_Cb, QuickChatMenuBuilder.field_d, -6869, "beach_surface0", CommonGame.field_M);
        }
        BlobSubmission.field_h.a(IterableNodeHashTable.field_c, (byte) -115, TutorialCaptionSupport.field_f, TextLayoutLine.field_c);
        BlobSubmission.field_h.a(TextLayoutLine.field_c, FixedVelocitySupport.field_b, -100);
        BlobSubmission.field_h.a(MatchTextInputOverlay.field_j, (byte) -109, MyPitchScreen.field_H, SelectableTrinketIcon.field_yb);
        BlobSubmission.field_h.a(HighScoreQuery.field_i, (byte) -123, MyPitchScreen.field_H, SelectableTrinketIcon.field_yb);
        BlobSubmission.field_h.a(Kickabout.field_J, (byte) -124, CachedTextLayout.field_d, LobbyMatchPreview.field_n);
        BlobSubmission.field_h.a(KitStyleTile.field_Bb, (byte) -122, MatchTextInputOverlay.field_l, RankingRowFactory.field_b);
        BlobSubmission.field_h.a(ContextMenuItem.field_Eb, (byte) -126, MatchTextInputOverlay.field_l, RankingRowFactory.field_b);
        BlobSubmission.field_h.a(ListingRowCache.field_h, (byte) -106, MatchTextInputOverlay.field_l, RankingRowFactory.field_b);
        BlobSubmission.field_h.a(MySquadScreen.field_H, (byte) -128, AvailabilityCheckRequest.field_g, Bzip2State.field_d);
        BlobSubmission.field_h.a(StatefulTextPainter.field_y, (byte) -116, CascadingMenu.field_Ib, TrinketUnlockNotice.field_e);
    }

    private final void a(int param0, ArgbSprite param1) {
        int var6 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ArgbSprite[] var5 = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          var3_int = param1.field_q / 8;
          var4 = param1.field_w / 10;
          var5 = new ArgbSprite[80];
          if (param0 != 11264) {
            field_f = (int[][]) null;
          }
          for (var6 = 0; ArchivePreloader.field_i.length > var6; var6++) {
            var5[var6] = new ArgbSprite(var3_int, var4);
            var7 = param1.field_q * var4 * (var6 / 8) + var3_int * (var6 % 8);
            for (var8 = 0; var8 < var5[var6].field_y.length; var8++) {
              var9 = var8 % var3_int + param1.field_q * (var8 / var3_int);
              var5[var6].field_y[var8] = param1.field_y[var7 + var9];
            }
            ArchivePreloader.field_i[var6] = var5[var6];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("eh.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final Sprite[] a(String param0, ResourceArchive param1, byte param2, String param3) {
        Sprite[] var5 = null;
        RuntimeException var5_ref = null;
        Sprite[] var6 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 16) {
            GameResourceLoader.a((byte) 120);
          }
          var6 = ModalStack.loadSpriteSheetByName(param1, -42, param0, param3);
          var5 = var6;
          var6[3].field_v = var6[3].field_w;
          var6[1].field_o = var6[1].field_q;
          var6[5].field_v = var6[5].field_w;
          var6[7].field_o = var6[7].field_q;
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("eh.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, StringBuilder param2) {
        StringBuilder discarded$11 = null;
        int var3_int = param0 >> 16;
        StringBuilder discarded$0 = param2.append(var3_int);
        int var4 = (int)(1000.0f * ((float)(65535 & param0) / 65536.0f));
        StringBuilder discarded$10 = param2.append('.');
        if (param1 != 100) {
          return;
        }
        try {
          discarded$11 = param2.append(var4);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "eh.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_f = new int[7][3];
        field_f[0][0] = 60;
        field_f[0][2] = 20;
        field_f[0][1] = 40;
        field_f[1][1] = 140;
        field_f[1][0] = 210;
        field_f[1][2] = 70;
        field_f[2][2] = 160;
        field_f[2][0] = 480;
        field_f[2][1] = 320;
        field_f[3][1] = 500;
        field_f[3][2] = 250;
        field_f[3][0] = 750;
        field_f[4][0] = 1140;
        field_f[4][2] = 380;
        field_f[4][1] = 760;
        field_f[5][1] = 1040;
        field_f[5][0] = 1610;
        field_f[5][2] = 520;
        field_f[6][1] = 1800;
        field_f[6][0] = 2700;
        field_f[6][2] = 900;
    }
}
