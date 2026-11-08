/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Virogrid extends NetworkGameClient {
    private IntrusiveDeque field_I;
    static LoginMethod field_O;
    private int[] field_N;
    private int[] field_D;
    private int field_E;
    private int[] field_B;
    private int[] field_C;
    private int[] field_K;
    private int field_A;
    private int[] field_M;
    private int[] field_H;
    private int[] field_L;
    private int[] field_G;
    private int[] field_J;
    public static boolean field_F;

    private final void initScene(int param0) {
        GameOptions dupTemp$2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_F ? 1 : 0;
        try {
          ByteArrayPool.field_c = 3;
          NodeHashTable.field_g = 3;
          LoginMethod.field_l = 3;
          dupTemp$2 = new GameOptions();
          MarkerSlider.field_H = dupTemp$2;
          WidgetNode.field_p = dupTemp$2;
          QuickChatPhraseRegistry.field_g = new double[]{1.0, 0.0, 0.0};
          SoundPlaybackHelpers.field_d = new double[]{0.0, 0.0, -128.0};
          QueuedResultSubmission.field_k = new double[3];
          MarkerSlider.updateCameraMatrix((byte) -44);
          WidgetNode.field_p.field_d = true;
          DraggableWidget.field_E = 0;
          ChatShortcutHelpers.field_c = new int[]{0, 154, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          MarkerSlider.field_H.field_d = true;
          DisplayNameHelpers.field_d = new Sprite(640, 400);
          ClientEnvironmentHelpers.field_e = new Sprite(640, 400);
          FullscreenErrorDialog.field_bb = new Sprite(200, 400);
          var2_int = 0;
          if (param0 <= 59) {
            Virogrid.createDobResultReply(-64, false);
          }
          while (var2_int < 256) {
            RenderTargetHelpers.field_d[var2_int] = WidgetFactoryHelpers.bitAnd(16711872, 143 * var2_int << 8);
            RenderTargetHelpers.field_d[var2_int] = BitwiseHelpers.bitOr(RenderTargetHelpers.field_d[var2_int], WidgetFactoryHelpers.bitAnd(65280, var2_int * 191));
            RenderTargetHelpers.field_d[var2_int] = BitwiseHelpers.bitOr(RenderTargetHelpers.field_d[var2_int], var2_int);
            var2_int++;
          }
          LobbyLayout.setViewportOrigin(320, 240, -2);
          PacketRequestHelpers.field_e = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "Virogrid.BB(" + param0 + ')');
        }
    }

    private final void drawSpotlightProjections(byte param0) {
        int var2_int = (UiTheme.field_r % 20480 << 12) % 83886080;
        CameraProjectionMath.drawPerspectiveTexturedQuad(HotspotTextWidget.field_K, new double[]{-768.0, 20.0, 0.0}, new double[]{0.0, 0.0, 1.0}, 700.0, 200.0, ArchiveIndex.field_j, 23967451 + var2_int, var2_int + 59918628, 0, 16711680, WidgetNode.field_p.field_k);
        CameraProjectionMath.drawPerspectiveTexturedQuad(HotspotTextWidget.field_K, new double[]{-768.0 + TriangleSortHelpers.field_c * 1800.0, 20.0, 300.0 + TriangleSortHelpers.field_c * 400.0}, new double[]{TriangleSortHelpers.field_c, 0.0, -TriangleSortHelpers.field_c}, 500.0, 200.0, ArchiveIndex.field_j, var2_int + 59918628, 83820544 + var2_int, 0, 16711680, WidgetNode.field_p.field_k);
        if (param0 != -62) {
          return;
        }
        try {
          this.updateGhostModelTransform(-1933);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "Virogrid.IB(" + param0 + ')');
        }
    }

    private final void loadGraphics(Js5Archive param0, byte param1, Js5Archive param2, Js5Archive param3, Js5Archive param4, Js5Archive param5) {
        int var10 = 0;
        Sprite discarded$0 = null;
        Sprite discarded$1 = null;
        int var8 = 0;
        int var9_int = 0;
        Sprite var11 = null;
        int var12 = 0;
        Sprite var13 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        Sprite[][] var9 = null;
        var12 = field_F ? 1 : 0;
        try {
          ReflectionCheckHelpers.standardFont = PasswordFieldPainter.loadFontByName("", param5, -110, "font", param4);
          DropTargetWidget.smallFont = PasswordFieldPainter.loadFontByName("", param5, -95, "smallfont", param4);
          PopupInputHelpers.menuFont = PasswordFieldPainter.loadFontByName("", param5, -120, "menufont", param4);
          LongAndTextLoginPayload.tinyFont = PasswordFieldPainter.loadFontByName("", param5, -110, "tinyfont", param4);
          var13 = PasswordValidator.loadSpriteByName(param5, "starfield", "", false);
          ArchiveIndex.field_j = new Sprite(2560, 256);
          ArchiveIndex.field_j.makeRasterTarget();
          var13.drawOpaque(0, 0);
          var13.drawOpaque(1280, 0);
          LoginPanel.field_M.bindAsRenderTarget((byte) 29);
          Js5Archive.field_l = LoadingProgressDialog.loadIndexedSpriteByName(param5, "logo", "", (byte) 114);
          PasswordValidator.loadSpriteByName(param5, "splash", "", false);
          UrlRewriteHelpers.field_d = WidgetNode.loadIndexedSpritesByName("walk1", "", param5, 32370);
          GameSession.field_y = WidgetNode.loadIndexedSpritesByName("walk2", "", param5, 32370);
          ByteStorage.field_b = WidgetNode.loadIndexedSpritesByName("walk3", "", param5, 32370);
          TextMetricsGlobals.field_l = new Sprite(640, 480);
          MusicVolumeAndOverlayHelpers.frameSprites = RegistrationRequestDialog.loadFrameSprites("", param5, 7, "frame");
          RasterBuffer.configureFonts(100, PopupInputHelpers.menuFont, 0, DropTargetWidget.smallFont);
          IconLabelWidget.field_Kb = 16777215;
          QueuedRequest.field_k = 16777215;
          DialogMessagePane.field_I = 16777215;
          HelpPopup.field_Hb = 8437759;
          AccountChoicePanel.field_E = 16777215;
          LinkTextPainter.field_b = 8437759;
          MouseWheelInput.achievementIcons = WidgetNode.loadSpritesByName(32, param5, "", "achievements_large");
          StrongCacheReference.unachievedIcon = PasswordValidator.loadSpriteByName(param2, "unachieved", "basic", false);
          QuickChatPhraseRegistry.orbCoinIcon = PasswordValidator.loadSpriteByName(param2, "orbcoin", "basic", false);
          var8 = MouseWheelInput.achievementIcons.length;
          ValidatedTextWidget.field_Y = new Sprite[var8];
          ArchiveLoadSequence.saveRasterState(123);
          var9_int = -67 / ((param1 + 11) / 58);
          for (var10 = 0; var8 > var10; var10++) {
            var11 = new Sprite(32, 32);
            var11.makeRasterTarget();
            MouseWheelInput.achievementIcons[var10].drawScaledAveraged(0, 0, 32, 32);
            ValidatedTextWidget.field_Y[var10] = var11;
          }
          MenuInputState.field_b = new Sprite(32, 32);
          MenuInputState.field_b.makeRasterTarget();
          StrongCacheReference.unachievedIcon.drawScaledAveraged(0, 0, 32, 32);
          LoginCredentialType.popRasterState((byte) 108);
          EmailAvailabilityValidator.viewIcons = WidgetNode.loadSpritesByName(32, param5, "", "viewicons");
          discarded$0 = this.createRadialGlowSprite(131586, -9105, 30136);
          discarded$1 = this.createRadialGlowSprite(263172, -9105, 6316128);
          var9 = new Sprite[2][];
          var9[0] = WidgetNode.loadSpritesByName(32, param5, "", "turntime_icons");
          var9[1] = WidgetNode.loadSpritesByName(32, param5, "", "gridwidth_icons");
          ChatSettingsHelpers.initializeLobbyAssets(var9, var9, 2, ScoreSubmissionHelpers.field_e, CellAnimator.field_a, param3, param2, true, -27871, QuickChatCategoryCache.gameOptionNames, QuickChatCategoryCache.gameOptionNames, RasterBuffer.gameOptionLabels, MidiNote.field_j, 2, ValidationMessageWidget.field_T);
          TextEncodingHelpers.lobbyIcon = PasswordValidator.loadSpriteByName(param5, "lobbyicon", "", false);
          TriangleRasterizer.setTextureProvider(new TextureCache(param0, param5, 8, 128));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("Virogrid.KB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_0 = stackIn_10_0;
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_0 = stackIn_14_0;
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = stackIn_10_0;
            stackIn_15_2 = "{...}";
          }
          stackIn_18_0 = stackIn_15_0;
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_19_0 = stackIn_18_0;
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = stackIn_15_0;
            stackIn_19_2 = "{...}";
          }
          stackIn_22_0 = stackIn_19_0;
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_23_0 = stackIn_22_0;
            stackIn_23_2 = "null";
          } else {
            stackIn_23_0 = stackIn_19_0;
            stackIn_23_2 = "{...}";
          }
          stackIn_26_0 = stackIn_23_0;
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_27_0 = stackIn_26_0;
            stackIn_27_2 = "null";
          } else {
            stackIn_27_0 = stackIn_23_0;
            stackIn_27_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static AccountRequestReply createDobResult(byte param0, boolean param1) {
        AccountRequestReply var2 = null;
        RuntimeException var2_ref = null;
        AccountRequestReply stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        AccountRequestReply stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -32) {
            field_O = (LoginMethod) null;
          }
          var2 = new AccountRequestReply(true);
          stackIn_4_0 = var2;
          stackIn_5_1 = (param1);
          stackIn_4_0.field_d = stackIn_5_1;
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2_ref), "Virogrid.DB(" + param0 + ',' + param1 + ')');
        }
    }

    final void initializeGame(boolean param0) {
        MidiPcmStream var3 = null;
        MidiPcmStream stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_4_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.initializeFramework(77, 14, 4, 0, 2, 1, false, 121);
          var3 = new MidiPcmStream();
          stackIn_3_0 = var3;
          stackIn_3_1 = 128;
          stackIn_3_2 = 9;
          stackIn_4_3 = !(param0);
          ((MidiPcmStream) (Object) stackIn_3_0).selectChannelBank(stackIn_3_1, stackIn_3_2, stackIn_4_3);
          PlayingSound.initializeAudioOutput((java.awt.Component) ((Object) UiWidget.field_v), var3, MusicPlaybackHelpers.field_c, param0, (byte) -18, 22050);
          this.configureResponseHandlers(false, true, -118, true, false, false, false);
          PacketBuffer.field_i[60] = 4;
          PacketBuffer.field_i[67] = 1;
          PacketBuffer.field_i[63] = 1;
          PacketBuffer.field_i[64] = 1;
          PacketBuffer.field_i[65] = 1;
          PacketBuffer.field_i[62] = 2;
          PacketBuffer.field_i[9] = -1;
          PacketBuffer.field_i[61] = 5;
          PacketBuffer.field_i[10] = -1;
          PacketBuffer.field_i[57] = -2;
          PacketBuffer.field_i[58] = -2;
          PacketBuffer.field_i[66] = 1;
          Bzip2State.allocateChatHistory((byte) 81, 200);
          this.initScene(114);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "Virogrid.K(" + param0 + ')');
        }
    }

    private final boolean advanceLoading(byte param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var4 = field_F ? 1 : 0;
        try {
          PasswordFieldPainter.initializeMenuLabels((byte) 69);
          if (null == RenderTargetHelpers.field_c) {
            if (param0 != -42) {
              this.field_L = (int[]) null;
            }
            if (TriangleMesh.field_w != null) {
              DateOfBirthValidator.setLoadingProgress(DebouncedValidator.field_e, param0 ^ -37, 80.0f);
              this.onCanvasCreated(true);
              MenuScreen.musicTracks = new MusicTrack[4];
              MenuScreen.musicTracks[0] = MusicTrack.load(TriangleMesh.field_w, "", "ataxx titlescreen");
              MenuScreen.musicTracks[1] = MusicTrack.load(TriangleMesh.field_w, "", "tetralink ingame 1");
              MenuScreen.musicTracks[2] = MusicTrack.load(TriangleMesh.field_w, "", "tetralink ingame 2");
              MenuScreen.musicTracks[3] = MusicTrack.load(TriangleMesh.field_w, "", "tetralink ingame 3");
              for (var3_int = 0; var3_int < 4; var3_int++) {
                DropTargetWidget.field_B.prepareTrack(BufferedSocket.field_d, 0, AccountCreationSupport.field_g, MenuScreen.musicTracks[var3_int], 0);
              }
              DropTargetWidget.field_B.releasePatchSamples(-1);
              AccountCreationSupport.field_g = null;
              BufferedSocket.field_d = null;
              TriangleMesh.field_w = null;
              DiskCacheWorker.resetFrameTimingHistory(-90);
              return false;
            }
            if (null != ChatAndIgnoreHelpers.field_a) {
              DateOfBirthValidator.setLoadingProgress(TextWidgetPainter.field_l, 13, 90.0f);
              this.onCanvasCreated(true);
              this.loadGraphics(CheckboxButton.field_G, (byte) -105, AccountDialogHelpers.field_c, InputSetupHelpers.field_a, ChatAndIgnoreHelpers.field_a, QuickChatMenu.field_Fb);
              InputSetupHelpers.field_a = null;
              ChatAndIgnoreHelpers.field_a = null;
              DiskCacheWorker.resetFrameTimingHistory(-82);
              return false;
            }
            if (null != MidiNote.field_i) {
              DateOfBirthValidator.setLoadingProgress(SectorCacheStore.field_i, 13, 95.0f);
              this.onCanvasCreated(true);
              this.loadSceneryModels(1053, MidiNote.field_i);
              MidiNote.field_i = null;
              DiskCacheWorker.resetFrameTimingHistory(param0 - 63);
              return false;
            }
            if (null != IntKeyLookup.field_h) {
              OverlayDrawHelpers.setSharedAnimationFrameset(8799, new HuffmanCodec(IntKeyLookup.field_h.getFileByName("", 100, "huffman")));
              IntKeyLookup.field_h = null;
              DiskCacheWorker.resetFrameTimingHistory(param0 - 86);
              return false;
            }
            SocketJs5Transport.measureToggleLabelWidth(false);
            for (var3_intLifetime2 = 0; var3_intLifetime2 < 12; var3_intLifetime2++) {
              DateOfBirthValidator.field_j[var3_intLifetime2] = new MenuScreen(var3_intLifetime2);
            }
            GameClock.field_c = 10;
            MidiPcmStream.field_y = 10;
            CameraAndLogoHelpers.resetCameraDefaults((byte) -89);
            ArchiveLoadSequence.setTargetFrameRate(50, (byte) 111);
            CachedTextLayout.checkLoadingStageArgument(-111, 50);
            MusicPlaybackHelpers.playMusicTrack(0, MenuScreen.musicTracks[0]);
            UiTheme.field_r = 0;
            return true;
          }
          if (AccountDialogHelpers.field_c.ensureIndexLoaded(0) &&
            AccountDialogHelpers.field_c.ensureGroupAvailableByName((byte) -102, "basic")) {
            if (AccountDialogHelpers.field_c.ensureIndexLoaded(0) &&
              AccountDialogHelpers.field_c.ensureGroupAvailableByName((byte) -102, "kartika13")) {
              if (InputSetupHelpers.field_a.ensureIndexLoaded(0) &&
                InputSetupHelpers.field_a.ensureGroupAvailableByName((byte) -102, "kartika13")) {
                if (AccountDialogHelpers.field_c.ensureIndexLoaded(0) &&
                  AccountDialogHelpers.field_c.ensureGroupAvailableByName((byte) -102, "lobby")) {
                  if (InputSetupHelpers.field_a.ensureIndexLoaded(0) &&
                    InputSetupHelpers.field_a.ensureGroupAvailableByName((byte) -102, "lobby")) {
                    if (RenderTargetHelpers.field_c.ensureIndexLoaded(param0 + 42) &&
                      RenderTargetHelpers.field_c.areAllGroupsAvailable(25867)) {
                      if (DialogMessagePane.field_O.ensureIndexLoaded(0) &&
                        DialogMessagePane.field_O.areAllGroupsAvailable(param0 ^ -25891)) {
                        if (BufferedSocket.field_d.ensureIndexLoaded(0) &&
                          BufferedSocket.field_d.areAllGroupsAvailable(25867)) {
                          if (TriangleMesh.field_w.ensureIndexLoaded(param0 + 42) &&
                            TriangleMesh.field_w.areAllGroupsAvailable(param0 + 25909)) {
                            if (QuickChatMenu.field_Fb.ensureIndexLoaded(0) &&
                              QuickChatMenu.field_Fb.areAllGroupsAvailable(25867)) {
                              if (ChatAndIgnoreHelpers.field_a.ensureIndexLoaded(0) &&
                                ChatAndIgnoreHelpers.field_a.areAllGroupsAvailable(25867)) {
                                if (IntKeyLookup.field_h.ensureIndexLoaded(param0 ^ -42) &&
                                  IntKeyLookup.field_h.areAllGroupsAvailable(25867)) {
                                  if (MidiNote.field_i.ensureIndexLoaded(0) &&
                                    MidiNote.field_i.areAllGroupsAvailable(25867)) {
                                    if (CheckboxButton.field_G.ensureIndexLoaded(param0 ^ -42) &&
                                      CheckboxButton.field_G.areAllGroupsAvailable(param0 + 25909)) {
                                      if (ValidationMessageWidget.field_T.ensureIndexLoaded(param0 + 42) &&
                                        ValidationMessageWidget.field_T.areAllGroupsAvailable(param0 + 25909)) {
                                        DateOfBirthValidator.setLoadingProgress(PendingHighscoreRequest.field_u, 13, 78.0f);
                                        if (!param1) {
                                          return false;
                                        }
                                        AccountDialogHelpers.closeAccountDialogs(18887);
                                        this.onCanvasCreated(true);
                                        AccountCreationSupport.field_g = new SoundCache(RenderTargetHelpers.field_c, DialogMessagePane.field_O);
                                        AccountCreationSupport.field_g.getSynthSoundByName((byte) 86, "", "menu_select");
                                        LobbyControlHelpers.field_b = AccountCreationSupport.field_g.getSynthSoundByName((byte) 112, "", "tetralink_invalid_move");
                                        UrlRewriteHelpers.field_c = new PcmSample[5];
                                        CanvasPresentHelpers.field_d = new PcmSample[5];
                                        for (var3_intLifetime1 = 0; var3_intLifetime1 < 5; var3_intLifetime1++) {
                                          UrlRewriteHelpers.field_c[var3_intLifetime1] = AccountCreationSupport.field_g.getSynthSoundByName((byte) 84, "", "tetralink_drop_piece_" + (var3_intLifetime1 + 1));
                                          CanvasPresentHelpers.field_d[var3_intLifetime1] = AccountCreationSupport.field_g.getSynthSoundByName((byte) 95, "", "tetralink_piece_inplace_" + (1 + var3_intLifetime1));
                                        }
                                        MusicPatchEnvelope.field_i = AccountCreationSupport.field_g.getSynthSoundByName((byte) 92, "", "tetralink_reset_board");
                                        ReportAbuseDialog.field_Lb = AccountCreationSupport.field_g.getSynthSoundByName((byte) 119, "", "tetralink_second_tick");
                                        QuickChatCategoryCache.field_a = AccountCreationSupport.field_g.getSynthSoundByName((byte) 96, "", "tetralink_select_column");
                                        QuickChatCategory.field_t = AccountCreationSupport.field_g.getSynthSoundByName((byte) 110, "", "tetralink_start_game");
                                        DualLinkDequeIterator.field_j = AccountCreationSupport.field_g.getSynthSoundByName((byte) 118, "", "tetralink_winning_line_sound_winner");
                                        OverlayDrawHelpers.field_d = AccountCreationSupport.field_g.getSynthSoundByName((byte) 82, "", "tetralink_winning_line_sound_loser");
                                        AccountCreationSupport.field_g.getSynthSoundByName((byte) 90, "", "tetralink_title_appear");
                                        FullscreenState.field_d = AccountCreationSupport.field_g.getSynthSoundByName((byte) 99, "", "tetralink_dissolve");
                                        AccountCreationSupport.field_k = AccountCreationSupport.field_g.getSynthSoundByName((byte) 103, "", "tetralink_dissolve_in");
                                        PlayerContextMenu.field_f = new PcmSample[3];
                                        PlayerContextMenu.field_f[0] = AccountCreationSupport.field_g.getVorbisSoundByName("", 595749988, "tetralink_NASA_chatter_1");
                                        PlayerContextMenu.field_f[1] = AccountCreationSupport.field_g.getVorbisSoundByName("", 595749988, "tetralink_NASA_chatter_2");
                                        PlayerContextMenu.field_f[2] = AccountCreationSupport.field_g.getVorbisSoundByName("", 595749988, "tetralink_NASA_chatter_3");
                                        RenderTargetHelpers.field_c = null;
                                        DialogMessagePane.field_O = null;
                                        DiskCacheWorker.resetFrameTimingHistory(param0 + 15);
                                        return false;
                                      }
                                      DateOfBirthValidator.setLoadingProgress(Bzip2State.formatLoadingProgress(ValidationMessageWidget.field_T, LoadingTextGlobals.field_b, (byte) -118, SectorCacheStore.field_a), 13, 77.0f);
                                      return false;
                                    }
                                    DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("", TextureCache.field_m, CheckboxButton.field_H, param0 + 41, CheckboxButton.field_G), 13, 75.0f);
                                    return false;
                                  }
                                  DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("", CredentialHelpers.field_d, PendingSubmission.field_m, -1, MidiNote.field_i), 13, 75.0f);
                                  return false;
                                }
                                DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("", LoadingTextGlobals.field_b, SectorCacheStore.field_a, -1, IntKeyLookup.field_h), 13, 75.0f);
                                return false;
                              }
                              DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("", DiskCacheWorker.field_a, QuickChatHelpHelpers.field_c, -1, ChatAndIgnoreHelpers.field_a), 13, 75.0f);
                              return false;
                            }
                            DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("", DiskCacheWorker.field_a, QuickChatHelpHelpers.field_c, -1, QuickChatMenu.field_Fb), param0 + 55, 75.0f);
                            return false;
                          }
                          DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("", BufferedFile.field_r, ProxyAuthenticationRequiredException.field_g, -1, TriangleMesh.field_w), 13, 60.0f);
                          return false;
                        }
                        DateOfBirthValidator.setLoadingProgress(PlayingSound.formatArchiveGroupProgress(ProxyAuthenticationRequiredException.field_g, BufferedFile.field_r, BufferedSocket.field_d, 0, 0), 13, 45.0f);
                        return false;
                      }
                      DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("", GuestPlayHelpers.field_d, CachedTextLayout.field_n, -1, DialogMessagePane.field_O), 13, 40.0f);
                      return false;
                    }
                    DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("", GuestPlayHelpers.field_d, CachedTextLayout.field_n, -1, RenderTargetHelpers.field_c), param0 + 55, 20.0f);
                    return false;
                  }
                  DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("lobby", ClientEnvironmentHelpers.field_j, IsaacRandom.field_d, -1, InputSetupHelpers.field_a), 13, 17.0f);
                  return false;
                }
                DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("lobby", DiskCacheWorker.field_a, QuickChatHelpHelpers.field_c, -1, AccountDialogHelpers.field_c), 13, 13.0f);
                return false;
              }
              DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("roman20", ClientEnvironmentHelpers.field_j, IsaacRandom.field_d, -1, InputSetupHelpers.field_a), param0 ^ -37, 12.0f);
              return false;
            }
            DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("kartika13", DiskCacheWorker.field_a, QuickChatHelpHelpers.field_c, -1, AccountDialogHelpers.field_c), 13, 11.0f);
            return false;
          }
          DateOfBirthValidator.setLoadingProgress(ConditionalTextValue.formatArchiveProgress("basic", DiskCacheWorker.field_a, QuickChatHelpHelpers.field_c, -1, AccountDialogHelpers.field_c), 13, 10.0f);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "Virogrid.EB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        try {
          field_O = null;
          if (param0 != 240) {
            field_O = (LoginMethod) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "Virogrid.HB(" + param0 + ')');
        }
    }

    private final void updateGhostModelTransform(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          if (Bzip2State.hasFeatureBit((byte) 13, 0) &&
            0 < AchievementNotice.field_h) {
            var2_int = UiTheme.field_c - AchievementNotice.field_h;
            var3 = -700;
            var4 = 4 * var2_int - 1300;
            var5 = 200;
            if (100 > var2_int) {
              var5 = var5 - (var2_int + 200);
              var3 = -20000 + var3 + var2_int * 200;
            }
            var6 = -2048;
            var7 = UiTheme.sineLookup(var6, 32);
            var8 = TextDecodeHelpers.cosineLookup(21855, var6);
            CheckboxTickPainter.field_e = new int[]{var3, var5, var4, var8, 0, -var7, 0, 65536, 0, var7, 0, var8};
            TextLayoutLine.field_a.drawTransformed(PlayingSound.field_j, CheckboxTickPainter.field_e);
            TextLayoutLine.field_a.tryComputeScreenBounds();
          }
          if (param0 != -1933) {
            this.field_D = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "Virogrid.JB(" + param0 + ')');
        }
    }

    private final void renderLowDetailFrame(byte param0) {
        int var2_int = 0;
        int var8 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_43_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        FallingParticle var3_ref_fl = null;
        int var4 = 0;
        MouseTrailPoint var4_ref_pm = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var29 = null;
        int[] var30 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var3Lifetime2;
        int var6Lifetime3;
        var8 = field_F ? 1 : 0;
        try {
          var2_int = 1;
          if (GameClock.field_c == MidiPcmStream.field_y &&
            TextDecodeHelpers.field_g == LobbySortHelpers.field_g) {
            if (MidiPcmStream.field_y != -2) {
              PlayerContextMenu.renderScreenToSprites(TextDecodeHelpers.field_g, true, -1, 3, MidiPcmStream.field_y);
            } else {
              LabeledChildWidget.clearScreen(false, 25680);
              var2_int = 0;
            }
          } else {
            if (MidiPcmStream.field_y != -2) {
              if (GameClock.field_c == -2) {
                if (ClientEnvironmentHelpers.field_l < 16) {
                  PlayerContextMenu.renderScreenToSprites(TextDecodeHelpers.field_g, false, -1, 3, MidiPcmStream.field_y);
                } else {
                  var2_int = 0;
                  LabeledChildWidget.clearScreen(false, 25680);
                }
              } else {
                if (ClientEnvironmentHelpers.field_l < 16) {
                  PlayerContextMenu.renderScreenToSprites(TextDecodeHelpers.field_g, false, 1 + ClientEnvironmentHelpers.field_l, 3, MidiPcmStream.field_y);
                } else {
                  PlayerContextMenu.renderScreenToSprites(LobbySortHelpers.field_g, false, 33 - ClientEnvironmentHelpers.field_l, 3, GameClock.field_c);
                }
              }
            } else {
              if (ClientEnvironmentHelpers.field_l < 16) {
                var2_int = 0;
                LabeledChildWidget.clearScreen(false, 25680);
              } else {
                PlayerContextMenu.renderScreenToSprites(LobbySortHelpers.field_g, false, -1, 3, GameClock.field_c);
              }
            }
          }
          if (var2_int != 0) {
            if (null == PasswordConfirmationValidator.field_s ||
              ArchiveIndex.field_o != TextFieldPainter.field_x) {
              TextFieldPainter.field_x = ArchiveIndex.field_o;
              CheckboxPainter.field_r = PatchNoteUsage.field_i;
              CommonUiHelpers.field_c = ArchiveIndex.field_o;
              SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
              SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
              MarkerSlider.updateCameraMatrix((byte) -44);
              PasswordConfirmationValidator.field_s = new Sprite(640, 480);
              RenderTargetHelpers.setRenderTargetSprite(PasswordConfirmationValidator.field_s, 256);
              Rasterizer.fillRectangle(0, 0, 640, 480, 3158064);
              var3 = NodeHashTableIterator.field_b;
              var4 = QueuedListRequest.field_g;
              LobbyLayout.setViewportOrigin(320, 240, -2);
              var9 = new int[12];
              var20 = var9;
              var13 = var20;
              var5_ref_int__ = var13;
              for (var6 = 0; var6 < 3; var6++) {
                var9[var6] = PlayingSound.field_j[var6] << 3;
              }
              var6Lifetime3 = 3;
              stackIn_34_0 = var5_ref_int__;
              while (stackIn_34_0.length > var6Lifetime3) {
                var5_ref_int__[var6Lifetime3] = PlayingSound.field_j[var6Lifetime3];
                var6Lifetime3++;
                stackIn_34_0 = var20;
              }
              this.drawSpotlightProjections((byte) -62);
              AsyncCheckResult.field_c.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              ArchiveRequest.field_x.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              DualLinkHashTable.field_c.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              LogoRenderHelpers.field_k.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              ArchiveProvider.field_c.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              RasterBuffer.field_j.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              QuickChatPhraseDefinition.field_y.drawTransformed(var20, ChatShortcutHelpers.field_c);
              RenderTargetHelpers.field_a.drawTransformed(var20, ChatShortcutHelpers.field_c);
              RasterSnapshot.field_h.drawTransformed(var20, ChatShortcutHelpers.field_c);
              SoundCache.field_i.drawTransformed(var20, ChatShortcutHelpers.field_c);
              GuestPlayHelpers.field_a.drawTransformed(var20, ChatShortcutHelpers.field_c);
              BoundedUrlRequest.field_l.drawTransformed(var20, ChatShortcutHelpers.field_c);
              BirthDateEntryPanel.field_L.drawTransformed(var20, ChatShortcutHelpers.field_c);
              MusicPatch.field_o.drawTransformed(var20, ChatShortcutHelpers.field_c);
              PendingHighscoreRequest.field_x.drawTransformed(var20, ChatShortcutHelpers.field_c);
              CanvasPresentHelpers.field_i.drawTransformed(var20, ChatShortcutHelpers.field_c);
              LoginCredentialType.popRasterState((byte) 109);
              LobbyLayout.setViewportOrigin(var3, var4, -2);
            }
            PasswordConfirmationValidator.field_s.drawOpaque(0, QueuedListRequest.field_g - 240);
            if (WidgetNode.field_p.field_m) {
              var3Lifetime2 = UiTheme.field_r % 64;
              if (var3Lifetime2 >= 32) {
                stackIn_43_0 = 48 - var3Lifetime2;
              } else {
                stackIn_43_0 = var3Lifetime2 - 16;
              }
              var3Lifetime2 = stackIn_43_0;
              var3Lifetime2 = var3Lifetime2 << 2;
              var22 = new int[3];
              var15 = var22;
              var10 = var15;
              var29 = var10;
              var21 = new int[3];
              var14 = var21;
              var11 = var14;
              var30 = var11;
              var23 = new int[3];
              var16 = var23;
              var6_ref_int__ = var16;
              var10[0] = (int)ScrollPaneWithFooter.field_Hb;
              var21[0] = 50;
              var10[1] = -(int)ScrollPaneWithFooter.field_Hb;
              var6_ref_int__[0] = (var3Lifetime2 >> 4) + 128;
              var21[1] = 50;
              var22[2] = 0;
              var6_ref_int__[1] = (var3Lifetime2 >> 4) + 128;
              var21[2] = 80;
              var23[2] = 128;
              var7 = CameraProjectionMath.rgbToPackedHsl(8437759);
              ClippedTriangleRenderer.drawTriangle(240, 0, 0, var29, var30, var23, var7, var7, var7);
              var3Lifetime2 = var22[0];
              var10[0] = var22[1];
              var22[1] = var3Lifetime2;
              var3Lifetime2 = var21[0];
              var11[0] = var21[1];
              var21[1] = var3Lifetime2;
              var3Lifetime2 = var23[0];
              var6_ref_int__[0] = var23[1];
              var23[1] = var3Lifetime2;
              ClippedTriangleRenderer.drawTriangle(240, 0, 0, var29, var30, var23, var7, var7, var7);
            }
            if (WidgetNode.field_p.field_d) {
              var26 = DisplayNameHelpers.field_d.field_B;
              var19 = var26;
              var12 = var19;
              var3_ref_int__ = var12;
              if (LoginMethod.field_h > 0) {
                var6Lifetime1 = 256000;
                while (var6Lifetime1 > 0) {
                  var6Lifetime1--;
                  var4Lifetime1 = 16711935 & var26[var6Lifetime1];
                  var5 = 65280 & var26[var6Lifetime1];
                  var4Lifetime1 = var4Lifetime1 * (256 - LoginMethod.field_h);
                  var4Lifetime1 = var4Lifetime1 & -16711936;
                  var5 = var5 * (256 - LoginMethod.field_h);
                  var5 = var5 & 16711680;
                  var4Lifetime1 = var4Lifetime1 + (LoginMethod.field_h * 16711935 & -16711936);
                  var5 = var5 + (16711680 & LoginMethod.field_h * 65280);
                  var12[var6Lifetime1] = BitwiseHelpers.bitOr(var5, var4Lifetime1) >>> 8;
                }
              }
              RenderTargetHelpers.setRenderTargetSprite(DisplayNameHelpers.field_d, 256);
              var4_ref_pm = (MouseTrailPoint) (ImageProducerRasterBuffer.field_n.first((byte) -107));
              while (var4_ref_pm != null) {
                RasterEffectHelpers.drawBubbleDistortion(var4_ref_pm.field_m, var4_ref_pm.field_h, var4_ref_pm.field_r << 3, 10000);
                var4_ref_pm = (MouseTrailPoint) (ImageProducerRasterBuffer.field_n.next(16213));
              }
              LoginCredentialType.popRasterState((byte) 86);
              DisplayNameHelpers.field_d.drawTransparent(NodeHashTableIterator.field_b - (DisplayNameHelpers.field_d.field_w >> 1), -(DisplayNameHelpers.field_d.field_p >> 1) + QueuedListRequest.field_g);
              if (!(WidgetNode.field_p.field_f <= 0)) {
                RasterEffectHelpers.drawGlowingLine(NodeHashTableIterator.field_b - (DisplayNameHelpers.field_d.field_w >> 1), QueuedListRequest.field_g - (DisplayNameHelpers.field_d.field_p >> 1), (DisplayNameHelpers.field_d.field_w >> 1) + NodeHashTableIterator.field_b, -(DisplayNameHelpers.field_d.field_p >> 1) + QueuedListRequest.field_g, 40, WidgetNode.field_p.field_f, RenderTargetHelpers.field_d);
                RasterEffectHelpers.drawGlowingLine((DisplayNameHelpers.field_d.field_w >> 1) + NodeHashTableIterator.field_b, -(DisplayNameHelpers.field_d.field_p >> 1) + QueuedListRequest.field_g, (DisplayNameHelpers.field_d.field_w >> 1) + NodeHashTableIterator.field_b, QueuedListRequest.field_g + (DisplayNameHelpers.field_d.field_p >> 1), 40, WidgetNode.field_p.field_f, RenderTargetHelpers.field_d);
                RasterEffectHelpers.drawGlowingLine((DisplayNameHelpers.field_d.field_w >> 1) + NodeHashTableIterator.field_b, QueuedListRequest.field_g + (DisplayNameHelpers.field_d.field_p >> 1), -(DisplayNameHelpers.field_d.field_w >> 1) + NodeHashTableIterator.field_b, QueuedListRequest.field_g + (DisplayNameHelpers.field_d.field_p >> 1), 40, WidgetNode.field_p.field_f, RenderTargetHelpers.field_d);
                RasterEffectHelpers.drawGlowingLine(NodeHashTableIterator.field_b - (DisplayNameHelpers.field_d.field_w >> 1), QueuedListRequest.field_g + (DisplayNameHelpers.field_d.field_p >> 1), NodeHashTableIterator.field_b - (DisplayNameHelpers.field_d.field_w >> 1), QueuedListRequest.field_g - (DisplayNameHelpers.field_d.field_p >> 1), 40, WidgetNode.field_p.field_f, RenderTargetHelpers.field_d);
              }
            }
            var3_ref_fl = (FallingParticle) (ProgressMessageDialog.field_tb.first((byte) -108));
            while (var3_ref_fl != null) {
              var4Lifetime2 = var3_ref_fl.field_n >> 12;
              var6Lifetime2 = 512 + (var3_ref_fl.field_m >> 12);
              var5Lifetime1 = var3_ref_fl.field_p >> 12;
              if (var6Lifetime2 > 0) {
                Rasterizer.fillRadialPaletteCircle((var4Lifetime2 << 13) / var6Lifetime2 + (NodeHashTableIterator.field_b << 4), (QueuedListRequest.field_g << 4) + (var5Lifetime1 << 13) / var6Lifetime2, 65536 / var6Lifetime2, var3_ref_fl.field_o * 5 / 3, RenderTargetHelpers.field_d);
              }
              var3_ref_fl = (FallingParticle) (ProgressMessageDialog.field_tb.next(16213));
            }
          }
          var3Lifetime1 = 14 / ((param0 + 76) / 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "Virogrid.LB(" + param0 + ')');
        }
    }

    final void onCanvasCreated(boolean param0) {
        Object stackIn_5_0 = null;
        GameSession stackIn_24_0 = null;
        boolean stackIn_61_0 = false;
        boolean stackIn_66_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        GameSession var3 = null;
        int var4 = 0;
        AchievementNotice var4_ref_hj = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = field_F ? 1 : 0;
        try {
          if (null == FullscreenState.field_b) {
            stackIn_5_0 = UiWidget.field_v;
          } else {
            stackIn_5_0 = FullscreenState.field_b;
          }
          var8 = stackIn_5_0;
          var2 = var8;
          if (NodeHashTableIterator.shouldShowBootstrapLoadingScreen(-1)) {
            LogoRenderHelpers.drawClientToCanvas((java.awt.Canvas) (var8), (byte) -47, DebouncedValidator.hasInputFocus((byte) -121));
            return;
          }
          if (!MidiPcmStream.field_H) {
            ConditionalTextValue.drawLoadingScreen((byte) 46, (java.awt.Canvas) (var8));
            return;
          }
          if (!LobbyLayout.shouldRunGameScreen((byte) -85)) {
            DateOfBirthValidator.setLoadingProgress(LoadingTextGlobals.field_b, 13, 100.0f);
            ConditionalTextValue.drawLoadingScreen((byte) 83, (java.awt.Canvas) (var8));
            return;
          }
          if (WidgetNode.field_p.field_g) {
            this.renderHighDetailFrame(true);
          } else {
            this.renderLowDetailFrame((byte) 54);
          }
          if (null != DropTargetWidget.field_I) {
            stackIn_24_0 = DropTargetWidget.field_I;
          } else {
            stackIn_24_0 = MusicPlaybackHelpers.field_b;
          }
          var3 = stackIn_24_0;
          if (var3 != null) {
            var3.drawGameOverlay(-16, true);
            PendingSubmission.drawViewModePanel(-30265);
            if (AccountTermsPanel.field_J &&
              SoundPlaybackHelpers.field_e) {
              AccountTermsPanel.drawSharedOverlays(DualLinkDequeIterator.isBlinkPhaseVisible(-844), 3410);
            }
          } else {
            PendingSubmission.drawViewModePanel(-30265);
          }
          if ((GameClock.field_c != MidiPcmStream.field_y ||
            LobbySortHelpers.field_g != TextDecodeHelpers.field_g) &&
            (-2 == MidiPcmStream.field_y ||
            -2 == GameClock.field_c) &&
            ClientEnvironmentHelpers.field_l < 16) {
          }
          if (!AccountTermsPanel.field_J ||
            !SoundPlaybackHelpers.field_e) {
            AccountTermsPanel.drawSharedOverlays(DualLinkDequeIterator.isBlinkPhaseVisible(-844), 3410);
          }
          if (DigestHelpers.isFullscreenPromptOpen(param0)) {
            Rasterizer.darkenRectangle(0, 0, Rasterizer.field_e, Rasterizer.field_f);
            stackIn_66_0 = !param0;
            var4 = IntrusiveDequeCursor.getSpanWidth(stackIn_66_0) + 24;
            var5 = Virogrid.getLobbyContentHeight(-80) + 26;
            StripedProgressBar.drawPulsingGlowFrame(var5, -124, var4);
            PopupMenuDrawHelpers.drawPopupMenuItems(-5205);
          } else {
            if (TextEncodingHelpers.beginReconnectGracePeriod(-31609)) {
              stackIn_61_0 = (FullscreenState.field_b != null) || (NameEntryPopup.field_Gb);
              WidgetContainer.drawModalOverlay(stackIn_61_0, -20248);
            } else {
              if (!MusicCrossfadeStream.isLoginRequestFlagged((byte) 47)) {
                if (!this.field_I.isEmpty((byte) 64)) {
                  var4_ref_hj = (AchievementNotice) (this.field_I.first((byte) -103));
                  var6 = this.field_A;
                  if (var6 < 80) {
                    var5 = -32 + var6 / 2;
                  } else {
                    if (var6 >= 230) {
                      var5 = 123 - var6 / 2;
                    } else {
                      var5 = 8;
                    }
                  }
                  ValidatedTextWidget.field_Y[var4_ref_hj.field_i].drawTransparent(8, var5);
                  ReflectionCheckHelpers.standardFont.drawLeft(DualLinkDeque.achievementTitles[var4_ref_hj.field_i], 48, ReflectionCheckHelpers.standardFont.field_H + var5, 8437759, -1);
                }
              } else {
                var4 = 24 + NamedTextResourceHelpers.getCenteredSpanWidth(-16118);
                var5 = LobbySortHelpers.getListContentHeight(true) + 26;
                StripedProgressBar.drawPulsingGlowFrame(var5, -125, var4);
                WhirlpoolDigest.drawMessageDialogLines(false);
              }
            }
          }
          if (TextButton.field_x != 0) {
            BackgroundParticle.scaleRasterBrightness(-119, (16 - EditableTextWidget.field_K) * 256 / 16);
          }
          if (ReflectionCheckHelpers.field_d >= 2) {
            ReflectionCheckHelpers.standardFont.drawLeft(Integer.toString(StrongCacheReference.field_E), 4, 24, 16777215, -1);
          }
          CanvasPresentHelpers.drawRasterToCanvas(-30179, (java.awt.Canvas) (var8), 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2_ref), "Virogrid.J(" + param0 + ')');
        }
    }

    private final static int getLobbyContentHeight(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        try {
          var1_int = -13 / ((param0 + 32) / 40);
          stackIn_1_0 = PatchNoteUsage.field_n;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "Virogrid.SA(" + param0 + ')');
        }
    }

    private final void loadSceneryModels(int param0, Js5Archive param1) {
        Model var4 = null;
        Model var5 = null;
        Model var6 = null;
        Model var7 = null;
        Model var8 = null;
        Model var9 = null;
        Model var10 = null;
        Model var11 = null;
        Model var12 = null;
        Model var13 = null;
        Model var14 = null;
        Model var15 = null;
        Model var16 = null;
        Model var17 = null;
        Model var18 = null;
        Model var19 = null;
        Model var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        Model var27 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Model var26 = null;
        try {
          TriangleRasterizer.setBrightnessAndRebuildPalette(1.0f);
          TriangleRasterizer.useRasterClip();
          if (param0 != 1053) {
            return;
          }
          var27 = Model.load(param1, "", "scenery_walls");
          var4 = Model.load(param1, "", "scenery_walls2");
          var5 = Model.load(param1, "", "scenery_game-table");
          var6 = Model.load(param1, "", "scenery_floor");
          var7 = Model.load(param1, "", "scenery_props1");
          var8 = Model.load(param1, "", "scenery_props2");
          var9 = Model.load(param1, "", "scenery_ceiling");
          var10 = Model.load(param1, "", "scenery_door");
          var11 = Model.load(param1, "", "scenery_game-screen_back");
          var12 = Model.load(param1, "", "scenery_game-screen_front");
          var13 = Model.load(param1, "", "scenery_game-screen_front-left");
          var14 = Model.load(param1, "", "scenery_game-screen_back-left");
          var15 = Model.load(param1, "", "scenery_game-screen_back-top");
          var16 = Model.load(param1, "", "scenery_game-screen_front-right");
          var17 = Model.load(param1, "", "scenery_game-screen_back-right");
          var18 = Model.load(param1, "", "scenery_game-screen_front-top");
          var19 = Model.load(param1, "", "scenery_game-screen_front-black");
          var20 = Model.load(param1, "", "scenery_game-screen_back-black");
          this.scaleModelAboutTablePivot(var11, (byte) 69);
          this.scaleModelAboutTablePivot(var12, (byte) 69);
          this.scaleModelAboutTablePivot(var13, (byte) 69);
          this.scaleModelAboutTablePivot(var14, (byte) 69);
          this.scaleModelAboutTablePivot(var16, (byte) 69);
          this.scaleModelAboutTablePivot(var17, (byte) 69);
          this.scaleModelAboutTablePivot(var15, (byte) 69);
          this.scaleModelAboutTablePivot(var18, (byte) 69);
          this.scaleModelAboutTablePivot(var19, (byte) 69);
          this.scaleModelAboutTablePivot(var20, (byte) 69);
          this.field_J = this.getSceneryModelTransform((byte) 124, var11);
          this.field_K = this.getSceneryModelTransform((byte) 118, var12);
          this.field_D = this.getSceneryModelTransform((byte) 94, var13);
          this.field_B = this.getSceneryModelTransform((byte) 116, var16);
          this.field_C = this.getSceneryModelTransform((byte) 74, var18);
          this.field_L = this.getSceneryModelTransform((byte) 116, var19);
          this.field_M = this.getSceneryModelTransform((byte) 64, var14);
          this.field_G = this.getSceneryModelTransform((byte) 69, var17);
          this.field_H = this.getSceneryModelTransform((byte) 107, var15);
          this.field_N = this.getSceneryModelTransform((byte) 69, var20);
          var21 = 96;
          var22 = 2260;
          var23 = 0;
          var24 = 256;
          var25 = 0;
          if (Bzip2State.hasFeatureBit((byte) 13, 0)) {
            var26 = Model.load(param1, "", "ghost_untextured");
            TextLayoutLine.field_a = (ModelMesh) (var26.createModel(var21, var22, var23, var24, var25));
            var23 = 64;
            var21 = 42;
          }
          DualLinkHashTable.field_c = (ModelMesh) (var27.createModel(var21, var22, var23, var24, var25));
          LogoRenderHelpers.field_k = (ModelMesh) (var4.createModel(var21, var22, var23, var24, var25));
          FallingParticle.field_s = (ModelMesh) (var5.createModel(var21, var22, var23, var24, var25));
          ArchiveRequest.field_x = (ModelMesh) (var6.createModel(var21, var22, var23, var24, var25));
          ArchiveProvider.field_c = (ModelMesh) (var7.createModel(var21, var22, var23, var24, var25));
          RasterBuffer.field_j = (ModelMesh) (var8.createModel(var21, var22, var23, var24, var25));
          AsyncCheckResult.field_c = (ModelMesh) (var9.createModel(var21, var22, var23, var24, var25));
          LobbyPlayerEntry.field_Qb = (ModelMesh) (var10.createModel(var21, var22, var23, var24, var25));
          var13.computeNormals();
          var14.computeNormals();
          var14.mergeFrom(var13, 0, 0, 0, false);
          var16.computeNormals();
          var17.computeNormals();
          var17.mergeFrom(var16, 0, 0, 0, false);
          QuickChatPhraseDefinition.field_y = (ModelMesh) (var11.createModel(var21, var22, var23, var24, var25));
          GuestPlayHelpers.field_a = (ModelMesh) (var12.createModel(var21, var22, var23, var24, var25));
          RasterSnapshot.field_h = (ModelMesh) (var14.createModel(var21, var22, var23, var24, var25));
          SoundCache.field_i = (ModelMesh) (var17.createModel(var21, var22, var23, var24, var25));
          RenderTargetHelpers.field_a = (ModelMesh) (var15.createModel(var21, var22, var23, var24, var25));
          BirthDateEntryPanel.field_L = (ModelMesh) (var13.createModel(var21, var22, var23, var24, var25));
          MusicPatch.field_o = (ModelMesh) (var16.createModel(var21, var22, var23, var24, var25));
          BoundedUrlRequest.field_l = (ModelMesh) (var18.createModel(var21, var22, var23, var24, var25));
          PendingHighscoreRequest.field_x = (ModelMesh) (var20.createModel(var21, var22, var23, var24, var25));
          CanvasPresentHelpers.field_i = (ModelMesh) (var19.createModel(var21, var22, var23, var24, var25));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("Virogrid.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void tickGame(int param0) {
        boolean discarded$0 = false;
        String[] array$1 = null;
        boolean stackIn_8_1 = false;
        boolean stackIn_50_1 = false;
        double stackIn_83_0 = 0.0;
        int stackIn_99_0 = 0;
        String[] stackIn_112_0 = null;
        String[] stackIn_112_1 = null;
        int stackIn_112_2 = 0;
        String stackIn_113_3;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        GameSession var7_ref_ic = null;
        String var8 = null;
        String var9 = null;
        int var9_int = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var4_intLifetime2;
        int var2_intLifetime1Lifetime1;
        int var2_intLifetime1Lifetime2;
        int var3Lifetime2Lifetime1;
        int var3Lifetime2Lifetime2;
        var11 = field_F ? 1 : 0;
        try {
          CheckboxPainter.getKeyIdleTicks(param0 ^ -28791807);
          DirectByteStorage.field_l = SpriteWidget.getIdleTicks(param0 ^ -125);
          ClientServiceHelpers.serviceAudio(false);
          if (null != FullscreenState.field_b &&
            FullscreenState.field_b.field_a) {
            FullscreenSupport.exitFullscreen((byte) -16);
            ArchiveLoadSequence.rebuildPopupMenuIfOpen((byte) -12);
          }
          stackIn_8_1 = (FullscreenState.field_b != null);
          this.serviceFramework(stackIn_8_1, 121);
          if (MidiPcmStream.field_w) {
            this.openArchives(param0 ^ 13);
            MidiPcmStream.field_w = false;
          }
          UiTheme.field_r = UiTheme.field_r + 1;
          if (UiTheme.field_r == 500 &&
            10 == GameClock.field_c) {
            BufferedSocket.enterMainMenu(12229, false);
          }
          if (NodeHashTableIterator.shouldShowBootstrapLoadingScreen(-1)) {
            this.updateLoginFlow(1);
            if (NodeHashTableIterator.shouldShowBootstrapLoadingScreen(-1)) {
              if (MouseInputHandler.isPostLoginStage(66)) {
                discarded$0 = this.advanceLoading((byte) -42, false);
              }
              return;
            }
          }
          if (!MidiPcmStream.field_H) {
            BirthDateInputWidget.updateLoginUi(BoundedUrlRequest.field_b, param0 + 45);
            if (this.advanceLoading((byte) -42, true)) {
              MidiPcmStream.field_H = true;
            }
          } else {
            if (!LobbyLayout.shouldRunGameScreen((byte) 118)) {
              GuestPlayHelpers.pollStoredFlagsRequest(false);
            } else {
              if (!DigestHelpers.isFullscreenPromptOpen(true)) {
                if (TextEncodingHelpers.beginReconnectGracePeriod(-31609)) {
                  stackIn_50_1 = (FullscreenState.field_b != null);
                  var2_int = this.runAccountMenu(stackIn_50_1, -120);
                  if (1 == var2_int ||
                    var2_int == 2) {
                    if (null != FullscreenState.field_b) {
                      FullscreenSupport.exitFullscreen((byte) -16);
                    }
                    if (var2_int == 2) {
                      Js5ArchiveManager.openQuitPage((byte) 39, (java.applet.Applet) (this));
                    }
                  }
                  this.updateScreens(false, true);
                } else {
                  if (MusicCrossfadeStream.isLoginRequestFlagged((byte) 47)) {
                    if (TextButton.field_x == 0) {
                      var2_int = TabbedPanel.pollMenuSelection((byte) 57);
                      if (1 == var2_int) {
                        DelayedPacket.field_n = true;
                        CheckboxButton.beginFadeToScreen((byte) -56, TextFieldValidator.field_l, 0);
                      }
                      this.updateScreens(false, true);
                    } else {
                      this.updateScreens(false, false);
                    }
                  } else {
                    this.updateScreens(false, false);
                  }
                }
              } else {
                if (TextButton.field_x == 0) {
                  var2_int = LoginPanel.pollMenuSelection(2);
                  if (var2_int == 2) {
                    FullscreenSupport.exitFullscreen((byte) -16);
                  } else {
                    if (var2_int == 3) {
                      PasswordFieldPainter.field_D = false;
                      GameSession.applyLobbyTheme(MusicVolumeAndOverlayHelpers.frameSprites, ReflectionCheckHelpers.standardFont.field_A, 320, MusicVolumeAndOverlayHelpers.frameSprites, 8, PopupInputHelpers.menuFont, 2, ReflectionCheckHelpers.standardFont.field_A + ReflectionCheckHelpers.standardFont.field_G, 8, -16824, true, 240);
                    } else {
                      if (var2_int == 4) {
                        PasswordFieldPainter.field_D = true;
                        CheckboxButton.beginFadeToScreen((byte) 53, PacketBuffer.field_j, 0);
                      }
                    }
                  }
                  this.updateScreens(false, true);
                } else {
                  this.updateScreens(false, false);
                }
              }
            }
          }
          while (true) {
            if (!EmailAvailabilityValidator.pollIncomingPacket(-122, PacketBuffer.field_i)) {
              DateOfBirthValidator.flushPackets(-1, param0);
              if (MidiPcmStream.field_y == -2) {
                DiskArchiveRequest.field_B = true;
              }
              if (DiskArchiveRequest.field_B) {
                QuickChatCategoryCache.field_j = 0;
              }
              if (MusicCrossfadeStream.isLobbyReady((byte) -121)) {
                var2_intLifetime1 = this.pollReconnectAndResend(0);
                if (var2_intLifetime1 == 0 ||
                  var2_intLifetime1 == 1) {
                  LinkTextPainter.resetReflectionCheckQueue(114);
                  if (var2_intLifetime1 != 1) {
                    if (TextWidgetPainter.field_a) {
                      SoundPlaybackHelpers.field_e = false;
                      DrawOfferMenuHelpers.field_e = true;
                      QuickChatPhraseDefinition.field_q = true;
                      if (!DecodedSpriteHelpers.field_a) {
                        MarkerSlider.changeScreen(-2, 0, false, 0);
                      } else {
                        FadeLayer.field_J = DebouncedValidator.textRemovedFromGame;
                        MarkerSlider.changeScreen(-2, 0, false, 9);
                      }
                      TriangleMesh.commitScreenChange((byte) -86);
                      PendingRequest.createGameOptions(true, (byte) 87);
                      DateOfBirthValidator.field_j[MidiPcmStream.field_y].updatePointerSelection((byte) 120, 0, false);
                      LoginRsaKey.field_d = false;
                      DecodedSpriteHelpers.field_a = false;
                      TextWidgetPainter.field_a = false;
                    }
                    Js5Archive.field_e = false;
                    TextFieldValidator.field_k = false;
                  } else {
                    TextFieldValidator.field_k = true;
                    Js5Archive.field_e = true;
                  }
                }
                var3 = 0;
                if (2 == var2_intLifetime1) {
                  var3 = 1;
                }
                if (TextWidgetPainter.field_a ||
                  TextFieldValidator.field_k ||
                  Js5Archive.field_e) {
                  var3 = 1;
                }
                if (var3 != 0) {
                  EmailValidator.beginReconnect((byte) -121);
                }
              }
              return;
            }
            if (9 == PasswordConfirmationValidator.field_q) {
              TriangleMesh.commitScreenChange((byte) -86);
              BitCountAndDialogHelpers.field_c = 2;
              SingleChildWidget.field_z = 3.1415927410125732f;
              GameClock.field_c = 9;
              TextFieldValidator.field_k = false;
              TooltipAndOptionsHelpers.field_c = 128.0f;
              FadeLayer.field_J = ProgressMessageDialog.field_qb.readString(-117);
              continue;
            }
            if (PasswordConfirmationValidator.field_q == 14) {
              SoundPlaybackHelpers.playSoundEffect(30, FullscreenState.field_d);
              TriangleMesh.commitScreenChange((byte) -86);
              WidgetStyleLayer.initializeLobbyState(ScoreSubmissionHelpers.nextPowerOfTwo(8742, 2), PasswordConfirmationValidator.getGameListContent(param0 - 126), ScoreSubmissionHelpers.field_e, 8, MusicCrossfadeStream.getGameMemberListContent(1048576), 1024, 150, ScoreSubmissionHelpers.nextPowerOfTwo(8742, 2000), MidiNote.field_j.length, TextLayoutLine.getBoardScrollContent((byte) 51));
              ConnectionStage.bindLobbyLists(ReflectionCheck.getFriendListContent((byte) -96), (byte) -127, PendingSubmission.getDisplayNamePanelWidget(16777215));
              GameClock.field_c = -2;
              TextFieldValidator.field_k = false;
              TextWidgetPainter.field_a = true;
              continue;
            }
            if (PasswordConfirmationValidator.field_q == 15) {
              if (TextWidgetPainter.field_a) {
                TriangleMesh.commitScreenChange((byte) -86);
                TriangleMesh.closeAllPopups(param0 ^ 2);
                LobbySessionHelpers.clearChatHistory((byte) -69);
                GameClock.field_c = 0;
                QuickChatPhraseDefinition.field_q = true;
                DrawOfferMenuHelpers.field_e = true;
                SoundPlaybackHelpers.field_e = false;
                DecodedSpriteHelpers.field_a = false;
                TextWidgetPainter.field_a = false;
                LoginRsaKey.field_d = false;
                LobbyLayout.setViewportOrigin(320, 240, param0 ^ -2);
                if (null != DropTargetWidget.field_I &&
                  1 == DropTargetWidget.field_I.localPlayer) {
                  stackIn_83_0 = 0.0;
                } else {
                  stackIn_83_0 = 3.141592653589793;
                }
                ArchiveIndex.field_o = (float)stackIn_83_0;
                BufferedSocket.resetCameraTargets(false, (byte) -106);
                SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
                SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
                PendingRequest.createGameOptions(true, (byte) 87);
                MarkerSlider.updateCameraMatrix((byte) -44);
              }
              Js5Archive.field_e = false;
              TextFieldValidator.field_k = false;
              continue;
            }
            if (PasswordConfirmationValidator.field_q == 10 &&
              TextWidgetPainter.field_a) {
              DelayedPacket.handleSocialListPacket(-51);
              continue;
            }
            if (67 == PasswordConfirmationValidator.field_q) {
              var2_intLifetime1Lifetime1 = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
              var3Lifetime1 = 1 << var2_intLifetime1Lifetime1;
              SocketConnector.field_c = SocketConnector.field_c | var3Lifetime1;
              this.field_I.addFirst(new AchievementNotice(var2_intLifetime1Lifetime1), (byte) -61);
              continue;
            }
            if (PasswordConfirmationValidator.field_q != 57 &&
              PasswordConfirmationValidator.field_q != 58) {
              if (PasswordConfirmationValidator.field_q == 59) {
                if (DecodedSpriteHelpers.field_a ||
                  LoginRsaKey.field_d) {
                  TriangleMesh.commitScreenChange((byte) -86);
                  if (DecodedSpriteHelpers.field_a) {
                    DropTargetWidget.field_I.leaveOfflineGame((byte) -70, false);
                  }
                  PendingRequest.createGameOptions(true, (byte) 87);
                  DiskArchiveRequest.field_B = true;
                  SoundPlaybackHelpers.field_e = false;
                  GameClock.field_c = -2;
                  QuickChatPhraseDefinition.field_q = true;
                  DecodedSpriteHelpers.field_a = false;
                  QuickChatCategoryCache.field_j = 0;
                  LoginRsaKey.field_d = false;
                }
                Js5Archive.field_e = false;
                continue;
              }
              var2 = null;
              if (DecodedSpriteHelpers.field_a) {
                var2 = DropTargetWidget.field_I;
              } else {
                if (LoginRsaKey.field_d) {
                  var2 = MusicPlaybackHelpers.field_b;
                }
              }
              if (var2 != null) {
                if (PasswordConfirmationValidator.field_q == 60) {
                  var3Lifetime2 = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
                  var4_int = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
                  var5 = ProgressMessageDialog.field_qb.readUnsignedShort((byte) -92);
                  ((GameSession) (var2)).board.setTurn(var3Lifetime2, var4_int, 21428);
                  if (((GameSession) (var2)).board.field_v == -1) {
                    ((GameSession) (var2)).board.field_v = var3Lifetime2;
                  }
                  ((GameSession) (var2)).board.markMovableCells(((GameSession) (var2)).animator.field_h, ((GameSession) (var2)).board.currentPlayer, (byte) 14);
                  ((GameSession) (var2)).turnTimer = var5 - 50;
                  if (1 <= ((GameSession) (var2)).turnTimer) {
                    continue;
                  }
                  ((GameSession) (var2)).turnTimer = 1;
                  continue;
                }
                if (PasswordConfirmationValidator.field_q == 61) {
                  var3Lifetime2Lifetime1 = ProgressMessageDialog.field_qb.readUnsignedByte(param0 ^ 11132);
                  var4_intLifetime2 = ProgressMessageDialog.field_qb.readUnsignedByte(param0 + 11132);
                  var5Lifetime1 = ProgressMessageDialog.field_qb.readUnsignedByte(param0 ^ 11132);
                  var6 = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
                  var7 = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
                  ((GameSession) (var2)).board.applyMove(var6, var7, (byte) 119, var3Lifetime2Lifetime1, var4_intLifetime2, var5Lifetime1);
                  ((GameSession) (var2)).animator.syncWithBoard(((GameSession) (var2)).online, 31626);
                  ((GameSession) (var2)).animator.selectedColumn = -1;
                  ((GameSession) (var2)).field_D = false;
                  ((GameSession) (var2)).animator.selectedRow = -1;
                  continue;
                }
                if (PasswordConfirmationValidator.field_q == 62) {
                  var3Lifetime2Lifetime2 = ProgressMessageDialog.field_qb.readByte((byte) -72);
                  ((GameSession) (var2)).board.finishGame(-39, var3Lifetime2Lifetime2);
                  ((GameSession) (var2)).board.setEndReason((int) ProgressMessageDialog.field_qb.readByte((byte) -103), 2);
                  var4 = var2;
                  if (((GameSession) (var4)).localPlayer != -2) {
                    ((GameSession) (var4)).exitToScreen(false, -1, 22273, false);
                  }
                  ((GameSession) (var4)).field_n = 0;
                  continue;
                }
                if (PasswordConfirmationValidator.field_q == 63) {
                  ((GameSession) (var2)).board.field_D = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
                  if (null == DropTargetWidget.field_I) {
                    continue;
                  }
                  DrawOfferMenuHelpers.updateDrawOfferMenuLabel(false);
                  continue;
                }
                if (64 == PasswordConfirmationValidator.field_q) {
                  ((GameSession) (var2)).board.field_r = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
                  continue;
                }
                if (PasswordConfirmationValidator.field_q == 65) {
                  ((GameSession) (var2)).board.field_b = ProgressMessageDialog.field_qb.readUnsignedByte(param0 ^ 11132);
                  if (null == DropTargetWidget.field_I) {
                    continue;
                  }
                  NameEntryPopup.updateRematchMenuLabel(1);
                  continue;
                }
                if (66 == PasswordConfirmationValidator.field_q) {
                  ((GameSession) (var2)).field_v = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
                  if (null == DropTargetWidget.field_I) {
                    continue;
                  }
                  NameEntryPopup.updateRematchMenuLabel(1);
                  continue;
                }
              }
              this.dispatchServerPacket(-108);
              continue;
            }
            TriangleMesh.commitScreenChange((byte) -86);
            var2_intLifetime1Lifetime2 = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
            var3Lifetime3 = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
            stackIn_99_0 = (ProgressMessageDialog.field_qb.readUnsignedByte(11132) == 0) ? 0 : 1;
            var4_intLifetime1 = stackIn_99_0;
            var5_ref_String__ = new String[2];
            for (var7Lifetime1 = 0; var5_ref_String__.length > var7Lifetime1; var7Lifetime1++) {
              var5_ref_String__[var7Lifetime1] = ProgressMessageDialog.field_qb.readZeroPrefixedString(15070);
            }
            var6Lifetime1 = -2;
            var6Lifetime2 = ProgressMessageDialog.field_qb.readByte((byte) 62);
            var6Lifetime2 = var6Lifetime2 - (var6Lifetime2 >>> 31);
            var7_ref_ic = new GameSession(true, var2_intLifetime1Lifetime2, var5_ref_String__, var6Lifetime2, var4_intLifetime1 != 0, var3Lifetime3, 0);
            var7_ref_ic.board.readCells(ProgressMessageDialog.field_qb, (byte) 57);
            var7_ref_ic.animator.resetToBoard(false);
            if (PasswordConfirmationValidator.field_q != 57) {
              MusicPlaybackHelpers.field_b = var7_ref_ic;
              LoginRsaKey.field_d = true;
              var8 = var7_ref_ic.board.playerNames[0];
              var9 = var7_ref_ic.board.playerNames[1];
              var14 = MenuScreen.formatIndexedText(new String[]{var8, var9}, AudioPumpThread.textPlayers, 2);
              ArrayWidgetContainer.addChatMessage(DebouncedValidator.field_d, 0, false, var14, 1, var7_ref_ic.board.playerNames[0]);
            } else {
              DecodedSpriteHelpers.field_a = true;
              DropTargetWidget.field_I = var7_ref_ic;
              if (var7_ref_ic.field_t) {
                var8 = var7_ref_ic.board.playerNames[0];
                var9_int = 0;
                while (PacketBuffer.isLocalPlayerName(var8, true)) {
                  var9_int++;
                  var8 = var7_ref_ic.board.playerNames[var9_int];
                }
                var12 = MenuScreen.formatIndexedText(new String[]{var8}, SpriteLoadHelpers.textOpponent, 2);
                ArrayWidgetContainer.addChatMessage(DebouncedValidator.field_d, 0, false, var12, 1, var7_ref_ic.board.playerNames[0]);
              }
              array$1 = new String[1];
              stackIn_112_0 = array$1;
              stackIn_112_1 = array$1;
              stackIn_112_2 = 0;
              if (var6Lifetime2 != 0) {
                stackIn_113_3 = TextHotspot.textColourWhite;
              } else {
                stackIn_113_3 = GameApplet.textColourBlue;
              }
              stackIn_112_1[stackIn_112_2] = stackIn_113_3;
              var13 = MenuScreen.formatIndexedText(stackIn_112_0, TriangleSortHelpers.textYourcolour, 2);
              ArrayWidgetContainer.addChatMessage(DebouncedValidator.field_d, 0, false, var13, 1, var7_ref_ic.board.playerNames[0]);
            }
            CheckboxPainter.setupNewGameScene(122);
            Js5Archive.field_e = false;
            SoundPlaybackHelpers.field_e = true;
            GameClock.field_c = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) (var2), "Virogrid.E(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.initializeApplet("virogrid", 15, (byte) 118);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "Virogrid.init()");
        }
    }

    private final int[] getSceneryModelTransform(byte param0, Model param1) {
        RuntimeException var3 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 61) {
            Virogrid.createDobResultReply(94, false);
          }
          stackIn_3_0 = ChatShortcutHelpers.field_c;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("Virogrid.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void renderHighDetailFrame(boolean param0) {
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_89_0 = 0;
        ModelMesh stackIn_113_0 = null;
        boolean stackIn_114_1 = false;
        ModelMesh stackIn_124_0 = null;
        boolean stackIn_125_1 = false;
        ModelMesh stackIn_130_0 = null;
        boolean stackIn_131_1 = false;
        ModelMesh stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        ModelMesh stackIn_143_0 = null;
        boolean stackIn_144_1 = false;
        ModelMesh stackIn_148_0 = null;
        boolean stackIn_149_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        double[] var11_ref_double__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        FallingParticle var16_ref = null;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        double[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        double[] var27 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var11Lifetime2;
        int var7Lifetime2Lifetime1;
        int var7Lifetime2Lifetime2;
        int var7Lifetime3Lifetime1;
        var16 = null;
        var17 = field_F ? 1 : 0;
        try {
          var2_int = param0 ? 1 : 0;
          if (MidiPcmStream.field_y == GameClock.field_c &&
            LobbySortHelpers.field_g == TextDecodeHelpers.field_g) {
            if (MidiPcmStream.field_y != -2) {
              AudioPumpThread.drawMenuScreen(MidiPcmStream.field_y, -1, true, TextDecodeHelpers.field_g, 0);
            } else {
              LabeledChildWidget.clearScreen(false, 25680);
              var2_int = 0;
            }
          } else {
            if (MidiPcmStream.field_y != -2) {
              if (GameClock.field_c != -2) {
                if (ClientEnvironmentHelpers.field_l >= 16) {
                  AudioPumpThread.drawMenuScreen(GameClock.field_c, 1 + (-ClientEnvironmentHelpers.field_l + 32), false, LobbySortHelpers.field_g, 0);
                } else {
                  AudioPumpThread.drawMenuScreen(MidiPcmStream.field_y, ClientEnvironmentHelpers.field_l + 1, false, TextDecodeHelpers.field_g, 0);
                }
              } else {
                if (ClientEnvironmentHelpers.field_l >= 16) {
                  var2_int = 0;
                  LabeledChildWidget.clearScreen(false, 25680);
                } else {
                  AudioPumpThread.drawMenuScreen(MidiPcmStream.field_y, -1, false, TextDecodeHelpers.field_g, 0);
                }
              }
            } else {
              if (ClientEnvironmentHelpers.field_l >= 16) {
                AudioPumpThread.drawMenuScreen(GameClock.field_c, -1, false, LobbySortHelpers.field_g, 0);
              } else {
                var2_int = 0;
                LabeledChildWidget.clearScreen(false, 25680);
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (var2_int != 0) {
            Rasterizer.fillRectangle(0, 0, 640, 480, 3158064);
            this.drawSpotlightProjections((byte) -62);
            SpriteLoadHelpers.renderPieceModelsToSprite(FullscreenErrorDialog.field_bb, (byte) -86);
            CameraProjectionMath.drawPerspectiveTexturedQuad(HotspotTextWidget.field_K, new double[]{-110.0, 26.0, -410.0}, new double[]{-1.0, 0.0, 0.0}, 64.0, 114.0, FullscreenErrorDialog.field_bb, 2621440, 10420224, 10485760, 26148864, WidgetNode.field_p.field_k);
            LobbyPlayerEntry.field_Qb.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
            var23 = new int[12];
            var18 = var23;
            var3 = var18;
            for (var4 = 0; var4 < 3; var4++) {
              var3[var4] = PlayingSound.field_j[var4] << 3;
            }
            for (var4Lifetime1 = 3; var4Lifetime1 < var23.length; var4Lifetime1++) {
              var3[var4Lifetime1] = PlayingSound.field_j[var4Lifetime1];
            }
            stackIn_36_0 = (!(SoundPlaybackHelpers.field_d[2] > 0.0)) ? 0 : 1;
            var4Lifetime2 = stackIn_36_0;
            stackIn_40_0 = (!(0.0 < SoundPlaybackHelpers.field_d[0])) ? 0 : 1;
            var5 = stackIn_40_0;
            if (!(72.0 < SoundPlaybackHelpers.field_d[0])) {
              stackIn_46_0 = (SoundPlaybackHelpers.field_d[0] < -72.0) ? 1 : 0;
            } else {
              stackIn_46_0 = 1;
            }
            var6 = stackIn_46_0;
            if (ClientEnvironmentHelpers.field_c.field_F != this.field_E ||
              QueuedResultSubmission.field_k[0] != SoundPlaybackHelpers.field_d[0] ||
              SoundPlaybackHelpers.field_d[1] != QueuedResultSubmission.field_k[1] ||
              SoundPlaybackHelpers.field_d[2] != QueuedResultSubmission.field_k[2]) {
              this.field_E = ClientEnvironmentHelpers.field_c.field_F;
              QueuedResultSubmission.field_k[1] = SoundPlaybackHelpers.field_d[1];
              QueuedResultSubmission.field_k[2] = SoundPlaybackHelpers.field_d[2];
              QueuedResultSubmission.field_k[0] = SoundPlaybackHelpers.field_d[0];
              ArchiveLoadSequence.saveRasterState(118);
              TextMetricsGlobals.field_l.makeRasterTarget();
              Rasterizer.fillRectangle(0, 0, 640, 480, 0);
              AsyncCheckResult.field_c.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              ArchiveRequest.field_x.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              DualLinkHashTable.field_c.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              LogoRenderHelpers.field_k.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              ArchiveProvider.field_c.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              RasterBuffer.field_j.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              FallingParticle.field_s.drawTransformed(PlayingSound.field_j, ChatShortcutHelpers.field_c);
              if (var4Lifetime2 == 0) {
                QuickChatPhraseDefinition.field_y.drawTransformed(var23, this.field_J);
                RenderTargetHelpers.field_a.drawTransformed(var23, this.field_H);
                if (var5 == 0) {
                  if (var6 == 0) {
                    RasterSnapshot.field_h.drawTransformed(var23, this.field_M);
                  }
                  SoundCache.field_i.drawTransformed(var23, this.field_G);
                } else {
                  if (var6 == 0) {
                    SoundCache.field_i.drawTransformed(var23, this.field_G);
                  }
                  RasterSnapshot.field_h.drawTransformed(var23, this.field_M);
                }
              } else {
                GuestPlayHelpers.field_a.drawTransformed(var23, this.field_K);
                BoundedUrlRequest.field_l.drawTransformed(var23, this.field_J);
                if (var5 == 0) {
                  if (var6 == 0) {
                    BirthDateEntryPanel.field_L.drawTransformed(var23, this.field_D);
                  }
                  MusicPatch.field_o.drawTransformed(var23, this.field_B);
                } else {
                  if (var6 == 0) {
                    MusicPatch.field_o.drawTransformed(var23, this.field_B);
                  }
                  BirthDateEntryPanel.field_L.drawTransformed(var23, this.field_D);
                }
              }
              if (var4Lifetime2 == 0) {
                CanvasPresentHelpers.field_i.drawTransformed(var23, this.field_L);
              } else {
                PendingHighscoreRequest.field_x.drawTransformed(var23, this.field_N);
              }
              LoginCredentialType.popRasterState((byte) 116);
            }
            TextMetricsGlobals.field_l.drawTransparent(0, 0);
            var7 = UiTheme.field_r % 64;
            if (32 > var7) {
              stackIn_80_0 = -16 + var7;
            } else {
              stackIn_80_0 = -var7 + 48;
            }
            var7Lifetime1 = stackIn_80_0;
            var7Lifetime1 = var7Lifetime1 << 2;
            if (WidgetNode.field_p.field_d) {
              var7Lifetime1 = 0;
            }
            var26 = new int[3];
            var21 = var26;
            var8 = var21;
            var24 = new int[3];
            var19 = var24;
            var9 = var19;
            var25 = new int[3];
            var20 = var25;
            var10 = var20;
            var8[0] = (int)ScrollPaneWithFooter.field_Hb << 4;
            var24[0] = 800;
            var8[1] = -(int)ScrollPaneWithFooter.field_Hb << 4;
            var25[0] = var7Lifetime1;
            var24[1] = 800;
            var26[2] = 0;
            var25[1] = var7Lifetime1;
            var24[2] = 1280;
            var25[2] = 0;
            CameraProjectionMath.transformTriangleToCamera(PlayingSound.field_j, var26, var24, var25);
            if (WidgetNode.field_p.field_m) {
              var11 = UiTheme.field_r % 128;
              if (var11 < 64) {
                stackIn_89_0 = var11;
              } else {
                stackIn_89_0 = -var11 + 128;
              }
              var11Lifetime2 = stackIn_89_0;
              var12 = 38784 + var11Lifetime2 * 2;
              ClippedTriangleRenderer.drawTriangle(240, 0, 0, var26, var24, var25, var12, var12, var12);
              var7Lifetime2 = var26[0];
              var8[0] = var26[1];
              var26[1] = var7Lifetime2;
              var7Lifetime2Lifetime1 = var24[0];
              var9[0] = var24[1];
              var24[1] = var7Lifetime2Lifetime1;
              var7Lifetime2Lifetime2 = var25[0];
              var10[0] = var25[1];
              var25[1] = var7Lifetime2Lifetime2;
              ClippedTriangleRenderer.drawTriangle(240, 0, 0, var26, var24, var25, var12, var12, var12);
            }
            if (!WidgetNode.field_p.field_d) {
              System.out.println("Warning, drawing non-single plane");
            } else {
              if (0.0 > HotspotTextWidget.field_K[11]) {
                var27 = new double[QuickChatPhraseRegistry.field_g.length];
                var22 = var27;
                var11_ref_double__ = var22;
                for (var12Lifetime1 = 0; var12Lifetime1 < var27.length; var12Lifetime1++) {
                  var11_ref_double__[var12Lifetime1] = -QuickChatPhraseRegistry.field_g[var12Lifetime1];
                }
                CameraProjectionMath.drawPerspectiveTexturedQuad(HotspotTextWidget.field_K, new double[]{0.0, 0.0, 0.0}, var11_ref_double__, (double)ScrollPaneWithFooter.field_Hb, (double)ClientEnvironmentHelpers.field_k, DisplayNameHelpers.field_d, 7208960, 34668544, 0, 26148864, WidgetNode.field_p.field_k);
              } else {
                CameraProjectionMath.drawPerspectiveTexturedQuad(HotspotTextWidget.field_K, new double[]{0.0, 0.0, 0.0}, QuickChatPhraseRegistry.field_g, (double)ScrollPaneWithFooter.field_Hb, (double)ClientEnvironmentHelpers.field_k, DisplayNameHelpers.field_d, 7208960, 34668544, 0, 26148864, WidgetNode.field_p.field_k);
              }
              if (WidgetNode.field_p.field_f > 0) {
                CameraProjectionMath.drawGlowingQuadOutline(HotspotTextWidget.field_K, new double[]{0.0, 0.0, 0.0}, QuickChatPhraseRegistry.field_g, (double)ScrollPaneWithFooter.field_Hb, (double)ClientEnvironmentHelpers.field_k, RenderTargetHelpers.field_d, 40, WidgetNode.field_p.field_f);
              }
            }
            var16_ref = (FallingParticle) (ProgressMessageDialog.field_tb.first((byte) -61));
            while (var16_ref != null) {
              var11Lifetime1 = -(PlayingSound.field_j[0] << 6) + (var16_ref.field_n >> 8);
              var7Lifetime3 = -(PlayingSound.field_j[2] << 6) + (var16_ref.field_m >> 8);
              var12Lifetime2 = -(PlayingSound.field_j[1] << 6) + (var16_ref.field_p >> 8);
              var13 = PlayingSound.field_j[5] * var7Lifetime3 + var12Lifetime2 * PlayingSound.field_j[4] + var11Lifetime1 * PlayingSound.field_j[3];
              var15 = var7Lifetime3 * PlayingSound.field_j[11] + (var12Lifetime2 * PlayingSound.field_j[10] + var11Lifetime1 * PlayingSound.field_j[9]);
              var14 = var7Lifetime3 * PlayingSound.field_j[8] + var12Lifetime2 * PlayingSound.field_j[7] + PlayingSound.field_j[6] * var11Lifetime1;
              var7Lifetime3Lifetime1 = var15 >> 22;
              if (var15 > 0) {
                Rasterizer.fillRadialPaletteCircle((NodeHashTableIterator.field_b << 4) + (var13 >> 9) / var7Lifetime3Lifetime1, (var14 >> 9) / var7Lifetime3Lifetime1 + (QueuedListRequest.field_g << 4), 16384 / var7Lifetime3Lifetime1, var16_ref.field_o * 5 / 3, RenderTargetHelpers.field_d);
              }
              var16_ref = (FallingParticle) (ProgressMessageDialog.field_tb.next(16213));
            }
            if (var4Lifetime2 == 0) {
              stackIn_113_0 = GuestPlayHelpers.field_a;
              stackIn_114_1 = !(param0);
              ArchiveIndex.drawModel(stackIn_113_0, stackIn_114_1, var23, this.field_K);
              ArchiveIndex.drawModel(BoundedUrlRequest.field_l, false, var23, this.field_C);
              if (var5 == 0) {
                ArchiveIndex.drawModel(MusicPatch.field_o, false, var23, this.field_B);
                if (var6 != 0) {
                  ArchiveIndex.drawModel(RasterSnapshot.field_h, false, var23, this.field_M);
                }
                ArchiveIndex.drawModel(BirthDateEntryPanel.field_L, false, var23, this.field_D);
              } else {
                ArchiveIndex.drawModel(BirthDateEntryPanel.field_L, false, var23, this.field_D);
                if (var6 != 0) {
                  ArchiveIndex.drawModel(SoundCache.field_i, false, var23, this.field_G);
                }
                ArchiveIndex.drawModel(MusicPatch.field_o, false, var23, this.field_B);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_124_0 = QuickChatPhraseDefinition.field_y;
              stackIn_125_1 = !(param0);
              ArchiveIndex.drawModel(stackIn_124_0, stackIn_125_1, var23, this.field_J);
              ArchiveIndex.drawModel(RenderTargetHelpers.field_a, false, var23, this.field_H);
              if (var5 == 0) {
                ArchiveIndex.drawModel(SoundCache.field_i, false, var23, this.field_G);
                if (var6 != 0) {
                  stackIn_130_0 = BirthDateEntryPanel.field_L;
                  stackIn_131_1 = !(param0);
                  ArchiveIndex.drawModel(stackIn_130_0, stackIn_131_1, var23, this.field_D);
                }
                ArchiveIndex.drawModel(RasterSnapshot.field_h, false, var23, this.field_M);
              } else {
                stackIn_136_0 = RasterSnapshot.field_h;
                stackIn_137_1 = !(param0);
                ArchiveIndex.drawModel(stackIn_136_0, stackIn_137_1, var23, this.field_M);
                if (var6 != 0) {
                  stackIn_143_0 = MusicPatch.field_o;
                  stackIn_144_1 = !(param0);
                  ArchiveIndex.drawModel(stackIn_143_0, stackIn_144_1, var23, this.field_B);
                }
                stackIn_148_0 = SoundCache.field_i;
                stackIn_149_1 = !(param0);
                ArchiveIndex.drawModel(stackIn_148_0, stackIn_149_1, var23, this.field_G);
              }
            }
          }
          if (MidiPcmStream.field_y == 10 &&
            GameClock.field_c == 10) {
            BackgroundParticle.drawBootSequenceText((byte) 105);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "Virogrid.UA(" + param0 + ')');
        }
    }

    private final void updateScreens(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_106_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        var7 = field_F ? 1 : 0;
        try {
          if (param0) {
            return;
          }
          if (TextButton.field_x == 0) {
            boolean decompiledFrameRemainder0 = true;
            var3_int = 0;
            var4 = 0;
            if (!param1) {
              if (MidiPcmStream.field_y == GameClock.field_c &&
                LobbySortHelpers.field_g == TextDecodeHelpers.field_g) {
                if (MidiPcmStream.field_y != -1) {
                  if (MidiPcmStream.field_y == -2) {
                    var3_int = 1;
                  } else {
                    if (!(!NanoTickClock.isNonNegative(107, MidiPcmStream.field_y))) {
                      DateOfBirthValidator.field_j[MidiPcmStream.field_y].handleInput((byte) -79);
                    }
                  }
                } else {
                  if (TextWidgetPainter.field_a) {
                    var3_int = 1;
                    var4 = 1;
                  } else {
                    DropTargetWidget.field_I.tick(-104, true);
                    while (GrowableIntList.pollKeyEvent((byte) -107)) {
                      DropTargetWidget.field_I.handleEscapeKey(117);
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                ClientEnvironmentHelpers.field_l = ClientEnvironmentHelpers.field_l + 1;
                if (ClientEnvironmentHelpers.field_l == 32) {
                  TriangleMesh.commitScreenChange((byte) -86);
                }
              }
            }
            if (TextWidgetPainter.field_a &&
              !TextFieldValidator.field_k &&
              !Js5Archive.field_e) {
              ByteArrayPool.updateLobbyAndFlushRequests(var3_int != 0, (byte) -120);
              if (LoginRsaKey.field_d) {
                MusicPlaybackHelpers.field_b.tick(-103, var4 != 0);
              }
              if (DecodedSpriteHelpers.field_a) {
                DropTargetWidget.field_I.tick(-111, var4 != 0);
              }
              while (GrowableIntList.pollKeyEvent((byte) -111)) {
                if (DiskArchiveRequest.field_B) {
                  NodeHashTable.handleEscapeForOverlays(15, (byte) 104, 12, 13);
                }
                if (LoginRsaKey.field_d) {
                  MusicPlaybackHelpers.field_b.handleEscapeKey(-114);
                }
                if (!DecodedSpriteHelpers.field_a) {
                  continue;
                }
                DropTargetWidget.field_I.handleEscapeKey(-20);
              }
            }
            if (!TextWidgetPainter.field_a) {
              NanoTickClock.updateLobbyTransitions(1);
            }
            var5 = ClientEnvironmentHelpers.field_c.field_F;
            if (DiskArchiveRequest.field_B &&
              TextWidgetPainter.field_a) {
              stackIn_91_0 = RankingsRequest.field_r;
            } else {
              stackIn_91_0 = 481;
            }
            var6 = stackIn_91_0;
            MenuInputState.field_g = MenuInputState.field_g + (-MenuInputState.field_g + (float)var6) * 0.10000000149011612f;
            if ((int)((double)MenuInputState.field_g + 0.5) != var5) {
              WeightedLruCache.drawRootWidget(-118, (int)MenuInputState.field_g);
              LobbyLayout.setViewportOrigin(320, ((int)(MenuInputState.field_g * 4.0f) + 240) / 9, -2);
            }
            if (null != this.field_I.first((byte) -102)) {
              fieldTemp$0 = this.field_A + 1;
              this.field_A = this.field_A + 1;
              if (fieldTemp$0 == 335) {
                this.field_A = 0;
                this.field_I.removeFirst(-29889);
              }
            }
            if (!param1) {
              ViewportController.updateGameScreen(param0);
            }
          } else {
            if (TextButton.field_x == 1) {
              EditableTextWidget.field_K = EditableTextWidget.field_K + 1;
              if (EditableTextWidget.field_K == 16) {
                if (!PasswordFieldPainter.field_D) {
                  InputDetachHelpers.returnToLoginStage(8192);
                } else {
                  PendingRequest.openLoginPanelAtStage(0);
                }
                TextButton.field_x = 2;
              }
            } else {
              if (2 != TextButton.field_x) {
                EditableTextWidget.field_K = EditableTextWidget.field_K - 1;
                if (EditableTextWidget.field_K == 0) {
                  TextButton.field_x = 0;
                }
              } else {
                if (!VerticalScrollbar.isGuestSession(20)) {
                  GameClock.field_c = MouseTrailPoint.field_k;
                  MidiNote.setGameViewFlag(param0);
                  if (PasswordFieldPainter.field_D) {
                    PasswordFieldPainter.field_D = false;
                    GameSession.applyLobbyTheme(MusicVolumeAndOverlayHelpers.frameSprites, ReflectionCheckHelpers.standardFont.field_A, 320, MusicVolumeAndOverlayHelpers.frameSprites, 8, PopupInputHelpers.menuFont, 2, ReflectionCheckHelpers.standardFont.field_G + ReflectionCheckHelpers.standardFont.field_A, 8, -16824, false, 240);
                  }
                  if (DelayedPacket.field_n) {
                    var3_int = LoginMethodHelpers.field_e;
                    if (0 == GameClock.field_c ||
                      MidiPcmStream.field_y == 2 ||
                      MidiPcmStream.field_y == 3 ||
                      4 == GameClock.field_c ||
                      GameClock.field_c == 5) {
                      var3_int = GameClock.field_c;
                    }
                    MarkerSlider.changeScreen(-2, var3_int, false, -4);
                  }
                  if (NanoTickClock.isNonNegative(86, GameClock.field_c)) {
                    TriangleMesh.commitScreenChange((byte) -86);
                  }
                }
                TextButton.field_x = 3;
              }
            }
          }
          if (-3 == GameClock.field_c) {
            var8 = new String[]{ContentTransitionDialog.playernameHotseat1, TooltipAndOptionsHelpers.playernameHotseat2};
            DropTargetWidget.field_I = new GameSession(false, MusicCrossfadeStream.field_y, var8, 0, false, TextJoinHelpers.field_b, DraggableWidget.field_I);
            CheckboxPainter.setupNewGameScene(101);
            stackIn_106_0 = (!SocketJs5Transport.field_x) ? 0 : 1;
            var4Lifetime1 = stackIn_106_0;
            MarkerSlider.changeScreen(-2, 0, var4Lifetime1 != 0, -1);
            SoundPlaybackHelpers.field_e = true;
          }
          if (GameClock.field_c == -4) {
            IterableNodeHashTable.field_g.writeCipheredOpcode(9, 8);
            TextFieldValidator.field_k = true;
            GameClock.field_c = MidiPcmStream.field_y;
          }
          if (-5 == GameClock.field_c) {
            ChatSettingsHelpers.sendShortRequest(AudioSetupHelpers.field_d.getGameId((byte) -124), 11, (byte) -120);
            Js5Archive.field_e = true;
            GameClock.field_c = MidiPcmStream.field_y;
          }
          QuickChatMenu.updateCameraTransition((byte) -75);
          if (Bzip2State.hasFeatureBit((byte) 13, 0)) {
            if (DropTargetWidget.field_I != null &&
              DropTargetWidget.field_I.online &&
              DropTargetWidget.field_I.field_t &&
              DropTargetWidget.field_I.board.turnCount > ProgressMessageDialog.randomInt(4712, 40000) &&
              !DropTargetWidget.field_I.field_l) {
              DropTargetWidget.field_I.field_l = true;
              AchievementNotice.field_h = UiTheme.field_c;
              LoginPanel.field_G = DisplayNameHelpers.field_a;
            }
            if (AchievementNotice.field_h <= 0) {
              var3_intLifetime1 = 1 + DisplayNameHelpers.field_a;
              if (LoginPanel.field_G < var3_intLifetime1) {
                LoginPanel.field_G = 0;
              } else {
                CachedTextLayout.setMusicVolume(var3_intLifetime1, 0);
              }
            } else {
              AchievementNotice.field_h = AchievementNotice.field_h - 1;
              var3_intLifetime1 = DisplayNameHelpers.field_a - 4;
              if (var3_intLifetime1 < 0) {
                var3_intLifetime1 = 0;
              }
              CachedTextLayout.setMusicVolume(var3_intLifetime1, 0);
              if (0 == ProgressMessageDialog.randomInt(4712, 20)) {
                ChecksumHelpers.playSampleAtVolume(ProgressMessageDialog.randomInt(4712, 256), PlayerContextMenu.field_f[ProgressMessageDialog.randomInt(4712, 3)], -629134904, 96);
              }
            }
          } else {
            if (ProgressMessageDialog.randomInt(4712, 1000) == 0) {
              ArchiveBytesHelpers.playSound(PlayerContextMenu.field_f[ProgressMessageDialog.randomInt(4712, 3)], 100, 24);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "Virogrid.FB(" + param0 + ',' + param1 + ')');
        }
    }

    private final Sprite createRadialGlowSprite(int param0, int param1, int param2) {
        int var5 = 0;
        Sprite var4 = null;
        int var6 = 0;
        Sprite stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = field_F ? 1 : 0;
        try {
          var4 = new Sprite(57, 57);
          RenderTargetHelpers.setRenderTargetSprite(var4, 256);
          Rasterizer.fillCircle(29, 29, 27, 263172);
          for (var5 = 23; var5 >= 0; var5--) {
            Rasterizer.fillCircle(29, 29, var5, param2 + var5 * param0);
          }
          LoginCredentialType.popRasterState((byte) 93);
          if (param1 != -9105) {
            this.renderHighDetailFrame(true);
          }
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var4_ref), "Virogrid.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void loadFinalFrame(Js5Archive param0, byte param1) {
        RuntimeException runtimeException = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new Sprite(param0.getFileByName("final_frame.jpg", 100, ""), (java.awt.Component) ((Object) UiWidget.field_v));
          var3 = var2.field_w;
          var4 = var2.field_p;
          AudioPumpThread.pushRasterState(0);
          var5 = 120 / ((33 - param1) / 33);
          GrowableIntList.field_d = new Sprite(var3, 3 * var4 / 4);
          GrowableIntList.field_d.makeRasterTarget();
          var2.drawOpaque(0, 0);
          InputDetachHelpers.field_c = new Sprite(var3, -GrowableIntList.field_d.field_p + var4);
          InputDetachHelpers.field_c.makeRasterTarget();
          var2.drawOpaque(0, -GrowableIntList.field_d.field_p);
          InputDetachHelpers.field_c.field_x = GrowableIntList.field_d.field_p;
          ContextMenuHelpers.popRasterTarget(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("Virogrid.CB(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void openArchives(int param0) {
        try {
          if (null != ConditionalTextValue.field_e) {
            PasswordFieldPainter.loadLocalizedText(20, ConditionalTextValue.field_e);
            ConditionalTextValue.field_e = null;
            DiskCacheWorker.resetFrameTimingHistory(-52);
          }
          IntKeyLookup.field_h = IntrusiveDeque.createArchive(83, 3);
          QuickChatMenu.field_Fb = IntrusiveDeque.createArchive(117, 5);
          ChatAndIgnoreHelpers.field_a = IntrusiveDeque.createArchive(98, 6);
          RenderTargetHelpers.field_c = IntrusiveDeque.createArchive(89, 7);
          DialogMessagePane.field_O = IntrusiveDeque.createArchive(param0 ^ 35, 8);
          BufferedSocket.field_d = IntrusiveDeque.createArchive(64, 9);
          TriangleMesh.field_w = IntrusiveDeque.createArchive(97, 10);
          MidiNote.field_i = IntrusiveDeque.createArchive(33, 11);
          CheckboxButton.field_G = IntrusiveDeque.createArchive(param0 ^ 51, 12);
          ValidationMessageWidget.field_T = IntrusiveDeque.createArchive(81, param0);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "Virogrid.AB(" + param0 + ')');
        }
    }

    final void shutdownClientServices(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -80) {
            this.field_L = (int[]) null;
          }
          DateOfBirthValidator.shutdownAudioPlayers(100);
          if (null != FullscreenState.field_b) {
            FullscreenSupport.exitFullscreen((byte) -16);
          }
          DraggableWidget.shutdownSession(13633);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "Virogrid.C(" + param0 + ')');
        }
    }

    final void shutdown(int param0) {
        int var3 = field_F ? 1 : 0;
        try {
          Virogrid.releaseStatics(240);
          AchievementNotice.releaseStatics(17);
          IntrusiveNode.releaseStatics(-6325);
          IntrusiveDeque.releaseStatics(param0 - 32);
          ViewModeNoticeGlobals.releaseStatics((byte) -94);
          RankingArraySupport.releaseStatics((byte) -99);
          NamedTextResourceHelpers.releaseStatics(param0 ^ 57);
          NameCharacterHelpers.releaseStatics((byte) -118);
          RasterEffectHelpers.releaseStatics(-97);
          GameKeyHandler.releaseStatics((byte) -110);
          OverlayDrawHelpers.releaseStatics(-65);
          TextDecodeHelpers.releaseStatics(-28637);
          MathAndCookieHelpers.releaseStatics(param0 ^ -8518);
          TooltipAndOptionsHelpers.releaseStatics(-85);
          NetworkGameClient.releaseStatics(false);
          ClientException.releaseStatics(param0 ^ 64);
          GameApplet.releaseStatics(param0 - 6490);
          BoundedUrlRequest.releaseStatics(param0 + 74);
          MouseInputHandler.releaseStatics(param0 + 0);
          MouseWheelInput.releaseStatics(3981);
          Rasterizer.releaseStatics();
          Js5Archive.releaseStatics((byte) -104);
          BitmapFont.releaseStatics();
          TextEncodingHelpers.releaseStatics(4472);
          PacketBuffer.releaseStatics((byte) 110);
          ClockAndTextHelpers.releaseStatics(true);
          LobbyJoinTextGlobals.releaseStatics((byte) 79);
          WidgetFactoryHelpers.releaseStatics((byte) -13);
          SoundPlaybackHelpers.releaseStatics((byte) -106);
          BitwiseHelpers.releaseStatics(true);
          CanvasPresentHelpers.releaseStatics(6666);
          ChatPanelSetupHelpers.releaseStatics(122);
          SpriteLoadHelpers.releaseStatics(-30114);
          FullscreenState.releaseStatics(81);
          ChatMessage.releaseStatics(-99);
          PopupMenuHelpers.releaseStatics(26523);
          GameClock.releaseStatics(param0 ^ -126);
          RasterBuffer.releaseStatics(param0 ^ -28608);
          ArchiveLoadSequence.releaseStatics((byte) 9);
          FullscreenFocusCanvas.releaseStatics(true);
          ViewportController.releaseStatics((byte) 112);
          SoundCache.releaseStatics(28275);
          Js5Transport.releaseStatics(-124);
          DiskCacheWorker.releaseStatics(-851125662);
          Js5ArchiveManager.releaseStatics(param0 + 79);
          BufferedFile.releaseStatics(false);
          BufferedSocket.releaseStatics(-127);
          MenuScreen.releaseStatics(122);
          GameSession.releaseStatics(23320);
          LobbyGameListHelpers.releaseStatics(param0 ^ -29216);
          ModelMesh.releaseStatics();
          Model.releaseStatics();
          GameBoard.releaseStatics(98);
          GuestPlayHelpers.releaseStatics((byte) 119);
          SpriteState.releaseStatics(0);
          DualLinkNode.releaseStatics(true);
          LoginMethodHelpers.releaseStatics(95);
          MenuInputState.releaseStatics(param0 + 31);
          WidgetNode.releaseStatics(-51);
          FrameSkin.releaseStatics(0);
          ChatFilterHelpers.releaseStatics((byte) 113);
          IndexedSpriteState.releaseStatics((byte) -115);
          MusicVolumeAndOverlayHelpers.releaseStatics(-60);
          GameEntryHelpers.releaseStatics(1000);
          ClientEnvironmentHelpers.releaseStatics((byte) -104);
          ArchiveBytesHelpers.releaseStatics((byte) -103);
          IconLabelWidget.releaseStatics(0);
          VerticalScrollbar.releaseStatics(124);
          SpriteWidget.releaseStatics(param0 + 2147483647);
          ContextMenu.releaseStatics(param0 ^ -91);
          ScrollPaneWithFooter.releaseStatics(-119);
          PlayerContextMenu.releaseStatics(false);
          ScrollPane.releaseStatics(0);
          ReportAbuseDialog.releaseStatics(param0);
          LobbyPlayerEntry.releaseStatics((byte) 10);
          TextMeasureHelpers.releaseStatics((byte) 26);
          CredentialHelpers.releaseStatics((byte) -120);
          RenderTargetHelpers.releaseStatics(false);
          SessionSeedHelpers.releaseStatics(param0 + 0);
          IconTextComponent.releaseStatics(false);
          LobbyLayout.releaseStatics(param0 + 0);
          LobbyGame.releaseStatics(7);
          TriangleRasterizer.releaseStatics();
          TextureCache.releaseStatics(false);
          TextJoinHelpers.releaseStatics((byte) -64);
          LobbySortHelpers.releaseStatics(param0 + 8192);
          InputSetupHelpers.releaseStatics(-1);
          MidiPcmStream.releaseStatics((byte) -78);
          NodeHashTable.releaseStatics(true);
          MidiNote.releaseStatics(79);
          MidiFileReader.releaseStatics();
          MusicVoiceMixer.releaseStatics(true);
          AudioOutput.releaseStatics();
          MusicCrossfadeStream.releaseStatics(param0 ^ -55);
          GameOptionHelpers.releaseStatics(-3);
          DualLinkHashTable.releaseStatics(-1);
          UiLayerInputHelpers.releaseStatics((byte) 17);
          DrawQueueGlobals.releaseStatics(-74);
          ArchiveIndex.releaseStatics((byte) 121);
          GzipDecompressor.releaseStatics(true);
          ArchiveProvider.releaseStatics(14);
          CameraAndLogoHelpers.releaseStatics(10061);
          EmailDomainValidationHelpers.releaseStatics(false);
          WidgetLayerStack.releaseStatics(-202);
          RegistrationRequestDialog.releaseStatics((byte) -22);
          LoadingProgressDialog.releaseStatics((byte) 108);
          LoginDialog.releaseStatics(false);
          ProgressMessageDialog.releaseStatics(true);
          AccountCreationForm.releaseStatics(8246);
          AccountChoicePanel.releaseStatics(15354);
          LoginPanel.releaseStatics((byte) 15);
          ConditionalTextValue.releaseStatics(false);
          UiTheme.releaseStatics((byte) 24);
          RequestResendSupport.releaseStatics((byte) 67);
          LogoIntroHelpers.releaseStatics(-77);
          HuffmanCodec.releaseStatics((byte) 6);
          ChatPanelUpdateHelpers.releaseStatics(-95);
          PopupMenuDrawHelpers.releaseStatics(25651);
          LobbyControlHelpers.releaseStatics((byte) 110);
          SharedTextGlobals.releaseStatics(param0 ^ -122);
          StatusAndUrlHelpers.releaseStatics(false);
          LoginCredentialType.releaseStatics((byte) -96);
          LoginCredentials.releaseStatics((byte) 122);
          CipherPacketBuffer.releaseStatics((byte) 103);
          IsaacRandom.releaseStatics(false);
          DecodedSpriteHelpers.releaseStatics((byte) -58);
          CellAnimator.releaseStatics(-314);
          ViewControlStrings.releaseStatics(44);
          BirthDateEntryPanel.releaseStatics(-16349);
          ArchiveFactoryHelpers.releaseStatics(-91);
          HelpPopup.releaseStatics((byte) 56);
          LoadingTextGlobals.releaseStatics((byte) -52);
          ClippedTriangleRenderer.releaseStatics();
          StipplePatterns.releaseStatics();
          ChatSettingsHelpers.releaseStatics(53);
          ReflectionCheck.releaseStatics(param0 ^ 20391);
          BoundedRandomAccessFile.releaseStatics(-112);
          FullscreenSupport.releaseStatics((byte) 88);
          MusicPlaybackHelpers.releaseStatics(-59);
          LobbyAndTextHelpers.releaseStatics(7);
          AudioPumpThread.releaseStatics((byte) -94);
          SocketJs5Transport.releaseStatics(true);
          DualLinkDeque.releaseStatics(2);
          NetworkArchiveRequest.releaseStatics(-121);
          SectorCacheStore.releaseStatics(param0 + 3);
          DiskArchiveRequest.releaseStatics(false);
          CachedArchiveSource.releaseStatics((byte) -127);
          DisplayNameHelpers.releaseStatics(false);
          ArchiveRequest.releaseStatics(-30419);
          TriangleSortHelpers.releaseStatics(-24750);
          FullscreenErrorDialog.releaseStatics(-16);
          TextWidgetPainter.releaseStatics(false);
          VorbisSample.releaseStatics();
          QuickChatOpenHelpers.releaseStatics(0);
          TriangleMesh.releaseStatics(0);
          AccountCreationSupport.releaseStatics(99);
          DrawOfferMenuHelpers.releaseStatics(0);
          MouseHandlerSupport.releaseStatics(false);
          LoadingProgressHelpers.releaseStatics(param0 - 1);
          CommonUiHelpers.releaseStatics(112);
          DelegatingCanvas.releaseStatics(25);
          ChatAndIgnoreHelpers.releaseStatics((byte) -108);
          IntKeyLookup.releaseStatics(46);
          ByteStorage.releaseStatics(param0 - 23862);
          Bzip2Decoder.releaseStatics();
          Bzip2State.releaseStatics(6);
          ByteArrayPool.releaseStatics((byte) -101);
          QuickChatHelpHelpers.releaseStatics(false);
          CheckboxPainter.releaseStatics(67);
          StatefulWidgetPainter.releaseStatics(120);
          DialWidgetPainter.releaseStatics((byte) -87);
          MarkerSliderPainter.releaseStatics(6);
          TextLayout.releaseStatics(0);
          UiWidget.releaseStatics(false);
          TextButton.releaseStatics((byte) -78);
          SingleChildWidget.releaseStatics(param0 - 3298);
          ResizableDialog.releaseStatics(-126);
          FadingModalPanel.releaseStatics(-1);
          WidgetContainer.releaseStatics(1);
          IntrusiveDequeCursor.releaseStatics(param0 ^ 0);
          BitCountAndDialogHelpers.releaseStatics((byte) 110);
          VorbisFloor.releaseStatics();
          UrlRewriteHelpers.releaseStatics(0);
          ClientServiceHelpers.releaseStatics((byte) 81);
          PacketRequestHelpers.releaseStatics(8342);
          PopupInputHelpers.releaseStatics(false);
          QuickChatMenu.releaseStatics((byte) -111);
          QuickChatCategoryCache.releaseStatics(param0 + 200);
          QuickChatPhraseRegistry.releaseStatics(param0 + 90);
          QuickChatCategory.releaseStatics((byte) -11);
          QuickChatPhraseDefinition.releaseStatics(-5);
          WeightedLruCache.releaseStatics(param0 + 1);
          SocketConnector.releaseStatics((byte) -38);
          ProxyAuthenticationRequiredException.releaseStatics((byte) 126);
          NanoTickClock.releaseStatics(-93);
          ImageProducerRasterBuffer.releaseStatics((byte) 104);
          DigestHelpers.releaseStatics(-97);
          DisplayModeInfo.releaseStatics(0);
          SynthInstrument.releaseStatics();
          PatchNoteUsage.releaseStatics(-2);
          WhirlpoolDigest.releaseStatics((byte) -54);
          ReflectionCheckHelpers.releaseStatics(3881);
          TabbedPanel.releaseStatics((byte) -73);
          NameEntryPopup.releaseStatics(32498);
          AccountDialogHelpers.releaseStatics(72);
          MusicPatch.releaseStatics(param0 - 24021);
          MusicPatchEnvelope.releaseStatics(true);
          LabeledChildWidget.releaseStatics(2);
          ValidatedTextWidget.releaseStatics(-1);
          EditableTextWidget.releaseStatics((byte) 39);
          ContentTransitionDialog.releaseStatics((byte) 126);
          StripedProgressBar.releaseStatics((byte) 41);
          HotspotTextWidget.releaseStatics(35);
          ValidationIndicator.releaseStatics(-116);
          ValidationMessageWidget.releaseStatics(false);
          CheckboxButton.releaseStatics(true);
          TextFieldValidator.releaseStatics((byte) -36);
          LobbySessionHelpers.releaseStatics((byte) 97);
          AccountTermsPanel.releaseStatics(-100);
          DialWidget.releaseStatics((byte) -124);
          MarkerSlider.releaseStatics(117);
          DateOfBirthValidator.releaseStatics(-1);
          BirthDateInputWidget.releaseStatics((byte) -99);
          ArrayWidgetContainer.releaseStatics((byte) 124);
          InputDetachHelpers.releaseStatics((byte) 112);
          CachedTextLayout.releaseStatics(2797);
          DirectByteStorage.releaseStatics((byte) -71);
          GrowableIntList.releaseStatics((byte) 114);
          DraggableWidget.releaseStatics((byte) 107);
          DropTargetWidget.releaseStatics(-114);
          IterableNodeHashTable.releaseStatics((byte) -127);
          IterableDualLinkDeque.releaseStatics(true);
          CacheReference.releaseStatics(-48);
          TypeCode.releaseStatics(-26834);
          StrongCacheReference.releaseStatics(-108);
          ProxySocketConnector.releaseStatics(param0 ^ 121);
          SoundFilter.releaseStatics();
          ChecksumHelpers.releaseStatics((byte) 51);
          NodeHashTableIterator.releaseStatics(param0 ^ -116);
          DualLinkDequeIterator.releaseStatics((byte) 103);
          GameOptions.releaseStatics((byte) -124);
          BackgroundParticle.releaseStatics(-25621);
          MouseTrailPoint.releaseStatics(0);
          FallingParticle.releaseStatics(-24488);
          RankingsRequest.releaseStatics(-128);
          PlayingSound.releaseStatics((byte) -79);
          QueuedRequest.releaseStatics((byte) 108);
          ThreeSliceButtonPainter.releaseStatics(param0 ^ -125);
          LinkTextPainter.releaseStatics(-88);
          TextFieldPainter.releaseStatics(false);
          PasswordFieldPainter.releaseStatics(false);
          CheckboxTickPainter.releaseStatics((byte) -125);
          FadeLayer.releaseStatics(param0 ^ 0);
          PendingScoreQuery.releaseStatics(false);
          PendingHighscoreRequest.releaseStatics((byte) -9);
          ContextMenuHelpers.releaseStatics(false);
          SocialListEntry.releaseStatics(false);
          TextMetricsGlobals.releaseStatics((byte) 112);
          PendingRequest.releaseStatics(-85);
          StatSubmission.releaseStatics((byte) -52);
          AsyncCheckResult.releaseStatics((byte) 123);
          ConnectionStage.releaseStatics(0);
          DelayedPacket.releaseStatics((byte) -62);
          RasterSnapshot.releaseStatics(114);
          StateToken.releaseStatics(param0 + 29137);
          DialogMessagePane.releaseStatics(100);
          LoginMethod.releaseStatics((byte) 103);
          LongAndTextCredentials.releaseStatics((byte) 51);
          LongAndTextLoginPayload.releaseStatics(-120);
          PasswordLoginCredentials.releaseStatics(param0 + 31856);
          ChatShortcutHelpers.releaseStatics(46);
          CellFlip.releaseStatics((byte) 21);
          ScoreSubmissionHelpers.releaseStatics(false);
          QueuedListRequest.releaseStatics(-74);
          QueuedResultSubmission.releaseStatics(param0 ^ 8355711);
          LogoRenderHelpers.releaseStatics(115);
          PendingSubmission.releaseStatics(0);
          WidgetStyleLayer.releaseStatics((byte) 74);
          TextLayoutLine.releaseStatics(2);
          UsernameAvailabilityValidator.releaseStatics(46);
          PasswordValidator.releaseStatics((byte) -89);
          EmailValidator.releaseStatics(true);
          EmailAvailabilityValidator.releaseStatics((byte) -124);
          AgeValidator.releaseStatics((byte) -8);
          PasswordConfirmationValidator.releaseStatics(-104);
          LoginRsaKey.releaseStatics((byte) 120);
          TextHotspot.releaseStatics((byte) 111);
          AudioSetupHelpers.releaseStatics((byte) -75);
          DebouncedValidator.releaseStatics(12);
          LogoAndLoginHelpers.releaseStatics((byte) -124);
          this.field_N = null;
          this.field_C = null;
          this.field_I = null;
          this.field_G = null;
          this.field_D = null;
          this.field_L = null;
          this.field_H = null;
          this.field_B = null;
          this.field_v = null;
          this.field_K = null;
          this.field_J = null;
          this.field_M = null;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "Virogrid.F(" + param0 + ')');
        }
    }

    private final void scaleModelAboutTablePivot(Model param0, byte param1) {
        int[] discarded$1 = null;
        RuntimeException runtimeException = null;
        Model var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.translate(0, 154, 0);
          if (param1 != 69) {
            var4 = (Model) null;
            discarded$1 = this.getSceneryModelTransform((byte) -76, (Model) null);
          }
          param0.scaleVertices(256, 256, 256, 32);
          param0.translate(0, -154, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("Virogrid.TA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public Virogrid() {
        this.field_I = new IntrusiveDeque();
        this.field_A = 0;
    }

    static {
        field_O = new LoginMethod("usename");
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static AccountRequestReply createDobResultReply(int param0, boolean param1) {
        AccountRequestReply var2 = null;
        RuntimeException var2_ref = null;
        AccountRequestReply stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        AccountRequestReply stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -32) {
            field_O = (LoginMethod) null;
          }
          var2 = new AccountRequestReply(true);
          stackIn_4_0 = var2;
          stackIn_5_1 = (param1);
          stackIn_4_0.field_d = stackIn_5_1;
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2_ref), "Virogrid.DB(" + param0 + ',' + param1 + ')');
        }
    }
}
