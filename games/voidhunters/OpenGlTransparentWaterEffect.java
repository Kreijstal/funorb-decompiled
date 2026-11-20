/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlTransparentWaterEffect extends GpuMaterialEffect {
    private WaterTextures field_e;
    private OpenGlGpuToolkit field_f;
    private OpenGlArbProgram field_g;

    final void enable(int param0, boolean param1) {
        jaggl.OpenGL.glBindProgramARB(34336, this.field_g.programId);
        jaggl.OpenGL.glEnable(34336);
        this.toolkit.setRgbCombineSource(0, SpriteTextureOperation.field_l, 7);
        if (param0 != 5) {
          GpuTexture var4 = (GpuTexture) null;
          this.setTexture((byte) -95, 120, (GpuTexture) null);
        }
    }

    final boolean isSupported(byte param0) {
        int var2 = 38 / ((34 - param0) / 63);
        return this.field_g != null ? true : false;
    }

    final static void e(int param0) {
        if (param0 != -24248) {
          OpenGlTransparentWaterEffect.e(30);
          GetSelfDestructPrepareToggleCooldown.setAccountUiResult(113, 4);
          return;
        }
        GetSelfDestructPrepareToggleCooldown.setAccountUiResult(113, 4);
    }

    final void applyRenderState(int param0, boolean param1) {
        this.toolkit.setTextureCombineOperations(GpuQuadBuffers.field_c, true, MissionVariable.field_c);
        if (param0 != 5) {
          this.setParameters(0, 25, 20);
        }
    }

    final void setParameters(int param0, int param1, int param2) {
        int var4 = 0;
        float var4_float = 0.0f;
        if (this.field_e.usesVolumeTexture) {
          var4_float = (float)(this.toolkit.field_pc % 4000) / 4000.0f;
          this.toolkit.setTexture(this.field_e.noiseVolume, -125);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4_float, 0.0f, 0.0f, 1.0f);
        } else {
          var4 = 16 * (this.toolkit.field_pc % 4000) / 4000;
          this.toolkit.setTexture(this.field_e.noiseFrames[var4], -116);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        if (param2 == 5) {
          return;
        }
        this.applyRenderState(102, true);
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        try {
          if (param0 <= 42) {
            this.field_e = (WaterTextures) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vsb.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    OpenGlTransparentWaterEffect(OpenGlGpuToolkit param0, ResourceArchive param1, WaterTextures param2) {
        super(param0);
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_f = param0;
          this.field_e = param2;
          if (param1 != null &&
            this.field_e.hasNoiseTextures((byte) -65) &&
            this.field_f.field_Ac) {
            this.field_g = mha.a(0, param1.fetchNamedFile("transparent_water", true, "gl"), 34336, this.field_f);
            return;
          }
          this.field_g = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vsb.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void disable(int param0) {
        this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, param0 - 2536);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        jaggl.OpenGL.glDisable(34336);
        if (param0 != 2543) {
          this.field_f = (OpenGlGpuToolkit) null;
        }
    }

    static {
    }
}
