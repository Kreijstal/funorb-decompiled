/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DUnderwaterMaterialEffect extends GpuMaterialEffect {
    private jagdx.IDirect3DVertexShader field_e;
    private jagdx.IDirect3DVertexShader field_g;
    private Direct3DToolkit field_m;
    private jagdx.IDirect3DVertexShader field_h;
    private static float[] field_p;
    private boolean field_f;
    private jagdx.IDirect3DVertexShader field_l;
    private GpuTexture2D field_o;
    private static float[] field_k;
    private jagdx.IDirect3DVertexShader field_i;
    private boolean field_n;
    private boolean field_j;

    final void setParameters(int param0, int param1, int param2) {
        if (param2 != 5) {
          this.field_g = (jagdx.IDirect3DVertexShader) null;
        }
    }

    Direct3DUnderwaterMaterialEffect(Direct3DToolkit param0, ResourceArchive param1) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        this.field_f = false;
        this.field_m = param0;
        if (param1 != null &&
          257 <= (this.field_m.field_Hc.VertexShaderVersion & 65535)) {
          this.field_e = this.field_m.field_Mc.createVertexShader(param1.fetchNamedFile("uw_ground_unlit", true, "dx"));
          this.field_l = this.field_m.field_Mc.createVertexShader(param1.fetchNamedFile("uw_ground_lit", true, "dx"));
          this.field_i = this.field_m.field_Mc.createVertexShader(param1.fetchNamedFile("uw_model_unlit", true, "dx"));
          this.field_g = this.field_m.field_Mc.createVertexShader(param1.fetchNamedFile("uw_model_lit", true, "dx"));
          stackIn_6_0 = (null == this.field_g) ? 0 : 1;
          stackIn_9_1 = (null == this.field_e) ? 0 : 1;
          stackIn_12_2 = (null == this.field_l) ? 0 : 1;
          stackIn_14_1 = stackIn_9_1 & stackIn_12_2;
          stackIn_15_2 = (null == this.field_i) ? 0 : 1;
          if ((stackIn_6_0 & (stackIn_14_1 & stackIn_15_2)) == 0) {
            this.field_n = false;
          } else {
            this.field_o = this.toolkit.createTexture2DFromPixels(2, false, 1, (byte) -48, new int[]{0, -1});
            this.field_o.setRepeat(false, (byte) -98, false);
            this.field_n = true;
          }
          return;
        }
        this.field_n = false;
    }

    final void applyRenderState(int param0, boolean param1) {
        if (param0 != 5) {
          this.field_f = false;
        }
    }

    final void onViewTransformChanged(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        GpuTransform3D var3 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        GpuTransform3D var3Lifetime1;
        if (param0 == 15) {
          if (null != this.field_h) {
            var2 = this.field_m.field_Mc;
            var3 = this.field_m.getModelViewTransform(param0 - 15);
            var2.setVertexShaderConstants(0, var3.writeRowMajorMatrix(field_p, (byte) 22));
          }
          return;
        }
        this.field_l = (jagdx.IDirect3DVertexShader) null;
        if (null != this.field_h) {
          var2Lifetime1 = this.field_m.field_Mc;
          var3Lifetime1 = this.field_m.getModelViewTransform(param0 - 15);
          var2Lifetime1.setVertexShaderConstants(0, var3Lifetime1.writeRowMajorMatrix(field_p, (byte) 22));
        }
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        if (param0 <= 42) {
          return;
        }
        if (param2 == null) {
          if (!this.field_f) {
            this.toolkit.setTexture(this.toolkit.field_Q, -123);
            this.toolkit.setTextureCombineMode(116, 1);
            this.toolkit.setRgbCombineSource(0, SpriteTextureOperation.field_l, 7);
            this.toolkit.setAlphaCombineSource(0, (byte) -91, SpriteTextureOperation.field_l);
            this.field_f = true;
            return;
          }
          return;
        }
        if (this.field_f) {
          this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
          this.toolkit.setAlphaCombineSource(0, (byte) -60, SetGrapplingHookMaxExtension8Force.field_q);
          this.field_f = false;
        } else {
          this.toolkit.setTexture(param2, -106);
          this.toolkit.setTextureCombineMode(75, param1);
          return;
        }
        this.toolkit.setTexture(param2, -106);
        this.toolkit.setTextureCombineMode(75, param1);
    }

    private final void applyUnderwaterShader(byte param0) {
        jagdx.IDirect3DDevice var3 = null;
        int var4 = 0;
        GpuTransform3D var5 = null;
        jagdx.IDirect3DVertexShader var2 = null;
        if (param0 == -46) {
          var3 = this.field_m.field_Mc;
          var4 = this.toolkit.getWaterPlaneDistance((byte) 95);
          var5 = this.toolkit.getViewTransform((byte) 20);
          if (!this.field_j) {
            var2 = 2147483647 == var4 ? this.field_e : this.field_i;
          } else {
            var2 = var4 != 2147483647 ? this.field_g : this.field_l;
          }
          if (var2 != this.field_h) {
            this.field_h = var2;
            this.field_m.a(0, var2);
            this.e(127);
            this.onProjectionChanged(true);
            this.onTextureTransformChanged(8);
            this.onModelTransformChanged(5);
            this.onViewTransformChanged((byte) 15);
            this.onDepthRangeChanged(true);
          }
          var5.transformPlane(field_k, -1.0f, (byte) 67, (float)var4, 0.0f, 0.0f);
          var3.setVertexShaderConstants(12, field_k);
          return;
        }
    }

    final void disable(int param0) {
        this.toolkit.setActiveTextureUnit(1, -95);
        this.toolkit.setTexture((GpuTexture) null, param0 - 2669);
        if (param0 != 2543) {
          return;
        }
        this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
        this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, param0 - 2536);
        this.toolkit.setRgbCombineSource(2, pea.field_d, 7);
        this.toolkit.setAlphaCombineSource(0, (byte) -106, SetGrapplingHookMaxExtension8Force.field_q);
        this.toolkit.setActiveTextureUnit(0, -71);
        if (!this.field_f) {
          if (null != this.field_h) {
            this.field_m.a(0, (jagdx.IDirect3DVertexShader) null);
            this.field_h = null;
          }
          return;
        }
        this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
        this.toolkit.setAlphaCombineSource(0, (byte) -65, SetGrapplingHookMaxExtension8Force.field_q);
        this.field_f = false;
        if (null != this.field_h) {
          this.field_m.a(0, (jagdx.IDirect3DVertexShader) null);
          this.field_h = null;
        }
    }

    final void onProjectionChanged(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (null != this.field_h) {
          var2 = this.field_m.field_Mc;
          var2.setVertexShaderConstants(4, this.toolkit.writeTransposedProjection(123, field_p));
        }
        if (param0) {
          return;
        }
        this.field_i = (jagdx.IDirect3DVertexShader) null;
    }

    final void onTextureTransformChanged(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        GpuTransform3D var3 = null;
        if (this.field_h != null) {
          var2 = this.field_m.field_Mc;
          var3 = this.toolkit.getTextureTransform(0);
          var2.SetVertexShaderConstantF(8, var3.writeFirstTwoRows((byte) 105, field_p), 2);
        }
        if (param0 == 8) {
          return;
        }
        this.applyUnderwaterShader((byte) 92);
    }

    final boolean isSupported(byte param0) {
        int var2 = -95 / ((param0 - 34) / 63);
        return this.field_n;
    }

    private final void e(int param0) {
        GpuTransform3D var4 = null;
        jagdx.IDirect3DDevice var3 = null;
        if (null != this.field_h) {
          if (!this.field_j) {
            if (param0 <= 111) {
              this.setParameters(3, -77, 116);
              return;
            }
            return;
          }
          var4 = this.toolkit.getInverseViewTransform((byte) 90);
          GpuTransform3D var2 = var4;
          var3 = this.field_m.field_Mc;
          var3.setVertexShaderConstant(13, this.toolkit.ambientIntensity * this.toolkit.lightRed, this.toolkit.ambientIntensity * this.toolkit.lightGreen, this.toolkit.ambientIntensity * this.toolkit.lightBlue, 1.0f);
          var3.setVertexShaderConstant(14, this.toolkit.sunIntensity * this.toolkit.lightRed, this.toolkit.sunIntensity * this.toolkit.lightGreen, this.toolkit.sunIntensity * this.toolkit.lightBlue, 1.0f);
          var3.setVertexShaderConstant(16, this.toolkit.lightRed * this.toolkit.antiSunIntensity, this.toolkit.lightGreen * this.toolkit.antiSunIntensity, this.toolkit.lightBlue * this.toolkit.antiSunIntensity, 1.0f);
          var4.transformDirection(this.toolkit.sunDirection[1], field_k, this.toolkit.sunDirection[2], this.toolkit.sunDirection[0], false);
          var3.SetVertexShaderConstantF(15, field_k, 1);
          var4.transformDirection(this.toolkit.antiSunDirection[1], field_k, this.toolkit.antiSunDirection[2], this.toolkit.antiSunDirection[0], false);
          var3.SetVertexShaderConstantF(17, field_k, 1);
        }
        if (param0 > 111) {
          return;
        }
        this.setParameters(3, -77, 116);
    }

    final void enable(int param0, boolean param1) {
        this.field_j = param1 ? true : false;
        this.toolkit.setActiveTextureUnit(1, -109);
        this.toolkit.setTexture(this.field_o, -110);
        if (param0 == 5) {
          this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, SetThrusterBindingMoveAndTurnHasOppositeMove.field_o);
          this.toolkit.setRgbCombineSource(0, pea.field_d, 7);
          this.toolkit.setRgbCombineSource(true, -21115, false, SetGrapplingHookMaxExtension8Force.field_q, 2);
          this.toolkit.setAlphaCombineSource(0, (byte) -108, SpriteTextureOperation.field_l);
          this.toolkit.setActiveTextureUnit(0, -72);
          this.applyUnderwaterShader((byte) -46);
          return;
        }
        this.field_l = (jagdx.IDirect3DVertexShader) null;
        this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, SetThrusterBindingMoveAndTurnHasOppositeMove.field_o);
        this.toolkit.setRgbCombineSource(0, pea.field_d, 7);
        this.toolkit.setRgbCombineSource(true, -21115, false, SetGrapplingHookMaxExtension8Force.field_q, 2);
        this.toolkit.setAlphaCombineSource(0, (byte) -108, SpriteTextureOperation.field_l);
        this.toolkit.setActiveTextureUnit(0, -72);
        this.applyUnderwaterShader((byte) -46);
    }

    final void onModelTransformChanged(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        GpuTransform3D var3 = null;
        if (null != this.field_h) {
          var2 = this.field_m.field_Mc;
          var3 = this.field_m.getModelViewTransform(0);
          var2.setVertexShaderConstants(0, var3.writeRowMajorMatrix(field_p, (byte) 22));
        }
        if (param0 == 5) {
          return;
        }
        this.field_h = (jagdx.IDirect3DVertexShader) null;
    }

    final void onDepthRangeChanged(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        if (this.field_h != null) {
          var2 = this.field_m.field_Mc;
          var3 = this.toolkit.getFarPlane();
          var4 = this.toolkit.getNearPlane();
          var5 = (float)var3 - 0.125f * (float)(-var4 + var3);
          var6 = -((float)(var3 - var4) * 0.25f) + (float)var3;
          var2.setVertexShaderConstant(10, var6, 1.0f / (var5 - var6), var5, 1.0f / (-var5 + (float)var3));
          var2.setVertexShaderConstant(11, 1.0f / (float)this.toolkit.getUnderwaterDepthScale(117), (float)this.toolkit.getUnderwaterFogStrength(false) / 255.0f, this.toolkit.field_r, 1.0f / (this.toolkit.field_r - this.toolkit.field_p));
          this.toolkit.setTextureConstantColor(-125, this.toolkit.getUnderwaterFogColor((byte) -126));
        }
        if (param0) {
          return;
        }
        this.onDepthRangeChanged(false);
    }

    static {
        field_p = new float[16];
        field_k = new float[4];
    }
}
