/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends rq {
    private sk field_k;
    private ir field_h;
    private static float[] field_f;
    private boolean field_j;
    private jagdx.IDirect3DPixelShader field_i;
    private boolean field_e;
    private jagdx.IDirect3DVertexShader field_g;

    final void a(int param0, int param1, int param2) {
        jagdx.IDirect3DDevice var4 = null;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        L0: {
          if (((tb) this).field_e) {
            var4 = ((tb) this).field_h.field_Cc;
            var5 = 1 << (3 & param2);
            var6 = (float)(1 << ((param2 & 59) >> 1951967843)) / 32.0f;
            var7 = 65535 & param1;
            int discarded$8 = var4.b(14, (float)(((tb) this).field_b.field_kc * var5 % 40000) / 40000.0f, 0.0f, 0.0f, 0.0f);
            var8 = (float)((param1 & 199087) >> -303163120) / 8.0f;
            int discarded$9 = var4.b(15, var6, 0.0f, 0.0f, 0.0f);
            int discarded$10 = var4.a(4, (float)var7, 0.0f, 0.0f, 0.0f);
            int discarded$11 = var4.a(5, var8, 0.0f, 0.0f, 0.0f);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 34023) {
          ((tb) this).field_g = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        L0: {
          if (!((tb) this).field_e) {
            break L0;
          } else {
            L1: {
              var2 = ((tb) this).field_h.field_Cc;
              if (0 < ((tb) this).field_b.field_Kb) {
                var3 = ((tb) this).field_b.field_Tb;
                var4 = ((tb) this).field_b.field_E;
                int discarded$7 = var2.b(16, var3, 1.0f / (var3 - var4), 0.0f, 0.0f);
                break L1;
              } else {
                int discarded$8 = var2.b(16, 0.0f, 0.0f, 0.0f, 0.0f);
                break L1;
              }
            }
            int discarded$9 = var2.a(0, (float)(255 & ((tb) this).field_b.field_C >> 1993507248) / 255.0f, (float)((65348 & ((tb) this).field_b.field_C) >> -382859768) / 255.0f, (float)(255 & ((tb) this).field_b.field_C) / 255.0f, 0.0f);
            break L0;
          }
        }
        if (param0 != 260) {
          ((tb) this).field_g = null;
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (param0) {
          return;
        } else {
          L0: {
            if (((tb) this).field_e) {
              var2 = ((tb) this).field_h.field_Cc;
              int discarded$2 = var2.a(8, ((tb) this).field_b.a(-82, field_f));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        ut var3 = null;
        if (param0 < 0) {
          L0: {
            ((tb) this).a(-80, 91, -81);
            if (((tb) this).field_e) {
              var2 = ((tb) this).field_h.field_Cc;
              var3 = ((tb) this).field_h.k((byte) 107);
              int discarded$4 = var2.a(0, var3.a(0, field_f));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((tb) this).field_e) {
              var2 = ((tb) this).field_h.field_Cc;
              var3 = ((tb) this).field_h.k((byte) 107);
              int discarded$5 = var2.a(0, var3.a(0, field_f));
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 > -8) {
            ((tb) this).field_h = null;
            return ((tb) this).field_j;
        }
        return ((tb) this).field_j;
    }

    final void c(boolean param0) {
        L0: {
          if (((tb) this).field_e) {
            ((tb) this).field_h.a(-54, (jagdx.IDirect3DVertexShader) null);
            ((tb) this).field_h.a((byte) 10, (jagdx.IDirect3DPixelShader) null);
            ((tb) this).field_b.g(1, -115);
            ((tb) this).field_b.a((ed) null, 97);
            ((tb) this).field_b.g(0, -119);
            ((tb) this).field_b.a((ed) null, 98);
            ((tb) this).field_e = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          field_f = null;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1) {
        ef var3 = null;
        jagdx.IDirect3DDevice var4 = null;
        var3 = ((tb) this).field_b.d((byte) 122);
        if (param1 != 20186) {
          return;
        } else {
          L0: {
            if (!((tb) this).field_j) {
              break L0;
            } else {
              if (var3 == null) {
                break L0;
              } else {
                var4 = ((tb) this).field_h.field_Cc;
                ((tb) this).field_h.a(-73, ((tb) this).field_g);
                ((tb) this).field_h.a((byte) -101, ((tb) this).field_i);
                ((tb) this).field_b.g(1, param1 + -20310);
                ((tb) this).field_b.a((ed) (Object) var3, 99);
                ((tb) this).field_b.g(0, -123);
                ((tb) this).field_b.a((ed) (Object) ((tb) this).field_k.field_e, 108);
                ((tb) this).field_e = true;
                ((tb) this).b(param1 ^ -20215);
                ((tb) this).a((byte) -65);
                ((tb) this).b(false);
                ((tb) this).a(260);
                int discarded$3 = var4.a(1, -((tb) this).field_b.field_G[0], -((tb) this).field_b.field_G[1], -((tb) this).field_b.field_G[2], 0.0f);
                int discarded$4 = var4.a(2, ((tb) this).field_b.field_J, ((tb) this).field_b.field_jb, ((tb) this).field_b.field_Xb, 1.0f);
                int discarded$5 = var4.a(3, Math.abs(((tb) this).field_b.field_G[1]) * 928.0f + 96.0f, 0.0f, 0.0f, 0.0f);
                break L0;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 != 18834) {
            ((tb) this).field_i = null;
        }
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2_ref = null;
        ut var3 = null;
        ut var4 = null;
        if (((tb) this).field_e) {
            var2_ref = ((tb) this).field_h.field_Cc;
            var3 = ((tb) this).field_h.g((byte) -28);
            var4 = ((tb) this).field_h.k((byte) 106);
            int discarded$0 = var2_ref.a(0, var4.a(0, field_f));
            int discarded$1 = var2_ref.a(4, var3.b(field_f, (byte) 86));
        }
        int var2 = 49 / ((param0 - 41) / 46);
    }

    final void a(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        ut var3 = null;
        if (param0 >= -47) {
          return;
        } else {
          L0: {
            if (((tb) this).field_e) {
              var2 = ((tb) this).field_h.field_Cc;
              var3 = ((tb) this).field_b.H(26453);
              int discarded$2 = var2.SetVertexShaderConstantF(12, var3.a(field_f, (byte) -37), 2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 >= -71) {
            Object var4 = null;
            ((tb) this).a(50, 2, (ed) null);
        }
    }

    tb(ir param0, ki param1, sk param2) {
        super((aw) (Object) param0);
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ((tb) this).field_k = param2;
        ((tb) this).field_h = param0;
        if (param1 == null) {
          ((tb) this).field_g = null;
          ((tb) this).field_i = null;
          ((tb) this).field_j = false;
        } else {
          if (!((tb) this).field_b.field_W) {
            ((tb) this).field_g = null;
            ((tb) this).field_i = null;
            ((tb) this).field_j = false;
          } else {
            if (!((tb) this).field_b.field_Eb) {
              ((tb) this).field_g = null;
              ((tb) this).field_i = null;
              ((tb) this).field_j = false;
            } else {
              if ((((tb) this).field_h.field_Kc.VertexShaderVersion & 65535 ^ -1) <= -258) {
                L0: {
                  L1: {
                    ((tb) this).field_g = ((tb) this).field_h.field_Cc.a(param1.a("environment_mapped_water_v", "dx", -1));
                    ((tb) this).field_i = ((tb) this).field_h.field_Cc.b(param1.a("environment_mapped_water_f", "dx", -1));
                    stackOut_9_0 = this;
                    stackIn_13_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (null == ((tb) this).field_g) {
                      break L1;
                    } else {
                      stackOut_10_0 = this;
                      stackIn_13_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (null == ((tb) this).field_i) {
                        break L1;
                      } else {
                        stackOut_11_0 = this;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (!((tb) this).field_k.a(-123)) {
                          break L1;
                        } else {
                          stackOut_12_0 = this;
                          stackOut_12_1 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = this;
                  stackOut_13_1 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  break L0;
                }
                ((tb) this).field_j = stackIn_14_1 != 0;
              } else {
                ((tb) this).field_g = null;
                ((tb) this).field_i = null;
                ((tb) this).field_j = false;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new float[16];
    }
}
