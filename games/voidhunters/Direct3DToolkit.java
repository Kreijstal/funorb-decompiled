/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Direct3DToolkit extends GpuToolkit {
    private boolean[] field_Vc;
    private jagdx.IDirect3DVertexShader activeVertexShader;
    private jagdx.D3DLIGHT field_Fc;
    private int field_Oc;
    private boolean[] field_Rc;
    private jagdx.D3DPRESENT_PARAMETERS presentationParameters;
    private jagdx.D3DLIGHT field_Ac;
    private static float[] field_Bc;
    boolean field_Zc;
    private jagdx.IDirect3D field_Ic;
    jagdx.D3DCAPS field_Hc;
    private jagdx.D3DLIGHT field_Dc;
    jaclib.peer.PeerReferenceManager field_Sc;
    jagdx.PixelBuffer field_zc;
    boolean field_Nc;
    private boolean[] field_Lc;
    private int[] field_Cc;
    private int field_Ec;
    private TextureFilterMode[] field_Wc;
    boolean field_Jc;
    private static int[] depthStencilFormats;
    jagdx.IDirect3DDevice device;
    private static int[] backBufferFormats;
    private boolean field_Qc;
    private Direct3DSwapChainSurface field_Uc;
    private boolean[] field_yc;
    jagdx.GeometryBuffer field_Kc;
    private int field_Gc;

    private final static int toDirect3DTextureFilter(int param0, TextureFilterMode param1) {
        if (param0 != 31365) {
          return -23;
        }
        if (param1 == SoftwareFaceAttachmentState.field_a) {
          return 2;
        }
        if (SetLagVariant.field_o == param1) {
          return 1;
        }
        throw new IllegalArgumentException();
    }

    final void applyFogEnabled(int param0) {
        jagdx.IDirect3DDevice stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean stackIn_7_2 = false;
        if (param0 != 1) {
          this.applyDepthTestEnabled(-116);
        }
        stackIn_6_0 = this.device;
        stackIn_6_1 = 28;
        stackIn_7_2 = (this.effectFogEnabled) && (this.fogEnabled) && (0 <= this.field_j);
        ((jagdx.IDirect3DDevice) (Object) stackIn_6_0).setBooleanRenderState(stackIn_6_1, stackIn_7_2);
    }

    private final static int toDirect3DTextureTransformMode(TextureTransformMode param0, byte param1) {
        if (param1 <= 87) {
          backBufferFormats = (int[]) null;
        }
        if (param0 == ModalStack.field_x) {
          return 1;
        }
        if (param0 == OpenGlInterleavedVertexBuffer.field_a) {
          return 2;
        }
        if (LoadSettings.field_o == param0) {
          return 3;
        }
        if (SetUseExtraBackground.field_q == param0) {
          return 4;
        }
        if (GetUseTrails.field_p != param0) {
          return 0;
        }
        return 256;
    }

    final void applyModelTransform(byte param0) {
        if (param0 < 84) {
          this.setBloomParameters(2.017637014389038f, 0.023083189502358437f, 1.1957261562347412f);
        }
        if (!this.field_ec) {
          this.modelTransform.writeColumnMajorMatrix(field_Bc, (byte) 114);
        } else {
          field_Bc[12] = 0.0f;
          field_Bc[3] = 0.0f;
          field_Bc[8] = 0.0f;
          field_Bc[9] = 0.0f;
          field_Bc[15] = 1.0f;
          field_Bc[4] = 0.0f;
          field_Bc[13] = 0.0f;
          field_Bc[1] = 0.0f;
          field_Bc[7] = 0.0f;
          field_Bc[2] = 0.0f;
          field_Bc[0] = 1.0f;
          field_Bc[11] = 0.0f;
          field_Bc[6] = 0.0f;
          field_Bc[14] = 0.0f;
          field_Bc[10] = 1.0f;
          field_Bc[5] = 1.0f;
        }
        this.device.SetTransform(256, field_Bc);
    }

    final void applyDirectionalLightsEnabled(boolean param0) {
        this.applyDirectionalLightColors((byte) 28);
        this.commitDirectionalLights((byte) -114);
        if (param0) {
          this.field_Hc = (jagdx.D3DCAPS) null;
        }
    }

    private final static boolean choosePresentationFormats(jagdx.D3DPRESENT_PARAMETERS param0, int param1, byte param2, int param3, jagdx.IDirect3D param4, int param5) {
        int var10 = 0;
        int var11 = 0;
        Throwable decompiledCaughtException = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Throwable var9 = null;
        PrimitiveType var12 = null;
        jagdx.D3DDISPLAYMODE var13 = null;
        jagdx.D3DDISPLAYMODE var14 = null;
        if (param2 != -111) {
          var12 = (PrimitiveType) null;
          Direct3DToolkit.toDirect3DPrimitiveType((PrimitiveType) null, 37);
        }
        var6 = 0;
        var7 = 0;
        var8 = 0;
        try {
          var13 = new jagdx.D3DDISPLAYMODE();
          var14 = var13;
          if (jagdx.HResult.failed(param4.getAdapterDisplayMode(param3, var14), (byte) 118)) {
            return false;
          }
          scanLoop1: while (true) {
            if (param1 >= 0) {
              if (param1 != 1) {
                var8 = 0 + param1;
                for (var10 = 0; backBufferFormats.length > var10; var10++) {
                  if (param4.CheckDeviceType(param3, param5, var13.Format, backBufferFormats[var10], true) == 0 &&
                    param4.CheckDeviceFormat(param3, param5, var13.Format, 1, 1, backBufferFormats[var10]) == 0 && (0 == param1 ||
                    0 == param4.CheckDeviceMultiSampleType(param3, param5, backBufferFormats[var10], true, var8))) {
                    for (var11 = 0; depthStencilFormats.length > var11; var11++) {
                      if (param4.CheckDeviceFormat(param3, param5, var13.Format, 2, 1, depthStencilFormats[var11]) == 0 &&
                        param4.CheckDepthStencilMatch(param3, param5, var13.Format, backBufferFormats[var10], depthStencilFormats[var11]) == 0 && (param1 == 0 ||
                        param4.CheckDeviceMultiSampleType(param3, param5, depthStencilFormats[var10], true, var8) == 0)) {
                        var6 = depthStencilFormats[var11];
                        var7 = backBufferFormats[var10];
                        break scanLoop1;
                      }
                    }
                  }
                }
              }
              param1--;
              continue;
            }
            break;
          }
          if (param1 >= 0 &&
            var7 != 0 &&
            0 != var6) {
            param0.MultiSampleQuality = 0;
            param0.BackBufferFormat = var7;
            param0.MultiSampleType = var8;
            param0.AutoDepthStencilFormat = var6;
            return true;
          }
          return false;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          return false;
        }
    }

    final void drawPrimitive(PrimitiveType param0, int param1, int param2, int param3) {
        int var5 = 31 % ((param3 + 4) / 32);
        this.device.DrawPrimitive(Direct3DToolkit.toDirect3DPrimitiveType(param0, 1), param1, param2);
    }

    final void setVertexShader(int param0, jagdx.IDirect3DVertexShader param1) {
        this.activeVertexShader = param1;
        this.device.SetVertexShader(param1);
        this.applyTextureTransform(param0);
    }

    final void applyAmbientLight(boolean param0) {
        this.field_Fc.SetAmbient(this.lightRed * this.ambientIntensity, this.lightGreen * this.ambientIntensity, this.lightBlue * this.ambientIntensity, 0.0f);
        this.field_Qc = false;
        if (!param0) {
          this.field_Kc = (jagdx.GeometryBuffer) null;
        }
    }

    final void setPixelShader(int param0, jagdx.IDirect3DPixelShader param1) {
        if (param0 >= -58) {
          this.beginPostProcessing(-40, -73, -126, -53);
        }
        this.device.SetPixelShader(param1);
    }

    final void unbindTexture(int param0) {
        if (this.field_yc[this.activeTextureUnit]) {
          this.field_yc[this.activeTextureUnit] = false;
          this.device.SetTexture(this.activeTextureUnit, (jagdx.IDirect3DBaseTexture) null);
          this.applyAlphaCombineOperation((byte) 114);
          this.applyRgbCombineOperation(-90);
        }
        if (param0 != 3) {
          this.field_yc = (boolean[]) null;
        }
    }

    private final static int toDirect3DCombineOperation(boolean param0, TextureCombineOperation param1) {
        Integer var3;
        if (param1 == MissionVariable.field_c) {
          return 2;
        }
        if (OpenGlGlyphMask.field_a == param1) {
          return 4;
        }
        if (param1 == SetThrusterBindingMoveAndTurnHasOppositeMove.field_o) {
          return 26;
        }
        if (param1 == GpuQuadBuffers.field_c) {
          return 7;
        }
        if (param1 == ToolkitRasterStateCache.field_a) {
          return 10;
        }
        if (param0) {
          var3 = (Integer) null;
          Direct3DToolkit.createToolkit((java.awt.Canvas) null, (TextureProvider) null, (ResourceArchive) null, (Integer) null);
        }
        throw new IllegalArgumentException();
    }

    final GpuTexture2D createTexture2D(int param0, int param1, int param2, TextureFormat param3, GpuDataType param4) {
        if (param0 < 115) {
          this.field_zc = (jagdx.PixelBuffer) null;
        }
        return (GpuTexture2D) ((Object) new Direct3DTexture2D(this, param3, param4, param1, param2));
    }

    final void bindTexture(Direct3DTexture3D param0, int param1) {
        this.bindTexture(94, param0);
        if (!this.field_Vc[this.activeTextureUnit]) {
          this.device.SetSamplerState(this.activeTextureUnit, 1, 1);
          this.field_Vc[this.activeTextureUnit] = true;
        }
        if (!this.field_Lc[this.activeTextureUnit]) {
          this.device.SetSamplerState(this.activeTextureUnit, 2, 1);
          this.field_Lc[this.activeTextureUnit] = true;
        }
        if (param1 != -7913) {
          this.field_Hc = (jagdx.D3DCAPS) null;
        }
    }

    final void setAlphaCombineSource(boolean param0, byte param1, TextureCombineSource param2, int param3) {
        int var5;
        int var7;
        int var6;
        Framebuffer var8;
        var7 = param3;
        if (var7 == 1) {
          var5 = 6;
        } else {
          var5 = (2 == var7) ? 27 : 5;
        }
        var6 = 0;
        if (param1 != 94) {
          var8 = (Framebuffer) null;
          this.bindFramebuffer((Framebuffer) null);
        }
        if (param0) {
          var6 = var6 | 16;
        }
        this.device.SetTextureStageState(this.activeTextureUnit, var5, var6 | Direct3DToolkit.toDirect3DCombineSource(param2, (byte) -70));
    }

    final void applyScissorRectangle(byte param0) {
        int var2 = -16 / ((-6 - param0) / 45);
        this.device.SetScissorRect(this.scissorLeft + this.viewportX, this.viewportY + this.scissorTop, this.scissorRight, this.scissorBottom);
    }

    final void applyFogParameters(int param0) {
        this.field_r = (float)(-this.field_Qb + this.field_Wb);
        this.field_p = (float)(-this.field_j) + this.field_r;
        if (param0 != 8) {
          this.field_Jc = false;
        }
        if (this.field_p < (float)this.field_h) {
          this.field_p = (float)this.field_h;
        }
        this.device.setFloatRenderState(36, this.field_p);
        this.device.setFloatRenderState(37, this.field_r);
        this.device.SetRenderState(34, this.field_lc);
    }

    final void setMultisampleEnabled(int param0, boolean param1) {
        if (param0 > -14) {
          this.field_Kc = (jagdx.GeometryBuffer) null;
        }
        this.device.setBooleanRenderState(161, param1);
    }

    final void setBloomParameters(float param0, float param1, float param2) {
    }

    final void applyBlendingEnabled(byte param0) {
        this.device.setBooleanRenderState(27, this.blendingEnabled);
        if (param0 != -56) {
          this.enableBloom();
        }
    }

    final void applyTextureTransform(int param0) {
        int var2;
        if (param0 != 0) {
          return;
        }
        if (null == this.activeVertexShader &&
          SetGrappleDebris.field_o != this.textureTransformModes[this.activeTextureUnit]) {
          if (OpenGlInterleavedVertexBuffer.field_a != this.textureTransformModes[this.activeTextureUnit]) {
            this.device.SetTransform(this.activeTextureUnit + 16, this.textureTransforms[this.activeTextureUnit].writeColumnMajorMatrix(field_Bc, (byte) 114));
          } else {
            this.device.SetTransform(this.activeTextureUnit + 16, this.textureTransforms[this.activeTextureUnit].writeDirect3DTextureMatrix(field_Bc, (byte) -80));
          }
          var2 = Direct3DToolkit.toDirect3DTextureTransformMode(this.textureTransformModes[this.activeTextureUnit], (byte) 123);
          if (this.field_Cc[this.activeTextureUnit] != var2) {
            this.device.SetTextureStageState(this.activeTextureUnit, 24, var2);
            this.field_Cc[this.activeTextureUnit] = var2;
          }
        } else {
          this.device.SetTextureStageState(this.activeTextureUnit, 24, 0);
          this.field_Cc[this.activeTextureUnit] = 0;
        }
    }

    final void applyDirectionalLightDirections(int param0) {
        this.field_Fc.SetDirection(-this.sunDirection[0], -this.sunDirection[1], -this.sunDirection[2]);
        this.field_Dc.SetDirection(-this.antiSunDirection[0], -this.antiSunDirection[1], -this.antiSunDirection[2]);
        if (param0 != 3) {
          this.applyTextureConstantColor((byte) 31);
        }
        this.field_Qc = false;
    }

    private Direct3DToolkit(int param0, int param1, java.awt.Canvas param2, jaclib.peer.PeerReferenceManager param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, Direct3DSwapChainSurface param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, TextureProvider param9, ResourceArchive param10, int param11) {
        super(param2, param6, param9, param10, param11, 0);
        jagdx.GeometryBuffer discarded$0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        Throwable decompiledCaughtException = null;
        Throwable var13 = null;
        Object stackIn_21_0Lifetime1;
        this.field_Qc = false;
        this.field_Gc = 0;
        try {
          this.field_Hc = param8;
          this.presentationParameters = param7;
          this.field_Uc = param6;
          this.field_Ec = param1;
          this.field_Sc = param3;
          this.field_Oc = param0;
          this.field_Ic = param4;
          this.device = param5;
          this.field_Fc = new jagdx.D3DLIGHT(this.field_Sc);
          this.field_Dc = new jagdx.D3DLIGHT(this.field_Sc);
          this.field_Ac = new jagdx.D3DLIGHT(this.field_Sc);
          this.field_zc = new jagdx.PixelBuffer(this.field_Sc);
          this.field_Kc = new jagdx.GeometryBuffer(this.field_Sc);
          discarded$0 = new jagdx.GeometryBuffer(this.field_Sc);
          if (this.field_Hc.MaxActiveLights > 0) {
            stackIn_4_1 = this.field_Hc.MaxActiveLights;
          } else {
            stackIn_4_1 = 8;
          }
          this.field_qb = stackIn_4_1;
          stackIn_7_1 = ((2048 & this.field_Hc.TextureCaps) != 0);
          this.field_vb = stackIn_7_1;
          stackIn_10_1 = ((2 & this.field_Hc.TextureCaps) == 0);
          this.field_Nc = stackIn_10_1;
          this.field_L = this.field_Hc.MaxSimultaneousTextures;
          stackIn_13_1 = ((16384 & this.field_Hc.TextureCaps) != 0);
          this.field_Zc = stackIn_13_1;
          stackIn_16_1 = ((8192 & this.field_Hc.TextureCaps) != 0);
          this.field_uc = stackIn_16_1;
          stackIn_19_1 = ((this.field_Hc.TextureCaps & 65536) != 0);
          boolean decompiledFrameRemainder0 = true;
          this.field_Jc = stackIn_19_1;
          stackIn_21_0 = this;
          if (0 >= this.field_rc) {
            stackIn_22_0 = this;
            stackIn_21_0Lifetime1 = stackIn_22_0;
            if (0 != this.field_Ic.CheckDeviceMultiSampleType(this.field_Oc, this.field_Ec, this.presentationParameters.BackBufferFormat, true, 2)) {
              stackIn_23_1 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_23_1 = true;
          }
          this.field_sc = stackIn_23_1;
          this.field_Wc = new TextureFilterMode[this.field_L];
          this.field_Lc = new boolean[this.field_L];
          this.field_yc = new boolean[this.field_L];
          this.field_Cc = new int[this.field_L];
          this.field_Rc = new boolean[this.field_L];
          this.field_Vc = new boolean[this.field_L];
          this.device.BeginScene();
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          var13.printStackTrace();
          this.dispose((byte) 30);
          throw new RuntimeException("");
        }
    }

    final void releaseSurface(java.awt.Canvas param0, Object param1, int param2) {
        if (param2 != 0) {
          TextureCombineSource var5 = (TextureCombineSource) null;
          this.setAlphaCombineSource(false, (byte) 113, (TextureCombineSource) null, 67);
        }
    }

    final void applyLightingEnabled(int param0) {
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        stackIn_3_0 = this.device;
        stackIn_3_1 = 137;
        stackIn_4_2 = (this.lightingEnabled) && (!this.lightingSuppressed);
        ((jagdx.IDirect3DDevice) (Object) stackIn_3_0).setBooleanRenderState(stackIn_3_1, stackIn_4_2);
        if (param0 >= -15) {
          this.field_Qc = true;
        }
    }

    final boolean supportsTexture3DFormat(GpuDataType param0, TextureFormat param1, int param2) {
        int var4;
        jagdx.D3DDISPLAYMODE var5;
        boolean stackIn_4_0 = false;
        var4 = -73 % ((-32 - param2) / 50);
        var5 = new jagdx.D3DDISPLAYMODE();
        stackIn_4_0 = (jagdx.HResult.succeeded(this.field_Ic.getAdapterDisplayMode(this.field_Oc, var5), (byte) 21)) && (jagdx.HResult.succeeded(this.field_Ic.CheckDeviceFormat(this.field_Oc, this.field_Ec, var5.Format, 0, 4, Direct3DToolkit.toDirect3DTextureFormat(param1, param0, -97)), (byte) 62));
        return stackIn_4_0;
    }

    final void applyDirectionalLightColors(byte param0) {
        float var2 = !this.field_g ? 0.0f : this.sunIntensity;
        if (param0 < 4) {
          this.applyFogParameters(105);
        }
        float var3 = this.field_g ? -this.antiSunIntensity : 0.0f;
        this.field_Fc.SetDiffuse(var2 * this.lightRed, this.lightGreen * var2, this.lightBlue * var2, 0.0f);
        this.field_Dc.SetDiffuse(this.lightRed * var3, var3 * this.lightGreen, this.lightBlue * var3, 0.0f);
        this.field_Qc = false;
    }

    private final static int toDirect3DPrimitiveType(PrimitiveType param0, int param1) {
        if (param1 != 1) {
          depthStencilFormats = (int[]) null;
        }
        if (param0 == TextureFilterMode.field_b) {
          return 2;
        }
        if (param0 == GetFightersPerPlayerMaximum.reportReasonCount) {
          return 3;
        }
        if (SetThrusterParticleLife.field_p == param0) {
          return 1;
        }
        if (FlipTextureOperation.field_i == param0) {
          return 4;
        }
        if (UiViewport.field_v == param0) {
          return 6;
        }
        if (param0 != GetUseTriFill.field_o) {
          throw new IllegalArgumentException("");
        }
        return 5;
    }

    private final boolean resetDevice(int param0) {
        int var4 = 0;
        int var2 = this.device.TestCooperativeLevel();
        if (param0 != 60) {
          depthStencilFormats = (int[]) null;
        }
        if (var2 != 0 &&
          var2 != -2005530519) {
          return false;
        }
        Direct3DSwapChainSurface var3 = (Direct3DSwapChainSurface) (this.field_qc);
        this.releaseGpuResources((byte) -79);
        var3.release(-106);
        this.presentationParameters.BackBufferWidth = 0;
        this.presentationParameters.BackBufferHeight = 0;
        if (Direct3DToolkit.choosePresentationFormats(this.presentationParameters, this.field_rc, (byte) -111, this.field_Oc, this.field_Ic, this.field_Ec)) {
          var4 = this.device.Reset(this.presentationParameters);
          if (jagdx.HResult.succeeded(var4, (byte) 82)) {
            var3.initialize(0, this.device.getSwapChain(0), this.device.getDepthStencilSurface());
            this.recreateGpuResources(0);
            this.initializeRenderState(109);
            return true;
          }
        }
        return false;
    }

    final void setVertexBuffer(byte param0, GpuVertexBuffer param1, int param2) {
        Direct3DVertexBuffer var4 = (Direct3DVertexBuffer) (param1);
        if (param0 != -6) {
          return;
        }
        this.device.SetStreamSource(param2, var4.buffer, 0, var4.getStride((byte) -33));
    }

    final void copyFrontToBackBuffer() {
    }

    final void present(int param0, int param1) throws GraphicsPresentException {
        int fieldTemp$3 = 0;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        this.device.EndScene();
        if (!this.field_Uc.isInitialized((byte) -72)) {
          fieldTemp$3 = this.field_Gc + 1;
          this.field_Gc = this.field_Gc + 1;
          if (fieldTemp$3 > 50) {
            throw new GraphicsPresentException();
          }
          discarded$4 = this.resetDevice(60);
        } else {
          this.field_Gc = 0;
          if (jagdx.HResult.failed(this.field_Uc.present(false, 0), (byte) 54)) {
            discarded$5 = this.resetDevice(60);
          }
        }
        this.device.BeginScene();
    }

    final GpuCubeTexture createCubeTexture(boolean param0, int param1, int[][] param2, int param3) {
        if (param1 != -5210) {
          depthStencilFormats = (int[]) null;
        }
        return (GpuCubeTexture) ((Object) new Direct3DCubeTexture(this, param3, param0, param2));
    }

    final void clearDepth() {
        this.setDepthWriteEnabled((byte) -74, true);
        this.device.Clear(2, 0, 1.0f, 0);
    }

    final void releaseResources() {
        this.field_Sc.releaseAll((byte) 101);
        super.releaseResources();
    }

    final void applyPostProcessing() {
    }

    final void applyPointLights(int param0) {
        PointLight var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        if (param0 < 66) {
          return;
        }
        for (var2 = 0; var2 < this.pointLightCount; var2++) {
          var3 = this.pointLights[var2];
          var4 = var2 + 2;
          var5 = var3.getColor(-99);
          var6 = var3.getIntensity(-392138175) / 255.0f;
          this.field_Ac.SetPosition((float)var3.getX((byte) -79), (float)var3.getY(true), (float)var3.getZ((byte) 121));
          this.field_Ac.SetDiffuse((float)(var5 >> 16 & 255) * var6, (float)((65477 & var5) >> 8) * var6, var6 * (float)(255 & var5), 0.0f);
          this.field_Ac.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.getRadius(16777215) * var3.getRadius(16777215)));
          this.field_Ac.SetRange((float)var3.getRadius(16777215));
          this.device.SetLight(var4, this.field_Ac);
          this.device.LightEnable(var4, true);
        }
        while (var2 < this.previousPointLightCount) {
          this.device.LightEnable(2 + var2, false);
          var2++;
        }
        super.applyPointLights(123);
    }

    final void commitDirectionalLights(byte param0) {
        if (!this.field_Qc) {
          this.device.LightEnable(0, false);
          this.device.LightEnable(1, false);
          this.device.SetLight(0, this.field_Fc);
          this.device.SetLight(1, this.field_Dc);
          this.device.LightEnable(0, true);
          this.device.LightEnable(1, true);
          this.field_Qc = true;
        }
        int var2 = -75 % ((param0 + 45) / 51);
    }

    final void applyViewport(byte param0) {
        this.device.SetViewport(this.viewportX, this.viewportY, this.viewportWidth, this.viewportHeight, 0.0f, 1.0f);
        int var2 = -124 % ((-40 - param0) / 57);
    }

    final GpuTexture2D createTexture2DFromBytes(int param0, byte[] param1, TextureFormat param2, int param3, int param4, int param5, boolean param6, int param7) {
        if (param7 != 11) {
          this.createDepthBuffer(-44, 57);
        }
        return (GpuTexture2D) ((Object) new Direct3DTexture2D(this, param2, param4, param5, param6, param1, param0, param3));
    }

    final void bindTexture(int param0, Direct3DTexture2D param1) {
        if (param0 <= 122) {
          return;
        }
        this.bindTexture(116, (Direct3DTexture) (param1));
        if (param1.repeatX != this.field_Vc[this.activeTextureUnit]) {
          this.device.SetSamplerState(this.activeTextureUnit, 1, param1.repeatX ? 1 : 3);
          this.field_Vc[this.activeTextureUnit] = param1.repeatX;
        }
        if ((!param1.repeatY ? 1 : 0) != (!this.field_Lc[this.activeTextureUnit] ? 1 : 0)) {
          this.device.SetSamplerState(this.activeTextureUnit, 2, !param1.repeatY ? 3 : 1);
          this.field_Lc[this.activeTextureUnit] = param1.repeatY;
        }
    }

    final GpuTexture2D createTexture2DFromPixels(int param0, boolean param1, int[] param2, int param3, int param4, boolean param5, int param6) {
        if (!param5) {
          return (GpuTexture2D) null;
        }
        return (GpuTexture2D) ((Object) new Direct3DTexture2D(this, param0, param3, param1, param2, param6, param4));
    }

    final void applyActiveTextureUnit(int param0) {
        if (param0 != 12) {
          this.initializeRenderState(-20);
        }
    }

    final GpuIndexBuffer createIndexBuffer(byte param0, boolean param1) {
        if (param0 != -19) {
          this.applyProjectionMatrix((byte) -63);
        }
        return (GpuIndexBuffer) ((Object) new Direct3DIndexBuffer(this, GpuDataType.UNSIGNED_SHORT, param1));
    }

    final boolean isBloomEnabled() {
        return false;
    }

    final GpuVertexBuffer createVertexBuffer(boolean param0, int param1) {
        if (param1 != 3) {
          this.createIndexBuffer((byte) 82, true);
        }
        return (GpuVertexBuffer) ((Object) new Direct3DVertexBuffer(this, param0));
    }

    final void applyScissorEnabled(byte param0) {
        if (param0 != 81) {
          TextureTransformMode var3 = (TextureTransformMode) null;
          Direct3DToolkit.toDirect3DTextureTransformMode((TextureTransformMode) null, (byte) -103);
        }
        this.device.setBooleanRenderState(174, this.scissorEnabled);
    }

    final float getPixelOffset(byte param0) {
        if (param0 > -90) {
          TextureCombineSource var3 = (TextureCombineSource) null;
          Direct3DToolkit.toDirect3DCombineSource((TextureCombineSource) null, (byte) 118);
        }
        return -0.5f;
    }

    final boolean enableBloom() {
        return false;
    }

    final void applyViewTransform(int param0) {
        if (!this.projectionMode.usesViewTransform(-12178)) {
          field_Bc[6] = 0.0f;
          field_Bc[3] = 0.0f;
          field_Bc[2] = 0.0f;
          field_Bc[1] = 0.0f;
          field_Bc[0] = 1.0f;
          field_Bc[11] = 0.0f;
          field_Bc[8] = 0.0f;
          field_Bc[9] = 0.0f;
          field_Bc[12] = 0.0f;
          field_Bc[10] = 1.0f;
          field_Bc[4] = 0.0f;
          field_Bc[7] = 0.0f;
          field_Bc[5] = 1.0f;
          field_Bc[14] = 0.0f;
          field_Bc[15] = 1.0f;
          field_Bc[13] = 0.0f;
        } else {
          this.viewTransform.writeColumnMajorMatrix(field_Bc, (byte) 114);
        }
        if (param0 != 17891) {
          this.field_Gc = 99;
        }
        this.device.SetTransform(2, field_Bc);
    }

    final void initializeRenderState(int param0) {
        int var2 = 0;
        boolean[] var3 = null;
        int var4 = 0;
        for (var2 = 0; var2 < this.field_L; var2++) {
          this.device.SetSamplerState(var2, 7, 0);
          this.device.SetSamplerState(var2, 6, 2);
          this.device.SetSamplerState(var2, 5, 2);
          this.device.SetSamplerState(var2, 1, 1);
          this.device.SetSamplerState(var2, 2, 1);
          this.field_Wc[var2] = SoftwareFaceAttachmentState.field_a;
          var3 = this.field_Vc;
          var4 = var2;
          this.field_Lc[var2] = true;
          var3[var4] = true;
          this.field_Rc[var2] = false;
          this.field_Cc[var2] = 0;
        }
        this.device.SetTextureStageState(0, 6, 1);
        this.device.SetRenderState(9, 2);
        this.device.SetRenderState(23, 4);
        this.device.SetRenderState(25, 5);
        this.device.SetRenderState(24, 0);
        this.device.SetRenderState(22, 2);
        this.device.SetRenderState(147, 1);
        this.device.SetRenderState(145, 1);
        this.device.setFloatRenderState(38, 0.949999988079071f);
        if (param0 <= 106) {
          this.field_Kc = (jagdx.GeometryBuffer) null;
        }
        this.device.SetRenderState(140, 3);
        this.field_Fc.SetType(3);
        this.field_Dc.SetType(3);
        this.field_Ac.SetType(1);
        this.field_Qc = false;
        super.initializeRenderState(116);
    }

    final static GraphicsToolkit createToolkit(java.awt.Canvas param0, TextureProvider param1, ResourceArchive param2, Integer param3) {
        Direct3DToolkit stackIn_41_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jaclib.peer.PeerReferenceManager var7 = null;
        jagdx.IDirect3D var8 = null;
        jagdx.D3DCAPS var9 = null;
        jagdx.D3DPRESENT_PARAMETERS var10 = null;
        int var11 = 0;
        Object var12 = null;
        jagdx.IDirect3DDevice var12_ref = null;
        jagdx.Direct3DException var13 = null;
        Direct3DSwapChainSurface var13_ref = null;
        Direct3DToolkit var14 = null;
        var4 = null;
        try {
          var5_int = 0;
          var6 = 1;
          var7 = new jaclib.peer.PeerReferenceManager();
          var8 = jagdx.IDirect3D.createDirect3D(-2147483616, var7);
          var9 = var8.getDeviceCaps(var5_int, var6);
          if ((var9.RasterCaps & 16777216) == 0) {
            throw new RuntimeException("");
          }
          if (2 > var9.MaxSimultaneousTextures) {
            throw new RuntimeException("");
          }
          if ((2 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if ((8 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if (0 == (var9.TextureOpCaps & 64)) {
            throw new RuntimeException("");
          }
          if (0 == (var9.TextureOpCaps & 512)) {
            throw new RuntimeException("");
          }
          if (0 == (33554432 & var9.TextureOpCaps)) {
            throw new RuntimeException("");
          }
          if ((16 & (var9.DestBlendCaps & var9.SrcBlendCaps)) == 0) {
            throw new RuntimeException("");
          }
          if ((var9.SrcBlendCaps & var9.DestBlendCaps & 32) == 0) {
            throw new RuntimeException("");
          }
          if ((2 & (var9.SrcBlendCaps & var9.DestBlendCaps)) == 0) {
            throw new RuntimeException("");
          }
          if (var9.MaxActiveLights > 0 &&
            var9.MaxActiveLights < 2) {
            throw new RuntimeException("");
          }
          if (var9.MaxStreams < 5) {
            throw new RuntimeException("");
          }
          var10 = new jagdx.D3DPRESENT_PARAMETERS(param0);
          if (!Direct3DToolkit.choosePresentationFormats(var10, param3.intValue(), (byte) -111, var5_int, var8, var6)) {
            throw new RuntimeException("");
          }
          var10.PresentationInterval = -2147483648;
          var10.EnableAutoDepthStencil = true;
          var10.Windowed = true;
          var11 = 2;
          if ((1048576 & var9.DevCaps) != 0) {
            var11 = var11 | 16;
          }
          var12 = null;
          try {
            var12_ref = var8.createDevice(var5_int, var6, param0, var11 | 64, var10);
          } catch (jagdx.Direct3DException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var13 = (jagdx.Direct3DException) (Object) decompiledCaughtException;
            var12_ref = var8.createDevice(var5_int, var6, param0, 32 | var11, var10);
          }
          var13_ref = new Direct3DSwapChainSurface(var12_ref.getSwapChain(0), var12_ref.getDepthStencilSurface());
          var14 = new Direct3DToolkit(var5_int, var6, param0, var7, var8, var12_ref, var13_ref, var10, var9, param1, param2, param3.intValue());
          var4 = var14;
          var14.initializeGpuResources(-31089);
          stackIn_41_0 = var14;
          return (GraphicsToolkit) ((Object) stackIn_41_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          if (var4 != null) {
            ((Direct3DToolkit) (var4)).releaseResources();
          }
          throw var5;
        }
    }

    final void setRgbCombineSource(boolean param0, int param1, boolean param2, TextureCombineSource param3, int param4) {
        int var6;
        int var7;
        int var8;
        if (param1 != -21115) {
          this.field_Vc = (boolean[]) null;
        }
        var7 = 0;
        var8 = param4;
        if (var8 == 1) {
          var6 = 3;
        } else {
          var6 = (var8 == 2) ? 26 : 2;
        }
        if (param0) {
          var7 = var7 | 32;
        }
        if (param2) {
          var7 = var7 | 16;
        }
        this.device.SetTextureStageState(this.activeTextureUnit, var6, Direct3DToolkit.toDirect3DCombineSource(param3, (byte) 100) | var7);
    }

    final void applyBlendFunction(byte param0) {
        if (param0 != -39) {
          this.clearDepth();
        }
        if (this.blendFunction == GetGrapplingHookRopeBreakLength.field_o) {
          this.device.SetRenderState(19, 5);
          this.device.SetRenderState(20, 6);
        } else {
          if (this.blendFunction == GpuTransform3D.field_b) {
            this.device.SetRenderState(19, 2);
            this.device.SetRenderState(20, 2);
          } else {
            if (this.blendFunction == DebugSendable.field_e) {
              this.device.SetRenderState(19, 9);
              this.device.SetRenderState(20, 2);
            }
          }
        }
    }

    final static int toDirect3DTextureFormat(TextureFormat param0, GpuDataType param1, int param2) {
        if (param1 == GpuDataType.UNSIGNED_BYTE) {
          if (SetGrapplingHookFireForce.field_o == param0) {
            return 22;
          }
          if (param0 == ComponentAttachmentPlan.field_d) {
            return 21;
          }
          if (param0 == GetMinimapWidth.field_p) {
            return 28;
          }
          if (param0 == SetSniperCannonFireForce.field_p) {
            return 50;
          }
          if (param0 == SocketNetworkArchiveClient.field_o) {
            return 51;
          }
          if (param0 == GetReverbGain.field_o) {
            return 77;
          }
        }
        if (param2 > -77) {
          depthStencilFormats = (int[]) null;
        }
        throw new IllegalArgumentException("");
    }

    final void setTextureCoordinateIndex(int param0, int param1) {
        int var3 = -40 % ((36 - param0) / 33);
        this.device.SetTextureStageState(this.activeTextureUnit, 11, param1);
    }

    final synchronized void updateFrame(int param0) {
        this.field_Sc.poll(false);
        super.updateFrame(param0);
    }

    final GpuTexture3D createTexture3D(int param0, int param1, byte[] param2, TextureFormat param3, int param4, int param5) {
        if (param5 != -16539) {
          this.device = (jagdx.IDirect3DDevice) null;
        }
        return (GpuTexture3D) ((Object) new Direct3DTexture3D(this, param3, param4, param0, param1, param2));
    }

    final void applyTextureConstantColor(byte param0) {
        if (param0 != -109) {
          TextureFormat var3 = (TextureFormat) null;
          this.createTexture2DFromBytes(-96, (byte[]) null, (TextureFormat) null, -82, 72, 41, false, 39);
        }
        this.device.SetRenderState(60, this.textureConstantColor);
    }

    final GpuTexture2D createTexture2DFromFloats(TextureFormat param0, float[] param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7) {
        if (param6) {
          return null;
        }
        this.field_Jc = false;
        return null;
    }

    final void applyRgbCombineOperation(int param0) {
        int var2 = this.field_yc[this.activeTextureUnit] ? Direct3DToolkit.toDirect3DCombineOperation(false, this.rgbCombineOperations[this.activeTextureUnit]) : 1;
        if (param0 > -64) {
          GpuDataType var3 = (GpuDataType) null;
          Direct3DToolkit.toDirect3DTextureFormat((TextureFormat) null, (GpuDataType) null, 107);
        }
        this.device.SetTextureStageState(this.activeTextureUnit, 1, var2);
    }

    final GpuVertexDeclaration createVertexDeclaration(int param0, VertexStreamLayout[] param1) {
        if (param0 != 10) {
          this.field_Ic = (jagdx.IDirect3D) null;
        }
        return (GpuVertexDeclaration) ((Object) new dxVertexLayout(this, param1));
    }

    final void setRenderTarget(ToolkitSprite param0, boolean param1) {
    }

    private final static int toDirect3DCombineSource(TextureCombineSource param0, byte param1) {
        int var2;
        if (param0 == SetGrapplingHookMaxExtension8Force.field_q) {
          return 2;
        }
        if (param0 == GetArmageddonLength.field_q) {
          return 0;
        }
        if (SpriteTextureOperation.field_l == param0) {
          return 1;
        }
        if (param0 == PlayerContextMenus.field_d) {
          return 3;
        }
        var2 = -14 / ((param1 - 31) / 56);
        throw new IllegalArgumentException();
    }

    final int[] readPixels(int param0, int param1, int param2, int param3) {
        int var9 = 0;
        Object var5;
        jagdx.IDirect3DSurface var6;
        jagdx.IDirect3DSurface var7;
        int var8;
        int[] var10;
        int[] var11;
        int[] var12;
        var5 = null;
        var6 = this.device.getRenderTarget(0);
        var7 = this.device.createRenderTarget(param2, param3, 21, 0, 0, true);
        if (jagdx.HResult.succeeded(this.device.StretchRect(var6, param0, param1, param2, param3, var7, 0, 0, param2, param3, 0), (byte) 125) &&
          jagdx.HResult.succeeded(var7.LockRect(0, 0, param2, param3, 16, this.field_zc), (byte) 49)) {
          var12 = new int[param2 * param3];
          var11 = var12;
          var10 = var11;
          var5 = var10;
          var8 = this.field_zc.getRowPitch();
          if (var8 != param2 * 4) {
            for (var9 = 0; var9 < param3; var9++) {
              this.field_zc.readInts(var12, var9 * param2, var8 * var9, param2);
            }
          } else {
            this.field_zc.readInts(var12, 0, 0, param3 * param2);
          }
          var7.UnlockRect();
        }
        var6.release(false);
        var7.release(false);
        return (int[]) (var5);
    }

    final void setVertexDeclaration(int param0, GpuVertexDeclaration param1) {
        dxVertexLayout var3 = (dxVertexLayout) (param1);
        int var4 = 80 % ((param0 - 55) / 44);
        this.device.SetVertexDeclaration(var3.declaration);
    }

    final Framebuffer createFramebuffer(ColorBuffer param0, DepthBuffer param1) {
        return null;
    }

    final void restoreDefaultFramebuffer() {
    }

    final GpuMaterialEffect createMaterialEffect(byte param0, int param1) {
        int var3;
        int var4;
        var3 = 33 % ((param0 + 34) / 63);
        var4 = param1;
        if (3 == var4) {
          return (GpuMaterialEffect) ((Object) new Direct3DUnderwaterMaterialEffect(this, this.field_Ab));
        }
        if (4 == var4) {
          return (GpuMaterialEffect) ((Object) new Direct3DTransparentWaterEffect(this, this.field_Ab, this.field_Mb));
        }
        if (var4 != 8) {
          return super.createMaterialEffect((byte) 99, param1);
        }
        return (GpuMaterialEffect) ((Object) new Direct3DEnvironmentMappedWaterEffect(this, this.field_Ab, this.field_Mb));
    }

    final void applyAlphaTestEnabled(int param0) {
        if (param0 != 17634) {
          return;
        }
        this.device.setBooleanRenderState(15, this.alphaTestEnabled);
    }

    final boolean supportsTexture2DFormat(int param0, TextureFormat param1, GpuDataType param2) {
        jagdx.D3DDISPLAYMODE var4;
        int var5;
        boolean stackIn_4_0 = false;
        var4 = new jagdx.D3DDISPLAYMODE();
        var5 = -100 % ((-77 - param0) / 49);
        stackIn_4_0 = (jagdx.HResult.succeeded(this.field_Ic.getAdapterDisplayMode(this.field_Oc, var4), (byte) 62)) && (jagdx.HResult.succeeded(this.field_Ic.CheckDeviceFormat(this.field_Oc, this.field_Ec, var4.Format, 0, 3, Direct3DToolkit.toDirect3DTextureFormat(param1, param2, -106)), (byte) 98));
        return stackIn_4_0;
    }

    final void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var11 = 0;
        jagdx.IDirect3DSurface var9;
        int var10;
        jagdx.IDirect3DSurface var12;
        var12 = this.device.getRenderTarget(0);
        var9 = this.device.createRenderTarget(param2, param3, 21, 0, 0, true);
        if (jagdx.HResult.succeeded(var9.LockRect(0, 0, param2, param3, 0, this.field_zc), (byte) 47)) {
          if (0 == param6) {
            param6 = param2;
          }
          var10 = this.field_zc.getRowPitch();
          if (param6 == param2 &&
            4 * param2 == var10) {
            this.field_zc.writeInts(param4, param5, 0, param3 * param2);
          } else {
            for (var11 = 0; var11 < param3; var11++) {
              this.field_zc.writeInts(param4, param6 * var11 + param5, var10 * var11, param2);
            }
          }
          var9.UnlockRect();
        }
        this.device.StretchRect(var9, 0, 0, param2, param3, var12, param0, param1, param2, param3, 0);
        var9.release(false);
        var12.release(false);
    }

    final void clearColor(int param0) {
        this.device.Clear(1, param0, 0.0f, 0);
    }

    final void applyDepthWriteEnabled(int param0) {
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        stackIn_3_0 = this.device;
        stackIn_3_1 = 14;
        stackIn_4_2 = (this.field_M) && (this.depthWriteEnabled);
        ((jagdx.IDirect3DDevice) (Object) stackIn_3_0).setBooleanRenderState(stackIn_3_1, stackIn_4_2);
        if (param0 >= -41) {
          this.field_Wc = (TextureFilterMode[]) null;
        }
    }

    final void applyDepthTestEnabled(int param0) {
        this.device.setBooleanRenderState(7, this.depthTestEnabled);
        if (param0 != 12614) {
          this.field_Hc = (jagdx.D3DCAPS) null;
        }
    }

    final void bindFramebuffer(Framebuffer param0) {
    }

    final void setTextureCoordinateMode(byte param0, TextureCoordinateMode param1) {
        int var3;
        var3 = 0;
        if (GameTextMetrics.field_d == param1) {
          var3 = 65536;
        } else {
          if (OpenGlFramebuffer.field_c != param1) {
            if (param1 == GetArmageddonLength.field_p) {
              var3 = 196608;
            }
          } else {
            var3 = 131072;
          }
        }
        this.device.SetTextureStageState(this.activeTextureUnit, 11, var3 | this.activeTextureUnit);
        if (param0 != -111) {
          this.field_Zc = true;
        }
    }

    final DepthBuffer createDepthBuffer(int param0, int param1) {
        return null;
    }

    final Object createSurface(byte param0, java.awt.Canvas param1) {
        if (param0 <= -21) {
          return null;
        }
        return (Object) null;
    }

    final void beginPostProcessing(int param0, int param1, int param2, int param3) {
    }

    final void applyProjectionMatrix(byte param0) {
        if (param0 >= -17) {
          this.field_Nc = false;
        }
        this.device.SetTransform(3, this.projectionMatrix);
    }

    final void bindTexture(int param0, Direct3DTexture param1) {
        boolean stackIn_5_0 = false;
        int stackIn_6_1 = 0;
        jagdx.IDirect3DDevice stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_10_3;
        int stackIn_14_0 = 0;
        jagdx.IDirect3DDevice stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_19_3;
        int var3;
        this.device.SetTexture(this.activeTextureUnit, param1.getNativeTexture(24971));
        if (param0 < 4) {
          return;
        }
        if (this.field_Wc[this.activeTextureUnit] == param1.filterMode) {
          stackIn_14_0 = (this.field_Rc[this.activeTextureUnit]) ? 0 : 1;
          if (stackIn_14_0 == (param1.field_b ? 1 : 0)) {
            stackIn_18_0 = this.device;
            stackIn_18_1 = this.activeTextureUnit;
            stackIn_18_2 = 7;
            if (!param1.field_b) {
              stackIn_19_3 = 0;
            } else {
              stackIn_19_3 = Direct3DToolkit.toDirect3DTextureFilter(31365, param1.filterMode);
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_18_0).SetSamplerState(stackIn_18_1, stackIn_18_2, stackIn_19_3);
            this.field_Rc[this.activeTextureUnit] = param1.field_b;
          }
        } else {
          var3 = Direct3DToolkit.toDirect3DTextureFilter(31365, param1.filterMode);
          this.device.SetSamplerState(this.activeTextureUnit, 6, var3);
          this.device.SetSamplerState(this.activeTextureUnit, 5, var3);
          this.field_Wc[this.activeTextureUnit] = param1.filterMode;
          stackIn_5_0 = this.field_Rc[this.activeTextureUnit];
          stackIn_6_1 = (param1.field_b) ? 0 : 1;
          if ((stackIn_5_0 ? 1 : 0) == stackIn_6_1) {
            stackIn_9_0 = this.device;
            stackIn_9_1 = this.activeTextureUnit;
            stackIn_9_2 = 7;
            if (param1.field_b) {
              stackIn_10_3 = Direct3DToolkit.toDirect3DTextureFilter(31365, param1.filterMode);
            } else {
              stackIn_10_3 = 0;
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_9_0).SetSamplerState(stackIn_9_1, stackIn_9_2, stackIn_10_3);
            this.field_Rc[this.activeTextureUnit] = param1.field_b;
          }
        }
        if (!this.field_yc[this.activeTextureUnit]) {
          this.field_yc[this.activeTextureUnit] = true;
          this.applyAlphaCombineOperation((byte) 125);
          this.applyRgbCombineOperation(-92);
        }
    }

    final void applyAlphaCombineOperation(byte param0) {
        int var2 = this.field_yc[this.activeTextureUnit] ? Direct3DToolkit.toDirect3DCombineOperation(false, this.alphaCombineOperations[this.activeTextureUnit]) : 1;
        if (param0 <= 109) {
          this.initializeRenderState(69);
        }
        this.device.SetTextureStageState(this.activeTextureUnit, 4, var2);
    }

    static {
        field_Bc = new float[16];
        depthStencilFormats = new int[]{77, 80};
        backBufferFormats = new int[]{22, 23};
    }
}
