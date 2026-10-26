/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class kr extends bf {
    private boolean[] field_sc;
    boolean field_rc;
    private jagdx.IDirect3DVertexShader field_zc;
    private boolean[] field_Qc;
    boolean field_Dc;
    private jagdx.D3DPRESENT_PARAMETERS field_Pc;
    private int field_Kc;
    private static int[] field_uc;
    private jagdx.IDirect3D field_wc;
    jagdx.D3DCAPS field_Bc;
    jagdx.IDirect3DDevice field_Rc;
    boolean field_Gc;
    private boolean[] field_Lc;
    private cb field_xc;
    private ke[] field_Oc;
    private static float[] field_Sc;
    private boolean[] field_Ac;
    private int[] field_Cc;
    private boolean field_Mc;
    private jagdx.D3DLIGHT field_yc;
    private static int[] field_Jc;
    jagdx.GeometryBuffer field_vc;
    private jagdx.D3DLIGHT field_Nc;
    private jagdx.D3DLIGHT field_Fc;
    jagdx.PixelBuffer field_Ec;
    private int field_Hc;
    jaclib.peer.qt field_Ic;
    private int field_tc;

    final void a(int param0, tl param1, int param2) {
        cj var4 = (cj) (param1);
        this.field_Rc.SetStreamSource(param2, var4.field_f, 0, var4.b(param0));
    }

    final bp a(int param0, int param1, int param2, hd param3, int param4, byte[] param5) {
        if (param1 > -93) {
          this.field_Qc = (boolean[]) null;
        }
        return (bp) ((Object) new nt(this, param3, param2, param0, param4, param5));
    }

    private final static boolean a(int param0, jagdx.D3DPRESENT_PARAMETERS param1, byte param2, int param3, int param4, jagdx.IDirect3D param5) {
        int var6 = 0;
        int var7 = 0;
        int var9 = -92 % ((67 - param2) / 45);
        int var8 = 0;
        try {
          jagdx.D3DDISPLAYMODE var13 = new jagdx.D3DDISPLAYMODE();
          jagdx.D3DDISPLAYMODE var14 = var13;
          if (jagdx.gf.a(-1, param5.a(param4, var14))) {
            return false;
          }
          scanLoop1: while (true) {
            if (0 <= param0) {
              if (1 != param0) {
                var8 = param0 + 0;
                for (int var11 = 0; var11 < field_Jc.length; var11++) {
                  if (0 == param5.CheckDeviceType(param4, param3, var13.Format, field_Jc[var11], true) &&
                    param5.CheckDeviceFormat(param4, param3, var13.Format, 1, 1, field_Jc[var11]) == 0 && (param0 == 0 ||
                    0 == param5.CheckDeviceMultiSampleType(param4, param3, field_Jc[var11], true, var8))) {
                    for (int var12 = 0; field_uc.length > var12; var12++) {
                      if (param5.CheckDeviceFormat(param4, param3, var13.Format, 2, 1, field_uc[var12]) == 0 &&
                        param5.CheckDepthStencilMatch(param4, param3, var13.Format, field_Jc[var11], field_uc[var12]) == 0 && (param0 == 0 ||
                        param5.CheckDeviceMultiSampleType(param4, param3, field_uc[var11], true, var8) == 0)) {
                        var7 = field_Jc[var11];
                        var6 = field_uc[var12];
                        break scanLoop1;
                      }
                    }
                  }
                }
              }
              param0--;
              continue;
            }
            break;
          }
          if (param0 >= 0 &&
            var7 != 0 &&
            var6 != 0) {
            param1.MultiSampleType = var8;
            param1.AutoDepthStencilFormat = var6;
            param1.BackBufferFormat = var7;
            param1.MultiSampleQuality = 0;
            return true;
          }
          return false;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Throwable var10 = decompiledCaughtException;
          return false;
        }
    }

    final void a(int param0, jagdx.IDirect3DPixelShader param1) {
        int var3 = -25 / ((param0 + 55) / 42);
        this.field_Rc.SetPixelShader(param1);
    }

    final void I(int param0) {
        int var2 = -74 / ((27 - param0) / 38);
        this.field_Rc.SetScissorRect(this.field_Rb + this.field_R, this.field_Nb + this.field_Ib, this.field_gc, this.field_V);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        jagdx.IDirect3DSurface var12 = this.field_Rc.c(0);
        jagdx.IDirect3DSurface var9 = this.field_Rc.a(param2, param3, 21, 0, 0, true);
        if (jagdx.gf.a((byte) 93, var9.LockRect(0, 0, param2, param3, 0, this.field_Ec))) {
          if (param6 == 0) {
            param6 = param2;
          }
          int var10 = this.field_Ec.getRowPitch();
          if (param6 == param2 &&
            var10 == 4 * param2) {
            this.field_Ec.a(param4, param5, 0, param2 * param3);
          } else {
            for (int var11 = 0; var11 < param3; var11++) {
              this.field_Ec.a(param4, param6 * var11 + param5, var10 * var11, param2);
            }
          }
          var9.UnlockRect();
        }
        this.field_Rc.StretchRect(var9, 0, 0, param2, param3, var12, param0, param1, param2, param3, 0);
        var9.a(1618);
        var12.a(1618);
    }

    final void V(int param0) {
        this.field_Nc.SetDirection(-this.field_Jb[0], -this.field_Jb[1], -this.field_Jb[2]);
        this.field_yc.SetDirection(-this.field_Gb[param0], -this.field_Gb[1], -this.field_Gb[2]);
        this.field_Mc = false;
    }

    final Object a(int param0, java.awt.Canvas param1) {
        if (param0 == -15083) {
          return null;
        }
        this.b(26, (byte) 42);
        return null;
    }

    final void a(jagdx.IDirect3DVertexShader param0, int param1) {
        this.field_zc = param0;
        if (param1 != 5243) {
          this.field_vc = (jagdx.GeometryBuffer) null;
        }
        this.field_Rc.SetVertexShader(param0);
        this.p(-119);
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice stackIn_4_0 = this.field_Rc;
        int stackIn_4_1 = 28;
        boolean stackIn_5_2 = (this.field_I) && (this.field_o) && (this.field_p >= 0);
        ((jagdx.IDirect3DDevice) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_5_2);
        if (param0) {
          this.field_Fc = (jagdx.D3DLIGHT) null;
        }
    }

    final void b(int param0, int param1) throws lp {
        this.field_Rc.EndScene();
        if (!this.field_xc.a(false)) {
          int fieldTemp$1 = this.field_Hc + 1;
          this.field_Hc = this.field_Hc + 1;
          if (fieldTemp$1 > 50) {
            throw new lp();
          }
          boolean discarded$2 = this.h(true);
        } else {
          this.field_Hc = 0;
          if (jagdx.gf.a(-1, this.field_xc.a(0, -96))) {
            boolean discarded$3 = this.h(true);
          }
        }
        this.field_Rc.BeginScene();
    }

    final void G(int param0) {
        for (int var2 = 0; var2 < this.field_h; var2++) {
          this.field_Rc.SetSamplerState(var2, 7, 0);
          this.field_Rc.SetSamplerState(var2, 6, 2);
          this.field_Rc.SetSamplerState(var2, 5, 2);
          this.field_Rc.SetSamplerState(var2, 1, 1);
          this.field_Rc.SetSamplerState(var2, 2, 1);
          this.field_Oc[var2] = fg.field_A;
          boolean[] var3 = this.field_Qc;
          int var4 = var2;
          this.field_sc[var2] = true;
          var3[var4] = true;
          this.field_Ac[var2] = false;
          this.field_Cc[var2] = 0;
        }
        this.field_Rc.SetTextureStageState(0, 6, 1);
        this.field_Rc.SetRenderState(9, 2);
        this.field_Rc.SetRenderState(23, 4);
        this.field_Rc.SetRenderState(25, 5);
        int var2Lifetime1 = 39 / ((param0 + 65) / 51);
        this.field_Rc.SetRenderState(24, 0);
        this.field_Rc.SetRenderState(22, 2);
        this.field_Rc.SetRenderState(147, 1);
        this.field_Rc.SetRenderState(145, 1);
        this.field_Rc.a(38, 0.949999988079071f);
        this.field_Rc.SetRenderState(140, 3);
        this.field_Nc.SetType(3);
        this.field_yc.SetType(3);
        this.field_Fc.SetType(1);
        this.field_Mc = false;
        super.G(1);
    }

    final void a(ib param0, byte param1) {
        int stackIn_9_3;
        int stackIn_20_3;
        this.field_Rc.SetTexture(this.field_F, param0.b(110));
        int var3 = -65 % ((param1 - 26) / 32);
        if (this.field_Oc[this.field_F] != param0.field_a) {
          int var4 = kr.a(param0.field_a, 2);
          this.field_Rc.SetSamplerState(this.field_F, 6, var4);
          this.field_Rc.SetSamplerState(this.field_F, 5, var4);
          this.field_Oc[this.field_F] = param0.field_a;
          int stackIn_13_0 = (param0.field_b) ? 0 : 1;
          int stackIn_16_1 = (this.field_Ac[this.field_F]) ? 0 : 1;
          if (stackIn_13_0 != stackIn_16_1) {
            jagdx.IDirect3DDevice stackIn_19_0 = this.field_Rc;
            int stackIn_19_1 = this.field_F;
            int stackIn_19_2 = 7;
            if (!param0.field_b) {
              stackIn_20_3 = 0;
            } else {
              stackIn_20_3 = kr.a(param0.field_a, 2);
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_19_0).SetSamplerState(stackIn_19_1, stackIn_19_2, stackIn_20_3);
            this.field_Ac[this.field_F] = param0.field_b;
          }
        } else {
          int stackIn_4_0 = (this.field_Ac[this.field_F]) ? 0 : 1;
          if (stackIn_4_0 == (param0.field_b ? 1 : 0)) {
            jagdx.IDirect3DDevice stackIn_8_0 = this.field_Rc;
            int stackIn_8_1 = this.field_F;
            int stackIn_8_2 = 7;
            if (!param0.field_b) {
              stackIn_9_3 = 0;
            } else {
              stackIn_9_3 = kr.a(param0.field_a, 2);
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_8_0).SetSamplerState(stackIn_8_1, stackIn_8_2, stackIn_9_3);
            this.field_Ac[this.field_F] = param0.field_b;
          }
        }
        if (!this.field_Lc[this.field_F]) {
          this.field_Lc[this.field_F] = true;
          this.m((byte) -126);
          this.N(0);
        }
    }

    final qi a(la param0, int param1, int param2, int param3, hd param4) {
        if (param1 != 8) {
          return (qi) null;
        }
        return (qi) ((Object) new og(this, param4, param0, param3, param2));
    }

    private final static int a(ke param0, int param1) {
        if (param1 != 2) {
          field_Sc = (float[]) null;
        }
        if (fg.field_A == param0) {
          return 2;
        }
        if (param0 == jp.field_a) {
          return 1;
        }
        throw new IllegalArgumentException();
    }

    final void w(int param0) {
        jagdx.IDirect3DDevice stackIn_3_0 = this.field_Rc;
        int stackIn_3_1 = 14;
        boolean stackIn_4_2 = (this.field_mb) && (this.field_Y);
        ((jagdx.IDirect3DDevice) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2);
        if (param0 != 0) {
          this.field_yc = (jagdx.D3DLIGHT) null;
        }
    }

    final void j(int param0) {
        if (this.field_Lc[this.field_F]) {
          this.field_Lc[this.field_F] = false;
          this.field_Rc.SetTexture(this.field_F, (jagdx.IDirect3DBaseTexture) null);
          this.m((byte) -128);
          this.N(0);
        }
        if (param0 != 1) {
          this.d();
        }
    }

    final void g(int param0) {
        if (param0 != 0) {
          this.r(6);
        }
        this.field_Rc.SetRenderState(60, this.field_cc);
    }

    final void p(int param0) {
        if (this.field_zc == null &&
          mq.field_g != this.field_f[this.field_F]) {
          if (this.field_f[this.field_F] == tr.field_a) {
            this.field_Rc.SetTransform(this.field_F + 16, this.field_L[this.field_F].b(field_Sc, 3911));
          } else {
            this.field_Rc.SetTransform(this.field_F + 16, this.field_L[this.field_F].a(field_Sc, true));
          }
          int var2 = kr.a(true, this.field_f[this.field_F]);
          if (var2 != this.field_Cc[this.field_F]) {
            this.field_Rc.SetTextureStageState(this.field_F, 24, var2);
            this.field_Cc[this.field_F] = var2;
          }
        } else {
          this.field_Rc.SetTextureStageState(this.field_F, 24, 0);
          this.field_Cc[this.field_F] = 0;
        }
        if (param0 >= -111) {
          this.field_tc = 4;
        }
    }

    final void a(boolean param0, int param1, boolean param2, jb param3, boolean param4) {
        int var6;
        int var7 = 0;
        int var8 = param1;
        if (var8 == 1) {
          var6 = 3;
        } else {
          var6 = (var8 == 2) ? 26 : 2;
        }
        if (!param2) {
          this.p((byte) 127);
        }
        if (param0) {
          var7 = var7 | 32;
        }
        if (param4) {
          var7 = var7 | 16;
        }
        this.field_Rc.SetTextureStageState(this.field_F, var6, var7 | kr.a(param3, (byte) -68));
    }

    final void a(RenderSprite param0, boolean param1) {
    }

    final void u(byte param0) {
        this.field_Rc.a(15, this.field_Vb);
        if (param0 > -29) {
          this.a(-112, -74, false, (int[][]) null);
        }
    }

    final void w(byte param0) {
        if (param0 > -40) {
          field_uc = (int[]) null;
        }
    }

    final void t(byte param0) {
        float var2 = this.field_Ab ? this.field_fb : 0.0f;
        int var3 = 92 % ((param0 - 17) / 37);
        float var4 = this.field_Ab ? -this.field_ub : 0.0f;
        this.field_Nc.SetDiffuse(var2 * this.field_g, this.field_rb * var2, this.field_Hb * var2, 0.0f);
        this.field_yc.SetDiffuse(var4 * this.field_g, var4 * this.field_rb, this.field_Hb * var4, 0.0f);
        this.field_Mc = false;
    }

    final gd a(int param0, int param1) {
        return null;
    }

    final void m(byte param0) {
        if (param0 >= -124) {
          this.field_Rc = (jagdx.IDirect3DDevice) null;
        }
        int var2 = this.field_Lc[this.field_F] ? kr.a(this.field_w[this.field_F], true) : 1;
        this.field_Rc.SetTextureStageState(this.field_F, 4, var2);
    }

    final static GraphicsRenderer createToolkit(java.awt.Canvas param0, d param1, ResourceArchive param2, Integer param3) {
        Throwable decompiledCaughtException = null;
        jagdx.IDirect3DDevice var12_ref = null;
        Object var4 = null;
        try {
          int var5_int = 0;
          int var6 = 1;
          jaclib.peer.qt var7 = new jaclib.peer.qt();
          jagdx.IDirect3D var8 = jagdx.IDirect3D.a(-2147483616, var7);
          jagdx.D3DCAPS var9 = var8.a(var5_int, var6);
          if ((16777216 & var9.RasterCaps) == 0) {
            throw new RuntimeException("");
          }
          if (2 > var9.MaxSimultaneousTextures) {
            throw new RuntimeException("");
          }
          if ((2 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if ((var9.TextureOpCaps & 8) == 0) {
            throw new RuntimeException("");
          }
          if ((64 & var9.TextureOpCaps) == 0) {
            throw new RuntimeException("");
          }
          if ((var9.TextureOpCaps & 512) == 0) {
            throw new RuntimeException("");
          }
          if (0 == (33554432 & var9.TextureOpCaps)) {
            throw new RuntimeException("");
          }
          if ((16 & (var9.SrcBlendCaps & var9.DestBlendCaps)) == 0) {
            throw new RuntimeException("");
          }
          if ((var9.SrcBlendCaps & var9.DestBlendCaps & 32) == 0) {
            throw new RuntimeException("");
          }
          if ((var9.SrcBlendCaps & var9.DestBlendCaps & 2) == 0) {
            throw new RuntimeException("");
          }
          if (var9.MaxActiveLights > 0 &&
            2 > var9.MaxActiveLights) {
            throw new RuntimeException("");
          }
          if (var9.MaxStreams < 5) {
            throw new RuntimeException("");
          }
          jagdx.D3DPRESENT_PARAMETERS var10 = new jagdx.D3DPRESENT_PARAMETERS(param0);
          if (!kr.a(param3.intValue(), var10, (byte) 124, var6, var5_int, var8)) {
            throw new RuntimeException("");
          }
          var10.PresentationInterval = -2147483648;
          var10.EnableAutoDepthStencil = true;
          var10.Windowed = true;
          int var11 = 2;
          if ((var9.DevCaps & 1048576) != 0) {
            var11 = var11 | 16;
          }
          Object var12 = null;
          try {
            var12_ref = var8.a(var5_int, var6, param0, var11 | 64, var10);
          } catch (jagdx.ie decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            jagdx.ie var14 = (jagdx.ie) (Object) decompiledCaughtException;
            var12_ref = var8.a(var5_int, var6, param0, var11 | 32, var10);
          }
          cb var13 = new cb(var12_ref.b(0), var12_ref.b());
          kr var15 = new kr(var5_int, var6, param0, var7, var8, var12_ref, var13, var10, var9, param1, param2, param3.intValue());
          var4 = var15;
          var15.f((byte) 101);
          kr stackIn_43_0 = var15;
          return (GraphicsRenderer) ((Object) stackIn_43_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var5 = (RuntimeException) (Object) decompiledCaughtException;
          if (var4 != null) {
            ((kr) (var4)).c();
          }
          throw var5;
        }
    }

    final void N(int param0) {
        int var2 = this.field_Lc[this.field_F] ? kr.a(this.field_H[this.field_F], true) : 1;
        this.field_Rc.SetTextureStageState(this.field_F, 1, var2);
        if (param0 != 0) {
          this.field_Mc = true;
        }
    }

    final void b(byte param0) {
        if (this.field_Lb) {
          field_Sc[7] = 0.0f;
          field_Sc[13] = 0.0f;
          field_Sc[14] = 0.0f;
          field_Sc[15] = 1.0f;
          field_Sc[3] = 0.0f;
          field_Sc[9] = 0.0f;
          field_Sc[11] = 0.0f;
          field_Sc[0] = 1.0f;
          field_Sc[4] = 0.0f;
          field_Sc[1] = 0.0f;
          field_Sc[12] = 0.0f;
          field_Sc[6] = 0.0f;
          field_Sc[8] = 0.0f;
          field_Sc[5] = 1.0f;
          field_Sc[2] = 0.0f;
          field_Sc[10] = 1.0f;
        } else {
          this.field_ec.a(field_Sc, true);
        }
        this.field_Rc.SetTransform(256, field_Sc);
        int var2 = 15 / ((9 - param0) / 48);
    }

    final qi a(int param0, boolean param1, hd param2, int param3, byte param4, int param5, int param6, byte[] param7) {
        if (param4 < 73) {
          nf var10 = (nf) null;
          this.a((nf) null, true);
        }
        return (qi) ((Object) new og(this, param2, param0, param3, param1, param7, param6, param5));
    }

    final void a(fa param0, byte param1) {
        dxVertexLayout var3 = (dxVertexLayout) (param0);
        if (param1 != 75) {
          return;
        }
        this.field_Rc.SetVertexDeclaration(var3.field_d);
    }

    final void e() {
    }

    final void d(boolean param0) {
        if (param0) {
          hd var3 = (hd) null;
          this.a((la) null, -42, (hd) null);
        }
        this.field_Rc.a(7, this.field_ib);
    }

    final void p(byte param0) {
        if (param0 >= -127) {
          jagdx.IDirect3D var3 = (jagdx.IDirect3D) null;
          kr.a(-104, (jagdx.D3DPRESENT_PARAMETERS) null, (byte) -33, 21, -35, (jagdx.IDirect3D) null);
        }
        this.field_Rc.a(27, this.field_Db);
    }

    final sm a(ra param0, gd param1) {
        return null;
    }

    final void b(byte param0, boolean param1) {
        this.field_Rc.a(161, param1);
        if (param0 >= -113) {
          this.field_Hc = -52;
        }
    }

    final boolean a(la param0, int param1, hd param2) {
        jagdx.D3DDISPLAYMODE var4 = new jagdx.D3DDISPLAYMODE();
        if (param1 != 0) {
          this.field_Pc = (jagdx.D3DPRESENT_PARAMETERS) null;
        }
        boolean stackIn_6_0 = (jagdx.gf.a((byte) 96, this.field_wc.a(this.field_Kc, var4))) && (jagdx.gf.a((byte) 78, this.field_wc.CheckDeviceFormat(this.field_Kc, this.field_tc, var4.Format, 0, 3, kr.a(param2, param0, false))));
        return stackIn_6_0;
    }

    final qi a(float[] param0, int param1, hd param2, boolean param3, int param4, int param5, int param6, boolean param7) {
        if (!param3) {
          return null;
        }
        this.d(false);
        return null;
    }

    final void a(nf param0, boolean param1) {
        if (param1) {
          return;
        }
        int var3 = 0;
        if (param0 == rg.field_A) {
          var3 = 65536;
        } else if (param0 == ij.field_g) {
          var3 = 131072;
        } else if (param0 == ResourceArchive.field_g) {
          var3 = 196608;
        }
        this.field_Rc.SetTextureStageState(this.field_F, 11, this.field_F | var3);
    }

    final boolean d() {
        return false;
    }

    final void v(int param0) {
        if (this.field_bb.b((byte) -92)) {
          this.field_t.a(field_Sc, true);
        } else {
          field_Sc[5] = 1.0f;
          field_Sc[6] = 0.0f;
          field_Sc[8] = 0.0f;
          field_Sc[15] = 1.0f;
          field_Sc[13] = 0.0f;
          field_Sc[2] = 0.0f;
          field_Sc[10] = 1.0f;
          field_Sc[9] = 0.0f;
          field_Sc[12] = 0.0f;
          field_Sc[0] = 1.0f;
          field_Sc[1] = 0.0f;
          field_Sc[14] = 0.0f;
          field_Sc[3] = 0.0f;
          field_Sc[4] = 0.0f;
          field_Sc[11] = 0.0f;
          field_Sc[7] = 0.0f;
        }
        if (param0 != 5) {
          Object var3 = (Object) null;
          this.a(-26, (java.awt.Canvas) null, (Object) null);
        }
        this.field_Rc.SetTransform(2, field_Sc);
    }

    final void a(sm param0) {
    }

    final void T(int param0) {
        if (param0 != 0) {
          return;
        }
        jagdx.IDirect3DDevice stackIn_5_0 = this.field_Rc;
        int stackIn_5_1 = 137;
        boolean stackIn_6_2 = (this.field_ob) && (!this.field_pc);
        ((jagdx.IDirect3DDevice) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_6_2);
    }

    final boolean a(byte param0, la param1, hd param2) {
        if (param0 != -13) {
          return false;
        }
        jagdx.D3DDISPLAYMODE var4 = new jagdx.D3DDISPLAYMODE();
        boolean stackIn_6_0 = (jagdx.gf.a((byte) 122, this.field_wc.a(this.field_Kc, var4))) && (jagdx.gf.a((byte) 112, this.field_wc.CheckDeviceFormat(this.field_Kc, this.field_tc, var4.Format, 0, 4, kr.a(param2, param1, false))));
        return stackIn_6_0;
    }

    final void a(boolean param0, ia param1, int param2, int param3) {
        this.field_Rc.DrawPrimitive(kr.a(41, param1), param3, param2);
        if (!param0) {
          this.field_Gc = false;
        }
    }

    final void C(int param0) {
        this.field_Rc.SetTransform(3, this.field_N);
        if (param0 > -51) {
          RenderSprite var3 = (RenderSprite) null;
          this.a((RenderSprite) null, true);
        }
    }

    final void k(byte param0) {
        int var2 = 0;
        if (param0 < 123) {
          RenderSprite var7 = (RenderSprite) null;
          this.a((RenderSprite) null, true);
        }
        while (var2 < this.field_B) {
          sf var3 = this.field_D[var2];
          int var4 = 2 + var2;
          int var5 = var3.a(87);
          float var6 = var3.a(false) / 255.0f;
          this.field_Fc.SetPosition((float)var3.c((byte) -98), (float)var3.a((byte) -102), (float)var3.e(0));
          this.field_Fc.SetDiffuse(var6 * (float)((16721490 & var5) >> 16), (float)((65478 & var5) >> 8) * var6, (float)(255 & var5) * var6, 0.0f);
          this.field_Fc.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.d(0) * var3.d(0)));
          this.field_Fc.SetRange((float)var3.d(0));
          this.field_Rc.SetLight(var4, this.field_Fc);
          this.field_Rc.LightEnable(var4, true);
          var2++;
        }
        while (this.field_ic > var2) {
          this.field_Rc.LightEnable(2 + var2, false);
          var2++;
        }
        super.k((byte) 127);
    }

    final qi a(int param0, boolean param1, boolean param2, int param3, int param4, int[] param5, int param6) {
        if (!param1) {
          return (qi) null;
        }
        return (qi) ((Object) new og(this, param6, param3, param2, param5, param0, param4));
    }

    private final static int a(as param0, boolean param1) {
        if (param0 == bd.field_C) {
          return 2;
        }
        if (param0 == ru.field_a) {
          return 4;
        }
        if (du.field_l == param0) {
          return 26;
        }
        if (param0 == lo.field_j) {
          return 7;
        }
        if (param0 == fs.field_d) {
          return 10;
        }
        if (param1) {
          throw new IllegalArgumentException();
        }
        return 29;
    }

    final ti c(boolean param0, int param1) {
        if (param1 != 8762) {
          this.w(-85);
        }
        return (ti) ((Object) new dm(this, la.field_b, param0));
    }

    final fa a(pl[] param0, int param1) {
        if (param1 > -126) {
          this.w((byte) -105);
        }
        return (fa) ((Object) new dxVertexLayout(this, param0));
    }

    private final static int a(jb param0, byte param1) {
        if (param0 == CipherPacketBuffer.field_p) {
          return 2;
        }
        if (param0 == ac.field_b) {
          return 0;
        }
        if (un.field_i == param0) {
          return 1;
        }
        if (param0 == bs.field_a) {
          return 3;
        }
        if (param1 != -68) {
          as var3 = (as) null;
          kr.a((as) null, true);
        }
        throw new IllegalArgumentException();
    }

    final void a() {
    }

    final void c(int param0, byte param1) {
        if (param1 >= -76) {
          st var4 = (st) null;
          kr.a(true, (st) null);
        }
        this.field_Rc.SetTextureStageState(this.field_F, 11, param0);
    }

    private final boolean h(boolean param0) {
        if (!param0) {
          return false;
        }
        int var2 = this.field_Rc.TestCooperativeLevel();
        if (0 != var2 &&
          var2 != -2005530519) {
          return false;
        }
        cb var3 = (cb) (this.field_Fb);
        this.o(0);
        var3.a((byte) -83);
        this.field_Pc.BackBufferWidth = 0;
        this.field_Pc.BackBufferHeight = 0;
        if (kr.a(this.field_lc, this.field_Pc, (byte) 114, this.field_tc, this.field_Kc, this.field_wc)) {
          int var4 = this.field_Rc.Reset(this.field_Pc);
          if (jagdx.gf.a((byte) 78, var4)) {
            var3.a(this.field_Rc.b(), this.field_Rc.b(0), 0);
            this.c((byte) 61);
            this.G(117);
            return true;
          }
        }
        return false;
    }

    final void Q(int param0) {
        if (param0 <= 52) {
          return;
        }
        this.field_Rc.SetViewport(this.field_Rb, this.field_Ib, this.field_Z, this.field_jb, 0.0f, 1.0f);
    }

    final synchronized void b(int param0) {
        this.field_Ic.a((byte) 23);
        super.b(param0);
    }

    final sk b(int param0, byte param1) {
        if (param1 < 31) {
          tl var4 = (tl) null;
          this.a(55, (tl) null, -60);
        }
        int var3 = param0;
        if (3 == var3) {
          return (sk) ((Object) new jl(this, this.field_d));
        }
        if (4 == var3) {
          return (sk) ((Object) new jh(this, this.field_d, this.field_Tb));
        }
        if (var3 != 8) {
          return super.b(param0, (byte) 54);
        }
        return (sk) ((Object) new qu(this, this.field_d, this.field_Tb));
    }

    final float o(byte param0) {
        if (param0 != 42) {
          return -0.4905053675174713f;
        }
        return -0.5f;
    }

    final void a(int param0, nt param1) {
        this.a((ib) (param1), (byte) 95);
        if (!this.field_Qc[this.field_F]) {
          this.field_Rc.SetSamplerState(this.field_F, 1, 1);
          this.field_Qc[this.field_F] = true;
        }
        if (param0 != 16) {
          this.h((byte) 54);
        }
        if (!this.field_sc[this.field_F]) {
          this.field_Rc.SetSamplerState(this.field_F, 2, 1);
          this.field_sc[this.field_F] = true;
        }
    }

    final void r(int param0) {
        if (param0 != 0) {
          return;
        }
        this.field_Rc.a(174, this.field_Cb);
    }

    final void c() {
        this.field_Ic.b((byte) 57);
        super.c();
    }

    final void a(int param0, java.awt.Canvas param1, Object param2) {
        if (param0 != 0) {
          boolean discarded$0 = this.h(true);
        }
    }

    private final static int a(boolean param0, st param1) {
        if (!param0) {
          field_Sc = (float[]) null;
        }
        if (param1 == GameCanvas.field_b) {
          return 1;
        }
        if (tr.field_a == param1) {
          return 2;
        }
        if (qn.field_a == param1) {
          return 3;
        }
        if (param1 == rl.field_o) {
          return 4;
        }
        if (param1 != td.field_a) {
          return 0;
        }
        return 256;
    }

    final void h(byte param0) {
        this.field_y = (float)(this.field_x - this.field_q);
        this.field_Xb = (float)(-this.field_p) + this.field_y;
        if (this.field_Xb < (float)this.field_Mb) {
          this.field_Xb = (float)this.field_Mb;
        }
        this.field_Rc.a(36, this.field_Xb);
        this.field_Rc.a(37, this.field_y);
        this.field_Rc.SetRenderState(34, this.field_X);
        if (param0 > -98) {
          byte[] var3 = (byte[]) null;
          this.a(-42, true, (hd) null, 19, (byte) 125, 4, -18, (byte[]) null);
        }
    }

    final void m(int param0) {
        this.field_Nc.SetAmbient(this.field_g * this.field_Wb, this.field_Wb * this.field_rb, this.field_Wb * this.field_Hb, 0.0f);
        this.field_Mc = false;
        if (param0 > -108) {
          this.o((byte) 24);
        }
    }

    final static int a(hd param0, la param1, boolean param2) {
        if (param2) {
          ia var4 = (ia) null;
          kr.a(-125, (ia) null);
        }
        if (la.field_h == param1) {
          if (wo.field_n == param0) {
            return 22;
          }
          if (lc.field_g == param0) {
            return 21;
          }
          if (ro.field_o == param0) {
            return 28;
          }
          if (param0 == IntrusiveNode.field_d) {
            return 50;
          }
          if (param0 == hh.field_c) {
            return 51;
          }
          if (param0 == aj.field_r) {
            return 77;
          }
        }
        throw new IllegalArgumentException("");
    }

    private final static int a(int param0, ia param1) {
        if (param0 < 25) {
          field_Jc = (int[]) null;
        }
        if (param1 == DualLinkNode.field_m) {
          return 2;
        }
        if (bm.field_x == param1) {
          return 3;
        }
        if (param1 == vj.field_g) {
          return 1;
        }
        if (tm.field_h == param1) {
          return 4;
        }
        if (qp.field_j == param1) {
          return 6;
        }
        if (param1 != gh.field_i) {
          throw new IllegalArgumentException("");
        }
        return 5;
    }

    final void a(og param0, int param1) {
        if (param1 <= 84) {
          this.j(91);
        }
        this.a((ib) (param0), (byte) -31);
        if ((!param0.field_j ? 1 : 0) == (this.field_Qc[this.field_F] ? 1 : 0)) {
          this.field_Rc.SetSamplerState(this.field_F, 1, param0.field_j ? 1 : 3);
          this.field_Qc[this.field_F] = param0.field_j;
        }
        if ((!this.field_sc[this.field_F] ? 1 : 0) != (!param0.field_g ? 1 : 0)) {
          this.field_Rc.SetSamplerState(this.field_F, 2, param0.field_g ? 1 : 3);
          this.field_sc[this.field_F] = param0.field_g;
        }
    }

    final tl a(boolean param0, byte param1) {
        if (param1 <= 72) {
          this.m(-115);
        }
        return (tl) ((Object) new cj(this, param0));
    }

    final void l(byte param0) {
        if (param0 <= 39) {
          hd var3 = (hd) null;
          this.a((la) null, 12, 69, 77, (hd) null);
        }
        if (this.field_zb == pi.field_x) {
          this.field_Rc.SetRenderState(19, 5);
          this.field_Rc.SetRenderState(20, 6);
        } else if (this.field_zb == ne.field_i) {
          this.field_Rc.SetRenderState(19, 2);
          this.field_Rc.SetRenderState(20, 2);
        } else if (this.field_zb == HighscoreQuery.field_l) {
          this.field_Rc.SetRenderState(19, 9);
          this.field_Rc.SetRenderState(20, 2);
        }
    }

    private kr(int param0, int param1, java.awt.Canvas param2, jaclib.peer.qt param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, cb param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, d param9, ResourceArchive param10, int param11) {
        super(param2, param6, param9, param10, param11, 0);
        int stackIn_16_1 = 0;
        this.field_Mc = false;
        this.field_Hc = 0;
        try {
          this.field_Bc = param8;
          this.field_wc = param4;
          this.field_Kc = param0;
          this.field_Ic = param3;
          this.field_tc = param1;
          this.field_xc = param6;
          this.field_Rc = param5;
          this.field_Pc = param7;
          this.field_Nc = new jagdx.D3DLIGHT(this.field_Ic);
          this.field_yc = new jagdx.D3DLIGHT(this.field_Ic);
          this.field_Fc = new jagdx.D3DLIGHT(this.field_Ic);
          this.field_Ec = new jagdx.PixelBuffer(this.field_Ic);
          this.field_vc = new jagdx.GeometryBuffer(this.field_Ic);
          jagdx.GeometryBuffer discarded$0 = new jagdx.GeometryBuffer(this.field_Ic);
          boolean stackIn_4_1 = ((this.field_Bc.TextureCaps & 2) == 0);
          this.field_Dc = stackIn_4_1;
          boolean stackIn_7_1 = (0 != (this.field_Bc.TextureCaps & 65536));
          this.field_rc = stackIn_7_1;
          boolean stackIn_10_1 = (0 != (16384 & this.field_Bc.TextureCaps));
          this.field_Gc = stackIn_10_1;
          this.field_h = this.field_Bc.MaxSimultaneousTextures;
          boolean stackIn_13_1 = ((this.field_Bc.TextureCaps & 8192) != 0);
          this.field_J = stackIn_13_1;
          if (this.field_Bc.MaxActiveLights > 0) {
            stackIn_16_1 = this.field_Bc.MaxActiveLights;
          } else {
            stackIn_16_1 = 8;
          }
          this.field_fc = stackIn_16_1;
          boolean stackIn_19_1 = ((2048 & this.field_Bc.TextureCaps) != 0);
          this.field_Pb = stackIn_19_1;
          if (this.field_lc <= 0) {
            this.field_wc.CheckDeviceMultiSampleType(this.field_Kc, this.field_tc, this.field_Pc.BackBufferFormat, true, 2);
          }
          this.field_Oc = new ke[this.field_h];
          this.field_sc = new boolean[this.field_h];
          this.field_Qc = new boolean[this.field_h];
          this.field_Ac = new boolean[this.field_h];
          this.field_Cc = new int[this.field_h];
          this.field_Lc = new boolean[this.field_h];
          this.field_Rc.BeginScene();
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Throwable var13 = decompiledCaughtException;
          var13.printStackTrace();
          this.a(-9);
          throw new RuntimeException("");
        }
    }

    final void l(int param0) {
        this.t((byte) 119);
        if (param0 != -30535) {
          return;
        }
        this.s((byte) -94);
    }

    final void a(jb param0, int param1, boolean param2, byte param3) {
        int var5;
        if (param3 < 90) {
          this.w((byte) -7);
        }
        int var6 = 0;
        int var7 = param1;
        if (1 == var7) {
          var5 = 6;
        } else {
          var5 = (2 == var7) ? 27 : 5;
        }
        if (param2) {
          var6 = var6 | 16;
        }
        this.field_Rc.SetTextureStageState(this.field_F, var5, var6 | kr.a(param0, (byte) -68));
    }

    final go a(int param0, int param1, boolean param2, int[][] param3) {
        int var5 = -45 / ((param1 - 18) / 51);
        return (go) ((Object) new tc(this, param0, param2, param3));
    }

    final void s(byte param0) {
        if (param0 != -94) {
          jb var3 = (jb) null;
          this.a(true, 113, false, (jb) null, false);
        }
        if (!this.field_Mc) {
          this.field_Rc.LightEnable(0, false);
          this.field_Rc.LightEnable(1, false);
          this.field_Rc.SetLight(0, this.field_Nc);
          this.field_Rc.SetLight(1, this.field_yc);
          this.field_Rc.LightEnable(0, true);
          this.field_Rc.LightEnable(1, true);
          this.field_Mc = true;
        }
    }

    static {
        field_uc = new int[]{77, 80};
        field_Sc = new float[16];
        field_Jc = new int[]{22, 23};
    }
}
