/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends rq {
    private static float[] field_g;
    private jagdx.IDirect3DVertexShader field_e;
    private sk field_h;
    private ir field_f;

    final void c(boolean param0) {
        this.field_f.a(-103, (jagdx.IDirect3DVertexShader) null);
        this.field_b.a(jq.field_a, 0, 0);
        if (param0) {
          return;
        } else {
          this.field_b.a(fv.field_y, 1, 0);
          this.field_b.a(mm.field_h, 2, 0);
          this.field_b.b(0, true);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var5 = 0;
        float var5_float = 0.0f;
        jagdx.IDirect3DDevice var6 = null;
        jagdx.IDirect3DDevice var7 = null;
        if (param0 != 34023) {
          L0: {
            this.field_f = (ir) null;
            var6 = this.field_f.field_Cc;
            if (!this.field_h.field_g) {
              var5 = 16 * (this.field_b.field_kc % 4000) / 4000;
              this.field_b.a(this.field_h.field_d[var5], param0 ^ 33939);
              discarded$4 = var6.b(11, 0.0f, 0.0f, 0.0f, 0.0f);
              break L0;
            } else {
              var5_float = (float)(this.field_b.field_kc % 4000) / 4000.0f;
              this.field_b.a(this.field_h.field_f, 114);
              discarded$5 = var6.b(11, var5_float, 0.0f, 0.0f, 0.0f);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var7 = this.field_f.field_Cc;
            if (!this.field_h.field_g) {
              var5 = 16 * (this.field_b.field_kc % 4000) / 4000;
              this.field_b.a(this.field_h.field_d[var5], param0 ^ 33939);
              discarded$6 = var7.b(11, 0.0f, 0.0f, 0.0f, 0.0f);
              break L1;
            } else {
              var5_float = (float)(this.field_b.field_kc % 4000) / 4000.0f;
              this.field_b.a(this.field_h.field_f, 114);
              discarded$7 = var7.b(11, var5_float, 0.0f, 0.0f, 0.0f);
              break L1;
            }
          }
          return;
        }
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -8) {
          L0: {
            this.c(false);
            if (null == this.field_e) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == this.field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(boolean param0, byte param1) {
        this.field_b.a((byte) -83, cv.field_F, ua.field_n);
        if (param1 >= -71) {
            field_g = (float[]) null;
        }
    }

    final void c(byte param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        ut var3 = null;
        L0: {
          if (this.field_e == null) {
            break L0;
          } else {
            var2 = this.field_f.field_Cc;
            var3 = this.field_f.k((byte) 126);
            discarded$2 = var2.a(0, var3.a(0, field_g));
            break L0;
          }
        }
        if (param0 <= 0) {
          this.a((byte) 126);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        float[] discarded$4 = null;
        int discarded$5 = 0;
        float[] discarded$6 = null;
        int discarded$7 = 0;
        ut var4 = null;
        jagdx.IDirect3DDevice var5 = null;
        ut var6 = null;
        jagdx.IDirect3DDevice var7 = null;
        if (param0 >= -47) {
          L0: {
            this.c(false);
            if (this.field_e != null) {
              var5 = this.field_f.field_Cc;
              var4 = this.field_b.H(26453);
              discarded$4 = var4.a(field_g, (byte) -37);
              field_g[2] = field_g[2] * 0.25f;
              field_g[3] = field_g[3] * 0.25f;
              field_g[5] = field_g[5] * 0.25f;
              field_g[4] = field_g[4] * 0.25f;
              field_g[7] = field_g[7] * 0.25f;
              field_g[1] = field_g[1] * 0.25f;
              field_g[0] = field_g[0] * 0.25f;
              field_g[6] = field_g[6] * 0.25f;
              discarded$5 = var5.SetVertexShaderConstantF(8, field_g, 2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_e != null) {
              var7 = this.field_f.field_Cc;
              var6 = this.field_b.H(26453);
              discarded$6 = var6.a(field_g, (byte) -37);
              field_g[2] = field_g[2] * 0.25f;
              field_g[3] = field_g[3] * 0.25f;
              field_g[5] = field_g[5] * 0.25f;
              field_g[4] = field_g[4] * 0.25f;
              field_g[7] = field_g[7] * 0.25f;
              field_g[1] = field_g[1] * 0.25f;
              field_g[0] = field_g[0] * 0.25f;
              field_g[6] = field_g[6] * 0.25f;
              discarded$7 = var7.SetVertexShaderConstantF(8, field_g, 2);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 != 18834) {
            this.field_f = (ir) null;
        }
    }

    vh(ir param0, ki param1, sk param2) {
        super(param0);
        L0: {
          L1: {
            this.field_f = param0;
            this.field_h = param2;
            if (param1 == null) {
              break L1;
            } else {
              if (!this.field_h.c(41)) {
                break L1;
              } else {
                if (257 <= (65535 & this.field_f.field_Kc.VertexShaderVersion)) {
                  this.field_e = this.field_f.field_Cc.a(param1.a("transparent_water", "dx", -1));
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_e = null;
          break L0;
        }
    }

    final void b(boolean param0) {
        int discarded$4 = 0;
        boolean discarded$5 = false;
        jagdx.IDirect3DDevice var2 = null;
        L0: {
          if (this.field_e != null) {
            var2 = this.field_f.field_Cc;
            discarded$4 = var2.a(4, this.field_b.a(-105, field_g));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          discarded$5 = this.b((byte) -103);
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2_ref_jagdx_IDirect3DDevice = null;
        ut var3 = null;
        int discarded$0 = 0;
        if (!(this.field_e == null)) {
            var2_ref_jagdx_IDirect3DDevice = this.field_f.field_Cc;
            var3 = this.field_f.k((byte) 69);
            discarded$0 = var2_ref_jagdx_IDirect3DDevice.a(0, var3.a(0, field_g));
        }
        int var2 = 67 % ((41 - param0) / 46);
    }

    final void a(boolean param0, int param1) {
        this.field_b.a(jq.field_a, 0, 0);
        this.field_b.a(mm.field_h, 1, 0);
        this.field_b.a((byte) -125, 2, false, true, fv.field_y);
        this.field_b.b(0, false);
        if (param1 != 20186) {
          this.field_f = (ir) null;
          this.field_f.a(-51, this.field_e);
          this.c((byte) 40);
          this.a((byte) -83);
          this.b(false);
          this.a(260);
          return;
        } else {
          this.field_f.a(-51, this.field_e);
          this.c((byte) 40);
          this.a((byte) -83);
          this.b(false);
          this.a(260);
          return;
        }
    }

    final void a(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        L0: {
          if (null == this.field_e) {
            break L0;
          } else {
            L1: {
              var2 = this.field_f.field_Cc;
              if (-1 <= (this.field_b.field_Kb ^ -1)) {
                discarded$4 = var2.b(10, 0.0f, 0.0f, 0.0f, 0.0f);
                break L1;
              } else {
                var3 = this.field_b.field_Tb;
                var4 = this.field_b.field_E;
                var5 = -512.0f + var4;
                discarded$5 = var2.b(10, var5, 1.0f / (-var5 + var4), var4, 1.0f / (var3 - var4));
                break L1;
              }
            }
            this.field_b.a(false, this.field_b.field_C);
            break L0;
          }
        }
        if (param0 != 260) {
          this.b(36);
          return;
        } else {
          return;
        }
    }

    static {
        field_g = new float[16];
    }
}
