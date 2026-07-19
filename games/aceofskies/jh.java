/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends sk {
    private kr field_g;
    private static float[] field_h;
    private jagdx.IDirect3DVertexShader field_f;
    private em field_i;

    final void b(byte param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        L0: {
          if (null == this.field_f) {
            break L0;
          } else {
            var2 = this.field_g.field_Rc;
            var3 = this.field_g.v((byte) 56);
            discarded$2 = var2.a(0, var3.c(field_h, param0 ^ 74));
            break L0;
          }
        }
        if (param0 != -25) {
          this.field_f = (jagdx.IDirect3DVertexShader) null;
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        L0: {
          if (null != this.field_f) {
            var2 = this.field_g.field_Rc;
            var3 = this.field_g.v((byte) -80);
            discarded$2 = var2.a(0, var3.c(field_h, -72));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -117) {
          this.a(true);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var4 = null;
        float var5_float = 0.0f;
        int var5 = 0;
        L0: {
          var4 = this.field_g.field_Rc;
          if (!this.field_i.field_e) {
            var5 = 16 * (this.field_b.field_r % 4000) / 4000;
            this.field_b.a(this.field_i.field_i[var5], -9135);
            discarded$4 = var4.b(11, 0.0f, 0.0f, 0.0f, 0.0f);
            break L0;
          } else {
            var5_float = (float)(this.field_b.field_r % 4000) / 4000.0f;
            this.field_b.a(this.field_i.field_f, -9135);
            discarded$5 = var4.b(11, var5_float, 0.0f, 0.0f, 0.0f);
            break L0;
          }
        }
        if (param0 != 1786747298) {
          this.a(71);
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        float[] discarded$2 = null;
        int discarded$3 = 0;
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        if (param0 != 18580) {
          return;
        } else {
          L0: {
            if (this.field_f == null) {
              break L0;
            } else {
              var2 = this.field_g.field_Rc;
              var3 = this.field_b.J(param0 + -18494);
              discarded$2 = var3.a(false, field_h);
              field_h[7] = field_h[7] * 0.25f;
              field_h[3] = field_h[3] * 0.25f;
              field_h[1] = field_h[1] * 0.25f;
              field_h[0] = field_h[0] * 0.25f;
              field_h[2] = field_h[2] * 0.25f;
              field_h[4] = field_h[4] * 0.25f;
              field_h[6] = field_h[6] * 0.25f;
              field_h[5] = field_h[5] * 0.25f;
              discarded$3 = var2.SetVertexShaderConstantF(8, field_h, 2);
              break L0;
            }
          }
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        this.field_b.a((byte) 127, 0, dl.field_p);
        this.field_b.a((byte) 122, 1, bs.field_a);
        this.field_b.a(false, 2, true, ac.field_b, true);
        this.field_b.d(false, -113);
        this.field_g.a(this.field_f, 5243);
        this.b((byte) -25);
        this.d(18580);
        this.c(404277666);
        this.a(10);
        if (param1 <= 2) {
            this.field_g = (kr) null;
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_b.a(du.field_l, !param0 ? true : false, lo.field_j);
        if (param0) {
            this.a(true, (byte) -77);
            return;
        }
    }

    final void a(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        jagdx.IDirect3DDevice var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        if (param0 != 10) {
          return;
        } else {
          L0: {
            if (null != this.field_f) {
              L1: {
                var2 = this.field_g.field_Rc;
                if (0 >= this.field_b.field_p) {
                  discarded$2 = var2.b(10, 0.0f, 0.0f, 0.0f, 0.0f);
                  break L1;
                } else {
                  var3 = this.field_b.field_y;
                  var4 = this.field_b.field_Xb;
                  var5 = var4 - 512.0f;
                  discarded$3 = var2.b(10, var5, 1.0f / (-var5 + var4), var4, 1.0f / (-var4 + var3));
                  break L1;
                }
              }
              this.field_b.a((byte) -74, this.field_b.field_X);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    jh(kr param0, gk param1, em param2) {
        super(param0);
        L0: {
          L1: {
            this.field_g = param0;
            this.field_i = param2;
            if (param1 == null) {
              break L1;
            } else {
              if (!this.field_i.b(false)) {
                break L1;
              } else {
                if (-258 >= (65535 & this.field_g.field_Bc.VertexShaderVersion ^ -1)) {
                  this.field_f = this.field_g.field_Rc.b(param1.a("dx", (byte) -71, "transparent_water"));
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_f = null;
          break L0;
        }
    }

    final void a(boolean param0) {
        this.field_g.a((jagdx.IDirect3DVertexShader) null, 5243);
        this.field_b.a((byte) 119, 0, dl.field_p);
        this.field_b.a((byte) 123, 1, ac.field_b);
        this.field_b.a((byte) 119, 2, bs.field_a);
        this.field_b.d(param0, -121);
    }

    final void c(int param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        L0: {
          if (this.field_f != null) {
            var2 = this.field_g.field_Rc;
            discarded$2 = var2.a(4, this.field_b.a(12, field_h));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 404277666) {
          this.a(false);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, jj param2) {
        if (param1 < 66) {
            this.field_i = (em) null;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            return false;
        }
        return this.field_f != null ? true : false;
    }

    static {
        field_h = new float[16];
    }
}
