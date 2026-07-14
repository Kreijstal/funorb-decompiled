/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends sk {
    private jc field_f;
    private em field_g;
    private mo field_h;

    final void a(int param0, int param1, jj param2) {
        if (param1 <= 66) {
            ((fm) this).field_f = (jc) null;
        }
    }

    final void a(boolean param0, boolean param1) {
        ((fm) this).field_b.a(bd.field_C, true, lo.field_j);
        if (param0) {
            boolean discarded$0 = ((fm) this).e(-33);
        }
    }

    final void a(boolean param0, byte param1) {
        jaggl.OpenGL.glBindProgramARB(34336, ((fm) this).field_h.field_d);
        jaggl.OpenGL.glEnable(34336);
        ((fm) this).field_b.a((byte) 125, 0, un.field_i);
        if (param1 <= 2) {
            boolean discarded$0 = ((fm) this).e(51);
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          ((fm) this).field_g = (em) null;
          ((fm) this).field_b.a((byte) 125, 0, dl.field_p);
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          return;
        } else {
          ((fm) this).field_b.a((byte) 125, 0, dl.field_p);
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        float var4 = 0.0f;
        int var4_int = 0;
        if (param0 != 1786747298) {
          L0: {
            ((fm) this).field_f = (jc) null;
            if (((fm) this).field_g.field_e) {
              var4 = (float)(((fm) this).field_b.field_r % 4000) / 4000.0f;
              ((fm) this).field_b.a((jj) (Object) ((fm) this).field_g.field_f, -9135);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0f, 0.0f, 1.0f);
              break L0;
            } else {
              var4_int = 16 * (((fm) this).field_b.field_r % 4000) / 4000;
              ((fm) this).field_b.a((jj) (Object) ((fm) this).field_g.field_i[var4_int], -9135);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((fm) this).field_g.field_e) {
              var4 = (float)(((fm) this).field_b.field_r % 4000) / 4000.0f;
              ((fm) this).field_b.a((jj) (Object) ((fm) this).field_g.field_f, -9135);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0f, 0.0f, 1.0f);
              break L1;
            } else {
              var4_int = 16 * (((fm) this).field_b.field_r % 4000) / 4000;
              ((fm) this).field_b.a((jj) (Object) ((fm) this).field_g.field_i[var4_int], -9135);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
              break L1;
            }
          }
          return;
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        var3 = 1 << param2;
        if (param1 == 111) {
          if ((var3 & hg.field_D) != 0) {
            return;
          } else {
            hg.field_D = hg.field_D | var3;
            r.field_n = r.field_n | var3;
            nk.field_g.a(92, (wf) (Object) new iq(param2));
            if (tt.field_a) {
              if (-7 == param2) {
                nk.field_g.a(116, (wf) (Object) new iq(-1));
                si.c(true);
                return;
              } else {
                return;
              }
            } else {
              sb.field_c.a(param1 + 6, (wf) (Object) new oc(param2, param0, ct.field_x, bo.field_h, se.field_b, ei.field_a - or.field_a));
              if (-7 != param2) {
                return;
              } else {
                nk.field_g.a(116, (wf) (Object) new iq(-1));
                si.c(true);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    fm(jc param0, gk param1, em param2) {
        super((bf) (Object) param0);
        L0: {
          L1: {
            ((fm) this).field_g = param2;
            ((fm) this).field_f = param0;
            if (param1 == null) {
              break L1;
            } else {
              if (!((fm) this).field_g.b(false)) {
                break L1;
              } else {
                if (((fm) this).field_f.field_Vc) {
                  ((fm) this).field_h = ac.a(true, 34336, param1.a("gl", (byte) -71, "transparent_water"), ((fm) this).field_f);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((fm) this).field_h = null;
          break L0;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 3) {
          L0: {
            ((fm) this).field_h = (mo) null;
            if (null == ((fm) this).field_h) {
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
            if (null == ((fm) this).field_h) {
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

    static {
    }
}
