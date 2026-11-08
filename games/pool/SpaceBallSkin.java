/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpaceBallSkin extends BallSkin {
    SpaceBallSkin() {
    }

    final static void buildBlurredIntroSprite(int obfuscationGuard) {
        Sprite var1 = null;
        Sprite var3 = null;
        int var4 = 0;
        try {
          var1 = new Sprite(540, 140);
          int var2 = -31 / ((79 - obfuscationGuard) / 34);
          CueAim.a(62, var1);
          TriangleRasterizer.useRasterClip();
          SoftwareRasterizer.clear();
          LobbyPlayer.field_fc = 0;
          TextHotspotRegion.drawIntroMeshes(-21818);
          var3 = var1.copy();
          for (var4 = 0; 15 > var4; var4++) {
            var3.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          DebugTuningSlider.field_h.bindAsRenderTarget();
          var1.drawHalfSize(0, 0);
          TriangleMesh.a(126);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lm.E(" + obfuscationGuard + ')');
        }
    }

    final void loadTopBarSprites(int param0, ResourceArchive param1) {
        if (param0 != 198123656) {
          return;
        }
        try {
          this.field_e = NameEntryPopup.loadSpritesByName(0, "", param1, "top_bar_balls_space");
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lm.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void sendGameSettings(int operation, int opcode) {
        CipherPacketBuffer var2 = JaggrabDownloader.field_j;
        var2.writeCipheredOpcode(false, opcode);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(operation, false);
        var2.writeByte(HighscoresScreen.field_L.field_Nb, false);
        int var4 = HighscoresScreen.field_L.field_ac + (HighscoresScreen.field_L.field_Yb << 6);
        var2.writeByte(var4, false);
        var2.writeBytes(HighscoresScreen.field_L.settings, (byte) 0, 0, HighscoresScreen.field_L.settings.length);
        var2.writeByteLengthPrefix(-var3 + var2.position, true);
    }

    final void loadBallMeshes(ResourceArchive param0, byte param1) {
        MeshBuilder dupTemp$0 = null;
        MeshBuilder dupTemp$1 = null;
        if (null != this.field_a) {
          return;
        }
        this.field_a = new MeshBuilder[16];
        this.field_a[0] = MeshBuilder.loadFromArchive(param0, "", "balls/SPACE/space_ball_white");
        if (param1 != 117) {
          return;
        }
        try {
          dupTemp$0 = MeshBuilder.loadFromArchive(param0, "", "balls/SPACE/space_ball_01");
          this.field_a[7] = dupTemp$0;
          this.field_a[6] = dupTemp$0;
          this.field_a[5] = dupTemp$0;
          this.field_a[4] = dupTemp$0;
          this.field_a[3] = dupTemp$0;
          this.field_a[2] = dupTemp$0;
          this.field_a[1] = dupTemp$0;
          this.field_a[8] = MeshBuilder.loadFromArchive(param0, "", "balls/SPACE/space_ball_black");
          dupTemp$1 = MeshBuilder.loadFromArchive(param0, "", "balls/SPACE/space_ball_02");
          this.field_a[15] = dupTemp$1;
          this.field_a[14] = dupTemp$1;
          this.field_a[13] = dupTemp$1;
          this.field_a[12] = dupTemp$1;
          this.field_a[11] = dupTemp$1;
          this.field_a[10] = dupTemp$1;
          this.field_a[9] = dupTemp$1;
          this.field_a[0].scaleVertices(8, 8, 8, 8);
          this.field_a[1].scaleVertices(8, 8, 8, 8);
          this.field_a[8].scaleVertices(8, 8, 8, 8);
          this.field_a[9].scaleVertices(8, 8, 8, 8);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lm.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String groupName(byte param0, int param1) {
        if (param0 >= 9) {
          return param1 == 0 ? BirthDateValidator.ballsetSpaceGroup0 : TransformRotationSupport.field_g;
        }
        String var4 = (String) null;
        SpaceBallSkin.layoutChatCompositionPanel(-24, 10, -99, 68, -80, 113, (String) null, 109, 92);
        return param1 == 0 ? BirthDateValidator.ballsetSpaceGroup0 : TransformRotationSupport.field_g;
    }

    final static void layoutChatCompositionPanel(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        IntrusiveNode.field_e.text = param6;
        if (CookieDateSupport.field_b != 2) {
          ReflectionReplySupport.field_g.text = SlidingPanelSupport.escCancelthisline;
        } else {
          ReflectionReplySupport.field_g.text = IsaacCipher.escCancelprivatemessage;
        }
        if (param3 != 4) {
          return;
        }
        try {
          var9_int = 495;
          var10 = 5;
          Cp1252CharacterSupport.field_c.setBounds(var10, param3 ^ 2147483643, 5, var9_int - 10, param7);
          TimeTrialSelectScreen.field_J.setBounds(0, param3 + 2147483643, 0, -NineBallRules.field_j.width + Cp1252CharacterSupport.field_c.width, param7);
          var10 = var10 + (param1 + param7);
          NineBallRules.field_j.setBounds(0, 2147483647, TimeTrialSelectScreen.field_J.width, NineBallRules.field_j.width, param7);
          OptionsScreen.field_L.setBounds(var10, 2147483647, 5, OptionsScreen.field_L.getContentWidth(true), param8);
          var11 = ReflectionReplySupport.field_g.getContentWidth(true);
          ReflectionReplySupport.field_g.setBounds(var10, 2147483647, -var11 + var9_int - 5, var11, param8);
          var12 = param8 + var10 + 5;
          IntrusiveNode.field_e.setBounds(0, param3 ^ 2147483643, 0, var9_int, param2);
          LoginMethod.field_e.setBounds(param2, param3 ^ 2147483643, 0, var9_int, var12);
          var12 = var12 + param2;
          LoginMethod.field_e.frameSprites = NineSliceFrameSupport.buildNineSliceFrameSprites(32450, 3, 2105376, LoginMethod.field_e.height, 11579568, 8421504);
          Bzip2DecoderState.field_D.setBounds(-(var12 / 2) + param4, 2147483647, param5 - var9_int / 2, var9_int, var12);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lm.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static QuickChatDynamicCommand[] getDynamicCommands(byte obfuscationGuard) {
        if (obfuscationGuard == -32) {
          return new QuickChatDynamicCommand[]{ArchiveRequest.field_G, DimmedPauseMenu.field_N, TranslatedUiText.field_g, CacheEntry.field_A, QuaternionRotationSupport.field_c, CueStick.field_i, Js5Transport.field_g, ScrollPane.field_Tb, TransformSupport.field_d, WidgetStyleLayer.field_e, Ball.field_J, WidgetContainer.field_K, AchievementNotice.field_r, ChatMessage.field_k};
        }
        return (QuickChatDynamicCommand[]) null;
    }

    final int ballColor(int param0, boolean param1) {
        int var3;
        int var4;
        ResourceArchive var5;
        int var3Lifetime1;
        var4 = Pool.field_O;
        if (param1) {
          var3 = param0;
          if (var3 == 0) {
            return 13421772;
          }
          if (var3 == 1) {
            return this.themeColorForGroup(0, (byte) -108);
          }
          if (var3 == 2) {
            return this.themeColorForGroup(0, (byte) -108);
          }
          if (var3 == 3) {
            return this.themeColorForGroup(0, (byte) -108);
          }
          if (4 == var3) {
            return this.themeColorForGroup(0, (byte) -108);
          }
          if (var3 == 5) {
            return this.themeColorForGroup(0, (byte) -108);
          }
          if (var3 == 6) {
            return this.themeColorForGroup(0, (byte) -108);
          }
          if (7 == var3) {
            return this.themeColorForGroup(0, (byte) -108);
          }
          if (var3 == 8) {
            return 3355443;
          }
          if (9 == var3) {
            return this.themeColorForGroup(1, (byte) -108);
          }
          if (var3 == 10) {
            return this.themeColorForGroup(1, (byte) -108);
          }
          if (var3 == 11) {
            return this.themeColorForGroup(1, (byte) -108);
          }
          if (var3 == 12) {
            return this.themeColorForGroup(1, (byte) -108);
          }
          if (13 == var3) {
            return this.themeColorForGroup(1, (byte) -108);
          }
          if (var3 == 14) {
            return this.themeColorForGroup(1, (byte) -108);
          }
          if (var3 != 15) {
            return 16711935;
          }
          return this.themeColorForGroup(1, (byte) -108);
        }
        var5 = (ResourceArchive) null;
        this.loadBallMeshes((ResourceArchive) null, (byte) -106);
        var3Lifetime1 = param0;
        if (var3Lifetime1 == 0) {
          return 13421772;
        }
        if (var3Lifetime1 == 1) {
          return this.themeColorForGroup(0, (byte) -108);
        }
        if (var3Lifetime1 == 2) {
          return this.themeColorForGroup(0, (byte) -108);
        }
        if (var3Lifetime1 == 3) {
          return this.themeColorForGroup(0, (byte) -108);
        }
        if (4 == var3Lifetime1) {
          return this.themeColorForGroup(0, (byte) -108);
        }
        if (var3Lifetime1 == 5) {
          return this.themeColorForGroup(0, (byte) -108);
        }
        if (var3Lifetime1 == 6) {
          return this.themeColorForGroup(0, (byte) -108);
        }
        if (7 == var3Lifetime1) {
          return this.themeColorForGroup(0, (byte) -108);
        }
        if (var3Lifetime1 == 8) {
          return 3355443;
        }
        if (9 == var3Lifetime1) {
          return this.themeColorForGroup(1, (byte) -108);
        }
        if (var3Lifetime1 == 10) {
          return this.themeColorForGroup(1, (byte) -108);
        }
        if (var3Lifetime1 == 11) {
          return this.themeColorForGroup(1, (byte) -108);
        }
        if (var3Lifetime1 == 12) {
          return this.themeColorForGroup(1, (byte) -108);
        }
        if (13 == var3Lifetime1) {
          return this.themeColorForGroup(1, (byte) -108);
        }
        if (var3Lifetime1 == 14) {
          return this.themeColorForGroup(1, (byte) -108);
        }
        if (var3Lifetime1 == 15) {
          return this.themeColorForGroup(1, (byte) -108);
        }
        return 16711935;
    }

    final boolean usesNumberedBallLabels(int obfuscationGuard) {
        if (obfuscationGuard != 2) {
          return true;
        }
        return false;
    }

    private final int themeColorForGroup(int param0, byte param1) {
        if (param1 != -108) {
          return -14;
        }
        if (param0 != 0) {
          if (param0 == 1) {
            return 10066329;
          }
          return 16777215;
        }
        return 6697745;
    }

    static {
    }
}
