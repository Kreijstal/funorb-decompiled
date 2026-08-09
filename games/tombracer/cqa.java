/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
            this.field_g = (gf) null;
        }
    }

    private final void e(int param0) {
        asa var2;
        jagdx.IDirect3DDevice var3;
        asa var4;
        L0: {
          if (this.field_j == null) {
            break L0;
          } else {
            if (!this.field_d) {
              break L0;
            } else {
              var4 = this.field_c.c(true);
              var2 = var4;
              var3 = this.field_i.field_jd;
              var3.a(13, this.field_c.field_sc * this.field_c.field_fc, this.field_c.field_fc * this.field_c.field_yb, this.field_c.field_fc * this.field_c.field_Kb, 1.0f);
              var3.a(14, this.field_c.field_sc * this.field_c.field_j, this.field_c.field_yb * this.field_c.field_j, this.field_c.field_j * this.field_c.field_Kb, 1.0f);
              var3.a(16, this.field_c.field_pc * this.field_c.field_sc, this.field_c.field_pc * this.field_c.field_yb, this.field_c.field_pc * this.field_c.field_Kb, 1.0f);
              var4.a(field_h, this.field_c.field_Gb[1], (byte) 76, this.field_c.field_Gb[2], this.field_c.field_Gb[0]);
              var3.SetVertexShaderConstantF(15, field_h, 1);
              var4.a(field_h, this.field_c.field_M[1], (byte) 52, this.field_c.field_M[2], this.field_c.field_M[0]);
              var3.SetVertexShaderConstantF(17, field_h, 1);
              break L0;
            }
          }
        }
        if (param0 != 1) {
          this.field_g = (gf) null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_d = param1 ? true : false;
        this.field_c.e(1, false);
        int var3 = 101 / ((param0 - 41) / 62);
        this.field_c.a(true, this.field_g);
        this.field_c.a(ln.field_F, (byte) -110, r.field_m);
        this.field_c.a(pea.field_c, 0, -55);
        this.field_c.a(ej.field_c, 2, -6219, true, false);
        this.field_c.a(0, false, lja.field_j);
        this.field_c.e(0, false);
        this.d(122);
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            this.c(32);
        }
    }

    final void a(int param0, iva param1, int param2) {
        if (param1 == null) {
          if (this.field_e) {
            if (param2 != 24595) {
              this.a(true, -82);
              return;
            } else {
              return;
            }
          } else {
            this.field_c.a(true, this.field_c.field_Jb);
            this.field_c.a((byte) -85, 1);
            this.field_c.a(lja.field_j, 0, -82);
            this.field_c.a(0, false, lja.field_j);
            this.field_e = true;
            if (param2 == 24595) {
              return;
            } else {
              this.a(true, -82);
              return;
            }
          }
        } else {
          L0: {
            if (this.field_e) {
              this.field_c.a(ej.field_c, 0, -90);
              this.field_c.a(0, false, ej.field_c);
              this.field_e = false;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_c.a(true, param1);
          this.field_c.a((byte) -124, param0);
          if (param2 == 24595) {
            return;
          } else {
            this.a(true, -82);
            return;
          }
        }
    }

    final void c(boolean param0) {
        jagdx.IDirect3DDevice var2;
        asa var3;
        if (!param0) {
          L0: {
            this.a(-44);
            if (this.field_j != null) {
              var2 = this.field_i.field_jd;
              var3 = this.field_c.a((byte) 116);
              var2.SetVertexShaderConstantF(8, var3.a(field_f, -118), 2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_j != null) {
              var2 = this.field_i.field_jd;
              var3 = this.field_c.a((byte) 116);
              var2.SetVertexShaderConstantF(8, var3.a(field_f, -118), 2);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2;
        L0: {
          if (this.field_j != null) {
            var2 = this.field_i.field_jd;
            var2.a(4, this.field_c.a(field_f, false));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 64) {
          this.a(true, -11);
          return;
        } else {
          return;
        }
    }

    cqa(cta param0, cn param1) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        L0: {
          this.field_e = false;
          this.field_i = param0;
          if (param1 == null) {
            break L0;
          } else {
            if (-258 >= (this.field_i.field_ld.VertexShaderVersion & 65535 ^ -1)) {
              L1: {
                this.field_m = this.field_i.field_jd.b(param1.a("dx", (byte) 125, "uw_ground_unlit"));
                this.field_o = this.field_i.field_jd.b(param1.a("dx", (byte) 127, "uw_ground_lit"));
                this.field_l = this.field_i.field_jd.b(param1.a("dx", (byte) 115, "uw_model_unlit"));
                this.field_k = this.field_i.field_jd.b(param1.a("dx", (byte) 124, "uw_model_lit"));
                if (this.field_o == null) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              L2: {


                if (null == this.field_m) {

                  stackIn_9_1 = 0;
                  break L2;
                } else {

                  stackIn_9_1 = 1;
                  break L2;
                }
              }
              L3: {
                stackIn_11_0 = stackIn_6_0 & stackIn_9_1;

                if (null == this.field_l) {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = 1;
                  break L3;
                }
              }
              L4: {
                stackIn_14_0 = stackIn_12_0 & stackIn_12_1;

                if (this.field_k == null) {
                  stackIn_15_0 = stackIn_14_0;
                  stackIn_15_1 = 0;
                  break L4;
                } else {
                  stackIn_15_0 = stackIn_14_0;
                  stackIn_15_1 = 1;
                  break L4;
                }
              }
              if ((stackIn_15_0 & stackIn_15_1) != 0) {
                this.field_g = this.field_c.a(true, 1, false, 2, new int[]{0, -1});
                this.field_g.a((byte) -128, false, false);
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

    final void a(int param0) {
        L0: {
          this.field_c.e(1, false);
          this.field_c.a(true, (iva) null);
          this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
          this.field_c.a(ej.field_c, 0, -58);
          this.field_c.a(pea.field_c, 2, -122);
          this.field_c.a(0, false, ej.field_c);
          this.field_c.e(0, false);
          if (this.field_e) {
            this.field_c.a(ej.field_c, 0, -48);
            this.field_c.a(0, false, ej.field_c);
            this.field_e = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -4) {
          L1: {
            this.field_k = (jagdx.IDirect3DVertexShader) null;
            if (null != this.field_j) {
              this.field_i.a((jagdx.IDirect3DVertexShader) null, -1);
              this.field_j = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (null != this.field_j) {
              this.field_i.a((jagdx.IDirect3DVertexShader) null, -1);
              this.field_j = null;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void b(byte param0) {
        jagdx.IDirect3DDevice var2;
        asa var3;
        L0: {
          if (this.field_j != null) {
            var2 = this.field_i.field_jd;
            var3 = this.field_i.n((byte) -101);
            var2.a(0, var3.a(false, field_f));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 107) {
          this.b(116);
          return;
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            return true;
        }
        return this.field_n;
    }

    final void a(boolean param0) {
        jagdx.IDirect3DDevice var2;
        int var3;
        int var4;
        float var5;
        float var6;
        L0: {
          if (param0) {
            break L0;
          } else {
            this.a(-94);
            break L0;
          }
        }
        L1: {
          if (null == this.field_j) {
            break L1;
          } else {
            var2 = this.field_i.field_jd;
            var3 = this.field_c.XA();
            var4 = this.field_c.i();
            var5 = -((float)(-var4 + var3) * 0.125f) + (float)var3;
            var6 = -((float)(-var4 + var3) * 0.25f) + (float)var3;
            var2.a(10, var6, 1.0f / (-var6 + var5), var5, 1.0f / ((float)var3 - var5));
            var2.a(11, 1.0f / (float)this.field_c.g(false), (float)this.field_c.A(-2903) / 255.0f, this.field_c.field_Hc, 1.0f / (-this.field_c.field_B + this.field_c.field_Hc));
            this.field_c.g(3625, this.field_c.t(65280));
            break L1;
          }
        }
    }

    private final void d(int param0) {
        jagdx.IDirect3DVertexShader var2;
        int var4;
        asa var5;
        jagdx.IDirect3DDevice var6;
        jagdx.IDirect3DDevice var7;
        jagdx.IDirect3DVertexShader stackIn_5_0 = null;
        jagdx.IDirect3DVertexShader stackIn_9_0 = null;
        jagdx.IDirect3DVertexShader stackIn_18_0 = null;
        jagdx.IDirect3DVertexShader stackIn_22_0 = null;
        if (param0 >= 83) {
          L0: {
            var7 = this.field_i.field_jd;
            var4 = this.field_c.d(false);
            var5 = this.field_c.E(8);
            if (this.field_d) {
              L1: {
                if (var4 != 2147483647) {
                  stackIn_22_0 = this.field_k;
                  break L1;
                } else {
                  stackIn_22_0 = this.field_o;
                  break L1;
                }
              }
              var2 = stackIn_22_0;
              break L0;
            } else {
              L2: {
                if (var4 == 2147483647) {
                  stackIn_18_0 = this.field_m;
                  break L2;
                } else {
                  stackIn_18_0 = this.field_l;
                  break L2;
                }
              }
              var2 = stackIn_18_0;
              break L0;
            }
          }
          if (var2 != this.field_j) {
            this.field_j = var2;
            this.field_i.a(var2, -1);
            this.e(1);
            this.b(125);
            this.c(true);
            this.b((byte) 107);
            this.b(true);
            this.a(true);
            var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
            var7.a(12, field_h);
            return;
          } else {
            var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
            var7.a(12, field_h);
            return;
          }
        } else {
          L3: {
            this.b(false);
            var6 = this.field_i.field_jd;
            var4 = this.field_c.d(false);
            var5 = this.field_c.E(8);
            if (this.field_d) {
              L4: {
                if (var4 != 2147483647) {
                  stackIn_9_0 = this.field_k;
                  break L4;
                } else {
                  stackIn_9_0 = this.field_o;
                  break L4;
                }
              }
              var2 = stackIn_9_0;
              break L3;
            } else {
              L5: {
                if (var4 == 2147483647) {
                  stackIn_5_0 = this.field_m;
                  break L5;
                } else {
                  stackIn_5_0 = this.field_l;
                  break L5;
                }
              }
              var2 = stackIn_5_0;
              break L3;
            }
          }
          if (var2 != this.field_j) {
            this.field_j = var2;
            this.field_i.a(var2, -1);
            this.e(1);
            this.b(125);
            this.c(true);
            this.b((byte) 107);
            this.b(true);
            this.a(true);
            var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
            var6.a(12, field_h);
            return;
          } else {
            var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
            var6.a(12, field_h);
            return;
          }
        }
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        asa stackIn_5_2 = null;
        jagdx.IDirect3DDevice stackIn_6_0;
        int stackIn_6_1;
        asa stackIn_6_2;
        int stackIn_6_3;
        jagdx.IDirect3DDevice stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        asa stackIn_12_2 = null;
        jagdx.IDirect3DDevice stackIn_13_0;
        int stackIn_13_1;
        asa stackIn_13_2;
        int stackIn_13_3;
        jagdx.IDirect3DDevice var2;
        asa var3;
        if (!param0) {
          L0: {
            this.c(false);
            if (null != this.field_j) {
              L1: {
                var2 = this.field_i.field_jd;
                var3 = this.field_i.n((byte) 10);
                stackIn_12_0 = (jagdx.IDirect3DDevice) (var2);

                stackIn_12_1 = 0;

                stackIn_12_2 = (asa) (var3);

                if (param0) {
                  stackIn_13_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_12_0);
                  stackIn_13_1 = stackIn_12_1;
                  stackIn_13_2 = (asa) ((Object) stackIn_12_2);
                  stackIn_13_3 = 0;
                  break L1;
                } else {
                  stackIn_13_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_12_0);
                  stackIn_13_1 = stackIn_12_1;
                  stackIn_13_2 = (asa) ((Object) stackIn_12_2);
                  stackIn_13_3 = 1;
                  break L1;
                }
              }
              ((jagdx.IDirect3DDevice) (Object) stackIn_13_0).a(stackIn_13_1, ((asa) (Object) stackIn_13_2).a(stackIn_13_3 != 0, field_f));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (null != this.field_j) {
              L3: {
                var2 = this.field_i.field_jd;
                var3 = this.field_i.n((byte) 10);
                stackIn_5_0 = (jagdx.IDirect3DDevice) (var2);

                stackIn_5_1 = 0;

                stackIn_5_2 = (asa) (var3);

                if (param0) {
                  stackIn_6_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = (asa) ((Object) stackIn_5_2);
                  stackIn_6_3 = 0;
                  break L3;
                } else {
                  stackIn_6_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = (asa) ((Object) stackIn_5_2);
                  stackIn_6_3 = 1;
                  break L3;
                }
              }
              ((jagdx.IDirect3DDevice) (Object) stackIn_6_0).a(stackIn_6_1, ((asa) (Object) stackIn_6_2).a(stackIn_6_3 != 0, field_f));
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    static {
        field_f = new float[16];
        field_h = new float[4];
    }
}
