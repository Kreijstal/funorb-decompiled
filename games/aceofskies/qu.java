/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qu extends sk {
    private em field_g;
    private jagdx.IDirect3DVertexShader field_i;
    private boolean field_l;
    private kr field_f;
    private jagdx.IDirect3DPixelShader field_h;
    private static float[] field_k;
    private boolean field_j;

    final void d(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        if (this.field_j) {
          var2 = this.field_f.field_Rc;
          var3 = this.field_b.J(-108);
          var2.SetVertexShaderConstantF(12, var3.a(false, field_k), 2);
        }
        if (param0 == 18580) {
          return;
        }
        jj var4 = (jj) null;
        this.a(111, 53, (jj) null);
    }

    final void a(boolean param0) {
        if (this.field_j) {
          this.field_f.a((jagdx.IDirect3DVertexShader) null, 5243);
          this.field_f.a(68, (jagdx.IDirect3DPixelShader) null);
          this.field_b.a(1, (byte) 107);
          this.field_b.a((jj) null, -9135);
          this.field_b.a(0, (byte) 83);
          this.field_b.a((jj) null, -9135);
          this.field_j = false;
        }
        if (param0) {
          return;
        }
        field_k = (float[]) null;
    }

    final void b(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        if (param0 == -25) {
          if (this.field_j) {
            var2 = this.field_f.field_Rc;
            var3 = this.field_f.v((byte) -49);
            var2.a(0, var3.c(field_k, 77));
          }
          return;
        }
    }

    qu(kr param0, gk param1, em param2) {
        super(param0);
        boolean stackIn_9_1 = false;
        this.field_g = param2;
        this.field_f = param0;
        if (param1 == null) {
          this.field_l = false;
          this.field_i = null;
          this.field_h = null;
          return;
        }
        if (!this.field_b.field_Pb) {
          this.field_l = false;
          this.field_i = null;
          this.field_h = null;
          return;
        }
        if (!this.field_b.field_J) {
          this.field_l = false;
          this.field_i = null;
          this.field_h = null;
          return;
        }
        if ((65535 & this.field_f.field_Bc.VertexShaderVersion) < 257) {
          this.field_l = false;
          this.field_i = null;
          this.field_h = null;
          return;
        }
        this.field_i = this.field_f.field_Rc.b(param1.a("dx", (byte) -71, "environment_mapped_water_v"));
        this.field_h = this.field_f.field_Rc.a(param1.a("dx", (byte) -71, "environment_mapped_water_f"));
        stackIn_9_1 = (null != this.field_i) && (null != this.field_h) && (this.field_g.a(0));
        this.field_l = stackIn_9_1;
    }

    final void a(int param0, int param1, int param2) {
        jagdx.IDirect3DDevice var4 = null;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        if (param0 == 1786747298) {
          if (this.field_j) {
            var4 = this.field_f.field_Rc;
            var5 = 1 << (3 & param1);
            var6 = (float)(1 << ((param1 & 56) >> 3)) / 32.0f;
            var7 = 65535 & param2;
            var4.b(14, (float)(this.field_b.field_r * var5 % 40000) / 40000.0f, 0.0f, 0.0f, 0.0f);
            var8 = (float)((param2 & 257550) >> 16) / 8.0f;
            var4.b(15, var6, 0.0f, 0.0f, 0.0f);
            var4.a(4, (float)var7, 0.0f, 0.0f, 0.0f);
            var4.a(5, var8, 0.0f, 0.0f, 0.0f);
          }
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        jagdx.IDirect3DDevice var4 = null;
        go var3 = this.field_b.O(29190);
        if (this.field_l &&
          var3 != null) {
          var4 = this.field_f.field_Rc;
          this.field_f.a(this.field_i, 5243);
          this.field_f.a(124, this.field_h);
          this.field_b.a(1, (byte) 34);
          this.field_b.a(var3, -9135);
          this.field_b.a(0, (byte) 90);
          this.field_b.a(this.field_g.field_a, -9135);
          this.field_j = true;
          this.b(-120);
          this.d(18580);
          this.c(404277666);
          this.a(10);
          var4.a(1, -this.field_b.field_Jb[0], -this.field_b.field_Jb[1], -this.field_b.field_Jb[2], 0.0f);
          var4.a(2, this.field_b.field_g, this.field_b.field_rb, this.field_b.field_Hb, 1.0f);
          var4.a(3, Math.abs(this.field_b.field_Jb[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
        }
        if (param1 >= 2) {
          return;
        }
        this.a(false, (byte) -39);
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          this.field_g = (em) null;
          return this.field_l;
        }
        return this.field_l;
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        ec var4 = null;
        if (this.field_j) {
          var2 = this.field_f.field_Rc;
          var3 = this.field_f.t(-11198);
          var4 = this.field_f.v((byte) -69);
          var2.a(0, var4.c(field_k, 107));
          var2.a(4, var3.a(field_k, 35));
        }
        if (param0 < -117) {
          return;
        }
        this.field_g = (em) null;
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
          this.field_l = false;
        }
    }

    final void a(int param0) {
        jagdx.IDirect3DDevice var7 = null;
        jagdx.IDirect3DDevice var6 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var3Lifetime1;
        float var4Lifetime1;
        if (param0 == 10) {
          if (this.field_j) {
            var7 = this.field_f.field_Rc;
            if (this.field_b.field_p > 0) {
              var3 = this.field_b.field_y;
              var4 = this.field_b.field_Xb;
              var7.b(16, var3, 1.0f / (-var4 + var3), 0.0f, 0.0f);
            } else {
              var7.b(16, 0.0f, 0.0f, 0.0f, 0.0f);
            }
            var7.a(0, (float)((16741111 & this.field_b.field_X) >> 16) / 255.0f, (float)(this.field_b.field_X >> 8 & 255) / 255.0f, (float)(this.field_b.field_X & 255) / 255.0f, 0.0f);
          }
          return;
        }
        jj var5 = (jj) null;
        this.a(-38, 45, (jj) null);
        if (this.field_j) {
          var6 = this.field_f.field_Rc;
          if (this.field_b.field_p > 0) {
            var3Lifetime1 = this.field_b.field_y;
            var4Lifetime1 = this.field_b.field_Xb;
            var6.b(16, var3Lifetime1, 1.0f / (-var4Lifetime1 + var3Lifetime1), 0.0f, 0.0f);
          } else {
            var6.b(16, 0.0f, 0.0f, 0.0f, 0.0f);
          }
          var6.a(0, (float)((16741111 & this.field_b.field_X) >> 16) / 255.0f, (float)(this.field_b.field_X >> 8 & 255) / 255.0f, (float)(this.field_b.field_X & 255) / 255.0f, 0.0f);
        }
    }

    final void a(int param0, int param1, jj param2) {
        if (param1 < 66) {
          this.a(true, false);
        }
    }

    final void c(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (this.field_j) {
          var2 = this.field_f.field_Rc;
          var2.a(8, this.field_b.a(12, field_k));
        }
        if (param0 == 404277666) {
          return;
        }
        this.b(98);
    }

    static {
        field_k = new float[16];
    }
}
