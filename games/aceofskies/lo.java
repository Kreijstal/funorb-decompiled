/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends sk {
    static as field_j;
    private io field_h;
    private boolean field_i;
    private em field_f;
    private boolean field_g;

    final void a(int param0, int param1, jj param2) {
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
                this.field_b.a(param2, -9135);
                this.field_b.b(param0, false);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 > 66) {
              break L0;
            } else {
              field_j = (as) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("lo.I(").append(param0).append(',').append(param1).append(',');

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
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            this.a(true);
        }
    }

    public static void c(byte param0) {
        if (param0 <= 115) {
            lo.c((byte) 61);
            field_j = null;
            return;
        }
        field_j = null;
    }

    lo(jc param0, gk param1, em param2) {
        super(param0);
        vj var4 = null;
        RuntimeException var4_ref = null;
        vj var5 = null;
        vj var6 = null;
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
              this.field_g = false;
              return;
            } else {
              if (!param0.field_rc) {
                this.field_g = false;
                return;
              } else {
                if (param0.field_Nc) {
                  L1: {
                    L2: {
                      var6 = l.a((byte) 29, 35633, param1.a("gl", (byte) -71, "environment_mapped_water_v"), param0);
                      var4 = var6;
                      var5 = l.a((byte) 29, 35632, param1.a("gl", (byte) -71, "environment_mapped_water_f"), param0);
                      this.field_h = mo.a(0, param0, new vj[]{var6, var5});
                      stackIn_11_0 = this;

                      if (null == this.field_h) {
                        break L2;
                      } else {
                        stackIn_11_0 = this;

                        if (!this.field_f.a(0)) {
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
                  ((lo) (this)).field_g = stackIn_12_1 != 0;
                  break L0;
                } else {
                  this.field_g = false;
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

            stackIn_16_1 = new StringBuilder().append("lo.<init>(");

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
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_23_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        float var5;
        int var6;
        float var7;
        long var8;
        if (param0 != 1786747298) {
          L0: {
            this.field_h = (io) null;
            if (this.field_i) {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << ((param1 & 58) >> 2027454019)) / 32.0f;
              var6 = param2 & 65535;
              var7 = (float)((param2 & 246595) >> -1094233072) / 8.0f;
              var8 = this.field_h.field_d;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(this.field_b.field_r * var4 % 40000) / 40000.0f);
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
              var5 = (float)(1 << ((param1 & 58) >> 2027454019)) / 32.0f;
              var6 = param2 & 65535;
              var7 = (float)((param2 & 246595) >> -1094233072) / 8.0f;
              var8 = this.field_h.field_d;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(this.field_b.field_r * var4 % 40000) / 40000.0f);
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

    final boolean e(int param0) {
        if (param0 != 3) {
            this.field_h = (io) null;
            return this.field_g;
        }
        return this.field_g;
    }

    final void a(boolean param0, byte param1) {
        go var3;
        long var4;
        if (param1 >= 2) {
          var3 = this.field_b.O(29190);
          if (this.field_g) {
            if (var3 == null) {
              return;
            } else {
              this.field_b.a(1, (byte) 125);
              this.field_b.a(var3, -9135);
              this.field_b.a(0, (byte) 59);
              this.field_b.a(this.field_f.field_a, -9135);
              var4 = this.field_h.field_d;
              jaggl.OpenGL.glUseProgramObjectARB(var4);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_b.field_Jb[0], -this.field_b.field_Jb[1], -this.field_b.field_Jb[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_b.field_g, this.field_b.field_rb, this.field_b.field_Hb, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + 928.0f * Math.abs(this.field_b.field_Jb[1]));
              this.field_i = true;
              return;
            }
          } else {
            return;
          }
        } else {
          field_j = (as) null;
          var3 = this.field_b.O(29190);
          if (!this.field_g) {
            return;
          } else {
            L0: {
              if (var3 != null) {
                this.field_b.a(1, (byte) 125);
                this.field_b.a(var3, -9135);
                this.field_b.a(0, (byte) 59);
                this.field_b.a(this.field_f.field_a, -9135);
                var4 = this.field_h.field_d;
                jaggl.OpenGL.glUseProgramObjectARB(var4);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_b.field_Jb[0], -this.field_b.field_Jb[1], -this.field_b.field_Jb[2]);
                jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_b.field_g, this.field_b.field_rb, this.field_b.field_Hb, 1.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + 928.0f * Math.abs(this.field_b.field_Jb[1]));
                this.field_i = true;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final void a(boolean param0) {
        jj var3;
        if (!this.field_i) {
          if (!param0) {
            var3 = (jj) null;
            this.a(87, -111, (jj) null);
            return;
          } else {
            return;
          }
        } else {
          this.field_b.a(1, (byte) 52);
          this.field_b.a((jj) null, -9135);
          this.field_b.a(0, (byte) 27);
          this.field_b.a((jj) null, -9135);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.field_i = false;
          if (param0) {
            return;
          } else {
            var3 = (jj) null;
            this.a(87, -111, (jj) null);
            return;
          }
        }
    }

    static {
        field_j = new as();
    }
}
