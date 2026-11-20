/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BuildBlueprintOrderDefinition extends SpecialOrderDefinition {
    static String[] field_d;

    BuildBlueprintOrderDefinition() {
    }

    final boolean hidesReadyCount(byte param0) {
        if (param0 > -104) {
          field_d = (String[]) null;
          return true;
        }
        return true;
    }

    final int getShortcutKey(int param0) {
        if (param0 != -1) {
          field_d = (String[]) null;
          return WaveformTextureOperation.field_j;
        }
        return WaveformTextureOperation.field_j;
    }

    final boolean allowsActivationWithoutReadyComponents(int param0) {
        if (param0 < 63) {
          return true;
        }
        return false;
    }

    final int getIconId(byte param0) {
        if (param0 <= 79) {
          field_d = (String[]) null;
          return 111;
        }
        return 111;
    }

    final static void initializeSocialWidgets(ResourceArchive param0, int param1) {
        Widget var5 = null;
        Widget var6 = null;
        Widget var3 = null;
        SetMissileLauncherRandomness.field_o = SetSniperCannonProjectiles.a(param0, "display_name_changed", "basic", true);
        BitmapTextLayout.field_n = new ScrollableActionPanel(0L, UiTheme.field_k, SetMissileLauncherEnergyUsed.field_q, SetDefaultFiringLeeway.field_o);
        AttachmentInputState.field_b = new ScrollableActionPanel(0L, UiTheme.field_k, SetMissilesTopSpeed.field_q, PlayerJoinFactory.field_a);
        PlayerJoinFactory.field_c = new Widget(0L, (Widget) null);
        OpenGlCubeTexture.field_h = new Widget(0L, DeveloperConsole.field_q);
        OpenGlCubeTexture.field_h.field_F = 1;
        if (param1 >= -96) {
          return;
        }
        try {
          SetCountermeasureLauncherRandomness.field_o = new Widget(0L, GetThrusterBindingBalanceThreshold.field_p, MaskedPasswordTextStyle.field_r);
          GameKeyHandler.field_b = new Widget(0L, ObjectiveMarker.field_d, AppletRasterBuffer.field_e);
          CarouselPlayerEventFactory.field_c = new Widget(0L, GetMissionDebrisDefaultProbability.field_o);
          PlayerJoinFactory.field_c.addChild(-561, OpenGlCubeTexture.field_h);
          PlayerJoinFactory.field_c.addChild(-561, SetCountermeasureLauncherRandomness.field_o);
          PlayerJoinFactory.field_c.addChild(-561, GameKeyHandler.field_b);
          PlayerJoinFactory.field_c.addChild(-561, BitmapTextLayout.field_n);
          PlayerJoinFactory.field_c.addChild(-561, CarouselPlayerEventFactory.field_c);
          BitmapTextLayout.field_n.scrollPane.viewport.applyStyle(18445, DeveloperConsole.field_q);
          BitmapTextLayout.field_n.scrollPane.viewport.field_B = 1;
          var5 = BitmapTextLayout.field_n.scrollPane.viewport;
          var6 = var5;
          var6.field_F = 1;
          AttachmentInputState.field_b.scrollPane.viewport.applyStyle(18445, DeveloperConsole.field_q);
          var3 = AttachmentInputState.field_b.scrollPane.viewport;
          AttachmentInputState.field_b.scrollPane.viewport.field_B = 1;
          var3.field_F = 1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hka.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_d = null;
        if (param0 != 0) {
          field_d = (String[]) null;
        }
    }

    final int getActiveDuration(int param0) {
        if (param0 != -25131) {
          this.allowsActivationWithoutReadyComponents(-85);
          return 256;
        }
        return 256;
    }

    final static void drawGameFrame(int param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          if (UiDraggableContainer.field_z >= 10) {
            if (!LogoAnimationStatus.hasLogoAnimationFinished(true)) {
              SoftwareRasterizer2D.clear();
              SetRadialMenuRadius.drawLogoAnimation((byte) 82, 320, 240);
              SetSniperCannonAimarc.a(param1, 0, 0, 0);
            } else {
              if (GetSpinningBladeAimspeed.field_q == 0) {
                QuickChatPhraseDefinition.a((byte) -70, false, param2);
                SetSniperCannonAimarc.a(param1, 0, 0, 0);
              } else {
                GetPhasedEnergyBeamAimspeed.a(param1, true);
              }
            }
          } else {
            var3_int = 0;
            if (GetShowTutorial.field_o) {
              GetShowTutorial.field_o = false;
              var3_int = 1;
            }
            Lo.a(SetBlueprintSaveTime.field_p, 13, GetMissileLauncherFireForce.e((byte) 97), var3_int != 0, SetMassDriverFireForce.e((byte) -79));
          }
          if (param0 == 111) {
            return;
          }
          field_d = (String[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("hka.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final int getCooldown(byte param0) {
        if (param0 != 64) {
          field_d = (String[]) null;
          return Particle.field_t;
        }
        return Particle.field_t;
    }

    final boolean requiresPrimaryPress(boolean param0) {
        if (param0) {
          field_d = (String[]) null;
          return false;
        }
        return false;
    }

    static {
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }
}
