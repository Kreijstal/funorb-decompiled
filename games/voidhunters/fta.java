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
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        L0: {
          this.field_f = false;
          this.field_m = param0;
          if (param1 == null) {
            break L0;
          } else {
            if (257 <= (this.field_m.field_Hc.VertexShaderVersion & 65535)) {
              L1: {
                this.field_e = this.field_m.field_Mc.b(param1.a("uw_ground_unlit", true, "dx"));
                this.field_l = this.field_m.field_Mc.b(param1.a("uw_ground_lit", true, "dx"));
                this.field_i = this.field_m.field_Mc.b(param1.a("uw_model_unlit", true, "dx"));
                this.field_g = this.field_m.field_Mc.b(param1.a("uw_model_lit", true, "dx"));
                if (null == this.field_g) {
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
                if (null == this.field_e) {
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
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (null == this.field_l) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = stackIn_12_1 & stackIn_12_2;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (null == this.field_i) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L4;
                } else {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L4;
                }
              }
              if ((stackIn_15_0 & (stackIn_15_1 & stackIn_15_2)) != 0) {
                this.field_o = this.field_d.a(2, false, 1, (byte) -48, new int[]{0, -1});
                this.field_o.a(false, (byte) -98, false);
                this.field_n = true;
                return;
              } else {
                this.field_n = false;
                return;
              }
            } else {
              break L0;
            }
          }
        }
        this.field_n = false;
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            this.field_f = false;
        }
    }

    final void c(byte param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        if (param0 != 15) {
          L0: {
            this.field_l = (jagdx.IDirect3DVertexShader) null;
            if (null != this.field_h) {
              var2 = this.field_m.field_Mc;
              var3 = this.field_m.E(param0 + -15);
              discarded$2 = var2.a(0, var3.a(field_p, (byte) 22));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != this.field_h) {
              var2 = this.field_m.field_Mc;
              var3 = this.field_m.E(param0 + -15);
              discarded$3 = var2.a(0, var3.a(field_p, (byte) 22));
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(byte param0, int param1, ura param2) {
        if (param0 > 42) {
          if (param2 != null) {
            if (!this.field_f) {
              this.field_d.a(param2, -106);
              this.field_d.h(75, param1);
              return;
            } else {
              this.field_d.a(0, qcb.field_q, 7);
              this.field_d.a(0, (byte) -60, qcb.field_q);
              this.field_f = false;
              this.field_d.a(param2, -106);
              this.field_d.h(75, param1);
              return;
            }
          } else {
            if (this.field_f) {
              return;
            } else {
              this.field_d.a(this.field_d.field_Q, -123);
              this.field_d.h(116, 1);
              this.field_d.a(0, pja.field_l, 7);
              this.field_d.a(0, (byte) -91, pja.field_l);
              this.field_f = true;
              return;
            }
          }
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        int discarded$1 = 0;
        jagdx.IDirect3DVertexShader var2 = null;
        jagdx.IDirect3DDevice var3 = null;
        int var4 = 0;
        oj var5 = null;
        jagdx.IDirect3DVertexShader stackIn_5_0 = null;
        jagdx.IDirect3DVertexShader stackIn_9_0 = null;
        jagdx.IDirect3DVertexShader stackOut_8_0 = null;
        jagdx.IDirect3DVertexShader stackOut_7_0 = null;
        jagdx.IDirect3DVertexShader stackOut_4_0 = null;
        jagdx.IDirect3DVertexShader stackOut_3_0 = null;
        if (param0 != -46) {
          return;
        } else {
          L0: {
            var3 = this.field_m.field_Mc;
            var4 = this.field_d.u((byte) 95);
            var5 = this.field_d.g((byte) 20);
            if (this.field_j) {
              L1: {
                if (-2147483648 == (var4 ^ -1)) {
                  stackOut_8_0 = this.field_l;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_7_0 = this.field_g;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
              var2 = stackIn_9_0;
              break L0;
            } else {
              L2: {
                if (2147483647 != var4) {
                  stackOut_4_0 = this.field_i;
                  stackIn_5_0 = stackOut_4_0;
                  break L2;
                } else {
                  stackOut_3_0 = this.field_e;
                  stackIn_5_0 = stackOut_3_0;
                  break L2;
                }
              }
              var2 = stackIn_5_0;
              break L0;
            }
          }
          L3: {
            if (var2 != this.field_h) {
              this.field_h = var2;
              this.field_m.a(0, var2);
              this.e(127);
              this.a(true);
              this.d(8);
              this.c(5);
              this.c((byte) 15);
              this.b(true);
              break L3;
            } else {
              break L3;
            }
          }
          var5.a(field_k, -1.0f, (byte) 67, (float)var4, 0.0f, 0.0f);
          discarded$1 = var3.a(12, field_k);
          return;
        }
    }

    final void a(int param0) {
        this.field_d.g(1, -95);
        this.field_d.a((ura) null, param0 + -2669);
        if (param0 == 2543) {
          this.field_d.a(asa.field_a, true, asa.field_a);
          this.field_d.a(0, qcb.field_q, param0 + -2536);
          this.field_d.a(2, pea.field_d, 7);
          this.field_d.a(0, (byte) -106, qcb.field_q);
          this.field_d.g(0, -71);
          if (this.field_f) {
            L0: {
              this.field_d.a(0, qcb.field_q, 7);
              this.field_d.a(0, (byte) -65, qcb.field_q);
              this.field_f = false;
              if (null != this.field_h) {
                this.field_m.a(0, (jagdx.IDirect3DVertexShader) null);
                this.field_h = null;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (null != this.field_h) {
                this.field_m.a(0, (jagdx.IDirect3DVertexShader) null);
                this.field_h = null;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        L0: {
          if (null != this.field_h) {
            var2 = this.field_m.field_Mc;
            discarded$2 = var2.a(4, this.field_d.a(123, field_p));
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          this.field_i = (jagdx.IDirect3DVertexShader) null;
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        L0: {
          if (this.field_h != null) {
            var2 = this.field_m.field_Mc;
            var3 = this.field_d.p(0);
            discarded$2 = var2.SetVertexShaderConstantF(8, var3.b((byte) 105, field_p), 2);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 8) {
          this.d((byte) 92);
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = -95 / ((param0 - 34) / 63);
        return this.field_n;
    }

    private final void e(int param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        oj var2 = null;
        jagdx.IDirect3DDevice var3 = null;
        oj var4 = null;
        L0: {
          if (null == this.field_h) {
            break L0;
          } else {
            if (this.field_j) {
              var4 = this.field_d.z((byte) 90);
              var2 = var4;
              var3 = this.field_m.field_Mc;
              discarded$5 = var3.b(13, this.field_d.field_Rb * this.field_d.field_Sb, this.field_d.field_Rb * this.field_d.field_u, this.field_d.field_Rb * this.field_d.field_x, 1.0f);
              discarded$6 = var3.b(14, this.field_d.field_oc * this.field_d.field_Sb, this.field_d.field_oc * this.field_d.field_u, this.field_d.field_oc * this.field_d.field_x, 1.0f);
              discarded$7 = var3.b(16, this.field_d.field_Sb * this.field_d.field_tc, this.field_d.field_u * this.field_d.field_tc, this.field_d.field_x * this.field_d.field_tc, 1.0f);
              var4.a(this.field_d.field_wc[1], field_k, this.field_d.field_wc[2], this.field_d.field_wc[0], false);
              discarded$8 = var3.SetVertexShaderConstantF(15, field_k, 1);
              var4.a(this.field_d.field_cb[1], field_k, this.field_d.field_cb[2], this.field_d.field_cb[0], false);
              discarded$9 = var3.SetVertexShaderConstantF(17, field_k, 1);
              break L0;
            } else {
              if (param0 > 111) {
                return;
              } else {
                this.a(3, -77, 116);
                return;
              }
            }
          }
        }
        if (param0 <= 111) {
          this.a(3, -77, 116);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((fta) (this)).field_j = stackIn_3_1 != 0;
        this.field_d.g(1, -109);
        this.field_d.a(this.field_o, -110);
        if (param0 != 5) {
          this.field_l = (jagdx.IDirect3DVertexShader) null;
          this.field_d.a(et.field_c, true, df.field_o);
          this.field_d.a(0, pea.field_d, 7);
          this.field_d.a(true, -21115, false, qcb.field_q, 2);
          this.field_d.a(0, (byte) -108, pja.field_l);
          this.field_d.g(0, -72);
          this.d((byte) -46);
          return;
        } else {
          this.field_d.a(et.field_c, true, df.field_o);
          this.field_d.a(0, pea.field_d, 7);
          this.field_d.a(true, -21115, false, qcb.field_q, 2);
          this.field_d.a(0, (byte) -108, pja.field_l);
          this.field_d.g(0, -72);
          this.d((byte) -46);
          return;
        }
    }

    final void c(int param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        L0: {
          if (null != this.field_h) {
            var2 = this.field_m.field_Mc;
            var3 = this.field_m.E(0);
            discarded$2 = var2.a(0, var3.a(field_p, (byte) 22));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 5) {
          this.field_h = (jagdx.IDirect3DVertexShader) null;
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        L0: {
          if (this.field_h == null) {
            break L0;
          } else {
            var2 = this.field_m.field_Mc;
            var3 = this.field_d.XA();
            var4 = this.field_d.i();
            var5 = (float)var3 - 0.125f * (float)(-var4 + var3);
            var6 = -((float)(var3 + -var4) * 0.25f) + (float)var3;
            discarded$4 = var2.b(10, var6, 1.0f / (var5 - var6), var5, 1.0f / (-var5 + (float)var3));
            discarded$5 = var2.b(11, 1.0f / (float)this.field_d.D(117), (float)this.field_d.a(false) / 255.0f, this.field_d.field_r, 1.0f / (this.field_d.field_r - this.field_d.field_p));
            this.field_d.e(-125, this.field_d.D((byte) -126));
            break L0;
          }
        }
        if (!param0) {
          this.b(false);
          return;
        } else {
          return;
        }
    }

    static {
        field_p = new float[16];
        field_k = new float[4];
    }
}
