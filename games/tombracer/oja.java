/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oja extends vw {
    private hk field_f;
    private jagdx.IDirect3DPixelShader field_g;
    private static float[] field_h;
    private boolean field_d;
    private cta field_i;
    private boolean field_j;
    private jagdx.IDirect3DVertexShader field_e;

    final void a(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        if (!param0) {
          return;
        } else {
          L0: {
            if (((oja) this).field_j) {
              L1: {
                var2 = ((oja) this).field_i.field_jd;
                if (0 >= ((oja) this).field_c.field_J) {
                  int discarded$3 = var2.a(16, 0.0f, 0.0f, 0.0f, 0.0f);
                  break L1;
                } else {
                  var3 = ((oja) this).field_c.field_Hc;
                  var4 = ((oja) this).field_c.field_B;
                  int discarded$4 = var2.a(16, var3, 1.0f / (var3 - var4), 0.0f, 0.0f);
                  break L1;
                }
              }
              int discarded$5 = var2.b(0, (float)(((oja) this).field_c.field_g >> 16 & 255) / 255.0f, (float)(((oja) this).field_c.field_g >> 8 & 255) / 255.0f, (float)(255 & ((oja) this).field_c.field_g) / 255.0f, 0.0f);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void a(int param0, iva param1, int param2) {
        if (param2 != 24595) {
            ((oja) this).field_e = null;
        }
    }

    oja(cta param0, cn param1, hk param2) {
        super((eo) (Object) param0);
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
        ((oja) this).field_f = param2;
        ((oja) this).field_i = param0;
        if (param1 == null) {
          ((oja) this).field_e = null;
          ((oja) this).field_d = false;
          ((oja) this).field_g = null;
          return;
        } else {
          if (!((oja) this).field_c.field_Ob) {
            ((oja) this).field_e = null;
            ((oja) this).field_d = false;
            ((oja) this).field_g = null;
            return;
          } else {
            if (!((oja) this).field_c.field_x) {
              ((oja) this).field_e = null;
              ((oja) this).field_d = false;
              ((oja) this).field_g = null;
              return;
            } else {
              if (257 > (((oja) this).field_i.field_ld.VertexShaderVersion & 65535)) {
                ((oja) this).field_e = null;
                ((oja) this).field_d = false;
                ((oja) this).field_g = null;
                return;
              } else {
                L0: {
                  L1: {
                    ((oja) this).field_e = ((oja) this).field_i.field_jd.b(param1.a("dx", (byte) 114, "environment_mapped_water_v"));
                    ((oja) this).field_g = ((oja) this).field_i.field_jd.a(param1.a("dx", (byte) 124, "environment_mapped_water_f"));
                    stackOut_4_0 = this;
                    stackIn_8_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (null == ((oja) this).field_e) {
                      break L1;
                    } else {
                      stackOut_5_0 = this;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (null == ((oja) this).field_g) {
                        break L1;
                      } else {
                        stackOut_6_0 = this;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (!((oja) this).field_f.b(91)) {
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
                ((oja) this).field_d = stackIn_9_1 != 0;
                return;
              }
            }
          }
        }
    }

    final void a(int param0) {
        if (!((oja) this).field_j) {
          if (param0 >= -4) {
            ((oja) this).field_j = false;
            return;
          } else {
            return;
          }
        } else {
          ((oja) this).field_i.a((jagdx.IDirect3DVertexShader) null, -1);
          ((oja) this).field_i.a(-92, (jagdx.IDirect3DPixelShader) null);
          ((oja) this).field_c.e(1, false);
          ((oja) this).field_c.a(true, (iva) null);
          ((oja) this).field_c.e(0, false);
          ((oja) this).field_c.a(true, (iva) null);
          ((oja) this).field_j = false;
          if (param0 < -4) {
            return;
          } else {
            ((oja) this).field_j = false;
            return;
          }
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            ((oja) this).b(-28);
        }
    }

    final void a(int param0, boolean param1) {
        na var3 = null;
        int var4 = 0;
        jagdx.IDirect3DDevice var5 = null;
        var4 = 11 % ((param0 - 41) / 62);
        var3 = ((oja) this).field_c.n(33);
        if (((oja) this).field_d) {
          if (var3 == null) {
            return;
          } else {
            var5 = ((oja) this).field_i.field_jd;
            ((oja) this).field_i.a(((oja) this).field_e, -1);
            ((oja) this).field_i.a(-108, ((oja) this).field_g);
            ((oja) this).field_c.e(1, false);
            ((oja) this).field_c.a(true, (iva) (Object) var3);
            ((oja) this).field_c.e(0, false);
            ((oja) this).field_c.a(true, (iva) (Object) ((oja) this).field_f.field_f);
            ((oja) this).field_j = true;
            ((oja) this).b(true);
            ((oja) this).c(true);
            ((oja) this).b(118);
            ((oja) this).a(true);
            int discarded$3 = var5.b(1, -((oja) this).field_c.field_Gb[0], -((oja) this).field_c.field_Gb[1], -((oja) this).field_c.field_Gb[2], 0.0f);
            int discarded$4 = var5.b(2, ((oja) this).field_c.field_sc, ((oja) this).field_c.field_yb, ((oja) this).field_c.field_Kb, 1.0f);
            int discarded$5 = var5.b(3, 96.0f + 928.0f * Math.abs(((oja) this).field_c.field_Gb[1]), 0.0f, 0.0f, 0.0f);
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        jagdx.IDirect3DDevice var4 = null;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        L0: {
          if (!((oja) this).field_j) {
            break L0;
          } else {
            var4 = ((oja) this).field_i.field_jd;
            var5 = 1 << (3 & param1);
            var6 = (float)(1 << (7 & param1 >> 3)) / 32.0f;
            var7 = param2 & 65535;
            int discarded$8 = var4.a(14, (float)(var5 * ((oja) this).field_c.field_Dc % 40000) / 40000.0f, 0.0f, 0.0f, 0.0f);
            var8 = (float)((param2 & 227931) >> 16) / 8.0f;
            int discarded$9 = var4.a(15, var6, 0.0f, 0.0f, 0.0f);
            int discarded$10 = var4.b(4, (float)var7, 0.0f, 0.0f, 0.0f);
            int discarded$11 = var4.b(5, var8, 0.0f, 0.0f, 0.0f);
            break L0;
          }
        }
        if (param0 != 55) {
          ((oja) this).field_f = null;
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (param0 <= 64) {
          return;
        } else {
          L0: {
            if (((oja) this).field_j) {
              var2 = ((oja) this).field_i.field_jd;
              int discarded$2 = var2.a(8, ((oja) this).field_c.a(field_h, false));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            ((oja) this).b(-122);
            return ((oja) this).field_d;
        }
        return ((oja) this).field_d;
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        asa var4 = null;
        if (!param0) {
          return;
        } else {
          L0: {
            if (!((oja) this).field_j) {
              break L0;
            } else {
              var2 = ((oja) this).field_i.field_jd;
              var3 = ((oja) this).field_i.E(14);
              var4 = ((oja) this).field_i.n((byte) 4);
              int discarded$4 = var2.a(0, var4.a(false, field_h));
              int discarded$5 = var2.a(4, var3.b(field_h, 74));
              break L0;
            }
          }
          return;
        }
    }

    final void b(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        L0: {
          if (((oja) this).field_j) {
            var2 = ((oja) this).field_i.field_jd;
            var3 = ((oja) this).field_i.n((byte) -124);
            int discarded$2 = var2.a(0, var3.a(false, field_h));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 107) {
          ((oja) this).field_g = null;
          return;
        } else {
          return;
        }
    }

    final void c(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        L0: {
          if (!((oja) this).field_j) {
            break L0;
          } else {
            var2 = ((oja) this).field_i.field_jd;
            var3 = ((oja) this).field_c.a((byte) 112);
            int discarded$2 = var2.SetVertexShaderConstantF(12, var3.a(field_h, -96), 2);
            break L0;
          }
        }
        if (!param0) {
          ((oja) this).a(false, -10);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new float[16];
    }
}
