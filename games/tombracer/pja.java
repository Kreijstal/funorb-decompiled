/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pja extends vw {
    private hk field_f;
    private kda field_e;
    private mf field_d;

    final void a(int param0, boolean param1) {
        int var3 = 127 / ((param0 - 41) / 62);
        jaggl.OpenGL.glBindProgramARB(34336, ((pja) this).field_d.field_b);
        jaggl.OpenGL.glEnable(34336);
        ((pja) this).field_c.a(lja.field_j, 0, -37);
    }

    final void a(int param0, iva param1, int param2) {
        if (param2 != 24595) {
            ((pja) this).field_d = null;
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
            ((pja) this).field_e = null;
            if (null == ((pja) this).field_d) {
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
            if (null == ((pja) this).field_d) {
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

    final void a(boolean param0, int param1) {
        ((pja) this).field_c.a(jv.field_m, (byte) -110, ln.field_F);
        if (param1 != 5744) {
            ((pja) this).a(false, 34);
        }
    }

    final void a(int param0) {
        ((pja) this).field_c.a(ej.field_c, 0, -123);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        if (param0 > -4) {
          ((pja) this).field_f = null;
          jaggl.OpenGL.glDisable(34336);
          return;
        } else {
          jaggl.OpenGL.glDisable(34336);
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        float var4_float = 0.0f;
        int var4 = 0;
        L0: {
          if (!((pja) this).field_f.field_g) {
            var4 = 16 * (((pja) this).field_c.field_Dc % 4000) / 4000;
            ((pja) this).field_c.a(true, (iva) (Object) ((pja) this).field_f.field_d[var4]);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            break L0;
          } else {
            var4_float = (float)(((pja) this).field_c.field_Dc % 4000) / 4000.0f;
            ((pja) this).field_c.a(true, (iva) (Object) ((pja) this).field_f.field_c);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4_float, 0.0f, 0.0f, 1.0f);
            break L0;
          }
        }
        if (param0 != 55) {
          ((pja) this).a(11, true);
          return;
        } else {
          return;
        }
    }

    pja(kda param0, cn param1, hk param2) {
        super((eo) (Object) param0);
        L0: {
          L1: {
            ((pja) this).field_f = param2;
            ((pja) this).field_e = param0;
            if (param1 == null) {
              break L1;
            } else {
              if (!((pja) this).field_f.c(-30634)) {
                break L1;
              } else {
                if (((pja) this).field_e.field_qd) {
                  ((pja) this).field_d = wd.a((byte) -70, ((pja) this).field_e, param1.a("gl", (byte) 123, "transparent_water"), 34336);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((pja) this).field_d = null;
          break L0;
        }
    }

    static {
    }
}
