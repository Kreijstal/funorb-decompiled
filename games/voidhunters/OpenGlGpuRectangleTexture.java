/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlGpuRectangleTexture extends OpenGlGpuTexture implements GpuTexture2D {
    static int field_m;
    private int height;
    private int width;
    static gl field_k;

    OpenGlGpuRectangleTexture(OpenGlGpuToolkit param0, TextureFormat param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, GpuDataType.FLOAT, param2 * param3, false);
        try {
          this.height = param3;
          this.width = param2;
          this.toolkit.setTexture((GpuTexture) (this), -108);
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Df(this.target, 0, this.getInternalFormat((byte) -31), param2, param3, 0, MissionControl.toOpenGlTextureFormat(-29328, this.format), 5126, param4, 4 * param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final void setFilterMode(TextureFilterMode param0, int param1) {
        try {
          super.setFilterMode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gn.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void setRepeat(boolean param0, byte param1, boolean param2) {
        if (param1 != -98) {
          field_k = (gl) null;
        }
    }

    public final void bind(int param0) {
        super.bind(param0);
    }

    OpenGlGpuRectangleTexture(OpenGlGpuToolkit param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, ComponentAttachmentPlan.field_d, GpuDataType.UNSIGNED_BYTE, param2 * param1, false);
        try {
          this.height = param2;
          this.width = param1;
          this.toolkit.setTexture((GpuTexture) (this), -112);
          jaggl.OpenGL.glPixelStorei(3314, param5);
          jaggl.OpenGL.glTexImage2Di(this.target, 0, 6408, this.width, this.height, 0, 32993, this.toolkit.field_Nc, param3, param4 * 4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    OpenGlGpuRectangleTexture(OpenGlGpuToolkit param0, TextureFormat param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, GpuDataType.UNSIGNED_BYTE, param3 * param2, false);
        try {
          this.width = param2;
          this.height = param3;
          this.toolkit.setTexture((GpuTexture) (this), -108);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.getInternalFormat((byte) -31), param2, param3, 0, MissionControl.toOpenGlTextureFormat(-29328, this.format), 5121, param4, param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final float getU(float param0, int param1) {
        if (param1 != -1080) {
          this.height = -47;
          return param0;
        }
        return param0;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 <= 77) {
          return;
        }
        field_k = null;
    }

    public final boolean usesNormalizedCoordinates(int param0) {
        int var2 = 32 % ((param0 + 92) / 34);
        return false;
    }

    final static DiffableState[] a(int param0, IntrusiveDeque param1) {
        int var4 = 0;
        IntrusiveNode[] var2 = null;
        RuntimeException var2_ref = null;
        DiffableState[] var3 = null;
        int var5 = 0;
        IntrusiveNode[] var6 = null;
        Object stackIn_3_0 = null;
        DiffableState[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (DiffableState[]) (stackIn_3_0);
          }
          var6 = param1.toArray(param0 - 4872);
          var2 = var6;
          var3 = new DiffableState[var6.length];
          for (var4 = param0; var6.length > var4; var4++) {
            var3[var4] = (DiffableState) ((Object) var6[var4]);
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("gn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void updatePixels(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param7 >= -78) {
            this.getU(-1.5097984075546265f, 96);
          }
          this.toolkit.setTexture((GpuTexture) (this), -121);
          if (param4 == 0) {
            param4 = param2;
          }
          if (param2 != param4) {
            jaggl.OpenGL.glPixelStorei(3314, param4);
          }
          jaggl.OpenGL.glTexSubImage2Di(this.target, 0, param6, param0, param2, param1, 32993, this.toolkit.field_Nc, param5, param3);
          if (param2 == param4) {
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_12_0 = var9;
          stackIn_12_1 = new StringBuilder().append("gn.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    OpenGlGpuRectangleTexture(OpenGlGpuToolkit param0, TextureFormat param1, GpuDataType param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        try {
          this.height = param4;
          this.width = param3;
          this.toolkit.setTexture((GpuTexture) (this), -109);
          jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.getInternalFormat((byte) -31), param3, param4, 0, MissionControl.toOpenGlTextureFormat(-29328, this.format), OpenGlVertexAttribute.toOpenGlDataType(true, this.dataType), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int getWidth(byte param0) {
        if (param0 != 113) {
          this.width = -45;
          return this.width;
        }
        return this.width;
    }

    public final float getV(float param0, int param1) {
        if (param1 <= 58) {
          this.width = 118;
          return param0;
        }
        return param0;
    }

    public final int getHeight(byte param0) {
        if (param0 >= -40) {
          return 85;
        }
        return this.height;
    }

    static {
        field_k = new gl(4);
    }
}
