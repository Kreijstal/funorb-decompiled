/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlWaveWaterEffect extends LegacyOpenGlMaterialEffect {
    private LegacyOpenGlShaderProgram program;
    private LegacyOpenGlWaterTextures waterTextures;
    private boolean active;
    static int effectsBufferSize;
    private boolean supported;
    static String field_d;

    final static long getNetworkReadIdleMillis(int param0) {
        if (param0 != 0) {
          return -5L;
        }
        return MonotonicMillisClock.currentTimeMillis(false) - ModelData.lastNetworkReadTimeMillis;
    }

    final void disable(int param0) {
        if (this.active) {
          this.toolkit.setActiveTextureUnit(33984, 1);
          this.toolkit.bindTexture(124, (OpenGlTexture) null);
          this.toolkit.setActiveTextureUnit(param0 ^ 37826, 0);
          this.toolkit.bindTexture(param0 - 5788, (OpenGlTexture) null);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.active = false;
        }
        if (param0 == 5890) {
          return;
        }
        this.isSupported(47);
    }

    final boolean isSupported(int param0) {
        if (param0 > -87) {
          return false;
        }
        return this.supported;
    }

    final void applyRenderState(boolean param0, boolean param1) {
        if (!param0) {
          this.waterTextures = (LegacyOpenGlWaterTextures) null;
        }
    }

    public static void clearSharedReferences(int param0) {
        field_d = null;
        if (param0 != 13776) {
          effectsBufferSize = -2;
        }
    }

    LegacyOpenGlWaveWaterEffect(OpenGlToolkit param0, LegacyOpenGlWaterTextures param1) {
        super(param0);
        LegacyOpenGlShader var5 = null;
        LegacyOpenGlShader var4 = null;
        this.active = false;
        this.supported = false;
        try {
          this.waterTextures = param1;
          if (this.waterTextures.normalVolume != null &&
            this.toolkit.field_bc &&
            this.toolkit.field_B) {
            var5 = ShipFactory.compileLegacyOpenGlShader(35633, this.toolkit, 18753, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            LegacyOpenGlShader var3 = var5;
            var4 = ShipFactory.compileLegacyOpenGlShader(35632, this.toolkit, 18753, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.program = GetTorpedoAcceleration.linkLegacyOpenGlProgram(new LegacyOpenGlShader[]{var5, var4}, (byte) 107, this.toolkit);
            this.supported = null != this.program ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "mw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setTexture(int param0, byte param1, OpenGlTexture param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 125) {
            this.supported = true;
          }
          if (this.active) {
            return;
          }
          this.toolkit.bindTexture(param1 ^ 14, param2);
          this.toolkit.setTextureCombineMode(param1 ^ 125, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("mw.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void setParameters(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        long var11 = 0L;
        if (this.active) {
          var4 = 1 << (param0 & 3);
          var5 = (float)(1 << ((56 & param0) >> 3)) / 32.0f;
          var6 = param2 & 65535;
          var7 = (float)((231673 & param2) >> 16) / 8.0f;
          var8 = (float)((8159859 & param2) >> 19) / 16.0f;
          var9 = (float)(param2 >> 23 & 15) / 16.0f;
          var10 = (2025808678 & param2) >> 27;
          var11 = this.program.handle;
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * this.toolkit.field_Mc % 40000) / 40000.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float)var6);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
          jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float)var10);
        }
        if (param1 == -25139) {
          return;
        }
        this.supported = false;
    }

    final void enable(boolean param0, int param1) {
        float var4 = 0.0f;
        long var5 = 0L;
        OpenGlCubeTexture var3 = this.toolkit.getEnvironmentCubeTexture(false);
        float var4Lifetime1;
        long var5Lifetime1;
        if (param1 <= 18) {
          this.setParameters(63, -77, 49);
          if (this.supported) {
            if (var3 != null) {
              var4 = 2.0f * (-Math.abs(this.toolkit.field_Eb[1]) + 1.0f) + 1.0f;
              this.toolkit.setActiveTextureUnit(33984, 1);
              this.toolkit.bindTexture(54, var3);
              this.toolkit.setActiveTextureUnit(33984, 0);
              this.toolkit.bindTexture(113, this.waterTextures.normalVolume);
              var5 = this.program.handle;
              jaggl.OpenGL.glUseProgramObjectARB(var5);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -this.toolkit.field_Eb[0], -this.toolkit.field_Eb[1], -this.toolkit.field_Eb[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), this.toolkit.field_nb * var4, var4 * this.toolkit.field_nc, this.toolkit.field_i * var4, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), Math.abs(this.toolkit.field_Eb[1]) * 928.0f + 64.0f);
              this.active = true;
            }
            return;
          }
          return;
        }
        if (!this.supported) {
          return;
        }
        if (var3 != null) {
          var4Lifetime1 = 2.0f * (-Math.abs(this.toolkit.field_Eb[1]) + 1.0f) + 1.0f;
          this.toolkit.setActiveTextureUnit(33984, 1);
          this.toolkit.bindTexture(54, var3);
          this.toolkit.setActiveTextureUnit(33984, 0);
          this.toolkit.bindTexture(113, this.waterTextures.normalVolume);
          var5Lifetime1 = this.program.handle;
          jaggl.OpenGL.glUseProgramObjectARB(var5Lifetime1);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "normalSampler"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "envMapSampler"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "sunDir"), -this.toolkit.field_Eb[0], -this.toolkit.field_Eb[1], -this.toolkit.field_Eb[2]);
          jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "sunColour"), this.toolkit.field_nb * var4Lifetime1, var4Lifetime1 * this.toolkit.field_nc, this.toolkit.field_i * var4Lifetime1, 1.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "sunExponent"), Math.abs(this.toolkit.field_Eb[1]) * 928.0f + 64.0f);
          this.active = true;
          return;
        }
    }

    static {
        field_d = "Enter name of player to add to list";
    }
}
