/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class HoldTheLine extends NetworkGameClient {
    static PaletteBitmapFont field_F;
    private int field_C;
    static String field_B;
    static int field_A;
    private boolean field_z;
    static int[] field_E;
    static String[] field_G;
    public static int field_D;

    public final void init() {
        try {
          this.initializeApplet(13, 6165, "holdtheline");
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "HoldTheLine.init()");
        }
    }

    final void releaseGameResources(int param0) {
        try {
          HoldTheLine.clearClientReferences(-20);
          RaceWorld.clearSharedReferences(-26919);
          RasterStateRestoration.clearSharedReferences((byte) -20);
          CourseVersionTag.clearSharedReferences(-123);
          IgnoreListIndex.clearSharedReferences((byte) 108);
          GameAppletShell.clearSharedReferences(-1);
          MouseInputHandler.clearSharedReferences((byte) -126);
          IntrusiveDeque.clearSharedReferences(true);
          BackgroundSprites.clearSharedReferences((byte) 39);
          IsaacPacketBuffer.clearSharedReferences(-55);
          ClientBackgroundRenderer.clearSharedReferences(32395);
          RasterStateStack.clearSharedReferences(param0 ^ -29336);
          GameKeyHandler.clearSharedReferences(param0 ^ -129);
          ClientLifecycleUtilities.clearSharedReferences(-112);
          ReflectionCheckQueue.clearSharedReferences(18668);
          ScreenOptionsMenu.clearSharedReferences(param0 - 128);
          GameMenu.clearSharedReferences(param0 - 21134);
          CollisionGeometry.clearSharedReferences(param0 ^ 17182);
          NetworkGameClient.clearSharedReferences(8);
          ClientException.clearSharedReferences(8388479);
          UrlPacketDownloader.clearSharedReferences(-55);
          MouseWheelInput.clearSharedReferences((byte) 106);
          SoftwareRasterizer.clearSharedReferences();
          ResourceArchive.clearSharedReferences(false);
          MenuLayoutState.clearSharedReferences(-21989);
          ClientScreenRenderer.clearSharedReferences(115);
          PacketBuffer.clearSharedReferences((byte) -37);
          BoundaryLoopTracer.clearSharedReferences(-45);
          NineSliceSpriteFactory.clearSharedReferences(0);
          MeshLighting.clearSharedReferences((byte) -110);
          PlayerDataProtocol.clearSharedReferences((byte) 86);
          WhirlpoolTables.clearSharedReferences(param0 + 1003075144);
          SpriteLayoutUtilities.clearSharedReferences(-1);
          LoginCredentialsFactory.clearSharedReferences(28135);
          ChatMessage.clearSharedReferences(-90);
          KeyboardEventQueue.clearSharedReferences(30);
          ReflectionCheckSupport.clearSharedReferences((byte) -58);
          BoundaryLoopClipper.clearSharedReferences(0);
          Cp1252Decoder.clearSharedReferences((byte) 72);
          TickClock.clearSharedReferences((byte) 118);
          RasterBuffer.clearSharedReferences(false);
          ArchiveLoadProgress.clearSharedReferences(-3646);
          FullscreenFocusCanvas.clearSharedReferences(0);
          ViewportSizingController.clearSharedReferences(121);
          MenuList.clearSharedReferences(param0 ^ -129);
          Js5Transport.clearSharedReferences(16831);
          DiskCacheWorker.clearSharedReferences(-3);
          ArchiveCatalog.clearSharedReferences((byte) 100);
          BufferedRandomAccessFile.clearSharedReferences((byte) 121);
          BufferedSocket.clearSharedReferences(param0 ^ 15153);
          JagexLogoRenderer.clearSharedReferences(-1);
          SessionCookieWriter.clearSharedReferences(-103);
          MusicCrossfadeStream.clearSharedReferences(119);
          RaceSetupMenu.clearSharedReferences((byte) -122);
          MovingEntity.clearSharedReferences(0);
          RasterClipTopStack.clearSharedReferences(true);
          GrowableStringList.clearSharedReferences(1);
          IntrusiveNode.clearSharedReferences(-2);
          QuadraticPathSlicer.clearSharedReferences(param0 + 23881);
          SoundCache.clearSharedReferences(122);
          GrowableObjectList.clearSharedReferences(true);
          GrowableIntList.clearSharedReferences((byte) -13);
          PolygonScanConverter.clearSharedReferences();
          ServerConnectionState.clearSharedReferences(param0 ^ -13950);
          BitmapFont.clearSharedReferences();
          InterfaceLoadingStatus.clearSharedReferences(0);
          HuffmanTextCodec.clearSharedReferences((byte) 16);
          NineSlicePanel.clearSharedReferences(-1);
          WidgetStyleNode.clearSharedReferences((byte) 96);
          ResourceArchiveFactory.clearSharedReferences(param0 ^ -240);
          DualLinkNode.clearSharedReferences(0);
          IndexedSpriteState.clearSharedReferences(true);
          PlayerProgressEncoder.clearSharedReferences(76);
          HoverTargetState.clearSharedReferences(param0 - 118);
          AccountFormText.clearSharedReferences(10);
          ClassDescriptorResolver.clearSharedReferences(62);
          SocialListProtocol.clearSharedReferences(-89);
          LoginCredentialType.clearSharedReferences(127);
          LoginCredentials.clearSharedReferences((byte) -123);
          PackedClientOptions.clearSharedReferences(param0 ^ -202);
          IntegerTextParser.clearSharedReferences(param0 - 34);
          ClientMenuBootstrap.clearSharedReferences(param0 + 32009);
          DialogLayer.clearSharedReferences(true);
          NameCheckProgressDialog.clearSharedReferences(param0 - 135);
          LoadProgressDialog.clearSharedReferences((byte) -125);
          StandardContentTransitionDialog.clearSharedReferences((byte) 79);
          AccountCreationForm.clearSharedReferences((byte) -16);
          LoginChoicePanel.clearSharedReferences(-25335);
          LoginForm.clearSharedReferences(param0 - 100);
          DisplayNameForm.clearSharedReferences(-1);
          UiTheme.clearSharedReferences(1);
          RasterDesaturation.clearSharedReferences(126);
          MouseInputRegistration.clearSharedReferences((byte) 115);
          ArchiveIndex.clearSharedReferences((byte) 118);
          GzipDecompressor.clearSharedReferences((byte) 40);
          ArchiveProvider.clearSharedReferences(8192);
          ClientTextResources.clearSharedReferences(true);
          AccountProtocolContext.clearSharedReferences(119);
          RaceVehicle.clearSharedReferences(param0 ^ -129);
          TrackObject.clearSharedReferences(-20668);
          ZombiePedestrian.clearSharedReferences(127);
          PointLight.clearSharedReferences(param0 ^ -200);
          BitwiseIntegerOperations.clearSharedReferences(true);
          HoverTooltipController.clearSharedReferences((byte) 114);
          IsaacRandom.clearSharedReferences(28820);
          FullscreenDisplayMode.clearSharedReferences((byte) -92);
          SpriteState.clearSharedReferences(-13503);
          Particle.clearSharedReferences(1288);
          AudioOutput.clearSharedReferences();
          MidiPcmStream.clearSharedReferences((byte) -104);
          RoadControlPathBuilder.clearSharedReferences(-67);
          MidiFileReader.releaseStatics();
          MusicPatchPcmStream.clearSharedReferences(0);
          BoundedRandomAccessFile.clearSharedReferences(param0 ^ 128);
          DelegatingCanvas.clearSharedReferences(param0 ^ -248);
          StraightRoadSlicer.clearSharedReferences(0);
          SocketJs5Transport.clearSharedReferences(true);
          SecondaryNodeDeque.clearSharedReferences(6985);
          NetworkArchiveRequest.clearSharedReferences(106);
          DiskCacheStore.clearSharedReferences(-84);
          CachedArchiveProvider.clearSharedReferences(-123);
          FixedAngleMath.clearSharedReferences(24816);
          ArchiveRequest.clearSharedReferences(-1010);
          AccountUiUtilities.clearSharedReferences(5);
          FullscreenErrorDialog.clearSharedReferences(-56);
          GouraudTriangleRasterizer.clearSharedReferences(-754077296);
          TextWidgetStyle.clearSharedReferences(true);
          TriangleRasterState.clearSharedReferences();
          VorbisSample.releaseStatics();
          MeshMaterial.clearSharedReferences((byte) -122);
          TriangleMesh.clearSharedReferences(-32768);
          HoverTargetTracker.clearSharedReferences(0);
          EncryptedPacketWriter.clearSharedReferences(-4);
          LeaderboardRequests.clearSharedReferences(84);
          SocketConnectorFactory.clearSharedReferences((byte) -33);
          TexturedPolygonRenderer.clearSharedReferences(111);
          StandaloneWindow.clearSharedReferences(param0 - 24);
          InheritedWidgetStyle.clearSharedReferences((byte) 104);
          DualNodeHashTable.clearSharedReferences((byte) -97);
          IntHashTable.clearSharedReferences((byte) 124);
          ByteStorage.clearSharedReferences((byte) -20);
          Bzip2Decoder.clearSharedReferences();
          Bzip2State.clearSharedReferences((byte) -125);
          ReflectionCheck.clearSharedReferences(true);
          ByteArrayPool.clearSharedReferences((byte) -71);
          TextSyntax.clearSharedReferences(117);
          CheckboxRenderer.clearSharedReferences(true);
          LayeredButtonRenderer.clearSharedReferences((byte) 72);
          DialWidgetRenderer.clearSharedReferences(true);
          MarkerSliderRenderer.clearSharedReferences(param0 - 129);
          TextLayout.clearSharedReferences(-11521);
          UiWidget.clearSharedReferences((byte) 25);
          TextButton.clearSharedReferences(param0 ^ -5403);
          SingleChildWidget.clearSharedReferences((byte) 92);
          ResizableDialog.clearSharedReferences(6);
          FadingDialog.clearSharedReferences(-1349126303);
          WidgetContainer.clearSharedReferences((byte) 70);
          IntrusiveDequeCursor.clearSharedReferences((byte) 127);
          PopupMenuRenderer.clearSharedReferences(114);
          VorbisFloor.clearSharedReferences();
          EmailDomainValidator.clearSharedReferences(1);
          QuickChatPhraseDefinition.clearSharedReferences((byte) 116);
          AppletNavigation.clearSharedReferences((byte) 96);
          QuickChatPhraseCache.clearSharedReferences((byte) -78);
          WeightedLruCache.clearSharedReferences(false);
          Cp1252CharacterRules.clearSharedReferences(119);
          HuffmanDecoder.clearSharedReferences(0);
          TutorialScriptState.clearSharedReferences(true);
          AccountNameNormalizer.clearSharedReferences(12031);
          AudioServiceThread.clearSharedReferences((byte) -48);
          SocketConnector.clearSharedReferences((byte) -42);
          ProxyAuthenticationException.clearSharedReferences((byte) -116);
          NanoTickClock.clearSharedReferences(true);
          ImageProducerRasterBuffer.clearSharedReferences(-1);
          WhirlpoolHasher.clearSharedReferences(true);
          MidiKeyUsage.clearSharedReferences(5751);
          SynthInstrument.releaseStatics();
          BoundaryIntervalBuilder.clearSharedReferences(-127);
          LabeledField.clearSharedReferences(18701);
          ValidatedTextField.clearSharedReferences(param0 ^ 8078);
          EditableTextField.clearSharedReferences(param0 + 3747);
          ContentTransitionDialog.clearSharedReferences(false);
          NameSuggestionsPanel.clearSharedReferences(param0 ^ -27025);
          TextHotspotWidget.clearSharedReferences(-1);
          ValidationIndicator.clearSharedReferences((byte) 51);
          ValidationHelpWidget.clearSharedReferences(true);
          CheckboxWidget.clearSharedReferences((byte) 103);
          TextFieldValidator.clearSharedReferences(-1);
          SpriteDecodeGlobals.clearSharedReferences(false);
          AccountTermsPanel.clearSharedReferences(param0 ^ -9379);
          DialWidget.clearSharedReferences(false);
          MusicPatch.clearSharedReferences((byte) -6);
          MusicPatchEnvelope.clearSharedReferences((byte) 109);
          CachedTextLayout.clearSharedReferences(false);
          DirectByteStorage.clearSharedReferences(param0 ^ -211);
          DraggableWidget.clearSharedReferences(param0 - 32);
          DropTargetWidget.clearSharedReferences(6);
          QuickChatDynamicCommand.clearSharedReferences(-36);
          IterableNodeHashTable.clearSharedReferences(-90);
          IterableSecondaryNodeDeque.clearSharedReferences((byte) 80);
          CacheEntry.clearSharedReferences(-15);
          StrongCacheEntry.clearSharedReferences((byte) 109);
          ProxySocketConnector.clearSharedReferences((byte) -124);
          SynthFilter.releaseStatics();
          MenuHitTesting.clearSharedReferences((byte) -90);
          NodeHashTableIterator.clearSharedReferences((byte) 86);
          SecondaryNodeDequeIterator.clearSharedReferences((byte) 68);
          ShadedNineSlicePanel.clearSharedReferences((byte) -3);
          CourseDefinition.clearSharedReferences(3);
          RoadControlPointSpec.clearSharedReferences(74);
          CourseObjectSlot.clearSharedReferences(param0 + 19729);
          RoadStripRenderer.clearSharedReferences(0);
          RoadFillRenderer.clearSharedReferences(param0 ^ -204);
          SolidRoadStripRenderer.clearSharedReferences((byte) 110);
          TexturedRoadFillRenderer.clearSharedReferences((byte) 82);
          ShadedRoadStripRenderer.clearSharedReferences(true);
          OutlinedRoadStripRenderer.clearSharedReferences(-10162);
          PolarSortVector.clearSharedReferences((byte) 38);
          RotatedSpriteCache.clearSharedReferences((byte) -28);
          SpriteAsset.clearSharedReferences((byte) -99);
          SpriteSheetAsset.clearSharedReferences((byte) -120);
          RotatedSpriteAsset.clearSharedReferences((byte) -103);
          RotatedSpriteSheetAsset.clearSharedReferences((byte) 21);
          NamedSoundEffect.clearSharedReferences((byte) 43);
          StereoMusicSample.clearSharedReferences(1491624464);
          VehicleEngineSounds.clearSharedReferences(-7689);
          EntitySound.clearSharedReferences(0);
          LeaderboardRequest.clearSharedReferences(param0 - 220);
          ScoreSubmission.clearSharedReferences(true);
          LeaderboardPlayer.clearSharedReferences((byte) 5);
          ArchiveKeyRequest.clearSharedReferences(false);
          Point2i.clearSharedReferences(-22525);
          Vector2i.clearSharedReferences((byte) 110);
          Vector2f.clearSharedReferences(param0 - 129);
          TrackCurve.clearSharedReferences(true);
          BoundaryCurve.clearSharedReferences(param0 - 244);
          RoadSegment.clearSharedReferences(-3369);
          TrackBoundary.clearSharedReferences(false);
          StraightRoadSegment.clearSharedReferences((byte) -87);
          ArcTrackBoundary.clearSharedReferences(false);
          CurvedRoadSegment.clearSharedReferences(-127);
          BoundaryIntersection.clearSharedReferences(69);
          SpriteButtonRenderer.clearSharedReferences(-1351579448);
          LinkWidgetRenderer.clearSharedReferences(1);
          TextFieldRenderer.clearSharedReferences(true);
          PasswordFieldRenderer.clearSharedReferences(true);
          IconToggleRenderer.clearSharedReferences(4);
          OpacityWidget.clearSharedReferences(1000);
          SocialListEntry.clearSharedReferences(true);
          PlayerStatsRequest.clearSharedReferences(param0 - 179);
          SoundPlayback.clearSharedReferences(param0);
          ArchiveLoadStage.clearSharedReferences((byte) 114);
          AchievementStatusRequest.clearSharedReferences((byte) -85);
          AchievementUnlockRequest.clearSharedReferences((byte) 119);
          BlobReadRequest.clearSharedReferences((byte) 89);
          BlobWriteRequest.clearSharedReferences(381);
          TutorialCalloutAnchor.clearSharedReferences((byte) 112);
          TutorialCondition.clearSharedReferences((byte) 1);
          TutorialTransition.clearSharedReferences(false);
          TutorialAction.clearSharedReferences(-116);
          TutorialPage.clearSharedReferences(true);
          EmailValidationResult.clearSharedReferences(-69);
          AccountProtocolState.clearSharedReferences((byte) 124);
          DelayedServerPacket.clearSharedReferences(param0 - 33);
          LoginMethodPreference.clearSharedReferences(-69);
          UsernameLoginCredentials.clearSharedReferences(param0 ^ -237);
          AlternateUsernameLoginCredentials.clearSharedReferences((byte) -93);
          EmailLoginCredentials.clearSharedReferences((byte) 61);
          NameRequestState.clearSharedReferences((byte) -125);
          NameAvailabilityResult.clearSharedReferences(-4496);
          MessagePanel.clearSharedReferences((byte) 25);
          PathWaypoint.clearSharedReferences(param0 - 120);
          PointPath.clearSharedReferences((byte) -16);
          LinearPointPath.clearSharedReferences((byte) -52);
          QuadraticPointPath.clearSharedReferences(param0 - 128);
          TrackObjectDefinition.clearSharedReferences((byte) -6);
          FullscreenErrorReason.clearSharedReferences((byte) 99);
          SavedRasterState.clearSharedReferences((byte) 61);
          IntArrayReadRequest.clearSharedReferences(param0 ^ 128);
          IntWriteRequest.clearSharedReferences(true);
          LayeredWidgetStyle.clearSharedReferences(param0 - 33);
          TextLineLayout.clearSharedReferences((byte) 5);
          EmailAddressValidator.clearSharedReferences((byte) -76);
          EmailConfirmationValidator.clearSharedReferences(0);
          AgeValidator.clearSharedReferences(-127);
          MatchingTextValidator.clearSharedReferences(-14);
          ContentTransitionState.clearSharedReferences(-31819);
          TextHotspotRange.clearSharedReferences(76);
          ValidationState.clearSharedReferences(115);
          TimedValidator.clearSharedReferences(param0 - 24709);
          InputValidationError.clearSharedReferences(11);
          this.serverHost = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "HoldTheLine.IA(" + param0 + ')');
        }
    }

    private final void openResourceArchives(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -35) {
            field_F = (PaletteBitmapFont) null;
          }
          if (GameAppletShell.field_i != null) {
            RoadLayerMaskRenderer.loadGameText((byte) 125, GameAppletShell.field_i);
            GameAppletShell.field_i = null;
            TexturedRoadFillRenderer.resetFrameTiming(56);
          }
          DropTargetWidget.field_J = WeightedLruCache.createResourceArchive(122, 3);
          HuffmanTextCodec.field_a = WeightedLruCache.createResourceArchive(param0 + 162, 4);
          SocialListProtocol.field_d = WeightedLruCache.createResourceArchive(-67, 5);
          PacketBuffer.field_m = WeightedLruCache.createResourceArchive(-15, 6);
          SoundCache.field_c = WeightedLruCache.createResourceArchive(121, 7);
          EntitySound.field_i = WeightedLruCache.createResourceArchive(-17, 8);
          QuadraticPointPath.field_j = WeightedLruCache.createResourceArchive(-16, 9);
          NetworkArchiveRequest.field_y = WeightedLruCache.createResourceArchive(param0 ^ -89, 10);
          FullscreenFocusCanvas.setBenefitsArchives(LinearPointPath.field_p, (byte) -126, StandardContentTransitionDialog.field_lb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.NA(" + param0 + ')');
        }
    }

    final void shutdownGame(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          RoadControlPointSpec.shutdownAudioOutputs((byte) -66);
          if (MidiPcmStream.field_U != null) {
            AgeValidator.setFullscreenEnabled(-29486, false);
          }
          PolarSortVector.shutdownClientResources(false);
          if (param0 != 30) {
            this.field_C = -31;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.MA(" + param0 + ')');
        }
    }

    final static MouseWheelInput createMouseWheelInput(byte param0) {
        try {
          Throwable var1 = null;
          RuntimeException var1_ref = null;
          MouseWheelInput stackIn_4_0 = null;
          Object stackIn_6_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 > -37) {
              field_B = (String) null;
            }
            try {
              stackIn_4_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              stackIn_6_0 = null;
              return (MouseWheelInput) (stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw EntitySound.wrapException((Throwable) ((Object) var1_ref), "HoldTheLine.QA(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void initializeGame(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.initializeClientServices(8, false, 1, 0, (byte) 63, 11, 12, 2);
          this.configurePacketHandlers(false, true, true, true, 640);
          this.field_z = false;
          if (param0 < 78) {
            this.init();
          }
          SocketConnectorFactory.initializeGameAudio(LoginCredentialsFactory.field_b, -81, (java.awt.Component) ((Object) MouseInputHandler.field_b));
          RaceSetupMenu.field_y = null;
          RotatedSpriteAsset.initializeBenefitsPanel(0, 16777215, ClientLifecycleUtilities.field_a, (java.applet.Applet) (this), 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.FA(" + param0 + ')');
        }
    }

    final void updateGameTick(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_38_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_283_1 = 0;
        boolean stackIn_284_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = field_D;
        try {
          ArchiveRequest.serviceMusicAndAudio(-11875);
          LoginForm.updatePositionalSounds(-1542826527);
          ReflectionCheckSupport.finalizeHoverTarget((byte) -76);
          stackIn_4_1 = 1051;
          stackIn_5_2 = (MidiPcmStream.field_U != null);
          this.updateClientServices(stackIn_4_1, stackIn_5_2);
          if (EditableTextField.field_R) {
            this.openResourceArchives((byte) -35);
            EditableTextField.field_R = false;
          }
          do {
            if (!PasswordFieldRenderer.pollServerPacket(AppletNavigation.field_e, 31881)) {
              PlayerStatsRequest.flushServerPackets(0, 0);
              break;
            }
            this.dispatchServerPacket(-6);
          } while (var5 == 0);
          if (BufferedSocket.isClientUiLoading((byte) -127)) {
            this.updateAccountScreens(0);
            if (BufferedSocket.isClientUiLoading((byte) -127)) {
              if (MenuSelectionController.isAccountUiReady((byte) -30)) {
                this.loadGameResources(false, false);
              }
              return;
            }
          }
          if (!this.field_z) {
            this.loadGameResources(true, false);
            return;
          }
          if (RotatedSpriteCache.field_c &&
            IterableSecondaryNodeDeque.field_g[12] &&
            IterableSecondaryNodeDeque.field_g[82]) {
            stackIn_38_0 = 1;
          } else {
            stackIn_38_0 = 0;
          }
          var2_int = stackIn_38_0;
          if (var2_int != 0) {
            ServerConnectionState.closeServerConnection(-28036);
          }
          if (NamedSoundEffect.isReconnectRequired((byte) 103)) {
            var3 = this.processReconnect((byte) 89);
            if (var3 == 0 ||
              1 == var3) {
              StraightRoadSegment.resendArchiveKeyRequests(2, (byte) 86);
              DirectByteStorage.resendHighscoreRequests(3, 0);
              SocialListProtocol.resendAchievementRequests(true, 4);
              RaceSetupMenu.resendPendingDataRequests(6, (byte) 51);
            }
            if (2 == var3 ||
              var2_int != 0) {
              EmailConfirmationValidator.handleConnectionLost(false);
            }
          }
          if (null != MidiPcmStream.field_U &&
            MidiPcmStream.field_U.field_a) {
            RaceWorld.openPauseMenu(false);
            AgeValidator.setFullscreenEnabled(-29486, false);
          }
          if (LoginForm.field_G == 2) {
            if (!RoadShadowRenderer.isGuestMode((byte) 123)) {
              ClientMenuBootstrap.onAccountSessionReady((byte) -118);
            }
            LoginForm.field_G = 3;
          }
          if (!ZombiePedestrian.field_v &&
            SubscriberAccessChecks.hasSubscriberAccess(-969) &&
            null != RaceSetupMenu.field_y.key) {
            MeshLighting.loadEncryptedCourses(NetworkArchiveRequest.field_y, RaceSetupMenu.field_y.key, -106);
            NetworkArchiveRequest.field_y = null;
          }
          if (!RotatedSpriteAsset.isPlayerProgressLoaded(113)) {
            LoginCredentialType.pollPlayerProgress((byte) 0);
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          var3 = 4 % ((param0 + 18) / 44);
          if (this.field_C <= 0) {
            if (LoginCredentialType.isScreenOptionsOpen(-85)) {
              var4 = DiskCacheStore.processScreenOptionsInput((byte) 18);
              switch (var4) {
                default:
                  break;
                case 3:
                  QuadraticPointPath.showFullscreenOptions((byte) 123);
                  if (var5 == 0) {
                    break;
                  }
                case 4:
                  SpriteDecodeGlobals.field_c = true;
                  ShadedNineSlicePanel.beginMenuExit((byte) 62, false);
                  IntrusiveDeque.resetScreenOptions(false);
                  if (var5 == 0) {
                    break;
                  }
                case 2:
                  AgeValidator.setFullscreenEnabled(-29486, false);
                  break;
              }
              decompiledFrameRemainder1 = (var5 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (!ReflectionCheck.beginReconnectWait(false)) {
                if (~ByteStorage.field_b == ~ClientMenuBootstrap.field_c &&
                  LoginForm.field_G == 0) {
                  if (ClientMenuBootstrap.field_c != -1) {
                    if (EntitySound.field_j &&
                      ClientMenuBootstrap.field_c == 0) {
                      RotatedSpriteCache.startMenuDemoRace(-1);
                    }
                    if (EntitySound.field_j ||
                      1 != BufferedRandomAccessFile.currentBackground &&
                      AchievementStatusRequest.requestedBackground != 1) {
                      fieldTemp$0 = MenuList.field_h - 2;
                      MenuList.field_h = MenuList.field_h - 2;
                      if (!(0 <= fieldTemp$0)) {
                        MenuList.field_h = 0;
                        if (var5 != 0) {
                          LoadProgressDialog.updateCurrentRace(126);
                          fieldTemp$1 = MenuList.field_h + 2;
                          MenuList.field_h = MenuList.field_h + 2;
                          if (fieldTemp$1 > 255) {
                            MenuList.field_h = 255;
                          }
                        }
                      }
                    } else {
                      LoadProgressDialog.updateCurrentRace(126);
                      fieldTemp$1 = MenuList.field_h + 2;
                      MenuList.field_h = MenuList.field_h + 2;
                      if (fieldTemp$1 > 255) {
                        MenuList.field_h = 255;
                      }
                    }
                    decompiledFrameRemainder1 = (-1 != ClientMenuBootstrap.field_c);
                    if (decompiledFrameRemainder1) {
                      boolean decompiledSharedTail2 = (13 != ClientMenuBootstrap.field_c);
                      if (!decompiledSharedTail2) {
                        ((RaceSetupMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).update((byte) -109);
                        stackIn_152_0 = (((RaceSetupMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).transitionState != 1) ? 0 : 1;
                        var4 = stackIn_152_0;
                        decompiledSharedTail2 = (var5 != 0);
                      }
                      if (decompiledSharedTail2) {
                        ((GameMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).update(116, false);
                        stackIn_159_0 = (((GameMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).transitionState != 1) ? 0 : 1;
                        var4 = stackIn_159_0;
                      }
                      if (var4 != 0 &&
                        SpriteDecodeGlobals.field_c) {
                        QuadraticPointPath.showFullscreenOptions((byte) 110);
                        SpriteDecodeGlobals.field_c = false;
                      }
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    LoadProgressDialog.updateCurrentRace(121);
                    decompiledFrameRemainder1 = (var5 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (ClientMenuBootstrap.field_c != -1 &&
                    -1 != ByteStorage.field_b) {
                    if (EntitySound.field_j ||
                      1 != BufferedRandomAccessFile.currentBackground &&
                      AchievementStatusRequest.requestedBackground != 1) {
                      fieldTemp$2 = MenuList.field_h - 2;
                      MenuList.field_h = MenuList.field_h - 2;
                      if (!(fieldTemp$2 >= 0)) {
                        MenuList.field_h = 0;
                        if (var5 != 0) {
                          fieldTemp$3 = MenuList.field_h + 2;
                          MenuList.field_h = MenuList.field_h + 2;
                          if (255 < fieldTemp$3) {
                            MenuList.field_h = 255;
                          }
                          LoadProgressDialog.updateCurrentRace(123);
                        }
                      }
                    } else {
                      fieldTemp$3 = MenuList.field_h + 2;
                      MenuList.field_h = MenuList.field_h + 2;
                      if (255 < fieldTemp$3) {
                        MenuList.field_h = 255;
                      }
                      LoadProgressDialog.updateCurrentRace(123);
                    }
                    boolean decompiledSharedTail1 = (ClientMenuBootstrap.field_c != 13);
                    if (!decompiledSharedTail1) {
                      ((RaceSetupMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).update((byte) -109);
                      var4 = ((RaceSetupMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).isClosed((byte) -77) ? 1 : 0;
                      decompiledSharedTail1 = (var5 != 0);
                    }
                    if (decompiledSharedTail1) {
                      ((GameMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).update(73, true);
                      var4 = ((GameMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).isClosed(false) ? 1 : 0;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    if (var4 != 0) {
                      if (LoginForm.field_G == 1) {
                        if (ValidationIndicator.field_L) {
                          FullscreenFocusCanvas.showGuestLogin(114);
                          if (var5 != 0) {
                            MouseInputHandler.showGuestLogin((byte) -54);
                          }
                        } else {
                          MouseInputHandler.showGuestLogin((byte) -54);
                        }
                        LoginForm.field_G = 2;
                        decompiledFrameRemainder0 = (var5 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (3 != LoginForm.field_G) {
                          if (ByteStorage.field_b == 0) {
                            TexturedRoadFillRenderer.selectMusicTrack(20830, 0);
                          }
                          ClientMenuBootstrap.field_c = ByteStorage.field_b;
                          decompiledFrameRemainder0 = (var5 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (!RoadShadowRenderer.isGuestMode((byte) 100)) {
                            if (12 == ByteStorage.field_b &&
                              SubscriberAccessChecks.hasSubscriberAccess(-969)) {
                              ByteStorage.field_b = 0;
                            }
                            ClientMenuBootstrap.field_c = ByteStorage.field_b;
                            if (ClientMenuBootstrap.field_c == 0) {
                              TexturedRoadFillRenderer.selectMusicTrack(20830, 0);
                            }
                          }
                          boolean decompiledSharedTail0 = (ClientMenuBootstrap.field_c != 13);
                          if (!decompiledSharedTail0) {
                            ((RaceSetupMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).reset((byte) 69, false);
                            decompiledSharedTail0 = (var5 != 0);
                          }
                          if (decompiledSharedTail0) {
                            ((GameMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).reset(false, -121);
                          }
                          LoginForm.field_G = 0;
                        }
                      }
                    }
                    decompiledFrameRemainder1 = (var5 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    BlobReadRequest.field_n = BlobReadRequest.field_n + 1;
                    if (ByteStorage.field_b != -1) {
                      stackIn_253_0 = (80 - BlobReadRequest.field_n) * 256 / 80;
                    } else {
                      stackIn_253_0 = BlobReadRequest.field_n * 256 / 80;
                    }
                    MenuList.field_h = stackIn_253_0;
                    if (BlobReadRequest.field_n == 80) {
                      BlobReadRequest.field_n = 0;
                      ClientMenuBootstrap.field_c = ByteStorage.field_b;
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      if (ClientMenuBootstrap.field_c != -1) {
                        if (13 == ClientMenuBootstrap.field_c) {
                          ((RaceSetupMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).update((byte) -109);
                          decompiledFrameRemainder1 = (var5 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          ((GameMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).update(102, true);
                          decompiledFrameRemainder1 = (var5 != 0);
                        }
                      }
                      if (decompiledFrameRemainder1) {
                        if (ByteStorage.field_b == 13) {
                          ((RaceSetupMenu) (CollisionGeometry.field_a[ByteStorage.field_b])).update((byte) -109);
                          decompiledFrameRemainder1 = (var5 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          ((GameMenu) (CollisionGeometry.field_a[ByteStorage.field_b])).update(50, true);
                          decompiledFrameRemainder1 = (var5 != 0);
                        }
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_283_1 = -1;
                stackIn_284_2 = (MidiPcmStream.field_U != null);
                var4 = this.processAccountScreens(stackIn_283_1, stackIn_284_2);
                if (var4 == 1) {
                  AgeValidator.setFullscreenEnabled(-29486, false);
                }
                if ((var4 != 1 ||
                  var5 != 0) &&
                  var4 == 2) {
                  EncryptedPacketWriter.quitToWebsite(true);
                }
                if (var5 != 0) {
                  if (ValidationIndicator.field_J == 0) {
                    this.field_C = this.field_C - 1;
                    this.field_C = 0;
                  } else {
                    this.field_C = 0;
                  }
                }
              }
            }
          } else {
            if (ValidationIndicator.field_J == 0) {
              this.field_C = this.field_C - 1;
              if (var5 != 0) {
                this.field_C = 0;
              }
            } else {
              this.field_C = 0;
            }
          }
          if (~AchievementStatusRequest.requestedBackground != ~BufferedRandomAccessFile.currentBackground) {
            fieldTemp$4 = MouseInputHandler.field_c + 1;
            MouseInputHandler.field_c = MouseInputHandler.field_c + 1;
            if (fieldTemp$4 >= 80 && (AchievementStatusRequest.requestedBackground == 1 ||
              BackgroundSprites.getBackgroundSprite(AchievementStatusRequest.requestedBackground, 2) != null)) {
              BufferedRandomAccessFile.currentBackground = AchievementStatusRequest.requestedBackground;
              MouseInputHandler.field_c = 0;
            }
          }
          if (ArchiveRequest.field_r != -1 &&
            UsernameLoginCredentials.pollRaceGraphicsLoaded(ResourceArchiveFactory.field_b, true)) {
            MusicPatchPcmStream.field_r = new RaceWorld(ResourceArchiveFactory.field_b, ArchiveRequest.field_r, BlobWriteRequest.field_j, PlayerStatsRequest.field_k, QuickChatPhraseDefinition.field_r, DiskCacheStore.field_i);
            ArchiveRequest.field_r = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.DA(" + param0 + ')');
        }
    }

    private final void finishGameLoading(byte param0) {
        int var2_int = 0;
        ShadedNineSlicePanel var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          GameKeyHandler.setTickRate((byte) -105, 50);
          if (!RoadShadowRenderer.isGuestMode((byte) 107)) {
            RoadSegment.setAlternateMenuItems(SubscriberAccessChecks.hasSubscriberAccess(-969), (byte) 97);
          }
          OutlinedRoadStripRenderer.field_r = -1;
          LoginCredentialType.field_c = false;
          LoginForm.field_P = 0;
          DelegatingCanvas.field_d = 7;
          this.field_C = 125;
          IntArrayReadRequest.field_l = -1;
          var2_int = 84 / ((42 - param0) / 51);
          StrongCacheEntry.field_w = 0;
          IntrusiveDeque.field_b = -1;
          ScoreSubmission.field_n = new IntrusiveDeque();
          SpriteDecodeGlobals.field_c = false;
          LoginForm.field_G = 0;
          ValidationIndicator.field_L = true;
          FullscreenErrorReason.populateCourseMenu((byte) 115);
          this.field_z = true;
          var3 = new ShadedNineSlicePanel();
          ClientBackgroundRenderer.configureMenuPresentation(20, 0, 480, field_F.ascent, 0, 0, 5, field_F.ascent, 0, field_F, field_F, 2, (NineSlicePanel) null, 320, 0, 240, (NineSlicePanel) null, 20, 0, 1, var3);
          stackIn_7_0 = !(CachedArchiveProvider.field_x < 2);
          RotatedSpriteCache.field_c = stackIn_7_0;
          TexturedRoadFillRenderer.selectMusicTrack(20830, 0);
          RotatedSpriteCache.startMenuDemoRace(-1);
          TexturedRoadFillRenderer.resetFrameTiming(110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.PA(" + param0 + ')');
        }
    }

    public static void clearClientReferences(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_E = null;
          field_B = null;
          if (param0 >= -13) {
            HoldTheLine.createMouseWheelInput((byte) -81);
          }
          field_F = null;
          field_G = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "HoldTheLine.RA(" + param0 + ')');
        }
    }

    final void renderGameFrame(int param0) {
        Object stackIn_5_0 = null;
        int stackIn_20_0 = 0;
        Object stackIn_20_1 = null;
        boolean stackIn_23_2 = false;
        boolean stackIn_103_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        long var3 = 0L;
        int var3_int = 0;
        long var5 = 0L;
        long var7 = 0L;
        String var9 = null;
        int var10 = 0;
        var10 = field_D;
        try {
          if (MidiPcmStream.field_U == null) {
            stackIn_5_0 = MouseInputHandler.field_b;
          } else {
            stackIn_5_0 = MidiPcmStream.field_U;
          }
          var2 = stackIn_5_0;
          if (BufferedSocket.isClientUiLoading((byte) -128)) {
            stackIn_20_0 = -63;
            stackIn_20_1 = var2;
            stackIn_23_2 = (null != MidiPcmStream.field_U) || (CourseDefinition.field_a);
            ClientScreenRenderer.drawClientLoadingOrMenuWithIntGuard(stackIn_20_0, (java.awt.Canvas) (stackIn_20_1), stackIn_23_2);
            return;
          }
          if (!this.field_z) {
            MidiNote.drawAccountScreen((byte) -97, (java.awt.Canvas) (var2));
            return;
          }
          if (!RotatedSpriteAsset.isPlayerProgressLoaded(param0 ^ 318)) {
            CacheEntry.setAccountStatus(param0 ^ 350, MeshMaterial.field_b, 100.0f);
            MidiNote.drawAccountScreen((byte) -97, (java.awt.Canvas) (var2));
            return;
          }
          PendingMusicLoader.pollPendingMusic((byte) 120);
          if (this.field_C > 0) {
            SoftwareRasterizer.clear();
            StereoMusicSample.field_a.drawUnkeyed(0, 0);
            if (this.field_C < 25) {
              var3_int = 1280 * this.field_C / 25 - 640;
              if (var3_int < 0) {
                SecondaryNodeDequeIterator.drawRaceOrLoadingScreen(param0 - 256);
                BackgroundSprites.adjustRectangleSaturationAndBrightness(128, 480, 0, 128, 640, param0 - 4697, 0);
              }
              MenuHitTesting.field_d.draw(var3_int, 0);
            }
            InheritedWidgetStyle.paintRasterBuffer((java.awt.Canvas) (var2), 0, true, 0);
            return;
          }
          if (param0 != 256) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (ByteStorage.field_b == ClientMenuBootstrap.field_c) {
            if (-1 == ClientMenuBootstrap.field_c) {
              SecondaryNodeDequeIterator.drawRaceOrLoadingScreen(param0 ^ 256);
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              ClientBackgroundRenderer.drawBackground(false);
              CollisionGeometry.field_a[ClientMenuBootstrap.field_c].draw(-55);
              decompiledFrameRemainder0 = (var10 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (ClientMenuBootstrap.field_c == -1) {
              if (!EntitySound.field_j) {
                if (BlobReadRequest.field_n < 40) {
                  SecondaryNodeDequeIterator.drawRaceOrLoadingScreen(0);
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 12566463, BlobReadRequest.field_n * 512 / 80);
                  decompiledFrameRemainder0 = (var10 != 0);
                }
                if (decompiledFrameRemainder0) {
                  ClientBackgroundRenderer.drawBackground(false);
                  CollisionGeometry.field_a[ByteStorage.field_b].draw(param0 ^ -311);
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 12566463, -(512 * BlobReadRequest.field_n / 80) + 512);
                  decompiledFrameRemainder0 = (var10 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                SecondaryNodeDequeIterator.drawRaceOrLoadingScreen(0);
                PacketBuffer.drawBackgroundAlpha(param0 - 152, (BlobReadRequest.field_n << 8) / 80);
                CollisionGeometry.field_a[ByteStorage.field_b].draw(-55);
                decompiledFrameRemainder0 = (var10 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == ByteStorage.field_b) {
                if (EntitySound.field_j) {
                  SecondaryNodeDequeIterator.drawRaceOrLoadingScreen(0);
                  PacketBuffer.drawBackgroundAlpha(116, 256 - (BlobReadRequest.field_n << 8) / 80);
                  CollisionGeometry.field_a[ClientMenuBootstrap.field_c].draw(-55);
                  decompiledFrameRemainder0 = (var10 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (BlobReadRequest.field_n >= 40) {
                    SecondaryNodeDequeIterator.drawRaceOrLoadingScreen(0);
                    SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 12566463, -((BlobReadRequest.field_n << 9) / 80) + 512);
                    if (var10 != 0) {
                      ClientBackgroundRenderer.drawBackground(false);
                      CollisionGeometry.field_a[ClientMenuBootstrap.field_c].draw(param0 ^ -311);
                      SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 12566463, (BlobReadRequest.field_n << 9) / 80);
                      ClientBackgroundRenderer.drawBackground(false);
                      CollisionGeometry.field_a[ClientMenuBootstrap.field_c].draw(-55);
                    }
                  } else {
                    ClientBackgroundRenderer.drawBackground(false);
                    CollisionGeometry.field_a[ClientMenuBootstrap.field_c].draw(param0 ^ -311);
                    SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 12566463, (BlobReadRequest.field_n << 9) / 80);
                    if (var10 != 0) {
                      ClientBackgroundRenderer.drawBackground(false);
                      CollisionGeometry.field_a[ClientMenuBootstrap.field_c].draw(-55);
                    }
                  }
                }
              } else {
                ClientBackgroundRenderer.drawBackground(false);
                CollisionGeometry.field_a[ClientMenuBootstrap.field_c].draw(-55);
              }
            }
          }
          boolean decompiledSharedTail0 = !(LoginCredentialType.isScreenOptionsOpen(108));
          if (!decompiledSharedTail0) {
            RasterDesaturation.desaturateRectangle(640, 480, 0, param0 ^ 256, 0, 128);
            AccountProtocolContext.drawScreenOptionsPopup(false);
            decompiledSharedTail0 = (var10 != 0);
          }
          if ((decompiledSharedTail0) &&
            (ReflectionCheck.beginReconnectWait(false))) {
            stackIn_103_0 = (MidiPcmStream.field_U != null) || (CourseDefinition.field_a);
            WidgetStyleNode.drawClientContent(stackIn_103_0, true);
          }
          if (LoginCredentialType.field_c) {
            ResourceArchiveFactory.field_c.draw(Integer.toString(IterableSecondaryNodeDeque.field_f), 10, 30, 0, -1);
            var3 = Runtime.getRuntime().totalMemory();
            var5 = Runtime.getRuntime().freeMemory();
            var7 = var3 - var5;
            var9 = (int)(var7 >> 10) + "kB";
            ResourceArchiveFactory.field_c.draw(var9, 10, 50, 0, -1);
          }
          InheritedWidgetStyle.paintRasterBuffer((java.awt.Canvas) (var2), 0, true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2_ref), "HoldTheLine.LA(" + param0 + ')');
        }
    }

    private final void loadGameResources(boolean param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = field_D;
        try {
          ClientMenuBootstrap.initializeMenuItems(-9342);
          if (param0) {
            DiskCacheWorker.processAccountUiFrame(LoginForm.field_T, (byte) -81);
          }
          if (RaceSetupMenu.field_y == null &&
            SubscriberAccessChecks.hasSubscriberAccess(-969)) {
            RaceSetupMenu.field_y = BlobReadRequest.requestArchiveKey(10, 31043, 2, 0);
          }
          if (null == RotatedSpriteCache.field_g) {
            MusicPatchEnvelope.field_f = false;
            AccountProtocolState.field_a = false;
            RotatedSpriteCache.field_g = new LeaderboardRequest[4];
            if (!RoadShadowRenderer.isGuestMode((byte) 82)) {
              RotatedSpriteAsset.field_k = SpriteSheetAsset.requestAchievementStatus((byte) -114, 4);
              IsaacRandom.field_g = InheritedWidgetStyle.requestBlobRead(6, -91);
            }
          }
          if (null != SocialListProtocol.field_d &&
            !SocialListProtocol.field_d.ensureIndexLoaded((byte) -90)) {
            CacheEntry.setAccountStatus(107, NetworkGameClient.field_r, 2.0f);
            return;
          }
          if (null != PacketBuffer.field_m) {
            if (!PacketBuffer.field_m.ensureIndexLoaded((byte) -49)) {
              CacheEntry.setAccountStatus(125, NetworkGameClient.field_r, 3.0f);
              return;
            }
            if (!ClientLifecycleUtilities.pollGameAudioLoaded(PacketBuffer.field_m, SocialListProtocol.field_d, 10302)) {
              CacheEntry.setAccountStatus(85, Cp1252CharacterRules.field_f, 4.0f);
              return;
            }
          }
          if (null != EntitySound.field_i && (!EntitySound.field_i.ensureIndexLoaded((byte) -94) ||
            !SoundCache.field_c.ensureIndexLoaded((byte) -111))) {
            CacheEntry.setAccountStatus(91, SolidRoadStripRenderer.field_o, 10.0f);
            return;
          }
          if (null != DropTargetWidget.field_J) {
            if (!DropTargetWidget.field_J.ensureIndexLoaded((byte) -67)) {
              CacheEntry.setAccountStatus(117, Vector2f.field_d, 12.0f);
              return;
            }
            if (!StandardContentTransitionDialog.field_lb.ensureIndexLoaded((byte) -86)) {
              CacheEntry.setAccountStatus(104, Vector2f.field_d, 14.0f);
              return;
            }
            if (!HuffmanTextCodec.field_a.ensureIndexLoaded((byte) -102)) {
              CacheEntry.setAccountStatus(119, SpriteAsset.field_d, 15.0f);
              return;
            }
            if (!IntArrayReadRequest.pollGameGraphicsLoaded(HuffmanTextCodec.field_a, DropTargetWidget.field_J, (byte) 111, StandardContentTransitionDialog.field_lb)) {
              CacheEntry.setAccountStatus(98, ContentTransitionState.field_a, 16.0f);
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != QuadraticPointPath.field_j) {
            if ((QuadraticPointPath.field_j.ensureIndexLoaded((byte) -73) &&
              QuadraticPointPath.field_j.tryLoadAllGroups((byte) 108)) &&
              (decompiledFrameRemainder0 = (!(NetworkArchiveRequest.field_y.ensureIndexLoaded((byte) -53)) ||
              !(NetworkArchiveRequest.field_y.tryLoadAllGroups((byte) 126))))) {
              CacheEntry.setAccountStatus(89, ByteStorage.formatGroupLoadingStatus(TextButton.field_E, RoadStripRenderer.field_a, "", false, NetworkArchiveRequest.field_y), 35.0f);
              return;
            }
            if (decompiledFrameRemainder0) {
              CacheEntry.setAccountStatus(114, ByteStorage.formatGroupLoadingStatus(TextButton.field_E, RoadStripRenderer.field_a, "", param1, QuadraticPointPath.field_j), 30.0f);
              return;
            }
          }
          if (!param0) {
            CacheEntry.setAccountStatus(126, TutorialCalloutAnchor.field_a, 40.0f);
            return;
          }
          if (!NameAvailabilityResult.field_h) {
            NameSuggestionsPanel.finishAccountAnimations((byte) 22);
            NameAvailabilityResult.field_h = true;
          }
          if (null != SocialListProtocol.field_d &&
            null != PacketBuffer.field_m) {
            CacheEntry.setAccountStatus(108, TutorialCalloutAnchor.field_a, 40.0f);
            this.renderGameFrame(256);
            ArchiveCompression.initializeGameSounds(PacketBuffer.field_m, (byte) -66, SocialListProtocol.field_d);
            SocialListProtocol.field_d = null;
            PacketBuffer.field_m = null;
            TexturedRoadFillRenderer.resetFrameTiming(72);
            return;
          }
          if (SoundCache.field_c != null) {
            CacheEntry.setAccountStatus(113, SpriteLayoutUtilities.field_b, 60.0f);
            this.renderGameFrame(256);
            MenuSelectionController.initializeMusicArchives(EntitySound.field_i, -127, SoundCache.field_c);
            EntitySound.field_i = null;
            SoundCache.field_c = null;
            TexturedRoadFillRenderer.resetFrameTiming(56);
            return;
          }
          if (null != DropTargetWidget.field_J) {
            CacheEntry.setAccountStatus(111, RasterBuffer.field_g, 65.0f);
            this.renderGameFrame(256);
            DropTargetWidget.loadGameGraphics(30865, StandardContentTransitionDialog.field_lb, DropTargetWidget.field_J, HuffmanTextCodec.field_a);
            DropTargetWidget.field_J = null;
            HuffmanTextCodec.field_a = null;
            TexturedRoadFillRenderer.resetFrameTiming(116);
            return;
          }
          if (null != QuadraticPointPath.field_j) {
            CacheEntry.setAccountStatus(110, WidgetStyleNode.field_r, 90.0f);
            this.renderGameFrame(256);
            DropTargetWidget.loadCourseProgression(QuadraticPointPath.field_j, -121);
            EmailDomainValidator.resetPlayerProgress(121);
            QuadraticPointPath.field_j = null;
            TexturedRoadFillRenderer.resetFrameTiming(94);
            return;
          }
          if (null != NetworkArchiveRequest.field_y &&
            SubscriberAccessChecks.hasSubscriberAccess(-969) &&
            RaceSetupMenu.field_y.key != null) {
            CacheEntry.setAccountStatus(106, WidgetStyleNode.field_r, 95.0f);
            this.renderGameFrame(256);
            MeshLighting.loadEncryptedCourses(NetworkArchiveRequest.field_y, RaceSetupMenu.field_y.key, -95);
            NetworkArchiveRequest.field_y = null;
            TexturedRoadFillRenderer.resetFrameTiming(88);
            return;
          }
          ContentTransitionState.field_c = new VehicleDefinition[8];
          var3_int = 0;
          do {
            if (var3_int >= 8) {
              if (null == MusicPatchPcmStream.field_r &&
                null == ResourceArchiveFactory.field_b) {
                RotatedSpriteCache.startMenuDemoRace(-1);
              }
              break;
            }
            ContentTransitionState.field_c[var3_int] = new VehicleDefinition(var3_int);
            var3_int++;
          } while (var4 == 0);
          if (param1) {
            this.initializeGame((byte) 4);
          }
          var3_int = 0;
          while (var3_int < 13) {
            CollisionGeometry.field_a[var3_int] = (MenuList) ((Object) new GameMenu(var3_int));
            var3_int++;
            if (var4 != 0) {
              return;
            }
          }
          CollisionGeometry.field_a[13] = (MenuList) ((Object) new RaceSetupMenu(13, new int[]{0, 1, 2, 3}, new Sprite[4], ViewportSizingController.field_t, new String[6], JagexLogoRenderer.field_c, 8355711));
          ClientMenuBootstrap.field_c = 0;
          this.finishGameLoading((byte) 107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3), "HoldTheLine.OA(" + param0 + ',' + param1 + ')');
        }
    }

    public HoldTheLine() {
    }

    static {
        field_A = 50;
        field_B = "no effect";
        field_E = new int[12];
        field_G = new String[]{"<col=2>You must reach this course in the Classic championship first.</col>", "<col=2>You must reach this course in the Desert championship first.</col>", "<col=2>You must reach this course in the Alpine championship first.</col>", "<col=2>You must reach this course in the Night championship first.</col>"};
    }
}
