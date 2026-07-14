/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ci extends hh {
    private boolean field_e;
    private in field_k;
    private boolean field_l;
    static Random field_i;
    private qe field_h;
    static int field_d;
    static int field_g;
    static kp field_j;
    static java.awt.Canvas field_f;
    static int[] field_m;

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
            ((ci) this).a((byte) -79, -25, -92);
        }
    }

    final void a(boolean param0, boolean param1) {
        q var3 = null;
        float var4 = 0.0f;
        long var5 = 0L;
        if (!param0) {
          var3 = ((ci) this).field_a.c(true);
          if (((ci) this).field_e) {
            if (var3 == null) {
              return;
            } else {
              var4 = 2.0f * (1.0f - Math.abs(((ci) this).field_a.field_n[1])) + 1.0f;
              ((ci) this).field_a.a(false, 1);
              ((ci) this).field_a.a((rt) (Object) var3, 1);
              ((ci) this).field_a.a(false, 0);
              ((ci) this).field_a.a((rt) (Object) ((ci) this).field_h.field_b, 1);
              var5 = ((ci) this).field_k.field_d;
              jaggl.OpenGL.glUseProgramObjectARB(var5);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -((ci) this).field_a.field_n[0], -((ci) this).field_a.field_n[1], -((ci) this).field_a.field_n[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), ((ci) this).field_a.field_ic * var4, var4 * ((ci) this).field_a.field_wb, var4 * ((ci) this).field_a.field_w, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0f + Math.abs(((ci) this).field_a.field_n[1]) * 928.0f);
              ((ci) this).field_l = true;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static gu[] d(byte param0) {
        int var1 = -108 / ((param0 - -76) / 50);
        return new gu[]{ef.field_k, lp.field_f, ct.field_t};
    }

    final void b(byte param0) {
        if (param0 < 5) {
          L0: {
            ci.c((byte) -62);
            if (((ci) this).field_l) {
              ((ci) this).field_a.a(false, 1);
              ((ci) this).field_a.a((rt) null, 1);
              ((ci) this).field_a.a(false, 0);
              ((ci) this).field_a.a((rt) null, 1);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              ((ci) this).field_l = false;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((ci) this).field_l) {
              ((ci) this).field_a.a(false, 1);
              ((ci) this).field_a.a((rt) null, 1);
              ((ci) this).field_a.a(false, 0);
              ((ci) this).field_a.a((rt) null, 1);
              jaggl.OpenGL.glUseProgramObjectARB(0L);
              ((ci) this).field_l = false;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static int b(int param0) {
        if (param0 != 15) {
            return 114;
        }
        return kc.field_c;
    }

    final void a(int param0, int param1, rt param2) {
        if (((ci) this).field_l) {
          if (param1 != -1486691000) {
            boolean discarded$4 = ((ci) this).a((byte) -2);
            return;
          } else {
            return;
          }
        } else {
          ((ci) this).field_a.a(param2, param1 + 1486691001);
          ((ci) this).field_a.a(param0, (byte) -39);
          if (param1 == -1486691000) {
            return;
          } else {
            boolean discarded$5 = ((ci) this).a((byte) -2);
            return;
          }
        }
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1 >= 118) {
          L0: {
            var4 = 0;
            if (param0) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param2) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param3) {
            var4++;
            return rb.field_i[var4];
          } else {
            return rb.field_i[var4];
          }
        } else {
          return (String) null;
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_f = null;
        if (param0 != -47) {
          field_g = -50;
          field_j = null;
          field_m = null;
          return;
        } else {
          field_j = null;
          field_m = null;
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = 68 / ((param0 - -11) / 63);
        return ((ci) this).field_e;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        long var11 = 0L;
        L0: {
          if (((ci) this).field_l) {
            var4 = 1 << (3 & param1);
            var5 = (float)(1 << (param1 >> -1943183773 & 7)) / 32.0f;
            var6 = param2 & 65535;
            var7 = (float)(3 & param2 >> -1307398320) / 8.0f;
            var8 = (float)((8062032 & param2) >> 352603923) / 16.0f;
            var9 = (float)((param2 & 127296979) >> -1188212457) / 16.0f;
            var10 = param2 >> 57973755 & 15;
            var11 = ((ci) this).field_k.field_d;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * ((ci) this).field_a.field_hb % 40000) / 40000.0f);
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
        if (param0 != -65) {
          ((ci) this).field_k = (in) null;
          return;
        } else {
          return;
        }
    }

    final static void a(long param0, byte param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param1 >= 73) {
            break L0;
          } else {
            field_g = 121;
            break L0;
          }
        }
        try {
          Thread.sleep(param0);
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (InterruptedException) (Object) decompiledCaughtException;
    }

    ci(wl param0, qe param1) {
        super(param0);
        aq var5 = null;
        ((ci) this).field_l = false;
        ((ci) this).field_e = false;
        ((ci) this).field_h = param1;
        if (null == ((ci) this).field_h.field_b) {
        }
        if (!((ci) this).field_a.field_v) {
        }
        if (((ci) this).field_a.field_lc) {
            var5 = kg.a("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, true, ((ci) this).field_a);
            aq var3 = var5;
            aq var4 = kg.a("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, true, ((ci) this).field_a);
            ((ci) this).field_k = br.a(((ci) this).field_a, new aq[2], (byte) 9);
            ((ci) this).field_e = null != ((ci) this).field_k ? true : false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new Random(2L);
        field_g = 0;
        field_m = new int[1];
        field_j = new kp();
    }
}
