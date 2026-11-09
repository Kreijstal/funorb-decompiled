/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class DirectXGraphicsToolkit extends HardwareGraphicsToolkit {
    jaclib.peer.PeerReferenceManager field_Wc;
    private jagdx.IDirect3DVertexShader field_Vc;
    private static int[] field_Zc;
    jagdx.GeometryBuffer field_Yc;
    private boolean field_Tc;
    private jagdx.D3DLIGHT field_Rc;
    private int field_Lc;
    private static float[] field_Mc;
    jagdx.IDirect3DDevice field_Cc;
    private jagdx.D3DLIGHT field_Nc;
    private jagdx.D3DPRESENT_PARAMETERS field_Pc;
    private boolean[] field_ad;
    private int field_zc;
    private TextureFilter[] field_Dc;
    boolean field_Sc;
    private jagdx.IDirect3D field_Xc;
    private jagdx.D3DLIGHT field_Ac;
    private boolean[] field_Ec;
    private static int[] field_Fc;
    private int[] field_Gc;
    private DirectXSwapChainSurface field_Hc;
    boolean field_Qc;
    private boolean[] field_Uc;
    jagdx.PixelBuffer field_Jc;
    boolean field_Oc;
    private int field_Ic;
    jagdx.D3DCAPS field_Kc;
    private boolean[] field_Bc;

    final void drawPixels(int x, int y, int width, int height, int[] pixels, int offset, int stride) {
        int var11 = 0;
        jagdx.IDirect3DSurface var9;
        int var10;
        jagdx.IDirect3DSurface var12;
        var12 = this.field_Cc.getRenderTarget(0);
        var9 = this.field_Cc.createRenderTarget(width, height, 21, 0, 0, true);
        if (jagdx.HResult.succeeded(var9.LockRect(0, 0, width, height, 0, this.field_Jc), -74)) {
          if (0 == stride) {
            stride = width;
          }
          var10 = this.field_Jc.getRowPitch();
          if (stride == width &&
            var10 == 4 * width) {
            this.field_Jc.putInts(pixels, offset, 0, width * height);
          } else {
            for (var11 = 0; var11 < height; var11++) {
              this.field_Jc.putInts(pixels, offset + var11 * stride, var10 * var11, width);
            }
          }
          var9.UnlockRect();
        }
        this.field_Cc.StretchRect(var9, 0, 0, width, height, var12, x, y, width, height, 0);
        var9.release(-22671);
        var12.release(-22671);
    }

    final void applyScissor(int guard) {
        if (guard != 4) {
          this.isFloatPostProcessingEnabled();
        }
        this.field_Cc.SetScissorRect(this.field_r + this.clipTop, this.field_y + this.clipLeft, this.clipRight, this.clipBottom);
    }

    final void releaseSurface(java.awt.Canvas canvas, Object surface, int guard) {
        if (guard != 0) {
          this.field_Cc = (jagdx.IDirect3DDevice) null;
        }
    }

    final IndexBuffer createIndexBuffer(int guard, boolean dynamic) {
        if (guard != 3) {
          return (IndexBuffer) null;
        }
        return (IndexBuffer) ((Object) new DirectXIndexBuffer(this, GpuDataType.UNSIGNED_SHORT, dynamic));
    }

    final void unbindTexture(byte guard) {
        if (guard != 9) {
          this.field_Ac = (jagdx.D3DLIGHT) null;
        }
        if (this.field_Ec[this.activeTextureUnit]) {
          this.field_Ec[this.activeTextureUnit] = false;
          this.field_Cc.SetTexture(this.activeTextureUnit, (jagdx.IDirect3DBaseTexture) null);
          this.applyAlphaCombineOperation(-109);
          this.applyColorCombineOperation((byte) -93);
        }
    }

    final Texture2D createTexture2D(GpuDataType dataType, TextureFormat format, int height, int width, byte guard) {
        if (guard > -99) {
          this.applyTextureMatrix(-14);
        }
        return (Texture2D) ((Object) new DirectXTexture2D(this, format, dataType, width, height));
    }

    final void bindVertexLayout(int guard, VertexLayout layout) {
        int var3 = 121 % ((71 - guard) / 45);
        dxVertexLayout var4 = (dxVertexLayout) (layout);
        this.field_Cc.SetVertexDeclaration(var4.field_d);
    }

    final void bindTexture3D(int guard, DirectXTexture3D texture) {
        this.bindDirectXTexture((DirectXTexture) (texture), 1);
        if (!this.field_Uc[this.activeTextureUnit]) {
          this.field_Cc.SetSamplerState(this.activeTextureUnit, 1, 1);
          this.field_Uc[this.activeTextureUnit] = true;
        }
        if (!this.field_Bc[this.activeTextureUnit]) {
          this.field_Cc.SetSamplerState(this.activeTextureUnit, 2, 1);
          this.field_Bc[this.activeTextureUnit] = true;
        }
        if (guard != 2) {
          field_Zc = (int[]) null;
        }
    }

    final CubeTexture createCubeTexture(int size, byte guard, int[][] facePixels, boolean mipmapped) {
        int var5 = -93 / ((guard + 23) / 48);
        return (CubeTexture) ((Object) new DirectXCubeTexture(this, size, mipmapped, facePixels));
    }

    private final static boolean choosePresentationFormats(jagdx.IDirect3D direct3D, int deviceType, int adapter, int samples, int guard, jagdx.D3DPRESENT_PARAMETERS parameters) {
        int var10 = 0;
        int var11 = 0;
        Throwable decompiledCaughtException = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Throwable var9 = null;
        jagdx.D3DDISPLAYMODE var12 = null;
        jagdx.D3DDISPLAYMODE var13 = null;
        var6 = 0;
        var7 = 0;
        if (guard != 6) {
          field_Zc = (int[]) null;
        }
        var8 = 0;
        try {
          var12 = new jagdx.D3DDISPLAYMODE();
          var13 = var12;
          if (jagdx.HResult.failed(direct3D.getAdapterDisplayMode(adapter, var13), -1)) {
            return false;
          }
          scanLoop1: while (true) {
            if (samples >= 0) {
              if (samples != 1) {
                var8 = 0 + samples;
                for (var10 = 0; field_Fc.length > var10; var10++) {
                  if (direct3D.CheckDeviceType(adapter, deviceType, var12.Format, field_Fc[var10], true) == 0 &&
                    direct3D.CheckDeviceFormat(adapter, deviceType, var12.Format, 1, 1, field_Fc[var10]) == 0 && (samples == 0 ||
                    0 == direct3D.CheckDeviceMultiSampleType(adapter, deviceType, field_Fc[var10], true, var8))) {
                    for (var11 = 0; var11 < field_Zc.length; var11++) {
                      if (direct3D.CheckDeviceFormat(adapter, deviceType, var12.Format, 2, 1, field_Zc[var11]) == 0 &&
                        0 == direct3D.CheckDepthStencilMatch(adapter, deviceType, var12.Format, field_Fc[var10], field_Zc[var11]) && (samples == 0 ||
                        direct3D.CheckDeviceMultiSampleType(adapter, deviceType, field_Zc[var10], true, var8) == 0)) {
                        var7 = field_Fc[var10];
                        var6 = field_Zc[var11];
                        break scanLoop1;
                      }
                    }
                  }
                }
              }
              samples--;
              continue;
            }
            break;
          }
          if (0 <= samples &&
            0 != var7) {
            if (var6 == 0) {
              return false;
            }
            parameters.BackBufferFormat = var7;
            parameters.MultiSampleQuality = 0;
            parameters.AutoDepthStencilFormat = var6;
            parameters.MultiSampleType = var8;
            return true;
          }
          return false;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          return false;
        }
    }

    final void bindRenderTarget(RenderTarget target) {
    }

    final void applyTextureMatrix(int guard) {
        int var2;
        if (guard != 26803) {
          this.field_Rc = (jagdx.D3DLIGHT) null;
        }
        if (this.field_Vc == null &&
          HotspotTextWidget.TEXTURE_TRANSFORM_DISABLED != this.textureTransformModes[this.activeTextureUnit]) {
          if (this.textureTransformModes[this.activeTextureUnit] != IntList.TEXTURE_COUNT2) {
            this.field_Cc.SetTransform(this.activeTextureUnit + 16, this.textureTransforms[this.activeTextureUnit].writeColumnMajor4x4(-68, field_Mc));
          } else {
            this.field_Cc.SetTransform(this.activeTextureUnit + 16, this.textureTransforms[this.activeTextureUnit].writeTextureMatrix4x4(field_Mc, 111));
          }
          var2 = DirectXGraphicsToolkit.textureTransformFlags(this.textureTransformModes[this.activeTextureUnit], guard - 23700);
          if (var2 != this.field_Gc[this.activeTextureUnit]) {
            this.field_Cc.SetTextureStageState(this.activeTextureUnit, 24, var2);
            this.field_Gc[this.activeTextureUnit] = var2;
          }
        } else {
          this.field_Cc.SetTextureStageState(this.activeTextureUnit, 24, 0);
          this.field_Gc[this.activeTextureUnit] = 0;
        }
    }

    final void applyActiveTexture(int guard) {
        if (guard > -7) {
          this.field_Jc = (jagdx.PixelBuffer) null;
        }
    }

    final RenderTarget createRenderTarget(RenderSurface surface, RenderBuffer buffer) {
        return null;
    }

    final void applyColorCombineOperation(byte guard) {
        if (guard > -74) {
          return;
        }
        int var2 = !this.field_Ec[this.activeTextureUnit] ? 1 : DirectXGraphicsToolkit.d3dCombineOperation(this.colorCombineOperations[this.activeTextureUnit], -124);
        this.field_Cc.SetTextureStageState(this.activeTextureUnit, 1, var2);
    }

    final void setMultisampling(int guard, boolean enabled) {
        if (guard != 1) {
          this.applyLighting(true);
        }
        this.field_Cc.setRenderState(161, enabled);
    }

    private final static int textureTransformFlags(TextureTransformMode mode, int guard) {
        TextureFilter var3;
        if (mode == HardwareGraphicsHeap.TEXTURE_COUNT1) {
          return 1;
        }
        if (IntList.TEXTURE_COUNT2 == mode) {
          return 2;
        }
        if (mode == LegacyRidgedWaterNoise.TEXTURE_COUNT3) {
          return 3;
        }
        if (mode == RasterColorTables.TEXTURE_COUNT4) {
          return 4;
        }
        if (HardwareGraphicsToolkit.TEXTURE_PROJECTED == mode) {
          return 256;
        }
        if (guard == 3103) {
          return 0;
        }
        var3 = (TextureFilter) null;
        DirectXGraphicsToolkit.d3dTextureFilter((TextureFilter) null, false);
        return 0;
    }

    final void applyPointLights(int guard) {
        PointLight var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        for (var2 = 0; this.pendingPointLightCount > var2; var2++) {
          var3 = this.pointLights[var2];
          var4 = var2 + 2;
          var5 = var3.color((byte) 50);
          var6 = var3.intensity(0) / 255.0f;
          this.field_Ac.SetPosition((float)var3.getX((byte) 117), (float)var3.getY((byte) 109), (float)var3.getZ(true));
          this.field_Ac.SetDiffuse((float)((var5 & 16740345) >> 16) * var6, (float)((var5 & 65514) >> 8) * var6, var6 * (float)(var5 & 255), 0.0f);
          this.field_Ac.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.radius(0) * var3.radius(0)));
          this.field_Ac.SetRange((float)var3.radius(0));
          this.field_Cc.SetLight(var4, this.field_Ac);
          this.field_Cc.LightEnable(var4, true);
        }
        while (this.previousPointLightCount > var2) {
          this.field_Cc.LightEnable(2 + var2, false);
          var2++;
        }
        if (guard > -83) {
          this.field_zc = -101;
        }
        super.applyPointLights(-100);
    }

    final void applyDepthTest(int guard) {
        this.field_Cc.setRenderState(7, this.depthTestEnabled);
        if (guard <= 19) {
          this.applyScissorEnabled(30);
        }
    }

    final VertexLayout createVertexLayout(VertexStreamLayout[] streams, byte guard) {
        if (guard <= 6) {
          return (VertexLayout) null;
        }
        return (VertexLayout) ((Object) new dxVertexLayout(this, streams));
    }

    final void applyTextureConstantColor(int greenIndex) {
        this.field_Cc.SetRenderState(60, this.textureConstantColor);
        if (greenIndex != 1) {
          this.field_Dc = (TextureFilter[]) null;
        }
    }

    final synchronized void updateTime(int timeMillis) {
        this.field_Wc.pollReleasedReferences(12575);
        super.updateTime(timeMillis);
    }

    final void bindDirectXTexture(DirectXTexture texture, int guard) {
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        jagdx.IDirect3DDevice stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_3;
        boolean stackIn_11_0 = false;
        int stackIn_12_1 = 0;
        jagdx.IDirect3DDevice stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_16_3;
        int var3;
        this.field_Cc.SetTexture(this.activeTextureUnit, texture.nativeTexture(-22689));
        if (this.field_Dc[this.activeTextureUnit] != texture.filter) {
          var3 = DirectXGraphicsToolkit.d3dTextureFilter(texture.filter, false);
          this.field_Cc.SetSamplerState(this.activeTextureUnit, 6, var3);
          this.field_Cc.SetSamplerState(this.activeTextureUnit, 5, var3);
          this.field_Dc[this.activeTextureUnit] = texture.filter;
          stackIn_11_0 = this.field_ad[this.activeTextureUnit];
          stackIn_12_1 = (texture.mipmapped) ? 0 : 1;
          if ((stackIn_11_0 ? 1 : 0) == stackIn_12_1) {
            stackIn_15_0 = this.field_Cc;
            stackIn_15_1 = this.activeTextureUnit;
            stackIn_15_2 = 7;
            if (!texture.mipmapped) {
              stackIn_16_3 = 0;
            } else {
              stackIn_16_3 = DirectXGraphicsToolkit.d3dTextureFilter(texture.filter, false);
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_15_0).SetSamplerState(stackIn_15_1, stackIn_15_2, stackIn_16_3);
            this.field_ad[this.activeTextureUnit] = texture.mipmapped;
          }
        } else {
          stackIn_3_0 = this.field_ad[this.activeTextureUnit];
          stackIn_4_1 = (texture.mipmapped) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) == stackIn_4_1) {
            stackIn_7_0 = this.field_Cc;
            stackIn_7_1 = this.activeTextureUnit;
            stackIn_7_2 = 7;
            if (texture.mipmapped) {
              stackIn_8_3 = DirectXGraphicsToolkit.d3dTextureFilter(texture.filter, false);
            } else {
              stackIn_8_3 = 0;
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_7_0).SetSamplerState(stackIn_7_1, stackIn_7_2, stackIn_8_3);
            this.field_ad[this.activeTextureUnit] = texture.mipmapped;
          }
        }
        if (!this.field_Ec[this.activeTextureUnit]) {
          this.field_Ec[this.activeTextureUnit] = true;
          this.applyAlphaCombineOperation(-115);
          this.applyColorCombineOperation((byte) -113);
        }
        if (guard != 1) {
          this.field_Oc = false;
        }
    }

    final void clear(int color) {
        this.field_Cc.Clear(1, color, 0.0f, 0);
    }

    private final boolean resetDevice(boolean guard) {
        DirectXSwapChainSurface var3 = null;
        int var4 = 0;
        int var2 = this.field_Cc.TestCooperativeLevel();
        if (var2 == 0 ||
          var2 == -2005530519) {
          var3 = (DirectXSwapChainSurface) (this.field_Ib);
          this.releaseDeviceResources((byte) 81);
          var3.close((byte) 71);
          this.field_Pc.BackBufferWidth = 0;
          this.field_Pc.BackBufferHeight = 0;
          if (DirectXGraphicsToolkit.choosePresentationFormats(this.field_Xc, this.field_Ic, this.field_zc, this.field_Y, 6, this.field_Pc)) {
            var4 = this.field_Cc.Reset(this.field_Pc);
            if (jagdx.HResult.succeeded(var4, -72)) {
              var3.attach(false, this.field_Cc.getDepthStencilSurface(), this.field_Cc.getSwapChain(0));
              this.rebuildDeviceResources(-100);
              this.resetDriverState(1);
              return true;
            }
          }
        }
        if (!guard) {
          this.field_Sc = true;
          return false;
        }
        return false;
    }

    private final static int d3dCombineOperation(TextureCombineOperation operation, int guard) {
        if (guard >= -23) {
          field_Zc = (int[]) null;
        }
        if (LegacyOpenGlRenderBufferSet.REPLACE == operation) {
          return 2;
        }
        if (SlowBurstParticle.MODULATE == operation) {
          return 4;
        }
        if (operation == OpenGlBuffer.INTERPOLATE) {
          return 26;
        }
        if (operation == LoginForm.ADD) {
          return 7;
        }
        if (EmailAvailabilityRequest.SUBTRACT == operation) {
          return 10;
        }
        throw new IllegalArgumentException();
    }

    private final static int d3dCombineSource(TextureCombineSource source, int guard) {
        if (guard != 21) {
          return 11;
        }
        if (LegacyVertexAttribute.TEXTURE == source) {
          return 2;
        }
        if (NetworkResourceRequest.PRIMARY_COLOR == source) {
          return 0;
        }
        if (source == FontMetrics.PREVIOUS) {
          return 1;
        }
        if (source != AccountRequestState.CONSTANT) {
          throw new IllegalArgumentException();
        }
        return 3;
    }

    final void setTextureCoordinateIndex(int index, int guard) {
        if (guard < 83) {
          byte[] var4 = (byte[]) null;
          this.createTexture3D(true, (TextureFormat) null, -117, -19, (byte[]) null, 96);
        }
        this.field_Cc.SetTextureStageState(this.activeTextureUnit, 11, index);
    }

    final boolean supportsTexture2D(GpuDataType dataType, TextureFormat format, int guard) {
        jagdx.D3DDISPLAYMODE var4;
        boolean stackIn_6_0 = false;
        if (guard != 6) {
          this.applyDirectionalLightColors(-77);
        }
        var4 = new jagdx.D3DDISPLAYMODE();
        stackIn_6_0 = (jagdx.HResult.succeeded(this.field_Xc.getAdapterDisplayMode(this.field_zc, var4), -41)) && (jagdx.HResult.succeeded(this.field_Xc.CheckDeviceFormat(this.field_zc, this.field_Ic, var4.Format, 0, 3, DirectXGraphicsToolkit.d3dTextureFormat(format, -55, dataType)), -63));
        return stackIn_6_0;
    }

    final void bindVertexBuffer(int stream, int guard, VertexBuffer buffer) {
        if (guard < 62) {
          this.applyScissorEnabled(70);
        }
        DirectXVertexBuffer var4 = (DirectXVertexBuffer) (buffer);
        this.field_Cc.SetStreamSource(stream, var4.buffer, 0, var4.stride(98));
    }

    final void applyAmbientLightColor(int guard) {
        this.field_Nc.SetAmbient(this.field_J * this.field_T, this.field_T * this.field_jb, this.field_T * this.field_Xb, 0.0f);
        if (guard != 7) {
          return;
        }
        this.field_Tc = false;
    }

    final boolean isFloatPostProcessingEnabled() {
        return false;
    }

    final void applyAlphaTest(int guard) {
        this.field_Cc.setRenderState(15, this.field_u);
        int var2 = 111 % ((guard + 6) / 54);
    }

    final Object createSurface(java.awt.Canvas canvas, int guard) {
        if (guard == 3) {
          return null;
        }
        this.applyAlphaCombineOperation(-60);
        return null;
    }

    private final static int d3dPrimitiveType(PrimitiveType primitive, byte guard) {
        TextureFilter var3;
        if (guard != -121) {
          var3 = (TextureFilter) null;
          DirectXGraphicsToolkit.d3dTextureFilter((TextureFilter) null, true);
        }
        if (primitive == PasswordValidator.LINES) {
          return 2;
        }
        if (primitive == AccountCreationNavigation.LINE_STRIP) {
          return 3;
        }
        if (JaggrabDownloader.POINTS == primitive) {
          return 1;
        }
        if (WhirlpoolDigest.TRIANGLES == primitive) {
          return 4;
        }
        if (primitive == AccountServiceResult.TRIANGLE_FAN) {
          return 6;
        }
        if (primitive == OpenGlVertexLayout.TRIANGLE_STRIP) {
          return 5;
        }
        throw new IllegalArgumentException("");
    }

    final void applyViewMatrix(int guard) {
        if (guard != -26911) {
          this.field_Hc = (DirectXSwapChainSurface) null;
        }
        if (!this.projectionMode.usesViewTransform(guard ^ 10036)) {
          field_Mc[10] = 1.0f;
          field_Mc[8] = 0.0f;
          field_Mc[1] = 0.0f;
          field_Mc[2] = 0.0f;
          field_Mc[13] = 0.0f;
          field_Mc[0] = 1.0f;
          field_Mc[3] = 0.0f;
          field_Mc[11] = 0.0f;
          field_Mc[4] = 0.0f;
          field_Mc[7] = 0.0f;
          field_Mc[15] = 1.0f;
          field_Mc[12] = 0.0f;
          field_Mc[14] = 0.0f;
          field_Mc[9] = 0.0f;
          field_Mc[6] = 0.0f;
          field_Mc[5] = 1.0f;
        } else {
          this.viewTransform.writeColumnMajor4x4(-110, field_Mc);
        }
        this.field_Cc.SetTransform(2, field_Mc);
    }

    final void applyLighting(boolean guard) {
        jagdx.IDirect3DDevice stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        if (guard) {
          return;
        }
        stackIn_5_0 = this.field_Cc;
        stackIn_5_1 = 137;
        stackIn_6_2 = (this.lightingEnabled) && (!this.lightingSuppressed);
        ((jagdx.IDirect3DDevice) (Object) stackIn_5_0).setRenderState(stackIn_5_1, stackIn_6_2);
    }

    final void bindTexture2D(int guard, DirectXTexture2D texture) {
        if (guard != 1) {
          TextureCoordinateGeneration var4 = (TextureCoordinateGeneration) null;
          this.applyTexCoordGeneration(94, (TextureCoordinateGeneration) null);
        }
        this.bindDirectXTexture((DirectXTexture) (texture), guard ^ 0);
        if (this.field_Uc[this.activeTextureUnit] != texture.repeatX) {
          this.field_Cc.SetSamplerState(this.activeTextureUnit, 1, !texture.repeatX ? 3 : 1);
          this.field_Uc[this.activeTextureUnit] = texture.repeatX;
        }
        if (texture.repeatY != this.field_Bc[this.activeTextureUnit]) {
          this.field_Cc.SetSamplerState(this.activeTextureUnit, 2, !texture.repeatY ? 3 : 1);
          this.field_Bc[this.activeTextureUnit] = texture.repeatY;
        }
    }

    final void bindVertexShader(int guard, jagdx.IDirect3DVertexShader shader) {
        this.field_Vc = shader;
        if (guard >= -29) {
          this.createIndexBuffer(-57, false);
        }
        this.field_Cc.SetVertexShader(shader);
        this.applyTextureMatrix(26803);
    }

    final void setAlphaCombineSource(int argument, boolean invert, byte guard, TextureCombineSource source) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = -118 / ((1 - guard) / 45);
        var7 = 0;
        var8 = argument;
        if (var8 == 1) {
          var6 = 6;
        } else {
          var6 = (var8 == 2) ? 27 : 5;
        }
        if (invert) {
          var7 = var7 | 16;
        }
        this.field_Cc.SetTextureStageState(this.activeTextureUnit, var6, DirectXGraphicsToolkit.d3dCombineSource(source, 21) | var7);
    }

    final void applyFogParameters(boolean guard) {
        this.field_Tb = (float)(this.field_Yb - this.field_Nb);
        this.field_E = this.field_Tb - (float)this.field_Kb;
        if (!guard) {
          return;
        }
        if ((float)this.field_oc > this.field_E) {
          this.field_E = (float)this.field_oc;
        }
        this.field_Cc.setRenderState(36, this.field_E);
        this.field_Cc.setRenderState(37, this.field_Tb);
        this.field_Cc.SetRenderState(34, this.field_C);
    }

    final void applyBlendFactors(int guard) {
        if (LimitedRandomAccessFile.ALPHA_BLEND == this.blendFactors) {
          this.field_Cc.SetRenderState(19, 5);
          this.field_Cc.SetRenderState(20, 6);
        } else {
          if (ServerDataReadRequest.ADDITIVE_BLEND != this.blendFactors) {
            if (this.blendFactors == ShrinkingRingEffect.DESTINATION_COLOR_BLEND) {
              this.field_Cc.SetRenderState(19, 9);
              this.field_Cc.SetRenderState(20, 2);
            }
          } else {
            this.field_Cc.SetRenderState(19, 2);
            this.field_Cc.SetRenderState(20, 2);
          }
        }
        if (guard != -19519) {
          this.field_Pc = (jagdx.D3DPRESENT_PARAMETERS) null;
        }
    }

    final void applyViewport(int guard) {
        this.field_Cc.SetViewport(this.field_r, this.field_y, this.field_rb, this.field_Sb, (float)guard, 1.0f);
    }

    final Texture2D createIntTexture2D(boolean mipmapped, int rowLength, int[] pixels, int width, int guard, int offset, int height) {
        if (guard >= -41) {
          field_Zc = (int[]) null;
        }
        return (Texture2D) ((Object) new DirectXTexture2D(this, width, height, mipmapped, pixels, offset, rowLength));
    }

    private final static int d3dTextureFilter(TextureFilter filter, boolean guard) {
        if (guard) {
          return -35;
        }
        if (filter == ArrayWidgetContainer.LINEAR) {
          return 2;
        }
        if (ServerDataReadRequest.NEAREST == filter) {
          return 1;
        }
        throw new IllegalArgumentException();
    }

    final void applyModelMatrix(int guard) {
        if (!this.modelIdentity) {
          this.modelTransform.writeColumnMajor4x4(guard - 79, field_Mc);
        } else {
          field_Mc[3] = 0.0f;
          field_Mc[10] = 1.0f;
          field_Mc[5] = 1.0f;
          field_Mc[9] = 0.0f;
          field_Mc[2] = 0.0f;
          field_Mc[14] = 0.0f;
          field_Mc[1] = 0.0f;
          field_Mc[4] = 0.0f;
          field_Mc[6] = 0.0f;
          field_Mc[13] = 0.0f;
          field_Mc[0] = 1.0f;
          field_Mc[11] = 0.0f;
          field_Mc[7] = 0.0f;
          field_Mc[15] = 1.0f;
          field_Mc[12] = 0.0f;
          field_Mc[8] = 0.0f;
        }
        if (guard != 0) {
          TextureCombineSource var3 = (TextureCombineSource) null;
          this.setColorCombineSource((byte) -44, 8, true, false, (TextureCombineSource) null);
        }
        this.field_Cc.SetTransform(256, field_Mc);
    }

    final void applyAlphaCombineOperation(int guard) {
        if (guard > -80) {
          this.field_Cc = (jagdx.IDirect3DDevice) null;
        }
        int var2 = !this.field_Ec[this.activeTextureUnit] ? 1 : DirectXGraphicsToolkit.d3dCombineOperation(this.alphaCombineOperations[this.activeTextureUnit], -34);
        this.field_Cc.SetTextureStageState(this.activeTextureUnit, 4, var2);
    }

    final void applyDepthWrite(int guard) {
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        stackIn_3_0 = this.field_Cc;
        stackIn_3_1 = 14;
        stackIn_4_2 = (this.field_db) && (this.depthWriteEnabled);
        ((jagdx.IDirect3DDevice) (Object) stackIn_3_0).setRenderState(stackIn_3_1, stackIn_4_2);
        if (guard < 113) {
          this.applyLighting(false);
        }
    }

    final void uploadDirectionalLights(int guard) {
        if (guard != 0) {
          return;
        }
        if (!this.field_Tc) {
          this.field_Cc.LightEnable(0, false);
          this.field_Cc.LightEnable(1, false);
          this.field_Cc.SetLight(0, this.field_Nc);
          this.field_Cc.SetLight(1, this.field_Rc);
          this.field_Cc.LightEnable(0, true);
          this.field_Cc.LightEnable(1, true);
          this.field_Tc = true;
        }
    }

    final void applyDirectionalLightsEnabled(int guard) {
        this.applyDirectionalLightColors(0);
        this.uploadDirectionalLights(guard + guard);
    }

    final ShaderEffect createShaderEffect(int guard, int effectId) {
        int var3;
        if (guard != 0) {
          this.updateTime(-24);
        }
        var3 = effectId;
        if (3 == var3) {
          return (ShaderEffect) ((Object) new DirectXUnderwaterEffect(this, this.field_ab));
        }
        if (4 == var3) {
          return (ShaderEffect) ((Object) new DirectXTransparentWaterEffect(this, this.field_ab, this.waterTextures));
        }
        if (var3 == 8) {
          return (ShaderEffect) ((Object) new DirectXEnvironmentWaterEffect(this, this.field_ab, this.waterTextures));
        }
        return super.createShaderEffect(0, effectId);
    }

    final RenderBuffer createRenderBuffer(int width, int height) {
        return null;
    }

    final boolean supportsTexture3D(byte guard, GpuDataType dataType, TextureFormat format) {
        jagdx.D3DDISPLAYMODE var4;
        int var5;
        boolean stackIn_4_0 = false;
        var5 = -33 / ((70 - guard) / 42);
        var4 = new jagdx.D3DDISPLAYMODE();
        stackIn_4_0 = (jagdx.HResult.succeeded(this.field_Xc.getAdapterDisplayMode(this.field_zc, var4), -85)) && (jagdx.HResult.succeeded(this.field_Xc.CheckDeviceFormat(this.field_zc, this.field_Ic, var4.Format, 0, 4, DirectXGraphicsToolkit.d3dTextureFormat(format, 68, dataType)), -108));
        return stackIn_4_0;
    }

    final float pixelCenterOffset(byte guard) {
        if (guard < 125) {
          this.field_Uc = (boolean[]) null;
        }
        return -0.5f;
    }

    final Texture2D createByteTexture2D(TextureFormat format, int width, int height, int rowLength, byte[] pixels, byte guard, int offset, boolean mipmapped) {
        int var9 = -61 % ((guard - 50) / 44);
        return (Texture2D) ((Object) new DirectXTexture2D(this, format, width, height, mipmapped, pixels, offset, rowLength));
    }

    final void resetDriverState(int guard) {
        int var2 = 0;
        boolean[] var3 = null;
        int var4 = 0;
        for (var2 = 0; var2 < this.textureUnitCount; var2++) {
          this.field_Cc.SetSamplerState(var2, 7, 0);
          this.field_Cc.SetSamplerState(var2, 6, 2);
          this.field_Cc.SetSamplerState(var2, 5, 2);
          this.field_Cc.SetSamplerState(var2, 1, 1);
          this.field_Cc.SetSamplerState(var2, 2, 1);
          this.field_Dc[var2] = ArrayWidgetContainer.LINEAR;
          var3 = this.field_Uc;
          var4 = var2;
          this.field_Bc[var2] = true;
          var3[var4] = true;
          this.field_ad[var2] = false;
          this.field_Gc[var2] = 0;
        }
        this.field_Cc.SetTextureStageState(0, 6, guard);
        this.field_Cc.SetRenderState(9, 2);
        this.field_Cc.SetRenderState(23, 4);
        this.field_Cc.SetRenderState(25, 5);
        this.field_Cc.SetRenderState(24, 0);
        this.field_Cc.SetRenderState(22, 2);
        this.field_Cc.SetRenderState(147, 1);
        this.field_Cc.SetRenderState(145, 1);
        this.field_Cc.setRenderState(38, 0.949999988079071f);
        this.field_Cc.SetRenderState(140, 3);
        this.field_Nc.SetType(3);
        this.field_Rc.SetType(3);
        this.field_Ac.SetType(1);
        this.field_Tc = false;
        super.resetDriverState(1);
    }

    final Texture3D createTexture3D(boolean guard, TextureFormat format, int depth, int height, byte[] pixels, int width) {
        if (!guard) {
          this.field_Ic = 63;
        }
        return (Texture3D) ((Object) new DirectXTexture3D(this, format, width, height, depth, pixels));
    }

    final void applyFogEnabled(byte guard) {
        jagdx.IDirect3DDevice stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        stackIn_4_0 = this.field_Cc;
        stackIn_4_1 = 28;
        stackIn_5_2 = (this.fogEnabled) && (this.fogAllowed) && (0 <= this.field_Kb);
        ((jagdx.IDirect3DDevice) (Object) stackIn_4_0).setRenderState(stackIn_4_1, stackIn_5_2);
        if (guard != -119) {
          this.field_Pc = (jagdx.D3DPRESENT_PARAMETERS) null;
        }
    }

    final Texture2D createFloatTexture2D(int offset, int width, boolean mipmapped, int rowLength, float[] pixels, int height, byte guard, TextureFormat format) {
        if (guard < -61) {
          return null;
        }
        return (Texture2D) null;
    }

    final static int d3dTextureFormat(TextureFormat format, int guard, GpuDataType dataType) {
        int var3;
        if (dataType == GpuDataType.UNSIGNED_BYTE) {
          if (ProgressDialog.RGB == format) {
            return 22;
          }
          if (format == BeveledTextInputRenderer.RGBA) {
            return 21;
          }
          if (format == IntrusiveNodeHashTable.ALPHA) {
            return 28;
          }
          if (format == IntroLogoRenderer.LUMINANCE) {
            return 50;
          }
          if (format == AchievementThresholds.LUMINANCE_ALPHA) {
            return 51;
          }
          if (ModalDialog.DEPTH_COMPONENT == format) {
            return 77;
          }
        }
        var3 = -123 % ((guard - 17) / 48);
        throw new IllegalArgumentException("");
    }

    final void applyBlendEnabled(byte guard) {
        if (guard != -4) {
          this.applyScissor(-23);
        }
        this.field_Cc.setRenderState(27, this.field_ob);
    }

    final void copyFrontToBack() {
    }

    final void setColorCombineSource(byte guard, int argument, boolean useAlpha, boolean invert, TextureCombineSource source) {
        int var6;
        int var7;
        int var8;
        int var9;
        var7 = 0;
        var8 = 57 % ((16 - guard) / 56);
        var9 = argument;
        if (var9 == 1) {
          var6 = 3;
        } else {
          var6 = (var9 == 2) ? 26 : 2;
        }
        if (useAlpha) {
          var7 = var7 | 32;
        }
        if (invert) {
          var7 = var7 | 16;
        }
        this.field_Cc.SetTextureStageState(this.activeTextureUnit, var6, DirectXGraphicsToolkit.d3dCombineSource(source, 21) | var7);
    }

    final void bindPixelShader(byte guard, jagdx.IDirect3DPixelShader shader) {
        int var3 = 106 / ((guard + 30) / 33);
        this.field_Cc.SetPixelShader(shader);
    }

    final void drawPrimitives(int startVertex, int guard, int primitiveCount, PrimitiveType type) {
        if (guard != 0) {
          Integer var6 = (Integer) null;
          DirectXGraphicsToolkit.createToolkit((java.awt.Canvas) null, (TextureProvider) null, (ResourceArchive) null, (Integer) null);
        }
        this.field_Cc.DrawPrimitive(DirectXGraphicsToolkit.d3dPrimitiveType(type, (byte) -121), startVertex, primitiveCount);
    }

    final void applyScissorEnabled(int guard) {
        int var2 = -106 % ((guard - 0) / 55);
        this.field_Cc.setRenderState(174, this.scissorEnabled);
    }

    final void bindSpriteTarget(ToolkitSprite sprite, boolean withBuffer) {
    }

    final void applyProjectionMatrix(int guard) {
        this.field_Cc.SetTransform(3, this.projectionMatrix);
        if (guard != -2) {
          field_Fc = (int[]) null;
        }
    }

    final void dispose() {
        this.field_Wc.releaseAll(-25924);
        super.dispose();
    }

    private DirectXGraphicsToolkit(int param0, int param1, java.awt.Canvas param2, jaclib.peer.PeerReferenceManager param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, DirectXSwapChainSurface param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, TextureProvider param9, ResourceArchive param10, int param11) {
        super(param2, param6, param9, param10, param11, 0);
        jagdx.GeometryBuffer discarded$0 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        int stackIn_10_1 = 0;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        Throwable decompiledCaughtException = null;
        Throwable var13 = null;
        this.field_Tc = false;
        this.field_Lc = 0;
        try {
          this.field_Kc = param8;
          this.field_Pc = param7;
          this.field_Wc = param3;
          this.field_Ic = param1;
          this.field_Hc = param6;
          this.field_Cc = param5;
          this.field_zc = param0;
          this.field_Xc = param4;
          this.field_Nc = new jagdx.D3DLIGHT(this.field_Wc);
          this.field_Rc = new jagdx.D3DLIGHT(this.field_Wc);
          this.field_Ac = new jagdx.D3DLIGHT(this.field_Wc);
          this.field_Jc = new jagdx.PixelBuffer(this.field_Wc);
          this.field_Yc = new jagdx.GeometryBuffer(this.field_Wc);
          discarded$0 = new jagdx.GeometryBuffer(this.field_Wc);
          stackIn_4_1 = (0 != (2048 & this.field_Kc.TextureCaps));
          this.field_W = stackIn_4_1;
          stackIn_7_1 = (0 == (this.field_Kc.TextureCaps & 2));
          this.field_Oc = stackIn_7_1;
          this.textureUnitCount = this.field_Kc.MaxSimultaneousTextures;
          if (this.field_Kc.MaxActiveLights > 0) {
            stackIn_10_1 = this.field_Kc.MaxActiveLights;
          } else {
            stackIn_10_1 = 8;
          }
          this.field_bc = stackIn_10_1;
          stackIn_13_1 = ((16384 & this.field_Kc.TextureCaps) != 0);
          this.field_Sc = stackIn_13_1;
          stackIn_16_1 = (0 != (8192 & this.field_Kc.TextureCaps));
          this.field_Eb = stackIn_16_1;
          stackIn_19_1 = ((65536 & this.field_Kc.TextureCaps) != 0);
          this.field_Qc = stackIn_19_1;
          if (this.field_Y <= 0) {
            this.field_Xc.CheckDeviceMultiSampleType(this.field_zc, this.field_Ic, this.field_Pc.BackBufferFormat, true, 2);
          }
          this.field_Uc = new boolean[this.textureUnitCount];
          this.field_Bc = new boolean[this.textureUnitCount];
          this.field_ad = new boolean[this.textureUnitCount];
          this.field_Ec = new boolean[this.textureUnitCount];
          this.field_Gc = new int[this.textureUnitCount];
          this.field_Dc = new TextureFilter[this.textureUnitCount];
          this.field_Cc.BeginScene();
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          var13.printStackTrace();
          this.close((byte) -13);
          throw new RuntimeException("");
        }
    }

    final VertexBuffer createVertexBuffer(byte guard, boolean dynamic) {
        if (guard != 51) {
          return (VertexBuffer) null;
        }
        return (VertexBuffer) ((Object) new DirectXVertexBuffer(this, dynamic));
    }

    final void restoreCanvasTarget() {
    }

    final void applyDirectionalLightColors(int arrayOffset) {
        float var2 = this.field_Z ? this.field_S : 0.0f;
        float var3 = this.field_Z ? -this.field_hb : 0.0f;
        this.field_Nc.SetDiffuse(this.field_J * var2, this.field_jb * var2, this.field_Xb * var2, 0.0f);
        this.field_Rc.SetDiffuse(this.field_J * var3, var3 * this.field_jb, var3 * this.field_Xb, (float)arrayOffset);
        this.field_Tc = false;
    }

    final void applyTexCoordGeneration(int guard, TextureCoordinateGeneration mode) {
        int var3;
        var3 = 0;
        if (guard != 13754) {
          this.applyTextureConstantColor(-14);
        }
        if (BeveledTextInputRenderer.NORMAL_MAP == mode) {
          var3 = 65536;
        } else {
          if (mode != DroneProximitySupport.EYE_LINEAR) {
            if (LabeledWidget.REFLECTION_MAP == mode) {
              var3 = 196608;
            }
          } else {
            var3 = 131072;
          }
        }
        this.field_Cc.SetTextureStageState(this.activeTextureUnit, 11, this.activeTextureUnit | var3);
    }

    final void present(int sourceX, int sourceY) throws RenderPresentationException {
        int fieldTemp$1 = 0;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        this.field_Cc.EndScene();
        if (!this.field_Hc.isValid(-22169)) {
          fieldTemp$1 = this.field_Lc + 1;
          this.field_Lc = this.field_Lc + 1;
          if (fieldTemp$1 > 50) {
            throw new RenderPresentationException();
          }
          discarded$2 = this.resetDevice(true);
        } else {
          this.field_Lc = 0;
          if (jagdx.HResult.failed(this.field_Hc.present(0, -95), -1)) {
            discarded$3 = this.resetDevice(true);
          }
        }
        this.field_Cc.BeginScene();
    }

    final static GraphicsToolkit createToolkit(java.awt.Canvas param0, TextureProvider param1, ResourceArchive param2, Integer param3) {
        DirectXGraphicsToolkit stackIn_42_0 = null;
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
        DirectXSwapChainSurface var13 = null;
        jagdx.DirectXException var14 = null;
        DirectXGraphicsToolkit var15 = null;
        var4 = null;
        try {
          var5_int = 0;
          var6 = 1;
          var7 = new jaclib.peer.PeerReferenceManager();
          var8 = jagdx.IDirect3D.createDirect3D(-2147483616, var7);
          var9 = var8.getDeviceCaps(var5_int, var6);
          if ((16777216 & var9.RasterCaps) == 0) {
            throw new RuntimeException("");
          }
          if (var9.MaxSimultaneousTextures < 2) {
            throw new RuntimeException("");
          }
          if ((2 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if ((8 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if ((64 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if ((512 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if (0 == (var9.TextureOpCaps & 33554432)) {
            throw new RuntimeException("");
          }
          if ((16 & (var9.DestBlendCaps & var9.SrcBlendCaps)) == 0) {
            throw new RuntimeException("");
          }
          if ((32 & (var9.DestBlendCaps & var9.SrcBlendCaps)) == 0) {
            throw new RuntimeException("");
          }
          if (0 == (2 & (var9.DestBlendCaps & var9.SrcBlendCaps))) {
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
          if (!DirectXGraphicsToolkit.choosePresentationFormats(var8, var6, var5_int, param3.intValue(), 6, var10)) {
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
            var12_ref = var8.createDevice(var5_int, var6, param0, 64 | var11, var10);
          } catch (jagdx.DirectXException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var14 = (jagdx.DirectXException) (Object) decompiledCaughtException;
            var12_ref = var8.createDevice(var5_int, var6, param0, 32 | var11, var10);
          }
          var13 = new DirectXSwapChainSurface(var12_ref.getSwapChain(0), var12_ref.getDepthStencilSurface());
          var15 = new DirectXGraphicsToolkit(var5_int, var6, param0, var7, var8, var12_ref, var13, var10, var9, param1, param2, param3.intValue());
          var4 = var15;
          var15.initializeHardwareResources(false);
          stackIn_42_0 = var15;
          return (GraphicsToolkit) ((Object) stackIn_42_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          if (var4 != null) {
            ((DirectXGraphicsToolkit) (var4)).dispose();
          }
          throw var5;
        }
    }

    final void applyLightPositions(int guard) {
        this.field_Nc.SetDirection(-this.field_G[0], -this.field_G[1], -this.field_G[2]);
        this.field_Rc.SetDirection(-this.field_U[0], -this.field_U[1], -this.field_U[2]);
        this.field_Tc = false;
        if (guard > -47) {
          this.field_zc = 11;
        }
    }

    static {
        field_Mc = new float[16];
        field_Zc = new int[]{77, 80};
        field_Fc = new int[]{22, 23};
    }
}
