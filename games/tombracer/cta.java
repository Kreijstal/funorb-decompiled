/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class cta extends eo {
    private int field_Xc;
    private gua field_kd;
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
    private hs[] field_Rc;
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

    final mw b(int param0, int param1) {
        return null;
    }

    final void a(dn param0, byte param1) {
        int var3;
        var3 = 0;
        if (gd.field_H == param0) {
          var3 = 65536;
        } else {
          if (lsa.field_c == param0) {
            var3 = 131072;
          } else {
            if (gq.field_u == param0) {
              var3 = 196608;
            }
          }
        }
        this.field_jd.SetTextureStageState(this.field_Cc, 11, var3 | this.field_Cc);
        if (param1 != 0) {
          this.field_gd = (int[]) null;
        }
    }

    final void r(int param0) {
        this.field_Zc.SetAmbient(this.field_sc * this.field_fc, this.field_fc * this.field_yb, this.field_Kb * this.field_fc, (float)param0);
        this.field_Pc = false;
    }

    private final static int a(int param0, iw param1) {
        if (param0 < 105) {
          field_fd = (int[]) null;
        }
        if (io.field_c == param1) {
          return 2;
        }
        if (param1 == di.field_d) {
          return 3;
        }
        if (param1 == nj.field_r) {
          return 1;
        }
        if (param1 == fma.field_f) {
          return 4;
        }
        if (vs.field_T == param1) {
          return 6;
        }
        if (nb.field_b != param1) {
          throw new IllegalArgumentException("");
        }
        return 5;
    }

    private cta(int param0, int param1, java.awt.Canvas param2, jaclib.peer.sha param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, gua param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, d param9, cn param10, int param11) {
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
          this.field_Rc = new hs[this.field_Vb];
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
          this.a(true);
          throw new RuntimeException("");
        }
    }

    final static int a(ft param0, int param1, una param2) {
        if (param1 >= -127) {
          field_md = (int[]) null;
        }
        if (param2 == una.field_g) {
          if (it.field_b == param0) {
            return 22;
          }
          if (param0 == gpa.field_a) {
            return 21;
          }
          if (param0 == rp.field_g) {
            return 28;
          }
          if (param0 == qr.field_w) {
            return 50;
          }
          if (param0 == wo.field_i) {
            return 51;
          }
          if (js.field_g == param0) {
            return 77;
          }
        }
        throw new IllegalArgumentException("");
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final boolean a(boolean param0, una param1, ft param2) {
        jagdx.D3DDISPLAYMODE var4;
        ft var5;
        boolean stackIn_6_0 = false;
        if (param0) {
          var5 = (ft) null;
          this.a(true, (una) null, (ft) null);
        }
        var4 = new jagdx.D3DDISPLAYMODE();
        stackIn_6_0 = (jagdx.ah.a(this.field_dd.a(this.field_Xc, var4), (byte) -82)) && (jagdx.ah.a(this.field_dd.CheckDeviceFormat(this.field_Xc, this.field_id, var4.Format, 0, 3, cta.a(param2, -128, param1)), (byte) -103));
        return stackIn_6_0;
    }

    private final static boolean a(int param0, jagdx.IDirect3D param1, int param2, int param3, jagdx.D3DPRESENT_PARAMETERS param4, int param5) {
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
          if (jagdx.ah.a(param1.a(param5, var10), 10643)) {
            return false;
          }
          L1: while (true) {
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
                        break L1;
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

    private final static int a(ica param0, int param1) {
        if (ln.field_F == param0) {
          return 2;
        }
        if (iw.field_c == param0) {
          return 4;
        }
        if (r.field_m == param0) {
          return 26;
        }
        if (param0 == jv.field_m) {
          return 7;
        }
        if (gq.field_w == param0) {
          return 10;
        }
        if (param1 != 0) {
          field_md = (int[]) null;
        }
        throw new IllegalArgumentException();
    }

    final void c() {
    }

    final void a(mna param0, int param1) {
        if (param1 != -32) {
          this.field_Wc = (jagdx.D3DLIGHT) null;
        }
        dxVertexLayout var3 = (dxVertexLayout) (param0);
        this.field_jd.SetVertexDeclaration(var3.field_e);
    }

    final void B(byte param0) {
        this.field_jd.SetViewport(this.field_i, this.field_Kc, this.field_Hb, this.field_jc, 0.0f, 1.0f);
        if (param0 != -116) {
          this.field_ed = -47;
        }
    }

    final void h(boolean param0) {
        if (param0) {
          return;
        }
        if (this.field_r.a(-122)) {
          this.field_Qb.a(field_hd, (byte) -37);
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

    final void a(eja param0, int param1, int param2, int param3, iw param4, int param5, int param6) {
        this.field_jd.SetIndices(((dm) (param0)).field_d);
        this.field_jd.DrawIndexedPrimitive(cta.a(109, param4), 0, param2, param5, param3, param6);
        if (param1 != -19394) {
          this.field_jd = (jagdx.IDirect3DDevice) null;
        }
    }

    final void a(jca param0) {
    }

    final void a(nh param0, boolean param1) {
    }

    final void N(int param0) {
        if (param0 >= -10) {
          this.b(-92, false);
        }
        this.field_jd.SetRenderState(60, this.field_bc);
    }

    final void e(byte param0) {
        this.field_jd.SetTransform(3, this.field_T);
        if (param0 <= 26) {
          dn var3 = (dn) null;
          this.a((dn) null, (byte) -5);
        }
    }

    final boolean a(una param0, int param1, ft param2) {
        jagdx.D3DDISPLAYMODE var4;
        boolean stackIn_6_0 = false;
        if (param1 != -1) {
          return false;
        }
        var4 = new jagdx.D3DDISPLAYMODE();
        stackIn_6_0 = (jagdx.ah.a(this.field_dd.a(this.field_Xc, var4), (byte) -125)) && (jagdx.ah.a(this.field_dd.CheckDeviceFormat(this.field_Xc, this.field_id, var4.Format, 0, 4, cta.a(param2, param1 - 127, param0)), (byte) -92));
        return stackIn_6_0;
    }

    final void a(byte param0, ek param1) {
        this.a((byte) -126, (nqa) (param1));
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

    final void b(boolean param0) {
        if (dfa.field_b == this.field_lb) {
          this.field_jd.SetRenderState(19, 5);
          this.field_jd.SetRenderState(20, 6);
        } else {
          if (mp.field_a != this.field_lb) {
            if (bma.field_w == this.field_lb) {
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
        this.b(true, (byte) 81);
        this.field_jd.Clear(2, 0, 1.0f, 0);
    }

    final void a() {
    }

    final void b(int param0, boolean param1) {
        this.field_jd.a(161, param1);
        if (param0 != 1) {
          this.field_Oc = (jagdx.GeometryBuffer) null;
        }
    }

    final void a(int param0, jagdx.IDirect3DPixelShader param1) {
        int var3 = 67 % ((1 - param0) / 55);
        this.field_jd.SetPixelShader(param1);
    }

    final boolean h() {
        return false;
    }

    final gf a(ft param0, int param1, int param2, boolean param3, int param4, int param5, float[] param6, int param7) {
        if (param2 == 0) {
          return null;
        }
        this.field_Pc = false;
        return null;
    }

    final void M(int param0) {
        if (param0 != -27581) {
          this.v(73);
        }
        this.field_jd.a(27, this.field_Yb);
    }

    final void w(byte param0) {
        this.v(53);
        if (param0 != -21) {
          this.field_Sc = false;
        }
        this.q((byte) -78);
    }

    final gf a(boolean param0, byte[] param1, int param2, int param3, int param4, int param5, ft param6, int param7) {
        if (param4 != 1) {
          return (gf) null;
        }
        return (gf) ((Object) new pia(this, param6, param7, param3, param0, param1, param2, param5));
    }

    final boolean f() {
        return false;
    }

    final void g(byte param0) {
        ob var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        for (var2 = 0; var2 < this.field_Bc; var2++) {
          var3 = this.field_ib[var2];
          var4 = var2 + 2;
          var5 = var3.c(-120);
          var6 = var3.b(0) / 255.0f;
          this.field_Wc.SetPosition((float)var3.d(13437), (float)var3.a(19848), (float)var3.b((byte) 11));
          this.field_Wc.SetDiffuse(var6 * (float)(255 & var5 >> 16), (float)(var5 >> 8 & 255) * var6, var6 * (float)(255 & var5), 0.0f);
          this.field_Wc.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.a((byte) 109) * var3.a((byte) 102)));
          this.field_Wc.SetRange((float)var3.a((byte) -113));
          this.field_jd.SetLight(var4, this.field_Wc);
          this.field_jd.LightEnable(var4, true);
        }
        while (var2 < this.field_S) {
          this.field_jd.LightEnable(2 + var2, false);
          var2++;
        }
        super.g(param0);
    }

    final void d() {
    }

    final void d(byte param0) {
        int var2 = -34 % ((69 - param0) / 50);
        this.field_jd.a(174, this.field_Wb);
    }

    final void h(int param0) {
        int var2 = 0;
        boolean[] var3 = null;
        int var4 = 0;
        for (var2 = 0; this.field_Vb > var2; var2++) {
          this.field_jd.SetSamplerState(var2, 7, 0);
          this.field_jd.SetSamplerState(var2, 6, 2);
          this.field_jd.SetSamplerState(var2, 5, 2);
          this.field_jd.SetSamplerState(var2, 1, 1);
          this.field_jd.SetSamplerState(var2, 2, 1);
          this.field_Rc[var2] = aw.field_G;
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
        this.field_jd.a(38, 0.949999988079071f);
        this.field_jd.SetRenderState(140, 3);
        this.field_Zc.SetType(3);
        this.field_cd.SetType(3);
        this.field_Wc.SetType(1);
        this.field_Pc = false;
        super.h(param0 + 0);
    }

    final gf a(int[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8 = -36 / ((param6 - 13) / 46);
        return (gf) ((Object) new pia(this, param3, param5, param2, param0, param1, param4));
    }

    final vw e(int param0, int param1) {
        int var3;
        if (param1 <= 37) {
          return (vw) null;
        }
        var3 = param0;
        if (var3 == 3) {
          return (vw) ((Object) new cqa(this, this.field_I));
        }
        if (4 == var3) {
          return (vw) ((Object) new usa(this, this.field_I, this.field_Mb));
        }
        if (var3 == 8) {
          return (vw) ((Object) new oja(this, this.field_I, this.field_Mb));
        }
        return super.e(param0, 106);
    }

    final void a(fp param0, int param1, boolean param2, int param3) {
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
        this.field_jd.SetTextureStageState(this.field_Cc, var5, cta.a(param0, 117) | var6);
    }

    final eja a(int param0, boolean param1) {
        if (param0 != 26) {
          this.field_kd = (gua) null;
        }
        return (eja) ((Object) new dm(this, una.field_f, param1));
    }

    final void a(fp param0, int param1, int param2, boolean param3, boolean param4) {
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
        this.field_jd.SetTextureStageState(this.field_Cc, var6, var7 | cta.a(param0, 121));
    }

    final void i(int param0) {
        this.field_Zc.SetDirection(-this.field_Gb[0], -this.field_Gb[1], -this.field_Gb[2]);
        int var2 = 35 / ((param0 + 11) / 56);
        this.field_cd.SetDirection(-this.field_M[0], -this.field_M[1], -this.field_M[2]);
        this.field_Pc = false;
    }

    private final static int a(boolean param0, hs param1) {
        if (param1 == aw.field_G) {
          return 2;
        }
        if (param1 == ue.field_v) {
          return 1;
        }
        if (!param0) {
          jagdx.D3DPRESENT_PARAMETERS var3 = (jagdx.D3DPRESENT_PARAMETERS) null;
          cta.a(-16, (jagdx.IDirect3D) null, -7, 73, (jagdx.D3DPRESENT_PARAMETERS) null, -9);
        }
        throw new IllegalArgumentException();
    }

    final static ha createToolkit(java.awt.Canvas param0, d param1, cn param2, Integer param3) {
        cta stackIn_37_0 = null;
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
        gua var13 = null;
        jagdx.eva var14 = null;
        cta var15 = null;
        var4 = null;
        try {
          var5_int = 0;
          var6 = 1;
          var7 = new jaclib.peer.sha();
          var8 = jagdx.IDirect3D.a(-2147483616, var7);
          var9 = var8.a(var5_int, var6);
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
          if (!cta.a(-30, var8, param3.intValue(), var6, var10, var5_int)) {
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
            var12_ref = var8.a(var5_int, var6, param0, var11 | 64, var10);
          } catch (jagdx.eva decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var14 = (jagdx.eva) (Object) decompiledCaughtException;
            var12_ref = var8.a(var5_int, var6, param0, 32 | var11, var10);
          }
          var13 = new gua(var12_ref.b(0), var12_ref.b());
          var15 = new cta(var5_int, var6, param0, var7, var8, var12_ref, var13, var10, var9, param1, param2, param3.intValue());
          var4 = var15;
          var15.K(-107);
          stackIn_37_0 = var15;
          return (ha) ((Object) stackIn_37_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          if (var4 != null) {
            ((cta) (var4)).k();
          }
          throw var5;
        }
    }

    private final boolean T(int param0) {
        int var4 = 0;
        if (param0 != -2005530519) {
          return false;
        }
        int var2 = this.field_jd.TestCooperativeLevel();
        if (var2 != 0 &&
          -2005530519 != var2) {
          return false;
        }
        gua var3 = (gua) (this.field_Ub);
        this.m(6);
        var3.a(true);
        this.field_ad.BackBufferWidth = 0;
        this.field_ad.BackBufferHeight = 0;
        if (cta.a(param0 + 2005530607, this.field_dd, this.field_Gc, this.field_id, this.field_ad, this.field_Xc)) {
          var4 = this.field_jd.Reset(this.field_ad);
          if (jagdx.ah.a(var4, (byte) 123)) {
            var3.a((byte) -17, this.field_jd.b(0), this.field_jd.b());
            this.s((byte) 6);
            this.h(-29040);
            return true;
          }
        }
        return false;
    }

    final void a(int param0, int param1) throws qva {
        int fieldTemp$1 = 0;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        this.field_jd.EndScene();
        if (!this.field_kd.a((byte) 75)) {
          fieldTemp$1 = this.field_ed + 1;
          this.field_ed = this.field_ed + 1;
          if (fieldTemp$1 > 50) {
            throw new qva();
          }
          discarded$2 = this.T(-2005530519);
        } else {
          this.field_ed = 0;
          if (jagdx.ah.a(this.field_kd.a(0, 0), 10643)) {
            discarded$3 = this.T(-2005530519);
          }
        }
        this.field_jd.BeginScene();
    }

    final void f(int param0) {
        if (param0 != -3485) {
          this.f(-69);
        }
        int var2 = this.field_Qc[this.field_Cc] ? cta.a(this.field_mc[this.field_Cc], 0) : 1;
        this.field_jd.SetTextureStageState(this.field_Cc, 1, var2);
    }

    final void I(int param0) {
        this.field_Hc = (float)(-this.field_Ac + this.field_k);
        this.field_B = (float)(-this.field_J) + this.field_Hc;
        if ((float)this.field_D > this.field_B) {
          this.field_B = (float)this.field_D;
        }
        this.field_jd.a(36, this.field_B);
        this.field_jd.a(37, this.field_Hc);
        if (param0 != 1) {
          this.field_Yc = (boolean[]) null;
        }
        this.field_jd.SetRenderState(34, this.field_g);
    }

    final qm c(int param0, boolean param1) {
        if (param0 != 6) {
          field_hd = (float[]) null;
        }
        return (qm) ((Object) new lia(this, param1));
    }

    final void a(float param0, float param1, float param2) {
    }

    private final static int a(int param0, ura param1) {
        ura var3;
        if (param1 == jja.field_d) {
          return 1;
        }
        if (pfa.field_i == param1) {
          return 2;
        }
        if (param1 == cva.field_b) {
          return 3;
        }
        if (param1 == hqa.field_j) {
          return 4;
        }
        if (ada.field_z == param1) {
          return 256;
        }
        if (param0 <= -46) {
          return 0;
        }
        var3 = (ura) null;
        cta.a(22, (ura) null);
        return 0;
    }

    final void b(byte param0) {
        int var2;
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        var2 = -16 / ((param0 + 67) / 53);
        stackIn_3_0 = this.field_jd;
        stackIn_3_1 = 14;
        stackIn_4_2 = (this.field_Nb) && (this.field_qc);
        ((jagdx.IDirect3DDevice) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2);
    }

    final void a(Object param0, boolean param1, java.awt.Canvas param2) {
        if (param1) {
          this.u((byte) 126);
        }
    }

    final void S(int param0) {
        this.field_jd.SetScissorRect(this.field_i + this.field_A, this.field_K + this.field_Kc, this.field_C, this.field_jb);
        if (param0 != -3335) {
          this.field_Qc = (boolean[]) null;
        }
    }

    final void GA(int param0) {
        this.field_jd.Clear(1, param0, 0.0f, 0);
    }

    final void a(int param0, byte param1) {
        this.field_jd.SetTextureStageState(this.field_Cc, 11, param0);
        if (param1 <= 27) {
          this.field_jd = (jagdx.IDirect3DDevice) null;
        }
    }

    final void a(pia param0, boolean param1) {
        this.a((byte) -127, param0);
        if (param0.field_g != this.field_bd[this.field_Cc]) {
          this.field_jd.SetSamplerState(this.field_Cc, 1, !param0.field_g ? 3 : 1);
          this.field_bd[this.field_Cc] = param0.field_g;
        }
        if ((!param0.field_j ? 1 : 0) != (!this.field_Uc[this.field_Cc] ? 1 : 0)) {
          this.field_jd.SetSamplerState(this.field_Cc, 2, !param0.field_j ? 3 : 1);
          this.field_Uc[this.field_Cc] = param0.field_j;
        }
        if (!param1) {
          this.field_Rc = (hs[]) null;
        }
    }

    final void q(byte param0) {
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

    final void e(boolean param0) {
        if (param0) {
          this.b(-126, 70);
        }
    }

    final void D(int param0) {
        jagdx.IDirect3DDevice stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        stackIn_4_0 = this.field_jd;
        stackIn_4_1 = 28;
        stackIn_5_2 = (this.field_U) && (this.field_Bb) && (this.field_J >= 0);
        ((jagdx.IDirect3DDevice) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_5_2);
        if (param0 != 2) {
          this.field_Rc = (hs[]) null;
        }
    }

    final float c(byte param0) {
        if (param0 >= -39) {
          mw var3 = (mw) null;
          this.a((nha) null, (mw) null);
        }
        return -0.5f;
    }

    final void v(int param0) {
        if (param0 <= 19) {
          this.field_Yc = (boolean[]) null;
        }
        float var2 = this.field_Zb ? this.field_j : 0.0f;
        float var3 = this.field_Zb ? -this.field_pc : 0.0f;
        this.field_Zc.SetDiffuse(var2 * this.field_sc, this.field_yb * var2, this.field_Kb * var2, 0.0f);
        this.field_cd.SetDiffuse(this.field_sc * var3, var3 * this.field_yb, var3 * this.field_Kb, 0.0f);
        this.field_Pc = false;
    }

    final void f(byte param0) {
        if (param0 != -69) {
          this.field_ad = (jagdx.D3DPRESENT_PARAMETERS) null;
        }
        this.field_jd.a(7, this.field_wc);
    }

    final void d(int param0) {
        if (param0 != 1) {
          nh var3 = (nh) null;
          this.a((nh) null, false);
        }
        if (this.field_Qc[this.field_Cc]) {
          this.field_Qc[this.field_Cc] = false;
          this.field_jd.SetTexture(this.field_Cc, (jagdx.IDirect3DBaseTexture) null);
          this.u((byte) -23);
          this.f(param0 ^ -3486);
        }
    }

    final synchronized void c(int param0) {
        this.field_Mc.c(-24122);
        super.c(param0);
    }

    final void k() {
        this.field_Mc.b(14203);
        super.k();
    }

    final lv a(byte[] param0, ft param1, byte param2, int param3, int param4, int param5) {
        if (param2 >= -1) {
          jagdx.IDirect3DPixelShader var8 = (jagdx.IDirect3DPixelShader) null;
          this.a(-23, (jagdx.IDirect3DPixelShader) null);
        }
        return (lv) ((Object) new ek(this, param1, param4, param3, param5, param0));
    }

    final mna a(ne[] param0, int param1) {
        if (param1 != 0) {
          this.field_dd = (jagdx.IDirect3D) null;
        }
        return (mna) ((Object) new dxVertexLayout(this, param0));
    }

    final na a(byte param0, int[][] param1, boolean param2, int param3) {
        if (param0 <= 7) {
          this.field_Uc = (boolean[]) null;
        }
        return (na) ((Object) new ul(this, param3, param2, param1));
    }

    final void a(int param0, iw param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        this.field_jd.DrawPrimitive(cta.a(113, param1), param2, param0);
    }

    final void a(byte param0, nqa param1) {
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
        this.field_jd.SetTexture(this.field_Cc, param1.c(-51));
        if (param1.field_a == this.field_Rc[this.field_Cc]) {
          if (this.field_Yc[this.field_Cc] != param1.field_c) {
            stackIn_16_0 = this.field_jd;
            stackIn_16_1 = this.field_Cc;
            stackIn_16_2 = 7;
            if (param1.field_c) {
              stackIn_17_3 = cta.a(true, param1.field_a);
            } else {
              stackIn_17_3 = 0;
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_16_0).SetSamplerState(stackIn_16_1, stackIn_16_2, stackIn_17_3);
            this.field_Yc[this.field_Cc] = param1.field_c;
          }
        } else {
          var4 = cta.a(true, param1.field_a);
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
              stackIn_12_3 = cta.a(true, param1.field_a);
            }
            ((jagdx.IDirect3DDevice) (Object) stackIn_11_0).SetSamplerState(stackIn_11_1, stackIn_11_2, stackIn_12_3);
            this.field_Yc[this.field_Cc] = param1.field_c;
          }
        }
        if (!this.field_Qc[this.field_Cc]) {
          this.field_Qc[this.field_Cc] = true;
          this.u((byte) -23);
          this.f(-3485);
        }
    }

    final void z(byte param0) {
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
          this.field_q.a(field_hd, (byte) -37);
        }
        this.field_jd.SetTransform(256, field_hd);
    }

    final jca a(nha param0, mw param1) {
        return null;
    }

    final void z(int param0) {
        int var2;
        ica var3;
        if (null == this.field_Vc &&
          od.field_h != this.field_v[this.field_Cc]) {
          if (pfa.field_i == this.field_v[this.field_Cc]) {
            this.field_jd.SetTransform(16 + this.field_Cc, this.field_hc[this.field_Cc].a((byte) -114, field_hd));
          } else {
            this.field_jd.SetTransform(16 + this.field_Cc, this.field_hc[this.field_Cc].a(field_hd, (byte) -37));
          }
          var2 = cta.a(-51, this.field_v[this.field_Cc]);
          if (this.field_gd[this.field_Cc] != var2) {
            this.field_jd.SetTextureStageState(this.field_Cc, 24, var2);
            this.field_gd[this.field_Cc] = var2;
          }
        } else {
          this.field_jd.SetTextureStageState(this.field_Cc, 24, 0);
          this.field_gd[this.field_Cc] = 0;
        }
        if (param0 != 0) {
          var3 = (ica) null;
          cta.a((ica) null, -59);
        }
    }

    final gf a(int param0, int param1, ft param2, byte param3, una param4) {
        if (param3 != -63) {
          jagdx.IDirect3DVertexShader var7 = (jagdx.IDirect3DVertexShader) null;
          this.a((jagdx.IDirect3DVertexShader) null, 105);
        }
        return (gf) ((Object) new pia(this, param2, param4, param0, param1));
    }

    final void a(jagdx.IDirect3DVertexShader param0, int param1) {
        this.field_Vc = param0;
        this.field_jd.SetVertexShader(param0);
        if (param1 != -1) {
          this.field_nd = true;
        }
        this.z(param1 + 1);
    }

    final void u(byte param0) {
        int var2 = this.field_Qc[this.field_Cc] ? cta.a(this.field_db[this.field_Cc], param0 ^ -23) : 1;
        if (param0 != -23) {
          return;
        }
        this.field_jd.SetTextureStageState(this.field_Cc, 4, var2);
    }

    final void h(byte param0) {
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        stackIn_3_0 = this.field_jd;
        stackIn_3_1 = 137;
        stackIn_4_2 = (this.field_l) && (!this.field_yc);
        ((jagdx.IDirect3DDevice) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2);
        if (param0 != -102) {
          field_hd = (float[]) null;
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var11 = 0;
        jagdx.IDirect3DSurface var9;
        int var10;
        jagdx.IDirect3DSurface var12;
        var12 = this.field_jd.a(0);
        var9 = this.field_jd.a(param2, param3, 21, 0, 0, true);
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

    final Object a(boolean param0, java.awt.Canvas param1) {
        if (!param0) {
          return null;
        }
        return (Object) null;
    }

    private final static int a(fp param0, int param1) {
        if (param1 < 112) {
          return 109;
        }
        if (ej.field_c == param0) {
          return 2;
        }
        if (tla.field_c == param0) {
          return 0;
        }
        if (param0 == lja.field_j) {
          return 1;
        }
        if (pea.field_c != param0) {
          throw new IllegalArgumentException();
        }
        return 3;
    }

    final void w(int param0) {
        this.field_jd.a(15, this.field_m);
        if (param0 > -30) {
          float[] var3 = (float[]) null;
          this.a((ft) null, -49, -36, false, 110, -64, (float[]) null, -7);
        }
    }

    final void a(int param0, int param1, qm param2) {
        lia var4 = (lia) (param2);
        if (param0 > -124) {
          this.field_ld = (jagdx.D3DCAPS) null;
        }
        this.field_jd.SetStreamSource(param1, var4.field_e, 0, var4.b(-7339));
    }

    static {
        field_hd = new float[16];
        field_md = new int[]{22, 23};
        field_fd = new int[]{77, 80};
    }
}
