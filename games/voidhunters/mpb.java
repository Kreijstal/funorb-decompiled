/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mpb extends mea {
    private int field_u;
    static int[] field_h;
    private int field_r;
    private int field_q;
    private int field_o;
    private rpa field_j;
    static String[] field_l;
    private rpa field_s;
    static String field_k;
    private aia field_t;
    private of field_g;
    private of field_n;
    private of field_v;
    private of field_m;
    private aia field_i;
    private aia[] field_p;

    final boolean f(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 < 15) {
          return true;
        }
        stackIn_7_0 = (this.field_d.field_U) && (this.field_d.field_B) && (this.field_d.field_I);
        return stackIn_7_0;
    }

    final static java.net.URL a(int param0, java.net.URL param1, byte param2, String param3, String param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_42_0 = null;
          java.net.URL stackIn_44_0 = null;
          RuntimeException stackIn_47_0 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          StringBuilder stackIn_53_1 = null;
          String stackIn_54_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = VoidHunters.field_G;
          try {
            var5 = param1.getFile();
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = !(0 > param0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  decompiledFrameRemainder0 = !(var7_int >= 0);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if ((0 <= var7_int) &&
                      (decompiledFrameRemainder0 = (param3 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (var5.regionMatches(var6, "/s=", 0, 3) ||
                      var5.regionMatches(var6, "/c=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        if (param4 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue;
                        }
                        var6 = var7_int;
                        continue;
                      }
                    }
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (param0 > 0) {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param0));
                    }
                    if (param3 != null &&
                      param3.length() > 0) {
                      discarded$3 = var7.append("/p=");
                      discarded$4 = var7.append(param3);
                    }
                    if (param4 != null &&
                      0 < param4.length()) {
                      discarded$5 = var7.append("/s=");
                      discarded$6 = var7.append(param4);
                    }
                    if (var5.length() <= var6) {
                      discarded$7 = var7.append('/');
                    } else {
                      discarded$8 = var7.append(var5.substring(var6, var5.length()));
                    }
                    try {
                      if (param2 <= 43) {
                        field_l = (String[]) null;
                      }
                      stackIn_42_0 = new java.net.URL(param1, var7.toString());
                      return stackIn_42_0;
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_44_0 = (java.net.URL) (param1);
                      return stackIn_44_0;
                    }
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("mpb.Q(").append(param0).append(',');
            if (param1 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
            if (param4 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(aia param0, int param1, aia param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7_int = 0;
        int var10 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        long var7 = 0L;
        long var8 = 0L;
        long var5_longLifetime1;
        var10 = VoidHunters.field_G;
        try {
          boolean decompiledFrameCompleted0 = true;
          jaggl.OpenGL.glPushAttrib(2048);
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
          if (this.field_p != null) {
            this.field_d.a((byte) -123, (jaa) (this.field_j));
            var5_int = wsb.a(this.field_o, 1302374146);
            var6 = wsb.a(this.field_u, 1302374146);
            var7_int = 0;
            {
              while ((!(256 >= var5_int) ||
                !(var6 <= 256))) {
                jaggl.OpenGL.glViewport(0, 0, var5_int, var6);
                this.field_j.a(0, (byte) -127, this.field_p[var7_int]);
                if (var5_int > 256) {
                  var5_int = var5_int >> 1;
                }
                if (var6 > 256) {
                  var6 = var6 >> 1;
                }
                if (var7_int != 0) {
                  this.field_d.a(80, this.field_p[var7_int - 1]);
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
                  this.field_d.a(40, param0);
                  jaggl.OpenGL.glBegin(7);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                  jaggl.OpenGL.glVertex2i(0, 0);
                  jaggl.OpenGL.glTexCoord2f((float)this.field_o, 0.0f);
                  jaggl.OpenGL.glVertex2i(1, 0);
                  jaggl.OpenGL.glTexCoord2f((float)this.field_o, (float)this.field_u);
                  jaggl.OpenGL.glVertex2i(1, 1);
                  jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_u);
                  jaggl.OpenGL.glVertex2i(0, 1);
                  jaggl.OpenGL.glEnd();
                }
                var7_int++;
              }
              {
                this.field_d.a(this.field_j, 2896);
                this.field_d.a(107, this.field_p[var7_int - 1]);
                this.field_d.a((byte) -124, (jaa) (this.field_s));
                this.field_s.a(0, 0);
                jaggl.OpenGL.glViewport(0, 0, 256, 256);
                var8 = this.field_m.field_c;
                jaggl.OpenGL.glUseProgramObjectARB(var8);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "params"), mqa.field_o, 0.0f, 0.0f);
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
            this.field_d.a(97, param0);
            this.field_d.a((byte) -109, (jaa) (this.field_s));
            this.field_s.a(0, 0);
            jaggl.OpenGL.glViewport(0, 0, 256, 256);
            var5_long = this.field_g.field_c;
            jaggl.OpenGL.glUseProgramObjectARB(var5_long);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "sceneTex"), 0);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "params"), mqa.field_o, 0.0f, 0.0f);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(0, 0);
            jaggl.OpenGL.glTexCoord2f((float)this.field_o, 0.0f);
            jaggl.OpenGL.glVertex2i(1, 0);
            jaggl.OpenGL.glTexCoord2f((float)this.field_o, (float)this.field_u);
            jaggl.OpenGL.glVertex2i(1, 1);
            jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_u);
            jaggl.OpenGL.glVertex2i(0, 1);
            jaggl.OpenGL.glEnd();
          }
          this.field_s.a(0, 1);
          this.field_d.a(param1 + 3097, this.field_i);
          var5_longLifetime1 = this.field_v.field_c;
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
          this.field_s.a(0, 0);
          this.field_d.a(53, this.field_t);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_longLifetime1, "step"), 0.0f, 0.00390625f, 0.0f);
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
          jaggl.OpenGL.glPopAttrib();
          jaggl.OpenGL.glPopMatrix();
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_d.a(this.field_s, 2896);
          var7 = this.field_n.field_c;
          if (param1 != -3009) {
            return;
          }
          jaggl.OpenGL.glUseProgramObjectARB(var7);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "sceneTex"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "bloomTex"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "params"), pba.field_q, u.field_q, 0.0f);
          this.field_d.h(33984, 1);
          this.field_d.a(57, this.field_i);
          this.field_d.h(33984, 0);
          this.field_d.a(73, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("mpb.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var6Lifetime1;
        var9 = VoidHunters.field_G;
        this.field_o = param1;
        this.field_u = param0;
        if (param2 != -19454) {
          this.f((byte) 118);
        }
        var4 = wsb.a(this.field_o, param2 ^ -1302392064);
        var5 = wsb.a(this.field_u, param2 + 1302393600);
        if (this.field_q != var4 ||
          var5 != this.field_r) {
          if (null != this.field_p) {
            for (var6 = 0; var6 < this.field_p.length; var6++) {
              this.field_p[var6].e(0);
            }
            this.field_p = null;
          }
          if (var4 <= 256 &&
            var5 <= 256) {
            this.field_j = null;
          } else {
            var6Lifetime1 = var4;
            var7 = var5;
            var8 = 0;
            if (this.field_j == null) {
              this.field_j = new rpa(this.field_d);
            }
            L5: while (true) {
              if (var6Lifetime1 <= 256 &&
                var7 <= 256) {
                var6Lifetime1 = var4;
                this.field_p = new aia[var8];
                var7 = var5;
                var8 = 0;
                while (true) {
                  if (256 >= var6Lifetime1) {
                    stackIn_30_0 = ~var7;
                    stackIn_30_1 = -257;
                    if (stackIn_30_0 >= stackIn_30_1) {
                      break L5;
                    }
                  }
                  incrementValue$0 = var8;
                  var8++;
                  this.field_p[incrementValue$0] = new aia(this.field_d, 3553, 34842, var6Lifetime1, var7);
                  if (var7 > 256) {
                    var7 = var7 >> 1;
                  }
                  if (var6Lifetime1 <= 256) {
                    continue;
                  }
                  var6Lifetime1 = var6Lifetime1 >> 1;
                }
              }
              if (256 < var6Lifetime1) {
                var6Lifetime1 = var6Lifetime1 >> 1;
              }
              var8++;
              if (256 >= var7) {
                continue;
              }
              var7 = var7 >> 1;
            }
          }
          this.field_r = var5;
          this.field_q = var4;
        }
    }

    final int d(byte param0) {
        if (param0 != 7) {
          return -72;
        }
        return 1;
    }

    final boolean a(int param0) {
        boolean stackIn_12_0 = false;
        int var2;
        if (this.field_d.field_U &&
          this.field_d.field_B &&
          this.field_d.field_I) {
          this.field_s = new rpa(this.field_d);
          this.field_i = new aia(this.field_d, 3553, 34842, 256, 256);
          this.field_i.a(false, false, 10497);
          this.field_t = new aia(this.field_d, 3553, 34842, 256, 256);
          this.field_t.a(false, false, 10497);
          this.field_d.a((byte) -122, (jaa) (this.field_s));
          this.field_s.a(0, (byte) -125, this.field_i);
          this.field_s.a(1, (byte) -128, this.field_t);
          this.field_s.a(0, 0);
          if (!this.field_s.g(92)) {
            this.field_d.a(this.field_s, 2896);
            return false;
          }
          this.field_d.a(this.field_s, 2896);
          this.field_g = wra.a(new ts[]{ccb.a(35632, this.field_d, 18753, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")}, (byte) 107, this.field_d);
          this.field_m = wra.a(new ts[]{ccb.a(35632, this.field_d, 18753, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")}, (byte) 107, this.field_d);
          this.field_n = wra.a(new ts[]{ccb.a(35632, this.field_d, 18753, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")}, (byte) 107, this.field_d);
          this.field_v = wra.a(new ts[]{ccb.a(35632, this.field_d, 18753, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")}, (byte) 107, this.field_d);
          stackIn_12_0 = (null != this.field_m) && (null != this.field_g) && (this.field_n != null) && (null != this.field_v);
          return stackIn_12_0;
        }
        var2 = 89 / ((-43 - param0) / 33);
        return false;
    }

    final boolean f(int param0) {
        if (param0 != -257) {
          this.field_p = (aia[]) null;
        }
        return null != this.field_s ? true : false;
    }

    mpb(qfa param0) {
        super(param0);
    }

    final void a(int param0, int param1) {
        jaggl.OpenGL.glUseProgramObjectARB(0L);
        this.field_d.h(33984, param1);
        this.field_d.a(77, (pib) null);
        this.field_d.h(33984, 0);
    }

    final void c(byte param0) {
        if (param0 != 66) {
          return;
        }
        this.field_j = null;
        this.field_p = null;
        this.field_t = null;
        this.field_s = null;
        this.field_i = null;
        this.field_g = null;
        this.field_m = null;
        this.field_n = null;
        this.field_v = null;
    }

    public static void g(int param0) {
        field_l = null;
        field_k = null;
        field_h = null;
        if (param0 != 0) {
          field_k = (String) null;
        }
    }

    static {
        field_l = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_k = "Don't mind";
    }
}
