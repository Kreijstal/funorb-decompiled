/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlRectangleTexture extends OpenGlTexture implements Texture2D {
    private int height;
    static int field_k;
    private int width;

    public final void setWrap(boolean repeatY, boolean repeatX, boolean guard) {
        if (!guard) {
          field_k = 53;
        }
    }

    public final void setFilter(TextureFilter filter, int guard) {
        try {
          super.setFilter(filter, guard);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "or.J(" + (filter != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (DroneEscalationSupport.isAsciiAlphanumeric(57, param1)) {
            return true;
          }
          var6 = MidiPcmStream.field_o;
          var2 = var6;
          if (param0 != 61) {
            field_k = -127;
          }
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (~var4 == ~param1) {
              return true;
            }
          }
          var2Lifetime1 = PacketBuffer.field_m;
          for (var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param1 == var4Lifetime1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "or.S(" + param0 + ',' + param1 + ')');
        }
    }

    public final int width(int guard) {
        if (guard != -16625) {
          return 22;
        }
        return this.width;
    }

    public final float textureU(float pixelX, int guard) {
        if (guard >= -10) {
          return 0.9796783924102783f;
        }
        return pixelX;
    }

    public final int height(byte guard) {
        int var2 = 7 / ((-39 - guard) / 40);
        return this.height;
    }

    public final void bind(int guard) {
        super.bind(guard);
    }

    OpenGlRectangleTexture(OpenGlGraphicsToolkit param0, TextureFormat param1, GpuDataType param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        try {
          this.width = param3;
          this.height = param4;
          this.toolkit.a((GpuTexture) (this), 92);
          jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.glInternalFormat(-27), param3, param4, 0, IntrusiveNodeHashTable.glTextureFormat(-21339, this.format), ClientStackTraceFormatter.glDataType(this.dataType, (byte) 119), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "or.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    OpenGlRectangleTexture(OpenGlGraphicsToolkit param0, TextureFormat param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, GpuDataType.UNSIGNED_BYTE, param2 * param3, false);
        try {
          this.width = param2;
          this.height = param3;
          this.toolkit.a((GpuTexture) (this), 113);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.glInternalFormat(-8), param2, param3, 0, IntrusiveNodeHashTable.glTextureFormat(-21339, this.format), 5121, param4, param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "or.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final float textureV(float pixelY, int guard) {
        if (guard != -19230) {
          return 1.154227375984192f;
        }
        return pixelY;
    }

    public final boolean usesNormalizedCoordinates(int guard) {
        if (guard != -24722) {
          return false;
        }
        return false;
    }

    OpenGlRectangleTexture(OpenGlGraphicsToolkit param0, TextureFormat param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, GpuDataType.FLOAT, param2 * param3, false);
        try {
          this.height = param3;
          this.width = param2;
          this.toolkit.a((GpuTexture) (this), 95);
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Df(this.target, 0, this.glInternalFormat(-103), param2, param3, 0, IntrusiveNodeHashTable.glTextureFormat(-21339, this.format), 5126, param4, param5 * 4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "or.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    OpenGlRectangleTexture(OpenGlGraphicsToolkit param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, BeveledTextInputRenderer.RGBA, GpuDataType.UNSIGNED_BYTE, param2 * param1, false);
        try {
          this.height = param2;
          this.width = param1;
          this.toolkit.a((GpuTexture) (this), 93);
          jaggl.OpenGL.glPixelStorei(3314, param5);
          jaggl.OpenGL.glTexImage2Di(this.target, 0, 6408, this.width, this.height, 0, 32993, this.toolkit.field_Ec, param3, 4 * param4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "or.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_k = 20;
    }
}
