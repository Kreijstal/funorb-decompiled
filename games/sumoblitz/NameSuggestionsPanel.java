/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameSuggestionsPanel extends WidgetContainer implements WidgetActionListener {
    private NameSuggestionListener field_A;
    static SpriteData[] field_F;
    private InteractiveWidget[] field_C;
    static BufferedCacheFile field_E;
    static String orbPointsText;
    private String[] field_B;

    final static void setLoadingProgress(int guard, float progress, String message) {
        try {
          ContentTransitionDialog.field_R = progress;
          LegacyOpenGlVertexBuffer.field_k = message;
          if (guard != 20) {
            field_F = (SpriteData[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pe.D(" + guard + ',' + progress + ',' + (message != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_E = null;
        field_F = null;
        if (param0 != -18490) {
          field_F = (SpriteData[]) null;
        }
        orbPointsText = null;
    }

    final void setSuggestions(String[] names, boolean guard) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        LinkWidgetRenderer var4 = null;
        int var6 = 0;
        String[] var7 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.children.clear(125);
          if (names != null &&
            0 != names.length) {
            var3_int = names.length;
            this.field_B = new String[var3_int];
            if (guard) {
              var7 = (String[]) null;
              this.setSuggestions((String[]) null, true);
            }
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_B[var4_int] = LegacyOpenGlRenderbuffer.canonicalizeBase37Name((CharSequence) ((Object) names[var4_int]), (byte) 38).replace(' ', ' ');
            }
            var4 = new LinkWidgetRenderer(TextCaretLayout.field_b, 0, 1);
            this.field_C = new InteractiveWidget[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_C[var5] = new InteractiveWidget(this.field_B[var5], (WidgetListener) (this));
              this.field_C[var5].renderer = (WidgetRenderer) ((Object) var4);
              this.field_C[var5].tooltip = TextureFilter.useThisAlternativeAsText;
              this.field_C[var5].setBounds(103, 0, 16 * var5 + 20, 15, 80);
              this.addChild(this.field_C[var5], 64);
            }
            this.field_C[var3_int] = new InteractiveWidget(BufferedSocket.moreSuggestionsText, (WidgetListener) (this));
            this.field_C[var3_int].renderer = (WidgetRenderer) ((Object) var4);
            this.field_C[var3_int].setBounds(126, 0, 20 + 16 * var3_int + 16, 15, 100);
            this.addChild(this.field_C[var3_int], 89);
            return;
          }
          this.field_B = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("pe.E(");
          if (names == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(')').toString());
        }
    }

    NameSuggestionsPanel(NameSuggestionListener param0) {
        super(0, 0, 0, 0, (WidgetRenderer) null);
        try {
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onKey(root, character, (byte) 97, keyCode)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_6_0 = this.focusPrevious((byte) 125, root);
            return stackIn_6_0;
          }
          if (guard < 9) {
            this.renderLayer(-89, -18, (byte) -61, -116);
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNext(root, false);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("pe.KA(");
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    final static String discardLinkPrefix(byte guard, boolean firstFlag, boolean secondFlag, boolean thirdFlag) {
        if (guard != 26) {
          return (String) null;
        }
        int var4 = 0;
        if (firstFlag) {
          var4 += 4;
        }
        if (thirdFlag) {
          var4 += 2;
        }
        if (secondFlag) {
          var4++;
        }
        return LabeledWidget.field_G[var4];
    }

    final static boolean hasLoginSessionSocket(byte guard) {
        boolean stackIn_6_0 = false;
        if (guard >= -34) {
          field_E = (BufferedCacheFile) null;
        }
        stackIn_6_0 = (null != DisplayModeConfirmationDialog.accountSocket) && (TextCaretLayout.accountPhase.isLoginSessionPhase(17704));
        return stackIn_6_0;
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        int var6_int = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var6_int = 0; this.field_B.length > var6_int; var6_int++) {
            if (this.field_C[var6_int] == source) {
              this.field_A.setSuggestedName(this.field_B[var6_int], 0);
            }
          }
          if (guard != 710) {
            var8 = (String) null;
            NameSuggestionsPanel.setLoadingProgress(117, 1.4675142765045166f, (String) null);
          }
          if (source == this.field_C[this.field_B.length]) {
            this.field_A.invalidateNameAvailability((byte) -86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("pe.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    final static void loadGameSprites(ResourceArchive commonGraphics, ResourceArchive fontMetrics, int guard, ResourceArchive gameGraphics) {
        SecondaryNodeHashTable.field_g = SpriteData.loadSheet(gameGraphics, "", "fontalpha");
        SocketConnector.field_a = Js5Client.loadFontMetrics(fontMetrics, (byte) -79, "font", "");
        ArchiveLoadingStage.field_b = SpriteData.loadSheet(gameGraphics, "", "fontglow");
        VertexStreamLayout.field_c = SocketConnector.field_a;
        OpenGlTransparentWaterEffect.field_i = SpriteData.loadSheet(gameGraphics, "", "smallfontalpha");
        AccountConnectionPhase.field_a = Js5Client.loadFontMetrics(fontMetrics, (byte) -39, "smallfont", "");
        LegacyOpenGlReflectionEffect.field_j = SpriteData.loadSheet(gameGraphics, "", "glowfontalpha");
        RsaEnvelopeScratch.field_a = AccountConnectionPhase.field_a;
        DropDownWidget.field_F = SpriteData.loadSheet(gameGraphics, "", "boldfontalpha");
        LoginTextResources.field_b = Js5Client.loadFontMetrics(fontMetrics, (byte) -36, "boldfont", "");
        ProxySocketConnector.field_f = SpriteData.loadSheet(gameGraphics, "", "boldglowfontalpha");
        IntroLightingLookup.field_b = LoginTextResources.field_b;
        field_F = SpriteData.loadSheet(gameGraphics, "", "menu_frame");
        MidiNoteMixer.field_q = SpriteData.loadSheet(gameGraphics, "", "tooltip_kit");
        SoftwareRenderTarget.field_b = SpriteData.loadSheet(gameGraphics, "", "achievements");
        CompactMeshGeometry.field_N = SpriteData.loadSprite(commonGraphics, "basic", "unachieved");
        MusicCrossfadeStream.field_p = SpriteData.loadSprite(commonGraphics, "basic", "locked");
        IntrusiveNode.field_d = SpriteData.loadSprite(gameGraphics, "", "titleimage");
        OpenGlCubeTexture.field_i = SpriteData.loadSprite(gameGraphics, "", "lock");
        AccountStatusDialogState.heartSpriteData = SpriteData.loadSprite(gameGraphics, "", "heart");
        HiscoreRequestQueue.field_d = SpriteData.loadSprite(gameGraphics, "", "skull");
        TextLayoutLine.field_c = SpriteData.loadSheet(gameGraphics, "", "slider");
        if (guard != 20) {
          return;
        }
        try {
          LoginMethodPreference.field_c = SpriteData.loadSheet(gameGraphics, "", "statline_tab");
          ResourceRequest.field_r = SpriteData.loadSheet(gameGraphics, "", "statline_tab_flip");
          IsaacCipher.field_d = SpriteData.loadSheet(gameGraphics, "", "button_off");
          ProxyAuthenticationRequiredException.field_a = SpriteData.loadSheet(gameGraphics, "", "button_over");
          WaterTextureResources.field_c = SpriteData.loadSheet(gameGraphics, "", "button_on");
          LegacyOpenGlFloatPostProcessEffect.field_o = SpriteData.loadSheet(gameGraphics, "", "chargebar_vertical");
          IntrusiveDequeCursor.field_e = SpriteData.loadSprite(gameGraphics, "", "congratulations");
          LegacyOpenGlPostProcessEffect.field_k = SpriteData.loadSprite(gameGraphics, "", "mouse");
          BufferedSocket.field_n = SpriteData.loadSprite(gameGraphics, "", "keyboard");
          RasterStateFrame.field_l = SpriteData.loadSheet(gameGraphics, "", "player");
          LegacyOpenGlTextureCache.field_e = SpriteData.loadSheet(gameGraphics, "", "mook");
          HardwareTurbulentWaterNoise.field_w = SpriteData.loadSheet(gameGraphics, "", "fast");
          StatefulWidgetRenderer.field_r = SpriteData.loadSheet(gameGraphics, "", "sleeper");
          RasterColorTables.field_b = SpriteData.loadSheet(gameGraphics, "", "splitter");
          DisplayModeConfirmationDialog.field_V = SpriteData.loadSheet(gameGraphics, "", "seeker");
          LruNodeCache.field_a = SpriteData.loadSheet(gameGraphics, "", "shadowdudes");
          CachedTextLayout.field_h = SpriteData.loadSheet(gameGraphics, "", "mod_armour");
          RendererSession.field_b = SpriteData.loadSheet(gameGraphics, "", "mod_bomb");
          FullscreenDisplayMode.field_c = SpriteData.loadSheet(gameGraphics, "", "mod_spikes");
          ServerDataReadRequest.field_k = SpriteData.loadSprite(gameGraphics, "", "zap");
          Transform3D.field_a = SpriteData.loadSheet(gameGraphics, "", "chargebar");
          ToolkitRasterStateFrame.field_a = SpriteData.loadSprite(gameGraphics, "", "bounceup");
          EnemyDroneFactory.field_c = SpriteData.loadSheet(gameGraphics, "", "powerups");
          HiscorePlayerName.field_d = SpriteData.loadSprite(gameGraphics, "", "particle");
          DroneChargeParticle.field_v = SpriteData.loadSheet(gameGraphics, "", "particles");
          FullscreenMembershipDialog.field_T = SpriteData.loadSprite(gameGraphics, "", "particle_alpha");
          UiStyle.field_v = SpriteData.loadSheet(gameGraphics, "", "particles_alpha");
          LegacyOpenGlRenderbuffer.field_w = SpriteData.loadSheet(gameGraphics, "", "particle_ring");
          EmailAvailabilityRequest.field_g = SpriteData.loadSprite(gameGraphics, "", "particle_sprinkle");
          HardwareTurbulentWaterNoise.field_t = SpriteData.loadSprite(gameGraphics, "", "particle_star");
          ShaderEffect.field_c = SpriteData.loadSprite(gameGraphics, "", "particle_pixel");
          SpriteStripButtonRenderer.field_p = SpriteData.loadSprite(gameGraphics, "", "particle_pixel_alpha");
          FriendListState.ghostSpriteData = SpriteData.loadSprite(gameGraphics, "", "ghost");
          LoginFormState.ghostCloudSpriteData = SpriteData.loadSprite(gameGraphics, "", "ghost_cloud");
          LabeledWidget.field_E = SpriteData.loadSprite(gameGraphics, "", "ghost_splatter");
          ArchiveLoadingStage.field_c = SpriteData.loadSprite(gameGraphics, "", "shadow");
          SceneryParticle.field_C = SpriteData.loadSprite(gameGraphics, "", "driftinglight");
          SnowParticleSpriteData.spriteData = SpriteData.loadSprite(gameGraphics, "", "driftinglight_snow");
          RidgedNoise3D.field_p = SpriteData.loadSprite(gameGraphics, "", "driftinglight_rough");
          UnderageAccountInfoPanel.field_C = SpriteData.loadSprite(gameGraphics, "", "shockwave");
          MouseInputHandler.field_b = SpriteData.loadSheet(gameGraphics, "", "lightningrod");
          SoftLruCache.field_a = SpriteData.loadSheet(gameGraphics, "", "lightningrod_lowgraphics");
          LegacyOpenGlCubeTexture.field_n = SpriteData.loadSheet(gameGraphics, "", "electricity");
          FallbackShaderEffect.field_h = SpriteData.loadSheet(gameGraphics, "", "electricity_flip");
          ArchiveCatalog.field_f = SpriteData.loadSprite(gameGraphics, "", "attract");
          MusicVoice.field_o = SpriteData.loadSprite(gameGraphics, "", "repulse");
          VertexBufferReference.field_c = SpriteData.loadSprite(gameGraphics, "", "icepatch");
          BigBurstaProgress.attractorSpriteData = SpriteData.loadSheet(gameGraphics, "", "attractor");
          IntList.field_e = SpriteData.loadSprite(gameGraphics, "", "bouncer");
          FullscreenMembershipDialog.field_S = SpriteData.loadSheet(gameGraphics, "", "landmine");
          ByteArrayStorage.field_a = SpriteData.loadSheet(gameGraphics, "", "repeller");
          ScrollViewport.field_C = SpriteData.loadSheet(gameGraphics, "", "accelerator");
          FriendListState.teleporterSpriteData = SpriteData.loadSheet(gameGraphics, "", "teleporter");
          ScrollPane.field_F = SpriteData.loadSheet(gameGraphics, "", "ice");
          DroneWaveDefinition.field_m = SpriteData.loadSheet(gameGraphics, "", "zaptrap");
          AppletInstanceState.reticuleSpriteData = SpriteData.loadFlatSheet(gameGraphics, "reticule");
          PasswordValidator.field_i = SpriteData.loadSprite(gameGraphics, "", "reticule_flat");
          AccountStatusDialogState.gravityWellSpriteData = SpriteData.loadSheet(gameGraphics, "", "gravitywell");
          RasterStateFrame.field_o = SpriteData.loadSprite(gameGraphics, "", "gravitywell_field");
          StripedProgressWidget.field_F = SpriteData.loadSheet(gameGraphics, "", "tutorial_images");
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pe.F(" + (commonGraphics != null ? "{...}" : "null") + ',' + (fontMetrics != null ? "{...}" : "null") + ',' + guard + ',' + (gameGraphics != null ? "{...}" : "null") + ')');
        }
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        super.renderLayer(parentX, parentY, (byte) -105, layer);
        if (0 != layer) {
          return;
        }
        LegacyBitmapFont var5 = TextCaretLayout.field_b;
        if (this.field_B != null) {
          var5.drawParagraph(NodeHashTableIterator.suggestedNamesText, parentX + this.x, this.y + parentY, this.width, 20, 16777215, -1, 0, 0, var5.descent + var5.ascent);
        }
        if (guard > -35) {
          this.renderLayer(120, -19, (byte) -32, 10);
        }
    }

    static {
        orbPointsText = "Orb Points";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String discardLinkPrefixIntGuard(int guard, boolean firstFlag, boolean secondFlag, boolean thirdFlag) {
        if (guard != 26) {
          return (String) null;
        }
        int var4 = 0;
        if (firstFlag) {
          var4 += 4;
        }
        if (thirdFlag) {
          var4 += 2;
        }
        if (secondFlag) {
          var4++;
        }
        return LabeledWidget.field_G[var4];
    }
}
