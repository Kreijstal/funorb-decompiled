/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlShoreWaveWaterEffect extends LegacyOpenGlEffect {
    static boolean field_e;
    private LegacyWaterTextureResources waterTextures;
    static int[] field_h;
    private boolean active;
    static String updatesWillSentToText;
    private LegacyOpenGlShaderProgram program;
    private boolean supported;
    static int field_l;

    final void disable(int guard) {
        if (this.active) {
          this.toolkit.setActiveTextureUnit(1, 90);
          this.toolkit.bindTexture(123, (LegacyOpenGlTexture) null);
          this.toolkit.setActiveTextureUnit(0, 126);
          this.toolkit.bindTexture(75, (LegacyOpenGlTexture) null);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.active = false;
        }
        if (guard <= -125) {
          return;
        }
        this.disable(-69);
    }

    final void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 35) {
            this.enable((byte) 25, true);
          }
          if (this.active) {
            return;
          }
          this.toolkit.bindTexture(82, texture);
          this.toolkit.setTextureCombineMode(combineMode, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("gr.A(").append(guard).append(',').append(combineMode).append(',');
          if (texture == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean isSupported(byte guard) {
        if (guard > -64) {
          this.program = (LegacyOpenGlShaderProgram) null;
          return this.supported;
        }
        return this.supported;
    }

    final void refreshState(int guard, boolean lighting) {
        if (guard >= -30) {
          this.refreshState(-89, false);
        }
    }

    public static void releaseStatics(byte param0) {
        updatesWillSentToText = null;
        field_h = null;
        if (param0 != -19) {
          field_e = true;
        }
    }

    final void setParameters(byte guard, int parameters0, int parameters1) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        long var11 = 0L;
        int var4Lifetime1;
        float var5Lifetime1;
        int var6Lifetime1;
        float var7Lifetime1;
        float var8Lifetime1;
        float var9Lifetime1;
        int var10Lifetime1;
        long var11Lifetime1;
        if (guard >= 39) {
          if (this.active) {
            var4 = 1 << (3 & parameters0);
            var5 = (float)(1 << (parameters0 >> 3 & 7)) / 32.0f;
            var6 = 65535 & parameters1;
            var7 = (float)(3 & parameters1 >> 16) / 8.0f;
            var8 = (float)((7941702 & parameters1) >> 19) / 16.0f;
            var9 = (float)((parameters1 & 132918055) >> 23) / 16.0f;
            var10 = (2044859413 & parameters1) >> 27;
            var11 = this.program.programHandle;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "time"), (float)(var4 * this.toolkit.animationTime % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float)var10);
          }
          return;
        }
        field_l = -80;
        if (this.active) {
          var4Lifetime1 = 1 << (3 & parameters0);
          var5Lifetime1 = (float)(1 << (parameters0 >> 3 & 7)) / 32.0f;
          var6Lifetime1 = 65535 & parameters1;
          var7Lifetime1 = (float)(3 & parameters1 >> 16) / 8.0f;
          var8Lifetime1 = (float)((7941702 & parameters1) >> 19) / 16.0f;
          var9Lifetime1 = (float)((parameters1 & 132918055) >> 23) / 16.0f;
          var10Lifetime1 = (2044859413 & parameters1) >> 27;
          var11Lifetime1 = this.program.programHandle;
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11Lifetime1, "time"), (float)(var4Lifetime1 * this.toolkit.animationTime % 40000) / 40000.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11Lifetime1, "scale"), var5Lifetime1);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11Lifetime1, "breakWaterDepth"), (float)var6Lifetime1);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11Lifetime1, "breakWaterOffset"), var7Lifetime1);
          jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(var11Lifetime1, "waveIntensity"), var9Lifetime1, var8Lifetime1);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var11Lifetime1, "waveExponent"), (float)var10Lifetime1);
        }
    }

    LegacyOpenGlShoreWaveWaterEffect(LegacyOpenGlGraphicsToolkit owner, LegacyWaterTextureResources textures) {
        super(owner);
        LegacyOpenGlShader var5 = null;
        LegacyOpenGlShader var4 = null;
        this.active = false;
        this.supported = false;
        try {
          this.waterTextures = textures;
          if (this.waterTextures.normalMap != null &&
            this.toolkit.supportsVertexShaders) {
            if (!this.toolkit.supportsFragmentShaders) {
              return;
            }
            var5 = WaterTextureResources.compileShader(this.toolkit, false, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            LegacyOpenGlShader var3 = var5;
            var4 = WaterTextureResources.compileShader(this.toolkit, false, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.program = AccountStatusDialogState.linkShaderProgram(-14382, new LegacyOpenGlShader[]{var5, var4}, this.toolkit);
            this.supported = null != this.program ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gr.<init>(" + (owner != null ? "{...}" : "null") + ',' + (textures != null ? "{...}" : "null") + ')');
        }
    }

    final void enable(byte guard, boolean lighting) {
        LegacyOpenGlCubeTexture var3 = null;
        float var4 = 0.0f;
        long var5 = 0L;
        LegacyOpenGlCubeTexture var3Lifetime1;
        float var4Lifetime1;
        long var5Lifetime1;
        if (guard <= 33) {
          field_l = 15;
          var3 = this.toolkit.environmentCube((byte) 62);
          if (this.supported) {
            if (var3 != null) {
              var4 = 1.0f + (-Math.abs(this.toolkit.field_o[1]) + 1.0f) * 2.0f;
              this.toolkit.setActiveTextureUnit(1, 92);
              this.toolkit.bindTexture(46, var3);
              this.toolkit.setActiveTextureUnit(0, 110);
              this.toolkit.bindTexture(46, this.waterTextures.normalMap);
              var5 = this.program.programHandle;
              jaggl.OpenGL.glUseProgramObjectARB(var5);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
              jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunDir"), -this.toolkit.field_o[0], -this.toolkit.field_o[1], -this.toolkit.field_o[2]);
              jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunColour"), this.toolkit.field_Fc * var4, this.toolkit.field_z * var4, var4 * this.toolkit.field_ac, 1.0f);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 64.0f + Math.abs(this.toolkit.field_o[1]) * 928.0f);
              this.active = true;
            }
            return;
          }
          return;
        }
        var3Lifetime1 = this.toolkit.environmentCube((byte) 62);
        if (!this.supported) {
          return;
        }
        if (var3Lifetime1 != null) {
          var4Lifetime1 = 1.0f + (-Math.abs(this.toolkit.field_o[1]) + 1.0f) * 2.0f;
          this.toolkit.setActiveTextureUnit(1, 92);
          this.toolkit.bindTexture(46, var3Lifetime1);
          this.toolkit.setActiveTextureUnit(0, 110);
          this.toolkit.bindTexture(46, this.waterTextures.normalMap);
          var5Lifetime1 = this.program.programHandle;
          jaggl.OpenGL.glUseProgramObjectARB(var5Lifetime1);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "normalSampler"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "envMapSampler"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "sunDir"), -this.toolkit.field_o[0], -this.toolkit.field_o[1], -this.toolkit.field_o[2]);
          jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "sunColour"), this.toolkit.field_Fc * var4Lifetime1, this.toolkit.field_z * var4Lifetime1, var4Lifetime1 * this.toolkit.field_ac, 1.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var5Lifetime1, "sunExponent"), 64.0f + Math.abs(this.toolkit.field_o[1]) * 928.0f);
          this.active = true;
          return;
        }
    }

    final static boolean isValidAccountName(CharSequence text, byte guard) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 53) {
            updatesWillSentToText = (String) null;
          }
          stackIn_3_0 = DisplayPromptRenderer.isValidAccountName(false, 126, text);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gr.C(");
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_h = new int[1000];
        updatesWillSentToText = "Updates will sent to the email address you've given";
        field_e = false;
    }
}
