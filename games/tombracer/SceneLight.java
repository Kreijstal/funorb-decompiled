/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SceneLight extends IntrusiveNode {
    float intensity;
    static int field_i;
    int radius;
    static SpriteData field_n;
    int z;
    int y;
    static String field_f;
    int x;
    int colour;

    abstract void setRadius(byte param0, int param1);

    public static void releaseStatics(boolean param0) {
        field_f = null;
        field_n = null;
        if (param0) {
          field_f = (String) null;
        }
    }

    final int getZ(byte param0) {
        if (param0 != 11) {
          this.intensity = -0.5366194248199463f;
        }
        return this.z;
    }

    abstract void setIntensity(byte param0, float param1);

    final static void createGameToolkitSprites(GraphicsToolkit param0, int param1) {
        int[] var13 = null;
        int[] var12 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var2_int = 0;
        int var11 = TombRacer.field_G ? 1 : 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        WhiteLightShooterComponent.field_K = su.createToolkitSprite(ArrayWidgetGroup.field_v, param0, (byte) 127);
        Room.field_p = new ToolkitSprite[6][];
        if (param1 != 17186) {
          return;
        }
        try {
          for (var2_int = 0; var2_int < 6; var2_int++) {
            Room.field_p[var2_int] = LoadLevelCommand.createToolkitSprites(param0, eta.field_a[var2_int], -82);
          }
          WidgetStyleLayer.field_k = new ToolkitSprite[6];
          HardwareSpecularEffect.field_h = new ToolkitSprite[6];
          for (var2_intLifetime1 = 0; var2_intLifetime1 < 6; var2_intLifetime1++) {
            WidgetStyleLayer.field_k[var2_intLifetime1] = su.createToolkitSprite(ColourFillOperator.field_p[var2_intLifetime1], param0, (byte) -68);
            ColourFillOperator.field_p[var2_intLifetime1].flipHorizontally();
            HardwareSpecularEffect.field_h[var2_intLifetime1] = su.createToolkitSprite(ColourFillOperator.field_p[var2_intLifetime1], param0, (byte) 125);
            ColourFillOperator.field_p[var2_intLifetime1].flipHorizontally();
          }
          IntArrayRequest.field_h = su.createToolkitSprite(dna.field_F, param0, (byte) 127);
          ArchiveSource.field_a = LoadLevelCommand.createToolkitSprites(param0, RoundWinnerPhase.field_p, -79);
          RasterStateFrame.field_i = su.createToolkitSprite(ara.field_vb, param0, (byte) -20);
          ColourFillOperator.field_m = su.createToolkitSprite(OpenGlDisplayLists.field_g, param0, (byte) -99);
          CachedTextLayout.field_l = su.createToolkitSprite(CharacterChoice.field_c, param0, (byte) 25);
          lh.field_b = su.createToolkitSprite(LegacyOpenGlTexture3D.field_l, param0, (byte) 127);
          vua.field_A = su.createToolkitSprite(wj.field_a, param0, (byte) 126);
          dn.field_d = LoadLevelCommand.createToolkitSprites(param0, ProxySocketConnector.field_e, -100);
          PlayerProfile.field_r = LoadLevelCommand.createToolkitSprites(param0, FullscreenCanvas.field_a, param1 ^ -17261);
          bm.field_f = LoadLevelCommand.createToolkitSprites(param0, Transform3D.field_d, -112);
          ega.field_e = su.createToolkitSprite(OpenGlIndexArray.field_i, param0, (byte) 126);
          ContextMenuRow.field_wb = su.createToolkitSprite(LoadingStep.field_a, param0, (byte) 127);
          GridWidgetContainer.field_y = LoadLevelCommand.createToolkitSprites(param0, LoadingStepList.field_c, -104);
          PlayerInputQueue.field_a = su.createToolkitSprite(FleeLocomotor.field_C, param0, (byte) 127);
          SinglePlayerCourseGenerator.field_h = LoadLevelCommand.createToolkitSprites(param0, MonochromeRowCacheEntry.field_f, -70);
          PerlinNoise2D.field_m = LoadLevelCommand.createToolkitSprites(param0, WidgetStyleLayer.field_f, -77);
          su.createToolkitSprite(MatchStatistics.field_g, param0, (byte) 126);
          GraphicsHeap.field_g = su.createToolkitSprite(TextResourceLoader.field_b, param0, (byte) -50);
          VariantMask.field_d = su.createToolkitSprite(sla.field_a, param0, (byte) -38);
          rm.field_c = su.createToolkitSprite(SocketArchiveNetworkClient.field_s, param0, (byte) 126);
          CharacterSelectPhase.field_r = su.createToolkitSprite(aa.field_a, param0, (byte) 125);
          DropdownPopupList.field_E = su.createToolkitSprite(pha.field_Bb, param0, (byte) -119);
          eu.field_a = su.createToolkitSprite(ConstrainToRectangleLocomotor.field_t, param0, (byte) -5);
          CharacterChoiceFactory.field_a = su.createToolkitSprite(MatchScreen.field_q, param0, (byte) 28);
          ConsoleWindow.field_d = su.createToolkitSprite(TimeSwitchBehaviour.field_n, param0, (byte) 127);
          OpenGlFramebuffer.field_i = LoadLevelCommand.createToolkitSprites(param0, WallCrusherComponent.field_F, -67);
          FloatPacketBuffer.field_k = new ToolkitSprite[OpenGlFramebuffer.field_i.length];
          for (var2_intLifetime2 = 0; OpenGlFramebuffer.field_i.length > var2_intLifetime2; var2_intLifetime2++) {
            var13 = WallCrusherComponent.field_F[var2_intLifetime2].getArgbPixels();
            var12 = var13;
            var3 = var12;
            for (var4 = 0; var13.length > var4; var4++) {
              var5 = var13[var4] >> 24 & 255;
              var6 = var13[var4] & 255;
              var7 = (65319 & var13[var4]) >> 8;
              var8 = (var13[var4] & 16752521) >> 16;
              var9 = (int)(0.3 * (double)var8 + (0.59 * (double)var7 + 0.11 * (double)var6));
              var10 = var9 + ((var9 << 16) + (var9 << 8));
              var3[var4] = WallTile.bitwiseOr(var5 << 24, var10);
            }
            FloatPacketBuffer.field_k[var2_intLifetime2] = param0.createSpriteCopy(var3, OpenGlFramebuffer.field_i[var2_intLifetime2].height(), 89, OpenGlFramebuffer.field_i[var2_intLifetime2].width(), OpenGlFramebuffer.field_i[var2_intLifetime2].width(), 0);
          }
          bsa.field_i = su.createToolkitSprite(LegacyOpenGlCubeTexture.field_l, param0, (byte) -107);
          fa.field_a = LoadLevelCommand.createToolkitSprites(param0, AnimationFrameBase.field_k, -99);
          nc.field_e = su.createToolkitSprite(hka.field_c, param0, (byte) -15);
          LegacyOpenGlEffectManager.field_a = su.createToolkitSprite(LegacyOpenGlSpriteTexture.field_u, param0, (byte) 125);
          su.createToolkitSprite(mp.field_d, param0, (byte) 126);
          su.createToolkitSprite(baa.field_g, param0, (byte) -43);
          ConstantEffectBehaviour.field_q = su.createToolkitSprite(FullscreenConfirmationDialog.field_O, param0, (byte) 126);
          MessageDialog.field_X = su.createToolkitSprite(WaveformOperator.field_q, param0, (byte) 125);
          su.createToolkitSprite(field_n, param0, (byte) 125);
          HardwareModelIndexData.field_f = su.createToolkitSprite(vua.field_y, param0, (byte) 127);
          eca.field_c = LoadLevelCommand.createToolkitSprites(param0, Effect.field_e, -64);
          OpenGlIndexArray.field_l = su.createToolkitSprite(AnimationFrameSet.field_l, param0, (byte) 127);
          su.createToolkitSprite(MirrorComponent.field_F, param0, (byte) -2);
          gca.field_a = su.createToolkitSprite(CharacterPreview.field_f, param0, (byte) 126);
          WidgetStyleLayer.field_b = LoadLevelCommand.createToolkitSprites(param0, StandingsPhase.field_o, param1 - 17309);
          IntrusiveDeque.field_c = su.createToolkitSprite(MenuInputState.field_j, param0, (byte) -95);
          tka.field_p = su.createToolkitSprite(LobbyGameWidget.field_Db, param0, (byte) 27);
          Projectile.field_n = su.createToolkitSprite(RenderableNode.field_j, param0, (byte) -37);
          TripBeamBehaviour.field_y = su.createToolkitSprite(ResourceArchive.field_h, param0, (byte) 127);
          haa.field_z = su.createToolkitSprite(re.field_a, param0, (byte) 126);
          aq.field_a = LoadLevelCommand.createToolkitSprites(param0, mna.field_c, -55);
          MirrorBehaviour.field_r = su.createToolkitSprite(SoundEvent.field_h, param0, (byte) 127);
          OpenGlEnvironmentWaterEffect.field_d = SweepRotateLocomotor.createSpriteFromImage(param0, (byte) -105, haa.field_A.field_f);
          Room.field_j = SweepRotateLocomotor.createSpriteFromImage(param0, (byte) -104, du.field_c.field_f);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ob.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getColour(int param0) {
        if (param0 > -111) {
          field_i = -124;
        }
        return this.colour;
    }

    abstract void setColour(int param0, int param1);

    final int getRadius(byte param0) {
        int var2 = 76 / ((param0 - 31) / 54);
        return this.radius;
    }

    final int getX(int param0) {
        if (param0 != 13437) {
          return 104;
        }
        return this.x;
    }

    abstract void setPosition(int param0, int param1, byte param2, int param3);

    SceneLight(int param0, int param1, int param2, int param3, int param4, float param5) {
        this.y = param1;
        this.x = param0;
        this.z = param2;
        this.intensity = param5;
        this.colour = param4;
        this.radius = param3;
    }

    final float getIntensity(int param0) {
        if (param0 != 0) {
          return -0.41912034153938293f;
        }
        return this.intensity;
    }

    final int getY(int param0) {
        if (param0 != 19848) {
          return -116;
        }
        return this.y;
    }

    static {
        field_f = "Send private Quick Chat to <%0>";
    }
}
