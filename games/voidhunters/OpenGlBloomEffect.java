/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlBloomEffect extends OpenGlPostEffect {
    private int sourceHeight;
    static int[] field_h;
    private int textureHeight;
    private int textureWidth;
    private int sourceWidth;
    private OpenGlFramebuffer downsampleFramebuffer;
    static String[] field_l;
    private OpenGlFramebuffer bloomFramebuffer;
    static String field_k;
    private OpenGlTexture2D blurTexture;
    private of rectangleThresholdProgram;
    private of compositeProgram;
    private of blurProgram;
    private of thresholdProgram;
    private OpenGlTexture2D bloomTexture;
    private OpenGlTexture2D[] downsampleTextures;

    final boolean isSupported(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 < 15) {
          return true;
        }
        stackIn_7_0 = (this.toolkit.field_U) && (this.toolkit.field_B) && (this.toolkit.field_I);
        return stackIn_7_0;
    }

    final static java.net.URL rewriteUrlPathParameters(int param0, java.net.URL param1, byte param2, String param3, String param4) {
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
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void setupPass(OpenGlTexture2D param0, int param1, OpenGlTexture2D param2, int param3) {
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
          if (this.downsampleTextures != null) {
            this.toolkit.pushFramebuffer((byte) -123, (OpenGlFramebufferBinding) (this.downsampleFramebuffer));
            var5_int = wsb.a(this.sourceWidth, 1302374146);
            var6 = wsb.a(this.sourceHeight, 1302374146);
            var7_int = 0;
            {
              while ((!(256 >= var5_int) ||
                !(var6 <= 256))) {
                jaggl.OpenGL.glViewport(0, 0, var5_int, var6);
                this.downsampleFramebuffer.attachTexture(0, (byte) -127, this.downsampleTextures[var7_int]);
                if (var5_int > 256) {
                  var5_int = var5_int >> 1;
                }
                if (var6 > 256) {
                  var6 = var6 >> 1;
                }
                if (var7_int != 0) {
                  this.toolkit.bindTexture(80, this.downsampleTextures[var7_int - 1]);
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
                  this.toolkit.bindTexture(40, param0);
                  jaggl.OpenGL.glBegin(7);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                  jaggl.OpenGL.glVertex2i(0, 0);
                  jaggl.OpenGL.glTexCoord2f((float)this.sourceWidth, 0.0f);
                  jaggl.OpenGL.glVertex2i(1, 0);
                  jaggl.OpenGL.glTexCoord2f((float)this.sourceWidth, (float)this.sourceHeight);
                  jaggl.OpenGL.glVertex2i(1, 1);
                  jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.sourceHeight);
                  jaggl.OpenGL.glVertex2i(0, 1);
                  jaggl.OpenGL.glEnd();
                }
                var7_int++;
              }
              {
                this.toolkit.popFramebuffer(this.downsampleFramebuffer, 2896);
                this.toolkit.bindTexture(107, this.downsampleTextures[var7_int - 1]);
                this.toolkit.pushFramebuffer((byte) -124, (OpenGlFramebufferBinding) (this.bloomFramebuffer));
                this.bloomFramebuffer.setDrawBuffer(0, 0);
                jaggl.OpenGL.glViewport(0, 0, 256, 256);
                var8 = this.thresholdProgram.field_c;
                jaggl.OpenGL.glUseProgramObjectARB(var8);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "params"), SetShipPersistence.field_o, 0.0f, 0.0f);
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
            this.toolkit.bindTexture(97, param0);
            this.toolkit.pushFramebuffer((byte) -109, (OpenGlFramebufferBinding) (this.bloomFramebuffer));
            this.bloomFramebuffer.setDrawBuffer(0, 0);
            jaggl.OpenGL.glViewport(0, 0, 256, 256);
            var5_long = this.rectangleThresholdProgram.field_c;
            jaggl.OpenGL.glUseProgramObjectARB(var5_long);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "sceneTex"), 0);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5_long, "params"), SetShipPersistence.field_o, 0.0f, 0.0f);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(0, 0);
            jaggl.OpenGL.glTexCoord2f((float)this.sourceWidth, 0.0f);
            jaggl.OpenGL.glVertex2i(1, 0);
            jaggl.OpenGL.glTexCoord2f((float)this.sourceWidth, (float)this.sourceHeight);
            jaggl.OpenGL.glVertex2i(1, 1);
            jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.sourceHeight);
            jaggl.OpenGL.glVertex2i(0, 1);
            jaggl.OpenGL.glEnd();
          }
          this.bloomFramebuffer.setDrawBuffer(0, 1);
          this.toolkit.bindTexture(param1 + 3097, this.bloomTexture);
          var5_longLifetime1 = this.blurProgram.field_c;
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
          this.bloomFramebuffer.setDrawBuffer(0, 0);
          this.toolkit.bindTexture(53, this.blurTexture);
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
          this.toolkit.popFramebuffer(this.bloomFramebuffer, 2896);
          var7 = this.compositeProgram.field_c;
          if (param1 != -3009) {
            return;
          }
          jaggl.OpenGL.glUseProgramObjectARB(var7);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "sceneTex"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "bloomTex"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var7, "params"), SetDebrisPartitioned.field_q, GetSniperCannonProjectileLife.field_q, 0.0f);
          this.toolkit.setActiveTextureUnit(33984, 1);
          this.toolkit.bindTexture(57, this.bloomTexture);
          this.toolkit.setActiveTextureUnit(33984, 0);
          this.toolkit.bindTexture(73, param0);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    final void resize(int param0, int param1, int param2) {
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
        this.sourceWidth = param1;
        this.sourceHeight = param0;
        if (param2 != -19454) {
          this.isSupported((byte) 118);
        }
        var4 = wsb.a(this.sourceWidth, param2 ^ -1302392064);
        var5 = wsb.a(this.sourceHeight, param2 + 1302393600);
        if (this.textureWidth != var4 ||
          var5 != this.textureHeight) {
          if (null != this.downsampleTextures) {
            for (var6 = 0; var6 < this.downsampleTextures.length; var6++) {
              this.downsampleTextures[var6].dispose(0);
            }
            this.downsampleTextures = null;
          }
          if (var4 <= 256 &&
            var5 <= 256) {
            this.downsampleFramebuffer = null;
          } else {
            var6Lifetime1 = var4;
            var7 = var5;
            var8 = 0;
            if (this.downsampleFramebuffer == null) {
              this.downsampleFramebuffer = new OpenGlFramebuffer(this.toolkit);
            }
            scanLoop1: while (true) {
              if (var6Lifetime1 <= 256 &&
                var7 <= 256) {
                var6Lifetime1 = var4;
                this.downsampleTextures = new OpenGlTexture2D[var8];
                var7 = var5;
                var8 = 0;
                while (true) {
                  if (256 >= var6Lifetime1) {
                    stackIn_30_0 = ~var7;
                    stackIn_30_1 = -257;
                    if (stackIn_30_0 >= stackIn_30_1) {
                      break scanLoop1;
                    }
                  }
                  incrementValue$0 = var8;
                  var8++;
                  this.downsampleTextures[incrementValue$0] = new OpenGlTexture2D(this.toolkit, 3553, 34842, var6Lifetime1, var7);
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
          this.textureHeight = var5;
          this.textureWidth = var4;
        }
    }

    final int getColorBufferPrecision(byte param0) {
        if (param0 != 7) {
          return -72;
        }
        return 1;
    }

    final boolean initialize(int param0) {
        boolean stackIn_12_0 = false;
        int var2;
        if (this.toolkit.field_U &&
          this.toolkit.field_B &&
          this.toolkit.field_I) {
          this.bloomFramebuffer = new OpenGlFramebuffer(this.toolkit);
          this.bloomTexture = new OpenGlTexture2D(this.toolkit, 3553, 34842, 256, 256);
          this.bloomTexture.setWrap(false, false, 10497);
          this.blurTexture = new OpenGlTexture2D(this.toolkit, 3553, 34842, 256, 256);
          this.blurTexture.setWrap(false, false, 10497);
          this.toolkit.pushFramebuffer((byte) -122, (OpenGlFramebufferBinding) (this.bloomFramebuffer));
          this.bloomFramebuffer.attachTexture(0, (byte) -125, this.bloomTexture);
          this.bloomFramebuffer.attachTexture(1, (byte) -128, this.blurTexture);
          this.bloomFramebuffer.setDrawBuffer(0, 0);
          if (!this.bloomFramebuffer.isComplete(92)) {
            this.toolkit.popFramebuffer(this.bloomFramebuffer, 2896);
            return false;
          }
          this.toolkit.popFramebuffer(this.bloomFramebuffer, 2896);
          this.rectangleThresholdProgram = GetTorpedoAcceleration.a(new ts[]{ShipFactory.a(35632, this.toolkit, 18753, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")}, (byte) 107, this.toolkit);
          this.thresholdProgram = GetTorpedoAcceleration.a(new ts[]{ShipFactory.a(35632, this.toolkit, 18753, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")}, (byte) 107, this.toolkit);
          this.compositeProgram = GetTorpedoAcceleration.a(new ts[]{ShipFactory.a(35632, this.toolkit, 18753, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")}, (byte) 107, this.toolkit);
          this.blurProgram = GetTorpedoAcceleration.a(new ts[]{ShipFactory.a(35632, this.toolkit, 18753, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")}, (byte) 107, this.toolkit);
          stackIn_12_0 = (null != this.thresholdProgram) && (null != this.rectangleThresholdProgram) && (this.compositeProgram != null) && (null != this.blurProgram);
          return stackIn_12_0;
        }
        var2 = 89 / ((-43 - param0) / 33);
        return false;
    }

    final boolean isInitialized(int param0) {
        if (param0 != -257) {
          this.downsampleTextures = (OpenGlTexture2D[]) null;
        }
        return null != this.bloomFramebuffer ? true : false;
    }

    OpenGlBloomEffect(OpenGlToolkit param0) {
        super(param0);
    }

    final void finishPass(int param0, int param1) {
        jaggl.OpenGL.glUseProgramObjectARB(0L);
        this.toolkit.setActiveTextureUnit(33984, param1);
        this.toolkit.bindTexture(77, (OpenGlTexture) null);
        this.toolkit.setActiveTextureUnit(33984, 0);
    }

    final void releaseResources(byte param0) {
        if (param0 != 66) {
          return;
        }
        this.downsampleFramebuffer = null;
        this.downsampleTextures = null;
        this.blurTexture = null;
        this.bloomFramebuffer = null;
        this.bloomTexture = null;
        this.rectangleThresholdProgram = null;
        this.thresholdProgram = null;
        this.compositeProgram = null;
        this.blurProgram = null;
    }

    public static void clearSharedReferences(int param0) {
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
