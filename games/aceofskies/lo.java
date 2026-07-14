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
        L0: {
          if (!((lo) this).field_i) {
            ((lo) this).field_b.a(param2, -9135);
            ((lo) this).field_b.b(param0, false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 <= 66) {
          field_j = (as) null;
          return;
        } else {
          return;
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
        vj var5 = null;
        vj var6 = null;
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
        ((lo) this).field_f = param2;
        if (param1 == null) {
          ((lo) this).field_g = false;
        } else {
          if (!((jc) param0).field_rc) {
            ((lo) this).field_g = false;
          } else {
            if (((jc) param0).field_Nc) {
              L0: {
                L1: {
                  var6 = l.a((byte) 29, 35633, param1.a("gl", (byte) -71, "environment_mapped_water_v"), param0);
                  var4 = var6;
                  var5 = l.a((byte) 29, 35632, param1.a("gl", (byte) -71, "environment_mapped_water_f"), param0);
                  ((lo) this).field_h = mo.a(0, param0, new vj[2]);
                  stackOut_7_0 = this;
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (null == ((lo) this).field_h) {
                    break L1;
                  } else {
                    stackOut_8_0 = this;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (!((lo) this).field_f.a(0)) {
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
              ((lo) this).field_g = stackIn_11_1 != 0;
            } else {
              ((lo) this).field_g = false;
            }
          }
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
            ((lo) this).field_h = (io) null;
            if (((lo) this).field_i) {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << ((param1 & 58) >> 2027454019)) / 32.0f;
              var6 = param2 & 65535;
              var7 = (float)((param2 & 246595) >> -1094233072) / 8.0f;
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
              var5 = (float)(1 << ((param1 & 58) >> 2027454019)) / 32.0f;
              var6 = param2 & 65535;
              var7 = (float)((param2 & 246595) >> -1094233072) / 8.0f;
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
            ((lo) this).field_h = (io) null;
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
          field_j = (as) null;
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
        jj var3 = null;
        if (!((lo) this).field_i) {
          if (!param0) {
            var3 = (jj) null;
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
            var3 = (jj) null;
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
