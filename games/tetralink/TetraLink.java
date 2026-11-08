/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class TetraLink extends NetworkGameClient {
    static int field_N;
    static ContextMenu field_P;
    static String field_O;
    static String field_M;
    private IntrusiveDeque notificationQueue;
    private int notificationTimer;
    static int field_I;
    public static int field_J;

    final void releaseStaticResources(int param0) {
        TetraLink.releaseStatics(10297);
        NotificationToast.releaseStatics((byte) -64);
        IntrusiveNode.releaseStatics(20043);
        IntrusiveDeque.releaseStatics((byte) 25);
        IntroFinalFrameHelpers.releaseStatics(param0 ^ param0);
        ErrorPrintHelpers.releaseStatics(-127);
        AnimationPlayer.releaseStatics(-3);
        AnimationSequence.releaseStatics((byte) -123);
        ChatReceiveHelpers.releaseStatics(true);
        ConnectionTimingHelpers.releaseStatics(27204);
        RasterEffectHelpers.releaseStatics(127);
        GameKeyHandler.releaseStatics((byte) -70);
        FontAndFrameStyleHelpers.releaseStatics(param0 - 1320);
        MenuLabelGlobals.releaseStatics((byte) 67);
        BevelFrameSpriteFactory.releaseStatics(true);
        InterfaceTextLoader.releaseStatics(14914);
        LobbyUpdateHelpers.releaseStatics(-28);
        NetworkGameClient.releaseStatics(param0 ^ -1328);
        ClientException.releaseStatics(true);
        GameApplet.releaseStatics(6);
        UrlFetchTask.releaseStatics(-2);
        MouseInputHandler.releaseStatics(param0 ^ 1322);
        MouseWheelInput.releaseStatics(-1);
        SoftwareRasterizer.releaseStatics();
        Archive.releaseStatics(16);
        BitmapFont.releaseStatics();
        PopupAndStripHelpers.releaseStatics(126);
        PacketBuffer.releaseStatics(true);
        ClockAndTextHelpers.releaseStatics(-14243);
        RsaKeyAndTextGlobals.releaseStatics(true);
        CanvasAndErrorHelpers.releaseStatics(param0 - 1333);
        ArchiveFactoryHelpers.releaseStatics(param0 ^ 12618);
        StringPadHelpers.releaseStatics(4666);
        IndexedSpriteHelpers.releaseStatics((byte) 83);
        ConfirmPasswordTextGlobals.releaseStatics(-35);
        SharedPanelFactory.releaseStatics((byte) 88);
        SoundMixerHelpers.releaseStatics((byte) -109);
        ChatMessage.releaseStatics(param0 ^ 1316);
        KeyEventHelpers.releaseStatics((byte) 122);
        GameClock.releaseStatics((byte) 41);
        RasterBuffer.releaseStatics((byte) -20);
        LoadingStepTracker.releaseStatics(false);
        FullscreenFocusCanvas.releaseStatics((byte) -117);
        ViewportController.releaseStatics(false);
        SoundEffectLibrary.releaseStatics(-2);
        Js5Transport.releaseStatics(121);
        DiskCacheWorker.releaseStatics(param0 ^ 1327);
        Js5ArchiveManager.releaseStatics((byte) 107);
        BufferedFile.releaseStatics((byte) -94);
        BufferedSocket.releaseStatics(-26787);
        MenuScreen.releaseStatics(-119);
        GameSession.releaseStatics(false);
        ChatMessageReader.releaseStatics(6945);
        Model.releaseStatics();
        LobbyResourceHelpers.releaseStatics(2);
        SpriteState.releaseStatics(21);
        DualLinkNode.releaseStatics(105);
        MusicTrackHelpers.releaseStatics(-1);
        KeyHandlerHelpers.releaseStatics(14236);
        MenuReturnHelpers.releaseStatics(-578);
        LabelPairWidget.releaseStatics(0);
        VerticalScrollbar.releaseStatics((byte) 124);
        WidgetNode.releaseStatics((byte) -96);
        UiComponent.releaseStatics(-31057);
        ContextMenu.releaseStatics(-2);
        TwoColumnListPanel.releaseStatics((byte) 116);
        PlayerContextMenu.releaseStatics((byte) 86);
        ScrollPane.releaseStatics((byte) -127);
        ReportAbuseDialog.releaseStatics(true);
        LobbyPlayerEntry.releaseStatics(11042);
        NameSeparatorHelpers.releaseStatics(-161);
        MenuThemeHelpers.releaseStatics(63);
        ChatPanelSlideHelpers.releaseStatics(120);
        SocialListPacketHandler.releaseStatics((byte) -41);
        IconLabelItem.releaseStatics(false);
        SocialTabsPanel.releaseStatics(param0 - 1324);
        LobbyGame.releaseStatics(0);
        TriangleRasterizer.releaseStatics();
        TextureCache.releaseStatics((byte) 99);
        LruTextureCache.releaseStatics((byte) -55);
        Renderable.releaseStatics(126);
        FaceNormal.releaseStatics((byte) 51);
        StartupFlagsHelpers.releaseStatics(false);
        AnimationSkeleton.releaseStatics(true);
        InputDetachHelpers.releaseStatics(param0 ^ -26264);
        AnimationFrameSet.releaseStatics((byte) 87);
        AnimationFrame.releaseStatics();
        MidiPcmStream.releaseStatics((byte) 118);
        NodeHashTable.releaseStatics((byte) 38);
        MidiNote.releaseStatics(param0 ^ 1322);
        MidiFileReader.releaseStatics();
        MusicPatchPcmStream.releaseStatics(param0 ^ 19100);
        AudioOutput.releaseStatics();
        MusicCrossfadeStream.releaseStatics(-59);
        LoadingResourceHelpers.releaseStatics((byte) 99);
        MenuInputState.releaseStatics(-126);
        NineSliceFrame.releaseStatics(param0 ^ 1365);
        AccountTextGlobals.releaseStatics(90);
        PacketFlushHelpers.releaseStatics(param0 - 1415);
        ScreenSwitchHelpers.releaseStatics((byte) -100);
        QuickChatMenuFactory.releaseStatics(0);
        ArchiveIndex.releaseStatics(param0 ^ 1345);
        GzipDecompressor.releaseStatics((byte) 57);
        ArchiveProvider.releaseStatics(8);
        LoadingStageHook.releaseStatics(true);
        TextMetricsGlobals.releaseStatics((byte) 126);
        WidgetContainer.releaseStatics(param0 - 1324);
        AccountCreationDialog.releaseStatics((byte) -22);
        LoadingProgressDialog.releaseStatics(false);
        LoginDialog.releaseStatics(-32527);
        ProgressMessageDialog.releaseStatics((byte) 100);
        AccountCreationForm.releaseStatics(112);
        AccountWelcomePanel.releaseStatics(param0 ^ 1403);
        LoginPanel.releaseStatics(20);
        DisplayNameForm.releaseStatics((byte) 84);
        ConditionalTextValue.releaseStatics(-125);
        WidgetTheme.releaseStatics(param0 ^ 1323);
        TooltipTextGlobals.releaseStatics(param0 + 25418);
        RegistrationResponseHelpers.releaseStatics(-137);
        HuffmanCodec.releaseStatics((byte) -48);
        FontAndBrightnessHelpers.releaseStatics(-85);
        ServerConnectionHelpers.releaseStatics(param0 - 1324);
        TriangleSpanHelpers.releaseStatics((byte) -123);
        MenuStyleHelpers.releaseStatics(-12359);
        CameraAndChatHelpers.releaseStatics((byte) -109);
        PasswordLengthHelpers.releaseStatics((byte) -62);
        LoginCredentialType.releaseStatics((byte) -108);
        LoginCredentials.releaseStatics(118);
        BitPacketBuffer.releaseStatics(29313);
        IsaacCipher.releaseStatics((byte) 125);
        DualLinkNodeHashTable.releaseStatics(-84);
        RasterStackHelpers.releaseStatics((byte) -92);
        BoardAnimator.releaseStatics(9);
        GameBoard.releaseStatics(-86);
        DateOfBirthPanel.releaseStatics(param0 ^ 1322);
        LoadingStatusHelpers.releaseStatics(117);
        ArchiveGroupHelpers.releaseStatics((byte) -30);
        QuickChatHelpDialog.releaseStatics(param0 ^ 2106634);
        IndexedSpriteState.releaseStatics(-49);
        NineSliceFrameHelpers.releaseStatics((byte) -78);
        ClippedTriangleRenderer.releaseStatics();
        ReflectionCheck.releaseStatics((byte) 6);
        RandomAccessCacheFile.releaseStatics((byte) -112);
        CommonUiHelpers.releaseStatics(-1);
        TopLevelContainerHelpers.releaseStatics(39);
        AudioPumpThread.releaseStatics(false);
        SocketJs5Transport.releaseStatics(param0 - 1322);
        DualLinkDeque.releaseStatics(21332);
        NetworkArchiveRequest.releaseStatics(-84);
        SectorCacheStore.releaseStatics(29187);
        DiskArchiveRequest.releaseStatics(-1);
        CachedArchiveSource.releaseStatics(-251);
        MiscTextGlobals.releaseStatics(true);
        ArchiveRequest.releaseStatics((byte) 125);
        GameOptionTextTables.releaseStatics(-101);
        FullscreenErrorDialog.releaseStatics((byte) -128);
        TextWidgetPainter.releaseStatics((byte) -93);
        VorbisSample.releaseStatics();
        LoadingScreenHelpers.releaseStatics((byte) -16);
        TriangleMesh.releaseStatics(338);
        NameEntryKeyHelpers.releaseStatics((byte) 41);
        NameAlphabetTable.releaseStatics(105);
        DecodedSpriteBuffers.releaseStatics(param0 ^ -14345);
        RasterTargetHelpers.releaseStatics((byte) 119);
        LobbyOverlayHelpers.releaseStatics(-10457);
        DelegatingCanvas.releaseStatics(-108);
        ReflectionCheckHelpers.releaseStatics(false);
        IntKeyLookup.releaseStatics(false);
        ByteStorage.releaseStatics(-84);
        Bzip2Decoder.releaseStatics();
        Bzip2State.releaseStatics((byte) 28);
        ByteArrayPool.releaseStatics(true);
        ChatLayoutHelpers.releaseStatics(-119);
        CheckboxPainter.releaseStatics(-17479);
        StatefulWidgetRenderer.releaseStatics(24468);
        DialWidgetPainter.releaseStatics(-114);
        MarkerSliderPainter.releaseStatics(82);
        TextLayout.releaseStatics((byte) 91);
        UiWidget.releaseStatics((byte) 101);
        TextButton.releaseStatics(true);
        SingleChildWidget.releaseStatics(99);
        ResizableDialog.releaseStatics(-463);
        FadingModalPanel.releaseStatics(param0 ^ -1365);
        UiContainer.releaseStatics(true);
        IntrusiveDequeCursor.releaseStatics(param0 - 1322);
        ScreenDrawHelpers.releaseStatics(-30581);
        VorbisFloor.releaseStatics();
        LoadingScreenRenderHelpers.releaseStatics(23365);
        AccountCreationResultHelpers.releaseStatics((byte) -49);
        DefaultQuickChatContext.releaseStatics((byte) 118);
        JoinGameTextGlobals.releaseStatics(7151);
        QuickChatMenu.releaseStatics(66);
        QuickChatCategoryCache.releaseStatics(param0 ^ 34090);
        QuickChatPhraseCache.releaseStatics(param0 + 31446);
        QuickChatCategory.releaseStatics(param0 - 1322);
        QuickChatPhraseDefinition.releaseStatics(4);
        WeightedLruCache.releaseStatics((byte) 116);
        SocketConnector.releaseStatics(param0 ^ 1322);
        ProxyAuthenticationRequiredException.releaseStatics(-26623);
        NanoTickClock.releaseStatics(-34);
        ImageProducerRasterBuffer.releaseStatics(true);
        StatusRequestHelpers.releaseStatics((byte) 63);
        DisplayMode.releaseStatics(false);
        SynthInstrument.releaseStatics();
        PatchNoteUsage.releaseStatics(param0 ^ 1375);
        WhirlpoolHasher.releaseStatics(255);
        ModelMergeHelpers.releaseStatics(12000);
        TabbedPanel.releaseStatics((byte) 43);
        NameEntryPopup.releaseStatics((byte) 102);
        LobbyListHelpers.releaseStatics(3);
        MusicPatch.releaseStatics(param0 ^ 1348);
        MusicPatchEnvelope.releaseStatics(2);
        CaptionedContainer.releaseStatics(0);
        ValidatedTextWidget.releaseStatics(param0 + 28468);
        EditableTextWidget.releaseStatics(true);
        ContentTransitionDialog.releaseStatics((byte) -38);
        StripedProgressBar.releaseStatics((byte) -104);
        NameSuggestionsPanel.releaseStatics(96);
        HotspotTextWidget.releaseStatics(-24314);
        ValidationStatusIcon.releaseStatics((byte) 59);
        ValidationMessageWidget.releaseStatics((byte) 125);
        CheckboxWidget.releaseStatics(param0 ^ 1322);
        TextFieldValidator.releaseStatics(param0 ^ 1322);
        GameOptionControls.releaseStatics(-108);
        AccountTermsPanel.releaseStatics(-51);
        DialWidget.releaseStatics(true);
        MarkerSlider.releaseStatics(2147483647);
        DateOfBirthValidator.releaseStatics((byte) -34);
        NumericDateInputWidget.releaseStatics(false);
        ArrayWidgetContainer.releaseStatics(-1);
        SettingsCookieHelpers.releaseStatics(0);
        DateInputWidget.releaseStatics((byte) -98);
        CachedTextLayout.releaseStatics(0);
        DirectByteStorage.releaseStatics(param0 ^ 1295);
        GrowableIntList.releaseStatics((byte) 83);
        DraggableWidget.releaseStatics(false);
        DropTargetWidget.releaseStatics(-108);
        IterableNodeHashTable.releaseStatics(-4099);
        SecondaryNodeDeque.releaseStatics(0);
        CacheEntry.releaseStatics((byte) -48);
        QuickChatCommandType.releaseStatics(true);
        StrongCacheEntry.releaseStatics((byte) -103);
        ProxySocketConnector.releaseStatics((byte) -109);
        SoundFilter.releaseStatics();
        ChatPanelHelpers.releaseStatics(-74);
        NodeHashTableIterator.releaseStatics((byte) 123);
        SecondaryNodeDequeIterator.releaseStatics((byte) -125);
        GraphicsSettings.releaseStatics((byte) 72);
        BackgroundSparkle.releaseStatics(111);
        PointerTrailBubble.releaseStatics((byte) -127);
        SparkParticle.releaseStatics(param0 + 18059);
        QueuedListRequest.releaseStatics((byte) 103);
        PlayingSound.releaseStatics(65364);
        PendingReplyNode.releaseStatics(22);
        ThreeSliceButtonPainter.releaseStatics((byte) -67);
        LinkTextPainter.releaseStatics(98);
        InsetTextPainter.releaseStatics(false);
        PasswordFieldPainter.releaseStatics(true);
        SpriteCheckboxPainter.releaseStatics(17);
        OpacityWidget.releaseStatics((byte) -16);
        HighscoreQuery.releaseStatics(-25731);
        HighscoreSubmission.releaseStatics(-11961);
        HighscoreRowName.releaseStatics(127);
        SocialListEntry.releaseStatics(0);
        PageReloadHelpers.releaseStatics(-1);
        PendingStatQuery.releaseStatics((byte) 6);
        QueuedStatSubmission.releaseStatics(param0 - 1322);
        FlaggedTextValue.releaseStatics(true);
        ClientProtocolStage.releaseStatics(0);
        DelayedIncomingPacket.releaseStatics(true);
        RasterSnapshot.releaseStatics(-57);
        TextureEntry.releaseStatics((byte) 122);
        LoginProgressHelpers.releaseStatics(-11535);
        AccountServerResult.releaseStatics(0);
        MessageDialogContent.releaseStatics(22);
        LoginMethod.releaseStatics(-5384);
        LongAndTextCredentials.releaseStatics((byte) 86);
        AlternateLongAndTextCredentials.releaseStatics(24943);
        PasswordLoginCredentials.releaseStatics(false);
        PendingMove.releaseStatics(param0 ^ 1226);
        PieceDropAnimation.releaseStatics(-1);
        JoinStatusTextHelpers.releaseStatics(-119);
        PendingSubmission.releaseStatics((byte) -57);
        PacketDiagnosticsHelpers.releaseStatics(-95);
        PendingListRequest.releaseStatics(false);
        FullscreenCanvasHelpers.releaseStatics((byte) 112);
        WidgetStyleLayer.releaseStatics(-5549);
        TextLayoutLine.releaseStatics(81);
        NameAvailabilityValidator.releaseStatics(-62);
        PasswordValidator.releaseStatics(0);
        EmailSyntaxValidator.releaseStatics(255);
        EmailAvailabilityValidator.releaseStatics(-57);
        AgeValidator.releaseStatics(47);
        MatchingTextValidator.releaseStatics((byte) 80);
        TransitionPhase.releaseStatics(4);
        TextHighlightSpan.releaseStatics((byte) 44);
        ValidationState.releaseStatics((byte) 77);
        DebouncedValidator.releaseStatics((byte) 6);
        GameRoomPanelHelpers.releaseStatics(-82);
        this.notificationQueue = null;
        this.field_y = null;
    }

    final void renderFrame(int param0) {
        Object stackIn_3_0 = null;
        GameSession stackIn_15_0 = null;
        int stackIn_42_0 = 0;
        boolean stackIn_44_1 = false;
        Object var2;
        GameSession var3;
        int var4;
        NotificationToast var4_ref_ek;
        int var5;
        int var6;
        int var7;
        int var4Lifetime1;
        var7 = field_J;
        if (EmailAvailabilityValidator.field_u != null) {
          stackIn_3_0 = EmailAvailabilityValidator.field_u;
        } else {
          stackIn_3_0 = GameClock.field_b;
        }
        var2 = stackIn_3_0;
        if (LoadingScreenHelpers.shouldShowLoadingScreen(false)) {
          MidiNote.renderStartupScreen((java.awt.Canvas) (var2), NineSliceFrameHelpers.isFullscreenActive(124), 32511);
          return;
        }
        if (!TwoColumnListPanel.field_Nb) {
          LoadingScreenRenderHelpers.renderLoadingScreen(-8129, (java.awt.Canvas) (var2));
          return;
        }
        if (!NineSliceFrameHelpers.isSavedFlagsReady(4)) {
          PacketFlushHelpers.setBenefitsBorderAndCaption(0, QueuedListRequest.field_w, 100.0f);
          LoadingScreenRenderHelpers.renderLoadingScreen(-8129, (java.awt.Canvas) (var2));
          return;
        }
        if (WidgetTheme.field_i.field_c) {
          this.renderHighDetailFrame(99);
        } else {
          this.renderLowDetailFrame(10);
        }
        if (null != ContextMenu.field_bc) {
          stackIn_15_0 = ContextMenu.field_bc;
        } else {
          stackIn_15_0 = SocialListEntry.field_Qb;
        }
        var3 = stackIn_15_0;
        if (var3 != null) {
          var3.drawGameOverlay(-9104, true);
          NameEntryPopup.drawViewModeTab(109);
          if (GameKeyHandler.field_b &&
            EditableTextWidget.field_X) {
            LoadingResourceHelpers.sendGameOptions(PacketDiagnosticsHelpers.isFullscreenBlinkOn(64), -124);
          }
        } else {
          NameEntryPopup.drawViewModeTab(103);
        }
        if (param0 < 100) {
          field_O = (String) null;
        }
        if ((~BackgroundSparkle.field_t != ~DraggableWidget.field_O ||
          ~JoinStatusTextHelpers.field_h != ~LoginCredentials.field_a) &&
          (BackgroundSparkle.field_t == -2 ||
          DraggableWidget.field_O == -2)) {
          if (EmailAvailabilityValidator.field_v >= 16) {
            var4 = 1 + (32 - EmailAvailabilityValidator.field_v);
          } else {
            var4 = EmailAvailabilityValidator.field_v + 1;
          }
          PixelBlockEffect.pixelate(var4, 256, 16769381, false, false);
        }
        if (!GameKeyHandler.field_b ||
          !EditableTextWidget.field_X) {
          LoadingResourceHelpers.sendGameOptions(PacketDiagnosticsHelpers.isFullscreenBlinkOn(64), -108);
        }
        if (TopLevelContainerHelpers.isAccountCreationMode((byte) 56)) {
          SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_f, SoftwareRasterizer.field_e);
          var4Lifetime1 = 14 + MarkerSliderPainter.getLegacyMenuWidth((byte) 117);
          var5 = AccountTermsPanel.getMenuHeight(88) + 16;
          InputDetachHelpers.drawStripedCentredBox(var5, var4Lifetime1, 480);
          FontAndFrameStyleHelpers.setPopupFrameStyle(14, 12, WhirlpoolHasher.field_l, (byte) -88);
        } else {
          if (!ArchiveFactoryHelpers.checkReconnecting((byte) 105)) {
            if (!WidgetStyleLayer.isMessagePopupOpen(115)) {
              if (!this.notificationQueue.isEmpty(true)) {
                var4_ref_ek = (NotificationToast) (this.notificationQueue.first(false));
                var6 = this.notificationTimer;
                if (var6 < 80) {
                  var5 = -32 + var6 / 2;
                } else {
                  if (230 <= var6) {
                    var5 = -(var6 / 2) + 123;
                  } else {
                    var5 = 8;
                  }
                }
                UiComponent.field_G[var4_ref_ek.field_q].drawTransparent(8, var5);
                SocialTabsPanel.field_b.drawLeft(ModelMergeHelpers.field_a[var4_ref_ek.field_q], 48, var5 + SocialTabsPanel.field_b.field_N, 8437759, -1);
              }
            } else {
              var4Lifetime1 = 4 + EditableTextWidget.getPopupMenuWidth((byte) -63);
              var5 = 12 + DraggableWidget.getMessagePopupHeight(32768);
              InputDetachHelpers.drawStripedCentredBox(var5, var4Lifetime1, 480);
              IndexedSpriteHelpers.openPopupMenuAt(8, (byte) -92, 12, WhirlpoolHasher.field_l);
            }
          } else {
            stackIn_42_0 = 80;
            stackIn_44_1 = (null != EmailAvailabilityValidator.field_u) || (ScreenSwitchHelpers.field_e);
            PasswordFieldPainter.drawDimmedOverlay(stackIn_42_0, stackIn_44_1);
          }
        }
        if (0 != PointerTrailBubble.field_s) {
          FontAndBrightnessHelpers.scaleRasterBrightness(-16711936, (-(256 * ArchiveFactoryHelpers.field_i) + 4096) / 16);
        }
        if (SettingsCookieHelpers.field_c >= 2) {
          SocialTabsPanel.field_b.drawLeft(Integer.toString(DelayedIncomingPacket.field_v), 4, 24, 16777215, -1);
        }
        CachedArchiveSource.paintCanvasNow(0, 0, (java.awt.Canvas) (var2), -2);
        return;
    }

    private final void renderLowDetailFrame(int param0) {
        int var2;
        int var8;
        int stackIn_27_0 = 0;
        int var3_int;
        int[] var3;
        SparkParticle var3_ref;
        int var4;
        int[] var4_ref_int__;
        int var5;
        PointerTrailBubble var5_ref_ko;
        int[] var6_ref_int__;
        int var6;
        int var7;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int[] var13;
        int[] var15;
        int[] var16;
        int[] var17;
        int[] var18;
        int[] var19;
        int[] var21;
        int[] var22;
        int[] var24;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var3_intLifetime1Lifetime1;
        int var3_intLifetime1Lifetime2;
        int var3_intLifetime1Lifetime3;
        int var3_intLifetime1Lifetime4;
        int var4Lifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        var8 = field_J;
        var2 = 1;
        if (param0 != 10) {
          this.notificationTimer = -53;
        }
        if (DraggableWidget.field_O == BackgroundSparkle.field_t &&
          JoinStatusTextHelpers.field_h == LoginCredentials.field_a) {
          if (BackgroundSparkle.field_t != -2) {
            GraphicsSettings.renderScreenToSprites(LoginCredentials.field_a, true, true, -1, BackgroundSparkle.field_t);
          } else {
            var2 = 0;
            ReflectionCheckHelpers.clearScreen(1, false);
          }
        } else {
          if (BackgroundSparkle.field_t != -2) {
            if (DraggableWidget.field_O == -2) {
              if (16 > EmailAvailabilityValidator.field_v) {
                GraphicsSettings.renderScreenToSprites(LoginCredentials.field_a, true, false, -1, BackgroundSparkle.field_t);
              } else {
                ReflectionCheckHelpers.clearScreen(1, false);
                var2 = 0;
              }
            } else {
              if (EmailAvailabilityValidator.field_v >= 16) {
                GraphicsSettings.renderScreenToSprites(JoinStatusTextHelpers.field_h, true, false, -EmailAvailabilityValidator.field_v + 33, DraggableWidget.field_O);
              } else {
                GraphicsSettings.renderScreenToSprites(LoginCredentials.field_a, true, false, 1 + EmailAvailabilityValidator.field_v, BackgroundSparkle.field_t);
              }
            }
          } else {
            if (EmailAvailabilityValidator.field_v < 16) {
              ReflectionCheckHelpers.clearScreen(1, false);
              var2 = 0;
            } else {
              GraphicsSettings.renderScreenToSprites(JoinStatusTextHelpers.field_h, true, false, -1, DraggableWidget.field_O);
            }
          }
        }
        if (var2 != 0) {
          if (DialWidget.field_P == null) {
            DialWidget.field_P = new Sprite(640, 480);
            RasterTargetHelpers.setSpriteRasterTarget(DialWidget.field_P, param0 - 4);
            SoftwareRasterizer.fillRectangle(0, 0, 640, 480, 3158064);
            var3_int = (LruTextureCache.field_e % 20480 << 12) % 83886080;
            var4 = SpriteState.field_G;
            var5 = RegistrationResponseHelpers.field_a;
            DualLinkNodeHashTable.setScreenCentre(320, 240, (byte) -121);
            CameraProjectionMath.drawPerspectiveTexturedQuad(LongAndTextCredentials.field_h, new double[]{-768.0, 20.0, 0.0}, new double[]{0.0, 0.0, 1.0}, 600.0, 200.0, TextureCache.field_i, 23967451 + var3_int, 59918628 + var3_int, 0, 16711680, WidgetTheme.field_i.field_g);
            CameraProjectionMath.drawPerspectiveTexturedQuad(LongAndTextCredentials.field_h, new double[]{-768.0 + Renderable.field_b * 400.0, 20.0, 600.0 + Renderable.field_b * 400.0}, new double[]{Renderable.field_b, 0.0, Renderable.field_b}, 400.0, 200.0, TextureCache.field_i, var3_int + 59918628, var3_int + 83820544, 0, 16711680, WidgetTheme.field_i.field_g);
            CameraProjectionMath.drawPerspectiveTexturedQuad(LongAndTextCredentials.field_h, new double[]{Renderable.field_b * 400.0 - 768.0, 20.0, -(600.0 + 400.0 * Renderable.field_b)}, new double[]{-Renderable.field_b, 0.0, Renderable.field_b}, 400.0, 200.0, TextureCache.field_i, var3_int, var3_int + 23967451, 0, 16711680, WidgetTheme.field_i.field_g);
            InsetTextPainter.field_w.drawTransformed(RasterTargetHelpers.field_b, LobbyResourceHelpers.field_d);
            HuffmanCodec.popRasterTarget(true);
            DualLinkNodeHashTable.setScreenCentre(var4, var5, (byte) -121);
          }
          DialWidget.field_P.drawOpaque(0, -240 + RegistrationResponseHelpers.field_a);
          if (WidgetTheme.field_i.field_j) {
            var3_intLifetime1 = LruTextureCache.field_e % 64;
            if (var3_intLifetime1 >= 32) {
              stackIn_27_0 = -var3_intLifetime1 + 48;
            } else {
              stackIn_27_0 = -16 + var3_intLifetime1;
            }
            var3_intLifetime1Lifetime1 = stackIn_27_0;
            var3_intLifetime1Lifetime1 = var3_intLifetime1Lifetime1 << 2;
            var18 = new int[3];
            var12 = var18;
            var4_ref_int__ = var12;
            var17 = new int[3];
            var11 = var17;
            var9 = var11;
            var24 = var9;
            var19 = new int[3];
            var13 = var19;
            var6_ref_int__ = var13;
            var4_ref_int__[0] = (int)MenuThemeHelpers.field_c;
            var17[0] = 50;
            var6_ref_int__[0] = (var3_intLifetime1Lifetime1 >> 4) + 128;
            var4_ref_int__[1] = -(int)MenuThemeHelpers.field_c;
            var17[1] = 50;
            var18[2] = 0;
            var6_ref_int__[1] = 128 + (var3_intLifetime1Lifetime1 >> 4);
            var17[2] = 80;
            var19[2] = 128;
            var7 = CameraProjectionMath.rgbToPackedHsl(8437759);
            ClippedTriangleRenderer.drawTriangle(240, 0, 0, var18, var24, var19, var7, var7, var7);
            var3_intLifetime1Lifetime2 = var18[0];
            var4_ref_int__[0] = var18[1];
            var18[1] = var3_intLifetime1Lifetime2;
            var3_intLifetime1Lifetime3 = var17[0];
            var9[0] = var17[1];
            var17[1] = var3_intLifetime1Lifetime3;
            var3_intLifetime1Lifetime4 = var19[0];
            var6_ref_int__[0] = var19[1];
            var19[1] = var3_intLifetime1Lifetime4;
            ClippedTriangleRenderer.drawTriangle(240, 0, 0, var18, var24, var19, var7, var7, var7);
          }
          if (WidgetTheme.field_i.field_n) {
            var21 = VerticalScrollbar.field_Lb.field_C;
            var15 = var21;
            var10 = var15;
            var22 = var10;
            var16 = var22;
            var3 = var16;
            if (SectorCacheStore.field_c > 0) {
              var6 = 256000;
              while (var6 > 0) {
                var6--;
                var5Lifetime1 = var21[var6] & 65280;
                var4Lifetime1 = var21[var6] & 16711935;
                var4Lifetime1 = var4Lifetime1 * (-SectorCacheStore.field_c + 256);
                var5Lifetime1 = var5Lifetime1 * (256 - SectorCacheStore.field_c);
                var4Lifetime1 = var4Lifetime1 & -16711936;
                var4Lifetime1 = var4Lifetime1 + (-16711936 & 16711935 * SectorCacheStore.field_c);
                var5Lifetime1 = var5Lifetime1 & 16711680;
                var5Lifetime1 = var5Lifetime1 + (65280 * SectorCacheStore.field_c & 16711680);
                var10[var6] = IntrusiveNode.bitOr(var5Lifetime1, var4Lifetime1) >>> 8;
              }
            }
            var5Lifetime1Lifetime1 = 200;
            while (0 < var5Lifetime1Lifetime1) {
              var5Lifetime1Lifetime1--;
              var6Lifetime2 = 1280 * var5Lifetime1Lifetime1 + 110;
              var4Lifetime1Lifetime1 = 420;
              while (true) {
                var4Lifetime1Lifetime1--;
                if (0 >= var4Lifetime1Lifetime1) {
                  break;
                }
                var3[var6Lifetime2] = StatusRequestHelpers.bitAnd(var22[var6Lifetime2], 16711422);
                var3[var6Lifetime2] = var3[var6Lifetime2] >> 1;
                var6Lifetime2++;
              }
            }
            RasterTargetHelpers.setSpriteRasterTarget(VerticalScrollbar.field_Lb, param0 - 4);
            var5_ref_ko = (PointerTrailBubble) (ArrayWidgetContainer.field_J.first(false));
            while (var5_ref_ko != null) {
              RasterEffectHelpers.drawBubbleDistortion(var5_ref_ko.field_r, var5_ref_ko.field_p, var5_ref_ko.field_n << 3, 10000);
              var5_ref_ko = (PointerTrailBubble) (ArrayWidgetContainer.field_J.next((byte) -70));
            }
            HuffmanCodec.popRasterTarget(true);
            VerticalScrollbar.field_Lb.drawTransparent(SpriteState.field_G - (VerticalScrollbar.field_Lb.field_u >> 1), -(VerticalScrollbar.field_Lb.field_E >> 1) + RegistrationResponseHelpers.field_a);
            if (!(WidgetTheme.field_i.field_l <= 0)) {
              RasterEffectHelpers.drawGlowingLine(-(VerticalScrollbar.field_Lb.field_u >> 1) + SpriteState.field_G, -(VerticalScrollbar.field_Lb.field_E >> 1) + RegistrationResponseHelpers.field_a, (VerticalScrollbar.field_Lb.field_u >> 1) + SpriteState.field_G, -(VerticalScrollbar.field_Lb.field_E >> 1) + RegistrationResponseHelpers.field_a, 40, WidgetTheme.field_i.field_l, IndexedSpriteState.field_n);
              RasterEffectHelpers.drawGlowingLine(SpriteState.field_G + (VerticalScrollbar.field_Lb.field_u >> 1), -(VerticalScrollbar.field_Lb.field_E >> 1) + RegistrationResponseHelpers.field_a, (VerticalScrollbar.field_Lb.field_u >> 1) + SpriteState.field_G, (VerticalScrollbar.field_Lb.field_E >> 1) + RegistrationResponseHelpers.field_a, 40, WidgetTheme.field_i.field_l, IndexedSpriteState.field_n);
              RasterEffectHelpers.drawGlowingLine(SpriteState.field_G + (VerticalScrollbar.field_Lb.field_u >> 1), RegistrationResponseHelpers.field_a + (VerticalScrollbar.field_Lb.field_E >> 1), -(VerticalScrollbar.field_Lb.field_u >> 1) + SpriteState.field_G, RegistrationResponseHelpers.field_a + (VerticalScrollbar.field_Lb.field_E >> 1), 40, WidgetTheme.field_i.field_l, IndexedSpriteState.field_n);
              RasterEffectHelpers.drawGlowingLine(SpriteState.field_G - (VerticalScrollbar.field_Lb.field_u >> 1), (VerticalScrollbar.field_Lb.field_E >> 1) + RegistrationResponseHelpers.field_a, SpriteState.field_G - (VerticalScrollbar.field_Lb.field_u >> 1), RegistrationResponseHelpers.field_a - (VerticalScrollbar.field_Lb.field_E >> 1), 40, WidgetTheme.field_i.field_l, IndexedSpriteState.field_n);
            }
          }
          var3_ref = (SparkParticle) (QuickChatHelpDialog.field_Sb.first(false));
          while (var3_ref != null) {
            var4Lifetime2 = var3_ref.field_t >> 12;
            var6Lifetime1 = 512 + (var3_ref.field_y >> 12);
            var5Lifetime2 = var3_ref.field_v >> 12;
            if (var6Lifetime1 > 0) {
              SoftwareRasterizer.fillRadialPaletteCircle((SpriteState.field_G << 4) + (var4Lifetime2 << 13) / var6Lifetime1, (var5Lifetime2 << 13) / var6Lifetime1 + (RegistrationResponseHelpers.field_a << 4), 65536 / var6Lifetime1, 5 * var3_ref.field_s / 3, IndexedSpriteState.field_n);
            }
            var3_ref = (SparkParticle) (QuickChatHelpDialog.field_Sb.next((byte) -70));
          }
        }
    }

    private final void drawTitleWaveEffect(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_13_0 = 0;
        int stackIn_13_0Lifetime1;
        var7 = field_J;
        var2 = 400 - LruTextureCache.field_e % 400;
        var4 = 0;
        while (var4 < 400) {
          var5 = (int)(CacheEntry.sumSineOctaves((float)var4 / 200.0f, (float)LruTextureCache.field_e, false) * 3.0f);
          stackIn_13_0 = var5;
          if (stackIn_13_0 > 0) {
            var6 = SoftwareRasterizer.field_f * var4 + 100;
            var3 = 440;
            while (var3 > 0) {
              SoftwareRasterizer.field_b[var6 - var5] = SoftwareRasterizer.field_b[var6];
              var3--;
              var6++;
            }
          } else {
            if (var5 < 0) {
              var6 = SoftwareRasterizer.field_f * var4 + 539;
              for (var3 = 440; var3 > 0; var3--) {
                SoftwareRasterizer.field_b[-var5 + var6] = SoftwareRasterizer.field_b[var6];
                var6--;
              }
            }
          }
          var4++;
        }
        SoftwareRasterizer.drawHorizontalLine(110, var2, 420, 16777215);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (var2 + 3) % 400, 420, 16777215, 192);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (var2 + 5) % 400, 420, 16777215, 128);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (var2 + 9) % 400, 420, 16777215, 64);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (150 + var2) % 400, 420, 16777215, 128);
        stackIn_13_0Lifetime1 = param0;
        if (stackIn_13_0Lifetime1 <= 4) {
          field_O = (String) null;
        }
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (153 + var2) % 400, 420, 16777215, 96);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (var2 + 155) % 400, 420, 16777215, 64);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (var2 + 159) % 400, 420, 16777215, 32);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (var2 + 250) % 400, 420, 16777215, 64);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (253 + var2) % 400, 420, 16777215, 48);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (255 + var2) % 400, 420, 16777215, 32);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (259 + var2) % 400, 420, 16777215, 16);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (350 + var2) % 400, 420, 16777215, 64);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (353 + var2) % 400, 420, 16777215, 48);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (355 + var2) % 400, 420, 16777215, 32);
        SoftwareRasterizer.drawHorizontalLineAlpha(110, (var2 + 359) % 400, 420, 16777215, 16);
        return;
    }

    final void tick(int param0) {
        boolean discarded$0 = false;
        int var6_int = 0;
        String[] array$1 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_45_1 = false;
        double stackIn_72_0 = 0.0;
        int stackIn_87_0 = 0;
        String[] stackIn_103_0 = null;
        String[] stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        String stackIn_104_3;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int var2;
        Object var2_ref;
        int var3;
        int var4_int;
        Object var4;
        String[] var4_array;
        int var5;
        GameSession var6;
        String var7;
        String var8;
        int var8_int;
        int var10;
        String[] var11;
        String var12;
        String var13;
        String var14;
        Object var15;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var2Lifetime1Lifetime1;
        int stackIn_155_0Lifetime1;
        int stackIn_155_1Lifetime1;
        int var3Lifetime2Lifetime1;
        int var3Lifetime2Lifetime2;
        int stackIn_155_0Lifetime2;
        int stackIn_155_1Lifetime2;
        var10 = field_J;
        FontAndBrightnessHelpers.getKeyboardIdleTicks((byte) 26);
        RasterTargetHelpers.field_e = EditableTextWidget.getMouseIdleTicks(117);
        PasswordLoginCredentials.serviceAudio((byte) -106);
        if (EmailAvailabilityValidator.field_u != null &&
          EmailAvailabilityValidator.field_u.field_c) {
          QuickChatCategory.exitFullscreen((byte) 50);
          LoginDialog.reopenAccountScreenIfActive(-11);
        }
        stackIn_5_1 = 120;
        stackIn_6_2 = (EmailAvailabilityValidator.field_u != null);
        this.serviceFramework(stackIn_5_1, stackIn_6_2);
        if (HighscoreQuery.field_w) {
          this.loadArchives(104);
          HighscoreQuery.field_w = false;
        }
        LruTextureCache.field_e = LruTextureCache.field_e + 1;
        if (LruTextureCache.field_e == 200 &&
          DraggableWidget.field_O == 10) {
          DateOfBirthPanel.playSample(HighscoreQuery.field_x, 573509761);
        }
        if (500 == LruTextureCache.field_e &&
          DraggableWidget.field_O == 10) {
          MenuReturnHelpers.returnToMenuScreen(0, false);
        }
        if (LoadingScreenHelpers.shouldShowLoadingScreen(false)) {
          this.updateLoginFlow((byte) -109);
          if (LoadingScreenHelpers.shouldShowLoadingScreen(false)) {
            if (TwoColumnListPanel.field_Nb) {
              return;
            }
            if (ScreenSwitchHelpers.haveRequiredClientStages(-19403)) {
              discarded$0 = this.advanceLoading((byte) -55, false);
            }
            return;
          }
        }
        if (!TwoColumnListPanel.field_Nb) {
          ArchiveIndex.updateMenuWidgets(PacketDiagnosticsHelpers.field_p, -21901);
          if (this.advanceLoading((byte) 98, true)) {
            TwoColumnListPanel.field_Nb = true;
          }
        } else {
          if (!NineSliceFrameHelpers.isSavedFlagsReady(4)) {
            StartupFlagsHelpers.pollStartupFlagsRequest(4);
          } else {
            if (!TopLevelContainerHelpers.isAccountCreationMode((byte) 119)) {
              if (ArchiveFactoryHelpers.checkReconnecting((byte) 105)) {
                stackIn_45_1 = (EmailAvailabilityValidator.field_u != null);
                var2 = this.serviceAccountActions(stackIn_45_1, (byte) -108);
                if (var2 == 1 ||
                  var2 == 2) {
                  if (null != EmailAvailabilityValidator.field_u) {
                    QuickChatCategory.exitFullscreen((byte) 90);
                  }
                  if (var2 == 2) {
                    AnimationPlayer.openQuitPage(ProgressMessageDialog.getHostApplet(13), (byte) 124);
                  }
                }
                this.updateScreens((byte) 62, true);
              } else {
                if (!WidgetStyleLayer.isMessagePopupOpen(-121)) {
                  this.updateScreens((byte) 62, false);
                } else {
                  if (0 != PointerTrailBubble.field_s) {
                    this.updateScreens((byte) 62, false);
                  } else {
                    var2 = MarkerSlider.pollPopupMenuSelection(-91);
                    if (var2 == 1) {
                      LoadingScreenRenderHelpers.field_d = true;
                      EmailAvailabilityValidator.startScreenTransition(NameEntryPopup.field_Mb, 0, -308);
                    }
                    this.updateScreens((byte) 62, true);
                  }
                }
              }
            } else {
              if (PointerTrailBubble.field_s == 0) {
                var2 = InsetTextPainter.pollFullscreenPromptAction(1000);
                if (var2 != 2) {
                  if (var2 != 3) {
                    if (4 == var2) {
                      GameBoard.field_f = true;
                      EmailAvailabilityValidator.startScreenTransition(LoadingScreenHelpers.field_d, 0, -308);
                    }
                  } else {
                    GameBoard.field_f = false;
                    MenuThemeHelpers.initializeMenuTheme(8, WhirlpoolHasher.field_l, (byte) 7, 2, true, 240, 8, 320, SocialTabsPanel.field_b.field_K + SocialTabsPanel.field_b.field_u, SocialTabsPanel.field_b.field_u, SocialTabsPanel.field_b, WhirlpoolHasher.field_l);
                  }
                } else {
                  QuickChatCategory.exitFullscreen((byte) 67);
                }
                this.updateScreens((byte) 62, true);
              } else {
                this.updateScreens((byte) 62, false);
              }
            }
          }
        }
        while (ProxyAuthenticationRequiredException.pollIncomingPacket(-19161, IntrusiveDeque.field_b)) {
          stackIn_155_0 = CommonUiHelpers.field_c;
          stackIn_155_1 = 9;
          if (stackIn_155_0 == stackIn_155_1) {
            LinkTextPainter.commitScreenChange(0);
            DualLinkDeque.field_e = false;
            DraggableWidget.field_O = 9;
            MenuScreen.field_g = 2;
            TransitionPhase.field_d = 128.0f;
            SoundMixerHelpers.field_e = 3.1415927410125732f;
            NameSuggestionsPanel.field_R = BackgroundSparkle.field_q.readString((byte) 81);
            continue;
          }
          if (CommonUiHelpers.field_c == 14) {
            DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
            LinkTextPainter.commitScreenChange(0);
            NameAvailabilityValidator.initializeLobbyState((byte) -58, 1024, SoundEffectLibrary.getLobbyPlayerListContent(true), DialWidgetPainter.nextPowerOfTwo(2, (byte) -108), StatefulWidgetRenderer.field_s.length, DiskCacheWorker.getLobbyScrollContent((byte) -95), StatusRequestHelpers.field_a, ClientException.getGameListContent(12), 150, DialWidgetPainter.nextPowerOfTwo(2000, (byte) -51));
            LabelPairWidget.bindSocialLists(ThreeSliceButtonPainter.getFriendListContent(false), GameClock.getIgnoreListContent(32), 0);
            LabelPairWidget.field_Pb = true;
            DraggableWidget.field_O = -2;
            DualLinkDeque.field_e = false;
            continue;
          }
          if (CommonUiHelpers.field_c == 15) {
            if (LabelPairWidget.field_Pb) {
              LinkTextPainter.commitScreenChange(0);
              SparkParticle.resetSessionScreens((byte) -98);
              EditableTextWidget.clearChatHistory((byte) -126);
              DraggableWidget.field_O = 0;
              AccountServerResult.field_a = false;
              EditableTextWidget.field_X = false;
              DateOfBirthValidator.field_k = true;
              AnimationSequence.field_g = true;
              LabelPairWidget.field_Pb = false;
              NetworkGameClient.field_s = false;
              DualLinkNodeHashTable.setScreenCentre(320, 240, (byte) -121);
              DialWidget.field_P = null;
              if (ContextMenu.field_bc != null &&
                ContextMenu.field_bc.field_i == 1) {
                stackIn_72_0 = 0.0;
              } else {
                stackIn_72_0 = 3.141592653589793;
              }
              WidgetNode.field_x = (float)stackIn_72_0;
              RandomAccessCacheFile.resetCameraToTarget(-113, false);
              LobbyResourceHelpers.field_g[0] = (double)LoadingResourceHelpers.field_d * Math.sin((double)NodeHashTable.field_h);
              LobbyResourceHelpers.field_g[2] = (double)LoadingResourceHelpers.field_d * Math.cos((double)NodeHashTable.field_h);
              DelegatingCanvas.createGameOptions(true, -7869);
              CameraAndChatHelpers.updateCameraMatrix(-20);
            }
            ChatMessage.field_o = false;
            DualLinkDeque.field_e = false;
            continue;
          }
          if (CommonUiHelpers.field_c == 10 &&
            LabelPairWidget.field_Pb) {
            SocialListPacketHandler.handleSocialListPacket((byte) -7);
            continue;
          }
          if (67 == CommonUiHelpers.field_c) {
            var2Lifetime1 = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
            var3 = 1 << var2Lifetime1;
            QuickChatCategoryCache.field_a = QuickChatCategoryCache.field_a | var3;
            this.notificationQueue.addLast(new NotificationToast(var2Lifetime1), false);
            continue;
          }
          if (CommonUiHelpers.field_c != 57 &&
            CommonUiHelpers.field_c != 58) {
            if (CommonUiHelpers.field_c == 59) {
              if (NetworkGameClient.field_s ||
                AccountServerResult.field_a) {
                LinkTextPainter.commitScreenChange(0);
                if (NetworkGameClient.field_s) {
                  ContextMenu.field_bc.exitToMainMenu(true, false);
                }
                DelegatingCanvas.createGameOptions(true, -7869);
                NetworkGameClient.field_s = false;
                DateOfBirthPanel.field_R = 0;
                AnimationSequence.field_g = true;
                DraggableWidget.field_O = -2;
                EditableTextWidget.field_X = false;
                AnimationSequence.field_e = true;
                AccountServerResult.field_a = false;
              }
              ChatMessage.field_o = false;
              continue;
            }
            var2_ref = null;
            if (NetworkGameClient.field_s) {
              var2_ref = ContextMenu.field_bc;
            } else {
              if (AccountServerResult.field_a) {
                var2_ref = SocialListEntry.field_Qb;
              }
            }
            if (var2_ref != null) {
              if (CommonUiHelpers.field_c == 60) {
                var3Lifetime2 = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                var4_int = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                var5 = BackgroundSparkle.field_q.readUnsignedShort(127);
                ((GameSession) (var2_ref)).field_a.setTurnState(var4_int, 18936, var3Lifetime2);
                ((GameSession) (var2_ref)).field_d = var5 - 50;
                if (((GameSession) (var2_ref)).field_a.field_g == -1) {
                  ((GameSession) (var2_ref)).field_a.field_g = var3Lifetime2;
                }
                if (((GameSession) (var2_ref)).field_d >= 1) {
                  continue;
                }
                ((GameSession) (var2_ref)).field_d = 1;
                continue;
              }
              if (CommonUiHelpers.field_c == 61) {
                var3Lifetime2Lifetime1 = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                var4_intLifetime1 = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                ((GameSession) (var2_ref)).field_a.placePiece(var4_intLifetime1 >> 3, var4_intLifetime1 & 7, var3Lifetime2Lifetime1, -28067);
                ((GameSession) (var2_ref)).field_g.queueNewPieceAnimations((byte) 56);
                continue;
              }
              if (CommonUiHelpers.field_c == 62) {
                var3Lifetime2Lifetime2 = BackgroundSparkle.field_q.readSignedByte(-1772093437);
                ((GameSession) (var2_ref)).field_a.endGame(var3Lifetime2Lifetime2, 4);
                var15 = var2_ref;
                var4 = var15;
                if (((GameSession) (var15)).field_i != -2) {
                  ((GameSession) (var15)).exitToScreen(false, -112, false, -1);
                }
                ((GameSession) (var4)).field_p = 0;
                continue;
              }
              if (CommonUiHelpers.field_c == 63) {
                ((GameSession) (var2_ref)).field_a.field_h = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                if (ContextMenu.field_bc == null) {
                  continue;
                }
                PasswordFieldPainter.updateDrawOfferCaption(63);
                continue;
              }
              if (CommonUiHelpers.field_c == 64) {
                ((GameSession) (var2_ref)).field_a.field_j = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                continue;
              }
              if (CommonUiHelpers.field_c == 65) {
                ((GameSession) (var2_ref)).field_a.field_n = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                if (null == ContextMenu.field_bc) {
                  continue;
                }
                MessageDialogContent.updateRematchCaption(1);
                continue;
              }
              if (CommonUiHelpers.field_c == 66) {
                ((GameSession) (var2_ref)).field_m = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
                if (ContextMenu.field_bc == null) {
                  continue;
                }
                MessageDialogContent.updateRematchCaption(1);
                continue;
              }
            }
            this.dispatchSharedPacket(true);
            continue;
          }
          LinkTextPainter.commitScreenChange(0);
          var2Lifetime1Lifetime1 = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
          stackIn_87_0 = (0 == BackgroundSparkle.field_q.readUnsignedByte((byte) -99)) ? 0 : 1;
          var3Lifetime3 = stackIn_87_0;
          var11 = new String[2];
          var4_array = var11;
          var5Lifetime1 = -2;
          for (var6_int = 0; var6_int < var11.length; var6_int++) {
            var4_array[var6_int] = BackgroundSparkle.field_q.readZeroPrefixedString(true);
            stackIn_155_0Lifetime2 = CommonUiHelpers.field_c;
            stackIn_155_1Lifetime2 = 57;
            if (stackIn_155_0Lifetime2 == stackIn_155_1Lifetime2 &&
              PieceDropAnimation.matchesNormalizedSessionName(var11[var6_int], 4)) {
              var5Lifetime1 = var6_int;
            }
          }
          var6 = new GameSession(true, var2Lifetime1Lifetime1, var11, var5Lifetime1, var3Lifetime3 != 0);
          var6.field_a.readBoardState(BackgroundSparkle.field_q, -7);
          var6.field_g.resetToBoard(31);
          if (CommonUiHelpers.field_c != 57) {
            SocialListEntry.field_Qb = var6;
            AccountServerResult.field_a = true;
            var7 = var6.field_a.field_o[0];
            var8 = var6.field_a.field_o[1];
            var14 = SectorCacheStore.formatTemplate(new String[]{var7, var8}, NameEntryKeyHelpers.field_b, 123);
            AccountCreationDialog.addChatMessage(0, 0, NetworkGameClient.field_w, 1, var14, var6.field_a.field_o[0]);
          } else {
            NetworkGameClient.field_s = true;
            ContextMenu.field_bc = var6;
            if (var6.field_c) {
              var7 = var6.field_a.field_o[0];
              var8_int = 0;
              while (PieceDropAnimation.matchesNormalizedSessionName(var7, 4)) {
                var8_int++;
                var7 = var6.field_a.field_o[var8_int];
              }
              var12 = SectorCacheStore.formatTemplate(new String[]{var7}, TriangleMesh.field_w, 119);
              AccountCreationDialog.addChatMessage(0, 0, NetworkGameClient.field_w, 1, var12, var6.field_a.field_o[0]);
            }
            array$1 = new String[1];
            stackIn_103_0 = array$1;
            stackIn_103_1 = array$1;
            stackIn_103_2 = 0;
            if (0 == var5Lifetime1) {
              stackIn_104_3 = PacketBuffer.field_s;
            } else {
              stackIn_104_3 = NotificationToast.field_t;
            }
            stackIn_103_1[stackIn_103_2] = stackIn_104_3;
            var13 = SectorCacheStore.formatTemplate(stackIn_103_0, BufferedSocket.field_e, 119);
            AccountCreationDialog.addChatMessage(0, 0, NetworkGameClient.field_w, 1, var13, var6.field_a.field_o[0]);
          }
          SectorCacheStore.startNewGameScene(0);
          ChatMessage.field_o = false;
          DraggableWidget.field_O = -1;
          EditableTextWidget.field_X = true;
        }
        PacketFlushHelpers.flushPackets((byte) -95, 0);
        stackIn_155_0Lifetime1 = -2;
        stackIn_155_1Lifetime1 = BackgroundSparkle.field_t;
        if (stackIn_155_0Lifetime1 == stackIn_155_1Lifetime1) {
          AnimationSequence.field_e = true;
        }
        if (param0 <= 12) {
          field_O = (String) null;
        }
        if (AnimationSequence.field_e) {
          DateOfBirthPanel.field_R = 0;
        }
        if (SocketConnector.isSessionDisconnected(-25945)) {
          var2Lifetime2 = this.pollReconnect(-1);
          if (var2Lifetime2 == 0 ||
            1 == var2Lifetime2) {
            ValidationMessageWidget.resendPendingQueries(true, 4);
            FullscreenErrorDialog.resendQueuedRequests(true, 7);
            TextButton.resetReflectionCheckQueue((byte) 82);
            if (var2Lifetime2 != 1) {
              if (LabelPairWidget.field_Pb) {
                AnimationSequence.field_g = true;
                EditableTextWidget.field_X = false;
                DateOfBirthValidator.field_k = true;
                if (NetworkGameClient.field_s) {
                  NameSuggestionsPanel.field_R = CaptionedContainer.field_T;
                  ScreenSwitchHelpers.switchScreen(9, -122, false, 0);
                } else {
                  ScreenSwitchHelpers.switchScreen(0, -93, false, 0);
                }
                LinkTextPainter.commitScreenChange(0);
                DelegatingCanvas.createGameOptions(true, -7869);
                MarkerSlider.field_X[BackgroundSparkle.field_t].updatePointerSelection(false, 0, -1);
                LabelPairWidget.field_Pb = false;
                AccountServerResult.field_a = false;
                NetworkGameClient.field_s = false;
              }
              DualLinkDeque.field_e = false;
              ChatMessage.field_o = false;
            } else {
              ChatMessage.field_o = true;
              DualLinkDeque.field_e = true;
            }
          }
          var3Lifetime1 = 0;
          if (var2Lifetime2 == 2) {
            var3Lifetime1 = 1;
          }
          if (LabelPairWidget.field_Pb ||
            DualLinkDeque.field_e ||
            ChatMessage.field_o) {
            var3Lifetime1 = 1;
          }
          if (var3Lifetime1 != 0) {
            LoginDialog.advanceToLoginRequest(27112);
          }
        }
        return;
    }

    private final void renderHighDetailFrame(int param0) {
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int var2 = 0;
        int var3 = 0;
        Model var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        PointerTrailBubble var11_ref_ko = null;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        PointerTrailBubble var12_ref_ko = null;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        SparkParticle var15 = null;
        int var16 = 0;
        int[] var17 = null;
        Object var18 = null;
        Model var18_ref = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        PointerTrailBubble var12_ref_koLifetime1;
        int stackIn_64_0Lifetime1;
        int stackIn_64_1Lifetime1;
        int stackIn_74_0Lifetime1;
        int stackIn_74_1Lifetime1;
        int var5Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15_intLifetime1;
        int var11Lifetime1Lifetime1;
        var18 = null;
        var16 = field_J;
        var3 = 72 / ((param0 - 23) / 54);
        var2 = 1;
        if (~BackgroundSparkle.field_t == ~DraggableWidget.field_O &&
          JoinStatusTextHelpers.field_h == LoginCredentials.field_a) {
          if (BackgroundSparkle.field_t != -2) {
            ScreenDrawHelpers.drawCurrentScreen(7230, -1, LoginCredentials.field_a, true, BackgroundSparkle.field_t);
          } else {
            var2 = 0;
            ReflectionCheckHelpers.clearScreen(1, false);
          }
        } else {
          if (BackgroundSparkle.field_t != -2) {
            if (DraggableWidget.field_O != -2) {
              if (EmailAvailabilityValidator.field_v < 16) {
                ScreenDrawHelpers.drawCurrentScreen(7230, EmailAvailabilityValidator.field_v + 1, LoginCredentials.field_a, false, BackgroundSparkle.field_t);
              } else {
                ScreenDrawHelpers.drawCurrentScreen(7230, -EmailAvailabilityValidator.field_v + 32 + 1, JoinStatusTextHelpers.field_h, false, DraggableWidget.field_O);
              }
            } else {
              if (16 > EmailAvailabilityValidator.field_v) {
                ScreenDrawHelpers.drawCurrentScreen(7230, -1, LoginCredentials.field_a, false, BackgroundSparkle.field_t);
              } else {
                var2 = 0;
                ReflectionCheckHelpers.clearScreen(1, false);
              }
            }
          } else {
            if (16 <= EmailAvailabilityValidator.field_v) {
              ScreenDrawHelpers.drawCurrentScreen(7230, -1, JoinStatusTextHelpers.field_h, false, DraggableWidget.field_O);
            } else {
              var2 = 0;
              ReflectionCheckHelpers.clearScreen(1, false);
            }
          }
        }
        var4 = InsetTextPainter.field_w;
        if (PendingStatQuery.hasFeatureBit(0, (byte) 110)) {
          var5 = VerticalScrollbar.field_Xb >> 3;
          var6 = QuickChatMenu.sineFixed(var5, -28583);
          var7_int = CommonUiHelpers.sineFixed(82, var5);
          var8_int = var6 * 300 >> 16;
          var9_int = var7_int * 300 >> 16;
          var10 = 210;
          if (!DualLinkDeque.field_a) {
            var5 = var5 - (OpacityWidget.field_S << 6);
          } else {
            var5 = var5 + (OpacityWidget.field_S << 6);
          }
          var6 = QuickChatMenu.sineFixed(var5, -28583);
          var7_int = CommonUiHelpers.sineFixed(-122, var5);
          MusicPatch.field_s = new int[]{var8_int, var10, var9_int, var7_int, 0, -var6, 0, 65536, 0, var6, 0, var7_int};
          var18_ref = (Model) (ScreenSwitchHelpers.field_a.applyCurrentFrame(false, -37, WeightedLruCache.field_l, true));
          var18_ref.transform(MusicPatch.field_s);
          var4 = new Model(new Model[]{var4, var18_ref}, 2);
        }
        EmailSyntaxValidator.field_t = new Model();
        DirectByteStorage.field_g = new Model();
        ModelMergeHelpers.mergeModelGeometry(DirectByteStorage.field_g, 0, 0, EmailSyntaxValidator.field_t, 0, RasterTargetHelpers.field_b[10] >> 10, 100, var4, RasterTargetHelpers.field_b[11] >> 10, RasterTargetHelpers.field_b[9] >> 10);
        if (var2 != 0) {
          SoftwareRasterizer.fillRectangle(0, 0, 640, 480, 3158064);
          var5Lifetime1 = (LruTextureCache.field_e % 20480 << 12) % 83886080;
          CameraProjectionMath.drawPerspectiveTexturedQuad(LongAndTextCredentials.field_h, new double[]{-768.0, 20.0, 0.0}, new double[]{0.0, 0.0, 1.0}, 600.0, 200.0, TextureCache.field_i, 23967451 + var5Lifetime1, 59918628 + var5Lifetime1, 0, 16711680, WidgetTheme.field_i.field_g);
          CameraProjectionMath.drawPerspectiveTexturedQuad(LongAndTextCredentials.field_h, new double[]{-768.0 + 400.0 * Renderable.field_b, 20.0, 400.0 * Renderable.field_b + 600.0}, new double[]{Renderable.field_b, 0.0, Renderable.field_b}, 400.0, 200.0, TextureCache.field_i, var5Lifetime1 + 59918628, 83820544 + var5Lifetime1, 0, 16711680, WidgetTheme.field_i.field_g);
          CameraProjectionMath.drawPerspectiveTexturedQuad(LongAndTextCredentials.field_h, new double[]{400.0 * Renderable.field_b - 768.0, 20.0, -(600.0 + Renderable.field_b * 400.0)}, new double[]{-Renderable.field_b, 0.0, Renderable.field_b}, 400.0, 200.0, TextureCache.field_i, var5Lifetime1, var5Lifetime1 + 23967451, 0, 16711680, WidgetTheme.field_i.field_g);
          GameOptionControls.renderParticleTexture(LoadingStageHook.field_d, (byte) -121);
          CameraProjectionMath.drawPerspectiveTexturedQuad(LongAndTextCredentials.field_h, new double[]{420.0, 20.0, 0.0}, new double[]{0.0, 0.0, -1.0}, 100.0, 200.0, LoadingStageHook.field_d, 2621440, 10420224, 10485760, 26148864, WidgetTheme.field_i.field_g);
          EmailSyntaxValidator.field_t.drawTransformed(RasterTargetHelpers.field_b, LobbyResourceHelpers.field_d);
          var6 = LruTextureCache.field_e % 64;
          if (var6 >= 32) {
            stackIn_26_0 = 48 - var6;
          } else {
            stackIn_26_0 = var6 - 16;
          }
          var6 = stackIn_26_0;
          var6 = var6 << 2;
          if (WidgetTheme.field_i.field_n) {
            var6 = 0;
          }
          var28 = new int[3];
          var21 = var28;
          var7 = var21;
          var26 = new int[3];
          var19 = var26;
          var8 = var19;
          var7[0] = (int)MenuThemeHelpers.field_c << 4;
          var27 = new int[3];
          var20 = var27;
          var9 = var20;
          var26[0] = 800;
          var27[0] = var6;
          var7[1] = -(int)MenuThemeHelpers.field_c << 4;
          var26[1] = 800;
          var27[1] = var6;
          var28[2] = 0;
          var26[2] = 1280;
          var27[2] = 0;
          CameraProjectionMath.transformTriangleToCamera(RasterTargetHelpers.field_b, var28, var26, var27);
          if (WidgetTheme.field_i.field_j) {
            var10 = LruTextureCache.field_e % 128;
            if (var10 < 64) {
              stackIn_32_0 = var10;
            } else {
              stackIn_32_0 = 128 - var10;
            }
            var10 = stackIn_32_0;
            var11 = var10 * 2 + 38784;
            ClippedTriangleRenderer.drawTriangle(240, 0, 0, var28, var26, var27, var11, var11, var11);
            var6 = var28[0];
            var7[0] = var28[1];
            var28[1] = var6;
            var6 = var26[0];
            var8[0] = var26[1];
            var26[1] = var6;
            var6 = var27[0];
            var9[0] = var27[1];
            var27[1] = var6;
            ClippedTriangleRenderer.drawTriangle(240, 0, 0, var28, var26, var27, var11, var11, var11);
          }
          if (WidgetTheme.field_i.field_n) {
            var31 = VerticalScrollbar.field_Lb.field_C;
            var24 = var31;
            var17 = var24;
            var32 = var17;
            var25 = var32;
            var10_ref_int__ = var25;
            if (SectorCacheStore.field_c > 0) {
              var14 = -SectorCacheStore.field_c + 256;
              var13 = 256000;
              while (var13 > 0) {
                var13--;
                var12 = var31[var13];
                var11Lifetime1 = var12 & 16711935;
                var12 = var12 & 65280;
                var11Lifetime1 = var11Lifetime1 * var14;
                var12 = var12 * var14;
                var11Lifetime1 = var11Lifetime1 & -16711936;
                var12 = var12 & 16711680;
                var11Lifetime1 = var11Lifetime1 + (16711935 * SectorCacheStore.field_c & -16711936);
                var12 = var12 + (16711680 & SectorCacheStore.field_c * 65280);
                var17[var13] = IntrusiveNode.bitOr(var12, var11Lifetime1) >>> 8;
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (128.0f >= LoadingResourceHelpers.field_d) {
              var12 = 200;
              while (0 < var12) {
                var12--;
                var13 = var12 * 1280;
                var11Lifetime1Lifetime1 = 640;
                while (true) {
                  var11Lifetime1Lifetime1--;
                  if (0 >= var11Lifetime1Lifetime1) {
                    break;
                  }
                  var10_ref_int__[var13] = StatusRequestHelpers.bitAnd(var32[var13], 16711422);
                  var10_ref_int__[var13] = var10_ref_int__[var13] >> 1;
                  var13++;
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (!(256.0f >= LoadingResourceHelpers.field_d)) {
                var11Lifetime1Lifetime1 = 256000;
                while (var11Lifetime1Lifetime1 > 0) {
                  var11Lifetime1Lifetime1--;
                  var10_ref_int__[var11Lifetime1Lifetime1] = StatusRequestHelpers.bitAnd(var32[var11Lifetime1Lifetime1], 16579836);
                  var10_ref_int__[var11Lifetime1Lifetime1] = var10_ref_int__[var11Lifetime1Lifetime1] >> 2;
                  var10_ref_int__[var11Lifetime1Lifetime1] = var10_ref_int__[var11Lifetime1Lifetime1] * 3;
                }
              } else {
                var12 = 100;
                while (var12 > 0) {
                  var12--;
                  var13 = var12 * 2560;
                  var11Lifetime1Lifetime1 = 1280;
                  while (true) {
                    var11Lifetime1Lifetime1--;
                    if (var11Lifetime1Lifetime1 <= 0) {
                      break;
                    }
                    var10_ref_int__[var13] = StatusRequestHelpers.bitAnd(var32[var13], 16711422);
                    var10_ref_int__[var13] = var10_ref_int__[var13] >> 1;
                    var13++;
                  }
                }
              }
            }
            RasterTargetHelpers.setSpriteRasterTarget(VerticalScrollbar.field_Lb, 6);
            var11_ref_ko = (PointerTrailBubble) (ArrayWidgetContainer.field_J.first(false));
            while (var11_ref_ko != null) {
              RasterEffectHelpers.drawBubbleDistortion(var11_ref_ko.field_r, var11_ref_ko.field_p, var11_ref_ko.field_n << 3, 10000);
              var11_ref_ko = (PointerTrailBubble) (ArrayWidgetContainer.field_J.next((byte) -70));
            }
            if (10 == BackgroundSparkle.field_t) {
              this.drawTitleWaveEffect((byte) 85);
            }
            HuffmanCodec.popRasterTarget(true);
            if (10 != BackgroundSparkle.field_t) {
              if (LongAndTextCredentials.field_h[11] < 0.0) {
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, VerticalScrollbar.field_Lb, 529, 110, 0, 399, WidgetTheme.field_i.field_g, true);
              } else {
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, VerticalScrollbar.field_Lb, 110, 529, 0, 399, WidgetTheme.field_i.field_g, true);
              }
              if (!(0 >= WidgetTheme.field_i.field_l)) {
                CameraProjectionMath.drawGlowingQuadOutline(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, IndexedSpriteState.field_n, 40, WidgetTheme.field_i.field_l);
              }
            } else {
              if (LongAndTextCredentials.field_h[11] < 0.0) {
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)(MenuThemeHelpers.field_c * 22.0f / 21.0f), (double)CachedArchiveSource.field_y, VerticalScrollbar.field_Lb, 529, 110, 0, 399, WidgetTheme.field_i.field_g, true);
              } else {
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)(22.0f * MenuThemeHelpers.field_c / 21.0f), (double)CachedArchiveSource.field_y, VerticalScrollbar.field_Lb, 110, 529, 0, 399, WidgetTheme.field_i.field_g, true);
              }
              if (!(WidgetTheme.field_i.field_l <= 0)) {
                CameraProjectionMath.drawGlowingQuadOutline(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, IndexedSpriteState.field_n, 1 + (int)(MenuThemeHelpers.field_c / 1.3125f), (int)(MenuThemeHelpers.field_c / 1.100000023841858f));
              }
            }
          } else {
            var29 = VerticalScrollbar.field_Lb.field_C;
            var22 = var29;
            var10_ref_int__ = var22;
            var30 = NetworkArchiveRequest.field_M.field_C;
            var23 = var30;
            var11_ref_int__ = var23;
            if (SectorCacheStore.field_c > 0) {
              var12 = 256 - SectorCacheStore.field_c;
              var15_int = 256000;
              while (var15_int > 0) {
                var15_int--;
                var14 = VerticalScrollbar.field_Lb.field_C[var15_int];
                var13 = 16711935 & var14;
                var14 = 65280 & var14;
                var13 = var13 * var12;
                var14 = var14 * var12;
                var13 = var13 & -16711936;
                var13 = var13 + (SectorCacheStore.field_c * 16711935 & -16711936);
                var14 = var14 & 16711680;
                var14 = var14 + (16711680 & 65280 * SectorCacheStore.field_c);
                VerticalScrollbar.field_Lb.field_C[var15_int] = IntrusiveNode.bitOr(var14, var13) >>> 8;
              }
              var15_intLifetime1 = 256000;
              while (var15_intLifetime1 > 0) {
                var15_intLifetime1--;
                var14 = NetworkArchiveRequest.field_M.field_C[var15_intLifetime1];
                var13 = var14 & 16711935;
                var13 = var13 * var12;
                var14 = var14 & 65280;
                var13 = var13 & -16711936;
                var14 = var14 * var12;
                var13 = var13 + (SectorCacheStore.field_c * 16711935 & -16711936);
                var14 = var14 & 16711680;
                var14 = var14 + (SectorCacheStore.field_c * 65280 & 16711680);
                NetworkArchiveRequest.field_M.field_C[var15_intLifetime1] = IntrusiveNode.bitOr(var13, var14) >>> 8;
              }
            }
            boolean decompiledFrameCompleted0 = true;
            if (LoadingResourceHelpers.field_d <= 128.0f) {
              var13 = 110;
              var14 = -200;
              while (var14 < 0) {
                var12 = 420;
                while (true) {
                  var12--;
                  if (var12 < 0) {
                    var13 += 860;
                    var14++;
                    break;
                  }
                  var10_ref_int__[var13] = StatusRequestHelpers.bitAnd(var29[var13], 16711422);
                  var10_ref_int__[var13] = var10_ref_int__[var13] >> 1;
                  if (var30[var13] != 16777215) {
                    var11_ref_int__[var13] = StatusRequestHelpers.bitAnd(var30[var13], 16711422);
                    var11_ref_int__[var13] = var11_ref_int__[var13] >> 1;
                  } else {
                    var11_ref_int__[var13] = 13619151;
                  }
                  var13++;
                }
              }
            } else {
              if (!(256.0f >= LoadingResourceHelpers.field_d)) {
                var12 = 255890;
                var13 = 400;
                while (true) {
                  var13--;
                  if (0 >= var13) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var14 = 421;
                  while (true) {
                    var14--;
                    if (var14 <= 0) {
                      var12 -= 220;
                      break;
                    }
                    var12--;
                    var10_ref_int__[var12] = (StatusRequestHelpers.bitAnd(16579836, var29[var12]) >> 2) * 3;
                    stackIn_59_0 = var11_ref_int__;
                    stackIn_59_1 = var12;
                    if (var30[var12] == 16777215) {
                      stackIn_60_2 = 15263976;
                    } else {
                      stackIn_60_2 = 3 * (StatusRequestHelpers.bitAnd(16579836, var30[var12]) >> 2);
                    }
                    stackIn_59_0[stackIn_59_1] = stackIn_60_2;
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                var13 = 110;
                var14 = -100;
                while (true) {
                  stackIn_64_0 = -1;
                  stackIn_64_1 = ~var14;
                  if (stackIn_64_0 >= stackIn_64_1) {
                    break;
                  }
                  var12 = 420;
                  while (true) {
                    var12--;
                    if (var12 >= 0) {
                      var10_ref_int__[var13] = StatusRequestHelpers.bitAnd(var29[var13] >> 1, 8355711);
                      stackIn_74_0 = 16777215;
                      stackIn_74_1 = var30[var13];
                      if (stackIn_74_0 != stackIn_74_1) {
                        var11_ref_int__[var13] = StatusRequestHelpers.bitAnd(var30[var13], 16711422);
                        var11_ref_int__[var13] = var11_ref_int__[var13] >> 1;
                      } else {
                        var11_ref_int__[var13] = 13619151;
                      }
                      var13++;
                      continue;
                    }
                    break;
                  }
                  var12 = 420;
                  var13 += 220;
                  while (true) {
                    var12--;
                    stackIn_74_0Lifetime1 = ~var12;
                    stackIn_74_1Lifetime1 = -1;
                    if (stackIn_74_0Lifetime1 > stackIn_74_1Lifetime1) {
                      break;
                    }
                    var10_ref_int__[var13] = StatusRequestHelpers.bitAnd(8355711, var29[var13] >> 1);
                    stackIn_64_0Lifetime1 = -16777216;
                    stackIn_64_1Lifetime1 = ~var30[var13];
                    if (stackIn_64_0Lifetime1 == stackIn_64_1Lifetime1) {
                      var11_ref_int__[var13] = 13619151;
                    } else {
                      var11_ref_int__[var13] = StatusRequestHelpers.bitAnd(var30[var13], 16711422);
                      var11_ref_int__[var13] = var11_ref_int__[var13] >> 1;
                    }
                    var13++;
                  }
                  var13 += 1500;
                  var14++;
                }
              }
            }
            RasterTargetHelpers.setSpriteRasterTarget(VerticalScrollbar.field_Lb, 6);
            var12_ref_ko = (PointerTrailBubble) (ArrayWidgetContainer.field_J.first(false));
            while (var12_ref_ko != null) {
              RasterEffectHelpers.drawBubbleDistortion(var12_ref_ko.field_r, var12_ref_ko.field_p, var12_ref_ko.field_n << 3, 10000);
              var12_ref_ko = (PointerTrailBubble) (ArrayWidgetContainer.field_J.next((byte) -70));
            }
            if (BackgroundSparkle.field_t == 10) {
              this.drawTitleWaveEffect((byte) 122);
            }
            NetworkArchiveRequest.field_M.makeRasterTarget();
            var12_ref_koLifetime1 = (PointerTrailBubble) (ArrayWidgetContainer.field_J.first(false));
            while (var12_ref_koLifetime1 != null) {
              RasterEffectHelpers.drawBubbleDistortion(var12_ref_koLifetime1.field_r, var12_ref_koLifetime1.field_p, var12_ref_koLifetime1.field_n << 3, 10000);
              var12_ref_koLifetime1 = (PointerTrailBubble) (ArrayWidgetContainer.field_J.next((byte) -70));
            }
            if (BackgroundSparkle.field_t == 10) {
              this.drawTitleWaveEffect((byte) 99);
            }
            HuffmanCodec.popRasterTarget(true);
            if (10 != BackgroundSparkle.field_t) {
              if (LongAndTextCredentials.field_h[11] < 0.0) {
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, (double)(-InputDetachHelpers.field_e >> 16)}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, NetworkArchiveRequest.field_M, 529, 110, 0, 399, WidgetTheme.field_i.field_g, false);
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, VerticalScrollbar.field_Lb, 529, 110, 0, 399, WidgetTheme.field_i.field_g, false);
                if (WidgetTheme.field_i.field_l > 0) {
                  CameraProjectionMath.drawGlowingQuadOutline(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, IndexedSpriteState.field_n, 40, WidgetTheme.field_i.field_l);
                }
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, (double)(InputDetachHelpers.field_e >> 16)}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, NetworkArchiveRequest.field_M, 529, 110, 0, 399, WidgetTheme.field_i.field_g, false);
              } else {
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, (double)(InputDetachHelpers.field_e >> 16)}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, NetworkArchiveRequest.field_M, 110, 529, 0, 399, WidgetTheme.field_i.field_g, false);
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, VerticalScrollbar.field_Lb, 110, 529, 0, 399, WidgetTheme.field_i.field_g, false);
                if (WidgetTheme.field_i.field_l > 0) {
                  CameraProjectionMath.drawGlowingQuadOutline(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, IndexedSpriteState.field_n, 40, WidgetTheme.field_i.field_l);
                }
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, (double)(-InputDetachHelpers.field_e >> 16)}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, NetworkArchiveRequest.field_M, 110, 529, 0, 399, WidgetTheme.field_i.field_g, false);
              }
            } else {
              if (!(LongAndTextCredentials.field_h[11] < 0.0)) {
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, (double)(InputDetachHelpers.field_e >> 16)}, TextLayout.field_d, (double)(22.0f * MenuThemeHelpers.field_c / 21.0f), (double)CachedArchiveSource.field_y, NetworkArchiveRequest.field_M, 100, 539, 0, 399, WidgetTheme.field_i.field_g, false);
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)(22.0f * MenuThemeHelpers.field_c / 21.0f), (double)CachedArchiveSource.field_y, VerticalScrollbar.field_Lb, 100, 539, 0, 399, WidgetTheme.field_i.field_g, false);
                if (WidgetTheme.field_i.field_l > 0) {
                  CameraProjectionMath.drawGlowingQuadOutline(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, IndexedSpriteState.field_n, 1 + (int)(MenuThemeHelpers.field_c / 1.3125f), (int)(MenuThemeHelpers.field_c / 1.100000023841858f));
                }
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, (double)(-InputDetachHelpers.field_e >> 16)}, TextLayout.field_d, (double)(22.0f * MenuThemeHelpers.field_c / 21.0f), (double)CachedArchiveSource.field_y, NetworkArchiveRequest.field_M, 100, 539, 0, 399, WidgetTheme.field_i.field_g, false);
              } else {
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, (double)(-InputDetachHelpers.field_e >> 16)}, TextLayout.field_d, (double)(22.0f * MenuThemeHelpers.field_c / 21.0f), (double)CachedArchiveSource.field_y, NetworkArchiveRequest.field_M, 539, 100, 0, 399, WidgetTheme.field_i.field_g, false);
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)(22.0f * MenuThemeHelpers.field_c / 21.0f), (double)CachedArchiveSource.field_y, VerticalScrollbar.field_Lb, 539, 100, 0, 399, WidgetTheme.field_i.field_g, false);
                if (0 < WidgetTheme.field_i.field_l) {
                  CameraProjectionMath.drawGlowingQuadOutline(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, 0.0}, TextLayout.field_d, (double)MenuThemeHelpers.field_c, (double)CachedArchiveSource.field_y, IndexedSpriteState.field_n, 1 + (int)(MenuThemeHelpers.field_c / 1.3125f), (int)(MenuThemeHelpers.field_c / 1.100000023841858f));
                }
                CameraProjectionMath.drawPerspectiveTexturedQuadClipped(LongAndTextCredentials.field_h, new double[]{0.0, 0.0, (double)(InputDetachHelpers.field_e >> 16)}, TextLayout.field_d, (double)(22.0f * MenuThemeHelpers.field_c / 21.0f), (double)CachedArchiveSource.field_y, NetworkArchiveRequest.field_M, 539, 100, 0, 399, WidgetTheme.field_i.field_g, false);
              }
            }
            if (var27[2] > 0) {
              SoftwareRasterizer.fillRadialPaletteCircle((SpriteState.field_G << 4) + (var28[2] << 11) / var27[2], (var26[2] << 13) / var27[2] + (RegistrationResponseHelpers.field_a << 4), 65536 / var27[2], 255, IndexedSpriteState.field_n);
            }
          }
          var15 = (SparkParticle) (QuickChatHelpDialog.field_Sb.first(false));
          while (var15 != null) {
            var6 = (var15.field_y >> 8) - (RasterTargetHelpers.field_b[2] << 6);
            var10 = (var15.field_t >> 8) - (RasterTargetHelpers.field_b[0] << 6);
            var11Lifetime2 = -(RasterTargetHelpers.field_b[1] << 6) + (var15.field_v >> 8);
            var14Lifetime1 = RasterTargetHelpers.field_b[9] * var10 + (RasterTargetHelpers.field_b[10] * var11Lifetime2 + RasterTargetHelpers.field_b[11] * var6);
            var13Lifetime1 = var6 * RasterTargetHelpers.field_b[8] + var11Lifetime2 * RasterTargetHelpers.field_b[7] + RasterTargetHelpers.field_b[6] * var10;
            var12Lifetime1 = RasterTargetHelpers.field_b[5] * var6 + var10 * RasterTargetHelpers.field_b[3] + RasterTargetHelpers.field_b[4] * var11Lifetime2;
            var6 = var14Lifetime1 >> 22;
            if (var14Lifetime1 > 0) {
              SoftwareRasterizer.fillRadialPaletteCircle((SpriteState.field_G << 4) + (var12Lifetime1 >> 9) / var6, (RegistrationResponseHelpers.field_a << 4) + (var13Lifetime1 >> 9) / var6, 16384 / var6, 5 * var15.field_s / 3, IndexedSpriteState.field_n);
            }
            var15 = (SparkParticle) (QuickChatHelpDialog.field_Sb.next((byte) -70));
          }
          DirectByteStorage.field_g.drawTransformed(RasterTargetHelpers.field_b, LobbyResourceHelpers.field_d);
        }
    }

    final static String readCookie(String param0, int param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
          String stackIn_10_0 = null;
          Object stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = field_J;
          try {
            try {
              if (param1 != -28536) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var3 = (String) (JavaScriptBridge.callJavaScript((byte) 121, "getcookies", param2));
              var4 = TextLayout.split(var3, ';', 783);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_10_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_10_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_15_0 = null;
            return (String) (stackIn_15_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var3_ref2;
            stackIn_18_1 = new StringBuilder().append("TetraLink.M(");
            if (param0 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void updateScreens(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_46_0 = 0;
        int stackIn_84_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String[] var8;
        int var4Lifetime1;
        boolean stackIn_38_0Lifetime1;
        var7 = field_J;
        if (PointerTrailBubble.field_s != 0) {
          if (1 == PointerTrailBubble.field_s) {
            ArchiveFactoryHelpers.field_i = ArchiveFactoryHelpers.field_i + 1;
            if (ArchiveFactoryHelpers.field_i == 16) {
              if (GameBoard.field_f) {
                SharedPanelFactory.reopenLoginPanel((byte) 117);
              } else {
                GameSession.returnToLoginStage((byte) -123);
              }
              PointerTrailBubble.field_s = 2;
            }
          } else {
            if (PointerTrailBubble.field_s == 2) {
              if (!LoadingProgressDialog.isKeyboardIdle(-103)) {
                DraggableWidget.field_O = PasswordFieldPainter.field_x;
                FadingModalPanel.dismissPromptDialog(param0 - 21781);
                if (GameBoard.field_f) {
                  GameBoard.field_f = false;
                  MenuThemeHelpers.initializeMenuTheme(8, WhirlpoolHasher.field_l, (byte) 7, 2, false, 240, 8, 320, SocialTabsPanel.field_b.field_u + SocialTabsPanel.field_b.field_K, SocialTabsPanel.field_b.field_u, SocialTabsPanel.field_b, WhirlpoolHasher.field_l);
                }
                if (LoadingScreenRenderHelpers.field_d) {
                  var3 = PlayerContextMenu.field_d;
                  if (0 == DraggableWidget.field_O ||
                    BackgroundSparkle.field_t == 2 ||
                    BackgroundSparkle.field_t == 3 ||
                    4 == DraggableWidget.field_O ||
                    5 == DraggableWidget.field_O) {
                    var3 = DraggableWidget.field_O;
                  }
                  ScreenSwitchHelpers.switchScreen(-4, -80, false, var3);
                }
                if (AccountWelcomePanel.isNonNegative(DraggableWidget.field_O, (byte) 114)) {
                  LinkTextPainter.commitScreenChange(0);
                }
              }
              PointerTrailBubble.field_s = 3;
            } else {
              ArchiveFactoryHelpers.field_i = ArchiveFactoryHelpers.field_i - 1;
              if (ArchiveFactoryHelpers.field_i == 0) {
                PointerTrailBubble.field_s = 0;
              }
            }
          }
        } else {
          boolean decompiledFrameRemainder0 = true;
          var3 = 0;
          var4 = 0;
          if (!param1) {
            if (BackgroundSparkle.field_t == DraggableWidget.field_O &&
              ~LoginCredentials.field_a == ~JoinStatusTextHelpers.field_h) {
              if (BackgroundSparkle.field_t != -1) {
                if (BackgroundSparkle.field_t == -2) {
                  var3 = 1;
                } else {
                  if (!(!AccountWelcomePanel.isNonNegative(BackgroundSparkle.field_t, (byte) 114))) {
                    MarkerSlider.field_X[BackgroundSparkle.field_t].handleInput(param0 - 62);
                  }
                }
              } else {
                if (LabelPairWidget.field_Pb) {
                  var4 = 1;
                  var3 = 1;
                } else {
                  ContextMenu.field_bc.tick(true, (byte) 55);
                  while (KeyEventHelpers.pollKeyEvent((byte) 28)) {
                    ContextMenu.field_bc.handleEscapeKey(74);
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              EmailAvailabilityValidator.field_v = EmailAvailabilityValidator.field_v + 1;
              if (32 == EmailAvailabilityValidator.field_v) {
                LinkTextPainter.commitScreenChange(0);
              }
            }
          }
          if (LabelPairWidget.field_Pb &&
            !DualLinkDeque.field_e &&
            !ChatMessage.field_o) {
            RasterBuffer.updateLobbyAndFlushRequests(var3 != 0, -36);
            if (AccountServerResult.field_a) {
              SocialListEntry.field_Qb.tick(var4 != 0, (byte) 91);
            }
            if (NetworkGameClient.field_s) {
              ContextMenu.field_bc.tick(var4 != 0, (byte) 86);
            }
            while (KeyEventHelpers.pollKeyEvent((byte) 28)) {
              stackIn_38_0 = AnimationSequence.field_e;
              if (stackIn_38_0) {
                KeyEventHelpers.handleGlobalKey(param0 + 15718, 13, 12, 15);
              }
              if (AccountServerResult.field_a) {
                SocialListEntry.field_Qb.handleEscapeKey(71);
              }
              if (!NetworkGameClient.field_s) {
                continue;
              }
              ContextMenu.field_bc.handleEscapeKey(62);
            }
          }
          stackIn_38_0Lifetime1 = LabelPairWidget.field_Pb;
          if (!stackIn_38_0Lifetime1) {
            CommonUiHelpers.closeOverlays((byte) 123);
          }
          var5 = IsaacCipher.field_a.field_yb;
          if (AnimationSequence.field_e &&
            LabelPairWidget.field_Pb) {
            stackIn_46_0 = MatchingTextValidator.field_w;
          } else {
            stackIn_46_0 = 481;
          }
          var6 = stackIn_46_0;
          MarkerSliderPainter.field_d = MarkerSliderPainter.field_d + (-MarkerSliderPainter.field_d + (float)var6) * 0.10000000149011612f;
          if ((int)(0.5 + (double)MarkerSliderPainter.field_d) != var5) {
            LobbyGame.setChatPanelY(5, (int)MarkerSliderPainter.field_d);
            DualLinkNodeHashTable.setScreenCentre(320, ((int)(MarkerSliderPainter.field_d * 4.0f) + 240) / 9, (byte) -121);
          }
          if (this.notificationQueue.first(false) != null) {
            fieldTemp$0 = this.notificationTimer + 1;
            this.notificationTimer = this.notificationTimer + 1;
            if (fieldTemp$0 == 335) {
              this.notificationTimer = 0;
              this.notificationQueue.removeFirst(false);
            }
          }
          if (!param1) {
            LongAndTextCredentials.processGameInput(param0 - 58);
          }
        }
        if (DraggableWidget.field_O == -3) {
          var8 = new String[]{RasterStackHelpers.field_c, Renderable.field_a};
          ContextMenu.field_bc = new GameSession(false, (int) ArchiveGroupHelpers.field_b[0], var8, 0, false);
          SectorCacheStore.startNewGameScene(0);
          stackIn_84_0 = (!ReflectionCheckHelpers.field_g) ? 0 : 1;
          var4Lifetime1 = stackIn_84_0;
          ScreenSwitchHelpers.switchScreen(-1, -74, var4Lifetime1 != 0, 0);
          EditableTextWidget.field_X = true;
        }
        if (DraggableWidget.field_O == -4) {
          QuickChatHelpDialog.field_Lb.writeCipheredByte(9, (byte) -92);
          DraggableWidget.field_O = BackgroundSparkle.field_t;
          DualLinkDeque.field_e = true;
        }
        if (-5 == DraggableWidget.field_O) {
          MidiPcmStream.sendWithdrawJoinRequest(AccountWelcomePanel.field_N.getGameId(-68), -124, 11);
          DraggableWidget.field_O = BackgroundSparkle.field_t;
          ChatMessage.field_o = true;
        }
        if (param0 != 62) {
          return;
        }
        DraggableWidget.updateCameraTransition((byte) -85);
        if (ModelMergeHelpers.nextRandomInt(1000, 1692) == 0) {
          WidgetStyleLayer.createPlayingSound(24, (byte) 127, CacheEntry.field_y[ModelMergeHelpers.nextRandomInt(3, 1692)]);
        }
    }

    public final void init() {
        this.startApplet("tetralink", 18, 640);
    }

    final void onShutdown(int param0) {
        TextureCache.shutdownAudioOutputs(0);
        if (EmailAvailabilityValidator.field_u != null) {
          QuickChatCategory.exitFullscreen((byte) 46);
        }
        if (param0 != 1) {
          field_N = 104;
        }
        CheckboxWidget.shutdownSession(true);
    }

    final void onStartup(int param0) {
        this.initializeFramework(17, 2, 0, param0 ^ -20109, false, 4, 1, 17);
        MidiPcmStream var3 = new MidiPcmStream();
        var3.selectChannelBank(9, 128, (byte) -128);
        BoardAnimator.startAudioOutputs((java.awt.Component) ((Object) GameClock.field_b), 22050, var3, 1024, true, QuickChatHelpDialog.field_Pb);
        FullscreenCanvasHelpers.field_n = 8437759;
        IntrusiveDeque.field_b[61] = 2;
        NineSliceFrame.field_b = 16777215;
        ThreeSliceButtonPainter.field_w = 255;
        IntrusiveDeque.field_b[62] = 1;
        if (param0 != -20173) {
          this.onShutdown(-119);
        }
        IntrusiveDeque.field_b[67] = 1;
        IntrusiveDeque.field_b[63] = 1;
        ProgressMessageDialog.field_wb = 255;
        IntrusiveDeque.field_b[66] = 1;
        IntrusiveNode.field_b = 8437759;
        IntrusiveDeque.field_b[60] = 4;
        IntrusiveDeque.field_b[64] = 1;
        IntrusiveDeque.field_b[65] = 1;
        IntrusiveDeque.field_b[57] = -2;
        TriangleSpanHelpers.field_d = 16777215;
        IntrusiveDeque.field_b[58] = -2;
        this.enableOptionalPacketHandlers(false, true, false, true, false, false, (byte) -6);
        CachedArchiveSource.allocateChatHistory(200, 3);
        this.initScene((byte) 67);
    }

    private final void loadSceneryModels(boolean param0, Archive param1) {
        ModelData var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          TriangleRasterizer.setBrightnessAndRebuildPalette(1.0f);
          TriangleRasterizer.useRasterClip();
          JoinStatusTextHelpers.field_c = ModelData.load(param1, "", "scenery");
          if (!PendingStatQuery.hasFeatureBit(0, (byte) 117)) {
            InsetTextPainter.field_w = (Model) (JoinStatusTextHelpers.field_c.createModel(64, 728, 0, 256, 0));
          } else {
            InsetTextPainter.field_w = (Model) (JoinStatusTextHelpers.field_c.createModel(32, 2184, 0, 256, 0));
            var3 = ModelData.load(param1, "", "ghost_untextured");
            WeightedLruCache.field_l = (Model) (var3.createModel(64, 728, 0, 256, 0));
          }
          InsetTextPainter.field_w.transform(LobbyListHelpers.field_e);
          if (param0) {
            TetraLink.releaseStatics(-81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("TetraLink.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_M = null;
        field_O = null;
        if (param0 != 10297) {
          field_M = (String) null;
        }
        field_P = null;
    }

    private final void initScene(byte param0) {
        int var2 = 0;
        int var3 = field_J;
        IndexedSpriteState.field_c = 3;
        if (param0 != 67) {
          field_O = (String) null;
        }
        GameKeyHandler.field_g = 3;
        TriangleRasterizer.field_b = false;
        TextHighlightSpan.field_p = 3;
        GraphicsSettings dupTemp$0 = new GraphicsSettings();
        MenuLabelGlobals.field_d = dupTemp$0;
        WidgetTheme.field_i = dupTemp$0;
        LobbyResourceHelpers.field_g = new double[]{0.0, 0.0, -128.0};
        NodeHashTable.field_h = 3.1415927410125732f;
        WidgetNode.field_x = 3.1415927410125732f;
        GameRoomPanelHelpers.field_c = 128.0f;
        LoadingResourceHelpers.field_d = 128.0f;
        CameraAndChatHelpers.updateCameraMatrix(-120);
        WidgetTheme.field_i.field_n = true;
        SpriteCheckboxPainter.field_d = 0.0f;
        TextLayout.field_d = new double[]{1.0, 0.0, 0.0};
        Archive.field_a = 0;
        MenuLabelGlobals.field_d.field_n = true;
        LobbyListHelpers.field_e = new int[]{0, 210, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        LobbyResourceHelpers.field_d = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        VerticalScrollbar.field_Lb = new Sprite(640, 400);
        NetworkArchiveRequest.field_M = new Sprite(640, 400);
        LoadingStageHook.field_d = new Sprite(200, 400);
        for (var2 = 0; var2 < 256; var2++) {
          IndexedSpriteState.field_n[var2] = StatusRequestHelpers.bitAnd(-486473984, 143 * var2) << 8;
          IndexedSpriteState.field_n[var2] = IntrusiveNode.bitOr(IndexedSpriteState.field_n[var2], StatusRequestHelpers.bitAnd(65280, 191 * var2));
          IndexedSpriteState.field_n[var2] = IntrusiveNode.bitOr(IndexedSpriteState.field_n[var2], var2);
        }
        DualLinkNodeHashTable.setScreenCentre(320, 240, (byte) -121);
        SettingsCookieHelpers.field_a = -1;
    }

    private final void loadGraphics(Archive param0, Archive param1, boolean param2, Archive param3, Archive param4, Archive param5) {
        int var9_int = 0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        Sprite[][] var9 = null;
        Sprite var10_ref_oh = null;
        int var11 = 0;
        Sprite var12 = null;
        var11 = field_J;
        try {
          SocialTabsPanel.field_b = FontAndBrightnessHelpers.loadFontByName("", "font", param1, param3, -89);
          GzipDecompressor.field_g = FontAndBrightnessHelpers.loadFontByName("kartika13", "", param0, param4, -63);
          var12 = LoadingProgressDialog.loadFontByName(param1, (byte) -45, "starfield", "");
          TextureCache.field_i = new Sprite(2560, 256);
          TextureCache.field_i.makeRasterTarget();
          var12.drawOpaque(0, 0);
          var12.drawOpaque(1280, 0);
          WidgetContainer.field_O.makeRasterTarget(-117);
          GameApplet.field_c = ScreenDrawHelpers.loadIndexedSpriteByName((byte) 79, param1, "", "logo");
          NanoTickClock.field_k = LoadingProgressDialog.loadFontByName(param1, (byte) -45, "splash", "");
          MenuInputState.field_f = LobbyGame.loadIndexedSpritesByName(param1, "walk1", "", -1409);
          Js5Transport.field_p = LobbyGame.loadIndexedSpritesByName(param1, "walk2", "", -1409);
          DialWidget.field_cb = LobbyGame.loadIndexedSpritesByName(param1, "walk3", "", -1409);
          WhirlpoolHasher.field_l = MidiNote.loadFrameSprites("frame", true, param1, "");
          LoginDialog.field_qb = PlayingSound.loadSpritesByName((byte) -69, param1, "", "achievements_large");
          NotificationToast.field_p = LoadingProgressDialog.loadFontByName(param0, (byte) -45, "unachieved", "basic");
          AgeValidator.field_r = LoadingProgressDialog.loadFontByName(param0, (byte) -45, "orbcoin", "basic");
          var8 = LoginDialog.field_qb.length;
          UiComponent.field_G = new Sprite[var8];
          RasterStackHelpers.pushRasterState(false);
          for (var9_int = 0; var9_int < var8; var9_int++) {
            var10_ref_oh = new Sprite(32, 32);
            var10_ref_oh.makeRasterTarget();
            LoginDialog.field_qb[var9_int].drawScaledAveraged(0, 0, 32, 32);
            UiComponent.field_G[var9_int] = var10_ref_oh;
          }
          Bzip2State.field_F = new Sprite(32, 32);
          Bzip2State.field_F.makeRasterTarget();
          NotificationToast.field_p.drawScaledAveraged(0, 0, 32, 32);
          HuffmanCodec.popRasterTarget(true);
          BoardAnimator.field_c = PlayingSound.loadSpritesByName((byte) -97, param1, "", "viewicons");
          IndexedSpriteHelpers.field_f = this.createShadedDiscSprite(8388608, 262144, (byte) -107);
          AccountCreationForm.field_M = this.createShadedDiscSprite(6316128, 263172, (byte) -107);
          if (PendingStatQuery.hasFeatureBit(0, (byte) 119)) {
            RasterStackHelpers.field_e = LoadingProgressDialog.loadFontByName(param1, (byte) -45, "red_counter", "allhallowseve");
            DialWidget.field_X = LoadingProgressDialog.loadFontByName(param1, (byte) -45, "white_counter", "allhallowseve");
          }
          var9 = new Sprite[CommonUiHelpers.field_b.length][];
          for (var10 = 0; CommonUiHelpers.field_b.length > var10; var10++) {
            var9[var10] = PlayingSound.loadSpritesByName((byte) -126, param1, "", CommonUiHelpers.field_b[var10]);
          }
          StatefulWidgetRenderer.initializeLobbyAssets(false, StatusRequestHelpers.field_a, ArchiveGroupHelpers.field_b, DebouncedValidator.field_c, var9, param2, var9, DebouncedValidator.field_c, CaptionedContainer.field_U, param4, StatefulWidgetRenderer.field_s, 1, 2, ClientProtocolStage.field_i, param0);
          EmailAvailabilityValidator.field_r = LoadingProgressDialog.loadFontByName(param1, (byte) -45, "lobbyicon", "");
          if (PendingStatQuery.hasFeatureBit(0, (byte) 116)) {
            TriangleRasterizer.setTextureProvider(new TextureCache(param5, param1));
          } else {
            TriangleRasterizer.setTextureProvider(new LruTextureCache(param5, param1, 8, 128));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("TetraLink.I(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void loadArchives(int param0) {
        if (TextFieldValidator.field_k != null) {
          MenuInputState.loadLocalizedText(-98, TextFieldValidator.field_k);
          TextFieldValidator.field_k = null;
          SecondaryNodeDeque.resetFrameTimingHistory(-8243);
        }
        DisplayMode.field_b = NineSliceFrame.createArchive(108, 3);
        MenuLabelGlobals.field_b = NineSliceFrame.createArchive(-84, 5);
        if (param0 <= 16) {
          field_P = (ContextMenu) null;
        }
        ArchiveRequest.field_x = NineSliceFrame.createArchive(-47, 6);
        NameSuggestionsPanel.field_N = NineSliceFrame.createArchive(-64, 7);
        HighscoreQuery.field_p = NineSliceFrame.createArchive(92, 8);
        DualLinkDeque.field_f = NineSliceFrame.createArchive(-68, 9);
        DisplayMode.field_g = NineSliceFrame.createArchive(-70, 10);
        HotspotTextWidget.field_U = NineSliceFrame.createArchive(-119, 11);
        SocialListPacketHandler.field_a = NineSliceFrame.createArchive(-113, 12);
        CaptionedContainer.field_U = NineSliceFrame.createArchive(-122, 13);
        if (PendingStatQuery.hasFeatureBit(0, (byte) 108)) {
          MarkerSliderPainter.field_k = NineSliceFrame.createArchive(-99, 14);
          InsetTextPainter.field_v = NineSliceFrame.createArchive(99, 15);
          LoadingStageHook.field_c = NineSliceFrame.createArchive(-128, 16);
        }
    }

    private final Sprite createShadedDiscSprite(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = field_J;
        Sprite var4 = new Sprite(57, 57);
        int var5Lifetime1;
        RasterTargetHelpers.setSpriteRasterTarget(var4, 6);
        SoftwareRasterizer.fillCircle(29, 29, 27, 263172);
        for (var5 = 23; var5 >= 0; var5--) {
          SoftwareRasterizer.fillCircle(29, 29, var5, param1 * var5 + param0);
        }
        if (param2 != -107) {
          Archive var7 = (Archive) null;
          this.loadSceneryModels(false, (Archive) null);
        }
        for (var5Lifetime1 = 0; 57 > var5Lifetime1; var5Lifetime1 += 2) {
          SoftwareRasterizer.drawHorizontalLineAlpha(0, var5Lifetime1, 57, 0, 128);
        }
        HuffmanCodec.popRasterTarget(true);
        return var4;
    }

    private final boolean advanceLoading(byte param0, boolean param1) {
        int var4 = 0;
        int var3;
        int var5;
        AnimationFrameSet var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = field_J;
        DirectByteStorage.initializeCaptionTables(-109);
        if (null == NameSuggestionsPanel.field_N) {
          if (null != DisplayMode.field_g) {
            PacketFlushHelpers.setBenefitsBorderAndCaption(0, InsetTextPainter.field_r, 80.0f);
            this.renderFrame(124);
            FullscreenErrorDialog.field_bb = new MusicTrack[4];
            FullscreenErrorDialog.field_bb[0] = MusicTrack.load(DisplayMode.field_g, "", "tetralink titlescreen");
            FullscreenErrorDialog.field_bb[1] = MusicTrack.load(DisplayMode.field_g, "", "tetralink ingame 1");
            FullscreenErrorDialog.field_bb[2] = MusicTrack.load(DisplayMode.field_g, "", "tetralink ingame 2");
            FullscreenErrorDialog.field_bb[3] = MusicTrack.load(DisplayMode.field_g, "", "tetralink ingame 3");
            for (var3 = 0; var3 < 4; var3++) {
              SharedPanelFactory.field_b.prepareTrack(PacketBuffer.field_q, FullscreenErrorDialog.field_bb[var3], DualLinkDeque.field_f, -1, 0);
            }
            SharedPanelFactory.field_b.releasePatchSamples((byte) 115);
            DualLinkDeque.field_f = null;
            DisplayMode.field_g = null;
            PacketBuffer.field_q = null;
            SecondaryNodeDeque.resetFrameTimingHistory(-8243);
            return false;
          }
          if (null != ArchiveRequest.field_x) {
            PacketFlushHelpers.setBenefitsBorderAndCaption(0, LoginCredentials.field_e, 90.0f);
            this.renderFrame(126);
            this.loadGraphics(QueuedListRequest.field_v, MenuLabelGlobals.field_b, true, ArchiveRequest.field_x, ArchiveGroupHelpers.field_a, SocialListPacketHandler.field_a);
            ArchiveGroupHelpers.field_a = null;
            ArchiveRequest.field_x = null;
            SecondaryNodeDeque.resetFrameTimingHistory(-8243);
            return false;
          }
          if (HotspotTextWidget.field_U != null) {
            PacketFlushHelpers.setBenefitsBorderAndCaption(0, PasswordLengthHelpers.field_e, 95.0f);
            this.renderFrame(118);
            this.loadSceneryModels(false, HotspotTextWidget.field_U);
            HotspotTextWidget.field_U = null;
            SecondaryNodeDeque.resetFrameTimingHistory(-8243);
            return false;
          }
          if (InsetTextPainter.field_v != null &&
            PendingStatQuery.hasFeatureBit(0, (byte) 116)) {
            TextureEntry.setSharedArchives(MarkerSliderPainter.field_k, true, InsetTextPainter.field_v);
            var6 = new AnimationFrameSet(0);
            while (!var6.ensureFramesLoaded((byte) -106)) {
            }
            NodeHashTable.discardServerMessage((byte) -116, var6);
            GzipDecompressor.field_a = new AnimationSequence(LoadingStageHook.field_c, "ghost_update", "ghost_update_normal_ready");
            NameEntryPopup.field_Vb = new AnimationSequence(LoadingStageHook.field_c, "ghost_update", "ghost_update_normal_walk");
            InsetTextPainter.field_v = null;
            MarkerSliderPainter.field_k = null;
            LoadingStageHook.field_c = null;
          }
          if (null != DisplayMode.field_b) {
            LobbyUpdateHelpers.setSharedAnimationFrameset(5, new HuffmanCodec(DisplayMode.field_b.getFileByName("", "huffman", true)));
            DisplayMode.field_b = null;
            SecondaryNodeDeque.resetFrameTimingHistory(-8243);
            return false;
          }
          HighscoreSubmission.computeCaptionColumnWidth((byte) -117);
          var3Lifetime2 = 108 / ((0 - param0) / 55);
          for (var4 = 0; var4 < 11; var4++) {
            MarkerSlider.field_X[var4] = new MenuScreen(var4);
          }
          DraggableWidget.field_O = 10;
          BackgroundSparkle.field_t = 10;
          AlternateLongAndTextCredentials.setTargetFrameRate((byte) 124, 50);
          FullscreenCanvasHelpers.checkComplementGuard(-51, 50);
          RasterSnapshot.playMusicTrack(27654, FullscreenErrorDialog.field_bb[0]);
          LruTextureCache.field_e = 0;
          if (!PendingStatQuery.hasFeatureBit(0, (byte) 126)) {
            return true;
          }
          ScreenSwitchHelpers.field_a = new AnimationPlayer();
          ScreenSwitchHelpers.field_a.selectSequence((byte) 33, GzipDecompressor.field_a);
          return true;
        }
        if (QueuedListRequest.field_v.ensureIndexLoaded(106) &&
          QueuedListRequest.field_v.loadGroupByName("basic", (byte) -91)) {
          if (QueuedListRequest.field_v.ensureIndexLoaded(112) &&
            QueuedListRequest.field_v.loadGroupByName("kartika13", (byte) -124)) {
            if (ArchiveGroupHelpers.field_a.ensureIndexLoaded(90) &&
              ArchiveGroupHelpers.field_a.loadGroupByName("kartika13", (byte) -110)) {
              if (QueuedListRequest.field_v.ensureIndexLoaded(119) &&
                QueuedListRequest.field_v.loadGroupByName("lobby", (byte) -88)) {
                if (ArchiveGroupHelpers.field_a.ensureIndexLoaded(109) &&
                  ArchiveGroupHelpers.field_a.loadGroupByName("lobby", (byte) -113)) {
                  if (NameSuggestionsPanel.field_N.ensureIndexLoaded(119) &&
                    NameSuggestionsPanel.field_N.areAllGroupsLoaded(false)) {
                    if (HighscoreQuery.field_p.ensureIndexLoaded(108) &&
                      HighscoreQuery.field_p.areAllGroupsLoaded(false)) {
                      if (DualLinkDeque.field_f.ensureIndexLoaded(97) &&
                        DualLinkDeque.field_f.areAllGroupsLoaded(false)) {
                        if (DisplayMode.field_g.ensureIndexLoaded(108) &&
                          DisplayMode.field_g.areAllGroupsLoaded(false)) {
                          if (MenuLabelGlobals.field_b.ensureIndexLoaded(95) &&
                            MenuLabelGlobals.field_b.areAllGroupsLoaded(false)) {
                            if (ArchiveRequest.field_x.ensureIndexLoaded(100) &&
                              ArchiveRequest.field_x.areAllGroupsLoaded(false)) {
                              if (DisplayMode.field_b.ensureIndexLoaded(112) &&
                                DisplayMode.field_b.areAllGroupsLoaded(false)) {
                                if (HotspotTextWidget.field_U.ensureIndexLoaded(101) &&
                                  HotspotTextWidget.field_U.areAllGroupsLoaded(false)) {
                                  boolean decompiledFrameRemainder0 = true;
                                  if (PendingStatQuery.hasFeatureBit(0, (byte) 113)) {
                                    if (MarkerSliderPainter.field_k.ensureIndexLoaded(92) &&
                                      MarkerSliderPainter.field_k.areAllGroupsLoaded(false)) {
                                      if ((InsetTextPainter.field_v.ensureIndexLoaded(99) &&
                                        InsetTextPainter.field_v.areAllGroupsLoaded(false)) &&
                                        (decompiledFrameRemainder0 = (!(LoadingStageHook.field_c.ensureIndexLoaded(119)) ||
                                        !(LoadingStageHook.field_c.areAllGroupsLoaded(false))))) {
                                        PacketFlushHelpers.setBenefitsBorderAndCaption(0, DisplayNameForm.formatArchiveProgress(0, LoadingStageHook.field_c, LobbyListHelpers.field_f, ContentTransitionDialog.field_kb), 75.0f);
                                        return false;
                                      }
                                      if (decompiledFrameRemainder0) {
                                        PacketFlushHelpers.setBenefitsBorderAndCaption(0, DisplayNameForm.formatArchiveProgress(0, InsetTextPainter.field_v, LobbyListHelpers.field_f, ContentTransitionDialog.field_kb), 75.0f);
                                        return false;
                                      }
                                    }
                                    if (decompiledFrameRemainder0) {
                                      PacketFlushHelpers.setBenefitsBorderAndCaption(0, DisplayNameForm.formatArchiveProgress(0, MarkerSliderPainter.field_k, LobbyOverlayHelpers.field_a, DirectByteStorage.field_k), 75.0f);
                                      return false;
                                    }
                                  }
                                  if (SocialListPacketHandler.field_a.ensureIndexLoaded(116) &&
                                    SocialListPacketHandler.field_a.areAllGroupsLoaded(false)) {
                                    if (CaptionedContainer.field_U.ensureIndexLoaded(98) &&
                                      CaptionedContainer.field_U.areAllGroupsLoaded(false)) {
                                      Js5ArchiveManager.closeUiLayers((byte) 126);
                                      PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.field_Ub, 78.0f);
                                      this.renderFrame(122);
                                      if (!param1) {
                                        return false;
                                      }
                                      PacketBuffer.field_q = new SoundEffectLibrary(NameSuggestionsPanel.field_N, HighscoreQuery.field_p);
                                      PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("menu_select", "", (byte) 1);
                                      StartupFlagsHelpers.field_c = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_invalid_move", "", (byte) 1);
                                      MenuThemeHelpers.field_a = new PcmSample[5];
                                      LobbyResourceHelpers.field_a = new PcmSample[5];
                                      for (var3Lifetime1 = 0; 5 > var3Lifetime1; var3Lifetime1++) {
                                        MenuThemeHelpers.field_a[var3Lifetime1] = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_drop_piece_" + (1 + var3Lifetime1), "", (byte) 1);
                                        LobbyResourceHelpers.field_a[var3Lifetime1] = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_piece_inplace_" + (1 + var3Lifetime1), "", (byte) 1);
                                      }
                                      PlayingSound.field_r = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_reset_board", "", (byte) 1);
                                      SectorCacheStore.field_a = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_second_tick", "", (byte) 1);
                                      CachedArchiveSource.field_A = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_select_column", "", (byte) 1);
                                      PasswordLengthHelpers.field_c = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_start_game", "", (byte) 1);
                                      LoadingProgressDialog.field_ib = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_winning_line_sound_winner", "", (byte) 1);
                                      MouseWheelInput.field_c = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_winning_line_sound_loser", "", (byte) 1);
                                      HighscoreQuery.field_x = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_title_appear", "", (byte) 1);
                                      IndexedSpriteHelpers.field_c = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_dissolve", "", (byte) 1);
                                      LoginProgressHelpers.field_d = PacketBuffer.field_q.getSynthesizedSampleByNameUnbudgeted("tetralink_dissolve_in", "", (byte) 1);
                                      CacheEntry.field_y = new PcmSample[3];
                                      CacheEntry.field_y[0] = PacketBuffer.field_q.getVorbisSampleByName(-122, "", "tetralink_NASA_chatter_1");
                                      CacheEntry.field_y[1] = PacketBuffer.field_q.getVorbisSampleByName(-123, "", "tetralink_NASA_chatter_2");
                                      CacheEntry.field_y[2] = PacketBuffer.field_q.getVorbisSampleByName(-128, "", "tetralink_NASA_chatter_3");
                                      HighscoreQuery.field_p = null;
                                      NameSuggestionsPanel.field_N = null;
                                      SecondaryNodeDeque.resetFrameTimingHistory(-8243);
                                      return false;
                                    }
                                    PacketFlushHelpers.setBenefitsBorderAndCaption(0, DisplayNameForm.formatArchiveProgress(0, CaptionedContainer.field_U, BufferedSocket.field_a, QueuedListRequest.field_w), 77.0f);
                                    return false;
                                  }
                                  PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(MusicPatch.field_x, SocialListPacketHandler.field_a, NetworkArchiveRequest.field_L, "", 1152753825), 75.0f);
                                  return false;
                                }
                                PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(DirectByteStorage.field_k, HotspotTextWidget.field_U, LobbyOverlayHelpers.field_a, "", 1152753825), 75.0f);
                                return false;
                              }
                              PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(QueuedListRequest.field_w, DisplayMode.field_b, BufferedSocket.field_a, "", 1152753825), 75.0f);
                              return false;
                            }
                            PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(NameAlphabetTable.field_c, ArchiveRequest.field_x, QuickChatCategory.field_C, "", 1152753825), 75.0f);
                            return false;
                          }
                          PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(NameAlphabetTable.field_c, MenuLabelGlobals.field_b, QuickChatCategory.field_C, "", 1152753825), 75.0f);
                          return false;
                        }
                        PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(KeyHandlerHelpers.field_g, DisplayMode.field_g, MouseWheelInput.field_a, "", 1152753825), 60.0f);
                        return false;
                      }
                      PacketFlushHelpers.setBenefitsBorderAndCaption(0, AnimationPlayer.formatArchiveProgressLabel(DualLinkDeque.field_f, MouseWheelInput.field_a, 0, KeyHandlerHelpers.field_g, (byte) 15), 45.0f);
                      return false;
                    }
                    PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(TextHighlightSpan.field_t, HighscoreQuery.field_p, MidiNote.field_w, "", 1152753825), 40.0f);
                    return false;
                  }
                  PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(TextHighlightSpan.field_t, NameSuggestionsPanel.field_N, MidiNote.field_w, "", 1152753825), 20.0f);
                  return false;
                }
                PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(TextMetricsGlobals.field_a, ArchiveGroupHelpers.field_a, QuickChatHelpDialog.field_Kb, "lobby", 1152753825), 17.0f);
                return false;
              }
              PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(NameAlphabetTable.field_c, QueuedListRequest.field_v, QuickChatCategory.field_C, "lobby", 1152753825), 13.0f);
              return false;
            }
            PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(TextMetricsGlobals.field_a, ArchiveGroupHelpers.field_a, QuickChatHelpDialog.field_Kb, "roman20", 1152753825), 12.0f);
            return false;
          }
          PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(NameAlphabetTable.field_c, QueuedListRequest.field_v, QuickChatCategory.field_C, "kartika13", 1152753825), 11.0f);
          return false;
        }
        PacketFlushHelpers.setBenefitsBorderAndCaption(0, TwoColumnListPanel.formatArchiveGroupProgress(NameAlphabetTable.field_c, QueuedListRequest.field_v, QuickChatCategory.field_C, "basic", 1152753825), 10.0f);
        return false;
    }

    public TetraLink() {
        this.notificationQueue = new IntrusiveDeque();
        this.notificationTimer = 0;
    }

    static {
        field_O = "Close";
    }
}
