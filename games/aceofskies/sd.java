/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends hh {
    static String[] field_j;
    private qe field_i;
    static boolean[][] field_d;
    private boolean field_f;
    private in field_l;
    static pa[] field_k;
    static int field_h;
    static String field_e;
    static String field_m;
    private boolean field_g;

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
            ((sd) this).b((byte) 78);
        }
    }

    final void b(byte param0) {
        if (!((sd) this).field_g) {
          if (param0 < 5) {
            field_e = (String) null;
            return;
          } else {
            return;
          }
        } else {
          ((sd) this).field_a.a(false, 1);
          ((sd) this).field_a.a((rt) null, 1);
          ((sd) this).field_a.a(false, 0);
          ((sd) this).field_a.a((rt) null, 1);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          ((sd) this).field_g = false;
          if (param0 >= 5) {
            return;
          } else {
            field_e = (String) null;
            return;
          }
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = (boolean[][]) null;
        if (param0 != 0) {
          gk discarded$2 = sd.a(false, -71, true, true, -75);
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = -31 % ((param0 - -11) / 63);
        return false;
    }

    final static gk a(boolean param0, int param1, boolean param2, boolean param3, int param4) {
        if (param3) {
          field_m = (String) null;
          return lc.a(param2, param0, false, (byte) -65, param1, param4);
        } else {
          return lc.a(param2, param0, false, (byte) -65, param1, param4);
        }
    }

    final void a(int param0, int param1, rt param2) {
        if (param1 != -1486691000) {
          L0: {
            field_j = (String[]) null;
            if (!((sd) this).field_g) {
              ((sd) this).field_a.a(param2, 1);
              ((sd) this).field_a.a(param0, (byte) -39);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!((sd) this).field_g) {
              ((sd) this).field_a.a(param2, 1);
              ((sd) this).field_a.a(param0, (byte) -39);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    sd(wl param0, qe param1) {
        super(param0);
        aq var5 = null;
        ((sd) this).field_f = false;
        ((sd) this).field_g = false;
        ((sd) this).field_i = param1;
        if (((sd) this).field_i.field_b == null) {
        }
        if (!((sd) this).field_a.field_v) {
        }
        if (((sd) this).field_a.field_lc) {
            var5 = kg.a("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, true, ((sd) this).field_a);
            aq var3 = var5;
            aq var4 = kg.a("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, true, ((sd) this).field_a);
            ((sd) this).field_l = br.a(((sd) this).field_a, new aq[2], (byte) -121);
            ((sd) this).field_f = null != ((sd) this).field_l ? true : false;
        }
    }

    final void a(boolean param0, boolean param1) {
        q var3 = null;
        long var4 = 0L;
        wl stackIn_1_0 = null;
        wl stackIn_2_0 = null;
        wl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        wl stackOut_0_0 = null;
        wl stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        wl stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = ((sd) this).field_a;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0) {
            stackOut_2_0 = (wl) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (wl) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          var3 = ((wl) (Object) stackIn_3_0).c(stackIn_3_1 != 0);
          if (!((sd) this).field_f) {
            break L1;
          } else {
            if (var3 == null) {
              break L1;
            } else {
              ((sd) this).field_a.a(false, 1);
              ((sd) this).field_a.a((rt) (Object) var3, 1);
              ((sd) this).field_a.a(false, 0);
              ((sd) this).field_a.a((rt) (Object) ((sd) this).field_i.field_b, 1);
              var4 = ((sd) this).field_l.field_d;
              jaggl.OpenGL.glUseProgramObjectARB(var4);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -((sd) this).field_a.field_n[0], -((sd) this).field_a.field_n[1], -((sd) this).field_a.field_n[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), ((sd) this).field_a.field_ic, ((sd) this).field_a.field_wb, ((sd) this).field_a.field_w, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(((sd) this).field_a.field_n[1]) * 928.0f + 96.0f);
              ((sd) this).field_g = true;
              break L1;
            }
          }
        }
        if (param0) {
          ((sd) this).a(-114, true);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        if (param0 != -65) {
          return;
        } else {
          L0: {
            if (!((sd) this).field_g) {
              break L0;
            } else {
              var4 = 1 << (param1 & 3);
              var5 = (float)(1 << ((62 & param1) >> 1290135011)) / 32.0f;
              var6 = 65535 & param2;
              var7 = (float)((param2 & 260994) >> -601664112) / 8.0f;
              var8 = ((sd) this).field_l.field_d;
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * ((sd) this).field_a.field_hb % 40000) / 40000.0f);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new boolean[][]{new boolean[16], new boolean[16], new boolean[16], new boolean[16], new boolean[16]};
        field_e = "Orb Coins";
        field_m = "SETTINGS";
    }
}
