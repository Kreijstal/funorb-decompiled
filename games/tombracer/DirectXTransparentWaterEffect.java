/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXTransparentWaterEffect extends ShaderEffect {
    private jagdx.IDirect3DVertexShader field_f;
    private static float[] field_d;
    private hk field_g;
    private Direct3DToolkit field_e;

    final void disable(int param0) {
        this.field_e.a((jagdx.IDirect3DVertexShader) null, -1);
        this.owner.a(ej.field_c, 0, -54);
        this.owner.a(tla.field_c, 1, -56);
        this.owner.a(pea.field_c, 2, -116);
        if (param0 <= -4) {
          this.owner.a((byte) 51, true);
          return;
        }
    }

    final boolean isSupported(int param0) {
        if (param0 == 1185) {
          return this.field_f != null ? true : false;
        }
        this.setParameters((byte) -57, 54, -28);
        return this.field_f != null ? true : false;
    }

    final void onViewMatrixChanged(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        if (null != this.field_f) {
          var2 = this.field_e.field_jd;
          var3 = this.field_e.n((byte) 95);
          var2.setVertexShaderConstantF(0, var3.writeRowMajor4x4(false, field_d));
        }
        if (param0 == 107) {
          return;
        }
        GpuTexture var4 = (GpuTexture) null;
        this.bindTexture(-5, (GpuTexture) null, 86);
    }

    final void onProjectionChanged(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (null != this.field_f) {
          var2 = this.field_e.field_jd;
          var2.setVertexShaderConstantF(4, this.owner.writeTransposedProjection(field_d, false));
        }
        if (param0 >= 64) {
          return;
        }
        this.onViewMatrixChanged((byte) -60);
    }

    final void onTextureMatrixChanged(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        if (null != this.field_f) {
          var2 = this.field_e.field_jd;
          var3 = this.owner.textureTransform((byte) 113);
          var3.writeFirstTwoRows(field_d, -101);
          field_d[3] = field_d[3] * 0.25f;
          field_d[6] = field_d[6] * 0.25f;
          field_d[5] = field_d[5] * 0.25f;
          field_d[4] = field_d[4] * 0.25f;
          field_d[1] = field_d[1] * 0.25f;
          field_d[7] = field_d[7] * 0.25f;
          field_d[2] = field_d[2] * 0.25f;
          field_d[0] = field_d[0] * 0.25f;
          var2.SetVertexShaderConstantF(8, field_d, 2);
        }
        if (param0) {
          return;
        }
        this.setParameters((byte) 6, -79, -56);
    }

    final void bindTexture(int param0, GpuTexture param1, int param2) {
        if (param2 != 24595) {
          field_d = (float[]) null;
        }
    }

    final void onModelMatrixChanged(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        if (null != this.field_f) {
          var2 = this.field_e.field_jd;
          var3 = this.field_e.n((byte) -86);
          var2.setVertexShaderConstantF(0, var3.writeRowMajor4x4(false, field_d));
        }
        if (param0) {
          return;
        }
        this.onModelMatrixChanged(true);
    }

    final void setParameters(byte param0, int param1, int param2) {
        jagdx.IDirect3DDevice var7 = null;
        float var5_float = 0.0f;
        int var5 = 0;
        float var5_floatLifetime1;
        int var5Lifetime1;
        if (param0 == 55) {
          var7 = this.field_e.field_jd;
          if (this.field_g.field_g) {
            var5_float = (float)(this.owner.field_Dc % 4000) / 4000.0f;
            this.owner.bindTexture(true, this.field_g.field_c);
            var7.setVertexShaderConstantF(11, var5_float, 0.0f, 0.0f, 0.0f);
          } else {
            var5 = 16 * (this.owner.field_Dc % 4000) / 4000;
            this.owner.bindTexture(true, this.field_g.field_d[var5]);
            var7.setVertexShaderConstantF(11, 0.0f, 0.0f, 0.0f, 0.0f);
          }
          return;
        }
        field_d = (float[]) null;
        jagdx.IDirect3DDevice var6 = this.field_e.field_jd;
        if (this.field_g.field_g) {
          var5_floatLifetime1 = (float)(this.owner.field_Dc % 4000) / 4000.0f;
          this.owner.bindTexture(true, this.field_g.field_c);
          var6.setVertexShaderConstantF(11, var5_floatLifetime1, 0.0f, 0.0f, 0.0f);
        } else {
          var5Lifetime1 = 16 * (this.owner.field_Dc % 4000) / 4000;
          this.owner.bindTexture(true, this.field_g.field_d[var5Lifetime1]);
          var6.setVertexShaderConstantF(11, 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    final void refreshState(boolean param0, int param1) {
        this.owner.setTextureCombineOperations(NormalMapOperator.field_m, (byte) -110, r.field_m);
        if (param1 != 5744) {
          GpuTexture var4 = (GpuTexture) null;
          this.bindTexture(-56, (GpuTexture) null, 109);
        }
    }

    final void onFogChanged(boolean param0) {
        jagdx.IDirect3DDevice var7 = null;
        jagdx.IDirect3DDevice var6 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var3Lifetime1;
        float var4Lifetime1;
        float var5Lifetime1;
        if (param0) {
          if (this.field_f == null) {
          } else {
            var7 = this.field_e.field_jd;
            if (0 >= this.owner.field_J) {
              var7.setVertexShaderConstantF(10, 0.0f, 0.0f, 0.0f, 0.0f);
            } else {
              var3 = this.owner.field_Hc;
              var4 = this.owner.field_B;
              var5 = -512.0f + var4;
              var7.setVertexShaderConstantF(10, var5, 1.0f / (-var5 + var4), var4, 1.0f / (var3 - var4));
            }
            this.owner.g(3625, this.owner.field_g);
          }
          return;
        }
        this.onFogChanged(false);
        if (this.field_f == null) {
        } else {
          var6 = this.field_e.field_jd;
          if (0 >= this.owner.field_J) {
            var6.setVertexShaderConstantF(10, 0.0f, 0.0f, 0.0f, 0.0f);
          } else {
            var3Lifetime1 = this.owner.field_Hc;
            var4Lifetime1 = this.owner.field_B;
            var5Lifetime1 = -512.0f + var4Lifetime1;
            var6.setVertexShaderConstantF(10, var5Lifetime1, 1.0f / (-var5Lifetime1 + var4Lifetime1), var4Lifetime1, 1.0f / (var3Lifetime1 - var4Lifetime1));
          }
          this.owner.g(3625, this.owner.field_g);
        }
    }

    DirectXTransparentWaterEffect(Direct3DToolkit param0, ResourceArchive param1, hk param2) {
        super(param0);
        this.field_g = param2;
        this.field_e = param0;
        if (param1 != null &&
          this.field_g.c(-30634) &&
          (65535 & this.field_e.field_ld.VertexShaderVersion) >= 257) {
          this.field_f = this.field_e.field_jd.createVertexShader(param1.getFileByName("dx", (byte) 114, "transparent_water"));
        } else {
          this.field_f = null;
        }
    }

    final void enable(int param0, boolean param1) {
        this.owner.a(ej.field_c, 0, -100);
        this.owner.a(pea.field_c, 1, -21);
        this.owner.a(tla.field_c, 2, -6219, false, true);
        this.owner.a((byte) 77, false);
        this.field_e.a(this.field_f, -1);
        this.onViewMatrixChanged((byte) 107);
        this.onTextureMatrixChanged(true);
        this.onProjectionChanged(77);
        int var3 = 91 % ((param0 - 41) / 62);
        this.onFogChanged(true);
    }

    static {
        field_d = new float[16];
    }
}
