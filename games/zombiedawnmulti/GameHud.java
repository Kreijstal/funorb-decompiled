/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameHud {
    static int field_g;
    private int field_h;
    private int field_m;
    static DisplayNamePanel field_e;
    static int[] field_o;
    private boolean field_p;
    static UiComponent field_q;
    static int field_f;
    private int field_a;
    static UiComponent field_k;
    private int field_d;
    private PaletteBitmapFont field_i;
    private int field_l;
    private boolean field_j;
    private boolean field_b;
    private int field_c;
    float field_n;

    private final String formatScoreText(int param0, int param1) {
        if (param1 <= 88) {
          GameHud.showEmbeddedLoginForm((byte) 111);
        }
        return QueuedListRequest.substituteTemplateArguments(AudioServiceHelpers.field_d, new String[]{Integer.toString(param0)}, 2);
    }

    final void tick(int param0, boolean param1) {
        if (this.field_p) {
          if (this.field_a > this.field_d) {
            this.field_d = this.field_d + 1;
          } else {
            if (this.field_a < this.field_d) {
              this.field_d = this.field_a;
            }
          }
        }
        if (this.field_j &&
          !this.allHumansAccountedFor((byte) 107) &&
          !this.hasNoCharacters(-24258) &&
          !this.isTimerExpired(-21991)) {
          this.field_l = this.field_l - 1;
        }
        if (1.0f != this.field_n) {
          this.field_n = this.field_n + -0.029999999329447746f;
          if (1.0f >= this.field_n) {
            this.field_n = 1.0f;
          }
        }
        if (this.field_l > 2950 &&
          this.field_l % 1500 == 49) {
          this.field_n = 2.0f;
        }
        if (param1) {
          return;
        }
        if (this.field_l > 0 &&
          1550 >= this.field_l &&
          49 == this.field_l % 50) {
          this.field_n = 2.0f;
          Camera.createMixerStream(-127, 47);
        }
        if (this.field_j) {
          if (1.0f < this.field_n) {
            this.renderTimerLabel(110);
          } else {
            if (49 == this.field_l % 50) {
              this.renderTimerLabel(110);
            }
          }
        }
        if (param0 != this.field_c) {
          this.renderScoreLabel(param0, 2394342);
          this.field_c = param0;
        }
        SocketConnector.field_h.bindRaster((byte) 127);
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_q = null;
        field_k = null;
        field_o = null;
        if (param0 != 7) {
          field_g = -66;
        }
    }

    final static String getPendingUrl(int param0) {
        if (param0 != 6958) {
          GameHud.showEmbeddedLoginForm((byte) 103);
        }
        return HudSpriteStore.field_a;
    }

    final static void loadCommonUiResources(ResourceArchive param0, int param1, ResourceArchive param2, ResourceArchive param3) {
        Sprite var17 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        IndexedSprite[] var14 = null;
        int var11_int = 0;
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = ZombieDawnMulti.field_E ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          ContextMenu.field_Nb = EffectAudioHelpers.loadSpritesByName("commonui", param2, -256, "frame_top");
          LobbyGame.field_Hb = EffectAudioHelpers.loadSpritesByName("commonui", param2, -256, "frame_bottom");
          TextWidgetPainter.field_e = ByteArrayPool.loadSpriteByName("commonui", "jagex_logo_grey", param2, 11091);
          MeltdownPuddleCell.field_k = EffectAudioHelpers.loadSpritesByName("commonui", param2, -256, "button");
          RubbleChunk.field_I = CachedArchiveSource.loadSpriteSheetByName(true, "validation", param2, "commonui");
          DisplayNamePanel.field_H = (BitmapFont) ((Object) IntroScreen.loadNamedSprite((byte) -46, "commonui", "arezzo12", param0, param2));
          FontPaletteHelpers.field_h = (BitmapFont) ((Object) IntroScreen.loadNamedSprite((byte) -46, "commonui", "arezzo14", param0, param2));
          LevelFileList.field_d = (BitmapFont) ((Object) IntroScreen.loadNamedSprite((byte) -46, "commonui", "arezzo14bold", param0, param2));
          var17 = new Sprite(param3.getNamedFile("button.gif", "", false), (java.awt.Component) ((Object) NameEntryPopup.field_Ib));
          MenuStyleHelpers.loadSpriteSheetByName(-121, "commonui", param2, "dropdown");
          var5 = InflaterDecompressor.loadIndexedSpritesByName("screen_options", param2, (byte) 19, "commonui");
          RandomAccessCacheFile.field_h = new IndexedSprite[4];
          BitPackedArrayHelpers.field_a = new IndexedSprite[4];
          AlignedIconLabel.field_Ob = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{BitPackedArrayHelpers.field_a, AlignedIconLabel.field_Ob, RandomAccessCacheFile.field_h};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].palette;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].pixelIndices[0];
          if (param1 != -8995) {
            GameHud.resetTooltipState(69);
          }
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            IndexedSprite[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = ZombieDetonation.copyWithPalette(96, var19[var11_int], var5[var9]);
            }
          }
          var9Lifetime1 = var17.height;
          PasswordTextPainter.pushRasterState(540);
          var17.bindAsRenderTarget();
          SoftwareRasterizer.desaturateRect(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.bindAsRenderTarget();
          var17.drawOpaque(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.bindAsRenderTarget();
          var17.drawOpaque(var9Lifetime1 - var17.width, 0);
          var12 = new Sprite(-(var9Lifetime1 * 2) + var17.width, var9Lifetime1);
          var12.bindAsRenderTarget();
          var17.drawOpaque(-var9Lifetime1, 0);
          RasterStackHelpers.popRaster(true);
          MeltdownPuddleCell.field_k = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qe.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isTimerExpired(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -21991) {
          this.field_b = false;
        }
        stackIn_6_0 = (this.field_j) && (this.field_l <= 0);
        return stackIn_6_0;
    }

    final void stopTimer(int param0) {
        this.field_j = false;
        if (param0 != 0) {
          this.field_p = true;
        }
    }

    final void draw(int param0) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!FadingDialog.field_I &&
          this.field_j &&
          this.field_l > 0) {
          RasterEffectHelpers.darkenUnderSprite(PhantomDecoy.field_F[5], 430, 40);
          HudSpriteStore.field_e[5].drawTransparent(430, 40);
        }
        SoftwareRasterizer.fillRect(0, 440, 640, 40, 0);
        RasterEffectHelpers.darkenUnderSprite(PhantomDecoy.field_F[0], 0, 410);
        HudSpriteStore.field_e[0].drawTransparent(5, 415);
        RasterEffectHelpers.darkenUnderSprite(PhantomDecoy.field_F[2], 70, 400);
        HudSpriteStore.field_e[2].drawTransparent(70, 400);
        GameWorld var5 = PortalEntryEvent.field_m;
        if (2 <= FriendListHelpers.field_q) {
          MatchingTextValidator.field_w.drawLeft("L" + var5.field_r, 12, 468, 16777215, 1);
        }
        RasterEffectHelpers.pushRasterState();
        SoftwareRasterizer.setClip(0, 0, 640, 40);
        SoftwareRasterizer.fillRect(0, 0, 640, 40, 0);
        for (var3 = 0; var5.teamCount > var3; var3++) {
          this.drawTeamScorePanel((byte) -126, var3);
        }
        if (param0 != -27635) {
          this.field_n = 0.8482644557952881f;
        }
        RasterEffectHelpers.popRasterState();
    }

    private final void drawTeamScorePanel(byte param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int var4;
        int var5;
        int var7;
        int var8;
        BinaryBitmapFont var9;
        int var10;
        int var11;
        int var12;
        int var13;
        Sprite var14;
        String var16;
        String var17;
        GameWorld var18;
        GameWorld var19;
        String var21;
        String var22;
        int[] var25;
        var18 = PortalEntryEvent.field_m;
        var19 = var18;
        stackIn_3_0 = (0 == (1 << param1 & var19.field_F)) ? 0 : 1;
        var4 = stackIn_3_0;
        var5 = var18.teamScores[param1];
        var25 = PortalEntryEvent.field_m.field_D[param1];
        stackIn_6_0 = (param1 != PowerupButton.field_e.localTeam) ? 0 : 1;
        var7 = stackIn_6_0;
        var8 = var25[0];
        var9 = MatchingTextValidator.field_w;
        var10 = 160;
        var11 = param1 * var10;
        var12 = 20;
        var13 = var10 + var11;
        SoftwareRasterizer.fillRectGradient(var11, 0, -var11 + var13, 38, 65793, 1981188);
        SoftwareRasterizer.drawVerticalLine(var13, 0, 38, 3102221);
        var14 = TeamSpriteHelpers.createTeamColouredSprite(0, var18.field_D[param1][1], 0, 1, var18.field_D[param1][0]);
        var14.drawTransparent(var11, -1 + (-24 + var12));
        var21 = var18.field_b[param1];
        var22 = BitmapFont.truncateText(var9, var21, -2 + var10 - 48);
        ((BitmapFont) ((Object) var9)).drawLeft(var22, 48 + var11, var12, var8, 0);
        if (var4 == 0) {
          if (var19.phase != 1 &&
            var19.phase != 0 &&
            var7 == 0) {
            var16 = ChatPanelSetupHelpers.field_e;
            var17 = QuickChatCategoryDefinition.field_C;
          } else {
            var16 = QueuedListRequest.substituteTemplateArguments(QuickChatCategoryDefinition.field_q, new String[]{Integer.toString(var18.teamCharacterCounts[param1])}, 2);
            var17 = QueuedListRequest.substituteTemplateArguments(AccountTextGlobals.field_b, new String[]{Integer.toString(var5)}, param0 ^ -128);
          }
          ((BitmapFont) ((Object) var9)).drawLeft(var16, var11 + 48, 3 + (((BitmapFont) ((Object) var9)).baselineHeight + var12), var8, 0);
          ((BitmapFont) ((Object) var9)).drawRightAligned(var17, var13, var12 + ((BitmapFont) ((Object) var9)).baselineHeight + 3, 16777215, 0);
        }
        SoftwareRasterizer.drawHorizontalLine(var11, 38, 1 + var13, 2763045);
        SoftwareRasterizer.drawHorizontalLine(var11, 39, var13 + 1, 2763045);
        if (var4 != 0) {
          SoftwareRasterizer.fillRectAlpha(var11, 0, var13 - var11, 38, 65793, 196);
          ((BitmapFont) ((Object) var9)).drawParagraph(QueuedListRequest.substituteTemplateArguments(MoveOrderMarker.field_i, new String[]{var18.field_b[param1]}, 2), var11, 0, var13 - var11, 40, 16777215, 1, 1, 1, 0);
        }
        if (param0 != -126) {
          this.field_c = -89;
        }
    }

    private final void renderCharacterCountLabel(boolean param0) {
        RasterEffectHelpers.pushRasterState();
        HudSpriteStore.field_e[3].bindAsRenderTarget();
        if (param0) {
          return;
        }
        SoftwareRasterizer.clear();
        this.field_i.drawRightAligned(Integer.toString(this.field_h), -5 + SoftwareRasterizer.width, 5 + this.field_i.maxAscent, 1, 65793);
        PhantomDecoy.field_F[3].bindAsRenderTarget();
        SoftwareRasterizer.clear();
        HudSpriteStore.field_e[3].drawSilhouette(0, 0, 16777215);
        FightEvent.blurScreen((byte) -18);
        HudSpriteStore.field_e[3].drawSilhouette(0, 0, 0);
        RasterEffectHelpers.popRasterState();
    }

    private final void renderScoreLabel(int param0, int param1) {
        RasterEffectHelpers.pushRasterState();
        HudSpriteStore.field_e[4].bindAsRenderTarget();
        SoftwareRasterizer.clear();
        this.field_i.drawRightAligned(this.formatScoreText(param0, 98), SoftwareRasterizer.width - 5, 5 + this.field_i.maxAscent, 3, -1);
        if (param1 != 2394342) {
          return;
        }
        PhantomDecoy.field_F[4].bindAsRenderTarget();
        SoftwareRasterizer.clear();
        HudSpriteStore.field_e[4].drawSilhouette(0, 0, 16777215);
        FightEvent.blurScreen((byte) -18);
        HudSpriteStore.field_e[4].drawSilhouette(0, 0, 0);
        RasterEffectHelpers.popRasterState();
    }

    final static void resetTooltipState(int param0) {
        RasterBuffer.field_a = param0;
        ProgramNoteUsage.field_k = null;
        ClockAndScreenHelpers.field_c = -1;
        AccountCreationDialog.field_Db = -1;
        PowerupProgressCard.field_l = false;
    }

    private final void renderRemainingLabel(byte param0) {
        RasterEffectHelpers.pushRasterState();
        HudSpriteStore.field_e[6].bindAsRenderTarget();
        SoftwareRasterizer.clear();
        this.field_i.drawCentered(QueuedListRequest.substituteTemplateArguments(PendingIntArrayReply.field_g, new String[]{Integer.toString(this.field_m), Integer.toString(this.field_m + this.field_h)}, 2), SoftwareRasterizer.width / 2, 5 + this.field_i.maxAscent, 2, 65793);
        PhantomDecoy.field_F[6].bindAsRenderTarget();
        SoftwareRasterizer.clear();
        if (param0 != 30) {
          this.stopTimer(-19);
        }
        HudSpriteStore.field_e[6].drawSilhouette(0, 0, 16777215);
        FightEvent.blurScreen((byte) -18);
        HudSpriteStore.field_e[6].drawSilhouette(0, 0, 0);
        RasterEffectHelpers.popRasterState();
    }

    final boolean allHumansAccountedFor(byte param0) {
        int var2 = -83 % ((-11 - param0) / 40);
        return PowerupButton.field_e.field_j <= PowerupButton.field_e.field_Y ? true : false;
    }

    private final void renderTimerLabel(int param0) {
        int var3 = 0;
        int var4 = 0;
        RasterEffectHelpers.pushRasterState();
        if (param0 <= 100) {
          this.tick(-96, false);
        }
        int var2 = -1;
        if (this.field_n != 1.0f) {
          StrongCacheEntry.field_D.bindAsRenderTarget();
          SoftwareRasterizer.clear();
          this.field_i.drawRightAligned(this.formatTimer((byte) 51), -5 + SoftwareRasterizer.width, this.field_i.maxAscent + 5, 2, var2);
          var3 = (int)((float)SoftwareRasterizer.width * this.field_n);
          var4 = (int)((float)SoftwareRasterizer.height * this.field_n);
          HudSpriteStore.field_e[5].bindAsRenderTarget();
          SoftwareRasterizer.clear();
          StrongCacheEntry.field_D.drawScaled(SoftwareRasterizer.width - var3, 0, var3, var4);
        } else {
          HudSpriteStore.field_e[5].bindAsRenderTarget();
          SoftwareRasterizer.clear();
          this.field_i.drawRightAligned(this.formatTimer((byte) -51), SoftwareRasterizer.width - 5, this.field_i.maxAscent + 5, 0, var2);
        }
        PhantomDecoy.field_F[5].bindAsRenderTarget();
        SoftwareRasterizer.clear();
        HudSpriteStore.field_e[5].drawSilhouette(0, 0, 16777215);
        FightEvent.blurScreen((byte) -18);
        HudSpriteStore.field_e[5].drawSilhouette(0, 0, 0);
        RasterEffectHelpers.popRasterState();
    }

    final void startTimer(byte param0, int param1) {
        if (3050 < param1) {
          this.field_j = false;
          return;
        }
        this.field_l = param1;
        if (!this.field_j) {
          this.renderTimerLabel(102);
        }
        if (param0 < 89) {
          field_o = (int[]) null;
        }
        this.field_j = true;
    }

    final void refreshCounts(int param0) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_h = 0;
        if (param0 != 2) {
          this.field_j = false;
        }
        IntrusiveNode var2 = PowerupButton.field_e.sceneObjects.last(83);
        while (var2 instanceof SceneObject) {
          if (var2 instanceof GameCharacter) {
            this.field_h = this.field_h + 1;
          }
          var2 = var2.previous;
        }
        this.renderPortalCountLabel(430);
        this.renderCharacterCountLabel(false);
        if (this.field_b) {
          this.renderRemainingLabel((byte) 30);
        }
        SocketConnector.field_h.bindRaster((byte) 103);
    }

    final static String decodeText(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -2739) {
            stackIn_4_0 = TextDecodeHelpers.decodeSingleByteText(param1.length, param1, false, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qe.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final boolean hasNoCharacters(int param0) {
        if (param0 != -24258) {
          GameHud.getPendingUrl(-48);
        }
        return this.field_h <= 0 ? true : false;
    }

    final static void drawSortedShadedTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param15 <= 11) {
          return;
        }
        if (param8 < param12) {
          if (param12 >= param5) {
            if (param8 >= param5) {
              TextInputValidator.fillGouraudTriangle(SoftwareRasterizer.pixels, param13, param1, -10423, param12, param0, param9, param8, param2, param5, param6, param7, param14, param4, param3, param11, param10);
            } else {
              TextInputValidator.fillGouraudTriangle(SoftwareRasterizer.pixels, param13, param4, -10423, param12, param2, param3, param5, param0, param8, param6, param14, param7, param1, param9, param11, param10);
            }
          } else {
            TextInputValidator.fillGouraudTriangle(SoftwareRasterizer.pixels, param7, param6, -10423, param5, param2, param3, param12, param11, param8, param4, param14, param13, param1, param10, param0, param9);
          }
        } else {
          if (param8 < param5) {
            TextInputValidator.fillGouraudTriangle(SoftwareRasterizer.pixels, param7, param1, -10423, param5, param11, param10, param8, param2, param12, param4, param13, param14, param6, param3, param0, param9);
          } else {
            if (param12 >= param5) {
              TextInputValidator.fillGouraudTriangle(SoftwareRasterizer.pixels, param14, param6, -10423, param8, param0, param9, param12, param11, param5, param1, param7, param13, param4, param10, param2, param3);
            } else {
              TextInputValidator.fillGouraudTriangle(SoftwareRasterizer.pixels, param14, param4, -10423, param8, param11, param10, param5, param0, param12, param1, param13, param7, param6, param9, param2, param3);
            }
          }
        }
    }

    final static void showEmbeddedLoginForm(byte param0) {
        int var1 = -58 % ((param0 - 45) / 56);
        String var2 = (String) null;
        PowerupProgressCard.showLoginForm((String) null, 32, "");
    }

    private final void renderPortalCountLabel(int param0) {
        RasterEffectHelpers.pushRasterState();
        HudSpriteStore.field_e[2].bindAsRenderTarget();
        if (param0 != 430) {
          this.renderScoreLabel(-1, -30);
        }
        SoftwareRasterizer.clear();
        int var2 = PortalEntryEvent.field_m.field_I;
        int var3 = PortalEntryEvent.field_m.field_g;
        if (99 < var2) {
          this.field_i.drawLeft("/" + var2, 22, 2 * this.field_i.maxAscent + 6, 2, 65793);
          this.field_i.drawLeft(Integer.toString(var3), 15, this.field_i.maxAscent + 6, 2, 65793);
        } else {
          this.field_i.drawLeft(var3 + "/" + var2, 20, -3 + 2 * this.field_i.maxAscent, 2, 65793);
        }
        PhantomDecoy.field_F[2].bindAsRenderTarget();
        SoftwareRasterizer.clear();
        HudSpriteStore.field_e[2].drawSilhouette(0, 0, 16777215);
        FightEvent.blurScreen((byte) -18);
        HudSpriteStore.field_e[2].drawSilhouette(0, 0, 0);
        RasterEffectHelpers.popRasterState();
    }

    private final String formatTimer(byte param0) {
        int var2 = this.field_l / 3000;
        int var4 = 78 / ((param0 - 10) / 33);
        int var3 = this.field_l % 3000 / 50;
        if (var3 < 0) {
          var3 = 0;
        }
        return var2 + ":" + (10 <= var3 ? "" : "0") + var3;
    }

    GameHud() {
        this.field_p = false;
        this.field_m = 0;
        this.field_h = 0;
        this.field_l = 0;
        this.field_b = false;
        this.field_c = 0;
        this.field_a = 80;
        this.field_j = true;
        this.field_d = 0;
        this.field_n = 1.0f;
        this.field_i = TranslatedUiText.field_e;
        this.renderTimerLabel(112);
        this.renderScoreLabel(this.field_c, 2394342);
        this.refreshCounts(2);
        SocketConnector.field_h.bindRaster((byte) 102);
    }

    final static byte[] readRootTextFile(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -121) {
            stackIn_4_0 = LoginMethod.field_b.getNamedFile("", param1, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qe.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_o = new int[8192];
    }
}
