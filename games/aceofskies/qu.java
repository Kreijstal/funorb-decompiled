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
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        jj var4 = null;
        L0: {
          if (!this.field_j) {
            break L0;
          } else {
            var2 = this.field_f.field_Rc;
            var3 = this.field_b.J(-108);
            discarded$2 = var2.SetVertexShaderConstantF(12, var3.a(false, field_k), 2);
            break L0;
          }
        }
        if (param0 != 18580) {
          var4 = (jj) null;
          this.a(111, 53, (jj) null);
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        L0: {
          if (this.field_j) {
            this.field_f.a((jagdx.IDirect3DVertexShader) null, 5243);
            this.field_f.a(68, (jagdx.IDirect3DPixelShader) null);
            this.field_b.a(1, (byte) 107);
            this.field_b.a((jj) null, -9135);
            this.field_b.a(0, (byte) 83);
            this.field_b.a((jj) null, -9135);
            this.field_j = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          field_k = (float[]) null;
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        if (param0 != -25) {
          return;
        } else {
          L0: {
            if (this.field_j) {
              var2 = this.field_f.field_Rc;
              var3 = this.field_f.v((byte) -49);
              discarded$2 = var2.a(0, var3.c(field_k, 77));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    qu(kr param0, gk param1, em param2) {
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
        this.field_g = param2;
        this.field_f = param0;
        if (param1 == null) {
          this.field_l = false;
          this.field_i = null;
          this.field_h = null;
          return;
        } else {
          if (!this.field_b.field_Pb) {
            this.field_l = false;
            this.field_i = null;
            this.field_h = null;
            return;
          } else {
            if (!this.field_b.field_J) {
              this.field_l = false;
              this.field_i = null;
              this.field_h = null;
              return;
            } else {
              if (-258 < (65535 & this.field_f.field_Bc.VertexShaderVersion ^ -1)) {
                this.field_l = false;
                this.field_i = null;
                this.field_h = null;
                return;
              } else {
                L0: {
                  L1: {
                    this.field_i = this.field_f.field_Rc.b(param1.a("dx", (byte) -71, "environment_mapped_water_v"));
                    this.field_h = this.field_f.field_Rc.a(param1.a("dx", (byte) -71, "environment_mapped_water_f"));
                    stackOut_4_0 = this;
                    stackIn_8_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (null == this.field_i) {
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
                        if (!this.field_g.a(0)) {
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
                ((qu) (this)).field_l = stackIn_9_1 != 0;
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        jagdx.IDirect3DDevice var4 = null;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        if (param0 != 1786747298) {
          return;
        } else {
          L0: {
            if (!this.field_j) {
              break L0;
            } else {
              var4 = this.field_f.field_Rc;
              var5 = 1 << (3 & param1);
              var6 = (float)(1 << ((param1 & 56) >> -550713501)) / 32.0f;
              var7 = 65535 & param2;
              discarded$4 = var4.b(14, (float)(this.field_b.field_r * var5 % 40000) / 40000.0f, 0.0f, 0.0f, 0.0f);
              var8 = (float)((param2 & 257550) >> 1118780144) / 8.0f;
              discarded$5 = var4.b(15, var6, 0.0f, 0.0f, 0.0f);
              discarded$6 = var4.a(4, (float)var7, 0.0f, 0.0f, 0.0f);
              discarded$7 = var4.a(5, var8, 0.0f, 0.0f, 0.0f);
              break L0;
            }
          }
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        go var3 = null;
        jagdx.IDirect3DDevice var4 = null;
        L0: {
          var3 = this.field_b.O(29190);
          if (!this.field_l) {
            break L0;
          } else {
            if (var3 == null) {
              break L0;
            } else {
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
              discarded$3 = var4.a(1, -this.field_b.field_Jb[0], -this.field_b.field_Jb[1], -this.field_b.field_Jb[2], 0.0f);
              discarded$4 = var4.a(2, this.field_b.field_g, this.field_b.field_rb, this.field_b.field_Hb, 1.0f);
              discarded$5 = var4.a(3, Math.abs(this.field_b.field_Jb[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
              break L0;
            }
          }
        }
        if (param1 < 2) {
          this.a(false, (byte) -39);
          return;
        } else {
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            this.field_g = (em) null;
            return this.field_l;
        }
        return this.field_l;
    }

    final void b(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        ec var4 = null;
        L0: {
          if (!this.field_j) {
            break L0;
          } else {
            var2 = this.field_f.field_Rc;
            var3 = this.field_f.t(-11198);
            var4 = this.field_f.v((byte) -69);
            discarded$4 = var2.a(0, var4.c(field_k, 107));
            discarded$5 = var2.a(4, var3.a(field_k, 35));
            break L0;
          }
        }
        if (param0 >= -117) {
          this.field_g = (em) null;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            this.field_l = false;
        }
    }

    final void a(int param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        float var3 = 0.0f;
        float var4 = 0.0f;
        jj var5 = null;
        jagdx.IDirect3DDevice var6 = null;
        jagdx.IDirect3DDevice var7 = null;
        if (param0 != 10) {
          L0: {
            var5 = (jj) null;
            this.a(-38, 45, (jj) null);
            if (!this.field_j) {
              break L0;
            } else {
              L1: {
                var6 = this.field_f.field_Rc;
                if ((this.field_b.field_p ^ -1) >= -1) {
                  discarded$6 = var6.b(16, 0.0f, 0.0f, 0.0f, 0.0f);
                  break L1;
                } else {
                  var3 = this.field_b.field_y;
                  var4 = this.field_b.field_Xb;
                  discarded$7 = var6.b(16, var3, 1.0f / (-var4 + var3), 0.0f, 0.0f);
                  break L1;
                }
              }
              discarded$8 = var6.a(0, (float)((16741111 & this.field_b.field_X) >> -541960272) / 255.0f, (float)(this.field_b.field_X >> -770598744 & 255) / 255.0f, (float)(this.field_b.field_X & 255) / 255.0f, 0.0f);
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (!this.field_j) {
              break L2;
            } else {
              L3: {
                var7 = this.field_f.field_Rc;
                if ((this.field_b.field_p ^ -1) >= -1) {
                  discarded$9 = var7.b(16, 0.0f, 0.0f, 0.0f, 0.0f);
                  break L3;
                } else {
                  var3 = this.field_b.field_y;
                  var4 = this.field_b.field_Xb;
                  discarded$10 = var7.b(16, var3, 1.0f / (-var4 + var3), 0.0f, 0.0f);
                  break L3;
                }
              }
              discarded$11 = var7.a(0, (float)((16741111 & this.field_b.field_X) >> -541960272) / 255.0f, (float)(this.field_b.field_X >> -770598744 & 255) / 255.0f, (float)(this.field_b.field_X & 255) / 255.0f, 0.0f);
              break L2;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, jj param2) {
        if (param1 < 66) {
            this.a(true, false);
        }
    }

    final void c(int param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        L0: {
          if (this.field_j) {
            var2 = this.field_f.field_Rc;
            discarded$2 = var2.a(8, this.field_b.a(12, field_k));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 404277666) {
          this.b(98);
          return;
        } else {
          return;
        }
    }

    static {
        field_k = new float[16];
    }
}
