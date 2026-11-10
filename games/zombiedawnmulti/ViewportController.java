/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewportController {
    private int field_j;
    private int field_h;
    static int field_l;
    private int field_b;
    private CanvasResizeListener field_u;
    private int field_q;
    private float field_c;
    private int field_s;
    private int field_v;
    static QuickChatCategoryRegistry field_p;
    private int field_o;
    private int field_d;
    private int field_k;
    static PlatformTaskDispatcher field_m;
    static String field_t;
    static String field_i;
    private int field_x;
    private int field_e;
    private int field_g;
    private int field_n;
    private int field_f;
    private int field_w;
    static int[] field_r;
    private boolean field_a;

    public static void releaseStatics(int param0) {
        if (param0 < 8) {
          field_p = (QuickChatCategoryRegistry) null;
        }
        field_i = null;
        field_m = null;
        field_r = null;
        field_p = null;
        field_t = null;
    }

    final void updateViewport(int param0) {
        if (null != FullscreenSupport.field_f) {
          return;
        }
        if (!(QueuedListRequest.field_h > 0)) {
          this.field_a = false;
        }
        if (this.field_a) {
        } else {
          if (ArchiveProvider.field_d < this.field_b) {
            ClockAndScreenHelpers.field_a = (-ArchiveProvider.field_d + this.field_b) / 2;
          } else {
            if (this.field_b > 0) {
              ClockAndScreenHelpers.field_a = 0;
            }
          }
          if (this.field_k != ArchiveProvider.field_d ||
            CredentialKind.field_i != this.field_w) {
            this.field_u.onCanvasResize((byte) -89, this.field_w, this.field_k);
          }
          return;
        }
        int fieldTemp$0 = this.field_v - 1;
        this.field_v = this.field_v - 1;
        if (fieldTemp$0 > 0) {
          return;
        }
        this.field_v = this.field_g;
        if (!(this.field_f <= WidgetStyleLayer.field_d)) {
          this.field_a = false;
          return;
        }
        if (param0 == -12371) {
          this.applyDesiredSize(0);
          return;
        }
    }

    final static void drawBenefitsScreen(boolean param0) {
        Sprite var1 = null;
        int var1_int = 0;
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
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        boolean stackIn_56_3;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        boolean stackIn_64_3;
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
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (ArrayWidgetGroup.field_C != null &&
            ArrayWidgetGroup.field_C.ensureIndex((byte) -124) &&
            ArrayWidgetGroup.field_C.isGroupAvailableByName(false, "benefits") &&
            PasswordCheckHelpers.field_d != null &&
            PasswordCheckHelpers.field_d.ensureIndex((byte) -108) &&
            PasswordCheckHelpers.field_d.isGroupAvailableByName(false, "benefits")) {
            GameApplet.field_b = ByteArrayPool.loadSpriteByName("benefits", "headline", ArrayWidgetGroup.field_C, 11091);
            ArchiveAvailabilityHelpers.field_a = ByteArrayPool.loadSpriteByName("benefits", "blurbpane", ArrayWidgetGroup.field_C, 11091);
            DetonationTarget.field_l = ByteArrayPool.loadSpriteByName("benefits", "button", ArrayWidgetGroup.field_C, 11091);
            QuickChatCategoryRegistry.field_e = ByteArrayPool.loadSpriteByName("benefits", "signup_text", ArrayWidgetGroup.field_C, 11091);
            PasswordValidator.field_y = ByteArrayPool.loadSpriteByName("benefits", "menu_text", ArrayWidgetGroup.field_C, 11091);
            TipPanelHelpers.field_j = ByteArrayPool.loadSpriteByName("benefits", "button_frame", ArrayWidgetGroup.field_C, 11091);
            ReportAbuseDialog.field_Tb = ByteArrayPool.loadSpriteByName("benefits", "arrow", ArrayWidgetGroup.field_C, 11091);
            TabbedPane.field_Lb = (BitmapFont) ((Object) Under13NoticePanel.loadBinaryFontByName(ArrayWidgetGroup.field_C, 4, PasswordCheckHelpers.field_d, "large_font", "benefits"));
            DebouncedValidationProvider.field_e = (BitmapFont) ((Object) Under13NoticePanel.loadBinaryFontByName(ArrayWidgetGroup.field_C, 4, PasswordCheckHelpers.field_d, "small_font", "benefits"));
            var27 = SoftwareRasterizer.pixels;
            var2 = SoftwareRasterizer.width;
            var3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(IdleTickHelpers.field_f);
            var11 = new Sprite(ReportAbuseDialog.field_Tb.width + 4, 4 + ReportAbuseDialog.field_Tb.height);
            var11.bindAsRenderTarget();
            ReportAbuseDialog.field_Tb.drawTintedGrayscale(2, 2, PlayerLoadout.field_e);
            HotspotTextWidget.drawSpriteOutline(5, var11.width, 2, var11.height, var11, 1, 0, 0);
            ReportAbuseDialog.field_Tb = var11;
            MusicVoice.field_j = ReportAbuseDialog.field_Tb.copyFlippedHorizontal();
            var12 = new Sprite(195, 221);
            var6 = var12.width / 2;
            var12.bindAsRenderTarget();
            TabbedPane.field_Lb.drawCentered(QueuedListRequest.substituteTemplateArguments(ByteStorage.field_b, new String[]{RasterStackHelpers.field_e}, 2), var6, 40, 16777215, -1);
            DebouncedValidationProvider.field_e.drawCentered(QueuedListRequest.substituteTemplateArguments(QuickChatCategoryDefinition.field_w, new String[]{RasterStackHelpers.field_e}, 2), var6, 60, 16777215, -1);
            TabbedPane.field_Lb.drawCentered(QueuedListRequest.substituteTemplateArguments(LobbyUpdateHandler.field_c, new String[]{KeyboardListenerHelpers.field_b}, 2), var6, 110, 16777215, -1);
            DebouncedValidationProvider.field_e.drawCentered(QueuedListRequest.substituteTemplateArguments(ScorePopup.field_G, new String[]{KeyboardListenerHelpers.field_b}, 2), var6, 130, 16777215, -1);
            TabbedPane.field_Lb.drawCentered(ContextMenu.field_Yb, var6, 180, 16777215, -1);
            DebouncedValidationProvider.field_e.drawCentered(ClickMarkerParticle.field_f, var6, 200, 16777215, -1);
            HotspotTextWidget.drawSpriteOutline(5, var12.width, 3, var12.height, var12, 1, 0, 0);
            ArchiveAvailabilityHelpers.field_a.bindAsRenderTarget();
            var12.drawTransparent(-ArchiveAvailabilityHelpers.field_a.offsetX + 18, 241 - ArchiveAvailabilityHelpers.field_a.field_y);
            for (var7 = 0; MusicPatchEnvelope.field_a.length > var7; var7++) {
              QuickChatCommandType.field_h[var7].bindAsRenderTarget();
              DebouncedValidationProvider.field_e.drawParagraph(MusicPatchEnvelope.field_a[var7], 3, 3, QuickChatCommandType.field_h[var7].width - 6, -6 + QuickChatCommandType.field_h[var7].height, PlayerLoadout.field_e, -1, 1, 1, DebouncedValidationProvider.field_e.maxAscent + DebouncedValidationProvider.field_e.maxDescent);
              HotspotTextWidget.drawSpriteOutline(5, QuickChatCommandType.field_h[var7].width, 3, QuickChatCommandType.field_h[var7].height, QuickChatCommandType.field_h[var7], 1, 0, 0);
            }
            MusicPatchEnvelope.field_a = null;
            ProgramNoteUsage.field_j = QuickChatCategoryRegistry.field_e.copy();
            ProgramNoteUsage.field_j.bindAsRenderTarget();
            CredentialKind.recolorGreenPixelsInRect((byte) -115, 0, 64, SoftwareRasterizer.width, SoftwareRasterizer.height * 2 / 3, 0);
            SoftwareRasterizer.setTarget(var27, var2, var3);
            SoftwareRasterizer.restoreClip(IdleTickHelpers.field_f);
            ChatPromptHelpers.field_d = (DetonationTarget.field_l.width - TipPanelHelpers.field_j.width) / 2 + 231;
            PendingStatusRequest.field_j = (-TipPanelHelpers.field_j.height + DetonationTarget.field_l.height) / 2 + 390;
            HotspotTextWidget.field_O = (-TipPanelHelpers.field_j.height + DetonationTarget.field_l.height) / 2 + 390;
            ArrayWidgetGroup.field_C = null;
            RasterSnapshot.field_k = (DetonationTarget.field_l.width - TipPanelHelpers.field_j.width) / 2 + 434;
          }
          if (MiasmaPuff.field_v == null) {
            return;
          }
          if (SineTableHelpers.field_c != null &&
            TabbedPane.field_Lb != null) {
            var28 = SoftwareRasterizer.pixels;
            var2Lifetime1 = SoftwareRasterizer.width;
            var3Lifetime1 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(IdleTickHelpers.field_f);
            var14 = QueuedListRequest.substituteTemplateArguments(HuffmanCodec.field_h, new String[]{DialogLayer.field_L[SpriteDecodeGlobals.field_f]}, 2);
            var5 = TabbedPane.field_Lb.maxLineWidth(var14, InstructionsScreen.field_p);
            var6Lifetime1 = TabbedPane.field_Lb.measureWrappedHeight(var14, InstructionsScreen.field_p, TabbedPane.field_Lb.maxAscent + TabbedPane.field_Lb.maxDescent);
            var7Lifetime1 = (-var5 + InstructionsScreen.field_p) / 2 + ViewFactoryHelpers.field_c;
            var8 = (DiskCacheWorker.field_a - var6Lifetime1) / 2 + BirthDateInputWidget.field_bb;
            var7Lifetime1 -= 3;
            var5 += 6;
            var8 -= 3;
            var6Lifetime1 += 6;
            if (0 > var7Lifetime1) {
              var9_int = -var7Lifetime1;
              ViewFactoryHelpers.field_c = ViewFactoryHelpers.field_c + var9_int;
              var5 = var5 + var9_int * 2;
              SineTableHelpers.field_c.offsetX = SineTableHelpers.field_c.offsetX + var9_int;
              LevelFileCatalog.field_b = LevelFileCatalog.field_b - var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              SineTableHelpers.field_c.fullWidth = SineTableHelpers.field_c.fullWidth + 2 * var9_int;
            }
            if (SineTableHelpers.field_c.fullWidth < var7Lifetime1 + var5) {
              var9_intLifetime1 = var7Lifetime1 - (-var5 + SineTableHelpers.field_c.fullWidth);
              LevelFileCatalog.field_b = LevelFileCatalog.field_b - var9_intLifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              ViewFactoryHelpers.field_c = ViewFactoryHelpers.field_c + var9_intLifetime1;
              var5 = var5 + 2 * var9_intLifetime1;
              SineTableHelpers.field_c.offsetX = SineTableHelpers.field_c.offsetX + var9_intLifetime1;
              SineTableHelpers.field_c.fullWidth = SineTableHelpers.field_c.fullWidth + var9_intLifetime1 * 2;
            }
            if (0 > var8) {
              var9_intLifetime2 = -var8;
              var8 = var8 + var9_intLifetime2;
              SineTableHelpers.field_c.field_y = SineTableHelpers.field_c.field_y + var9_intLifetime2;
              ArchiveAvailabilityHelpers.field_e = ArchiveAvailabilityHelpers.field_e - var9_intLifetime2;
              SineTableHelpers.field_c.field_u = SineTableHelpers.field_c.field_u + 2 * var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + var9_intLifetime2 * 2;
              BirthDateInputWidget.field_bb = BirthDateInputWidget.field_bb + var9_intLifetime2;
            }
            if (SineTableHelpers.field_c.field_u < var6Lifetime1 + var8) {
              var9_intLifetime3 = -SineTableHelpers.field_c.field_u + (var8 + var6Lifetime1);
              SineTableHelpers.field_c.field_u = SineTableHelpers.field_c.field_u + var9_intLifetime3 * 2;
              SineTableHelpers.field_c.field_y = SineTableHelpers.field_c.field_y + var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime3;
              ArchiveAvailabilityHelpers.field_e = ArchiveAvailabilityHelpers.field_e - var9_intLifetime3;
              BirthDateInputWidget.field_bb = BirthDateInputWidget.field_bb + var9_intLifetime3;
            }
            SineTableHelpers.field_c.normalizeCanvas();
            var9 = new Sprite(SineTableHelpers.field_c.fullWidth, SineTableHelpers.field_c.field_u);
            var9.bindAsRenderTarget();
            TabbedPane.field_Lb.drawParagraph(var14, ViewFactoryHelpers.field_c, BirthDateInputWidget.field_bb, InstructionsScreen.field_p, DiskCacheWorker.field_a, 16777215, -1, 1, 1, TabbedPane.field_Lb.maxDescent + TabbedPane.field_Lb.maxAscent);
            HotspotTextWidget.drawSpriteOutline(5, var9.fullWidth, 3, var9.field_u, var9, 1, 0, 0);
            SineTableHelpers.field_c.bindAsRenderTarget();
            var9.drawTransparent(0, 0);
            BufferedSocket.field_j = new Sprite(640, 480);
            BufferedSocket.field_j.bindAsRenderTarget();
            SineTableHelpers.field_c.drawRotated(LevelFileCatalog.field_b + (SineTableHelpers.field_c.fullWidth >> 1), ArchiveAvailabilityHelpers.field_e + (SineTableHelpers.field_c.field_u >> 1), GameScreen.field_N, 4096);
            SineTableHelpers.field_c = null;
            BufferedSocket.field_j.trimTransparentBorders();
            SoftwareRasterizer.setTarget(var28, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.restoreClip(IdleTickHelpers.field_f);
          }
          if (null != ContentTransitionDialog.field_ib &&
            null != DebouncedValidationProvider.field_e) {
            var29 = SoftwareRasterizer.pixels;
            var2Lifetime2 = SoftwareRasterizer.width;
            var3Lifetime2 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(IdleTickHelpers.field_f);
            var16 = new Sprite(412, 43);
            var5_ref_String = QueuedListRequest.substituteTemplateArguments(DialogLayer.field_F, new String[]{ContentTransitionDialog.field_ib}, 2);
            ContentTransitionDialog.field_ib = null;
            var16.bindAsRenderTarget();
            DebouncedValidationProvider.field_e.drawParagraph(var5_ref_String, 3, 3, var16.width - 6, -6 + var16.height, 16777215, -1, 0, 1, DebouncedValidationProvider.field_e.maxAscent + DebouncedValidationProvider.field_e.maxDescent);
            HotspotTextWidget.drawSpriteOutline(5, var16.width, 3, var16.height, var16, 1, 0, 0);
            MiasmaPuff.field_v.bindAsRenderTarget();
            var16.drawTransparent(-MiasmaPuff.field_v.offsetX + 199, -MiasmaPuff.field_v.field_y + 83);
            SoftwareRasterizer.setTarget(var29, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.restoreClip(IdleTickHelpers.field_f);
          }
          if (null != MouseInputHandler.field_e &&
            null != DebouncedValidationProvider.field_e) {
            var30 = SoftwareRasterizer.pixels;
            var2Lifetime3 = SoftwareRasterizer.width;
            var3Lifetime3 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(IdleTickHelpers.field_f);
            var4 = 6 + DebouncedValidationProvider.field_e.maxLineWidth(AccountCreationDialog.field_Cb, 640);
            var5Lifetime1 = 20 + (var4 + MouseInputHandler.field_e.fullWidth);
            var6Lifetime2 = 427 - var5Lifetime1 / 2;
            var7Lifetime2 = var6Lifetime2 - (-MouseInputHandler.field_e.fullWidth - 20);
            MiasmaPuff.field_v.bindAsRenderTarget();
            DebouncedValidationProvider.field_e.drawLeft(AccountCreationDialog.field_Cb, var7Lifetime2 - MiasmaPuff.field_v.offsetX, DebouncedValidationProvider.field_e.maxDescent + (DebouncedValidationProvider.field_e.maxAscent - MiasmaPuff.field_v.field_y + 155), 16777215, -1);
            HotspotTextWidget.drawSpriteOutline(5, var4, 3, 50, MiasmaPuff.field_v, 1, -4 + var7Lifetime2 - MiasmaPuff.field_v.offsetX, -MiasmaPuff.field_v.field_y + 155);
            var8Lifetime1 = -MiasmaPuff.field_v.field_y + (155 - (-DebouncedValidationProvider.field_e.maxDescent + (-DebouncedValidationProvider.field_e.maxAscent + (-3 + MouseInputHandler.field_e.field_u))) / 2);
            MouseInputHandler.field_e.drawTransparent(var6Lifetime2 - MiasmaPuff.field_v.offsetX, var8Lifetime1);
            SoftwareRasterizer.setTarget(var30, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.restoreClip(IdleTickHelpers.field_f);
            MouseInputHandler.field_e = null;
          }
          SoftwareRasterizer.saveClip(IdleTickHelpers.field_f);
          SoftwareRasterizer.fillRoundedRectAlpha(16, 16, 608, 112, 15, ArchiveLoadStep.field_c, ChatInputHelpers.field_c);
          SoftwareRasterizer.fillRoundedRectAlpha(231, 144, 393, 232, 15, ArchiveLoadStep.field_c, ChatInputHelpers.field_c);
          if (null != GameApplet.field_b) {
            GameApplet.field_b.drawTransparent(0, 0);
          }
          if (null != ArchiveAvailabilityHelpers.field_a) {
            ArchiveAvailabilityHelpers.field_a.drawTransparent(0, 0);
          }
          MiasmaPuff.field_v.drawTransparent(0, 0);
          if (null != BufferedSocket.field_j) {
            BufferedSocket.field_j.drawTransparent(0, 0);
          }
          if (DetonationTarget.field_l != null &&
            TipPanelHelpers.field_j != null) {
            DetonationTarget.field_l.drawTransparent(231, 390);
            var1 = QuickChatCategoryRegistry.field_e;
            if (UsernameSuggestionsPanel.field_H.field_d == 0) {
              var1 = ProgramNoteUsage.field_j;
            }
            var1.drawTransparent(0, 0);
            stackIn_49_0 = 105;
            stackIn_49_1 = ClientException.field_c;
            if (UsernameSuggestionsPanel.field_H.field_d != 0) {
              stackIn_50_2 = 3;
            } else {
              stackIn_50_2 = 4;
            }
            var2Lifetime4 = (SineTableHelpers.sine(stackIn_49_0, stackIn_49_1 << stackIn_50_2) * 40 >> 16) + 40;
            if (var2Lifetime4 > 0) {
              DetonationTarget.field_l.drawAdditive(230, 389, var2Lifetime4);
              DetonationTarget.field_l.drawAdditive(232, 389, var2Lifetime4);
              DetonationTarget.field_l.drawAdditive(232, 391, var2Lifetime4);
              DetonationTarget.field_l.drawAdditive(230, 391, var2Lifetime4);
              var1.drawAdditive(1, 1, var2Lifetime4);
              var1.drawAdditive(-1, 1, var2Lifetime4);
              var1.drawAdditive(1, -1, var2Lifetime4);
              var1.drawAdditive(-1, -1, var2Lifetime4);
            }
            stackIn_55_0 = ChatPromptHelpers.field_d;
            stackIn_55_1 = PendingStatusRequest.field_j;
            stackIn_55_2 = -59;
            stackIn_56_3 = (UsernameSuggestionsPanel.field_H.field_d == 0);
            GlintButtonHelpers.drawGlintingButton(stackIn_55_0, stackIn_55_1, stackIn_55_2, stackIn_56_3);
          }
          if (null != DetonationTarget.field_l &&
            TipPanelHelpers.field_j != null) {
            DetonationTarget.field_l.drawTransparent(434, 390);
            PasswordValidator.field_y.drawTransparent(0, 0);
            if (1 == UsernameSuggestionsPanel.field_H.field_d) {
              CredentialKind.recolorGreenPixelsInRect((byte) -122, 436, 64, -4 + DetonationTarget.field_l.width, DetonationTarget.field_l.height * 7 / 12, 392);
            }
            stackIn_63_0 = RasterSnapshot.field_k;
            stackIn_63_1 = HotspotTextWidget.field_O;
            stackIn_63_2 = -59;
            stackIn_64_3 = (1 == UsernameSuggestionsPanel.field_H.field_d);
            GlintButtonHelpers.drawGlintingButton(stackIn_63_0, stackIn_63_1, stackIn_63_2, stackIn_64_3);
          }
          if (null != ReportAbuseDialog.field_Tb) {
            var1_int = -(ReportAbuseDialog.field_Tb.field_u / 2) + 357;
            ReportAbuseDialog.field_Tb.drawTransparent(269 - ReportAbuseDialog.field_Tb.fullWidth, var1_int);
            MusicVoice.field_j.drawTransparent(586, var1_int);
            if (var1_int < LoginMethod.field_d &&
              LoginMethod.field_d < var1_int + ReportAbuseDialog.field_Tb.height) {
              var2Lifetime5 = 40 + (40 * SineTableHelpers.sine(-47, ClientException.field_c << 4) >> 16);
              if (var2Lifetime5 > 0) {
                if (269 - ReportAbuseDialog.field_Tb.width < MouseInputHandler.field_g &&
                  269 > MouseInputHandler.field_g) {
                  ReportAbuseDialog.field_Tb.drawAdditive(-ReportAbuseDialog.field_Tb.fullWidth + 268, var1_int - 1, var2Lifetime5);
                  ReportAbuseDialog.field_Tb.drawAdditive(1 + (-ReportAbuseDialog.field_Tb.fullWidth + 269), var1_int - 1, var2Lifetime5);
                  ReportAbuseDialog.field_Tb.drawAdditive(-ReportAbuseDialog.field_Tb.fullWidth + 268, 1 + var1_int, var2Lifetime5);
                  ReportAbuseDialog.field_Tb.drawAdditive(269 - ReportAbuseDialog.field_Tb.fullWidth + 1, var1_int + 1, var2Lifetime5);
                } else {
                  if (MouseInputHandler.field_g > 586 &&
                    586 + ReportAbuseDialog.field_Tb.width > MouseInputHandler.field_g) {
                    MusicVoice.field_j.drawAdditive(585, -1 + var1_int, var2Lifetime5);
                    MusicVoice.field_j.drawAdditive(587, var1_int - 1, var2Lifetime5);
                    MusicVoice.field_j.drawAdditive(585, var1_int + 1, var2Lifetime5);
                    MusicVoice.field_j.drawAdditive(587, 1 + var1_int, var2Lifetime5);
                  }
                }
              }
            }
          }
          ScrollPaneWithFooter.drawScreenshotSlideshow((byte) -57);
          if (!param0) {
            return;
          }
          QuickChatCommandType.field_h[DebouncedValidationProvider.field_g].drawTransparent(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "ok.C(" + param0 + ')');
        }
    }

    final FullscreenFocusCanvas enterFullscreen(int param0) {
        this.field_x = CredentialKind.field_i;
        this.field_j = ArchiveProvider.field_d;
        this.field_u.onCanvasResize((byte) -26, this.field_q, this.field_e);
        FrameCycleAnimation.field_h = false;
        FullscreenFocusCanvas var2 = PendingIntArrayRequest.openFullscreenWindow(param0 + 10386, ArrayWidgetGroup.field_J, this.field_q, 0, param0, this.field_e);
        if (var2 == null) {
          this.restoreWindowedSize(param0 - 44);
        }
        return var2;
    }

    final void setDesiredSize(int param0, byte param1, int param2) {
        int var4 = 71 % ((param1 - 20) / 54);
        this.field_b = param0;
        this.field_d = param2;
    }

    private final void applyDesiredSize(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_b;
        var3 = this.field_d;
        if (!this.isResizeAllowed(0)) {
          this.field_a = false;
          return;
        }
        if (var2 <= this.field_o) {
          if (var2 < this.field_s) {
            var2 = this.field_s;
          }
        } else {
          var2 = this.field_o;
        }
        if (var3 > this.field_n) {
          var3 = this.field_n;
        } else {
          if (var3 < this.field_h) {
            var3 = this.field_h;
          }
        }
        if (0.0f < this.field_c) {
          var4 = (int)(0.5f + (float)var3 * this.field_c);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_c);
          } else {
            if (var2 > var4) {
              var2 = var4;
            }
          }
        }
        if (var2 != ArchiveProvider.field_d ||
          var3 != CredentialKind.field_i) {
          this.field_u.onCanvasResize((byte) -27, var3, var2);
        }
        if (this.field_b > param0) {
          ClockAndScreenHelpers.field_a = (-ArchiveProvider.field_d + this.field_b) / 2;
        }
    }

    private ViewportController() throws Throwable {
        throw new Error();
    }

    final void restoreWindowedSize(int param0) {
        if (param0 > -3) {
          return;
        }
        this.field_u.onCanvasResize((byte) -85, this.field_x, this.field_j);
    }

    final static void sendPowerupRequest(int param0, int param1, CipherPacketBuffer param2, int param3, int param4, int param5) {
        if (PortalEntryEvent.field_m.field_c) {
          return;
        }
        if (FadingDialog.field_I) {
          UiWidget.field_s.requestPowerup(param1, -11513, 0, param5, param4);
          return;
        }
        try {
          if (param0 >= -95) {
            ViewportController.releaseStatics(112);
          }
          param2.writeCipheredOpcode((byte) -35, 59);
          param2.writeShort(param3, (byte) -87);
          param2.writeByte(123, param5);
          param2.writeShort(param4, (byte) -112);
          param2.writeShort(param1, (byte) -50);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ok.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean isResizeAllowed(int param0) {
        boolean stackIn_5_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_5_0 = (WidgetStyleLayer.field_d >= this.field_f) && (0 < QueuedListRequest.field_h);
        return stackIn_5_0;
    }

    static {
        field_t = "Famished";
        field_i = "Your powerups will last longer if you have this trait equipped.";
        field_r = new int[8192];
    }
}
