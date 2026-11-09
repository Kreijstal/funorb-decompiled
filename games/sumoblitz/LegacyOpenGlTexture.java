/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyOpenGlTexture implements LegacyOpenGlFramebufferAttachment {
    int textureId;
    private boolean mipmapped;
    LegacyOpenGlGraphicsToolkit toolkit;
    int internalFormat;
    private int texelCount;
    int target;
    static volatile int field_h;
    static String confirmPasswordText;
    private boolean linearFiltering;
    static ToolkitSprite[] field_e;

    final int textureId(int guard) {
        if (guard > -97) {
          field_e = (ToolkitSprite[]) null;
          return this.textureId;
        }
        return this.textureId;
    }

    private final int estimatedBytes(boolean guard) {
        int var2 = this.toolkit.textureFormatBytes(this.internalFormat, -120) * this.texelCount;
        if (!guard) {
          return this.mipmapped ? var2 * 4 / 3 : var2;
        }
        return -30;
    }

    final boolean generateMipmaps(boolean guard) {
        int var2 = 0;
        if (guard) {
          return false;
        }
        if (this.toolkit.supportsFramebufferObjects) {
          var2 = this.estimatedBytes(false);
          this.toolkit.bindTexture(92, this);
          jaggl.OpenGL.glGenerateMipmapEXT(this.target);
          this.mipmapped = true;
          this.applyFilter(-71);
          this.updateMemoryAccounting((byte) 86, var2);
          return true;
        }
        return false;
    }

    final void close(byte guard) {
        if (0 < this.textureId) {
          this.toolkit.queueTextureDeletion(this.textureId, this.estimatedBytes(false), (byte) -10);
          this.textureId = 0;
        }
        if (guard > 84) {
          return;
        }
        field_h = -53;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -81) {
          LegacyOpenGlTexture.releaseStatics((byte) 94);
          field_e = null;
          confirmPasswordText = null;
          return;
        }
        field_e = null;
        confirmPasswordText = null;
    }

    final void setLinearFiltering(boolean linear, int guard) {
        if (guard == 0) {
          if ((linear ? 1 : 0) == (!this.linearFiltering ? 1 : 0)) {
            this.linearFiltering = linear ? true : false;
            this.applyFilter(guard ^ -112);
          }
          return;
        }
        this.internalFormat = 22;
        if ((linear ? 1 : 0) == (!this.linearFiltering ? 1 : 0)) {
          this.linearFiltering = linear ? true : false;
          this.applyFilter(guard ^ -112);
        }
    }

    final static OpenGlShaderProgram linkShaderProgram(OpenGlShader[] shaders, OpenGlGraphicsToolkit toolkit, byte guard) {
        int var3_int = 0;
        Object stackIn_25_0 = null;
        OpenGlShaderProgram stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var3_int = 0; shaders.length > var3_int; var3_int++) {
            if (shaders[var3_int] == null) {
              return null;
            }
            if (shaders[var3_int].shaderHandle <= 0L) {
              return null;
            }
          }
          var4 = 12 % ((guard - 40) / 55);
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; shaders.length > var5; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, shaders[var5].shaderHandle);
          }
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, LoginIdentifierSupport.field_b, 0);
          if (LoginIdentifierSupport.field_b[0] == 0) {
            if (LoginIdentifierSupport.field_b[0] == 0) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, LoginIdentifierSupport.field_b, 1);
            if (LoginIdentifierSupport.field_b[1] > 1) {
              var11 = new byte[LoginIdentifierSupport.field_b[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, LoginIdentifierSupport.field_b[1], LoginIdentifierSupport.field_b, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (LoginIdentifierSupport.field_b[0] == 0) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (shaders.length > var7) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, shaders[var7].shaderHandle);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_25_0 = null;
              return (OpenGlShaderProgram) (stackIn_25_0);
            }
          }
          stackIn_27_0 = new OpenGlShaderProgram(toolkit, var3_long, shaders);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ht.P(");
          if (shaders == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (toolkit == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void applyFilter(int guard) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        this.toolkit.bindTexture(12, this);
        if (guard <= -70) {
          if (this.linearFiltering) {
            stackIn_8_0 = this.target;
            stackIn_8_1 = 10241;
            stackIn_9_2 = (this.mipmapped) ? 9987 : 9729;
            jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_9_2);
            jaggl.OpenGL.glTexParameteri(this.target, 10240, 9729);
          } else {
            stackIn_4_0 = this.target;
            stackIn_4_1 = 10241;
            stackIn_5_2 = (!this.mipmapped) ? 9728 : 9984;
            jaggl.OpenGL.glTexParameteri(stackIn_4_0, stackIn_4_1, stackIn_5_2);
            jaggl.OpenGL.glTexParameteri(this.target, 10240, 9728);
          }
        } else {
          this.toolkit = (LegacyOpenGlGraphicsToolkit) null;
          if (this.linearFiltering) {
            stackIn_18_0 = this.target;
            stackIn_18_1 = 10241;
            stackIn_19_2 = (this.mipmapped) ? 9987 : 9729;
            jaggl.OpenGL.glTexParameteri(stackIn_18_0, stackIn_18_1, stackIn_19_2);
            jaggl.OpenGL.glTexParameteri(this.target, 10240, 9729);
          } else {
            stackIn_14_0 = this.target;
            stackIn_14_1 = 10241;
            stackIn_15_2 = (!this.mipmapped) ? 9728 : 9984;
            jaggl.OpenGL.glTexParameteri(stackIn_14_0, stackIn_14_1, stackIn_15_2);
            jaggl.OpenGL.glTexParameteri(this.target, 10240, 9728);
          }
        }
    }

    final void noteMipmaps(boolean guard, boolean mipmapsUsed) {
        int var3 = 0;
        if (guard) {
          if ((!mipmapsUsed ? 1 : 0) != (!this.mipmapped ? 1 : 0)) {
            var3 = this.estimatedBytes(false);
            this.mipmapped = true;
            this.applyFilter(-119);
            this.updateMemoryAccounting((byte) 45, var3);
          }
          return;
        }
    }

    protected final void finalize() throws Throwable {
        this.close((byte) 112);
        super.finalize();
    }

    private final void updateMemoryAccounting(byte guard, int previousBytes) {
        this.toolkit.textureBytes = this.toolkit.textureBytes - previousBytes;
        if (guard > 38) {
          this.toolkit.textureBytes = this.toolkit.textureBytes + this.estimatedBytes(false);
          return;
        }
    }

    final static LoginFieldValue c(boolean param0) {
        if (!param0) {
          return (LoginFieldValue) null;
        }
        return new LoginFieldValue(HiscoreRequest.accountServiceIdentifier(100), LegacyCubeMapSource.isEmailAvailabilityPending(77));
    }

    LegacyOpenGlTexture(LegacyOpenGlGraphicsToolkit owner, int textureTarget, int storageFormat, int pixels, boolean mipmaps) {
        this.linearFiltering = false;
        try {
          this.texelCount = pixels;
          this.internalFormat = storageFormat;
          this.mipmapped = mipmaps ? true : false;
          this.toolkit = owner;
          this.target = textureTarget;
          jaggl.OpenGL.glGenTextures(1, GameProgressUpdate.field_m, 0);
          this.textureId = GameProgressUpdate.field_m[0];
          this.updateMemoryAccounting((byte) 78, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ht.<init>(" + (owner != null ? "{...}" : "null") + ',' + textureTarget + ',' + storageFormat + ',' + pixels + ',' + mipmaps + ')');
        }
    }

    static {
        field_h = 0;
        confirmPasswordText = "Confirm Password: ";
    }
}
