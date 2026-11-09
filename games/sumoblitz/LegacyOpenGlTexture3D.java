/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlTexture3D extends LegacyOpenGlTexture {
    static String field_k;
    int depth;
    int width;
    int height;
    static volatile int field_l;
    private int framebufferAttachment;
    private int framebufferTarget;

    LegacyOpenGlTexture3D(LegacyOpenGlGraphicsToolkit owner, int storageFormat, int pixelWidth, int pixelHeight, int slices) {
        super(owner, 32879, storageFormat, slices * (pixelWidth * pixelHeight), false);
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
        try {
          this.width = pixelWidth;
          this.height = pixelHeight;
          this.depth = slices;
          this.toolkit.bindTexture(63, (LegacyOpenGlTexture) (this));
          jaggl.OpenGL.glTexImage3Dub(this.target, 0, this.internalFormat, this.width, this.height, this.depth, 0, ForceFieldRingEffect.glBaseFormat(false, this.internalFormat), 5121, (byte[]) null, 0);
          this.setLinearFiltering(true, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ek.<init>(" + (owner != null ? "{...}" : "null") + ',' + storageFormat + ',' + pixelWidth + ',' + pixelHeight + ',' + slices + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -21551) {
          return;
        }
        field_k = null;
    }

    public final void detachFramebuffer(int guard) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(this.framebufferTarget, this.framebufferAttachment, this.target, 0, 0, 0);
        this.framebufferTarget = -1;
        int var2 = -76 / ((44 - guard) / 58);
        this.framebufferAttachment = -1;
    }

    final static void updateTooltip(String text, int guard) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          PerlinGradient.tooltipAge = PerlinGradient.tooltipAge + 1;
          if (EmptyWidgetRenderer.pendingTooltipX == -1 &&
            ScanlineSpriteMask.pendingTooltipY == -1) {
            ScanlineSpriteMask.pendingTooltipY = ArenaDefinitionCodec.field_e;
            EmptyWidgetRenderer.pendingTooltipX = PointLight.mouseX;
          }
          boolean decompiledFrameRemainder0 = true;
          if (text != null) {
            decompiledFrameRemainder0 = !(text.equals(LegacyOpenGlCubeTexture.tooltipText));
          } else {
            decompiledFrameRemainder0 = (LegacyOpenGlCubeTexture.tooltipText == null);
          }
          if (decompiledFrameRemainder0) {
            if (!IntroMeshProjection.tooltipHidden) {
              if (PerlinGradient.tooltipAge >= GameClientShell.tooltipDelay) {
                stackIn_17_0 = (GameClientShell.tooltipDelay + GameDefinitionLoader.tooltipDuration > PerlinGradient.tooltipAge) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (text == null) {
              PerlinGradient.tooltipAge = 0;
            } else {
              if (IntroMeshProjection.tooltipHidden) {
                PerlinGradient.tooltipAge = GameClientShell.tooltipDelay;
              } else {
                if (var2_int == 0) {
                  PerlinGradient.tooltipAge = 0;
                } else {
                  PerlinGradient.tooltipAge = GameClientShell.tooltipDelay;
                }
              }
            }
            GraphicsHeap.tooltipY = ScanlineSpriteMask.pendingTooltipY;
            VertexLayout.tooltipX = EmptyWidgetRenderer.pendingTooltipX;
            if (text != null) {
              IntroMeshProjection.tooltipHidden = false;
            } else {
              if (var2_int != 0) {
                IntroMeshProjection.tooltipHidden = true;
              }
            }
          }
          LegacyOpenGlCubeTexture.tooltipText = text;
          var2_intLifetime1 = -62 % ((-74 - guard) / 35);
          if (!IntroMeshProjection.tooltipHidden &&
            PerlinGradient.tooltipAge < GameClientShell.tooltipDelay &&
            LegacyOpenGlClientVertexBuffer.field_d) {
            PerlinGradient.tooltipAge = 0;
            GraphicsHeap.tooltipY = ScanlineSpriteMask.pendingTooltipY;
            VertexLayout.tooltipX = EmptyWidgetRenderer.pendingTooltipX;
          }
          if (IntroMeshProjection.tooltipHidden &&
            PerlinGradient.tooltipAge == PlayerDrone.tooltipHideGrace) {
            PerlinGradient.tooltipAge = 0;
            IntroMeshProjection.tooltipHidden = false;
          }
          ScanlineSpriteMask.pendingTooltipY = -1;
          EmptyWidgetRenderer.pendingTooltipX = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("ek.B(");
          if (text == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(guard).append(')').toString());
        }
    }

    final void copyFromFramebuffer(int destinationX, byte guard, int destinationY, int destinationZ, int height, int width, int sourceY, int sourceX) {
        this.toolkit.bindTexture(guard ^ 36, (LegacyOpenGlTexture) (this));
        jaggl.OpenGL.glCopyTexSubImage3D(this.target, 0, destinationX, destinationY, destinationZ, sourceX, sourceY, width, height);
        jaggl.OpenGL.glFlush();
        if (guard != 80) {
          this.framebufferTarget = 57;
        }
    }

    LegacyOpenGlTexture3D(LegacyOpenGlGraphicsToolkit owner, int storageFormat, int pixelWidth, int pixelHeight, int slices, byte[] pixels, int sourceFormat) {
        super(owner, 32879, storageFormat, pixelHeight * pixelWidth * slices, false);
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
        try {
          this.width = pixelWidth;
          this.height = pixelHeight;
          this.depth = slices;
          this.toolkit.bindTexture(72, (LegacyOpenGlTexture) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage3Dub(this.target, 0, this.internalFormat, this.width, this.height, this.depth, 0, sourceFormat, 5121, pixels, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.setLinearFiltering(true, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ek.<init>(" + (owner != null ? "{...}" : "null") + ',' + storageFormat + ',' + pixelWidth + ',' + pixelHeight + ',' + slices + ',' + (pixels != null ? "{...}" : "null") + ',' + sourceFormat + ')');
        }
    }

    final static void playLoopingSound(boolean guard, int sampleId) {
        PcmSampleStream var2 = PcmSampleStream.createAtRatePercent(OpenGlCubeTexture.field_l[sampleId], 100, 96);
        if (guard) {
          var2.setLoopCount(-1);
          ValidatedTextInputWidget.addPlayingSound(18416, var2);
          return;
        }
        LegacyOpenGlTexture3D.playLoopingSound(true, 27);
        var2.setLoopCount(-1);
        ValidatedTextInputWidget.addPlayingSound(18416, var2);
    }

    static {
        field_l = 0;
    }
}
