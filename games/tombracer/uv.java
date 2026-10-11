/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv extends oga {
    private rt field_i;
    private rt field_x;
    private static String[] field_k;
    static boolean field_o;
    private int field_n;
    private cb field_s;
    static String field_u;
    private cua field_v;
    private int field_r;
    private int field_t;
    private cua field_j;
    private cua field_w;
    private int field_p;
    private rt[] field_l;
    private cb field_q;
    private cua field_m;

    final void a(rt param0, int param1, byte param2, rt param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7_int = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        long var7 = 0L;
        long var8 = 0L;
        long var5_longLifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          jaggl.OpenGL.glPushAttrib(2048);
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
          if (null != this.field_l) {
            this.field_g.b((ks) (this.field_s), (byte) 81);
            var5_int = b.a(this.field_t, (byte) 85);
            var6 = b.a(this.field_n, (byte) 96);
            var7_int = 0;
            {
              while ((!(var5_int <= 256) ||
                !(var6 <= 256))) {
                jaggl.OpenGL.glViewport(0, 0, var5_int, var6);
                this.field_s.a(true, this.field_l[var7_int], 0);
                if (var6 > 256) {
                  var6 = var6 >> 1;
                }
                if (var5_int > 256) {
                  var5_int = var5_int >> 1;
                }
                if (0 != var7_int) {
                  this.field_g.a(true, this.field_l[-1 + var7_int]);
                  jaggl.OpenGL.glBegin(7);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                  jaggl.OpenGL.glVertex2i(0, 0);
                  jaggl.OpenGL.glTexCoord2f(1.0f, 0.0f);
                  jaggl.OpenGL.glVertex2i(1, 0);
                  jaggl.OpenGL.glTexCoord2f(1.0f, 1.0f);
                  jaggl.OpenGL.glVertex2i(1, 1);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 1.0f);
                  jaggl.OpenGL.glVertex2i(0, 1);
                  jaggl.OpenGL.glEnd();
                } else {
                  this.field_g.a(true, param0);
                  jaggl.OpenGL.glBegin(7);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                  jaggl.OpenGL.glVertex2i(0, 0);
                  jaggl.OpenGL.glTexCoord2f((float)this.field_t, 0.0f);
                  jaggl.OpenGL.glVertex2i(1, 0);
                  jaggl.OpenGL.glTexCoord2f((float)this.field_t, (float)this.field_n);
                  jaggl.OpenGL.glVertex2i(1, 1);
                  jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_n);
                  jaggl.OpenGL.glVertex2i(0, 1);
                  jaggl.OpenGL.glEnd();
                }
                var7_int++;
              }
              {
                this.field_g.b(this.field_s, 0);
                this.field_g.a(true, this.field_l[-1 + var7_int]);
                this.field_g.b((ks) (this.field_q), (byte) 81);
                this.field_q.a(0, (byte) -91);
                jaggl.OpenGL.glViewport(0, 0, 256, 256);
                var8 = this.field_v.field_c;
                jaggl.OpenGL.glUseProgramObjectARB(var8);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "params"), ql.field_l, 0.0f, 0.0f);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                jaggl.OpenGL.glVertex2i(0, 0);
                jaggl.OpenGL.glTexCoord2f(1.0f, 0.0f);
                jaggl.OpenGL.glVertex2i(1, 0);
                jaggl.OpenGL.glTexCoord2f(1.0f, 1.0f);
                jaggl.OpenGL.glVertex2i(1, 1);
                jaggl.OpenGL.glTexCoord2f(0.0f, 1.0f);
                jaggl.OpenGL.glVertex2i(0, 1);
                jaggl.OpenGL.glEnd();
                decompiledFrameCompleted0 = false;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_g.a(true, param0);
            this.field_g.b((ks) (this.field_q), (byte) 81);
            this.field_q.a(0, (byte) -91);
            jaggl.OpenGL.glViewport(0, 0, 256, 256);
            var5_long = this.field_m.field_c;
            jaggl.OpenGL.glUseProgramObjectARB(var5_long);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "sceneTex"), 0);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "params"), ql.field_l, 0.0f, 0.0f);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(0, 0);
            jaggl.OpenGL.glTexCoord2f((float)this.field_t, 0.0f);
            jaggl.OpenGL.glVertex2i(1, 0);
            jaggl.OpenGL.glTexCoord2f((float)this.field_t, (float)this.field_n);
            jaggl.OpenGL.glVertex2i(1, 1);
            jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_n);
            jaggl.OpenGL.glVertex2i(0, 1);
            jaggl.OpenGL.glEnd();
          }
          this.field_q.a(1, (byte) -91);
          this.field_g.a(true, this.field_x);
          var5_longLifetime1 = this.field_w.field_c;
          jaggl.OpenGL.glUseProgramObjectARB(var5_longLifetime1);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5_longLifetime1, "baseTex"), 0);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_longLifetime1, "step"), 0.00390625f, 0.0f, 0.0f);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(0, 0);
          jaggl.OpenGL.glTexCoord2f(1.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(1, 0);
          jaggl.OpenGL.glTexCoord2f(1.0f, 1.0f);
          jaggl.OpenGL.glVertex2i(1, 1);
          jaggl.OpenGL.glTexCoord2f(0.0f, 1.0f);
          jaggl.OpenGL.glVertex2i(0, 1);
          jaggl.OpenGL.glEnd();
          this.field_q.a(0, (byte) -91);
          this.field_g.a(true, this.field_i);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_longLifetime1, "step"), 0.0f, 0.00390625f, 0.0f);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(0, 0);
          jaggl.OpenGL.glTexCoord2f(1.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(1, 0);
          if (param2 > -82) {
            uv.d(-13);
          }
          jaggl.OpenGL.glTexCoord2f(1.0f, 1.0f);
          jaggl.OpenGL.glVertex2i(1, 1);
          jaggl.OpenGL.glTexCoord2f(0.0f, 1.0f);
          jaggl.OpenGL.glVertex2i(0, 1);
          jaggl.OpenGL.glEnd();
          jaggl.OpenGL.glPopAttrib();
          jaggl.OpenGL.glPopMatrix();
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_g.b(this.field_q, 0);
          var7 = this.field_j.field_c;
          jaggl.OpenGL.glUseProgramObjectARB(var7);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "sceneTex"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "bloomTex"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "params"), vba.field_v, fra.field_p, 0.0f);
          this.field_g.e(1, true);
          this.field_g.a(true, this.field_x);
          this.field_g.e(0, true);
          this.field_g.a(true, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("uv.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 34842) {
          this.field_m = (cua) null;
          if (!this.field_g.field_id) {
            return false;
          }
          if (this.field_g.field_Vc) {
            return this.field_g.field_z ? true : false;
          }
          return false;
        }
        if (!this.field_g.field_id) {
          return false;
        }
        if (this.field_g.field_Vc) {
          return this.field_g.field_z ? true : false;
        }
        return false;
    }

    final void a(int param0, byte param1, int param2) {
        int incrementValue$0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var6Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        this.field_t = param2;
        this.field_n = param0;
        if (param1 != -71) {
          this.field_w = (cua) null;
        }
        var4 = b.a(this.field_t, (byte) -95);
        var5 = b.a(this.field_n, (byte) -95);
        if (this.field_r == var4 &&
          var5 == this.field_p) {
          return;
        }
        if (this.field_l != null) {
          for (var6 = 0; this.field_l.length > var6; var6++) {
            this.field_l[var6].b(0);
          }
          this.field_l = null;
        }
        if (256 >= var4 &&
          var5 <= 256) {
          this.field_s = null;
          this.field_r = var4;
          this.field_p = var5;
          return;
        }
        var6Lifetime1 = var4;
        var7 = var5;
        var8 = 0;
        while (true) {
          if (var6Lifetime1 <= 256 &&
            256 >= var7) {
            if (this.field_s != null) {
              var6Lifetime1 = var4;
              this.field_l = new rt[var8];
              var7 = var5;
              var8 = 0;
            } else {
              this.field_s = new cb(this.field_g);
              var6Lifetime1 = var4;
              this.field_l = new rt[var8];
              var7 = var5;
              var8 = 0;
            }
            while (true) {
              if (var6Lifetime1 <= 256 &&
                var7 <= 256) {
                this.field_r = var4;
                this.field_p = var5;
                return;
              }
              incrementValue$0 = var8;
              var8++;
              this.field_l[incrementValue$0] = new rt(this.field_g, 3553, 34842, var6Lifetime1, var7);
              if (var6Lifetime1 > 256) {
                var6Lifetime1 = var6Lifetime1 >> 1;
              }
              if (256 >= var7) {
                continue;
              }
              var7 = var7 >> 1;
            }
          }
          if (var6Lifetime1 > 256) {
            var6Lifetime1 = var6Lifetime1 >> 1;
          }
          var8++;
          if (var7 <= 256) {
            continue;
          }
          var7 = var7 >> 1;
        }
    }

    final int b(int param0) {
        if (param0 != 13727) {
          return -92;
        }
        return 1;
    }

    final static hja a(String param0, cn param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hja stackIn_2_0 = null;
        hja stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 8864) {
            stackIn_2_0 = (hja) null;
            return stackIn_2_0;
          }
          var4_int = param1.b(param2, -7768);
          var5 = param1.a(true, param0, var4_int);
          stackIn_4_0 = cu.a(false, var5, param1, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("uv.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        if (param0 >= 78) {
          return this.field_q != null ? true : false;
        }
        String var3 = (String) null;
        uv.a((String) null, (cn) null, (String) null, -53);
        return this.field_q != null ? true : false;
    }

    final void a(int param0, byte param1) {
        jaggl.OpenGL.glUseProgramObjectARB(0L);
        this.field_g.e(1, true);
        this.field_g.a(true, (kl) null);
        this.field_g.e(0, true);
        if (param1 < 117) {
          this.e(-29);
        }
    }

    final boolean a(byte param0) {
        boolean stackIn_18_0 = false;
        if (param0 != 65) {
          this.c((byte) -83);
        }
        if (!this.field_g.field_id) {
          return false;
        }
        if (!this.field_g.field_Vc) {
          return false;
        }
        if (!this.field_g.field_z) {
          return false;
        }
        this.field_q = new cb(this.field_g);
        this.field_x = new rt(this.field_g, 3553, 34842, 256, 256);
        this.field_x.a(false, false, -3554);
        this.field_i = new rt(this.field_g, 3553, 34842, 256, 256);
        this.field_i.a(false, false, -3554);
        this.field_g.b((ks) (this.field_q), (byte) 81);
        this.field_q.a(true, this.field_x, 0);
        this.field_q.a(true, this.field_i, 1);
        this.field_q.a(0, (byte) -91);
        if (!this.field_q.c(-84)) {
          this.field_g.b(this.field_q, 0);
          return false;
        }
        this.field_g.b(this.field_q, 0);
        this.field_m = dga.a(21885, this.field_g, new fca[]{cpa.a(param0 - 1, this.field_g, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
        this.field_v = dga.a(param0 ^ 21820, this.field_g, new fca[]{cpa.a(64, this.field_g, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
        this.field_j = dga.a(21885, this.field_g, new fca[]{cpa.a(64, this.field_g, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
        this.field_w = dga.a(21885, this.field_g, new fca[]{cpa.a(param0 - 1, this.field_g, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
        if (null == this.field_v) {
          return false;
        }
        if (this.field_m == null) {
          return false;
        }
        stackIn_18_0 = (null != this.field_j) && (null != this.field_w);
        return stackIn_18_0;
    }

    uv(cka param0) {
        super(param0);
    }

    public static void f(int param0) {
        if (param0 != 0) {
          return;
        }
        field_u = null;
        field_k = null;
    }

    final static void d(int param0) {
        ql.field_k.k(9, -2988);
        rpa.field_d = true;
        if (param0 != 30785) {
          uv.f(9);
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != 1) {
          field_k = (String[]) null;
          if (!(jj.a(param0, param2, -32842) | (0 != (458752 & param2) ? true : false))) {
            return so.a(param2, (byte) -105, param0) ? true : false;
          }
          return true;
        }
        if (jj.a(param0, param2, -32842) | (0 != (458752 & param2) ? true : false)) {
          return true;
        }
        if (!so.a(param2, (byte) -105, param0)) {
          return false;
        }
        return true;
    }

    final static lqa b(boolean param0) {
        iqa var1 = null;
        iqa var1Lifetime1;
        if (!param0) {
          var1 = baa.field_d.field_i;
          return var1 == null ? null : (lqa) (var1.field_b);
        }
        uv.d(-89);
        var1Lifetime1 = baa.field_d.field_i;
        return var1Lifetime1 == null ? null : (lqa) (var1Lifetime1.field_b);
    }

    final void d(byte param0) {
        this.field_q = null;
        this.field_w = null;
        this.field_x = null;
        this.field_i = null;
        this.field_j = null;
        this.field_s = null;
        this.field_m = null;
        this.field_l = null;
        if (param0 < -9) {
          this.field_v = null;
          return;
        }
    }

    static {
        field_u = "Mirrors";
        field_k = new String[1];
        field_k[0] = "Powerdown";
    }
}
