/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Direct3DToolkit extends HardwareGraphicsToolkit {
    private int field_Xc;
    private DirectXSwapChain field_kd;
    jagdx.PixelBuffer field_Nc;
    private boolean[] field_Yc;
    jagdx.IDirect3DDevice field_jd;
    private jagdx.D3DLIGHT field_Zc;
    private static float[] field_hd;
    private jagdx.D3DLIGHT field_cd;
    boolean field_nd;
    private int field_ed;
    private int field_id;
    private static int[] field_md;
    private boolean field_Pc;
    boolean field_Tc;
    private boolean[] field_Qc;
    jaclib.peer.sha field_Mc;
    private TextureFilter[] field_Rc;
    private boolean[] field_Uc;
    private int[] field_gd;
    boolean field_Sc;
    private jagdx.IDirect3D field_dd;
    private jagdx.D3DPRESENT_PARAMETERS field_ad;
    private jagdx.IDirect3DVertexShader field_Vc;
    private static int[] field_fd;
    jagdx.D3DCAPS field_ld;
    private boolean[] field_bd;
    jagdx.GeometryBuffer field_Oc;
    private jagdx.D3DLIGHT field_Wc;

    final RenderBuffer createRenderBuffer(int param0, int param1) {
        return null;
    }

    final void applyTexCoordGeneration(TextureCoordinateGeneration param0, byte param1) {
        int var3;
        var3 = 0;
        if (IdolItemComponent.field_H == param0) {
          var3 = 65536;
        } else {
          if (lsa.field_c == param0) {
            var3 = 131072;
          } else {
            if (FunOrbConsole.field_u == param0) {
              var3 = 196608;
            }
          }
        }
        this.field_jd.SetTextureStageState(this.field_Cc, 11, var3 | this.field_Cc);
        if (param1 != 0) {
          this.field_gd = (int[]) null;
        }
    }

    final void applyAmbientLightColor(int param0) {
        this.field_Zc.SetAmbient(this.field_sc * this.field_fc, this.field_fc * this.field_yb, this.field_Kb * this.field_fc, (float)param0);
        this.field_Pc = false;
    }

    private final static int d3dPrimitiveType(int param0, GpuPrimitiveType param1) {
        if (param0 < 105) {
          field_fd = (int[]) null;
        }
        if (io.field_c == param1) {
          return 2;
        }
        if (param1 == ToolkitSelector.field_d) {
          return 3;
        }
        if (param1 == ControllerLocomotor.field_r) {
          return 1;
        }
        if (param1 == ArchiveManager.field_f) {
          return 4;
        }
        if (ProgressDialog.field_T == param1) {
          return 6;
        }
        if (nb.field_b != param1) {
          throw new IllegalArgumentException("");
        }
        return 5;
    }

    private Direct3DToolkit(int param0, int param1, java.awt.Canvas param2, jaclib.peer.sha param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, DirectXSwapChain param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, TextureProvider param9, ResourceArchive param10, int param11) {
        super(param2, param6, param9, param10, param11, 0);
        jagdx.GeometryBuffer discarded$0 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        int stackIn_13_1 = 0;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        Throwable decompiledCaughtException = null;
        Throwable var13 = null;
        this.field_Pc = false;
        this.field_ed = 0;
        try {
          this.field_Xc = param0;
          this.field_Mc = param3;
          this.field_ad = param7;
          this.field_id = param1;
          this.field_jd = param5;
          this.field_dd = param4;
          this.field_ld = param8;
          this.field_kd = param6;
          this.field_Zc = new jagdx.D3DLIGHT(this.field_Mc);
          this.field_cd = new jagdx.D3DLIGHT(this.field_Mc);
          this.field_Wc = new jagdx.D3DLIGHT(this.field_Mc);
          this.field_Nc = new jagdx.PixelBuffer(this.field_Mc);
          this.field_Oc = new jagdx.GeometryBuffer(this.field_Mc);
          discarded$0 = new jagdx.GeometryBuffer(this.field_Mc);
          stackIn_4_1 = (0 != (65536 & this.field_ld.TextureCaps));
          this.field_nd = stackIn_4_1;
          stackIn_7_1 = ((this.field_ld.TextureCaps & 2048) != 0);
          this.field_Ob = stackIn_7_1;
          stackIn_10_1 = ((2 & this.field_ld.TextureCaps) == 0);
          this.field_Tc = stackIn_10_1;
          if (this.field_ld.MaxActiveLights > 0) {
            stackIn_13_1 = this.field_ld.MaxActiveLights;
          } else {
            stackIn_13_1 = 8;
          }
          this.field_e = stackIn_13_1;
          this.field_Vb = this.field_ld.MaxSimultaneousTextures;
          stackIn_16_1 = ((16384 & this.field_ld.TextureCaps) != 0);
          this.field_Sc = stackIn_16_1;
          stackIn_19_1 = ((8192 & this.field_ld.TextureCaps) != 0);
          this.field_x = stackIn_19_1;
          if (0 >= this.field_Gc) {
            this.field_dd.CheckDeviceMultiSampleType(this.field_Xc, this.field_id, this.field_ad.BackBufferFormat, true, 2);
          }
          this.field_Rc = new TextureFilter[this.field_Vb];
          this.field_bd = new boolean[this.field_Vb];
          this.field_Yc = new boolean[this.field_Vb];
          this.field_gd = new int[this.field_Vb];
          this.field_Uc = new boolean[this.field_Vb];
          this.field_Qc = new boolean[this.field_Vb];
          this.field_jd.BeginScene();
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          var13.printStackTrace();
          this.close(true);
          throw new RuntimeException("");
        }
    }

    final static int d3dFormat(TextureFormat param0, int param1, GpuDataType param2) {
        if (param1 >= -127) {
          field_md = (int[]) null;
        }
        if (param2 == GpuDataType.field_g) {
          if (ValidationState.field_b == param0) {
            return 22;
          }
          if (param0 == SwitchableId.field_a) {
            return 21;
          }
          if (param0 == CharacterPreview.field_g) {
            return 28;
          }
          if (param0 == SingleChildWidget.field_w) {
            return 50;
          }
          if (param0 == VboVertexArray.field_i) {
            return 51;
          }
          if (CachedArchiveSource.field_g == param0) {
            return 77;
          }
        }
        throw new IllegalArgumentException("");
    }

    final void setPostProcessBounds(int param0, int param1, int param2, int param3) {
    }

    final boolean supportsTexture2D(boolean param0, GpuDataType param1, TextureFormat param2) {
        jagdx.D3DDISPLAYMODE var4;
        TextureFormat var5;
        boolean stackIn_6_0 = false;
        if (param0) {
          var5 = (TextureFormat) null;
          this.supportsTexture2D(true, (GpuDataType) null, (TextureFormat) null);
        }
        var4 = new jagdx.D3DDISPLAYMODE();
        stackIn_6_0 = (jagdx.ah.a(this.field_dd.getAdapterDisplayMode(this.field_Xc, var4), (byte) -82)) && (jagdx.ah.a(this.field_dd.CheckDeviceFormat(this.field_Xc, this.field_id, var4.Format, 0, 3, Direct3DToolkit.d3dFormat(param2, -128, param1)), (byte) -103));
        return stackIn_6_0;
    }

    private final static boolean choosePresentationFormats(int param0, jagdx.IDirect3D param1, int param2, int param3, jagdx.D3DPRESENT_PARAMETERS param4, int param5) {
        int var11 = 0;
        int var12 = 0;
        Throwable decompiledCaughtException = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Throwable var9 = null;
        jagdx.D3DDISPLAYMODE var10 = null;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        try {
          var9_int = 108 / ((param0 - 28) / 50);
          var10 = new jagdx.D3DDISPLAYMODE();
          if (jagdx.ah.a(param1.getAdapterDisplayMode(param5, var10), 10643)) {
            return false;
          }
          scanLoop1: while (true) {
            if (param2 >= 0) {
              if (param2 != 1) {
                var8 = 0 + param2;
                for (var11 = 0; field_md.length > var11; var11++) {
                  if (0 == param1.CheckDeviceType(param5, param3, var10.Format, field_md[var11], true) &&
                    param1.CheckDeviceFormat(param5, param3, var10.Format, 1, 1, field_md[var11]) == 0 && (param2 == 0 ||
                    param1.CheckDeviceMultiSampleType(param5, param3, field_md[var11], true, var8) == 0)) {
                    for (var12 = 0; var12 < field_fd.length; var12++) {
                      if (0 == param1.CheckDeviceFormat(param5, param3, var10.Format, 2, 1, field_fd[var12]) &&
                        0 == param1.CheckDepthStencilMatch(param5, param3, var10.Format, field_md[var11], field_fd[var12]) && (param2 == 0 ||
                        param1.CheckDeviceMultiSampleType(param5, param3, field_fd[var11], true, var8) == 0)) {
                        var7 = field_md[var11];
                        var6 = field_fd[var12];
                        break scanLoop1;
                      }
                    }
                  }
                }
              }
              param2--;
              continue;
            }
            break;
          }
          if (param2 >= 0 &&
            0 != var7 &&
            var6 != 0) {
            param4.AutoDepthStencilFormat = var6;
            param4.MultiSampleQuality = 0;
            param4.MultiSampleType = var8;
            param4.BackBufferFormat = var7;
            return true;
          }
          return false;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          return false;
        }
    }

    private final static int d3dCombineOperation(TextureCombineOperation param0, int param1) {
        if (PlatformComponent.field_F == param0) {
          return 2;
        }
        if (GpuPrimitiveType.field_c == param0) {
          return 4;
        }
        if (r.field_m == param0) {
          return 26;
        }
        if (param0 == NormalMapOperator.field_m) {
          return 7;
        }
        if (FunOrbConsole.field_w == param0) {
          return 10;
        }
        if (param1 != 0) {
          field_md = (int[]) null;
        }
        throw new IllegalArgumentException();
    }

    final void applyPostProcessing() {
    }

    final void bindVertexLayout(mna param0, int param1) {
        if (param1 != -32) {
          this.field_Wc = (jagdx.D3DLIGHT) null;
        }
        dxVertexLayout var3 = (dxVertexLayout) (param0);
        this.field_jd.SetVertexDeclaration(var3.field_e);
    }

    final void applyViewport(byte param0) {
        this.field_jd.SetViewport(this.field_i, this.field_Kc, this.field_Hb, this.field_jc, 0.0f, 1.0f);
        if (param0 != -116) {
          this.field_ed = -47;
        }
    }

    final void applyViewMatrix(boolean param0) {
        if (param0) {
          return;
        }
        if (this.field_r.isModelProjection(-122)) {
          this.field_Qb.writeColumnMajor4x4(field_hd, (byte) -37);
        } else {
          field_hd[13] = 0.0f;
          field_hd[11] = 0.0f;
          field_hd[1] = 0.0f;
          field_hd[14] = 0.0f;
          field_hd[8] = 0.0f;
          field_hd[6] = 0.0f;
          field_hd[7] = 0.0f;
          field_hd[2] = 0.0f;
          field_hd[10] = 1.0f;
          field_hd[5] = 1.0f;
          field_hd[0] = 1.0f;
          field_hd[4] = 0.0f;
          field_hd[12] = 0.0f;
          field_hd[15] = 1.0f;
          field_hd[9] = 0.0f;
          field_hd[3] = 0.0f;
        }
        this.field_jd.SetTransform(2, field_hd);
    }

    final void drawIndexedPrimitives(VertexBuffer param0, int param1, int param2, int param3, GpuPrimitiveType param4, int param5, int param6) {
        this.field_jd.SetIndices(((DirectXIndexBuffer) (param0)).field_d);
        this.field_jd.DrawIndexedPrimitive(Direct3DToolkit.d3dPrimitiveType(109, param4), 0, param2, param5, param3, param6);
        if (param1 != -19394) {
          this.field_jd = (jagdx.IDirect3DDevice) null;
        }
    }

    final void bindRenderTarget(RenderTarget param0) {
    }

    final void bindSpriteTarget(ToolkitSprite param0, boolean param1) {
    }

    final void applyTextureConstantColor(int param0) {
        if (param0 >= -10) {
          this.setMultisampling(-92, false);
        }
        this.field_jd.SetRenderState(60, this.field_bc);
    }

    final void applyProjectionMatrix(byte param0) {
        this.field_jd.SetTransform(3, this.field_T);
        if (param0 <= 26) {
          TextureCoordinateGeneration var3 = (TextureCoordinateGeneration) null;
          this.applyTexCoordGeneration((TextureCoordinateGeneration) null, (byte) -5);
        }
    }

    final boolean supportsTexture3D(GpuDataType param0, int param1, TextureFormat param2) {
        jagdx.D3DDISPLAYMODE var4;
        boolean stackIn_6_0 = false;
        if (param1 != -1) {
          return false;
        }
        var4 = new jagdx.D3DDISPLAYMODE();
        stackIn_6_0 = (jagdx.ah.a(this.field_dd.getAdapterDisplayMode(this.field_Xc, var4), (byte) -125)) && (jagdx.ah.a(this.field_dd.CheckDeviceFormat(this.field_Xc, this.field_id, var4.Format, 0, 4, Direct3DToolkit.d3dFormat(param2, param1 - 127, param0)), (byte) -92));
        return stackIn_6_0;
    }

    final void bindTexture3D(byte param0, DirectXTexture3D param1) {
        this.bindDirectXTexture((byte) -126, (DirectXTexture) (param1));
        if (!this.field_bd[this.field_Cc]) {
          this.field_jd.SetSamplerState(this.field_Cc, 1, 1);
          this.field_bd[this.field_Cc] = true;
        }
        if (!this.field_Uc[this.field_Cc]) {
          this.field_jd.SetSamplerState(this.field_Cc, 2, 1);
          this.field_Uc[this.field_Cc] = true;
        }
        if (param0 >= -123) {
          this.field_Xc = 60;
        }
    }

    final void applyBlendFactors(boolean param0) {
        if (GameScreen.field_b == this.field_lb) {
          this.field_jd.SetRenderState(19, 5);
          this.field_jd.SetRenderState(20, 6);
        } else {
          if (mp.field_a != this.field_lb) {
            if (BrickOperator.field_w == this.field_lb) {
              this.field_jd.SetRenderState(19, 9);
              this.field_jd.SetRenderState(20, 2);
            }
          } else {
            this.field_jd.SetRenderState(19, 2);
            this.field_jd.SetRenderState(20, 2);
          }
        }
        if (param0) {
          this.field_Sc = true;
        }
    }

    final void ya() {
        this.setDepthWriteEnabled(true, (byte) 81);
        this.field_jd.Clear(2, 0, 1.0f, 0);
    }

    final void copyFrontToBack() {
    }

    final void setMultisampling(int param0, boolean param1) {
        this.field_jd.setRenderStateBoolean(161, param1);
        if (param0 != 1) {
          this.field_Oc = (jagdx.GeometryBuffer) null;
        }
    }

    final void bindPixelShader(int param0, jagdx.IDirect3DPixelShader param1) {
        int var3 = 67 % ((1 - param0) / 55);
        this.field_jd.SetPixelShader(param1);
    }

    final boolean enableBloom() {
        return false;
    }

    final GpuTexture2D createFloatTexture2D(TextureFormat param0, int param1, int param2, boolean param3, int param4, int param5, float[] param6, int param7) {
        if (param2 == 0) {
          return null;
        }
        this.field_Pc = false;
        return null;
    }

    final void applyBlendEnabled(int param0) {
        if (param0 != -27581) {
          this.applyDirectionalLightColors(73);
        }
        this.field_jd.setRenderStateBoolean(27, this.field_Yb);
    }

    final void applyDirectionalLightsEnabled(byte param0) {
        this.applyDirectionalLightColors(53);
        if (param0 != -21) {
          this.field_Sc = false;
        }
        this.uploadDirectionalLights((byte) -78);
    }

    final GpuTexture2D createByteTexture2D(boolean param0, byte[] param1, int param2, int param3, int param4, int param5, TextureFormat param6, int param7) {
        if (param4 != 1) {
          return (GpuTexture2D) null;
        }
        return (GpuTexture2D) ((Object) new DirectXTexture2D(this, param6, param7, param3, param0, param1, param2, param5));
    }

    final boolean isBloomEnabled() {
        return false;
    }

    final void applyPointLights(byte param0) {
        SceneLight var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        for (var2 = 0; var2 < this.field_Bc; var2++) {
          var3 = this.field_ib[var2];
          var4 = var2 + 2;
          var5 = var3.getColour(-120);
          var6 = var3.getIntensity(0) / 255.0f;
          this.field_Wc.SetPosition((float)var3.getX(13437), (float)var3.getY(19848), (float)var3.getZ((byte) 11));
          this.field_Wc.SetDiffuse(var6 * (float)(255 & var5 >> 16), (float)(var5 >> 8 & 255) * var6, var6 * (float)(255 & var5), 0.0f);
          this.field_Wc.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.getRadius((byte) 109) * var3.getRadius((byte) 102)));
          this.field_Wc.SetRange((float)var3.getRadius((byte) -113));
          this.field_jd.SetLight(var4, this.field_Wc);
          this.field_jd.LightEnable(var4, true);
        }
        while (var2 < this.field_S) {
          this.field_jd.LightEnable(2 + var2, false);
          var2++;
        }
        super.applyPointLights(param0);
    }

    final void restoreCanvasTarget() {
    }

    final void applyScissorEnabled(byte param0) {
        int var2 = -34 % ((69 - param0) / 50);
        this.field_jd.setRenderStateBoolean(174, this.field_Wb);
    }

    final void resetDriverState(int param0) {
        int var2 = 0;
        boolean[] var3 = null;
        int var4 = 0;
        for (var2 = 0; this.field_Vb > var2; var2++) {
          this.field_jd.SetSamplerState(var2, 7, 0);
          this.field_jd.SetSamplerState(var2, 6, 2);
          this.field_jd.SetSamplerState(var2, 5, 2);
          this.field_jd.SetSamplerState(var2, 1, 1);
          this.field_jd.SetSamplerState(var2, 2, 1);
          this.field_Rc[var2] = MirrorComponent.field_G;
          var3 = this.field_bd;
          var4 = var2;
          this.field_Uc[var2] = true;
          var3[var4] = true;
          this.field_Yc[var2] = false;
          this.field_gd[var2] = 0;
        }
        this.field_jd.SetTextureStageState(0, 6, 1);
        this.field_jd.SetRenderState(9, 2);
        this.field_jd.SetRenderState(23, 4);
        this.field_jd.SetRenderState(25, 5);
        this.field_jd.SetRenderState(24, 0);
        if (param0 != -29040) {
          return;
        }
        this.field_jd.SetRenderState(22, 2);
        this.field_jd.SetRenderState(147, 1);
        this.field_jd.SetRenderState(145, 1);
        this.field_jd.setRenderStateFloat(38, 0.949999988079071f);
        this.field_jd.SetRenderState(140, 3);
        this.field_Zc.SetType(3);
        this.field_cd.SetType(3);
        this.field_Wc.SetType(1);
        this.field_Pc = false;
        super.resetDriverState(param0 + 0);
    }

    final GpuTexture2D createIntTexture2D(int[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8 = -36 / ((param6 - 13) / 46);
        return (GpuTexture2D) ((Object) new DirectXTexture2D(this, param3, param5, param2, param0, param1, param4));
    }

    final ShaderEffect createShaderEffect(int param0, int param1) {
        int var3;
        if (param1 <= 37) {
          return (ShaderEffect) null;
        }
        var3 = param0;
        if (var3 == 3) {
          return (ShaderEffect) ((Object) new DirectXUnderwaterEffect(this, this.field_I));
        }
        if (4 == var3) {
          return (ShaderEffect) ((Object) new DirectXTransparentWaterEffect(this, this.field_I, this.field_Mb));
        }
        if (var3 == 8) {
          return (ShaderEffect) ((Object) new DirectXEnvironmentWaterEffect(this, this.field_I, this.field_Mb));
        }
        return super.createShaderEffect(param0, 106);
    }

    final void setAlphaCombineSource(TextureCombineSource param0, int param1, boolean param2, int param3) {
        int var7;
        int var5;
        int var6;
        if (param1 != 15802) {
          this.field_Pc = false;
        }
        var7 = param3;
        if (var7 != 1) {
          if (var7 == 2) {
            var5 = 27;
          } else {
            var5 = 5;
          }
        } else {
          var5 = 6;
        }
        var6 = 0;
        if (param2) {
          var6 = var6 | 16;
        }
        this.field_jd.SetTextureStageState(this.field_Cc, var5, Direct3DToolkit.d3dCombineSource(param0, 117) | var6);
    }

    final VertexBuffer createIndexBuffer(int param0, boolean param1) {
        if (param0 != 26) {
          this.field_kd = (DirectXSwapChain) null;
        }
        return (VertexBuffer) ((Object) new DirectXIndexBuffer(this, GpuDataType.field_f, param1));
    }

    final void setColorCombineSource(TextureCombineSource param0, int param1, int param2, boolean param3, boolean param4) {
        int var6;
        int var8;
        int var7;
        var8 = param1;
        if (var8 == 1) {
          var6 = 3;
        } else {
          var6 = (var8 != 2) ? 2 : 26;
        }
        if (param2 != -6219) {
          this.field_Xc = -67;
        }
        var7 = 0;
        if (param3) {
          var7 = var7 | 32;
        }
        if (param4) {
          var7 = var7 | 16;
        }
        this.field_jd.SetTextureStageState(this.field_Cc, var6, var7 | Direct3DToolkit.d3dCombineSource(param0, 121));
    }

    final void applyLightPositions(int param0) {
        this.field_Zc.SetDirection(-this.field_Gb[0], -this.field_Gb[1], -this.field_Gb[2]);
        int var2 = 35 / ((param0 + 11) / 56);
        this.field_cd.SetDirection(-this.field_M[0], -this.field_M[1], -this.field_M[2]);
        this.field_Pc = false;
    }

    private final static int d3dTextureFilter(boolean param0, TextureFilter param1) {
        if (param1 == MirrorComponent.field_G) {
          return 2;
        }
        if (param1 == MiscItemBehaviour.field_v) {
          return 1;
        }
        if (!param0) {
          jagdx.D3DPRESENT_PARAMETERS var3 = (jagdx.D3DPRESENT_PARAMETERS) null;
          Direct3DToolkit.choosePresentationFormats(-16, (jagdx.IDirect3D) null, -7, 73, (jagdx.D3DPRESENT_PARAMETERS) null, -9);
        }
        throw new IllegalArgumentException();
    }

    final static GraphicsToolkit createToolkit(java.awt.Canvas param0, TextureProvider param1, ResourceArchive param2, Integer param3) {
        Direct3DToolkit stackIn_37_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jaclib.peer.sha var7 = null;
        jagdx.IDirect3D var8 = null;
        jagdx.D3DCAPS var9 = null;
        jagdx.D3DPRESENT_PARAMETERS var10 = null;
        int var11 = 0;
        Object var12 = null;
        jagdx.IDirect3DDevice var12_ref = null;
        DirectXSwapChain var13 = null;
        jagdx.eva var14 = null;
        Direct3DToolkit var15 = null;
        var4 = null;
        try {
          var5_int = 0;
          var6 = 1;
          var7 = new jaclib.peer.sha();
          var8 = jagdx.IDirect3D.direct3DCreate(-2147483616, var7);
          var9 = var8.getDeviceCaps(var5_int, var6);
          if ((16777216 & var9.RasterCaps) == 0) {
            throw new RuntimeException("");
          }
          if (var9.MaxSimultaneousTextures < 2) {
            throw new RuntimeException("");
          }
          if ((var9.TextureOpCaps & 2) == 0) {
            throw new RuntimeException("");
          }
          if ((8 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if (0 == (64 & var9.TextureOpCaps)) {
            throw new RuntimeException("");
          }
          if ((512 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if ((var9.TextureOpCaps & 33554432) == 0) {
            throw new RuntimeException("");
          }
          if ((16 & (var9.DestBlendCaps & var9.SrcBlendCaps)) == 0) {
            throw new RuntimeException("");
          }
          if (0 == (var9.DestBlendCaps & var9.SrcBlendCaps & 32)) {
            throw new RuntimeException("");
          }
          if ((2 & (var9.SrcBlendCaps & var9.DestBlendCaps)) == 0) {
            throw new RuntimeException("");
          }
          if (var9.MaxActiveLights > 0 &&
            2 > var9.MaxActiveLights) {
            throw new RuntimeException("");
          }
          if (var9.MaxStreams < 5) {
            throw new RuntimeException("");
          }
          var10 = new jagdx.D3DPRESENT_PARAMETERS(param0);
          if (!Direct3DToolkit.choosePresentationFormats(-30, var8, param3.intValue(), var6, var10, var5_int)) {
            throw new RuntimeException("");
          }
          var10.PresentationInterval = -2147483648;
          var10.Windowed = true;
          var10.EnableAutoDepthStencil = true;
          var11 = 2;
          if ((var9.DevCaps & 1048576) != 0) {
            var11 = var11 | 16;
          }
          var12 = null;
          try {
            var12_ref = var8.createDevice(var5_int, var6, param0, var11 | 64, var10);
          } catch (jagdx.eva decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var14 = (jagdx.eva) (Object) decompiledCaughtException;
            var12_ref = var8.createDevice(var5_int, var6, param0, 32 | var11, var10);
          }
          var13 = new DirectXSwapChain(var12_ref.getSwapChain(0), var12_ref.getDepthStencilSurface());
          var15 = new Direct3DToolkit(var5_int, var6, param0, var7, var8, var12_ref, var13, var10, var9, param1, param2, param3.intValue());
          var4 = var15;
          var15.initializeHardwareResources(-107);
          stackIn_37_0 = var15;
          return (GraphicsToolkit) ((Object) stackIn_37_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          if (var4 != null) {
            ((Direct3DToolkit) (var4)).dispose();
          }
          throw var5;
        }
    }

    private final boolean resetDevice(int param0) {
        int var4 = 0;
        if (param0 != -2005530519) {
          return false;
        }
        int var2 = this.field_jd.TestCooperativeLevel();
        if (var2 != 0 &&
          -2005530519 != var2) {
          return false;
        }
        DirectXSwapChain var3 = (DirectXSwapChain) (this.field_Ub);
        this.releaseDeviceResources(6);
        var3.release(true);
        this.field_ad.BackBufferWidth = 0;
        this.field_ad.BackBufferHeight = 0;
        if (Direct3DToolkit.choosePresentationFormats(param0 + 2005530607, this.field_dd, this.field_Gc, this.field_id, this.field_ad, this.field_Xc)) {
          var4 = this.field_jd.Reset(this.field_ad);
          if (jagdx.ah.a(var4, (byte) 123)) {
            var3.setSwapChain((byte) -17, this.field_jd.getSwapChain(0), this.field_jd.getDepthStencilSurface());
            this.rebuildDeviceResources((byte) 6);
            this.resetDriverState(-29040);
            return true;
          }
        }
        return false;
    }

    final void present(int param0, int param1) throws DeviceLostException {
        int fieldTemp$1 = 0;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        this.field_jd.EndScene();
        if (!this.field_kd.hasSwapChain((byte) 75)) {
          fieldTemp$1 = this.field_ed + 1;
          this.field_ed = this.field_ed + 1;
          if (fieldTemp$1 > 50) {
            throw new DeviceLostException();
          }
          discarded$2 = this.resetDevice(-2005530519);
        } else {
          this.field_ed = 0;
          if (jagdx.ah.a(this.field_kd.present(0, 0), 10643)) {
            discarded$3 = this.resetDevice(-2005530519);
          }
        }
        this.field_jd.BeginScene();
    }

    final void applyColorCombineOperation(int param0) {
        if (param0 != -3485) {
          this.applyColorCombineOperation(-69);
        }
        int var2 = this.field_Qc[this.field_Cc] ? Direct3DToolkit.d3dCombineOperation(this.field_mc[this.field_Cc], 0) : 1;
        this.field_jd.SetTextureStageState(this.field_Cc, 1, var2);
    }

    final void applyFogParameters(int param0) {
        this.field_Hc = (float)(-this.field_Ac + this.field_k);
        this.field_B = (float)(-this.field_J) + this.field_Hc;
        if ((float)this.field_D > this.field_B) {
          this.field_B = (float)this.field_D;
        }
        this.field_jd.setRenderStateFloat(36, this.field_B);
        this.field_jd.setRenderStateFloat(37, this.field_Hc);
        if (param0 != 1) {
          this.field_Yc = (boolean[]) null;
        }
        this.field_jd.SetRenderState(34, this.field_g);
    }

    final VertexStreamBuffer createVertexBuffer(int param0, boolean param1) {
        if (param0 != 6) {
          field_hd = (float[]) null;
        }
        return (VertexStreamBuffer) ((Object) new DirectXVertexBuffer(this, param1));
    }

    final void setBloomParameters(float param0, float param1, float param2) {
    }

    private final static int textureTransformFlags(int param0, TextureTransformMode param1) {
        TextureTransformMode var3;
        if (param1 == OpenGlSprite.field_d) {
          return 1;
        }
        if (CourseMapWalker.field_i == param1) {
          return 2;
        }
        if (param1 == cva.field_b) {
          return 3;
        }
        if (param1 == EmailSyntaxValidator.field_j) {
          return 4;
        }
        if (DateOfBirthPanel.field_z == param1) {
          return 256;
        }
        if (param0 <= -46) {
          return 0;
        }
        var3 = (TextureTransformMode) null;
        Direct3DToolkit.textureTransformFlags(22, (TextureTransformMode) null);
        return 0;
    }

    final void applyDepthWrite(byte param0) {
        int var2;
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        var2 = -16 / ((param0 + 67) / 53);
        stackIn_3_0 = this.field_jd;
        stackIn_3_1 = 14;
        stackIn_4_2 = (this.field_Nb) && (this.field_qc);
        ((jagdx.IDirect3DDevice) (Object) stackIn_3_0).setRenderStateBoolean(stackIn_3_1, stackIn_4_2);
    }

    final void releaseSurface(Object param0, boolean param1, java.awt.Canvas param2) {
        if (param1) {
          this.applyAlphaCombineOperation((byte) 126);
        }
    }

    final void applyScissor(int param0) {
        this.field_jd.SetScissorRect(this.field_i + this.field_A, this.field_K + this.field_Kc, this.field_C, this.field_jb);
        if (param0 != -3335) {
          this.field_Qc = (boolean[]) null;
        }
    }

    final void clear(int param0) {
        this.field_jd.Clear(1, param0, 0.0f, 0);
    }

    final void setTextureCoordinateIndex(int param0, byte param1) {
        this.field_jd.SetTextureStageState(this.field_Cc, 11, param0);
        if (param1 <= 27) {
          this.field_jd = (jagdx.IDirect3DDevice) null;
        }
    }

    final void bindDirectXTexture2D(DirectXTexture2D param0, boolean param1) {
        this.bindDirectXTexture((byte) -127, param0);
        if (param0.field_g != this.field_bd[this.field_Cc]) {
          this.field_jd.SetSamplerState(this.field_Cc, 1, !param0.field_g ? 3 : 1);
          this.field_bd[this.field_Cc] = param0.field_g;
        }
        if ((!param0.field_j ? 1 : 0) != (!this.field_Uc[this.field_Cc] ? 1 : 0)) {
          this.field_jd.SetSamplerState(this.field_Cc, 2, !param0.field_j ? 3 : 1);
          this.field_Uc[this.field_Cc] = param0.field_j;
        }
        if (!param1) {
          this.field_Rc = (TextureFilter[]) null;
        }
    }

    final void uploadDirectionalLights(byte param0) {
        if (param0 != -78) {
          this.field_cd = (jagdx.D3DLIGHT) null;
        }
        if (!this.field_Pc) {
          this.field_jd.LightEnable(0, false);
          this.field_jd.LightEnable(1, false);
          this.field_jd.SetLight(0, this.field_Zc);
          this.field_jd.SetLight(1, this.field_cd);
          this.field_jd.LightEnable(0, true);
          this.field_jd.LightEnable(1, true);
          this.field_Pc = true;
        }
    }

    final void applyActiveTexture(boolean param0) {
        if (param0) {
          this.createRenderBuffer(-126, 70);
        }
    }

    final void applyFogEnabled(int param0) {
        jagdx.IDirect3DDevice stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        stackIn_4_0 = this.field_jd;
        stackIn_4_1 = 28;
        stackIn_5_2 = (this.field_U) && (this.field_Bb) && (this.field_J >= 0);
        ((jagdx.IDirect3DDevice) (Object) stackIn_4_0).setRenderStateBoolean(stackIn_4_1, stackIn_5_2);
        if (param0 != 2) {
          this.field_Rc = (TextureFilter[]) null;
        }
    }

    final float pixelCenterOffset(byte param0) {
        if (param0 >= -39) {
          RenderBuffer var3 = (RenderBuffer) null;
          this.createRenderTarget((RenderSurface) null, (RenderBuffer) null);
        }
        return -0.5f;
    }

    final void applyDirectionalLightColors(int param0) {
        if (param0 <= 19) {
          this.field_Yc = (boolean[]) null;
        }
        float var2 = this.field_Zb ? this.field_j : 0.0f;
        float var3 = this.field_Zb ? -this.field_pc : 0.0f;
        this.field_Zc.SetDiffuse(var2 * this.field_sc, this.field_yb * var2, this.field_Kb * var2, 0.0f);
        this.field_cd.SetDiffuse(this.field_sc * var3, var3 * this.field_yb, var3 * this.field_Kb, 0.0f);
        this.field_Pc = false;
    }

    final void applyDepthTest(byte param0) {
        if (param0 != -69) {
          this.field_ad = (jagdx.D3DPRESENT_PARAMETERS) null;
        }
        this.field_jd.setRenderStateBoolean(7, this.field_wc);
    }

    final void unbindTexture(int param0) {
        if (param0 != 1) {
          ToolkitSprite var3 = (ToolkitSprite) null;
          this.bindSpriteTarget((ToolkitSprite) null, false);
        }
        if (this.field_Qc[this.field_Cc]) {
          this.field_Qc[this.field_Cc] = false;
          this.field_jd.SetTexture(this.field_Cc, (jagdx.IDirect3DBaseTexture) null);
          this.applyAlphaCombineOperation((byte) -23);
          this.applyColorCombineOperation(param0 ^ -3486);
        }
    }

    final synchronized void updateTime(int param0) {
        this.field_Mc.c(-24122);
        super.updateTime(param0);
    }

    final void dispose() {
        this.field_Mc.b(14203);
        super.dispose();
    }

    final Texture3D createTexture3D(byte[] param0, TextureFormat param1, byte param2, int param3, int param4, int param5) {
        if (param2 >= -1) {
          jagdx.IDirect3DPixelShader var8 = (jagdx.IDirect3DPixelShader) null;
          this.bindPixelShader(-23, (jagdx.IDirect3DPixelShader) null);
        }
        return (Texture3D) ((Object) new DirectXTexture3D(this, param1, param4, param3, param5, param0));
    }

    final mna createVertexLayout(VertexStreamLayout[] param0, int param1) {
        if (param1 != 0) {
          this.field_dd = (jagdx.IDirect3D) null;
        }
        return (mna) ((Object) new dxVertexLayout(this, param0));
    }

    final CubeTexture createCubeTexture(byte param0, int[][] param1, boolean param2, int param3) {
        if (param0 <= 7) {
          this.field_Uc = (boolean[]) null;
        }
        return (CubeTexture) ((Object) new DirectXCubeTexture(this, param3, param2, param1));
    }

    final void drawPrimitives(int param0, GpuPrimitiveType param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        this.field_jd.DrawPrimitive(Direct3DToolkit.d3dPrimitiveType(113, param1), param2, param0);
    }

    final void bindDirectXTexture(byte param0, DirectXTexture param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        jagdx.IDirect3DDevice stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_3;
        jagdx.IDirect3DDevice stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_17_3;
        int var3;
        int var4;
        var3 = -26 % ((param0 + 77) / 49);
        this.field_jd.SetTexture(this.field_Cc, param1.getBaseTexture(-51));
        if (param1.field_a == this.field_Rc[this.field_Cc]) {
          if (this.field_Yc[this.field_Cc] != param1.field_c) {
            stackIn_16_0 = this.field_jd;
            stackIn_16_1 = this.field_Cc;
            stackIn_16_2 = 7;
            if (param1.field_c) {
              stackIn_17_3 = Direct3DToolkit.d3dTextureFilter(true, param1.field_a);
            } else {
              stackIn_17_3 = 0;
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_16_0).SetSamplerState(stackIn_16_1, stackIn_16_2, stackIn_17_3);
            this.field_Yc[this.field_Cc] = param1.field_c;
          }
        } else {
          var4 = Direct3DToolkit.d3dTextureFilter(true, param1.field_a);
          this.field_jd.SetSamplerState(this.field_Cc, 6, var4);
          this.field_jd.SetSamplerState(this.field_Cc, 5, var4);
          this.field_Rc[this.field_Cc] = param1.field_a;
          stackIn_4_0 = (this.field_Yc[this.field_Cc]) ? 0 : 1;
          stackIn_7_1 = (param1.field_c) ? 0 : 1;
          if (stackIn_4_0 != stackIn_7_1) {
            stackIn_11_0 = this.field_jd;
            stackIn_11_1 = this.field_Cc;
            stackIn_11_2 = 7;
            if (!param1.field_c) {
              stackIn_12_3 = 0;
            } else {
              stackIn_12_3 = Direct3DToolkit.d3dTextureFilter(true, param1.field_a);
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_11_0).SetSamplerState(stackIn_11_1, stackIn_11_2, stackIn_12_3);
            this.field_Yc[this.field_Cc] = param1.field_c;
          }
        }
        if (!this.field_Qc[this.field_Cc]) {
          this.field_Qc[this.field_Cc] = true;
          this.applyAlphaCombineOperation((byte) -23);
          this.applyColorCombineOperation(-3485);
        }
    }

    final void applyModelMatrix(byte param0) {
        if (param0 != -73) {
          field_hd = (float[]) null;
        }
        if (this.field_gb) {
          field_hd[15] = 1.0f;
          field_hd[8] = 0.0f;
          field_hd[4] = 0.0f;
          field_hd[10] = 1.0f;
          field_hd[3] = 0.0f;
          field_hd[6] = 0.0f;
          field_hd[1] = 0.0f;
          field_hd[7] = 0.0f;
          field_hd[0] = 1.0f;
          field_hd[9] = 0.0f;
          field_hd[2] = 0.0f;
          field_hd[12] = 0.0f;
          field_hd[11] = 0.0f;
          field_hd[13] = 0.0f;
          field_hd[14] = 0.0f;
          field_hd[5] = 1.0f;
        } else {
          this.field_q.writeColumnMajor4x4(field_hd, (byte) -37);
        }
        this.field_jd.SetTransform(256, field_hd);
    }

    final RenderTarget createRenderTarget(RenderSurface param0, RenderBuffer param1) {
        return null;
    }

    final void applyTextureMatrix(int param0) {
        int var2;
        TextureCombineOperation var3;
        if (null == this.field_Vc &&
          DualLinkNode.field_h != this.field_v[this.field_Cc]) {
          if (CourseMapWalker.field_i == this.field_v[this.field_Cc]) {
            this.field_jd.SetTransform(16 + this.field_Cc, this.field_hc[this.field_Cc].writeTextureMatrix4x4((byte) -114, field_hd));
          } else {
            this.field_jd.SetTransform(16 + this.field_Cc, this.field_hc[this.field_Cc].writeColumnMajor4x4(field_hd, (byte) -37));
          }
          var2 = Direct3DToolkit.textureTransformFlags(-51, this.field_v[this.field_Cc]);
          if (this.field_gd[this.field_Cc] != var2) {
            this.field_jd.SetTextureStageState(this.field_Cc, 24, var2);
            this.field_gd[this.field_Cc] = var2;
          }
        } else {
          this.field_jd.SetTextureStageState(this.field_Cc, 24, 0);
          this.field_gd[this.field_Cc] = 0;
        }
        if (param0 != 0) {
          var3 = (TextureCombineOperation) null;
          Direct3DToolkit.d3dCombineOperation((TextureCombineOperation) null, -59);
        }
    }

    final GpuTexture2D createTexture2D(int param0, int param1, TextureFormat param2, byte param3, GpuDataType param4) {
        if (param3 != -63) {
          jagdx.IDirect3DVertexShader var7 = (jagdx.IDirect3DVertexShader) null;
          this.bindVertexShader((jagdx.IDirect3DVertexShader) null, 105);
        }
        return (GpuTexture2D) ((Object) new DirectXTexture2D(this, param2, param4, param0, param1));
    }

    final void bindVertexShader(jagdx.IDirect3DVertexShader param0, int param1) {
        this.field_Vc = param0;
        this.field_jd.SetVertexShader(param0);
        if (param1 != -1) {
          this.field_nd = true;
        }
        this.applyTextureMatrix(param1 + 1);
    }

    final void applyAlphaCombineOperation(byte param0) {
        int var2 = this.field_Qc[this.field_Cc] ? Direct3DToolkit.d3dCombineOperation(this.field_db[this.field_Cc], param0 ^ -23) : 1;
        if (param0 != -23) {
          return;
        }
        this.field_jd.SetTextureStageState(this.field_Cc, 4, var2);
    }

    final void applyLighting(byte param0) {
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        stackIn_3_0 = this.field_jd;
        stackIn_3_1 = 137;
        stackIn_4_2 = (this.field_l) && (!this.field_yc);
        ((jagdx.IDirect3DDevice) (Object) stackIn_3_0).setRenderStateBoolean(stackIn_3_1, stackIn_4_2);
        if (param0 != -102) {
          field_hd = (float[]) null;
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var11 = 0;
        jagdx.IDirect3DSurface var9;
        int var10;
        jagdx.IDirect3DSurface var12;
        var12 = this.field_jd.getRenderTarget(0);
        var9 = this.field_jd.createRenderTarget(param2, param3, 21, 0, 0, true);
        if (jagdx.ah.a(var9.LockRect(0, 0, param2, param3, 0, this.field_Nc), (byte) -114)) {
          if (0 == param6) {
            param6 = param2;
          }
          var10 = this.field_Nc.getRowPitch();
          if (param6 == param2 &&
            var10 == 4 * param2) {
            this.field_Nc.a(param4, param5, 0, param2 * param3);
          } else {
            for (var11 = 0; param3 > var11; var11++) {
              this.field_Nc.a(param4, var11 * param6 + param5, var11 * var10, param2);
            }
          }
          var9.UnlockRect();
        }
        this.field_jd.StretchRect(var9, 0, 0, param2, param3, var12, param0, param1, param2, param3, 0);
        var9.a(false);
        var12.a(false);
    }

    final Object createSurface(boolean param0, java.awt.Canvas param1) {
        if (!param0) {
          return null;
        }
        return (Object) null;
    }

    private final static int d3dCombineSource(TextureCombineSource param0, int param1) {
        if (param1 < 112) {
          return 109;
        }
        if (ej.field_c == param0) {
          return 2;
        }
        if (OpenGlDisplayLists.field_c == param0) {
          return 0;
        }
        if (param0 == PlayerContextMenu.field_j) {
          return 1;
        }
        if (LruNodeCache.field_c != param0) {
          throw new IllegalArgumentException();
        }
        return 3;
    }

    final void applyAlphaTest(int param0) {
        this.field_jd.setRenderStateBoolean(15, this.field_m);
        if (param0 > -30) {
          float[] var3 = (float[]) null;
          this.createFloatTexture2D((TextureFormat) null, -49, -36, false, 110, -64, (float[]) null, -7);
        }
    }

    final void bindVertexBuffer(int param0, int param1, VertexStreamBuffer param2) {
        DirectXVertexBuffer var4 = (DirectXVertexBuffer) (param2);
        if (param0 > -124) {
          this.field_ld = (jagdx.D3DCAPS) null;
        }
        this.field_jd.SetStreamSource(param1, var4.field_e, 0, var4.getStride(-7339));
    }

    static {
        field_hd = new float[16];
        field_md = new int[]{22, 23};
        field_fd = new int[]{77, 80};
    }
}
