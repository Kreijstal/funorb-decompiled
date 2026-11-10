/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ZombieDawn extends GameLoopApplet {
    private boolean field_F;
    static Js5Archive field_H;
    static long[] field_E;
    private StringBuilder field_I;
    private StringBuilder field_G;
    static Font field_K;
    static String field_D;
    public static int field_J;

    final void onStartup(byte param0) {
        this.initializeClient(41, 7, 11, false, 9, 0, 1, 10);
        int var2 = 89 / ((35 - param0) / 49);
        BlastParticle.field_d = new GameResourceLoader();
        this.startWithLoader(BlastParticle.field_d, (byte) 14);
        MidiPcmStream var3 = new MidiPcmStream();
        var3.selectChannelBank(128, (byte) -128, 9);
        AreaSelectionScreen.initializeAudioOutputs(SpriteFadeHelpers.field_a, true, (java.awt.Component) ((Object) IntrusiveDequeCursor.field_d), var3, 22050, -97);
        this.enableOptionalResponses(false, true, true, false, -6046);
    }

    final boolean isConnectionBusy(int param0) {
        if (param0 != 10) {
          field_E = (long[]) null;
          return false;
        }
        return false;
    }

    public final boolean onKeyTyped(char param0, int param1, int param2) {
        if (null != GameApplet.field_c &&
          ProgressMessageDialog.field_eb == GameApplet.field_c) {
          return GameApplet.field_c.handleKeyPress(param1, 65793, param0);
        }
        if (param2 != 20) {
          return true;
        }
        return false;
    }

    public final void drawFrame(int param0) {
        MenuScreen stackIn_5_0 = null;
        MenuScreen var2;
        PaletteBitmapFont var2_ref;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        MenuScreen var17;
        Runtime var18;
        int var3Lifetime1;
        int var5Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var5Lifetime1Lifetime1;
        var16 = field_J;
        Rasterizer.clear();
        if (ProgressMessageDialog.field_eb != GameApplet.field_c) {
          if (GameApplet.field_c.field_d == 0) {
            stackIn_5_0 = ProgressMessageDialog.field_eb;
          } else {
            stackIn_5_0 = GameApplet.field_c;
          }
          var17 = stackIn_5_0;
          var2 = var17;
          if (BlastParticle.field_d.field_n &&
            MeleeHuman.field_xb >= 16) {
            MeleeHuman.field_xb = 15;
          }
          if (16 <= MeleeHuman.field_xb) {
            ProgressMessageDialog.field_eb.drawBackground((byte) 108);
            ProgressMessageDialog.field_eb.drawScreen((byte) -102);
            var17.drawTransitionFade(512 - (MeleeHuman.field_xb << 4), (byte) -128, true);
          } else {
            GameApplet.field_c.drawBackground((byte) 120);
            GameApplet.field_c.drawScreen((byte) -118);
            var17.drawTransitionFade(MeleeHuman.field_xb << 4, (byte) 46, false);
          }
        } else {
          GameApplet.field_c.drawBackground((byte) 112);
          GameApplet.field_c.drawScreen((byte) -86);
        }
        boolean decompiledFrameRemainder0 = true;
        if (BlastParticle.field_d.field_n && (0.0f < BlastParticle.field_d.field_b ||
          this.field_F)) {
          this.field_F = true;
          var2_ref = ProgressMessageDialog.field_jb;
          var3 = 380;
          var4_ref_String = ArchiveIndex.field_l;
          var5 = ((Font) ((Object) var2_ref)).textWidth(var4_ref_String);
          if (var3 > var5) {
            var5 = var3 + 20;
          }
          var6 = 100;
          var7 = DropdownList.field_G;
          var8 = WhirlpoolHasher.field_d;
          var9 = -(var6 / 2) + var7;
          var10 = -(var5 / 2) + var8 - 10;
          var11 = 10 + (var5 / 2 + var8);
          var12 = var6 / 2 + var7;
          Mover.intersectClipIntArgs(var9, 99, var11, var12, var10);
          if (WhirlpoolHasher.field_e == 640 &&
            480 == DropdownList.field_P) {
            ArmedHuman.field_Hb[0].drawWithOffsets(0, 0);
            ArmedHuman.field_Hb[0].drawAdditive(0, 0, 256);
          } else {
            var13 = WhirlpoolHasher.field_e / 128;
            var14 = DropdownList.field_P / 96;
            ArmedHuman.field_Hb[0].drawScaled(-var13, -var14, 2 * var13 + WhirlpoolHasher.field_e, var14 * 2 + DropdownList.field_P);
            ArmedHuman.field_Hb[0].drawScaledAdditive(-var13, -var14, WhirlpoolHasher.field_e + 2 * var13, var14 * 2 + DropdownList.field_P, 150);
          }
          Rasterizer.setClip(var10, var9, var8, var7);
          DualLinkNodeHashTable.field_f.drawTransparent(var10, var9);
          Rasterizer.setClip(var8, var9, var11, var7);
          DualLinkNodeHashTable.field_f.drawTransparent(-DualLinkNodeHashTable.field_f.field_w + var11, var9);
          Rasterizer.setClip(var10, var7, var8, var12);
          DualLinkNodeHashTable.field_f.drawTransparent(var10, -DualLinkNodeHashTable.field_f.field_t + var12);
          Rasterizer.setClip(var8, var7, var11, var12);
          DualLinkNodeHashTable.field_f.drawTransparent(var11 - DualLinkNodeHashTable.field_f.field_w, -DualLinkNodeHashTable.field_f.field_t + var12);
          Rasterizer.setClip(var10, var9, var11, var12);
          ((Font) ((Object) var2_ref)).drawStringCentered(var4_ref_String, WhirlpoolHasher.field_d, DropdownList.field_G, 2, -1);
          var13Lifetime1 = (int)(BlastParticle.field_d.field_b * (float)var3 / 100.0f);
          Rasterizer.fillRect(var8 - var3 / 2, 10 + var7, var3, 12, 0);
          Rasterizer.setClip(-(var3 / 2) + var8, var7 + 10, var8 + (-(var3 / 2) + var13Lifetime1), var7 + 22);
          if (WhirlpoolHasher.field_e == 640 &&
            480 == DropdownList.field_P) {
            ArmedHuman.field_Hb[3].drawWithOffsets(0, 0);
            ArmedHuman.field_Hb[3].drawAdditive(0, 0, 150);
          } else {
            var14Lifetime1 = WhirlpoolHasher.field_e / 128;
            var15 = DropdownList.field_P / 96;
            ArmedHuman.field_Hb[3].drawScaled(-var14Lifetime1, -var15, var14Lifetime1 * 2 + WhirlpoolHasher.field_e, 2 * var15 + DropdownList.field_P);
            ArmedHuman.field_Hb[3].drawScaledAdditive(-var14Lifetime1, -var15, 2 * var14Lifetime1 + WhirlpoolHasher.field_e, 2 * var15 + DropdownList.field_P, 150);
          }
          Rasterizer.drawRectOutline(-(var3 / 2) + var8, var7 + 10, var3, 12, 4458504);
          SingleChildWidget.popRasterState(param0 ^ 26807);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_F = false;
        }
        if (SavedDataRequest.field_j >= 2 &&
          LongAndTextLoginPayload.field_f) {
          if (this.field_G == null) {
            this.field_G = new StringBuilder("Mem: 00000KiB");
            this.field_I = new StringBuilder("FPS: 00");
          }
          if (MusicCrossfadeStream.field_p % 50L == 0L) {
            var18 = Runtime.getRuntime();
            var3Lifetime1 = (int)(var18.totalMemory() - var18.freeMemory()) >> 10;
            var4 = NineSliceFrame.field_d;
            for (var5Lifetime1 = 9; var5Lifetime1 > 4; var5Lifetime1--) {
              this.field_G.setCharAt(var5Lifetime1, (char)(var3Lifetime1 % 10 + 48));
              var3Lifetime1 = var3Lifetime1 / 10;
            }
            for (var5Lifetime1Lifetime1 = 6; var5Lifetime1Lifetime1 > 4; var5Lifetime1Lifetime1--) {
              this.field_I.setCharAt(var5Lifetime1Lifetime1, (char)(48 + var4 % 10));
              var4 = var4 / 10;
            }
          }
          Js5Transport.field_k.drawString(this.field_G.toString(), 5, 20, 16777215, 1);
          Js5Transport.field_k.drawString(this.field_I.toString(), 5, 35, 16777215, 1);
        }
        if (param0 != -14964) {
          this.field_G = (StringBuilder) null;
        }
    }

    public ZombieDawn() {
        LoadingProgressDialog.field_Y = this;
    }

    final void onLoadingFinished(int param0) {
        if (GameApplet.field_c.field_d == 6 &&
          !LoginPayloadKind.isAllZero(8, PasswordValidator.field_g)) {
          GameApplet.field_c = SweepingSpotlight.getScreen(3, 123);
          UiResourceHelpers.switchScreenMusic(false, true, 3);
        } else {
          if (LinkTextPainter.field_h != 2147483647) {
            UiResourceHelpers.switchScreenMusic(true, true, LinkTextPainter.field_h);
          }
        }
        if (param0 != 1235) {
          this.field_F = true;
        }
        MidiNoteMask.rebuildAllScreenItems(0);
        if (0 < OctaveNoiseMap.field_j) {
          BlastParticle.field_d.requestMemberAssets(param0 - 1126, 1);
        }
    }

    final void startMainMenu(boolean param0) {
        SecondaryNodeDequeIterator.installViewController(-107, param0);
        DisplayNameForm.createMenuScreens(0);
        NineSliceFrame.initializeAchievementAvailability((byte) -67);
        GameApplet.field_c = SweepingSpotlight.getScreen(11, 122);
        UiResourceHelpers.switchScreenMusic(true, true, 1);
        DirectByteStorage.setTargetFrameRate(50, (byte) 3);
        if (!LoginConnectionHelpers.field_e) {
          AbstractSprite.setSoundEffectVolume(false, 224);
          ZombieDawn.setMusicVolume(119, 288);
          SpriteSheetArchiveHelpers.playMusicTrackDefault((byte) 106, ArchiveProvider.field_a[0]);
        }
        if (!LoginConnectionHelpers.field_e &&
          !MeleeHuman.isGuestSession(13296)) {
          TextAndNameCredentials.requestIntArray(102, 4);
        }
        PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
    }

    final void onConnectionResult(int param0, int param1) {
        if (param1 < 27) {
          field_K = (Font) null;
        }
    }

    public final void runTick(boolean param0, boolean param1) {
        int var4;
        QueuedStatSubmission var5;
        var4 = field_J;
        MusicCrossfadeStream.field_p = MusicCrossfadeStream.field_p + 1L;
        if (WhirlpoolHasher.field_e != Alien.field_eb ||
          FrameSpriteHelpers.field_c != DropdownList.field_P) {
          DropdownList.field_P = FrameSpriteHelpers.field_c;
          WhirlpoolHasher.field_e = Alien.field_eb;
          SpriteFadeHelpers.field_b = (-640 + WhirlpoolHasher.field_e) / 2;
          MoveTargetMarker.field_d = WhirlpoolHasher.field_e;
          ArrivingPassenger.field_Bb = DropdownList.field_P;
          LevelObstacle.field_M = (DropdownList.field_P - 480) / 2;
          DropdownList.field_I = DropdownList.field_P / 24 + 2;
          WhirlpoolHasher.field_a = WhirlpoolHasher.field_e / 24 + 2;
          WhirlpoolHasher.field_d = WhirlpoolHasher.field_e / 2;
          DropdownList.field_G = DropdownList.field_P / 2;
          if (MusicPatchNode.field_h != null && (MusicPatchNode.field_h.field_w != WhirlpoolHasher.field_e ||
            MusicPatchNode.field_h.field_t != DropdownList.field_P)) {
            MusicPatchNode.field_h = null;
            MusicPatchNode.field_h = new Sprite(WhirlpoolHasher.field_e, DropdownList.field_P);
          }
          TileMap.field_q = -1;
        }
        if (!MeleeHuman.isGuestSession(13296)) {
          while (true) {
            var5 = (QueuedStatSubmission) (DialogLayer.field_D.removeLast(123));
            if (var5 == null) {
              break;
            }
            HighscoreSubmissionHelpers.queueHighscoreSubmission(5, var5, -62);
          }
        }
        BlastParticle.field_d.processResourceQueue(47);
        if (param1) {
          this.isConnectionBusy(20);
        }
        if (ArmySoldier.hasActiveDialog((byte) -80)) {
          param0 = false;
        }
        if (BlastParticle.field_d.field_n) {
          return;
        }
        if (GameApplet.field_c == ProgressMessageDialog.field_eb) {
          GameApplet.field_c.handleInput((byte) -102, param0);
        } else {
          if (ProgressMessageDialog.field_eb.field_d == 0) {
            ProgressMessageDialog.field_eb.handleInput((byte) -115, param0);
          }
          MeleeHuman.field_xb = MeleeHuman.field_xb + 1;
          if (MeleeHuman.field_xb == 32) {
            if (GameApplet.field_c.field_d == 3) {
              WhirlpoolHasher.field_m = null;
            }
            GameApplet.field_c.onReplacedByScreen(ProgressMessageDialog.field_eb, 72);
            GameApplet.field_c = ProgressMessageDialog.field_eb;
            MeleeHuman.field_xb = 0;
          }
        }
    }

    final void onShutdown(int param0) {
        IntroCutsceneScreen.shutdownAudioOutputs(-16861);
        if (param0 != 16850) {
          return;
        }
        MainMenuScreen.shutdownDisplayAndInput(1);
    }

    final boolean handlePacket(BitPacketBuffer param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 2) {
            ZombieDawn.setMusicVolume(-101, 34);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ZombieDawn.HA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void setMusicVolume(int param0, int param1) {
        VisualPropertyNode.field_u = param1;
        if (PowerupBar.field_o != null) {
          PowerupBar.field_o.setMasterVolume(param1, (byte) -64);
        }
        if (param0 < 112) {
          ZombieDawn.setMusicVolume(-94, 83);
        }
        if (null != ScreechEffect.field_p) {
          ScreechEffect.field_p.setVolume((byte) 122, param1);
        }
    }

    final static void showLoginChoiceDialog(int param0) {
        if (param0 != -10401) {
          ZombieDawn.releaseStatics((byte) 6);
        }
        HuffmanCodec.field_d.transitionToContent(20, new AccountWelcomePanel());
    }

    final void releaseStaticResources(boolean param0) {
        ZombieDawn.releaseStatics((byte) 114);
        DialogLayerFrameHelpers.releaseStatics(4);
        IntrusiveDeque.releaseStatics((byte) -61);
        Rasterizer.releaseStatics();
        Font.releaseStatics();
        BitPacketBuffer.releaseStatics(-98);
        SettingsCookieHelpers.clearStatics(-1);
        SessionSocketHolder.releaseStatics(false);
        GameLoopApplet.releaseStatics((byte) -125);
        SpriteSheetDecoder.releaseStatics(-12637);
        PageReloadHelpers.releaseStatics(false);
        LoginNameSupport.releaseStatics(0);
        LoginDialogGlobals.releaseStatics((byte) 85);
        PopupMenuBuilder.releaseStatics(4);
        PaletteFontFactory.releaseStatics(-20441);
        MenuScreen.releaseStatics((byte) 2);
        AchievementsScreen.releaseStatics((byte) 69);
        SpriteSheetArchiveHelpers.releaseStatics(-1);
        GameKeyHandler.releaseStatics((byte) 85);
        FunOrbApplet.releaseStatics(false);
        ClientException.releaseStatics((byte) 86);
        GameApplet.releaseStatics(40);
        JaggrabDownloader.releaseStatics(-72);
        MouseInputHandler.releaseStatics(-14380);
        MouseWheelInput.releaseStatics(103);
        Js5Archive.releaseStatics(108);
        MenuSpriteGlobals.releaseStatics(41);
        RankingRowHelpers.releaseStatics(13);
        PacketBuffer.releaseStatics(27291);
        MonotonicClock.releaseStatics((byte) -117);
        LoginMethodCookieHelpers.releaseStatics((byte) 83);
        LoginAndPacketHelpers.releaseStatics(true);
        AudioSetupHelpers.releaseStatics(0);
        KeyStateHelpers.releaseStatics(127);
        AppletHostHelpers.releaseStatics((byte) -121);
        LoginUiHelpers.releaseStatics(true);
        ChatMessage.releaseStatics(-2008296413);
        LoadingAndMapHelpers.releaseStatics(param0);
        LoginPacketHelpers.releaseStatics(16);
        ReflectionQueueHelpers.releaseStatics(-1);
        TickClock.releaseStatics(-5);
        RasterBuffer.releaseStatics(16);
        ArchivePreloader.releaseStatics(50);
        FullscreenFocusCanvas.releaseStatics(71);
        ViewportController.releaseStatics((byte) 49);
        ErrorReportHelpers.releaseStatics(false);
        GameWorld.releaseStatics(!param0 ? true : false);
        GameResourceLoader.releaseStatics(123);
        IntrusiveNode.releaseStatics((byte) 61);
        MeshDepthBuckets.releaseStatics((byte) 126);
        SpecularTableHelpers.releaseStatics(false);
        VorbisSample.releaseStatics();
        SoundEffectLibrary.releaseStatics((byte) 118);
        UiResourceHelpers.releaseStatics(true);
        MembershipPromotionScreen.releaseStatics(true);
        AccountResultHelpers.releaseStatics((byte) -54);
        IntroCutsceneScreen.releaseStatics((byte) -112);
        AreaSelectionScreen.releaseStatics((byte) -104);
        InstructionsScreen.releaseStatics(-25585);
        LevelSelectScreen.releaseStatics((byte) -95);
        Js5Transport.releaseStatics(!param0 ? true : false);
        ExceptionWrapper.releaseStatics((byte) -122);
        Js5ArchiveManager.releaseStatics(-16785);
        BufferedFile.releaseStatics(0);
        BufferedSocket.releaseStatics((byte) 105);
        NodeHashTable.releaseStatics(-974314864);
        MusicPatchNode.clearStatics(-9742);
        MidiFileReader.releaseStatics();
        MusicPatchPcmStream.releaseStatics((byte) 10);
        AudioOutput.releaseStatics();
        MusicCrossfadeStream.releaseStatics(0);
        MasterIndexHelpers.releaseStatics(126);
        HighscoreSubmissionHelpers.releaseStatics((byte) 68);
        MenuSelection.releaseStatics(false);
        LoginPromptTexts.releaseStatics(128);
        LoginConnectionHelpers.releaseStatics((byte) -126);
        DualLinkNode.releaseStatics(-107);
        AchievementBanner.clearStatics((byte) 93);
        SoundEffectPlayer.releaseStatics(-79);
        SpatialGrid.releaseStatics((byte) -86);
        BootstrapLoadingHelpers.releaseStatics(-21);
        DecodedSpriteHelpers.releaseStatics((byte) -99);
        HighscoresScreen.releaseStatics((byte) 112);
        LevelResultScreen.releaseStatics(false);
        LevelNavigation.releaseStatics((byte) -115);
        Camera.releaseStatics(60);
        LevelHud.releaseStatics((byte) 93);
        PowerupBar.releaseStatics((byte) 73);
        MoveTargetMarker.releaseStatics(97);
        Zombie.releaseStatics(54);
        Human.releaseStatics(60);
        TileMap.releaseStatics((byte) 122);
        Mover.releaseStatics(0);
        Point.releaseStatics((byte) -125);
        WorldObject.releaseStatics(237239984);
        RoamingCountryHuman.releaseStatics(-96);
        MenuBackgroundActor.releaseStatics(-71);
        ObstacleFactory.releaseStatics(28186);
        LoginNameValue.releaseStatics(-9);
        CutsceneStateHelpers.releaseStatics(-79);
        TutorialTipHelpers.releaseStatics(6);
        LoginPayloadKind.releaseStatics(-11486);
        AbstractSprite.releaseStatics(-6633);
        SpriteState.releaseStatics((byte) -77);
        FadingModalPanel.releaseStatics(123);
        DialogLayer.releaseStatics(0);
        FullscreenErrorDialog.releaseStatics(10);
        MidiNoteMask.releaseStatics(117);
        MusicPatch.releaseStatics((byte) 13);
        FullscreenCanvasHelpers.releaseStatics(0);
        TextDecodeHelpers.releaseStatics((byte) -103);
        IsaacCipher.releaseStatics(-1640531527);
        RandomAccessCacheFile.releaseStatics(0);
        PacketRequestHelpers.releaseStatics(-128);
        OfflineLoginHelpers.releaseStatics((byte) 94);
        ScreenBlurHelpers.releaseStatics(96);
        OffsetHelpers.releaseStatics(2);
        VisualPropertyNode.clearStatics(-128);
        NineSliceFrame.releaseStatics(123);
        NameCharacterHelpers.releaseStatics(-51);
        AccountCreationDialog.releaseStatics(54);
        LoadingProgressDialog.releaseStatics((byte) 88);
        LoginDialog.releaseStatics(18072);
        ProgressMessageDialog.releaseStatics(false);
        AccountCreationForm.releaseStatics((byte) -31);
        AccountWelcomePanel.releaseStatics(true);
        LoginPanel.releaseStatics(-31608);
        AudioMixerHelpers.releaseStatics(117);
        LogoPoseHelpers.releaseStatics(79);
        FrameSpriteHelpers.releaseStatics((byte) 122);
        MainMenuScreen.releaseStatics(-5);
        SpriteEffectHelpers.releaseStatics();
        IntRecordReplyHelpers.releaseStatics(-101);
        AccountPromptTexts.releaseStatics(-107);
        SoundEffectCleanupHelpers.releaseStatics((byte) 61);
        FullscreenExitHelpers.releaseStatics(param0);
        ScreechEffect.releaseStatics(-2135443998);
        AddressHintGlobals.releaseStatics(256);
        CheckboxPainter.releaseStatics((byte) -51);
        StatefulWidgetRenderer.releaseStatics((byte) -68);
        DialWidgetPainter.releaseStatics(27803);
        MarkerSliderPainter.releaseStatics(-1);
        TextWidgetPainter.releaseStatics(4056);
        IntrusiveDequeCursor.releaseStatics(25808);
        SingleChildWidget.releaseStatics((byte) 25);
        TextLayout.releaseStatics(-1);
        DisplaySettingsDialog.releaseStatics((byte) -118);
        ResizableDialog.releaseStatics(-74);
        DropdownList.releaseStatics((byte) -29);
        TextButton.releaseStatics(-119);
        GridContainer.releaseStatics(0);
        UiContainer.releaseStatics(84);
        SpriteFadeHelpers.releaseStatics((byte) 31);
        ArchiveIndex.releaseStatics(13192);
        GzipDecompressor.releaseStatics(false);
        ArchiveProvider.releaseStatics((byte) -98);
        TriangleRasterizer.releaseStatics();
        GlowAreaSupport.releaseStatics((byte) 39);
        TriangleMesh.releaseStatics((byte) -45);
        SessionSocketHelpers.releaseStatics(false);
        BrowserUrlHelpers.releaseStatics((byte) 61);
        DimensionOnlyResizer.releaseStatics((byte) 87);
        RasterCanvasSizeTarget.releaseStatics(0);
        VisualPropertyOverrides.releaseStatics(112);
        DualLinkNodeHashTable.releaseStatics((byte) 88);
        DelegatingCanvas.releaseStatics(0);
        IntroSpeedHelpers.releaseStatics((byte) 113);
        IntKeyLookup.releaseStatics(-76);
        ByteStorage.releaseStatics(11021);
        Bzip2Decoder.releaseStatics();
        Bzip2State.releaseStatics(false);
        ReflectionCheckRequest.releaseStatics(128);
        ByteArrayPool.releaseStatics(1426);
        FullscreenFocusText.releaseStatics(4466);
        VorbisFloor.releaseStatics();
        PowerupNames.releaseStatics((byte) 92);
        QuickChatPhraseDefinition.releaseStatics(3);
        MenuFontGlobals.releaseStatics(25268);
        WeightedLruCache.releaseStatics(-1);
        MenuLayoutHelpers.releaseStatics((byte) 54);
        HuffmanCodec.releaseStatics(0);
        ResizableModeHelpers.releaseStatics(1222359528);
        ConnectionCleanupHelpers.releaseStatics(140);
        SocketConnector.releaseStatics(26161);
        ImageProducerRasterBuffer.releaseStatics(-1);
        Alien.releaseStatics((byte) 105);
        LevelObstacle.releaseStatics(-72);
        SpatialBucket.releaseStatics(-12220);
        LaserBarrier.clearStatics(!param0 ? true : false);
        GooPuddle.releaseStatics((byte) 47);
        Blast.releaseStatics(1);
        OctaveNoiseMap.releaseStatics(true);
        KeyHandlerHolder.releaseStatics((byte) 82);
        RopeLadder.releaseStatics(!param0 ? true : false);
        WorldNames.releaseStatics(127);
        TrafficVehicle.releaseStatics(true);
        ArmySoldier.releaseStatics(16777215);
        ScorePopup.releaseStatics(-106);
        BloodSplat.releaseStatics(114);
        ArrivingPassenger.clearStatics(95);
        CivilianHuman.releaseStatics(86);
        Tree.releaseStatics((byte) 117);
        HunterHuman.releaseStatics(255);
        ArmedHuman.releaseStatics(15213);
        PatrollingGuard.releaseStatics((byte) -73);
        SynthInstrument.releaseStatics();
        MinigunGunner.releaseStatics((byte) -73);
        MiasmaPuff.releaseStatics(0);
        ScriptedMinigunner.releaseStatics((byte) 91);
        CutsceneStartHelpers.releaseStatics(0);
        NetworkArchiveRequest.releaseStatics(false);
        SectorCacheStore.releaseStatics((byte) 79);
        DiskArchiveRequest.releaseStatics(1445852592);
        ArchiveRequest.releaseStatics(32);
        SoundFilter.releaseStatics();
        CaptionedContainer.releaseStatics(false);
        ValidatedTextWidget.releaseStatics(16604);
        EditableTextWidget.releaseStatics(!param0 ? true : false);
        ContentTransitionDialog.releaseStatics((byte) 122);
        StripedProgressBar.releaseStatics(-86);
        NameSuggestionsPanel.releaseStatics(false);
        HotspotTextWidget.releaseStatics(-27476);
        ValidationStatusIcon.releaseStatics(1569045130);
        ValidationMessageWidget.releaseStatics(102);
        CheckboxWidget.releaseStatics(12959);
        TextFieldValidator.releaseStatics(!param0 ? true : false);
        AccountTermsPanel.releaseStatics(67);
        TileOccupancyHelpers.releaseStatics((byte) 118);
        WhirlpoolHasher.releaseStatics(!param0 ? true : false);
        PhantomZombie.releaseStatics((byte) -104);
        MeleeHuman.clearStatics(-31113);
        DisplayState.releaseStatics(92);
        MultiHandleSliderWidget.releaseStatics((byte) -34);
        GrowableIntList.releaseStatics(-103);
        BitmapTextLayout.releaseStatics(-1819016370);
        DraggableWidget.releaseStatics(-1);
        ScrollContainer.releaseStatics(0);
        FullscreenConfirmationDialog.releaseStatics(false);
        FullscreenMembershipDialog.releaseStatics(4347);
        ScrollViewport.releaseStatics(13885);
        Scrollbar.releaseStatics((byte) -69);
        DirectByteStorage.releaseStatics((byte) -119);
        QuickChatCommandType.releaseStatics(true);
        SecondaryNodeDeque.releaseStatics((byte) -109);
        CacheEntry.releaseStatics(42);
        StrongCacheEntry.releaseStatics((byte) -113);
        ProxySocketConnector.releaseStatics(32);
        RankingQueryWriter.releaseStatics(256);
        NodeHashTableIterator.releaseStatics((byte) 122);
        SecondaryNodeDequeIterator.releaseStatics((byte) 48);
        PendingIntArrayRequest.releaseStatics((byte) -47);
        AchievementSubmission.releaseStatics(7644);
        NameCheckRequest.releaseStatics(-90);
        ClientProtocolStage.releaseStatics(25752);
        DelayedPacket.releaseStatics((byte) -44);
        SavedDataRequest.releaseStatics((byte) -79);
        QueuedStatSubmission.releaseStatics(110);
        RasterState.releaseStatics(-103);
        HighscoreRequest.releaseStatics(830);
        PendingRecordRequest.releaseStatics(0);
        NameListEntry.releaseStatics((byte) 49);
        TrackedSoundStream.releaseStatics((byte) 94);
        ThreeSliceButtonPainter.releaseStatics(!param0 ? true : false);
        LinkTextPainter.releaseStatics(true);
        InsetTextPainter.releaseStatics(-26642);
        PasswordFieldPainter.releaseStatics(param0);
        SpriteCheckboxPainter.releaseStatics(-59);
        WidgetContainer.releaseStatics((byte) -72);
        IconButtonPainter.releaseStatics(114);
        SocialListEntry.releaseStatics(-101);
        ArchiveLoadStep.releaseStatics((byte) -3);
        PendingFlagRequest.releaseStatics(-24231);
        PendingBytePayloadRequest.releaseStatics(0);
        PendingHighscoreRequest.releaseStatics(2);
        AccountRequestState.releaseStatics(80);
        AccountServerResult.releaseStatics(-25401);
        SoundEffectNode.releaseStatics(-5364);
        PowerupCard.releaseStatics(-27940);
        LoginMethod.releaseStatics((byte) 93);
        LongAndTextLoginPayload.releaseStatics(5);
        AlternateLongAndNameCredentials.clearStatics(25008);
        TextAndNameCredentials.releaseStatics(-1);
        FullscreenErrorReason.releaseStatics(true);
        MessageDialogContent.releaseStatics(true);
        WidgetStyleLayer.releaseStatics(120);
        TextLayoutLine.releaseStatics(15);
        DropdownArrowPainter.releaseStatics(false);
        EmptyWidgetPainter.releaseStatics(-67);
        DropdownSelectorPainter.releaseStatics((byte) -105);
        FocusDelegatingButton.releaseStatics(8);
        BlastParticle.releaseStatics(-14311);
        BlastAffectedObject.releaseStatics((byte) -123);
        GlassShard.releaseStatics(3);
        SweepingSpotlight.releaseStatics(2021978896);
        BulletCasing.releaseStatics((byte) 105);
        NameAvailabilityValidator.releaseStatics(!param0 ? true : false);
        PasswordValidator.releaseStatics(-2314);
        EmailSyntaxValidator.releaseStatics((byte) -13);
        EmailAvailabilityValidator.releaseStatics(1029);
        AgeValidator.releaseStatics(111);
        MatchingTextValidator.releaseStatics((byte) -127);
        ContentTransitionPhase.releaseStatics((byte) -86);
        TextHotspotRegion.releaseStatics(-26441);
        InputValidationResult.releaseStatics((byte) -90);
        this.host = null;
        this.field_I = null;
        this.field_G = null;
    }

    public final void init() {
        this.initializeApplet(12, 108, "zombiedawn");
    }

    public static void releaseStatics(byte param0) {
        field_K = null;
        field_H = null;
        field_D = null;
        field_E = null;
        if (param0 <= 109) {
          field_E = (long[]) null;
        }
    }

    static {
        field_E = new long[32];
        field_D = "Score";
    }
}
