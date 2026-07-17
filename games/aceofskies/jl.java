/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends sk {
    private boolean field_n;
    private jagdx.IDirect3DVertexShader field_f;
    private static float[] field_m;
    private boolean field_q;
    private kr field_j;
    private qi field_k;
    private boolean field_h;
    private jagdx.IDirect3DVertexShader field_g;
    private jagdx.IDirect3DVertexShader field_l;
    private static float[] field_o;
    private jagdx.IDirect3DVertexShader field_i;
    private jagdx.IDirect3DVertexShader field_p;

    private final void c(byte param0) {
        jagdx.IDirect3DVertexShader var2 = null;
        int var3 = 86;
        jagdx.IDirect3DDevice var4 = ((jl) this).field_j.field_Rc;
        int var5 = ((jl) this).field_b.n((byte) -104);
        ec var6 = ((jl) this).field_b.t(-11198);
        if (!((jl) this).field_q) {
            var2 = var5 == 2147483647 ? ((jl) this).field_g : ((jl) this).field_p;
        } else {
            var2 = var5 == 2147483647 ? ((jl) this).field_l : ((jl) this).field_i;
        }
        if (!(((jl) this).field_f == var2)) {
            ((jl) this).field_f = var2;
            ((jl) this).field_j.a(var2, 5243);
            this.f(-48);
            ((jl) this).c(404277666);
            ((jl) this).d(18580);
            ((jl) this).b((byte) -25);
            ((jl) this).b(-127);
            ((jl) this).a(10);
        }
        var6.a(0.0f, -1.0f, field_o, 0.0f, (float)var5, 11);
        int discarded$0 = var4.a(12, field_o);
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
            field_o = null;
        }
    }

    final void b(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        if (param0 != -25) {
          L0: {
            ((jl) this).a(77, -13, -23);
            if (((jl) this).field_f != null) {
              var2 = ((jl) this).field_j.field_Rc;
              var3 = ((jl) this).field_j.v((byte) 68);
              int discarded$4 = var2.a(0, var3.c(field_m, 78));
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((jl) this).field_f != null) {
              var2 = ((jl) this).field_j.field_Rc;
              var3 = ((jl) this).field_j.v((byte) 68);
              int discarded$5 = var2.a(0, var3.c(field_m, 78));
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        L0: {
          if (null != ((jl) this).field_f) {
            var2 = ((jl) this).field_j.field_Rc;
            var3 = ((jl) this).field_b.XA();
            var4 = ((jl) this).field_b.i();
            var5 = (float)var3 - 0.125f * (float)(-var4 + var3);
            var6 = (float)var3 - 0.25f * (float)(var3 - var4);
            int discarded$4 = var2.b(10, var6, 1.0f / (-var6 + var5), var5, 1.0f / (-var5 + (float)var3));
            int discarded$5 = var2.b(11, 1.0f / (float)((jl) this).field_b.j((byte) 5), (float)((jl) this).field_b.H(param0 + 73) / 255.0f, ((jl) this).field_b.field_y, 1.0f / (-((jl) this).field_b.field_Xb + ((jl) this).field_b.field_y));
            ((jl) this).field_b.a((byte) -74, ((jl) this).field_b.q(0));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 10) {
          ((jl) this).a(122, 20, -87);
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        L0: {
          if (((jl) this).field_f == null) {
            break L0;
          } else {
            var2 = ((jl) this).field_j.field_Rc;
            var3 = ((jl) this).field_j.v((byte) -83);
            int discarded$2 = var2.a(0, var3.c(field_m, 59));
            break L0;
          }
        }
        if (param0 >= -117) {
          ((jl) this).field_i = null;
          return;
        } else {
          return;
        }
    }

    jl(kr param0, gk param1) {
        super((bf) (Object) param0);
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        ((jl) this).field_h = false;
        ((jl) this).field_j = param0;
        if (param1 == null) {
          ((jl) this).field_n = false;
          return;
        } else {
          if ((65535 & ((jl) this).field_j.field_Bc.VertexShaderVersion) < 257) {
            ((jl) this).field_n = false;
            return;
          } else {
            L0: {
              ((jl) this).field_g = ((jl) this).field_j.field_Rc.b(param1.a("dx", (byte) -71, "uw_ground_unlit"));
              ((jl) this).field_l = ((jl) this).field_j.field_Rc.b(param1.a("dx", (byte) -71, "uw_ground_lit"));
              ((jl) this).field_p = ((jl) this).field_j.field_Rc.b(param1.a("dx", (byte) -71, "uw_model_unlit"));
              ((jl) this).field_i = ((jl) this).field_j.field_Rc.b(param1.a("dx", (byte) -71, "uw_model_lit"));
              if (null == ((jl) this).field_p) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            L1: {
              stackOut_5_0 = stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (((jl) this).field_l == null) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L1;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L1;
              }
            }
            L2: {
              stackOut_8_0 = stackIn_8_0;
              stackOut_8_1 = stackIn_8_1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (null == ((jl) this).field_g) {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L2;
              } else {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                break L2;
              }
            }
            L3: {
              stackOut_11_0 = stackIn_11_0 & (stackIn_11_1 & stackIn_11_2);
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (((jl) this).field_i == null) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L3;
              } else {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L3;
              }
            }
            if ((stackIn_14_0 & stackIn_14_1) != 0) {
              ((jl) this).field_k = ((jl) this).field_b.a(new int[2], 2, 0, false, 1);
              ((jl) this).field_k.a(false, false, (byte) -127);
              ((jl) this).field_n = true;
              return;
            } else {
              ((jl) this).field_n = false;
              return;
            }
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            ((jl) this).field_h = true;
        }
    }

    final void a(boolean param0, byte param1) {
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
          if (!param0) {
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
        ((jl) this).field_q = stackIn_3_1 != 0;
        if (param1 < 2) {
          ((jl) this).field_q = true;
          ((jl) this).field_b.a(1, (byte) 123);
          ((jl) this).field_b.a((jj) (Object) ((jl) this).field_k, -9135);
          ((jl) this).field_b.a(du.field_l, true, bd.field_C);
          ((jl) this).field_b.a((byte) 125, 0, bs.field_a);
          ((jl) this).field_b.a(true, 2, true, dl.field_p, false);
          ((jl) this).field_b.a(un.field_i, 0, 0);
          ((jl) this).field_b.a(0, (byte) 45);
          this.c((byte) -111);
          return;
        } else {
          ((jl) this).field_b.a(1, (byte) 123);
          ((jl) this).field_b.a((jj) (Object) ((jl) this).field_k, -9135);
          ((jl) this).field_b.a(du.field_l, true, bd.field_C);
          ((jl) this).field_b.a((byte) 125, 0, bs.field_a);
          ((jl) this).field_b.a(true, 2, true, dl.field_p, false);
          ((jl) this).field_b.a(un.field_i, 0, 0);
          ((jl) this).field_b.a(0, (byte) 45);
          this.c((byte) -111);
          return;
        }
    }

    final void a(int param0, int param1, jj param2) {
        if (param2 == null) {
          if (!((jl) this).field_h) {
            ((jl) this).field_b.a(((jl) this).field_b.field_Kb, -9135);
            ((jl) this).field_b.b(1, false);
            ((jl) this).field_b.a((byte) 118, 0, un.field_i);
            ((jl) this).field_b.a(un.field_i, 0, 0);
            ((jl) this).field_h = true;
            if (param1 < 66) {
              ((jl) this).field_h = true;
              return;
            } else {
              return;
            }
          } else {
            if (param1 >= 66) {
              return;
            } else {
              ((jl) this).field_h = true;
              return;
            }
          }
        } else {
          L0: {
            if (((jl) this).field_h) {
              ((jl) this).field_b.a((byte) 118, 0, dl.field_p);
              ((jl) this).field_b.a(dl.field_p, 0, 0);
              ((jl) this).field_h = false;
              break L0;
            } else {
              break L0;
            }
          }
          ((jl) this).field_b.a(param2, -9135);
          ((jl) this).field_b.b(param0, false);
          if (param1 >= 66) {
            return;
          } else {
            ((jl) this).field_h = true;
            return;
          }
        }
    }

    final void a(boolean param0) {
        ((jl) this).field_b.a(1, (byte) 114);
        ((jl) this).field_b.a((jj) null, -9135);
        ((jl) this).field_b.a(ru.field_a, param0, ru.field_a);
        ((jl) this).field_b.a((byte) 125, 0, dl.field_p);
        ((jl) this).field_b.a((byte) 122, 2, bs.field_a);
        ((jl) this).field_b.a(dl.field_p, 0, 0);
        if (param0) {
          ((jl) this).field_b.a(0, (byte) 56);
          if (!((jl) this).field_h) {
            if (((jl) this).field_f != null) {
              ((jl) this).field_j.a((jagdx.IDirect3DVertexShader) null, 5243);
              ((jl) this).field_f = null;
              return;
            } else {
              return;
            }
          } else {
            ((jl) this).field_b.a((byte) 118, 0, dl.field_p);
            ((jl) this).field_b.a(dl.field_p, 0, 0);
            ((jl) this).field_h = false;
            if (((jl) this).field_f != null) {
              ((jl) this).field_j.a((jagdx.IDirect3DVertexShader) null, 5243);
              ((jl) this).field_f = null;
              return;
            } else {
              return;
            }
          }
        } else {
          field_m = null;
          ((jl) this).field_b.a(0, (byte) 56);
          if (((jl) this).field_h) {
            ((jl) this).field_b.a((byte) 118, 0, dl.field_p);
            ((jl) this).field_b.a(dl.field_p, 0, 0);
            ((jl) this).field_h = false;
            if (((jl) this).field_f == null) {
              return;
            } else {
              ((jl) this).field_j.a((jagdx.IDirect3DVertexShader) null, 5243);
              ((jl) this).field_f = null;
              return;
            }
          } else {
            if (((jl) this).field_f != null) {
              ((jl) this).field_j.a((jagdx.IDirect3DVertexShader) null, 5243);
              ((jl) this).field_f = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final void d(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        ec var3 = null;
        L0: {
          if (((jl) this).field_f == null) {
            break L0;
          } else {
            var2 = ((jl) this).field_j.field_Rc;
            var3 = ((jl) this).field_b.J(-120);
            int discarded$2 = var2.SetVertexShaderConstantF(8, var3.a(false, field_m), 2);
            break L0;
          }
        }
        if (param0 != 18580) {
          ((jl) this).field_h = false;
          return;
        } else {
          return;
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        ec var2_ref_ec = null;
        jagdx.IDirect3DDevice var3 = null;
        ec var4 = null;
        L0: {
          if (((jl) this).field_f == null) {
            break L0;
          } else {
            if (!((jl) this).field_q) {
              break L0;
            } else {
              var4 = ((jl) this).field_b.f(false);
              var2_ref_ec = var4;
              var3 = ((jl) this).field_j.field_Rc;
              int discarded$5 = var3.b(13, ((jl) this).field_b.field_g * ((jl) this).field_b.field_Wb, ((jl) this).field_b.field_rb * ((jl) this).field_b.field_Wb, ((jl) this).field_b.field_Hb * ((jl) this).field_b.field_Wb, 1.0f);
              int discarded$6 = var3.b(14, ((jl) this).field_b.field_fb * ((jl) this).field_b.field_g, ((jl) this).field_b.field_fb * ((jl) this).field_b.field_rb, ((jl) this).field_b.field_fb * ((jl) this).field_b.field_Hb, 1.0f);
              int discarded$7 = var3.b(16, ((jl) this).field_b.field_g * ((jl) this).field_b.field_ub, ((jl) this).field_b.field_rb * ((jl) this).field_b.field_ub, ((jl) this).field_b.field_Hb * ((jl) this).field_b.field_ub, 1.0f);
              var4.a(((jl) this).field_b.field_Jb[1], field_o, -11232, ((jl) this).field_b.field_Jb[2], ((jl) this).field_b.field_Jb[0]);
              int discarded$8 = var3.SetVertexShaderConstantF(15, field_o, 1);
              var4.a(((jl) this).field_b.field_Gb[1], field_o, -11232, ((jl) this).field_b.field_Gb[2], ((jl) this).field_b.field_Gb[0]);
              int discarded$9 = var3.SetVertexShaderConstantF(17, field_o, 1);
              break L0;
            }
          }
        }
        var2 = -25;
    }

    final void c(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (param0 != 404277666) {
          return;
        } else {
          L0: {
            if (((jl) this).field_f == null) {
              break L0;
            } else {
              var2 = ((jl) this).field_j.field_Rc;
              int discarded$2 = var2.a(4, ((jl) this).field_b.a(param0 + -404277654, field_m));
              break L0;
            }
          }
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            ((jl) this).a(-128, -51, 116);
            return ((jl) this).field_n;
        }
        return ((jl) this).field_n;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new float[16];
        field_o = new float[4];
    }
}
