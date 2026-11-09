/*
 * Decompiled by CFR-JS 0.4.0.
 */
class LegacyOpenGlTexture2D extends LegacyOpenGlTexture {
    int height;
    int width;
    private int framebufferTarget;
    static String loggingInText;
    private int framebufferAttachment;

    final void uploadBytes(int sourceOffset, byte[] pixels, int sourceFormat, int destinationX, int width, int sourceRowLength, int destinationY, boolean flipY, byte guard, int height) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (sourceRowLength == 0) {
            sourceRowLength = width;
          }
          boolean decompiledFrameCompleted0 = true;
          if (flipY) {
            var11_int = pc.a(sourceFormat, (byte) -37);
            var12 = var11_int * width;
            var13 = var11_int * sourceRowLength;
            var14 = new byte[height * var12];
            var15 = 0;
            while (var15 < height) {
              var16 = var15 * var12;
              var17 = var13 * (-var15 + (height - 1)) + sourceOffset;
              stackIn_17_0 = 0;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var18 = stackIn_17_0;
              while (var18 < var12) {
                var14[var16++] = pixels[var17++];
                var18++;
              }
              var15++;
            }
            if (decompiledFrameCompleted0) {
              pixels = var14;
            }
          }
          if (decompiledFrameCompleted0) {
            this.toolkit.bindTexture(82, (LegacyOpenGlTexture) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            stackIn_17_0 = ~width;
          }
          if (stackIn_17_0 != ~sourceRowLength) {
            jaggl.OpenGL.glPixelStorei(3314, sourceRowLength);
          }
          jaggl.OpenGL.glTexSubImage2Dub(this.target, 0, destinationX, destinationY, width, height, sourceFormat, 5121, pixels, sourceOffset);
          if (sourceRowLength != width) {
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          if (guard >= -120) {
            return;
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_28_0 = var11;
          stackIn_28_1 = new StringBuilder().append("us.G(").append(sourceOffset).append(',');
          if (pixels == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(sourceFormat).append(',').append(destinationX).append(',').append(width).append(',').append(sourceRowLength).append(',').append(destinationY).append(',').append(flipY).append(',').append(guard).append(',').append(height).append(')').toString());
        }
    }

    LegacyOpenGlTexture2D(LegacyOpenGlGraphicsToolkit owner, int textureTarget, int storageFormat, int pixelWidth, int pixelHeight) {
        super(owner, textureTarget, storageFormat, pixelHeight * pixelWidth, false);
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
        try {
          this.height = pixelHeight;
          this.width = pixelWidth;
          this.toolkit.bindTexture(27, (LegacyOpenGlTexture) (this));
          jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.internalFormat, pixelWidth, pixelHeight, 0, ForceFieldRingEffect.glBaseFormat(false, this.internalFormat), 5121, (byte[]) null, 0);
          this.setLinearFiltering(true, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "us.<init>(" + (owner != null ? "{...}" : "null") + ',' + textureTarget + ',' + storageFormat + ',' + pixelWidth + ',' + pixelHeight + ')');
        }
    }

    final void copyFromFramebuffer(byte guard, int sourceY, int destinationX, int destinationY, int height, int sourceX, int width) {
        int var8 = this.toolkit.field_Ec - height - sourceY;
        this.toolkit.bindTexture(97, (LegacyOpenGlTexture) (this));
        if (guard >= 110) {
          jaggl.OpenGL.glCopyTexSubImage2D(this.target, 0, destinationX, -height - destinationY + this.height, sourceX, var8, width, height);
          jaggl.OpenGL.glFlush();
          return;
        }
        this.height = 53;
        jaggl.OpenGL.glCopyTexSubImage2D(this.target, 0, destinationX, -height - destinationY + this.height, sourceX, var8, width, height);
        jaggl.OpenGL.glFlush();
    }

    final void setWrap(boolean repeatX, boolean repeatY, int guard) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        if (guard == -27365) {
          if (this.target == 3553) {
            this.toolkit.bindTexture(66, (LegacyOpenGlTexture) (this));
            stackIn_5_0 = this.target;
            stackIn_5_1 = 10242;
            stackIn_6_2 = (!repeatX) ? 33071 : 10497;
            jaggl.OpenGL.glTexParameteri(stackIn_5_0, stackIn_5_1, stackIn_6_2);
            stackIn_8_0 = this.target;
            stackIn_8_1 = 10243;
            stackIn_9_2 = (!repeatY) ? 33071 : 10497;
            jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_9_2);
          }
        } else {
          this.copyFromFramebuffer((byte) 11, 46, 71, -37, 98, -13, 14);
          if (this.target == 3553) {
            this.toolkit.bindTexture(66, (LegacyOpenGlTexture) (this));
            stackIn_15_0 = this.target;
            stackIn_15_1 = 10242;
            stackIn_16_2 = (!repeatX) ? 33071 : 10497;
            jaggl.OpenGL.glTexParameteri(stackIn_15_0, stackIn_15_1, stackIn_16_2);
            stackIn_18_0 = this.target;
            stackIn_18_1 = 10243;
            stackIn_19_2 = (!repeatY) ? 33071 : 10497;
            jaggl.OpenGL.glTexParameteri(stackIn_18_0, stackIn_18_1, stackIn_19_2);
          }
        }
    }

    LegacyOpenGlTexture2D(LegacyOpenGlGraphicsToolkit owner, int textureTarget, int storageFormat, int pixelWidth, int pixelHeight, boolean mipmaps, float[] pixels, int sourceFormat) {
        super(owner, textureTarget, storageFormat, pixelWidth * pixelHeight, mipmaps);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
        try {
          this.width = pixelWidth;
          this.height = pixelHeight;
          this.toolkit.bindTexture(106, (LegacyOpenGlTexture) (this));
          boolean decompiledSharedTail0 = (mipmaps &&
            this.target != 34037);
          if (!decompiledSharedTail0) {
            jaggl.OpenGL.glTexImage2Df(this.target, 0, this.internalFormat, this.width, this.height, 0, sourceFormat, 5126, pixels, 0);
            this.noteMipmaps(true, false);
            decompiledSharedTail0 = (Sumoblitz.field_L);
          }
          if (decompiledSharedTail0) {
            LegacyOpenGlTransform3D.a(pixelWidth, pixelHeight, (byte) 11, textureTarget, storageFormat, pixels, sourceFormat);
            this.noteMipmaps(true, true);
          }
          this.setLinearFiltering(true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("us.<init>(");
          if (owner == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(textureTarget).append(',').append(storageFormat).append(',').append(pixelWidth).append(',').append(pixelHeight).append(',').append(mipmaps).append(',');
          if (pixels == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(sourceFormat).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        loggingInText = null;
        if (param0 != 28) {
          loggingInText = (String) null;
        }
    }

    final void attachFramebuffer(int guard, int attachment, int level, int framebufferTarget) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(framebufferTarget, attachment, this.target, this.textureId, level);
        this.framebufferTarget = framebufferTarget;
        if (guard < -21) {
          this.framebufferAttachment = attachment;
          return;
        }
    }

    final void uploadInts(int height, int width, int destinationY, int[] pixels, int sourceOffset, int destinationX, int sourceRowLength, boolean flipY, boolean guard) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!guard) {
            this.detachFramebuffer(11);
          }
          if (sourceRowLength == 0) {
            sourceRowLength = width;
          }
          boolean decompiledFrameCompleted0 = true;
          if (flipY) {
            var16 = new int[width * height];
            var10 = var16;
            var11 = 0;
            while (height > var11) {
              var12 = width * var11;
              var13 = sourceOffset + sourceRowLength * (height - (var11 + 1));
              stackIn_19_0 = 0;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var14 = stackIn_19_0;
              while (var14 < width) {
                var16[var12++] = pixels[var13++];
                var14++;
              }
              var11++;
            }
            if (decompiledFrameCompleted0) {
              pixels = var16;
            }
          }
          if (decompiledFrameCompleted0) {
            this.toolkit.bindTexture(81, (LegacyOpenGlTexture) (this));
            stackIn_19_0 = sourceRowLength;
          }
          if (stackIn_19_0 != width) {
            jaggl.OpenGL.glPixelStorei(3314, sourceRowLength);
          }
          jaggl.OpenGL.glTexSubImage2Di(this.target, 0, destinationX, -height + (this.height - destinationY), width, height, 32993, this.toolkit.field_L, pixels, sourceOffset);
          if (width == sourceRowLength) {
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_27_0 = var10_ref;
          stackIn_27_1 = new StringBuilder().append("us.F(").append(height).append(',').append(width).append(',').append(destinationY).append(',');
          if (pixels == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(sourceOffset).append(',').append(destinationX).append(',').append(sourceRowLength).append(',').append(flipY).append(',').append(guard).append(')').toString());
        }
    }

    LegacyOpenGlTexture2D(LegacyOpenGlGraphicsToolkit owner, int textureTarget, int storageFormat, int pixelWidth, int pixelHeight, boolean mipmaps, byte[] pixels, int sourceFormat, boolean flipY) {
        super(owner, textureTarget, storageFormat, pixelWidth * pixelHeight, mipmaps);
        int stackIn_13_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
        try {
          boolean decompiledFrameCompleted0 = true;
          this.width = pixelWidth;
          this.height = pixelHeight;
          if (flipY) {
            var16 = new byte[pixels.length];
            var10 = var16;
            var11 = 0;
            while (pixelHeight > var11) {
              var12 = pixelWidth * var11;
              var13 = pixelWidth * (-1 + (-var11 + pixelHeight));
              stackIn_13_0 = 0;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var14 = stackIn_13_0;
              while (var14 < pixelWidth) {
                var16[var12++] = pixels[var13++];
                var14++;
              }
              var11++;
            }
            if (decompiledFrameCompleted0) {
              pixels = var16;
            }
          }
          if (decompiledFrameCompleted0) {
            this.toolkit.bindTexture(83, (LegacyOpenGlTexture) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            stackIn_13_0 = mipmaps ? 1 : 0;
          }
          boolean decompiledSharedTail0 = (stackIn_13_0 == 0 ||
            34037 == this.target);
          if (!decompiledSharedTail0) {
            DisplayNameForm.uploadTextureMipmaps(textureTarget, 23143, pixels, pixelWidth, storageFormat, pixelHeight, sourceFormat);
            this.noteMipmaps(true, true);
            decompiledSharedTail0 = (var15 != 0);
          }
          if (decompiledSharedTail0) {
            jaggl.OpenGL.glTexImage2Dub(this.target, 0, this.internalFormat, this.width, this.height, 0, sourceFormat, 5121, pixels, 0);
            this.noteMipmaps(true, false);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.setLinearFiltering(true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_21_0 = var10_ref;
          stackIn_21_1 = new StringBuilder().append("us.<init>(");
          if (owner == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(textureTarget).append(',').append(storageFormat).append(',').append(pixelWidth).append(',').append(pixelHeight).append(',').append(mipmaps).append(',');
          if (pixels == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(sourceFormat).append(',').append(flipY).append(')').toString());
        }
    }

    LegacyOpenGlTexture2D(LegacyOpenGlGraphicsToolkit owner, int textureTarget, int storageFormat, int pixelWidth, int pixelHeight, boolean mipmaps, int[] pixels, int sourceRowLength, int sourceOffset, boolean flipY) {
        super(owner, textureTarget, storageFormat, pixelHeight * pixelWidth, mipmaps);
        int stackIn_13_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var11 = null;
        RuntimeException var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
        try {
          boolean decompiledFrameCompleted0 = true;
          this.width = pixelWidth;
          this.height = pixelHeight;
          if (flipY) {
            var17 = new int[pixels.length];
            var11 = var17;
            var12 = 0;
            while (pixelHeight > var12) {
              var13 = var12 * pixelWidth;
              var14 = pixelWidth * (-var12 + pixelHeight - 1);
              stackIn_13_0 = 0;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var15 = stackIn_13_0;
              while (var15 < pixelWidth) {
                var17[var13++] = pixels[var14++];
                var15++;
              }
              var12++;
            }
            if (decompiledFrameCompleted0) {
              pixels = var17;
            }
          }
          if (decompiledFrameCompleted0) {
            this.toolkit.bindTexture(43, (LegacyOpenGlTexture) (this));
            stackIn_13_0 = this.target;
          }
          if (stackIn_13_0 != 34037 &&
            mipmaps &&
            sourceRowLength == 0 &&
            sourceOffset == 0) {
            Transform3D.a(-122, this.height, this.width, this.target, pixels, this.internalFormat, this.toolkit.field_L, 32993);
            this.noteMipmaps(true, true);
          }
          if (stackIn_13_0 == 34037 ||
            !mipmaps ||
            sourceRowLength != 0 ||
            sourceOffset != 0 || var16 != 0) {
            jaggl.OpenGL.glPixelStorei(3314, sourceRowLength);
            jaggl.OpenGL.glTexImage2Di(this.target, 0, this.internalFormat, this.width, this.height, 0, 32993, this.toolkit.field_L, pixels, 4 * sourceOffset);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            this.noteMipmaps(true, false);
          }
          this.setLinearFiltering(true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_23_0 = var11_ref;
          stackIn_23_1 = new StringBuilder().append("us.<init>(");
          if (owner == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(textureTarget).append(',').append(storageFormat).append(',').append(pixelWidth).append(',').append(pixelHeight).append(',').append(mipmaps).append(',');
          if (pixels == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(sourceRowLength).append(',').append(sourceOffset).append(',').append(flipY).append(')').toString());
        }
    }

    public final void detachFramebuffer(int guard) {
        int var2 = 6 / ((44 - guard) / 58);
        jaggl.OpenGL.glFramebufferTexture2DEXT(this.framebufferTarget, this.framebufferAttachment, this.target, 0, 0);
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
    }

    final static void openSupportPage(java.applet.Applet applet, byte guard) {
        try {
          java.net.URL var2 = null;
          int var2_int = 0;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(applet.getCodeBase(), "tosupport.ws");
              applet.getAppletContext().showDocument(MusicPatch.a((byte) 127, applet, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            var2_int = 76 / ((0 - guard) / 39);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("us.I(");
            if (applet == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        loggingInText = "Logging in...";
    }
}
