/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXEnvironmentWaterEffect extends ShaderEffect {
    private WaterTextureResources field_k;
    private DirectXGraphicsToolkit field_h;
    private static float[] field_f;
    private boolean field_j;
    private jagdx.IDirect3DPixelShader field_i;
    private boolean field_e;
    private jagdx.IDirect3DVertexShader field_g;

    final void setParameters(int guard, int parameters1, int parameters0) {
        jagdx.IDirect3DDevice var4 = null;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        if (this.field_e) {
          var4 = this.field_h.field_Cc;
          var5 = 1 << (3 & parameters0);
          var6 = (float)(1 << ((parameters0 & 59) >> 3)) / 32.0f;
          var7 = 65535 & parameters1;
          var4.setVertexShaderConstant(14, (float)(this.toolkit.field_kc * var5 % 40000) / 40000.0f, 0.0f, 0.0f, 0.0f);
          var8 = (float)((parameters1 & 199087) >> 16) / 8.0f;
          var4.setVertexShaderConstant(15, var6, 0.0f, 0.0f, 0.0f);
          var4.setPixelShaderConstant(4, (float)var7, 0.0f, 0.0f, 0.0f);
          var4.setPixelShaderConstant(5, var8, 0.0f, 0.0f, 0.0f);
        }
        if (guard == 34023) {
          return;
        }
        this.field_g = (jagdx.IDirect3DVertexShader) null;
    }

    final void updateFogUniforms(int guard) {
        jagdx.IDirect3DDevice var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        if (this.field_e) {
          var2 = this.field_h.field_Cc;
          if (0 >= this.toolkit.field_Kb) {
            var2.setVertexShaderConstant(16, 0.0f, 0.0f, 0.0f, 0.0f);
          } else {
            var3 = this.toolkit.field_Tb;
            var4 = this.toolkit.field_E;
            var2.setVertexShaderConstant(16, var3, 1.0f / (var3 - var4), 0.0f, 0.0f);
          }
          var2.setPixelShaderConstant(0, (float)(255 & this.toolkit.field_C >> 16) / 255.0f, (float)((65348 & this.toolkit.field_C) >> 8) / 255.0f, (float)(255 & this.toolkit.field_C) / 255.0f, 0.0f);
        }
        if (guard == 260) {
          return;
        }
        this.field_g = (jagdx.IDirect3DVertexShader) null;
    }

    final void updateProjectionUniforms(boolean guard) {
        jagdx.IDirect3DDevice var2 = null;
        if (!guard) {
          if (this.field_e) {
            var2 = this.field_h.field_Cc;
            var2.setVertexShaderConstants(8, this.toolkit.writeTransposedProjection(-82, field_f));
          }
          return;
        }
    }

    final void updateViewUniforms(byte guard) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        AffineTransform3D var3Lifetime1;
        if (guard >= 0) {
          if (this.field_e) {
            var2 = this.field_h.field_Cc;
            var3 = this.field_h.modelViewTransform((byte) 107);
            var2.setVertexShaderConstants(0, var3.writeRowMajor4x4(0, field_f));
          }
          return;
        }
        this.setParameters(-80, 91, -81);
        if (this.field_e) {
          var2Lifetime1 = this.field_h.field_Cc;
          var3Lifetime1 = this.field_h.modelViewTransform((byte) 107);
          var2Lifetime1.setVertexShaderConstants(0, var3Lifetime1.writeRowMajor4x4(0, field_f));
        }
    }

    final boolean isSupported(byte guard) {
        if (guard > -8) {
          this.field_h = (DirectXGraphicsToolkit) null;
          return this.field_j;
        }
        return this.field_j;
    }

    final void disable(boolean guard) {
        if (this.field_e) {
          this.field_h.bindVertexShader(-54, (jagdx.IDirect3DVertexShader) null);
          this.field_h.bindPixelShader((byte) 10, (jagdx.IDirect3DPixelShader) null);
          this.toolkit.setActiveTextureUnit(1, -115);
          this.toolkit.bindTexture((GpuTexture) null, 97);
          this.toolkit.setActiveTextureUnit(0, -119);
          this.toolkit.bindTexture((GpuTexture) null, 98);
          this.field_e = false;
        }
        if (!guard) {
          return;
        }
        field_f = (float[]) null;
    }

    final void enable(boolean lighting, int guard) {
        jagdx.IDirect3DDevice var4 = null;
        CubeTexture var3 = this.toolkit.environmentCubeTexture((byte) 122);
        if (guard == 20186) {
          if (this.field_j &&
            var3 != null) {
            var4 = this.field_h.field_Cc;
            this.field_h.bindVertexShader(-73, this.field_g);
            this.field_h.bindPixelShader((byte) -101, this.field_i);
            this.toolkit.setActiveTextureUnit(1, guard - 20310);
            this.toolkit.bindTexture(var3, 99);
            this.toolkit.setActiveTextureUnit(0, -123);
            this.toolkit.bindTexture(this.field_k.normalMap, 108);
            this.field_e = true;
            this.updateTransformUniforms(guard ^ -20215);
            this.updateTextureUniforms((byte) -65);
            this.updateProjectionUniforms(false);
            this.updateFogUniforms(260);
            var4.setPixelShaderConstant(1, -this.toolkit.field_G[0], -this.toolkit.field_G[1], -this.toolkit.field_G[2], 0.0f);
            var4.setPixelShaderConstant(2, this.toolkit.field_J, this.toolkit.field_jb, this.toolkit.field_Xb, 1.0f);
            var4.setPixelShaderConstant(3, Math.abs(this.toolkit.field_G[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
          }
          return;
        }
    }

    final void bindTexture(int combineMode, int guard, GpuTexture texture) {
        if (guard != 18834) {
          this.field_i = (jagdx.IDirect3DPixelShader) null;
        }
    }

    final void updateTransformUniforms(int guard) {
        jagdx.IDirect3DDevice var2_ref_jagdx_IDirect3DDevice = null;
        AffineTransform3D var3 = null;
        AffineTransform3D var4 = null;
        if (this.field_e) {
          var2_ref_jagdx_IDirect3DDevice = this.field_h.field_Cc;
          var3 = this.field_h.viewTransform((byte) -28);
          var4 = this.field_h.modelViewTransform((byte) 106);
          var2_ref_jagdx_IDirect3DDevice.setVertexShaderConstants(0, var4.writeRowMajor4x4(0, field_f));
          var2_ref_jagdx_IDirect3DDevice.setVertexShaderConstants(4, var3.writeLinearRowMajor4x4(field_f, (byte) 86));
        }
        int var2 = 49 / ((guard - 41) / 46);
    }

    final void updateTextureUniforms(byte guard) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        if (guard < -47) {
          if (this.field_e) {
            var2 = this.field_h.field_Cc;
            var3 = this.toolkit.currentTextureTransform(26453);
            var2.SetVertexShaderConstantF(12, var3.writeFirstTwoRows(field_f, (byte) -37), 2);
          }
          return;
        }
    }

    final void refreshState(boolean lighting, byte guard) {
        if (guard >= -71) {
          GpuTexture var4 = (GpuTexture) null;
          this.bindTexture(50, 2, (GpuTexture) null);
        }
    }

    DirectXEnvironmentWaterEffect(DirectXGraphicsToolkit param0, ResourceArchive param1, WaterTextureResources param2) {
        super(param0);
        boolean stackIn_14_1 = false;
        this.field_k = param2;
        this.field_h = param0;
        if (param1 == null) {
          this.field_g = null;
          this.field_i = null;
          this.field_j = false;
          return;
        }
        if (!this.toolkit.field_W) {
          this.field_g = null;
          this.field_i = null;
          this.field_j = false;
          return;
        }
        if (!this.toolkit.field_Eb) {
          this.field_g = null;
          this.field_i = null;
          this.field_j = false;
          return;
        }
        if ((this.field_h.field_Kc.VertexShaderVersion & 65535) < 257) {
          this.field_g = null;
          this.field_i = null;
          this.field_j = false;
          return;
        }
        this.field_g = this.field_h.field_Cc.createVertexShader(param1.fetchNamedFile("environment_mapped_water_v", "dx", -1));
        this.field_i = this.field_h.field_Cc.createPixelShader(param1.fetchNamedFile("environment_mapped_water_f", "dx", -1));
        stackIn_14_1 = (null != this.field_g) && (null != this.field_i) && (this.field_k.ensureNormalMap(-123));
        this.field_j = stackIn_14_1;
    }

    static {
        field_f = new float[16];
    }
}
