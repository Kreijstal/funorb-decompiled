/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs {
    private wl field_c;
    static rk field_d;
    static int highscoreMode;
    private in field_b;

    final boolean a(byte param0, sr param1, sr param2, float param3) {
        int var9 = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        cu var7 = null;
        int var8 = 0;
        float var10 = 0.0f;
        int var11 = 0;
        wj var12 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!this.b(true)) {
            return false;
          }
          var6 = 114 % ((param0 - 32) / 42);
          var12 = this.field_c.field_o;
          var7 = new cu(this.field_c, 6408, param1.field_l, param1.field_m);
          var8 = 0;
          this.field_c.a(var12, 32925);
          var12.a(var7, 0, (byte) 119);
          if (var12.d((byte) -64)) {
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            jaggl.OpenGL.glPushAttrib(2048);
            jaggl.OpenGL.glViewport(0, 0, param1.field_l, param1.field_m);
            jaggl.OpenGL.glUseProgramObjectARB(this.field_b.field_d);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_b.field_d, "heightMap"), 0);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_b.field_d, "rcpRelief"), 1.0f / param3);
            jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(this.field_b.field_d, "sampleSize"), 1.0f / (float)param2.field_l, 1.0f / (float)param2.field_m);
            for (var9 = 0; param1.field_n > var9; var9++) {
              var10 = (float)var9 / (float)param1.field_n;
              this.field_c.a(param2, 1);
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
              param1.a(0, 0, -105, param1.field_m, param1.field_l, var9, 0, 0);
            }
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            jaggl.OpenGL.glPopAttrib();
            jaggl.OpenGL.glPopMatrix();
            jaggl.OpenGL.glMatrixMode(5888);
            var8 = 1;
            jaggl.OpenGL.glPopMatrix();
          }
          var12.a(0, (byte) -107);
          this.field_c.b((byte) -113, var12);
          stackIn_11_0 = var8;
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("cs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          return false;
        }
        if (!this.field_c.field_A) {
          return this.field_b != null ? true : false;
        }
        if (!this.field_c.field_lc) {
          return this.field_b != null ? true : false;
        }
        if (null != this.field_b) {
          return this.field_b != null ? true : false;
        }
        aq var3 = kg.a("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, true, this.field_c);
        aq var2 = var3;
        if (var2 != null) {
          this.field_b = br.a(this.field_c, new aq[]{var3}, (byte) -122);
          return this.field_b != null ? true : false;
        }
        return this.field_b != null ? true : false;
    }

    final static byte[] a(boolean param0, int param1, int param2, Object param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        af var5 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == null) {
            return null;
          }
          if (param0) {
            cs.a(true);
          }
          if (param3 instanceof byte[]) {
            var4 = (byte[]) (param3);
            stackIn_8_0 = Bullet.a(var4, param2, (byte) 20, param1);
            return stackIn_8_0;
          }
          if (!(param3 instanceof af)) {
            throw new IllegalArgumentException();
          }
          var5 = (af) (param3);
          stackIn_11_0 = var5.a(-19920, param1, param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("cs.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(cl param0, int param1, cl param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var3_int = param2.field_cb - param0.field_cb;
          if (ul.field_s != param2.field_bb) {
            if (null == param2.field_bb) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param1 >= -50) {
            highscoreMode = -104;
          }
          if (ul.field_s == param0.field_bb) {
            var3_int += 200;
          } else {
            if (param0.field_bb == null) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("cs.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          field_d = (rk) null;
        }
    }

    cs(wl param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "cs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        highscoreMode = 0;
    }
}
