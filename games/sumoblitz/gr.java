/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr extends bq {
    static boolean field_e;
    private ch field_j;
    static int[] field_h;
    private boolean field_k;
    static String field_g;
    private sn field_i;
    private boolean field_f;
    static int field_l;

    final void b(int param0) {
        L0: {
          if (this.field_k) {
            this.field_b.g(1, 90);
            this.field_b.a(123, (ht) null);
            this.field_b.g(0, 126);
            this.field_b.a(75, (ht) null);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            this.field_k = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -125) {
          this.b(-69);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, ht param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 35) {
                break L1;
              } else {
                this.a((byte) 25, true);
                break L1;
              }
            }
            if (!this.field_k) {
              this.field_b.a(82, param2);
              this.field_b.c(param1, true);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("gr.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 > -64) {
            this.field_i = (sn) null;
            return this.field_f;
        }
        return this.field_f;
    }

    final void a(int param0, boolean param1) {
        if (param0 >= -30) {
            this.a(-89, false);
        }
    }

    public static void c(byte param0) {
        field_g = null;
        field_h = null;
        if (param0 != -19) {
            field_e = true;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        float var5;
        int var6;
        float var7;
        float var8;
        float var9;
        int var10;
        long var11;
        if (param0 < 39) {
          L0: {
            field_l = -80;
            if (this.field_k) {
              var4 = 1 << (3 & param1);
              var5 = (float)(1 << (param1 >> 1134042051 & 7)) / 32.0f;
              var6 = 65535 & param2;
              var7 = (float)(3 & param2 >> -988554192) / 8.0f;
              var8 = (float)((7941702 & param2) >> 1537316339) / 16.0f;
              var9 = (float)((param2 & 132918055) >> 926186711) / 16.0f;
              var10 = (2044859413 & param2) >> -1501936741;
              var11 = this.field_i.field_c;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * this.field_b.field_Ac % 40000) / 40000.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float)var6);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
              jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float)var10);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_k) {
              var4 = 1 << (3 & param1);
              var5 = (float)(1 << (param1 >> 1134042051 & 7)) / 32.0f;
              var6 = 65535 & param2;
              var7 = (float)(3 & param2 >> -988554192) / 8.0f;
              var8 = (float)((7941702 & param2) >> 1537316339) / 16.0f;
              var9 = (float)((param2 & 132918055) >> 926186711) / 16.0f;
              var10 = (2044859413 & param2) >> -1501936741;
              var11 = this.field_i.field_c;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * this.field_b.field_Ac % 40000) / 40000.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float)var6);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
              jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float)var10);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    gr(fr param0, ch param1) {
        super(param0);
        mk var5 = null;
        mk var4 = null;
        this.field_k = false;
        this.field_f = false;
        try {
            this.field_j = param1;
            if (this.field_j.field_c != null && this.field_b.field_N) {
                if (!this.field_b.field_wb) {
                    return;
                }
                var5 = sk.a(this.field_b, false, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
                mk var3 = var5;
                var4 = sk.a(this.field_b, false, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
                this.field_i = hc.a(-14382, new mk[]{var5, var4}, this.field_b);
                this.field_f = null != this.field_i ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "gr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        hp var3;
        float var4;
        long var5;
        if (param0 > 33) {
          var3 = this.field_b.j((byte) 62);
          if (this.field_f) {
            if (var3 == null) {
              return;
            } else {
              var4 = 1.0f + (-Math.abs(this.field_b.field_o[1]) + 1.0f) * 2.0f;
              this.field_b.g(1, 92);
              this.field_b.a(46, var3);
              this.field_b.g(0, 110);
              this.field_b.a(46, this.field_j.field_c);
              var5 = this.field_i.field_c;
              jaggl.OpenGL.glUseProgramObjectARB(var5);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -this.field_b.field_o[0], -this.field_b.field_o[1], -this.field_b.field_o[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), this.field_b.field_Fc * var4, this.field_b.field_z * var4, var4 * this.field_b.field_ac, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0f + Math.abs(this.field_b.field_o[1]) * 928.0f);
              this.field_k = true;
              return;
            }
          } else {
            return;
          }
        } else {
          field_l = 15;
          var3 = this.field_b.j((byte) 62);
          if (!this.field_f) {
            return;
          } else {
            L0: {
              if (var3 != null) {
                var4 = 1.0f + (-Math.abs(this.field_b.field_o[1]) + 1.0f) * 2.0f;
                this.field_b.g(1, 92);
                this.field_b.a(46, var3);
                this.field_b.g(0, 110);
                this.field_b.a(46, this.field_j.field_c);
                var5 = this.field_i.field_c;
                jaggl.OpenGL.glUseProgramObjectARB(var5);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -this.field_b.field_o[0], -this.field_b.field_o[1], -this.field_b.field_o[2]);
                jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), this.field_b.field_Fc * var4, this.field_b.field_z * var4, var4 * this.field_b.field_ac, 1.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0f + Math.abs(this.field_b.field_o[1]) * 928.0f);
                this.field_k = true;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 53) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = sj.a(false, 126, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("gr.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_h = new int[1000];
        field_g = "Updates will sent to the email address you've given";
        field_e = false;
    }
}
