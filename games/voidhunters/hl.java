/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends uda {
    private rga field_i;
    private jagdx.IDirect3DPixelShader field_h;
    private jagdx.IDirect3DVertexShader field_g;
    private static float[] field_f;
    private boolean field_j;
    private boolean field_k;
    private nla field_e;

    final void c(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        if (this.field_k) {
          var2 = this.field_e.field_Mc;
          var3 = this.field_e.E(param0 - 5);
          var2.a(0, var3.a(field_f, (byte) 22));
        }
        if (param0 == 5) {
          return;
        }
        this.field_e = (nla) null;
    }

    final void a(int param0) {
        if (param0 == 2543) {
          if (this.field_k) {
            this.field_e.a(param0 ^ 2543, (jagdx.IDirect3DVertexShader) null);
            this.field_e.a(-123, (jagdx.IDirect3DPixelShader) null);
            this.field_d.g(1, param0 - 2658);
            this.field_d.a((ura) null, param0 ^ -2449);
            this.field_d.g(0, param0 - 2668);
            this.field_d.a((ura) null, -121);
            this.field_k = false;
          }
          return;
        }
        this.b(true);
        if (this.field_k) {
          this.field_e.a(param0 ^ 2543, (jagdx.IDirect3DVertexShader) null);
          this.field_e.a(-123, (jagdx.IDirect3DPixelShader) null);
          this.field_d.g(1, param0 - 2658);
          this.field_d.a((ura) null, param0 ^ -2449);
          this.field_d.g(0, param0 - 2668);
          this.field_d.a((ura) null, -121);
          this.field_k = false;
        }
    }

    final void a(byte param0, int param1, ura param2) {
        if (param0 <= 42) {
          this.a(false);
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
          this.field_e = (nla) null;
        }
    }

    final void a(int param0, boolean param1) {
        jagdx.IDirect3DDevice var5 = null;
        jagdx.IDirect3DDevice var6 = null;
        hdb var3 = null;
        hdb var3Lifetime1;
        if (param0 != 5) {
          this.field_k = true;
          var3 = this.field_d.J(10);
          if (this.field_j) {
            if (var3 != null) {
              var5 = this.field_e.field_Mc;
              this.field_e.a(0, this.field_g);
              this.field_e.a(-121, this.field_h);
              this.field_d.g(1, -88);
              this.field_d.a(var3, -108);
              this.field_d.g(0, -99);
              this.field_d.a(this.field_i.field_e, param0 ^ -115);
              this.field_k = true;
              this.c((byte) 15);
              this.d(8);
              this.a(true);
              this.b(true);
              var5.a(1, -this.field_d.field_wc[0], -this.field_d.field_wc[1], -this.field_d.field_wc[2], 0.0f);
              var5.a(2, this.field_d.field_Sb, this.field_d.field_u, this.field_d.field_x, 1.0f);
              var5.a(3, Math.abs(this.field_d.field_wc[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
            }
            return;
          }
          return;
        }
        var3Lifetime1 = this.field_d.J(10);
        if (!this.field_j) {
          return;
        }
        if (var3Lifetime1 != null) {
          var6 = this.field_e.field_Mc;
          this.field_e.a(0, this.field_g);
          this.field_e.a(-121, this.field_h);
          this.field_d.g(1, -88);
          this.field_d.a(var3Lifetime1, -108);
          this.field_d.g(0, -99);
          this.field_d.a(this.field_i.field_e, param0 ^ -115);
          this.field_k = true;
          this.c((byte) 15);
          this.d(8);
          this.a(true);
          this.b(true);
          var6.a(1, -this.field_d.field_wc[0], -this.field_d.field_wc[1], -this.field_d.field_wc[2], 0.0f);
          var6.a(2, this.field_d.field_Sb, this.field_d.field_u, this.field_d.field_x, 1.0f);
          var6.a(3, Math.abs(this.field_d.field_wc[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        jagdx.IDirect3DDevice var4 = null;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        if (this.field_k) {
          var4 = this.field_e.field_Mc;
          var5 = 1 << (param1 & 3);
          var6 = (float)(1 << ((62 & param1) >> 3)) / 32.0f;
          var7 = param0 & 65535;
          var8 = (float)((231074 & param0) >> 16) / 8.0f;
          var4.b(14, (float)(this.field_d.field_pc * var5 % 40000) / 40000.0f, 0.0f, 0.0f, 0.0f);
          var4.b(15, var6, 0.0f, 0.0f, 0.0f);
          var4.a(4, (float)var7, 0.0f, 0.0f, 0.0f);
          var4.a(5, var8, 0.0f, 0.0f, 0.0f);
        }
        if (param2 == 5) {
          return;
        }
        this.a(true);
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        if (param0) {
          if (this.field_k) {
            var2 = this.field_e.field_Mc;
            if (0 >= this.field_d.field_j) {
              var2.b(16, 0.0f, 0.0f, 0.0f, 0.0f);
            } else {
              var3 = this.field_d.field_r;
              var4 = this.field_d.field_p;
              var2.b(16, var3, 1.0f / (-var4 + var3), 0.0f, 0.0f);
            }
            var2.a(0, (float)(this.field_d.field_lc >> 16 & 255) / 255.0f, (float)(this.field_d.field_lc >> 8 & 255) / 255.0f, (float)(this.field_d.field_lc & 255) / 255.0f, 0.0f);
          }
          return;
        }
    }

    final void c(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        oj var4 = null;
        if (param0 == 15) {
          if (this.field_k) {
            var2 = this.field_e.field_Mc;
            var3 = this.field_e.g((byte) 82);
            var4 = this.field_e.E(0);
            var2.a(0, var4.a(field_f, (byte) 22));
            var2.a(4, var3.a((byte) -4, field_f));
          }
          return;
        }
    }

    final void a(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        if (param0) {
          if (this.field_k) {
            var2 = this.field_e.field_Mc;
            var2.a(8, this.field_d.a(114, field_f));
          }
          return;
        }
        field_f = (float[]) null;
        if (this.field_k) {
          var2Lifetime1 = this.field_e.field_Mc;
          var2Lifetime1.a(8, this.field_d.a(114, field_f));
        }
    }

    final void d(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        if (this.field_k) {
          var2 = this.field_e.field_Mc;
          var3 = this.field_d.p(0);
          var2.SetVertexShaderConstantF(12, var3.b((byte) 105, field_f), 2);
        }
        if (param0 == 8) {
          return;
        }
        this.field_e = (nla) null;
    }

    hl(nla param0, asb param1, rga param2) {
        super(param0);
        boolean stackIn_9_1 = false;
        this.field_e = param0;
        this.field_i = param2;
        if (param1 == null) {
          this.field_h = null;
          this.field_j = false;
          this.field_g = null;
          return;
        }
        if (!this.field_d.field_vb) {
          this.field_h = null;
          this.field_j = false;
          this.field_g = null;
          return;
        }
        if (!this.field_d.field_uc) {
          this.field_h = null;
          this.field_j = false;
          this.field_g = null;
          return;
        }
        if ((this.field_e.field_Hc.VertexShaderVersion & 65535) < 257) {
          this.field_h = null;
          this.field_j = false;
          this.field_g = null;
          return;
        }
        this.field_g = this.field_e.field_Mc.b(param1.a("environment_mapped_water_v", true, "dx"));
        this.field_h = this.field_e.field_Mc.a(param1.a("environment_mapped_water_f", true, "dx"));
        stackIn_9_1 = (null != this.field_g) && (null != this.field_h) && (this.field_i.b((byte) 107));
        this.field_j = stackIn_9_1;
    }

    final boolean a(byte param0) {
        int var2 = -62 / ((param0 - 34) / 63);
        return this.field_j;
    }

    static {
        field_f = new float[16];
    }
}
