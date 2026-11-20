/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class OpenGlTexture implements OpenGlFramebufferAttachment {
    int textureId;
    private int pixelCount;
    int internalFormat;
    OpenGlToolkit toolkit;
    int target;
    private boolean linearFiltering;
    private boolean mipmapped;

    private final void applyFiltering(int param0) {
        this.toolkit.bindTexture(117, this);
        if (!this.linearFiltering) {
          jaggl.OpenGL.glTexParameteri(this.target, 10241, this.mipmapped ? 9984 : 9728);
          jaggl.OpenGL.glTexParameteri(this.target, 10240, 9728);
        } else {
          jaggl.OpenGL.glTexParameteri(this.target, 10241, this.mipmapped ? 9987 : 9729);
          jaggl.OpenGL.glTexParameteri(this.target, 10240, 9729);
        }
        if (param0 == -22416) {
          return;
        }
        this.internalFormat = -87;
    }

    protected final void finalize() throws Throwable {
        this.dispose(0);
        super.finalize();
    }

    private final void updateMemoryAccounting(int param0, int param1) {
        if (param0 == 0) {
          this.toolkit.textureBytes = this.toolkit.textureBytes - param1;
          this.toolkit.textureBytes = this.toolkit.textureBytes + this.getEstimatedByteSize((byte) 108);
          return;
        }
    }

    final static int b(byte param0) {
        if (param0 != 118) {
          return 29;
        }
        return GetPointDefenceLaserProjectiles.a(false, SetAutoaim.field_p);
    }

    final static Sprite[] a(ResourceArchive param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Sprite[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          if (SpriteArchiveDecoder.decodeSpriteArchiveFile(param2, 2, param0, param1)) {
            return TextureCoordinateMode.a(false);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("pib.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void dispose(int param0) {
        if (param0 < this.textureId) {
          this.toolkit.enqueueTextureDisposal(this.textureId, 109, this.getEstimatedByteSize((byte) 124));
          this.textureId = 0;
        }
    }

    final boolean generateMipmaps(int param0) {
        int var2 = 0;
        if (this.toolkit.field_U) {
          var2 = this.getEstimatedByteSize((byte) 98);
          this.toolkit.bindTexture(69, this);
          jaggl.OpenGL.glGenerateMipmapEXT(this.target);
          this.mipmapped = true;
          this.applyFiltering(-22416);
          this.updateMemoryAccounting(param0 ^ 9729, var2);
          return true;
        }
        if (param0 == 9729) {
          return false;
        }
        return true;
    }

    final int getTextureId(int param0) {
        if (param0 != 23307) {
          this.pixelCount = -41;
          return this.textureId;
        }
        return this.textureId;
    }

    private final int getEstimatedByteSize(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 >= 93) {
          var2 = this.toolkit.getTextureFormatByteSize(this.internalFormat, 2) * this.pixelCount;
          return !this.mipmapped ? var2 : var2 * 4 / 3;
        }
        this.toolkit = (OpenGlToolkit) null;
        var2Lifetime1 = this.toolkit.getTextureFormatByteSize(this.internalFormat, 2) * this.pixelCount;
        return !this.mipmapped ? var2Lifetime1 : var2Lifetime1 * 4 / 3;
    }

    final void setLinearFiltering(int param0, boolean param1) {
        int var3 = 31 / ((param0 + 20) / 52);
        if (this.linearFiltering != param1) {
          this.linearFiltering = param1 ? true : false;
          this.applyFiltering(-22416);
        }
    }

    final void markMipmapsPresent(byte param0, boolean param1) {
        int var3 = 0;
        if (param1 != this.mipmapped) {
          var3 = this.getEstimatedByteSize((byte) 99);
          this.mipmapped = true;
          this.applyFiltering(-22416);
          this.updateMemoryAccounting(0, var3);
        }
        if (param0 == 62) {
          return;
        }
        this.target = -88;
    }

    OpenGlTexture(OpenGlToolkit param0, int param1, int param2, int param3, boolean param4) {
        this.linearFiltering = false;
        try {
          this.toolkit = param0;
          this.internalFormat = param2;
          this.target = param1;
          this.pixelCount = param3;
          this.mipmapped = param4 ? true : false;
          jaggl.OpenGL.glGenTextures(1, AwardVictoryToTeamAction.field_a, 0);
          this.textureId = AwardVictoryToTeamAction.field_a[0];
          this.updateMemoryAccounting(0, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
