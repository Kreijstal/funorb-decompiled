/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fta extends uda {
    private jagdx.IDirect3DVertexShader field_e;
    private jagdx.IDirect3DVertexShader field_g;
    private nla field_m;
    private jagdx.IDirect3DVertexShader field_h;
    private static float[] field_p;
    private boolean field_f;
    private jagdx.IDirect3DVertexShader field_l;
    private eb field_o;
    private static float[] field_k;
    private jagdx.IDirect3DVertexShader field_i;
    private boolean field_n;
    private boolean field_j;

    final void a(int param0, int param1, int param2) {
        if (param2 != 5) {
          this.field_g = (jagdx.IDirect3DVertexShader) null;
        }
    }

    fta(nla param0, asb param1) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        this.field_f = false;
        this.field_m = param0;
        if (param1 != null &&
          257 <= (this.field_m.field_Hc.VertexShaderVersion & 65535)) {
          this.field_e = this.field_m.field_Mc.b(param1.a("uw_ground_unlit", true, "dx"));
          this.field_l = this.field_m.field_Mc.b(param1.a("uw_ground_lit", true, "dx"));
          this.field_i = this.field_m.field_Mc.b(param1.a("uw_model_unlit", true, "dx"));
          this.field_g = this.field_m.field_Mc.b(param1.a("uw_model_lit", true, "dx"));
          stackIn_6_0 = (null == this.field_g) ? 0 : 1;
          stackIn_9_1 = (null == this.field_e) ? 0 : 1;
          stackIn_12_2 = (null == this.field_l) ? 0 : 1;
          stackIn_14_1 = stackIn_9_1 & stackIn_12_2;
          stackIn_15_2 = (null == this.field_i) ? 0 : 1;
          if ((stackIn_6_0 & (stackIn_14_1 & stackIn_15_2)) == 0) {
            this.field_n = false;
          } else {
            this.field_o = this.field_d.a(2, false, 1, (byte) -48, new int[]{0, -1});
            this.field_o.a(false, (byte) -98, false);
            this.field_n = true;
          }
          return;
        }
        this.field_n = false;
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
          this.field_f = false;
        }
    }

    final void c(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        oj var3Lifetime1;
        if (param0 == 15) {
          if (null != this.field_h) {
            var2 = this.field_m.field_Mc;
            var3 = this.field_m.E(param0 - 15);
            var2.a(0, var3.a(field_p, (byte) 22));
          }
          return;
        }
        this.field_l = (jagdx.IDirect3DVertexShader) null;
        if (null != this.field_h) {
          var2Lifetime1 = this.field_m.field_Mc;
          var3Lifetime1 = this.field_m.E(param0 - 15);
          var2Lifetime1.a(0, var3Lifetime1.a(field_p, (byte) 22));
        }
    }

    final void a(byte param0, int param1, ura param2) {
        if (param0 <= 42) {
          return;
        }
        if (param2 == null) {
          if (!this.field_f) {
            this.field_d.a(this.field_d.field_Q, -123);
            this.field_d.h(116, 1);
            this.field_d.a(0, pja.field_l, 7);
            this.field_d.a(0, (byte) -91, pja.field_l);
            this.field_f = true;
            return;
          }
          return;
        }
        if (this.field_f) {
          this.field_d.a(0, qcb.field_q, 7);
          this.field_d.a(0, (byte) -60, qcb.field_q);
          this.field_f = false;
        } else {
          this.field_d.a(param2, -106);
          this.field_d.h(75, param1);
          return;
        }
        this.field_d.a(param2, -106);
        this.field_d.h(75, param1);
    }

    private final void d(byte param0) {
        jagdx.IDirect3DDevice var3 = null;
        int var4 = 0;
        oj var5 = null;
        jagdx.IDirect3DVertexShader var2 = null;
        if (param0 == -46) {
          var3 = this.field_m.field_Mc;
          var4 = this.field_d.u((byte) 95);
          var5 = this.field_d.g((byte) 20);
          if (!this.field_j) {
            var2 = 2147483647 == var4 ? this.field_e : this.field_i;
          } else {
            var2 = var4 != 2147483647 ? this.field_g : this.field_l;
          }
          if (var2 != this.field_h) {
            this.field_h = var2;
            this.field_m.a(0, var2);
            this.e(127);
            this.a(true);
            this.d(8);
            this.c(5);
            this.c((byte) 15);
            this.b(true);
          }
          var5.a(field_k, -1.0f, (byte) 67, (float)var4, 0.0f, 0.0f);
          var3.a(12, field_k);
          return;
        }
    }

    final void a(int param0) {
        this.field_d.g(1, -95);
        this.field_d.a((ura) null, param0 - 2669);
        if (param0 != 2543) {
          return;
        }
        this.field_d.a(asa.field_a, true, asa.field_a);
        this.field_d.a(0, qcb.field_q, param0 - 2536);
        this.field_d.a(2, pea.field_d, 7);
        this.field_d.a(0, (byte) -106, qcb.field_q);
        this.field_d.g(0, -71);
        if (!this.field_f) {
          if (null != this.field_h) {
            this.field_m.a(0, (jagdx.IDirect3DVertexShader) null);
            this.field_h = null;
          }
          return;
        }
        this.field_d.a(0, qcb.field_q, 7);
        this.field_d.a(0, (byte) -65, qcb.field_q);
        this.field_f = false;
        if (null != this.field_h) {
          this.field_m.a(0, (jagdx.IDirect3DVertexShader) null);
          this.field_h = null;
        }
    }

    final void a(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (null != this.field_h) {
          var2 = this.field_m.field_Mc;
          var2.a(4, this.field_d.a(123, field_p));
        }
        if (param0) {
          return;
        }
        this.field_i = (jagdx.IDirect3DVertexShader) null;
    }

    final void d(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        if (this.field_h != null) {
          var2 = this.field_m.field_Mc;
          var3 = this.field_d.p(0);
          var2.SetVertexShaderConstantF(8, var3.b((byte) 105, field_p), 2);
        }
        if (param0 == 8) {
          return;
        }
        this.d((byte) 92);
    }

    final boolean a(byte param0) {
        int var2 = -95 / ((param0 - 34) / 63);
        return this.field_n;
    }

    private final void e(int param0) {
        oj var4 = null;
        jagdx.IDirect3DDevice var3 = null;
        if (null != this.field_h) {
          if (!this.field_j) {
            if (param0 <= 111) {
              this.a(3, -77, 116);
              return;
            }
            return;
          }
          var4 = this.field_d.z((byte) 90);
          oj var2 = var4;
          var3 = this.field_m.field_Mc;
          var3.b(13, this.field_d.field_Rb * this.field_d.field_Sb, this.field_d.field_Rb * this.field_d.field_u, this.field_d.field_Rb * this.field_d.field_x, 1.0f);
          var3.b(14, this.field_d.field_oc * this.field_d.field_Sb, this.field_d.field_oc * this.field_d.field_u, this.field_d.field_oc * this.field_d.field_x, 1.0f);
          var3.b(16, this.field_d.field_Sb * this.field_d.field_tc, this.field_d.field_u * this.field_d.field_tc, this.field_d.field_x * this.field_d.field_tc, 1.0f);
          var4.a(this.field_d.field_wc[1], field_k, this.field_d.field_wc[2], this.field_d.field_wc[0], false);
          var3.SetVertexShaderConstantF(15, field_k, 1);
          var4.a(this.field_d.field_cb[1], field_k, this.field_d.field_cb[2], this.field_d.field_cb[0], false);
          var3.SetVertexShaderConstantF(17, field_k, 1);
        }
        if (param0 > 111) {
          return;
        }
        this.a(3, -77, 116);
    }

    final void a(int param0, boolean param1) {
        this.field_j = param1 ? true : false;
        this.field_d.g(1, -109);
        this.field_d.a(this.field_o, -110);
        if (param0 == 5) {
          this.field_d.a(et.field_c, true, df.field_o);
          this.field_d.a(0, pea.field_d, 7);
          this.field_d.a(true, -21115, false, qcb.field_q, 2);
          this.field_d.a(0, (byte) -108, pja.field_l);
          this.field_d.g(0, -72);
          this.d((byte) -46);
          return;
        }
        this.field_l = (jagdx.IDirect3DVertexShader) null;
        this.field_d.a(et.field_c, true, df.field_o);
        this.field_d.a(0, pea.field_d, 7);
        this.field_d.a(true, -21115, false, qcb.field_q, 2);
        this.field_d.a(0, (byte) -108, pja.field_l);
        this.field_d.g(0, -72);
        this.d((byte) -46);
    }

    final void c(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        if (null != this.field_h) {
          var2 = this.field_m.field_Mc;
          var3 = this.field_m.E(0);
          var2.a(0, var3.a(field_p, (byte) 22));
        }
        if (param0 == 5) {
          return;
        }
        this.field_h = (jagdx.IDirect3DVertexShader) null;
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        if (this.field_h != null) {
          var2 = this.field_m.field_Mc;
          var3 = this.field_d.XA();
          var4 = this.field_d.i();
          var5 = (float)var3 - 0.125f * (float)(-var4 + var3);
          var6 = -((float)(var3 - var4) * 0.25f) + (float)var3;
          var2.b(10, var6, 1.0f / (var5 - var6), var5, 1.0f / (-var5 + (float)var3));
          var2.b(11, 1.0f / (float)this.field_d.D(117), (float)this.field_d.a(false) / 255.0f, this.field_d.field_r, 1.0f / (this.field_d.field_r - this.field_d.field_p));
          this.field_d.e(-125, this.field_d.D((byte) -126));
        }
        if (param0) {
          return;
        }
        this.b(false);
    }

    static {
        field_p = new float[16];
        field_k = new float[4];
    }
}
