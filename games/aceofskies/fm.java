/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends sk {
    private jc field_f;
    private em field_g;
    private mo field_h;

    final void a(int param0, int param1, jj param2) {
        try {
            if (param1 <= 66) {
                this.field_f = (jc) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "fm.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_b.a(bd.field_C, true, lo.field_j);
        if (param0) {
            this.e(-33);
        }
    }

    final void a(boolean param0, byte param1) {
        jaggl.OpenGL.glBindProgramARB(34336, this.field_h.field_d);
        jaggl.OpenGL.glEnable(34336);
        this.field_b.a((byte) 125, 0, un.field_i);
        if (param1 <= 2) {
            this.e(51);
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          this.field_g = (em) null;
          this.field_b.a((byte) 125, 0, dl.field_p);
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          return;
        } else {
          this.field_b.a((byte) 125, 0, dl.field_p);
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int;
        float var4;
        if (param0 != 1786747298) {
          L0: {
            this.field_f = (jc) null;
            if (this.field_g.field_e) {
              var4 = (float)(this.field_b.field_r % 4000) / 4000.0f;
              this.field_b.a(this.field_g.field_f, -9135);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0f, 0.0f, 1.0f);
              break L0;
            } else {
              var4_int = 16 * (this.field_b.field_r % 4000) / 4000;
              this.field_b.a(this.field_g.field_i[var4_int], -9135);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_g.field_e) {
              var4 = (float)(this.field_b.field_r % 4000) / 4000.0f;
              this.field_b.a(this.field_g.field_f, -9135);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0f, 0.0f, 1.0f);
              break L1;
            } else {
              var4_int = 16 * (this.field_b.field_r % 4000) / 4000;
              this.field_b.a(this.field_g.field_i[var4_int], -9135);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
              break L1;
            }
          }
          return;
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        var3 = 1 << param2;
        if (param1 == 111) {
          if ((var3 & hg.field_D) != 0) {
            return;
          } else {
            hg.field_D = hg.field_D | var3;
            r.field_n = r.field_n | var3;
            nk.field_g.a(92, new iq(param2));
            if (tt.field_a) {
              if (-7 == (param2 ^ -1)) {
                nk.field_g.a(116, new iq(-1));
                si.c(true);
                return;
              } else {
                return;
              }
            } else {
              sb.field_c.a(param1 + 6, new oc(param2, param0, ct.field_x, bo.field_h, se.field_b, ei.field_a - or.field_a));
              if (-7 != (param2 ^ -1)) {
                return;
              } else {
                nk.field_g.a(116, new iq(-1));
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
        super(param0);
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_g = param2;
            this.field_f = param0;
            if (param1 == null) {
              break L0;
            } else {
              if (!this.field_g.b(false)) {
                break L0;
              } else {
                if (this.field_f.field_Vc) {
                  this.field_h = ac.a(true, 34336, param1.a("gl", (byte) -71, "transparent_water"), this.field_f);
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          this.field_h = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("fm.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 3) {
          L0: {
            this.field_h = (mo) null;
            if (null == this.field_h) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == this.field_h) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
    }
}
