/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameResourceLoader implements LoadingSequence {
    private long field_l;
    static int[] field_g;
    private String field_d;
    private boolean field_c;
    float field_b;
    private boolean field_i;
    boolean field_n;
    private int field_o;
    static String field_k;
    private int field_a;
    private int field_p;
    private int field_f;
    private boolean field_j;
    private boolean field_m;
    private SavedDataRequest[] field_q;
    static String field_e;
    private Js5Archive field_h;
    private int[] field_r;

    final void requestMemberAssets(int param0, int param1) {
        int var3 = 26 / ((-33 - param0) / 58);
        if (param1 == 1) {
          BulletCasing.field_h.loadGroupByName(-1, "menusuk");
          this.queueResourceGroup(false, 12);
        }
    }

    final boolean ensureResourceGroupLoaded(int param0, int param1) {
        if (AccountPromptTexts.field_a[param1]) {
          return true;
        }
        this.field_n = true;
        if (QuickChatPhraseCache.field_b == (long)param0) {
          QuickChatPhraseCache.field_b = MonotonicClock.monotonicTimeMillis(-22826);
        }
        if (!this.loadOrUnloadResourceGroup(false, param1, param0 ^ 95)) {
          return false;
        }
        MonotonicClock.monotonicTimeMillis(-22826);
        QuickChatPhraseCache.field_b = 0L;
        this.field_n = !this.isQueueEmpty((byte) 126) ? true : false;
        AccountPromptTexts.field_a[param1] = true;
        PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
        return true;
    }

    public static void releaseStatics(int param0) {
        int var1 = 56 / ((param0 - 0) / 50);
        field_e = null;
        field_k = null;
        field_g = null;
    }

    public final void bindArchives(int param0) {
        if (param0 < 72) {
          this.updateTimedProgressKeepCaption(-0.6271905303001404f, 80, -50, -1.1520227193832397f);
        }
        if (ChatMessage.field_f != null) {
          FocusDelegatingButton.loadInterfaceText(ChatMessage.field_f, 734);
          ChatMessage.field_f = null;
          PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
        }
        if (LoginConnectionHelpers.field_e) {
          AchievementsScreen.field_p = GooPuddle.openCachedArchive(0, (byte) -113);
          WidgetStyleLayer.field_i = GooPuddle.openCachedArchive(1, (byte) -115);
        }
        BulletCasing.field_h = GooPuddleCell.openArchive(true, false, 2, true, 1);
        ZombieDawn.field_H = GooPuddle.openCachedArchive(3, (byte) -115);
        IntRecordReplyHelpers.field_e = GooPuddleCell.openArchive(true, true, 8, true, 1);
        BufferedSocket.field_h = GooPuddleCell.openArchive(true, false, 4, true, 1);
        RandomAccessCacheFile.field_i = GooPuddleCell.openArchive(true, false, 5, true, 1);
        TextButton.field_B = GooPuddleCell.openArchive(true, false, 6, true, 1);
        this.field_h = GooPuddleCell.openArchive(true, false, 7, true, 1);
        Js5ArchiveManager.field_h = new ArchivePreloader(50);
        Js5Archive var4 = AchievementsScreen.field_p;
        Js5Archive var3 = WidgetStyleLayer.field_i;
        Js5ArchiveManager.field_h.addNamedGroupPreload("basic", DualLinkNode.field_o, MarkerSliderPainter.field_m, var4, (byte) -84);
        Js5ArchiveManager.field_h.addNamedGroupPreload("arialish12", DualLinkNode.field_o, MarkerSliderPainter.field_m, var4, (byte) -84);
        Js5ArchiveManager.field_h.addNamedGroupPreload("arialish12", DualLinkNode.field_o, MarkerSliderPainter.field_m, var3, (byte) -84);
        Js5ArchiveManager.field_h.addArchivePreload((byte) -113, IntRecordReplyHelpers.field_e, LevelResultScreen.field_w, KeyHandlerHolder.field_d);
        Js5ArchiveManager.field_h.addArchiveIndexPreload(ScorePopup.field_I, RandomAccessCacheFile.field_i, 1);
        Js5ArchiveManager.field_h.addArchiveIndexPreload(ScorePopup.field_I, BufferedSocket.field_h, 1);
        Js5ArchiveManager.field_h.addArchiveIndexPreload(MenuBackgroundActor.field_f, TextButton.field_B, 1);
        Js5ArchiveManager.field_h.addArchiveIndexPreload(MenuBackgroundActor.field_f, this.field_h, 1);
        Js5ArchiveManager.field_h.addArchivePreload((byte) -98, ZombieDawn.field_H, Bzip2State.field_e, PacketRequestHelpers.field_d);
    }

    private final void loadNextAssetStep(int param0) {
        int var9 = 0;
        Js5Archive var3 = null;
        int var4_int = 0;
        int var11 = 0;
        Js5Archive var15 = null;
        boolean stackIn_102_1 = false;
        Throwable decompiledCaughtException = null;
        float var4 = 0.0f;
        int var5_int = 0;
        float var5 = 0.0f;
        IllegalArgumentException var5_ref_IllegalArgumentException = null;
        int var6 = 0;
        IllegalArgumentException var6_ref_IllegalArgumentException = null;
        IndexedSprite[] var7 = null;
        Sprite[] var7_array = null;
        int var8 = 0;
        Sprite[] var8_ref_vn__ = null;
        Sprite var10 = null;
        int var12 = 0;
        String var13 = null;
        SoundEffect var14 = null;
        IndexedSprite[] var16 = null;
        Sprite[] var17 = null;
        int var8Lifetime1;
        var11 = ZombieDawn.field_J;
        SocialListEntry.hideMessageOverlay((byte) -95);
        var15 = AchievementsScreen.field_p;
        var3 = WidgetStyleLayer.field_i;
        if (param0 != 75) {
          this.ensureResourceGroupLoaded(60, -55);
        }
        if (!DelegatingCanvas.field_f &&
          null != BufferedSocket.field_h) {
          SocialListEntry.hideMessageOverlay((byte) -111);
          this.setProgress(53.0f, 127, BitPacketBuffer.field_m);
          SpriteSheetArchiveHelpers.field_a = new SoundEffectLibrary(BufferedSocket.field_h, RandomAccessCacheFile.field_i);
          for (var4_int = 0; InsetTextPainter.field_t > var4_int; var4_int++) {
            if (0 == InsetTextPainter.field_y[var4_int]) {
              var5_int = InsetTextPainter.field_s[var4_int];
              if ((var5_int == 69 ||
                var5_int == 68 ||
                47 == var5_int) && null == PhantomZombie.field_D[var5_int]) {
                var13 = "sfx";
                var14 = SoundEffect.load(BufferedSocket.field_h, var13, InsetTextPainter.field_x[var4_int]);
                if (var14 == null) {
                  return;
                }
                PhantomZombie.field_D[InsetTextPainter.field_s[var4_int]] = var14.toPcmSample();
              }
            }
          }
          DelegatingCanvas.field_f = true;
          PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
          return;
        }
        if (!PopupMenuBuilder.field_a &&
          null != RandomAccessCacheFile.field_i) {
          PopupMenuBuilder.field_a = true;
          PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
          return;
        }
        if (!LoadingProgressDialog.field_T &&
          null != this.field_h) {
          this.updateTimedProgress(AccountServerResult.field_h[15], MessageDialogContent.field_I, 55.0f, false, 20.0f);
          if (!this.loadMusicTrack("zombie dawn titlescreen", 0, 0)) {
            return;
          }
          if (!this.loadMusicTrack("zombie dawn instructions loop", 0, 9)) {
            return;
          }
          LoadingProgressDialog.field_T = true;
          this.resetProgressTimer(0, 75.0f);
          PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
          return;
        }
        if (LoadingProgressDialog.field_T &&
          !ArrayWidgetContainer.field_x &&
          TextButton.field_B != null) {
          ArrayWidgetContainer.field_x = true;
          return;
        }
        if (null != IntRecordReplyHelpers.field_e) {
          this.updateTimedProgress(800, LoginNameValue.field_a, 75.0f, false, 3.0f);
          if (!LoginConnectionHelpers.field_e) {
            for (var4_int = 0; var4_int < 8; var4_int++) {
              for (var5_int = 0; var5_int < 6; var5_int++) {
                try {
                  DimensionOnlyResizer.field_c[var4_int][var5_int] = IntRecordReplyHelpers.field_e.getFileByName(var5_int + ".zdl", param0 - 163, "" + var4_int + "/");
                  this.updateTimedProgress(800, LoginNameValue.field_a, 75.0f, false, 3.0f);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref_IllegalArgumentException = (IllegalArgumentException) (Object) decompiledCaughtException;
                }
              }
              try {
                DimensionOnlyResizer.field_c[var4_int][6] = IntRecordReplyHelpers.field_e.getFileByName("BONUS.zdl", -110, "" + var4_int + "/");
              } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_IllegalArgumentException = (IllegalArgumentException) (Object) decompiledCaughtException;
              }
            }
            this.updateTimedProgress(800, LoginNameValue.field_a, 75.0f, false, 3.0f);
            ValidationStatusIcon.field_E = new Sprite(IntRecordReplyHelpers.field_e.getFileByName("map.jpg", param0 ^ -26, "jpg/"), (java.awt.Component) ((Object) IntrusiveDequeCursor.field_d));
          }
          IntRecordReplyHelpers.field_e = null;
          this.resetProgressTimer(param0 ^ 75, 78.0f);
          PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
          return;
        }
        if (var15 != null) {
          this.setProgress(78.0f, 127, RasterBuffer.field_g);
          Js5Transport.field_k = PowerupPickup.loadGlyphFontByName("", -1, var3, "arialish12", var15);
          MultiHandleSliderWidget.field_E = ThreeSliceButtonPainter.loadSpritesByName((byte) -94, "locked", "basic", var15)[0];
          DiskArchiveRequest.field_y = MultiHandleSliderWidget.field_E;
          MessageDialogContent.field_G = ThreeSliceButtonPainter.loadSpritesByName((byte) 126, "unachieved", "basic", var15)[0];
          HotspotTextWidget.field_E = LoginAndPacketHelpers.loadSpriteByName(var15, "orbcoin", 8, "basic");
          WhirlpoolHasher.padToFourPixelAlignment(HotspotTextWidget.field_E, false);
          if (OctaveNoiseMap.field_j <= 0) {
            WeightedLruCache.setPromotionArchives(var15, var3, (byte) 80);
          }
          WidgetStyleLayer.field_i = null;
          AchievementsScreen.field_p = null;
          this.field_d = RasterBuffer.field_g;
          PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
          return;
        }
        if (!GridContainer.field_F &&
          null != BulletCasing.field_h) {
          var4 = 80.0f;
          var5 = 19.0f;
          var6 = 29000;
          this.updateTimedProgressKeepCaption(var5, 0, var6, var4);
          ProgressMessageDialog.field_jb = MultiHandleSliderWidget.loadFontByName(ZombieDawn.field_H, "basic", "font", BulletCasing.field_h, (byte) -70);
          if (ProgressMessageDialog.field_jb == null) {
            return;
          }
          PendingIntArrayRequest.field_j = DualLinkDeque.loadCoverageFont(ZombieDawn.field_H, "basic", "font_title", 0, BulletCasing.field_h);
          CacheEntry.field_q = PowerupPickup.loadGlyphFontByName("font_medium", -1, ZombieDawn.field_H, "basic", BulletCasing.field_h);
          ScrollViewport.scaleIconToFont(CacheEntry.field_q, false);
          SpatialBucket.initializeTeamColorPalettes((byte) 119);
          if (OctaveNoiseMap.field_j <= 0) {
            var16 = HighscoreSubmissionHelpers.loadIndexedSpritesByName("membersexpansion", "screenshots", -1864, BulletCasing.field_h);
            var7 = var16;
            if (var7 == null) {
              return;
            }
            MenuSelection.field_c = new MembershipPromotionScreen(LoadingProgressDialog.field_Y, SoundEffectCleanupHelpers.field_b, var16, false, IntroCutsceneScreen.field_o);
          }
          this.updateTimedProgressKeepCaption(var5, 0, var6, var4);
          ArmedHuman.field_Hb[0] = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "background1", 8, "basic");
          ArmedHuman.field_Hb[1] = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "background2", 8, "basic");
          ArmedHuman.field_Hb[2] = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "background3", 8, "basic");
          ArmedHuman.field_Hb[3] = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "background4", 8, "basic");
          ArmedHuman.field_Hb[4] = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "background5", 8, "basic");
          this.updateTimedProgressKeepCaption(var5, 0, var6, var4);
          SavedDataRequest.field_i = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "menu_pipe1", 8, "basic");
          IntKeyLookup.field_a = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "menu_pipe2", 8, "basic");
          TrafficVehicle.field_H = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "menu_pipebox", 8, "basic");
          DualLinkNodeHashTable.field_f = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "menu_pipebox2", 8, "basic");
          NameAvailabilityValidator.field_g = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "menu_title", 8, "basic");
          WorldObject.field_w = ThreeSliceButtonPainter.loadSpritesByName((byte) 113, "menu_risinghands", "basic", BulletCasing.field_h);
          DisplayState.field_a = ThreeSliceButtonPainter.loadSpritesByName((byte) 110, "menu_hand", "basic", BulletCasing.field_h);
          DisplaySettingsDialog.field_eb = ThreeSliceButtonPainter.loadSpritesByName((byte) 120, "engine_icons", "basic", BulletCasing.field_h);
          ByteArrayPool.field_a = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "frameh", 8, "basic");
          GameWorld.field_x = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "framev", 8, "basic");
          IntrusiveDeque.field_a = ThreeSliceButtonPainter.loadSpritesByName((byte) -8, "framecorners", "basic", BulletCasing.field_h);
          this.updateTimedProgressKeepCaption(var5, 0, var6, var4);
          BitmapTextLayout.field_g[0] = ThreeSliceButtonPainter.loadSpritesByName((byte) -53, "character_zombie0", "basic", BulletCasing.field_h);
          BitmapTextLayout.field_g[1] = ThreeSliceButtonPainter.loadSpritesByName((byte) -15, "character_zombie1", "basic", BulletCasing.field_h);
          WhirlpoolHasher.field_i[0] = ThreeSliceButtonPainter.loadSpritesByName((byte) -50, "levelselect_icons", "basic", BulletCasing.field_h);
          PatrollingGuard.field_Tb[0] = ThreeSliceButtonPainter.loadSpritesByName((byte) 125, "levelselect_icons_alt", "basic", BulletCasing.field_h);
          ClientProtocolStage.field_d = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "levelselect_arrow", 8, "basic");
          SoundEffectPlayer.field_a[0] = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "levelselect", 8, "basic");
          ScreechEffect.field_k = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "pipeframe_levelselect", param0 - 67, "basic");
          Human.field_tb = ClientProtocolStage.field_d;
          AgeValidator.field_i = ThreeSliceButtonPainter.loadSpritesByName((byte) -18, "powerups", "basic", BulletCasing.field_h);
          DualLinkNode.field_k = ThreeSliceButtonPainter.loadSpritesByName((byte) 127, "character_common", "basic", BulletCasing.field_h);
          MusicCrossfadeStream.createHudPanelSprites(ThreeSliceButtonPainter.loadSpritesByName((byte) -120, "hud", "basic", BulletCasing.field_h), -10);
          ArchiveProvider.createPopupSprites(ThreeSliceButtonPainter.loadSpritesByName((byte) 125, "popup", "basic", BulletCasing.field_h), (byte) -97);
          this.updateTimedProgressKeepCaption(var5, 0, var6, var4);
          IntrusiveNode.field_a = ThreeSliceButtonPainter.loadSpritesByName((byte) -124, "instructions_controls", "basic", BulletCasing.field_h);
          RandomAccessCacheFile.field_k = ThreeSliceButtonPainter.loadSpritesByName((byte) -42, "instructions_survivors", "basic", BulletCasing.field_h);
          TextAndNameCredentials.field_b = ThreeSliceButtonPainter.loadSpritesByName((byte) 2, "instructions_zombies", "basic", BulletCasing.field_h);
          this.updateTimedProgressKeepCaption(var5, 0, var6, var4);
          CacheEntry.loadFrameSprites("basic", -118, BulletCasing.field_h, "frame");
          UiResourceHelpers.field_b = CacheEntry.loadFrameSprites("basic", -122, BulletCasing.field_h, "button_frame");
          PopupMenuBuilder.field_c = CacheEntry.loadFrameSprites("basic", param0 - 201, BulletCasing.field_h, "button_raised");
          CacheEntry.loadFrameSprites("basic", -120, BulletCasing.field_h, "button_depressed");
          SpriteCheckboxPainter.field_a = ThreeSliceButtonPainter.loadSpritesByName((byte) -104, "pin_flags", "basic", BulletCasing.field_h);
          this.updateTimedProgressKeepCaption(var5, param0 - 75, var6, var4);
          MenuLayoutHelpers.field_a = new Sprite[32];
          var17 = ThreeSliceButtonPainter.loadSpritesByName((byte) 126, "all_achievements", "basic", BulletCasing.field_h);
          var7_array = var17;
          for (var8 = 0; var8 < 32; var8++) {
            MenuLayoutHelpers.field_a[var8] = var17[var8];
          }
          this.updateTimedProgressKeepCaption(var5, 0, var6, var4);
          this.field_n = true;
          if (!this.ensureResourceGroupLoaded(0, 11)) {
            return;
          }
          if (!(OctaveNoiseMap.field_j <= 0) ||
            !(SavedDataRequest.field_j < 2)) {
            this.field_n = true;
            if (!this.ensureResourceGroupLoaded(0, 12)) {
              return;
            }
          }
          this.updateTimedProgressKeepCaption(var5, 0, var6, var4);
          var8_ref_vn__ = var17;
          for (var9 = 0; var9 < var8_ref_vn__.length; var9++) {
            var10 = var8_ref_vn__[var9];
            WhirlpoolHasher.padToFourPixelAlignment(var10, false);
          }
          WhirlpoolHasher.padToFourPixelAlignment(MessageDialogContent.field_G, false);
          MenuLayoutHelpers.field_b = new Sprite[GlowAreaSupport.field_j.length];
          var12 = 0;
          var8Lifetime1 = var12;
          while (var12 < MenuLayoutHelpers.field_b.length) {
            if (null != GlowAreaSupport.field_j[var12]) {
              MenuLayoutHelpers.field_b[var12] = LoginMethod.createTitleBanner(var12, 1.0, (byte) -110);
            }
            var12++;
          }
          ZombieDawn.field_H = null;
          GridContainer.field_F = true;
          this.resetProgressTimer(0, var5 + var4);
          PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
          return;
        }
        stackIn_102_1 = (GridContainer.field_F) && (DelegatingCanvas.field_f) && (LoadingProgressDialog.field_T) && (ArrayWidgetContainer.field_x) && (PopupMenuBuilder.field_a);
        this.field_j = stackIn_102_1;
        if (this.field_j) {
          this.setProgress(99.0f, 126, ArchiveIndex.field_l);
        }
    }

    final void unloadResourceGroup(int param0, int param1) {
        int var3 = 6 % ((param0 - 55) / 45);
        boolean discarded$0 = this.loadOrUnloadResourceGroup(true, param1, 70);
        AccountPromptTexts.field_a[param1] = false;
    }

    public final boolean pollReady(byte param0) {
        boolean stackIn_47_0 = false;
        boolean decompiledFrameRemainder0 = true;
        if (!this.field_i) {
          if (ThreeSliceButtonPainter.pollAchievementMaskReply(1)) {
            this.field_i = true;
            if (this.field_c) {
              if ((!(this.field_m)) &&
                ((this.field_i)) &&
                (!(!GooPuddle.pollTrackedRequest(true)))) {
                this.field_m = true;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (!this.pollSavedProgress((byte) -110)) {
                if ((!(this.field_m)) &&
                  ((this.field_i)) &&
                  (!(!GooPuddle.pollTrackedRequest(true)))) {
                  this.field_m = true;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_c = true;
              }
            }
          } else {
            if (this.field_c) {
              if ((!(this.field_m)) &&
                ((this.field_i)) &&
                (!(!GooPuddle.pollTrackedRequest(true)))) {
                this.field_m = true;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (!this.pollSavedProgress((byte) -110)) {
                if ((!(this.field_m)) &&
                  ((this.field_i)) &&
                  (!(!GooPuddle.pollTrackedRequest(true)))) {
                  this.field_m = true;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_c = true;
              }
            }
          }
        } else {
          if (this.field_c) {
            if ((!(this.field_m)) &&
              ((this.field_i)) &&
              (!(!GooPuddle.pollTrackedRequest(true)))) {
              this.field_m = true;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (!this.pollSavedProgress((byte) -110)) {
              if ((!(this.field_m)) &&
                ((this.field_i)) &&
                (!(!GooPuddle.pollTrackedRequest(true)))) {
                this.field_m = true;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_c = true;
            }
          }
        }
        if ((decompiledFrameRemainder0) && (!this.field_m &&
          this.field_i &&
          GooPuddle.pollTrackedRequest(true))) {
          this.field_m = true;
        }
        if (param0 != 19) {
          this.loadNextAssetStep(59);
        }
        stackIn_47_0 = (this.field_i) && (this.field_c) && (this.field_m);
        return stackIn_47_0;
    }

    final boolean isQueueEmpty(byte param0) {
        if (param0 < 84) {
          this.bindArchives(102);
        }
        return this.field_f == 0 ? true : false;
    }

    private final boolean loadMusicTrack(String param0, int param1, int param2) {
        IllegalArgumentException var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == ArchiveProvider.field_a[param2]) {
            this.field_d = MessageDialogContent.field_I;
            ArchiveProvider.field_a[param2] = MusicTrack.load(this.field_h, param0, "");
            return false;
          }
          if (!PowerupCard.field_c[param2]) {
            this.field_d = TutorialTipHelpers.field_c;
            PowerupCard.field_c[param2] = PowerupBar.field_o.prepareTrack(ArchiveProvider.field_a[param2], (byte) 20, TextButton.field_B, 88200, SpriteSheetArchiveHelpers.field_a);
          }
          if (param1 != 0) {
            this.field_p = 29;
          }
          stackIn_10_0 = PowerupCard.field_c[param2];
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("tl.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void updateTimedProgressKeepCaption(float param0, int param1, int param2, float param3) {
        if (param1 != 0) {
          return;
        }
        this.updateTimedProgress(param2, (String) null, param3, false, param0);
    }

    private final void setProgress(float param0, int param1, String param2) {
        boolean discarded$1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_b = Math.min(100.0f, Math.max(0.0f, param0));
          if (param2 != null) {
            this.field_d = param2;
          } else {
            if (null == this.field_d) {
              this.field_d = ArchiveIndex.field_l;
            }
          }
          ArrayWidgetContainer.setLoadingProgress(this.field_d, this.field_b, -1);
          if (param1 <= 122) {
            discarded$1 = this.pollSavedProgress((byte) 10);
            LoadingProgressDialog.field_Y.paintFrame((byte) 81);
          } else {
            LoadingProgressDialog.field_Y.paintFrame((byte) 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("tl.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean pollSavedProgress(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var2Lifetime1;
        var4 = ZombieDawn.field_J;
        if (null == this.field_q) {
          this.field_q = new SavedDataRequest[2];
          for (var2 = 0; var2 < 2; var2++) {
            this.field_q[var2] = GameLoopApplet.requestSavedData((byte) -119, 1, 5, var2);
          }
        }
        if (param0 != -110) {
          this.field_b = -1.1267826557159424f;
        }
        var2Lifetime1 = 1;
        for (var3 = 0; var3 < 2; var3++) {
          if (null != this.field_q[var3]) {
            if (this.field_q[var3].field_h) {
              if (this.field_q[var3].field_o[0] > IntroSpeedHelpers.field_b[var3]) {
                IntroSpeedHelpers.field_b[var3] = this.field_q[var3].field_o[0];
              }
              if (OctaveNoiseMap.field_j <= 0) {
                if (0 < var3) {
                  IntroSpeedHelpers.field_b[var3] = 0;
                  this.field_q[var3] = null;
                } else {
                  this.field_q[var3] = null;
                }
              }
            } else {
              var2Lifetime1 = 0;
            }
          }
        }
        return var2Lifetime1 != 0;
    }

    final boolean queueResourceGroup(boolean param0, int param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        if (AccountPromptTexts.field_a[param1]) {
          return false;
        }
        if (param0) {
          this.field_h = (Js5Archive) null;
        }
        for (var3 = 0; this.field_f > var3; var3++) {
          if (param1 == this.field_r[var3]) {
            return false;
          }
        }
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        this.field_r[fieldTemp$0] = param1;
        this.field_p = this.field_p + AccountServerResult.field_h[param1];
        return true;
    }

    private final void updateTimedProgress(int param0, String param1, float param2, boolean param3, float param4) {
        long dupTemp$0 = 0L;
        long var6_long = 0L;
        long var8 = 0L;
        float var10 = 0.0f;
        float var11 = 0.0f;
        if (param3) {
          return;
        }
        try {
          if (0L == HighscoresScreen.field_n) {
            dupTemp$0 = MonotonicClock.monotonicTimeMillis(-22826);
            HighscoresScreen.field_n = dupTemp$0;
            LevelResultScreen.field_m = dupTemp$0;
          }
          var6_long = MonotonicClock.monotonicTimeMillis(-22826);
          var8 = var6_long - LevelResultScreen.field_m;
          HighscoresScreen.field_n = var6_long;
          var10 = (float)var8 / (float)param0;
          var10 = Math.min(Math.max(var10, 0.0f), 1.0f);
          var11 = param2 + var10 * param4;
          this.setProgress(var11, 124, param1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "tl.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final boolean pollArchives(boolean param0) {
        boolean discarded$0 = false;
        AreaSelectionScreen.initializeMenuLabels(-32435);
        if (!this.field_j) {
          this.loadNextAssetStep(75);
          return false;
        }
        if (param0) {
          String var3 = (String) null;
          discarded$0 = this.loadMusicTrack((String) null, 113, -12);
        }
        PendingBytePayloadRequest.resetFrameTimingHistory((byte) -50);
        return true;
    }

    public final void buildAssets(int param0) {
        LoadingProgressDialog.field_Y.startMainMenu(false);
        if (param0 != 22833) {
          this.bindArchives(-52);
        }
        TextFieldValidator.configureDialogThemeFromFont(WidgetStyleLayer.field_f, WhirlpoolHasher.field_f, DecodedSpriteHelpers.field_b, AudioMixerHelpers.field_d, FullscreenErrorReason.field_c, WeightedLruCache.field_h, BulletCasing.field_m, 0, UiResourceHelpers.field_b, TrackedSoundStream.field_l, PopupMenuBuilder.field_c, ProgressMessageDialog.field_jb, UiResourceHelpers.field_b, (byte) -63, 0);
    }

    final void processResourceQueue(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        long var4_long;
        int var6;
        boolean decompiledFrameRemainder0 = true;
        var6 = ZombieDawn.field_J;
        if (0 < this.field_f) {
          this.field_n = true;
          var2 = this.field_r[0];
          if (this.field_a == 0) {
            this.field_a = this.field_p;
            this.field_l = MonotonicClock.monotonicTimeMillis(-22826);
            this.setProgress(0.0f, 127, (String) null);
          }
          if (this.field_o == 0) {
            this.field_o = AccountServerResult.field_h[var2];
          }
          var3 = this.field_p;
          if (this.field_o < AccountServerResult.field_h[var2]) {
            var3 = var3 + (this.field_o - AccountServerResult.field_h[var2]);
          }
          this.setProgress((-((float)var3 / (float)this.field_a) + 1.0f) * 100.0f, 127, (String) null);
          MonotonicClock.monotonicTimeMillis(-22826);
          if (this.ensureResourceGroupLoaded(0, var2)) {
            this.field_p = this.field_p - AccountServerResult.field_h[var2];
            for (var4 = 0; var4 < -1 + this.field_f; var4++) {
              this.field_r[var4] = this.field_r[var4 + 1];
            }
            this.field_f = this.field_f - 1;
            this.field_o = 0;
            if (!(this.field_f > 0)) {
              this.field_n = false;
              this.field_a = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var4_long = MonotonicClock.monotonicTimeMillis(-22826);
            this.field_o = (int)((long)this.field_o - (var4_long - this.field_l));
            if (this.field_o < 1) {
              this.field_o = 1;
            }
            this.field_l = var4_long;
          }
        }
        if (param0 <= 37) {
          GameResourceLoader.releaseStatics(2);
        }
    }

    private final void resetProgressTimer(int param0, float param1) {
        LevelResultScreen.field_m = 0L;
        HighscoresScreen.field_n = (long)param0;
        this.setProgress(param1, param0 ^ 125, this.field_d);
    }

    private final boolean loadOrUnloadResourceGroup(boolean param0, int param1, int param2) {
        String stackIn_12_0 = null;
        int stackIn_56_0 = 0;
        String stackIn_107_0 = null;
        boolean stackIn_116_0 = false;
        int var4;
        int var5;
        String var5_ref_String;
        int var6;
        String var7_ref_String;
        int var7;
        SoundEffect var8;
        VorbisSample var8_ref;
        int var9;
        VorbisSample var10;
        SoundEffect var11;
        String var12;
        int var5Lifetime1;
        int var6Lifetime1;
        String var5_ref_StringLifetime1;
        var9 = ZombieDawn.field_J;
        var4 = 12 % ((param2 + 2) / 56);
        if (!param0) {
          for (var5 = 0; InsetTextPainter.field_t > var5; var5++) {
            var6 = InsetTextPainter.field_s[var5];
            if (PhantomZombie.field_D[var6] == null &&
              param1 == InsetTextPainter.field_w[var5]) {
              if (1 == NameCheckRequest.usesUkSoundArchive(param1, 101)) {
                stackIn_12_0 = "uk";
              } else {
                stackIn_12_0 = "sfx";
              }
              var7_ref_String = stackIn_12_0;
              if (InsetTextPainter.field_y[var5] == 0) {
                var11 = SoundEffect.load(BufferedSocket.field_h, var7_ref_String, InsetTextPainter.field_x[var5]);
                var8 = var11;
                if (var8 == null) {
                  BufferedSocket.field_h.loadGroupByName(-1, var7_ref_String);
                  return false;
                }
                PhantomZombie.field_D[InsetTextPainter.field_s[var5]] = var11.toPcmSample();
              } else {
                var10 = VorbisSample.load(RandomAccessCacheFile.field_i, var7_ref_String, InsetTextPainter.field_x[var5]);
                var8_ref = var10;
                if (var8_ref == null) {
                  RandomAccessCacheFile.field_i.loadGroupByName(-1, var7_ref_String);
                  return false;
                }
                PhantomZombie.field_D[InsetTextPainter.field_s[var5]] = var10.decodeAllToPcm();
              }
            }
          }
        }
        boolean decompiledFrameRemainder0 = true;
        var7 = param1;
        if (13 == var7) {
          this.field_d = RasterBuffer.field_g;
          if (param0) {
            for (var7 = 0; AlternateLongAndNameCredentials.field_l.length > var7; var7++) {
              AlternateLongAndNameCredentials.field_l[var7] = null;
            }
            for (var7 = 0; BitmapTextLayout.field_g.length > var7; var7++) {
              BitmapTextLayout.field_g[var7] = null;
            }
            for (var7 = 0; ArchiveProvider.field_a.length > var7; var7++) {
              ArchiveProvider.field_a[var7] = null;
            }
            return true;
          }
          stackIn_56_0 = (!MatchingTextValidator.isClientOptionEnabled(0, 117)) ? 0 : 1;
          var6Lifetime1 = stackIn_56_0;
          var5_ref_String = "game";
          AlternateLongAndNameCredentials.field_l[0] = ThreeSliceButtonPainter.loadSpritesByName((byte) 108, "character_human0", "game", BulletCasing.field_h);
          if (var6Lifetime1 != 0) {
            var5_ref_String = "halloween";
          }
          AlternateLongAndNameCredentials.field_l[1] = ThreeSliceButtonPainter.loadSpritesByName((byte) -4, "character_human1", var5_ref_String, BulletCasing.field_h);
          if (null != AlternateLongAndNameCredentials.field_l[0] &&
            null != AlternateLongAndNameCredentials.field_l[1]) {
            if (!this.loadMusicTrack("zombie dawn countup part 1", 0, 5)) {
              return false;
            }
            if (!this.loadMusicTrack("zombie dawn countup part 2", 0, 6)) {
              return false;
            }
            if (!this.loadMusicTrack("zombie dawn bonus level", 0, 7)) {
              return false;
            }
            AlternateLongAndNameCredentials.field_l[2] = ThreeSliceButtonPainter.loadSpritesByName((byte) -123, "character_human2", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[3] = ThreeSliceButtonPainter.loadSpritesByName((byte) -25, "character_human3", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[4] = ThreeSliceButtonPainter.loadSpritesByName((byte) 13, "character_human4", var5_ref_String, BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[5] = ThreeSliceButtonPainter.loadSpritesByName((byte) 117, "character_human5", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[6] = ThreeSliceButtonPainter.loadSpritesByName((byte) -5, "character_human6", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[7] = ThreeSliceButtonPainter.loadSpritesByName((byte) 112, "character_human7", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[8] = ThreeSliceButtonPainter.loadSpritesByName((byte) 118, "character_human8", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[9] = ThreeSliceButtonPainter.loadSpritesByName((byte) 118, "character_human9", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[10] = ThreeSliceButtonPainter.loadSpritesByName((byte) 111, "character_human10", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[11] = ThreeSliceButtonPainter.loadSpritesByName((byte) 126, "character_human11", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[12] = ThreeSliceButtonPainter.loadSpritesByName((byte) 113, "character_human12", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[13] = ThreeSliceButtonPainter.loadSpritesByName((byte) 109, "character_human13", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[14] = ThreeSliceButtonPainter.loadSpritesByName((byte) 119, "character_human14", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[15] = ThreeSliceButtonPainter.loadSpritesByName((byte) 127, "character_human15", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[16] = ThreeSliceButtonPainter.loadSpritesByName((byte) 123, "character_human16", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[17] = ThreeSliceButtonPainter.loadSpritesByName((byte) -110, "character_human17", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[18] = ThreeSliceButtonPainter.loadSpritesByName((byte) 108, "character_human18", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[19] = ThreeSliceButtonPainter.loadSpritesByName((byte) 3, "character_human19", "game", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[20] = ThreeSliceButtonPainter.loadSpritesByName((byte) -52, "character_human20", "game", BulletCasing.field_h);
            MembershipPromotionScreen.field_d = ThreeSliceButtonPainter.loadSpritesByName((byte) 112, "blood", "game", BulletCasing.field_h);
            HighscoreRequest.field_t = ThreeSliceButtonPainter.loadSpritesByName((byte) -76, "headlight", "game", BulletCasing.field_h);
            BlastAffectedObject.field_j = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "tutorial", 8, "game");
            SecondaryNodeDequeIterator.field_h = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "minigun", 8, "game");
            LogoPoseHelpers.field_c = ThreeSliceButtonPainter.loadSpritesByName((byte) -20, "hatch", "game", BulletCasing.field_h);
            BlastParticle.field_f = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "grenade", 8, "game");
            InsetTextPainter.field_z = ThreeSliceButtonPainter.loadSpritesByName((byte) 121, "explosion", "game", BulletCasing.field_h);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == AlternateLongAndNameCredentials.field_l[0]) {
              BulletCasing.field_h.loadGroupByName(-1, "game");
            }
            if (var6Lifetime1 == 0) {
              return false;
            }
            BulletCasing.field_h.loadGroupByName(-1, var5_ref_String);
            return false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (var7 == 14) {
            this.field_d = RasterBuffer.field_g;
            AlternateLongAndNameCredentials.field_l[21] = ThreeSliceButtonPainter.loadSpritesByName((byte) 108, "character_human21", "gameuk", BulletCasing.field_h);
            if (AlternateLongAndNameCredentials.field_l[21] == null) {
              BulletCasing.field_h.loadGroupByName(-1, "gameuk");
              return false;
            }
            AlternateLongAndNameCredentials.field_l[22] = ThreeSliceButtonPainter.loadSpritesByName((byte) 17, "character_human22", "gameuk", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[23] = ThreeSliceButtonPainter.loadSpritesByName((byte) -17, "character_human23", "gameuk", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[24] = ThreeSliceButtonPainter.loadSpritesByName((byte) 124, "character_human24", "gameuk", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[25] = ThreeSliceButtonPainter.loadSpritesByName((byte) 18, "character_human25", "gameuk", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[26] = ThreeSliceButtonPainter.loadSpritesByName((byte) -3, "character_human26", "gameuk", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[27] = ThreeSliceButtonPainter.loadSpritesByName((byte) -18, "character_human27", "gameuk", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[28] = ThreeSliceButtonPainter.loadSpritesByName((byte) 124, "character_human28", "gameuk", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[29] = ThreeSliceButtonPainter.loadSpritesByName((byte) 112, "character_human29", "gameuk", BulletCasing.field_h);
            AlternateLongAndNameCredentials.field_l[30] = ThreeSliceButtonPainter.loadSpritesByName((byte) -10, "character_human30", "gameuk", BulletCasing.field_h);
            DelayedPacket.field_o = ThreeSliceButtonPainter.loadSpritesByName((byte) 9, "miasma", "gameuk", BulletCasing.field_h);
            RasterCanvasSizeTarget.field_a[0] = ThreeSliceButtonPainter.loadSpritesByName((byte) -128, "tentacle_unravel", "gameuk", BulletCasing.field_h);
            RasterCanvasSizeTarget.field_a[1] = ThreeSliceButtonPainter.loadSpritesByName((byte) -75, "tentacle_grab", "gameuk", BulletCasing.field_h);
            RasterCanvasSizeTarget.field_a[2] = ThreeSliceButtonPainter.loadSpritesByName((byte) -114, "tentacle_drag", "gameuk", BulletCasing.field_h);
            RasterCanvasSizeTarget.field_a[3] = ThreeSliceButtonPainter.loadSpritesByName((byte) 126, "tentacle_small", "gameuk", BulletCasing.field_h);
            DropdownList.field_R = ThreeSliceButtonPainter.loadSpritesByName((byte) -103, "treeshadow", "gameuk", BulletCasing.field_h);
            MusicPatchPcmStream.field_p = ThreeSliceButtonPainter.loadSpritesByName((byte) -43, "keycard", "gameuk", BulletCasing.field_h);
          } else {
            if (var7 != 10) {
              if (var7 != 4 &&
                var7 != 1 &&
                var7 != 2 &&
                15 != var7 &&
                7 != var7 &&
                var7 != 5) {
                if (8 == var7) {
                  if (WeightedLruCache.field_k == null) {
                    WeightedLruCache.field_k = ThreeSliceButtonPainter.loadSpritesByName((byte) -90, "spotlight", "gameuk", BulletCasing.field_h);
                  }
                  if (null == MenuSpriteGlobals.field_c) {
                    MenuSpriteGlobals.field_c = ThreeSliceButtonPainter.loadSpritesByName((byte) -77, "glass", "gameuk", BulletCasing.field_h);
                  }
                  SpatialBucket.field_b = ThreeSliceButtonPainter.loadSpritesByName((byte) 20, "bulletcasing", "gameuk", BulletCasing.field_h);
                } else {
                  if (var7 != 6 &&
                    var7 != 0 &&
                    12 == var7) {
                    this.field_d = RasterBuffer.field_g;
                    GlowAreaSupport.field_d = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "pin_lit", 8, "menusuk");
                    if (GlowAreaSupport.field_d == null) {
                      this.field_d = LoginUiHelpers.formatArchiveProgress(BulletCasing.field_h, MarkerSliderPainter.field_m, DualLinkNode.field_o, "menusuk", (byte) -32);
                      this.setProgress(this.field_b, 125, this.field_d);
                      return false;
                    }
                    ArchiveLoadStep.field_e = ThreeSliceButtonPainter.loadSpritesByName((byte) 115, "instructions_uk_enemies", "menusuk", BulletCasing.field_h);
                    DisplayState.field_c = ThreeSliceButtonPainter.loadSpritesByName((byte) -119, "instructions_keycard", "menusuk", BulletCasing.field_h);
                    SoundEffectPlayer.field_a[1] = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "uk_level_select_map", 8, "menusuk");
                    WhirlpoolHasher.field_i[1] = ThreeSliceButtonPainter.loadSpritesByName((byte) -12, "uk_level_select_icons", "menusuk", BulletCasing.field_h);
                    PatrollingGuard.field_Tb[1] = ThreeSliceButtonPainter.loadSpritesByName((byte) -106, "uk_level_select_icons_alt", "menusuk", BulletCasing.field_h);
                  }
                }
              }
            } else {
              if (!param0) {
                if (!BulletCasing.field_h.loadGroupByName(-1, "intro")) {
                  return false;
                }
                if (null == PendingHighscoreRequest.field_j) {
                  PendingHighscoreRequest.field_j = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "intro_background", 8, "intro");
                }
                if (ArmySoldier.field_Ub == null) {
                  ArmySoldier.field_Ub = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "intro_1", 8, "intro");
                }
                if (null == MainMenuScreen.field_t) {
                  MainMenuScreen.field_t = LoginAndPacketHelpers.loadSpriteByName(BulletCasing.field_h, "intro_2", 8, "intro");
                }
                decompiledFrameRemainder0 = (PendingHighscoreRequest.field_j == null ||
                  ArmySoldier.field_Ub == null ||
                  MainMenuScreen.field_t == null);
                if (decompiledFrameRemainder0) {
                  return false;
                }
              }
              if (decompiledFrameRemainder0) {
                PendingHighscoreRequest.field_j = null;
                ArmySoldier.field_Ub = null;
                MainMenuScreen.field_t = null;
              }
            }
          }
        }
        if (9 > param1) {
          if (param0) {
            LoginCredentials.releaseLevelSpriteSet(param1, 4767999);
          } else {
            if (NameCheckRequest.usesUkSoundArchive(param1, 126) == 1) {
              stackIn_107_0 = "gameuk";
            } else {
              stackIn_107_0 = "game";
            }
            var12 = stackIn_107_0;
            var5_ref_StringLifetime1 = var12;
            NanoTickClock.setWidgetSpriteSet(ThreeSliceButtonPainter.loadSpritesByName((byte) -104, ArmySoldier.field_Sb[param1] + "_floor", var12, BulletCasing.field_h), (byte) 112, param1);
            BloodSplat.installZombieSpriteSet(param1, ThreeSliceButtonPainter.loadSpritesByName((byte) -18, ArmySoldier.field_Sb[param1] + "_tiles", var12, BulletCasing.field_h), true);
            MoveTargetMarker.field_j[param1] = ThreeSliceButtonPainter.loadSpritesByName((byte) 107, "dimming" + param1, "basic", BulletCasing.field_h);
          }
        }
        if (param1 >= 15 &&
          param1 < 29) {
          var5Lifetime1 = param1 - 15;
          if (!param0) {
            stackIn_116_0 = !(!this.loadMusicTrack(InsetTextPainter.field_v[var5Lifetime1], 0, var5Lifetime1));
            return stackIn_116_0;
          }
        }
        return true;
    }

    GameResourceLoader() {
        this.field_n = false;
        this.field_o = 0;
        this.field_p = 0;
        this.field_a = 0;
        this.field_r = new int[29];
        this.field_f = 0;
    }

    static {
        field_k = "SHACKLES";
        field_g = new int[]{};
        field_e = "Invalid password.";
    }
}
