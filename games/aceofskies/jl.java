/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends sk {
    private boolean field_n;
    private jagdx.IDirect3DVertexShader field_f;
    private static float[] field_m;
    private boolean field_q;
    private kr field_j;
    private qi field_k;
    private boolean field_h;
    private jagdx.IDirect3DVertexShader field_g;
    private jagdx.IDirect3DVertexShader field_l;
    private static float[] field_o;
    private jagdx.IDirect3DVertexShader field_i;
    private jagdx.IDirect3DVertexShader field_p;

    private final void c(byte param0) {
        jagdx.IDirect3DVertexShader var2 = null;
        int var3 = 86 / ((-73 - param0) / 32);
        jagdx.IDirect3DDevice var4 = this.field_j.field_Rc;
        int var5 = this.field_b.n((byte) -104);
        ec var6 = this.field_b.t(-11198);
        if (!this.field_q) {
          var2 = var5 == 2147483647 ? this.field_g : this.field_p;
        } else {
          var2 = var5 == 2147483647 ? this.field_l : this.field_i;
        }
        if (this.field_f != var2) {
          this.field_f = var2;
          this.field_j.a(var2, 5243);
          this.f(-48);
          this.c(404277666);
          this.d(18580);
          this.b((byte) -25);
          this.b(-127);
          this.a(10);
        }
        var6.a(0.0f, -1.0f, field_o, 0.0f, (float)var5, 11);
        var4.a(12, field_o);
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
          field_o = (float[]) null;
        }
    }

    final void b(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        ec var3Lifetime1;
        if (param0 == -25) {
          if (this.field_f != null) {
            var2 = this.field_j.field_Rc;
            var3 = this.field_j.v((byte) 68);
            var2.a(0, var3.c(field_m, 78));
          }
          return;
        }
        this.a(77, -13, -23);
        if (this.field_f != null) {
          var2Lifetime1 = this.field_j.field_Rc;
          var3Lifetime1 = this.field_j.v((byte) 68);
          var2Lifetime1.a(0, var3Lifetime1.c(field_m, 78));
        }
    }

    final void a(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        if (null != this.field_f) {
          var2 = this.field_j.field_Rc;
          var3 = this.field_b.XA();
          var4 = this.field_b.i();
          var5 = (float)var3 - 0.125f * (float)(-var4 + var3);
          var6 = (float)var3 - 0.25f * (float)(var3 - var4);
          var2.b(10, var6, 1.0f / (-var6 + var5), var5, 1.0f / (-var5 + (float)var3));
          var2.b(11, 1.0f / (float)this.field_b.j((byte) 5), (float)this.field_b.H(param0 + 73) / 255.0f, this.field_b.field_y, 1.0f / (-this.field_b.field_Xb + this.field_b.field_y));
          this.field_b.a((byte) -74, this.field_b.q(0));
        }
        if (param0 == 10) {
          return;
        }
        this.a(122, 20, -87);
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        if (this.field_f != null) {
          var2 = this.field_j.field_Rc;
          var3 = this.field_j.v((byte) -83);
          var2.a(0, var3.c(field_m, 59));
        }
        if (param0 < -117) {
          return;
        }
        this.field_i = (jagdx.IDirect3DVertexShader) null;
    }

    jl(kr param0, gk param1) {
        super(param0);
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        this.field_h = false;
        this.field_j = param0;
        if (param1 == null) {
          this.field_n = false;
        } else {
          if ((65535 & this.field_j.field_Bc.VertexShaderVersion) < 257) {
            this.field_n = false;
          } else {
            this.field_g = this.field_j.field_Rc.b(param1.a("dx", (byte) -71, "uw_ground_unlit"));
            this.field_l = this.field_j.field_Rc.b(param1.a("dx", (byte) -71, "uw_ground_lit"));
            this.field_p = this.field_j.field_Rc.b(param1.a("dx", (byte) -71, "uw_model_unlit"));
            this.field_i = this.field_j.field_Rc.b(param1.a("dx", (byte) -71, "uw_model_lit"));
            stackIn_5_0 = (null == this.field_p) ? 0 : 1;
            stackIn_8_1 = (this.field_l == null) ? 0 : 1;
            stackIn_11_2 = (null == this.field_g) ? 0 : 1;
            stackIn_13_0 = stackIn_5_0 & (stackIn_8_1 & stackIn_11_2);
            stackIn_14_1 = (this.field_i == null) ? 0 : 1;
            if ((stackIn_13_0 & stackIn_14_1) == 0) {
              this.field_n = false;
            } else {
              this.field_k = this.field_b.a(new int[]{0, -1}, 2, 0, false, 1);
              this.field_k.a(false, false, (byte) -127);
              this.field_n = true;
            }
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
          this.field_h = true;
        }
    }

    final void a(boolean param0, byte param1) {
        this.field_q = param0 ? true : false;
        if (param1 >= 2) {
          this.field_b.a(1, (byte) 123);
          this.field_b.a(this.field_k, -9135);
          this.field_b.a(du.field_l, true, bd.field_C);
          this.field_b.a((byte) 125, 0, bs.field_a);
          this.field_b.a(true, 2, true, dl.field_p, false);
          this.field_b.a(un.field_i, 0, 0);
          this.field_b.a(0, (byte) 45);
          this.c((byte) -111);
          return;
        }
        this.field_q = true;
        this.field_b.a(1, (byte) 123);
        this.field_b.a(this.field_k, -9135);
        this.field_b.a(du.field_l, true, bd.field_C);
        this.field_b.a((byte) 125, 0, bs.field_a);
        this.field_b.a(true, 2, true, dl.field_p, false);
        this.field_b.a(un.field_i, 0, 0);
        this.field_b.a(0, (byte) 45);
        this.c((byte) -111);
    }

    final void a(int param0, int param1, jj param2) {
        if (param2 != null) {
          if (this.field_h) {
            this.field_b.a((byte) 118, 0, dl.field_p);
            this.field_b.a(dl.field_p, 0, 0);
            this.field_h = false;
          }
          this.field_b.a(param2, -9135);
          this.field_b.b(param0, false);
          if (param1 < 66) {
            this.field_h = true;
            return;
          }
          return;
        }
        if (this.field_h) {
          if (param1 < 66) {
            this.field_h = true;
            return;
          }
          return;
        }
        this.field_b.a(this.field_b.field_Kb, -9135);
        this.field_b.b(1, false);
        this.field_b.a((byte) 118, 0, un.field_i);
        this.field_b.a(un.field_i, 0, 0);
        this.field_h = true;
        if (param1 >= 66) {
          return;
        }
        this.field_h = true;
    }

    final void a(boolean param0) {
        this.field_b.a(1, (byte) 114);
        this.field_b.a((jj) null, -9135);
        this.field_b.a(ru.field_a, param0, ru.field_a);
        this.field_b.a((byte) 125, 0, dl.field_p);
        this.field_b.a((byte) 122, 2, bs.field_a);
        this.field_b.a(dl.field_p, 0, 0);
        if (!param0) {
          field_m = (float[]) null;
          this.field_b.a(0, (byte) 56);
          if (!this.field_h) {
            if (this.field_f == null) {
              return;
            }
            this.field_j.a((jagdx.IDirect3DVertexShader) null, 5243);
            this.field_f = null;
            return;
          }
          this.field_b.a((byte) 118, 0, dl.field_p);
          this.field_b.a(dl.field_p, 0, 0);
          this.field_h = false;
          if (this.field_f != null) {
            this.field_j.a((jagdx.IDirect3DVertexShader) null, 5243);
            this.field_f = null;
            return;
          }
          return;
        }
        this.field_b.a(0, (byte) 56);
        if (this.field_h) {
          this.field_b.a((byte) 118, 0, dl.field_p);
          this.field_b.a(dl.field_p, 0, 0);
          this.field_h = false;
          if (this.field_f == null) {
            return;
          }
          this.field_j.a((jagdx.IDirect3DVertexShader) null, 5243);
          this.field_f = null;
          return;
        }
        if (this.field_f == null) {
          return;
        }
        this.field_j.a((jagdx.IDirect3DVertexShader) null, 5243);
        this.field_f = null;
    }

    final void d(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        if (this.field_f != null) {
          var2 = this.field_j.field_Rc;
          var3 = this.field_b.J(-120);
          var2.SetVertexShaderConstantF(8, var3.a(false, field_m), 2);
        }
        if (param0 == 18580) {
          return;
        }
        this.field_h = false;
    }

    private final void f(int param0) {
        ec var4 = null;
        jagdx.IDirect3DDevice var3 = null;
        if (this.field_f != null &&
          this.field_q) {
          var4 = this.field_b.f(false);
          ec var2_ref_ec = var4;
          var3 = this.field_j.field_Rc;
          var3.b(13, this.field_b.field_g * this.field_b.field_Wb, this.field_b.field_rb * this.field_b.field_Wb, this.field_b.field_Hb * this.field_b.field_Wb, 1.0f);
          var3.b(14, this.field_b.field_fb * this.field_b.field_g, this.field_b.field_fb * this.field_b.field_rb, this.field_b.field_fb * this.field_b.field_Hb, 1.0f);
          var3.b(16, this.field_b.field_g * this.field_b.field_ub, this.field_b.field_rb * this.field_b.field_ub, this.field_b.field_Hb * this.field_b.field_ub, 1.0f);
          var4.a(this.field_b.field_Jb[1], field_o, -11232, this.field_b.field_Jb[2], this.field_b.field_Jb[0]);
          var3.SetVertexShaderConstantF(15, field_o, 1);
          var4.a(this.field_b.field_Gb[1], field_o, -11232, this.field_b.field_Gb[2], this.field_b.field_Gb[0]);
          var3.SetVertexShaderConstantF(17, field_o, 1);
        }
        int var2 = -25 / ((param0 + 87) / 36);
    }

    final void c(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (param0 == 404277666) {
          if (this.field_f != null) {
            var2 = this.field_j.field_Rc;
            var2.a(4, this.field_b.a(param0 - 404277654, field_m));
          }
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          this.a(-128, -51, 116);
          return this.field_n;
        }
        return this.field_n;
    }

    static {
        field_m = new float[16];
        field_o = new float[4];
    }
}
