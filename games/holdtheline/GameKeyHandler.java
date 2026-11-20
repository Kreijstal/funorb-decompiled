/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameKeyHandler implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static SpriteAsset field_e;
    static int field_b;
    static String field_c;
    static String field_d;
    static int field_a;

    final static void loadBenefitsUiResources(byte param0) {
        Sprite var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Sprite var9 = null;
        int var10 = 0;
        Sprite var11 = null;
        Sprite var12 = null;
        String var14 = null;
        Sprite var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        boolean stackIn_61_3;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        boolean stackIn_70_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = HoldTheLine.field_D;
        try {
          if (MidiKeyUsage.field_i != null &&
            MidiKeyUsage.field_i.ensureIndexLoaded((byte) -123) &&
            MidiKeyUsage.field_i.tryLoadNamedGroup("benefits", 108) &&
            null != UiWidget.field_w &&
            UiWidget.field_w.ensureIndexLoaded((byte) -95) &&
            UiWidget.field_w.tryLoadNamedGroup("benefits", -114)) {
            NamedSoundEffect.field_s = UrlPacketDownloader.loadSpriteByName(MidiKeyUsage.field_i, "benefits", false, "headline");
            IterableNodeHashTable.field_k = UrlPacketDownloader.loadSpriteByName(MidiKeyUsage.field_i, "benefits", false, "blurbpane");
            eg.field_c = UrlPacketDownloader.loadSpriteByName(MidiKeyUsage.field_i, "benefits", false, "button");
            IntrusiveNode.field_d = UrlPacketDownloader.loadSpriteByName(MidiKeyUsage.field_i, "benefits", false, "signup_text");
            mn.field_c = UrlPacketDownloader.loadSpriteByName(MidiKeyUsage.field_i, "benefits", false, "menu_text");
            NodeHashTableIterator.field_h = UrlPacketDownloader.loadSpriteByName(MidiKeyUsage.field_i, "benefits", false, "button_frame");
            FullscreenDisplayMode.field_i = UrlPacketDownloader.loadSpriteByName(MidiKeyUsage.field_i, "benefits", false, "arrow");
            VehicleEngineSounds.field_a = (BitmapFont) ((Object) MusicPatch.loadMonochromeFontByName("benefits", UiWidget.field_w, 14819, MidiKeyUsage.field_i, "large_font"));
            GzipDecompressor.field_e = (BitmapFont) ((Object) MusicPatch.loadMonochromeFontByName("benefits", UiWidget.field_w, 14819, MidiKeyUsage.field_i, "small_font"));
            var28 = SoftwareRasterizer.pixels;
            var2 = SoftwareRasterizer.width;
            var3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ValidationHelpWidget.field_R);
            var11 = new Sprite(FullscreenDisplayMode.field_i.width + 4, 4 + FullscreenDisplayMode.field_i.height);
            var11.bindRaster();
            FullscreenDisplayMode.field_i.drawTinted(2, 2, IntArrayReadRequest.field_n);
            EmailLoginCredentials.a(2, var11.height, var11.width, var11, 0, 0, 1, -24983);
            FullscreenDisplayMode.field_i = var11;
            NetworkGameClient.field_m = FullscreenDisplayMode.field_i.flippedHorizontally();
            var12 = new Sprite(195, 221);
            var6 = var12.width / 2;
            var12.bindRaster();
            VehicleEngineSounds.field_a.drawCentered(LoginCredentials.substituteIndexedTokens(NetworkArchiveRequest.field_v, new String[]{RaceSetupMenu.field_z}, true), var6, 40, 16777215, -1);
            GzipDecompressor.field_e.drawCentered(LoginCredentials.substituteIndexedTokens(ScoreSubmission.field_l, new String[]{RaceSetupMenu.field_z}, true), var6, 60, 16777215, -1);
            VehicleEngineSounds.field_a.drawCentered(LoginCredentials.substituteIndexedTokens(DraggableWidget.field_I, new String[]{Particle.field_r}, true), var6, 110, 16777215, -1);
            GzipDecompressor.field_e.drawCentered(LoginCredentials.substituteIndexedTokens(SpriteSheetAsset.field_b, new String[]{Particle.field_r}, true), var6, 130, 16777215, -1);
            VehicleEngineSounds.field_a.drawCentered(LeaderboardRequest.field_q, var6, 180, 16777215, -1);
            GzipDecompressor.field_e.drawCentered(SocialListEntry.field_jb, var6, 200, 16777215, -1);
            EmailLoginCredentials.a(3, var12.height, var12.width, var12, 0, 0, 1, -24983);
            IterableNodeHashTable.field_k.bindRaster();
            var12.draw(-IterableNodeHashTable.field_k.offsetX + 18, 241 - IterableNodeHashTable.field_k.offsetY);
            for (var7 = 0; qh.field_b.length > var7; var7++) {
              TextLineLayout.field_a[var7].bindRaster();
              GzipDecompressor.field_e.drawParagraph(qh.field_b[var7], 3, 3, TextLineLayout.field_a[var7].width - 6, -6 + TextLineLayout.field_a[var7].height, IntArrayReadRequest.field_n, -1, 1, 1, GzipDecompressor.field_e.descent + GzipDecompressor.field_e.ascent);
              EmailLoginCredentials.a(3, TextLineLayout.field_a[var7].height, TextLineLayout.field_a[var7].width, TextLineLayout.field_a[var7], 0, 0, 1, -24983);
            }
            qh.field_b = null;
            CheckboxRenderer.field_m = IntrusiveNode.field_d.copy();
            CheckboxRenderer.field_m.bindRaster();
            NanoTickClock.recolorGreenPixels(255, SoftwareRasterizer.width, 2 * SoftwareRasterizer.height / 3, 0, 0, 64);
            SoftwareRasterizer.bindRaster(var28, var2, var3);
            SoftwareRasterizer.restoreClip(ValidationHelpWidget.field_R);
            Point2i.field_b = (eg.field_c.width - NodeHashTableIterator.field_h.width) / 2 + 231;
            LoginChoicePanel.field_L = 390 + (eg.field_c.height - NodeHashTableIterator.field_h.height) / 2;
            LoginForm.field_J = 434 + (-NodeHashTableIterator.field_h.width + eg.field_c.width) / 2;
            MidiKeyUsage.field_i = null;
            ShadedRoadStripRenderer.field_t = (eg.field_c.height - NodeHashTableIterator.field_h.height) / 2 + 390;
          }
          if (TextLineLayout.field_e == null) {
            return;
          }
          if (null != IsaacRandom.field_a &&
            null != VehicleEngineSounds.field_a) {
            var29 = SoftwareRasterizer.pixels;
            var2Lifetime1 = SoftwareRasterizer.width;
            var3Lifetime1 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ValidationHelpWidget.field_R);
            var14 = LoginCredentials.substituteIndexedTokens(CheckboxRenderer.field_d, new String[]{TextLineLayout.field_i[ShadedRoadStripRenderer.field_r]}, true);
            var5 = VehicleEngineSounds.field_a.getParagraphWidth(var14, vb.field_d);
            var6Lifetime1 = VehicleEngineSounds.field_a.getParagraphHeight(var14, vb.field_d, VehicleEngineSounds.field_a.ascent + VehicleEngineSounds.field_a.descent);
            var7Lifetime1 = AchievementUnlockRequest.field_m + (vb.field_d - var5) / 2;
            var8 = cd.field_b + (-var6Lifetime1 + mj.field_a) / 2;
            var7Lifetime1 -= 3;
            var5 += 6;
            var6Lifetime1 += 6;
            if (var7Lifetime1 < 0) {
              var9_int = -var7Lifetime1;
              AchievementUnlockRequest.field_m = AchievementUnlockRequest.field_m + var9_int;
              EmailLoginCredentials.field_e = EmailLoginCredentials.field_e - var9_int;
              var5 = var5 + 2 * var9_int;
              IsaacRandom.field_a.offsetX = IsaacRandom.field_a.offsetX + var9_int;
              IsaacRandom.field_a.canvasWidth = IsaacRandom.field_a.canvasWidth + var9_int * 2;
              var7Lifetime1 = var7Lifetime1 + var9_int;
            }
            var8 -= 3;
            if (IsaacRandom.field_a.canvasWidth < var7Lifetime1 + var5) {
              var9_intLifetime1 = var5 + var7Lifetime1 - IsaacRandom.field_a.canvasWidth;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              EmailLoginCredentials.field_e = EmailLoginCredentials.field_e - var9_intLifetime1;
              var5 = var5 + 2 * var9_intLifetime1;
              AchievementUnlockRequest.field_m = AchievementUnlockRequest.field_m + var9_intLifetime1;
              IsaacRandom.field_a.offsetX = IsaacRandom.field_a.offsetX + var9_intLifetime1;
              IsaacRandom.field_a.canvasWidth = IsaacRandom.field_a.canvasWidth + var9_intLifetime1 * 2;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              AccountTermsPanel.field_G = AccountTermsPanel.field_G - var9_intLifetime2;
              var8 = var8 + var9_intLifetime2;
              IsaacRandom.field_a.offsetY = IsaacRandom.field_a.offsetY + var9_intLifetime2;
              IsaacRandom.field_a.canvasHeight = IsaacRandom.field_a.canvasHeight + 2 * var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime2 * 2;
              cd.field_b = cd.field_b + var9_intLifetime2;
            }
            if (IsaacRandom.field_a.canvasHeight < var8 + var6Lifetime1) {
              var9_intLifetime3 = var8 + var6Lifetime1 - IsaacRandom.field_a.canvasHeight;
              AccountTermsPanel.field_G = AccountTermsPanel.field_G - var9_intLifetime3;
              cd.field_b = cd.field_b + var9_intLifetime3;
              IsaacRandom.field_a.canvasHeight = IsaacRandom.field_a.canvasHeight + 2 * var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              IsaacRandom.field_a.offsetY = IsaacRandom.field_a.offsetY + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime3 * 2;
            }
            IsaacRandom.field_a.expandToCanvas();
            var9 = new Sprite(IsaacRandom.field_a.canvasWidth, IsaacRandom.field_a.canvasHeight);
            var9.bindRaster();
            VehicleEngineSounds.field_a.drawParagraph(var14, AchievementUnlockRequest.field_m, cd.field_b, vb.field_d, mj.field_a, 16777215, -1, 1, 1, VehicleEngineSounds.field_a.descent + VehicleEngineSounds.field_a.ascent);
            EmailLoginCredentials.a(3, var9.canvasHeight, var9.canvasWidth, var9, 0, 0, 1, -24983);
            IsaacRandom.field_a.bindRaster();
            var9.draw(0, 0);
            PointLight.field_t = new Sprite(640, 480);
            PointLight.field_t.bindRaster();
            IsaacRandom.field_a.drawRotatedCentered((IsaacRandom.field_a.canvasWidth >> 1) + EmailLoginCredentials.field_e, AccountTermsPanel.field_G + (IsaacRandom.field_a.canvasHeight >> 1), ValidationHelpWidget.field_W, 4096);
            IsaacRandom.field_a = null;
            PointLight.field_t.trimTransparentEdges();
            SoftwareRasterizer.bindRaster(var29, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.restoreClip(ValidationHelpWidget.field_R);
          }
          if (UrlPacketDownloader.field_j != null &&
            GzipDecompressor.field_e != null) {
            var30 = SoftwareRasterizer.pixels;
            var2Lifetime2 = SoftwareRasterizer.width;
            var3Lifetime2 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ValidationHelpWidget.field_R);
            var16 = new Sprite(412, 43);
            var17 = LoginCredentials.substituteIndexedTokens(MouseInputRegistration.field_a, new String[]{UrlPacketDownloader.field_j}, true);
            UrlPacketDownloader.field_j = null;
            var16.bindRaster();
            GzipDecompressor.field_e.drawParagraph(var17, 3, 3, var16.width - 6, -6 + var16.height, 16777215, -1, 0, 1, GzipDecompressor.field_e.ascent + GzipDecompressor.field_e.descent);
            EmailLoginCredentials.a(3, var16.height, var16.width, var16, 0, 0, 1, -24983);
            TextLineLayout.field_e.bindRaster();
            var16.draw(199 - TextLineLayout.field_e.offsetX, 83 - TextLineLayout.field_e.offsetY);
            SoftwareRasterizer.bindRaster(var30, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.restoreClip(ValidationHelpWidget.field_R);
          }
          if (IconToggleRenderer.field_b != null &&
            null != GzipDecompressor.field_e) {
            var31 = SoftwareRasterizer.pixels;
            var2Lifetime3 = SoftwareRasterizer.width;
            var3Lifetime3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ValidationHelpWidget.field_R);
            var4 = GzipDecompressor.field_e.getParagraphWidth(ValidatedTextField.field_S, 640) + 6;
            var5Lifetime1 = IconToggleRenderer.field_b.canvasWidth + var4 + 20;
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = var6Lifetime2 + (IconToggleRenderer.field_b.canvasWidth + 20);
            TextLineLayout.field_e.bindRaster();
            GzipDecompressor.field_e.draw(ValidatedTextField.field_S, -TextLineLayout.field_e.offsetX + var7Lifetime2, GzipDecompressor.field_e.descent + (GzipDecompressor.field_e.ascent + 155 - TextLineLayout.field_e.offsetY), 16777215, -1);
            EmailLoginCredentials.a(3, 50, var4, TextLineLayout.field_e, 155 - TextLineLayout.field_e.offsetY, -TextLineLayout.field_e.offsetX + (var7Lifetime2 - 4), 1, -24983);
            var8Lifetime1 = -((-3 + IconToggleRenderer.field_b.canvasHeight + (-GzipDecompressor.field_e.ascent - GzipDecompressor.field_e.descent)) / 2) - TextLineLayout.field_e.offsetY + 155;
            IconToggleRenderer.field_b.draw(-TextLineLayout.field_e.offsetX + var6Lifetime2, var8Lifetime1);
            SoftwareRasterizer.bindRaster(var31, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.restoreClip(ValidationHelpWidget.field_R);
            IconToggleRenderer.field_b = null;
          }
          SoftwareRasterizer.saveClip(ValidationHelpWidget.field_R);
          SoftwareRasterizer.fillRoundedRectangleAlpha(16, 16, 608, 112, 15, SecondaryNodeDeque.field_g, SocketConnector.field_b);
          SoftwareRasterizer.fillRoundedRectangleAlpha(231, 144, 393, 232, 15, SecondaryNodeDeque.field_g, SocketConnector.field_b);
          if (param0 <= 25) {
            GameKeyHandler.loadBenefitsUiResources((byte) -48);
          }
          if (NamedSoundEffect.field_s != null) {
            NamedSoundEffect.field_s.draw(0, 0);
          }
          if (null != IterableNodeHashTable.field_k) {
            IterableNodeHashTable.field_k.draw(0, 0);
          }
          TextLineLayout.field_e.draw(0, 0);
          if (null != PointLight.field_t) {
            PointLight.field_t.draw(0, 0);
          }
          if (null != eg.field_c &&
            NodeHashTableIterator.field_h != null) {
            eg.field_c.draw(231, 390);
            var1 = IntrusiveNode.field_d;
            if (DualLinkNode.field_k.selectedIndex == 0) {
              var1 = CheckboxRenderer.field_m;
            }
            var1.draw(0, 0);
            stackIn_54_0 = AccountFormText.field_b;
            if (DualLinkNode.field_k.selectedIndex == 0) {
              stackIn_55_1 = 4;
            } else {
              stackIn_55_1 = 3;
            }
            var2Lifetime4 = (QuadraticPointPath.a(stackIn_54_0 << stackIn_55_1, 2) * 40 >> 16) + 40;
            if (var2Lifetime4 > 0) {
              eg.field_c.drawAdditive(230, 389, var2Lifetime4);
              eg.field_c.drawAdditive(232, 389, var2Lifetime4);
              eg.field_c.drawAdditive(232, 391, var2Lifetime4);
              eg.field_c.drawAdditive(230, 391, var2Lifetime4);
              var1.drawAdditive(1, 1, var2Lifetime4);
              var1.drawAdditive(-1, 1, var2Lifetime4);
              var1.drawAdditive(1, -1, var2Lifetime4);
              var1.drawAdditive(-1, -1, var2Lifetime4);
            }
            stackIn_60_0 = 80;
            stackIn_60_1 = Point2i.field_b;
            stackIn_60_2 = LoginChoicePanel.field_L;
            stackIn_61_3 = (DualLinkNode.field_k.selectedIndex == 0);
            b.drawAnimatedButtonFrame(stackIn_60_0, stackIn_60_1, stackIn_60_2, stackIn_61_3);
          }
          if (eg.field_c != null &&
            null != NodeHashTableIterator.field_h) {
            eg.field_c.draw(434, 390);
            mn.field_c.draw(0, 0);
            if (1 == DualLinkNode.field_k.selectedIndex) {
              NanoTickClock.recolorGreenPixels(255, eg.field_c.width - 4, 7 * eg.field_c.height / 12, 392, 436, 64);
            }
            stackIn_69_0 = 80;
            stackIn_69_1 = LoginForm.field_J;
            stackIn_69_2 = ShadedRoadStripRenderer.field_t;
            stackIn_70_3 = (DualLinkNode.field_k.selectedIndex == 1);
            b.drawAnimatedButtonFrame(stackIn_69_0, stackIn_69_1, stackIn_69_2, stackIn_70_3);
          }
          if (FullscreenDisplayMode.field_i != null) {
            var1_int = 357 - FullscreenDisplayMode.field_i.canvasHeight / 2;
            FullscreenDisplayMode.field_i.draw(269 - FullscreenDisplayMode.field_i.canvasWidth, var1_int);
            NetworkGameClient.field_m.draw(586, var1_int);
            if (FullscreenErrorDialog.field_X > var1_int &&
              FullscreenDisplayMode.field_i.height + var1_int > FullscreenErrorDialog.field_X) {
              var2Lifetime5 = (QuadraticPointPath.a(AccountFormText.field_b << 4, 2) * 40 >> 16) + 40;
              if (var2Lifetime5 > 0) {
                if (NodeHashTableIterator.field_g > 269 - FullscreenDisplayMode.field_i.width &&
                  NodeHashTableIterator.field_g < 269) {
                  FullscreenDisplayMode.field_i.drawAdditive(-1 + (269 - FullscreenDisplayMode.field_i.canvasWidth), -1 + var1_int, var2Lifetime5);
                  FullscreenDisplayMode.field_i.drawAdditive(1 + (269 - FullscreenDisplayMode.field_i.canvasWidth), var1_int - 1, var2Lifetime5);
                  FullscreenDisplayMode.field_i.drawAdditive(-1 + (269 - FullscreenDisplayMode.field_i.canvasWidth), 1 + var1_int, var2Lifetime5);
                  FullscreenDisplayMode.field_i.drawAdditive(269 + (-FullscreenDisplayMode.field_i.canvasWidth + 1), 1 + var1_int, var2Lifetime5);
                } else {
                  if (NodeHashTableIterator.field_g > 586) {
                    if (NodeHashTableIterator.field_g >= 586 + FullscreenDisplayMode.field_i.width) {
                      ProxyAuthenticationException.drawBenefitsSlideshow(3979);
                      TextLineLayout.field_a[SpriteSheetAsset.field_e].draw(269, 340);
                      return;
                    }
                    NetworkGameClient.field_m.drawAdditive(585, -1 + var1_int, var2Lifetime5);
                    NetworkGameClient.field_m.drawAdditive(587, -1 + var1_int, var2Lifetime5);
                    NetworkGameClient.field_m.drawAdditive(585, 1 + var1_int, var2Lifetime5);
                    NetworkGameClient.field_m.drawAdditive(587, var1_int + 1, var2Lifetime5);
                  }
                }
              }
            }
          }
          ProxyAuthenticationException.drawBenefitsSlideshow(3979);
          TextLineLayout.field_a[SpriteSheetAsset.field_e].draw(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1_ref), "en.C(" + param0 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (MusicCrossfadeStream.field_n != null) {
            DraggableWidget.field_J = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("en.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (MusicCrossfadeStream.field_n != null) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && 65535 != var2_int &&
              um.a(0, (char) var2_int)) {
              var3 = 1 + lj.field_b & 127;
              if (var3 != BoundaryCurve.field_l) {
                IndexedSpriteState.field_a[lj.field_b] = -1;
                d.field_b[lj.field_b] = (char)var2_int;
                lj.field_b = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "en.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12260) {
            field_e = (SpriteAsset) null;
          }
          stackIn_3_0 = StrongCacheEntry.a(param1, (byte) -28, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("en.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        if (param0 != -1) {
          field_b = -90;
        }
        field_e = null;
        field_d = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (MusicCrossfadeStream.field_n != null) {
            DisplayNameValidator.field_j = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              DialogLayer.field_N.length > var2_int) {
              var2_int = DialogLayer.field_N[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (DraggableWidget.field_J >= 0 &&
              var2_int >= 0) {
              PointLight.field_r[DraggableWidget.field_J] = var2_int;
              DraggableWidget.field_J = 1 + DraggableWidget.field_J & 127;
              if (DraggableWidget.field_J == PacketBuffer.field_j) {
                DraggableWidget.field_J = -1;
              }
            }
            if (0 <= var2_int) {
              var3 = 127 & 1 + lj.field_b;
              if (var3 != BoundaryCurve.field_l) {
                IndexedSpriteState.field_a[lj.field_b] = var2_int;
                d.field_b[lj.field_b] = (char)0;
                lj.field_b = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) != 0 ||
              var2_int == 85 ||
              10 == var2_int) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("en.keyPressed(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void setTickRate(byte param0, int param1) {
        IntrusiveDequeCursor.field_c = 1000000000L / (long)param1;
        if (param0 >= -54) {
          field_e = (SpriteAsset) null;
        }
    }

    static long xorLongs(long param0, long param1) {
        return param0 ^ param1;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (MusicCrossfadeStream.field_n != null) {
            DisplayNameValidator.field_j = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < DialogLayer.field_N.length) {
              var2_int = -129 & DialogLayer.field_N[var2_int];
            } else {
              var2_int = -1;
            }
            if (DraggableWidget.field_J >= 0 &&
              var2_int >= 0) {
              PointLight.field_r[DraggableWidget.field_J] = ~var2_int;
              DraggableWidget.field_J = DraggableWidget.field_J + 1 & 127;
              if (DraggableWidget.field_J == PacketBuffer.field_j) {
                DraggableWidget.field_J = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("en.keyReleased(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static java.applet.Applet getApplet(int param0) {
        if (null != ne.field_b) {
          return ne.field_b;
        }
        if (param0 < 72) {
          field_e = (SpriteAsset) null;
        }
        return (java.applet.Applet) ((Object) ZombiePedestrian.field_j);
    }

    final static void insertionSort(int param0, SortableValue[] param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param0 != 5433) {
            field_c = (String) null;
          }
          for (var3_int = 1; var3_int < param2; var3_int++) {
            b.insertSortedPrefix(param1, (byte) 96, var3_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("en.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = "<img=2>";
        field_d = "Type your password again to make sure it's correct";
    }
}
