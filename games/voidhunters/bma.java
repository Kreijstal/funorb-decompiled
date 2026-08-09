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
        this.field_d.g(1, -64);
        this.field_d.a((ura) null, -114);
        this.field_d.a(asa.field_a, true, asa.field_a);
        this.field_d.a(0, qcb.field_q, 7);
        this.field_d.a(2, pea.field_d, param0 + -2536);
        this.field_d.a(0, (byte) -72, qcb.field_q);
        this.field_d.g(0, -123);
        if (!this.field_f) {
          if (param0 == 2543) {
            if (this.field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              this.field_g = false;
              return;
            } else {
              return;
            }
          } else {
            field_o = -55;
            if (this.field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              this.field_g = false;
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_d.a(0, qcb.field_q, 7);
          this.field_d.a(0, (byte) -118, qcb.field_q);
          this.field_f = false;
          if (param0 != 2543) {
            field_o = -55;
            if (!this.field_g) {
              return;
            } else {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              this.field_g = false;
              return;
            }
          } else {
            if (this.field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              this.field_g = false;
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        this.field_i = param1 ? true : false;
        this.field_d.g(1, -72);
        this.field_d.a(this.field_e, param0 + -119);
        this.field_d.a(et.field_c, true, df.field_o);
        this.field_d.a(0, pea.field_d, param0 ^ 2);
        this.field_d.a(true, -21115, false, qcb.field_q, 2);
        this.field_d.a(0, (byte) -104, pja.field_l);
        this.field_d.g(0, -93);
        if (param0 != 5) {
            this.field_j = (gla) null;
        } else {
            this.e(0);
            return;
        }
        this.e(0);
    }

    final void b(boolean param0) {
        int var2;
        int var3;
        float var4;
        float var5;
        int stackIn_4_0;
        int stackIn_4_1;
        float stackIn_4_2;
        float stackIn_4_3;
        float stackIn_4_4;
        pf stackIn_4_5;
        int stackIn_5_0;
        int stackIn_5_1;
        float stackIn_5_2;
        float stackIn_5_3;
        float stackIn_5_4;
        pf stackIn_5_5;
        int stackIn_5_6;
        L0: {
          if (this.field_g) {
            L1: {
              var2 = this.field_d.XA();
              var3 = this.field_d.i();
              var4 = -((float)(var2 - var3) * 0.125f) + (float)var2;
              var5 = (float)var2 - (float)(var2 - var3) * 0.25f;
              stackIn_4_0 = 34336;

              stackIn_4_1 = 0;

              stackIn_4_2 = var5;

              stackIn_4_3 = var4;

              stackIn_4_4 = 1.0f / (float)this.field_d.D(100);

              stackIn_4_5 = this.field_d;

              if (param0) {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = stackIn_4_4;
                stackIn_5_5 = (pf) ((Object) stackIn_4_5);
                stackIn_5_6 = 0;
                break L1;
              } else {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = stackIn_4_4;
                stackIn_5_5 = (pf) ((Object) stackIn_4_5);
                stackIn_5_6 = 1;
                break L1;
              }
            }
            jaggl.OpenGL.glProgramLocalParameter4fARB(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, (float)((pf) (Object) stackIn_5_5).a(stackIn_5_6 != 0) / 255.0f);
            this.field_d.g(1, -42);
            this.field_d.e(-122, this.field_d.D((byte) -124));
            this.field_d.g(0, -81);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          this.field_i = true;
          return;
        } else {
          return;
        }
    }

    bma(jp param0, asb param1) {
        super(param0);
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_h = new float[4];
        this.field_f = false;
        try {
          L0: {
            if (param1 == null) {
              break L0;
            } else {
              if (param0.field_Ac) {
                L1: {
                  this.field_p = mha.a(0, param1.a("uw_ground_unlit", true, "gl"), 34336, param0);
                  this.field_k = mha.a(0, param1.a("uw_ground_lit", true, "gl"), 34336, param0);
                  this.field_m = mha.a(0, param1.a("uw_model_unlit", true, "gl"), 34336, param0);
                  this.field_j = mha.a(0, param1.a("uw_model_lit", true, "gl"), 34336, param0);
                  if (this.field_j == null) {
                    stackIn_7_0 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = 1;
                    break L1;
                  }
                }
                L2: {


                  if (this.field_k == null) {

                    stackIn_10_1 = 0;
                    break L2;
                  } else {

                    stackIn_10_1 = 1;
                    break L2;
                  }
                }
                L3: {




                  if (null == this.field_p) {


                    stackIn_13_2 = 0;
                    break L3;
                  } else {


                    stackIn_13_2 = 1;
                    break L3;
                  }
                }
                L4: {


                  stackIn_15_1 = stackIn_10_1 & stackIn_13_2;

                  if (null == this.field_m) {

                    stackIn_16_1 = stackIn_15_1;
                    stackIn_16_2 = 0;
                    break L4;
                  } else {

                    stackIn_16_1 = stackIn_15_1;
                    stackIn_16_2 = 1;
                    break L4;
                  }
                }
                if ((stackIn_7_0 & (stackIn_16_1 & stackIn_16_2)) == 0) {
                  this.field_l = false;
                  return;
                } else {
                  this.field_e = this.field_d.a(2, false, 1, (byte) -67, new int[]{0, -1});
                  this.field_e.a(false, (byte) -98, false);
                  this.field_l = true;
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          this.field_l = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("bma.<init>(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 100 / ((34 - param0) / 63);
        return this.field_l;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 5) {
            this.field_k = (gla) null;
        }
    }

    private final void e(int param0) {
        int var2 = this.field_d.u((byte) 127);
        oj var3 = this.field_d.g((byte) 47);
        if (this.field_i) {
            jaggl.OpenGL.glBindProgramARB(34336, (var2 ^ -1) != -2147483648 ? this.field_j.field_c : this.field_k.field_c);
        } else {
            jaggl.OpenGL.glBindProgramARB(34336, 2147483647 != var2 ? this.field_m.field_c : this.field_p.field_c);
        }
        jaggl.OpenGL.glEnable(34336);
        this.field_g = true;
        var3.a(this.field_h, -1.0f, (byte) 67, (float)var2, (float)param0, 0.0f);
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_h[0], this.field_h[1], this.field_h[2], this.field_h[3]);
        this.b(true);
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            this.e(18);
        }
    }

    final void a(byte param0, int param1, ura param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 != null) {
                L2: {
                  if (this.field_f) {
                    this.field_d.a(0, qcb.field_q, 7);
                    this.field_d.a(0, (byte) -58, qcb.field_q);
                    this.field_f = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_d.a(param2, -118);
                this.field_d.h(-122, param1);
                break L1;
              } else {
                if (!this.field_f) {
                  this.field_d.a(this.field_d.field_Q, -108);
                  this.field_d.h(-120, 1);
                  this.field_d.a(0, pja.field_l, 7);
                  this.field_d.a(0, (byte) -74, pja.field_l);
                  this.field_f = true;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 >= 42) {
              break L0;
            } else {
              this.field_g = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("bma.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_n = 16;
        field_o = 0;
    }
}
