/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends qg {
    private jjb field_d;
    static String field_k;
    private boolean field_e;
    static String field_g;
    private boolean field_j;
    private of field_f;
    static Object field_c;
    static String field_i;
    static String field_h;

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            field_i = null;
        }
    }

    final boolean b(int param0) {
        if (param0 >= -87) {
            ti.a(true);
            return false;
        }
        return false;
    }

    final void a(int param0, byte param1, pib param2) {
        if (param1 != 125) {
          L0: {
            field_c = null;
            if (!((ti) this).field_j) {
              ((ti) this).field_b.a(72, param2);
              ((ti) this).field_b.c(0, param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!((ti) this).field_j) {
              ((ti) this).field_b.a(72, param2);
              ((ti) this).field_b.c(0, param0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        Object var3 = null;
        if (param0 != 5890) {
          L0: {
            var3 = null;
            ((ti) this).a(115, (byte) 3, (pib) null);
            if (((ti) this).field_j) {
              ((ti) this).field_b.h(33984, 1);
              ((ti) this).field_b.a(25, (pib) null);
              ((ti) this).field_b.h(param0 ^ 37826, 0);
              ((ti) this).field_b.a(59, (pib) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              ((ti) this).field_j = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((ti) this).field_j) {
              ((ti) this).field_b.h(33984, 1);
              ((ti) this).field_b.a(25, (pib) null);
              ((ti) this).field_b.h(param0 ^ 37826, 0);
              ((ti) this).field_b.a(59, (pib) null);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              ((ti) this).field_j = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    ti(qfa param0, jjb param1) {
        super(param0);
        ts var5 = null;
        ((ti) this).field_j = false;
        ((ti) this).field_e = false;
        ((ti) this).field_d = param1;
        if (null == ((ti) this).field_d.field_a) {
        }
        if (!((ti) this).field_b.field_bc) {
        }
        if (((ti) this).field_b.field_B) {
            var5 = ccb.a(35633, ((ti) this).field_b, 18753, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            ts var3 = var5;
            ts var4 = ccb.a(35632, ((ti) this).field_b, 18753, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            ((ti) this).field_f = wra.a(new ts[2], (byte) 107, ((ti) this).field_b);
            ((ti) this).field_e = null != ((ti) this).field_f ? true : false;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        L0: {
          if (((ti) this).field_j) {
            var4 = 1 << (param0 & 3);
            var5 = (float)(1 << ((param0 & 60) >> -2032098333)) / 32.0f;
            var6 = param2 & 65535;
            var7 = (float)(3 & param2 >> 1819714032) / 8.0f;
            var8 = ((ti) this).field_f.field_c;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(((ti) this).field_b.field_Mc * var4 % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -25139) {
          ((ti) this).field_j = false;
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_k = null;
        field_i = null;
        field_h = null;
        if (!param0) {
          ti.a(true);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final void a(boolean param0, int param1) {
        rtb var3 = null;
        long var4 = 0L;
        if (param1 >= 18) {
          var3 = ((ti) this).field_b.a(false);
          if (((ti) this).field_e) {
            if (var3 == null) {
              return;
            } else {
              ((ti) this).field_b.h(33984, 1);
              ((ti) this).field_b.a(106, (pib) (Object) var3);
              ((ti) this).field_b.h(33984, 0);
              ((ti) this).field_b.a(106, (pib) (Object) ((ti) this).field_d.field_a);
              var4 = ((ti) this).field_f.field_c;
              jaggl.OpenGL.glUseProgramObjectARB(var4);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -((ti) this).field_b.field_Eb[0], -((ti) this).field_b.field_Eb[1], -((ti) this).field_b.field_Eb[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), ((ti) this).field_b.field_nb, ((ti) this).field_b.field_nc, ((ti) this).field_b.field_i, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(((ti) this).field_b.field_Eb[1]) * 928.0f + 96.0f);
              ((ti) this).field_j = true;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Shift event up";
        field_g = "Join <%0>'s game";
        field_i = "for members";
    }
}
