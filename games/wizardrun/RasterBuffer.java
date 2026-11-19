/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RasterBuffer {
    static IntrusiveDeque field_c;
    int field_h;
    int[] field_f;
    int field_d;
    java.awt.Image field_g;
    static String field_b;
    static int field_a;
    static String field_i;
    static String field_e;

    final static Boolean b(byte param0) {
        Boolean var1 = Crc32Helpers.field_c;
        Crc32Helpers.field_c = null;
        if (param0 >= -21) {
          field_e = (String) null;
        }
        return var1;
    }

    abstract void initialize(byte param0, int param1, java.awt.Component param2, int param3);

    final static boolean a(char param0, boolean param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (ResourceArchive.isAsciiAlphanumeric(param0, param1)) {
          return true;
        }
        if (45 == param0) {
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 75) {
          RasterBuffer.releaseStatics((byte) -6);
        }
        field_b = null;
        field_e = null;
        field_c = null;
        field_i = null;
    }

    final static void a(int param0, int param1, Sprite param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var9_intLifetime1;
        int var10Lifetime1;
        try {
          var9_int = param7 + param6 + (param2.offsetX - param8);
          var10 = param7 + (param6 + (param2.offsetX + param0));
          var11 = (param2.height >> 1) + (param5 + param2.offsetY);
          SoftwareRasterizer.intersectClip(var9_int, param3, var10, var11 + param1);
          param2.drawAdditive(-1 + param6, param5 - 1, param4);
          param2.drawAdditive(param6 - 1, 1 + param5, param4);
          SoftwareRasterizer.restoreClip(ld.field_b);
          SoftwareRasterizer.intersectClip(var9_int + 1, 0, var10 + 1, param1 + var11);
          param2.drawAdditive(1 + param6, param5 - 1, param4);
          param2.drawAdditive(param6 + 1, 1 + param5, param4);
          SoftwareRasterizer.restoreClip(ld.field_b);
          var10Lifetime1 = -param7 + param2.offsetX + param2.width + param6 - param8;
          var9_intLifetime1 = param6 + param2.width + (param2.offsetX - (param7 + param0));
          SoftwareRasterizer.intersectClip(var9_intLifetime1, var11 - param1, var10Lifetime1, 480);
          param2.drawAdditive(-1 + param6, -1 + param5, param4);
          param2.drawAdditive(param6 - 1, param5 + 1, param4);
          SoftwareRasterizer.restoreClip(ld.field_b);
          SoftwareRasterizer.intersectClip(var9_intLifetime1 + 1, -param1 + var11, 1 + var10Lifetime1, 480);
          param2.drawAdditive(1 + param6, param5 - 1, param4);
          param2.drawAdditive(1 + param6, param5 + 1, param4);
          SoftwareRasterizer.restoreClip(ld.field_b);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "df.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void bindRasterTarget(int param0) {
        if (param0 <= 19) {
          field_a = -35;
        }
        SoftwareRasterizer.setTarget(this.field_f, this.field_d, this.field_h);
    }

    final static void loadMembershipBenefitsGraphics(int param0) {
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_56_0 = 0;
        boolean stackIn_57_1 = false;
        int stackIn_65_0 = 0;
        boolean stackIn_66_1 = false;
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
        var10 = wizardrun.field_H;
        try {
          if (WhirlpoolHasher.field_j != null &&
            WhirlpoolHasher.field_j.ensureIndex(param0 + 17818) &&
            WhirlpoolHasher.field_j.ensureNamedGroupLoaded((byte) 29, "benefits") &&
            null != DraggableWidget.field_M &&
            DraggableWidget.field_M.ensureIndex(param0 + 17818) &&
            DraggableWidget.field_M.ensureNamedGroupLoaded((byte) 29, "benefits")) {
            IntrusiveNodeHashTable.field_c = vg.loadSprite(15, "headline", WhirlpoolHasher.field_j, "benefits");
            MouseWheelInput.field_b = vg.loadSprite(15, "blurbpane", WhirlpoolHasher.field_j, "benefits");
            mj.field_b = vg.loadSprite(15, "button", WhirlpoolHasher.field_j, "benefits");
            RasterSnapshot.field_l = vg.loadSprite(15, "signup_text", WhirlpoolHasher.field_j, "benefits");
            EmailValidationError.field_c = vg.loadSprite(15, "menu_text", WhirlpoolHasher.field_j, "benefits");
            ToggleButton.field_H = vg.loadSprite(15, "button_frame", WhirlpoolHasher.field_j, "benefits");
            ra.field_p = vg.loadSprite(param0 + 13, "arrow", WhirlpoolHasher.field_j, "benefits");
            v.field_b = (BitmapFont) ((Object) IsaacRandom.loadFont(800863586, "benefits", WhirlpoolHasher.field_j, "large_font", DraggableWidget.field_M));
            AudioServiceThread.field_a = (BitmapFont) ((Object) IsaacRandom.loadFont(800863586, "benefits", WhirlpoolHasher.field_j, "small_font", DraggableWidget.field_M));
            var27 = SoftwareRasterizer.pixels;
            var2 = SoftwareRasterizer.width;
            var3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ld.field_b);
            var11 = new Sprite(4 + ra.field_p.width, ra.field_p.height + 4);
            var11.bindAsRasterTarget();
            ra.field_p.drawTintedGrayscale(2, 2, RadialSelectorWidget.field_H);
            oh.a(var11.height, var11, 0, var11.width, 2, (byte) 45, 0, 1);
            ra.field_p = var11;
            IntrusiveDequeCursor.field_b = ra.field_p.flipHorizontal();
            var12 = new Sprite(195, 221);
            var6 = var12.width / 2;
            var12.bindAsRasterTarget();
            v.field_b.drawStringCentered(WeightedLruCache.a(new String[]{td.field_d}, (byte) 53, of.field_l), var6, 40, 16777215, -1);
            AudioServiceThread.field_a.drawStringCentered(WeightedLruCache.a(new String[]{td.field_d}, (byte) 43, PcmResampler.field_g), var6, 60, 16777215, -1);
            v.field_b.drawStringCentered(WeightedLruCache.a(new String[]{ProgressSubmission.field_n}, (byte) 96, MeshWorkspaceHelpers.field_b), var6, 110, 16777215, -1);
            AudioServiceThread.field_a.drawStringCentered(WeightedLruCache.a(new String[]{ProgressSubmission.field_n}, (byte) 58, AlternateUsernameLoginCredentials.field_q), var6, 130, 16777215, -1);
            v.field_b.drawStringCentered(DisplayNameValidator.field_p, var6, 180, 16777215, -1);
            AudioServiceThread.field_a.drawStringCentered(ra.field_i, var6, 200, 16777215, -1);
            oh.a(var12.height, var12, 0, var12.width, 3, (byte) 82, 0, 1);
            MouseWheelInput.field_b.bindAsRasterTarget();
            var12.drawTransparent(18 - MouseWheelInput.field_b.offsetX, -MouseWheelInput.field_b.offsetY + 241);
            for (var7 = 0; SpriteState.field_w.length > var7; var7++) {
              ProgressSubmission.field_s[var7].bindAsRasterTarget();
              AudioServiceThread.field_a.a(SpriteState.field_w[var7], 3, 3, ProgressSubmission.field_s[var7].width - 6, -6 + ProgressSubmission.field_s[var7].height, RadialSelectorWidget.field_H, -1, 1, 1, AudioServiceThread.field_a.field_B + AudioServiceThread.field_a.field_M);
              oh.a(ProgressSubmission.field_s[var7].height, ProgressSubmission.field_s[var7], 0, ProgressSubmission.field_s[var7].width, 3, (byte) 37, 0, 1);
            }
            SpriteState.field_w = null;
            pa.field_a = RasterSnapshot.field_l.copy();
            pa.field_a.bindAsRasterTarget();
            ValidationHelpWidget.a(2 * SoftwareRasterizer.height / 3, (byte) -105, 0, 0, SoftwareRasterizer.width, 64);
            SoftwareRasterizer.setTarget(var27, var2, var3);
            SoftwareRasterizer.restoreClip(ld.field_b);
            GzipDecompressor.field_c = 231 + (-ToggleButton.field_H.width + mj.field_b.width) / 2;
            LoginForm.field_L = 390 + (-ToggleButton.field_H.height + mj.field_b.height) / 2;
            WhirlpoolHasher.field_j = null;
            ProxyAuthenticationException.field_b = (mj.field_b.height - ToggleButton.field_H.height) / 2 + 390;
            IndexedSpriteArrayFactory.field_f = (-ToggleButton.field_H.width + mj.field_b.width) / 2 + 434;
          }
          if (WidgetTheme.field_f == null) {
            return;
          }
          if (uk.field_b != null &&
            null != v.field_b) {
            var28 = SoftwareRasterizer.pixels;
            var2Lifetime1 = SoftwareRasterizer.width;
            var3Lifetime1 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ld.field_b);
            var14 = WeightedLruCache.a(new String[]{ArchiveLoadingPlan.field_d[UsernameLoginCredentials.field_k]}, (byte) 49, BufferedRandomAccessFile.field_b);
            var5 = v.field_b.maxLineWidth(var14, MouseWheelInput.field_a);
            var6Lifetime1 = v.field_b.measureWrappedHeight(var14, MouseWheelInput.field_a, v.field_b.field_B + v.field_b.field_M);
            var7Lifetime1 = (MouseWheelInput.field_a - var5) / 2 + DisplayNameValidator.field_m;
            var7Lifetime1 -= 3;
            var8 = BeveledFrameFactory.field_a + (TimedValidator.field_a - var6Lifetime1) / 2;
            var5 += 6;
            var6Lifetime1 += 6;
            if (0 > var7Lifetime1) {
              var9_int = -var7Lifetime1;
              SocketJs5Transport.field_r = SocketJs5Transport.field_r - var9_int;
              uk.field_b.offsetX = uk.field_b.offsetX + var9_int;
              var5 = var5 + 2 * var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              uk.field_b.fullWidth = uk.field_b.fullWidth + var9_int * 2;
              DisplayNameValidator.field_m = DisplayNameValidator.field_m + var9_int;
            }
            var8 -= 3;
            if (var5 + var7Lifetime1 > uk.field_b.fullWidth) {
              var9_intLifetime1 = -uk.field_b.fullWidth + (var7Lifetime1 + var5);
              var5 = var5 + 2 * var9_intLifetime1;
              uk.field_b.fullWidth = uk.field_b.fullWidth + var9_intLifetime1 * 2;
              SocketJs5Transport.field_r = SocketJs5Transport.field_r - var9_intLifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              DisplayNameValidator.field_m = DisplayNameValidator.field_m + var9_intLifetime1;
              uk.field_b.offsetX = uk.field_b.offsetX + var9_intLifetime1;
            }
            if (0 > var8) {
              var9_intLifetime2 = -var8;
              var8 = var8 + var9_intLifetime2;
              uk.field_b.offsetY = uk.field_b.offsetY + var9_intLifetime2;
              uk.field_b.fullHeight = uk.field_b.fullHeight + 2 * var9_intLifetime2;
              BeveledFrameFactory.field_a = BeveledFrameFactory.field_a + var9_intLifetime2;
              EmailLoginCredentials.field_i = EmailLoginCredentials.field_i - var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime2 * 2;
            }
            if (uk.field_b.fullHeight < var6Lifetime1 + var8) {
              var9_intLifetime3 = var8 + var6Lifetime1 - uk.field_b.fullHeight;
              uk.field_b.fullHeight = uk.field_b.fullHeight + 2 * var9_intLifetime3;
              EmailLoginCredentials.field_i = EmailLoginCredentials.field_i - var9_intLifetime3;
              uk.field_b.offsetY = uk.field_b.offsetY + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime3 * 2;
              BeveledFrameFactory.field_a = BeveledFrameFactory.field_a + var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
            }
            uk.field_b.expandToFullSize();
            var9 = new Sprite(uk.field_b.fullWidth, uk.field_b.fullHeight);
            var9.bindAsRasterTarget();
            v.field_b.a(var14, DisplayNameValidator.field_m, BeveledFrameFactory.field_a, MouseWheelInput.field_a, TimedValidator.field_a, 16777215, -1, 1, 1, v.field_b.field_M + v.field_b.field_B);
            oh.a(var9.fullHeight, var9, 0, var9.fullWidth, 3, (byte) 98, 0, 1);
            uk.field_b.bindAsRasterTarget();
            var9.drawTransparent(0, 0);
            QuickChatPhraseDefinition.field_s = new Sprite(640, 480);
            QuickChatPhraseDefinition.field_s.bindAsRasterTarget();
            uk.field_b.drawRotatedAboutCenter(SocketJs5Transport.field_r + (uk.field_b.fullWidth >> 1), EmailLoginCredentials.field_i + (uk.field_b.fullHeight >> 1), kk.field_xb, 4096);
            uk.field_b = null;
            QuickChatPhraseDefinition.field_s.trimTransparentBorders();
            SoftwareRasterizer.setTarget(var28, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.restoreClip(ld.field_b);
          }
          if (null != Js5Index.field_r &&
            AudioServiceThread.field_a != null) {
            var29 = SoftwareRasterizer.pixels;
            var2Lifetime2 = SoftwareRasterizer.width;
            var3Lifetime2 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ld.field_b);
            var16 = new Sprite(412, 43);
            var5_ref_String = WeightedLruCache.a(new String[]{Js5Index.field_r}, (byte) 79, field_b);
            Js5Index.field_r = null;
            var16.bindAsRasterTarget();
            AudioServiceThread.field_a.a(var5_ref_String, 3, 3, var16.width - 6, -6 + var16.height, 16777215, -1, 0, 1, AudioServiceThread.field_a.field_B + AudioServiceThread.field_a.field_M);
            oh.a(var16.height, var16, 0, var16.width, 3, (byte) 60, 0, 1);
            WidgetTheme.field_f.bindAsRasterTarget();
            var16.drawTransparent(199 - WidgetTheme.field_f.offsetX, 83 - WidgetTheme.field_f.offsetY);
            SoftwareRasterizer.setTarget(var29, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.restoreClip(ld.field_b);
          }
          if (null != StrongCacheEntry.field_v &&
            AudioServiceThread.field_a != null) {
            var30 = SoftwareRasterizer.pixels;
            var2Lifetime3 = SoftwareRasterizer.width;
            var3Lifetime3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(ld.field_b);
            var4 = 6 + AudioServiceThread.field_a.maxLineWidth(lg.field_b, 640);
            var5Lifetime1 = StrongCacheEntry.field_v.fullWidth + (var4 + 20);
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = 20 + var6Lifetime2 + StrongCacheEntry.field_v.fullWidth;
            WidgetTheme.field_f.bindAsRasterTarget();
            AudioServiceThread.field_a.drawString(lg.field_b, var7Lifetime2 - WidgetTheme.field_f.offsetX, -WidgetTheme.field_f.offsetY + (155 + (AudioServiceThread.field_a.field_M + AudioServiceThread.field_a.field_B)), 16777215, -1);
            oh.a(50, WidgetTheme.field_f, var7Lifetime2 - WidgetTheme.field_f.offsetX - 4, var4, 3, (byte) 90, -WidgetTheme.field_f.offsetY + 155, 1);
            var8Lifetime1 = -((-AudioServiceThread.field_a.field_B - AudioServiceThread.field_a.field_M - 3 + StrongCacheEntry.field_v.fullHeight) / 2) + 155 - WidgetTheme.field_f.offsetY;
            StrongCacheEntry.field_v.drawTransparent(var6Lifetime2 - WidgetTheme.field_f.offsetX, var8Lifetime1);
            SoftwareRasterizer.setTarget(var30, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.restoreClip(ld.field_b);
            StrongCacheEntry.field_v = null;
          }
          SoftwareRasterizer.saveClip(ld.field_b);
          SoftwareRasterizer.fillRoundedRectangleBlended(16, 16, 608, 112, 15, AlternateUsernameLoginCredentials.field_n, NameAvailabilityRequest.field_g);
          SoftwareRasterizer.fillRoundedRectangleBlended(231, 144, 393, 232, 15, AlternateUsernameLoginCredentials.field_n, NameAvailabilityRequest.field_g);
          if (null != IntrusiveNodeHashTable.field_c) {
            IntrusiveNodeHashTable.field_c.drawTransparent(0, 0);
          }
          if (MouseWheelInput.field_b != null) {
            MouseWheelInput.field_b.drawTransparent(0, 0);
          }
          if (param0 != 2) {
            RasterBuffer.b((byte) -119);
          }
          WidgetTheme.field_f.drawTransparent(0, 0);
          if (null != QuickChatPhraseDefinition.field_s) {
            QuickChatPhraseDefinition.field_s.drawTransparent(0, 0);
          }
          if (null != mj.field_b &&
            null != ToggleButton.field_H) {
            mj.field_b.drawTransparent(231, 390);
            var1 = RasterSnapshot.field_l;
            if (GameGraphicsResources.field_d.field_g == 0) {
              var1 = pa.field_a;
            }
            var1.drawTransparent(0, 0);
            stackIn_50_0 = 40;
            stackIn_50_1 = IndexedSpriteArrayFactory.field_c;
            if (GameGraphicsResources.field_d.field_g == 0) {
              stackIn_51_2 = 4;
            } else {
              stackIn_51_2 = 3;
            }
            var2Lifetime4 = (stackIn_50_0 * DisplayNameSyntaxHelpers.sine2048(stackIn_50_1 << stackIn_51_2, (byte) -89) >> 16) + 40;
            if (var2Lifetime4 > 0) {
              mj.field_b.drawAdditive(230, 389, var2Lifetime4);
              mj.field_b.drawAdditive(232, 389, var2Lifetime4);
              mj.field_b.drawAdditive(232, 391, var2Lifetime4);
              mj.field_b.drawAdditive(230, 391, var2Lifetime4);
              var1.drawAdditive(1, 1, var2Lifetime4);
              var1.drawAdditive(-1, 1, var2Lifetime4);
              var1.drawAdditive(1, -1, var2Lifetime4);
              var1.drawAdditive(-1, -1, var2Lifetime4);
            }
            stackIn_56_0 = 2;
            stackIn_57_1 = (GameGraphicsResources.field_d.field_g == 0);
            SecondaryNodeDeque.a(stackIn_56_0, stackIn_57_1, GzipDecompressor.field_c, LoginForm.field_L);
          }
          if (mj.field_b != null &&
            null != ToggleButton.field_H) {
            mj.field_b.drawTransparent(434, 390);
            EmailValidationError.field_c.drawTransparent(0, 0);
            if (GameGraphicsResources.field_d.field_g == 1) {
              ValidationHelpWidget.a(7 * mj.field_b.height / 12, (byte) -105, 392, 436, mj.field_b.width - 4, 64);
            }
            stackIn_65_0 = 2;
            stackIn_66_1 = (1 == GameGraphicsResources.field_d.field_g);
            SecondaryNodeDeque.a(stackIn_65_0, stackIn_66_1, IndexedSpriteArrayFactory.field_f, ProxyAuthenticationException.field_b);
          }
          if (ra.field_p != null) {
            var1_int = -(ra.field_p.fullHeight / 2) + 357;
            ra.field_p.drawTransparent(-ra.field_p.fullWidth + 269, var1_int);
            IntrusiveDequeCursor.field_b.drawTransparent(586, var1_int);
            if (NetworkArchiveRequest.field_B > var1_int &&
              var1_int + ra.field_p.height > NetworkArchiveRequest.field_B) {
              var2Lifetime5 = 40 + (40 * DisplayNameSyntaxHelpers.sine2048(IndexedSpriteArrayFactory.field_c << 4, (byte) -89) >> 16);
              if (var2Lifetime5 > 0) {
                if (AchievementSubmission.field_n > 269 - ra.field_p.width &&
                  269 > AchievementSubmission.field_n) {
                  ra.field_p.drawAdditive(269 + (-ra.field_p.fullWidth - 1), -1 + var1_int, var2Lifetime5);
                  ra.field_p.drawAdditive(270 - ra.field_p.fullWidth, -1 + var1_int, var2Lifetime5);
                  ra.field_p.drawAdditive(268 - ra.field_p.fullWidth, var1_int + 1, var2Lifetime5);
                  ra.field_p.drawAdditive(-ra.field_p.fullWidth + 269 + 1, var1_int + 1, var2Lifetime5);
                } else {
                  if (AchievementSubmission.field_n > 586 &&
                    AchievementSubmission.field_n < 586 + ra.field_p.width) {
                    IntrusiveDequeCursor.field_b.drawAdditive(585, var1_int - 1, var2Lifetime5);
                    IntrusiveDequeCursor.field_b.drawAdditive(587, var1_int - 1, var2Lifetime5);
                    IntrusiveDequeCursor.field_b.drawAdditive(585, var1_int + 1, var2Lifetime5);
                    IntrusiveDequeCursor.field_b.drawAdditive(587, var1_int + 1, var2Lifetime5);
                  }
                }
              }
            }
          }
          GridActor.drawScreenshotPreview(true);
          ProgressSubmission.field_s[ej.field_c].drawTransparent(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1_ref), "df.E(" + param0 + ')');
        }
    }

    abstract void a(java.awt.Graphics param0, int param1, int param2, int param3);

    static {
        field_c = new IntrusiveDeque();
        field_b = "(Including <%0>)";
        field_e = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_i = "Confirm Password: ";
    }
}
