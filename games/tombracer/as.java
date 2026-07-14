/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends qe {
    private boolean field_c;
    private cua field_d;
    private aaa field_f;
    private boolean field_e;

    final static int a(int param0, int param1) {
        int var4 = 0;
        g var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        g[] var3 = cm.field_a[param0].field_c;
        for (var4 = param1; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 + var5.field_h;
        }
        return var2;
    }

    final void a(boolean param0) {
        if (!(!((as) this).field_e)) {
            ((as) this).field_a.e(1, true);
            ((as) this).field_a.a(true, (kl) null);
            ((as) this).field_a.e(0, true);
            ((as) this).field_a.a(!param0 ? true : false, (kl) null);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            ((as) this).field_e = false;
        }
        if (param0) {
            ((as) this).field_e = false;
        }
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
            Object var3 = null;
            ((as) this).a(1, 32, (kl) null);
        }
        return ((as) this).field_c;
    }

    final void a(int param0, int param1, kl param2) {
        if (!(((as) this).field_e)) {
            ((as) this).field_a.a(true, param2);
            ((as) this).field_a.d(param1 + -32220, param0);
        }
        if (param1 != 32221) {
            ((as) this).a(-9, -76, 44);
        }
    }

    final static void a(int param0, float[] param1, int param2, int param3, float param4, int param5, float param6, int param7, int param8, int param9, int param10, float param11, int param12, float[] param13) {
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19_float = 0.0f;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var20 = TombRacer.field_G ? 1 : 0;
          param9 = param9 - param5;
          param2 = param2 - param0;
          param7 = param7 - param3;
          var14 = param13[0] * (float)param7 + (float)param2 * param13[1] + param13[2] * (float)param9;
          var15 = param13[4] * (float)param2 + (float)param7 * param13[3] + (float)param9 * param13[5];
          var16 = param13[8] * (float)param9 + (param13[6] * (float)param7 + (float)param2 * param13[7]);
          if (param8 == -1) {
            var17 = 0.5f + (var14 + param11);
            var18 = 0.5f + (param4 + -var16);
            break L0;
          } else {
            if (-2 != param8) {
              if (2 != param8) {
                if (3 == param8) {
                  var18 = -var15 + param6 + 0.5f;
                  var17 = param11 + var14 + 0.5f;
                  break L0;
                } else {
                  if (-5 == (param8 ^ -1)) {
                    var18 = param6 + -var15 + 0.5f;
                    var17 = param4 + var16 + 0.5f;
                    break L0;
                  } else {
                    var17 = -var16 + param4 + 0.5f;
                    var18 = 0.5f + (-var15 + param6);
                    break L0;
                  }
                }
              } else {
                var17 = 0.5f + (-var14 + param11);
                var18 = -var15 + param6 + 0.5f;
                break L0;
              }
            } else {
              var17 = 0.5f + (var14 + param11);
              var18 = param4 + var16 + 0.5f;
              break L0;
            }
          }
        }
        L1: {
          if (-2 == param12) {
            var19_float = var17;
            var17 = -var18;
            var18 = var19_float;
            break L1;
          } else {
            if (-3 != param12) {
              if (3 != param12) {
                break L1;
              } else {
                var19_float = var17;
                var17 = var18;
                var18 = -var19_float;
                break L1;
              }
            } else {
              var17 = -var17;
              var18 = -var18;
              break L1;
            }
          }
        }
        var19 = 98 % ((param10 - -50) / 39);
        param1[0] = var17;
        param1[1] = var18;
    }

    as(cka param0, aaa param1) {
        super(param0);
        fca var5 = null;
        ((as) this).field_c = false;
        ((as) this).field_e = false;
        ((as) this).field_f = param1;
        if (((as) this).field_f.field_c != null) {
            if (((as) this).field_a.field_wb) {
                if (((as) this).field_a.field_Vc) {
                    var5 = cpa.a(64, ((as) this).field_a, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
                    fca var3 = var5;
                    fca var4 = cpa.a(64, ((as) this).field_a, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
                    ((as) this).field_d = dga.a(21885, ((as) this).field_a, new fca[2]);
                    ((as) this).field_c = null != ((as) this).field_d ? true : false;
                }
            }
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 < 77) {
            ((as) this).field_e = true;
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
            ((as) this).field_c = true;
        }
        if (!(!((as) this).field_e)) {
            var4 = 1 << (param0 & 3);
            var5 = (float)(1 << ((57 & param0) >> 1430405475)) / 32.0f;
            var6 = param1 & 65535;
            var7 = (float)(param1 >> 1198757456 & 3) / 8.0f;
            var8 = (float)(param1 >> -1200987533 & 15) / 16.0f;
            var9 = (float)(param1 >> 2087592343 & 15) / 16.0f;
            var10 = (param1 & 2114051285) >> 1197937563;
            var11 = ((as) this).field_d.field_c;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * ((as) this).field_a.field_Oc % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float)var10);
        }
    }

    final void a(boolean param0, int param1) {
        hoa var3 = null;
        int var4 = 0;
        float var5 = 0.0f;
        long var6 = 0L;
        L0: {
          var3 = ((as) this).field_a.n(16664);
          var4 = -104 / ((56 - param1) / 48);
          if (!((as) this).field_c) {
            break L0;
          } else {
            if (var3 == null) {
              break L0;
            } else {
              var5 = (-Math.abs(((as) this).field_a.field_Wb[1]) + 1.0f) * 2.0f + 1.0f;
              ((as) this).field_a.e(1, true);
              ((as) this).field_a.a(true, (kl) (Object) var3);
              ((as) this).field_a.e(0, true);
              ((as) this).field_a.a(true, (kl) (Object) ((as) this).field_f.field_c);
              var6 = ((as) this).field_d.field_c;
              jaggl.OpenGL.glUseProgramObjectARB(var6);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "sunDir"), -((as) this).field_a.field_Wb[0], -((as) this).field_a.field_Wb[1], -((as) this).field_a.field_Wb[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "sunColour"), var5 * ((as) this).field_a.field_wc, ((as) this).field_a.field_Fb * var5, ((as) this).field_a.field_bc * var5, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var6, "sunExponent"), 64.0f + Math.abs(((as) this).field_a.field_Wb[1]) * 928.0f);
              ((as) this).field_e = true;
              break L0;
            }
          }
        }
    }

    static {
    }
}
