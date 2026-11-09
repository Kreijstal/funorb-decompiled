/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlTexture2D extends OpenGlTexture implements Texture2D {
    static boolean field_j;
    private int width;
    private int height;

    final void uploadBytes(TextureFormat format, int x, byte guard, int offset, byte[] pixels, int height, int width, int y, int rowLength) {
        try {
          this.toolkit.a((GpuTexture) (this), guard ^ 43);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glPixelStorei(3314, rowLength);
          jaggl.OpenGL.glTexSubImage2Dub(this.target, 0, x, y, width, height, IntrusiveNodeHashTable.glTextureFormat(guard - 21416, format), 5121, pixels, offset);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          if (guard != 77) {
            field_j = true;
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sa.S(" + (format != null ? "{...}" : "null") + ',' + x + ',' + guard + ',' + offset + ',' + (pixels != null ? "{...}" : "null") + ',' + height + ',' + width + ',' + y + ',' + rowLength + ')');
        }
    }

    public final void bind(int guard) {
        super.bind(guard);
    }

    public final float textureU(float pixelX, int guard) {
        if (guard > -10) {
          this.height = 68;
          return pixelX / (float)this.width;
        }
        return pixelX / (float)this.width;
    }

    OpenGlTexture2D(OpenGlGraphicsToolkit param0, TextureFormat param1, GpuDataType param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param4 * param3, false);
        try {
          this.width = param3;
          this.height = param4;
          this.toolkit.a((GpuTexture) (this), 108);
          jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.glInternalFormat(-67), param3, param4, 0, IntrusiveNodeHashTable.glTextureFormat(-21339, this.format), ws.glDataType(this.dataType, (byte) 117), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final float textureV(float pixelY, int guard) {
        if (guard != -19230) {
          this.width = -80;
          return pixelY / (float)this.height;
        }
        return pixelY / (float)this.height;
    }

    public final void setWrap(boolean repeatY, boolean repeatX, boolean guard) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        if (guard) {
          this.toolkit.a((GpuTexture) (this), 91);
          stackIn_3_0 = this.target;
          stackIn_3_1 = 10242;
          stackIn_4_2 = (!repeatX) ? 33071 : 10497;
          jaggl.OpenGL.glTexParameteri(stackIn_3_0, stackIn_3_1, stackIn_4_2);
          stackIn_6_0 = this.target;
          stackIn_6_1 = 10243;
          stackIn_7_2 = (repeatY) ? 10497 : 33071;
          jaggl.OpenGL.glTexParameteri(stackIn_6_0, stackIn_6_1, stackIn_7_2);
        } else {
          field_j = true;
          this.toolkit.a((GpuTexture) (this), 91);
          stackIn_10_0 = this.target;
          stackIn_10_1 = 10242;
          stackIn_11_2 = (!repeatX) ? 33071 : 10497;
          jaggl.OpenGL.glTexParameteri(stackIn_10_0, stackIn_10_1, stackIn_11_2);
          stackIn_13_0 = this.target;
          stackIn_13_1 = 10243;
          stackIn_14_2 = (repeatY) ? 10497 : 33071;
          jaggl.OpenGL.glTexParameteri(stackIn_13_0, stackIn_13_1, stackIn_14_2);
        }
    }

    OpenGlTexture2D(OpenGlGraphicsToolkit param0, TextureFormat param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, GpuDataType.FLOAT, param2 * param3, param4);
        RuntimeException var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.width = param2;
          this.height = param3;
          this.toolkit.a((GpuTexture) (this), 109);
          if (!param4 &&
            param7 == 0 &&
            param6 == 0) {
            this.uploadFloatMipmaps(this.target, param3, -117, param2, param5);
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, param7);
          jaggl.OpenGL.glTexImage2Df(this.target, 0, this.glInternalFormat(-8), param2, param3, 0, IntrusiveNodeHashTable.glTextureFormat(-21339, this.format), 5126, param5, 4 * param6);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("sa.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    OpenGlTexture2D(OpenGlGraphicsToolkit param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, BeveledTextInputRenderer.RGBA, GpuDataType.UNSIGNED_BYTE, param1 * param2, param3);
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.height = param2;
          this.width = param1;
          this.toolkit.a((GpuTexture) (this), 125);
          if (param3 &&
            param6 == 0 &&
            param5 == 0) {
            this.uploadIntMipmaps(param2, param1, param4, this.target, -1);
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Di(this.target, 0, 6408, this.width, this.height, 0, 32993, this.toolkit.field_Ec, param4, 4 * param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("sa.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final boolean usesNormalizedCoordinates(int guard) {
        if (guard != -24722) {
          this.height = 91;
          return true;
        }
        return true;
    }

    public final int height(byte guard) {
        int var2 = -100 % ((guard + 39) / 40);
        return this.height;
    }

    public final void setFilter(TextureFilter filter, int guard) {
        try {
          if (guard != 15149) {
            this.textureV(0.2777647376060486f, 21);
          }
          super.setFilter(filter, guard + 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sa.J(" + (filter != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void uploadInts(int height, boolean guard, int offset, int width, int rowLength, int[] pixels, int y, int x) {
        this.toolkit.a((GpuTexture) (this), 123);
        jaggl.OpenGL.glPixelStorei(3314, rowLength);
        jaggl.OpenGL.glTexSubImage2Di(this.target, 0, x, y, width, height, 32993, this.toolkit.field_Ec, pixels, offset);
        if (guard) {
          return;
        }
        try {
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sa.U(" + height + ',' + guard + ',' + offset + ',' + width + ',' + rowLength + ',' + (pixels != null ? "{...}" : "null") + ',' + y + ',' + x + ')');
        }
    }

    OpenGlTexture2D(OpenGlGraphicsToolkit param0, TextureFormat param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, GpuDataType.UNSIGNED_BYTE, param2 * param3, param4);
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          this.height = param3;
          this.width = param2;
          this.toolkit.a((GpuTexture) (this), 109);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          if (param4 &&
            0 == param7 &&
            0 == param6) {
            this.uploadByteMipmaps(param5, param2, this.target, param3, 81);
          } else {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.glInternalFormat(104), param2, param3, 0, IntrusiveNodeHashTable.glTextureFormat(-21339, this.format), 5121, param5, param6);
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_10_0 = var9;
          stackIn_10_1 = new StringBuilder().append("sa.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final int width(int guard) {
        if (guard != -16625) {
          return 83;
        }
        return this.width;
    }

    final void uploadFloats(int x, TextureFormat format, int height, int y, int guard, int offset, int width, float[] pixels, int rowLength) {
        try {
          this.toolkit.a((GpuTexture) (this), guard - 14032);
          jaggl.OpenGL.glPixelStorei(3314, rowLength);
          jaggl.OpenGL.glTexSubImage2Df(this.target, 0, x, y, width, height, IntrusiveNodeHashTable.glTextureFormat(-21339, format), 5121, pixels, offset);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          if (guard != 14137) {
            field_j = false;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sa.T(" + x + ',' + (format != null ? "{...}" : "null") + ',' + height + ',' + y + ',' + guard + ',' + offset + ',' + width + ',' + (pixels != null ? "{...}" : "null") + ',' + rowLength + ')');
        }
    }

    static {
    }
}
