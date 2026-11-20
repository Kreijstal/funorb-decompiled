/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DTransparentWaterEffect extends GpuMaterialEffect {
    private jagdx.IDirect3DVertexShader field_g;
    private static float[] field_h;
    private WaterTextures field_f;
    private Direct3DToolkit field_e;

    final void onDepthRangeChanged(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var3 = 0.0f;
        if (null != this.field_g) {
          var2 = this.field_e.device;
          if (this.toolkit.field_j > 0) {
            var3 = this.toolkit.field_r;
            var4 = this.toolkit.field_p;
            var5 = var4 - 512.0f;
            var2.setVertexShaderConstant(10, var5, 1.0f / (var4 - var5), var4, 1.0f / (-var4 + var3));
          } else {
            var2.setVertexShaderConstant(10, 0.0f, 0.0f, 0.0f, 0.0f);
          }
          this.toolkit.setTextureConstantColor(-126, this.toolkit.field_lc);
        }
        if (param0) {
          return;
        }
        this.field_g = (jagdx.IDirect3DVertexShader) null;
    }

    final boolean isSupported(byte param0) {
        int var2 = -120 / ((34 - param0) / 63);
        return this.field_g != null ? true : false;
    }

    final void onProjectionChanged(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (this.field_g != null) {
          var2 = this.field_e.device;
          var2.setVertexShaderConstants(4, this.toolkit.writeTransposedProjection(108, field_h));
        }
        if (param0) {
          return;
        }
        this.field_e = (Direct3DToolkit) null;
    }

    Direct3DTransparentWaterEffect(Direct3DToolkit param0, ResourceArchive param1, WaterTextures param2) {
        super(param0);
        this.field_f = param2;
        this.field_e = param0;
        if (param1 != null &&
          this.field_f.hasNoiseTextures((byte) 60) &&
          (65535 & this.field_e.field_Hc.VertexShaderVersion) >= 257) {
          this.field_g = this.field_e.device.createVertexShader(param1.fetchNamedFile("transparent_water", true, "dx"));
        } else {
          this.field_g = null;
        }
    }

    final void onTextureTransformChanged(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        GpuTransform3D var3 = null;
        if (null != this.field_g) {
          var2 = this.field_e.device;
          var3 = this.toolkit.getTextureTransform(0);
          var3.writeFirstTwoRows((byte) 105, field_h);
          field_h[7] = field_h[7] * 0.25f;
          field_h[4] = field_h[4] * 0.25f;
          field_h[6] = field_h[6] * 0.25f;
          field_h[0] = field_h[0] * 0.25f;
          field_h[5] = field_h[5] * 0.25f;
          field_h[3] = field_h[3] * 0.25f;
          field_h[1] = field_h[1] * 0.25f;
          field_h[2] = field_h[2] * 0.25f;
          var2.SetVertexShaderConstantF(8, field_h, 2);
        }
        if (param0 == 8) {
          return;
        }
        this.enable(-22, false);
    }

    final void disable(int param0) {
        this.field_e.setVertexShader(0, (jagdx.IDirect3DVertexShader) null);
        this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
        if (param0 == 2543) {
          this.toolkit.setRgbCombineSource(1, GetArmageddonLength.field_q, 7);
          this.toolkit.setRgbCombineSource(2, PlayerContextMenus.field_d, 7);
          this.toolkit.setEffectFogEnabled(true, false);
          return;
        }
        this.field_g = (jagdx.IDirect3DVertexShader) null;
        this.toolkit.setRgbCombineSource(1, GetArmageddonLength.field_q, 7);
        this.toolkit.setRgbCombineSource(2, PlayerContextMenus.field_d, 7);
        this.toolkit.setEffectFogEnabled(true, false);
    }

    final void applyRenderState(int param0, boolean param1) {
        this.toolkit.setTextureCombineOperations(GpuQuadBuffers.field_c, true, SetThrusterBindingMoveAndTurnHasOppositeMove.field_o);
        if (param0 != 5) {
          this.onViewTransformChanged((byte) 107);
        }
    }

    final void onModelTransformChanged(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        GpuTransform3D var3 = null;
        if (this.field_g != null) {
          var2 = this.field_e.device;
          var3 = this.field_e.getModelViewTransform(0);
          var2.setVertexShaderConstants(0, var3.writeRowMajorMatrix(field_h, (byte) 22));
        }
        if (param0 == 5) {
          return;
        }
        field_h = (float[]) null;
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        if (param0 < 42) {
          field_h = (float[]) null;
        }
    }

    final void onViewTransformChanged(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        GpuTransform3D var3 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        GpuTransform3D var3Lifetime1;
        if (param0 == 15) {
          if (null != this.field_g) {
            var2 = this.field_e.device;
            var3 = this.field_e.getModelViewTransform(0);
            var2.setVertexShaderConstants(0, var3.writeRowMajorMatrix(field_h, (byte) 22));
          }
          return;
        }
        this.field_f = (WaterTextures) null;
        if (null != this.field_g) {
          var2Lifetime1 = this.field_e.device;
          var3Lifetime1 = this.field_e.getModelViewTransform(0);
          var2Lifetime1.setVertexShaderConstants(0, var3Lifetime1.writeRowMajorMatrix(field_h, (byte) 22));
        }
    }

    final void setParameters(int param0, int param1, int param2) {
        jagdx.IDirect3DDevice var7 = null;
        float var5_float = 0.0f;
        int var5 = 0;
        float var5_floatLifetime1;
        int var5Lifetime1;
        if (param2 == 5) {
          var7 = this.field_e.device;
          if (this.field_f.usesVolumeTexture) {
            var5_float = (float)(this.toolkit.field_pc % 4000) / 4000.0f;
            this.toolkit.setTexture(this.field_f.noiseVolume, -124);
            var7.setVertexShaderConstant(11, var5_float, 0.0f, 0.0f, 0.0f);
          } else {
            var5 = 16 * (this.toolkit.field_pc % 4000) / 4000;
            this.toolkit.setTexture(this.field_f.noiseFrames[var5], param2 - 127);
            var7.setVertexShaderConstant(11, 0.0f, 0.0f, 0.0f, 0.0f);
          }
          return;
        }
        this.disable(-112);
        jagdx.IDirect3DDevice var6 = this.field_e.device;
        if (this.field_f.usesVolumeTexture) {
          var5_floatLifetime1 = (float)(this.toolkit.field_pc % 4000) / 4000.0f;
          this.toolkit.setTexture(this.field_f.noiseVolume, -124);
          var6.setVertexShaderConstant(11, var5_floatLifetime1, 0.0f, 0.0f, 0.0f);
        } else {
          var5Lifetime1 = 16 * (this.toolkit.field_pc % 4000) / 4000;
          this.toolkit.setTexture(this.field_f.noiseFrames[var5Lifetime1], param2 - 127);
          var6.setVertexShaderConstant(11, 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    final void enable(int param0, boolean param1) {
        this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, param0 + 2);
        this.toolkit.setRgbCombineSource(1, PlayerContextMenus.field_d, 7);
        this.toolkit.setRgbCombineSource(false, -21115, true, GetArmageddonLength.field_q, 2);
        this.toolkit.setEffectFogEnabled(false, false);
        this.field_e.setVertexShader(0, this.field_g);
        this.onModelTransformChanged(param0);
        this.onTextureTransformChanged(8);
        this.onProjectionChanged(true);
        this.onDepthRangeChanged(true);
    }

    static {
        field_h = new float[16];
    }
}
