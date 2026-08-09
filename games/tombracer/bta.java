/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bta extends vw {
    private gf field_p;
    private mf field_r;
    private mf field_o;
    static java.awt.Color field_i;
    private boolean field_m;
    private boolean field_g;
    private boolean field_j;
    static il field_d;
    static int[] field_f;
    static int field_q;
    private float[] field_h;
    private boolean field_k;
    static int[] field_n;
    private mf field_e;
    private mf field_l;

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
            this.a(-124, false);
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            field_i = (java.awt.Color) null;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_k = param1 ? true : false;
        this.field_c.e(1, false);
        this.field_c.a(true, this.field_p);
        this.field_c.a(ln.field_F, (byte) -110, r.field_m);
        this.field_c.a(pea.field_c, 0, -30);
        this.field_c.a(ej.field_c, 2, -6219, true, false);
        this.field_c.a(0, false, lja.field_j);
        int var3 = -29 % ((param0 - 41) / 62);
        this.field_c.e(0, false);
        this.d(-124);
    }

    public static void d(boolean param0) {
        if (param0) {
          field_d = (il) null;
          field_f = null;
          field_i = null;
          field_n = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_i = null;
          field_n = null;
          field_d = null;
          return;
        }
    }

    bta(kda param0, cn param1) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_j = false;
        this.field_h = new float[4];
        try {
          if (param1 == null) {
            this.field_m = false;
            return;
          } else {
            if (!param0.field_qd) {
              this.field_m = false;
              return;
            } else {
              L0: {
                this.field_e = wd.a((byte) -70, param0, param1.a("gl", (byte) 122, "uw_ground_unlit"), 34336);
                this.field_l = wd.a((byte) -70, param0, param1.a("gl", (byte) 126, "uw_ground_lit"), 34336);
                this.field_r = wd.a((byte) -70, param0, param1.a("gl", (byte) 121, "uw_model_unlit"), 34336);
                this.field_o = wd.a((byte) -70, param0, param1.a("gl", (byte) 115, "uw_model_lit"), 34336);
                if (this.field_r == null) {
                  stackIn_6_0 = 0;
                  break L0;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
              L1: {


                if (this.field_e == null) {

                  stackIn_9_1 = 0;
                  break L1;
                } else {

                  stackIn_9_1 = 1;
                  break L1;
                }
              }
              L2: {




                if (null == this.field_l) {


                  stackIn_12_2 = 0;
                  break L2;
                } else {


                  stackIn_12_2 = 1;
                  break L2;
                }
              }
              L3: {
                stackIn_14_0 = stackIn_6_0 & (stackIn_9_1 & stackIn_12_2);

                if (this.field_o == null) {
                  stackIn_15_0 = stackIn_14_0;
                  stackIn_15_1 = 0;
                  break L3;
                } else {
                  stackIn_15_0 = stackIn_14_0;
                  stackIn_15_1 = 1;
                  break L3;
                }
              }
              if ((stackIn_15_0 & stackIn_15_1) != 0) {
                this.field_p = this.field_c.a(true, 1, false, 2, new int[]{0, -1});
                this.field_p.a((byte) -77, false, false);
                this.field_m = true;
                return;
              } else {
                this.field_m = false;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("bta.<init>(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        float var4;
        float var5;
        if (!param0) {
          L0: {
            this.a(false);
            if (this.field_g) {
              var2 = this.field_c.XA();
              var3 = this.field_c.i();
              var4 = (float)var2 - (float)(var2 + -var3) * 0.125f;
              var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_c.g(false), (float)this.field_c.A(-2903) / 255.0f);
              this.field_c.e(1, false);
              this.field_c.g(3625, this.field_c.t(65280));
              this.field_c.e(0, false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_g) {
              var2 = this.field_c.XA();
              var3 = this.field_c.i();
              var4 = (float)var2 - (float)(var2 + -var3) * 0.125f;
              var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_c.g(false), (float)this.field_c.A(-2903) / 255.0f);
              this.field_c.e(1, false);
              this.field_c.g(3625, this.field_c.t(65280));
              this.field_c.e(0, false);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        this.field_c.e(1, false);
        if (param0 >= -4) {
          L0: {
            this.a(73);
            this.field_c.a(true, (iva) null);
            this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
            this.field_c.a(ej.field_c, 0, -49);
            this.field_c.a(pea.field_c, 2, -53);
            this.field_c.a(0, false, ej.field_c);
            this.field_c.e(0, false);
            if (this.field_j) {
              this.field_c.a(ej.field_c, 0, -107);
              this.field_c.a(0, false, ej.field_c);
              this.field_j = false;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (this.field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              this.field_g = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            this.field_c.a(true, (iva) null);
            this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
            this.field_c.a(ej.field_c, 0, -49);
            this.field_c.a(pea.field_c, 2, -53);
            this.field_c.a(0, false, ej.field_c);
            this.field_c.e(0, false);
            if (this.field_j) {
              this.field_c.a(ej.field_c, 0, -107);
              this.field_c.a(0, false, ej.field_c);
              this.field_j = false;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (this.field_g) {
              jaggl.OpenGL.glBindProgramARB(34336, 0);
              jaggl.OpenGL.glDisable(34820);
              jaggl.OpenGL.glDisable(34336);
              this.field_g = false;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final void a(int param0, iva param1, int param2) {
        if (param2 != 24595) {
            return;
        }
        try {
            if (param1 != null || !this.field_j) {
                if (this.field_j) {
                    this.field_c.a(ej.field_c, 0, param2 ^ -24583);
                    this.field_c.a(0, false, ej.field_c);
                    this.field_j = false;
                }
                this.field_c.a(true, param1);
                this.field_c.a((byte) 114, param0);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bta.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            this.field_p = (gf) null;
            return this.field_m;
        }
        return this.field_m;
    }

    private final void d(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int var2;
        asa var3;
        L0: {
          var2 = this.field_c.d(false);
          var3 = this.field_c.E(43);
          if (this.field_k) {
            L1: {
              stackIn_7_0 = 34336;

              if (var2 == 2147483647) {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = this.field_l.field_b;
                break L1;
              } else {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = this.field_o.field_b;
                break L1;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_8_0, stackIn_8_1);
            break L0;
          } else {
            L2: {
              stackIn_3_0 = 34336;

              if (var2 == 2147483647) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_e.field_b;
                break L2;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_r.field_b;
                break L2;
              }
            }
            jaggl.OpenGL.glBindProgramARB(stackIn_4_0, stackIn_4_1);
            break L0;
          }
        }
        jaggl.OpenGL.glEnable(34336);
        this.field_g = true;
        var3.a(32560, 0.0f, 0.0f, this.field_h, (float)var2, -1.0f);
        if (param0 > -123) {
          return;
        } else {
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_h[0], this.field_h[1], this.field_h[2], this.field_h[3]);
          this.a(true);
          return;
        }
    }

    static {
        field_i = new java.awt.Color(10040319);
        field_q = 0;
        field_n = new int[7];
        field_n[6] = 2;
        field_f = new int[7];
        field_n[2] = 0;
        field_n[0] = 0;
        field_n[3] = 1;
        field_n[4] = 1;
        field_n[5] = 2;
        field_n[1] = 0;
        field_f[4] = 3;
        field_f[0] = 6;
        field_f[3] = 2;
        field_f[2] = 4;
        field_f[5] = 0;
        field_f[6] = 1;
        field_f[1] = 5;
    }
}
