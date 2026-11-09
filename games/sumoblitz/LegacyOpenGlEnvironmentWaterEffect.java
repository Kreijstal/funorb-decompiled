/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlEnvironmentWaterEffect extends LegacyOpenGlEffect {
    static int field_i;
    private boolean supported;
    private LegacyOpenGlShaderProgram program;
    private LegacyWaterTextureResources waterTextures;
    static String visitTheAccountManagementText;
    static String pleaseSendMeNewsText;
    private boolean active;

    LegacyOpenGlEnvironmentWaterEffect(LegacyOpenGlGraphicsToolkit owner, LegacyWaterTextureResources textures) {
        super(owner);
        LegacyOpenGlShader var5 = null;
        LegacyOpenGlShader var4 = null;
        this.supported = false;
        this.active = false;
        try {
          this.waterTextures = textures;
          if (this.waterTextures.normalMap != null &&
            this.toolkit.supportsVertexShaders &&
            this.toolkit.supportsFragmentShaders) {
            var5 = WaterTextureResources.compileShader(this.toolkit, false, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
            LegacyOpenGlShader var3 = var5;
            var4 = WaterTextureResources.compileShader(this.toolkit, false, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
            this.program = hc.linkShaderProgram(-14382, new LegacyOpenGlShader[]{var5, var4}, this.toolkit);
            this.supported = null != this.program ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lv.<init>(" + (owner != null ? "{...}" : "null") + ',' + (textures != null ? "{...}" : "null") + ')');
        }
    }

    final void refreshState(int guard, boolean lighting) {
        if (guard >= -30) {
          pleaseSendMeNewsText = (String) null;
        }
    }

    final void enable(byte guard, boolean lighting) {
        long var4 = 0L;
        LegacyOpenGlCubeTexture var3 = this.toolkit.environmentCube((byte) 62);
        if (this.supported &&
          var3 != null) {
          this.toolkit.setActiveTextureUnit(1, 113);
          this.toolkit.bindTexture(41, var3);
          this.toolkit.setActiveTextureUnit(0, 97);
          this.toolkit.bindTexture(121, this.waterTextures.normalMap);
          var4 = this.program.programHandle;
          jaggl.OpenGL.glUseProgramObjectARB(var4);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
          jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
          jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -this.toolkit.field_o[0], -this.toolkit.field_o[1], -this.toolkit.field_o[2]);
          jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), this.toolkit.field_Fc, this.toolkit.field_z, this.toolkit.field_ac, 1.0f);
          jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0f * Math.abs(this.toolkit.field_o[1]) + 96.0f);
          this.active = true;
        }
        if (guard >= 33) {
          return;
        }
        this.program = (LegacyOpenGlShaderProgram) null;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 3) {
          visitTheAccountManagementText = (String) null;
          visitTheAccountManagementText = null;
          pleaseSendMeNewsText = null;
          return;
        }
        visitTheAccountManagementText = null;
        pleaseSendMeNewsText = null;
    }

    final static jj a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        jj[] var3 = null;
        jj var5 = null;
        int var6 = 0;
        jj stackIn_4_0 = null;
        jj stackIn_7_0 = null;
        jj stackIn_13_0 = null;
        jj stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2 = TextureFilter.a(param0, (byte) -57, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_4_0 = na.field_c;
            return stackIn_4_0;
          }
          if (param1 != 1) {
            stackIn_7_0 = (jj) null;
            return stackIn_7_0;
          }
          var3 = SingleChildWidget.a(32);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, param1 - 2184)) {
              stackIn_13_0 = var5;
              return stackIn_13_0;
            }
          }
          stackIn_16_0 = na.field_c;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("lv.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 35) {
            this.active = true;
          }
          if (this.active) {
            return;
          }
          this.toolkit.bindTexture(20, texture);
          this.toolkit.setTextureCombineMode(combineMode, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("lv.A(").append(guard).append(',').append(combineMode).append(',');
          if (texture == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void disable(int guard) {
        if (this.active) {
          this.toolkit.setActiveTextureUnit(1, 105);
          this.toolkit.bindTexture(84, (LegacyOpenGlTexture) null);
          this.toolkit.setActiveTextureUnit(0, 80);
          this.toolkit.bindTexture(98, (LegacyOpenGlTexture) null);
          jaggl.OpenGL.glUseProgramObjectARB(0L);
          this.active = false;
        }
        if (guard <= -125) {
          return;
        }
        pleaseSendMeNewsText = (String) null;
    }

    final boolean isSupported(byte guard) {
        if (guard > -64) {
          this.waterTextures = (LegacyWaterTextureResources) null;
          return false;
        }
        return false;
    }

    final void setParameters(byte guard, int parameters0, int parameters1) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        if (guard >= 39) {
          if (this.active) {
            var4 = 1 << (3 & parameters0);
            var5 = (float)(1 << ((56 & parameters0) >> 3)) / 32.0f;
            var6 = 65535 & parameters1;
            var7 = (float)((parameters1 & 204417) >> 16) / 8.0f;
            var8 = this.program.programHandle;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * this.toolkit.animationTime % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
          }
          return;
        }
    }

    static {
        pleaseSendMeNewsText = "Please send me news and updates (I can unsubscribe at any time)";
        field_i = 0;
        visitTheAccountManagementText = "Visit the Account Management section on the main site to view.";
    }
}
