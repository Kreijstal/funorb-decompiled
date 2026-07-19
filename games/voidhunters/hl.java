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
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        L0: {
          if (!this.field_k) {
            break L0;
          } else {
            var2 = this.field_e.field_Mc;
            var3 = this.field_e.E(param0 + -5);
            discarded$2 = var2.a(0, var3.a(field_f, (byte) 22));
            break L0;
          }
        }
        if (param0 != 5) {
          this.field_e = (nla) null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (param0 != 2543) {
          L0: {
            this.b(true);
            if (this.field_k) {
              this.field_e.a(param0 ^ 2543, (jagdx.IDirect3DVertexShader) null);
              this.field_e.a(-123, (jagdx.IDirect3DPixelShader) null);
              this.field_d.g(1, param0 + -2658);
              this.field_d.a((ura) null, param0 ^ -2449);
              this.field_d.g(0, param0 + -2668);
              this.field_d.a((ura) null, -121);
              this.field_k = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_k) {
              this.field_e.a(param0 ^ 2543, (jagdx.IDirect3DVertexShader) null);
              this.field_e.a(-123, (jagdx.IDirect3DPixelShader) null);
              this.field_d.g(1, param0 + -2658);
              this.field_d.a((ura) null, param0 ^ -2449);
              this.field_d.g(0, param0 + -2668);
              this.field_d.a((ura) null, -121);
              this.field_k = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
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
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        hdb var3 = null;
        jagdx.IDirect3DDevice var5 = null;
        jagdx.IDirect3DDevice var6 = null;
        if (param0 == 5) {
          var3 = this.field_d.J(10);
          if (this.field_j) {
            if (var3 == null) {
              return;
            } else {
              var6 = this.field_e.field_Mc;
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
              discarded$6 = var6.a(1, -this.field_d.field_wc[0], -this.field_d.field_wc[1], -this.field_d.field_wc[2], 0.0f);
              discarded$7 = var6.a(2, this.field_d.field_Sb, this.field_d.field_u, this.field_d.field_x, 1.0f);
              discarded$8 = var6.a(3, Math.abs(this.field_d.field_wc[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_k = true;
          var3 = this.field_d.J(10);
          if (!this.field_j) {
            return;
          } else {
            L0: {
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
                discarded$9 = var5.a(1, -this.field_d.field_wc[0], -this.field_d.field_wc[1], -this.field_d.field_wc[2], 0.0f);
                discarded$10 = var5.a(2, this.field_d.field_Sb, this.field_d.field_u, this.field_d.field_x, 1.0f);
                discarded$11 = var5.a(3, Math.abs(this.field_d.field_wc[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        jagdx.IDirect3DDevice var4 = null;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        L0: {
          if (this.field_k) {
            var4 = this.field_e.field_Mc;
            var5 = 1 << (param1 & 3);
            var6 = (float)(1 << ((62 & param1) >> 587788579)) / 32.0f;
            var7 = param0 & 65535;
            var8 = (float)((231074 & param0) >> -1918989904) / 8.0f;
            discarded$8 = var4.b(14, (float)(this.field_d.field_pc * var5 % 40000) / 40000.0f, 0.0f, 0.0f, 0.0f);
            discarded$9 = var4.b(15, var6, 0.0f, 0.0f, 0.0f);
            discarded$10 = var4.a(4, (float)var7, 0.0f, 0.0f, 0.0f);
            discarded$11 = var4.a(5, var8, 0.0f, 0.0f, 0.0f);
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != 5) {
          this.a(true);
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        if (!param0) {
          return;
        } else {
          L0: {
            if (!this.field_k) {
              break L0;
            } else {
              L1: {
                var2 = this.field_e.field_Mc;
                if (0 < this.field_d.field_j) {
                  var3 = this.field_d.field_r;
                  var4 = this.field_d.field_p;
                  discarded$3 = var2.b(16, var3, 1.0f / (-var4 + var3), 0.0f, 0.0f);
                  break L1;
                } else {
                  discarded$4 = var2.b(16, 0.0f, 0.0f, 0.0f, 0.0f);
                  break L1;
                }
              }
              discarded$5 = var2.a(0, (float)(this.field_d.field_lc >> 1342980304 & 255) / 255.0f, (float)(this.field_d.field_lc >> 1774345960 & 255) / 255.0f, (float)(this.field_d.field_lc & 255) / 255.0f, 0.0f);
              break L0;
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        oj var4 = null;
        if (param0 != 15) {
          return;
        } else {
          L0: {
            if (this.field_k) {
              var2 = this.field_e.field_Mc;
              var3 = this.field_e.g((byte) 82);
              var4 = this.field_e.E(0);
              discarded$4 = var2.a(0, var4.a(field_f, (byte) 22));
              discarded$5 = var2.a(4, var3.a((byte) -4, field_f));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void a(boolean param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var2 = null;
        if (!param0) {
          L0: {
            field_f = (float[]) null;
            if (this.field_k) {
              var2 = this.field_e.field_Mc;
              discarded$4 = var2.a(8, this.field_d.a(114, field_f));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_k) {
              var2 = this.field_e.field_Mc;
              discarded$5 = var2.a(8, this.field_d.a(114, field_f));
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void d(int param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        L0: {
          if (this.field_k) {
            var2 = this.field_e.field_Mc;
            var3 = this.field_d.p(0);
            discarded$2 = var2.SetVertexShaderConstantF(12, var3.b((byte) 105, field_f), 2);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 8) {
          this.field_e = (nla) null;
          return;
        } else {
          return;
        }
    }

    hl(nla param0, asb param1, rga param2) {
        super(param0);
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        this.field_e = param0;
        this.field_i = param2;
        if (param1 == null) {
          this.field_h = null;
          this.field_j = false;
          this.field_g = null;
          return;
        } else {
          if (!this.field_d.field_vb) {
            this.field_h = null;
            this.field_j = false;
            this.field_g = null;
            return;
          } else {
            if (!this.field_d.field_uc) {
              this.field_h = null;
              this.field_j = false;
              this.field_g = null;
              return;
            } else {
              if ((this.field_e.field_Hc.VertexShaderVersion & 65535) < 257) {
                this.field_h = null;
                this.field_j = false;
                this.field_g = null;
                return;
              } else {
                L0: {
                  L1: {
                    this.field_g = this.field_e.field_Mc.b(param1.a("environment_mapped_water_v", true, "dx"));
                    this.field_h = this.field_e.field_Mc.a(param1.a("environment_mapped_water_f", true, "dx"));
                    stackOut_4_0 = this;
                    stackIn_8_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (null == this.field_g) {
                      break L1;
                    } else {
                      stackOut_5_0 = this;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (null == this.field_h) {
                        break L1;
                      } else {
                        stackOut_6_0 = this;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (!this.field_i.b((byte) 107)) {
                          break L1;
                        } else {
                          stackOut_7_0 = this;
                          stackOut_7_1 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L0;
                }
                ((hl) (this)).field_j = stackIn_9_1 != 0;
                return;
              }
            }
          }
        }
    }

    final boolean a(byte param0) {
        int var2 = -62 / ((param0 - 34) / 63);
        return this.field_j;
    }

    static {
        field_f = new float[16];
    }
}
