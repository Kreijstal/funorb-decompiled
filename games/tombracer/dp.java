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
        super((eo) (Object) param0);
        pr var4 = null;
        pr var5 = null;
        pr var6 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ((dp) this).field_f = param2;
        if (param1 == null) {
          ((dp) this).field_e = false;
        } else {
          if (!param0.field_Uc) {
            ((dp) this).field_e = false;
          } else {
            if (param0.field_Pc) {
              L0: {
                L1: {
                  var6 = ka.a((byte) -95, param1.a("gl", (byte) 122, "environment_mapped_water_v"), 35633, param0);
                  var4 = var6;
                  var5 = ka.a((byte) 123, param1.a("gl", (byte) 127, "environment_mapped_water_f"), 35632, param0);
                  ((dp) this).field_k = jm.a(new pr[2], param0, 1);
                  stackOut_7_0 = this;
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (((dp) this).field_k == null) {
                    break L1;
                  } else {
                    stackOut_8_0 = this;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (!((dp) this).field_f.b(-37)) {
                      break L1;
                    } else {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L0;
                    }
                  }
                }
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L0;
              }
              ((dp) this).field_e = stackIn_11_1 != 0;
            } else {
              ((dp) this).field_e = false;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        L0: {
          if (((dp) this).field_h) {
            var4 = 1 << (param1 & 3);
            var5 = (float)(1 << (param1 >> 679313219 & 7)) / 32.0f;
            var6 = 65535 & param2;
            var7 = (float)(3 & param2 >> 1997384720) / 8.0f;
            var8 = ((dp) this).field_k.field_b;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(((dp) this).field_c.field_Dc * var4 % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 55) {
          ((dp) this).a(5);
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (param0 >= -4) {
          L0: {
            boolean discarded$1 = ((dp) this).c(6);
            if (((dp) this).field_h) {
              ((dp) this).field_c.e(1, false);
              ((dp) this).field_c.a(true, (iva) null);
              ((dp) this).field_c.e(0, false);
              ((dp) this).field_c.a(true, (iva) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              ((dp) this).field_h = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((dp) this).field_h) {
              ((dp) this).field_c.e(1, false);
              ((dp) this).field_c.a(true, (iva) null);
              ((dp) this).field_c.e(0, false);
              ((dp) this).field_c.a(true, (iva) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              ((dp) this).field_h = false;
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
          field_i = null;
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
        return ((dp) this).field_e;
    }

    final void a(int param0, boolean param1) {
        long var5 = 0L;
        int var4 = -72 % ((41 - param0) / 62);
        na var3 = ((dp) this).field_c.n(11);
        if (((dp) this).field_e) {
            if (var3 != null) {
                ((dp) this).field_c.e(1, false);
                ((dp) this).field_c.a(true, (iva) (Object) var3);
                ((dp) this).field_c.e(0, false);
                ((dp) this).field_c.a(true, (iva) (Object) ((dp) this).field_f.field_f);
                var5 = ((dp) this).field_k.field_b;
                jaggl.OpenGL.glUseProgramObjectARB(var5);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -((dp) this).field_c.field_Gb[0], -((dp) this).field_c.field_Gb[1], -((dp) this).field_c.field_Gb[2]);
                jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), ((dp) this).field_c.field_sc, ((dp) this).field_c.field_yb, ((dp) this).field_c.field_Kb, 1.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(((dp) this).field_c.field_Gb[1]) * 928.0f + 96.0f);
                ((dp) this).field_h = true;
            }
        }
    }

    final void a(int param0, iva param1, int param2) {
        if (param2 == 24595) {
          if (!((dp) this).field_h) {
            ((dp) this).field_c.a(true, param1);
            ((dp) this).field_c.a((byte) 10, param0);
            return;
          } else {
            return;
          }
        } else {
          boolean discarded$6 = dp.a(93, '￹');
          if (((dp) this).field_h) {
            return;
          } else {
            ((dp) this).field_c.a(true, param1);
            ((dp) this).field_c.a((byte) 10, param0);
            return;
          }
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            field_g = null;
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
          boolean discarded$6 = dp.a(-40, '￫');
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new wm();
        field_g = new su(8, 0, 4, 1);
    }
}
