/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class OpenGlTexture implements GpuTexture {
    private TextureFilter filter;
    private boolean mipmapped;
    int target;
    OpenGlGraphicsToolkit toolkit;
    private int textureId;
    GpuDataType dataType;
    TextureFormat format;
    private int texelCount;

    final void uploadIntMipmaps(int height, int width, int[] pixels, int target, int guard) {
        int var24 = 0;
        int var25 = 0;
        int incrementValue$9 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var26 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var26 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (~width < guard &&
            !rm.a(width, -108)) {
            throw new IllegalArgumentException("");
          }
          if (height > 0 &&
            !rm.a(height, -127)) {
            throw new IllegalArgumentException("");
          }
          if (this.format != nl.RGBA) {
            throw new IllegalArgumentException("");
          }
          var6_int = 0;
          stackIn_14_0 = (height <= width) ? height : width;
          var7 = stackIn_14_0;
          var8 = width >> 1;
          var9 = height >> 1;
          var10 = pixels;
          var11 = new int[var9 * var8];
          while (true) {
            jaggl.OpenGL.glTexImage2Di(target, var6_int, this.glInternalFormat(guard + 101), width, height, 0, 32993, this.toolkit.field_Ec, var10, 0);
            if (var7 <= 1) {
              return;
            }
            var13 = 0;
            var22 = 0;
            var23 = var22 + width;
            var12 = var11;
            for (var24 = 0; var9 > var24; var24++) {
              for (var25 = 0; var8 > var25; var25++) {
                var14 = var10[var22++];
                var16 = var10[var23++];
                var15 = var10[var22++];
                var21 = 255 & var14 >> 24;
                var18 = 255 & var14 >> 16;
                var20 = 255 & var14;
                var17 = var10[var23++];
                var19 = (65493 & var14) >> 8;
                var20 = var20 + (255 & var15);
                var18 = var18 + ((16770131 & var15) >> 16);
                var21 = var21 + (var15 >> 24 & 255);
                var19 = var19 + (var15 >> 8 & 255);
                var18 = var18 + (var16 >> 16 & 255);
                var21 = var21 + (255 & var16 >> 24);
                var20 = var20 + (255 & var16);
                var19 = var19 + (255 & var16 >> 8);
                var20 = var20 + (255 & var17);
                var19 = var19 + ((var17 & 65361) >> 8);
                var18 = var18 + ((var17 & 16719727) >> 16);
                var21 = var21 + (var17 >> 24 & 255);
                incrementValue$9 = var13;
                var13++;
                var11[incrementValue$9] = ic.a(eb.bitwiseAnd(1020, var20) >> 2, ic.a(eb.bitwiseAnd(1020, var19) << 6, ic.a(eb.bitwiseAnd(16711680, var18 << 14), eb.bitwiseAnd(var21, 1020) << 22)));
              }
              var22 = var22 + width;
              var23 = var23 + width;
            }
            var11 = var10;
            height = var9;
            width = var8;
            var10 = var12;
            var6_int++;
            var7 = var7 >> 1;
            var8 = var8 >> 1;
            var9 = var9 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_27_0 = var6;
          stackIn_27_1 = new StringBuilder().append("bp.A(").append(height).append(',').append(width).append(',');
          if (pixels == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(target).append(',').append(guard).append(')').toString());
        }
    }

    final static int g(int param0) {
        if (2 > TextureCoordinateGeneration.field_a) {
          return 0;
        }
        if (param0 != 14296) {
          return -117;
        }
        if (dk.field_c == 0) {
          if (!wd.field_j.loadIndex((byte) 127)) {
            return 20;
          }
          if (!wd.field_j.tryLoadNamedGroup("commonui", 100)) {
            return 40;
          }
          if (!eb.field_f.loadIndex((byte) 127)) {
            return 50;
          }
          if (!eb.field_f.tryLoadNamedGroup("commonui", 100)) {
            return 60;
          }
          if (!hw.field_a.loadIndex((byte) 127)) {
            return 70;
          }
          if (!hw.field_a.tryLoadAllGroups(true)) {
            return 80;
          }
        } else {
          if (null != DropDownListWidget.field_H) {
            if (!DropDownListWidget.field_H.loadIndex((byte) 127)) {
              return 14;
            }
            if (!DropDownListWidget.field_H.hasGroupName((byte) -98, "")) {
              return 29;
            }
            if (!DropDownListWidget.field_H.tryLoadNamedGroup("", 100)) {
              return 29;
            }
          }
          if (!wd.field_j.loadIndex((byte) 127)) {
            return 43;
          }
          if (!wd.field_j.tryLoadNamedGroup("commonui", param0 ^ 14268)) {
            return 57;
          }
          if (!eb.field_f.loadIndex((byte) 127)) {
            return 71;
          }
          if (!eb.field_f.tryLoadNamedGroup("commonui", 100)) {
            return 80;
          }
          if (!hw.field_a.loadIndex((byte) 127)) {
            return 82;
          }
          if (!hw.field_a.tryLoadAllGroups(true)) {
            return 86;
          }
        }
        return 100;
    }

    final void uploadFloatMipmaps(int target, int height, int guard, int width, float[] pixels) {
        int var16 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var22 = 0;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (width > 0 &&
            !rm.a(width, -102)) {
            throw new IllegalArgumentException("");
          }
          if (height > 0 &&
            !rm.a(height, -102)) {
            throw new IllegalArgumentException("");
          }
          var6_int = this.format.componentCount;
          var7 = 0;
          stackIn_12_0 = (height <= width) ? height : width;
          var8 = stackIn_12_0;
          var9 = width >> 1;
          if (guard >= -115) {
            return;
          }
          var10 = height >> 1;
          var11 = pixels;
          var12 = new float[var6_int * (var9 * var10)];
          while (true) {
            jaggl.OpenGL.glTexImage2Df(target, var7, this.glInternalFormat(-107), width, height, 0, IntrusiveNodeHashTable.glTextureFormat(-21339, this.format), 5126, var11, 0);
            if (var8 <= 1) {
              return;
            }
            var15 = var6_int * width;
            var13 = var12;
            for (var16 = 0; var6_int > var16; var16++) {
              var17 = var16;
              var18 = var16;
              var19 = var15 + var18;
              for (var20 = 0; var20 < var10; var20++) {
                for (var21 = 0; var9 > var21; var21++) {
                  var14 = var11[var18];
                  var18 = var18 + var6_int;
                  var14 = var14 + var11[var18];
                  var18 = var18 + var6_int;
                  var14 = var14 + var11[var19];
                  var19 = var19 + var6_int;
                  var14 = var14 + var11[var19];
                  var12[var17] = var14 * 0.25f;
                  var19 = var19 + var6_int;
                  var17 = var17 + var6_int;
                }
                var18 = var18 + var15;
                var19 = var19 + var15;
              }
            }
            var12 = var11;
            height = var10;
            var11 = var13;
            width = var9;
            var10 = var10 >> 1;
            var9 = var9 >> 1;
            var8 = var8 >> 1;
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("bp.D(").append(target).append(',').append(height).append(',').append(guard).append(',').append(width).append(',');
          if (pixels == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void uploadByteMipmaps(byte[] pixels, int width, int target, int height, int guard) {
        int var16 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var22 = 0;
        int[] var23 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (width > 0 &&
            !rm.a(width, -102)) {
            throw new IllegalArgumentException("");
          }
          if (height > 0 &&
            !rm.a(height, -116)) {
            throw new IllegalArgumentException("");
          }
          var6_int = this.format.componentCount;
          if (guard < 33) {
            var23 = (int[]) null;
            this.uploadIntMipmaps(30, -125, (int[]) null, 92, 74);
          }
          var7 = 0;
          stackIn_13_0 = (height <= width) ? height : width;
          var8 = stackIn_13_0;
          var9 = width >> 1;
          var10 = height >> 1;
          var11 = pixels;
          var12 = new byte[var6_int * (var10 * var9)];
          while (true) {
            jaggl.OpenGL.glTexImage2Dub(target, var7, this.glInternalFormat(-89), width, height, 0, IntrusiveNodeHashTable.glTextureFormat(-21339, this.format), 5121, var11, 0);
            if (1 >= var8) {
              return;
            }
            var15 = var6_int * width;
            for (var16 = 0; var6_int > var16; var16++) {
              var17 = var16;
              var18 = var16;
              var19 = var18 + var15;
              for (var20 = 0; var20 < var10; var20++) {
                for (var21 = 0; var21 < var9; var21++) {
                  var14 = var11[var18];
                  var18 = var18 + var6_int;
                  var14 = var14 + var11[var18];
                  var14 = var14 + var11[var19];
                  var18 = var18 + var6_int;
                  var19 = var19 + var6_int;
                  var14 = var14 + var11[var19];
                  var12[var17] = (byte)(var14 >> 2);
                  var19 = var19 + var6_int;
                  var17 = var17 + var6_int;
                }
                var19 = var19 + var15;
                var18 = var18 + var15;
              }
            }
            var13 = var12;
            var12 = var11;
            var11 = var13;
            width = var9;
            height = var10;
            var9 = var9 >> 1;
            var7++;
            var8 = var8 >> 1;
            var10 = var10 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("bp.L(");
          if (pixels == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(width).append(',').append(target).append(',').append(height).append(',').append(guard).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        this.close(22989);
        super.finalize();
    }

    private final void updateMemoryAccounting(int previousBytes, int guard) {
        this.toolkit.field_Cb = this.toolkit.field_Cb - previousBytes;
        if (guard != 25109) {
          this.format = (TextureFormat) null;
        }
        this.toolkit.field_Cb = this.toolkit.field_Cb + this.estimatedBytes(3);
    }

    public void setFilter(TextureFilter filter, int guard) {
        TextureFilter var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (guard != 15149) {
            var4 = (TextureFilter) null;
            this.setFilter((TextureFilter) null, 12);
          }
          if (this.filter != filter) {
            this.filter = filter;
            this.applyFilter((byte) -122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("bp.J(");
          if (filter == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void applyFilter(byte guard) {
        this.toolkit.a((GpuTexture) (this), 112);
        if (ArrayWidgetContainer.LINEAR == this.filter) {
          jaggl.OpenGL.glTexParameteri(this.target, 10241, this.mipmapped ? 9987 : 9729);
          jaggl.OpenGL.glTexParameteri(this.target, 10240, 9729);
        } else {
          jaggl.OpenGL.glTexParameteri(this.target, 10241, !this.mipmapped ? 9728 : 9984);
          jaggl.OpenGL.glTexParameteri(this.target, 10240, 9728);
        }
        int var2 = 110 / ((guard + 69) / 49);
    }

    final int glInternalFormat(int guard) {
        int var2;
        var2 = -58 / ((guard - 57) / 34);
        if (this.dataType == GpuDataType.UNSIGNED_BYTE) {
          if (this.format == ProgressDialog.RGB) {
            return 6407;
          }
          if (this.format == nl.RGBA) {
            return 6408;
          }
          if (IntrusiveNodeHashTable.ALPHA == this.format) {
            return 6406;
          }
          if (kd.LUMINANCE == this.format) {
            return 6409;
          }
          if (ps.LUMINANCE_ALPHA == this.format) {
            return 6410;
          }
          if (ModalDialog.DEPTH_COMPONENT == this.format) {
            return 6145;
          }
        } else {
          if (GpuDataType.HALF_FLOAT == this.dataType) {
            if (ProgressDialog.RGB == this.format) {
              return 34843;
            }
            if (nl.RGBA == this.format) {
              return 34842;
            }
            if (this.format == IntrusiveNodeHashTable.ALPHA) {
              return 34844;
            }
            if (kd.LUMINANCE == this.format) {
              return 34846;
            }
            if (ps.LUMINANCE_ALPHA == this.format) {
              return 34847;
            }
            if (this.format == ModalDialog.DEPTH_COMPONENT) {
              return 6145;
            }
          } else {
            if (this.dataType == GpuDataType.FLOAT) {
              if (this.format == ProgressDialog.RGB) {
                return 34837;
              }
              if (nl.RGBA == this.format) {
                return 34836;
              }
              if (this.format == IntrusiveNodeHashTable.ALPHA) {
                return 34838;
              }
              if (kd.LUMINANCE == this.format) {
                return 34840;
              }
              if (this.format == ps.LUMINANCE_ALPHA) {
                return 34841;
              }
              if (this.format == ModalDialog.DEPTH_COMPONENT) {
                return 6145;
              }
            }
          }
        }
        throw new IllegalStateException();
    }

    private final void close(int guard) {
        if (this.textureId > 0) {
          this.toolkit.a(this.estimatedBytes(3), this.textureId, (byte) 23);
          this.textureId = 0;
        }
        if (guard != 22989) {
          int[] var3 = (int[]) null;
          this.uploadIntMipmaps(-4, 71, (int[]) null, -10, -31);
        }
    }

    public void bind(int guard) {
        int var2 = this.toolkit.t(guard - 8983);
        int var3 = this.toolkit.field_Hc[var2];
        if (this.target != var3) {
          if (var3 != 0) {
            jaggl.OpenGL.glBindTexture(var3, 0);
            jaggl.OpenGL.glDisable(var3);
          }
          jaggl.OpenGL.glEnable(this.target);
          this.toolkit.field_Hc[var2] = this.target;
        }
        jaggl.OpenGL.glBindTexture(this.target, this.textureId);
        if (guard != 8905) {
          this.bind(-104);
        }
    }

    final static void a(int param0, int param1) {
        DualLinkNode.field_p = 1000000000L / (long)param0;
        if (param1 != 26175) {
          OpenGlTexture.a(92, -56);
        }
    }

    OpenGlTexture(OpenGlGraphicsToolkit owner, int textureTarget, TextureFormat channelFormat, GpuDataType scalarType, int pixels, boolean mipmaps) {
        this.filter = ArrayWidgetContainer.LINEAR;
        try {
          this.dataType = scalarType;
          this.mipmapped = mipmaps ? true : false;
          this.target = textureTarget;
          this.toolkit = owner;
          this.format = channelFormat;
          this.texelCount = pixels;
          jaggl.OpenGL.glGenTextures(1, dq.field_s, 0);
          this.textureId = dq.field_s[0];
          this.applyFilter((byte) 78);
          this.updateMemoryAccounting(0, 25109);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bp.<init>(" + (owner != null ? "{...}" : "null") + ',' + textureTarget + ',' + (channelFormat != null ? "{...}" : "null") + ',' + (scalarType != null ? "{...}" : "null") + ',' + pixels + ',' + mipmaps + ')');
        }
    }

    private final int estimatedBytes(int guard) {
        int var2 = this.dataType.bytesPerComponent * this.format.componentCount * this.texelCount;
        if (guard != 3) {
          this.format = (TextureFormat) null;
        }
        return this.mipmapped ? 4 * var2 / 3 : var2;
    }

    static {
    }
}
