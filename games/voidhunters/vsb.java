/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vsb extends uda {
    private rga field_e;
    private jp field_f;
    private gla field_g;

    final void a(int param0, boolean param1) {
        jaggl.OpenGL.glBindProgramARB(34336, ((vsb) this).field_g.field_c);
        jaggl.OpenGL.glEnable(34336);
        ((vsb) this).field_d.a(0, pja.field_l, 7);
        if (param0 != 5) {
            Object var4 = null;
            ((vsb) this).a((byte) -95, 120, (ura) null);
        }
    }

    final boolean a(byte param0) {
        int var2 = 38 / ((34 - param0) / 63);
        return ((vsb) this).field_g != null ? true : false;
    }

    final static void e(int param0) {
        if (param0 != -24248) {
            vsb.e(30);
            cea.a(113, 4);
            return;
        }
        cea.a(113, 4);
    }

    final void b(int param0, boolean param1) {
        ((vsb) this).field_d.a(je.field_c, true, et.field_c);
        if (param0 != 5) {
            ((vsb) this).a(0, 25, 20);
        }
    }

    final void a(int param0, int param1, int param2) {
        float var4_float = 0.0f;
        int var4 = 0;
        L0: {
          if (!((vsb) this).field_e.field_b) {
            var4 = 16 * (((vsb) this).field_d.field_pc % 4000) / 4000;
            ((vsb) this).field_d.a((ura) (Object) ((vsb) this).field_e.field_a[var4], -116);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            break L0;
          } else {
            var4_float = (float)(((vsb) this).field_d.field_pc % 4000) / 4000.0f;
            ((vsb) this).field_d.a((ura) (Object) ((vsb) this).field_e.field_d, -125);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4_float, 0.0f, 0.0f, 1.0f);
            break L0;
          }
        }
        if (param2 != 5) {
          ((vsb) this).b(102, true);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, ura param2) {
        if (param0 <= 42) {
            ((vsb) this).field_e = null;
        }
    }

    vsb(jp param0, asb param1, rga param2) {
        super((pf) (Object) param0);
        L0: {
          L1: {
            ((vsb) this).field_f = param0;
            ((vsb) this).field_e = param2;
            if (param1 == null) {
              break L1;
            } else {
              if (!((vsb) this).field_e.c((byte) -65)) {
                break L1;
              } else {
                if (((vsb) this).field_f.field_Ac) {
                  ((vsb) this).field_g = mha.a(0, param1.a("transparent_water", true, "gl"), 34336, ((vsb) this).field_f);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((vsb) this).field_g = null;
          break L0;
        }
    }

    final void a(int param0) {
        ((vsb) this).field_d.a(0, qcb.field_q, param0 + -2536);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        jaggl.OpenGL.glDisable(34336);
        if (param0 != 2543) {
            ((vsb) this).field_f = null;
        }
    }

    static {
    }
}
