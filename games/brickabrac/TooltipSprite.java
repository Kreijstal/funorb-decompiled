/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TooltipSprite extends IntrusiveNode {
    static boolean field_p;
    private int tooltipHeight;
    static String field_k;
    private int y;
    private int x;
    private int tooltipWidth;
    private RgbSprite sprite;
    static String field_n;
    private String tooltipText;
    static int textChoiceButtonLineHeight;
    private boolean hovered;

    final static void a(ResourceArchive param0, ResourceArchive param1, byte param2, ResourceArchive param3) {
        RgbSprite var17 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        IndexedSprite[] var14 = null;
        int var11_int = 0;
        RgbSprite var15 = null;
        RgbSprite var18 = null;
        RgbSprite var11 = null;
        RgbSprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          ValidationMessageWidget.field_W = ActivityIndicatorWidget.loadRgbSpritesByName("commonui", param3, "frame_top", param2 ^ -57);
          GameplayAudioEvent.field_l = ActivityIndicatorWidget.loadRgbSpritesByName("commonui", param3, "frame_bottom", 2);
          MusicVoice.field_n = pl.loadRgbSpriteByName("commonui", "jagex_logo_grey", (byte) -110, param3);
          ValidatedTextFieldWidget.field_U = ActivityIndicatorWidget.loadRgbSpritesByName("commonui", param3, "button", 2);
          AccountDateHelpers.field_a = CheckboxWidgetRenderer.loadRgbSpritesByName("commonui", "validation", param3, (byte) -8);
          QuickChatMenu.field_Yb = (TextFont) ((Object) IntrusiveHashTable.a((byte) -118, "commonui", "arezzo12", param3, param0));
          ArchiveNetworkClient.field_u = (TextFont) ((Object) IntrusiveHashTable.a((byte) -108, "commonui", "arezzo14", param3, param0));
          wm.field_a = (TextFont) ((Object) IntrusiveHashTable.a((byte) -126, "commonui", "arezzo14bold", param3, param0));
          var17 = new RgbSprite(param1.takeFileByName(122, "button.gif", ""), (java.awt.Component) ((Object) CacheIoRequest.field_D));
          uo.loadIndexedSpriteByName((byte) 29, param3, "dropdown", "commonui");
          var5 = PacketBuffer.a("commonui", param3, "screen_options", param2 ^ 946715361);
          LevelPackLoader.field_b = new IndexedSprite[4];
          LoginCredentialKind.field_b = new IndexedSprite[4];
          ScreenNavigationHelpers.field_d = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{LevelPackLoader.field_b, ScreenNavigationHelpers.field_d, LoginCredentialKind.field_b};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].palette;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].indices[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            IndexedSprite[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = FullscreenFailureDialog.a(var5[var9], (byte) -85, var19[var11_int]);
            }
          }
          var9Lifetime1 = var17.height;
          HighscorePackSelector.pushRaster(param2 ^ 88);
          var17.bindRasterTarget();
          Rasterizer2D.grayscaleRectangle(0, 0, Rasterizer2D.width, Rasterizer2D.height);
          var15 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.bindRasterTarget();
          var17.drawAt(0, 0);
          var11 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var11.bindRasterTarget();
          if (param2 != -59) {
            TooltipSprite.d(-50);
          }
          var17.drawAt(var9Lifetime1 - var17.width, 0);
          var12 = new RgbSprite(-(var9Lifetime1 * 2) + var17.width, var9Lifetime1);
          var12.bindRasterTarget();
          var17.drawAt(-var9Lifetime1, 0);
          sc.popRaster(-81);
          ValidatedTextFieldWidget.field_U = new RgbSprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "nq.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void updateHover(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return;
        }
        this.hovered = AccountResponse.a(MusicPatch.pointerX, ResourcePreparationEntry.pointerY, (byte) -24, this.y, this.x, this.sprite);
        this.hovered = this.sprite.containsPixel(this.x, this.y, MusicPatch.pointerX, ResourcePreparationEntry.pointerY);
    }

    final static void e(int param0) {
        if (DirectByteStorage.field_f != null) {
          DirectByteStorage.field_f.shutdown();
        }
        if (UnderwaterBackground.field_w != null) {
          UnderwaterBackground.field_w.shutdown();
        }
        if (param0 < 39) {
          TooltipSprite.resendPendingAchievements(-13, -69);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 > -40) {
          return;
        }
        field_n = null;
    }

    final static void d(int param0) {
        if (param0 != 2) {
          textChoiceButtonLineHeight = 90;
        }
        MatchResultScreen.field_s = true;
        ScreenNavigationHelpers.quickChatChannel = 0;
    }

    final static void resendPendingAchievements(int opcode, int obfuscationGuard) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        AchievementSubmission var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != 13330) {
            field_n = (String) null;
          }
          var4 = (AchievementSubmission) (DateFieldsWidget.pendingAchievementSubmissions.first(-37));
          while (var4 != null) {
            LevelSelectScreen.sendAchievementSubmission(opcode, var4, (byte) 80);
            var4 = (AchievementSubmission) (DateFieldsWidget.pendingAchievementSubmissions.next((byte) 116));
          }
          var2 = StrongCacheEntry.pendingAchievementMaskRequests.first(obfuscationGuard ^ -13402);
          while (var2 != null) {
            LabeledWidget.sendAchievementMaskRequest((byte) -85, opcode);
            var2 = StrongCacheEntry.pendingAchievementMaskRequests.next((byte) 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "nq.C(" + opcode + ',' + obfuscationGuard + ')');
        }
    }

    final static BinaryMaskFont loadBinaryMaskFontByName(byte obfuscationGuard, String groupName, ResourceArchive spriteArchive, ResourceArchive metricsArchive, String fileName) {
        int groupId = 0;
        RuntimeException failure = null;
        int fileId = 0;
        BinaryMaskFont guardRejectedFont = null;
        BinaryMaskFont font = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String groupSummary = null;
        StringBuilder spriteContextBuilder = null;
        String spriteArchiveSummary = null;
        StringBuilder metricsContextBuilder = null;
        String metricsArchiveSummary = null;
        StringBuilder fileContextBuilder = null;
        String fileSummary = null;
        RuntimeException caughtFailure = null;
        try {
          groupId = spriteArchive.getGroupId(groupName, false);
          fileId = spriteArchive.getFileId(groupId, -80, fileName);
          if (obfuscationGuard == -37) {
            font = FriendListUi.loadBinaryMaskFont(groupId, metricsArchive, spriteArchive, fileId, (byte) -112);
            return font;
          }
          guardRejectedFont = (BinaryMaskFont) null;
          return guardRejectedFont;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("nq.F(").append(obfuscationGuard).append(',');
          if (groupName == null) {
            groupSummary = "null";
          } else {
            groupSummary = "{...}";
          }
          spriteContextBuilder = ((StringBuilder) (Object) contextBuilder).append(groupSummary).append(',');
          if (spriteArchive == null) {
            spriteArchiveSummary = "null";
          } else {
            spriteArchiveSummary = "{...}";
          }
          metricsContextBuilder = ((StringBuilder) (Object) spriteContextBuilder).append(spriteArchiveSummary).append(',');
          if (metricsArchive == null) {
            metricsArchiveSummary = "null";
          } else {
            metricsArchiveSummary = "{...}";
          }
          fileContextBuilder = ((StringBuilder) (Object) metricsContextBuilder).append(metricsArchiveSummary).append(',');
          if (fileName == null) {
            fileSummary = "null";
          } else {
            fileSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) fileContextBuilder).append(fileSummary).append(')').toString());
        }
    }

    TooltipSprite(int x, int y, RgbSprite sprite, String tooltipText) {
        try {
          this.sprite = sprite;
          this.x = x;
          this.y = y;
          this.tooltipText = tooltipText.toLowerCase();
          this.tooltipWidth = 2 * IntKeyIndex.field_b + PasswordFieldRenderer.field_D.measureText(this.tooltipText);
          this.tooltipHeight = PasswordFieldRenderer.field_D.descent + 2 * BackgroundScene.field_a + PasswordFieldRenderer.field_D.ascent;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "nq.<init>(" + x + ',' + y + ',' + (sprite != null ? "{...}" : "null") + ',' + (tooltipText != null ? "{...}" : "null") + ')');
        }
    }

    final void draw(int obfuscationGuard) {
        this.sprite.drawTransparent(this.x, this.y);
        if (obfuscationGuard != 2) {
          return;
        }
        if (this.hovered) {
          ScrollPaneWithFooter.a(-IntKeyIndex.field_b + MusicPatch.pointerX, -BackgroundScene.field_a + ResourcePreparationEntry.pointerY, this.tooltipHeight, this.tooltipWidth, this.tooltipText, 16777215);
        }
    }

    static {
        field_k = "Join";
        field_n = "Invalid password.";
        field_p = false;
    }
}
