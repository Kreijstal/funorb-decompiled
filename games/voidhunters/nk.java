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
        if (((nk) this).field_b.field_U) {
          if (((nk) this).field_b.field_B) {
            if (((nk) this).field_a == null) {
              var3 = ccb.a(35632, ((nk) this).field_b, 18753, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
              if (var3 != null) {
                L0: {
                  ((nk) this).field_a = wra.a(new ts[1], (byte) 107, ((nk) this).field_b);
                  if (null == ((nk) this).field_a) {
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
                  if (null == ((nk) this).field_a) {
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
                if (null == ((nk) this).field_a) {
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
              if (null == ((nk) this).field_a) {
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
            if (null == ((nk) this).field_a) {
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
        nv var6 = null;
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        Object var11 = null;
        rpa var12 = null;
        var10 = VoidHunters.field_G;
        if (!((nk) this).a(param1 ^ -28207)) {
          return false;
        } else {
          L0: {
            var12 = ((nk) this).field_b.field_pb;
            var6 = new nv(((nk) this).field_b, 6408, param3.field_i, param3.field_k);
            ((nk) this).field_b.a((byte) -121, (jaa) (Object) var12);
            var7 = 0;
            var12.a(0, var6, (byte) -20);
            if (!var12.g(120)) {
              break L0;
            } else {
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glMatrixMode(5889);
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
              jaggl.OpenGL.glPushAttrib(2048);
              jaggl.OpenGL.glViewport(0, 0, param3.field_i, param3.field_k);
              jaggl.OpenGL.glUseProgramObjectARB(((nk) this).field_a.field_c);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(((nk) this).field_a.field_c, "heightMap"), 0);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(((nk) this).field_a.field_c, "rcpRelief"), 1.0f / param0);
              jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(((nk) this).field_a.field_c, "sampleSize"), 1.0f / (float)param2.field_i, 1.0f / (float)param2.field_k);
              var8 = 0;
              L1: while (true) {
                if (param3.field_h <= var8) {
                  jaggl.OpenGL.glUseProgramObjectARB(0L);
                  jaggl.OpenGL.glPopAttrib();
                  jaggl.OpenGL.glPopMatrix();
                  jaggl.OpenGL.glMatrixMode(5888);
                  jaggl.OpenGL.glPopMatrix();
                  var7 = 1;
                  break L0;
                } else {
                  var9 = (float)var8 / (float)param3.field_h;
                  ((nk) this).field_b.a(param1 ^ -28269, (pib) (Object) param2);
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
                  continue L1;
                }
              }
            }
          }
          var12.a(0, (byte) -84);
          if (param1 != -28279) {
            var11 = null;
            boolean discarded$1 = ((nk) this).a(1.2867883443832397f, -18, (ob) null, (ob) null);
            ((nk) this).field_b.a((jaa) (Object) var12, 2896);
            return var7 != 0;
          } else {
            ((nk) this).field_b.a((jaa) (Object) var12, 2896);
            return var7 != 0;
          }
        }
    }

    nk(qfa param0) {
        ((nk) this).field_b = param0;
    }

    static {
    }
}
