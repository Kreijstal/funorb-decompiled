/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends qe {
    private boolean field_c;
    private cua field_d;
    private aaa field_f;
    private boolean field_e;

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        g[] var3 = null;
        int var4 = 0;
        g var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = cm.field_a[param0].field_c;
            var4 = param1;
            L1: while (true) {
              if (var4 >= var3.length) {
                stackIn_5_0 = var2_int;
                break L0;
              } else {
                var5 = var3[var4];
                var2_int = var2_int + var5.field_h;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "as.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final void a(boolean param0) {
        if (!(!this.field_e)) {
            this.field_a.e(1, true);
            this.field_a.a(true, (kl) null);
            this.field_a.e(0, true);
            this.field_a.a(!param0 ? true : false, (kl) null);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            this.field_e = false;
        }
        if (param0) {
            this.field_e = false;
        }
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
            kl var3 = (kl) null;
            this.a(1, 32, (kl) null);
        }
        return this.field_c;
    }

    final void a(int param0, int param1, kl param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (!this.field_e) {
                this.field_a.a(true, param2);
                this.field_a.d(param1 + -32220, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 32221) {
                break L2;
              } else {
                this.a(-9, -76, 44);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("as.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, float[] param1, int param2, int param3, float param4, int param5, float param6, int param7, int param8, int param9, int param10, float param11, int param12, float[] param13) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var14_float = 0.0f;
        RuntimeException var14 = null;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19_float = 0.0f;
        int var19 = 0;
        int var20 = 0;
        var20 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param9 = param9 - param5;
              param2 = param2 - param0;
              param7 = param7 - param3;
              var14_float = param13[0] * (float)param7 + (float)param2 * param13[1] + param13[2] * (float)param9;
              var15 = param13[4] * (float)param2 + (float)param7 * param13[3] + (float)param9 * param13[5];
              var16 = param13[8] * (float)param9 + (param13[6] * (float)param7 + (float)param2 * param13[7]);
              if (param8 == 0) {
                var17 = 0.5f + (var14_float + param11);
                var18 = 0.5f + (param4 + -var16);
                break L1;
              } else {
                if (-2 != (param8 ^ -1)) {
                  if (2 != param8) {
                    if (3 == param8) {
                      var18 = -var15 + param6 + 0.5f;
                      var17 = param11 + var14_float + 0.5f;
                      break L1;
                    } else {
                      if (-5 == (param8 ^ -1)) {
                        var18 = param6 + -var15 + 0.5f;
                        var17 = param4 + var16 + 0.5f;
                        break L1;
                      } else {
                        var17 = -var16 + param4 + 0.5f;
                        var18 = 0.5f + (-var15 + param6);
                        break L1;
                      }
                    }
                  } else {
                    var17 = 0.5f + (-var14_float + param11);
                    var18 = -var15 + param6 + 0.5f;
                    break L1;
                  }
                } else {
                  var17 = 0.5f + (var14_float + param11);
                  var18 = param4 + var16 + 0.5f;
                  break L1;
                }
              }
            }
            L2: {
              if (-2 == (param12 ^ -1)) {
                var19_float = var17;
                var17 = -var18;
                var18 = var19_float;
                break L2;
              } else {
                if (-3 != (param12 ^ -1)) {
                  if (3 != param12) {
                    break L2;
                  } else {
                    var19_float = var17;
                    var17 = var18;
                    var18 = -var19_float;
                    break L2;
                  }
                } else {
                  var17 = -var17;
                  var18 = -var18;
                  break L2;
                }
              }
            }
            var19 = 98 % ((param10 - -50) / 39);
            param1[0] = var17;
            param1[1] = var18;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var14 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var14);

            stackIn_22_1 = new StringBuilder().append("as.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
    }

    as(cka param0, aaa param1) {
        super(param0);
        fca var5 = null;
        fca var4 = null;
        this.field_c = false;
        this.field_e = false;
        try {
            this.field_f = param1;
            if (this.field_f.field_c != null && this.field_a.field_wb && this.field_a.field_Vc) {
                var5 = cpa.a(64, this.field_a, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
                fca var3 = var5;
                var4 = cpa.a(64, this.field_a, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
                this.field_d = dga.a(21885, this.field_a, new fca[]{var5, var4});
                this.field_c = null != this.field_d ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "as.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 < 77) {
            this.field_e = true;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        long var11 = 0L;
        if (param2 < 117) {
            this.field_c = true;
        }
        if (!(!this.field_e)) {
            var4 = 1 << (param0 & 3);
            var5 = (float)(1 << ((57 & param0) >> 1430405475)) / 32.0f;
            var6 = param1 & 65535;
            var7 = (float)(param1 >> 1198757456 & 3) / 8.0f;
            var8 = (float)(param1 >> -1200987533 & 15) / 16.0f;
            var9 = (float)(param1 >> 2087592343 & 15) / 16.0f;
            var10 = (param1 & 2114051285) >> 1197937563;
            var11 = this.field_d.field_c;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * this.field_a.field_Oc % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float)var10);
        }
    }

    final void a(boolean param0, int param1) {
        float var5 = 0.0f;
        long var6 = 0L;
        hoa var3 = this.field_a.n(16664);
        int var4 = -104 / ((56 - param1) / 48);
        if (this.field_c && var3 != null) {
            var5 = (-Math.abs(this.field_a.field_Wb[1]) + 1.0f) * 2.0f + 1.0f;
            this.field_a.e(1, true);
            this.field_a.a(true, var3);
            this.field_a.e(0, true);
            this.field_a.a(true, this.field_f.field_c);
            var6 = this.field_d.field_c;
            jaggl.OpenGL.glUseProgramObjectARB(var6);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
            jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "sunDir"), -this.field_a.field_Wb[0], -this.field_a.field_Wb[1], -this.field_a.field_Wb[2]);
            jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "sunColour"), var5 * this.field_a.field_wc, this.field_a.field_Fb * var5, this.field_a.field_bc * var5, 1.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 64.0f + Math.abs(this.field_a.field_Wb[1]) * 928.0f);
            this.field_e = true;
        }
    }

    static {
    }
}
