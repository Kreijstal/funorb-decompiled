/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlGpuTexture2D extends OpenGlGpuTexture implements GpuTexture2D {
    private int width;
    private int height;
    static Sprite field_j;
    static String field_k;

    OpenGlGpuTexture2D(OpenGlGpuToolkit param0, TextureFormat param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, GpuDataType.FLOAT, param3 * param2, param4);
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
          this.height = param3;
          this.width = param2;
          this.toolkit.setTexture((GpuTexture) (this), -111);
          if (!param4 &&
            param7 == 0 &&
            param6 == 0) {
            this.uploadFloatMipmaps(this.target, param5, param3, param2, (byte) -67);
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, param7);
          jaggl.OpenGL.glTexImage2Df(this.target, 0, this.getInternalFormat((byte) -31), param2, param3, 0, MissionControl.toOpenGlTextureFormat(-29328, this.format), 5126, param5, 4 * param6);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("ubb.<init>(");
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
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void updateBytePixels(int param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, TextureFormat param8) {
        try {
          this.toolkit.setTexture((GpuTexture) (this), -116);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glPixelStorei(param6, param0);
          jaggl.OpenGL.glTexSubImage2Dub(this.target, 0, param7, param5, param3, param2, MissionControl.toOpenGlTextureFormat(param6 ^ -32382, param8), 5121, param1, param4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ubb.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    OpenGlGpuTexture2D(OpenGlGpuToolkit param0, TextureFormat param1, GpuDataType param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param4 * param3, false);
        try {
          this.height = param4;
          this.width = param3;
          this.toolkit.setTexture((GpuTexture) (this), -118);
          jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.getInternalFormat((byte) -31), param3, param4, 0, MissionControl.toOpenGlTextureFormat(-29328, this.format), OpenGlVertexAttribute.toOpenGlDataType(true, this.dataType), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ubb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final float getV(float param0, int param1) {
        if (param1 <= 58) {
          return 0.2576850950717926f;
        }
        return param0 / (float)this.height;
    }

    public final float getU(float param0, int param1) {
        if (param1 == -1080) {
          return param0 / (float)this.width;
        }
        this.setRepeat(false, (byte) 127, false);
        return param0 / (float)this.width;
    }

    public final void setFilterMode(TextureFilterMode param0, int param1) {
        try {
          super.setFilterMode(param0, param1 ^ 0);
          if (param1 != -28798) {
            field_j = (Sprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ubb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void updatePixels(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7) {
        try {
          this.toolkit.setTexture((GpuTexture) (this), -121);
          jaggl.OpenGL.glPixelStorei(3314, param4);
          jaggl.OpenGL.glTexSubImage2Di(this.target, 0, param6, param0, param2, param1, 32993, this.toolkit.field_Nc, param5, param3);
          if (param7 >= -78) {
            this.height = 42;
          }
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ubb.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void printDebug(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (SetPointDefenceLaserProjectileDamage.field_o) {
            System.out.print(param0);
          }
          if (param1 == 0) {
            return;
          }
          var3 = (String) null;
          OpenGlGpuTexture2D.printDebug((String) null, 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ubb.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    OpenGlGpuTexture2D(OpenGlGpuToolkit param0, TextureFormat param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, GpuDataType.UNSIGNED_BYTE, param3 * param2, param4);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.height = param3;
          this.width = param2;
          this.toolkit.setTexture((GpuTexture) (this), -110);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          if (param4 &&
            param7 == 0 &&
            param6 == 0) {
            this.uploadByteMipmaps(this.target, param3, param5, 0, param2);
          } else {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.getInternalFormat((byte) -31), param2, param3, 0, MissionControl.toOpenGlTextureFormat(-29328, this.format), 5121, param5, param6);
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ubb.<init>(");
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
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final boolean usesNormalizedCoordinates(int param0) {
        int var2 = 24 % ((-92 - param0) / 34);
        return true;
    }

    public final void setRepeat(boolean param0, byte param1, boolean param2) {
        this.toolkit.setTexture((GpuTexture) (this), -121);
        jaggl.OpenGL.glTexParameteri(this.target, 10242, param0 ? 10497 : 33071);
        if (param1 == -98) {
          jaggl.OpenGL.glTexParameteri(this.target, 10243, !param2 ? 33071 : 10497);
          return;
        }
        this.getHeight((byte) 80);
        jaggl.OpenGL.glTexParameteri(this.target, 10243, !param2 ? 33071 : 10497);
    }

    OpenGlGpuTexture2D(OpenGlGpuToolkit param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, ComponentAttachmentPlan.field_d, GpuDataType.UNSIGNED_BYTE, param2 * param1, param3);
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
          this.toolkit.setTexture((GpuTexture) (this), -111);
          if (param3 &&
            param6 == 0 &&
            param5 == 0) {
            this.uploadArgbMipmaps((byte) 14, this.target, param2, param1, param4);
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Di(this.target, 0, 6408, this.width, this.height, 0, 32993, this.toolkit.field_Nc, param4, 4 * param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ubb.<init>(");
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
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final int getWidth(byte param0) {
        if (param0 != 113) {
          this.getU(-1.557132363319397f, 85);
          return this.width;
        }
        return this.width;
    }

    public final void bind(int param0) {
        if (param0 != -27445) {
          this.height = 72;
          super.bind(param0 ^ 0);
          return;
        }
        super.bind(param0 ^ 0);
    }

    public static void clearSharedReferences(byte param0) {
        field_k = null;
        if (param0 != 42) {
          return;
        }
        field_j = null;
    }

    public final int getHeight(byte param0) {
        if (param0 >= -40) {
          field_k = (String) null;
          return this.height;
        }
        return this.height;
    }

    final void updateFloatPixels(int param0, TextureFormat param1, byte param2, int param3, float[] param4, int param5, int param6, int param7, int param8) {
        try {
          this.toolkit.setTexture((GpuTexture) (this), -122);
          jaggl.OpenGL.glPixelStorei(3314, param3);
          jaggl.OpenGL.glTexSubImage2Df(this.target, 0, param6, param5, param7, param0, MissionControl.toOpenGlTextureFormat(-29328, param1), 5121, param4, param8);
          if (param2 >= -35) {
            OpenGlGpuTexture2D.clearSharedReferences((byte) -66);
          }
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ubb.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_k = "Short arm";
    }
}
