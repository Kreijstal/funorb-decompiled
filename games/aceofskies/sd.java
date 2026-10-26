/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends hh {
    static String[] field_j;
    private qe field_i;
    static boolean[][] musicLayerPresets;
    private boolean field_f;
    private in field_l;
    static RenderSprite[] cloudSprites;
    static int field_h;
    static String field_e;
    static String field_m;
    private boolean field_g;

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
          this.b((byte) 78);
        }
    }

    final void b(byte param0) {
        if (this.field_g) {
          this.field_a.a(false, 1);
          this.field_a.a((rt) null, 1);
          this.field_a.a(false, 0);
          this.field_a.a((rt) null, 1);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.field_g = false;
          if (param0 < 5) {
            field_e = (String) null;
            return;
          }
          return;
        }
        if (param0 >= 5) {
          return;
        }
        field_e = (String) null;
    }

    public static void b(int param0) {
        field_e = null;
        musicLayerPresets = (boolean[][]) null;
        if (param0 == 0) {
          field_j = null;
          field_m = null;
          cloudSprites = null;
          return;
        }
        sd.a(false, -71, true, true, -75);
        field_j = null;
        field_m = null;
        cloudSprites = null;
    }

    final boolean a(byte param0) {
        int var2 = -31 % ((param0 + 11) / 63);
        return false;
    }

    final static ResourceArchive a(boolean param0, int param1, boolean param2, boolean param3, int param4) {
        if (!param3) {
          return lc.a(param2, param0, false, (byte) -65, param1, param4);
        }
        field_m = (String) null;
        return lc.a(param2, param0, false, (byte) -65, param1, param4);
    }

    final void a(int param0, int param1, rt param2) {
        String stackIn_9_2 = null;
        try {
          if (param1 != -1486691000) {
            field_j = (String[]) null;
          }
          if (this.field_g) {
            return;
          }
          this.field_a.a(param2, 1);
          this.field_a.a(param0, (byte) -39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4;
          StringBuilder stackIn_8_1 = new StringBuilder().append("sd.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    sd(wl param0, qe param1) {
        super(param0);
        this.field_f = false;
        this.field_g = false;
        try {
          this.field_i = param1;
          if (this.field_i.field_b != null &&
            this.field_a.field_v &&
            this.field_a.field_lc) {
            aq var5 = kg.a("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, true, this.field_a);
            aq var3 = var5;
            aq var4 = kg.a("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, true, this.field_a);
            this.field_l = br.a(this.field_a, new aq[]{var5, var4}, (byte) -121);
            this.field_f = null != this.field_l ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        q var3 = this.field_a.c(!param0 ? true : false);
        if (this.field_f &&
          var3 != null) {
          this.field_a.a(false, 1);
          this.field_a.a(var3, 1);
          this.field_a.a(false, 0);
          this.field_a.a(this.field_i.field_b, 1);
          long var4 = this.field_l.field_d;
          jaggl.OpenGL.glUseProgramObjectARB(var4);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.field_a.field_n[0], -this.field_a.field_n[1], -this.field_a.field_n[2]);
          jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.field_a.field_ic, this.field_a.field_wb, this.field_a.field_w, 1.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(this.field_a.field_n[1]) * 928.0f + 96.0f);
          this.field_g = true;
        }
        if (!param0) {
          return;
        }
        this.a(-114, true);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 == -65) {
          if (this.field_g) {
            int var4 = 1 << (param1 & 3);
            float var5 = (float)(1 << ((62 & param1) >> 3)) / 32.0f;
            int var6 = 65535 & param2;
            float var7 = (float)((param2 & 260994) >> 16) / 8.0f;
            long var8 = this.field_l.field_d;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * this.field_a.field_hb % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
          }
          return;
        }
    }

    static {
        musicLayerPresets = new boolean[][]{new boolean[]{true, true, false, false, false, true, true, false, false, true, false, false, false, false, false, false}, new boolean[]{true, true, true, true, true, true, true, false, false, true, false, false, false, false, false, false}, new boolean[]{true, true, true, true, true, true, true, true, true, false, true, false, false, false, false, false}, new boolean[]{false, true, false, false, false, false, true, true, true, false, false, true, false, false, true, false}, new boolean[]{false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false}};
        field_e = "Orb Coins";
        field_m = "SETTINGS";
    }
}
