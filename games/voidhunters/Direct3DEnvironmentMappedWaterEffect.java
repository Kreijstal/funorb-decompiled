/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DEnvironmentMappedWaterEffect extends GpuMaterialEffect {
    private WaterTextures field_i;
    private jagdx.IDirect3DPixelShader field_h;
    private jagdx.IDirect3DVertexShader field_g;
    private static float[] field_f;
    private boolean field_j;
    private boolean field_k;
    private Direct3DToolkit field_e;

    final void onModelTransformChanged(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        GpuTransform3D var3 = null;
        if (this.field_k) {
          var2 = this.field_e.device;
          var3 = this.field_e.getModelViewTransform(param0 - 5);
          var2.setVertexShaderConstants(0, var3.writeRowMajorMatrix(field_f, (byte) 22));
        }
        if (param0 == 5) {
          return;
        }
        this.field_e = (Direct3DToolkit) null;
    }

    final void disable(int param0) {
        if (param0 == 2543) {
          if (this.field_k) {
            this.field_e.setVertexShader(param0 ^ 2543, (jagdx.IDirect3DVertexShader) null);
            this.field_e.setPixelShader(-123, (jagdx.IDirect3DPixelShader) null);
            this.toolkit.setActiveTextureUnit(1, param0 - 2658);
            this.toolkit.setTexture((GpuTexture) null, param0 ^ -2449);
            this.toolkit.setActiveTextureUnit(0, param0 - 2668);
            this.toolkit.setTexture((GpuTexture) null, -121);
            this.field_k = false;
          }
          return;
        }
        this.onDepthRangeChanged(true);
        if (this.field_k) {
          this.field_e.setVertexShader(param0 ^ 2543, (jagdx.IDirect3DVertexShader) null);
          this.field_e.setPixelShader(-123, (jagdx.IDirect3DPixelShader) null);
          this.toolkit.setActiveTextureUnit(1, param0 - 2658);
          this.toolkit.setTexture((GpuTexture) null, param0 ^ -2449);
          this.toolkit.setActiveTextureUnit(0, param0 - 2668);
          this.toolkit.setTexture((GpuTexture) null, -121);
          this.field_k = false;
        }
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        if (param0 <= 42) {
          this.onProjectionChanged(false);
        }
    }

    final void applyRenderState(int param0, boolean param1) {
        if (param0 != 5) {
          this.field_e = (Direct3DToolkit) null;
        }
    }

    final void enable(int param0, boolean param1) {
        jagdx.IDirect3DDevice var5 = null;
        jagdx.IDirect3DDevice var6 = null;
        GpuCubeTexture var3 = null;
        GpuCubeTexture var3Lifetime1;
        if (param0 != 5) {
          this.field_k = true;
          var3 = this.toolkit.getEnvironmentCubeTexture(10);
          if (this.field_j) {
            if (var3 != null) {
              var5 = this.field_e.device;
              this.field_e.setVertexShader(0, this.field_g);
              this.field_e.setPixelShader(-121, this.field_h);
              this.toolkit.setActiveTextureUnit(1, -88);
              this.toolkit.setTexture(var3, -108);
              this.toolkit.setActiveTextureUnit(0, -99);
              this.toolkit.setTexture(this.field_i.normalMapVolume, param0 ^ -115);
              this.field_k = true;
              this.onViewTransformChanged((byte) 15);
              this.onTextureTransformChanged(8);
              this.onProjectionChanged(true);
              this.onDepthRangeChanged(true);
              var5.setPixelShaderConstant(1, -this.toolkit.sunDirection[0], -this.toolkit.sunDirection[1], -this.toolkit.sunDirection[2], 0.0f);
              var5.setPixelShaderConstant(2, this.toolkit.lightRed, this.toolkit.lightGreen, this.toolkit.lightBlue, 1.0f);
              var5.setPixelShaderConstant(3, Math.abs(this.toolkit.sunDirection[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
            }
            return;
          }
          return;
        }
        var3Lifetime1 = this.toolkit.getEnvironmentCubeTexture(10);
        if (!this.field_j) {
          return;
        }
        if (var3Lifetime1 != null) {
          var6 = this.field_e.device;
          this.field_e.setVertexShader(0, this.field_g);
          this.field_e.setPixelShader(-121, this.field_h);
          this.toolkit.setActiveTextureUnit(1, -88);
          this.toolkit.setTexture(var3Lifetime1, -108);
          this.toolkit.setActiveTextureUnit(0, -99);
          this.toolkit.setTexture(this.field_i.normalMapVolume, param0 ^ -115);
          this.field_k = true;
          this.onViewTransformChanged((byte) 15);
          this.onTextureTransformChanged(8);
          this.onProjectionChanged(true);
          this.onDepthRangeChanged(true);
          var6.setPixelShaderConstant(1, -this.toolkit.sunDirection[0], -this.toolkit.sunDirection[1], -this.toolkit.sunDirection[2], 0.0f);
          var6.setPixelShaderConstant(2, this.toolkit.lightRed, this.toolkit.lightGreen, this.toolkit.lightBlue, 1.0f);
          var6.setPixelShaderConstant(3, Math.abs(this.toolkit.sunDirection[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
          return;
        }
    }

    final void setParameters(int param0, int param1, int param2) {
        jagdx.IDirect3DDevice var4 = null;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        if (this.field_k) {
          var4 = this.field_e.device;
          var5 = 1 << (param1 & 3);
          var6 = (float)(1 << ((62 & param1) >> 3)) / 32.0f;
          var7 = param0 & 65535;
          var8 = (float)((231074 & param0) >> 16) / 8.0f;
          var4.setVertexShaderConstant(14, (float)(this.toolkit.field_pc * var5 % 40000) / 40000.0f, 0.0f, 0.0f, 0.0f);
          var4.setVertexShaderConstant(15, var6, 0.0f, 0.0f, 0.0f);
          var4.setPixelShaderConstant(4, (float)var7, 0.0f, 0.0f, 0.0f);
          var4.setPixelShaderConstant(5, var8, 0.0f, 0.0f, 0.0f);
        }
        if (param2 == 5) {
          return;
        }
        this.onProjectionChanged(true);
    }

    final void onDepthRangeChanged(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        if (param0) {
          if (this.field_k) {
            var2 = this.field_e.device;
            if (0 >= this.toolkit.field_j) {
              var2.setVertexShaderConstant(16, 0.0f, 0.0f, 0.0f, 0.0f);
            } else {
              var3 = this.toolkit.field_r;
              var4 = this.toolkit.field_p;
              var2.setVertexShaderConstant(16, var3, 1.0f / (-var4 + var3), 0.0f, 0.0f);
            }
            var2.setPixelShaderConstant(0, (float)(this.toolkit.field_lc >> 16 & 255) / 255.0f, (float)(this.toolkit.field_lc >> 8 & 255) / 255.0f, (float)(this.toolkit.field_lc & 255) / 255.0f, 0.0f);
          }
          return;
        }
    }

    final void onViewTransformChanged(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        GpuTransform3D var3 = null;
        GpuTransform3D var4 = null;
        if (param0 == 15) {
          if (this.field_k) {
            var2 = this.field_e.device;
            var3 = this.field_e.getViewTransform((byte) 82);
            var4 = this.field_e.getModelViewTransform(0);
            var2.setVertexShaderConstants(0, var4.writeRowMajorMatrix(field_f, (byte) 22));
            var2.setVertexShaderConstants(4, var3.writeRotationCoefficients((byte) -4, field_f));
          }
          return;
        }
    }

    final void onProjectionChanged(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        if (param0) {
          if (this.field_k) {
            var2 = this.field_e.device;
            var2.setVertexShaderConstants(8, this.toolkit.writeTransposedProjection(114, field_f));
          }
          return;
        }
        field_f = (float[]) null;
        if (this.field_k) {
          var2Lifetime1 = this.field_e.device;
          var2Lifetime1.setVertexShaderConstants(8, this.toolkit.writeTransposedProjection(114, field_f));
        }
    }

    final void onTextureTransformChanged(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        GpuTransform3D var3 = null;
        if (this.field_k) {
          var2 = this.field_e.device;
          var3 = this.toolkit.getTextureTransform(0);
          var2.SetVertexShaderConstantF(12, var3.writeFirstTwoRows((byte) 105, field_f), 2);
        }
        if (param0 == 8) {
          return;
        }
        this.field_e = (Direct3DToolkit) null;
    }

    Direct3DEnvironmentMappedWaterEffect(Direct3DToolkit param0, ResourceArchive param1, WaterTextures param2) {
        super(param0);
        boolean stackIn_9_1 = false;
        this.field_e = param0;
        this.field_i = param2;
        if (param1 == null) {
          this.field_h = null;
          this.field_j = false;
          this.field_g = null;
          return;
        }
        if (!this.toolkit.field_vb) {
          this.field_h = null;
          this.field_j = false;
          this.field_g = null;
          return;
        }
        if (!this.toolkit.field_uc) {
          this.field_h = null;
          this.field_j = false;
          this.field_g = null;
          return;
        }
        if ((this.field_e.field_Hc.VertexShaderVersion & 65535) < 257) {
          this.field_h = null;
          this.field_j = false;
          this.field_g = null;
          return;
        }
        this.field_g = this.field_e.device.createVertexShader(param1.fetchNamedFile("environment_mapped_water_v", true, "dx"));
        this.field_h = this.field_e.device.createPixelShader(param1.fetchNamedFile("environment_mapped_water_f", true, "dx"));
        stackIn_9_1 = (null != this.field_g) && (null != this.field_h) && (this.field_i.ensureNormalMap((byte) 107));
        this.field_j = stackIn_9_1;
    }

    final boolean isSupported(byte param0) {
        int var2 = -62 / ((param0 - 34) / 63);
        return this.field_j;
    }

    static {
        field_f = new float[16];
    }
}
