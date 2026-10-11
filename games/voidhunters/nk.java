/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    private of field_a;
    private qfa field_b;

    final boolean a(int param0) {
        int var2 = 69 / ((38 - param0) / 41);
        if (!this.field_b.field_U) {
          return null != this.field_a ? true : false;
        }
        if (!this.field_b.field_B) {
          return null != this.field_a ? true : false;
        }
        if (this.field_a != null) {
          return null != this.field_a ? true : false;
        }
        ts var3 = ccb.a(35632, this.field_b, 18753, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
        if (var3 == null) {
          return null != this.field_a ? true : false;
        }
        this.field_a = wra.a(new ts[]{var3}, (byte) 107, this.field_b);
        return null != this.field_a ? true : false;
    }

    final boolean a(float param0, int param1, ob param2, ob param3) {
        int var8 = 0;
        RuntimeException var5 = null;
        nv var6 = null;
        int var7 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        ob var11 = null;
        rpa var12 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          if (!this.a(param1 ^ -28207)) {
            return false;
          }
          var12 = this.field_b.field_pb;
          var6 = new nv(this.field_b, 6408, param3.field_i, param3.field_k);
          this.field_b.a((byte) -121, (jaa) (var12));
          var7 = 0;
          var12.a(0, var6, (byte) -20);
          if (var12.g(120)) {
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
            for (var8 = 0; param3.field_h > var8; var8++) {
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
            }
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            jaggl.OpenGL.glPopAttrib();
            jaggl.OpenGL.glPopMatrix();
            jaggl.OpenGL.glMatrixMode(5888);
            jaggl.OpenGL.glPopMatrix();
            var7 = 1;
          }
          var12.a(0, (byte) -84);
          if (param1 != -28279) {
            var11 = (ob) null;
            this.a(1.2867883443832397f, -18, (ob) null, (ob) null);
          }
          this.field_b.a(var12, 2896);
          stackIn_13_0 = var7;
          return stackIn_13_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("nk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
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
