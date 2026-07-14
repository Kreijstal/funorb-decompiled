/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jagdx.IDirect3DVertexShader;
import jagdx.IDirect3DDevice;

final class cqa extends vw {
    private jagdx.IDirect3DVertexShader field_l;
    private jagdx.IDirect3DVertexShader field_o;
    private boolean field_n;
    private gf field_g;
    private jagdx.IDirect3DVertexShader field_j;
    private boolean field_e;
    private jagdx.IDirect3DVertexShader field_k;
    private jagdx.IDirect3DVertexShader field_m;
    private cta field_i;
    private static float[] field_h;
    private static float[] field_f;
    private boolean field_d;

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
            ((cqa) this).field_g = null;
        }
    }

    private final void e(int param0) {
        asa var2 = null;
        jagdx.IDirect3DDevice var3 = null;
        asa var4 = null;
        L0: {
          if (((cqa) this).field_j == null) {
            break L0;
          } else {
            if (!((cqa) this).field_d) {
              break L0;
            } else {
              var4 = ((cqa) this).field_c.c(true);
              var2 = var4;
              var3 = ((cqa) this).field_i.field_jd;
              int discarded$5 = var3.a(13, ((cqa) this).field_c.field_sc * ((cqa) this).field_c.field_fc, ((cqa) this).field_c.field_fc * ((cqa) this).field_c.field_yb, ((cqa) this).field_c.field_fc * ((cqa) this).field_c.field_Kb, 1.0f);
              int discarded$6 = var3.a(14, ((cqa) this).field_c.field_sc * ((cqa) this).field_c.field_j, ((cqa) this).field_c.field_yb * ((cqa) this).field_c.field_j, ((cqa) this).field_c.field_j * ((cqa) this).field_c.field_Kb, 1.0f);
              int discarded$7 = var3.a(16, ((cqa) this).field_c.field_pc * ((cqa) this).field_c.field_sc, ((cqa) this).field_c.field_pc * ((cqa) this).field_c.field_yb, ((cqa) this).field_c.field_pc * ((cqa) this).field_c.field_Kb, 1.0f);
              var4.a(field_h, ((cqa) this).field_c.field_Gb[1], (byte) 76, ((cqa) this).field_c.field_Gb[2], ((cqa) this).field_c.field_Gb[0]);
              int discarded$8 = var3.SetVertexShaderConstantF(15, field_h, 1);
              var4.a(field_h, ((cqa) this).field_c.field_M[1], (byte) 52, ((cqa) this).field_c.field_M[2], ((cqa) this).field_c.field_M[0]);
              int discarded$9 = var3.SetVertexShaderConstantF(17, field_h, 1);
              break L0;
            }
          }
        }
        if (param0 != 1) {
          ((cqa) this).field_g = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        ((cqa) this).field_d = param1 ? true : false;
        ((cqa) this).field_c.e(1, false);
        int var3 = 101 / ((param0 - 41) / 62);
        ((cqa) this).field_c.a(true, (iva) (Object) ((cqa) this).field_g);
        ((cqa) this).field_c.a(ln.field_F, (byte) -110, r.field_m);
        ((cqa) this).field_c.a(pea.field_c, 0, -55);
        ((cqa) this).field_c.a(ej.field_c, 2, -6219, true, false);
        ((cqa) this).field_c.a(0, false, lja.field_j);
        ((cqa) this).field_c.e(0, false);
        this.d(122);
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            boolean discarded$0 = ((cqa) this).c(32);
        }
    }

    final void a(int param0, iva param1, int param2) {
        if (param1 == null) {
          if (((cqa) this).field_e) {
            if (param2 != 24595) {
              ((cqa) this).a(true, -82);
              return;
            } else {
              return;
            }
          } else {
            ((cqa) this).field_c.a(true, ((cqa) this).field_c.field_Jb);
            ((cqa) this).field_c.a((byte) -85, 1);
            ((cqa) this).field_c.a(lja.field_j, 0, -82);
            ((cqa) this).field_c.a(0, false, lja.field_j);
            ((cqa) this).field_e = true;
            if (param2 == 24595) {
              return;
            } else {
              ((cqa) this).a(true, -82);
              return;
            }
          }
        } else {
          L0: {
            if (((cqa) this).field_e) {
              ((cqa) this).field_c.a(ej.field_c, 0, -90);
              ((cqa) this).field_c.a(0, false, ej.field_c);
              ((cqa) this).field_e = false;
              break L0;
            } else {
              break L0;
            }
          }
          ((cqa) this).field_c.a(true, param1);
          ((cqa) this).field_c.a((byte) -124, param0);
          if (param2 == 24595) {
            return;
          } else {
            ((cqa) this).a(true, -82);
            return;
          }
        }
    }

    final void c(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        if (!param0) {
          L0: {
            ((cqa) this).a(-44);
            if (((cqa) this).field_j != null) {
              var2 = ((cqa) this).field_i.field_jd;
              var3 = ((cqa) this).field_c.a((byte) 116);
              int discarded$4 = var2.SetVertexShaderConstantF(8, var3.a(field_f, -118), 2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((cqa) this).field_j != null) {
              var2 = ((cqa) this).field_i.field_jd;
              var3 = ((cqa) this).field_c.a((byte) 116);
              int discarded$5 = var2.SetVertexShaderConstantF(8, var3.a(field_f, -118), 2);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        L0: {
          if (((cqa) this).field_j != null) {
            var2 = ((cqa) this).field_i.field_jd;
            int discarded$2 = var2.a(4, ((cqa) this).field_c.a(field_f, false));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 64) {
          ((cqa) this).a(true, -11);
          return;
        } else {
          return;
        }
    }

    cqa(cta param0, cn param1) {
        super((eo) (Object) param0);
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
          ((cqa) this).field_e = false;
          ((cqa) this).field_i = param0;
          if (param1 == null) {
            break L0;
          } else {
            if (-258 >= (((cqa) this).field_i.field_ld.VertexShaderVersion & 65535 ^ -1)) {
              L1: {
                ((cqa) this).field_m = ((cqa) this).field_i.field_jd.b(param1.a("dx", (byte) 125, "uw_ground_unlit"));
                ((cqa) this).field_o = ((cqa) this).field_i.field_jd.b(param1.a("dx", (byte) 127, "uw_ground_lit"));
                ((cqa) this).field_l = ((cqa) this).field_i.field_jd.b(param1.a("dx", (byte) 115, "uw_model_unlit"));
                ((cqa) this).field_k = ((cqa) this).field_i.field_jd.b(param1.a("dx", (byte) 124, "uw_model_lit"));
                if (((cqa) this).field_o == null) {
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
                if (null == ((cqa) this).field_m) {
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
                if (null == ((cqa) this).field_l) {
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
                if (((cqa) this).field_k == null) {
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
                ((cqa) this).field_g = ((cqa) this).field_c.a(true, 1, false, 2, new int[2]);
                ((cqa) this).field_g.a((byte) -128, false, false);
                ((cqa) this).field_n = true;
              } else {
                ((cqa) this).field_n = false;
              }
            } else {
              break L0;
            }
          }
        }
        ((cqa) this).field_n = false;
    }

    final void a(int param0) {
        L0: {
          ((cqa) this).field_c.e(1, false);
          ((cqa) this).field_c.a(true, (iva) null);
          ((cqa) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
          ((cqa) this).field_c.a(ej.field_c, 0, -58);
          ((cqa) this).field_c.a(pea.field_c, 2, -122);
          ((cqa) this).field_c.a(0, false, ej.field_c);
          ((cqa) this).field_c.e(0, false);
          if (((cqa) this).field_e) {
            ((cqa) this).field_c.a(ej.field_c, 0, -48);
            ((cqa) this).field_c.a(0, false, ej.field_c);
            ((cqa) this).field_e = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -4) {
          L1: {
            ((cqa) this).field_k = null;
            if (null != ((cqa) this).field_j) {
              ((cqa) this).field_i.a((jagdx.IDirect3DVertexShader) null, -1);
              ((cqa) this).field_j = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (null != ((cqa) this).field_j) {
              ((cqa) this).field_i.a((jagdx.IDirect3DVertexShader) null, -1);
              ((cqa) this).field_j = null;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void b(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        L0: {
          if (((cqa) this).field_j != null) {
            var2 = ((cqa) this).field_i.field_jd;
            var3 = ((cqa) this).field_i.n((byte) -101);
            int discarded$2 = var2.a(0, var3.a(false, field_f));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 107) {
          ((cqa) this).b(116);
          return;
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            return true;
        }
        return ((cqa) this).field_n;
    }

    final void a(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        L0: {
          if (param0) {
            break L0;
          } else {
            ((cqa) this).a(-94);
            break L0;
          }
        }
        L1: {
          if (null == ((cqa) this).field_j) {
            break L1;
          } else {
            var2 = ((cqa) this).field_i.field_jd;
            var3 = ((cqa) this).field_c.XA();
            var4 = ((cqa) this).field_c.i();
            var5 = -((float)(-var4 + var3) * 0.125f) + (float)var3;
            var6 = -((float)(-var4 + var3) * 0.25f) + (float)var3;
            int discarded$2 = var2.a(10, var6, 1.0f / (-var6 + var5), var5, 1.0f / ((float)var3 - var5));
            int discarded$3 = var2.a(11, 1.0f / (float)((cqa) this).field_c.g(false), (float)((cqa) this).field_c.A(-2903) / 255.0f, ((cqa) this).field_c.field_Hc, 1.0f / (-((cqa) this).field_c.field_B + ((cqa) this).field_c.field_Hc));
            ((cqa) this).field_c.g(3625, ((cqa) this).field_c.t(65280));
            break L1;
          }
        }
    }

    private final void d(int param0) {
        jagdx.IDirect3DVertexShader var2 = null;
        int var4 = 0;
        asa var5 = null;
        jagdx.IDirect3DDevice var6 = null;
        jagdx.IDirect3DDevice var7 = null;
        jagdx.IDirect3DVertexShader stackIn_5_0 = null;
        jagdx.IDirect3DVertexShader stackIn_9_0 = null;
        jagdx.IDirect3DVertexShader stackIn_18_0 = null;
        jagdx.IDirect3DVertexShader stackIn_22_0 = null;
        jagdx.IDirect3DVertexShader stackOut_21_0 = null;
        jagdx.IDirect3DVertexShader stackOut_20_0 = null;
        jagdx.IDirect3DVertexShader stackOut_17_0 = null;
        jagdx.IDirect3DVertexShader stackOut_16_0 = null;
        jagdx.IDirect3DVertexShader stackOut_8_0 = null;
        jagdx.IDirect3DVertexShader stackOut_7_0 = null;
        jagdx.IDirect3DVertexShader stackOut_4_0 = null;
        jagdx.IDirect3DVertexShader stackOut_3_0 = null;
        if (param0 >= 83) {
          L0: {
            var7 = ((cqa) this).field_i.field_jd;
            var4 = ((cqa) this).field_c.d(false);
            var5 = ((cqa) this).field_c.E(8);
            if (((cqa) this).field_d) {
              L1: {
                if (var4 != 2147483647) {
                  stackOut_21_0 = ((cqa) this).field_k;
                  stackIn_22_0 = stackOut_21_0;
                  break L1;
                } else {
                  stackOut_20_0 = ((cqa) this).field_o;
                  stackIn_22_0 = stackOut_20_0;
                  break L1;
                }
              }
              var2 = stackIn_22_0;
              break L0;
            } else {
              L2: {
                if (var4 == 2147483647) {
                  stackOut_17_0 = ((cqa) this).field_m;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = ((cqa) this).field_l;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              var2 = stackIn_18_0;
              break L0;
            }
          }
          if (var2 != ((cqa) this).field_j) {
            ((cqa) this).field_j = var2;
            ((cqa) this).field_i.a(var2, -1);
            this.e(1);
            ((cqa) this).b(125);
            ((cqa) this).c(true);
            ((cqa) this).b((byte) 107);
            ((cqa) this).b(true);
            ((cqa) this).a(true);
            var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
            int discarded$4 = var7.a(12, field_h);
            return;
          } else {
            var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
            int discarded$5 = var7.a(12, field_h);
            return;
          }
        } else {
          L3: {
            ((cqa) this).b(false);
            var6 = ((cqa) this).field_i.field_jd;
            var4 = ((cqa) this).field_c.d(false);
            var5 = ((cqa) this).field_c.E(8);
            if (((cqa) this).field_d) {
              L4: {
                if (var4 != 2147483647) {
                  stackOut_8_0 = ((cqa) this).field_k;
                  stackIn_9_0 = stackOut_8_0;
                  break L4;
                } else {
                  stackOut_7_0 = ((cqa) this).field_o;
                  stackIn_9_0 = stackOut_7_0;
                  break L4;
                }
              }
              var2 = stackIn_9_0;
              break L3;
            } else {
              L5: {
                if (var4 == 2147483647) {
                  stackOut_4_0 = ((cqa) this).field_m;
                  stackIn_5_0 = stackOut_4_0;
                  break L5;
                } else {
                  stackOut_3_0 = ((cqa) this).field_l;
                  stackIn_5_0 = stackOut_3_0;
                  break L5;
                }
              }
              var2 = stackIn_5_0;
              break L3;
            }
          }
          if (var2 != ((cqa) this).field_j) {
            ((cqa) this).field_j = var2;
            ((cqa) this).field_i.a(var2, -1);
            this.e(1);
            ((cqa) this).b(125);
            ((cqa) this).c(true);
            ((cqa) this).b((byte) 107);
            ((cqa) this).b(true);
            ((cqa) this).a(true);
            var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
            int discarded$6 = var6.a(12, field_h);
            return;
          } else {
            var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
            int discarded$7 = var6.a(12, field_h);
            return;
          }
        }
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        asa var3 = null;
        jagdx.IDirect3DDevice stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        asa stackIn_4_2 = null;
        jagdx.IDirect3DDevice stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        asa stackIn_5_2 = null;
        jagdx.IDirect3DDevice stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        asa stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        jagdx.IDirect3DDevice stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        asa stackIn_11_2 = null;
        jagdx.IDirect3DDevice stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        asa stackIn_12_2 = null;
        jagdx.IDirect3DDevice stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        asa stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        jagdx.IDirect3DDevice stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        asa stackOut_10_2 = null;
        jagdx.IDirect3DDevice stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        asa stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        jagdx.IDirect3DDevice stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        asa stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        jagdx.IDirect3DDevice stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        asa stackOut_3_2 = null;
        jagdx.IDirect3DDevice stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        asa stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        jagdx.IDirect3DDevice stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        asa stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        if (!param0) {
          L0: {
            ((cqa) this).c(false);
            if (null != ((cqa) this).field_j) {
              L1: {
                var2 = ((cqa) this).field_i.field_jd;
                var3 = ((cqa) this).field_i.n((byte) 10);
                stackOut_10_0 = (jagdx.IDirect3DDevice) var2;
                stackOut_10_1 = 0;
                stackOut_10_2 = (asa) var3;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                if (param0) {
                  stackOut_12_0 = (jagdx.IDirect3DDevice) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = (asa) (Object) stackIn_12_2;
                  stackOut_12_3 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  break L1;
                } else {
                  stackOut_11_0 = (jagdx.IDirect3DDevice) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = (asa) (Object) stackIn_11_2;
                  stackOut_11_3 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_13_3 = stackOut_11_3;
                  break L1;
                }
              }
              int discarded$2 = ((jagdx.IDirect3DDevice) (Object) stackIn_13_0).a(stackIn_13_1, ((asa) (Object) stackIn_13_2).a(stackIn_13_3 != 0, field_f));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (null != ((cqa) this).field_j) {
              L3: {
                var2 = ((cqa) this).field_i.field_jd;
                var3 = ((cqa) this).field_i.n((byte) 10);
                stackOut_3_0 = (jagdx.IDirect3DDevice) var2;
                stackOut_3_1 = 0;
                stackOut_3_2 = (asa) var3;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (param0) {
                  stackOut_5_0 = (jagdx.IDirect3DDevice) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = (asa) (Object) stackIn_5_2;
                  stackOut_5_3 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L3;
                } else {
                  stackOut_4_0 = (jagdx.IDirect3DDevice) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = (asa) (Object) stackIn_4_2;
                  stackOut_4_3 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L3;
                }
              }
              int discarded$3 = ((jagdx.IDirect3DDevice) (Object) stackIn_6_0).a(stackIn_6_1, ((asa) (Object) stackIn_6_2).a(stackIn_6_3 != 0, field_f));
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new float[16];
        field_h = new float[4];
    }
}
