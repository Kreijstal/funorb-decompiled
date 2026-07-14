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
        fca var3 = null;
        fca var2 = null;
        if (param0 < 2) {
            boolean discarded$0 = ((mq) this).a((byte) 62);
        }
        if (((mq) this).field_c.field_id) {
            if (((mq) this).field_c.field_Vc) {
                if (null == ((mq) this).field_f) {
                    var3 = cpa.a(64, ((mq) this).field_c, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
                    var2 = var3;
                    if (var2 != null) {
                        ((mq) this).field_f = dga.a(21885, ((mq) this).field_c, new fca[1]);
                    }
                }
            }
        }
        return ((mq) this).field_f != null ? true : false;
    }

    final boolean a(int param0, float param1, lha param2, lha param3) {
        kba var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        int var11 = 0;
        cb var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        if (((mq) this).a((byte) 10)) {
          L0: {
            var7 = -116 % ((param0 - -63) / 46);
            var12 = ((mq) this).field_c.field_ic;
            var6 = new kba(((mq) this).field_c, 6408, param3.field_r, param3.field_q);
            var8 = 0;
            ((mq) this).field_c.b((ks) (Object) var12, (byte) 81);
            var12.a(0, var6, true);
            if (!var12.c(86)) {
              break L0;
            } else {
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glMatrixMode(5889);
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
              jaggl.OpenGL.glPushAttrib(2048);
              jaggl.OpenGL.glViewport(0, 0, param3.field_r, param3.field_q);
              jaggl.OpenGL.glUseProgramObjectARB(((mq) this).field_f.field_c);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(((mq) this).field_f.field_c, "heightMap"), 0);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(((mq) this).field_f.field_c, "rcpRelief"), 1.0f / param1);
              jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(((mq) this).field_f.field_c, "sampleSize"), 1.0f / (float)param2.field_r, 1.0f / (float)param2.field_q);
              var9 = 0;
              L1: while (true) {
                if (var9 >= param3.field_o) {
                  jaggl.OpenGL.glUseProgramObjectARB(0L);
                  jaggl.OpenGL.glPopAttrib();
                  jaggl.OpenGL.glPopMatrix();
                  jaggl.OpenGL.glMatrixMode(5888);
                  jaggl.OpenGL.glPopMatrix();
                  var8 = 1;
                  break L0;
                } else {
                  var10 = (float)var9 / (float)param3.field_o;
                  ((mq) this).field_c.a(true, (kl) (Object) param2);
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
                  continue L1;
                }
              }
            }
          }
          var12.a(55, 0);
          ((mq) this).field_c.b((ks) (Object) var12, 0);
          return var8 != 0;
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 26860) {
            field_e = null;
        }
        field_e = null;
        field_d = null;
    }

    mq(cka param0) {
        ((mq) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Cancel";
    }
}
