/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class usa extends vw {
    private jagdx.IDirect3DVertexShader field_f;
    private static float[] field_d;
    private hk field_g;
    private cta field_e;

    final void a(int param0) {
        this.field_e.a((jagdx.IDirect3DVertexShader) null, -1);
        this.field_c.a(ej.field_c, 0, -54);
        this.field_c.a(tla.field_c, 1, -56);
        this.field_c.a(pea.field_c, 2, -116);
        if (param0 <= -4) {
          this.field_c.a((byte) 51, true);
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 == 1185) {
          return this.field_f != null ? true : false;
        }
        this.a((byte) -57, 54, -28);
        return this.field_f != null ? true : false;
    }

    final void b(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        if (null != this.field_f) {
          var2 = this.field_e.field_jd;
          var3 = this.field_e.n((byte) 95);
          var2.a(0, var3.a(false, field_d));
        }
        if (param0 == 107) {
          return;
        }
        iva var4 = (iva) null;
        this.a(-5, (iva) null, 86);
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (null != this.field_f) {
          var2 = this.field_e.field_jd;
          var2.a(4, this.field_c.a(field_d, false));
        }
        if (param0 >= 64) {
          return;
        }
        this.b((byte) -60);
    }

    final void c(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        if (null != this.field_f) {
          var2 = this.field_e.field_jd;
          var3 = this.field_c.a((byte) 113);
          var3.a(field_d, -101);
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
        this.a((byte) 6, -79, -56);
    }

    final void a(int param0, iva param1, int param2) {
        if (param2 != 24595) {
          field_d = (float[]) null;
        }
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        if (null != this.field_f) {
          var2 = this.field_e.field_jd;
          var3 = this.field_e.n((byte) -86);
          var2.a(0, var3.a(false, field_d));
        }
        if (param0) {
          return;
        }
        this.b(true);
    }

    final void a(byte param0, int param1, int param2) {
        jagdx.IDirect3DDevice var7 = null;
        float var5_float = 0.0f;
        int var5 = 0;
        float var5_floatLifetime1;
        int var5Lifetime1;
        if (param0 == 55) {
          var7 = this.field_e.field_jd;
          if (this.field_g.field_g) {
            var5_float = (float)(this.field_c.field_Dc % 4000) / 4000.0f;
            this.field_c.a(true, this.field_g.field_c);
            var7.a(11, var5_float, 0.0f, 0.0f, 0.0f);
          } else {
            var5 = 16 * (this.field_c.field_Dc % 4000) / 4000;
            this.field_c.a(true, this.field_g.field_d[var5]);
            var7.a(11, 0.0f, 0.0f, 0.0f, 0.0f);
          }
          return;
        }
        field_d = (float[]) null;
        jagdx.IDirect3DDevice var6 = this.field_e.field_jd;
        if (this.field_g.field_g) {
          var5_floatLifetime1 = (float)(this.field_c.field_Dc % 4000) / 4000.0f;
          this.field_c.a(true, this.field_g.field_c);
          var6.a(11, var5_floatLifetime1, 0.0f, 0.0f, 0.0f);
        } else {
          var5Lifetime1 = 16 * (this.field_c.field_Dc % 4000) / 4000;
          this.field_c.a(true, this.field_g.field_d[var5Lifetime1]);
          var6.a(11, 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    final void a(boolean param0, int param1) {
        this.field_c.a(jv.field_m, (byte) -110, r.field_m);
        if (param1 != 5744) {
          iva var4 = (iva) null;
          this.a(-56, (iva) null, 109);
        }
    }

    final void a(boolean param0) {
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
            if (0 >= this.field_c.field_J) {
              var7.a(10, 0.0f, 0.0f, 0.0f, 0.0f);
            } else {
              var3 = this.field_c.field_Hc;
              var4 = this.field_c.field_B;
              var5 = -512.0f + var4;
              var7.a(10, var5, 1.0f / (-var5 + var4), var4, 1.0f / (var3 - var4));
            }
            this.field_c.g(3625, this.field_c.field_g);
          }
          return;
        }
        this.a(false);
        if (this.field_f == null) {
        } else {
          var6 = this.field_e.field_jd;
          if (0 >= this.field_c.field_J) {
            var6.a(10, 0.0f, 0.0f, 0.0f, 0.0f);
          } else {
            var3Lifetime1 = this.field_c.field_Hc;
            var4Lifetime1 = this.field_c.field_B;
            var5Lifetime1 = -512.0f + var4Lifetime1;
            var6.a(10, var5Lifetime1, 1.0f / (-var5Lifetime1 + var4Lifetime1), var4Lifetime1, 1.0f / (var3Lifetime1 - var4Lifetime1));
          }
          this.field_c.g(3625, this.field_c.field_g);
        }
    }

    usa(cta param0, cn param1, hk param2) {
        super(param0);
        this.field_g = param2;
        this.field_e = param0;
        if (param1 != null &&
          this.field_g.c(-30634) &&
          (65535 & this.field_e.field_ld.VertexShaderVersion) >= 257) {
          this.field_f = this.field_e.field_jd.b(param1.a("dx", (byte) 114, "transparent_water"));
        } else {
          this.field_f = null;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_c.a(ej.field_c, 0, -100);
        this.field_c.a(pea.field_c, 1, -21);
        this.field_c.a(tla.field_c, 2, -6219, false, true);
        this.field_c.a((byte) 77, false);
        this.field_e.a(this.field_f, -1);
        this.b((byte) 107);
        this.c(true);
        this.b(77);
        int var3 = 91 % ((param0 - 41) / 62);
        this.a(true);
    }

    static {
        field_d = new float[16];
    }
}
