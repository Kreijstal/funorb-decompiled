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

    final static void a(String param0, int param1) {
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
          qf.field_a = qf.field_a + 1;
          if (tm.field_d == -1 &&
            ScanlineSpriteMask.field_e == -1) {
            ScanlineSpriteMask.field_e = pi.field_e;
            tm.field_d = ko.field_p;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(LegacyOpenGlCubeTexture.field_l));
          } else {
            decompiledFrameRemainder0 = (LegacyOpenGlCubeTexture.field_l == null);
          }
          if (decompiledFrameRemainder0) {
            if (!up.field_d) {
              if (qf.field_a >= GameClientShell.field_s) {
                stackIn_17_0 = (GameClientShell.field_s + sb.field_c > qf.field_a) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param0 == null) {
              qf.field_a = 0;
            } else {
              if (up.field_d) {
                qf.field_a = GameClientShell.field_s;
              } else {
                if (var2_int == 0) {
                  qf.field_a = 0;
                } else {
                  qf.field_a = GameClientShell.field_s;
                }
              }
            }
            GraphicsHeap.field_k = ScanlineSpriteMask.field_e;
            VertexLayout.field_b = tm.field_d;
            if (param0 != null) {
              up.field_d = false;
            } else {
              if (var2_int != 0) {
                up.field_d = true;
              }
            }
          }
          LegacyOpenGlCubeTexture.field_l = param0;
          var2_intLifetime1 = -62 % ((-74 - param1) / 35);
          if (!up.field_d &&
            qf.field_a < GameClientShell.field_s &&
            sl.field_d) {
            qf.field_a = 0;
            GraphicsHeap.field_k = ScanlineSpriteMask.field_e;
            VertexLayout.field_b = tm.field_d;
          }
          if (up.field_d &&
            qf.field_a == PlayerDrone.field_T) {
            qf.field_a = 0;
            up.field_d = false;
          }
          ScanlineSpriteMask.field_e = -1;
          tm.field_d = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("ek.B(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
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
          qq.addPlayingSound(18416, var2);
          return;
        }
        LegacyOpenGlTexture3D.playLoopingSound(true, 27);
        var2.setLoopCount(-1);
        qq.addPlayingSound(18416, var2);
    }

    static {
        field_l = 0;
    }
}
