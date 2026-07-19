/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    private of field_a;
    private qfa field_b;

    final boolean a(int param0) {
        int var2 = 0;
        ts var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = 69 / ((38 - param0) / 41);
        if (this.field_b.field_U) {
          if (this.field_b.field_B) {
            if (this.field_a == null) {
              var3 = ccb.a(35632, this.field_b, 18753, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
              if (var3 != null) {
                L0: {
                  this.field_a = wra.a(new ts[]{var3}, (byte) 107, this.field_b);
                  if (null == this.field_a) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                return stackIn_23_0 != 0;
              } else {
                L1: {
                  if (null == this.field_a) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L1;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L1;
                  }
                }
                return stackIn_19_0 != 0;
              }
            } else {
              L2: {
                if (null == this.field_a) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
              }
              return stackIn_14_0 != 0;
            }
          } else {
            L3: {
              if (null == this.field_a) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            return stackIn_9_0 != 0;
          }
        } else {
          L4: {
            if (null == this.field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L4;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L4;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(float param0, int param1, ob param2, ob param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        nv var6 = null;
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        ob var11 = null;
        rpa var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
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
        var10 = VoidHunters.field_G;
        try {
          L0: {
            if (!this.a(param1 ^ -28207)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var12 = this.field_b.field_pb;
                var6 = new nv(this.field_b, 6408, param3.field_i, param3.field_k);
                this.field_b.a((byte) -121, (jaa) (var12));
                var7 = 0;
                var12.a(0, var6, (byte) -20);
                if (!var12.g(120)) {
                  break L1;
                } else {
                  jaggl.OpenGL.glPushMatrix();
                  jaggl.OpenGL.glLoadIdentity();
                  jaggl.OpenGL.glMatrixMode(5889);
                  jaggl.OpenGL.glPushMatrix();
                  jaggl.OpenGL.glLoadIdentity();
                  jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                  jaggl.OpenGL.glPushAttrib(2048);
                  jaggl.OpenGL.glViewport(0, 0, param3.field_i, param3.field_k);
                  jaggl.OpenGL.glUseProgramObjectARB(this.field_a.field_c);
                  jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_a.field_c, "heightMap"), 0);
                  jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_a.field_c, "rcpRelief"), 1.0f / param0);
                  jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_a.field_c, "sampleSize"), 1.0f / (float)param2.field_i, 1.0f / (float)param2.field_k);
                  var8 = 0;
                  L2: while (true) {
                    if (param3.field_h <= var8) {
                      jaggl.OpenGL.glUseProgramObjectARB(0L);
                      jaggl.OpenGL.glPopAttrib();
                      jaggl.OpenGL.glPopMatrix();
                      jaggl.OpenGL.glMatrixMode(5888);
                      jaggl.OpenGL.glPopMatrix();
                      var7 = 1;
                      break L1;
                    } else {
                      var9 = (float)var8 / (float)param3.field_h;
                      this.field_b.a(param1 ^ -28269, param2);
                      jaggl.OpenGL.glBegin(7);
                      jaggl.OpenGL.glTexCoord3f(0.0f, 0.0f, var9);
                      jaggl.OpenGL.glVertex2f(0.0f, 0.0f);
                      jaggl.OpenGL.glTexCoord3f(1.0f, 0.0f, var9);
                      jaggl.OpenGL.glVertex2f(1.0f, 0.0f);
                      jaggl.OpenGL.glTexCoord3f(1.0f, 1.0f, var9);
                      jaggl.OpenGL.glVertex2f(1.0f, 1.0f);
                      jaggl.OpenGL.glTexCoord3f(0.0f, 1.0f, var9);
                      jaggl.OpenGL.glVertex2f(0.0f, 1.0f);
                      jaggl.OpenGL.glEnd();
                      param3.a(0, 0, 0, var8, param3.field_k, (byte) 115, param3.field_i, 0);
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
              L3: {
                var12.a(0, (byte) -84);
                if (param1 == -28279) {
                  break L3;
                } else {
                  var11 = (ob) null;
                  discarded$1 = this.a(1.2867883443832397f, -18, (ob) null, (ob) null);
                  break L3;
                }
              }
              this.field_b.a(var12, 2896);
              stackOut_12_0 = var7;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("nk.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    nk(qfa param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
