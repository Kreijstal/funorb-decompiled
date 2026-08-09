/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pja extends vw {
    private hk field_f;
    private kda field_e;
    private mf field_d;

    final void a(int param0, boolean param1) {
        int var3 = 127 / ((param0 - 41) / 62);
        jaggl.OpenGL.glBindProgramARB(34336, this.field_d.field_b);
        jaggl.OpenGL.glEnable(34336);
        this.field_c.a(lja.field_j, 0, -37);
    }

    final void a(int param0, iva param1, int param2) {
        try {
            if (param2 != 24595) {
                this.field_d = (mf) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pja.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 1185) {
          L0: {
            this.field_e = (kda) null;
            if (null == this.field_d) {
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
            if (null == this.field_d) {
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

    final void a(boolean param0, int param1) {
        this.field_c.a(jv.field_m, (byte) -110, ln.field_F);
        if (param1 != 5744) {
            this.a(false, 34);
        }
    }

    final void a(int param0) {
        this.field_c.a(ej.field_c, 0, -123);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        if (param0 > -4) {
          this.field_f = (hk) null;
          jaggl.OpenGL.glDisable(34336);
          return;
        } else {
          jaggl.OpenGL.glDisable(34336);
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        float var4_float;
        int var4;
        L0: {
          if (!this.field_f.field_g) {
            var4 = 16 * (this.field_c.field_Dc % 4000) / 4000;
            this.field_c.a(true, this.field_f.field_d[var4]);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            break L0;
          } else {
            var4_float = (float)(this.field_c.field_Dc % 4000) / 4000.0f;
            this.field_c.a(true, this.field_f.field_c);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4_float, 0.0f, 0.0f, 1.0f);
            break L0;
          }
        }
        if (param0 != 55) {
          this.a(11, true);
          return;
        } else {
          return;
        }
    }

    pja(kda param0, cn param1, hk param2) {
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
            this.field_f = param2;
            this.field_e = param0;
            if (param1 == null) {
              break L0;
            } else {
              if (!this.field_f.c(-30634)) {
                break L0;
              } else {
                if (this.field_e.field_qd) {
                  this.field_d = wd.a((byte) -70, this.field_e, param1.a("gl", (byte) 123, "transparent_water"), 34336);
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          this.field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("pja.<init>(");

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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
    }

    static {
    }
}
