/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends rq {
    private static float[] field_h;
    private jagdx.IDirect3DVertexShader field_n;
    private jagdx.IDirect3DVertexShader field_f;
    private jagdx.IDirect3DVertexShader field_j;
    private jagdx.IDirect3DVertexShader field_m;
    private boolean field_g;
    private static float[] field_k;
    private boolean field_o;
    private boolean field_e;
    private ru field_i;
    private jagdx.IDirect3DVertexShader field_p;
    private ir field_l;

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        if (!param0) {
          if (null != this.field_j) {
            var2 = this.field_l.field_Cc;
            var2.a(4, this.field_b.a(-52, field_h));
          }
          return;
        }
        this.field_o = false;
        if (null != this.field_j) {
          var2Lifetime1 = this.field_l.field_Cc;
          var2Lifetime1.a(4, this.field_b.a(-52, field_h));
        }
    }

    final void a(boolean param0, int param1) {
        this.field_o = param0 ? true : false;
        this.field_b.g(1, param1 - 20312);
        this.field_b.a(this.field_i, param1 - 20076);
        this.field_b.a((byte) -83, lf.field_e, ua.field_n);
        this.field_b.a(mm.field_h, 0, param1 ^ param1);
        this.field_b.a((byte) 89, 2, true, false, jq.field_a);
        this.field_b.a(ta.field_a, 0, true);
        this.field_b.g(0, param1 - 20311);
        this.d(-86);
    }

    final void c(boolean param0) {
        this.field_b.g(1, -121);
        this.field_b.a((ed) null, 100);
        this.field_b.a((byte) -83, vi.field_v, vi.field_v);
        this.field_b.a(jq.field_a, 0, 0);
        if (param0) {
          this.a(-69, 14, -105);
          this.field_b.a(mm.field_h, 2, 0);
          this.field_b.a(jq.field_a, 0, true);
          this.field_b.g(0, -109);
          if (!this.field_e) {
            if (null == this.field_j) {
              return;
            }
            this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
            this.field_j = null;
            return;
          }
          this.field_b.a(jq.field_a, 0, 0);
          this.field_b.a(jq.field_a, 0, true);
          this.field_e = false;
          if (null != this.field_j) {
            this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
            this.field_j = null;
            return;
          }
          return;
        }
        this.field_b.a(mm.field_h, 2, 0);
        this.field_b.a(jq.field_a, 0, true);
        this.field_b.g(0, -109);
        if (this.field_e) {
          this.field_b.a(jq.field_a, 0, 0);
          this.field_b.a(jq.field_a, 0, true);
          this.field_e = false;
          if (null == this.field_j) {
            return;
          }
          this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
          this.field_j = null;
          return;
        }
        if (null == this.field_j) {
          return;
        }
        this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
        this.field_j = null;
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
          return true;
        }
        return this.field_g;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
          this.field_g = true;
        }
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2_ref_jagdx_IDirect3DDevice = null;
        ut var3 = null;
        if (null != this.field_j) {
          var2_ref_jagdx_IDirect3DDevice = this.field_l.field_Cc;
          var3 = this.field_l.k((byte) 67);
          var2_ref_jagdx_IDirect3DDevice.a(0, var3.a(0, field_h));
        }
        int var2 = -118 % ((41 - param0) / 46);
    }

    final void c(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        ut var3 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        ut var3Lifetime1;
        if (param0 > 0) {
          if (this.field_j != null) {
            var2 = this.field_l.field_Cc;
            var3 = this.field_l.k((byte) 122);
            var2.a(0, var3.a(0, field_h));
          }
          return;
        }
        this.field_i = (ru) null;
        if (this.field_j != null) {
          var2Lifetime1 = this.field_l.field_Cc;
          var3Lifetime1 = this.field_l.k((byte) 122);
          var2Lifetime1.a(0, var3Lifetime1.a(0, field_h));
        }
    }

    private final void d(int param0) {
        jagdx.IDirect3DVertexShader var2 = null;
        int var5 = -19 % ((-23 - param0) / 63);
        jagdx.IDirect3DDevice var3 = this.field_l.field_Cc;
        int var4 = this.field_b.M(-66);
        ut var6 = this.field_b.g((byte) -28);
        if (this.field_o) {
          var2 = var4 != 2147483647 ? this.field_m : this.field_n;
        } else {
          var2 = var4 != 2147483647 ? this.field_p : this.field_f;
        }
        if (this.field_j == var2) {
          var6.a(0.0f, field_k, (byte) -86, 0.0f, -1.0f, (float)var4);
          var3.a(12, field_k);
          return;
        }
        this.field_j = var2;
        this.field_l.a(-116, var2);
        this.e(82);
        this.b(false);
        this.a((byte) -72);
        this.c((byte) 53);
        this.b(121);
        this.a(260);
        var6.a(0.0f, field_k, (byte) -86, 0.0f, -1.0f, (float)var4);
        var3.a(12, field_k);
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 != 18834) {
          return;
        }
        if (param2 != null) {
          if (this.field_e) {
            this.field_b.a(jq.field_a, 0, 0);
            this.field_b.a(jq.field_a, 0, true);
            this.field_e = false;
          }
          this.field_b.a(param2, param1 ^ 18892);
          this.field_b.h(param1 - 18757, param0);
          return;
        }
        if (!this.field_e) {
          this.field_b.a(this.field_b.field_D, param1 ^ 18939);
          this.field_b.h(param1 - 18771, 1);
          this.field_b.a(ta.field_a, 0, param1 ^ 18834);
          this.field_b.a(ta.field_a, 0, true);
          this.field_e = true;
          return;
        }
    }

    final void a(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        jagdx.IDirect3DDevice var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        float var5Lifetime1;
        float var6Lifetime1;
        if (param0 == 260) {
          if (null != this.field_j) {
            var2 = this.field_l.field_Cc;
            var3 = this.field_b.XA();
            var4 = this.field_b.i();
            var5 = -((float)(-var4 + var3) * 0.125f) + (float)var3;
            var6 = (float)var3 - 0.25f * (float)(-var4 + var3);
            var2.b(10, var6, 1.0f / (-var6 + var5), var5, 1.0f / ((float)var3 - var5));
            var2.b(11, 1.0f / (float)this.field_b.S(-102), (float)this.field_b.e((byte) 26) / 255.0f, this.field_b.field_Tb, 1.0f / (this.field_b.field_Tb - this.field_b.field_E));
            this.field_b.a(false, this.field_b.v(15));
          }
          return;
        }
        this.field_o = true;
        if (null != this.field_j) {
          var2Lifetime1 = this.field_l.field_Cc;
          var3Lifetime1 = this.field_b.XA();
          var4Lifetime1 = this.field_b.i();
          var5Lifetime1 = -((float)(-var4Lifetime1 + var3Lifetime1) * 0.125f) + (float)var3Lifetime1;
          var6Lifetime1 = (float)var3Lifetime1 - 0.25f * (float)(-var4Lifetime1 + var3Lifetime1);
          var2Lifetime1.b(10, var6Lifetime1, 1.0f / (-var6Lifetime1 + var5Lifetime1), var5Lifetime1, 1.0f / ((float)var3Lifetime1 - var5Lifetime1));
          var2Lifetime1.b(11, 1.0f / (float)this.field_b.S(-102), (float)this.field_b.e((byte) 26) / 255.0f, this.field_b.field_Tb, 1.0f / (this.field_b.field_Tb - this.field_b.field_E));
          this.field_b.a(false, this.field_b.v(15));
        }
    }

    private final void e(int param0) {
        ut var4 = null;
        jagdx.IDirect3DDevice var3 = null;
        if (this.field_j != null) {
          if (!this.field_o) {
            if (param0 < 3) {
              this.a(false, -14);
              return;
            }
            return;
          }
          var4 = this.field_b.c(true);
          ut var2 = var4;
          var3 = this.field_l.field_Cc;
          var3.b(13, this.field_b.field_T * this.field_b.field_J, this.field_b.field_T * this.field_b.field_jb, this.field_b.field_Xb * this.field_b.field_T, 1.0f);
          var3.b(14, this.field_b.field_J * this.field_b.field_S, this.field_b.field_jb * this.field_b.field_S, this.field_b.field_Xb * this.field_b.field_S, 1.0f);
          var3.b(16, this.field_b.field_hb * this.field_b.field_J, this.field_b.field_jb * this.field_b.field_hb, this.field_b.field_hb * this.field_b.field_Xb, 1.0f);
          var4.a(-1416, this.field_b.field_G[1], this.field_b.field_G[0], field_k, this.field_b.field_G[2]);
          var3.SetVertexShaderConstantF(15, field_k, 1);
          var4.a(-1416, this.field_b.field_U[1], this.field_b.field_U[0], field_k, this.field_b.field_U[2]);
          var3.SetVertexShaderConstantF(17, field_k, 1);
        }
        if (param0 >= 3) {
          return;
        }
        this.a(false, -14);
    }

    ol(ir param0, ki param1) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        this.field_e = false;
        this.field_l = param0;
        if (param1 != null &&
          (65535 & this.field_l.field_Kc.VertexShaderVersion) >= 257) {
          this.field_f = this.field_l.field_Cc.a(param1.a("uw_ground_unlit", "dx", -1));
          this.field_n = this.field_l.field_Cc.a(param1.a("uw_ground_lit", "dx", -1));
          this.field_p = this.field_l.field_Cc.a(param1.a("uw_model_unlit", "dx", -1));
          this.field_m = this.field_l.field_Cc.a(param1.a("uw_model_lit", "dx", -1));
          stackIn_6_0 = (this.field_n == null) ? 0 : 1;
          stackIn_9_1 = (this.field_f == null) ? 0 : 1;
          stackIn_11_0 = stackIn_6_0 & stackIn_9_1;
          stackIn_12_1 = (null == this.field_p) ? 0 : 1;
          stackIn_14_0 = stackIn_11_0 & stackIn_12_1;
          stackIn_15_1 = (null == this.field_m) ? 0 : 1;
          if ((stackIn_14_0 & stackIn_15_1) == 0) {
            this.field_g = false;
          } else {
            this.field_i = this.field_b.a(new int[]{0, -1}, 1, false, -110, 2);
            this.field_i.a(false, false, true);
            this.field_g = true;
          }
          return;
        }
        this.field_g = false;
    }

    final void a(boolean param0, byte param1) {
        if (param1 >= -71) {
          this.a(true, (byte) -17);
        }
    }

    final void a(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        ut var3 = null;
        if (null != this.field_j) {
          var2 = this.field_l.field_Cc;
          var3 = this.field_b.H(26453);
          var2.SetVertexShaderConstantF(8, var3.a(field_h, (byte) -37), 2);
        }
        if (param0 <= -47) {
          return;
        }
        this.b((byte) 16);
    }

    static {
        field_h = new float[16];
        field_k = new float[4];
    }
}
