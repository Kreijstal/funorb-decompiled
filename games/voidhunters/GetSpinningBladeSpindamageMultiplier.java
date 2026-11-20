/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetSpinningBladeSpindamageMultiplier extends ConsoleCommand {
    static String field_o;

    final static void a(int param0) {
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        int[] var27 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        int[] var28 = null;
        int var2 = 0;
        int var2Lifetime1;
        GetDebrisGroupColour.field_r = DateOfBirthInput.field_x.context.toolkit;
        SetUseBackground.field_o = ToolkitRasterStateCache.getStateStack(GetDebrisGroupColour.field_r, true);
        java.awt.Dimension var9 = DateOfBirthInput.field_x.context.canvas.getSize();
        GetDebrisGroupColour.field_r.setClip(0, 0, var9.width, var9.height);
        PasswordValidator.rebuildGraphicsResources(-10150);
        if (param0 != -9934) {
          PcmStreamMixer var8 = (PcmStreamMixer) null;
          GetSpinningBladeSpindamageMultiplier.a((byte) 16, (ResourceArchive) null, -27, (PcmStreamMixer) null);
          SetBombletSprayProjectiles.invalidateFogOfWarSprite(-126);
          var2 = GetMassDriverProjectiles.field_q;
          GetMassDriverProjectiles.field_q = DateOfBirthInput.field_x.context.backendOption.backendId;
          if (var2 != GetMassDriverProjectiles.field_q &&
            UiDraggableContainer.field_E) {
            MissionBuilder.setIntegerPreference((byte) 44, "graphics_mode", GetMassDriverProjectiles.field_q);
            SetLaserAimarc.savePreferences(-123);
          }
          if (GetMassDriverProjectiles.field_q != 1) {
            return;
          }
          var12 = jaggl.OpenGL.glGetString(7936);
          var13 = jaggl.OpenGL.glGetString(7938);
          var14 = jaggl.OpenGL.glGetString(7937);
          var15 = jaggl.OpenGL.glGetString(7939);
          System.out.println("GL_VENDOR " + var12);
          System.out.println("GL_VERSION " + var13);
          System.out.println("GL_RENDERER " + var14);
          System.out.println("GL_EXTENSIONS " + var15);
          var27 = new int[1];
          jaggl.OpenGL.glGetIntegerv(3379, var27, 0);
          System.out.println("GL_MAX_TEXTURE_SIZE: " + var27[0]);
          if (DeveloperAccess.hasDeveloperAccess(param0 ^ -9936)) {
            System.out.println("has_memorypools: " + GetDebrisGroupColour.field_r.supportsMemoryPools());
            System.out.println("has_volatile_backbuffer: " + GetDebrisGroupColour.field_r.hasVolatileBackbuffer());
            System.out.println("has_resizable_backbuffer: " + GetDebrisGroupColour.field_r.supportsResizableBackbuffer());
            System.out.println("has_offscreen_rendering: " + GetDebrisGroupColour.field_r.supportsOffscreenRendering());
            System.out.println("has_slow_offscreen_rendering: " + GetDebrisGroupColour.field_r.hasSlowOffscreenRendering());
            System.out.println("has_shadows: " + GetDebrisGroupColour.field_r.supportsShadows());
            System.out.println("has_bloom: " + GetDebrisGroupColour.field_r.isBloomSupported());
            System.out.println("has_envmap: " + GetDebrisGroupColour.field_r.supportsEnvironmentMaps());
            System.out.println("has_antialiasing: " + GetDebrisGroupColour.field_r.supportsAntialiasing());
            System.out.println("has_multiplethreads: " + GetDebrisGroupColour.field_r.supportsMultipleThreads());
            System.out.println("has_fasttexturedparticles: " + GetDebrisGroupColour.field_r.supportsFastTexturedParticles());
            System.out.println("has_underwater: " + GetDebrisGroupColour.field_r.supportsUnderwaterEffects());
            System.out.println("has_farzclipplane: " + GetDebrisGroupColour.field_r.supportsFarClipPlane());
            System.out.println("has_multiple_canvases: " + GetDebrisGroupColour.field_r.supportsMultipleCanvases());
            System.out.println("has_pointlights: " + GetDebrisGroupColour.field_r.supportsPointLights(-76));
            return;
          }
          return;
        }
        SetBombletSprayProjectiles.invalidateFogOfWarSprite(-126);
        var2Lifetime1 = GetMassDriverProjectiles.field_q;
        GetMassDriverProjectiles.field_q = DateOfBirthInput.field_x.context.backendOption.backendId;
        if (var2Lifetime1 != GetMassDriverProjectiles.field_q) {
          if (!UiDraggableContainer.field_E) {
            if (GetMassDriverProjectiles.field_q != 1) {
              return;
            }
            var17 = jaggl.OpenGL.glGetString(7936);
            var18 = jaggl.OpenGL.glGetString(7938);
            var19 = jaggl.OpenGL.glGetString(7937);
            var20 = jaggl.OpenGL.glGetString(7939);
            System.out.println("GL_VENDOR " + var17);
            System.out.println("GL_VERSION " + var18);
            System.out.println("GL_RENDERER " + var19);
            System.out.println("GL_EXTENSIONS " + var20);
            var28 = new int[1];
            jaggl.OpenGL.glGetIntegerv(3379, var28, 0);
            System.out.println("GL_MAX_TEXTURE_SIZE: " + var28[0]);
            if (DeveloperAccess.hasDeveloperAccess(param0 ^ -9936)) {
              System.out.println("has_memorypools: " + GetDebrisGroupColour.field_r.supportsMemoryPools());
              System.out.println("has_volatile_backbuffer: " + GetDebrisGroupColour.field_r.hasVolatileBackbuffer());
              System.out.println("has_resizable_backbuffer: " + GetDebrisGroupColour.field_r.supportsResizableBackbuffer());
              System.out.println("has_offscreen_rendering: " + GetDebrisGroupColour.field_r.supportsOffscreenRendering());
              System.out.println("has_slow_offscreen_rendering: " + GetDebrisGroupColour.field_r.hasSlowOffscreenRendering());
              System.out.println("has_shadows: " + GetDebrisGroupColour.field_r.supportsShadows());
              System.out.println("has_bloom: " + GetDebrisGroupColour.field_r.isBloomSupported());
              System.out.println("has_envmap: " + GetDebrisGroupColour.field_r.supportsEnvironmentMaps());
              System.out.println("has_antialiasing: " + GetDebrisGroupColour.field_r.supportsAntialiasing());
              System.out.println("has_multiplethreads: " + GetDebrisGroupColour.field_r.supportsMultipleThreads());
              System.out.println("has_fasttexturedparticles: " + GetDebrisGroupColour.field_r.supportsFastTexturedParticles());
              System.out.println("has_underwater: " + GetDebrisGroupColour.field_r.supportsUnderwaterEffects());
              System.out.println("has_farzclipplane: " + GetDebrisGroupColour.field_r.supportsFarClipPlane());
              System.out.println("has_multiple_canvases: " + GetDebrisGroupColour.field_r.supportsMultipleCanvases());
              System.out.println("has_pointlights: " + GetDebrisGroupColour.field_r.supportsPointLights(-76));
              return;
            }
            return;
          }
          MissionBuilder.setIntegerPreference((byte) 44, "graphics_mode", GetMassDriverProjectiles.field_q);
          SetLaserAimarc.savePreferences(-123);
        }
        if (GetMassDriverProjectiles.field_q != 1) {
          return;
        }
        String var22 = jaggl.OpenGL.glGetString(7936);
        String var23 = jaggl.OpenGL.glGetString(7938);
        String var24 = jaggl.OpenGL.glGetString(7937);
        String var25 = jaggl.OpenGL.glGetString(7939);
        System.out.println("GL_VENDOR " + var22);
        System.out.println("GL_VERSION " + var23);
        System.out.println("GL_RENDERER " + var24);
        System.out.println("GL_EXTENSIONS " + var25);
        int[] var29 = new int[1];
        jaggl.OpenGL.glGetIntegerv(3379, var29, 0);
        System.out.println("GL_MAX_TEXTURE_SIZE: " + var29[0]);
        if (DeveloperAccess.hasDeveloperAccess(param0 ^ -9936)) {
          System.out.println("has_memorypools: " + GetDebrisGroupColour.field_r.supportsMemoryPools());
          System.out.println("has_volatile_backbuffer: " + GetDebrisGroupColour.field_r.hasVolatileBackbuffer());
          System.out.println("has_resizable_backbuffer: " + GetDebrisGroupColour.field_r.supportsResizableBackbuffer());
          System.out.println("has_offscreen_rendering: " + GetDebrisGroupColour.field_r.supportsOffscreenRendering());
          System.out.println("has_slow_offscreen_rendering: " + GetDebrisGroupColour.field_r.hasSlowOffscreenRendering());
          System.out.println("has_shadows: " + GetDebrisGroupColour.field_r.supportsShadows());
          System.out.println("has_bloom: " + GetDebrisGroupColour.field_r.isBloomSupported());
          System.out.println("has_envmap: " + GetDebrisGroupColour.field_r.supportsEnvironmentMaps());
          System.out.println("has_antialiasing: " + GetDebrisGroupColour.field_r.supportsAntialiasing());
          System.out.println("has_multiplethreads: " + GetDebrisGroupColour.field_r.supportsMultipleThreads());
          System.out.println("has_fasttexturedparticles: " + GetDebrisGroupColour.field_r.supportsFastTexturedParticles());
          System.out.println("has_underwater: " + GetDebrisGroupColour.field_r.supportsUnderwaterEffects());
          System.out.println("has_farzclipplane: " + GetDebrisGroupColour.field_r.supportsFarClipPlane());
          System.out.println("has_multiple_canvases: " + GetDebrisGroupColour.field_r.supportsMultipleCanvases());
          System.out.println("has_pointlights: " + GetDebrisGroupColour.field_r.supportsPointLights(-76));
          return;
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(185, 109));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jc.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(byte param0, ResourceArchive param1, int param2, PcmStreamMixer param3) {
        GetShieldsDamageEnergyConversion.field_p = param2 * SetGrapplingHookRopeBreakLength.e(204) / 1000;
        GetPlayerRepairTime.a(param1, false);
        NetworkArchiveRequest.loadLogoMeshes(param1, (byte) 36);
        TextHotspotRegion.loadLogoFinalFrame(param0 ^ 107, param1);
        SetSelfDestructPrepareToggleCooldown.e((byte) -39);
        if (param0 != 55) {
          return;
        }
        try {
          GetMissionTerrainNebulaProbability.buildLogoGlowSprite(121);
          SetSalvoaim.logoAnimationTick = 0 - GetShieldsDamageEnergyConversion.field_p;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    GetSpinningBladeSpindamageMultiplier(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void clearSharedReferences(boolean param0) {
        field_o = null;
        if (param0) {
          GetSpinningBladeSpindamageMultiplier.clearSharedReferences(false);
        }
    }

    static {
        field_o = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
