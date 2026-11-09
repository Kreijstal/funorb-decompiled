/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXTransparentWaterEffect extends ShaderEffect {
    private static float[] field_g;
    private jagdx.IDirect3DVertexShader field_e;
    private WaterTextureResources field_h;
    private DirectXGraphicsToolkit field_f;

    final void disable(boolean guard) {
        this.field_f.a(-103, (jagdx.IDirect3DVertexShader) null);
        this.toolkit.setColorCombineSource(LegacyVertexAttribute.TEXTURE, 0, 0);
        if (!guard) {
          this.toolkit.setColorCombineSource(NetworkResourceRequest.PRIMARY_COLOR, 1, 0);
          this.toolkit.setColorCombineSource(AccountRequestState.CONSTANT, 2, 0);
          this.toolkit.setFogEnabled(0, true);
          return;
        }
    }

    final void setParameters(int guard, int parameters1, int parameters0) {
        jagdx.IDirect3DDevice var7 = null;
        float var5_float = 0.0f;
        int var5 = 0;
        float var5_floatLifetime1;
        int var5Lifetime1;
        if (guard == 34023) {
          var7 = this.field_f.field_Cc;
          if (this.field_h.useVolumeTextures) {
            var5_float = (float)(this.toolkit.field_kc % 4000) / 4000.0f;
            this.toolkit.a(this.field_h.animatedVolume, 114);
            var7.b(11, var5_float, 0.0f, 0.0f, 0.0f);
          } else {
            var5 = 16 * (this.toolkit.field_kc % 4000) / 4000;
            this.toolkit.a(this.field_h.animatedSlices[var5], guard ^ 33939);
            var7.b(11, 0.0f, 0.0f, 0.0f, 0.0f);
          }
          return;
        }
        this.field_f = (DirectXGraphicsToolkit) null;
        jagdx.IDirect3DDevice var6 = this.field_f.field_Cc;
        if (this.field_h.useVolumeTextures) {
          var5_floatLifetime1 = (float)(this.toolkit.field_kc % 4000) / 4000.0f;
          this.toolkit.a(this.field_h.animatedVolume, 114);
          var6.b(11, var5_floatLifetime1, 0.0f, 0.0f, 0.0f);
        } else {
          var5Lifetime1 = 16 * (this.toolkit.field_kc % 4000) / 4000;
          this.toolkit.a(this.field_h.animatedSlices[var5Lifetime1], guard ^ 33939);
          var6.b(11, 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    final boolean isSupported(byte guard) {
        if (guard <= -8) {
          return null != this.field_e ? true : false;
        }
        this.disable(false);
        return null != this.field_e ? true : false;
    }

    final void refreshState(boolean lighting, byte guard) {
        this.toolkit.a((byte) -83, LoginForm.ADD, OpenGlBuffer.INTERPOLATE);
        if (guard >= -71) {
          field_g = (float[]) null;
        }
    }

    final void updateViewUniforms(byte guard) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        if (this.field_e != null) {
          var2 = this.field_f.field_Cc;
          var3 = this.field_f.modelViewTransform((byte) 126);
          var2.a(0, var3.writeRowMajor4x4(0, field_g));
        }
        if (guard > 0) {
          return;
        }
        this.updateTextureUniforms((byte) 126);
    }

    final void updateTextureUniforms(byte guard) {
        jagdx.IDirect3DDevice var7 = null;
        AffineTransform3D var6 = null;
        jagdx.IDirect3DDevice var5 = null;
        AffineTransform3D var4 = null;
        if (guard < -47) {
          if (this.field_e != null) {
            var7 = this.field_f.field_Cc;
            var6 = this.toolkit.currentTextureTransform(26453);
            var6.writeFirstTwoRows(field_g, (byte) -37);
            field_g[2] = field_g[2] * 0.25f;
            field_g[3] = field_g[3] * 0.25f;
            field_g[5] = field_g[5] * 0.25f;
            field_g[4] = field_g[4] * 0.25f;
            field_g[7] = field_g[7] * 0.25f;
            field_g[1] = field_g[1] * 0.25f;
            field_g[0] = field_g[0] * 0.25f;
            field_g[6] = field_g[6] * 0.25f;
            var7.SetVertexShaderConstantF(8, field_g, 2);
          }
          return;
        }
        this.disable(false);
        if (this.field_e != null) {
          var5 = this.field_f.field_Cc;
          var4 = this.toolkit.currentTextureTransform(26453);
          var4.writeFirstTwoRows(field_g, (byte) -37);
          field_g[2] = field_g[2] * 0.25f;
          field_g[3] = field_g[3] * 0.25f;
          field_g[5] = field_g[5] * 0.25f;
          field_g[4] = field_g[4] * 0.25f;
          field_g[7] = field_g[7] * 0.25f;
          field_g[1] = field_g[1] * 0.25f;
          field_g[0] = field_g[0] * 0.25f;
          field_g[6] = field_g[6] * 0.25f;
          var5.SetVertexShaderConstantF(8, field_g, 2);
        }
    }

    final void bindTexture(int combineMode, int guard, GpuTexture texture) {
        if (guard != 18834) {
          this.field_f = (DirectXGraphicsToolkit) null;
        }
    }

    DirectXTransparentWaterEffect(DirectXGraphicsToolkit param0, ResourceArchive param1, WaterTextureResources param2) {
        super(param0);
        this.field_f = param0;
        this.field_h = param2;
        if (param1 != null &&
          this.field_h.hasAnimatedTextures(41) &&
          257 <= (65535 & this.field_f.field_Kc.VertexShaderVersion)) {
          this.field_e = this.field_f.field_Cc.a(param1.fetchNamedFile("transparent_water", "dx", -1));
        } else {
          this.field_e = null;
        }
    }

    final void updateProjectionUniforms(boolean guard) {
        jagdx.IDirect3DDevice var2 = null;
        if (this.field_e != null) {
          var2 = this.field_f.field_Cc;
          var2.a(4, this.toolkit.a(-105, field_g));
        }
        if (!guard) {
          return;
        }
        this.isSupported((byte) -103);
    }

    final void updateTransformUniforms(int guard) {
        jagdx.IDirect3DDevice var2_ref_jagdx_IDirect3DDevice = null;
        AffineTransform3D var3 = null;
        if (this.field_e != null) {
          var2_ref_jagdx_IDirect3DDevice = this.field_f.field_Cc;
          var3 = this.field_f.modelViewTransform((byte) 69);
          var2_ref_jagdx_IDirect3DDevice.a(0, var3.writeRowMajor4x4(0, field_g));
        }
        int var2 = 67 % ((41 - guard) / 46);
    }

    final void enable(boolean lighting, int guard) {
        this.toolkit.setColorCombineSource(LegacyVertexAttribute.TEXTURE, 0, 0);
        this.toolkit.setColorCombineSource(AccountRequestState.CONSTANT, 1, 0);
        this.toolkit.setColorCombineSource((byte) -125, 2, false, true, NetworkResourceRequest.PRIMARY_COLOR);
        this.toolkit.setFogEnabled(0, false);
        if (guard == 20186) {
          this.field_f.a(-51, this.field_e);
          this.updateViewUniforms((byte) 40);
          this.updateTextureUniforms((byte) -83);
          this.updateProjectionUniforms(false);
          this.updateFogUniforms(260);
          return;
        }
        this.field_f = (DirectXGraphicsToolkit) null;
        this.field_f.a(-51, this.field_e);
        this.updateViewUniforms((byte) 40);
        this.updateTextureUniforms((byte) -83);
        this.updateProjectionUniforms(false);
        this.updateFogUniforms(260);
    }

    final void updateFogUniforms(int guard) {
        jagdx.IDirect3DDevice var2 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var3 = 0.0f;
        if (null != this.field_e) {
          var2 = this.field_f.field_Cc;
          if (this.toolkit.field_Kb > 0) {
            var3 = this.toolkit.field_Tb;
            var4 = this.toolkit.field_E;
            var5 = -512.0f + var4;
            var2.b(10, var5, 1.0f / (-var5 + var4), var4, 1.0f / (var3 - var4));
          } else {
            var2.b(10, 0.0f, 0.0f, 0.0f, 0.0f);
          }
          this.toolkit.setTextureConstantColor(false, this.toolkit.field_C);
        }
        if (guard == 260) {
          return;
        }
        this.updateTransformUniforms(36);
    }

    static {
        field_g = new float[16];
    }
}
