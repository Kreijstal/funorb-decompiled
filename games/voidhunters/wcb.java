/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wcb extends uda {
    private jagdx.IDirect3DVertexShader field_g;
    private static float[] field_h;
    private rga field_f;
    private nla field_e;

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var3 = 0.0f;
        if (null != this.field_g) {
          var2 = this.field_e.field_Mc;
          if (this.field_d.field_j > 0) {
            var3 = this.field_d.field_r;
            var4 = this.field_d.field_p;
            var5 = var4 - 512.0f;
            var2.b(10, var5, 1.0f / (var4 - var5), var4, 1.0f / (-var4 + var3));
          } else {
            var2.b(10, 0.0f, 0.0f, 0.0f, 0.0f);
          }
          this.field_d.e(-126, this.field_d.field_lc);
        }
        if (param0) {
          return;
        }
        this.field_g = (jagdx.IDirect3DVertexShader) null;
    }

    final boolean a(byte param0) {
        int var2 = -120 / ((34 - param0) / 63);
        return this.field_g != null ? true : false;
    }

    final void a(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (this.field_g != null) {
          var2 = this.field_e.field_Mc;
          var2.a(4, this.field_d.a(108, field_h));
        }
        if (param0) {
          return;
        }
        this.field_e = (nla) null;
    }

    wcb(nla param0, asb param1, rga param2) {
        super(param0);
        this.field_f = param2;
        this.field_e = param0;
        if (param1 != null &&
          this.field_f.c((byte) 60) &&
          (65535 & this.field_e.field_Hc.VertexShaderVersion) >= 257) {
          this.field_g = this.field_e.field_Mc.b(param1.a("transparent_water", true, "dx"));
        } else {
          this.field_g = null;
        }
    }

    final void d(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        if (null != this.field_g) {
          var2 = this.field_e.field_Mc;
          var3 = this.field_d.p(0);
          var3.b((byte) 105, field_h);
          field_h[7] = field_h[7] * 0.25f;
          field_h[4] = field_h[4] * 0.25f;
          field_h[6] = field_h[6] * 0.25f;
          field_h[0] = field_h[0] * 0.25f;
          field_h[5] = field_h[5] * 0.25f;
          field_h[3] = field_h[3] * 0.25f;
          field_h[1] = field_h[1] * 0.25f;
          field_h[2] = field_h[2] * 0.25f;
          var2.SetVertexShaderConstantF(8, field_h, 2);
        }
        if (param0 == 8) {
          return;
        }
        this.a(-22, false);
    }

    final void a(int param0) {
        this.field_e.a(0, (jagdx.IDirect3DVertexShader) null);
        this.field_d.a(0, qcb.field_q, 7);
        if (param0 == 2543) {
          this.field_d.a(1, tma.field_q, 7);
          this.field_d.a(2, pea.field_d, 7);
          this.field_d.a(true, false);
          return;
        }
        this.field_g = (jagdx.IDirect3DVertexShader) null;
        this.field_d.a(1, tma.field_q, 7);
        this.field_d.a(2, pea.field_d, 7);
        this.field_d.a(true, false);
    }

    final void b(int param0, boolean param1) {
        this.field_d.a(je.field_c, true, df.field_o);
        if (param0 != 5) {
          this.c((byte) 107);
        }
    }

    final void c(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        if (this.field_g != null) {
          var2 = this.field_e.field_Mc;
          var3 = this.field_e.E(0);
          var2.a(0, var3.a(field_h, (byte) 22));
        }
        if (param0 == 5) {
          return;
        }
        field_h = (float[]) null;
    }

    final void a(byte param0, int param1, ura param2) {
        if (param0 < 42) {
          field_h = (float[]) null;
        }
    }

    final void c(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        oj var3Lifetime1;
        if (param0 == 15) {
          if (null != this.field_g) {
            var2 = this.field_e.field_Mc;
            var3 = this.field_e.E(0);
            var2.a(0, var3.a(field_h, (byte) 22));
          }
          return;
        }
        this.field_f = (rga) null;
        if (null != this.field_g) {
          var2Lifetime1 = this.field_e.field_Mc;
          var3Lifetime1 = this.field_e.E(0);
          var2Lifetime1.a(0, var3Lifetime1.a(field_h, (byte) 22));
        }
    }

    final void a(int param0, int param1, int param2) {
        jagdx.IDirect3DDevice var7 = null;
        float var5_float = 0.0f;
        int var5 = 0;
        float var5_floatLifetime1;
        int var5Lifetime1;
        if (param2 == 5) {
          var7 = this.field_e.field_Mc;
          if (this.field_f.field_b) {
            var5_float = (float)(this.field_d.field_pc % 4000) / 4000.0f;
            this.field_d.a(this.field_f.field_d, -124);
            var7.b(11, var5_float, 0.0f, 0.0f, 0.0f);
          } else {
            var5 = 16 * (this.field_d.field_pc % 4000) / 4000;
            this.field_d.a(this.field_f.field_a[var5], param2 - 127);
            var7.b(11, 0.0f, 0.0f, 0.0f, 0.0f);
          }
          return;
        }
        this.a(-112);
        jagdx.IDirect3DDevice var6 = this.field_e.field_Mc;
        if (this.field_f.field_b) {
          var5_floatLifetime1 = (float)(this.field_d.field_pc % 4000) / 4000.0f;
          this.field_d.a(this.field_f.field_d, -124);
          var6.b(11, var5_floatLifetime1, 0.0f, 0.0f, 0.0f);
        } else {
          var5Lifetime1 = 16 * (this.field_d.field_pc % 4000) / 4000;
          this.field_d.a(this.field_f.field_a[var5Lifetime1], param2 - 127);
          var6.b(11, 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    final void a(int param0, boolean param1) {
        this.field_d.a(0, qcb.field_q, param0 + 2);
        this.field_d.a(1, pea.field_d, 7);
        this.field_d.a(false, -21115, true, tma.field_q, 2);
        this.field_d.a(false, false);
        this.field_e.a(0, this.field_g);
        this.c(param0);
        this.d(8);
        this.a(true);
        this.b(true);
    }

    static {
        field_h = new float[16];
    }
}
