/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ci extends hh {
    private boolean field_e;
    private in field_k;
    private boolean field_l;
    static Random gameRandom;
    private qe field_h;
    static int nextMenuId;
    static int field_g;
    static IntrusiveDeque field_j;
    static java.awt.Canvas field_f;
    static int[] field_m;

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
          this.a((byte) -79, -25, -92);
        }
    }

    final void a(boolean param0, boolean param1) {
        float var4 = 0.0f;
        long var5 = 0L;
        if (param0) {
          return;
        }
        q var3 = this.field_a.c(true);
        if (!this.field_e) {
          return;
        }
        if (var3 != null) {
          var4 = 2.0f * (1.0f - Math.abs(this.field_a.field_n[1])) + 1.0f;
          this.field_a.a(false, 1);
          this.field_a.a(var3, 1);
          this.field_a.a(false, 0);
          this.field_a.a(this.field_h.field_b, 1);
          var5 = this.field_k.field_d;
          jaggl.OpenGL.glUseProgramObjectARB(var5);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -this.field_a.field_n[0], -this.field_a.field_n[1], -this.field_a.field_n[2]);
          jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), this.field_a.field_ic * var4, var4 * this.field_a.field_wb, var4 * this.field_a.field_w, 1.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0f + Math.abs(this.field_a.field_n[1]) * 928.0f);
          this.field_l = true;
          return;
        }
    }

    final static gu[] d(byte param0) {
        int var1 = -108 / ((param0 + 76) / 50);
        return new gu[]{ef.field_k, lp.field_f, NetworkGameClient.field_t};
    }

    final void b(byte param0) {
        if (param0 >= 5) {
          if (this.field_l) {
            this.field_a.a(false, 1);
            this.field_a.a((rt) null, 1);
            this.field_a.a(false, 0);
            this.field_a.a((rt) null, 1);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            this.field_l = false;
          }
          return;
        }
        ci.c((byte) -62);
        if (this.field_l) {
          this.field_a.a(false, 1);
          this.field_a.a((rt) null, 1);
          this.field_a.a(false, 0);
          this.field_a.a((rt) null, 1);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.field_l = false;
        }
    }

    final static int b(int param0) {
        if (param0 != 15) {
          return 114;
        }
        return Vector2.field_c;
    }

    final void a(int param0, int param1, rt param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_l) {
            this.field_a.a(param2, param1 + 1486691001);
            this.field_a.a(param0, (byte) -39);
          }
          if (param1 == -1486691000) {
            return;
          }
          this.a((byte) -2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ci.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        if (param1 < 118) {
          return (String) null;
        }
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (!param3) {
          return PacketBuffer.field_i[var4];
        }
        var4++;
        return PacketBuffer.field_i[var4];
    }

    public static void c(byte param0) {
        gameRandom = null;
        field_f = null;
        if (param0 == -47) {
          field_j = null;
          field_m = null;
          return;
        }
        field_g = -50;
        field_j = null;
        field_m = null;
    }

    final boolean a(byte param0) {
        int var2 = 68 / ((param0 + 11) / 63);
        return this.field_e;
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
        if (this.field_l) {
          var4 = 1 << (3 & param1);
          var5 = (float)(1 << (param1 >> 3 & 7)) / 32.0f;
          var6 = param2 & 65535;
          var7 = (float)(3 & param2 >> 16) / 8.0f;
          var8 = (float)((8062032 & param2) >> 19) / 16.0f;
          var9 = (float)((param2 & 127296979) >> 23) / 16.0f;
          var10 = param2 >> 27 & 15;
          var11 = this.field_k.field_d;
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * this.field_a.field_hb % 40000) / 40000.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float)var6);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
          jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float)var10);
        }
        if (param0 == -65) {
          return;
        }
        this.field_k = (in) null;
    }

    final static void a(long param0, byte param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          if (param1 < 73) {
            field_g = 121;
          }
          try {
            Thread.sleep(param0);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ci(wl param0, qe param1) {
        super(param0);
        aq var5 = null;
        aq var4 = null;
        this.field_l = false;
        this.field_e = false;
        try {
          this.field_h = param1;
          if (null != this.field_h.field_b &&
            this.field_a.field_v &&
            this.field_a.field_lc) {
            var5 = kg.a("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, true, this.field_a);
            aq var3 = var5;
            var4 = kg.a("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, true, this.field_a);
            this.field_k = br.a(this.field_a, new aq[]{var5, var4}, (byte) 9);
            this.field_e = null != this.field_k ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        gameRandom = new Random(2L);
        field_g = 0;
        field_m = new int[1];
        field_j = new IntrusiveDeque();
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$feb7e63b59d8(boolean param0, int param1, boolean param2, boolean param3) {
        if (param1 < 118) {
          return (String) null;
        }
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (!param3) {
          return PacketBuffer.field_i[var4];
        }
        var4++;
        return PacketBuffer.field_i[var4];
    }
}
