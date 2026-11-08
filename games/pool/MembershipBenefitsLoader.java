/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MembershipBenefitsLoader {
    static long field_d;
    static String ballsetEnglishGroup0;
    static int[] field_e;
    static BinaryBitmapFont field_a;
    static UiTheme field_c;
    static String mpYouofferdraw;

    final static String removeIgnore(int param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        CipherPacketBuffer var5 = null;
        int var6 = 0;
        String var7 = null;
        SocialListEntry var8 = null;
        CharSequence var9 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = (CharSequence) ((Object) param2);
          if (!ProgressBarWidget.a(-25908, var9)) {
            stackIn_3_0 = ModelInstance.invalidName;
            return stackIn_3_0;
          }
          if (2 != ChatInputSupport.field_a) {
            stackIn_7_0 = TextInputValidator.unableToDeleteIgnore;
            return stackIn_7_0;
          }
          var8 = CheckboxPainter.a(param1, 1);
          if (var8 == null) {
            stackIn_11_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{param1}, -1, ThemeSelectScreen.ignorenotfound);
            return stackIn_11_0;
          }
          var8.unlink((byte) -117);
          var8.unlinkNode(false);
          TextHotspotRegion.field_t = TextHotspotRegion.field_t - 1;
          if (param0 != -3266) {
            var7 = (String) null;
            MembershipBenefitsLoader.removeIgnore(-62, (String) null, (String) null, 67);
          }
          var5 = JaggrabDownloader.field_j;
          var5.writeCipheredOpcode(false, param3);
          var5.position = var5.position + 1;
          var6 = var5.position;
          var5.writeByte(3, false);
          var5.writeNullTerminatedString(-9946, param2);
          var5.writeByteLengthPrefix(-var6 + var5.position, true);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("ae.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        mpYouofferdraw = null;
        field_e = null;
        field_c = null;
        ballsetEnglishGroup0 = null;
        field_a = null;
        if (param0 != -26) {
          MembershipBenefitsLoader.releaseStatics((byte) -115);
        }
    }

    final static void loadBenefitsScreenAssets(int param0) {
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        boolean stackIn_58_2 = false;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        boolean stackIn_67_2 = false;
        RuntimeException decompiledCaughtException = null;
        Sprite var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
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
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
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
        var10 = Pool.field_O;
        try {
          if (IterableNodeHashTable.field_k != null &&
            IterableNodeHashTable.field_k.isIndexReady(-86) &&
            IterableNodeHashTable.field_k.ensureGroupAvailableByName("benefits", 0) &&
            null != MonotonicClock.field_c &&
            MonotonicClock.field_c.isIndexReady(-62) &&
            MonotonicClock.field_c.ensureGroupAvailableByName("benefits", 0)) {
            AccountDisplayNameSupport.field_e = WidgetStyleLayer.loadSprite("benefits", (byte) 51, "headline", IterableNodeHashTable.field_k);
            BallDebugOverlay.field_d = WidgetStyleLayer.loadSprite("benefits", (byte) 79, "blurbpane", IterableNodeHashTable.field_k);
            AccountProtocolStage.field_f = WidgetStyleLayer.loadSprite("benefits", (byte) 89, "button", IterableNodeHashTable.field_k);
            AchievementSubmission.field_o = WidgetStyleLayer.loadSprite("benefits", (byte) 109, "signup_text", IterableNodeHashTable.field_k);
            Pocket.field_h = WidgetStyleLayer.loadSprite("benefits", (byte) 86, "menu_text", IterableNodeHashTable.field_k);
            UiComponentNode.field_C = WidgetStyleLayer.loadSprite("benefits", (byte) 78, "button_frame", IterableNodeHashTable.field_k);
            ContextMenu.field_Yb = WidgetStyleLayer.loadSprite("benefits", (byte) 75, "arrow", IterableNodeHashTable.field_k);
            DebugTuningSupport.field_d = (BitmapFont) ((Object) CanvasInputSupport.a(IterableNodeHashTable.field_k, "large_font", 0, MonotonicClock.field_c, "benefits"));
            SceneNode.field_h = (BitmapFont) ((Object) CanvasInputSupport.a(IterableNodeHashTable.field_k, "small_font", 0, MonotonicClock.field_c, "benefits"));
            var27 = SoftwareRasterizer.pixels;
            var2 = SoftwareRasterizer.width;
            var3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(AgeValidator.field_o);
            var11 = new Sprite(4 + ContextMenu.field_Yb.field_z, 4 + ContextMenu.field_Yb.field_A);
            var11.bindAsRenderTarget();
            ContextMenu.field_Yb.drawGrayModulated(2, 2, DialWidget.field_X);
            MembershipBenefitsScreen.a(1, 2, var11.field_A, var11, 4, var11.field_z, 0, 0);
            ContextMenu.field_Yb = var11;
            GrowableIntListFactory.field_f = ContextMenu.field_Yb.copyFlippedHorizontal();
            var12 = new Sprite(195, 221);
            var6 = var12.field_z / 2;
            var12.bindAsRenderTarget();
            DebugTuningSupport.field_d.drawCentered(AccountWelcomePanel.substituteTemplateArguments(new String[]{CollisionContact.field_o}, -1, HalloweenBallSkin.mbFullAccess1), var6, 40, 16777215, -1);
            SceneNode.field_h.drawCentered(AccountWelcomePanel.substituteTemplateArguments(new String[]{CollisionContact.field_o}, -1, BufferedSocket.mbFullAccess2), var6, 60, 16777215, -1);
            DebugTuningSupport.field_d.drawCentered(AccountWelcomePanel.substituteTemplateArguments(new String[]{LinkButtonPainter.field_e}, -1, CachedArchiveSource.mbAchievementCount1), var6, 110, 16777215, -1);
            SceneNode.field_h.drawCentered(AccountWelcomePanel.substituteTemplateArguments(new String[]{LinkButtonPainter.field_e}, -1, PotEvent.mbAchievementCount2), var6, 130, 16777215, -1);
            DebugTuningSupport.field_d.drawCentered(UsernameSuggestionsPanel.field_X, var6, 180, 16777215, -1);
            SceneNode.field_h.drawCentered(InputIdleSupport.mbExclusive2, var6, 200, 16777215, -1);
            MembershipBenefitsScreen.a(1, 3, var12.field_A, var12, 4, var12.field_z, 0, 0);
            BallDebugOverlay.field_d.bindAsRenderTarget();
            var12.draw(-BallDebugOverlay.field_d.field_G + 18, -BallDebugOverlay.field_d.field_B + 241);
            for (var7 = 0; var7 < SharedWidgetLayoutSupport.field_a.length; var7++) {
              TikiBallSkin.field_m[var7].bindAsRenderTarget();
              SceneNode.field_h.drawParagraph(SharedWidgetLayoutSupport.field_a[var7], 3, 3, -6 + TikiBallSkin.field_m[var7].field_z, -6 + TikiBallSkin.field_m[var7].field_A, DialWidget.field_X, -1, 1, 1, SceneNode.field_h.maxDescent + SceneNode.field_h.maxAscent);
              MembershipBenefitsScreen.a(1, 3, TikiBallSkin.field_m[var7].field_A, TikiBallSkin.field_m[var7], 4, TikiBallSkin.field_m[var7].field_z, 0, 0);
            }
            SharedWidgetLayoutSupport.field_a = null;
            Base37Support.field_a = AchievementSubmission.field_o.copy();
            Base37Support.field_a.bindAsRenderTarget();
            ShotRecord.a(SoftwareRasterizer.width, 2 * SoftwareRasterizer.height / 3, 64, 0, (byte) 103, 0);
            SoftwareRasterizer.setTarget(var27, var2, var3);
            SoftwareRasterizer.restoreClip(AgeValidator.field_o);
            ModelOriginSupport.field_o = 390 + (AccountProtocolStage.field_f.field_A - UiComponentNode.field_C.field_A) / 2;
            RasterSnapshot.field_o = 434 + (AccountProtocolStage.field_f.field_z - UiComponentNode.field_C.field_z) / 2;
            HighScoreSubmission.field_s = 390 + (-UiComponentNode.field_C.field_A + AccountProtocolStage.field_f.field_A) / 2;
            IterableNodeHashTable.field_k = null;
            BufferedFile.field_n = (-UiComponentNode.field_C.field_z + AccountProtocolStage.field_f.field_z) / 2 + 231;
          }
          if (null == ProgressDialog.field_gb) {
            return;
          }
          if (null != ReflectionRequestSupport.field_j &&
            null != DebugTuningSupport.field_d) {
            var28 = SoftwareRasterizer.pixels;
            var2Lifetime1 = SoftwareRasterizer.width;
            var3Lifetime1 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(AgeValidator.field_o);
            var14 = AccountWelcomePanel.substituteTemplateArguments(new String[]{FontPaletteSupport.subscriptionCostMonthly[VertexTransformSupport.field_e]}, param0 ^ 1, OpacityWidget.benefitsPrice);
            var5 = DebugTuningSupport.field_d.maxWrappedLineWidth(var14, AppletUrlSupport.field_h);
            var6Lifetime1 = DebugTuningSupport.field_d.measureWrappedHeight(var14, AppletUrlSupport.field_h, DebugTuningSupport.field_d.maxAscent + DebugTuningSupport.field_d.maxDescent);
            var7Lifetime1 = LongAndTextLoginPayload.field_h + (-var5 + AppletUrlSupport.field_h) / 2;
            var8 = AccountDisplayNameSupport.field_c + (-var6Lifetime1 + IsaacCipher.field_e) / 2;
            var7Lifetime1 -= 3;
            var5 += 6;
            if (0 > var7Lifetime1) {
              var9_int = -var7Lifetime1;
              ReflectionRequestSupport.field_j.field_G = ReflectionRequestSupport.field_j.field_G + var9_int;
              var5 = var5 + var9_int * 2;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              Ball.field_m = Ball.field_m - var9_int;
              ReflectionRequestSupport.field_j.field_w = ReflectionRequestSupport.field_j.field_w + var9_int * 2;
              LongAndTextLoginPayload.field_h = LongAndTextLoginPayload.field_h + var9_int;
            }
            var6Lifetime1 += 6;
            var8 -= 3;
            if (var7Lifetime1 + var5 > ReflectionRequestSupport.field_j.field_w) {
              var9_intLifetime1 = var7Lifetime1 + (var5 - ReflectionRequestSupport.field_j.field_w);
              var5 = var5 + 2 * var9_intLifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              LongAndTextLoginPayload.field_h = LongAndTextLoginPayload.field_h + var9_intLifetime1;
              ReflectionRequestSupport.field_j.field_G = ReflectionRequestSupport.field_j.field_G + var9_intLifetime1;
              Ball.field_m = Ball.field_m - var9_intLifetime1;
              ReflectionRequestSupport.field_j.field_w = ReflectionRequestSupport.field_j.field_w + 2 * var9_intLifetime1;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              var8 = var8 + var9_intLifetime2;
              ReflectionRequestSupport.field_j.field_B = ReflectionRequestSupport.field_j.field_B + var9_intLifetime2;
              ReflectionRequestSupport.field_j.field_y = ReflectionRequestSupport.field_j.field_y + 2 * var9_intLifetime2;
              ArchiveIndex.field_r = ArchiveIndex.field_r - var9_intLifetime2;
              AccountDisplayNameSupport.field_c = AccountDisplayNameSupport.field_c + var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime2;
            }
            if (ReflectionRequestSupport.field_j.field_y < var6Lifetime1 + var8) {
              var9_intLifetime3 = -ReflectionRequestSupport.field_j.field_y + (var8 + var6Lifetime1);
              ReflectionRequestSupport.field_j.field_y = ReflectionRequestSupport.field_j.field_y + 2 * var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              AccountDisplayNameSupport.field_c = AccountDisplayNameSupport.field_c + var9_intLifetime3;
              ReflectionRequestSupport.field_j.field_B = ReflectionRequestSupport.field_j.field_B + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime3;
              ArchiveIndex.field_r = ArchiveIndex.field_r - var9_intLifetime3;
            }
            ReflectionRequestSupport.field_j.normalizeCanvas();
            var9 = new Sprite(ReflectionRequestSupport.field_j.field_w, ReflectionRequestSupport.field_j.field_y);
            var9.bindAsRenderTarget();
            DebugTuningSupport.field_d.drawParagraph(var14, LongAndTextLoginPayload.field_h, AccountDisplayNameSupport.field_c, AppletUrlSupport.field_h, IsaacCipher.field_e, 16777215, -1, 1, 1, DebugTuningSupport.field_d.maxAscent + DebugTuningSupport.field_d.maxDescent);
            MembershipBenefitsScreen.a(1, 3, var9.field_y, var9, param0 + 6, var9.field_w, 0, 0);
            ReflectionRequestSupport.field_j.bindAsRenderTarget();
            var9.draw(0, 0);
            UsernameAvailabilityValidator.field_u = new Sprite(640, 480);
            UsernameAvailabilityValidator.field_u.bindAsRenderTarget();
            ReflectionRequestSupport.field_j.drawRotated((ReflectionRequestSupport.field_j.field_w >> 1) + Ball.field_m, (ReflectionRequestSupport.field_j.field_y >> 1) + ArchiveIndex.field_r, JaggrabDownloader.field_g, 4096);
            ReflectionRequestSupport.field_j = null;
            UsernameAvailabilityValidator.field_u.trimTransparentBorders();
            SoftwareRasterizer.setTarget(var28, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.restoreClip(AgeValidator.field_o);
          }
          if (AccountWelcomePanel.field_N != null &&
            SceneNode.field_h != null) {
            var29 = SoftwareRasterizer.pixels;
            var2Lifetime2 = SoftwareRasterizer.width;
            var3Lifetime2 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(AgeValidator.field_o);
            var16 = new Sprite(412, 43);
            var5_ref_String = AccountWelcomePanel.substituteTemplateArguments(new String[]{AccountWelcomePanel.field_N}, -1, ReportAbuseDialog.mbIncludingGamename);
            AccountWelcomePanel.field_N = null;
            var16.bindAsRenderTarget();
            SceneNode.field_h.drawParagraph(var5_ref_String, 3, 3, -6 + var16.field_z, var16.field_A - 6, 16777215, -1, 0, 1, SceneNode.field_h.maxAscent + SceneNode.field_h.maxDescent);
            MembershipBenefitsScreen.a(1, 3, var16.field_A, var16, 4, var16.field_z, 0, 0);
            ProgressDialog.field_gb.bindAsRenderTarget();
            var16.draw(199 - ProgressDialog.field_gb.field_G, -ProgressDialog.field_gb.field_B + 83);
            SoftwareRasterizer.setTarget(var29, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.restoreClip(AgeValidator.field_o);
          }
          if (param0 != -2) {
            MembershipBenefitsLoader.releaseStatics((byte) -67);
          }
          if (Camera.field_c != null &&
            null != SceneNode.field_h) {
            var30 = SoftwareRasterizer.pixels;
            var2Lifetime3 = SoftwareRasterizer.width;
            var3Lifetime3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(AgeValidator.field_o);
            var4 = 6 + SceneNode.field_h.maxWrappedLineWidth(PlasmaTableScene.mbCaptionTitle, 640);
            var5Lifetime1 = var4 + Camera.field_c.field_w + 20;
            var6Lifetime2 = -(var5Lifetime1 / 2) + 427;
            var7Lifetime2 = 20 + (var6Lifetime2 + Camera.field_c.field_w);
            ProgressDialog.field_gb.bindAsRenderTarget();
            SceneNode.field_h.drawLeft(PlasmaTableScene.mbCaptionTitle, -ProgressDialog.field_gb.field_G + var7Lifetime2, SceneNode.field_h.maxDescent + (-ProgressDialog.field_gb.field_B + 155 + SceneNode.field_h.maxAscent), 16777215, -1);
            MembershipBenefitsScreen.a(1, 3, 50, ProgressDialog.field_gb, 4, var4, var7Lifetime2 - ProgressDialog.field_gb.field_G - 4, -ProgressDialog.field_gb.field_B + 155);
            var8Lifetime1 = 155 - ProgressDialog.field_gb.field_B - (-SceneNode.field_h.maxAscent + (-3 + Camera.field_c.field_y - SceneNode.field_h.maxDescent)) / 2;
            Camera.field_c.draw(var6Lifetime2 - ProgressDialog.field_gb.field_G, var8Lifetime1);
            SoftwareRasterizer.setTarget(var30, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.restoreClip(AgeValidator.field_o);
            Camera.field_c = null;
          }
          SoftwareRasterizer.saveClip(AgeValidator.field_o);
          SoftwareRasterizer.fillRoundedRectangleBlended(16, 16, 608, 112, 15, TableScene.field_k, ModelTableScene.field_L);
          SoftwareRasterizer.fillRoundedRectangleBlended(231, 144, 393, 232, 15, TableScene.field_k, ModelTableScene.field_L);
          if (AccountDisplayNameSupport.field_e != null) {
            AccountDisplayNameSupport.field_e.draw(0, 0);
          }
          if (BallDebugOverlay.field_d != null) {
            BallDebugOverlay.field_d.draw(0, 0);
          }
          ProgressDialog.field_gb.draw(0, 0);
          if (null != UsernameAvailabilityValidator.field_u) {
            UsernameAvailabilityValidator.field_u.draw(0, 0);
          }
          if (AccountProtocolStage.field_f != null &&
            null != UiComponentNode.field_C) {
            AccountProtocolStage.field_f.draw(231, 390);
            var1 = AchievementSubmission.field_o;
            if (AppletUrlSupport.field_j.selectedIndex == 0) {
              var1 = Base37Support.field_a;
            }
            var1.draw(0, 0);
            stackIn_52_0 = 40;
            stackIn_52_1 = 40;
            stackIn_52_2 = PoolMatchController.field_X;
            if (AppletUrlSupport.field_j.selectedIndex != 0) {
              stackIn_53_3 = 3;
            } else {
              stackIn_53_3 = 4;
            }
            var2Lifetime4 = stackIn_52_0 + (stackIn_52_1 * ScrollPaneWithFooter.sine(stackIn_52_2 << stackIn_53_3, true) >> 16);
            if (var2Lifetime4 > 0) {
              AccountProtocolStage.field_f.drawAdditive(230, 389, var2Lifetime4);
              AccountProtocolStage.field_f.drawAdditive(232, 389, var2Lifetime4);
              AccountProtocolStage.field_f.drawAdditive(232, 391, var2Lifetime4);
              AccountProtocolStage.field_f.drawAdditive(230, 391, var2Lifetime4);
              var1.drawAdditive(1, 1, var2Lifetime4);
              var1.drawAdditive(-1, 1, var2Lifetime4);
              var1.drawAdditive(1, -1, var2Lifetime4);
              var1.drawAdditive(-1, -1, var2Lifetime4);
            }
            stackIn_57_0 = param0 ^ -2;
            stackIn_57_1 = BufferedFile.field_n;
            stackIn_58_2 = (AppletUrlSupport.field_j.selectedIndex == 0);
            AppletContainerSupport.drawMembershipButton(stackIn_57_0, stackIn_57_1, stackIn_58_2, HighScoreSubmission.field_s);
          }
          if (null != AccountProtocolStage.field_f &&
            UiComponentNode.field_C != null) {
            AccountProtocolStage.field_f.draw(434, 390);
            Pocket.field_h.draw(0, 0);
            if (1 == AppletUrlSupport.field_j.selectedIndex) {
              ShotRecord.a(AccountProtocolStage.field_f.field_z - 4, 7 * AccountProtocolStage.field_f.field_A / 12, 64, 392, (byte) 120, 436);
            }
            stackIn_66_0 = 0;
            stackIn_66_1 = RasterSnapshot.field_o;
            stackIn_67_2 = (AppletUrlSupport.field_j.selectedIndex == 1);
            AppletContainerSupport.drawMembershipButton(stackIn_66_0, stackIn_66_1, stackIn_67_2, ModelOriginSupport.field_o);
          }
          if (ContextMenu.field_Yb != null) {
            var1_int = 357 - ContextMenu.field_Yb.field_y / 2;
            ContextMenu.field_Yb.draw(-ContextMenu.field_Yb.field_w + 269, var1_int);
            GrowableIntListFactory.field_f.draw(586, var1_int);
            if (DebouncedValidationProvider.field_f > var1_int &&
              DebouncedValidationProvider.field_f < ContextMenu.field_Yb.field_A + var1_int) {
              var2Lifetime5 = (ScrollPaneWithFooter.sine(PoolMatchController.field_X << 4, true) * 40 >> 16) + 40;
              if (var2Lifetime5 <= 0) {
                MessageScreen.drawScreenshotSlideshow(-1);
                TikiBallSkin.field_m[KillerRules.field_f].draw(269, 340);
                return;
              }
              if (ReflectionReplySupport.field_i > -ContextMenu.field_Yb.field_z + 269 &&
                ReflectionReplySupport.field_i < 269) {
                ContextMenu.field_Yb.drawAdditive(-ContextMenu.field_Yb.field_w + 268, var1_int - 1, var2Lifetime5);
                ContextMenu.field_Yb.drawAdditive(269 - (ContextMenu.field_Yb.field_w - 1), -1 + var1_int, var2Lifetime5);
                ContextMenu.field_Yb.drawAdditive(-ContextMenu.field_Yb.field_w + 269 - 1, var1_int + 1, var2Lifetime5);
                ContextMenu.field_Yb.drawAdditive(1 + (-ContextMenu.field_Yb.field_w + 269), var1_int + 1, var2Lifetime5);
              } else {
                if (ReflectionReplySupport.field_i > 586 &&
                  ReflectionReplySupport.field_i < ContextMenu.field_Yb.field_z + 586) {
                  GrowableIntListFactory.field_f.drawAdditive(585, -1 + var1_int, var2Lifetime5);
                  GrowableIntListFactory.field_f.drawAdditive(587, var1_int - 1, var2Lifetime5);
                  GrowableIntListFactory.field_f.drawAdditive(585, var1_int + 1, var2Lifetime5);
                  GrowableIntListFactory.field_f.drawAdditive(587, 1 + var1_int, var2Lifetime5);
                }
              }
            }
          }
          MessageScreen.drawScreenshotSlideshow(-1);
          TikiBallSkin.field_m[KillerRules.field_f].draw(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "ae.B(" + param0 + ')');
        }
    }

    static {
        ballsetEnglishGroup0 = "<col=ff9999>Reds</col>";
        mpYouofferdraw = "You are offering to draw.";
    }
}
