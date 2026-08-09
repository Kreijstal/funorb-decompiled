/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fib extends uda {
    static String field_h;
    private ibb field_f;
    private boolean field_e;
    static waa field_j;
    private boolean field_i;
    private rga field_g;

    final void a(byte param0, int param1, ura param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_i) {
                this.field_d.a(param2, -107);
                this.field_d.h(13, param1);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 > 42) {
              break L0;
            } else {
              this.a(-23, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("fib.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 97 / ((param0 - 34) / 63);
        return this.field_e;
    }

    final void a(int param0) {
        if (param0 != 2543) {
          L0: {
            this.field_i = true;
            if (this.field_i) {
              this.field_d.g(1, -120);
              this.field_d.a((ura) null, -112);
              this.field_d.g(0, -91);
              this.field_d.a((ura) null, param0 ^ -2450);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              this.field_i = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_i) {
              this.field_d.g(1, -120);
              this.field_d.a((ura) null, -112);
              this.field_d.g(0, -91);
              this.field_d.a((ura) null, param0 ^ -2450);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              this.field_i = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, boolean param1) {
        hdb var3;
        long var4;
        if (param0 != 5) {
          return;
        } else {
          L0: {
            var3 = this.field_d.J(param0 ^ 15);
            if (!this.field_e) {
              break L0;
            } else {
              if (var3 == null) {
                break L0;
              } else {
                this.field_d.g(1, -123);
                this.field_d.a(var3, -111);
                this.field_d.g(0, -108);
                this.field_d.a(this.field_g.field_e, -107);
                var4 = this.field_f.field_b;
                jaggl.OpenGL.glUseProgramObjectARB(var4);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_d.field_wc[0], -this.field_d.field_wc[1], -this.field_d.field_wc[2]);
                jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_d.field_Sb, this.field_d.field_u, this.field_d.field_x, 1.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + 928.0f * Math.abs(this.field_d.field_wc[1]));
                this.field_i = true;
                break L0;
              }
            }
          }
          return;
        }
    }

    fib(jp param0, asb param1, rga param2) {
        super(param0);
        ue var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
        ue var6 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_g = param2;
          if (param1 == null) {
            this.field_e = false;
            return;
          } else {
            if (!param0.field_Mc) {
              this.field_e = false;
              return;
            } else {
              if (!param0.field_Qc) {
                this.field_e = false;
                return;
              } else {
                L0: {
                  L1: {
                    var6 = gha.a(param1.a("environment_mapped_water_v", true, "gl"), 35633, (byte) -15, param0);
                    var4 = var6;
                    var5 = gha.a(param1.a("environment_mapped_water_f", true, "gl"), 35632, (byte) -15, param0);
                    this.field_f = gnb.a(0, new ue[]{var6, var5}, param0);
                    stackIn_7_0 = this;

                    if (this.field_f == null) {
                      break L1;
                    } else {
                      stackIn_7_0 = this;

                      if (!this.field_g.b((byte) 63)) {
                        break L1;
                      } else {
                        stackIn_8_0 = this;
                        stackIn_8_1 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_8_0 = this;
                  stackIn_8_1 = 0;
                  break L0;
                }
                ((fib) (this)).field_e = stackIn_8_1 != 0;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4_ref);

            stackIn_15_1 = new StringBuilder().append("fib.<init>(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_22_2 + ')');
        }
    }

    public static void e(int param0) {
        field_h = null;
        field_j = null;
        if (param0 > -66) {
            field_j = (waa) null;
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            this.field_i = true;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        float var5;
        int var6;
        float var7;
        long var8;
        if (param2 != 5) {
          L0: {
            this.a(8);
            if (this.field_i) {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << (7 & param1 >> 344903587)) / 32.0f;
              var6 = 65535 & param0;
              var7 = (float)((198236 & param0) >> 1635449904) / 8.0f;
              var8 = this.field_f.field_b;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * this.field_d.field_pc % 40000) / 40000.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_i) {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << (7 & param1 >> 344903587)) / 32.0f;
              var6 = 65535 & param0;
              var7 = (float)((198236 & param0) >> 1635449904) / 8.0f;
              var8 = this.field_f.field_b;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * this.field_d.field_pc % 40000) / 40000.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_h = "Enlarges your ship";
    }
}
