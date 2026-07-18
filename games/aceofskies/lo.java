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
              if (!((lo) this).field_i) {
                ((lo) this).field_b.a(param2, -9135);
                ((lo) this).field_b.b(param0, false);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 > 66) {
              break L0;
            } else {
              field_j = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("lo.I(").append(param0).append(',').append(param1).append(',');
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
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            ((lo) this).a(true);
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
        super((bf) (Object) param0);
        vj var4 = null;
        RuntimeException var4_ref = null;
        vj var5 = null;
        vj var6 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            ((lo) this).field_f = param2;
            if (param1 == null) {
              ((lo) this).field_g = false;
              return;
            } else {
              if (!param0.field_rc) {
                ((lo) this).field_g = false;
                return;
              } else {
                if (param0.field_Nc) {
                  L1: {
                    L2: {
                      var6 = l.a((byte) 29, 35633, param1.a("gl", (byte) -71, "environment_mapped_water_v"), param0);
                      var4 = var6;
                      var5 = l.a((byte) 29, 35632, param1.a("gl", (byte) -71, "environment_mapped_water_f"), param0);
                      ((lo) this).field_h = mo.a(0, param0, new vj[2]);
                      stackOut_8_0 = this;
                      stackIn_11_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (null == ((lo) this).field_h) {
                        break L2;
                      } else {
                        stackOut_9_0 = this;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (!((lo) this).field_f.a(0)) {
                          break L2;
                        } else {
                          stackOut_10_0 = this;
                          stackOut_10_1 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          break L1;
                        }
                      }
                    }
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L1;
                  }
                  ((lo) this).field_g = stackIn_12_1 != 0;
                  break L0;
                } else {
                  ((lo) this).field_g = false;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4_ref;
            stackOut_14_1 = new StringBuilder().append("lo.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        if (param0 != 1786747298) {
          L0: {
            ((lo) this).field_h = null;
            if (((lo) this).field_i) {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << ((param1 & 58) >> 3)) / 32.0f;
              var6 = param2 & 65535;
              var7 = (float)((param2 & 246595) >> 16) / 8.0f;
              var8 = ((lo) this).field_h.field_d;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(((lo) this).field_b.field_r * var4 % 40000) / 40000.0f);
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
            if (((lo) this).field_i) {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << ((param1 & 58) >> 3)) / 32.0f;
              var6 = param2 & 65535;
              var7 = (float)((param2 & 246595) >> 16) / 8.0f;
              var8 = ((lo) this).field_h.field_d;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(((lo) this).field_b.field_r * var4 % 40000) / 40000.0f);
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
            ((lo) this).field_h = null;
            return ((lo) this).field_g;
        }
        return ((lo) this).field_g;
    }

    final void a(boolean param0, byte param1) {
        go var3 = null;
        long var4 = 0L;
        if (param1 >= 2) {
          var3 = ((lo) this).field_b.O(29190);
          if (((lo) this).field_g) {
            if (var3 == null) {
              return;
            } else {
              ((lo) this).field_b.a(1, (byte) 125);
              ((lo) this).field_b.a((jj) (Object) var3, -9135);
              ((lo) this).field_b.a(0, (byte) 59);
              ((lo) this).field_b.a((jj) (Object) ((lo) this).field_f.field_a, -9135);
              var4 = ((lo) this).field_h.field_d;
              jaggl.OpenGL.glUseProgramObjectARB(var4);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -((lo) this).field_b.field_Jb[0], -((lo) this).field_b.field_Jb[1], -((lo) this).field_b.field_Jb[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), ((lo) this).field_b.field_g, ((lo) this).field_b.field_rb, ((lo) this).field_b.field_Hb, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + 928.0f * Math.abs(((lo) this).field_b.field_Jb[1]));
              ((lo) this).field_i = true;
              return;
            }
          } else {
            return;
          }
        } else {
          field_j = null;
          var3 = ((lo) this).field_b.O(29190);
          if (!((lo) this).field_g) {
            return;
          } else {
            L0: {
              if (var3 != null) {
                ((lo) this).field_b.a(1, (byte) 125);
                ((lo) this).field_b.a((jj) (Object) var3, -9135);
                ((lo) this).field_b.a(0, (byte) 59);
                ((lo) this).field_b.a((jj) (Object) ((lo) this).field_f.field_a, -9135);
                var4 = ((lo) this).field_h.field_d;
                jaggl.OpenGL.glUseProgramObjectARB(var4);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -((lo) this).field_b.field_Jb[0], -((lo) this).field_b.field_Jb[1], -((lo) this).field_b.field_Jb[2]);
                jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), ((lo) this).field_b.field_g, ((lo) this).field_b.field_rb, ((lo) this).field_b.field_Hb, 1.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + 928.0f * Math.abs(((lo) this).field_b.field_Jb[1]));
                ((lo) this).field_i = true;
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
        Object var3 = null;
        if (!((lo) this).field_i) {
          if (!param0) {
            var3 = null;
            ((lo) this).a(87, -111, (jj) null);
            return;
          } else {
            return;
          }
        } else {
          ((lo) this).field_b.a(1, (byte) 52);
          ((lo) this).field_b.a((jj) null, -9135);
          ((lo) this).field_b.a(0, (byte) 27);
          ((lo) this).field_b.a((jj) null, -9135);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          ((lo) this).field_i = false;
          if (param0) {
            return;
          } else {
            var3 = null;
            ((lo) this).a(87, -111, (jj) null);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new as();
    }
}
