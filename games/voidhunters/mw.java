/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mw extends qg {
    private of field_c;
    private jjb field_g;
    private boolean field_h;
    static int field_e;
    private boolean field_f;
    static String field_d;

    final static long e(int param0) {
        if (param0 != 0) {
            return -5L;
        }
        return wt.a(false) + -cbb.field_q;
    }

    final void a(int param0) {
        L0: {
          if (((mw) this).field_h) {
            ((mw) this).field_b.h(33984, 1);
            ((mw) this).field_b.a(124, (pib) null);
            ((mw) this).field_b.h(param0 ^ 37826, 0);
            ((mw) this).field_b.a(param0 + -5788, (pib) null);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            ((mw) this).field_h = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 5890) {
          boolean discarded$2 = ((mw) this).b(47);
          return;
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 > -87) {
            return false;
        }
        return ((mw) this).field_f;
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            ((mw) this).field_g = null;
        }
    }

    public static void d(int param0) {
        field_d = null;
        if (param0 != 13776) {
            field_e = -2;
        }
    }

    mw(qfa param0, jjb param1) {
        super(param0);
        ts var5 = null;
        ((mw) this).field_h = false;
        ((mw) this).field_f = false;
        ((mw) this).field_g = param1;
        if (((mw) this).field_g.field_a == null) {
        }
        if (!((mw) this).field_b.field_bc) {
        }
        if (((mw) this).field_b.field_B) {
            var5 = ccb.a(35633, ((mw) this).field_b, 18753, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            ts var3 = var5;
            ts var4 = ccb.a(35632, ((mw) this).field_b, 18753, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            ((mw) this).field_c = wra.a(new ts[2], (byte) 107, ((mw) this).field_b);
            ((mw) this).field_f = null != ((mw) this).field_c ? true : false;
        }
    }

    final void a(int param0, byte param1, pib param2) {
        if (param1 != 125) {
          L0: {
            ((mw) this).field_f = true;
            if (!((mw) this).field_h) {
              ((mw) this).field_b.a(param1 ^ 14, param2);
              ((mw) this).field_b.c(param1 ^ 125, param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!((mw) this).field_h) {
              ((mw) this).field_b.a(param1 ^ 14, param2);
              ((mw) this).field_b.c(param1 ^ 125, param0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
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
        L0: {
          if (((mw) this).field_h) {
            var4 = 1 << (param0 & 3);
            var5 = (float)(1 << ((56 & param0) >> 1627825251)) / 32.0f;
            var6 = param2 & 65535;
            var7 = (float)((231673 & param2) >> 199471792) / 8.0f;
            var8 = (float)((8159859 & param2) >> -1108607917) / 16.0f;
            var9 = (float)(param2 >> 302216151 & 15) / 16.0f;
            var10 = (2025808678 & param2) >> -1535806309;
            var11 = ((mw) this).field_c.field_c;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * ((mw) this).field_b.field_Mc % 40000) / 40000.0f);
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
        if (param1 != -25139) {
          ((mw) this).field_f = false;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1) {
        rtb var3 = null;
        float var4 = 0.0f;
        long var5 = 0L;
        var3 = ((mw) this).field_b.a(false);
        if (param1 > 18) {
          if (((mw) this).field_f) {
            if (var3 == null) {
              return;
            } else {
              var4 = 2.0f * (-Math.abs(((mw) this).field_b.field_Eb[1]) + 1.0f) + 1.0f;
              ((mw) this).field_b.h(33984, 1);
              ((mw) this).field_b.a(54, (pib) (Object) var3);
              ((mw) this).field_b.h(33984, 0);
              ((mw) this).field_b.a(113, (pib) (Object) ((mw) this).field_g.field_a);
              var5 = ((mw) this).field_c.field_c;
              jaggl.OpenGL.glUseProgramObjectARB(var5);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -((mw) this).field_b.field_Eb[0], -((mw) this).field_b.field_Eb[1], -((mw) this).field_b.field_Eb[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), ((mw) this).field_b.field_nb * var4, var4 * ((mw) this).field_b.field_nc, ((mw) this).field_b.field_i * var4, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(((mw) this).field_b.field_Eb[1]) * 928.0f + 64.0f);
              ((mw) this).field_h = true;
              return;
            }
          } else {
            return;
          }
        } else {
          ((mw) this).a(63, -77, 49);
          if (!((mw) this).field_f) {
            return;
          } else {
            L0: {
              if (var3 != null) {
                var4 = 2.0f * (-Math.abs(((mw) this).field_b.field_Eb[1]) + 1.0f) + 1.0f;
                ((mw) this).field_b.h(33984, 1);
                ((mw) this).field_b.a(54, (pib) (Object) var3);
                ((mw) this).field_b.h(33984, 0);
                ((mw) this).field_b.a(113, (pib) (Object) ((mw) this).field_g.field_a);
                var5 = ((mw) this).field_c.field_c;
                jaggl.OpenGL.glUseProgramObjectARB(var5);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -((mw) this).field_b.field_Eb[0], -((mw) this).field_b.field_Eb[1], -((mw) this).field_b.field_Eb[2]);
                jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), ((mw) this).field_b.field_nb * var4, var4 * ((mw) this).field_b.field_nc, ((mw) this).field_b.field_i * var4, 1.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(((mw) this).field_b.field_Eb[1]) * 928.0f + 64.0f);
                ((mw) this).field_h = true;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Enter name of player to add to list";
    }
}
