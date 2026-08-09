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
            this.a((byte) 62);
        }
        if (this.field_c.field_id && this.field_c.field_Vc && null == this.field_f) {
            var3 = cpa.a(64, this.field_c, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
            var2 = var3;
            if (var2 != null) {
                this.field_f = dga.a(21885, this.field_c, new fca[]{var3});
            }
        }
        return this.field_f != null ? true : false;
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
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    if (var9 >= param3.field_o) {
                      jaggl.OpenGL.glUseProgramObjectARB(0L);
                      jaggl.OpenGL.glPopAttrib();
                      jaggl.OpenGL.glPopMatrix();
                      jaggl.OpenGL.glMatrixMode(5888);
                      jaggl.OpenGL.glPopMatrix();
                      var8 = 1;
                      break L1;
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
                      continue L2;
                    }
                  }
                }
              }
              var12.a(55, 0);
              this.field_c.b(var12, 0);
              stackIn_10_0 = var8;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("mq.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 26860) {
            field_e = (ufa) null;
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
