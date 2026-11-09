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
        var12 = this.field_Cc.c(0);
        var9 = this.field_Cc.a(width, height, 21, 0, 0, true);
        if (jagdx.HResult.succeeded(var9.LockRect(0, 0, width, height, 0, this.field_Jc), -74)) {
          if (0 == stride) {
            stride = width;
          }
          var10 = this.field_Jc.getRowPitch();
          if (stride == width &&
            var10 == 4 * width) {
            this.field_Jc.a(pixels, offset, 0, width * height);
          } else {
            for (var11 = 0; var11 < height; var11++) {
              this.field_Jc.a(pixels, offset + var11 * stride, var10 * var11, width);
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
          this.a();
        }
        this.field_Cc.SetScissorRect(this.field_r + this.field_v, this.field_y + this.field_vb, this.field_F, this.field_yc);
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
        if (this.field_Ec[this.field_mc]) {
          this.field_Ec[this.field_mc] = false;
          this.field_Cc.SetTexture(this.field_mc, (jagdx.IDirect3DBaseTexture) null);
          this.applyAlphaCombineOperation(-109);
          this.applyColorCombineOperation((byte) -93);
        }
    }

    final Texture2D a(GpuDataType param0, TextureFormat param1, int param2, int param3, byte param4) {
        if (param4 > -99) {
          this.applyTextureMatrix(-14);
        }
        return (Texture2D) ((Object) new DirectXTexture2D(this, param1, param0, param3, param2));
    }

    final void bindVertexLayout(int guard, VertexLayout layout) {
        int var3 = 121 % ((71 - guard) / 45);
        dxVertexLayout var4 = (dxVertexLayout) (layout);
        this.field_Cc.SetVertexDeclaration(var4.field_d);
    }

    final void a(int param0, DirectXTexture3D param1) {
        this.a((DirectXTexture) (param1), 1);
        if (!this.field_Uc[this.field_mc]) {
          this.field_Cc.SetSamplerState(this.field_mc, 1, 1);
          this.field_Uc[this.field_mc] = true;
        }
        if (!this.field_Bc[this.field_mc]) {
          this.field_Cc.SetSamplerState(this.field_mc, 2, 1);
          this.field_Bc[this.field_mc] = true;
        }
        if (param0 != 2) {
          field_Zc = (int[]) null;
        }
    }

    final CubeTexture a(int param0, byte param1, int[][] param2, boolean param3) {
        int var5 = -93 / ((param1 + 23) / 48);
        return (CubeTexture) ((Object) new DirectXCubeTexture(this, param0, param3, param2));
    }

    private final static boolean a(jagdx.IDirect3D param0, int param1, int param2, int param3, int param4, jagdx.D3DPRESENT_PARAMETERS param5) {
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
        if (param4 != 6) {
          field_Zc = (int[]) null;
        }
        var8 = 0;
        try {
          var12 = new jagdx.D3DDISPLAYMODE();
          var13 = var12;
          if (jagdx.HResult.failed(param0.a(param2, var13), -1)) {
            return false;
          }
          scanLoop1: while (true) {
            if (param3 >= 0) {
              if (param3 != 1) {
                var8 = 0 + param3;
                for (var10 = 0; field_Fc.length > var10; var10++) {
                  if (param0.CheckDeviceType(param2, param1, var12.Format, field_Fc[var10], true) == 0 &&
                    param0.CheckDeviceFormat(param2, param1, var12.Format, 1, 1, field_Fc[var10]) == 0 && (param3 == 0 ||
                    0 == param0.CheckDeviceMultiSampleType(param2, param1, field_Fc[var10], true, var8))) {
                    for (var11 = 0; var11 < field_Zc.length; var11++) {
                      if (param0.CheckDeviceFormat(param2, param1, var12.Format, 2, 1, field_Zc[var11]) == 0 &&
                        0 == param0.CheckDepthStencilMatch(param2, param1, var12.Format, field_Fc[var10], field_Zc[var11]) && (param3 == 0 ||
                        param0.CheckDeviceMultiSampleType(param2, param1, field_Zc[var10], true, var8) == 0)) {
                        var7 = field_Fc[var10];
                        var6 = field_Zc[var11];
                        break scanLoop1;
                      }
                    }
                  }
                }
              }
              param3--;
              continue;
            }
            break;
          }
          if (0 <= param3 &&
            0 != var7) {
            if (var6 == 0) {
              return false;
            }
            param5.BackBufferFormat = var7;
            param5.MultiSampleQuality = 0;
            param5.AutoDepthStencilFormat = var6;
            param5.MultiSampleType = var8;
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
          HotspotTextWidget.field_L != this.field_wb[this.field_mc]) {
          if (this.field_wb[this.field_mc] != IntList.field_c) {
            this.field_Cc.SetTransform(this.field_mc + 16, this.field_V[this.field_mc].writeColumnMajor4x4(-68, field_Mc));
          } else {
            this.field_Cc.SetTransform(this.field_mc + 16, this.field_V[this.field_mc].writeTextureMatrix4x4(field_Mc, 111));
          }
          var2 = DirectXGraphicsToolkit.b(this.field_wb[this.field_mc], guard - 23700);
          if (var2 != this.field_Gc[this.field_mc]) {
            this.field_Cc.SetTextureStageState(this.field_mc, 24, var2);
            this.field_Gc[this.field_mc] = var2;
          }
        } else {
          this.field_Cc.SetTextureStageState(this.field_mc, 24, 0);
          this.field_Gc[this.field_mc] = 0;
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
        int var2 = !this.field_Ec[this.field_mc] ? 1 : DirectXGraphicsToolkit.a(this.field_K[this.field_mc], -124);
        this.field_Cc.SetTextureStageState(this.field_mc, 1, var2);
    }

    final void setMultisampling(int guard, boolean enabled) {
        if (guard != 1) {
          this.applyLighting(true);
        }
        this.field_Cc.a(161, enabled);
    }

    private final static int b(tf param0, int param1) {
        TextureFilter var3;
        if (param0 == HardwareGraphicsHeap.field_m) {
          return 1;
        }
        if (IntList.field_c == param0) {
          return 2;
        }
        if (param0 == LegacyRidgedWaterNoise.field_y) {
          return 3;
        }
        if (param0 == kr.field_a) {
          return 4;
        }
        if (HardwareGraphicsToolkit.field_t == param0) {
          return 256;
        }
        if (param1 == 3103) {
          return 0;
        }
        var3 = (TextureFilter) null;
        DirectXGraphicsToolkit.a((TextureFilter) null, false);
        return 0;
    }

    final void Y(int param0) {
        ko var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        for (var2 = 0; this.field_ub > var2; var2++) {
          var3 = this.field_pb[var2];
          var4 = var2 + 2;
          var5 = var3.c((byte) 50);
          var6 = var3.a(0) / 255.0f;
          this.field_Ac.SetPosition((float)var3.a((byte) 117), (float)var3.d((byte) 109), (float)var3.c(true));
          this.field_Ac.SetDiffuse((float)((var5 & 16740345) >> 16) * var6, (float)((var5 & 65514) >> 8) * var6, var6 * (float)(var5 & 255), 0.0f);
          this.field_Ac.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.c(0) * var3.c(0)));
          this.field_Ac.SetRange((float)var3.c(0));
          this.field_Cc.SetLight(var4, this.field_Ac);
          this.field_Cc.LightEnable(var4, true);
        }
        while (this.field_Ab > var2) {
          this.field_Cc.LightEnable(2 + var2, false);
          var2++;
        }
        if (param0 > -83) {
          this.field_zc = -101;
        }
        super.Y(-100);
    }

    final void applyDepthTest(int guard) {
        this.field_Cc.a(7, this.field_p);
        if (guard <= 19) {
          this.applyScissorEnabled(30);
        }
    }

    final VertexLayout a(VertexStreamLayout[] param0, byte param1) {
        if (param1 <= 6) {
          return (VertexLayout) null;
        }
        return (VertexLayout) ((Object) new dxVertexLayout(this, param0));
    }

    final void applyTextureConstantColor(int greenIndex) {
        this.field_Cc.SetRenderState(60, this.field_Ub);
        if (greenIndex != 1) {
          this.field_Dc = (TextureFilter[]) null;
        }
    }

    final synchronized void updateTime(int timeMillis) {
        this.field_Wc.pollReleasedReferences(12575);
        super.updateTime(timeMillis);
    }

    final void a(DirectXTexture param0, int param1) {
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
        this.field_Cc.SetTexture(this.field_mc, param0.nativeTexture(-22689));
        if (this.field_Dc[this.field_mc] != param0.filter) {
          var3 = DirectXGraphicsToolkit.a(param0.filter, false);
          this.field_Cc.SetSamplerState(this.field_mc, 6, var3);
          this.field_Cc.SetSamplerState(this.field_mc, 5, var3);
          this.field_Dc[this.field_mc] = param0.filter;
          stackIn_11_0 = this.field_ad[this.field_mc];
          stackIn_12_1 = (param0.mipmapped) ? 0 : 1;
          if ((stackIn_11_0 ? 1 : 0) == stackIn_12_1) {
            stackIn_15_0 = this.field_Cc;
            stackIn_15_1 = this.field_mc;
            stackIn_15_2 = 7;
            if (!param0.mipmapped) {
              stackIn_16_3 = 0;
            } else {
              stackIn_16_3 = DirectXGraphicsToolkit.a(param0.filter, false);
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_15_0).SetSamplerState(stackIn_15_1, stackIn_15_2, stackIn_16_3);
            this.field_ad[this.field_mc] = param0.mipmapped;
          }
        } else {
          stackIn_3_0 = this.field_ad[this.field_mc];
          stackIn_4_1 = (param0.mipmapped) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) == stackIn_4_1) {
            stackIn_7_0 = this.field_Cc;
            stackIn_7_1 = this.field_mc;
            stackIn_7_2 = 7;
            if (param0.mipmapped) {
              stackIn_8_3 = DirectXGraphicsToolkit.a(param0.filter, false);
            } else {
              stackIn_8_3 = 0;
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_7_0).SetSamplerState(stackIn_7_1, stackIn_7_2, stackIn_8_3);
            this.field_ad[this.field_mc] = param0.mipmapped;
          }
        }
        if (!this.field_Ec[this.field_mc]) {
          this.field_Ec[this.field_mc] = true;
          this.applyAlphaCombineOperation(-115);
          this.applyColorCombineOperation((byte) -113);
        }
        if (param1 != 1) {
          this.field_Oc = false;
        }
    }

    final void clear(int color) {
        this.field_Cc.Clear(1, color, 0.0f, 0);
    }

    private final boolean h(boolean param0) {
        DirectXSwapChainSurface var3 = null;
        int var4 = 0;
        int var2 = this.field_Cc.TestCooperativeLevel();
        if (var2 == 0 ||
          var2 == -2005530519) {
          var3 = (DirectXSwapChainSurface) (this.field_Ib);
          this.s((byte) 81);
          var3.close((byte) 71);
          this.field_Pc.BackBufferWidth = 0;
          this.field_Pc.BackBufferHeight = 0;
          if (DirectXGraphicsToolkit.a(this.field_Xc, this.field_Ic, this.field_zc, this.field_Y, 6, this.field_Pc)) {
            var4 = this.field_Cc.Reset(this.field_Pc);
            if (jagdx.HResult.succeeded(var4, -72)) {
              var3.attach(false, this.field_Cc.b(), this.field_Cc.b(0));
              this.P(-100);
              this.D(1);
              return true;
            }
          }
        }
        if (!param0) {
          this.field_Sc = true;
          return false;
        }
        return false;
    }

    private final static int a(TextureCombineOperation param0, int param1) {
        if (param1 >= -23) {
          field_Zc = (int[]) null;
        }
        if (lf.REPLACE == param0) {
          return 2;
        }
        if (SlowBurstParticle.MODULATE == param0) {
          return 4;
        }
        if (param0 == OpenGlBuffer.INTERPOLATE) {
          return 26;
        }
        if (param0 == LoginForm.ADD) {
          return 7;
        }
        if (EmailAvailabilityRequest.SUBTRACT == param0) {
          return 10;
        }
        throw new IllegalArgumentException();
    }

    private final static int a(TextureCombineSource param0, int param1) {
        if (param1 != 21) {
          return 11;
        }
        if (jq.TEXTURE == param0) {
          return 2;
        }
        if (NetworkResourceRequest.PRIMARY_COLOR == param0) {
          return 0;
        }
        if (param0 == FontMetrics.PREVIOUS) {
          return 1;
        }
        if (param0 != AccountRequestState.CONSTANT) {
          throw new IllegalArgumentException();
        }
        return 3;
    }

    final void c(int param0, int param1) {
        if (param1 < 83) {
          byte[] var4 = (byte[]) null;
          this.a(true, (TextureFormat) null, -117, -19, (byte[]) null, 96);
        }
        this.field_Cc.SetTextureStageState(this.field_mc, 11, param0);
    }

    final boolean a(GpuDataType param0, TextureFormat param1, int param2) {
        jagdx.D3DDISPLAYMODE var4;
        boolean stackIn_6_0 = false;
        if (param2 != 6) {
          this.applyDirectionalLightColors(-77);
        }
        var4 = new jagdx.D3DDISPLAYMODE();
        stackIn_6_0 = (jagdx.HResult.succeeded(this.field_Xc.a(this.field_zc, var4), -41)) && (jagdx.HResult.succeeded(this.field_Xc.CheckDeviceFormat(this.field_zc, this.field_Ic, var4.Format, 0, 3, DirectXGraphicsToolkit.a(param1, -55, param0)), -63));
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

    final boolean a() {
        return false;
    }

    final void applyAlphaTest(int guard) {
        this.field_Cc.a(15, this.field_u);
        int var2 = 111 % ((guard + 6) / 54);
    }

    final Object a(java.awt.Canvas param0, int param1) {
        if (param1 == 3) {
          return null;
        }
        this.applyAlphaCombineOperation(-60);
        return null;
    }

    private final static int a(PrimitiveType param0, byte param1) {
        TextureFilter var3;
        if (param1 != -121) {
          var3 = (TextureFilter) null;
          DirectXGraphicsToolkit.a((TextureFilter) null, true);
        }
        if (param0 == PasswordValidator.LINES) {
          return 2;
        }
        if (param0 == rv.LINE_STRIP) {
          return 3;
        }
        if (JaggrabDownloader.POINTS == param0) {
          return 1;
        }
        if (WhirlpoolDigest.TRIANGLES == param0) {
          return 4;
        }
        if (param0 == AccountServiceResult.TRIANGLE_FAN) {
          return 6;
        }
        if (param0 == OpenGlVertexLayout.TRIANGLE_STRIP) {
          return 5;
        }
        throw new IllegalArgumentException("");
    }

    final void N(int param0) {
        if (param0 != -26911) {
          this.field_Hc = (DirectXSwapChainSurface) null;
        }
        if (!this.field_s.a(param0 ^ 10036)) {
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
          this.field_Gb.writeColumnMajor4x4(-110, field_Mc);
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
        stackIn_6_2 = (this.field_I) && (!this.lightingSuppressed);
        ((jagdx.IDirect3DDevice) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_6_2);
    }

    final void a(int param0, DirectXTexture2D param1) {
        if (param0 != 1) {
          TextureCoordinateGeneration var4 = (TextureCoordinateGeneration) null;
          this.applyTexCoordGeneration(94, (TextureCoordinateGeneration) null);
        }
        this.a((DirectXTexture) (param1), param0 ^ 0);
        if (this.field_Uc[this.field_mc] != param1.repeatX) {
          this.field_Cc.SetSamplerState(this.field_mc, 1, !param1.repeatX ? 3 : 1);
          this.field_Uc[this.field_mc] = param1.repeatX;
        }
        if (param1.repeatY != this.field_Bc[this.field_mc]) {
          this.field_Cc.SetSamplerState(this.field_mc, 2, !param1.repeatY ? 3 : 1);
          this.field_Bc[this.field_mc] = param1.repeatY;
        }
    }

    final void a(int param0, jagdx.IDirect3DVertexShader param1) {
        this.field_Vc = param1;
        if (param0 >= -29) {
          this.createIndexBuffer(-57, false);
        }
        this.field_Cc.SetVertexShader(param1);
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
        this.field_Cc.SetTextureStageState(this.field_mc, var6, DirectXGraphicsToolkit.a(source, 21) | var7);
    }

    final void b(boolean param0) {
        this.field_Tb = (float)(this.field_Yb - this.field_Nb);
        this.field_E = this.field_Tb - (float)this.field_Kb;
        if (!param0) {
          return;
        }
        if ((float)this.field_oc > this.field_E) {
          this.field_E = (float)this.field_oc;
        }
        this.field_Cc.a(36, this.field_E);
        this.field_Cc.a(37, this.field_Tb);
        this.field_Cc.SetRenderState(34, this.field_C);
    }

    final void applyBlendFactors(int guard) {
        if (LimitedRandomAccessFile.field_a == this.field_l) {
          this.field_Cc.SetRenderState(19, 5);
          this.field_Cc.SetRenderState(20, 6);
        } else {
          if (ServerDataReadRequest.field_n != this.field_l) {
            if (this.field_l == ShrinkingRingEffect.field_t) {
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

    final Texture2D a(boolean param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        if (param4 >= -41) {
          field_Zc = (int[]) null;
        }
        return (Texture2D) ((Object) new DirectXTexture2D(this, param3, param6, param0, param2, param5, param1));
    }

    private final static int a(TextureFilter param0, boolean param1) {
        if (param1) {
          return -35;
        }
        if (param0 == ArrayWidgetContainer.LINEAR) {
          return 2;
        }
        if (ServerDataReadRequest.NEAREST == param0) {
          return 1;
        }
        throw new IllegalArgumentException();
    }

    final void x(int param0) {
        if (!this.field_Db) {
          this.field_Lb.writeColumnMajor4x4(param0 - 79, field_Mc);
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
        if (param0 != 0) {
          TextureCombineSource var3 = (TextureCombineSource) null;
          this.setColorCombineSource((byte) -44, 8, true, false, (TextureCombineSource) null);
        }
        this.field_Cc.SetTransform(256, field_Mc);
    }

    final void applyAlphaCombineOperation(int guard) {
        if (guard > -80) {
          this.field_Cc = (jagdx.IDirect3DDevice) null;
        }
        int var2 = !this.field_Ec[this.field_mc] ? 1 : DirectXGraphicsToolkit.a(this.field_B[this.field_mc], -34);
        this.field_Cc.SetTextureStageState(this.field_mc, 4, var2);
    }

    final void applyDepthWrite(int guard) {
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        stackIn_3_0 = this.field_Cc;
        stackIn_3_1 = 14;
        stackIn_4_2 = (this.field_db) && (this.field_i);
        ((jagdx.IDirect3DDevice) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2);
        if (guard < 113) {
          this.applyLighting(false);
        }
    }

    final void J(int param0) {
        if (param0 != 0) {
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
        this.J(guard + guard);
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

    final boolean a(byte param0, GpuDataType param1, TextureFormat param2) {
        jagdx.D3DDISPLAYMODE var4;
        int var5;
        boolean stackIn_4_0 = false;
        var5 = -33 / ((70 - param0) / 42);
        var4 = new jagdx.D3DDISPLAYMODE();
        stackIn_4_0 = (jagdx.HResult.succeeded(this.field_Xc.a(this.field_zc, var4), -85)) && (jagdx.HResult.succeeded(this.field_Xc.CheckDeviceFormat(this.field_zc, this.field_Ic, var4.Format, 0, 4, DirectXGraphicsToolkit.a(param2, 68, param1)), -108));
        return stackIn_4_0;
    }

    final float b(byte param0) {
        if (param0 < 125) {
          this.field_Uc = (boolean[]) null;
        }
        return -0.5f;
    }

    final Texture2D a(TextureFormat param0, int param1, int param2, int param3, byte[] param4, byte param5, int param6, boolean param7) {
        int var9 = -61 % ((param5 - 50) / 44);
        return (Texture2D) ((Object) new DirectXTexture2D(this, param0, param1, param2, param7, param4, param6, param3));
    }

    final void D(int param0) {
        int var2 = 0;
        boolean[] var3 = null;
        int var4 = 0;
        for (var2 = 0; var2 < this.field_cc; var2++) {
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
        this.field_Cc.SetTextureStageState(0, 6, param0);
        this.field_Cc.SetRenderState(9, 2);
        this.field_Cc.SetRenderState(23, 4);
        this.field_Cc.SetRenderState(25, 5);
        this.field_Cc.SetRenderState(24, 0);
        this.field_Cc.SetRenderState(22, 2);
        this.field_Cc.SetRenderState(147, 1);
        this.field_Cc.SetRenderState(145, 1);
        this.field_Cc.a(38, 0.949999988079071f);
        this.field_Cc.SetRenderState(140, 3);
        this.field_Nc.SetType(3);
        this.field_Rc.SetType(3);
        this.field_Ac.SetType(1);
        this.field_Tc = false;
        super.D(1);
    }

    final Texture3D a(boolean param0, TextureFormat param1, int param2, int param3, byte[] param4, int param5) {
        if (!param0) {
          this.field_Ic = 63;
        }
        return (Texture3D) ((Object) new DirectXTexture3D(this, param1, param5, param3, param2, param4));
    }

    final void applyFogEnabled(byte guard) {
        jagdx.IDirect3DDevice stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        stackIn_4_0 = this.field_Cc;
        stackIn_4_1 = 28;
        stackIn_5_2 = (this.field_Rb) && (this.field_Bb) && (0 <= this.field_Kb);
        ((jagdx.IDirect3DDevice) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_5_2);
        if (guard != -119) {
          this.field_Pc = (jagdx.D3DPRESENT_PARAMETERS) null;
        }
    }

    final Texture2D a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, TextureFormat param7) {
        if (param6 < -61) {
          return null;
        }
        return (Texture2D) null;
    }

    final static int a(TextureFormat param0, int param1, GpuDataType param2) {
        int var3;
        if (param2 == GpuDataType.UNSIGNED_BYTE) {
          if (ProgressDialog.RGB == param0) {
            return 22;
          }
          if (param0 == BeveledTextInputRenderer.RGBA) {
            return 21;
          }
          if (param0 == IntrusiveNodeHashTable.ALPHA) {
            return 28;
          }
          if (param0 == kd.LUMINANCE) {
            return 50;
          }
          if (param0 == ps.LUMINANCE_ALPHA) {
            return 51;
          }
          if (ModalDialog.DEPTH_COMPONENT == param0) {
            return 77;
          }
        }
        var3 = -123 % ((param1 - 17) / 48);
        throw new IllegalArgumentException("");
    }

    final void applyBlendEnabled(byte guard) {
        if (guard != -4) {
          this.applyScissor(-23);
        }
        this.field_Cc.a(27, this.field_ob);
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
        this.field_Cc.SetTextureStageState(this.field_mc, var6, DirectXGraphicsToolkit.a(source, 21) | var7);
    }

    final void a(byte param0, jagdx.IDirect3DPixelShader param1) {
        int var3 = 106 / ((param0 + 30) / 33);
        this.field_Cc.SetPixelShader(param1);
    }

    final void drawPrimitives(int startVertex, int guard, int primitiveCount, PrimitiveType type) {
        if (guard != 0) {
          Integer var6 = (Integer) null;
          DirectXGraphicsToolkit.createToolkit((java.awt.Canvas) null, (TextureProvider) null, (ResourceArchive) null, (Integer) null);
        }
        this.field_Cc.DrawPrimitive(DirectXGraphicsToolkit.a(type, (byte) -121), startVertex, primitiveCount);
    }

    final void applyScissorEnabled(int guard) {
        int var2 = -106 % ((guard - 0) / 55);
        this.field_Cc.a(174, this.field_wc);
    }

    final void bindSpriteTarget(ToolkitSprite sprite, boolean withBuffer) {
    }

    final void applyProjectionMatrix(int guard) {
        this.field_Cc.SetTransform(3, this.field_A);
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
          this.field_cc = this.field_Kc.MaxSimultaneousTextures;
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
          this.field_Uc = new boolean[this.field_cc];
          this.field_Bc = new boolean[this.field_cc];
          this.field_ad = new boolean[this.field_cc];
          this.field_Ec = new boolean[this.field_cc];
          this.field_Gc = new int[this.field_cc];
          this.field_Dc = new TextureFilter[this.field_cc];
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
          if (mode != wn.EYE_LINEAR) {
            if (LabeledWidget.REFLECTION_MAP == mode) {
              var3 = 196608;
            }
          } else {
            var3 = 131072;
          }
        }
        this.field_Cc.SetTextureStageState(this.field_mc, 11, this.field_mc | var3);
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
          discarded$2 = this.h(true);
        } else {
          this.field_Lc = 0;
          if (jagdx.HResult.failed(this.field_Hc.present(0, -95), -1)) {
            discarded$3 = this.h(true);
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
          var8 = jagdx.IDirect3D.a(-2147483616, var7);
          var9 = var8.a(var5_int, var6);
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
          if (!DirectXGraphicsToolkit.a(var8, var6, var5_int, param3.intValue(), 6, var10)) {
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
            var12_ref = var8.a(var5_int, var6, param0, 64 | var11, var10);
          } catch (jagdx.DirectXException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var14 = (jagdx.DirectXException) (Object) decompiledCaughtException;
            var12_ref = var8.a(var5_int, var6, param0, 32 | var11, var10);
          }
          var13 = new DirectXSwapChainSurface(var12_ref.b(0), var12_ref.b());
          var15 = new DirectXGraphicsToolkit(var5_int, var6, param0, var7, var8, var12_ref, var13, var10, var9, param1, param2, param3.intValue());
          var4 = var15;
          var15.e(false);
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
