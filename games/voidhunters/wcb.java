/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wcb extends uda {
    private jagdx.IDirect3DVertexShader field_g;
    private static float[] field_h;
    private rga field_f;
    private nla field_e;

    final void b(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        L0: {
          if (null == ((wcb) this).field_g) {
            break L0;
          } else {
            L1: {
              var2 = ((wcb) this).field_e.field_Mc;
              if (-1 <= (((wcb) this).field_d.field_j ^ -1)) {
                int discarded$4 = var2.b(10, 0.0f, 0.0f, 0.0f, 0.0f);
                break L1;
              } else {
                var3 = ((wcb) this).field_d.field_r;
                var4 = ((wcb) this).field_d.field_p;
                var5 = var4 - 512.0f;
                int discarded$5 = var2.b(10, var5, 1.0f / (var4 - var5), var4, 1.0f / (-var4 + var3));
                break L1;
              }
            }
            ((wcb) this).field_d.e(-126, ((wcb) this).field_d.field_lc);
            break L0;
          }
        }
        if (!param0) {
          ((wcb) this).field_g = null;
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = -120 / ((34 - param0) / 63);
        return ((wcb) this).field_g != null ? true : false;
    }

    final void a(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        L0: {
          if (((wcb) this).field_g == null) {
            break L0;
          } else {
            var2 = ((wcb) this).field_e.field_Mc;
            int discarded$2 = var2.a(4, ((wcb) this).field_d.a(108, field_h));
            break L0;
          }
        }
        if (!param0) {
          ((wcb) this).field_e = null;
          return;
        } else {
          return;
        }
    }

    wcb(nla param0, asb param1, rga param2) {
        super((pf) (Object) param0);
        L0: {
          L1: {
            ((wcb) this).field_f = param2;
            ((wcb) this).field_e = param0;
            if (param1 == null) {
              break L1;
            } else {
              if (!((wcb) this).field_f.c((byte) 60)) {
                break L1;
              } else {
                if ((65535 & ((wcb) this).field_e.field_Hc.VertexShaderVersion ^ -1) <= -258) {
                  ((wcb) this).field_g = ((wcb) this).field_e.field_Mc.b(param1.a("transparent_water", true, "dx"));
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((wcb) this).field_g = null;
          break L0;
        }
    }

    final void d(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        L0: {
          if (null != ((wcb) this).field_g) {
            var2 = ((wcb) this).field_e.field_Mc;
            var3 = ((wcb) this).field_d.p(0);
            float[] discarded$4 = var3.b((byte) 105, field_h);
            field_h[7] = field_h[7] * 0.25f;
            field_h[4] = field_h[4] * 0.25f;
            field_h[6] = field_h[6] * 0.25f;
            field_h[0] = field_h[0] * 0.25f;
            field_h[5] = field_h[5] * 0.25f;
            field_h[3] = field_h[3] * 0.25f;
            field_h[1] = field_h[1] * 0.25f;
            field_h[2] = field_h[2] * 0.25f;
            int discarded$5 = var2.SetVertexShaderConstantF(8, field_h, 2);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 8) {
          ((wcb) this).a(-22, false);
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        ((wcb) this).field_e.a(0, (jagdx.IDirect3DVertexShader) null);
        ((wcb) this).field_d.a(0, qcb.field_q, 7);
        if (param0 != 2543) {
          ((wcb) this).field_g = null;
          ((wcb) this).field_d.a(1, tma.field_q, 7);
          ((wcb) this).field_d.a(2, pea.field_d, 7);
          ((wcb) this).field_d.a(true, false);
          return;
        } else {
          ((wcb) this).field_d.a(1, tma.field_q, 7);
          ((wcb) this).field_d.a(2, pea.field_d, 7);
          ((wcb) this).field_d.a(true, false);
          return;
        }
    }

    final void b(int param0, boolean param1) {
        ((wcb) this).field_d.a(je.field_c, true, df.field_o);
        if (param0 != 5) {
            ((wcb) this).c((byte) 107);
        }
    }

    final void c(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        L0: {
          if (((wcb) this).field_g != null) {
            var2 = ((wcb) this).field_e.field_Mc;
            var3 = ((wcb) this).field_e.E(0);
            int discarded$2 = var2.a(0, var3.a(field_h, (byte) 22));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 5) {
          field_h = null;
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, ura param2) {
        if (param0 < 42) {
            field_h = null;
        }
    }

    final void c(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        oj var3 = null;
        if (param0 != 15) {
          L0: {
            ((wcb) this).field_f = null;
            if (null == ((wcb) this).field_g) {
              break L0;
            } else {
              var2 = ((wcb) this).field_e.field_Mc;
              var3 = ((wcb) this).field_e.E(0);
              int discarded$4 = var2.a(0, var3.a(field_h, (byte) 22));
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null == ((wcb) this).field_g) {
              break L1;
            } else {
              var2 = ((wcb) this).field_e.field_Mc;
              var3 = ((wcb) this).field_e.E(0);
              int discarded$5 = var2.a(0, var3.a(field_h, (byte) 22));
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        float var5_float = 0.0f;
        jagdx.IDirect3DDevice var6 = null;
        jagdx.IDirect3DDevice var7 = null;
        if (param2 != 5) {
          L0: {
            ((wcb) this).a(-112);
            var6 = ((wcb) this).field_e.field_Mc;
            if (!((wcb) this).field_f.field_b) {
              var5 = 16 * (((wcb) this).field_d.field_pc % 4000) / 4000;
              ((wcb) this).field_d.a((ura) (Object) ((wcb) this).field_f.field_a[var5], param2 + -127);
              int discarded$4 = var6.b(11, 0.0f, 0.0f, 0.0f, 0.0f);
              break L0;
            } else {
              var5_float = (float)(((wcb) this).field_d.field_pc % 4000) / 4000.0f;
              ((wcb) this).field_d.a((ura) (Object) ((wcb) this).field_f.field_d, -124);
              int discarded$5 = var6.b(11, var5_float, 0.0f, 0.0f, 0.0f);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var7 = ((wcb) this).field_e.field_Mc;
            if (!((wcb) this).field_f.field_b) {
              var5 = 16 * (((wcb) this).field_d.field_pc % 4000) / 4000;
              ((wcb) this).field_d.a((ura) (Object) ((wcb) this).field_f.field_a[var5], param2 + -127);
              int discarded$6 = var7.b(11, 0.0f, 0.0f, 0.0f, 0.0f);
              break L1;
            } else {
              var5_float = (float)(((wcb) this).field_d.field_pc % 4000) / 4000.0f;
              ((wcb) this).field_d.a((ura) (Object) ((wcb) this).field_f.field_d, -124);
              int discarded$7 = var7.b(11, var5_float, 0.0f, 0.0f, 0.0f);
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, boolean param1) {
        ((wcb) this).field_d.a(0, qcb.field_q, param0 + 2);
        ((wcb) this).field_d.a(1, pea.field_d, 7);
        ((wcb) this).field_d.a(false, -21115, true, tma.field_q, 2);
        ((wcb) this).field_d.a(false, false);
        ((wcb) this).field_e.a(0, ((wcb) this).field_g);
        ((wcb) this).c(param0);
        ((wcb) this).d(8);
        ((wcb) this).a(true);
        ((wcb) this).b(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new float[16];
    }
}
