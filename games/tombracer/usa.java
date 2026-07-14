/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class usa extends vw {
    private jagdx.IDirect3DVertexShader field_f;
    private static float[] field_d;
    private hk field_g;
    private cta field_e;

    final void a(int param0) {
        ((usa) this).field_e.a((jagdx.IDirect3DVertexShader) null, -1);
        ((usa) this).field_c.a(ej.field_c, 0, -54);
        ((usa) this).field_c.a(tla.field_c, 1, -56);
        ((usa) this).field_c.a(pea.field_c, 2, -116);
        if (param0 > -4) {
          return;
        } else {
          ((usa) this).field_c.a((byte) 51, true);
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
            ((usa) this).a((byte) -57, 54, -28);
            if (((usa) this).field_f == null) {
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
            if (((usa) this).field_f == null) {
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
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        Object var4 = null;
        L0: {
          if (null != ((usa) this).field_f) {
            var2 = ((usa) this).field_e.field_jd;
            var3 = ((usa) this).field_e.n((byte) 95);
            int discarded$2 = var2.a(0, var3.a(false, field_d));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 107) {
          var4 = null;
          ((usa) this).a(-5, (iva) null, 86);
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        L0: {
          if (null != ((usa) this).field_f) {
            var2 = ((usa) this).field_e.field_jd;
            int discarded$2 = var2.a(4, ((usa) this).field_c.a(field_d, false));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 64) {
          ((usa) this).b((byte) -60);
          return;
        } else {
          return;
        }
    }

    final void c(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        L0: {
          if (null == ((usa) this).field_f) {
            break L0;
          } else {
            var2 = ((usa) this).field_e.field_jd;
            var3 = ((usa) this).field_c.a((byte) 113);
            float[] discarded$4 = var3.a(field_d, -101);
            field_d[3] = field_d[3] * 0.25f;
            field_d[6] = field_d[6] * 0.25f;
            field_d[5] = field_d[5] * 0.25f;
            field_d[4] = field_d[4] * 0.25f;
            field_d[1] = field_d[1] * 0.25f;
            field_d[7] = field_d[7] * 0.25f;
            field_d[2] = field_d[2] * 0.25f;
            field_d[0] = field_d[0] * 0.25f;
            int discarded$5 = var2.SetVertexShaderConstantF(8, field_d, 2);
            break L0;
          }
        }
        if (!param0) {
          ((usa) this).a((byte) 6, -79, -56);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, iva param1, int param2) {
        if (param2 != 24595) {
            field_d = null;
        }
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        L0: {
          if (null != ((usa) this).field_f) {
            var2 = ((usa) this).field_e.field_jd;
            var3 = ((usa) this).field_e.n((byte) -86);
            int discarded$2 = var2.a(0, var3.a(false, field_d));
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          ((usa) this).b(true);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var5 = 0;
        float var5_float = 0.0f;
        jagdx.IDirect3DDevice var6 = null;
        jagdx.IDirect3DDevice var7 = null;
        if (param0 != 55) {
          L0: {
            field_d = null;
            var6 = ((usa) this).field_e.field_jd;
            if (!((usa) this).field_g.field_g) {
              var5 = 16 * (((usa) this).field_c.field_Dc % 4000) / 4000;
              ((usa) this).field_c.a(true, (iva) (Object) ((usa) this).field_g.field_d[var5]);
              int discarded$4 = var6.a(11, 0.0f, 0.0f, 0.0f, 0.0f);
              break L0;
            } else {
              var5_float = (float)(((usa) this).field_c.field_Dc % 4000) / 4000.0f;
              ((usa) this).field_c.a(true, (iva) (Object) ((usa) this).field_g.field_c);
              int discarded$5 = var6.a(11, var5_float, 0.0f, 0.0f, 0.0f);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var7 = ((usa) this).field_e.field_jd;
            if (!((usa) this).field_g.field_g) {
              var5 = 16 * (((usa) this).field_c.field_Dc % 4000) / 4000;
              ((usa) this).field_c.a(true, (iva) (Object) ((usa) this).field_g.field_d[var5]);
              int discarded$6 = var7.a(11, 0.0f, 0.0f, 0.0f, 0.0f);
              break L1;
            } else {
              var5_float = (float)(((usa) this).field_c.field_Dc % 4000) / 4000.0f;
              ((usa) this).field_c.a(true, (iva) (Object) ((usa) this).field_g.field_c);
              int discarded$7 = var7.a(11, var5_float, 0.0f, 0.0f, 0.0f);
              break L1;
            }
          }
          return;
        }
    }

    final void a(boolean param0, int param1) {
        ((usa) this).field_c.a(jv.field_m, (byte) -110, r.field_m);
        if (param1 != 5744) {
            Object var4 = null;
            ((usa) this).a(-56, (iva) null, 109);
        }
    }

    final void a(boolean param0) {
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        jagdx.IDirect3DDevice var6 = null;
        jagdx.IDirect3DDevice var7 = null;
        if (!param0) {
          L0: {
            ((usa) this).a(false);
            if (((usa) this).field_f != null) {
              L1: {
                var6 = ((usa) this).field_e.field_jd;
                if (0 < ((usa) this).field_c.field_J) {
                  var3 = ((usa) this).field_c.field_Hc;
                  var4 = ((usa) this).field_c.field_B;
                  var5 = -512.0f + var4;
                  int discarded$4 = var6.a(10, var5, 1.0f / (-var5 + var4), var4, 1.0f / (var3 - var4));
                  break L1;
                } else {
                  int discarded$5 = var6.a(10, 0.0f, 0.0f, 0.0f, 0.0f);
                  break L1;
                }
              }
              ((usa) this).field_c.g(3625, ((usa) this).field_c.field_g);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (((usa) this).field_f != null) {
              L3: {
                var7 = ((usa) this).field_e.field_jd;
                if (0 < ((usa) this).field_c.field_J) {
                  var3 = ((usa) this).field_c.field_Hc;
                  var4 = ((usa) this).field_c.field_B;
                  var5 = -512.0f + var4;
                  int discarded$6 = var7.a(10, var5, 1.0f / (-var5 + var4), var4, 1.0f / (var3 - var4));
                  break L3;
                } else {
                  int discarded$7 = var7.a(10, 0.0f, 0.0f, 0.0f, 0.0f);
                  break L3;
                }
              }
              ((usa) this).field_c.g(3625, ((usa) this).field_c.field_g);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    usa(cta param0, cn param1, hk param2) {
        super((eo) (Object) param0);
        L0: {
          L1: {
            ((usa) this).field_g = param2;
            ((usa) this).field_e = param0;
            if (param1 == null) {
              break L1;
            } else {
              if (!((usa) this).field_g.c(-30634)) {
                break L1;
              } else {
                if ((65535 & ((usa) this).field_e.field_ld.VertexShaderVersion) >= 257) {
                  ((usa) this).field_f = ((usa) this).field_e.field_jd.b(param1.a("dx", (byte) 114, "transparent_water"));
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((usa) this).field_f = null;
          break L0;
        }
    }

    final void a(int param0, boolean param1) {
        ((usa) this).field_c.a(ej.field_c, 0, -100);
        ((usa) this).field_c.a(pea.field_c, 1, -21);
        ((usa) this).field_c.a(tla.field_c, 2, -6219, false, true);
        ((usa) this).field_c.a((byte) 77, false);
        ((usa) this).field_e.a(((usa) this).field_f, -1);
        ((usa) this).b((byte) 107);
        ((usa) this).c(true);
        ((usa) this).b(77);
        int var3 = 91 % ((param0 - 41) / 62);
        ((usa) this).a(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new float[16];
    }
}
