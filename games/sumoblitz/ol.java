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
        int discarded$4 = 0;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var2 = null;
        if (param0) {
          L0: {
            this.field_o = false;
            if (null != this.field_j) {
              var2 = this.field_l.field_Cc;
              discarded$4 = var2.a(4, this.field_b.a(-52, field_h));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != this.field_j) {
              var2 = this.field_l.field_Cc;
              discarded$5 = var2.a(4, this.field_b.a(-52, field_h));
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(boolean param0, int param1) {
        this.field_o = param0 ? true : false;
        this.field_b.g(1, param1 + -20312);
        this.field_b.a(this.field_i, param1 + -20076);
        this.field_b.a((byte) -83, lf.field_e, ua.field_n);
        this.field_b.a(mm.field_h, 0, param1 ^ param1);
        this.field_b.a((byte) 89, 2, true, false, jq.field_a);
        this.field_b.a(ta.field_a, 0, true);
        this.field_b.g(0, param1 + -20311);
        this.d(-86);
    }

    final void c(boolean param0) {
        this.field_b.g(1, -121);
        this.field_b.a((ed) null, 100);
        this.field_b.a((byte) -83, vi.field_v, vi.field_v);
        this.field_b.a(jq.field_a, 0, 0);
        if (!param0) {
          this.field_b.a(mm.field_h, 2, 0);
          this.field_b.a(jq.field_a, 0, true);
          this.field_b.g(0, -109);
          if (!this.field_e) {
            if (null != this.field_j) {
              this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
              this.field_j = null;
              return;
            } else {
              return;
            }
          } else {
            this.field_b.a(jq.field_a, 0, 0);
            this.field_b.a(jq.field_a, 0, true);
            this.field_e = false;
            if (null != this.field_j) {
              this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
              this.field_j = null;
              return;
            } else {
              return;
            }
          }
        } else {
          this.a(-69, 14, -105);
          this.field_b.a(mm.field_h, 2, 0);
          this.field_b.a(jq.field_a, 0, true);
          this.field_b.g(0, -109);
          if (this.field_e) {
            this.field_b.a(jq.field_a, 0, 0);
            this.field_b.a(jq.field_a, 0, true);
            this.field_e = false;
            if (null == this.field_j) {
              return;
            } else {
              this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
              this.field_j = null;
              return;
            }
          } else {
            if (null != this.field_j) {
              this.field_l.a(-122, (jagdx.IDirect3DVertexShader) null);
              this.field_j = null;
              return;
            } else {
              return;
            }
          }
        }
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
        int discarded$0 = 0;
        if (null != this.field_j) {
            var2_ref_jagdx_IDirect3DDevice = this.field_l.field_Cc;
            var3 = this.field_l.k((byte) 67);
            discarded$0 = var2_ref_jagdx_IDirect3DDevice.a(0, var3.a(0, field_h));
        }
        int var2 = -118 % ((41 - param0) / 46);
    }

    final void c(byte param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var2 = null;
        ut var3 = null;
        if (param0 <= 0) {
          L0: {
            this.field_i = (ru) null;
            if (this.field_j == null) {
              break L0;
            } else {
              var2 = this.field_l.field_Cc;
              var3 = this.field_l.k((byte) 122);
              discarded$4 = var2.a(0, var3.a(0, field_h));
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_j == null) {
              break L1;
            } else {
              var2 = this.field_l.field_Cc;
              var3 = this.field_l.k((byte) 122);
              discarded$5 = var2.a(0, var3.a(0, field_h));
              break L1;
            }
          }
          return;
        }
    }

    private final void d(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        jagdx.IDirect3DVertexShader var2 = null;
        jagdx.IDirect3DDevice var3 = null;
        int var4 = 0;
        int var5 = 0;
        ut var6 = null;
        jagdx.IDirect3DVertexShader stackIn_4_0 = null;
        jagdx.IDirect3DVertexShader stackIn_8_0 = null;
        jagdx.IDirect3DVertexShader stackOut_7_0 = null;
        jagdx.IDirect3DVertexShader stackOut_6_0 = null;
        jagdx.IDirect3DVertexShader stackOut_3_0 = null;
        jagdx.IDirect3DVertexShader stackOut_2_0 = null;
        L0: {
          var5 = -19 % ((-23 - param0) / 63);
          var3 = this.field_l.field_Cc;
          var4 = this.field_b.M(-66);
          var6 = this.field_b.g((byte) -28);
          if (!this.field_o) {
            L1: {
              if (var4 == 2147483647) {
                stackOut_7_0 = this.field_f;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                stackOut_6_0 = this.field_p;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
            }
            var2 = stackIn_8_0;
            break L0;
          } else {
            L2: {
              if (-2147483648 == (var4 ^ -1)) {
                stackOut_3_0 = this.field_n;
                stackIn_4_0 = stackOut_3_0;
                break L2;
              } else {
                stackOut_2_0 = this.field_m;
                stackIn_4_0 = stackOut_2_0;
                break L2;
              }
            }
            var2 = stackIn_4_0;
            break L0;
          }
        }
        if (this.field_j != var2) {
          this.field_j = var2;
          this.field_l.a(-116, var2);
          this.e(82);
          this.b(false);
          this.a((byte) -72);
          this.c((byte) 53);
          this.b(121);
          this.a(260);
          var6.a(0.0f, field_k, (byte) -86, 0.0f, -1.0f, (float)var4);
          discarded$2 = var3.a(12, field_k);
          return;
        } else {
          var6.a(0.0f, field_k, (byte) -86, 0.0f, -1.0f, (float)var4);
          discarded$3 = var3.a(12, field_k);
          return;
        }
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 == 18834) {
          if (param2 == null) {
            if (this.field_e) {
              return;
            } else {
              this.field_b.a(this.field_b.field_D, param1 ^ 18939);
              this.field_b.h(param1 + -18771, 1);
              this.field_b.a(ta.field_a, 0, param1 ^ 18834);
              this.field_b.a(ta.field_a, 0, true);
              this.field_e = true;
              return;
            }
          } else {
            L0: {
              if (this.field_e) {
                this.field_b.a(jq.field_a, 0, 0);
                this.field_b.a(jq.field_a, 0, true);
                this.field_e = false;
                break L0;
              } else {
                break L0;
              }
            }
            this.field_b.a(param2, param1 ^ 18892);
            this.field_b.h(param1 + -18757, param0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        if (param0 != 260) {
          L0: {
            this.field_o = true;
            if (null == this.field_j) {
              break L0;
            } else {
              var2 = this.field_l.field_Cc;
              var3 = this.field_b.XA();
              var4 = this.field_b.i();
              var5 = -((float)(-var4 + var3) * 0.125f) + (float)var3;
              var6 = (float)var3 - 0.25f * (float)(-var4 + var3);
              discarded$4 = var2.b(10, var6, 1.0f / (-var6 + var5), var5, 1.0f / ((float)var3 - var5));
              discarded$5 = var2.b(11, 1.0f / (float)this.field_b.S(-102), (float)this.field_b.e((byte) 26) / 255.0f, this.field_b.field_Tb, 1.0f / (this.field_b.field_Tb - this.field_b.field_E));
              this.field_b.a(false, this.field_b.v(15));
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null == this.field_j) {
              break L1;
            } else {
              var2 = this.field_l.field_Cc;
              var3 = this.field_b.XA();
              var4 = this.field_b.i();
              var5 = -((float)(-var4 + var3) * 0.125f) + (float)var3;
              var6 = (float)var3 - 0.25f * (float)(-var4 + var3);
              discarded$6 = var2.b(10, var6, 1.0f / (-var6 + var5), var5, 1.0f / ((float)var3 - var5));
              discarded$7 = var2.b(11, 1.0f / (float)this.field_b.S(-102), (float)this.field_b.e((byte) 26) / 255.0f, this.field_b.field_Tb, 1.0f / (this.field_b.field_Tb - this.field_b.field_E));
              this.field_b.a(false, this.field_b.v(15));
              break L1;
            }
          }
          return;
        }
    }

    private final void e(int param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        ut var2 = null;
        jagdx.IDirect3DDevice var3 = null;
        ut var4 = null;
        L0: {
          if (this.field_j == null) {
            break L0;
          } else {
            if (this.field_o) {
              var4 = this.field_b.c(true);
              var2 = var4;
              var3 = this.field_l.field_Cc;
              discarded$5 = var3.b(13, this.field_b.field_T * this.field_b.field_J, this.field_b.field_T * this.field_b.field_jb, this.field_b.field_Xb * this.field_b.field_T, 1.0f);
              discarded$6 = var3.b(14, this.field_b.field_J * this.field_b.field_S, this.field_b.field_jb * this.field_b.field_S, this.field_b.field_Xb * this.field_b.field_S, 1.0f);
              discarded$7 = var3.b(16, this.field_b.field_hb * this.field_b.field_J, this.field_b.field_jb * this.field_b.field_hb, this.field_b.field_hb * this.field_b.field_Xb, 1.0f);
              var4.a(-1416, this.field_b.field_G[1], this.field_b.field_G[0], field_k, this.field_b.field_G[2]);
              discarded$8 = var3.SetVertexShaderConstantF(15, field_k, 1);
              var4.a(-1416, this.field_b.field_U[1], this.field_b.field_U[0], field_k, this.field_b.field_U[2]);
              discarded$9 = var3.SetVertexShaderConstantF(17, field_k, 1);
              break L0;
            } else {
              if (param0 >= 3) {
                return;
              } else {
                this.a(false, -14);
                return;
              }
            }
          }
        }
        if (param0 < 3) {
          this.a(false, -14);
          return;
        } else {
          return;
        }
    }

    ol(ir param0, ki param1) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        L0: {
          this.field_e = false;
          this.field_l = param0;
          if (param1 == null) {
            break L0;
          } else {
            if (-258 >= (65535 & this.field_l.field_Kc.VertexShaderVersion ^ -1)) {
              L1: {
                this.field_f = this.field_l.field_Cc.a(param1.a("uw_ground_unlit", "dx", -1));
                this.field_n = this.field_l.field_Cc.a(param1.a("uw_ground_lit", "dx", -1));
                this.field_p = this.field_l.field_Cc.a(param1.a("uw_model_unlit", "dx", -1));
                this.field_m = this.field_l.field_Cc.a(param1.a("uw_model_lit", "dx", -1));
                if (this.field_n == null) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                stackOut_6_0 = stackIn_6_0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (this.field_f == null) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                stackOut_9_0 = stackIn_9_0 & stackIn_9_1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (null == this.field_p) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L3;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = stackIn_12_0 & stackIn_12_1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (null == this.field_m) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L4;
                } else {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L4;
                }
              }
              if ((stackIn_15_0 & stackIn_15_1) != 0) {
                this.field_i = this.field_b.a(new int[]{0, -1}, 1, false, -110, 2);
                this.field_i.a(false, false, true);
                this.field_g = true;
                return;
              } else {
                this.field_g = false;
                return;
              }
            } else {
              break L0;
            }
          }
        }
        this.field_g = false;
    }

    final void a(boolean param0, byte param1) {
        if (param1 >= -71) {
            this.a(true, (byte) -17);
        }
    }

    final void a(byte param0) {
        int discarded$4 = 0;
        boolean discarded$5 = false;
        jagdx.IDirect3DDevice var2 = null;
        ut var3 = null;
        L0: {
          if (null == this.field_j) {
            break L0;
          } else {
            var2 = this.field_l.field_Cc;
            var3 = this.field_b.H(26453);
            discarded$4 = var2.SetVertexShaderConstantF(8, var3.a(field_h, (byte) -37), 2);
            break L0;
          }
        }
        if (param0 > -47) {
          discarded$5 = this.b((byte) 16);
          return;
        } else {
          return;
        }
    }

    static {
        field_h = new float[16];
        field_k = new float[4];
    }
}
