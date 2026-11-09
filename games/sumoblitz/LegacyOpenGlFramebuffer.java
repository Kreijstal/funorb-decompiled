/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlFramebuffer implements LegacyOpenGlFramebufferTarget {
    private int height;
    private int framebufferId;
    private int width;
    private int attachmentMask;
    private int bindingMask;
    private int activeTarget;
    private LegacyOpenGlGraphicsToolkit toolkit;
    private LegacyOpenGlFramebufferAttachment[] attachments;

    final static int serviceJs5(int guard) {
        LegacyOpenGlSpecularEffect.field_i.serviceProviders((byte) 66);
        if (guard != -5) {
          return 63;
        }
        if (Js5ClientState.field_b.service((byte) 119)) {
          return 0;
        }
        return TextureFilter.a(true);
    }

    final void detachAttachment(int index, int guard) {
        if (guard != 17012) {
          return;
        }
        if (this.attachments[index] == null) {
          this.attachmentMask = this.attachmentMask & ~(1 << index);
          this.attachments[index] = null;
          return;
        }
        this.attachments[index].detachFramebuffer(109);
        this.attachmentMask = this.attachmentMask & ~(1 << index);
        this.attachments[index] = null;
    }

    public final void unbindReadFramebuffer(int guard) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
        this.bindingMask = this.bindingMask & -2;
        if (guard == -20745) {
          this.activeTarget = this.boundTarget(24909);
          return;
        }
        this.bindReadFramebuffer(-86);
        this.activeTarget = this.boundTarget(24909);
    }

    final void attachRenderbuffer(LegacyOpenGlRenderbuffer renderbuffer, int index, int guard) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.activeTarget == -1) {
            throw new RuntimeException();
          }
          if (guard != -14269) {
            return;
          }
          var4_int = 1 << index;
          if (0 != (this.attachmentMask & ~var4_int)) {
            if (renderbuffer.width != this.width ||
              renderbuffer.height != this.height) {
              throw new RuntimeException();
            }
          } else {
            this.width = renderbuffer.width;
            this.height = renderbuffer.height;
          }
          renderbuffer.attachFramebuffer(false, AccountNameSupport.field_a[index], this.activeTarget);
          this.attachments[index] = (LegacyOpenGlFramebufferAttachment) ((Object) renderbuffer);
          this.attachmentMask = this.attachmentMask | var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("cs.H(");
          if (renderbuffer == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(index).append(',').append(guard).append(')').toString());
        }
    }

    final boolean isComplete(int guard) {
        int var2 = 0;
        int var2Lifetime1;
        if (guard != -276) {
          this.unbindReadFramebuffer(99);
          var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.activeTarget);
          if (var2 == 36053) {
            return true;
          }
          return false;
        }
        var2Lifetime1 = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.activeTarget);
        if (var2Lifetime1 == 36053) {
          return true;
        }
        return false;
    }

    private final int boundTarget(int guard) {
        if (guard != 24909) {
          this.framebufferId = -81;
          if ((4 & this.bindingMask) != 0) {
            return 36160;
          }
          if (0 != (2 & this.bindingMask)) {
            return 36009;
          }
          if ((this.bindingMask & 1) != 0) {
            return 36008;
          }
          return -1;
        }
        if ((4 & this.bindingMask) != 0) {
          return 36160;
        }
        if (0 != (2 & this.bindingMask)) {
          return 36009;
        }
        if ((this.bindingMask & 1) != 0) {
          return 36008;
        }
        return -1;
    }

    protected final void finalize() throws Throwable {
        this.toolkit.queueFramebufferDeletion((byte) -92, this.framebufferId);
        super.finalize();
    }

    public final void unbindDrawFramebuffer(boolean guard) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        this.bindingMask = this.bindingMask & -3;
        this.activeTarget = this.boundTarget(24909);
        if (guard) {
          this.attachments = (LegacyOpenGlFramebufferAttachment[]) null;
        }
    }

    private final void attachTextureLevel(int guard, int level, int index, LegacyOpenGlTexture2D texture) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.activeTarget == -1) {
            throw new RuntimeException();
          }
          var5_int = 1 << index;
          if (guard != ~(this.attachmentMask & ~var5_int)) {
            if (texture.width != this.width ||
              texture.height != this.height) {
              throw new RuntimeException();
            }
          } else {
            this.width = texture.width;
            this.height = texture.height;
          }
          texture.attachFramebuffer(-90, AccountNameSupport.field_a[index], level, this.activeTarget);
          this.attachments[index] = (LegacyOpenGlFramebufferAttachment) ((Object) texture);
          this.attachmentMask = this.attachmentMask | var5_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("cs.I(").append(guard).append(',').append(level).append(',').append(index).append(',');
          if (texture == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void attachTexture(LegacyOpenGlTexture2D texture, int guard, int index) {
        try {
          this.attachTextureLevel(guard + 4609, 0, index, texture);
          if (guard != -4610) {
            this.bindingMask = 35;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cs.M(" + (texture != null ? "{...}" : "null") + ',' + guard + ',' + index + ')');
        }
    }

    public final void bindReadFramebuffer(int guard) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, this.framebufferId);
        this.bindingMask = this.bindingMask | 1;
        this.activeTarget = this.boundTarget(24909);
        if (guard != 195) {
          this.attachments = (LegacyOpenGlFramebufferAttachment[]) null;
        }
    }

    public final void unbindFramebuffer(int guard) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
        if (guard < -32) {
          this.bindingMask = this.bindingMask & -5;
          this.activeTarget = this.boundTarget(24909);
          return;
        }
    }

    LegacyOpenGlFramebuffer(LegacyOpenGlGraphicsToolkit owner) {
        this.bindingMask = 0;
        this.activeTarget = -1;
        this.attachments = new LegacyOpenGlFramebufferAttachment[9];
        try {
          if (!owner.supportsFramebufferObjects) {
            throw new IllegalStateException("");
          }
          this.toolkit = owner;
          jaggl.OpenGL.glGenFramebuffersEXT(1, SecondaryNodeHashTable.field_e, 0);
          this.framebufferId = SecondaryNodeHashTable.field_e[0];
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cs.<init>(" + (owner != null ? "{...}" : "null") + ')');
        }
    }

    public final void bindFramebuffer(int guard) {
        if (guard == 30352) {
          jaggl.OpenGL.glBindFramebufferEXT(36160, this.framebufferId);
          this.bindingMask = this.bindingMask | 4;
          this.activeTarget = this.boundTarget(24909);
          return;
        }
    }

    public final void bindDrawFramebuffer(int guard) {
        if (guard > 103) {
          jaggl.OpenGL.glBindFramebufferEXT(36009, this.framebufferId);
          this.bindingMask = this.bindingMask | 2;
          this.activeTarget = this.boundTarget(24909);
          return;
        }
    }

    static {
    }
}
