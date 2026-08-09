/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends vw {
    private boolean field_e;
    private hk field_f;
    private qca field_k;
    private boolean field_h;
    static wm field_j;
    static nh field_d;
    static jea field_i;
    static su field_g;

    dp(kda param0, cn param1, hk param2) {
        super(param0);
        pr var4 = null;
        RuntimeException var4_ref = null;
        pr var5 = null;
        pr var6 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_f = param2;
            if (param1 == null) {
              this.field_e = false;
              return;
            } else {
              if (!param0.field_Uc) {
                this.field_e = false;
                return;
              } else {
                if (param0.field_Pc) {
                  L1: {
                    L2: {
                      var6 = ka.a((byte) -95, param1.a("gl", (byte) 122, "environment_mapped_water_v"), 35633, param0);
                      var4 = var6;
                      var5 = ka.a((byte) 123, param1.a("gl", (byte) 127, "environment_mapped_water_f"), 35632, param0);
                      this.field_k = jm.a(new pr[]{var6, var5}, param0, 1);
                      stackIn_11_0 = this;

                      if (this.field_k == null) {
                        break L2;
                      } else {
                        stackIn_11_0 = this;

                        if (!this.field_f.b(-37)) {
                          break L2;
                        } else {
                          stackIn_12_0 = this;
                          stackIn_12_1 = 1;
                          break L1;
                        }
                      }
                    }
                    stackIn_12_0 = this;
                    stackIn_12_1 = 0;
                    break L1;
                  }
                  ((dp) (this)).field_e = stackIn_12_1 != 0;
                  break L0;
                } else {
                  this.field_e = false;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("dp.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_23_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        float var5;
        int var6;
        float var7;
        long var8;
        L0: {
          if (this.field_h) {
            var4 = 1 << (param1 & 3);
            var5 = (float)(1 << (param1 >> 679313219 & 7)) / 32.0f;
            var6 = 65535 & param2;
            var7 = (float)(3 & param2 >> 1997384720) / 8.0f;
            var8 = this.field_k.field_b;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(this.field_c.field_Dc * var4 % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 55) {
          this.a(5);
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (param0 >= -4) {
          L0: {
            this.c(6);
            if (this.field_h) {
              this.field_c.e(1, false);
              this.field_c.a(true, (iva) null);
              this.field_c.e(0, false);
              this.field_c.a(true, (iva) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              this.field_h = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_h) {
              this.field_c.e(1, false);
              this.field_c.a(true, (iva) null);
              this.field_c.e(0, false);
              this.field_c.a(true, (iva) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              this.field_h = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void d(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != 13936) {
          field_i = (jea) null;
          field_g = null;
          field_d = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            return true;
        }
        return this.field_e;
    }

    final void a(int param0, boolean param1) {
        long var5 = 0L;
        int var4 = -72 % ((41 - param0) / 62);
        na var3 = this.field_c.n(11);
        if (this.field_e && var3 != null) {
            this.field_c.e(1, false);
            this.field_c.a(true, var3);
            this.field_c.e(0, false);
            this.field_c.a(true, this.field_f.field_f);
            var5 = this.field_k.field_b;
            jaggl.OpenGL.glUseProgramObjectARB(var5);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -this.field_c.field_Gb[0], -this.field_c.field_Gb[1], -this.field_c.field_Gb[2]);
            jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), this.field_c.field_sc, this.field_c.field_yb, this.field_c.field_Kb, 1.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(this.field_c.field_Gb[1]) * 928.0f + 96.0f);
            this.field_h = true;
        }
    }

    final void a(int param0, iva param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 24595) {
                break L1;
              } else {
                dp.a(93, '￹');
                break L1;
              }
            }
            if (this.field_h) {
              break L0;
            } else {
              this.field_c.a(true, param1);
              this.field_c.a((byte) 10, param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("dp.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            field_g = (su) null;
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 >= 111) {
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          dp.a(-40, '￫');
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_j = new wm();
        field_g = new su(8, 0, 4, 1);
    }
}
