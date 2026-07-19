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
        if (param0 > -4) {
          return;
        } else {
          this.field_c.a((byte) 51, true);
          return;
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 1185) {
          L0: {
            this.a((byte) -57, 54, -28);
            if (this.field_f == null) {
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
            if (this.field_f == null) {
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

    final void b(byte param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        iva var4 = null;
        L0: {
          if (null != this.field_f) {
            var2 = this.field_e.field_jd;
            var3 = this.field_e.n((byte) 95);
            discarded$2 = var2.a(0, var3.a(false, field_d));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 107) {
          var4 = (iva) null;
          this.a(-5, (iva) null, 86);
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        L0: {
          if (null != this.field_f) {
            var2 = this.field_e.field_jd;
            discarded$2 = var2.a(4, this.field_c.a(field_d, false));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 64) {
          this.b((byte) -60);
          return;
        } else {
          return;
        }
    }

    final void c(boolean param0) {
        float[] discarded$4 = null;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        L0: {
          if (null == this.field_f) {
            break L0;
          } else {
            var2 = this.field_e.field_jd;
            var3 = this.field_c.a((byte) 113);
            discarded$4 = var3.a(field_d, -101);
            field_d[3] = field_d[3] * 0.25f;
            field_d[6] = field_d[6] * 0.25f;
            field_d[5] = field_d[5] * 0.25f;
            field_d[4] = field_d[4] * 0.25f;
            field_d[1] = field_d[1] * 0.25f;
            field_d[7] = field_d[7] * 0.25f;
            field_d[2] = field_d[2] * 0.25f;
            field_d[0] = field_d[0] * 0.25f;
            discarded$5 = var2.SetVertexShaderConstantF(8, field_d, 2);
            break L0;
          }
        }
        if (!param0) {
          this.a((byte) 6, -79, -56);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, iva param1, int param2) {
        if (param2 != 24595) {
            field_d = (float[]) null;
        }
    }

    final void b(boolean param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        L0: {
          if (null != this.field_f) {
            var2 = this.field_e.field_jd;
            var3 = this.field_e.n((byte) -86);
            discarded$2 = var2.a(0, var3.a(false, field_d));
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          this.b(true);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var5 = 0;
        float var5_float = 0.0f;
        jagdx.IDirect3DDevice var6 = null;
        jagdx.IDirect3DDevice var7 = null;
        if (param0 != 55) {
          L0: {
            field_d = (float[]) null;
            var6 = this.field_e.field_jd;
            if (!this.field_g.field_g) {
              var5 = 16 * (this.field_c.field_Dc % 4000) / 4000;
              this.field_c.a(true, this.field_g.field_d[var5]);
              discarded$4 = var6.a(11, 0.0f, 0.0f, 0.0f, 0.0f);
              break L0;
            } else {
              var5_float = (float)(this.field_c.field_Dc % 4000) / 4000.0f;
              this.field_c.a(true, this.field_g.field_c);
              discarded$5 = var6.a(11, var5_float, 0.0f, 0.0f, 0.0f);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var7 = this.field_e.field_jd;
            if (!this.field_g.field_g) {
              var5 = 16 * (this.field_c.field_Dc % 4000) / 4000;
              this.field_c.a(true, this.field_g.field_d[var5]);
              discarded$6 = var7.a(11, 0.0f, 0.0f, 0.0f, 0.0f);
              break L1;
            } else {
              var5_float = (float)(this.field_c.field_Dc % 4000) / 4000.0f;
              this.field_c.a(true, this.field_g.field_c);
              discarded$7 = var7.a(11, var5_float, 0.0f, 0.0f, 0.0f);
              break L1;
            }
          }
          return;
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
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        jagdx.IDirect3DDevice var6 = null;
        jagdx.IDirect3DDevice var7 = null;
        if (!param0) {
          L0: {
            this.a(false);
            if (this.field_f != null) {
              L1: {
                var6 = this.field_e.field_jd;
                if (0 < this.field_c.field_J) {
                  var3 = this.field_c.field_Hc;
                  var4 = this.field_c.field_B;
                  var5 = -512.0f + var4;
                  discarded$4 = var6.a(10, var5, 1.0f / (-var5 + var4), var4, 1.0f / (var3 - var4));
                  break L1;
                } else {
                  discarded$5 = var6.a(10, 0.0f, 0.0f, 0.0f, 0.0f);
                  break L1;
                }
              }
              this.field_c.g(3625, this.field_c.field_g);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (this.field_f != null) {
              L3: {
                var7 = this.field_e.field_jd;
                if (0 < this.field_c.field_J) {
                  var3 = this.field_c.field_Hc;
                  var4 = this.field_c.field_B;
                  var5 = -512.0f + var4;
                  discarded$6 = var7.a(10, var5, 1.0f / (-var5 + var4), var4, 1.0f / (var3 - var4));
                  break L3;
                } else {
                  discarded$7 = var7.a(10, 0.0f, 0.0f, 0.0f, 0.0f);
                  break L3;
                }
              }
              this.field_c.g(3625, this.field_c.field_g);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    usa(cta param0, cn param1, hk param2) {
        super(param0);
        L0: {
          L1: {
            this.field_g = param2;
            this.field_e = param0;
            if (param1 == null) {
              break L1;
            } else {
              if (!this.field_g.c(-30634)) {
                break L1;
              } else {
                if ((65535 & this.field_e.field_ld.VertexShaderVersion) >= 257) {
                  this.field_f = this.field_e.field_jd.b(param1.a("dx", (byte) 114, "transparent_water"));
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
