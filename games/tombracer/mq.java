/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    static String field_d;
    static int field_a;
    static int[] field_b;
    static ufa field_e;
    private cka field_c;
    private cua field_f;

    final boolean a(byte param0) {
        boolean discarded$1 = false;
        fca var2 = null;
        fca var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param0 >= 2) {
            break L0;
          } else {
            discarded$1 = this.a((byte) 62);
            break L0;
          }
        }
        if (this.field_c.field_id) {
          if (this.field_c.field_Vc) {
            if (null == this.field_f) {
              var3 = cpa.a(64, this.field_c, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
              var2 = var3;
              if (var2 == null) {
                L1: {
                  if (this.field_f == null) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L1;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L1;
                  }
                }
                return stackIn_25_0 != 0;
              } else {
                L2: {
                  this.field_f = dga.a(21885, this.field_c, new fca[]{var3});
                  if (this.field_f == null) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L2;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L2;
                  }
                }
                return stackIn_21_0 != 0;
              }
            } else {
              L3: {
                if (this.field_f == null) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            L4: {
              if (this.field_f == null) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            return stackIn_11_0 != 0;
          }
        } else {
          L5: {
            if (this.field_f == null) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L5;
            } else {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L5;
            }
          }
          return stackIn_6_0 != 0;
        }
    }

    final boolean a(int param0, float param1, lha param2, lha param3) {
        RuntimeException var5 = null;
        kba var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        int var11 = 0;
        cb var12 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
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
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a((byte) 10)) {
              L1: {
                var7 = -116 % ((param0 - -63) / 46);
                var12 = this.field_c.field_ic;
                var6 = new kba(this.field_c, 6408, param3.field_r, param3.field_q);
                var8 = 0;
                this.field_c.b((ks) (var12), (byte) 81);
                var12.a(0, var6, true);
                if (!var12.c(86)) {
                  break L1;
                } else {
                  jaggl.OpenGL.glPushMatrix();
                  jaggl.OpenGL.glLoadIdentity();
                  jaggl.OpenGL.glMatrixMode(5889);
                  jaggl.OpenGL.glPushMatrix();
                  jaggl.OpenGL.glLoadIdentity();
                  jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                  jaggl.OpenGL.glPushAttrib(2048);
                  jaggl.OpenGL.glViewport(0, 0, param3.field_r, param3.field_q);
                  jaggl.OpenGL.glUseProgramObjectARB(this.field_f.field_c);
                  jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_f.field_c, "heightMap"), 0);
                  jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_f.field_c, "rcpRelief"), 1.0f / param1);
                  jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_f.field_c, "sampleSize"), 1.0f / (float)param2.field_r, 1.0f / (float)param2.field_q);
                  var9 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var9 >= param3.field_o) {
                          break L4;
                        } else {
                          var10 = (float)var9 / (float)param3.field_o;
                          this.field_c.a(true, param2);
                          jaggl.OpenGL.glBegin(7);
                          jaggl.OpenGL.glTexCoord3f(0.0f, 0.0f, var10);
                          jaggl.OpenGL.glVertex2f(0.0f, 0.0f);
                          jaggl.OpenGL.glTexCoord3f(1.0f, 0.0f, var10);
                          jaggl.OpenGL.glVertex2f(1.0f, 0.0f);
                          jaggl.OpenGL.glTexCoord3f(1.0f, 1.0f, var10);
                          jaggl.OpenGL.glVertex2f(1.0f, 1.0f);
                          jaggl.OpenGL.glTexCoord3f(0.0f, 1.0f, var10);
                          jaggl.OpenGL.glVertex2f(0.0f, 1.0f);
                          jaggl.OpenGL.glEnd();
                          param3.a(0, 0, var9, 0, 0, param3.field_r, 0, param3.field_q);
                          var9++;
                          if (var11 != 0) {
                            break L3;
                          } else {
                            if (var11 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      jaggl.OpenGL.glUseProgramObjectARB(0L);
                      jaggl.OpenGL.glPopAttrib();
                      jaggl.OpenGL.glPopMatrix();
                      jaggl.OpenGL.glMatrixMode(5888);
                      jaggl.OpenGL.glPopMatrix();
                      break L3;
                    }
                    var8 = 1;
                    break L1;
                  }
                }
              }
              var12.a(55, 0);
              this.field_c.b(var12, 0);
              stackOut_12_0 = var8;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("mq.B(").append(param0).append(',').append(param1).append(',');
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
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
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 26860) {
            field_e = (ufa) null;
            field_e = null;
            field_d = null;
            return;
        }
        field_e = null;
        field_d = null;
    }

    mq(cka param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Cancel";
    }
}
