/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyOpenGlTexture implements FramebufferAttachment {
    int internalFormat;
    private boolean linearFiltering;
    static String field_j;
    static int field_k;
    int target;
    private boolean mipmapped;
    int textureId;
    static BitmapFont field_b;
    private int texelCount;
    OpenGlToolkit toolkit;
    static fpa field_a;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 1956) {
          field_j = (String) null;
          field_b = null;
          field_j = null;
          return;
        }
        field_b = null;
        field_j = null;
    }

    final boolean generateMipmaps(int param0) {
        int var2 = 0;
        if (this.toolkit.field_id) {
          var2 = this.estimatedBytes(9729);
          this.toolkit.a(true, this);
          jaggl.OpenGL.glGenerateMipmapEXT(this.target);
          this.mipmapped = true;
          this.applyFilter(true);
          this.updateMemoryAccounting((byte) 111, var2);
          return true;
        }
        if (param0 == 9729) {
          return false;
        }
        this.toolkit = (OpenGlToolkit) null;
        return false;
    }

    private final void applyFilter(boolean param0) {
        this.toolkit.a(param0, this);
        if (!this.linearFiltering) {
          jaggl.OpenGL.glTexParameteri(this.target, 10241, this.mipmapped ? 9984 : 9728);
          jaggl.OpenGL.glTexParameteri(this.target, 10240, 9728);
        } else {
          jaggl.OpenGL.glTexParameteri(this.target, 10241, this.mipmapped ? 9987 : 9729);
          jaggl.OpenGL.glTexParameteri(this.target, 10240, 9729);
        }
    }

    final void noteMipmaps(boolean param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        int var3;
        if (param1 == 4) {
          stackIn_4_0 = (this.mipmapped) ? 0 : 1;
          stackIn_7_1 = (param0) ? 0 : 1;
          if (stackIn_4_0 != stackIn_7_1) {
            var3 = this.estimatedBytes(9729);
            this.mipmapped = true;
            this.applyFilter(true);
            this.updateMemoryAccounting((byte) 127, var3);
          }
        } else {
          this.toolkit = (OpenGlToolkit) null;
          stackIn_13_0 = (this.mipmapped) ? 0 : 1;
          stackIn_16_1 = (param0) ? 0 : 1;
          if (stackIn_13_0 != stackIn_16_1) {
            var3 = this.estimatedBytes(9729);
            this.mipmapped = true;
            this.applyFilter(true);
            this.updateMemoryAccounting((byte) 127, var3);
          }
        }
    }

    private final int estimatedBytes(int param0) {
        int var2 = this.toolkit.a(this.internalFormat, (byte) -65) * this.texelCount;
        if (param0 == 9729) {
          return this.mipmapped ? var2 * 4 / 3 : var2;
        }
        LegacyOpenGlTexture.releaseStatics(61);
        return this.mipmapped ? var2 * 4 / 3 : var2;
    }

    final void setLinearFiltering(boolean param0, int param1) {
        if (param0 != this.linearFiltering) {
          this.linearFiltering = param0 ? true : false;
          this.applyFilter(true);
        }
        if (param1 == 3) {
          return;
        }
        this.textureId = 93;
    }

    final int getTextureId(int param0) {
        if (param0 != 0) {
          this.updateMemoryAccounting((byte) -36, 103);
          return this.textureId;
        }
        return this.textureId;
    }

    private final void updateMemoryAccounting(byte param0, int param1) {
        this.toolkit.field_jb = this.toolkit.field_jb - param1;
        this.toolkit.field_jb = this.toolkit.field_jb + this.estimatedBytes(9729);
        if (param0 < 104) {
          this.internalFormat = 73;
        }
    }

    protected final void finalize() throws Throwable {
        this.close(0);
        super.finalize();
    }

    LegacyOpenGlTexture(OpenGlToolkit param0, int param1, int param2, int param3, boolean param4) {
        this.linearFiltering = false;
        try {
          this.toolkit = param0;
          this.mipmapped = param4 ? true : false;
          this.internalFormat = param2;
          this.target = param1;
          this.texelCount = param3;
          jaggl.OpenGL.glGenTextures(1, pu.field_a, 0);
          this.textureId = pu.field_a[0];
          this.updateMemoryAccounting((byte) 109, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void close(int param0) {
        if (param0 < this.textureId) {
          this.toolkit.a((byte) -16, this.textureId, this.estimatedBytes(9729));
          this.textureId = 0;
        }
    }

    static {
        field_j = "This password contains your Player Name, and would be easy to guess";
    }
}
