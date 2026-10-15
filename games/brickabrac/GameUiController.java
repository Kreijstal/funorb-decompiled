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
        if (GameConnectionHelpers.field_g == null) {
          GameConnectionHelpers.field_g = WidgetLayerStack.requestTableData(-2, 0, 2, 10, 3);
        }
        if (!obfuscationGuard) {
          return false;
        }
        if (GameConnectionHelpers.field_g.complete) {
          WidgetPaintStyle.field_a = true;
          TextFieldRenderer.field_A = true;
          if (null != GameConnectionHelpers.field_g.names &&
            null != GameConnectionHelpers.field_g.names[1][0]) {
            TextFieldRenderer.field_A = false;
            WidgetPaintStyle.field_a = false;
            return true;
          }
          return true;
        }
        return false;
    }

    public final void initializeUi(boolean obfuscationGuard) {
        boolean discarded$0 = false;
        NodeDeque.a(127, 50);
        TranslucentNineSliceFrame var2 = new TranslucentNineSliceFrame(LoginCredentialKind.field_h);
        RgbSprite[] var3 = (RgbSprite[]) null;
        MidiSynthesizer.a(1, (RgbSprite[]) null, Ball.field_G, 240, AchievementBrowserScreen.field_A, 8, 2, ContextActionController.field_g, 0, 2, 100, 8, 0, 320, 0);
        InvitationDialogHelpers.configureFullscreenDialogFrame(93, var2, 20, 20);
        if (obfuscationGuard) {
          discarded$0 = this.pollSavedProgress((byte) -1);
        }
        RgbSprite[] var4 = (RgbSprite[]) null;
        LobbyUiHelpers.configureTextChoiceDialogWithFont((RgbSprite[]) null, 240, 8, 320, 0, ContextActionController.field_g, 2, 0, 1, AchievementBrowserScreen.field_A, 0, Ball.field_G, 2, (byte) -110, 8);
        MusicVoice.configureTextChoiceOuterFrame(20, -97, 20, var2);
        TabbedPane.a(HighscorePackSelector.field_d, CircleBody.field_t, 2, PlayerBoard.field_jb, DualLinkNode.field_k, FriendListUi.field_c, (RgbSprite[][]) null, NameEntryPopup.field_Rb, true, 1, DropTargetWidget.field_I, PlayerBoard.field_jb, QuickChatPhraseDefinition.field_C, ValidationStatus.field_h, 22287);
        InputOptionsHelpers.field_g = true;
        GrowableIntList.field_e = IntegerRemainderHelpers.field_b;
        LevelResultSubmission.b(-9, 200);
        KeyboardInput.a(new BrickGameLayerController(), 0);
        VolcanicBackground.g(0);
        CanvasResizeController.initializeFireworkSpawnArea(240, 0, 640, 0, -6532);
        GameRenderAudioHelpers.initializeBackgroundScenes(NodeDequeCursor.field_i, FarmBackground.field_r, 24876, LevelList.field_o, GameScreen.field_e, BackgroundScene.field_f, AchievementIcon.field_s);
        Widget.initializeDiagnosticOverlay(1, PasswordFieldRenderer.field_D);
        LoginPanel.h((byte) 55);
        LoginPanel.initializeMenuScreens((byte) 115, BackgroundScene.field_f);
        AccountMessageDialog.currentScreen = (GameScreen) ((Object) FullscreenDialogHelpers.lookupMenuScreen(21, 28472));
        ArchiveSourceManager.a((byte) -79, LoginCredentialKind.titleMusicTrack);
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
        return (GameScreen) ((Object) FullscreenDialogHelpers.lookupMenuScreen(screenId, 28472));
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
        if (!WidgetLayer.field_H) {
          WidgetLayer.field_H = this.pollSavedProgress((byte) 127);
        }
        if (obfuscationGuard != 23570) {
          this.initializeUi(true);
        }
        if (!QuickChatParameterType.field_b) {
          QuickChatParameterType.field_b = this.pollRequiredData(true);
        }
        stackIn_15_0 = (ResourceRequest.field_y) && (WidgetLayer.field_H) && (QuickChatParameterType.field_b);
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
            OptionsScreen.progressRequests[var2] = IntArrayRequestHelpers.requestIntArray(1, (byte) -72, var2, 5);
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
              if (OptionsScreen.progressRequests[var3].values[0] > IntegerPowerHelpers.unlockedLevelCounts[var3]) {
                IntegerPowerHelpers.unlockedLevelCounts[var3] = OptionsScreen.progressRequests[var3].values[0];
              }
              jj.field_d = jj.field_d | BytePayloadSubmission.combineLevelAttributes(DateFieldsWidget.field_L[var3], 0, true, IntegerPowerHelpers.unlockedLevelCounts[var3]);
              if (!DelayedPacket.c(obfuscationGuard ^ 27)) {
                IntegerPowerHelpers.unlockedLevelCounts[var3] = 0;
              } else {
                IntegerPowerHelpers.unlockedLevelCounts[var3] = 0;
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
          MeshLobbyUiHelpers.b(2);
        }
        KeyDispatchHelpers.field_a = TextChoiceDialogHitTest.a(3, true);
        BackgroundScene.field_f = FullscreenDialogHelpers.createConfiguredArchive(-6, 0, false, 5, true);
        ScorePopup.field_l = TextChoiceDialogHitTest.a(6, true);
        FarmBackground.field_r = TextChoiceDialogHitTest.a(7, true);
        AchievementIcon.field_s = TextChoiceDialogHitTest.a(8, obfuscationGuard);
        LevelList.field_o = TextChoiceDialogHitTest.a(9, true);
        NodeDequeCursor.field_i = TextChoiceDialogHitTest.a(10, true);
        IncomingPacketHelpers.field_a = TextChoiceDialogHitTest.a(11, true);
        IntHistoryBuffer.field_i = TextChoiceDialogHitTest.a(12, true);
        QuickChatPhraseDefinition.field_C = TextChoiceDialogHitTest.a(13, true);
        FriendListUi.a(NameEntryPopup.field_Rb, FriendListUi.field_c, 0);
        AccountContentTransitionLayer.startupResources = new ResourcePreparationQueue(82);
        AccountContentTransitionLayer.startupResources.addNamedGroup(OutgoingPacketHelpers.field_e, "basic", 125, WidgetGroup.field_F, NameEntryPopup.field_Rb);
        AccountContentTransitionLayer.startupResources.addNamedGroup(OutgoingPacketHelpers.field_e, "lobby", 126, WidgetGroup.field_F, NameEntryPopup.field_Rb);
        AccountContentTransitionLayer.startupResources.addNamedGroup(OutgoingPacketHelpers.field_e, "lobby", 124, WidgetGroup.field_F, FriendListUi.field_c);
        AccountContentTransitionLayer.startupResources.addNamedGroup(OutgoingPacketHelpers.field_e, "kartika13", 125, WidgetGroup.field_F, NameEntryPopup.field_Rb);
        AccountContentTransitionLayer.startupResources.addNamedGroup(OutgoingPacketHelpers.field_e, "basic", 126, WidgetGroup.field_F, BackgroundScene.field_f);
        AccountContentTransitionLayer.startupResources.addNamedGroup(RadialSelectorWidget.field_P, "basic", -126, ConditionalTextValue.field_k, ScorePopup.field_l);
        AccountContentTransitionLayer.startupResources.addNamedGroup(RadialSelectorWidget.field_P, "kartika13", 127, ConditionalTextValue.field_k, FriendListUi.field_c);
        AccountContentTransitionLayer.startupResources.addArchive(FarmBackground.field_r, false, MovingBody.field_n, ValidationIconWidget.field_Q);
        AccountContentTransitionLayer.startupResources.addArchive(AchievementIcon.field_s, false, MovingBody.field_n, ValidationIconWidget.field_Q);
        AccountContentTransitionLayer.startupResources.addArchive(LevelList.field_o, false, BallPulseEffect.field_i, EmailValidator.field_m);
        AccountContentTransitionLayer.startupResources.addArchive(NodeDequeCursor.field_i, false, AlternateNumericLoginCredentials.field_n, LinkWidgetRenderer.field_a);
        AccountContentTransitionLayer.startupResources.addArchive(IncomingPacketHelpers.field_a, false, IntArrayRequestHelpers.waitingForLevelsText, AppletResourceHelpers.field_a);
        AccountContentTransitionLayer.startupResources.addArchive(IntHistoryBuffer.field_i, false, IntArrayRequestHelpers.waitingForLevelsText, AppletResourceHelpers.field_a);
        AccountContentTransitionLayer.startupResources.addArchive(QuickChatPhraseDefinition.field_C, !obfuscationGuard ? true : false, IntHistoryBuffer.field_k, BrowserResizeNotificationHelpers.field_e);
        AccountContentTransitionLayer.startupResources.addArchive(KeyDispatchHelpers.field_a, false, IntHistoryBuffer.field_k, BrowserResizeNotificationHelpers.field_e);
    }

    public final boolean pollUiBootstrap(byte obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = 1;
        var3 = WidgetPaintStyle.uiBootstrapStage;
        if (0 != var3) {
          if (var3 != 1) {
            if (var3 != 2) {
              if (3 != var3) {
                if (4 == var3) {
                  ParisBackground.a((byte) 24, 92.0f, Ball.field_x);
                  CacheEntry.field_C.renderClient(121);
                  BrickGameLayerController.a(IncomingPacketHelpers.field_a, IntHistoryBuffer.field_i, 2);
                } else {
                  if (var3 != 5) {
                    return true;
                  }
                  TextHuffmanHelpers.installTextHuffman(new HuffmanCodec(KeyDispatchHelpers.field_a.takeFileByName(121, "", "huffman")), false);
                  KeyDispatchHelpers.field_a = null;
                }
              } else {
                ParisBackground.a((byte) 24, 90.0f, MessageScreen.field_u);
                CacheEntry.field_C.renderClient(106);
                QuickChatCategoryRegistry.a(BackgroundScene.field_f, NameEntryPopup.field_Rb, ScorePopup.field_l, 29137, FriendListUi.field_c);
              }
            } else {
              ParisBackground.a((byte) 24, 88.0f, ValidatedTextFieldWidget.field_bb);
              CacheEntry.field_C.renderClient(124);
              var2 = var2 != 0 & ParallaxMusicHelpers.pollSpecialMusicPreparation(2) ? 1 : 0;
            }
          } else {
            ParisBackground.a((byte) 24, 82.0f, BitPacketBuffer.field_s);
            CacheEntry.field_C.renderClient(123);
            ClientResourceHelpers.loadGameplaySoundAssets(123);
          }
        } else {
          UiCleanupHelpers.cleanupPopupUi((byte) 115);
          LevelList.a(-1);
          SecondaryNodeQueue.a(LevelList.field_o, NodeDequeCursor.field_i, (byte) -38, AchievementIcon.field_s, FarmBackground.field_r);
        }
        if (var2 != 0) {
          WidgetPaintStyle.uiBootstrapStage = WidgetPaintStyle.uiBootstrapStage + 1;
        }
        MeshLobbyUiHelpers.b(2);
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
