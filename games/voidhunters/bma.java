/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bma extends uda {
    private eb field_e;
    private boolean field_i;
    private boolean field_l;
    private gla field_p;
    private boolean field_g;
    private gla field_m;
    private gla field_k;
    static int field_n;
    static int field_o;
    private float[] field_h;
    private boolean field_f;
    private gla field_j;

    final void a(int param0) {
        ((bma) this).field_d.g(1, -64);
        ((bma) this).field_d.a((ura) null, -114);
        ((bma) this).field_d.a(asa.field_a, true, asa.field_a);
        ((bma) this).field_d.a(0, qcb.field_q, 7);
        ((bma) this).field_d.a(2, pea.field_d, param0 + -2536);
        ((bma) this).field_d.a(0, (byte) -72, qcb.field_q);
        ((bma) this).field_d.g(0, -123);
        if (!((bma) this).field_f) {
          if (param0 == 2543) {
            if (((bma) this).field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              ((bma) this).field_g = false;
              return;
            } else {
              return;
            }
          } else {
            field_o = -55;
            if (((bma) this).field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              ((bma) this).field_g = false;
              return;
            } else {
              return;
            }
          }
        } else {
          ((bma) this).field_d.a(0, qcb.field_q, 7);
          ((bma) this).field_d.a(0, (byte) -118, qcb.field_q);
          ((bma) this).field_f = false;
          if (param0 != 2543) {
            field_o = -55;
            if (!((bma) this).field_g) {
              return;
            } else {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              ((bma) this).field_g = false;
              return;
            }
          } else {
            if (((bma) this).field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              ((bma) this).field_g = false;
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        ((bma) this).field_i = param1 ? true : false;
        ((bma) this).field_d.g(1, -72);
        ((bma) this).field_d.a((ura) (Object) ((bma) this).field_e, param0 + -119);
        ((bma) this).field_d.a(et.field_c, true, df.field_o);
        ((bma) this).field_d.a(0, pea.field_d, param0 ^ 2);
        ((bma) this).field_d.a(true, -21115, false, qcb.field_q, 2);
        ((bma) this).field_d.a(0, (byte) -104, pja.field_l);
        ((bma) this).field_d.g(0, -93);
        if (param0 != 5) {
            ((bma) this).field_j = null;
        } else {
            this.e(0);
            return;
        }
        this.e(0);
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        float stackIn_3_2 = 0.0f;
        float stackIn_3_3 = 0.0f;
        float stackIn_3_4 = 0.0f;
        pf stackIn_3_5 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        float stackIn_4_2 = 0.0f;
        float stackIn_4_3 = 0.0f;
        float stackIn_4_4 = 0.0f;
        pf stackIn_4_5 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        float stackIn_5_2 = 0.0f;
        float stackIn_5_3 = 0.0f;
        float stackIn_5_4 = 0.0f;
        pf stackIn_5_5 = null;
        int stackIn_5_6 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        float stackOut_2_2 = 0.0f;
        float stackOut_2_3 = 0.0f;
        float stackOut_2_4 = 0.0f;
        pf stackOut_2_5 = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        float stackOut_4_2 = 0.0f;
        float stackOut_4_3 = 0.0f;
        float stackOut_4_4 = 0.0f;
        pf stackOut_4_5 = null;
        int stackOut_4_6 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        float stackOut_3_2 = 0.0f;
        float stackOut_3_3 = 0.0f;
        float stackOut_3_4 = 0.0f;
        pf stackOut_3_5 = null;
        int stackOut_3_6 = 0;
        L0: {
          if (((bma) this).field_g) {
            L1: {
              var2 = ((bma) this).field_d.XA();
              var3 = ((bma) this).field_d.i();
              var4 = -((float)(var2 - var3) * 0.125f) + (float)var2;
              var5 = (float)var2 - (float)(var2 - var3) * 0.25f;
              stackOut_2_0 = 34336;
              stackOut_2_1 = 0;
              stackOut_2_2 = var5;
              stackOut_2_3 = var4;
              stackOut_2_4 = 1.0f / (float)((bma) this).field_d.D(100);
              stackOut_2_5 = ((bma) this).field_d;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_4_4 = stackOut_2_4;
              stackIn_4_5 = stackOut_2_5;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              stackIn_3_3 = stackOut_2_3;
              stackIn_3_4 = stackOut_2_4;
              stackIn_3_5 = stackOut_2_5;
              if (param0) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = stackIn_4_4;
                stackOut_4_5 = (pf) (Object) stackIn_4_5;
                stackOut_4_6 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                stackIn_5_5 = stackOut_4_5;
                stackIn_5_6 = stackOut_4_6;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = (pf) (Object) stackIn_3_5;
                stackOut_3_6 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                stackIn_5_4 = stackOut_3_4;
                stackIn_5_5 = stackOut_3_5;
                stackIn_5_6 = stackOut_3_6;
                break L1;
              }
            }
            jaggl.OpenGL.glProgramLocalParameter4fARB(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, (float)((pf) (Object) stackIn_5_5).a(stackIn_5_6 != 0) / 255.0f);
            ((bma) this).field_d.g(1, -42);
            ((bma) this).field_d.e(-122, ((bma) this).field_d.D((byte) -124));
            ((bma) this).field_d.g(0, -81);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          ((bma) this).field_i = true;
          return;
        } else {
          return;
        }
    }

    bma(jp param0, asb param1) {
        super((pf) (Object) param0);
        ((bma) this).field_h = new float[4];
        ((bma) this).field_f = false;
        if (param1 != null) {
            // ifne L37
        }
        ((bma) this).field_l = false;
        ((bma) this).field_p = mha.a(0, param1.a("uw_ground_unlit", true, "gl"), 34336, param0);
        ((bma) this).field_k = mha.a(0, param1.a("uw_ground_lit", true, "gl"), 34336, param0);
        ((bma) this).field_m = mha.a(0, param1.a("uw_model_unlit", true, "gl"), 34336, param0);
        ((bma) this).field_j = mha.a(0, param1.a("uw_model_lit", true, "gl"), 34336, param0);
        if (((((bma) this).field_j != null ? 1 : 0) & ((((bma) this).field_k != null ? 1 : 0) & (null != ((bma) this).field_p ? 1 : 0) & (null != ((bma) this).field_m ? 1 : 0))) != 0) {
            ((bma) this).field_e = ((bma) this).field_d.a(2, false, 1, (byte) -67, new int[2]);
            ((bma) this).field_e.a(false, (byte) -98, false);
            ((bma) this).field_l = true;
        }
        ((bma) this).field_l = false;
    }

    final boolean a(byte param0) {
        int var2 = 100 / ((34 - param0) / 63);
        return ((bma) this).field_l;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 5) {
            ((bma) this).field_k = null;
        }
    }

    private final void e(int param0) {
        int var2 = ((bma) this).field_d.u((byte) 127);
        oj var3 = ((bma) this).field_d.g((byte) 47);
        if (((bma) this).field_i) {
            jaggl.OpenGL.glBindProgramARB(34336, (var2 ^ -1) != -2147483648 ? ((bma) this).field_j.field_c : ((bma) this).field_k.field_c);
        } else {
            jaggl.OpenGL.glBindProgramARB(34336, 2147483647 != var2 ? ((bma) this).field_m.field_c : ((bma) this).field_p.field_c);
        }
        jaggl.OpenGL.glEnable(34336);
        ((bma) this).field_g = true;
        var3.a(((bma) this).field_h, -1.0f, (byte) 67, (float)var2, (float)param0, 0.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, ((bma) this).field_h[0], ((bma) this).field_h[1], ((bma) this).field_h[2], ((bma) this).field_h[3]);
        ((bma) this).b(true);
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            this.e(18);
        }
    }

    final void a(byte param0, int param1, ura param2) {
        if (param2 != null) {
          L0: {
            if (((bma) this).field_f) {
              ((bma) this).field_d.a(0, qcb.field_q, 7);
              ((bma) this).field_d.a(0, (byte) -58, qcb.field_q);
              ((bma) this).field_f = false;
              break L0;
            } else {
              break L0;
            }
          }
          ((bma) this).field_d.a(param2, -118);
          ((bma) this).field_d.h(-122, param1);
          if (param0 < 42) {
            ((bma) this).field_g = false;
            return;
          } else {
            return;
          }
        } else {
          if (!((bma) this).field_f) {
            ((bma) this).field_d.a(((bma) this).field_d.field_Q, -108);
            ((bma) this).field_d.h(-120, 1);
            ((bma) this).field_d.a(0, pja.field_l, 7);
            ((bma) this).field_d.a(0, (byte) -74, pja.field_l);
            ((bma) this).field_f = true;
            if (param0 >= 42) {
              return;
            } else {
              ((bma) this).field_g = false;
              return;
            }
          } else {
            if (param0 >= 42) {
              return;
            } else {
              ((bma) this).field_g = false;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 16;
        field_o = 0;
    }
}
