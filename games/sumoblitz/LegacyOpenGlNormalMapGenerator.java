/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlNormalMapGenerator {
    static volatile int field_a;
    static String youAreNotCurrentlyText;
    static boolean field_c;
    private LegacyOpenGlGraphicsToolkit toolkit;
    static String loadingLevelsText;
    private LegacyOpenGlShaderProgram program;

    public static void releaseStatics(byte param0) {
        loadingLevelsText = null;
        youAreNotCurrentlyText = null;
        if (param0 != -69) {
          loadingLevelsText = (String) null;
        }
    }

    LegacyOpenGlNormalMapGenerator(LegacyOpenGlGraphicsToolkit owner) {
        try {
          this.toolkit = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "b.<init>(" + (owner != null ? "{...}" : "null") + ')');
        }
    }

    final static void exitFullscreenIfActive(byte guard) {
        if (guard <= 1) {
          return;
        }
        if (null == FourIntUpdateRequest.platformDispatcher) {
          return;
        }
        if (null != CompactMeshGeometry.field_o) {
          HardwareAnimatedWaterEffect.d(1);
        }
    }

    final boolean ensureProgram(byte guard) {
        LegacyOpenGlShader var3 = null;
        LegacyOpenGlShader var2 = null;
        if (this.toolkit.supportsFramebufferObjects &&
          this.toolkit.supportsFragmentShaders &&
          this.program == null) {
          var3 = WaterTextureResources.compileShader(this.toolkit, false, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
          var2 = var3;
          if (var2 != null) {
            this.program = AccountStatusDialogState.linkShaderProgram(-14382, new LegacyOpenGlShader[]{var3}, this.toolkit);
          }
        }
        if (guard != -101) {
          field_a = -88;
        }
        return null != this.program ? true : false;
    }

    final boolean generateNormalMap(LegacyOpenGlTexture3D destination, float relief, boolean initialResult, LegacyOpenGlTexture3D heightMap) {
        int var8 = 0;
        RuntimeException var5 = null;
        LegacyOpenGlRenderbuffer var6 = null;
        int var7 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        LegacyOpenGlFramebuffer var11 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!this.ensureProgram((byte) -101)) {
            return false;
          }
          var11 = this.toolkit.scratchFramebuffer;
          var6 = new LegacyOpenGlRenderbuffer(this.toolkit, 6408, destination.width, destination.height);
          this.toolkit.pushFramebuffer(var11, -98);
          var7 = initialResult ? 1 : 0;
          var11.attachRenderbuffer(var6, 0, -14269);
          if (var11.isComplete(-276)) {
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5889);
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            jaggl.OpenGL.glPushAttrib(2048);
            jaggl.OpenGL.glViewport(0, 0, destination.width, destination.height);
            jaggl.OpenGL.glUseProgramObjectARB(this.program.programHandle);
            jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(this.program.programHandle, "heightMap"), 0);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(this.program.programHandle, "rcpRelief"), 1.0f / relief);
            jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(this.program.programHandle, "sampleSize"), 1.0f / (float)heightMap.width, 1.0f / (float)heightMap.height);
            for (var8 = 0; var8 < destination.depth; var8++) {
              var9 = (float)var8 / (float)destination.depth;
              this.toolkit.bindTexture(117, heightMap);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord3f(0.0f, 0.0f, var9);
              jaggl.OpenGL.glVertex2f(0.0f, 0.0f);
              jaggl.OpenGL.glTexCoord3f(1.0f, 0.0f, var9);
              jaggl.OpenGL.glVertex2f(1.0f, 0.0f);
              jaggl.OpenGL.glTexCoord3f(1.0f, 1.0f, var9);
              jaggl.OpenGL.glVertex2f(1.0f, 1.0f);
              jaggl.OpenGL.glTexCoord3f(0.0f, 1.0f, var9);
              jaggl.OpenGL.glVertex2f(0.0f, 1.0f);
              jaggl.OpenGL.glEnd();
              destination.copyFromFramebuffer(0, (byte) 80, 0, var8, destination.height, destination.width, 0, 0);
            }
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            jaggl.OpenGL.glPopAttrib();
            jaggl.OpenGL.glPopMatrix();
            jaggl.OpenGL.glMatrixMode(5888);
            var7 = 1;
            jaggl.OpenGL.glPopMatrix();
          }
          var11.detachAttachment(0, 17012);
          this.toolkit.popFramebuffer((byte) -72, (LegacyOpenGlFramebufferTarget) (var11));
          stackIn_11_0 = var7;
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("b.B(");
          if (destination == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(relief).append(',').append(initialResult).append(',');
          if (heightMap == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        IsaacPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        GameProgressUpdate var12 = null;
        IsaacPacketBuffer var13 = null;
        ServerIntArrayRequest var14 = null;
        int[] var15 = null;
        Object var16 = null;
        ServerIntArrayRequest var16_ref = null;
        int[] var17 = null;
        var16 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != -30084) {
            LegacyOpenGlNormalMapGenerator.exitFullscreenIfActive((byte) -53);
          }
          var13 = NativeLibraryExtractor.field_a;
          var2 = var13.readUnsignedByte(-31302);
          if (var2 == 0) {
            var11 = VertexBufferReference.a(-14808);
            var17 = var11;
            var15 = var17;
            var3 = var15;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte(param0 - 1218);
            for (var7 = 0; var7 < var6; var7++) {
              var10[var7] = ((PacketBuffer) ((Object) var5)).readInt(true);
            }
            var16_ref = (ServerIntArrayRequest) (CheckboxWidget.field_E.first(-120));
            if (var16_ref == null) {
              LegacyOpenGlTextureCache.closeAccountSocket((byte) -111);
              return;
            }
            var16_ref.complete = true;
            var16_ref.firstValue = var17[0];
            var16_ref.values = var3;
            var16_ref.unlink(false);
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              var14 = (ServerIntArrayRequest) (CheckboxWidget.field_E.first(123));
              if (var14 == null) {
                LegacyOpenGlTextureCache.closeAccountSocket((byte) -122);
                return;
              }
              var14.values = VertexBufferReference.a(-14808);
              var14.complete = true;
              var14.firstValue = var14.values[0];
              var14.unlink(false);
            } else {
              IntrusiveNode.reportClientError("A1: " + VictoryScreen.b((byte) 110), (Throwable) null, 0);
              LegacyOpenGlTextureCache.closeAccountSocket((byte) -120);
            }
          } else {
            var12 = (GameProgressUpdate) (SoftwareRenderTarget.field_f.first(param0 + 29968));
            if (var12 == null) {
              LegacyOpenGlTextureCache.closeAccountSocket((byte) -113);
              return;
            }
            var12.unlink(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "b.D(" + param0 + ')');
        }
    }

    static {
        field_a = 0;
        youAreNotCurrentlyText = "You are not currently logged in to the<nbsp>game.";
        loadingLevelsText = "Loading levels";
    }
}
