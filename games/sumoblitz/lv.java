/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lv extends bq {
    static int field_i;
    private boolean field_j;
    private sn field_k;
    private ch field_h;
    static String field_f;
    static String field_e;
    private boolean field_g;

    lv(fr param0, ch param1) {
        super(param0);
        mk var5 = null;
        mk var4 = null;
        this.field_j = false;
        this.field_g = false;
        try {
            this.field_h = param1;
            if (this.field_h.field_c != null && this.field_b.field_N && this.field_b.field_wb) {
                var5 = sk.a(this.field_b, false, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
                mk var3 = var5;
                var4 = sk.a(this.field_b, false, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
                this.field_k = hc.a(-14382, new mk[]{var5, var4}, this.field_b);
                this.field_j = null != this.field_k ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "lv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 >= -30) {
            field_e = (String) null;
        }
    }

    final void a(byte param0, boolean param1) {
        hp var3;
        long var4;
        L0: {
          var3 = this.field_b.j((byte) 62);
          if (!this.field_j) {
            break L0;
          } else {
            if (var3 == null) {
              break L0;
            } else {
              this.field_b.g(1, 113);
              this.field_b.a(41, var3);
              this.field_b.g(0, 97);
              this.field_b.a(121, this.field_h.field_c);
              var4 = this.field_k.field_c;
              jaggl.OpenGL.glUseProgramObjectARB(var4);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_b.field_o[0], -this.field_b.field_o[1], -this.field_b.field_o[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_b.field_Fc, this.field_b.field_z, this.field_b.field_ac, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0f * Math.abs(this.field_b.field_o[1]) + 96.0f);
              this.field_g = true;
              break L0;
            }
          }
        }
        if (param0 < 33) {
          this.field_k = (sn) null;
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != 3) {
            field_f = (String) null;
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    final static jj a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        jj[] var3 = null;
        int var4 = 0;
        jj var5 = null;
        int var6 = 0;
        jj stackIn_4_0 = null;
        jj stackIn_7_0 = null;
        jj stackIn_13_0 = null;
        jj stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = ji.a(param0, (byte) -57, "jagex-last-login-method");
            if (var2 == null) {
              stackIn_4_0 = na.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 1) {
                var3 = ie.a(32);
                var4 = 0;
                L1: while (true) {
                  if (var3.length <= var4) {
                    stackIn_16_0 = na.field_c;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var5 = var3[var4];
                    if (var5.a(var2, param1 + -2184)) {
                      stackIn_13_0 = (jj) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackIn_7_0 = (jj) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2_ref);

            stackIn_19_1 = new StringBuilder().append("lv.C(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_16_0;
            }
          }
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
                this.field_g = true;
                break L1;
              }
            }
            if (!this.field_g) {
              this.field_b.a(20, param2);
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

            stackIn_8_1 = new StringBuilder().append("lv.A(").append(param0).append(',').append(param1).append(',');

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

    final void b(int param0) {
        L0: {
          if (this.field_g) {
            this.field_b.g(1, 105);
            this.field_b.a(84, (ht) null);
            this.field_b.g(0, 80);
            this.field_b.a(98, (ht) null);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            this.field_g = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -125) {
          field_e = (String) null;
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 > -64) {
            this.field_h = (ch) null;
            return false;
        }
        return false;
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        float var5;
        int var6;
        float var7;
        long var8;
        if (param0 < 39) {
          return;
        } else {
          L0: {
            if (!this.field_g) {
              break L0;
            } else {
              var4 = 1 << (3 & param1);
              var5 = (float)(1 << ((56 & param1) >> 1308504131)) / 32.0f;
              var6 = 65535 & param2;
              var7 = (float)((param2 & 204417) >> 780041648) / 8.0f;
              var8 = this.field_k.field_c;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * this.field_b.field_Ac % 40000) / 40000.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
              break L0;
            }
          }
          return;
        }
    }

    static {
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
        field_i = 0;
        field_f = "Visit the Account Management section on the main site to view.";
    }
}
