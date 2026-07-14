/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends sk {
    private mo field_o;
    private mo field_p;
    private mo field_j;
    private float[] field_l;
    private boolean field_f;
    private boolean field_i;
    private boolean field_k;
    static eg field_m;
    private mo field_g;
    private boolean field_h;
    private qi field_n;

    final void a(boolean param0) {
        ((kf) this).field_b.a(1, (byte) 116);
        ((kf) this).field_b.a((jj) null, -9135);
        ((kf) this).field_b.a(ru.field_a, param0, ru.field_a);
        ((kf) this).field_b.a((byte) 126, 0, dl.field_p);
        ((kf) this).field_b.a((byte) 119, 2, bs.field_a);
        ((kf) this).field_b.a(dl.field_p, 0, 0);
        if (param0) {
          ((kf) this).field_b.a(0, (byte) 79);
          if (((kf) this).field_i) {
            L0: {
              ((kf) this).field_b.a((byte) 125, 0, dl.field_p);
              ((kf) this).field_b.a(dl.field_p, 0, 0);
              ((kf) this).field_i = false;
              if (((kf) this).field_h) {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                jaggl.OpenGL.glDisable(34820);
                jaggl.OpenGL.glDisable(34336);
                ((kf) this).field_h = false;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (((kf) this).field_h) {
                jaggl.OpenGL.glBindProgramARB(34336, 0);
                jaggl.OpenGL.glDisable(34820);
                jaggl.OpenGL.glDisable(34336);
                ((kf) this).field_h = false;
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

    private final void h(int param0) {
        int var2 = 0;
        ec var3 = null;
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
          var2 = ((kf) this).field_b.n((byte) -103);
          var3 = ((kf) this).field_b.t(-11198);
          if (!((kf) this).field_f) {
            L1: {
              stackOut_5_0 = 34336;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if ((var2 ^ -1) != -2147483648) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = ((kf) this).field_p.field_d;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L1;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = ((kf) this).field_o.field_d;
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
              if ((var2 ^ -1) != -2147483648) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = ((kf) this).field_j.field_d;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L2;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = ((kf) this).field_g.field_d;
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
        if (param0 != -23521) {
          field_m = (eg) null;
          ((kf) this).field_h = true;
          var3.a(0.0f, -1.0f, ((kf) this).field_l, 0.0f, (float)var2, 11);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ((kf) this).field_l[0], ((kf) this).field_l[1], ((kf) this).field_l[2], ((kf) this).field_l[3]);
          ((kf) this).a(10);
          return;
        } else {
          ((kf) this).field_h = true;
          var3.a(0.0f, -1.0f, ((kf) this).field_l, 0.0f, (float)var2, 11);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ((kf) this).field_l[0], ((kf) this).field_l[1], ((kf) this).field_l[2], ((kf) this).field_l[3]);
          ((kf) this).a(10);
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            ((kf) this).field_o = (mo) null;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            return true;
        }
        return ((kf) this).field_k;
    }

    kf(jc param0, gk param1) {
        super((bf) (Object) param0);
        ((kf) this).field_l = new float[4];
        ((kf) this).field_i = false;
        if (param1 != null) {
            // ifne L37
        }
        ((kf) this).field_k = false;
        ((kf) this).field_o = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_ground_unlit"), param0);
        ((kf) this).field_g = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_ground_lit"), param0);
        ((kf) this).field_p = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_model_unlit"), param0);
        ((kf) this).field_j = ac.a(true, 34336, param1.a("gl", (byte) -71, "uw_model_lit"), param0);
        if (((null != ((kf) this).field_p ? 1 : 0) & ((((kf) this).field_o != null ? 1 : 0) & (((kf) this).field_g != null ? 1 : 0)) & (((kf) this).field_j != null ? 1 : 0)) != 0) {
            ((kf) this).field_n = ((kf) this).field_b.a(new int[2], 2, 0, false, 1);
            ((kf) this).field_n.a(false, false, (byte) -127);
            ((kf) this).field_k = true;
        }
        ((kf) this).field_k = false;
    }

    public static void g(int param0) {
        if (param0 != 25320) {
            kf.g(57);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
            ((kf) this).field_g = (mo) null;
        }
    }

    final void a(int param0, int param1, jj param2) {
        L0: {
          if (param1 > 66) {
            break L0;
          } else {
            kf.g(59);
            break L0;
          }
        }
        if (param2 == null) {
          if (((kf) this).field_i) {
            return;
          } else {
            ((kf) this).field_b.a(((kf) this).field_b.field_Kb, -9135);
            ((kf) this).field_b.b(1, false);
            ((kf) this).field_b.a((byte) 118, 0, un.field_i);
            ((kf) this).field_b.a(un.field_i, 0, 0);
            ((kf) this).field_i = true;
            return;
          }
        } else {
          L1: {
            if (((kf) this).field_i) {
              ((kf) this).field_b.a((byte) 120, 0, dl.field_p);
              ((kf) this).field_b.a(dl.field_p, 0, 0);
              ((kf) this).field_i = false;
              break L1;
            } else {
              break L1;
            }
          }
          ((kf) this).field_b.a(param2, -9135);
          ((kf) this).field_b.b(param0, false);
          return;
        }
    }

    final static void f(int param0) {
        ud.field_e = null;
        ji.field_b = null;
        lh.field_a = null;
        fk.field_a = (byte[][]) null;
        ee.field_e = null;
        if (param0 != 1) {
          field_m = (eg) null;
          lg.field_j = null;
          return;
        } else {
          lg.field_j = null;
          return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        L0: {
          if (((kf) this).field_h) {
            var2 = ((kf) this).field_b.XA();
            var3 = ((kf) this).field_b.i();
            var4 = (float)var2 - 0.125f * (float)(-var3 + var2);
            var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)((kf) this).field_b.j((byte) 5), (float)((kf) this).field_b.H(param0 ^ 111) / 255.0f);
            ((kf) this).field_b.a(1, (byte) 52);
            ((kf) this).field_b.a((byte) -74, ((kf) this).field_b.q(0));
            ((kf) this).field_b.a(0, (byte) 35);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 10) {
          kf.g(-79);
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 <= 2) {
          L0: {
            ((kf) this).field_k = false;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((kf) this).field_f = stackIn_8_1 != 0;
          ((kf) this).field_b.a(1, (byte) 81);
          ((kf) this).field_b.a((jj) (Object) ((kf) this).field_n, -9135);
          ((kf) this).field_b.a(du.field_l, true, bd.field_C);
          ((kf) this).field_b.a((byte) 127, 0, bs.field_a);
          ((kf) this).field_b.a(true, 2, true, dl.field_p, false);
          ((kf) this).field_b.a(un.field_i, 0, 0);
          ((kf) this).field_b.a(0, (byte) 109);
          this.h(-23521);
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((kf) this).field_f = stackIn_4_1 != 0;
          ((kf) this).field_b.a(1, (byte) 81);
          ((kf) this).field_b.a((jj) (Object) ((kf) this).field_n, -9135);
          ((kf) this).field_b.a(du.field_l, true, bd.field_C);
          ((kf) this).field_b.a((byte) 127, 0, bs.field_a);
          ((kf) this).field_b.a(true, 2, true, dl.field_p, false);
          ((kf) this).field_b.a(un.field_i, 0, 0);
          ((kf) this).field_b.a(0, (byte) 109);
          this.h(-23521);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new eg();
    }
}
