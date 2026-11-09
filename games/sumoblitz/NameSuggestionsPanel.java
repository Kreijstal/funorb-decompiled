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

    final static void a(int param0, float param1, String param2) {
        try {
          ContentTransitionDialog.field_R = param1;
          LegacyOpenGlVertexBuffer.field_k = param2;
          if (param0 != 20) {
            field_F = (SpriteData[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pe.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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

    final void a(String[] param0, boolean param1) {
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
          if (param0 != null &&
            0 != param0.length) {
            var3_int = param0.length;
            this.field_B = new String[var3_int];
            if (param1) {
              var7 = (String[]) null;
              this.a((String[]) null, true);
            }
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_B[var4_int] = LegacyOpenGlRenderbuffer.canonicalizeBase37Name((CharSequence) ((Object) param0[var4_int]), (byte) 38).replace(' ', ' ');
            }
            var4 = new LinkWidgetRenderer(kw.field_b, 0, 1);
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
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
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

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        if (param0 != 26) {
          return (String) null;
        }
        int var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        return LabeledWidget.field_G[var4];
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -34) {
          field_E = (BufferedCacheFile) null;
        }
        stackIn_6_0 = (null != DisplayModeConfirmationDialog.field_O) && (kw.accountPhase.isLoginSessionPhase(17704));
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
            NameSuggestionsPanel.a(117, 1.4675142765045166f, (String) null);
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

    final static void a(ResourceArchive param0, ResourceArchive param1, int param2, ResourceArchive param3) {
        SecondaryNodeHashTable.field_g = SpriteData.b(param3, "", "fontalpha");
        SocketConnector.field_a = Js5Client.a(param1, (byte) -79, "font", "");
        mn.field_b = SpriteData.b(param3, "", "fontglow");
        VertexStreamLayout.field_c = SocketConnector.field_a;
        OpenGlTransparentWaterEffect.field_i = SpriteData.b(param3, "", "smallfontalpha");
        AccountConnectionPhase.field_a = Js5Client.a(param1, (byte) -39, "smallfont", "");
        LegacyOpenGlReflectionEffect.field_j = SpriteData.b(param3, "", "glowfontalpha");
        sv.field_a = AccountConnectionPhase.field_a;
        DropDownWidget.field_F = SpriteData.b(param3, "", "boldfontalpha");
        ma.field_b = Js5Client.a(param1, (byte) -36, "boldfont", "");
        ProxySocketConnector.field_f = SpriteData.b(param3, "", "boldglowfontalpha");
        sq.field_b = ma.field_b;
        field_F = SpriteData.b(param3, "", "menu_frame");
        MidiNoteMixer.field_q = SpriteData.b(param3, "", "tooltip_kit");
        SoftwareRenderTarget.field_b = SpriteData.b(param3, "", "achievements");
        CompactMeshGeometry.field_N = SpriteData.a(param0, "basic", "unachieved");
        MusicCrossfadeStream.field_p = SpriteData.a(param0, "basic", "locked");
        IntrusiveNode.field_d = SpriteData.a(param3, "", "titleimage");
        OpenGlCubeTexture.field_i = SpriteData.a(param3, "", "lock");
        hc.field_b = SpriteData.a(param3, "", "heart");
        oi.field_d = SpriteData.a(param3, "", "skull");
        TextLayoutLine.field_c = SpriteData.b(param3, "", "slider");
        if (param2 != 20) {
          return;
        }
        try {
          jj.field_c = SpriteData.b(param3, "", "statline_tab");
          ResourceRequest.field_r = SpriteData.b(param3, "", "statline_tab_flip");
          IsaacCipher.field_d = SpriteData.b(param3, "", "button_off");
          ProxyAuthenticationRequiredException.field_a = SpriteData.b(param3, "", "button_over");
          WaterTextureResources.field_c = SpriteData.b(param3, "", "button_on");
          LegacyOpenGlFloatPostProcessEffect.field_o = SpriteData.b(param3, "", "chargebar_vertical");
          IntrusiveDequeCursor.field_e = SpriteData.a(param3, "", "congratulations");
          LegacyOpenGlPostProcessEffect.field_k = SpriteData.a(param3, "", "mouse");
          BufferedSocket.field_n = SpriteData.a(param3, "", "keyboard");
          RasterStateFrame.field_l = SpriteData.b(param3, "", "player");
          kk.field_e = SpriteData.b(param3, "", "mook");
          HardwareTurbulentWaterNoise.field_w = SpriteData.b(param3, "", "fast");
          StatefulWidgetRenderer.field_r = SpriteData.b(param3, "", "sleeper");
          kr.field_b = SpriteData.b(param3, "", "splitter");
          DisplayModeConfirmationDialog.field_V = SpriteData.b(param3, "", "seeker");
          ph.field_a = SpriteData.b(param3, "", "shadowdudes");
          CachedTextLayout.field_h = SpriteData.b(param3, "", "mod_armour");
          RendererSession.field_b = SpriteData.b(param3, "", "mod_bomb");
          cd.field_c = SpriteData.b(param3, "", "mod_spikes");
          ServerDataReadRequest.field_k = SpriteData.a(param3, "", "zap");
          Transform3D.field_a = SpriteData.b(param3, "", "chargebar");
          ToolkitRasterStateFrame.field_a = SpriteData.a(param3, "", "bounceup");
          uj.field_c = SpriteData.b(param3, "", "powerups");
          df.field_d = SpriteData.a(param3, "", "particle");
          DroneChargeParticle.field_v = SpriteData.b(param3, "", "particles");
          FullscreenMembershipDialog.field_T = SpriteData.a(param3, "", "particle_alpha");
          UiStyle.field_v = SpriteData.b(param3, "", "particles_alpha");
          LegacyOpenGlRenderbuffer.field_w = SpriteData.b(param3, "", "particle_ring");
          bj.field_g = SpriteData.a(param3, "", "particle_sprinkle");
          HardwareTurbulentWaterNoise.field_t = SpriteData.a(param3, "", "particle_star");
          ShaderEffect.field_c = SpriteData.a(param3, "", "particle_pixel");
          SpriteStripButtonRenderer.field_p = SpriteData.a(param3, "", "particle_pixel_alpha");
          pc.field_c = SpriteData.a(param3, "", "ghost");
          no.field_c = SpriteData.a(param3, "", "ghost_cloud");
          LabeledWidget.field_E = SpriteData.a(param3, "", "ghost_splatter");
          mn.field_c = SpriteData.a(param3, "", "shadow");
          SceneryParticle.field_C = SpriteData.a(param3, "", "driftinglight");
          wf.field_a = SpriteData.a(param3, "", "driftinglight_snow");
          RidgedNoise3D.field_p = SpriteData.a(param3, "", "driftinglight_rough");
          UnderageAccountInfoPanel.field_C = SpriteData.a(param3, "", "shockwave");
          MouseInputHandler.field_b = SpriteData.b(param3, "", "lightningrod");
          SoftLruCache.field_a = SpriteData.b(param3, "", "lightningrod_lowgraphics");
          LegacyOpenGlCubeTexture.field_n = SpriteData.b(param3, "", "electricity");
          FallbackShaderEffect.field_h = SpriteData.b(param3, "", "electricity_flip");
          ArchiveCatalog.field_f = SpriteData.a(param3, "", "attract");
          MusicVoice.field_o = SpriteData.a(param3, "", "repulse");
          lr.field_c = SpriteData.a(param3, "", "icepatch");
          ei.field_b = SpriteData.b(param3, "", "attractor");
          IntList.field_e = SpriteData.a(param3, "", "bouncer");
          FullscreenMembershipDialog.field_S = SpriteData.b(param3, "", "landmine");
          ByteArrayStorage.field_a = SpriteData.b(param3, "", "repeller");
          ScrollViewport.field_C = SpriteData.b(param3, "", "accelerator");
          pc.field_b = SpriteData.b(param3, "", "teleporter");
          ScrollPane.field_F = SpriteData.b(param3, "", "ice");
          om.field_m = SpriteData.b(param3, "", "zaptrap");
          ke.field_c = SpriteData.a(param3, "reticule");
          PasswordValidator.field_i = SpriteData.a(param3, "", "reticule_flat");
          hc.field_a = SpriteData.b(param3, "", "gravitywell");
          RasterStateFrame.field_o = SpriteData.a(param3, "", "gravitywell_field");
          pq.field_F = SpriteData.b(param3, "", "tutorial_images");
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pe.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        super.renderLayer(parentX, parentY, (byte) -105, layer);
        if (0 != layer) {
          return;
        }
        LegacyBitmapFont var5 = kw.field_b;
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
    final static String $cfr$intArgs$a$c7de0d339b2a(int param0, boolean param1, boolean param2, boolean param3) {
        if (param0 != 26) {
          return (String) null;
        }
        int var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        return LabeledWidget.field_G[var4];
    }
}
