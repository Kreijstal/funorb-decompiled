/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXUnderwaterEffect extends ShaderEffect {
    private static float[] field_h;
    private jagdx.IDirect3DVertexShader field_n;
    private jagdx.IDirect3DVertexShader field_f;
    private jagdx.IDirect3DVertexShader field_j;
    private jagdx.IDirect3DVertexShader field_m;
    private boolean field_g;
    private static float[] field_k;
    private boolean field_o;
    private boolean field_e;
    private Texture2D field_i;
    private jagdx.IDirect3DVertexShader field_p;
    private DirectXGraphicsToolkit field_l;

    final void updateProjectionUniforms(boolean guard) {
        jagdx.IDirect3DDevice var2 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        if (!guard) {
          if (null != this.field_j) {
            var2 = this.field_l.field_Cc;
            var2.a(4, this.toolkit.a(-52, field_h));
          }
          return;
        }
        this.field_o = false;
        if (null != this.field_j) {
          var2Lifetime1 = this.field_l.field_Cc;
          var2Lifetime1.a(4, this.toolkit.a(-52, field_h));
        }
    }

    final void enable(boolean lighting, int guard) {
        this.field_o = lighting ? true : false;
        this.toolkit.g(1, guard - 20312);
        this.toolkit.a(this.field_i, guard - 20076);
        this.toolkit.a((byte) -83, lf.REPLACE, OpenGlBuffer.INTERPOLATE);
        this.toolkit.a(AccountRequestState.CONSTANT, 0, guard ^ guard);
        this.toolkit.setColorCombineSource((byte) 89, 2, true, false, LegacyVertexAttribute.TEXTURE);
        this.toolkit.a(FontMetrics.PREVIOUS, 0, true);
        this.toolkit.g(0, guard - 20311);
        this.d(-86);
    }

    final void disable(boolean guard) {
        this.toolkit.g(1, -121);
        this.toolkit.a((GpuTexture) null, 100);
        this.toolkit.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
        this.toolkit.a(LegacyVertexAttribute.TEXTURE, 0, 0);
        if (guard) {
          this.setParameters(-69, 14, -105);
          this.toolkit.a(AccountRequestState.CONSTANT, 2, 0);
          this.toolkit.a(LegacyVertexAttribute.TEXTURE, 0, true);
          this.toolkit.g(0, -109);
          if (!this.field_e) {
            if (null == this.field_j) {
              return;
            }
            this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
            this.field_j = null;
            return;
          }
          this.toolkit.a(LegacyVertexAttribute.TEXTURE, 0, 0);
          this.toolkit.a(LegacyVertexAttribute.TEXTURE, 0, true);
          this.field_e = false;
          if (null != this.field_j) {
            this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
            this.field_j = null;
            return;
          }
          return;
        }
        this.toolkit.a(AccountRequestState.CONSTANT, 2, 0);
        this.toolkit.a(LegacyVertexAttribute.TEXTURE, 0, true);
        this.toolkit.g(0, -109);
        if (this.field_e) {
          this.toolkit.a(LegacyVertexAttribute.TEXTURE, 0, 0);
          this.toolkit.a(LegacyVertexAttribute.TEXTURE, 0, true);
          this.field_e = false;
          if (null == this.field_j) {
            return;
          }
          this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
          this.field_j = null;
          return;
        }
        if (null == this.field_j) {
          return;
        }
        this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
        this.field_j = null;
    }

    final boolean isSupported(byte guard) {
        if (guard >= -8) {
          return true;
        }
        return this.field_g;
    }

    final void setParameters(int guard, int parameters1, int parameters0) {
        if (guard != 34023) {
          this.field_g = true;
        }
    }

    final void updateTransformUniforms(int guard) {
        jagdx.IDirect3DDevice var2_ref_jagdx_IDirect3DDevice = null;
        AffineTransform3D var3 = null;
        if (null != this.field_j) {
          var2_ref_jagdx_IDirect3DDevice = this.field_l.field_Cc;
          var3 = this.field_l.k((byte) 67);
          var2_ref_jagdx_IDirect3DDevice.a(0, var3.writeRowMajor4x4(0, field_h));
        }
        int var2 = -118 % ((41 - guard) / 46);
    }

    final void updateViewUniforms(byte guard) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        AffineTransform3D var3Lifetime1;
        if (guard > 0) {
          if (this.field_j != null) {
            var2 = this.field_l.field_Cc;
            var3 = this.field_l.k((byte) 122);
            var2.a(0, var3.writeRowMajor4x4(0, field_h));
          }
          return;
        }
        this.field_i = (Texture2D) null;
        if (this.field_j != null) {
          var2Lifetime1 = this.field_l.field_Cc;
          var3Lifetime1 = this.field_l.k((byte) 122);
          var2Lifetime1.a(0, var3Lifetime1.writeRowMajor4x4(0, field_h));
        }
    }

    private final void d(int param0) {
        jagdx.IDirect3DVertexShader var2 = null;
        int var5 = -19 % ((-23 - param0) / 63);
        jagdx.IDirect3DDevice var3 = this.field_l.field_Cc;
        int var4 = this.toolkit.M(-66);
        AffineTransform3D var6 = this.toolkit.g((byte) -28);
        if (this.field_o) {
          var2 = var4 != 2147483647 ? this.field_m : this.field_n;
        } else {
          var2 = var4 != 2147483647 ? this.field_p : this.field_f;
        }
        if (this.field_j == var2) {
          var6.transformPlane(0.0f, field_k, (byte) -86, 0.0f, -1.0f, (float)var4);
          var3.a(12, field_k);
          return;
        }
        this.field_j = var2;
        this.field_l.a(-116, var2);
        this.e(82);
        this.updateProjectionUniforms(false);
        this.updateTextureUniforms((byte) -72);
        this.updateViewUniforms((byte) 53);
        this.updateTransformUniforms(121);
        this.updateFogUniforms(260);
        var6.transformPlane(0.0f, field_k, (byte) -86, 0.0f, -1.0f, (float)var4);
        var3.a(12, field_k);
    }

    final void bindTexture(int combineMode, int guard, GpuTexture texture) {
        if (guard != 18834) {
          return;
        }
        if (texture != null) {
          if (this.field_e) {
            this.toolkit.a(LegacyVertexAttribute.TEXTURE, 0, 0);
            this.toolkit.a(LegacyVertexAttribute.TEXTURE, 0, true);
            this.field_e = false;
          }
          this.toolkit.a(texture, guard ^ 18892);
          this.toolkit.h(guard - 18757, combineMode);
          return;
        }
        if (!this.field_e) {
          this.toolkit.a(this.toolkit.field_D, guard ^ 18939);
          this.toolkit.h(guard - 18771, 1);
          this.toolkit.a(FontMetrics.PREVIOUS, 0, guard ^ 18834);
          this.toolkit.a(FontMetrics.PREVIOUS, 0, true);
          this.field_e = true;
          return;
        }
    }

    final void updateFogUniforms(int guard) {
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        jagdx.IDirect3DDevice var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        float var5Lifetime1;
        float var6Lifetime1;
        if (guard == 260) {
          if (null != this.field_j) {
            var2 = this.field_l.field_Cc;
            var3 = this.toolkit.farPlane();
            var4 = this.toolkit.nearPlane();
            var5 = -((float)(-var4 + var3) * 0.125f) + (float)var3;
            var6 = (float)var3 - 0.25f * (float)(-var4 + var3);
            var2.b(10, var6, 1.0f / (-var6 + var5), var5, 1.0f / ((float)var3 - var5));
            var2.b(11, 1.0f / (float)this.toolkit.S(-102), (float)this.toolkit.e((byte) 26) / 255.0f, this.toolkit.field_Tb, 1.0f / (this.toolkit.field_Tb - this.toolkit.field_E));
            this.toolkit.a(false, this.toolkit.v(15));
          }
          return;
        }
        this.field_o = true;
        if (null != this.field_j) {
          var2Lifetime1 = this.field_l.field_Cc;
          var3Lifetime1 = this.toolkit.farPlane();
          var4Lifetime1 = this.toolkit.nearPlane();
          var5Lifetime1 = -((float)(-var4Lifetime1 + var3Lifetime1) * 0.125f) + (float)var3Lifetime1;
          var6Lifetime1 = (float)var3Lifetime1 - 0.25f * (float)(-var4Lifetime1 + var3Lifetime1);
          var2Lifetime1.b(10, var6Lifetime1, 1.0f / (-var6Lifetime1 + var5Lifetime1), var5Lifetime1, 1.0f / ((float)var3Lifetime1 - var5Lifetime1));
          var2Lifetime1.b(11, 1.0f / (float)this.toolkit.S(-102), (float)this.toolkit.e((byte) 26) / 255.0f, this.toolkit.field_Tb, 1.0f / (this.toolkit.field_Tb - this.toolkit.field_E));
          this.toolkit.a(false, this.toolkit.v(15));
        }
    }

    private final void e(int param0) {
        AffineTransform3D var4 = null;
        jagdx.IDirect3DDevice var3 = null;
        if (this.field_j != null) {
          if (!this.field_o) {
            if (param0 < 3) {
              this.enable(false, -14);
              return;
            }
            return;
          }
          var4 = this.toolkit.c(true);
          AffineTransform3D var2 = var4;
          var3 = this.field_l.field_Cc;
          var3.b(13, this.toolkit.field_T * this.toolkit.field_J, this.toolkit.field_T * this.toolkit.field_jb, this.toolkit.field_Xb * this.toolkit.field_T, 1.0f);
          var3.b(14, this.toolkit.field_J * this.toolkit.field_S, this.toolkit.field_jb * this.toolkit.field_S, this.toolkit.field_Xb * this.toolkit.field_S, 1.0f);
          var3.b(16, this.toolkit.field_hb * this.toolkit.field_J, this.toolkit.field_jb * this.toolkit.field_hb, this.toolkit.field_hb * this.toolkit.field_Xb, 1.0f);
          var4.transformDirection(-1416, this.toolkit.field_G[1], this.toolkit.field_G[0], field_k, this.toolkit.field_G[2]);
          var3.SetVertexShaderConstantF(15, field_k, 1);
          var4.transformDirection(-1416, this.toolkit.field_U[1], this.toolkit.field_U[0], field_k, this.toolkit.field_U[2]);
          var3.SetVertexShaderConstantF(17, field_k, 1);
        }
        if (param0 >= 3) {
          return;
        }
        this.enable(false, -14);
    }

    DirectXUnderwaterEffect(DirectXGraphicsToolkit param0, ResourceArchive param1) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        this.field_e = false;
        this.field_l = param0;
        if (param1 != null &&
          (65535 & this.field_l.field_Kc.VertexShaderVersion) >= 257) {
          this.field_f = this.field_l.field_Cc.a(param1.fetchNamedFile("uw_ground_unlit", "dx", -1));
          this.field_n = this.field_l.field_Cc.a(param1.fetchNamedFile("uw_ground_lit", "dx", -1));
          this.field_p = this.field_l.field_Cc.a(param1.fetchNamedFile("uw_model_unlit", "dx", -1));
          this.field_m = this.field_l.field_Cc.a(param1.fetchNamedFile("uw_model_lit", "dx", -1));
          stackIn_6_0 = (this.field_n == null) ? 0 : 1;
          stackIn_9_1 = (this.field_f == null) ? 0 : 1;
          stackIn_11_0 = stackIn_6_0 & stackIn_9_1;
          stackIn_12_1 = (null == this.field_p) ? 0 : 1;
          stackIn_14_0 = stackIn_11_0 & stackIn_12_1;
          stackIn_15_1 = (null == this.field_m) ? 0 : 1;
          if ((stackIn_14_0 & stackIn_15_1) == 0) {
            this.field_g = false;
          } else {
            this.field_i = this.toolkit.a(new int[]{0, -1}, 1, false, -110, 2);
            this.field_i.setWrap(false, false, true);
            this.field_g = true;
          }
          return;
        }
        this.field_g = false;
    }

    final void refreshState(boolean lighting, byte guard) {
        if (guard >= -71) {
          this.refreshState(true, (byte) -17);
        }
    }

    final void updateTextureUniforms(byte guard) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        if (null != this.field_j) {
          var2 = this.field_l.field_Cc;
          var3 = this.toolkit.H(26453);
          var2.SetVertexShaderConstantF(8, var3.writeFirstTwoRows(field_h, (byte) -37), 2);
        }
        if (guard <= -47) {
          return;
        }
        this.isSupported((byte) 16);
    }

    static {
        field_h = new float[16];
        field_k = new float[4];
    }
}
