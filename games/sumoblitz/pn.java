/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends rq {
    static int[] field_k;
    static String field_n;
    private wg field_f;
    static int field_r;
    static jn field_q;
    private boolean field_e;
    private wg field_g;
    private boolean field_u;
    static hr field_t;
    private float[] field_s;
    private wg field_m;
    private boolean field_h;
    private wg field_j;
    private ru field_o;
    private boolean field_l;
    static int field_i;
    static int[] field_p;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        if (param0 != 260) {
          L0: {
            ((pn) this).a(-12, 3, -112);
            if (((pn) this).field_l) {
              var2 = ((pn) this).field_b.XA();
              var3 = ((pn) this).field_b.i();
              var4 = (float)var2 - (float)(-var3 + var2) * 0.125f;
              var5 = -(0.25f * (float)(var2 + -var3)) + (float)var2;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)((pn) this).field_b.S(98), (float)((pn) this).field_b.e((byte) 99) / 255.0f);
              ((pn) this).field_b.g(1, -116);
              ((pn) this).field_b.a(false, ((pn) this).field_b.v(15));
              ((pn) this).field_b.g(0, -117);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((pn) this).field_l) {
              var2 = ((pn) this).field_b.XA();
              var3 = ((pn) this).field_b.i();
              var4 = (float)var2 - (float)(-var3 + var2) * 0.125f;
              var5 = -(0.25f * (float)(var2 + -var3)) + (float)var2;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)((pn) this).field_b.S(98), (float)((pn) this).field_b.e((byte) 99) / 255.0f);
              ((pn) this).field_b.g(1, -116);
              ((pn) this).field_b.a(false, ((pn) this).field_b.v(15));
              ((pn) this).field_b.g(0, -117);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != 12) {
          field_t = null;
          field_q = null;
          field_k = null;
          field_p = null;
          field_t = null;
          return;
        } else {
          field_q = null;
          field_k = null;
          field_p = null;
          field_t = null;
          return;
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        ut var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        L0: {
          var2 = ((pn) this).field_b.M(-125);
          var3 = ((pn) this).field_b.g((byte) -28);
          if (!((pn) this).field_e) {
            L1: {
              stackOut_5_0 = 34336;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (2147483647 == var2) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = ((pn) this).field_m.field_b;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L1;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = ((pn) this).field_f.field_b;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L1;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_8_0, stackIn_8_1);
            break L0;
          } else {
            L2: {
              stackOut_1_0 = 34336;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (var2 == 2147483647) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = ((pn) this).field_j.field_b;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L2;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = ((pn) this).field_g.field_b;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L2;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_4_0, stackIn_4_1);
            break L0;
          }
        }
        jaggl.OpenGL.glEnable(34336);
        ((pn) this).field_l = true;
        var3.a(0.0f, ((pn) this).field_s, (byte) 71, 0.0f, -1.0f, (float)var2);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ((pn) this).field_s[0], ((pn) this).field_s[1], ((pn) this).field_s[2], ((pn) this).field_s[3]);
        ((pn) this).a(param0 + 246);
        if (param0 != 14) {
          ((pn) this).a(true, 123);
          return;
        } else {
          return;
        }
    }

    pn(on param0, ki param1) {
        super((aw) (Object) param0);
        ((pn) this).field_s = new float[4];
        ((pn) this).field_h = false;
        if (param1 != null) {
            // ifne L37
        }
        ((pn) this).field_u = false;
        ((pn) this).field_m = ve.a((byte) 83, param0, param1.a("uw_ground_unlit", "gl", -1), 34336);
        ((pn) this).field_j = ve.a((byte) 83, param0, param1.a("uw_ground_lit", "gl", -1), 34336);
        ((pn) this).field_f = ve.a((byte) 73, param0, param1.a("uw_model_unlit", "gl", -1), 34336);
        ((pn) this).field_g = ve.a((byte) -120, param0, param1.a("uw_model_lit", "gl", -1), 34336);
        if (((((pn) this).field_f != null ? 1 : 0) & ((((pn) this).field_j != null ? 1 : 0) & (((pn) this).field_m != null ? 1 : 0)) & (null != ((pn) this).field_g ? 1 : 0)) == 0) {
            ((pn) this).field_u = false;
        }
        ((pn) this).field_o = ((pn) this).field_b.a(new int[2], 1, false, -119, 2);
        ((pn) this).field_o.a(false, false, true);
        ((pn) this).field_u = true;
    }

    final void a(boolean param0, byte param1) {
        if (param1 >= -71) {
            pn.d(26);
        }
    }

    final void c(boolean param0) {
        L0: {
          ((pn) this).field_b.g(1, -119);
          ((pn) this).field_b.a((ed) null, 113);
          ((pn) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
          ((pn) this).field_b.a(jq.field_a, 0, 0);
          ((pn) this).field_b.a(mm.field_h, 2, 0);
          ((pn) this).field_b.a(jq.field_a, 0, true);
          ((pn) this).field_b.g(0, -108);
          if (((pn) this).field_h) {
            ((pn) this).field_b.a(jq.field_a, 0, 0);
            ((pn) this).field_b.a(jq.field_a, 0, true);
            ((pn) this).field_h = false;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((pn) this).field_l) {
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            ((pn) this).field_l = false;
            break L1;
          } else {
            break L1;
          }
        }
        if (param0) {
          ((pn) this).field_h = false;
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
            pn.d(21);
            return ((pn) this).field_u;
        }
        return ((pn) this).field_u;
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = uv.b(-25843);
        var2 = fu.e((byte) 78);
        gk.field_v.a(var1 + (kf.field_B << -70628223), -kf.field_B + hu.field_b, (pd.field_l << -738081375) + var2, 19, hh.field_f - pd.field_l);
        if (param0 != -7) {
          return;
        } else {
          sj.a((byte) 124);
          return;
        }
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 == 18834) {
          if (param2 == null) {
            if (!((pn) this).field_h) {
              ((pn) this).field_b.a(((pn) this).field_b.field_D, 97);
              ((pn) this).field_b.h(113, 1);
              ((pn) this).field_b.a(ta.field_a, 0, 0);
              ((pn) this).field_b.a(ta.field_a, 0, true);
              ((pn) this).field_h = true;
              return;
            } else {
              return;
            }
          } else {
            L0: {
              if (((pn) this).field_h) {
                ((pn) this).field_b.a(jq.field_a, 0, 0);
                ((pn) this).field_b.a(jq.field_a, 0, true);
                ((pn) this).field_h = false;
                break L0;
              } else {
                break L0;
              }
            }
            ((pn) this).field_b.a(param2, 121);
            ((pn) this).field_b.h(37, param0);
            return;
          }
        } else {
          field_i = -7;
          if (param2 == null) {
            if (((pn) this).field_h) {
              return;
            } else {
              ((pn) this).field_b.a(((pn) this).field_b.field_D, 97);
              ((pn) this).field_b.h(113, 1);
              ((pn) this).field_b.a(ta.field_a, 0, 0);
              ((pn) this).field_b.a(ta.field_a, 0, true);
              ((pn) this).field_h = true;
              return;
            }
          } else {
            L1: {
              if (((pn) this).field_h) {
                ((pn) this).field_b.a(jq.field_a, 0, 0);
                ((pn) this).field_b.a(jq.field_a, 0, true);
                ((pn) this).field_h = false;
                break L1;
              } else {
                break L1;
              }
            }
            ((pn) this).field_b.a(param2, 121);
            ((pn) this).field_b.h(37, param0);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
            ((pn) this).a(-3, -116, 82);
        }
    }

    final void a(boolean param0, int param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 != 20186) {
          return;
        } else {
          L0: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          ((pn) this).field_e = stackIn_4_1 != 0;
          ((pn) this).field_b.g(1, -112);
          ((pn) this).field_b.a((ed) (Object) ((pn) this).field_o, param1 + -20070);
          ((pn) this).field_b.a((byte) -83, lf.field_e, ua.field_n);
          ((pn) this).field_b.a(mm.field_h, 0, 0);
          ((pn) this).field_b.a((byte) 85, 2, true, false, jq.field_a);
          ((pn) this).field_b.a(ta.field_a, 0, true);
          ((pn) this).field_b.g(0, -108);
          this.e((byte) 14);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[12];
        field_q = new jn();
    }
}
