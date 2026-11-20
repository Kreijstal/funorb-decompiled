/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlUnderwaterMaterialEffect extends GpuMaterialEffect {
    private GpuTexture2D field_e;
    private boolean field_i;
    private boolean field_l;
    private OpenGlArbProgram field_p;
    private boolean field_g;
    private OpenGlArbProgram field_m;
    private OpenGlArbProgram field_k;
    static int field_n;
    static int field_o;
    private float[] field_h;
    private boolean field_f;
    private OpenGlArbProgram field_j;

    final void disable(int param0) {
        this.toolkit.setActiveTextureUnit(1, -64);
        this.toolkit.setTexture((GpuTexture) null, -114);
        this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
        this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
        this.toolkit.setRgbCombineSource(2, pea.field_d, param0 - 2536);
        this.toolkit.setAlphaCombineSource(0, (byte) -72, SetGrapplingHookMaxExtension8Force.field_q);
        this.toolkit.setActiveTextureUnit(0, -123);
        if (this.field_f) {
          this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
          this.toolkit.setAlphaCombineSource(0, (byte) -118, SetGrapplingHookMaxExtension8Force.field_q);
          this.field_f = false;
          if (param0 == 2543) {
            if (!this.field_g) {
              return;
            }
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            this.field_g = false;
            return;
          }
          field_o = -55;
          if (this.field_g) {
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            this.field_g = false;
            return;
          }
          return;
        }
        if (param0 != 2543) {
          field_o = -55;
          if (!this.field_g) {
            return;
          }
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          this.field_g = false;
          return;
        }
        if (!this.field_g) {
          return;
        }
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        jaggl.OpenGL.glDisable(34336);
        this.field_g = false;
    }

    final void enable(int param0, boolean param1) {
        this.field_i = param1 ? true : false;
        this.toolkit.setActiveTextureUnit(1, -72);
        this.toolkit.setTexture(this.field_e, param0 - 119);
        this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, SetThrusterBindingMoveAndTurnHasOppositeMove.field_o);
        this.toolkit.setRgbCombineSource(0, pea.field_d, param0 ^ 2);
        this.toolkit.setRgbCombineSource(true, -21115, false, SetGrapplingHookMaxExtension8Force.field_q, 2);
        this.toolkit.setAlphaCombineSource(0, (byte) -104, pja.field_l);
        this.toolkit.setActiveTextureUnit(0, -93);
        if (param0 != 5) {
          this.field_j = (OpenGlArbProgram) null;
        } else {
          this.applyUnderwaterProgram(0);
          return;
        }
        this.applyUnderwaterProgram(0);
    }

    final void onDepthRangeChanged(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        if (this.field_g) {
          var2 = this.toolkit.getFarPlane();
          var3 = this.toolkit.getNearPlane();
          var4 = -((float)(var2 - var3) * 0.125f) + (float)var2;
          var5 = (float)var2 - (float)(var2 - var3) * 0.25f;
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.toolkit.getUnderwaterDepthScale(100), (float)this.toolkit.getUnderwaterFogStrength(!param0 ? true : false) / 255.0f);
          this.toolkit.setActiveTextureUnit(1, -42);
          this.toolkit.setTextureConstantColor(-122, this.toolkit.getUnderwaterFogColor((byte) -124));
          this.toolkit.setActiveTextureUnit(0, -81);
        }
        if (param0) {
          return;
        }
        this.field_i = true;
    }

    OpenGlUnderwaterMaterialEffect(OpenGlGpuToolkit param0, ResourceArchive param1) {
        super(param0);
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_h = new float[4];
        this.field_f = false;
        try {
          if (param1 != null &&
            param0.field_Ac) {
            this.field_p = mha.a(0, param1.fetchNamedFile("uw_ground_unlit", true, "gl"), 34336, param0);
            this.field_k = mha.a(0, param1.fetchNamedFile("uw_ground_lit", true, "gl"), 34336, param0);
            this.field_m = mha.a(0, param1.fetchNamedFile("uw_model_unlit", true, "gl"), 34336, param0);
            this.field_j = mha.a(0, param1.fetchNamedFile("uw_model_lit", true, "gl"), 34336, param0);
            stackIn_7_0 = (this.field_j == null) ? 0 : 1;
            if (this.field_k == null) {
              stackIn_10_1 = 0;
            } else {
              stackIn_10_1 = 1;
            }
            if (null == this.field_p) {
              stackIn_13_2 = 0;
            } else {
              stackIn_13_2 = 1;
            }
            stackIn_15_1 = stackIn_10_1 & stackIn_13_2;
            if (null == this.field_m) {
              stackIn_16_2 = 0;
            } else {
              stackIn_16_2 = 1;
            }
            if ((stackIn_7_0 & (stackIn_15_1 & stackIn_16_2)) == 0) {
              this.field_l = false;
              return;
            }
            this.field_e = this.toolkit.createTexture2DFromPixels(2, false, 1, (byte) -67, new int[]{0, -1});
            this.field_e.setRepeat(false, (byte) -98, false);
            this.field_l = true;
            return;
          }
          this.field_l = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("bma.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final boolean isSupported(byte param0) {
        int var2 = 100 / ((34 - param0) / 63);
        return this.field_l;
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param2 != 5) {
          this.field_k = (OpenGlArbProgram) null;
        }
    }

    private final void applyUnderwaterProgram(int param0) {
        int var2 = this.toolkit.getWaterPlaneDistance((byte) 127);
        GpuTransform3D var3 = this.toolkit.getViewTransform((byte) 47);
        if (this.field_i) {
          jaggl.OpenGL.glBindProgramARB(34336, var2 != 2147483647 ? this.field_j.programId : this.field_k.programId);
        } else {
          jaggl.OpenGL.glBindProgramARB(34336, 2147483647 != var2 ? this.field_m.programId : this.field_p.programId);
        }
        jaggl.OpenGL.glEnable(34336);
        this.field_g = true;
        var3.transformPlane(this.field_h, -1.0f, (byte) 67, (float)var2, (float)param0, 0.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_h[0], this.field_h[1], this.field_h[2], this.field_h[3]);
        this.onDepthRangeChanged(true);
    }

    final void applyRenderState(int param0, boolean param1) {
        if (param0 != 5) {
          this.applyUnderwaterProgram(18);
        }
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != null) {
            if (this.field_f) {
              this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
              this.toolkit.setAlphaCombineSource(0, (byte) -58, SetGrapplingHookMaxExtension8Force.field_q);
              this.field_f = false;
            }
            this.toolkit.setTexture(param2, -118);
            this.toolkit.setTextureCombineMode(-122, param1);
          } else {
            if (!this.field_f) {
              this.toolkit.setTexture(this.toolkit.field_Q, -108);
              this.toolkit.setTextureCombineMode(-120, 1);
              this.toolkit.setRgbCombineSource(0, pja.field_l, 7);
              this.toolkit.setAlphaCombineSource(0, (byte) -74, pja.field_l);
              this.field_f = true;
            }
          }
          if (param0 >= 42) {
            return;
          }
          this.field_g = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("bma.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_n = 16;
        field_o = 0;
    }
}
