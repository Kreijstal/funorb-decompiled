/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlRenderbuffer extends DualLinkNode implements LegacyOpenGlFramebufferAttachment {
    int height;
    static Drone field_u;
    static ResourceArchive field_v;
    int estimatedBytes;
    private int renderbufferId;
    private int internalFormat;
    private LegacyOpenGlGraphicsToolkit toolkit;
    private int framebufferTarget;
    static int field_B;
    int width;
    private int framebufferAttachment;
    static SpriteData[] field_w;
    static String achievementsText;

    final void attachFramebuffer(boolean guard, int attachment, int framebufferTarget) {
        if (!guard) {
          jaggl.OpenGL.glFramebufferRenderbufferEXT(framebufferTarget, attachment, 36161, this.renderbufferId);
          this.framebufferTarget = framebufferTarget;
          this.framebufferAttachment = attachment;
          return;
        }
        this.framebufferTarget = 37;
        jaggl.OpenGL.glFramebufferRenderbufferEXT(framebufferTarget, attachment, 36161, this.renderbufferId);
        this.framebufferTarget = framebufferTarget;
        this.framebufferAttachment = attachment;
    }

    final void close(int guard) {
        if (guard > -124) {
          CharSequence var3 = (CharSequence) null;
          LegacyOpenGlRenderbuffer.canonicalizeBase37Name((CharSequence) null, (byte) -99);
          if (this.renderbufferId > 0) {
            this.toolkit.queueRenderbufferDeletion(this.renderbufferId, 97, this.estimatedBytes);
            this.renderbufferId = 0;
            return;
          }
          return;
        }
        if (this.renderbufferId <= 0) {
          return;
        }
        this.toolkit.queueRenderbufferDeletion(this.renderbufferId, 97, this.estimatedBytes);
        this.renderbufferId = 0;
    }

    final static String f(int param0) {
        if (param0 != 1) {
          return (String) null;
        }
        if (null == QueuedIntArrayRequest.field_o) {
          return "";
        }
        return QueuedIntArrayRequest.field_o;
    }

    final static void a(byte param0) {
        int var3 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        PacketBuffer var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6 = new PacketBuffer(Drone.field_g);
          var2 = var6.readUnsignedByte(-31302);
          if (var2 < 1) {
            return;
          }
          ToolkitRasterStateFrame.field_e = var6.readUnsignedByte(-31302);
          ResourceArchive.field_f = var6.readUnsignedByte(-31302);
          LegacyOpenGlEffectManager.field_i = var6.readUnsignedByte(-31302);
          hc.field_f = var6.readUnsignedByte(-31302);
          if (param0 <= 92) {
            return;
          }
          for (var3 = 0; 36 > var3; var3++) {
            if (25 > var3) {
              OpenGlTexture3D.field_j[var3] = var6.readUnsignedMedium((byte) 122);
              CacheIoRequest.field_z[var3] = var6.readUnsignedShort(255);
              if (var2 >= 2) {
                var4 = var6.readUnsignedByte(-31302);
                CacheIoRequest.field_A[var3] = -1 + LegacyOpenGlPostProcessManager.bitwiseAnd(4, var4);
                if (var2 >= 3) {
                  stackIn_16_0 = up.field_g;
                  stackIn_16_1 = var3;
                  stackIn_17_2 = (LegacyOpenGlPostProcessManager.bitwiseAnd(1, var4 >> 6) == 1);
                  stackIn_16_0[stackIn_16_1] = stackIn_17_2;
                  stackIn_19_0 = NineSlicePanel.field_d;
                  stackIn_19_1 = var3;
                  stackIn_20_2 = (LegacyOpenGlPostProcessManager.bitwiseAnd(1, var4 >> 7) == 1);
                  stackIn_19_0[stackIn_19_1] = stackIn_20_2;
                }
              }
              if (OpenGlTexture3D.field_j[var3] != 0) {
                TextureMetadata.field_f[var3] = true;
                ToolkitRasterStateFrame.field_e = var3;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "kf.F(" + param0 + ')');
        }
    }

    public final void detachFramebuffer(int guard) {
        jaggl.OpenGL.glFramebufferRenderbufferEXT(this.framebufferTarget, this.framebufferAttachment, 36161, 0);
        int var2 = -8 % ((44 - guard) / 58);
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
    }

    protected final void finalize() throws Throwable {
        this.close(-125);
        super.finalize();
    }

    public static void releaseStatics(int param0) {
        if (param0 == -21057) {
          field_w = null;
          field_v = null;
          field_u = null;
          achievementsText = null;
          return;
        }
        field_w = (SpriteData[]) null;
        field_w = null;
        field_v = null;
        field_u = null;
        achievementsText = null;
    }

    final static String canonicalizeBase37Name(CharSequence name, byte guard) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 38) {
            var3 = (CharSequence) null;
            LegacyOpenGlRenderbuffer.canonicalizeBase37Name((CharSequence) null, (byte) -40);
          }
          var2 = MusicPatch.a(-29275, ScrollControl.encodeBase37Name(name, 7441));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("kf.C(");
          if (name == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    LegacyOpenGlRenderbuffer(LegacyOpenGlGraphicsToolkit owner, int storageFormat, int pixelWidth, int pixelHeight) {
        this.framebufferAttachment = -1;
        this.framebufferTarget = -1;
        try {
          this.toolkit = owner;
          this.height = pixelHeight;
          this.width = pixelWidth;
          this.internalFormat = storageFormat;
          jaggl.OpenGL.glGenRenderbuffersEXT(1, DualLinkNode.field_q, 0);
          this.renderbufferId = DualLinkNode.field_q[0];
          jaggl.OpenGL.glBindRenderbufferEXT(36161, this.renderbufferId);
          jaggl.OpenGL.glRenderbufferStorageEXT(36161, this.internalFormat, this.width, this.height);
          this.estimatedBytes = this.width * (this.height * this.toolkit.textureFormatBytes(this.internalFormat, -72));
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kf.<init>(" + (owner != null ? "{...}" : "null") + ',' + storageFormat + ',' + pixelWidth + ',' + pixelHeight + ')');
        }
    }

    static {
        achievementsText = "Achievements";
    }
}
