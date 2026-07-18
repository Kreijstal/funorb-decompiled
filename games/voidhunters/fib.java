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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((fib) this).field_i) {
                ((fib) this).field_d.a(param2, -107);
                ((fib) this).field_d.h(13, param1);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 > 42) {
              break L0;
            } else {
              ((fib) this).a(-23, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("fib.E(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 97 / ((param0 - 34) / 63);
        return ((fib) this).field_e;
    }

    final void a(int param0) {
        if (param0 != 2543) {
          L0: {
            ((fib) this).field_i = true;
            if (((fib) this).field_i) {
              ((fib) this).field_d.g(1, -120);
              ((fib) this).field_d.a((ura) null, -112);
              ((fib) this).field_d.g(0, -91);
              ((fib) this).field_d.a((ura) null, param0 ^ -2450);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              ((fib) this).field_i = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((fib) this).field_i) {
              ((fib) this).field_d.g(1, -120);
              ((fib) this).field_d.a((ura) null, -112);
              ((fib) this).field_d.g(0, -91);
              ((fib) this).field_d.a((ura) null, param0 ^ -2450);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              ((fib) this).field_i = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, boolean param1) {
        hdb var3 = null;
        long var4 = 0L;
        if (param0 != 5) {
          return;
        } else {
          L0: {
            var3 = ((fib) this).field_d.J(param0 ^ 15);
            if (!((fib) this).field_e) {
              break L0;
            } else {
              if (var3 == null) {
                break L0;
              } else {
                ((fib) this).field_d.g(1, -123);
                ((fib) this).field_d.a((ura) (Object) var3, -111);
                ((fib) this).field_d.g(0, -108);
                ((fib) this).field_d.a((ura) (Object) ((fib) this).field_g.field_e, -107);
                var4 = ((fib) this).field_f.field_b;
                jaggl.OpenGL.glUseProgramObjectARB(var4);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -((fib) this).field_d.field_wc[0], -((fib) this).field_d.field_wc[1], -((fib) this).field_d.field_wc[2]);
                jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), ((fib) this).field_d.field_Sb, ((fib) this).field_d.field_u, ((fib) this).field_d.field_x, 1.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + 928.0f * Math.abs(((fib) this).field_d.field_wc[1]));
                ((fib) this).field_i = true;
                break L0;
              }
            }
          }
          return;
        }
    }

    fib(jp param0, asb param1, rga param2) {
        super((pf) (Object) param0);
        ue var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
        ue var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          ((fib) this).field_g = param2;
          if (param1 == null) {
            ((fib) this).field_e = false;
            return;
          } else {
            if (!param0.field_Mc) {
              ((fib) this).field_e = false;
              return;
            } else {
              if (!param0.field_Qc) {
                ((fib) this).field_e = false;
                return;
              } else {
                L0: {
                  L1: {
                    var6 = gha.a(param1.a("environment_mapped_water_v", true, "gl"), 35633, (byte) -15, param0);
                    var4 = var6;
                    var5 = gha.a(param1.a("environment_mapped_water_f", true, "gl"), 35632, (byte) -15, param0);
                    ((fib) this).field_f = gnb.a(0, new ue[2], param0);
                    stackOut_4_0 = this;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((fib) this).field_f == null) {
                      break L1;
                    } else {
                      stackOut_5_0 = this;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (!((fib) this).field_g.b((byte) 63)) {
                        break L1;
                      } else {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        break L0;
                      }
                    }
                  }
                  stackOut_7_0 = this;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L0;
                }
                ((fib) this).field_e = stackIn_8_1 != 0;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("fib.<init>(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          L4: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    public static void e(int param0) {
        field_h = null;
        field_j = null;
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            ((fib) this).field_i = true;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        if (param2 != 5) {
          L0: {
            ((fib) this).a(8);
            if (((fib) this).field_i) {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << (7 & param1 >> 3)) / 32.0f;
              var6 = 65535 & param0;
              var7 = (float)((198236 & param0) >> 16) / 8.0f;
              var8 = ((fib) this).field_f.field_b;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * ((fib) this).field_d.field_pc % 40000) / 40000.0f);
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
            if (((fib) this).field_i) {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << (7 & param1 >> 3)) / 32.0f;
              var6 = 65535 & param0;
              var7 = (float)((198236 & param0) >> 16) / 8.0f;
              var8 = ((fib) this).field_f.field_b;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * ((fib) this).field_d.field_pc % 40000) / 40000.0f);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Enlarges your ship";
    }
}
